package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.PeerAvatarLayout;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4mK  reason: invalid class name and case insensitive filesystem */
public final class C92244mK extends C117035rH {
    public int A00;
    public View A01;
    public AnimationSet A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public PeerAvatarLayout A06;
    public C50392i6 A07;
    public AnonymousClass3ZF A08;
    public CallState A09;
    public WDSButton A0A;
    public boolean A0B;
    public final ViewGroup A0C;
    public final C56972sr A0D;
    public final AnonymousClass49P A0E;
    public final C1230066r A0F;
    public final C64773Ex A0G;
    public final AnonymousClass5ZU A0H;
    public final AnonymousClass3ZH A0I;
    public final AnonymousClass1VX A0J;
    public final AnonymousClass4FS A0K;
    public final C185958uW A0L = new C1237769s(this, 3);
    public final C97094xc A0M;
    public final AnonymousClass66R A0N = C154517dI.A01(AnonymousClass8XR.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92244mK(ViewGroup viewGroup, C56972sr r4, AnonymousClass49P r5, C1230066r r6, C64773Ex r7, AnonymousClass5ZU r8, AnonymousClass67A r9, AnonymousClass3ZH r10, AnonymousClass1VX r11, AnonymousClass4FS r12, C97094xc r13, int i) {
        super(r9, 2);
        C162457s7.A0J(r11, 1);
        C162457s7.A0J(r4, 2);
        C18260x0.A0b(r12, r7, r8, 3);
        C18260x0.A0g(r6, r5, r13, r9, r10);
        C162457s7.A0J(viewGroup, 11);
        this.A0J = r11;
        this.A0D = r4;
        this.A0K = r12;
        this.A0G = r7;
        this.A0H = r8;
        this.A0F = r6;
        this.A0E = r5;
        this.A0M = r13;
        this.A0I = r10;
        this.A0C = viewGroup;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r15.size() <= 8) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View r12, X.C92244mK r13, X.AnonymousClass3ZF r14, java.util.ArrayList r15) {
        /*
            r7 = 0
            r8 = 1
            r2 = 2
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.1VX r1 = r13.A0J
            r0 = 5722(0x165a, float:8.018E-42)
            boolean r11 = r1.A0X(r0)
            r4 = 8
            if (r11 == 0) goto L_0x001a
            int r0 = r15.size()
            r10 = 1
            if (r0 > r4) goto L_0x001b
        L_0x001a:
            r10 = 0
        L_0x001b:
            r9 = 5
            if (r11 == 0) goto L_0x004f
            r1 = 8
            if (r10 == 0) goto L_0x0023
            r1 = 5
        L_0x0023:
            int r0 = r15.size()
            if (r0 <= r1) goto L_0x002a
            r0 = r1
        L_0x002a:
            java.util.List r0 = r15.subList(r7, r0)
            X.C162457s7.A0D(r0)
            java.util.ArrayList r5 = X.C73783g4.A0c(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0039:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0051
            X.3ZH r1 = X.C18310x6.A0R(r3)
            X.C162457s7.A0H(r1)
            X.8FP r0 = new X.8FP
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x0039
        L_0x004f:
            r1 = 3
            goto L_0x0023
        L_0x0051:
            r6.addAll(r5)
            if (r10 == 0) goto L_0x006e
            java.lang.Object[] r1 = new java.lang.Object[r8]
            int r0 = X.AnonymousClass0x9.A03(r15, r9)
            X.AnonymousClass000.A1P(r1, r0, r7)
            r0 = 2131892301(0x7f12184d, float:1.9419346E38)
            X.6pW r1 = X.AnonymousClass4L0.A0N(r1, r0)
            X.8FQ r0 = new X.8FQ
            r0.<init>(r1)
            r6.add(r0)
        L_0x006e:
            if (r11 == 0) goto L_0x00a9
            com.whatsapp.WaTextView r3 = r13.A05
            if (r3 == 0) goto L_0x008c
            android.content.res.Resources r1 = X.C18290x4.A0G(r12)
            r0 = 2131166865(0x7f070691, float:1.7947987E38)
            float r0 = X.C86664Kz.A01(r1, r0)
            r3.setTextSize(r7, r0)
            int r0 = r14.A0H
            if (r0 != r2) goto L_0x009e
            r1 = 2131895182(0x7f12238e, float:1.942519E38)
        L_0x0089:
            r3.setText(r1)
        L_0x008c:
            com.whatsapp.WaTextView r0 = r13.A04
            if (r0 == 0) goto L_0x0093
            r0.setVisibility(r4)
        L_0x0093:
            com.whatsapp.calling.PeerAvatarLayout r0 = r13.A06
            if (r0 == 0) goto L_0x009a
            r0.A14(r6)
        L_0x009a:
            r13.A08()
            return
        L_0x009e:
            boolean r0 = r14.A0L
            r1 = 2131886482(0x7f120192, float:1.9407544E38)
            if (r0 == 0) goto L_0x0089
            r1 = 2131895016(0x7f1222e8, float:1.9424853E38)
            goto L_0x0089
        L_0x00a9:
            com.whatsapp.WaTextView r9 = r13.A05
            if (r9 == 0) goto L_0x00d9
            android.content.res.Resources r1 = X.C18290x4.A0G(r12)
            r0 = 2131166864(0x7f070690, float:1.7947985E38)
            float r0 = X.C86664Kz.A01(r1, r0)
            r9.setTextSize(r7, r0)
            android.content.res.Resources r5 = X.C18290x4.A0G(r12)
            r4 = 2131755182(0x7f1000ae, float:1.9141236E38)
            int r3 = r15.size()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.5ZU r1 = r13.A0H
            X.3ZH r0 = r13.A0I
            X.C18300x5.A1E(r1, r0, r2, r7)
            int r0 = r15.size()
            X.AnonymousClass000.A1P(r2, r0, r8)
            X.C86614Ku.A16(r5, r9, r2, r4, r3)
        L_0x00d9:
            com.whatsapp.WaTextView r0 = r13.A04
            if (r0 == 0) goto L_0x00e0
            r0.setVisibility(r7)
        L_0x00e0:
            android.content.Context r0 = X.C18290x4.A0F(r12)
            r13.A0B(r0, r7)
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92244mK.A00(android.view.View, X.4mK, X.3ZF, java.util.ArrayList):void");
    }

    public final void A09() {
        AnimationSet animationSet = this.A02;
        if (animationSet != null) {
            animationSet.cancel();
            this.A02 = null;
            WaImageView waImageView = this.A03;
            if (waImageView != null) {
                waImageView.clearAnimation();
                waImageView.setScaleX(1.0f);
                waImageView.setScaleY(1.0f);
                waImageView.setAlpha(0.75f);
            }
        }
    }

    public final void A0A() {
        if (this.A07 == null && this.A08 == null) {
            A05(false);
        } else if (this.A01 == null) {
            A03();
        } else {
            this.A0K.BkP(C117085rM.A00(this, 16));
        }
    }

    public final void A0B(Context context, boolean z) {
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            ViewGroup.LayoutParams layoutParams = waTextView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                int i = dimensionPixelSize;
                if (z) {
                    i = 0;
                }
                marginLayoutParams.setMargins(i, 0, dimensionPixelSize, 0);
                waTextView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw AnonymousClass001.A0g("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r12.A0I.A0s != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r12 = this;
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.wds.components.button.WDSButton r2 = r12.A0A
            if (r2 == 0) goto L_0x0023
            boolean r0 = r12.A0B
            if (r0 != 0) goto L_0x001f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0018
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x0018
            X.2i6 r0 = r12.A07
            if (r0 == 0) goto L_0x001f
        L_0x0018:
            X.3ZH r0 = r12.A0I
            boolean r1 = r0.A0s
            r0 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r2.setEnabled(r0)
        L_0x0023:
            android.view.View r0 = r12.A01
            r8 = 1
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.isShown()
            if (r0 != r8) goto L_0x00ad
            com.whatsapp.wds.components.button.WDSButton r0 = r12.A0A
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.isEnabled()
            if (r0 != r8) goto L_0x00ad
            android.view.animation.AnimationSet r0 = r12.A02
            if (r0 != 0) goto L_0x00aa
            com.whatsapp.WaImageView r3 = r12.A03
            if (r3 == 0) goto L_0x00aa
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            if (r0 != 0) goto L_0x0051
            com.whatsapp.wds.components.button.WDSButton r0 = r12.A0A
            if (r0 == 0) goto L_0x00ab
            android.graphics.drawable.Drawable r0 = r0.getBackground()
        L_0x004e:
            r3.setImageDrawable(r0)
        L_0x0051:
            android.view.animation.AnimationSet r2 = r12.A02
            if (r2 != 0) goto L_0x00a3
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168263(0x7f070c07, float:1.7950823E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r7 = (float) r0
            float r5 = X.AnonymousClass001.A04(r3, r7)
            float r5 = r5 + r4
            float r0 = X.C86664Kz.A02(r3)
            float r7 = r7 / r0
            float r7 = r7 + r4
            r9 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r3 = new android.view.animation.ScaleAnimation
            r6 = r4
            r10 = r8
            r11 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = -1
            r3.setRepeatCount(r2)
            r1 = 1061158912(0x3f400000, float:0.75)
            r0 = 0
            android.view.animation.AlphaAnimation r0 = X.AnonymousClass4L0.A0C(r1, r0)
            r0.setRepeatCount(r2)
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r8)
            r2.addAnimation(r3)
            r2.addAnimation(r0)
            r2.setRepeatMode(r8)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.setDuration(r0)
            r12.A02 = r2
        L_0x00a3:
            com.whatsapp.WaImageView r0 = r12.A03
            if (r0 == 0) goto L_0x00aa
            r0.startAnimation(r2)
        L_0x00aa:
            return
        L_0x00ab:
            r0 = 0
            goto L_0x004e
        L_0x00ad:
            r12.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92244mK.A08():void");
    }
}
