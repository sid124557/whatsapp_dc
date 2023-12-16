package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass0YY;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5L7;
import X.AnonymousClass5UX;
import X.AnonymousClass5Yj;
import X.AnonymousClass67L;
import X.AnonymousClass91L;
import X.C06560Yg;
import X.C105365Uq;
import X.C106905aM;
import X.C111685iW;
import X.C114015mM;
import X.C116855qy;
import X.C184288rY;
import X.C620633i;
import X.C64773Ex;
import X.C86624Kv;
import X.C86664Kz;
import X.C88864av;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.views.MultiContactThumbnail;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;

public class VoipInCallNotifBanner extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Animator A04;
    public InCallBannerViewModel A05;
    public AnonymousClass5L7 A06;
    public AnonymousClass5UX A07;
    public C64773Ex A08;
    public C184288rY A09;
    public C114015mM A0A;
    public C620633i A0B;
    public AnonymousClass1VX A0C;
    public C116855qy A0D;
    public boolean A0E;
    public final Handler A0F;
    public final ImageView A0G;
    public final TextEmojiLabel A0H;
    public final TextEmojiLabel A0I;
    public final WaImageButton A0J;
    public final MultiContactThumbnail A0K;
    public final VoipCallControlRingingDotsIndicator A0L;
    public final C105365Uq A0M;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r10, X.AnonymousClass5L7 r11) {
        /*
            if (r11 == 0) goto L_0x0111
            android.content.Context r2 = r10.getContext()
            android.animation.Animator r0 = r10.A04
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0015
            android.animation.Animator r0 = r10.A04
            r0.cancel()
        L_0x0015:
            com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator r7 = r10.A0L
            r7.clearAnimation()
            r3 = 8
            r7.setVisibility(r3)
            android.widget.ImageView r8 = r10.A0G
            r5 = 0
            r8.setImageDrawable(r5)
            r8.setVisibility(r3)
            android.widget.ImageView$ScaleType r0 = r11.A02
            r8.setScaleType(r0)
            com.whatsapp.calling.views.MultiContactThumbnail r9 = r10.A0K
            r9.setVisibility(r3)
            X.5L7 r0 = r10.A06
            if (r0 == 0) goto L_0x003c
            int r1 = r11.A00
            int r0 = r0.A00
            if (r1 == r0) goto L_0x0041
        L_0x003c:
            int r0 = r11.A00
            r10.setupBannerBackground(r0)
        L_0x0041:
            X.8oL r0 = r11.A03
            if (r0 == 0) goto L_0x007f
            android.graphics.drawable.Drawable r1 = r0.B79(r2)
        L_0x0049:
            boolean r0 = r11.A09
            r4 = 0
            if (r0 == 0) goto L_0x008c
            java.util.List r6 = r11.A07
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x008c
            X.8rY r0 = r10.A09
            if (r0 == 0) goto L_0x005e
            X.5L7 r0 = r10.A06
            if (r0 != 0) goto L_0x0067
        L_0x005e:
            X.5UX r1 = r10.A07
            X.3Ey r0 = new X.3Ey
            r0.<init>(r1)
            r10.A09 = r0
        L_0x0067:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r6.iterator()
        L_0x006f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0081
            X.4uZ r1 = X.C18300x5.A0P(r6)
            X.3Ex r0 = r10.A08
            X.C86614Ku.A1P(r0, r1, r8)
            goto L_0x006f
        L_0x007f:
            r1 = r5
            goto L_0x0049
        L_0x0081:
            r9.setVisibility(r4)
            X.5Uq r1 = r10.A0M
            X.8rY r0 = r10.A09
            r9.A00(r0, r1, r8)
            goto L_0x0094
        L_0x008c:
            if (r1 == 0) goto L_0x0094
            r8.setImageDrawable(r1)
            r8.setVisibility(r4)
        L_0x0094:
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x00a7
            r7.setVisibility(r4)
            X.6F5 r1 = new X.6F5
            r1.<init>(r7)
            r0 = -1
            r1.setRepeatCount(r0)
            r7.startAnimation(r1)
        L_0x00a7:
            if (r2 == 0) goto L_0x00c9
            com.whatsapp.TextEmojiLabel r1 = r10.A0I
            X.7Qw r0 = r11.A06
            X.C86614Ku.A12(r2, r1, r0)
            X.7Qw r1 = r11.A05
            com.whatsapp.TextEmojiLabel r0 = r10.A0H
            if (r1 == 0) goto L_0x011e
            r0.setVisibility(r4)
            X.C86614Ku.A12(r2, r0, r1)
        L_0x00bc:
            X.7Qw r0 = r11.A04
            if (r0 == 0) goto L_0x00c9
            X.33i r1 = r10.A0B
            java.lang.CharSequence r0 = r0.A00(r2)
            X.C107295b4.A00(r2, r1, r0)
        L_0x00c9:
            int r1 = r11.A01
            r0 = 11
            if (r1 == r0) goto L_0x0119
            r0 = 14
            if (r1 == r0) goto L_0x0119
            r0 = 12
            if (r1 == r0) goto L_0x0119
            r0 = 15
            if (r1 != r0) goto L_0x0116
            X.1VX r1 = r10.A0C
            r0 = 5874(0x16f2, float:8.231E-42)
        L_0x00df:
            long r1 = X.C56952sp.A06(r1, r0)
        L_0x00e3:
            int r0 = r10.getVisibility()
            if (r0 == 0) goto L_0x00f2
            r3 = 3
            X.3Zv r0 = new X.3Zv
            r0.<init>(r10, r1, r3)
            r10.post(r0)
        L_0x00f2:
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x0112
            r3 = 43
            X.5f3 r0 = new X.5f3
            r0.<init>((java.lang.Object) r10, (int) r3, (java.lang.Object) r11)
            r10.setOnClickListener(r0)
        L_0x0100:
            android.os.Handler r0 = r10.A0F
            r0.removeMessages(r4)
            r0.sendEmptyMessageDelayed(r4, r1)
            r10.A06 = r11
            com.whatsapp.WaImageButton r1 = r10.A0J
            r0 = 31
            X.C18300x5.A18(r1, r10, r0)
        L_0x0111:
            return
        L_0x0112:
            r10.setOnClickListener(r5)
            goto L_0x0100
        L_0x0116:
            r1 = 3000(0xbb8, double:1.482E-320)
            goto L_0x00e3
        L_0x0119:
            X.1VX r1 = r10.A0C
            r0 = 4183(0x1057, float:5.862E-42)
            goto L_0x00df
        L_0x011e:
            r0.setVisibility(r3)
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner.A00(com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner, X.5L7):void");
    }

    private void setupBannerBackground(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C86624Kv.A02(this, i));
        gradientDrawable.setCornerRadius(getResources().getDimension(R.dimen.f6nameremoved));
        AnonymousClass0YY.A04(gradientDrawable, this);
    }

    public void A01() {
        this.A0F.removeMessages(0);
        if (getVisibility() != 8) {
            float[] A0T = AnonymousClass4L0.A0T();
            A0T[0] = 0.0f;
            A0T[1] = (float) this.A02;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", A0T);
            this.A04 = ofFloat;
            ofFloat.setDuration(600);
            this.A04.setInterpolator(new DecelerateInterpolator(2.0f));
            AnonymousClass67L.A01(this.A04, this, 7);
            this.A04.start();
        }
        this.A0L.clearAnimation();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0D;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public int getBannerHeight() {
        int i = this.A03;
        if (i != 0) {
            return i;
        }
        int A012 = (AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved) + (AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved) * 2)) - AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved);
        this.A03 = A012;
        return A012;
    }

    public VoipInCallNotifBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0E) {
            this.A0E = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4R(this);
        }
    }

    public VoipInCallNotifBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0E) {
            this.A0E = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4R(this);
        }
        this.A0F = new Handler(new AnonymousClass91L(this, 4));
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        setVisibility(8);
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(this, R.id.title);
        this.A0I = A0K2;
        this.A0H = AnonymousClass0x7.A0K(this, R.id.subtitle);
        this.A0G = AnonymousClass0x9.A0E(this, R.id.leftAddOn);
        this.A0K = (MultiContactThumbnail) C06560Yg.A02(this, R.id.avatar);
        this.A0L = (VoipCallControlRingingDotsIndicator) C06560Yg.A02(this, R.id.ringing_dots);
        this.A0J = C86664Kz.A10(this, R.id.close_button);
        C106905aM.A04(A0K2);
        AnonymousClass5Yj.A0B(context, A0K2, R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A0M = this.A0A.A07("voip-in-call-notif-banner-multi", 0.0f, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        AnonymousClass0YY.A06(this, 4);
    }

    public VoipInCallNotifBanner(Context context) {
        this(context, (AttributeSet) null);
    }
}
