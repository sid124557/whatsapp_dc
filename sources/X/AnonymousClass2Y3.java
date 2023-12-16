package X;

import android.database.Cursor;

/* renamed from: X.2Y3  reason: invalid class name */
public class AnonymousClass2Y3 {
    public final C52852m9 A00;
    public final C72303dV A01;

    public String A00(C624134x r7) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A01.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1X(A1Y, r7.A1L);
            A0E = r4.A0E("SELECT message_template_id FROM messages_hydrated_four_row_template WHERE message_row_id = ?", "GET_HFRT_BY_MESSAGE_ID", A1Y);
            String str = null;
            if (A0E != null) {
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("message_template_id");
                if (A0E.moveToLast()) {
                    str = A0E.getString(columnIndexOrThrow);
                }
            }
            if (A0E != null) {
                A0E.close();
            }
            A03.close();
            return str;
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

    public AnonymousClass2Y3(C52852m9 r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
