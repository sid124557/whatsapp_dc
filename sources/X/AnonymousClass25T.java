package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.25T  reason: invalid class name */
public class AnonymousClass25T {
    public static C55502qS A00(Cursor cursor) {
        UserJid A00 = AnonymousClass32Y.A00(cursor, 1);
        if (A00 == null) {
            return null;
        }
        boolean A002 = C155477ey.A00(A00);
        long j = cursor.getLong(2);
        return new C55502qS(A00, new AnonymousClass3ZC(C57462tg.A01(cursor.getString(12)), cursor.getLong(14), C57462tg.A00(cursor.getString(13))), cursor.getString(3), cursor.getString(5), C18300x5.A02(cursor.getInt(9)), cursor.getInt(11), j, A002);
    }
}
