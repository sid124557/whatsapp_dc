package X;

import android.widget.ImageView;
import java.io.File;

/* renamed from: X.9TE  reason: invalid class name */
public abstract class AnonymousClass9TE {
    public C54722pB A00;
    public final C69263Wi A01;
    public final C56492s4 A02;
    public final C54292oU A03;
    public final AnonymousClass33K A04;

    public synchronized C54722pB A00() {
        C54722pB r0;
        String str;
        r0 = this.A00;
        if (r0 == null) {
            C69263Wi r3 = this.A01;
            C56492s4 r4 = this.A02;
            AnonymousClass33K r5 = this.A04;
            File cacheDir = this.A03.A00.getCacheDir();
            if (this instanceof AnonymousClass9Df) {
                str = "payment_merchant_image_cache";
            } else {
                str = "brazilpay_image_cache";
            }
            C47432dF r2 = new C47432dF(r3, r4, r5, new File(cacheDir, str), "payments-image");
            r2.A01 = 16777216;
            r2.A05 = true;
            r0 = r2.A01();
            this.A00 = r0;
        }
        return r0;
    }

    public AnonymousClass9TE(C69263Wi r1, C56492s4 r2, C54292oU r3, AnonymousClass33K r4) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
    }

    public void A01(ImageView imageView, String str) {
        A00().A03(imageView, str);
    }
}
