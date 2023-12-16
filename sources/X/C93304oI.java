package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;

/* renamed from: X.4oI  reason: invalid class name and case insensitive filesystem */
public class C93304oI extends C92454mi {
    public int A00;
    public ViewGroup A01 = C86644Kx.A0I(this, R.id.main_layout);
    public TextView A02;
    public C116985rC A03;
    public AnonymousClass7CY A04;
    public TextEmojiLabel A05;
    public TextEmojiLabel A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public TextAndDateLayout A09;
    public AnonymousClass7KZ A0A;
    public C100285Ah A0B;
    public C106055Xl A0C;
    public AnonymousClass5PP A0D;
    public C28891hw A0E;
    public AnonymousClass36Y A0F;
    public C66503Lr A0G;
    public C56072rN A0H;
    public AnonymousClass66v A0I;

    public void A22() {
        this.A00 = 0;
        C30481mW r2 = (C30481mW) this.A0S;
        String messageText = getMessageText();
        A1n(r2);
        A1l(r2);
        A23(r2);
        TextEmojiLabel textEmojiLabel = this.A05;
        setMessageText(messageText, textEmojiLabel, r2);
        textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        textEmojiLabel.clearAnimation();
        Integer A002 = AnonymousClass5Vc.A00(messageText);
        if (A002 != null) {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(A002.intValue(), 0, 0, 0);
            C86634Kw.A1I(textEmojiLabel);
            A00(textEmojiLabel);
        }
        String str = AnonymousClass32K.A00(this.A0O, this.A1Z, r2).A02;
        if (str != null) {
            this.A0F.A0K(str);
            this.A0F.A0J(str);
            AnonymousClass7KZ r0 = this.A0A;
            C162457s7.A0J(r2, 0);
            r0.A02.A0X(3544);
            this.A0A.A02.A0X(3545);
        }
    }

    private TextView getActionButtonView() {
        View view = this.A06;
        if (view == null) {
            return null;
        }
        return AnonymousClass002.A09(view, R.id.action_btn);
    }

    private String getMessageText() {
        String A13 = this.A0S.A13();
        if (A13 == null) {
            return "";
        }
        return A13;
    }

    public void A1q(C624134x r3, boolean z) {
        boolean A1W = C18300x5.A1W(r3, this.A0S);
        super.A1q(r3, z);
        if (z || A1W) {
            A22();
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A05;
        if (textEmojiLabel.getAnimation() == null && AnonymousClass5Vc.A00(getMessageText()) != null) {
            A00(textEmojiLabel);
        }
        C624134x r1 = this.A0S;
        if (r1.A0l != null && this.A0n.BHf(r1)) {
            A23((C30481mW) this.A0S);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f9, code lost:
        if (r17 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021c, code lost:
        if (r11.A0O.A0X(4860) == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        if (r2.A04 == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r6.A0X(1961) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
        if (r15 != false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r11.A0D.A00(r0) != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ca, code lost:
        if (r1 == false) goto L_0x01cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A23(X.C30481mW r21) {
        /*
            r20 = this;
            r11 = r20
            boolean r2 = r11.A24()
            r1 = 2131434886(0x7f0b1d86, float:1.8491599E38)
            r0 = r21
            if (r2 == 0) goto L_0x01fd
            android.view.ViewGroup r2 = X.C86644Kx.A0I(r11, r1)
            r1 = 0
            r2.setVisibility(r1)
            X.2U8 r1 = r0.A0c
            if (r1 == 0) goto L_0x0023
            X.5PP r1 = r11.A0D
            boolean r1 = r1.A00(r0)
            r17 = 0
            if (r1 == 0) goto L_0x0025
        L_0x0023:
            r17 = 1
        L_0x0025:
            X.5PP r1 = r11.A0D
            boolean r18 = r1.A01(r0)
            X.5Xl r1 = r11.A0C
            if (r1 != 0) goto L_0x0071
            android.content.Context r8 = r11.getContext()
            X.679 r12 = r11.A0n
            X.4Fm r9 = r11.A0Y
            X.2rN r15 = r11.A0H
            X.5nM r13 = r11.A1M
            X.1sV r4 = r11.A22
            X.5KC r10 = r11.A1B()
            X.5rC r3 = r11.A03
            boolean r1 = r3.A07()
            if (r1 == 0) goto L_0x004c
            r3.A04()
        L_0x004c:
            X.1VX r14 = r11.A0O
            X.5Xl r7 = new X.5Xl
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r11.A0C = r7
            int r3 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            r7.A00 = r3
            r7.A01 = r1
            X.5Xl r1 = r11.A0C
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r1.A0D
            X.C86624Kv.A15(r1, r2)
            X.5Xl r1 = r11.A0C
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r1.A0D
            X.C93314oJ.A0q(r1, r11)
        L_0x0071:
            X.1VX r2 = r11.A0O
            X.5Zz r1 = r11.A1Z
            X.32K r2 = X.AnonymousClass32K.A00(r2, r1, r0)
            X.66v r3 = r11.A0I
            boolean r1 = r3 instanceof X.C116505qO
            if (r1 == 0) goto L_0x0085
            boolean r1 = r2.A04
            r16 = 1
            if (r1 != 0) goto L_0x0087
        L_0x0085:
            r16 = 0
        L_0x0087:
            r4 = 72
            if (r16 == 0) goto L_0x008d
            r11.A00 = r4
        L_0x008d:
            r7 = 1
            if (r16 == 0) goto L_0x00a8
            java.lang.String r1 = r0.A13()
            X.1VX r6 = r11.A0O
            int r5 = X.AnonymousClass5VB.A00(r1)
            r1 = 90
            if (r5 >= r1) goto L_0x00a8
            r1 = 1961(0x7a9, float:2.748E-42)
            boolean r1 = r6.A0X(r1)
            r19 = 1
            if (r1 != 0) goto L_0x00aa
        L_0x00a8:
            r19 = 0
        L_0x00aa:
            X.1sV r1 = r11.A22
            boolean r1 = X.C57132t9.A01(r0, r1, r7)
            if (r1 == 0) goto L_0x00d4
            X.2qb r6 = r0.A0l
            if (r6 == 0) goto L_0x01f1
            android.content.Context r1 = r11.getContext()
            int r1 = X.AnonymousClass5YO.A00(r1)
            if (r19 == 0) goto L_0x01ea
            X.6hb r5 = new X.6hb
            r5.<init>(r1)
        L_0x00c5:
            int r4 = r6.A01
            int r1 = r6.A00
            r5.A06(r4, r1)
            boolean r1 = r5 instanceof X.C93944pb
            if (r1 == 0) goto L_0x01d1
            r4 = 72
        L_0x00d2:
            r11.A00 = r4
        L_0x00d4:
            X.5Xl r12 = r11.A0C
            r14 = r3
            r15 = r2
            r13 = r0
            r12.A04(r13, r14, r15, r16, r17, r18, r19)
            X.2mS r1 = r0.A0z()
            if (r1 == 0) goto L_0x00ec
            X.1VX r3 = r11.A0O
            r1 = 4860(0x12fc, float:6.81E-42)
            boolean r1 = r3.A0X(r1)
            if (r1 != 0) goto L_0x0156
        L_0x00ec:
            java.lang.String r6 = r2.A03
            boolean r10 = X.AnonymousClass5VE.A01(r6)
            X.36Y r3 = r11.A0F
            java.lang.String r1 = r2.A02
            boolean r9 = r3.A0J(r1)
            X.36Y r5 = r11.A0F
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r8 = 0
            if (r1 != 0) goto L_0x0111
            android.net.Uri r4 = android.net.Uri.parse(r6)
            r3 = 13
            r1 = 0
            int r1 = r5.A0B(r4, r1)
            if (r3 != r1) goto L_0x0111
            r8 = 1
        L_0x0111:
            X.36Y r1 = r11.A0F
            boolean r7 = r1.A0I(r6)
            X.36Y r1 = r11.A0F
            X.5Y8 r3 = r1.A08
            android.net.Uri r1 = android.net.Uri.parse(r6)
            boolean r15 = r3.A05(r1)
            r5 = 0
            if (r10 != 0) goto L_0x012f
            if (r9 != 0) goto L_0x012f
            if (r8 != 0) goto L_0x012f
            if (r7 != 0) goto L_0x012f
            r4 = 0
            if (r15 == 0) goto L_0x0148
        L_0x012f:
            r4 = 1
            if (r10 == 0) goto L_0x0175
            X.2rN r3 = r11.A0H
            int r1 = r0.A00
            boolean r3 = r3.A03(r1)
            X.2z0 r1 = r0.A1J
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x016c
            r5 = 2131895064(0x7f122318, float:1.942495E38)
            if (r3 == 0) goto L_0x0148
            r5 = 2131895127(0x7f122357, float:1.9425078E38)
        L_0x0148:
            android.view.ViewGroup r3 = r11.A01
            r14 = 14
            X.3cR r1 = new X.3cR
            r10 = r1
            r12 = r2
            r10.<init>(r11, r12, r13, r14, r15)
            r11.A1Z(r3, r1, r5, r4)
        L_0x0156:
            boolean r0 = X.C87094Nz.A0h(r11)
            if (r0 == 0) goto L_0x016b
            android.view.ViewGroup r0 = r11.A01
            r11.setViewToMatchParent(r0)
            com.whatsapp.components.TextAndDateLayout r0 = r11.A09
            r11.setViewToMatchParent(r0)
            com.whatsapp.components.TextAndDateLayout r1 = r11.A09
            r0 = 1
            r1.A07 = r0
        L_0x016b:
            return
        L_0x016c:
            r5 = 2131890329(0x7f121099, float:1.9415347E38)
            if (r3 == 0) goto L_0x0148
            r5 = 2131890333(0x7f12109d, float:1.9415355E38)
            goto L_0x0148
        L_0x0175:
            if (r9 == 0) goto L_0x017b
            r5 = 2131895048(0x7f122308, float:1.9424918E38)
            goto L_0x0148
        L_0x017b:
            if (r8 == 0) goto L_0x0181
            r5 = 2131895130(0x7f12235a, float:1.9425084E38)
            goto L_0x0148
        L_0x0181:
            if (r7 == 0) goto L_0x0187
            r5 = 2131887249(0x7f120491, float:1.94091E38)
            goto L_0x0148
        L_0x0187:
            if (r15 == 0) goto L_0x0148
            X.36Y r1 = r11.A0F
            X.5Y8 r5 = r1.A08
            android.net.Uri r3 = android.net.Uri.parse(r6)
            java.lang.String r1 = "create"
            boolean r1 = r5.A09(r3, r1)
            if (r1 == 0) goto L_0x019d
            r5 = 2131895792(0x7f1225f0, float:1.9426427E38)
            goto L_0x0148
        L_0x019d:
            X.36Y r1 = r11.A0F
            X.5Y8 r5 = r1.A08
            android.net.Uri r3 = android.net.Uri.parse(r6)
            java.lang.String r1 = "directory"
            boolean r1 = r5.A09(r3, r1)
            if (r1 == 0) goto L_0x01b1
            r5 = 2131889363(0x7f120cd3, float:1.9413387E38)
            goto L_0x0148
        L_0x01b1:
            X.36Y r1 = r11.A0F
            X.5Y8 r3 = r1.A08
            android.net.Uri r1 = android.net.Uri.parse(r6)
            java.lang.Long r1 = r3.A01(r1)
            if (r1 == 0) goto L_0x01cc
            X.1VX r3 = r11.A0O
            r1 = 5188(0x1444, float:7.27E-42)
            boolean r1 = r3.A0X(r1)
            r5 = 2131895132(0x7f12235c, float:1.9425088E38)
            if (r1 != 0) goto L_0x0148
        L_0x01cc:
            r5 = 2131895075(0x7f122323, float:1.9424973E38)
            goto L_0x0148
        L_0x01d1:
            boolean r1 = r5 instanceof X.C94014pi
            if (r1 == 0) goto L_0x01e6
            X.4pi r5 = (X.C94014pi) r5
            boolean r1 = r5.A07()
            if (r1 == 0) goto L_0x01e3
            X.5NR r1 = r5.A01
        L_0x01df:
            int r4 = r1.A02
            goto L_0x00d2
        L_0x01e3:
            X.5NR r1 = r5.A00
            goto L_0x01df
        L_0x01e6:
            r4 = 100
            goto L_0x00d2
        L_0x01ea:
            X.4ph r5 = new X.4ph
            r5.<init>(r1)
            goto L_0x00c5
        L_0x01f1:
            X.2U8 r1 = r0.A0c
            if (r1 == 0) goto L_0x00d4
            byte[] r1 = r1.A0F
            if (r1 == 0) goto L_0x00d4
            if (r17 == 0) goto L_0x00d4
            goto L_0x00d2
        L_0x01fd:
            android.view.ViewGroup r3 = X.C86644Kx.A0J(r11, r1)
            X.5Xl r1 = r11.A0C
            r4 = 0
            if (r1 == 0) goto L_0x020d
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r1.A0D
            r3.removeView(r1)
            r11.A0C = r4
        L_0x020d:
            X.2mS r1 = r0.A0z()
            if (r1 == 0) goto L_0x021e
            X.1VX r2 = r11.A0O
            r1 = 4860(0x12fc, float:6.81E-42)
            boolean r1 = r2.A0X(r1)
            r2 = 1
            if (r1 != 0) goto L_0x021f
        L_0x021e:
            r2 = 0
        L_0x021f:
            android.view.View r1 = r11.A06
            if (r1 == 0) goto L_0x023d
            if (r2 != 0) goto L_0x023d
            X.2kg r1 = r0.A0s()
            boolean r1 = r11.A1z(r1)
            if (r1 == 0) goto L_0x0306
            byte r2 = r0.A1I
            r1 = 1
            if (r2 == 0) goto L_0x023d
            if (r2 == r1) goto L_0x023d
            r1 = 9
            if (r2 == r1) goto L_0x023d
            r1 = 3
            if (r2 != r1) goto L_0x0306
        L_0x023d:
            r1 = 8
            r3.setVisibility(r1)
            X.1VX r2 = r11.A0O
            r1 = 2446(0x98e, float:3.428E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x0156
            r1 = 2131432827(0x7f0b157b, float:1.8487422E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86644Kx.A0M(r11, r1)
            r11.A08 = r1
            r1 = 2131432813(0x7f0b156d, float:1.8487394E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r11, r1)
            r11.A02 = r1
            r1 = 2131432824(0x7f0b1578, float:1.8487416E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86644Kx.A0M(r11, r1)
            r11.A07 = r1
            r1 = 2131432825(0x7f0b1579, float:1.8487418E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86644Kx.A0M(r11, r1)
            r11.A06 = r1
            X.34x r3 = r0.A0w()
            if (r3 == 0) goto L_0x0156
            boolean r1 = r3 instanceof X.C30941nT
            if (r1 == 0) goto L_0x0156
            X.1nT r3 = (X.C30941nT) r3
            X.2z0 r1 = r3.A1J
            X.4uZ r2 = r1.A00
            X.2z0 r1 = r0.A1J
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x0156
            boolean r1 = X.C627336j.A0K(r2)
            if (r1 == 0) goto L_0x0156
            java.lang.String r1 = r3.A01
            X.1fJ r1 = X.AnonymousClass34R.A04(r1)
            if (r1 == 0) goto L_0x0156
            X.34x r1 = r0.A0w()
            X.2z0 r1 = r1.A1J
            X.4uZ r1 = r1.A00
            X.1fJ r3 = X.AnonymousClass34R.A03(r1)
            com.whatsapp.TextEmojiLabel r2 = r11.A08
            if (r2 == 0) goto L_0x02d3
            android.widget.TextView r1 = r11.A02
            if (r1 == 0) goto L_0x02d3
            com.whatsapp.TextEmojiLabel r1 = r11.A07
            if (r1 == 0) goto L_0x02d3
            com.whatsapp.TextEmojiLabel r1 = r11.A06
            if (r1 == 0) goto L_0x02d3
            X.2ss r1 = r11.A0N
            java.lang.String r1 = r1.A0D(r3)
            r2.setText(r1)
            android.widget.TextView r1 = r11.A02
            r2 = 8
            r1.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r1 = r11.A07
            r1.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r2 = r11.A06
            r1 = 0
            r2.setVisibility(r1)
            com.whatsapp.TextEmojiLabel r2 = r11.A06
            r1 = 2131886466(0x7f120182, float:1.9407512E38)
            r2.setText(r1)
        L_0x02d3:
            android.view.View r1 = r11.A06
            if (r1 != 0) goto L_0x02eb
            android.view.ViewGroup r4 = r11.A01
            if (r4 == 0) goto L_0x02eb
            android.view.LayoutInflater r2 = X.C18280x3.A0D(r11)
            r1 = 2131623984(0x7f0e0030, float:1.8875135E38)
            android.view.View r1 = X.C86604Kt.A0F(r2, r1)
            r11.A06 = r1
            X.C86624Kv.A15(r1, r4)
        L_0x02eb:
            android.widget.TextView r4 = r11.getActionButtonView()
            if (r4 == 0) goto L_0x0156
            android.view.View r2 = r11.A06
            if (r2 == 0) goto L_0x0156
            r1 = 0
            r2.setVisibility(r1)
            r1 = 2131886464(0x7f120180, float:1.9407508E38)
            r4.setText(r1)
            r1 = 14
            X.AnonymousClass547.A00(r4, r3, r11, r0, r1)
            goto L_0x0156
        L_0x0306:
            android.view.ViewGroup r2 = r11.A01
            android.view.View r1 = r11.A06
            r2.removeView(r1)
            r11.A06 = r4
            goto L_0x023d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93304oI.A23(X.1mW):void");
    }

    public final boolean A24() {
        AnonymousClass1VX r5 = this.A0O;
        C56972sr r1 = this.A0Z;
        C56982ss r3 = this.A0N;
        C106685Zz r0 = this.A1Z;
        C56572sD r8 = this.A1y;
        C64773Ex r2 = this.A0t;
        C66493Lq r6 = this.A1V;
        C66473Lo r4 = this.A1H;
        C624134x r7 = this.A0S;
        if ((TextUtils.isEmpty(AnonymousClass32K.A00(r5, r0, r7).A03) || !C107315b6.A0A(r1, r2, r3, r4, r5, r6, r7, r8)) && this.A0S.A0c == null) {
            return false;
        }
        return true;
    }

    public C30481mW getFMessage() {
        return (C30481mW) this.A0S;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void setFMessage(C624134x r4) {
        C626936e.A0F(r4 instanceof C30481mW, AnonymousClass000.A0P(r4, "Expected a message of type FMessageText but instead found ", AnonymousClass001.A0o()));
        this.A0S = r4;
    }

    public C93304oI(Context context, AnonymousClass677 r5, C30481mW r6) {
        super(context, r5, r6);
        AnonymousClass66v A012 = C107315b6.A01(context);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(this, R.id.message_text);
        this.A05 = A0K;
        AnonymousClass0x2.A14(this.A0O, A0K);
        this.A05.setAutoLinkMask(0);
        this.A05.setLinksClickable(false);
        this.A05.setFocusable(false);
        this.A05.setClickable(false);
        this.A05.setLongClickable(false);
        this.A09 = (TextAndDateLayout) C06560Yg.A02(this, R.id.conversation_text_row);
        this.A0I = A012;
        A22();
    }

    public static void A00(View view) {
        ScaleAnimation A0Q = C86634Kw.A0Q(0.85f, 0.8f);
        A0Q.setInterpolator(new DecelerateInterpolator());
        A0Q.setDuration(500);
        A0Q.setRepeatMode(2);
        A0Q.setRepeatCount(-1);
        A0Q.setFillBefore(true);
        A0Q.setFillAfter(true);
        view.startAnimation(A0Q);
    }

    private void setViewToMatchParent(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public void A1H() {
        A22();
        A1t(false);
    }

    public void A1O(int i) {
        super.A1O(i);
        if (this.A0S.A0w() == null && !A24()) {
            if (A1y(this.A1T, this.A0S, i, this.A0W)) {
                C86624Kv.A0r(this.A05);
                return;
            }
            TextAndDateLayout textAndDateLayout = this.A09;
            C86634Kw.A1B(this.A09, textAndDateLayout, textAndDateLayout.getPaddingLeft(), C18290x4.A0G(this).getDimensionPixelOffset(R.dimen.f6nameremoved), this.A09.getPaddingRight());
        }
    }

    public void A1i(C624134x r2) {
        super.A1i(r2);
        A1j(r2);
        if (this.A09 == null) {
            this.A09 = (TextAndDateLayout) C06560Yg.A02(this, R.id.conversation_text_row);
        }
    }

    public int getMainChildMaxWidth() {
        if (C87094Nz.A0h(this) || this.A00 == 0) {
            return 0;
        }
        return AnonymousClass5YO.A01(getContext(), this.A00);
    }

    public float getTextFontSize() {
        float textFontSize = super.getTextFontSize();
        int A002 = C106815aD.A00(getMessageText());
        if (A002 > 0) {
            float max = (((Math.max(textFontSize, C86664Kz.A00(C86614Ku.A0E(this).density * textFontSize, C86614Ku.A0E(this).scaledDensity, textFontSize) * 1.5f) - textFontSize) * ((float) (4 - A002))) / 3.0f) + textFontSize;
            if (max != -1.0f) {
                return max;
            }
        }
        return textFontSize;
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

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
