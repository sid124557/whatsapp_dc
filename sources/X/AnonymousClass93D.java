package X;

import com.whatsapp.businessdirectory.util.FacebookMapPreview;

/* renamed from: X.93D  reason: invalid class name */
public class AnonymousClass93D implements C180298ko {
    public Object A00;
    public final int A01;

    public AnonymousClass93D(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(C110885hC r2, AnonymousClass93D r3) {
        C95874ug r1 = (C95874ug) r3.A00;
        if (r1.A06 == null) {
            r1.A06 = r2;
            r1.setLocationMode(r1.A02);
        }
    }

    public final void BW1(C110885hC r4) {
        if (this.A01 != 0) {
            A00(r4, this);
            return;
        }
        FacebookMapPreview facebookMapPreview = (FacebookMapPreview) this.A00;
        if (r4 != null) {
            AnonymousClass7TJ r1 = r4.A0T;
            if (r1 != null) {
                r1.A01 = false;
                r1.A00();
            }
            r4.A0B = facebookMapPreview.A01;
        }
    }
}
