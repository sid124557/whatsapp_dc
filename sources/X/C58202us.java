package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2us  reason: invalid class name and case insensitive filesystem */
public final class C58202us {
    public final AnonymousClass1RI A00;

    public C58202us(AnonymousClass1RI r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public static final C54002o1 A00(Cursor cursor, UserJid userJid, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        String string;
        String string2;
        String string3;
        String string4;
        int i12 = cursor.getInt(i);
        String A0c = C18320x8.A0c(cursor, i2);
        boolean A002 = C382426h.A00(cursor, i3);
        String A0c2 = C18320x8.A0c(cursor, i4);
        String A0c3 = C18320x8.A0c(cursor, i5);
        String A0c4 = C18320x8.A0c(cursor, i6);
        int i13 = i7;
        String str = null;
        if (cursor.isNull(i13)) {
            string = null;
        } else {
            string = cursor.getString(i13);
        }
        int i14 = i8;
        if (cursor.isNull(i14)) {
            string2 = null;
        } else {
            string2 = cursor.getString(i14);
        }
        int i15 = i9;
        if (cursor.isNull(i15)) {
            string3 = null;
        } else {
            string3 = cursor.getString(i15);
        }
        int i16 = i10;
        if (cursor.isNull(i16)) {
            string4 = null;
        } else {
            string4 = cursor.getString(i16);
        }
        int i17 = i11;
        if (!cursor.isNull(i17)) {
            str = cursor.getString(i17);
        }
        return new C54002o1(userJid, A0c, A0c2, A0c3, A0c4, string2, string3, string4, C57042sy.A01(string), C57032sx.A01(str), i12, A002);
    }
}
