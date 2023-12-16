package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.HomeActivity;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4uI  reason: invalid class name and case insensitive filesystem */
public abstract class C95704uI extends C131736e6 implements C179038iV {
    public int A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public AnonymousClass5ZE A04;
    public PagerSlidingTabStrip A05;
    public C52412lR A06;
    public AnonymousClass5SY A07;
    public AnonymousClass58N A08 = AnonymousClass58N.UNDEFINED;
    public C106135Xt A09;
    public C69253Wh A0A;
    public C187958y5 A0B;
    public AnonymousClass5UY A0C;
    public AnonymousClass5UY A0D;
    public boolean A0E;
    public final C15790rw A0F = new AnonymousClass6A8(this, 8);

    public C1229666n A7C() {
        C1229966q A2a = AnonymousClass4SG.A2a((HomeActivity) this);
        if (A2a instanceof C1229666n) {
            return (C1229666n) A2a;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r3.hasMessages(0) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r0 = "updateNavigationMenuAndBadges skipped because a batch update was already scheduled";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        com.whatsapp.util.Log.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r3.sendEmptyMessageDelayed(0, 250);
        r0 = "updateNavigationMenuAndBadges batch scheduled";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7E() {
        /*
            r5 = this;
            r4 = r5
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            X.1VX r1 = r4.A0D
            r0 = 4286(0x10be, float:6.006E-42)
            boolean r0 = r1.A0X(r0)
            monitor-enter(r4)
            if (r0 != 0) goto L_0x002c
            X.3dI r2 = r4.A1I     // Catch:{ all -> 0x005c }
            if (r2 != 0) goto L_0x001a
            X.4FS r0 = r4.A04     // Catch:{ all -> 0x005c }
            X.3dI r2 = X.C72173dI.A00(r0)     // Catch:{ all -> 0x005c }
            r4.A1I = r2     // Catch:{ all -> 0x005c }
        L_0x001a:
            X.C626936e.A06(r2)     // Catch:{ all -> 0x005c }
            monitor-exit(r4)
            r2.A02()
            r1 = 30
            X.5sG r0 = new X.5sG
            r0.<init>((com.whatsapp.HomeActivity) r4, (int) r1)
            r2.execute(r0)
            return
        L_0x002c:
            android.os.Handler r3 = r4.A0D     // Catch:{ all -> 0x005c }
            if (r3 != 0) goto L_0x0043
            X.2X6 r0 = r4.A1M     // Catch:{ all -> 0x005c }
            android.os.Looper r2 = r0.A00()     // Catch:{ all -> 0x005c }
            r1 = 0
            X.69w r0 = new X.69w     // Catch:{ all -> 0x005c }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x005c }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x005c }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x005c }
            r4.A0D = r3     // Catch:{ all -> 0x005c }
        L_0x0043:
            X.C626936e.A06(r3)     // Catch:{ all -> 0x005c }
            monitor-exit(r4)
            r2 = 0
            boolean r0 = r3.hasMessages(r2)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "updateNavigationMenuAndBadges skipped because a batch update was already scheduled"
        L_0x0050:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0054:
            r0 = 250(0xfa, double:1.235E-321)
            r3.sendEmptyMessageDelayed(r2, r0)
            java.lang.String r0 = "updateNavigationMenuAndBadges batch scheduled"
            goto L_0x0050
        L_0x005c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95704uI.A7E():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r1.length() == 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r1 = r3.getString(com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r0 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r3.A08 == X.AnonymousClass58N.A03) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (X.C1001059l.A05 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7F() {
        /*
            r6 = this;
            r3 = r6
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.0R8 r2 = r3.getSupportActionBar()
            if (r2 == 0) goto L_0x0051
            android.view.ViewGroup r0 = r3.A0M
            int r1 = X.C86664Kz.A0A(r0)
            com.whatsapp.WaTextView r0 = r3.A0n
            if (r0 == 0) goto L_0x0016
            r0.setVisibility(r1)
        L_0x0016:
            int r5 = r3.A06
            r4 = 200(0xc8, float:2.8E-43)
            boolean r0 = X.C1001059l.A03
            if (r0 == 0) goto L_0x0023
            boolean r1 = X.C1001059l.A05
            r0 = 1
            if (r1 != 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r5 == r4) goto L_0x0052
            if (r0 == 0) goto L_0x0058
            X.58N r1 = r3.A08
            X.58N r0 = X.AnonymousClass58N.BOTTOM
            if (r1 == r0) goto L_0x0032
            X.58N r0 = X.AnonymousClass58N.RAIL
            if (r1 != r0) goto L_0x0054
        L_0x0032:
            androidx.appcompat.widget.Toolbar r0 = r3.A0P
            X.578 r0 = (X.AnonymousClass578) r0
            r0.A0L()
        L_0x0039:
            X.4Tb r1 = r3.A0l
            int r0 = r3.A06
            java.lang.CharSequence r1 = r1.A0J(r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x004e
        L_0x0047:
            r0 = 2131895980(0x7f1226ac, float:1.9426808E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x004e:
            r2.A0J(r1)
        L_0x0051:
            return
        L_0x0052:
            if (r0 == 0) goto L_0x0058
        L_0x0054:
            r3.A7m(r2)
            return
        L_0x0058:
            X.58N r1 = r3.A08
            X.58N r0 = X.AnonymousClass58N.RAIL
            if (r1 != r0) goto L_0x0047
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95704uI.A7F():void");
    }

    public void A7H(AnonymousClass58N r4) {
        View view;
        int A022 = C18320x8.A02(r4, 0);
        if (A022 == 2 || A022 == 3) {
            view = this.A01;
        } else {
            view = this.A05;
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void setRootView(View view) {
        C162457s7.A0J(view, 0);
        this.A02 = view;
    }

    public final C106135Xt A7D() {
        C106135Xt r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("navBarHelper");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7G() {
        /*
            r15 = this;
            X.58N r3 = r15.A08
            int r1 = r3.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x028d
            r0 = 3
            if (r1 == r0) goto L_0x0284
            X.58N r0 = X.AnonymousClass58N.BOTTOM
        L_0x000e:
            r15.A7H(r0)
            X.58N r0 = X.AnonymousClass58N.RAIL
        L_0x0013:
            r15.A7H(r0)
            int r0 = r3.ordinal()
            r1 = 2
            if (r0 == r1) goto L_0x023a
            r1 = 3
            if (r0 == r1) goto L_0x01e2
            android.view.View r2 = r15.A02
            if (r2 == 0) goto L_0x02bb
            r1 = 2131434359(0x7f0b1b77, float:1.849053E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r1)
            com.whatsapp.PagerSlidingTabStrip r1 = (com.whatsapp.PagerSlidingTabStrip) r1
            r15.A05 = r1
            boolean r1 = X.C1001059l.A03
            if (r1 == 0) goto L_0x0044
            r2 = 2130971135(0x7f0409ff, float:1.7551E38)
            r1 = 2131102951(0x7f060ce7, float:1.7818354E38)
            int r2 = X.C18300x5.A03(r15, r2, r1)
            com.whatsapp.PagerSlidingTabStrip r1 = r15.A05
            if (r1 == 0) goto L_0x0044
            r1.setUnderlineColor(r2)
        L_0x0044:
            X.66n r4 = r15.A7C()
            if (r4 == 0) goto L_0x0054
            X.5ZE r2 = r15.A04
            if (r2 == 0) goto L_0x02b4
            r1 = 1
            r2.A03 = r1
            r2.A04(r4)
        L_0x0054:
            X.58N r1 = X.AnonymousClass58N.RAIL
            if (r3 != r1) goto L_0x01ab
            X.5Xt r1 = r15.A7D()
            X.4P2 r2 = r1.A01
            java.lang.String r1 = "null cannot be cast to non-null type com.google.android.material.navigationrail.NavigationRailView"
            X.C162457s7.A0K(r2, r1)
            com.google.android.material.navigationrail.NavigationRailView r2 = (com.google.android.material.navigationrail.NavigationRailView) r2
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x0095
            X.2sH r9 = r15.A06
            X.1VX r12 = r15.A0D
            X.33j r11 = r15.A00
            X.5SY r13 = r15.A07
            if (r13 == 0) goto L_0x029f
            X.3Wh r14 = r15.A0A
            if (r14 == 0) goto L_0x0298
            X.33p r10 = r15.A09
            r1 = 2131430551(0x7f0b0c97, float:1.8482806E38)
            android.widget.ImageView r6 = X.C86654Ky.A0M(r15, r1)
            r1 = 2131430552(0x7f0b0c98, float:1.8482808E38)
            android.widget.ImageView r7 = X.C86654Ky.A0M(r15, r1)
            r5 = 0
            X.5ZE r4 = new X.5ZE
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -1
            r4.A00 = r1
            r4.A02 = r3
            r15.A04 = r4
        L_0x0095:
            X.66n r3 = r15.A7C()
            if (r3 == 0) goto L_0x00a5
            X.5ZE r2 = r15.A04
            if (r2 == 0) goto L_0x0291
            r1 = 0
            r2.A03 = r1
            r2.A04(r3)
        L_0x00a5:
            r3 = r15
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            r1 = 3
            if (r0 == r1) goto L_0x00d7
            r1 = 2
            if (r0 == r1) goto L_0x00d7
            com.whatsapp.PagerSlidingTabStrip r4 = r3.A05
            if (r4 == 0) goto L_0x00d3
            r2 = 0
            r4.setVisibility(r2)
            X.AnonymousClass0YY.A06(r4, r1)
            X.AnonymousClass0YH.A06(r4, r2)
            com.whatsapp.HomeActivity$TabsPager r0 = r3.A0k
            r4.setViewPager(r0)
            X.4ZU r0 = r3.A2O
            r4.A0M = r0
            java.util.List r0 = com.whatsapp.HomeActivity.A2Z
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x00d0
            r2 = 8
        L_0x00d0:
            r4.setVisibility(r2)
        L_0x00d3:
            r15.A7F()
            return
        L_0x00d7:
            X.5Xt r0 = r3.A09
            X.4P2 r4 = r0.A01
            android.view.View r0 = r3.A01
            if (r4 == 0) goto L_0x00d3
            if (r0 == 0) goto L_0x00d3
            X.4SJ r6 = r4.A03
            boolean r0 = r6.hasVisibleItems()
            r2 = 0
            if (r0 != 0) goto L_0x0149
            java.util.List r0 = com.whatsapp.HomeActivity.A2Z
            java.util.Iterator r9 = r0.iterator()
        L_0x00f0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r1 = r9.next()
            java.lang.Number r1 = (java.lang.Number) r1
            X.4Tb r0 = r3.A0l
            int r8 = r1.intValue()
            java.lang.CharSequence r0 = r0.A0J(r8)
            android.view.MenuItem r5 = r6.add((int) r2, (int) r8, (int) r2, (java.lang.CharSequence) r0)
            X.5Xt r7 = r3.A09
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 2131231678(0x7f0803be, float:1.8079444E38)
            if (r8 == r0) goto L_0x012c
            r0 = 300(0x12c, float:4.2E-43)
            if (r8 == r0) goto L_0x013a
            r0 = 400(0x190, float:5.6E-43)
            r1 = 2131231676(0x7f0803bc, float:1.807944E38)
            if (r8 == r0) goto L_0x012c
            r0 = 600(0x258, float:8.41E-43)
            r1 = 2131231679(0x7f0803bf, float:1.8079446E38)
            if (r8 == r0) goto L_0x012c
            r0 = 700(0x2bc, float:9.81E-43)
            if (r8 != r0) goto L_0x00f0
            r1 = 2131231675(0x7f0803bb, float:1.8079438E38)
        L_0x012c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00f0
            int r0 = r0.intValue()
            r5.setIcon(r0)
            goto L_0x00f0
        L_0x013a:
            X.5UP r0 = r7.A07
            boolean r0 = X.C18300x5.A1S(r0)
            r1 = 2131231680(0x7f0803c0, float:1.8079448E38)
            if (r0 == 0) goto L_0x012c
            r1 = 2131231681(0x7f0803c1, float:1.807945E38)
            goto L_0x012c
        L_0x0149:
            X.8iF r0 = r3.A2M
            r4.A02 = r0
            X.8iE r0 = r3.A2L
            r4.A01 = r0
            r3.A7b(r2)
            X.1VX r1 = r3.A0D
            r0 = 5379(0x1503, float:7.538E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0164
            r0 = 2131099896(0x7f0600f8, float:1.7812158E38)
            X.C86604Kt.A0z(r3, r4, r0)
        L_0x0164:
            X.5SY r1 = r3.A07
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0199
            X.1VX r1 = r1.A01
            r0 = 6541(0x198d, float:9.166E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0199
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168272(0x7f070c10, float:1.7950841E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.setItemPaddingTop(r0)
            r4.setItemPaddingBottom(r0)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168240(0x7f070bf0, float:1.7950776E38)
            int r0 = X.AnonymousClass4L0.A01(r1, r0)
            r2.height = r0
            r4.setLayoutParams(r2)
        L_0x0199:
            com.whatsapp.HomeActivity$TabsPager r0 = r3.A0k
            java.util.List r0 = r0.A0c
            if (r0 == 0) goto L_0x01a2
            r0.clear()
        L_0x01a2:
            com.whatsapp.HomeActivity$TabsPager r1 = r3.A0k
            X.4ZU r0 = r3.A2O
            r1.A0G(r0)
            goto L_0x00d3
        L_0x01ab:
            X.2sH r6 = r15.A06
            X.1VX r9 = r15.A0D
            X.33j r8 = r15.A00
            X.5SY r10 = r15.A07
            if (r10 == 0) goto L_0x02ad
            X.3Wh r11 = r15.A0A
            if (r11 == 0) goto L_0x02a6
            X.33p r7 = r15.A09
            r1 = 2131430068(0x7f0b0ab4, float:1.8481827E38)
            android.widget.ImageView r3 = X.C86654Ky.A0M(r15, r1)
            r1 = 2131430070(0x7f0b0ab6, float:1.848183E38)
            android.widget.ImageView r4 = X.C86654Ky.A0M(r15, r1)
            r1 = 2131430069(0x7f0b0ab5, float:1.8481829E38)
            android.view.View r5 = r15.findViewById(r1)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 2131430072(0x7f0b0ab8, float:1.8481835E38)
            android.view.ViewStub r2 = X.C86664Kz.A0o(r15, r1)
            X.5ZE r1 = new X.5ZE
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.A04 = r1
            goto L_0x0095
        L_0x01e2:
            X.5UY r2 = r15.A0D
            if (r2 != 0) goto L_0x01f1
            android.view.View r2 = r15.A02
            if (r2 == 0) goto L_0x02c2
            r1 = 2131431673(0x7f0b10f9, float:1.8485082E38)
            X.5UY r2 = X.AnonymousClass0x2.A0M(r2, r1)
        L_0x01f1:
            r15.A0D = r2
            android.view.View r1 = r2.A04()
            r15.A01 = r1
            android.view.View r2 = r2.A04()
            r1 = 2131431661(0x7f0b10ed, float:1.8485058E38)
            android.view.View r6 = X.C18280x3.A0E(r2, r1)
            com.google.android.material.navigationrail.NavigationRailView r6 = (com.google.android.material.navigationrail.NavigationRailView) r6
            X.5Xt r5 = r15.A7D()
            r1 = 0
            X.C162457s7.A0J(r6, r1)
            r5.A01 = r6
            android.view.ViewGroup r4 = r15.A03
            if (r4 != 0) goto L_0x021b
            java.lang.String r0 = "mainContainer"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x021b:
            android.view.View r2 = r15.A01
            X.0AO r1 = r5.A04
            if (r2 == 0) goto L_0x022a
            r1.A0A(r2)
            r1.A09(r2)
            X.AnonymousClass0XC.A02(r4, r1)
        L_0x022a:
            android.view.View r1 = r6.A00
            if (r1 != 0) goto L_0x0044
            r1 = 2131625088(0x7f0e0480, float:1.8877374E38)
            android.view.View r1 = X.C86654Ky.A0G(r15, r1)
            r6.A00(r1)
            goto L_0x0044
        L_0x023a:
            X.5UY r2 = r15.A0C
            if (r2 != 0) goto L_0x0249
            android.view.View r2 = r15.A02
            if (r2 == 0) goto L_0x02c9
            r1 = 2131428126(0x7f0b031e, float:1.8477888E38)
            X.5UY r2 = X.AnonymousClass0x2.A0M(r2, r1)
        L_0x0249:
            r15.A0C = r2
            android.view.View r1 = r2.A04()
            r15.A01 = r1
            android.view.View r2 = r2.A04()
            r1 = 2131428121(0x7f0b0319, float:1.8477878E38)
            android.view.View r2 = X.C18280x3.A0E(r2, r1)
            X.4P2 r2 = (X.AnonymousClass4P2) r2
            X.5Xt r5 = r15.A7D()
            r1 = 0
            X.C162457s7.A0J(r2, r1)
            r5.A01 = r2
            android.view.ViewGroup r4 = r15.A03
            if (r4 != 0) goto L_0x0273
            java.lang.String r0 = "mainContainer"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0273:
            android.view.View r2 = r15.A01
            X.0AO r1 = r5.A03
            if (r2 == 0) goto L_0x0044
            r1.A0A(r2)
            r1.A09(r2)
            X.AnonymousClass0XC.A02(r4, r1)
            goto L_0x0044
        L_0x0284:
            X.58N r0 = X.AnonymousClass58N.TAB
            r15.A7H(r0)
            X.58N r0 = X.AnonymousClass58N.BOTTOM
            goto L_0x0013
        L_0x028d:
            X.58N r0 = X.AnonymousClass58N.TAB
            goto L_0x000e
        L_0x0291:
            java.lang.String r0 = "homeFabManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0298:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x029f:
            java.lang.String r0 = "bottomNavHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02a6:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02ad:
            java.lang.String r0 = "bottomNavHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02b4:
            java.lang.String r0 = "homeFabManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02bb:
            java.lang.String r0 = "rootView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02c2:
            java.lang.String r0 = "rootView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02c9:
            java.lang.String r0 = "rootView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95704uI.A7G():void");
    }

    public final boolean A7I() {
        AnonymousClass58N r1;
        int i;
        int i2;
        if (A7D().A09) {
            C52412lR r0 = this.A06;
            if (r0 != null) {
                if (!r0.A01()) {
                    if (this.A09.A0E() && this.A0E) {
                        i = 720;
                        i2 = 600;
                    } else if (this.A09.A0F()) {
                        i = 720;
                        i2 = 1280;
                    }
                    if (C107065ad.A05(this, new AnonymousClass7VM(i2).A00, i)) {
                        r1 = AnonymousClass58N.RAIL;
                    }
                }
                r1 = AnonymousClass58N.BOTTOM;
            } else {
                throw C18270x1.A0S("deviceUtils");
            }
        } else {
            if (!A7D().A08) {
                r1 = AnonymousClass58N.TAB;
            }
            r1 = AnonymousClass58N.BOTTOM;
        }
        if (this.A08 == r1) {
            return false;
        }
        this.A08 = r1;
        return true;
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        HomeActivity homeActivity = (HomeActivity) this;
        List list = HomeActivity.A2Z;
        list.clear();
        if (homeActivity.A1H.A01()) {
            C86634Kw.A1V(list, 600);
        }
        C86634Kw.A1V(list, 200);
        C86634Kw.A1V(list, 300);
        int i2 = 400;
        if (((C105355Up) homeActivity.A1g.get()).A03.A0X(2358)) {
            i2 = 800;
        }
        C86634Kw.A1V(list, i2);
        Collections.sort(list, new AnonymousClass6A5(homeActivity, 0));
        if (!homeActivity.A7D().A08 && !C620733j.A04(homeActivity.A00)) {
            Collections.reverse(list);
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        if (A7D().A08) {
            AnonymousClass5SY r0 = this.A07;
            if (r0 != null) {
                boolean A012 = r0.A01();
                i = R.layout.f8nameremoved;
                if (A012) {
                    i = R.layout.f8nameremoved;
                }
            } else {
                throw C18270x1.A0S("bottomNavHelper");
            }
        } else {
            i = R.layout.f8nameremoved;
        }
        View A0I = C18310x6.A0I(layoutInflater, (ViewGroup) null, i, false);
        this.A02 = A0I;
        if (A0I != null) {
            setContentView(A0I);
            View view = this.A02;
            if (view != null) {
                this.A03 = (ViewGroup) C18290x4.A0M(view, R.id.main_container);
                View view2 = this.A02;
                if (view2 != null) {
                    this.A06 = view2;
                    this.A00 = R.id.conversation_view_host;
                    this.A01 = R.id.conversation_list_view_host;
                    this.A07 = this;
                    this.A09.A0A(this);
                    boolean A0F2 = this.A09.A0F();
                    this.A0B = A0F2;
                    if (A0F2) {
                        A78();
                    }
                    A7I();
                    View view3 = this.A02;
                    if (view3 != null) {
                        C162457s7.A0K(view3, "null cannot be cast to non-null type android.view.ViewGroup");
                        C107065ad.A04((ViewGroup) view3, new AnonymousClass91U(this, 4));
                        C56612sH r5 = this.A06;
                        AnonymousClass1VX r8 = this.A0D;
                        C620733j r7 = this.A00;
                        AnonymousClass5SY r9 = this.A07;
                        if (r9 != null) {
                            C69253Wh r10 = this.A0A;
                            if (r10 != null) {
                                this.A04 = new AnonymousClass5ZE((ViewStub) null, C86654Ky.A0M(this, R.id.fab), C86654Ky.A0M(this, R.id.fab_second), (MaterialButton) findViewById(R.id.fabText), r5, this.A09, r7, r8, r9, r10);
                                return;
                            }
                            throw C18270x1.A0S("mainThreadHandler");
                        }
                        throw C18270x1.A0S("bottomNavHelper");
                    }
                    throw C18270x1.A0S("rootView");
                }
                throw C18270x1.A0S("rootView");
            }
            throw C18270x1.A0S("rootView");
        }
        throw C18270x1.A0S("rootView");
    }

    public void onStart() {
        super.onStart();
        this.A09.A0B(this, this.A0F);
    }

    public void onStop() {
        super.onStop();
        this.A09.A0C(this.A0F);
    }

    public final void setNavigationBarContainer(View view) {
        this.A01 = view;
    }
}
