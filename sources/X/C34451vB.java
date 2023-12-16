package X;

import android.database.Cursor;

/* renamed from: X.1vB  reason: invalid class name and case insensitive filesystem */
public class C34451vB extends AnonymousClass361 {
    public static final AnonymousClass2K9 A00(Cursor cursor) {
        Long valueOf;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("real_issue_timestamp");
        long A0C = AnonymousClass0x2.A0C(cursor, "sent_tc_token_timestamp");
        if (cursor.isNull(columnIndexOrThrow)) {
            valueOf = Long.valueOf(A0C);
        } else {
            long j = cursor.getLong(columnIndexOrThrow);
            if (j == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(j);
            }
        }
        return new AnonymousClass2K9(valueOf, A0C);
    }

    public C34451vB(AnonymousClass1RI r1) {
        super(r1);
    }
}
