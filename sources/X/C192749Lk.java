package X;

import android.app.Activity;

/* renamed from: X.9Lk  reason: invalid class name and case insensitive filesystem */
public class C192749Lk implements C202849mg {
    public Object A00;
    public final int A01;

    public C192749Lk(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTW() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((Activity) obj).finish();
        } else {
            ((C202949ms) obj).Bal();
        }
    }
}
