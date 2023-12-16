package X;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.1mf  reason: invalid class name and case insensitive filesystem */
public class C30571mf extends C30331mH implements AnonymousClass4B5 {
    public long A00;
    public String A01;
    public transient byte[] A02;

    public C30571mf(AnonymousClass2z0 r2, byte[] bArr, long j) {
        super(r2, (byte) 56, j);
        this.A02 = bArr;
    }

    public void A1y(Cursor cursor, C623334p r6, HashMap hashMap) {
        super.A1y(cursor, r6, hashMap);
        int A0K = AnonymousClass001.A0K(C18290x4.A0i("reaction", hashMap));
        int A0K2 = AnonymousClass001.A0K(C18290x4.A0i("sender_timestamp", hashMap));
        String string = cursor.getString(A0K);
        long j = cursor.getLong(A0K2);
        this.A01 = string;
        boolean isEmpty = TextUtils.isEmpty(string);
        int i = 0;
        if (isEmpty) {
            i = 7;
        }
        this.A01 = i;
        this.A00 = j;
    }

    public String B9c() {
        return "inactive";
    }

    public C30571mf(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 56, j);
    }

    public C30571mf(AnonymousClass2z0 r3, C52042kn r4, C52042kn r5, String str, long j, long j2, long j3) {
        super(r3, (byte) 56, j);
        this.A05 = r4;
        this.A04 = r5;
        this.A02 = j2;
        this.A01 = str;
        this.A01 = TextUtils.isEmpty(str) ? 7 : 0;
        this.A00 = j3;
    }
}
