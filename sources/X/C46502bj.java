package X;

import android.widget.ImageView;
import java.util.Map;

/* renamed from: X.2bj  reason: invalid class name and case insensitive filesystem */
public final class C46502bj {
    public final C69263Wi A00;
    public final C102045Hg A01;
    public final C102675Jv A02;
    public final AnonymousClass4FS A03;
    public final Map A04 = C18320x8.A0r();

    public final void A00(ImageView imageView, String str) {
        C162457s7.A0J(imageView, 1);
        String A042 = C627236i.A04(str);
        if (A042 != null) {
            Map map = this.A04;
            synchronized (map) {
                imageView.setTag(-1641051461, A042);
                map.put(A042, AnonymousClass0x9.A14(imageView));
            }
            this.A03.BkM(new C70313aI(this, A042, str, 10));
            return;
        }
        throw C18300x5.A0X();
    }

    public C46502bj(C69263Wi r2, C102045Hg r3, C102675Jv r4, AnonymousClass4FS r5) {
        C18260x0.A0c(r4, r5, r3, r2);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = r2;
    }
}
