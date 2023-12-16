package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;

/* renamed from: X.4o9  reason: invalid class name and case insensitive filesystem */
public class C93214o9 extends C92874nV {
    public C64393Dh A00;
    public C148887Kc A01;
    public AnonymousClass5TR A02;
    public C60132y3 A03;
    public C48132eP A04;
    public AnonymousClass5RW A05;
    public boolean A06;
    public final View A07;
    public final View A08;
    public final FrameLayout A09;
    public final FrameLayout A0A;
    public final ImageView A0B;
    public final TextView A0C = AnonymousClass002.A09(this, R.id.control_btn);
    public final TextView A0D;
    public final TextView A0E;
    public final TextEmojiLabel A0F;
    public final ConversationRowVideo$RowVideoView A0G = ((ConversationRowVideo$RowVideoView) C06560Yg.A02(this, R.id.thumb));
    public final C185528tp A0H = new C100465Ba(this, 10);
    public final C109665ez A0I = new AnonymousClass54F(this, 48);
    public final AnonymousClass5UY A0J;
    public final AnonymousClass5UY A0K;

    public void A1H() {
        A01(false);
        A1t(false);
    }

    public final void A28() {
        FrameLayout A0s;
        TextView textView;
        View view;
        ImageView imageView;
        FrameLayout frameLayout;
        AnonymousClass3LP r1 = this.A1T;
        C31971pB fMessage = getFMessage();
        if (fMessage != null && C57362tW.A00(r1, fMessage.A1J.A00) && this.A0O.A0X(3182) && (A0s = C86664Kz.A0s(this, R.id.video_container)) != null && (textView = this.A0D) != null && (view = this.A07) != null && (imageView = this.A0B) != null && (frameLayout = this.A0A) != null) {
            A0s.setOnClickListener(this.A0B);
            C93314oJ.A0q(A0s, this);
            C69263Wi r6 = this.A0X;
            AnonymousClass5RW r11 = this.A05;
            this.A02 = new AnonymousClass5TR(view, frameLayout, A0s, imageView, textView, r6, this, this.A0G, this.A0M, getFMessage(), r11);
        }
    }

    public final void A2A(boolean z) {
        View view = this.A07;
        AnonymousClass5UY r5 = this.A0K;
        AnonymousClass5UY r6 = this.A0J;
        TextView textView = this.A0C;
        C93244oC.A04(view, textView, r5, r6, true, !z, true, true);
        view.setVisibility(0);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0G;
        conversationRowVideo$RowVideoView.setVisibility(0);
        FrameLayout frameLayout = this.A09;
        frameLayout.setVisibility(0);
        this.A0D.setVisibility(8);
        conversationRowVideo$RowVideoView.setOnClickListener(this.A0B);
        C109665ez r0 = this.A08;
        textView.setOnClickListener(r0);
        r5.A07(r0);
        frameLayout.setOnClickListener(r0);
        C18300x5.A13(conversationRowVideo$RowVideoView.getContext(), conversationRowVideo$RowVideoView, R.string.f11nameremoved);
        AnonymousClass0YY.A06(conversationRowVideo$RowVideoView, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        if (r2 <= 500) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(boolean r26) {
        /*
            r25 = this;
            java.lang.String r0 = "conversationrowvideo/fillView"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r7 = r25
            X.1pB r6 = r7.getFMessage()
            X.33C r9 = X.C30471mV.A00(r6)
            r8 = r26
            if (r26 == 0) goto L_0x002a
            android.widget.TextView r1 = r7.A0C
            java.util.List r0 = java.util.Collections.singletonList(r6)
            r1.setTag(r0)
            X.5TR r1 = r7.A02
            if (r1 == 0) goto L_0x0027
            r0 = 1
            r1.A02(r0)
            r0 = 0
            r7.A02 = r0
        L_0x0027:
            r7.A28()
        L_0x002a:
            android.widget.TextView r5 = r7.A0D
            r4 = 8
            r5.setVisibility(r4)
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r3 = r7.A0G
            boolean r0 = r7.A0W
            r3.setKeepRatio(r0)
            boolean r0 = r7.A0W
            r3.setInAlbum(r0)
            X.679 r1 = r7.A0n
            X.1pB r0 = r7.getFMessage()
            boolean r0 = r1.BHf(r0)
            r3.setFullWidth(r0)
            X.1mV r0 = r7.getFMessage()
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x005b
            int r2 = r0.length()
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 0
            if (r2 > r1) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            r3.setPortraitPreviewEnabled(r0)
            boolean r0 = X.AnonymousClass36V.A06(r6)
            r3.A0F = r0
            if (r0 == 0) goto L_0x0081
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165645(0x7f0701cd, float:1.7945513E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A01 = r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165644(0x7f0701cc, float:1.794551E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A00 = r0
        L_0x0081:
            X.2z0 r0 = r6.A1J
            r24 = r0
            X.C107315b6.A08(r3, r0)
            X.C87094Nz.A0f(r7, r6)
            boolean r0 = r7.A0W
            r11 = 1
            if (r0 == 0) goto L_0x0232
            android.content.Context r0 = r7.getContext()
            float r1 = X.C86604Kt.A00(r0)
            r0 = 1118218923(0x42a6aaab, float:83.333336)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = X.C33141sV.A00(r6, r1)
            if (r0 > 0) goto L_0x00a7
            int r0 = r1 * 9
            int r0 = r0 / 16
        L_0x00a7:
            r3.A02(r1, r0, r11)
            android.widget.ImageView r10 = r7.A0B
            X.5ez r12 = r7.A0B
            r10.setOnClickListener(r12)
            android.widget.FrameLayout r2 = r7.A0A
            r2.setOnClickListener(r12)
            boolean r0 = X.C87094Nz.A0m(r7)
            r1 = 0
            if (r0 == 0) goto L_0x015f
            r7.A2A(r8)
        L_0x00c0:
            X.5UY r0 = r7.A0K
            int r0 = r0.A03()
            if (r0 != r4) goto L_0x00cd
            android.widget.TextView r0 = r7.A0E
            r0.setVisibility(r4)
        L_0x00cd:
            r7.A1L()
            X.1VX r11 = r7.A0O
            r0 = 6944(0x1b20, float:9.73E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x014e
            X.4FS r4 = r7.A25
            r0 = 20
            X.3aK r2 = new X.3aK
            r2.<init>(r7, r9, r6, r0)
            java.lang.String r0 = "frame_visibility_serial_worker"
            r4.BkV(r2, r0)
        L_0x00e8:
            X.C93314oJ.A0q(r3, r7)
            r0 = r24
            boolean r0 = r0.A02
            r3.A0I = r0
            r3.A00()
            X.1sV r0 = r7.A22
            X.C626936e.A06(r0)
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x0146
            if (r26 != 0) goto L_0x0146
            X.1sV r2 = r7.A22
            X.8tp r0 = r7.A0H
            r8 = r2
            r9 = r3
            r10 = r6
            r11 = r0
            r12 = r24
            r13 = r1
            r8.A0D(r9, r10, r11, r12, r13)
        L_0x010d:
            r7.A06 = r1
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0129
            X.33j r4 = r7.A0M
            X.4FS r3 = r7.A25
            X.3Wi r2 = r7.A0X
            X.5bN r0 = new X.5bN
            r0.<init>(r7, r1)
            r8 = r5
            r9 = r2
            r10 = r0
            r11 = r4
            r12 = r6
            r13 = r3
            X.AnonymousClass25Y.A00(r8, r9, r10, r11, r12, r13)
        L_0x0129:
            android.view.View r2 = r7.A08
            com.whatsapp.TextEmojiLabel r1 = r7.A0F
            X.1mV r0 = r7.getFMessage()
            java.lang.String r0 = r0.A1w()
            r7.A25(r2, r1, r0)
            r7.A26(r6)
            boolean r0 = r7.A0W
            if (r0 != 0) goto L_0x0145
            r7.A1n(r6)
            r7.A1l(r6)
        L_0x0145:
            return
        L_0x0146:
            X.1sV r2 = r7.A22
            X.8tp r0 = r7.A0H
            r2.A09(r3, r6, r0)
            goto L_0x010d
        L_0x014e:
            boolean r0 = r7.A2B(r9, r6)
            if (r0 == 0) goto L_0x0158
            r2.setVisibility(r4)
            goto L_0x00e8
        L_0x0158:
            r2.setVisibility(r1)
            r10.setVisibility(r1)
            goto L_0x00e8
        L_0x015f:
            boolean r13 = X.C87094Nz.A0j(r7)
            android.view.View r0 = r7.A07
            r23 = r0
            if (r13 == 0) goto L_0x01b4
            X.5UY r14 = r7.A0K
            X.5UY r0 = r7.A0J
            android.widget.TextView r13 = r7.A0C
            r19 = r1
            r21 = r11
            r22 = r11
            r15 = r23
            r16 = r13
            r17 = r14
            r18 = r0
            r20 = r1
            X.C93244oC.A04(r15, r16, r17, r18, r19, r20, r21, r22)
            r13.setVisibility(r4)
            r3.setVisibility(r1)
            r15.setVisibility(r4)
            r5.setVisibility(r1)
            r13.setOnClickListener(r12)
            r3.setOnClickListener(r12)
            android.widget.FrameLayout r0 = r7.A09
            r0.setVisibility(r4)
            android.content.Context r14 = r3.getContext()
            r13 = 2131895024(0x7f1222f0, float:1.942487E38)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            X.33j r15 = r7.A0M
            int r0 = r6.A0B
            java.lang.String r0 = X.C107565bW.A05(r15, r0, r1)
            r12[r1] = r0
            X.C86624Kv.A0h(r14, r3, r12, r13)
            X.AnonymousClass0YY.A06(r3, r11)
            goto L_0x00c0
        L_0x01b4:
            r0.setVisibility(r1)
            android.widget.TextView r13 = r7.A0C
            r13.setVisibility(r1)
            android.widget.FrameLayout r14 = r7.A09
            r14.setVisibility(r1)
            X.5UY r0 = r7.A0J
            r16 = r0
            r0.A06(r4)
            r5.setVisibility(r4)
            boolean r0 = X.C87094Nz.A0k(r7)
            if (r0 != 0) goto L_0x0208
            r15 = 2131893203(0x7f121bd3, float:1.9421176E38)
            android.content.Context r0 = X.C86654Ky.A0B(r7, r13, r15)
            X.C18300x5.A13(r0, r13, r15)
            r0 = 2131232839(0x7f080847, float:1.8081799E38)
            r13.setCompoundDrawablesWithIntrinsicBounds(r0, r1, r1, r1)
            X.5ez r0 = r7.A0A
            r13.setOnClickListener(r0)
            r14.setOnClickListener(r0)
            r3.setOnClickListener(r12)
            r0 = 0
            r3.setContentDescription(r0)
            r0 = 2
            X.AnonymousClass0YY.A06(r3, r0)
        L_0x01f4:
            r17 = r26 ^ 1
            X.5UY r0 = r7.A0K
            r18 = r11
            r12 = r23
            r14 = r0
            r15 = r16
            r16 = r1
            r19 = r11
            X.C93244oC.A04(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x00c0
        L_0x0208:
            X.C87094Nz.A0H(r13, r7, r6)
            r0 = 2131232831(0x7f08083f, float:1.8081782E38)
            r13.setCompoundDrawablesWithIntrinsicBounds(r0, r1, r1, r1)
            X.5ez r0 = r7.A09
            r13.setOnClickListener(r0)
            r14.setOnClickListener(r0)
            X.5ez r0 = r7.A0I
            r3.setOnClickListener(r0)
            r10.setOnClickListener(r0)
            r2.setOnClickListener(r0)
            android.content.Context r12 = r3.getContext()
            r0 = 2131887188(0x7f120454, float:1.9408976E38)
            X.C18300x5.A13(r12, r3, r0)
            X.AnonymousClass0YY.A06(r3, r11)
            goto L_0x01f4
        L_0x0232:
            int r1 = r9.A08
            int r0 = r9.A06
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93214o9.A01(boolean):void");
    }

    /* access modifiers changed from: private */
    public void setThumbnail(Drawable drawable) {
        this.A0G.setImageDrawable(drawable);
    }

    public void A1q(C624134x r2, boolean z) {
        if (!(r2 instanceof AnonymousClass48R)) {
            boolean A1W = C18300x5.A1W(r2, getFMessage());
            super.A1q(r2, z);
            if (z || A1W) {
                A01(A1W);
            }
        }
    }

    public final void A29() {
        boolean BoA = this.A0n.BoA();
        boolean z = true;
        int A012 = C86654Ky.A01(BoA ? 1 : 0);
        C31971pB fMessage = getFMessage();
        if (fMessage.A09 != 14) {
            z = false;
        }
        AnonymousClass5P1 r1 = new AnonymousClass5P1(getContext());
        r1.A0A = BoA;
        AnonymousClass2z0 r4 = fMessage.A1J;
        AnonymousClass5P1.A00(r1, r4);
        r1.A03 = A012;
        r1.A09 = AnonymousClass000.A1W(C86634Kw.A0b(this));
        r1.A08 = z;
        if (z) {
            r1.A04 = getTempFMessageMediaInfo();
        }
        if (AnonymousClass36V.A06(fMessage)) {
            r1.A02 = AnonymousClass36V.A03(fMessage).intValue();
        }
        Intent A013 = r1.A01();
        Context context = getContext();
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0G;
        C107275b2.A08(context, A013, conversationRowVideo$RowVideoView);
        AnonymousClass5MG.A02(getContext(), getContext(), A013, conversationRowVideo$RowVideoView, r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r6.A1J.A02 != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A2B(X.AnonymousClass33C r5, X.C31971pB r6) {
        /*
            r4 = this;
            X.1VX r1 = r4.A0O
            r0 = 3936(0xf60, float:5.516E-42)
            int r3 = r1.A0N(r0)
            X.2y3 r0 = r4.A03
            r2 = 1
            java.lang.Float r1 = r0.A01(r2)
            X.2ld r0 = r4.A1b
            boolean r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x002f
            if (r1 == 0) goto L_0x002f
            if (r3 < 0) goto L_0x002f
            float r1 = r1.floatValue()
            float r0 = (float) r3
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x002f
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x004b
            X.30d r0 = r6.A1v()
            X.C626936e.A06(r0)
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x004b
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x004b
            java.io.File r0 = r5.A0F
            if (r0 == 0) goto L_0x004e
        L_0x004b:
            if (r1 != 0) goto L_0x004e
            r2 = 0
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93214o9.A2B(X.33C, X.1pB):boolean");
    }

    public C31971pB getFMessage() {
        return (C31971pB) ((C30471mV) this.A0S);
    }

    public int getMainChildMaxWidth() {
        if (this.A0n.BHf(getFMessage())) {
            return 0;
        }
        return AnonymousClass5Y3.A01(this.A0G.A0A);
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C31971pB);
        super.setFMessage(r2);
    }

    public C93214o9(Context context, AnonymousClass677 r5, C31971pB r6) {
        super(context, r5, r6);
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(this, R.id.progress_bar);
        this.A0K = A0M;
        this.A0D = AnonymousClass002.A09(this, R.id.info);
        this.A0A = C86664Kz.A0s(this, R.id.play_frame);
        this.A0B = AnonymousClass0x9.A0F(this, R.id.play_button);
        this.A0J = AnonymousClass0x2.A0M(this, R.id.cancel_download);
        this.A09 = C86664Kz.A0s(this, R.id.invisible_press_surface);
        this.A07 = findViewById(R.id.control_frame);
        this.A08 = findViewById(R.id.text_and_date);
        TextEmojiLabel A0M2 = C86644Kx.A0M(this, R.id.caption);
        this.A0F = A0M2;
        if (A0M2 != null) {
            AnonymousClass0x2.A14(this.A0O, A0M2);
        }
        this.A0E = C18300x5.A0G(this, R.id.media_transfer_eta);
        AnonymousClass5UY.A02(A0M, this, 8);
        A28();
        A01(true);
    }

    public int A1A(int i) {
        if (!C86614Ku.A1Z(getFMessage()) || (getFMessage() instanceof C31941p8)) {
            return super.A1A(i);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1N() {
        /*
            r11 = this;
            super.A1N()
            X.5ZR r0 = r11.A02
            if (r0 == 0) goto L_0x000e
            boolean r0 = X.C87094Nz.A0l(r11)
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            X.1pB r6 = r11.getFMessage()
            X.33C r5 = X.C30471mV.A00(r6)
            int r0 = r5.A07
            r3 = 1
            r2 = 1
            if (r0 != r3) goto L_0x0025
            X.3Wi r1 = r11.A0X
            r0 = 2131889529(0x7f120d79, float:1.9413724E38)
            r1.A0F(r0, r3)
            return
        L_0x0025:
            X.2eP r0 = r11.A04
            X.1I7 r1 = r0.A00(r5)
            X.2z0 r4 = r6.A1J
            boolean r3 = r4.A02
            if (r3 != 0) goto L_0x0044
            boolean r0 = r5.A0c
            if (r0 == 0) goto L_0x003f
            if (r1 == 0) goto L_0x003f
            X.2sU r0 = r1.A0o
            if (r0 == 0) goto L_0x003f
        L_0x003b:
            r11.A29()
            return
        L_0x003f:
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x0088
            return
        L_0x0044:
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x0088
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L_0x0088
            java.lang.String r7 = r5.A0H
            r9 = 0
            if (r7 != 0) goto L_0x005e
            long r0 = r5.A0D
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x0088
            long r0 = r5.A0E
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0088
        L_0x005e:
            long r0 = r5.A0D
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x006a
            long r0 = r5.A0E
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0076
        L_0x006a:
            X.3Dh r0 = r11.A00
            java.io.File r0 = X.C107655bf.A0R(r0, r7)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0088
        L_0x0076:
            boolean r0 = X.C627636p.A0z(r6)
            r1 = 2131887441(0x7f120551, float:1.940949E38)
            if (r0 == 0) goto L_0x0082
            r1 = 2131887442(0x7f120552, float:1.9409491E38)
        L_0x0082:
            X.3Wi r0 = r11.A0X
            r0.A0F(r1, r2)
            return
        L_0x0088:
            java.io.File r0 = r5.A0F
            if (r0 == 0) goto L_0x00af
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.io.File r0 = X.C18310x6.A0a(r0)
            boolean r2 = r0.exists()
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "viewmessage/ from_me:"
            r1.append(r0)
            X.C87094Nz.A0e(r5, r6, r1, r3)
            if (r2 != 0) goto L_0x003b
            java.lang.String r0 = "viewmessage/ no file"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.C93244oC.A0n(r11, r4)
            return
        L_0x00af:
            r2 = 0
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93214o9.A1N():void");
    }

    public void dispatchSetPressed(boolean z) {
        boolean isPressed;
        super.dispatchSetPressed(z);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0G;
        if (conversationRowVideo$RowVideoView != null && conversationRowVideo$RowVideoView.A0J != (isPressed = isPressed())) {
            conversationRowVideo$RowVideoView.A0J = isPressed;
            conversationRowVideo$RowVideoView.A00();
            conversationRowVideo$RowVideoView.invalidate();
        }
    }

    public int getBroadcastDrawableId() {
        C31971pB fMessage = getFMessage();
        if ((fMessage instanceof C31941p8) || !C86614Ku.A1Z(fMessage)) {
            return R.drawable.broadcast_status_icon;
        }
        return R.drawable.broadcast_status_icon_onmedia;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass5TR r0 = this.A02;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass5TR r1 = this.A02;
        if (r1 != null) {
            r1.A02(true);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        AnonymousClass5TR r1 = this.A02;
        if (r1 == null) {
            return;
        }
        if (z) {
            r1.A01();
        } else {
            r1.A02(false);
        }
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
