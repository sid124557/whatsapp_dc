package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.4o3  reason: invalid class name */
public class AnonymousClass4o3 extends AnonymousClass4nT {
    public AnimatorSet A00;
    public AnimatorSet A01;
    public View A02;
    public View A03;
    public FrameLayout A04 = C86664Kz.A0s(this, R.id.hd_invisible_touch);
    public TextView A05 = AnonymousClass002.A09(this, R.id.control_btn);
    public ConstraintLayout A06;
    public TextEmojiLabel A07;
    public WaTextView A08;
    public ConversationRowImage$RowImageView A09 = ((ConversationRowImage$RowImageView) findViewById(R.id.image));
    public C55852r1 A0A;
    public AnonymousClass5UY A0B;
    public AnonymousClass5UY A0C;
    public AnonymousClass5UY A0D;
    public AnonymousClass5UY A0E;
    public AnonymousClass5UY A0F;
    public AnonymousClass5UY A0G;
    public boolean A0H;
    public final C185528tp A0I = new C116385qC(this);

    public void A1H() {
        A1t(false);
        A00(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0107, code lost:
        if (X.C87094Nz.A0j(r1) == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r5 <= 500) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(boolean r23) {
        /*
            r22 = this;
            r1 = r22
            X.1n2 r2 = r1.getFMessage()
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r1.A09
            X.1mV r3 = r1.getFMessage()
            java.lang.String r3 = r3.A02
            if (r3 == 0) goto L_0x0019
            int r5 = r3.length()
            r4 = 500(0x1f4, float:7.0E-43)
            r3 = 0
            if (r5 > r4) goto L_0x001a
        L_0x0019:
            r3 = 1
        L_0x001a:
            r0.setPortraitPreviewEnabled(r3)
            r1.setOverlayType(r2)
            X.33C r3 = r2.A01
            r20 = r3
            r6 = 0
            r3 = 1
            if (r20 != 0) goto L_0x003b
            r0.setImageBitmap(r6)
            r0.A04(r3, r3)
            r0.setOnClickListener(r6)
            android.view.View r2 = r1.A02
            r0 = 4
            r2.setVisibility(r0)
            r1.A28()
        L_0x003a:
            return
        L_0x003b:
            r3 = r23
            if (r23 == 0) goto L_0x0056
            android.widget.TextView r5 = r1.A05
            java.util.List r4 = java.util.Collections.singletonList(r2)
            r5.setTag(r4)
            r0.setImageBitmap(r6)
            com.whatsapp.WaTextView r5 = r1.A08
            if (r5 == 0) goto L_0x0056
            java.util.List r4 = java.util.Collections.singletonList(r2)
            r5.setTag(r4)
        L_0x0056:
            X.33C r5 = new X.33C
            r4 = r20
            r5.<init>(r4)
            r0.setImageData(r5)
            boolean r4 = r1.A0W
            r0.setInAlbum(r4)
            X.679 r5 = r1.A0n
            X.1n2 r4 = r1.getFMessage()
            boolean r4 = r5.BHf(r4)
            r0.setFullWidth(r4)
            boolean r4 = X.AnonymousClass36V.A06(r2)
            r0.A0H = r4
            if (r4 == 0) goto L_0x0094
            android.content.res.Resources r5 = r1.getResources()
            r4 = 2131165645(0x7f0701cd, float:1.7945513E38)
            int r4 = r5.getDimensionPixelSize(r4)
            r0.A01 = r4
            android.content.res.Resources r5 = r1.getResources()
            r4 = 2131165644(0x7f0701cc, float:1.794551E38)
            int r4 = r5.getDimensionPixelSize(r4)
            r0.A00 = r4
        L_0x0094:
            X.2z0 r4 = r2.A1J
            r21 = r4
            X.C107315b6.A08(r0, r4)
            X.C87094Nz.A0f(r1, r2)
            X.C107295b4.A01(r0)
            android.widget.FrameLayout r6 = r1.A04
            if (r6 == 0) goto L_0x034b
            boolean r4 = r1.A2E()
            if (r4 == 0) goto L_0x034b
            X.1n2 r4 = r1.getFMessage()
            X.33C r4 = r4.A01
            if (r4 != 0) goto L_0x0345
            r5 = 0
        L_0x00b4:
            boolean r4 = X.C87094Nz.A0m(r1)
            r9 = 1
            if (r4 == 0) goto L_0x017d
            if (r5 == 0) goto L_0x0179
            X.5UY r7 = r1.A0E
            if (r7 == 0) goto L_0x0103
            r4 = 0
            r6.setVisibility(r4)
            android.view.View r4 = r1.A02
            r5 = 8
            r4.setVisibility(r5)
            android.view.View r4 = r7.A04()
            r4.setVisibility(r5)
            r15 = r23 ^ 1
            androidx.constraintlayout.widget.ConstraintLayout r10 = r1.A06
            X.5UY r12 = r1.A0F
            X.5UY r13 = r1.A0C
            X.5UY r4 = r1.A0D
            android.view.View r11 = r4.A04()
            r17 = r9
            r14 = r9
            r16 = r9
            X.C93244oC.A04(r10, r11, r12, r13, r14, r15, r16, r17)
            android.content.Context r5 = r1.getContext()
            r4 = 2131886303(0x7f1200df, float:1.9407181E38)
            X.C18300x5.A13(r5, r0, r4)
            X.5ez r4 = r1.A0B
            r0.setOnClickListener(r4)
            X.5ez r4 = r1.A08
            r6.setOnClickListener(r4)
            r13.A07(r4)
            r12.A07(r4)
        L_0x0103:
            boolean r4 = X.C87094Nz.A0j(r1)
            if (r4 != 0) goto L_0x010c
        L_0x0109:
            r1.A1L()
        L_0x010c:
            X.C93314oJ.A0q(r0, r1)
            android.view.View r6 = r1.A03
            com.whatsapp.TextEmojiLabel r5 = r1.A07
            X.1mV r4 = r1.getFMessage()
            java.lang.String r4 = r4.A1w()
            r1.A25(r6, r5, r4)
            r4 = r21
            boolean r4 = r4.A02
            r0.setOutgoing(r4)
            r5 = 0
            r0.A0E = r5
            r4 = r20
            r1.setImageViewDimensions(r2, r4)
            X.1sV r4 = r1.A22
            X.C626936e.A06(r4)
            boolean r4 = r1.A0H
            if (r4 != 0) goto L_0x014a
            X.1n2 r4 = r1.getFMessage()
            X.33C r4 = r4.A01
            if (r4 == 0) goto L_0x0171
            boolean r4 = r4.A03()
            if (r4 == 0) goto L_0x0171
            boolean r4 = r1.A2E()
            if (r4 == 0) goto L_0x0171
        L_0x014a:
            if (r23 != 0) goto L_0x0171
            X.1sV r4 = r1.A22
            X.8tp r3 = r1.A0I
            r6 = r4
            r7 = r0
            r8 = r2
            r9 = r3
            r10 = r21
            r11 = r5
            r6.A0D(r7, r8, r9, r10, r11)
        L_0x015a:
            r1.A0H = r5
            r1.A26(r2)
            X.1VX r3 = r1.A0O
            r0 = 3419(0xd5b, float:4.791E-42)
            r3.A0X(r0)
            boolean r0 = r1.A0W
            if (r0 != 0) goto L_0x003a
            r1.A1n(r2)
            r1.A1l(r2)
            return
        L_0x0171:
            X.1sV r4 = r1.A22
            X.8tp r3 = r1.A0I
            r4.A09(r0, r2, r3)
            goto L_0x015a
        L_0x0179:
            r1.A2A(r2, r3, r9)
            goto L_0x0103
        L_0x017d:
            boolean r4 = X.C87094Nz.A0j(r1)
            if (r4 == 0) goto L_0x02d4
            if (r5 == 0) goto L_0x02cf
            X.5UY r5 = r1.A0E
            if (r5 == 0) goto L_0x02a7
            android.view.View r10 = r5.A04()
            X.5UY r4 = r1.A0F
            android.view.View r19 = r4.A04()
            X.5UY r4 = r1.A0C
            android.view.View r18 = r4.A04()
            if (r23 != 0) goto L_0x02bf
            android.view.View r4 = r5.A04()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x01b9
            android.animation.AnimatorSet r4 = r1.A00
            if (r4 == 0) goto L_0x01af
            boolean r4 = r4.isStarted()
            if (r4 != 0) goto L_0x01b9
        L_0x01af:
            android.animation.AnimatorSet r4 = r1.A01
            if (r4 == 0) goto L_0x02bf
            boolean r4 = r4.isStarted()
            if (r4 == 0) goto L_0x02bf
        L_0x01b9:
            r8 = 0
            X.C162457s7.A0J(r10, r8)
            android.animation.AnimatorSet r11 = X.C86664Kz.A0O()
            android.view.animation.AccelerateDecelerateInterpolator r13 = new android.view.animation.AccelerateDecelerateInterpolator
            r13.<init>()
            r4 = 3
            android.animation.Animator[] r12 = new android.animation.Animator[r4]
            android.util.Property r14 = android.view.View.SCALE_X
            X.C162457s7.A0F(r14)
            r7 = 1056964608(0x3f000000, float:0.5)
            r15 = 1065353216(0x3f800000, float:1.0)
            r4 = 200(0xc8, double:9.9E-322)
            float[] r7 = X.C86654Ky.A1b(r7)
            r7[r9] = r15
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r10, r14, r7)
            r7.setInterpolator(r13)
            r7.setDuration(r4)
            r12[r8] = r7
            android.util.Property r8 = android.view.View.SCALE_Y
            X.C162457s7.A0F(r8)
            r7 = 1056964608(0x3f000000, float:0.5)
            float[] r7 = X.C86654Ky.A1b(r7)
            r7[r9] = r15
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r10, r8, r7)
            r7.setInterpolator(r13)
            r7.setDuration(r4)
            r12[r9] = r7
            android.util.Property r8 = android.view.View.ALPHA
            X.C162457s7.A0F(r8)
            r7 = 0
            float[] r7 = X.C86654Ky.A1b(r7)
            r7[r9] = r15
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r10, r8, r7)
            r8.setInterpolator(r13)
            r8.setDuration(r4)
            r7 = 2
            java.util.List r7 = X.AnonymousClass0x9.A19(r8, r12, r7)
            r11.playTogether(r7)
            r7 = 12
            X.AnonymousClass67L.A01(r11, r10, r7)
            androidx.constraintlayout.widget.ConstraintLayout r10 = r1.A06
            r13 = 0
            X.C162457s7.A0J(r10, r13)
            r12 = 3
            r8 = r18
            r7 = r19
            X.C18270x1.A11(r8, r12, r7)
            android.animation.AnimatorSet r8 = X.C86664Kz.A0O()
            android.view.animation.AccelerateDecelerateInterpolator r15 = new android.view.animation.AccelerateDecelerateInterpolator
            r15.<init>()
            android.animation.Animator[] r12 = new android.animation.Animator[r12]
            android.util.Property r17 = android.view.View.SCALE_X
            X.C162457s7.A0F(r14)
            r7 = 1065353216(0x3f800000, float:1.0)
            r16 = 1056964608(0x3f000000, float:0.5)
            float[] r14 = X.C86654Ky.A1b(r7)
            r14[r9] = r16
            r7 = r17
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r10, r7, r14)
            r7.setInterpolator(r15)
            r7.setDuration(r4)
            r12[r13] = r7
            android.util.Property r13 = android.view.View.SCALE_Y
            X.C162457s7.A0F(r13)
            r7 = 1065353216(0x3f800000, float:1.0)
            float[] r7 = X.C86654Ky.A1b(r7)
            r7[r9] = r16
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r10, r13, r7)
            r7.setInterpolator(r15)
            r7.setDuration(r4)
            r12[r9] = r7
            android.util.Property r14 = android.view.View.ALPHA
            X.C162457s7.A0F(r14)
            r7 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            float[] r7 = X.C86654Ky.A1b(r7)
            r7[r9] = r13
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r10, r14, r7)
            r7.setInterpolator(r15)
            r7.setDuration(r4)
            r4 = 2
            java.util.List r4 = X.AnonymousClass0x9.A19(r7, r12, r4)
            r8.playTogether(r4)
            X.67J r4 = new X.67J
            r12 = r4
            r13 = r6
            r14 = r19
            r15 = r11
            r16 = r18
            r17 = r10
            r18 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r8.addListener(r4)
            r8.start()
        L_0x02a7:
            android.content.Context r5 = r1.getContext()
            r4 = 2131886302(0x7f1200de, float:1.940718E38)
            X.C18300x5.A13(r5, r0, r4)
            android.view.View r5 = r1.A02
            r4 = 8
            r5.setVisibility(r4)
            X.5ez r4 = r1.A0B
            r0.setOnClickListener(r4)
            goto L_0x0103
        L_0x02bf:
            r4 = 8
            r6.setVisibility(r4)
            android.content.Context r5 = X.C86634Kw.A0B(r10, r1)
            r4 = 2131886302(0x7f1200de, float:1.940718E38)
            X.C18300x5.A13(r5, r0, r4)
            goto L_0x02a7
        L_0x02cf:
            r1.A2D(r9)
            goto L_0x0103
        L_0x02d4:
            if (r5 == 0) goto L_0x0340
            com.whatsapp.WaTextView r8 = r1.A08
            java.util.List r10 = java.util.Collections.singletonList(r2)
            long r4 = r2.A00
            r7 = 2131888263(0x7f120887, float:1.9411156E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r7 = r1
            r11 = r4
            r7.A1c(r8, r9, r10, r11)
            android.view.View r7 = r1.A02
            int r4 = r7.getVisibility()
            if (r4 != 0) goto L_0x031a
            if (r23 != 0) goto L_0x031a
            r5 = 0
            X.683 r4 = new X.683
            r4.<init>(r1, r5)
            r1.A2C(r4)
        L_0x02fd:
            r4 = 0
            r8.setVisibility(r4)
            X.5ez r4 = r1.A09
            r8.setOnClickListener(r4)
            r6.setOnClickListener(r4)
            X.5ez r4 = r1.A0B
            r0.setOnClickListener(r4)
            android.content.Context r5 = r1.getContext()
            r4 = 2131886303(0x7f1200df, float:1.9407181E38)
            X.C18300x5.A13(r5, r0, r4)
            goto L_0x0103
        L_0x031a:
            X.C626936e.A04(r6)
            r4 = 0
            r6.setVisibility(r4)
            r5 = 8
            r7.setVisibility(r5)
            X.5UY r4 = r1.A0E
            if (r4 == 0) goto L_0x0331
            android.view.View r4 = r4.A04()
            r4.setVisibility(r5)
        L_0x0331:
            r11 = 0
            r12 = r23 ^ 1
            androidx.constraintlayout.widget.ConstraintLayout r7 = r1.A06
            X.5UY r9 = r1.A0F
            X.5UY r10 = r1.A0C
            r13 = 1
            r14 = r13
            X.C93244oC.A04(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x02fd
        L_0x0340:
            r1.A2B(r2, r3, r9)
            goto L_0x0103
        L_0x0345:
            boolean r5 = r4.A03()
            goto L_0x00b4
        L_0x034b:
            boolean r4 = X.C87094Nz.A0m(r1)
            if (r4 == 0) goto L_0x035a
            boolean r4 = r1.A2F()
            r1.A2A(r2, r3, r4)
            goto L_0x0109
        L_0x035a:
            boolean r5 = X.C87094Nz.A0j(r1)
            boolean r4 = r1.A2F()
            if (r5 == 0) goto L_0x0369
            r1.A2D(r4)
            goto L_0x0109
        L_0x0369:
            r1.A2B(r2, r3, r4)
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4o3.A00(boolean):void");
    }

    public void A1q(C624134x r2, boolean z) {
        if (!(r2 instanceof AnonymousClass48R)) {
            boolean A1W = C18300x5.A1W(r2, getFMessage());
            super.A1q(r2, z);
            if (z || A1W) {
                A00(A1W);
            }
        }
    }

    public final void A28() {
        int A0A2 = C86664Kz.A0A(this.A04);
        AnonymousClass5UY r0 = this.A0E;
        if (r0 != null) {
            r0.A06(A0A2);
        }
    }

    public final void A29() {
        C86604Kt.A1A(this.A04);
        AnonymousClass5UY r1 = this.A0E;
        if (r1 != null) {
            r1.A06(0);
            C18300x5.A13(getContext(), this.A09, R.string.f11nameremoved);
        }
    }

    public final void A2A(C624134x r11, boolean z, boolean z2) {
        C109665ez r0;
        View view = this.A02;
        view.setVisibility(0);
        A28();
        AnonymousClass5UY r4 = this.A0G;
        AnonymousClass5UY r5 = this.A0B;
        TextView textView = this.A05;
        C93244oC.A04(view, textView, r4, r5, true, !z, false, false);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        C18300x5.A13(getContext(), conversationRowImage$RowImageView, R.string.f11nameremoved);
        if (r11.A1J.A02) {
            r0 = this.A0B;
        } else {
            r0 = null;
        }
        conversationRowImage$RowImageView.setOnClickListener(r0);
        C109665ez r02 = this.A08;
        textView.setOnClickListener(r02);
        r4.A07(r02);
        if (z2) {
            A29();
        } else {
            C86644Kx.A1P(this.A0E);
        }
    }

    public final void A2B(AnonymousClass1n2 r13, boolean z, boolean z2) {
        View view = this.A02;
        view.setVisibility(0);
        A28();
        AnonymousClass5UY r6 = this.A0G;
        AnonymousClass5UY r7 = this.A0B;
        TextView textView = this.A05;
        C93244oC.A04(view, textView, r6, r7, false, !z, false, false);
        if (!C87094Nz.A0k(this)) {
            textView.setText(R.string.f11nameremoved);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
            textView.setOnClickListener(this.A0A);
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
            conversationRowImage$RowImageView.setOnClickListener(this.A0B);
            C18300x5.A13(getContext(), conversationRowImage$RowImageView, R.string.f11nameremoved);
        } else {
            C87094Nz.A0H(textView, this, r13);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
            C109665ez r0 = this.A09;
            textView.setOnClickListener(r0);
            ConversationRowImage$RowImageView conversationRowImage$RowImageView2 = this.A09;
            conversationRowImage$RowImageView2.setOnClickListener(r0);
            Context context = getContext();
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = textView.getText();
            C86624Kv.A0h(context, conversationRowImage$RowImageView2, A0L, R.string.f11nameremoved);
            C107295b4.A03(conversationRowImage$RowImageView2, R.string.f11nameremoved);
        }
        if (z2) {
            A29();
        } else {
            C86644Kx.A1P(this.A0E);
        }
    }

    public final void A2D(boolean z) {
        View view = this.A02;
        view.setVisibility(8);
        A28();
        AnonymousClass5UY r4 = this.A0G;
        AnonymousClass5UY r5 = this.A0B;
        TextView textView = this.A05;
        C93244oC.A04(view, textView, r4, r5, false, false, false, false);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        C18300x5.A13(getContext(), conversationRowImage$RowImageView, R.string.f11nameremoved);
        C109665ez r0 = this.A0B;
        textView.setOnClickListener(r0);
        conversationRowImage$RowImageView.setOnClickListener(r0);
        if (z) {
            A29();
        } else {
            C86644Kx.A1P(this.A0E);
        }
    }

    public final boolean A2F() {
        AnonymousClass33C r0;
        if (this.A0E == null || (r0 = getFMessage().A01) == null || !this.A0A.A03(new AnonymousClass7YG(r0.A08, r0.A06), false) || !this.A0A.A02.A0X(2653)) {
            return false;
        }
        return true;
    }

    public AnonymousClass1n2 getFMessage() {
        return (AnonymousClass1n2) ((C30471mV) this.A0S);
    }

    public int getMainChildMaxWidth() {
        return AnonymousClass5Y3.A01(this.A09.A09);
    }

    public int getReactionsViewVerticalOverlap() {
        Resources resources;
        int i;
        if (this.A0W) {
            resources = getResources();
            i = R.dimen.f6nameremoved;
        } else if (!C86614Ku.A1Z(getFMessage())) {
            return super.getReactionsViewVerticalOverlap();
        } else {
            resources = getResources();
            i = R.dimen.f6nameremoved;
        }
        return resources.getDimensionPixelOffset(i);
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof AnonymousClass1n2);
        super.setFMessage(r2);
    }

    public final void setImageDrawable(Bitmap bitmap, TransitionDrawable transitionDrawable) {
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (transitionDrawable == null) {
            conversationRowImage$RowImageView.setImageBitmap(bitmap);
        } else {
            conversationRowImage$RowImageView.setImageDrawable(transitionDrawable);
        }
    }

    public final void setImageViewDimensions(AnonymousClass1n2 r4, AnonymousClass33C r5) {
        ConversationRowImage$RowImageView conversationRowImage$RowImageView;
        ImageView.ScaleType scaleType;
        int i;
        int i2 = r5.A08;
        if (i2 == 0 || (i = r5.A06) == 0) {
            int i3 = 100;
            int A002 = C33141sV.A00(r4, 100);
            if (A002 > 0) {
                conversationRowImage$RowImageView = this.A09;
            } else {
                i3 = (int) (C86604Kt.A00(getContext()) * 83.333336f);
                conversationRowImage$RowImageView = this.A09;
                A002 = (i3 * 9) / 16;
            }
            conversationRowImage$RowImageView.A04(i3, A002);
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            conversationRowImage$RowImageView = this.A09;
            conversationRowImage$RowImageView.A04(i2, i);
            if (!this.A0W && !(this instanceof AnonymousClass4o2)) {
                scaleType = ImageView.ScaleType.MATRIX;
            }
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        conversationRowImage$RowImageView.setScaleType(scaleType);
    }

    public AnonymousClass4o3(Context context, AnonymousClass677 r5, AnonymousClass1n2 r6) {
        super(context, r5, r6);
        View findViewById = findViewById(R.id.hd_icon);
        if (findViewById != null) {
            this.A0E = new AnonymousClass5UY(findViewById);
        }
        if (this.A04 != null) {
            this.A06 = (ConstraintLayout) C06560Yg.A02(this, R.id.hd_control_frame);
            AnonymousClass5UY A0X = C18290x4.A0X(this, R.id.hd_control_btn);
            this.A0D = A0X;
            this.A08 = (WaTextView) A0X.A04();
            this.A0F = C18290x4.A0X(this, R.id.hd_progress_bar);
            this.A0C = C18290x4.A0X(this, R.id.hd_cancel_download);
            AnonymousClass5UY.A02(this.A0F, this, 6);
        }
        AnonymousClass5UY A0X2 = C18290x4.A0X(this, R.id.progress_bar);
        this.A0G = A0X2;
        A0X2.A09(new AnonymousClass92F(1));
        this.A0B = C18290x4.A0X(this, R.id.cancel_download);
        this.A02 = findViewById(R.id.control_frame);
        this.A03 = findViewById(R.id.text_and_date);
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.caption);
        this.A07 = A0M;
        if (A0M != null) {
            AnonymousClass0x2.A14(this.A0O, A0M);
            this.A07.setAutoLinkMask(0);
            this.A07.setLinksClickable(false);
            this.A07.setFocusable(false);
            this.A07.setClickable(false);
            this.A07.setLongClickable(false);
        }
        A00(true);
    }

    private void setOverlayType(AnonymousClass1n2 r3) {
        C996457l r0;
        boolean A1Z = C86614Ku.A1Z(r3);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (!A1Z) {
            r0 = C996457l.NONE;
        } else if (AnonymousClass2z0.A0C(r3)) {
            r0 = C996457l.BOTTOM;
        } else {
            r0 = C996457l.CORNER;
        }
        conversationRowImage$RowImageView.A08 = r0;
    }

    public int A1A(int i) {
        if (!C86614Ku.A1Z(getFMessage()) || (getFMessage() instanceof AnonymousClass1n1)) {
            return super.A1A(i);
        }
        return 0;
    }

    public void A1N() {
        super.A1N();
        if (this.A02 == null || C87094Nz.A0l(this)) {
            AnonymousClass1n2 fMessage = getFMessage();
            AnonymousClass33C A002 = C30471mV.A00(fMessage);
            boolean z = false;
            C162457s7.A0J(A002, 0);
            boolean A032 = A002.A03();
            AnonymousClass2z0 r4 = fMessage.A1J;
            boolean z2 = r4.A02;
            if (z2 || A002.A0R || A032) {
                File file = A002.A0F;
                boolean z3 = false;
                if (file != null) {
                    z = C18310x6.A0a(Uri.fromFile(file)).exists();
                } else if (z2 && !A002.A0Q) {
                    this.A0X.A0H(R.string.f11nameremoved, 0);
                    return;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("viewmessage/ from_me:");
                C87094Nz.A0e(A002, fMessage, A0o, z2);
                if (!z) {
                    Log.w("viewmessage/ no file");
                    C93244oC.A0n(this, r4);
                    return;
                }
                boolean BoA = this.A0n.BoA();
                if (getFMessage().A09 == 14) {
                    z3 = true;
                }
                AnonymousClass5P1 r1 = new AnonymousClass5P1(getContext());
                r1.A0A = BoA;
                AnonymousClass5P1.A00(r1, r4);
                r1.A09 = AnonymousClass000.A1W(C86634Kw.A0b(this));
                r1.A00 = 33;
                r1.A08 = z3;
                if (z3) {
                    r1.A04 = getTempFMessageMediaInfo();
                }
                if (AnonymousClass36V.A06(fMessage)) {
                    r1.A02 = AnonymousClass36V.A03(fMessage).intValue();
                }
                Intent A012 = r1.A01();
                Context context = getContext();
                ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
                C107275b2.A08(context, A012, conversationRowImage$RowImageView);
                AnonymousClass5MG.A02(getContext(), getContext(), A012, conversationRowImage$RowImageView, r4);
            }
        }
    }

    public final void A2C(C185528tp r7) {
        AnonymousClass1n2 fMessage = getFMessage();
        this.A0H = true;
        C33141sV r0 = this.A22;
        C626936e.A06(r0);
        r0.A0D(this.A09, fMessage, r7, fMessage.A1J, false);
    }

    public final boolean A2E() {
        AnonymousClass33C r0 = getFMessage().A01;
        if (r0 == null || !this.A0A.A03(new AnonymousClass7YG(r0.A08, r0.A06), false) || !this.A0A.A02.A0Y(C58422vE.A01, 3116)) {
            return false;
        }
        return true;
    }

    public void dispatchSetPressed(boolean z) {
        boolean isPressed;
        super.dispatchSetPressed(z);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (conversationRowImage$RowImageView != null && conversationRowImage$RowImageView.A0J != (isPressed = isPressed())) {
            conversationRowImage$RowImageView.A0J = isPressed;
            conversationRowImage$RowImageView.A02();
            conversationRowImage$RowImageView.invalidate();
        }
    }

    public int getBroadcastDrawableId() {
        AnonymousClass1n2 fMessage = getFMessage();
        if ((fMessage instanceof AnonymousClass1n1) || !C86614Ku.A1Z(fMessage)) {
            return R.drawable.broadcast_status_icon;
        }
        return R.drawable.broadcast_status_icon_onmedia;
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
