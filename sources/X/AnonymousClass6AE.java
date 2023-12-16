package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.6AE  reason: invalid class name */
public class AnonymousClass6AE implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6AE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnPreDrawListener(new AnonymousClass6AE(obj, i));
    }

    public static boolean A01(AnonymousClass6AE r3) {
        View view = (View) r3.A00;
        AnonymousClass0x7.A16(view, r3);
        View findViewById = view.findViewById(16908335);
        if (findViewById != null) {
            AnonymousClass0YZ.A0F(findViewById, "statusBar");
        }
        View findViewById2 = view.findViewById(16908336);
        if (findViewById2 == null) {
            return true;
        }
        AnonymousClass0YZ.A0F(findViewById2, "navigationBar");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0140, code lost:
        r3 = r4.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r0 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r1.setElevation(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0138;
                case 1: goto L_0x0115;
                case 2: goto L_0x0106;
                case 3: goto L_0x0050;
                case 4: goto L_0x00e0;
                case 5: goto L_0x0177;
                case 6: goto L_0x0037;
                case 7: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r8.A00
            X.5Q6 r2 = (X.AnonymousClass5Q6) r2
            android.view.View r1 = r2.A02
            X.AnonymousClass0x7.A16(r1, r8)
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A01
            if (r0 == 0) goto L_0x004e
            int r0 = r2.A00
        L_0x0019:
            float r0 = (float) r0
        L_0x001a:
            r1.setElevation(r0)
        L_0x001d:
            r0 = 0
            return r0
        L_0x001f:
            java.lang.Object r2 = r8.A00
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            r2.A1H()
            android.widget.ListView r0 = r2.A04
            X.AnonymousClass0x7.A16(r0, r8)
            r0 = 21
            X.67L r1 = new X.67L
            r1.<init>(r8, r0)
            r0 = 1
            r2.A1R(r1, r0)
            goto L_0x001d
        L_0x0037:
            java.lang.Object r2 = r8.A00
            com.whatsapp.registration.ChangeNumber r2 = (com.whatsapp.registration.ChangeNumber) r2
            android.widget.ScrollView r0 = r2.A07
            X.AnonymousClass0x7.A16(r0, r8)
            android.widget.ScrollView r1 = r2.A07
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A06
            if (r0 == 0) goto L_0x004e
            int r0 = r2.A00
            goto L_0x0019
        L_0x004e:
            r0 = 0
            goto L_0x001a
        L_0x0050:
            java.lang.Object r4 = r8.A00
            X.7h9 r4 = (X.C156757h9) r4
            X.4ZC r3 = r4.A04
            android.view.View r5 = r3.A05
            X.AnonymousClass0x7.A16(r5, r8)
            int r0 = r5.getMeasuredHeight()
            r4.A00 = r0
            android.widget.TextView r0 = r3.A07
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            int r2 = X.C156757h9.A00(r0)
            r4.A01 = r2
            android.view.ViewGroup r1 = r3.A06
            r7 = 0
            android.view.View r0 = r1.getChildAt(r7)
            int r0 = X.C156757h9.A00(r0)
            int r2 = r2 + r0
            r4.A01 = r2
            r6 = 0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0095
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            int r0 = r0.topMargin
            int r7 = r7 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            int r0 = r0.bottomMargin
            int r6 = r7 + r0
        L_0x0095:
            android.view.ViewParent r0 = r1.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x00d8
            android.view.ViewParent r1 = r1.getParent()
        L_0x00a1:
            android.view.View r1 = (android.view.View) r1
            if (r1 == r5) goto L_0x00ce
            int r0 = r1.getPaddingTop()
            int r6 = r6 + r0
            int r0 = r1.getPaddingTop()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00c5
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            int r0 = r0.topMargin
            int r6 = r6 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            int r0 = r0.bottomMargin
            int r6 = r6 + r0
        L_0x00c5:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00ce
            goto L_0x00a1
        L_0x00ce:
            int r0 = r5.getPaddingTop()
            int r6 = r6 + r0
            int r0 = r5.getPaddingTop()
            int r6 = r6 + r0
        L_0x00d8:
            int r2 = r2 + r6
            r4.A01 = r2
            r3.requestLayout()
            goto L_0x001d
        L_0x00e0:
            java.lang.Object r2 = r8.A00
            X.5cU r2 = (X.C108145cU) r2
            android.view.View r0 = r2.A0A
            X.AnonymousClass0x7.A16(r0, r8)
            X.7T7 r1 = r2.A0b
            android.view.View r0 = r2.A0A
            float r0 = X.C86664Kz.A02(r0)
            r1.A00(r0)
            android.location.Location r3 = r2.A02()
            int r5 = r2.A00()
            r4 = 0
            r6 = 0
            r7 = 1
            r2.A0J(r3, r4, r5, r6, r7)
            r2.A0P(r4, r7)
            goto L_0x0175
        L_0x0106:
            java.lang.Object r1 = r8.A00
            X.4br r1 = (X.C89164br) r1
            android.widget.ListView r0 = r1.getListView()
            X.AnonymousClass0x7.A16(r0, r8)
            r1.A5V()
            goto L_0x0175
        L_0x0115:
            java.lang.Object r4 = r8.A00
            X.4o4 r4 = (X.AnonymousClass4o4) r4
            X.2OM r0 = r4.A04
            java.util.HashSet r0 = r0.A00
            X.2z0 r3 = r4.A06
            boolean r0 = r0.contains(r3)
            r2 = 1
            if (r0 != 0) goto L_0x0134
            X.2g5 r1 = r4.A05
            java.lang.String r0 = "carousel_message_render_tag"
            r1.A01(r3, r0, r2)
            X.2OM r0 = r4.A04
            java.util.HashSet r0 = r0.A00
            r0.add(r3)
        L_0x0134:
            X.AnonymousClass0x7.A16(r4, r8)
            goto L_0x0175
        L_0x0138:
            java.lang.Object r0 = r8.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity) r0
            X.4zS r4 = r0.A05
            if (r4 == 0) goto L_0x0175
            android.view.View r3 = r4.A08
            r0 = 2131433354(0x7f0b178a, float:1.8488491E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x0175
            int[] r2 = r4.A0D
            r0.getLocationOnScreen(r2)
            int[] r1 = r4.A0C
            r3.getLocationOnScreen(r1)
            android.widget.TextView r0 = r4.A04
            float r3 = r0.getX()
            r0 = 0
            r2 = r2[r0]
            r0 = r1[r0]
            int r2 = r2 - r0
            float r1 = (float) r2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0175
            X.C97904zS.A0E = r2
            android.widget.TextView r0 = r4.A04
            r0.setX(r1)
            android.widget.TextView r1 = r4.A05
            int r0 = X.C97904zS.A0E
            float r0 = (float) r0
            r1.setX(r0)
        L_0x0175:
            r0 = 1
            return r0
        L_0x0177:
            boolean r0 = A01(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6AE.onPreDraw():boolean");
    }
}
