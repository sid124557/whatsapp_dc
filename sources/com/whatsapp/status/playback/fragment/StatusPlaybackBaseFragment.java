package com.whatsapp.status.playback.fragment;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass5Go;
import X.AnonymousClass5LT;
import X.AnonymousClass5U7;
import X.AnonymousClass66H;
import X.C003203q;
import X.C105285Uh;
import X.C109735f6;
import X.C115875pN;
import X.C117635sF;
import X.C1226465e;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18300x5;
import X.C620633i;
import X.C620733j;
import X.C69263Wi;
import X.C86654Ky;
import X.C989753y;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import java.util.Iterator;
import java.util.List;

public abstract class StatusPlaybackBaseFragment extends Hilt_StatusPlaybackBaseFragment {
    public C69263Wi A00;
    public C620633i A01;
    public C620733j A02;
    public AnonymousClass1VX A03;
    public AnonymousClass5LT A04;
    public AnonymousClass5U7 A05;
    public boolean A06;
    public final AnonymousClass66H A07 = new C115875pN(this);
    public final Runnable A08 = new C117635sF(this, 10);

    public void A0o(Bundle bundle) {
        StatusPlaybackFragment A75;
        this.A0X = true;
        A1N(this.A01);
        C1226465e r3 = (C1226465e) A0Q();
        if (r3 != null) {
            String A0i = C18300x5.A0i(((StatusPlaybackContactFragment) this).A0R);
            StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) r3;
            UserJid userJid = ((AnonymousClass5Go) statusPlaybackActivity.A0D.A01.get(statusPlaybackActivity.A07.getCurrentItem())).A00.A0A;
            if (userJid.getRawString().equals(A0i) && (A75 = statusPlaybackActivity.A75(userJid.getRawString())) != null) {
                A75.A1J();
                A75.A1L(1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015d, code lost:
        if (r0 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1N(android.graphics.Rect r8) {
        /*
            r7 = this;
            X.5LT r2 = r7.A04
            if (r2 == 0) goto L_0x00cc
            X.03q r0 = r7.A0Q()
            if (r0 == 0) goto L_0x0015
            X.33i r3 = r7.A01
            android.view.Window r1 = r0.getWindow()
            android.widget.FrameLayout r0 = r2.A09
            X.C107535bT.A00(r0, r1, r3)
        L_0x0015:
            android.view.View r4 = r2.A06
            int r3 = r8.left
            int r1 = r4.getPaddingTop()
            int r0 = r8.right
            X.C86654Ky.A15(r4, r3, r1, r0)
            android.view.View r3 = r2.A01
            int r1 = r8.top
            r0 = 0
            r3.setPadding(r0, r1, r0, r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "SM-G960"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "SM-G955"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "SM-G950"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00f7
            r3 = 1084437299(0x40a33333, float:5.1)
        L_0x0051:
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            r0 = 5
            float r6 = android.util.TypedValue.applyDimension(r0, r3, r1)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            r5 = 2131168303(0x7f070c2f, float:1.7950904E38)
            float r3 = X.C86664Kz.A01(r0, r5)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00e9
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r2.A0F
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x00e9
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            if (r0 == 0) goto L_0x00e9
            int r0 = r0.getSafeInsetTop()
            if (r0 <= 0) goto L_0x00e9
        L_0x0087:
            r6 = 0
        L_0x0088:
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            int r5 = r0.getDimensionPixelSize(r5)
            double r0 = (double) r6
            double r3 = java.lang.Math.ceil(r0)
            int r0 = (int) r3
            int r5 = r5 + r0
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r4 = r2.A0F
            int r3 = r8.left
            int r3 = r3 + r5
            int r1 = r4.getPaddingTop()
            int r0 = r8.right
            int r5 = r5 + r0
            X.C86654Ky.A15(r4, r3, r1, r5)
            android.view.ViewStub r4 = r2.A08
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass001.A0T(r4)
            android.content.res.Configuration r0 = X.C86604Kt.A0A(r7)
            int r1 = r0.orientation
            r0 = 1
            if (r1 != r0) goto L_0x00d1
            android.graphics.Rect r0 = r7.A01
            int r2 = r0.bottom
            android.content.res.Resources r1 = X.C08310eF.A09(r7)
            if (r2 <= 0) goto L_0x00cd
            r0 = 2131165280(0x7f070060, float:1.7944773E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r2 = r2 + r0
        L_0x00c7:
            r3.bottomMargin = r2
            r4.setLayoutParams(r3)
        L_0x00cc:
            return
        L_0x00cd:
            r0 = 2131165278(0x7f07005e, float:1.7944769E38)
            goto L_0x00e1
        L_0x00d1:
            android.content.res.Configuration r0 = X.C86604Kt.A0A(r7)
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L_0x00e6
            android.content.res.Resources r1 = X.C08310eF.A09(r7)
            r0 = 2131165279(0x7f07005f, float:1.794477E38)
        L_0x00e1:
            int r2 = r1.getDimensionPixelOffset(r0)
            goto L_0x00c7
        L_0x00e6:
            int r2 = r3.bottomMargin
            goto L_0x00c7
        L_0x00e9:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r3
            float r0 = r0 * r6
            float r3 = r3 * r3
            float r0 = r0 - r3
            double r0 = (double) r0
            double r3 = java.lang.Math.sqrt(r0)
            float r0 = (float) r3
            float r6 = r6 - r0
            goto L_0x0088
        L_0x00f7:
            java.lang.String r0 = "SM-G965"
            boolean r0 = r1.startsWith(r0)
            r3 = 1085695590(0x40b66666, float:5.7)
            goto L_0x015d
        L_0x0101:
            r3 = 1084856730(0x40a9999a, float:5.3)
            goto L_0x0051
        L_0x0106:
            java.lang.String r0 = "Google"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x011d
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Pixel 2 XL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0154
            r3 = 1082759578(0x4089999a, float:4.3)
            goto L_0x0051
        L_0x011d:
            java.lang.String r0 = "LGE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x015f
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "H87"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = "G600"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = "LS993"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = "AS993"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = "VS998"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x015f
        L_0x014f:
            r3 = 1084919644(0x40aa8f5c, float:5.33)
            goto L_0x0051
        L_0x0154:
            java.lang.String r0 = "Pixel 3"
            boolean r0 = r1.equals(r0)
            r3 = 1082340147(0x40833333, float:4.1)
        L_0x015d:
            if (r0 != 0) goto L_0x0051
        L_0x015f:
            r3 = 0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment.A1N(android.graphics.Rect):void");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        this.A04 = new AnonymousClass5LT(A0R);
        return A0R;
    }

    public void A0e() {
        super.A0e();
        AnonymousClass5U7 r2 = this.A05;
        AnonymousClass66H r1 = this.A07;
        C162457s7.A0J(r1, 0);
        List list = r2.A04;
        if (list != null) {
            list.remove(r1);
        }
    }

    public void A0f() {
        super.A0f();
        AnonymousClass5U7 r2 = this.A05;
        AnonymousClass66H r1 = this.A07;
        C162457s7.A0J(r1, 0);
        List list = r2.A04;
        if (list == null) {
            list = AnonymousClass001.A0s();
            r2.A04 = list;
        }
        list.add(r1);
    }

    public void A0w(Bundle bundle, View view) {
        C003203q A0R = A0R();
        AnonymousClass5LT A0c = C86654Ky.A0c(this);
        C989753y r3 = new C989753y(this, 12);
        ImageView imageView = A0c.A0A;
        C18270x1.A0d(A0R, imageView, this.A02, R.drawable.ic_cam_back);
        imageView.setOnClickListener(r3);
        View view2 = A0c.A03;
        view2.setOnClickListener(new C109735f6(A0R, view2, this.A02, this.A03, this));
    }

    public void A1M(Rect rect) {
        super.A1M(rect);
        A1N(rect);
        Rect rect2 = this.A01;
        Iterator A0v = AnonymousClass001.A0v(((StatusPlaybackContactFragment) this).A0u.A06());
        while (A0v.hasNext()) {
            ((C105285Uh) A0v.next()).A06(rect2);
        }
    }

    public void A1O(boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("playbackFragment/onDragChanged dragging=");
        A0o.append(z);
        C18260x0.A1R(A0o, "; ", this);
    }
}
