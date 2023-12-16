package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2H1  reason: invalid class name */
public final class AnonymousClass2H1 {
    public final C54942pX A00;

    public AnonymousClass2H1(Cursor cursor, UserJid userJid) {
        C626936e.A06(userJid);
        C54942pX r2 = new C54942pX(userJid);
        this.A00 = r2;
        r2.A00 = cursor.getDouble(1);
        r2.A01 = cursor.getDouble(2);
        r2.A03 = cursor.getInt(3);
        r2.A02 = cursor.getFloat(4);
        r2.A04 = cursor.getInt(5);
        r2.A05 = cursor.getLong(6);
    }
}
