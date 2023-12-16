package X;

import android.view.ViewTreeObserver;

/* renamed from: X.698  reason: invalid class name */
public class AnonymousClass698 implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public final int A01;

    public AnonymousClass698(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1.setElevation(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollChanged() {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0090;
                case 2: goto L_0x007c;
                case 3: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A00
            X.5Q6 r2 = (X.AnonymousClass5Q6) r2
            android.view.View r1 = r2.A02
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A01
            if (r0 == 0) goto L_0x008e
            int r0 = r2.A00
        L_0x0016:
            float r0 = (float) r0
        L_0x0017:
            r1.setElevation(r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r5 = r6.A00
            com.whatsapp.registration.RegistrationScrollView r5 = (com.whatsapp.registration.RegistrationScrollView) r5
            r2 = 1
            boolean r1 = r5.canScrollVertically(r2)
            r0 = -1
            boolean r0 = r5.canScrollVertically(r0)
            if (r0 != 0) goto L_0x002d
            if (r1 == 0) goto L_0x001a
        L_0x002d:
            int r0 = r5.getChildCount()
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            int r3 = r0.getBottom()
            int r2 = r5.getHeight()
            int r1 = r5.getScrollY()
            int r0 = r2 + r1
            int r3 = r3 - r0
            android.view.View r0 = X.C86644Kx.A0G(r5)
            int r0 = r0.getHeight()
            int r0 = r0 - r2
            float r4 = (float) r1
            float r0 = (float) r0
            float r4 = r4 / r0
            float r3 = (float) r3
            float r3 = r3 / r0
            com.whatsapp.WaTextView r1 = r5.A04
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0078
            r0 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 * r0
            float r2 = r5.A08
            float r4 = r4 * r2
        L_0x0062:
            X.AnonymousClass0YZ.A0B(r1, r4)
            android.widget.LinearLayout r1 = r5.A03
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r0 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r0
            float r3 = r3 * r2
        L_0x0072:
            X.AnonymousClass0YZ.A0B(r1, r3)
            return
        L_0x0076:
            r3 = r2
            goto L_0x0072
        L_0x0078:
            float r4 = r5.A08
            r2 = r4
            goto L_0x0062
        L_0x007c:
            java.lang.Object r2 = r6.A00
            com.whatsapp.registration.ChangeNumber r2 = (com.whatsapp.registration.ChangeNumber) r2
            android.widget.ScrollView r1 = r2.A07
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A06
            if (r0 == 0) goto L_0x008e
            int r0 = r2.A00
            goto L_0x0016
        L_0x008e:
            r0 = 0
            goto L_0x0017
        L_0x0090:
            java.lang.Object r0 = r6.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            r0.A1W()
            return
        L_0x0098:
            java.lang.Object r2 = r6.A00
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r2 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r2
            android.widget.ScrollView r1 = r2.A02
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            android.view.View r1 = r2.A01
            int r0 = X.C86634Kw.A01(r0)
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass698.onScrollChanged():void");
    }
}
