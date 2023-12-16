package X;

import android.content.Context;
import android.database.ContentObserver;

/* renamed from: X.8A4  reason: invalid class name */
public final class AnonymousClass8A4 implements C178478hb {
    public static AnonymousClass8A4 A02;
    public final Context A00;
    public final ContentObserver A01;

    public AnonymousClass8A4(Context context) {
        this.A00 = context;
        C124456Ci r3 = new C124456Ci();
        this.A01 = r3;
        context.getContentResolver().registerContentObserver(C155687fJ.A02, true, r3);
    }

    public AnonymousClass8A4() {
        this.A00 = null;
        this.A01 = null;
    }
}
