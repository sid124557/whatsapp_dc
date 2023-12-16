package com.whatsapp.search.views.itemviews;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x9;
import X.AnonymousClass4GJ;
import X.C06560Yg;
import X.C100895Cr;
import X.C107335b8;
import X.C107555bV;
import X.C111685iW;
import X.C116855qy;
import X.C18310x6;
import X.C30721mu;
import X.C620733j;
import X.C86604Kt;
import X.C86654Ky;
import X.C88864av;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class VoiceNoteProfileAvatarView extends FrameLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public C620733j A06;
    public WDSButton A07;
    public C116855qy A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public void A03(int i, boolean z, boolean z2, boolean z3) {
        int i2 = 1;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else {
                    throw AnonymousClass000.A0G("Unsupported FastPlaybackPlayerState ", AnonymousClass001.A0o(), i);
                }
            }
        }
        A04(i2, z, z2, z3);
    }

    public void A02() {
        if (!this.A09) {
            this.A09 = true;
            this.A06 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r4.A0B != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(int r18, boolean r19, boolean r20, boolean r21) {
        /*
            r17 = this;
            r4 = r17
            int r0 = r4.A00
            r8 = 1
            r9 = 0
            r5 = r18
            boolean r10 = X.AnonymousClass001.A1X(r5, r0)
            r4.A00 = r5
            if (r20 != 0) goto L_0x0103
            if (r21 == 0) goto L_0x0103
            android.widget.ImageView r3 = r4.A03
        L_0x0014:
            if (r18 == 0) goto L_0x002c
            if (r5 == r8) goto L_0x00db
            r7 = 2
            if (r5 == r7) goto L_0x00eb
            com.whatsapp.wds.components.button.WDSButton r6 = r4.A07
            android.content.Context r2 = r4.getContext()
            r1 = 2131889336(0x7f120cb8, float:1.9413333E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            X.AnonymousClass000.A1P(r0, r7, r9)
            X.AnonymousClass001.A0y(r2, r6, r0, r1)
        L_0x002c:
            android.widget.ImageView r0 = r4.A05
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.A03
            r0.setVisibility(r2)
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0041
            boolean r0 = r4.A0B
            r1 = 1
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A07
            if (r18 != 0) goto L_0x0073
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.A04
            if (r1 != 0) goto L_0x004e
            r2 = 0
        L_0x004e:
            r0.setVisibility(r2)
            r3.setVisibility(r9)
            r4.setClickable(r9)
        L_0x0057:
            if (r19 == 0) goto L_0x0072
            if (r10 == 0) goto L_0x0072
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A07
            if (r18 != 0) goto L_0x0107
            A01(r0)
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x006f
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x006f
            android.widget.ImageView r0 = r4.A04
            A00(r0)
        L_0x006f:
            A00(r3)
        L_0x0072:
            return
        L_0x0073:
            r0.setVisibility(r9)
            android.widget.ImageView r1 = r4.A04
            r0 = 4
            r1.setVisibility(r0)
            r3.setVisibility(r0)
            r4.setClickable(r8)
            if (r21 == 0) goto L_0x00a7
            if (r20 != 0) goto L_0x00c2
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168594(0x7f070d52, float:1.7951494E38)
            int r14 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168591(0x7f070d4f, float:1.7951488E38)
            int r15 = r1.getDimensionPixelSize(r0)
            r13 = 0
            r16 = 0
        L_0x009f:
            X.33j r12 = r4.A06
            com.whatsapp.wds.components.button.WDSButton r11 = r4.A07
            X.C107555bV.A06(r11, r12, r13, r14, r15, r16)
            goto L_0x0057
        L_0x00a7:
            if (r20 != 0) goto L_0x00c2
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168592(0x7f070d50, float:1.795149E38)
            int r15 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168590(0x7f070d4e, float:1.7951486E38)
            int r16 = r1.getDimensionPixelSize(r0)
            r13 = 0
            r14 = 0
            goto L_0x009f
        L_0x00c2:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168593(0x7f070d51, float:1.7951492E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168590(0x7f070d4e, float:1.7951486E38)
            int r16 = r1.getDimensionPixelSize(r0)
            r14 = 0
            r15 = 0
            goto L_0x009f
        L_0x00db:
            com.whatsapp.wds.components.button.WDSButton r7 = r4.A07
            android.content.Context r6 = r4.getContext()
            r2 = 2131889336(0x7f120cb8, float:1.9413333E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x00fc
        L_0x00eb:
            com.whatsapp.wds.components.button.WDSButton r7 = r4.A07
            android.content.Context r6 = r4.getContext()
            r2 = 2131889337(0x7f120cb9, float:1.9413335E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 1069547520(0x3fc00000, float:1.5)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x00fc:
            r1[r9] = r0
            X.AnonymousClass001.A0y(r6, r7, r1, r2)
            goto L_0x002c
        L_0x0103:
            android.widget.ImageView r3 = r4.A05
            goto L_0x0014
        L_0x0107:
            A00(r0)
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0117
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x0117
            android.widget.ImageView r0 = r4.A04
            A01(r0)
        L_0x0117:
            A01(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView.A04(int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r3.A0B != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(boolean r4, int r5) {
        /*
            r3 = this;
            r3.A0A = r4
            android.widget.ImageView r2 = r3.A05
            if (r4 == 0) goto L_0x0020
            r1 = 2131230991(0x7f08010f, float:1.807805E38)
            r2.setImageResource(r1)
            android.widget.ImageView r0 = r3.A03
            r0.setImageResource(r1)
            boolean r0 = r3.A0B
            r1 = 1
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            android.widget.ImageView r0 = r3.A04
            if (r1 != 0) goto L_0x001c
            r5 = 0
        L_0x001c:
            r0.setVisibility(r5)
            return
        L_0x0020:
            r0 = 2131231006(0x7f08011e, float:1.807808E38)
            r2.setImageResource(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView.A06(boolean, int):void");
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A08;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public int getFastPlaybackViewState() {
        return this.A00;
    }

    public ImageView getGroupProfileImageView() {
        return this.A03;
    }

    public ImageView getProfileImageView() {
        return this.A05;
    }

    public void setIconColorTint(int i) {
        C107335b8.A0C(getContext(), this.A04, this.A02, i);
    }

    public void setIsForwardedByNonAuthorPttUi(boolean z) {
        A06(z, 8);
    }

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A02();
    }

    public static final void A00(View view) {
        AlphaAnimation A0H = C86604Kt.A0H();
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(A0H);
        C86604Kt.A1I(animationSet, 250);
        view.startAnimation(animationSet);
    }

    public static final void A01(View view) {
        AlphaAnimation A0G = C86604Kt.A0G();
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(A0G);
        C86604Kt.A1I(animationSet, 250);
        view.startAnimation(animationSet);
    }

    public final void A05(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        View.inflate(context2, R.layout.f8nameremoved, this);
        this.A05 = AnonymousClass0x9.A0E(this, R.id.picture);
        this.A03 = AnonymousClass0x9.A0E(this, R.id.picture_in_group);
        this.A04 = AnonymousClass0x9.A0E(this, R.id.mic_overlay);
        this.A07 = C86654Ky.A0f(this, R.id.fast_playback_overlay);
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C100895Cr.A0B);
            View A022 = C06560Yg.A02(this, R.id.picture_frame);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(7, Integer.MIN_VALUE);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            C107555bV.A07(A022, this.A06, dimensionPixelSize, dimensionPixelSize2, A022.getPaddingRight(), dimensionPixelSize3);
            int i = dimensionPixelSize4;
            int i2 = dimensionPixelSize4;
            int i3 = dimensionPixelSize4;
            C107555bV.A07(this.A05, this.A06, dimensionPixelSize4, i3, i, i2);
            C107555bV.A07(this.A03, this.A06, dimensionPixelSize4, i3, i, i2);
            if (dimensionPixelSize5 != Integer.MIN_VALUE) {
                ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
                layoutParams.height = dimensionPixelSize5;
                layoutParams.width = dimensionPixelSize5;
                this.A05.setLayoutParams(layoutParams);
                this.A03.setLayoutParams(layoutParams);
            }
            this.A02 = R.drawable.mic_played;
            this.A01 = R.drawable.mic_background_incoming;
            this.A04.setBackground(drawable);
            C06560Yg.A0C(colorStateList, this.A04);
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this.A04);
            C620733j r3 = this.A06;
            ImageView imageView = this.A04;
            ImageView imageView2 = imageView;
            C620733j r17 = r3;
            C107555bV.A06(imageView2, r17, dimensionPixelSize6, A0T.topMargin, A0T.rightMargin, dimensionPixelSize7);
        }
    }

    public void setIsNewsletterAudioOrPttUi(C30721mu r10) {
        boolean z = true;
        this.A0C = !r10.A25();
        if (r10.A0z() == null) {
            z = false;
        }
        this.A0B = z;
        ImageView A0F = AnonymousClass0x9.A0F(this, R.id.headphone_overlay);
        if (this.A0C && A0F != null) {
            this.A02 = R.drawable.headphone_played;
            this.A01 = R.drawable.headphone_background_incoming;
            Drawable mutate = C18310x6.A0G(getContext(), this.A01).mutate();
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this.A04);
            C107555bV.A06(A0F, this.A06, A0T.leftMargin, A0T.topMargin, A0T.rightMargin, A0T.bottomMargin);
            C06560Yg.A0C(this.A04.getBackgroundTintList(), A0F);
            A0F.setBackground(mutate);
            A0F.setVisibility(0);
            this.A04.setVisibility(8);
            this.A04 = A0F;
        }
    }

    public void setOnFastPlaybackButtonClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.A07.setOnClickListener(onClickListener);
        if (this.A07.getVisibility() == 8 || this.A07.getVisibility() == 4) {
            setClickable(false);
        }
    }

    public void setupIconBackgroundColor(int i) {
        Context context = getContext();
        Drawable mutate = C18310x6.A0G(context, this.A01).mutate();
        ColorStateList A072 = AnonymousClass0Y8.A07(context, i);
        this.A04.setBackground(mutate);
        C06560Yg.A0C(A072, this.A04);
    }

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0B = false;
        this.A0C = false;
        this.A00 = 0;
        A05(context, attributeSet);
    }

    public VoiceNoteProfileAvatarView(Context context) {
        super(context);
        A02();
        this.A0B = false;
        this.A0C = false;
        this.A00 = 0;
        A05(context, (AttributeSet) null);
    }
}
