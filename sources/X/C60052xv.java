package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2xv  reason: invalid class name and case insensitive filesystem */
public class C60052xv {
    public final C55262q4 A00;
    public final AnonymousClass1RE A01;
    public final C49032fs A02;

    public C60052xv(C55262q4 r3, AnonymousClass1RE r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = new C49032fs(r4, 1);
    }

    public static final void A00(C56702sQ r3, C58922w2 r4) {
        r3.A02();
        r3.A07(1, r4.A08);
        r3.A06(2, (long) r4.A01);
        r3.A06(3, (long) r4.A00);
        byte[] bArr = r4.A0A;
        if (bArr == null) {
            bArr = new byte[0];
        }
        r3.A08(4, bArr);
        String str = r4.A07;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        r3.A07(5, str);
        String str3 = r4.A06;
        if (str3 == null) {
            str3 = str2;
        }
        r3.A07(6, str3);
        String str4 = r4.A04;
        if (str4 != null) {
            str2 = str4;
        }
        r3.A07(8, str2);
        r3.A06(7, r4.A02);
        r3.A05(9);
        r3.A06(10, r4.A03);
        byte[] bArr2 = r4.A09;
        if (bArr2 == null) {
            r3.A05(11);
        } else {
            r3.A08(11, bArr2);
        }
    }

    public C58922w2 A01() {
        Cursor A0E;
        Cursor A0E2;
        C626936e.A00();
        C626936e.A00();
        AnonymousClass1RE r5 = this.A01;
        AnonymousClass4GK A0B = r5.get();
        try {
            C56862sg r7 = ((AnonymousClass3H0) A0B).A03;
            String[] strArr = new String[5];
            String valueOf = String.valueOf(0);
            strArr[0] = valueOf;
            strArr[1] = String.valueOf(1);
            C18280x3.A1O(strArr, 4);
            C18280x3.A1A(String.valueOf(5), valueOf, strArr);
            A0E = r7.A0E("SELECT message_id, sync_type, chunk_order, media_key, media_hash, media_enc_hash, file_size, direct_path, local_path, start_time, inline_payload FROM history_sync_companion WHERE sync_type IN (?, ?, ?, ?) AND chunk_order = ? ORDER BY sync_type ASC", "HistorySyncCompanionStore.SELECT_CHUNKS_BY_SYNC_TYPE_AND_CHUNK_ORDER", strArr);
            if (A0E != null) {
                if (!A0E.moveToNext()) {
                    A0E.close();
                } else {
                    C58922w2 A002 = C58922w2.A00(A0E);
                    A0E.close();
                    A0B.close();
                    return A002;
                }
            }
            A0B.close();
            JSONObject A022 = this.A00.A02();
            if (A022 == null) {
                return null;
            }
            AnonymousClass4GK A0B2 = r5.get();
            try {
                C56862sg r4 = ((AnonymousClass3H0) A0B2).A03;
                String[] A1Z = AnonymousClass0x9.A1Z();
                A1Z[0] = A022.getString("sync_type");
                A1Z[1] = A022.getString("chunk_order");
                A0E2 = r4.A0E("SELECT message_id, sync_type, chunk_order, media_key, media_hash, media_enc_hash, file_size, direct_path, local_path, start_time, inline_payload FROM history_sync_companion WHERE sync_type=? AND chunk_order=?", "HistorySyncCompanionStore.SELECT_CHUNK_BY_SYNC_TYPE_AND_CHUNK_ORDER", A1Z);
                if (A0E2 != null) {
                    if (!A0E2.moveToNext()) {
                        A0E2.close();
                    } else {
                        C58922w2 A003 = C58922w2.A00(A0E2);
                        A0E2.close();
                        A0B2.close();
                        return A003;
                    }
                }
            } catch (JSONException unused) {
                try {
                    Log.e("HistorySyncCompanionStore/ Could not read history sync state");
                } finally {
                    th = th;
                    try {
                        A0B2.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            return null;
            throw th;
            throw th;
        } catch (Throwable th3) {
            th = th3;
            A0B.close();
            throw th;
        }
    }

    public void A02(String str) {
        C626936e.A00();
        C85284Fq A0C = this.A01.A0C();
        try {
            ((AnonymousClass3H0) A0C).A03.A0I("DELETE FROM history_sync_companion WHERE message_id=?", "HistorySyncCompanionStore.DELETE_CHUNK_BY_ID", C18270x1.A1b(str));
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
