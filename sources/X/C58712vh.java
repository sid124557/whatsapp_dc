package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2vh  reason: invalid class name and case insensitive filesystem */
public final class C58712vh {
    public final long A00;
    public final C95814uZ A01;
    public final UserJid A02;
    public final AnonymousClass2z0 A03;

    public C58712vh(Cursor cursor, C95814uZ r4, UserJid userJid) {
        this.A01 = r4;
        this.A02 = userJid;
        this.A00 = cursor.getLong(3);
        this.A03 = AnonymousClass2z0.A05(r4, cursor.getString(4), cursor.getInt(1) != 1 ? false : true);
    }

    public C58712vh(C95814uZ r1, UserJid userJid, AnonymousClass2z0 r3, long j) {
        this.A01 = r1;
        this.A02 = userJid;
        this.A00 = j;
        this.A03 = r3;
    }
}
