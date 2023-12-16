package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.4nX  reason: invalid class name and case insensitive filesystem */
public final class C92894nX extends C93244oC {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final TextView A03 = AnonymousClass002.A09(this, R.id.control_btn);
    public final TextView A04;
    public final TextEmojiLabel A05;
    public final ConversationRowVideo$RowVideoView A06 = ((ConversationRowVideo$RowVideoView) C06560Yg.A02(this, R.id.thumb));
    public final C185528tp A07 = new C100465Ba(this, 5);
    public final AnonymousClass5UY A08;
    public final AnonymousClass5UY A09;

    public void A1H() {
        A00(false);
        A1t(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (r8 <= 500) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(boolean r23) {
        /*
            r22 = this;
            r3 = r22
            X.34x r2 = r3.A0S
            X.1mV r2 = (X.C30471mV) r2
            X.33C r4 = X.C30471mV.A00(r2)
            if (r23 == 0) goto L_0x0015
            android.widget.TextView r1 = r3.A03
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r1.setTag(r0)
        L_0x0015:
            android.widget.TextView r1 = r3.A04
            r7 = 8
            r1.setVisibility(r7)
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r0 = r3.A06
            boolean r5 = r3.A0W
            r0.setKeepRatio(r5)
            boolean r5 = r3.A0W
            r0.setInAlbum(r5)
            boolean r5 = X.C87094Nz.A0h(r3)
            r0.setFullWidth(r5)
            X.1mV r5 = r3.getFMessage()
            java.lang.String r5 = r5.A02
            if (r5 == 0) goto L_0x0040
            int r8 = r5.length()
            r6 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            if (r8 > r6) goto L_0x0041
        L_0x0040:
            r5 = 1
        L_0x0041:
            r0.setPortraitPreviewEnabled(r5)
            X.2z0 r9 = r2.A1J
            X.C107315b6.A08(r0, r9)
            android.widget.TextView r6 = r3.A0K
            java.lang.String r5 = X.C107315b6.A04(r2)
            X.AnonymousClass0YZ.A0F(r6, r5)
            X.5UY r5 = r3.A24
            if (r5 == 0) goto L_0x0067
            android.view.View r8 = r5.A04()
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "view-count-transition-"
            java.lang.String r5 = X.AnonymousClass000.A0P(r9, r5, r6)
            X.AnonymousClass0YZ.A0F(r8, r5)
        L_0x0067:
            android.widget.ImageView r6 = r3.A0G
            if (r6 == 0) goto L_0x0072
            java.lang.String r5 = X.C93244oC.A02(r2)
            X.AnonymousClass0YZ.A0F(r6, r5)
        L_0x0072:
            boolean r5 = r3.A0W
            r11 = 1
            if (r5 == 0) goto L_0x0091
            android.content.Context r5 = r3.getContext()
            float r6 = X.C86604Kt.A00(r5)
            r5 = 1118218923(0x42a6aaab, float:83.333336)
            float r6 = r6 * r5
            int r6 = (int) r6
            int r5 = X.C33141sV.A00(r2, r6)
            if (r5 > 0) goto L_0x008e
            int r5 = r6 * 9
            int r5 = r5 / 16
        L_0x008e:
            r0.A02(r6, r5, r11)
        L_0x0091:
            boolean r5 = X.C87094Nz.A0m(r3)
            r13 = 0
            if (r5 == 0) goto L_0x0159
            r12 = r23 ^ 1
            android.view.View r7 = r3.A01
            X.5UY r9 = r3.A09
            X.5UY r10 = r3.A08
            android.widget.TextView r8 = r3.A03
            r14 = r13
            X.C93244oC.A04(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.setVisibility(r13)
            android.content.Context r6 = r3.getContext()
            r5 = 2131895041(0x7f122301, float:1.9424904E38)
            X.C18300x5.A13(r6, r0, r5)
            r5 = 0
            r0.setOnClickListener(r5)
            X.5ez r5 = r3.A08
            r8.setOnClickListener(r5)
            r9.A07(r5)
        L_0x00bf:
            r3.A1L()
            X.C93314oJ.A0q(r0, r3)
            android.content.Context r5 = r3.getContext()
            X.C626936e.A06(r5)
            android.graphics.drawable.Drawable r5 = X.C106205Ya.A00(r5)
            r0.A09 = r5
            X.1sV r6 = r3.A22
            X.8tp r5 = r3.A07
            r6.A09(r0, r2, r5)
            int r0 = r2.A0B
            if (r0 != 0) goto L_0x00e5
            java.io.File r0 = r4.A0F
            int r0 = X.C107655bf.A0F(r0)
            r2.A0B = r0
        L_0x00e5:
            int r4 = r2.A0B
            X.33j r0 = r3.A0M
            if (r4 == 0) goto L_0x0152
            java.lang.String r0 = X.C107565bW.A0G(r0, r2)
        L_0x00ef:
            r1.setText(r0)
            r1.setVisibility(r13)
            X.34x r5 = r3.A0S
            X.2ld r4 = r3.A1b
            X.1VX r0 = r3.A0O
            boolean r0 = X.C624234y.A00(r0, r4, r5)
            r7 = 2131233079(0x7f080937, float:1.8082285E38)
            if (r0 == 0) goto L_0x0107
            r7 = 2131232299(0x7f08062b, float:1.8080703E38)
        L_0x0107:
            android.content.res.Resources r6 = r3.getResources()
            X.34x r5 = r3.A0S
            X.2ld r4 = r3.A1b
            X.1VX r0 = r3.A0O
            boolean r4 = X.C624234y.A00(r0, r4, r5)
            r0 = 2131166102(0x7f070396, float:1.794644E38)
            if (r4 == 0) goto L_0x011d
            r0 = 2131166040(0x7f070358, float:1.7946314E38)
        L_0x011d:
            int r4 = r6.getDimensionPixelSize(r0)
            int r0 = r1.getPaddingTop()
            X.C86604Kt.A1D(r1, r4, r0)
            X.33j r0 = r3.A0M
            boolean r0 = X.C620733j.A04(r0)
            if (r0 == 0) goto L_0x0149
            r1.setCompoundDrawablesWithIntrinsicBounds(r7, r13, r13, r13)
        L_0x0133:
            android.view.View r4 = r3.A02
            com.whatsapp.TextEmojiLabel r1 = r3.A05
            X.1mV r0 = r3.getFMessage()
            java.lang.String r0 = r0.A1w()
            r3.A25(r4, r1, r0)
            r3.A1n(r2)
            r3.A1l(r2)
            return
        L_0x0149:
            android.graphics.drawable.Drawable r4 = X.C86644Kx.A0C(r3, r7)
            r0 = 0
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r4, r0)
            goto L_0x0133
        L_0x0152:
            long r4 = r2.A00
            java.lang.String r0 = X.AnonymousClass35V.A03(r0, r4)
            goto L_0x00ef
        L_0x0159:
            boolean r5 = X.C87094Nz.A0j(r3)
            if (r5 == 0) goto L_0x01b9
            r0.setVisibility(r13)
            android.view.View r14 = r3.A01
            X.5UY r5 = r3.A09
            X.5UY r8 = r3.A08
            android.widget.TextView r15 = r3.A03
            r19 = r13
            r20 = r13
            r21 = r13
            r17 = r8
            r18 = r13
            r16 = r5
            X.C93244oC.A04(r14, r15, r16, r17, r18, r19, r20, r21)
            r15.setVisibility(r7)
            android.view.View r6 = X.AnonymousClass5UY.A00(r8, r13)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5 = 2131232836(0x7f080844, float:1.8081793E38)
            r6.setImageResource(r5)
            android.view.View r7 = r8.A04()
            android.content.Context r6 = r3.getContext()
            r5 = 2131892617(0x7f121989, float:1.9419987E38)
            X.C18300x5.A13(r6, r7, r5)
            android.content.Context r10 = r3.getContext()
            r9 = 2131895024(0x7f1222f0, float:1.942487E38)
            java.lang.Object[] r7 = new java.lang.Object[r11]
            X.33j r6 = r3.A0M
            int r5 = r2.A0B
            java.lang.String r5 = X.C107565bW.A05(r6, r5, r13)
            r7[r13] = r5
            X.C86624Kv.A0h(r10, r0, r7, r9)
            X.5ez r5 = r3.A0B
            r8.A07(r5)
            r15.setOnClickListener(r5)
            r0.setOnClickListener(r5)
            goto L_0x00bf
        L_0x01b9:
            android.widget.TextView r8 = r3.A03
            X.C87094Nz.A0H(r8, r3, r2)
            r5 = 2131231121(0x7f080191, float:1.8078314E38)
            r8.setCompoundDrawablesWithIntrinsicBounds(r5, r13, r13, r13)
            X.5ez r5 = r3.A09
            r8.setOnClickListener(r5)
            r0.setOnClickListener(r5)
            android.content.Context r6 = r3.getContext()
            r5 = 2131887188(0x7f120454, float:1.9408976E38)
            X.C18300x5.A13(r6, r0, r5)
            r8.setVisibility(r13)
            X.5UY r6 = r3.A08
            r6.A06(r7)
            r12 = r23 ^ 1
            android.view.View r7 = r3.A01
            X.5UY r5 = r3.A09
            r11 = r13
            r9 = r5
            r10 = r6
            r14 = r13
            X.C93244oC.A04(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92894nX.A00(boolean):void");
    }

    public void A0v() {
        if (!this.A00) {
            this.A00 = true;
            C88864av A0C = C87094Nz.A0C(this);
            C64333Db r2 = A0C.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A, r2, A0C, this, C86604Kt.A0i(r2));
            C87094Nz.A0P(A0A, r2, this);
        }
    }

    public int A1A(int i) {
        if (!C86614Ku.A1Z((C30471mV) this.A0S)) {
            return super.A1A(i);
        }
        return 0;
    }

    public void A1N() {
        boolean z;
        if (this.A02 == null || C87094Nz.A0l(this)) {
            C30471mV r6 = (C30471mV) this.A0S;
            AnonymousClass33C A002 = C30471mV.A00(r6);
            if (A002.A0R) {
                int i = 1;
                if (A002.A07 == 1) {
                    this.A0X.A0F(R.string.f11nameremoved, 1);
                    return;
                }
                File file = A002.A0F;
                if (file != null) {
                    z = C18310x6.A0a(Uri.fromFile(file)).exists();
                } else {
                    z = false;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass2z0 A082 = C624134x.A08(r6, "viewmessage/ from_me:", A0o);
                C87094Nz.A0e(A002, r6, A0o, A082.A02);
                if (!z) {
                    Log.w("viewmessage/ no file");
                    C93244oC.A0n(this, A082);
                    return;
                }
                boolean BoA = this.A0n.BoA();
                if (BoA) {
                    i = 3;
                }
                AnonymousClass5P1 r1 = new AnonymousClass5P1(getContext());
                r1.A0A = BoA;
                AnonymousClass5P1.A00(r1, A082);
                r1.A03 = i;
                r1.A09 = AnonymousClass000.A1W(C86634Kw.A0b(this));
                Intent A012 = r1.A01();
                Context context = getContext();
                ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A06;
                C107275b2.A08(context, A012, conversationRowVideo$RowVideoView);
                AnonymousClass5MG.A02(getContext(), getContext(), A012, conversationRowVideo$RowVideoView, A082);
            }
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A00(A1W);
        }
    }

    public C31971pB getFMessage() {
        return (C31971pB) ((C30471mV) this.A0S);
    }

    public int getOutgoingLayoutId() {
        throw AnonymousClass001.A0e("this row type does not support outgoing messages");
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C31971pB);
        super.setFMessage(r2);
    }

    public C92894nX(Context context, AnonymousClass677 r5, C31971pB r6) {
        super(context, r5, r6);
        A0v();
        AnonymousClass5UY A0X = C18290x4.A0X(this, R.id.progress_bar);
        this.A09 = A0X;
        this.A04 = AnonymousClass002.A09(this, R.id.info);
        this.A08 = C18290x4.A0X(this, R.id.cancel_download);
        this.A01 = findViewById(R.id.control_frame);
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.caption);
        this.A05 = A0M;
        AnonymousClass0x2.A14(this.A0O, A0M);
        this.A02 = findViewById(R.id.text_and_date);
        A0X.A09(new AnonymousClass92F(2));
        A00(true);
    }

    public int getMainChildMaxWidth() {
        if (C87094Nz.A0h(this)) {
            return 0;
        }
        return AnonymousClass5YO.A02(this);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
