package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.1md  reason: invalid class name and case insensitive filesystem */
public class C30551md extends C30331mH {
    public int A00;
    public int A01;
    public long A02;

    public C30551md(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 68, j);
    }

    public void A1y(Cursor cursor, C623334p r6, HashMap hashMap) {
        super.A1y(cursor, r6, hashMap);
        int A0K = AnonymousClass001.A0K(C18290x4.A0i("sender_timestamp", hashMap));
        int A0K2 = AnonymousClass001.A0K(C18290x4.A0i("keep_in_chat_state", hashMap));
        int A0K3 = AnonymousClass001.A0K(C18290x4.A0i("keep_count", hashMap));
        long j = cursor.getLong(A0K);
        int i = cursor.getInt(A0K2);
        int i2 = cursor.getInt(A0K3);
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    public C30551md(AnonymousClass2z0 r3, C52042kn r4, int i, long j, long j2, long j3) {
        super(r3, (byte) 68, j);
        this.A05 = r4;
        this.A04 = null;
        this.A02 = j2;
        this.A01 = i;
        this.A02 = j3;
    }
}
