package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass0YG;
import X.AnonymousClass0x7;
import X.AnonymousClass4GJ;
import X.AnonymousClass5R6;
import X.C06560Yg;
import X.C107295b4;
import X.C109695f2;
import X.C111685iW;
import X.C116855qy;
import X.C1230867b;
import X.C131666dx;
import X.C147227Dh;
import X.C149407Mi;
import X.C18280x3;
import X.C620733j;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88864av;
import X.C93314oJ;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class InteractiveButtonsRowContentLayout extends LinearLayout implements AnonymousClass4GJ {
    public AnonymousClass5R6 A00;
    public C620733j A01;
    public C116855qy A02;
    public boolean A03;
    public boolean A04;
    public final LinearLayout.LayoutParams A05;
    public final LinearLayout.LayoutParams A06;
    public final LinearLayout A07;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0086 A[LOOP:1: B:8:0x0084->B:9:0x0086, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C93314oJ r21, java.util.List r22, int r23) {
        /*
            r20 = this;
            r6 = r22
            int r0 = r6.size()
            r1 = r23
            int r5 = java.lang.Math.min(r0, r1)
            int r8 = r6.size()
            r11 = r20
            android.util.DisplayMetrics r1 = X.C86614Ku.A0E(r11)
            r4 = 1
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            int r7 = (int) r0
            android.content.Context r1 = r11.getContext()
            r0 = 2132083354(0x7f15029a, float:1.9806848E38)
            X.00m r3 = new X.00m
            r3.<init>((android.content.Context) r1, (int) r0)
            r14 = r21
            if (r8 <= r4) goto L_0x00aa
            java.util.Iterator r10 = r6.iterator()
        L_0x0032:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r1 = r10.next()
            X.7Mi r1 = (X.C149407Mi) r1
            r0 = 0
            com.whatsapp.TextEmojiLabel r9 = new com.whatsapp.TextEmojiLabel
            r9.<init>(r3, r0)
            float r0 = r14.getTextFontSize()
            r9.setTextSize(r0)
            java.lang.String r0 = r1.A02
            r9.setText(r0)
            r9.setDrawingCacheEnabled(r4)
            r2 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r9.measure(r0, r0)
            int r1 = r9.getMeasuredWidth()
            int r0 = r9.getMeasuredHeight()
            r9.layout(r2, r2, r1, r0)
            int r2 = r9.getMeasuredWidth()
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131166033(0x7f070351, float:1.79463E38)
            int r1 = X.AnonymousClass4L0.A01(r1, r0)
            int r1 = r1 / r8
            int r0 = r7 * r8
            int r1 = r1 - r0
            if (r2 <= r1) goto L_0x0032
        L_0x007b:
            android.widget.LinearLayout r3 = r11.A07
            r3.setOrientation(r4)
            r3.removeAllViews()
            r2 = 0
        L_0x0084:
            if (r2 >= r5) goto L_0x00b8
            java.lang.Object r15 = r6.get(r2)
            X.7Mi r15 = (X.C149407Mi) r15
            r18 = 1
            r19 = 0
            android.content.Context r1 = r11.getContext()
            r0 = 2131100206(0x7f06022e, float:1.7812787E38)
            android.content.res.ColorStateList r12 = X.AnonymousClass0Y8.A07(r1, r0)
            r13 = r12
            r17 = r4
            r16 = r2
            android.view.View r0 = r11.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            r3.addView(r0)
            int r2 = r2 + 1
            goto L_0x0084
        L_0x00aa:
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x00b6
            int r1 = r6.size()
            r0 = 2
            if (r1 < r0) goto L_0x00b6
            goto L_0x007b
        L_0x00b6:
            r4 = 0
            goto L_0x007b
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A01(X.4oJ, java.util.List, int):void");
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public InteractiveButtonsRowContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            this.A01 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    private void setButtonTextLeftAligned(TextEmojiLabel textEmojiLabel) {
        FrameLayout.LayoutParams A0r = C86664Kz.A0r(textEmojiLabel);
        A0r.gravity = 19;
        textEmojiLabel.setLayoutParams(A0r);
        textEmojiLabel.setGravity(19);
    }

    public final View A00(ColorStateList colorStateList, ColorStateList colorStateList2, C93314oJ r13, C149407Mi r14, int i, boolean z, boolean z2, boolean z3) {
        View inflate = C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, false);
        LinearLayout A0N = C86654Ky.A0N(inflate, R.id.button_root_layout);
        View A022 = C06560Yg.A02(inflate, R.id.button_container);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(inflate, R.id.button_content);
        View A023 = C06560Yg.A02(inflate, R.id.button_div_horizontal);
        View A024 = C06560Yg.A02(inflate, R.id.button_div_vertical);
        if (z3 && (A0K.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            setButtonTextLeftAligned(A0K);
        }
        setButtonText(r14, A0K, r13, colorStateList);
        int i2 = r14.A00;
        if (i2 != -1) {
            Drawable A0G = C86634Kw.A0G(C86644Kx.A0C(this, i2));
            AnonymousClass0YG.A01(colorStateList2, A0G);
            A0K.A0G(new C131666dx(A0G, this.A01));
        }
        A0K.measure(0, 0);
        if (r14.A03) {
            A022.setClickable(false);
        } else {
            A022.setClickable(true);
            C109695f2.A00(A022, r14, i, 6);
        }
        AnonymousClass5R6 r8 = this.A00;
        if (r8 != null && i == 0) {
            r8.A01 = new C147227Dh(A022);
            if (r8.A01()) {
                A022.setVisibility(8);
            }
        }
        A022.setContentDescription(r14.A02);
        C107295b4.A02(A022);
        A022.setLongClickable(true);
        C06560Yg.A0O(A022, new C1230867b(r14, 0, this));
        if (z) {
            A0N.setOrientation(1);
            A0N.setLayoutParams(this.A06);
            if (i > 0 && z2) {
                A023.setVisibility(0);
            }
        } else {
            A0N.setOrientation(0);
            A0N.setLayoutParams(this.A05);
            if (i > 0 && z2) {
                A024.setVisibility(0);
                return inflate;
            }
        }
        return inflate;
    }

    public final void setButtonText(C149407Mi r2, TextEmojiLabel textEmojiLabel, C93314oJ r4, ColorStateList colorStateList) {
        textEmojiLabel.setTextSize(r4.getTextFontSize());
        textEmojiLabel.setText(r2.A02);
        textEmojiLabel.setSelected(r2.A03);
        if (colorStateList != null) {
            textEmojiLabel.setTextColor(colorStateList);
        }
    }

    public void setDisplayButtonsInVertical(boolean z) {
        this.A03 = z;
    }

    public InteractiveButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            this.A01 = C88864av.A02((C111685iW) generatedComponent());
        }
        this.A05 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        this.A06 = new LinearLayout.LayoutParams(-1, -2);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A07 = C86654Ky.A0N(this, R.id.buttons_container);
    }

    public InteractiveButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
