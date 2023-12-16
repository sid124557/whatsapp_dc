package X;

import android.database.Cursor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2oW  reason: invalid class name and case insensitive filesystem */
public class C54312oW {
    public final AnonymousClass1RE A00;

    public int A00() {
        Cursor A01;
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A01 = C56862sg.A01(((AnonymousClass3H0) A0B).A03, "SELECT MAX ( epoch ) as max_epoch FROM crypto_info", "SyncdCryptoInfoTable.SELECT_MAX_EPOCH");
            if (A01.moveToFirst()) {
                int A0C = (int) AnonymousClass0x2.A0C(A01, "max_epoch");
                A01.close();
                A0B.close();
                return A0C;
            }
            A01.close();
            A0B.close();
            return 0;
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

    public C60542yj A01() {
        Cursor A0E;
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info ORDER BY epoch DESC, device_id ASC LIMIT 1", "SyncdCryptoInfoTable.SELECT_LATEST_KEY", (String[]) null);
            if (A0E.moveToFirst()) {
                C60542yj A02 = A02(A0E);
                A0E.close();
                A0B.close();
                return A02;
            }
            A0E.close();
            A0B.close();
            return null;
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

    public final C60542yj A02(Cursor cursor) {
        try {
            C61162zo A002 = C61162zo.A00((C21511Cc) C130786cX.A05(C21511Cc.DEFAULT_INSTANCE, C18280x3.A1Z(cursor, "fingerprint")));
            C626936e.A06(A002);
            return new C60542yj(new C52402lQ(A002, C18280x3.A1Z(cursor, "key_data"), AnonymousClass0x2.A0C(cursor, "timestamp")), new AnonymousClass33J((int) AnonymousClass0x2.A0C(cursor, "device_id"), (int) AnonymousClass0x2.A0C(cursor, "epoch")));
        } catch (AnonymousClass6u5 e) {
            throw new IllegalStateException("SyncdCryptoStore/createSyncdKey", e);
        }
    }

    public C54312oW(AnonymousClass1RE r1) {
        this.A00 = r1;
    }

    public void A03(Collection collection, long j) {
        HashSet A15 = AnonymousClass0x9.A15(collection);
        A15.remove((Object) null);
        if (!A15.isEmpty()) {
            C85284Fq A0C = this.A00.A0C();
            try {
                Iterator it = A15.iterator();
                while (it.hasNext()) {
                    AnonymousClass33J r1 = (AnonymousClass33J) it.next();
                    C56862sg r5 = ((AnonymousClass3H0) A0C).A03;
                    String[] A1a = AnonymousClass0x9.A1a();
                    C18260x0.A1X(A1a, j);
                    C18270x1.A1P(A1a, r1.A00());
                    byte[] bArr = r1.A00;
                    C18280x3.A1Q(A1a, C18290x4.A07(bArr, bArr[2], 2), 2);
                    r5.A0I("UPDATE crypto_info SET stale_timestamp = ?  WHERE device_id = ?  AND epoch = ? ", "SyncdCryptoInfoTable.UPDATE_STALE_TIMESTAMP_BY_KEY_ID", A1a);
                }
                A0C.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }
}
