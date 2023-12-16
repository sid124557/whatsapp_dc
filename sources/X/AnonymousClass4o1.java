package X;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4o1  reason: invalid class name */
public class AnonymousClass4o1 extends C92624mz {
    public int A00 = 0;
    public MessageCommentsManager A01;
    public C147197De A02 = new C147197De(this);
    public C45852ag A03;
    public C22121Ep A04;
    public C56232re A05;
    public C620133d A06;
    public C104295Qk A07;
    public C55852r1 A08;
    public List A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public final TextView A0C = AnonymousClass002.A09(this, R.id.more);
    public final C185528tp A0D = new C100465Ba(this, 3);
    public final C109665ez A0E = new AnonymousClass54F(this, 32);
    public final C109665ez A0F = new AnonymousClass54F(this, 34);
    public final C109665ez A0G = new AnonymousClass54F(this, 33);
    public final AnonymousClass5UY A0H;
    public final ArrayList A0I;

    public void A1H() {
        A00(false);
        A1t(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01cf, code lost:
        if (r17 == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01db, code lost:
        if ((r4 instanceof X.C31961pA) != false) goto L_0x01dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(boolean r28) {
        /*
            r27 = this;
            r9 = r27
            java.util.List r0 = r9.A09
            if (r0 == 0) goto L_0x04b7
            if (r28 == 0) goto L_0x001a
            X.5UY r1 = r9.A0H
            android.view.View r0 = r1.A01
            if (r0 == 0) goto L_0x001a
            android.view.View r0 = r1.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r1 = r0.A02
            r0 = 0
            r1.setTag(r0)
        L_0x001a:
            java.util.List r0 = r9.A09
            int r1 = r0.size()
            java.util.ArrayList r12 = r9.A0I
            int r0 = r12.size()
            r10 = 1
            r8 = 0
            boolean r17 = X.C86624Kv.A1W(r1, r0)
            r11 = 0
        L_0x002d:
            r7 = 4
            r6 = 3
            if (r11 >= r7) goto L_0x0269
            java.lang.Object r5 = r12.get(r11)
            X.5XD r5 = (X.AnonymousClass5XD) r5
            java.util.List r0 = r9.A09
            java.lang.Object r4 = r0.get(r11)
            X.1mV r4 = (X.C30471mV) r4
            boolean r0 = X.C106215Yb.A02(r4)
            r3 = 2
            if (r0 == 0) goto L_0x0079
            android.widget.ImageView r0 = r5.A01
            if (r0 != 0) goto L_0x0079
            X.4o1 r0 = r5.A09
            android.widget.ImageView r2 = X.C86614Ku.A0H(r0)
            r5.A01 = r2
            r1 = 2131890365(0x7f1210bd, float:1.941542E38)
            int r0 = X.C86624Kv.A01(r0)
            r5.A01(r2, r1, r0)
            android.view.ViewGroup r2 = r5.A05
            android.widget.ImageView r1 = r5.A01
            android.view.View[] r13 = new android.view.View[r7]
            android.widget.ImageView r0 = r5.A03
            r13[r8] = r0
            r13[r10] = r1
            android.widget.ImageView r0 = r5.A02
            r13[r3] = r0
            r0 = 0
            r13[r6] = r0
            int r0 = X.C154307cx.A00(r13, r10)
            r2.addView(r1, r0)
            r2.setClipChildren(r8)
        L_0x0079:
            boolean r0 = X.C106215Yb.A02(r4)
            r1 = 8
            if (r0 == 0) goto L_0x0260
            android.widget.ImageView r13 = r5.A01
            if (r13 == 0) goto L_0x0260
            X.4o1 r0 = r5.A09
            android.content.Context r14 = r0.getContext()
            X.C162457s7.A0J(r14, r8)
            r2 = 2131233001(0x7f0808e9, float:1.8082127E38)
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r14, r2, r0)
            r13.setImageDrawable(r0)
            android.widget.ImageView r0 = r5.A01
            r0.setVisibility(r8)
        L_0x00a0:
            boolean r0 = r4.A1F
            if (r0 == 0) goto L_0x00d7
            android.widget.ImageView r0 = r5.A03
            if (r0 != 0) goto L_0x00d7
            X.4o1 r0 = r5.A09
            android.widget.ImageView r13 = X.C86614Ku.A0H(r0)
            r5.A03 = r13
            r2 = 2131893944(0x7f121eb8, float:1.9422679E38)
            int r0 = X.C86624Kv.A01(r0)
            r5.A01(r13, r2, r0)
            android.view.ViewGroup r13 = r5.A05
            android.widget.ImageView r2 = r5.A03
            android.view.View[] r14 = new android.view.View[r7]
            r14[r8] = r2
            android.widget.ImageView r0 = r5.A01
            r14[r10] = r0
            android.widget.ImageView r0 = r5.A02
            r14[r3] = r0
            r0 = 0
            r14[r6] = r0
            int r0 = X.C154307cx.A00(r14, r8)
            r13.addView(r2, r0)
            r13.setClipChildren(r8)
        L_0x00d7:
            boolean r0 = r4.A1F
            if (r0 == 0) goto L_0x0257
            android.widget.ImageView r13 = r5.A03
            if (r13 == 0) goto L_0x0257
            X.4o1 r0 = r5.A09
            android.content.Context r14 = r0.getContext()
            X.C162457s7.A0J(r14, r8)
            r2 = 2131233137(0x7f080971, float:1.8082403E38)
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r14, r2, r0)
            r13.setImageDrawable(r0)
            android.widget.ImageView r0 = r5.A03
            r0.setVisibility(r8)
        L_0x00fa:
            X.4o1 r2 = r5.A09
            X.2eV r0 = r2.A0R
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0157
            X.1me r0 = r4.A1T
            if (r0 != 0) goto L_0x0253
            r13 = 0
        L_0x0109:
            android.widget.ImageView r0 = r5.A02
            if (r13 != r10) goto L_0x024c
            if (r0 != 0) goto L_0x013c
            android.widget.ImageView r13 = X.C86614Ku.A0H(r2)
            r5.A02 = r13
            r1 = 2131892580(0x7f121964, float:1.9419912E38)
            int r0 = X.C86624Kv.A01(r2)
            r5.A01(r13, r1, r0)
            android.view.ViewGroup r13 = r5.A05
            android.widget.ImageView r1 = r5.A02
            android.view.View[] r14 = new android.view.View[r7]
            android.widget.ImageView r0 = r5.A03
            r14[r8] = r0
            android.widget.ImageView r0 = r5.A01
            r14[r10] = r0
            r14[r3] = r1
            r0 = 0
            r14[r6] = r0
            int r0 = X.C154307cx.A00(r14, r3)
            r13.addView(r1, r0)
            r13.setClipChildren(r8)
        L_0x013c:
            android.widget.ImageView r13 = r5.A02
            android.content.Context r3 = r2.getContext()
            X.C162457s7.A0J(r3, r8)
            r1 = 2131234257(0x7f080dd1, float:1.8084675E38)
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r3, r1, r0)
            r13.setImageDrawable(r0)
            android.widget.ImageView r0 = r5.A02
            r0.setVisibility(r8)
        L_0x0157:
            android.widget.TextView r3 = r5.A08
            java.lang.String r0 = X.C87094Nz.A0F(r2, r4)
            r3.setText(r0)
            r0 = 2131231106(0x7f080182, float:1.8078284E38)
            r2.A1b(r3, r4, r0)
            X.1sV r1 = r2.A22
            android.widget.ImageView r15 = r5.A06
            X.8tp r0 = r2.A0D
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "album-"
            X.2z0 r2 = X.C624134x.A08(r4, r2, r13)
            java.lang.String r22 = X.AnonymousClass000.A0R(r2, r13)
            r23 = 100
            r25 = r8
            r21 = r0
            r24 = r8
            r26 = r10
            r18 = r1
            r19 = r15
            r20 = r4
            r18.A0C(r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r14 = r2.A02
            if (r14 == 0) goto L_0x01b7
            android.widget.ImageView r13 = r5.A07
            if (r13 == 0) goto L_0x01b7
            int r1 = r4.A0D
            r0 = 13
            int r0 = X.AnonymousClass358.A00(r1, r0)
            boolean r16 = X.AnonymousClass001.A1U(r0)
            r0 = 2131233114(0x7f08095a, float:1.8082356E38)
            if (r16 != 0) goto L_0x01b4
            r0 = 5
            int r0 = X.AnonymousClass358.A00(r1, r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x0242
            r0 = 2131233121(0x7f080961, float:1.808237E38)
        L_0x01b4:
            r13.setImageResource(r0)
        L_0x01b7:
            X.C107315b6.A08(r15, r2)
            java.lang.String r0 = X.C107315b6.A04(r4)
            X.AnonymousClass0YZ.A0F(r3, r0)
            android.widget.ImageView r1 = r5.A07
            if (r1 == 0) goto L_0x01cc
            java.lang.String r0 = X.C93244oC.A02(r4)
            X.AnonymousClass0YZ.A0F(r1, r0)
        L_0x01cc:
            if (r11 != r6) goto L_0x01d1
            r3 = 1
            if (r17 != 0) goto L_0x01d2
        L_0x01d1:
            r3 = 0
        L_0x01d2:
            X.33C r1 = r4.A01
            boolean r0 = r4 instanceof X.C31971pB
            if (r0 != 0) goto L_0x01dd
            boolean r0 = r4 instanceof X.C31961pA
            r7 = 0
            if (r0 == 0) goto L_0x01de
        L_0x01dd:
            r7 = 1
        L_0x01de:
            boolean r2 = r4 instanceof X.AnonymousClass1n2
            if (r3 != 0) goto L_0x0207
            if (r1 == 0) goto L_0x0207
            if (r2 == 0) goto L_0x01f9
            X.4o1 r0 = r5.A09
            X.2r1 r6 = r0.A08
            int r3 = r1.A08
            int r1 = r1.A06
            X.7YG r0 = new X.7YG
            r0.<init>(r3, r1)
            boolean r0 = r6.A03(r0, r8)
            if (r0 == 0) goto L_0x0207
        L_0x01f9:
            if (r7 == 0) goto L_0x020b
            X.4o1 r0 = r5.A09
            X.2ld r1 = r0.A1b
            X.1VX r0 = r0.A0O
            boolean r0 = X.C624234y.A00(r0, r1, r4)
            if (r0 != 0) goto L_0x020b
        L_0x0207:
            int r11 = r11 + 1
            goto L_0x002d
        L_0x020b:
            boolean r0 = X.C627636p.A10(r4)
            if (r0 == 0) goto L_0x0207
            X.5UY r3 = r5.A04
            if (r3 == 0) goto L_0x0207
            if (r2 == 0) goto L_0x0227
            X.4o1 r0 = r5.A09
            X.2r1 r0 = r0.A08
            if (r14 == 0) goto L_0x0237
            X.1VX r1 = r0.A02
            r0 = 2653(0xa5d, float:3.718E-42)
            boolean r0 = r1.A0X(r0)
        L_0x0225:
            if (r0 == 0) goto L_0x0207
        L_0x0227:
            X.4o1 r0 = r5.A09
            X.1VX r1 = r0.A0O
            r0 = 4048(0xfd0, float:5.672E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0207
            r3.A06(r8)
            goto L_0x0207
        L_0x0237:
            X.1VX r2 = r0.A02
            r1 = 3116(0xc2c, float:4.366E-42)
            X.2vE r0 = X.C58422vE.A01
            boolean r0 = r2.A0Y(r0, r1)
            goto L_0x0225
        L_0x0242:
            r0 = 2131233146(0x7f08097a, float:1.8082421E38)
            if (r1 != r7) goto L_0x01b4
            r0 = 2131233117(0x7f08095d, float:1.8082362E38)
            goto L_0x01b4
        L_0x024c:
            if (r0 == 0) goto L_0x0157
            r0.setVisibility(r1)
            goto L_0x0157
        L_0x0253:
            int r13 = r0.A00
            goto L_0x0109
        L_0x0257:
            android.widget.ImageView r0 = r5.A03
            if (r0 == 0) goto L_0x00fa
            r0.setVisibility(r1)
            goto L_0x00fa
        L_0x0260:
            android.widget.ImageView r0 = r5.A01
            if (r0 == 0) goto L_0x00a0
            r0.setVisibility(r1)
            goto L_0x00a0
        L_0x0269:
            java.lang.Object r1 = r12.get(r6)
            X.5XD r1 = (X.AnonymousClass5XD) r1
            r3 = 8
            android.widget.TextView r13 = r9.A0C
            if (r17 == 0) goto L_0x0497
            r13.setVisibility(r8)
            android.content.Context r11 = r9.getContext()
            r5 = 2131892620(0x7f12198c, float:1.9419993E38)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.util.List r0 = r9.A09
            int r2 = r0.size()
            int r0 = r12.size()
            int r2 = r2 - r0
            int r0 = r2 + 1
            X.AnonymousClass000.A1P(r4, r0, r8)
            X.AnonymousClass001.A0y(r11, r13, r4, r5)
            android.widget.TextView r0 = r1.A08
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r1.A07
            if (r0 == 0) goto L_0x02a0
            r0.setVisibility(r3)
        L_0x02a0:
            java.util.List r0 = r9.A09
            int r4 = X.AnonymousClass002.A04(r0, r7)
            android.widget.ImageView r2 = r1.A06
            r0 = 2131886304(0x7f1200e0, float:1.9407183E38)
            X.C107295b4.A03(r2, r0)
            X.33j r1 = r9.A0M
            r0 = 2131755241(0x7f1000e9, float:1.9141356E38)
            java.lang.String r0 = X.C86604Kt.A0q(r1, r4, r8, r0)
            r2.setContentDescription(r0)
        L_0x02ba:
            java.util.List r0 = r9.A09
            if (r0 == 0) goto L_0x031d
            java.util.Iterator r1 = r0.iterator()
        L_0x02c2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x031d
            X.1mV r0 = X.C18320x8.A0S(r1)
            X.33C r0 = X.C30471mV.A00(r0)
            boolean r0 = r0.A0c
            if (r0 == 0) goto L_0x02c2
            X.5UY r2 = r9.A0H
            r2.A06(r8)
            r1 = r28 ^ 1
            android.view.View r0 = r2.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.C93244oC.A0o(r0, r10, r1)
            android.view.View r0 = r2.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.5UY r0 = r0.A04
            X.5ez r1 = r9.A0E
            r0.A07(r1)
            android.view.View r0 = r2.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.view.View r0 = r0.A00
            r0.setOnClickListener(r1)
            android.view.View r0 = r2.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.5UY r0 = r0.A05
            r0.A07(r1)
        L_0x0307:
            r9.A1L()
            java.util.List r0 = r9.A09
            X.34x r0 = X.C18320x8.A0R(r0, r8)
            r9.A1n(r0)
            java.util.List r0 = r9.A09
            X.34x r0 = X.C18320x8.A0R(r0, r8)
            r9.A1l(r0)
            return
        L_0x031d:
            java.util.List r0 = r9.A09
            if (r0 == 0) goto L_0x0486
            java.util.Iterator r2 = r0.iterator()
        L_0x0325:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0486
            X.1mV r0 = X.C18320x8.A0S(r2)
            X.33C r1 = X.C30471mV.A00(r0)
            boolean r0 = r9.A26(r0)
            if (r0 != 0) goto L_0x0325
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0325
            X.5UY r3 = r9.A0H
            r3.A06(r8)
            r1 = r28 ^ 1
            android.view.View r0 = r3.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.C93244oC.A0o(r0, r8, r1)
            java.util.List r0 = r9.A09
            java.util.Iterator r7 = r0.iterator()
            r5 = 0
            r4 = 0
        L_0x0355:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0376
            X.1mV r2 = X.C18320x8.A0S(r7)
            X.33C r1 = X.C30471mV.A00(r2)
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0355
            boolean r0 = r1.A0c
            if (r0 != 0) goto L_0x0355
            boolean r0 = X.C383227b.A00(r2)
            if (r0 == 0) goto L_0x0373
            int r4 = r4 + 1
        L_0x0373:
            int r5 = r5 + 1
            goto L_0x0355
        L_0x0376:
            if (r5 == r4) goto L_0x03b8
            android.view.View r0 = r3.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r4 = r3.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r4 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r4
            android.content.Context r1 = r9.getContext()
            r0 = 2131893203(0x7f121bd3, float:1.9421176E38)
            java.lang.String r0 = r1.getString(r0)
            X.5ez r3 = r9.A0G
            r2 = 2131231175(0x7f0801c7, float:1.8078424E38)
            X.C162457s7.A0J(r0, r8)
            X.C162457s7.A0J(r3, r6)
            android.widget.TextView r1 = r4.A02
            r1.setText(r0)
            r0 = 2132083124(0x7f1501b4, float:1.9806381E38)
            X.AnonymousClass0Y9.A06(r1, r0)
            android.widget.ImageView r0 = r4.A01
            r0.setImageResource(r2)
            android.view.View r0 = r4.A00
            r0.setOnClickListener(r3)
            goto L_0x0307
        L_0x03b8:
            r9.A00 = r8
            r9.A0B = r8
            r9.A0A = r8
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.List r0 = r9.A09
            java.util.Iterator r5 = r0.iterator()
            r13 = 0
        L_0x03ca:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0407
            X.1mV r4 = X.C18320x8.A0S(r5)
            X.33C r1 = X.C30471mV.A00(r4)
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x03ca
            boolean r0 = r1.A0c
            if (r0 != 0) goto L_0x03ca
            boolean r0 = r9.A26(r4)
            if (r0 != 0) goto L_0x03ca
            r2.add(r4)
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
            long r0 = r4.A00
            long r13 = r13 + r0
            boolean r1 = r9.A0A
            byte r4 = r4.A1I
            boolean r0 = X.AnonymousClass000.A1U(r4, r10)
            r1 = r1 | r0
            r9.A0A = r1
            boolean r1 = r9.A0B
            boolean r0 = X.AnonymousClass000.A1U(r4, r6)
            r0 = r0 | r1
            r9.A0B = r0
            goto L_0x03ca
        L_0x0407:
            android.view.View r0 = r3.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r0 = r0.A02
            r0.setTag(r2)
            android.view.View r7 = r3.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r7 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r7
            X.5ez r6 = r9.A0F
            java.lang.String r5 = ""
            r4 = 2131231122(0x7f080192, float:1.8078316E38)
            r0 = 3
            X.C162457s7.A0J(r6, r0)
            android.widget.TextView r1 = r7.A02
            r1.setText(r5)
            r0 = 2132083123(0x7f1501b3, float:1.980638E38)
            X.AnonymousClass0Y9.A06(r1, r0)
            android.widget.ImageView r0 = r7.A01
            r0.setImageResource(r4)
            android.view.View r0 = r7.A00
            r0.setOnClickListener(r6)
            android.view.View r0 = r3.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r0 = r0.A02
            r11 = 0
            r10 = r0
            r12 = r2
            r9.A1c(r10, r11, r12, r13)
            int r4 = r9.A00
            if (r4 != 0) goto L_0x0459
            android.view.View r0 = r3.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            android.widget.TextView r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0307
        L_0x0459:
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x0479
            X.33j r2 = r9.A0M
            r1 = 2131755244(0x7f1000ec, float:1.9141362E38)
        L_0x0462:
            java.lang.String r1 = X.C86604Kt.A0q(r2, r4, r8, r1)
            android.view.View r0 = r3.A04()
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.C162457s7.A0J(r1, r8)
            android.widget.TextView r0 = r0.A03
            r0.setText(r1)
            r0.setVisibility(r8)
            goto L_0x0307
        L_0x0479:
            boolean r0 = r9.A0B
            X.33j r2 = r9.A0M
            r1 = 2131755239(0x7f1000e7, float:1.9141352E38)
            if (r0 != 0) goto L_0x0462
            r1 = 2131755241(0x7f1000e9, float:1.9141356E38)
            goto L_0x0462
        L_0x0486:
            X.5UY r1 = r9.A0H
            android.view.View r0 = r1.A01
            if (r0 == 0) goto L_0x0307
            android.view.View r0 = X.AnonymousClass5UY.A00(r1, r3)
            com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView) r0
            X.C93244oC.A0o(r0, r8, r8)
            goto L_0x0307
        L_0x0497:
            r13.setVisibility(r3)
            android.widget.TextView r0 = r1.A08
            r0.setVisibility(r8)
            android.widget.ImageView r0 = r1.A07
            if (r0 == 0) goto L_0x04a6
            r0.setVisibility(r8)
        L_0x04a6:
            android.widget.ImageView r2 = r1.A06
            android.content.Context r1 = r9.getContext()
            r0 = 2131886303(0x7f1200df, float:1.9407181E38)
            X.C18300x5.A13(r1, r2, r0)
            X.C107295b4.A01(r2)
            goto L_0x02ba
        L_0x04b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4o1.A00(boolean):void");
    }

    public void A1L() {
        List list = this.A09;
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            int size = this.A09.size();
            Iterator it = this.A09.iterator();
            int i = 0;
            while (it.hasNext()) {
                C30471mV A0S = C18320x8.A0S(it);
                AnonymousClass33C A002 = C30471mV.A00(A0S);
                if (A002.A0c && !A002.A0a) {
                    int i2 = (int) A002.A0C;
                    AnonymousClass3QO A0a = C86654Ky.A0a(this.A05, A0S);
                    if (A0a != null && A0a.A01().A0J) {
                        i2 /= 2;
                        if (this.A05.A05(A0S)) {
                            i2 += 50;
                        }
                    }
                    i += i2;
                } else if (A002.A0R) {
                    i += 100;
                }
            }
            if (size != 0) {
                int i3 = i / size;
                if (!(i == 0 || i == 100)) {
                    z = false;
                }
                int A22 = A22(i);
                AnonymousClass5UY r1 = this.A0H;
                if (r1.A01 != null) {
                    AnonymousClass5UY r3 = ((ConversationRowMediaControlView) r1.A04()).A05;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(ConversationRowMediaControlView.class.getSimpleName());
                    r3.A0A(new AnonymousClass92B(i3, A22, 0, z), AnonymousClass000.A0X("#updateProgress", A0o));
                }
            }
        }
    }

    public void A1k(C624134x r3) {
        ArrayList arrayList = this.A0I;
        if (arrayList.size() > 0) {
            AnonymousClass5XD.A00((AnonymousClass5XD) AnonymousClass0x9.A0t(arrayList));
        }
    }

    public void A1q(C624134x r2, boolean z) {
        super.A1q(this.A0S, z);
        if (z) {
            A00(false);
        }
    }

    public boolean A21(AnonymousClass2z0 r4) {
        List list = this.A09;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C86614Ku.A0h(it).equals(r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void A24(List list, boolean z) {
        boolean A1W = C18300x5.A1W(this.A0S, list.get(0));
        if (!z) {
            List list2 = this.A09;
            if (list2 != null && list2.size() == list.size()) {
                int i = 0;
                while (true) {
                    if (i < list.size()) {
                        if (this.A09.get(i) != list.get(i)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            z = true;
        }
        this.A09 = list;
        super.A1q(C18320x8.A0R(list, 0), z);
        if (A1W || z) {
            A00(A1W);
        }
    }

    public final Intent A25() {
        C95814uZ r3;
        long[] jArr = new long[this.A09.size()];
        for (int i = 0; i < this.A09.size(); i++) {
            jArr[i] = C18320x8.A0R(this.A09, i).A1L;
        }
        C624134x r1 = this.A0S;
        AnonymousClass2z0 r0 = r1.A1J;
        C95814uZ r4 = r0.A00;
        if (r0.A02) {
            r3 = null;
        } else if (!C627336j.A0K(r4) || (r3 = r1.A0n()) == null) {
            r3 = r4;
        }
        Context context = getContext();
        Intent A072 = C18320x8.A07();
        A072.setClassName(context.getPackageName(), "com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity");
        A072.putExtra("message_ids", jArr);
        C627336j.A0D(A072, r3, "jid");
        C627336j.A0D(A072, r4, "chat_jid");
        return A072;
    }

    public List getAlbumMessages() {
        return this.A09;
    }

    public List getAllMessages() {
        return this.A09;
    }

    public C30471mV getFMessage() {
        return (C30471mV) this.A0S;
    }

    public int getMaxAlbumSize() {
        return 102;
    }

    public C55162pu getMessageCommentInfo() {
        int i;
        List list = this.A09;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            MessageCommentsManager messageCommentsManager = this.A01;
            C162457s7.A0J(A0T, 0);
            messageCommentsManager.A0B.BkM(new C71653cS(messageCommentsManager, A0T));
        }
        List list2 = this.A09;
        C162457s7.A0J(list2, 0);
        Iterator it2 = list2.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            C55162pu A0t = C18300x5.A0T(it2).A0t();
            if (A0t != null) {
                i = A0t.A01();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return new C30221m6((Long) null, (Long) null, i2);
    }

    public int getMessageCount() {
        return C86614Ku.A08(this.A09);
    }

    public AnonymousClass4FP getMessageReactions() {
        C624134x r0;
        long j;
        boolean z;
        boolean z2;
        List list = this.A09;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            C50062hZ r4 = this.A0j;
            if (AnonymousClass3N0.A00(A0T, (byte) 56)) {
                r4.A06.execute(new C71733ca(r4, A0T));
            } else {
                r4.A01(A0T, (Runnable) null, (byte) 56, false, false);
            }
        }
        C56972sr r9 = this.A0Z;
        List list2 = this.A09;
        if (list2.size() > 0 && (r0 = (C624134x) C18290x4.A0k(list2)) != null) {
            AnonymousClass2z0 r1 = r0.A1J;
            C95814uZ r10 = r1.A00;
            if (r10 instanceof C95804uY) {
                C626936e.A06(r1);
                C95804uY r102 = (C95804uY) r10;
                C626936e.A06(r102);
                HashMap A0t = AnonymousClass001.A0t();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    C624134x A0T2 = C18300x5.A0T(it2);
                    AnonymousClass4FP r12 = A0T2.A0L;
                    if (r12 instanceof C64313Cz) {
                        Iterator B4K = ((C64313Cz) r12).B4K();
                        while (B4K.hasNext()) {
                            AnonymousClass1Hp r5 = (AnonymousClass1Hp) B4K.next();
                            String A032 = C107165ao.A03(r5.A02);
                            C626936e.A06(A032);
                            if (A0t.containsKey(A032)) {
                                Object obj = A0t.get(A032);
                                C626936e.A06(obj);
                                AnonymousClass1Hp r02 = (AnonymousClass1Hp) obj;
                                j = r02.A00;
                                z = r02.A01;
                            } else {
                                j = 0;
                                z = false;
                            }
                            long j2 = r5.A00 + j;
                            if (!z) {
                                z2 = false;
                                if (!r5.A01) {
                                    A0t.put(A032, new AnonymousClass1Hp(r9, r102, A032, j2, A0T2.A1L, z2));
                                }
                            }
                            z2 = true;
                            A0t.put(A032, new AnonymousClass1Hp(r9, r102, A032, j2, A0T2.A1L, z2));
                        }
                    }
                }
                return new C64313Cz(AnonymousClass002.A0J(A0t.values()));
            }
        }
        C111495iB r3 = new C111495iB(r9, Collections.emptyList());
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            AnonymousClass4FP r03 = C18300x5.A0T(it3).A0L;
            if (r03 != null) {
                for (C30331mH Awm : r03.B4S()) {
                    r3.Awm(Awm);
                }
            }
        }
        return r3;
    }

    public int getMinAlbumSize() {
        return 4;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30471mV);
        this.A0S = r2;
    }

    public AnonymousClass4o1(Context context, AnonymousClass677 r9, C30471mV r10) {
        super(context, r9, r10);
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0I = A0s;
        boolean z = false;
        A0s.add(new AnonymousClass5XD(C06560Yg.A02(this, R.id.thumb_0), this, 0));
        A0s.add(new AnonymousClass5XD(C06560Yg.A02(this, R.id.thumb_1), this, 1));
        A0s.add(new AnonymousClass5XD(C06560Yg.A02(this, R.id.thumb_2), this, 2));
        A0s.add(new AnonymousClass5XD(C06560Yg.A02(this, R.id.thumb_3), this, 3));
        C626936e.A0D(4 == A0s.size() ? true : z, "wrong number of views");
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(this, R.id.media_control);
        this.A0H = A0M;
        A0M.A09(new AnonymousClass6B6(r10, 0, this));
        A00(true);
    }

    public void A12(AnonymousClass2z0 r4) {
        super.A12(r4);
        List list = this.A09;
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext() && !r4.equals(C86614Ku.A0h(it))) {
                i++;
            }
            Intent A25 = A25();
            if (C107275b2.A00) {
                A25.putExtra("start_index", i);
            }
            C86614Ku.A14(A25, this);
        }
    }

    public boolean A16() {
        return C87094Nz.A0i(this);
    }

    public ReactionsBottomSheetDialogFragment A1D(AnonymousClass4FP r4, C95814uZ r5) {
        C626936e.A06(r5);
        C147197De r2 = this.A02;
        ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = new ReactionsBottomSheetDialogFragment();
        reactionsBottomSheetDialogFragment.A0J = r5;
        reactionsBottomSheetDialogFragment.A07 = r4;
        reactionsBottomSheetDialogFragment.A0P = AnonymousClass000.A1W(r2);
        reactionsBottomSheetDialogFragment.A0D = r2;
        return reactionsBottomSheetDialogFragment;
    }

    public void A1F() {
        if (A1v()) {
            C624134x r0 = this.A0S;
            AnonymousClass677 r2 = this.A0m;
            if (r2 != null) {
                r2.Bpx(r0);
                r2.BnL(this.A09, true);
            }
        }
    }

    public void A1m(C624134x r4) {
        AnonymousClass677 r2;
        if (A1v() && (r2 = this.A0m) != null) {
            boolean z = !r2.BIB(r4);
            r2.BnL(this.A09, z);
            this.A12.setRowSelected(z);
        }
    }

    public final boolean A26(C30471mV r5) {
        AnonymousClass33C A002 = C30471mV.A00(r5);
        if (r5.A1I != 1) {
            return false;
        }
        C55852r1 r1 = this.A08;
        C162457s7.A0J(A002, 0);
        if (!r1.A02(A002, false) || !A002.A03()) {
            return false;
        }
        return true;
    }

    public int getMainChildMaxWidth() {
        if (C87094Nz.A0h(this)) {
            return 0;
        }
        return AnonymousClass5YO.A02(this);
    }

    public int getReactionsViewVerticalOverlap() {
        return getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
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

    public int getTopAttributeTextAnchorId() {
        return R.id.media_container;
    }
}
