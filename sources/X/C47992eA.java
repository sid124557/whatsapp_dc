package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.2eA  reason: invalid class name and case insensitive filesystem */
public class C47992eA {
    public final C72303dV A00;

    public void A00(long j, byte[] bArr) {
        C85284Fq A04 = this.A00.A04();
        try {
            ContentValues A09 = C18280x3.A09();
            C18270x1.A0a(A09, j);
            A09.put("message_secret", bArr);
            ((AnonymousClass3H0) A04).A03.A0C("message_secret", "MessageSecretStore/insertMessageSecret", A09, 5);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public byte[] A01(long j) {
        Cursor A0E;
        byte[] bArr;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r3.A0E("SELECT message_secret FROM message_secret WHERE message_row_id = ?", "GET_MESSAGE_SECRET_SQL", A1Y);
            if (A0E.moveToLast()) {
                bArr = C18280x3.A1Z(A0E, "message_secret");
            } else {
                bArr = null;
            }
            A0E.close();
            A03.close();
            return bArr;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C47992eA(C72303dV r1) {
        this.A00 = r1;
    }
}
