package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2q3  reason: invalid class name and case insensitive filesystem */
public class C55252q3 {
    public final C66663Mh A00;
    public final C56612sH A01;
    public final AnonymousClass1RJ A02;

    public int A00() {
        Cursor A012;
        AnonymousClass4GK A0B = this.A02.get();
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A0B).A03, "SELECT COUNT(*) as count FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0", "SignalPreKeyStore/getUnsentPreKeysCount");
            if (A012.moveToNext()) {
                int A03 = AnonymousClass0x2.A03(A012);
                A012.close();
                A0B.close();
                return A03;
            }
            throw new SQLiteException("unable to fetch count from table");
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

    public void A02(int i) {
        C85284Fq A0C = this.A02.A0C();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A0C).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18270x1.A1O(A1Y, i);
            C18260x0.A0y(" pre keys with id ", C18300x5.A0o((long) r4.A07("prekeys", "prekey_id = ?", "SignalPreKeyStore/removePreKey", A1Y)), i);
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A03(int[] iArr) {
        C85284Fq A0C;
        AnonymousClass1RJ r7 = this.A02;
        C85284Fq A0C2 = r7.A0C();
        try {
            C69833Yo Axl = A0C2.Axl();
            try {
                long A002 = C56612sH.A00(this.A01);
                int i = 0;
                while (true) {
                    int length = iArr.length;
                    if (i < length) {
                        int min = Math.min(i + 200, length);
                        ContentValues A06 = AnonymousClass0x9.A06();
                        A06.put("sent_to_server", Boolean.TRUE);
                        C18270x1.A0c(A06, "upload_timestamp", A002);
                        StringBuilder A0A = C18330xA.A0A("?");
                        String[] strArr = new String[(min - i)];
                        for (int i2 = i; i2 < min; i2++) {
                            C18280x3.A1Q(strArr, iArr[i2], i2 - i);
                            if (i2 != i) {
                                A0A.append(",?");
                            }
                        }
                        A0C = r7.A0C();
                        C56862sg r13 = ((AnonymousClass3H0) A0C).A03;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("prekey_id IN (");
                        A0o.append(A0A);
                        int A05 = r13.A05(A06, "prekeys", AnonymousClass000.A0e(A0o), "SignalPreKeyStore/setPreKeysAsSentToServer", strArr);
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("updated ");
                        A0o2.append(A05);
                        C18260x0.A1R(A0o2, " prekeys; values=", A06);
                        A0C.close();
                        i = min;
                    } else {
                        A0C = r7.A0C();
                        ContentValues A062 = AnonymousClass0x9.A06();
                        AnonymousClass3H0.A02(A062, A0C, "upload_timestamp", A002).A08("prekey_uploads", "SignalPreKeyStore/savePreKeyUpload", A062);
                        C18260x0.A12("axolotl addPreKeyUpload ts:", AnonymousClass001.A0o(), A002);
                        A0C.close();
                        Axl.A00();
                        Axl.close();
                        A0C2.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A0C2.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public byte[] A04(int i) {
        Cursor A0E;
        AnonymousClass4GK A0B = this.A02.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A0B).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18270x1.A1O(A1Y, i);
            A0E = r3.A0E("SELECT record FROM prekeys WHERE prekey_id = ?", "SignalPreKeyStore/getPreKey", A1Y);
            if (!A0E.moveToNext()) {
                A0E.close();
                A0B.close();
                return null;
            }
            byte[] A1Z = C18280x3.A1Z(A0E, "record");
            A0E.close();
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

    public C55252q3(C66663Mh r1, C56612sH r2, AnonymousClass1RJ r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public List A01() {
        Cursor A0E;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A0B = this.A02.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A0B).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18270x1.A1O(A1Y, this.A00.A03(C66663Mh.A17));
            A0E = r4.A0E("SELECT prekey_id, record FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0 LIMIT ?", "SignalPreKeyStore/getUnsentPreKeys", A1Y);
            while (A0E.moveToNext()) {
                A0s.add(new AnonymousClass2JO(AnonymousClass0x2.A04(A0E, "prekey_id"), C18280x3.A1Z(A0E, "record")));
            }
            A0E.close();
            A0B.close();
            return A0s;
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
