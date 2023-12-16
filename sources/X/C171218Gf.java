package X;

import android.graphics.Bitmap;

/* renamed from: X.8Gf  reason: invalid class name and case insensitive filesystem */
public class C171218Gf implements C84584Cx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C186058ug A01;
    public final /* synthetic */ C137716p9 A02;

    public C171218Gf(C186058ug r1, C137716p9 r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public String BDW() {
        return "MY_PHOTOS_VIEW_HOLDER_TAG";
    }

    public Bitmap BJk() {
        if (this.A02.A05.getTag() != this) {
            return null;
        }
        Bitmap Bqg = this.A01.Bqg(this.A00);
        if (Bqg == null) {
            return C1457877h.A00;
        }
        return Bqg;
    }
}
