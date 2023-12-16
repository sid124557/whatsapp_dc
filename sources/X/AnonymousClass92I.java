package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.92I  reason: invalid class name */
public class AnonymousClass92I implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public AnonymousClass92I(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(AnonymousClass92I r2) {
        C136226mF r0 = (C136226mF) r2.A00;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) r0.A00;
        int A0A = r0.A0A();
        if (A0A != gridLayoutManager.A00) {
            gridLayoutManager.A1o(A0A);
        }
    }

    public static final void A01(AnonymousClass92I r3) {
        C91234j9 r32 = (C91234j9) r3.A00;
        View view = r32.A0H;
        if (view.getParent() != null) {
            ((View) view.getParent()).getHitRect(r32.A0C);
        }
        if (view.getLocalVisibleRect(r32.A0C)) {
            r32.A0F.setVisibility(0);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(r32.A0H);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01aa, code lost:
        if (r1.A03.isShowing() != false) goto L_0x01ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x026e;
                case 1: goto L_0x025a;
                case 2: goto L_0x027f;
                case 3: goto L_0x027b;
                case 4: goto L_0x0247;
                case 5: goto L_0x023a;
                case 6: goto L_0x022d;
                case 7: goto L_0x0219;
                case 8: goto L_0x0174;
                case 9: goto L_0x0152;
                case 10: goto L_0x01f2;
                case 11: goto L_0x01e5;
                case 12: goto L_0x013e;
                case 13: goto L_0x01da;
                case 14: goto L_0x00e7;
                case 15: goto L_0x0078;
                case 16: goto L_0x0035;
                case 17: goto L_0x0196;
                case 18: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            X.8v3 r0 = (X.C186288v3) r0
            r0.onGlobalLayout()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r8.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r1
            X.5Uk r0 = r1.A0N
            if (r0 == 0) goto L_0x000c
            r0.A02()
            X.5Ml r0 = r1.A0g
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.A1d()
            if (r0 == 0) goto L_0x000c
            X.5Ml r2 = r1.A0g
            X.5Uk r0 = r1.A0N
            int r1 = r0.A00()
            r0 = 5
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            r0 = r0 ^ 1
            r2.A00(r0)
            return
        L_0x0035:
            java.lang.Object r4 = r8.A00
            X.6oT r4 = (X.C137306oT) r4
            androidx.viewpager.widget.ViewPager r0 = r4.A0A
            int r2 = r0.getHeight()
            int r1 = r0.getWidth()
            if (r2 == 0) goto L_0x000c
            if (r1 == 0) goto L_0x000c
            int r0 = r4.A01
            if (r0 != r1) goto L_0x004f
            int r0 = r4.A00
            if (r0 == r2) goto L_0x000c
        L_0x004f:
            r4.A01 = r1
            r4.A00 = r2
            X.6pT r0 = r4.A0L
            r0.A02(r1, r2)
            X.6pR r2 = r4.A0M
            int r1 = r4.A01
            int r0 = r4.A00
            r2.A02(r1, r0)
            r3 = 2
        L_0x0062:
            int r0 = r4.A07
            if (r3 >= r0) goto L_0x000c
            java.util.List r0 = r4.A04
            java.lang.Object r2 = r0.get(r3)
            X.8J3 r2 = (X.AnonymousClass8J3) r2
            int r1 = r4.A01
            int r0 = r4.A00
            r2.A02(r1, r0)
            int r3 = r3 + 1
            goto L_0x0062
        L_0x0078:
            java.lang.Object r5 = r8.A00
            X.6oS r5 = (X.C137296oS) r5
            androidx.viewpager.widget.ViewPager r4 = r5.A0A
            int r2 = r4.getHeight()
            int r1 = r4.getWidth()
            if (r2 == 0) goto L_0x00b2
            if (r1 == 0) goto L_0x00b2
            int r0 = r5.A01
            if (r0 != r1) goto L_0x0092
            int r0 = r5.A00
            if (r0 == r2) goto L_0x00b2
        L_0x0092:
            r5.A01 = r1
            r5.A00 = r2
            java.util.List r0 = r5.A0J
            java.util.Iterator r3 = r0.iterator()
        L_0x009c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r2 = r3.next()
            X.8J3 r2 = (X.AnonymousClass8J3) r2
            if (r2 == 0) goto L_0x009c
            int r1 = r5.A01
            int r0 = r5.A00
            r2.A02(r1, r0)
            goto L_0x009c
        L_0x00b2:
            android.view.ViewParent r0 = r4.getParent()
            android.view.View r0 = (android.view.View) r0
            int r2 = r0.getWidth()
            int r0 = r5.A02
            if (r2 == r0) goto L_0x000c
            r5.A02 = r2
            X.8J5 r6 = r5.A0d
            if (r6 == 0) goto L_0x000c
            android.view.View r0 = r6.A08
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131168369(0x7f070c71, float:1.7951038E38)
            int r5 = r1.getDimensionPixelSize(r0)
            int r4 = r2 / 9
            X.33j r0 = r6.A0B
            boolean r3 = r0.A0T()
            r2 = 0
            androidx.recyclerview.widget.RecyclerView r1 = r6.A0A
            int r4 = r4 - r5
            int r0 = r4 / 2
            if (r3 == 0) goto L_0x0283
            r1.setPadding(r0, r2, r2, r2)
            return
        L_0x00e7:
            java.lang.Object r4 = r8.A00
            X.7Pj r4 = (X.C150137Pj) r4
            androidx.recyclerview.widget.RecyclerView r7 = r4.A07
            r5 = 0
            if (r7 == 0) goto L_0x013c
            int r6 = r7.getHeight()
        L_0x00f4:
            int r0 = r4.A02
            if (r6 == r0) goto L_0x0116
            r4.A02 = r6
            int r3 = r4.A04
            int r2 = r3 / 4
            int r0 = r3 * 3
            int r1 = r0 / 4
            int r0 = r6 % r3
            if (r0 < r2) goto L_0x0109
            if (r0 > r1) goto L_0x0109
            r1 = r0
        L_0x0109:
            int r6 = r6 - r1
            int r1 = java.lang.Math.max(r5, r6)
            int r0 = r1 / r3
            int r1 = r1 % r3
            int r0 = r0 + 1
            int r1 = r1 / r0
            r4.A01 = r1
        L_0x0116:
            if (r7 == 0) goto L_0x011c
            int r5 = r7.getWidth()
        L_0x011c:
            int r0 = r4.A03
            if (r0 == r5) goto L_0x000c
            r4.A03 = r5
            int r0 = r4.A04
            if (r0 == 0) goto L_0x0139
            int r5 = r5 / r0
            int r0 = r4.A00
            if (r0 == r5) goto L_0x0139
            r4.A00 = r5
            androidx.recyclerview.widget.GridLayoutManager r0 = r4.A06
            r0.A1o(r5)
            X.6Hh r0 = r4.A08
            if (r0 == 0) goto L_0x0139
            r0.A05()
        L_0x0139:
            X.6Hh r0 = r4.A08
            goto L_0x014c
        L_0x013c:
            r6 = 0
            goto L_0x00f4
        L_0x013e:
            java.lang.Object r1 = r8.A00
            X.5Y7 r1 = (X.AnonymousClass5Y7) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.A0M
            X.C86604Kt.A1G(r0, r8)
            X.AnonymousClass5Y7.A00(r1)
            X.4Wu r0 = r1.A08
        L_0x014c:
            if (r0 == 0) goto L_0x000c
            r0.A05()
            return
        L_0x0152:
            java.lang.Object r1 = r8.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r1
            X.4uh r0 = r1.A0N
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeGlobalOnLayoutListener(r8)
            X.4uh r0 = r1.A0N
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x000c
            X.4uh r0 = r1.A0N
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x000c
            r0 = 0
            r1.A79(r0)
            return
        L_0x0174:
            java.lang.Object r1 = r8.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r1
            X.4ug r0 = r1.A0M
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeGlobalOnLayoutListener(r8)
            X.4ug r0 = r1.A0M
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x000c
            X.4ug r0 = r1.A0M
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x000c
            r0 = 0
            r1.A79(r0)
            return
        L_0x0196:
            java.lang.Object r1 = r8.A00
            X.5Kn r1 = (X.C102855Kn) r1
            android.view.View r4 = r1.A00
            boolean r0 = X.C105895Wv.A00(r4)
            r3 = 0
            if (r0 != 0) goto L_0x01ac
            X.4c7 r0 = r1.A03
            boolean r0 = r0.isShowing()
            r2 = 0
            if (r0 == 0) goto L_0x01ad
        L_0x01ac:
            r2 = 1
        L_0x01ad:
            r0 = 2131430957(0x7f0b0e2d, float:1.848363E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 8
            if (r2 == 0) goto L_0x01b9
            r0 = 0
        L_0x01b9:
            r1.setVisibility(r0)
            r0 = 2131429711(0x7f0b094f, float:1.8481102E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 8
            if (r2 == 0) goto L_0x01c8
            r0 = 0
        L_0x01c8:
            r1.setVisibility(r0)
            r0 = 2131430958(0x7f0b0e2e, float:1.8483632E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r2 == 0) goto L_0x01d6
            r3 = 8
        L_0x01d6:
            r0.setVisibility(r3)
            return
        L_0x01da:
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            X.C86604Kt.A1G(r0, r8)
            r0.requestLayout()
            return
        L_0x01e5:
            java.lang.Object r1 = r8.A00
            X.5Y7 r1 = (X.AnonymousClass5Y7) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.A0M
            X.C86604Kt.A1G(r0, r8)
            X.AnonymousClass5Y7.A00(r1)
            return
        L_0x01f2:
            java.lang.Object r4 = r8.A00
            X.5cU r4 = (X.C108145cU) r4
            android.view.View r0 = r4.A0L
            X.C86604Kt.A1G(r0, r8)
            android.view.View r0 = r4.A0L
            int r0 = r0.getMeasuredHeight()
            r4.A03 = r0
            android.view.View r0 = r4.A0L
            int r0 = r0.getMeasuredHeight()
            double r2 = (double) r0
            r0 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r2 = r2 * r0
            int r0 = (int) r2
            r4.A04 = r0
            r1 = 0
            r0 = 0
            r4.A0P(r0, r1)
            return
        L_0x0219:
            java.lang.Object r1 = r8.A00
            com.whatsapp.group.GroupAdminPickerActivity r1 = (com.whatsapp.group.GroupAdminPickerActivity) r1
            android.view.View r0 = r1.A02
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeGlobalOnLayoutListener(r8)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r1.A06
            r0 = 3
            r1.A0S(r0)
            return
        L_0x022d:
            java.lang.Object r1 = r8.A00
            com.whatsapp.greenalert.GreenAlertActivity r1 = (com.whatsapp.greenalert.GreenAlertActivity) r1
            com.whatsapp.WaViewPager r0 = r1.A06
            X.C86604Kt.A1G(r0, r8)
            r1.A75()
            return
        L_0x023a:
            java.lang.Object r1 = r8.A00
            X.5ZS r1 = (X.AnonymousClass5ZS) r1
            android.view.View r0 = r1.A08
            X.C86604Kt.A1G(r0, r8)
            X.AnonymousClass5ZS.A02(r1)
            return
        L_0x0247:
            java.lang.Object r1 = r8.A00
            X.5ZS r1 = (X.AnonymousClass5ZS) r1
            android.view.View r0 = r1.A08
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeGlobalOnLayoutListener(r8)
            X.678 r0 = r1.A0C
            r0.Bk6()
            return
        L_0x025a:
            java.lang.Object r2 = r8.A00
            com.whatsapp.PagerSlidingTabStrip r2 = (com.whatsapp.PagerSlidingTabStrip) r2
            X.C86604Kt.A1G(r2, r8)
            androidx.viewpager.widget.ViewPager r0 = r2.A0N
            int r1 = r0.getCurrentItem()
            r2.A01 = r1
            r0 = 0
            com.whatsapp.PagerSlidingTabStrip.A00(r2, r1, r0)
            return
        L_0x026e:
            java.lang.Object r1 = r8.A00
            android.widget.HorizontalScrollView r1 = (android.widget.HorizontalScrollView) r1
            X.C86604Kt.A1G(r1, r8)
            r0 = 66
            r1.fullScroll(r0)
            return
        L_0x027b:
            A01(r8)
            return
        L_0x027f:
            A00(r8)
            return
        L_0x0283:
            r1.setPadding(r2, r2, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92I.onGlobalLayout():void");
    }
}
