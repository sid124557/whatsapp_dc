package X;

import android.graphics.Bitmap;

/* renamed from: X.93T  reason: invalid class name */
public class AnonymousClass93T implements C181778nJ {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public AnonymousClass93T(Object obj, int i, Object obj2) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BVc(Bitmap bitmap, AnonymousClass8EI r4, boolean z) {
        if (this.A02) {
            return;
        }
        if (r4.A04 == 3) {
            this.A02 = true;
            AnonymousClass8EI r1 = (AnonymousClass8EI) this.A01;
            r1.A08.BVc(bitmap, r1, z);
            return;
        }
        ((AnonymousClass8EI) this.A01).A08.BVc(bitmap, r4, z);
    }
}
