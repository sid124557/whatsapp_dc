package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.2jN  reason: invalid class name and case insensitive filesystem */
public class C51162jN {
    public final C56612sH A00;
    public final AnonymousClass1RJ A01;

    public void A00(int i, byte[] bArr) {
        C85284Fq A0C = this.A01.A0C();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0b(A06, "prekey_id", i);
            C18270x1.A0c(A06, "timestamp", C56612sH.A00(this.A00));
            A06.put("record", bArr);
            ((AnonymousClass3H0) A0C).A03.A0B("signed_prekeys", "SignalSignedPreKeyStore/saveSignedPreKey", A06);
            C18260x0.A0y("axolotl stored signed pre key with id ", AnonymousClass001.A0o(), i);
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C51162jN(C56612sH r1, AnonymousClass1RJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public byte[] A01() {
        Cursor A0E;
        AnonymousClass4GK A0B = this.A01.get();
        try {
            C56862sg r7 = ((AnonymousClass3H0) A0B).A03;
            A0E = r7.A0E("SELECT prekey_id, record FROM signed_prekeys ORDER BY prekey_id DESC LIMIT 1", "SignalSignedPreKeyStore/getActiveSignedPreKey", (String[]) null);
            if (!A0E.moveToNext()) {
                Log.e("no signed prekey record found");
                A0E.close();
                A0B.close();
                return null;
            }
            int A04 = AnonymousClass0x2.A04(A0E, "prekey_id");
            byte[] A1Z = C18280x3.A1Z(A0E, "record");
            A0E.close();
            if (A04 == 16777215) {
                String[] A1Y = AnonymousClass0x9.A1Y();
                C18270x1.A1O(A1Y, 8388607);
                A0E = r7.A0E("SELECT prekey_id, record FROM signed_prekeys WHERE prekey_id < ? ORDER BY prekey_id DESC LIMIT 1", "SignalSignedPreKeyStore/getActiveSignedPreKeyMax", A1Y);
                if (A0E.moveToNext()) {
                    A04 = AnonymousClass0x2.A04(A0E, "prekey_id");
                    A1Z = C18280x3.A1Z(A0E, "record");
                }
                A0E.close();
            }
            C18260x0.A0y("axolotl retrieved latest signed prekey record successfully; id=", C18280x3.A0f(A0B), A04);
            return A1Z;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public byte[] A02(int i) {
        Cursor A0F;
        AnonymousClass4GK A0B = this.A01.get();
        try {
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18270x1.A1O(A1Y, i);
            A0F = ((AnonymousClass3H0) A0B).A03.A0F("signed_prekeys", new String[]{"record"}, "prekey_id = ?", A1Y, (String) null, (String) null, (String) null, "SignalSignedPreKeyStore/getSignedPreKey");
            if (!A0F.moveToNext()) {
                C18260x0.A0x("no signed prekey available with id ", AnonymousClass001.A0o(), i);
                A0F.close();
                A0B.close();
                return null;
            }
            byte[] A1Z = C18280x3.A1Z(A0F, "record");
            A0F.close();
            A0B.close();
            return A1Z;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
