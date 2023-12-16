package X;

import android.database.Cursor;

/* renamed from: X.2W0  reason: invalid class name */
public class AnonymousClass2W0 {
    public final C72303dV A00;

    public AnonymousClass2W0(C72303dV r1) {
        this.A00 = r1;
    }

    public Integer A00(long j) {
        Cursor A0E;
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18280x3.A1R(A1Y, 0, j);
        AnonymousClass4GK A03 = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT rating FROM message_rating WHERE message_row_id = ?", "GET_MESSAGE_RATING_BY_ROW_ID_SQL", A1Y);
            if (A0E.moveToFirst()) {
                Integer valueOf = Integer.valueOf(AnonymousClass0x2.A04(A0E, "rating"));
                A0E.close();
                A03.close();
                return valueOf;
            }
            A0E.close();
            A03.close();
            return null;
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
}
