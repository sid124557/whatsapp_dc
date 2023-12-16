package X;

import android.database.Cursor;

/* renamed from: X.2Y1  reason: invalid class name */
public class AnonymousClass2Y1 {
    public final C56922sm A00;
    public final C72303dV A01;

    public int A00(AnonymousClass0QU r7, C95814uZ r8) {
        Cursor A0D;
        AnonymousClass4GK A03 = this.A01.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            boolean A032 = C56922sm.A03(this.A00, r8, A1Y);
            A0D = r4.A0D(r7, "SELECT COUNT(*) as count FROM available_message_view WHERE message_type IN ('9', '26' ) AND origin != 7 AND chat_row_id = ?", "GET_DOCUMENT_MESSAGES_COUNT", A1Y);
            if (A0D.moveToFirst()) {
                int A033 = AnonymousClass0x2.A03(A0D);
                A0D.close();
                A03.close();
                return A033;
            }
            A0D.close();
            A03.close();
            return A032 ? 1 : 0;
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

    public AnonymousClass2Y1(C56922sm r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
