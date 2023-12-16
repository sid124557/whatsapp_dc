package X;

import android.app.Activity;

/* renamed from: X.68d  reason: invalid class name and case insensitive filesystem */
public class C1233668d implements AnonymousClass4AU {
    public Object A00;
    public final int A01;

    public C1233668d(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BLx(boolean z) {
        if (this.A01 != 0) {
            Activity activity = (Activity) this.A00;
            if (!activity.isFinishing()) {
                int i = 1;
                if (z) {
                    i = 8;
                }
                C621433s.A01(activity, i);
                return;
            }
            return;
        }
        C113245l7 r2 = (C113245l7) this.A00;
        if (!r2.A2z.isFinishing() && r2.A3n.A0U()) {
            int i2 = 28;
            if (z) {
                i2 = 29;
            }
            C621433s.A01(C113245l7.A09(r2), i2);
        }
    }
}
