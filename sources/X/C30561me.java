package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.1me  reason: invalid class name and case insensitive filesystem */
public final class C30561me extends C30331mH implements AnonymousClass4B5 {
    public int A00;
    public long A01;

    public void A1y(Cursor cursor, C623334p r5, HashMap hashMap) {
        C162457s7.A0J(r5, 0);
        C18260x0.A0Q(cursor, hashMap);
        super.A1y(cursor, r5, hashMap);
        int A0K = AnonymousClass001.A0K(C18290x4.A0i("sender_timestamp", hashMap));
        int A0K2 = AnonymousClass001.A0K(C18290x4.A0i("pin_in_chat_state", hashMap));
        this.A01 = cursor.getLong(A0K);
        this.A00 = cursor.getInt(A0K2);
    }

    public C30561me(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 79, j);
        this.A01 = 2;
    }

    public String B9c() {
        return "inactive";
    }
}
