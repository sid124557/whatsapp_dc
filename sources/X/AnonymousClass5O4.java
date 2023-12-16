package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5O4  reason: invalid class name */
public final class AnonymousClass5O4 {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public final List A04;

    public final void A00() {
        int i;
        int i2;
        if (this.A03) {
            int i3 = this.A02;
            if (i3 == 1 || i3 == 3) {
                i = this.A00;
                i2 = this.A01;
            } else {
                i2 = -1;
                i = -1;
            }
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                View A0H = C86654Ky.A0H(it);
                ViewGroup.LayoutParams layoutParams = A0H.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.width = i;
                    layoutParams2.height = i2;
                    layoutParams2.gravity = 17;
                    A0H.setLayoutParams(layoutParams2);
                    A0H.setRotation(((float) this.A02) * -90.0f);
                } else {
                    throw AnonymousClass001.A0g("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5O4(android.view.ViewGroup r5, java.util.List r6) {
        /*
            r4 = this;
            X.C18260x0.A0Q(r5, r6)
            r4.<init>()
            r4.A04 = r6
            boolean r0 = r5 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x003d
            java.util.Iterator r3 = r6.iterator()
        L_0x0010:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0033
            android.view.View r2 = X.C86654Ky.A0H(r3)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r0 = r0.width
            r1 = -1
            if (r0 != r1) goto L_0x002c
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r0 = r0.height
            if (r0 != r1) goto L_0x002c
            goto L_0x0010
        L_0x002c:
            java.lang.String r0 = "Children must have MATCH_PARENT for both width and height"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0033:
            r1 = 3
            X.90g r0 = new X.90g
            r0.<init>((java.lang.Object) r4, (int) r1)
            r5.addOnLayoutChangeListener(r0)
            return
        L_0x003d:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O4.<init>(android.view.ViewGroup, java.util.List):void");
    }
}
