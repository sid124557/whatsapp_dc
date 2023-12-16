package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2W7  reason: invalid class name */
public class AnonymousClass2W7 {
    public final C72303dV A00;

    public List A00(long j) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r3.A0E("SELECT _id, message_poll_option_id FROM message_add_on_poll_vote_selected_option WHERE message_add_on_row_id = ?", "GET_MESSAGE_ADD_ON_POLL_VOTE_SELECTED_OPTION_SQL", A1Y);
            ArrayList A0s = AnonymousClass001.A0s();
            if (A0E.moveToFirst()) {
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("message_poll_option_id");
                do {
                    C18260x0.A0H(A0E, A0s, columnIndexOrThrow);
                } while (A0E.moveToNext());
            }
            A0E.close();
            A03.close();
            return A0s;
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

    public AnonymousClass2W7(C72303dV r1) {
        this.A00 = r1;
    }
}
