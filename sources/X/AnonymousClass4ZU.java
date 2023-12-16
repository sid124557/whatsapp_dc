package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.4ZU  reason: invalid class name */
public class AnonymousClass4ZU extends C08790f7 {
    public final /* synthetic */ HomeActivity A00;

    public AnonymousClass4ZU(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXf(int r10) {
        /*
            r9 = this;
            com.whatsapp.HomeActivity r5 = r9.A00
            X.0R2 r0 = r5.A0N
            if (r0 == 0) goto L_0x0009
            r0.A05()
        L_0x0009:
            r4 = 1
            r5.A7q(r4)
            r5.A7X()
            int r1 = r5.A7L(r10)
            r5.A06 = r1
            X.2rN r0 = r5.A1H
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0030
            r0 = 600(0x258, float:8.41E-43)
            r3 = 3
            if (r1 != r0) goto L_0x0024
            r3 = 0
        L_0x0024:
            X.4FS r2 = r5.A04
            r1 = 8
            X.5sM r0 = new X.5sM
            r0.<init>((java.lang.Object) r9, (int) r3, (int) r1)
            r2.BkM(r0)
        L_0x0030:
            r5.A7E()
            int r3 = r5.A06
            int r0 = com.whatsapp.HomeActivity.A0C(r3)
            X.66q r2 = r5.A7N(r0)
            X.4xi r1 = r5.A09
            if (r2 == 0) goto L_0x006f
            boolean r0 = r2.B3Y()
            if (r0 == 0) goto L_0x006f
            boolean r0 = r2.BTo()
            if (r0 == 0) goto L_0x006d
            boolean r2 = r2.isEmpty()
        L_0x0051:
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x0071
            r1.A01 = r3
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r1.next()
            X.5UN r0 = (X.AnonymousClass5UN) r0
            r0.A01(r3, r2)
            goto L_0x005d
        L_0x006d:
            r2 = 1
            goto L_0x0051
        L_0x006f:
            r2 = 0
            goto L_0x0051
        L_0x0071:
            r5.A7F()
            int r6 = r5.A06
            r0 = 400(0x190, float:5.6E-43)
            r3 = 300(0x12c, float:4.2E-43)
            r1 = 500(0x1f4, double:2.47E-321)
            if (r6 != r0) goto L_0x0104
            X.3Wi r0 = r5.A05
            java.lang.Runnable r3 = r5.A2V
        L_0x0082:
            r0.A0R(r3)
            X.3Wi r0 = r5.A05
            r0.A0T(r3, r1)
        L_0x008a:
            r7 = 0
            r5.A7b(r7)
            r5.invalidateOptionsMenu()
            r5.A7V()
            X.66q r0 = X.AnonymousClass4SG.A2a(r5)
            X.0eF r0 = (X.C08310eF) r0
            if (r0 == 0) goto L_0x0120
            android.view.View r0 = r0.A0B
            if (r0 == 0) goto L_0x0120
            android.view.View r3 = X.C86664Kz.A0i(r0)
            com.whatsapp.collections.observablelistview.ObservableListView r3 = (com.whatsapp.collections.observablelistview.ObservableListView) r3
            if (r3 == 0) goto L_0x0120
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L_0x0120
            com.whatsapp.PagerSlidingTabStrip r0 = r5.A05
            if (r0 == 0) goto L_0x0102
            int r8 = r0.getHeight()
        L_0x00b6:
            int r0 = r3.getFirstVisiblePosition()
            if (r0 <= 0) goto L_0x00f8
            r6 = r8
        L_0x00bd:
            int r0 = r3.getChildCount()
            int r0 = r0 - r4
            android.view.View r2 = r3.getChildAt(r0)
            int r1 = r2.getBottom()
            int r0 = r3.getBottom()
            if (r1 <= r0) goto L_0x00f6
            int r1 = r2.getBottom()
            int r0 = r3.getBottom()
            int r1 = r1 - r0
        L_0x00d9:
            int r6 = r6 + r1
            if (r6 < r8) goto L_0x0120
            int r0 = r5.A02
            if (r0 != 0) goto L_0x00e8
            int r0 = r3.A04
            if (r0 <= 0) goto L_0x00e7
            r3.setSelection(r7)
        L_0x00e7:
            return
        L_0x00e8:
            int r1 = r3.A04
            androidx.appcompat.widget.Toolbar r0 = r5.A0P
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x00e7
            r3.setSelection(r4)
            return
        L_0x00f6:
            r1 = 0
            goto L_0x00d9
        L_0x00f8:
            android.view.View r0 = r3.getChildAt(r7)
            int r0 = r0.getTop()
            int r6 = -r0
            goto L_0x00bd
        L_0x0102:
            r8 = 0
            goto L_0x00b6
        L_0x0104:
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L_0x010e
            X.3Wi r0 = r5.A05
            java.lang.Runnable r3 = r5.A2U
            goto L_0x0082
        L_0x010e:
            if (r6 != r3) goto L_0x0116
            X.3Wi r0 = r5.A05
            java.lang.Runnable r3 = r5.A2W
            goto L_0x0082
        L_0x0116:
            r0 = 600(0x258, float:8.41E-43)
            if (r6 != r0) goto L_0x008a
            X.3Wi r0 = r5.A05
            java.lang.Runnable r3 = r5.A2T
            goto L_0x0082
        L_0x0120:
            r5.A7X()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZU.BXf(int):void");
    }
}
