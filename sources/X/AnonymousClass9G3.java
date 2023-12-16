package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.9G3  reason: invalid class name */
public class AnonymousClass9G3 extends AnonymousClass94T implements C203239nL {
    public int A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public C69263Wi A0A;
    public TextEmojiLabel A0B;
    public TextEmojiLabel A0C;
    public TextEmojiLabel A0D;
    public TextEmojiLabel A0E;
    public WaImageView A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public AnonymousClass5UX A0I;
    public C64773Ex A0J;
    public C105365Uq A0K;
    public C114015mM A0L;
    public C66543Lv A0M;
    public C624034w A0N;
    public AnonymousClass1VX A0O;
    public C106195Xz A0P;
    public C194599Tr A0Q;
    public C202509m8 A0R;
    public C1907099n A0S;
    public AnonymousClass9U4 A0T;
    public C196419ao A0U;
    public C195219Wq A0V;
    public AnonymousClass4FS A0W;
    public String A0X;

    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C624034w r11, X.AnonymousClass9G3 r12, X.C624134x r13) {
        /*
            android.view.View r0 = r12.A01
            r4 = 0
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r12.A07
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r12.A08
            r3 = 8
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r1 = r12.A0D
            java.lang.String r0 = r12.getTransactionTitle()
            r1.setText(r0)
            X.1S4 r2 = r11.A0A
            if (r2 == 0) goto L_0x00dd
            X.7yt r0 = r2.A0F()
            if (r0 == 0) goto L_0x00dd
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 != 0) goto L_0x00dd
            com.whatsapp.TextEmojiLabel r1 = r12.A0C
            X.7yt r0 = r2.A0F()
            java.lang.Object r0 = r0.A00
            X.C626936e.A06(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.widget.ImageView r0 = r12.A04
            if (r0 == 0) goto L_0x0042
            r0.setVisibility(r3)
        L_0x0042:
            r1.setVisibility(r4)
        L_0x0045:
            int r1 = r11.A01
            r0 = 4
            if (r1 != r0) goto L_0x00d5
            X.9U4 r1 = r12.A0T
            java.lang.String r0 = "P2M_LITE"
            X.9oC r10 = r1.A0H(r0)
            if (r10 == 0) goto L_0x00d5
        L_0x0054:
            X.9SM r5 = r10.B6f()
            android.widget.FrameLayout r6 = r12.A03
            r6.removeAllViews()
            if (r5 == 0) goto L_0x00e8
            android.content.Context r8 = r12.getContext()
            X.1S4 r9 = r11.A0A
            r1 = r5
            X.99p r1 = (X.C1907299p) r1
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            boolean r0 = r9 instanceof X.AnonymousClass99L
            r2 = 0
            if (r0 == 0) goto L_0x00af
            X.99L r9 = (X.AnonymousClass99L) r9
            java.lang.String r0 = r9.A0V
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0093
            X.3Mh r1 = r1.A00
            X.1Ei r0 = X.C66663Mh.A0l
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0093
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131625714(0x7f0e06f2, float:1.8878644E38)
            android.view.View r0 = r1.inflate(r0, r2)
            r7.add(r0)
        L_0x0093:
            X.9W2 r0 = r9.A0G
            if (r0 == 0) goto L_0x00af
            X.9Vz r0 = r0.A0C
            if (r0 == 0) goto L_0x00af
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00af
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131625177(0x7f0e04d9, float:1.8877555E38)
            android.view.View r0 = r1.inflate(r0, r2)
            r7.add(r0)
        L_0x00af:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00e8
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r8)
            X.C18310x6.A15(r2)
            r0 = 1
            r2.setOrientation(r0)
            java.util.Iterator r1 = r7.iterator()
        L_0x00c5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r2.addView(r0)
            goto L_0x00c5
        L_0x00d5:
            X.9U4 r0 = r12.A0T
            X.9oC r10 = r0.A0G()
            goto L_0x0054
        L_0x00dd:
            r12.setupTransactionMessage(r13)
            goto L_0x0045
        L_0x00e2:
            r6.addView(r2)
            r6.setVisibility(r4)
        L_0x00e8:
            if (r13 == 0) goto L_0x0250
            X.2z0 r0 = r13.A1J
            if (r0 == 0) goto L_0x0250
            X.9Wq r7 = r12.A0V
            X.4uZ r0 = r0.A00
            if (r0 == 0) goto L_0x024d
            X.34w r6 = r13.A0P
            if (r6 == 0) goto L_0x024d
        L_0x00f8:
            boolean r0 = r6.A0L()
            X.2sr r1 = r7.A00
            if (r0 == 0) goto L_0x021a
            com.whatsapp.jid.UserJid r0 = r6.A0E
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x0215
            int r1 = r6.A03
            r0 = 40
            if (r1 != r0) goto L_0x011c
            int r1 = r6.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0210
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0210
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x0210
        L_0x011c:
            r1 = 2131892064(0x7f121760, float:1.9418866E38)
        L_0x011f:
            android.widget.ImageView r6 = r12.A06
            r6.setVisibility(r3)
            if (r1 == 0) goto L_0x0208
            com.whatsapp.WaTextView r0 = r12.A0H
            r0.setText(r1)
            r0.setVisibility(r4)
            X.99n r0 = r12.A0S
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x013e
            X.99n r0 = r12.A0S
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x016d
        L_0x013e:
            int r1 = r11.A03
            r0 = 100
            if (r1 == r0) goto L_0x01fc
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x01fc
            r2 = 2131232645(0x7f080785, float:1.8081405E38)
            android.content.res.Resources r1 = X.C18290x4.A0G(r12)
            r0 = 2131167800(0x7f070a38, float:1.7949884E38)
        L_0x0152:
            float r0 = r1.getDimension(r0)
            int r1 = (int) r0
            r6.setVisibility(r4)
            android.content.Context r0 = r12.getContext()
            X.C18290x4.A1A(r0, r6, r2)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.width = r1
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.height = r1
        L_0x016d:
            r12.setupRowButtons(r13, r5)
            com.whatsapp.TextEmojiLabel r6 = r12.A0B
            java.lang.CharSequence r0 = r12.getAmountText()
            r6.setText(r0)
            X.7Qu r0 = r10.BAi()
            boolean r0 = r0.A00(r11)
            if (r0 == 0) goto L_0x01c9
            X.C192719Lh.A00(r6)
        L_0x0186:
            int r1 = r12.getStatusColor()
            int r0 = r12.getStatusLabel()
            android.widget.TextView r2 = r12.A09
            if (r0 == 0) goto L_0x01c5
            r2.setText(r0)
            r2.setTextColor(r1)
            r2.setVisibility(r4)
        L_0x019b:
            int r1 = r11.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x01bb
            r6.setVisibility(r3)
            X.9ao r1 = r12.A0U
            java.lang.String r0 = r11.A0K
            boolean r1 = r1.A08(r0)
            android.view.View r0 = r12.A02
            if (r1 == 0) goto L_0x01bc
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r0 = r12.A0F
            r0.setVisibility(r4)
        L_0x01b8:
            r2.setVisibility(r3)
        L_0x01bb:
            return
        L_0x01bc:
            r0.setVisibility(r4)
            com.whatsapp.WaImageView r0 = r12.A0F
            r0.setVisibility(r3)
            goto L_0x01b8
        L_0x01c5:
            r2.setVisibility(r3)
            goto L_0x019b
        L_0x01c9:
            int r0 = r6.getPaintFlags()
            r0 = r0 & -17
            r6.setPaintFlags(r0)
            boolean r0 = r11.A0K()
            if (r0 != 0) goto L_0x01e9
            boolean r0 = X.C624034w.A02(r11)
            if (r0 != 0) goto L_0x01e9
            android.content.Context r5 = r12.getContext()
            r0 = 2131102142(0x7f0609be, float:1.7816714E38)
        L_0x01e5:
            X.AnonymousClass0x2.A0q(r5, r6, r0)
            goto L_0x0186
        L_0x01e9:
            android.content.Context r5 = r12.getContext()
            android.content.Context r2 = r12.getContext()
            r1 = 2130970568(0x7f0407c8, float:1.754985E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            goto L_0x01e5
        L_0x01fc:
            r2 = 2131231251(0x7f080213, float:1.8078578E38)
            android.content.res.Resources r1 = X.C18290x4.A0G(r12)
            r0 = 2131167799(0x7f070a37, float:1.7949882E38)
            goto L_0x0152
        L_0x0208:
            com.whatsapp.WaTextView r1 = r12.A0H
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x016d
        L_0x0210:
            r1 = 2131891800(0x7f121658, float:1.941833E38)
            goto L_0x011f
        L_0x0215:
            r1 = 2131891799(0x7f121657, float:1.9418328E38)
            goto L_0x011f
        L_0x021a:
            com.whatsapp.jid.UserJid r0 = r6.A0D
            boolean r2 = r1.A0a(r0)
            X.99n r1 = r7.A0C
            boolean r0 = r1.A0F()
            if (r0 != 0) goto L_0x0238
            boolean r0 = r1.A0C()
            if (r0 != 0) goto L_0x0238
            r1 = 2131891801(0x7f121659, float:1.9418332E38)
            if (r2 == 0) goto L_0x011f
            r1 = 2131892173(0x7f1217cd, float:1.9419087E38)
            goto L_0x011f
        L_0x0238:
            int r1 = r6.A03
            r0 = 100
            if (r1 != r0) goto L_0x0243
            r1 = 2131892170(0x7f1217ca, float:1.941908E38)
            goto L_0x011f
        L_0x0243:
            r1 = 2131892172(0x7f1217cc, float:1.9419085E38)
            if (r2 == 0) goto L_0x011f
            r1 = 2131892171(0x7f1217cb, float:1.9419083E38)
            goto L_0x011f
        L_0x024d:
            r1 = 0
            goto L_0x011f
        L_0x0250:
            X.9Wq r7 = r12.A0V
            X.34w r6 = r12.A0N
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9G3.A00(X.34w, X.9G3, X.34x):void");
    }

    private int getStatusLabel() {
        return this.A0V.A0B(this.A0N);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != 200) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        if (r1 != 2) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0123  */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Axw(X.C624034w r6) {
        /*
            r5 = this;
            r5.A0N = r6
            android.content.Context r0 = r5.getContext()
            X.5MG r3 = new X.5MG
            r3.<init>(r0)
            X.34w r2 = r5.A0N
            int r1 = r2.A03
            r0 = 1
            if (r1 == r0) goto L_0x00c5
            r0 = 2
            if (r1 == r0) goto L_0x00f2
            r0 = 9
            if (r1 == r0) goto L_0x0093
            r0 = 10
            if (r1 == r0) goto L_0x00f2
            r0 = 20
            if (r1 == r0) goto L_0x00c5
            r0 = 100
            if (r1 == r0) goto L_0x00c5
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00f2
        L_0x0029:
            X.5UX r4 = r5.A0I
            android.widget.ImageView r2 = r5.A05
        L_0x002d:
            r3 = 2131231006(0x7f08011e, float:1.807808E38)
        L_0x0030:
            r4.A06(r2, r3)
        L_0x0033:
            java.lang.String r0 = r5.getTransactionTitle()
            r2.setContentDescription(r0)
            r0 = 0
            r2.setOnClickListener(r0)
            boolean r0 = r6.A0N()
            if (r0 != 0) goto L_0x0123
            android.view.View r0 = r5.A01
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A07
            r0.setVisibility(r1)
            android.widget.LinearLayout r1 = r5.A08
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.TextEmojiLabel r1 = r5.A0E
            java.lang.String r0 = r5.getTransactionTitle()
            r1.setText(r0)
            com.whatsapp.WaTextView r3 = r5.A0G
            android.content.Context r1 = r5.getContext()
            r0 = 2131892240(0x7f121810, float:1.9419223E38)
            java.lang.String r2 = r1.getString(r0)
            X.9fA r1 = new X.9fA
            r1.<init>()
            java.lang.String r0 = "update-whatsapp"
            android.text.SpannableStringBuilder r0 = X.C57002su.A01(r1, r2, r0)
            r3.setText(r0)
            android.content.Context r1 = r5.getContext()
            int r0 = X.AnonymousClass0x2.A05(r5)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r3.setLinkTextColor(r0)
            r0 = 157(0x9d, float:2.2E-43)
            X.9p3 r0 = X.C204249p3.A00(r5, r0)
            r5.setOnClickListener(r0)
            return
        L_0x0093:
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x00be
            X.9U4 r1 = r5.A0T
            java.lang.String r0 = "P2M_LITE"
            X.9oC r0 = r1.A0H(r0)
            if (r0 == 0) goto L_0x00be
        L_0x00a2:
            X.9Tz r0 = r0.BAx()
            if (r0 == 0) goto L_0x0029
            X.5UX r4 = r5.A0I
            android.widget.ImageView r2 = r5.A05
            X.34w r0 = r5.A0N
            int r1 = r0.A01
            r0 = 1
            r3 = 2131232339(0x7f080653, float:1.8080784E38)
            if (r1 == r0) goto L_0x0030
            r0 = 2
            r3 = 2131232338(0x7f080652, float:1.8080782E38)
            if (r1 == r0) goto L_0x0030
            goto L_0x002d
        L_0x00be:
            X.9U4 r0 = r5.A0T
            X.9oC r0 = r0.A0G()
            goto L_0x00a2
        L_0x00c5:
            com.whatsapp.jid.UserJid r1 = r2.A0D
            if (r1 == 0) goto L_0x0029
            X.3Ex r0 = r5.A0J
            X.3ZH r1 = r0.A0A(r1)
            X.5Uq r0 = r5.A0K
            android.widget.ImageView r2 = r5.A05
            r0.A08(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 2131896402(0x7f122852, float:1.9427664E38)
            java.lang.String r0 = r3.A03(r0)
            r1.append(r0)
            X.34w r0 = r5.A0N
            com.whatsapp.jid.UserJid r0 = r0.A0D
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            X.AnonymousClass0YZ.A0F(r2, r0)
            r0 = 158(0x9e, float:2.21E-43)
            goto L_0x011e
        L_0x00f2:
            com.whatsapp.jid.UserJid r1 = r2.A0E
            if (r1 == 0) goto L_0x0029
            X.3Ex r0 = r5.A0J
            X.3ZH r1 = r0.A0A(r1)
            X.5Uq r0 = r5.A0K
            android.widget.ImageView r2 = r5.A05
            r0.A08(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 2131896402(0x7f122852, float:1.9427664E38)
            java.lang.String r0 = r3.A03(r0)
            r1.append(r0)
            X.34w r0 = r5.A0N
            com.whatsapp.jid.UserJid r0 = r0.A0E
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            X.AnonymousClass0YZ.A0F(r2, r0)
            r0 = 159(0x9f, float:2.23E-43)
        L_0x011e:
            X.C204249p3.A02(r2, r5, r0)
            goto L_0x0033
        L_0x0123:
            X.4FS r1 = r5.A0W
            X.9in r0 = new X.9in
            r0.<init>(r6, r5)
            r1.BkM(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9G3.Axw(X.34w):void");
    }

    public void Biz() {
        C624034w r1 = this.A0N;
        if (r1 != null && this.A0R != null) {
            Axw(r1);
        }
    }

    public CharSequence getAmountText() {
        String A0R2;
        Context context;
        int i;
        C195319Xg A0D2;
        int i2;
        AnonymousClass39L r1;
        Context context2;
        int i3;
        C624034w r2 = this.A0N;
        AnonymousClass1S4 r0 = r2.A0A;
        if (r0 == null || (A0D2 = r0.A0D()) == null || (i2 = A0D2.A01) <= 1 || (r1 = A0D2.A02) == null) {
            A0R2 = this.A0V.A0R(r2);
            if (!this.A0N.A0L()) {
                int i4 = this.A0N.A03;
                if (i4 == 1 || i4 == 100) {
                    context = getContext();
                    i = R.string.f11nameremoved;
                } else if (i4 == 2 || i4 == 200) {
                    context = getContext();
                    i = R.string.f11nameremoved;
                }
                A0R2 = AnonymousClass0x2.A0X(context, A0R2, 1, i);
            }
        } else {
            C195219Wq r02 = this.A0V;
            C626936e.A06(r1);
            A0R2 = r1.A01.B3V(r02.A06, r1.A02);
            if (!this.A0N.A0L()) {
                int i5 = this.A0N.A03;
                if (i5 == 1 || i5 == 100) {
                    context2 = getContext();
                    i3 = R.string.f11nameremoved;
                } else if (i5 == 2 || i5 == 200) {
                    context2 = getContext();
                    i3 = R.string.f11nameremoved;
                }
                Object[] objArr = new Object[2];
                objArr[0] = String.valueOf(i2);
                A0R2 = AnonymousClass002.A0F(context2, A0R2, objArr, 1, i3);
            }
        }
        synchronized (this.A0N) {
        }
        getContext();
        return A0R2;
    }

    public String getTransactionTitle() {
        return this.A0V.A0Z(this.A0N, false);
    }

    public void setupTransactionMessage(C624134x r6) {
        ImageView imageView;
        TextEmojiLabel textEmojiLabel;
        int i;
        if ((r6 instanceof C30481mW) && !TextUtils.isEmpty(r6.A13())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r6.A13());
            this.A0P.A05(getContext(), spannableStringBuilder, r6.A1J.A00, r6.A18);
            textEmojiLabel = this.A0C;
            textEmojiLabel.A0K((List) null, spannableStringBuilder);
            imageView = this.A04;
            i = 8;
        } else if ((this.A0O.A0X(812) || this.A0O.A0X(811)) && (r6 instanceof AnonymousClass1nE)) {
            imageView = this.A04;
            if (imageView != null) {
                C107335b8.A0C(getContext(), imageView, R.drawable.msg_status_sticker, R.color.f5nameremoved);
            }
            textEmojiLabel = this.A0C;
            textEmojiLabel.setText(R.string.f11nameremoved);
            i = 0;
        } else {
            ImageView imageView2 = this.A04;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            TextEmojiLabel textEmojiLabel2 = this.A0C;
            if (textEmojiLabel2 != null) {
                textEmojiLabel2.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        textEmojiLabel.setVisibility(0);
    }

    public AnonymousClass9G3(Context context) {
        super(context);
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        setOrientation(1);
        AnonymousClass0YY.A04(AnonymousClass0RP.A00(getContext(), R.drawable.selector_orange_gradient), this);
        this.A05 = AnonymousClass0x9.A0F(this, R.id.transaction_icon);
        this.A0D = (TextEmojiLabel) findViewById(R.id.transaction_receiver);
        this.A04 = AnonymousClass0x9.A0F(this, R.id.message_type_indicator);
        this.A0C = (TextEmojiLabel) findViewById(R.id.transaction_note);
        this.A0B = (TextEmojiLabel) findViewById(R.id.transaction_amount);
        this.A09 = AnonymousClass002.A09(this, R.id.transaction_status);
        this.A02 = findViewById(R.id.transaction_shimmer);
        this.A06 = AnonymousClass0x9.A0F(this, R.id.type_icon);
        this.A0H = (WaTextView) findViewById(R.id.requested_from_note);
        this.A01 = findViewById(R.id.action_buttons_container);
        this.A07 = C86664Kz.A0v(this, R.id.transaction_row_details);
        this.A0F = (WaImageView) findViewById(R.id.transaction_loading_error);
        this.A03 = (FrameLayout) findViewById(R.id.custom_country_view_container);
        this.A08 = C86664Kz.A0v(this, R.id.transaction_row_not_supported);
        this.A0E = (TextEmojiLabel) findViewById(R.id.transaction_receiver_not_supported);
        this.A0G = (WaTextView) findViewById(R.id.transaction_not_supported_description);
        this.A0K = this.A0L.A05(getContext(), "peer-payment-transaction-row");
        this.A0C.setTextDirection(5);
        C1899593h.A0i(getContext(), this.A0F, R.color.f5nameremoved);
        setOnClickListener(C204249p3.A00(this, 156));
    }

    public int getStatusColor() {
        return AnonymousClass0Y8.A04(getContext(), C195219Wq.A01(this.A0N));
    }

    public void setupRowButtons(C624134x r13, AnonymousClass9SM r14) {
        Button button = (Button) C06560Yg.A02(this, R.id.accept_payment_button);
        C194599Tr r3 = this.A0Q;
        View view = this.A01;
        C202509m8 r8 = this.A0R;
        C624034w r6 = this.A0N;
        String str = this.A0X;
        view.setVisibility(8);
        if (r6.A0J()) {
            r3.A04(view, (Button) null, r6, r8, false);
        } else if (r6.A02 == 102) {
            r3.A02(view, button, r6);
        } else {
            r3.A03(view, (Button) null, r6, r14, r8, r13, str, false);
        }
    }

    public C202509m8 getCallback() {
        return this.A0R;
    }

    public int getLayoutResourceId() {
        return R.layout.f8nameremoved;
    }

    public void setCallback(C202509m8 r1) {
        this.A0R = r1;
    }

    public void setLoggingScreenName(String str) {
        this.A0X = str;
    }

    public AnonymousClass9G3(Context context, C202509m8 r3, int i) {
        this(context);
        String str;
        this.A0R = r3;
        if (i == 2) {
            str = "payment_home";
        } else if (i == 3) {
            str = "payment_transaction_history";
        } else if (i != 4) {
            str = "unknown";
        } else {
            str = "mandate_payment_screen";
        }
        this.A0X = str;
        this.A00 = i;
    }
}
