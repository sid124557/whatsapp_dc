package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Collections;

/* renamed from: X.51v  reason: invalid class name */
public class AnonymousClass51v extends AnonymousClass51w {
    public AnonymousClass54T A00;
    public boolean A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C116985rC A04;
    public final C69263Wi A05;
    public final C56972sr A06;
    public final WfalManager A07;
    public final C29301ib A08;
    public final C64773Ex A09;
    public final C29421in A0A;
    public final AnonymousClass5ZU A0B;
    public final C114015mM A0C;
    public final C106355Yq A0D;
    public final C55262q4 A0E;
    public final C56612sH A0F;
    public final AnonymousClass33p A0G;
    public final C620733j A0H;
    public final AnonymousClass4FW A0I = new C86164Jb(this, 11);
    public final C29431io A0J;
    public final AnonymousClass5U1 A0K;
    public final C29241iV A0L;
    public final C102335Il A0M;
    public final C101885Gq A0N = new C101885Gq(this);
    public final C45662aN A0O;
    public final AnonymousClass5H2 A0P;
    public final AnonymousClass5YA A0Q;
    public final C104745Se A0R;
    public final boolean A0S;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x007b, code lost:
        if (r14.A00(X.AnonymousClass223.INSTAGRAM, r1) == false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A07(android.view.LayoutInflater r33, android.view.ViewGroup r34) {
        /*
            r32 = this;
            r0 = r32
            r4 = r33
            r1 = r34
            android.view.View r13 = super.A07(r4, r1)
            X.C626936e.A04(r13)
            X.51t r12 = r0.A0Q()
            android.view.ViewGroup r1 = r12.A0A
            r1.removeAllViews()
            android.view.ViewGroup r1 = r12.A0A
            android.content.Context r2 = r1.getContext()
            r1 = 1117257728(0x42980000, float:76.0)
            int r3 = X.AnonymousClass5YI.A04(r2, r1)
            r1 = -2
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r3)
            r3 = 1
            r2.gravity = r3
            android.view.ViewGroup r1 = r12.A0A
            r1.setLayoutParams(r2)
            android.view.ViewGroup r2 = r12.A0A
            r1 = 2131232077(0x7f08054d, float:1.8080253E38)
            r2.setBackgroundResource(r1)
            r2 = 2131626098(0x7f0e0872, float:1.8879423E38)
            android.view.ViewGroup r1 = r12.A0A
            r4.inflate(r2, r1, r3)
            X.2sH r1 = r0.A0F
            r19 = r1
            X.3Wi r1 = r0.A05
            r18 = r1
            X.5mM r1 = r0.A0C
            r17 = r1
            X.5Se r1 = r0.A0R
            r16 = r1
            X.3Ex r15 = r0.A09
            X.5ZU r11 = r0.A0B
            X.33j r10 = r0.A0H
            X.1in r9 = r0.A0A
            com.whatsapp.bridge.wfal.WfalManager r8 = r0.A07
            X.1ib r7 = r0.A08
            X.33p r6 = r0.A0G
            X.1iV r5 = r0.A0L
            X.5Gq r4 = r0.A0N
            X.5H2 r3 = r0.A0P
            android.view.ViewGroup r2 = r12.A08
            java.lang.Boolean r30 = r0.A0R()
            boolean r1 = r8.A02()
            if (r1 == 0) goto L_0x007d
            X.2aN r14 = r0.A0O
            X.34x r1 = r0.A06
            X.223 r0 = X.AnonymousClass223.INSTAGRAM
            boolean r1 = r14.A00(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            java.lang.Boolean r31 = java.lang.Boolean.valueOf(r0)
            X.5TV r0 = new X.5TV
            r26 = r5
            r27 = r4
            r28 = r3
            r29 = r16
            r21 = r11
            r22 = r17
            r23 = r19
            r24 = r6
            r25 = r10
            r16 = r18
            r17 = r8
            r18 = r7
            r19 = r15
            r20 = r9
            r14 = r0
            r15 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r12.A08 = r0
            r0 = 2131433917(0x7f0b19bd, float:1.8489633E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0F(r13, r0)
            r12.A06 = r0
            r0 = 2131432889(0x7f0b15b9, float:1.8487548E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r13, r0)
            r12.A07 = r0
            r0 = 2131429348(0x7f0b07e4, float:1.8480366E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.A01 = r0
            r0 = 2131430236(0x7f0b0b5c, float:1.8482167E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.A02 = r0
            r0 = 2131431563(0x7f0b108b, float:1.8484859E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.A04 = r0
            android.view.ViewGroup r1 = r12.A08
            r0 = 2131431035(0x7f0b0e7b, float:1.8483788E38)
            android.view.View r0 = r1.findViewById(r0)
            r12.A03 = r0
            r0 = 2131427539(0x7f0b00d3, float:1.8476697E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.A00 = r0
            r0 = 2131433698(0x7f0b18e2, float:1.848919E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.A05 = r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51v.A07(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A0G() {
        if (this.A01) {
            super.A0G();
        }
    }

    public AnonymousClass51t A0Q() {
        AnonymousClass5LV r0 = this.A01;
        if (r0 == null) {
            r0 = new AnonymousClass51t(this);
            this.A01 = r0;
        }
        return (AnonymousClass51t) r0;
    }

    public final Boolean A0R() {
        boolean A002;
        if (this.A07.A02()) {
            A002 = this.A0O.A00(AnonymousClass223.FACEBOOK, this.A06);
        } else if (!this.A0R.A02()) {
            return null;
        } else {
            A002 = AnonymousClass5O0.A00(this.A0Q, Collections.singletonList(this.A06), 3);
        }
        return Boolean.valueOf(A002);
    }

    public void A0S() {
        AnonymousClass5TV r0;
        View view;
        int i;
        Drawable drawable;
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        Drawable.ConstantState constantState2;
        Drawable newDrawable2;
        if (this.A07.A02() && (r0 = A0Q().A08) != null && (view = r0.A00) != null) {
            AnonymousClass5H2 r02 = this.A0P;
            C624134x r5 = this.A06;
            boolean A1W = C18290x4.A1W(r5);
            AnonymousClass30E r2 = r02.A00;
            boolean A052 = r2.A05(AnonymousClass223.FACEBOOK, r5);
            boolean A053 = r2.A05(AnonymousClass223.INSTAGRAM, r5);
            if (A052 || A053) {
                view.setVisibility(A1W ? 1 : 0);
            } else {
                view.setVisibility(8);
            }
            TextView A092 = AnonymousClass002.A09(view, R.id.status_details_list_container_header_text);
            TextView A093 = AnonymousClass002.A09(view, R.id.status_details_list_container_header_icons);
            if (A052) {
                i = R.string.f11nameremoved;
                if (A053) {
                    i = R.string.f11nameremoved;
                }
            } else if (A053) {
                i = R.string.f11nameremoved;
            } else {
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                A092.setText(valueOf.intValue());
                Context A0F2 = C18290x4.A0F(view);
                int lineHeight = A093.getLineHeight();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable A002 = AnonymousClass0RP.A00(A0F2, R.drawable.ic_settings_fb);
                Drawable drawable2 = null;
                if (A002 == null || (constantState2 = A002.getConstantState()) == null || (newDrawable2 = constantState2.newDrawable()) == null) {
                    drawable = null;
                } else {
                    drawable = newDrawable2.mutate();
                }
                Drawable A003 = AnonymousClass0RP.A00(A0F2, R.drawable.ic_settings_ig);
                if (!(A003 == null || (constantState = A003.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null)) {
                    drawable2 = newDrawable.mutate();
                }
                if (A052 && drawable != null) {
                    spannableStringBuilder.append(' ');
                    drawable.setBounds(A1W, A1W, lineHeight, lineHeight);
                    AnonymousClass001.A12(PorterDuff.Mode.SRC_IN, drawable, AnonymousClass0Y8.A04(A0F2, R.color.f5nameremoved));
                    spannableStringBuilder.setSpan(new C87044Mw(drawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 512);
                    spannableStringBuilder.append(' ');
                }
                if (A053 && drawable2 != null) {
                    spannableStringBuilder.append(' ');
                    drawable2.setBounds(0, 0, lineHeight, lineHeight);
                    AnonymousClass001.A12(PorterDuff.Mode.SRC_IN, drawable2, AnonymousClass0Y8.A04(A0F2, R.color.f5nameremoved));
                    spannableStringBuilder.setSpan(new C87044Mw(drawable2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                A093.setText(spannableStringBuilder);
            }
        }
    }

    public void A01() {
        super.A01();
        AnonymousClass5TV r2 = A0Q().A08;
        r2.A0G.A00();
        r2.A0E.A07(r2.A0D);
        r2.A0B.A07(r2.A0A);
        r2.A0K.A07(r2.A0J);
        r2.A07.A0R(r2.A0R);
        r2.A03 = true;
        AnonymousClass54T r0 = this.A00;
        if (r0 != null) {
            r0.A0D(true);
            this.A00 = null;
        }
        this.A0J.A07(this.A0I);
    }

    public void A0H(int i) {
        super.A0H(i);
        if (i == 3) {
            A0Q().A08.A08.sendAccessibilityEvent(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0143, code lost:
        if (X.AnonymousClass35Z.A04((X.AnonymousClass1nB) r6) == false) goto L_0x0145;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(android.view.View r9) {
        /*
            r8 = this;
            super.A0K(r9)
            X.51t r4 = r8.A0Q()
            android.view.ViewGroup r3 = r4.A08
            int r2 = r3.getPaddingLeft()
            android.view.ViewGroup r0 = r4.A08
            int r1 = r0.getPaddingTop()
            android.view.ViewGroup r0 = r4.A08
            int r0 = r0.getPaddingRight()
            r5 = 0
            r3.setPadding(r2, r1, r0, r5)
            android.view.View r1 = r4.A06
            r0 = 5
            X.C18280x3.A0o(r1, r8, r0)
            android.view.ViewGroup r1 = r4.A0A
            r0 = 19
            X.C989753y.A00(r1, r8, r0)
            android.view.View r0 = r4.A04
            r3 = 8
            if (r0 == 0) goto L_0x0096
            X.5Se r2 = r8.A0R
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0096
            android.view.View r1 = r4.A04
            r0 = 23
            X.C989753y.A00(r1, r8, r0)
            X.5TV r0 = r4.A08
            android.view.ViewStub r1 = r0.A04
            X.5YA r6 = r8.A0Q
            X.34x r0 = r8.A06
            boolean r0 = r6.A09(r0)
            if (r0 == 0) goto L_0x0092
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0092
            X.C162457s7.A0J(r1, r5)
            r0 = 2131626393(0x7f0e0999, float:1.888002E38)
            android.view.View r1 = X.C86634Kw.A0M(r1, r0)
            X.C162457s7.A0D(r1)
            r0 = 2131434930(0x7f0b1db2, float:1.8491688E38)
            android.view.View r2 = X.C06560Yg.A02(r1, r0)
            r0 = 43
            X.53y r1 = new X.53y
            r1.<init>(r6, r0)
        L_0x006e:
            r2.setOnClickListener(r1)
        L_0x0071:
            com.whatsapp.bridge.wfal.WfalManager r0 = r8.A07
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x007c
            r8.A0S()
        L_0x007c:
            android.view.View r2 = r4.A00
            if (r2 == 0) goto L_0x00d8
            X.5rC r1 = r8.A04
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x00d3
            r1.A04()
            java.lang.String r0 = "logStatusEntryPointImpression"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0092:
            r1.setVisibility(r3)
            goto L_0x0071
        L_0x0096:
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x00bf
            X.2sr r0 = r8.A06
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x00cb
            X.2q4 r0 = r8.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x00ba
            X.1VX r1 = r8.A0O
            r0 = 4905(0x1329, float:6.873E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x00cb
        L_0x00ba:
            android.view.View r0 = r4.A01
            r0.setVisibility(r3)
        L_0x00bf:
            android.view.View r2 = r4.A02
            if (r2 == 0) goto L_0x0071
            r0 = 25
            X.53y r1 = new X.53y
            r1.<init>(r8, r0)
            goto L_0x006e
        L_0x00cb:
            android.view.View r1 = r4.A01
            r0 = 24
            X.C989753y.A00(r1, r8, r0)
            goto L_0x00bf
        L_0x00d3:
            r0 = 26
            X.C989753y.A00(r2, r8, r0)
        L_0x00d8:
            android.view.View r0 = r4.A05
            if (r0 == 0) goto L_0x0123
            X.5U1 r0 = r8.A0K
            X.34x r7 = r8.A06
            boolean r0 = r0.A04(r7)
            if (r0 == 0) goto L_0x018d
            X.5Yq r6 = r8.A0D
            java.lang.Integer r0 = X.C18290x4.A0b()
            X.4rX r2 = new X.4rX
            r2.<init>()
            r2.A01 = r0
            X.2z0 r1 = r7.A1J
            boolean r0 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            java.lang.Integer r0 = X.C106355Yq.A00(r7)
            r2.A02 = r0
            X.4uZ r1 = r1.A00
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x017a
            r0 = 1
        L_0x010c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.4FV r0 = r6.A00
            r0.BhD(r2)
            android.view.View r0 = r4.A05
            r0.setVisibility(r5)
        L_0x011c:
            android.view.View r1 = r4.A05
            r0 = 27
            X.C989753y.A00(r1, r8, r0)
        L_0x0123:
            X.54T r0 = r8.A00
            X.C18290x4.A1L(r0)
            X.54T r1 = new X.54T
            r1.<init>(r8)
            r8.A00 = r1
            X.4FS r0 = r8.A0a
            X.AnonymousClass0x7.A1B(r1, r0)
            X.34x r6 = r8.A06
            boolean r0 = r6 instanceof X.C31971pB
            r2 = 1
            if (r0 == 0) goto L_0x0145
            r0 = r6
            X.1nB r0 = (X.AnonymousClass1nB) r0
            boolean r1 = X.AnonymousClass35Z.A04(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0146
        L_0x0145:
            r0 = 0
        L_0x0146:
            r8.A01 = r0
            boolean r0 = r6 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0178
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            boolean r0 = X.C383227b.A00(r0)
            if (r0 == 0) goto L_0x0178
        L_0x0155:
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x0171
            if (r2 != 0) goto L_0x0171
            r8.A0P()
        L_0x015e:
            boolean r0 = X.C627636p.A0l(r6)
            if (r0 == 0) goto L_0x0169
            android.view.ViewGroup r0 = r4.A08
            r0.setVisibility(r3)
        L_0x0169:
            X.1io r1 = r8.A0J
            X.4FW r0 = r8.A0I
            r1.A06(r0)
            return
        L_0x0171:
            r8.A0O(r5)
            r8.A0G()
            goto L_0x015e
        L_0x0178:
            r2 = 0
            goto L_0x0155
        L_0x017a:
            boolean r0 = r1 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0180
            r0 = 4
            goto L_0x010c
        L_0x0180:
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x0186
            r0 = 2
            goto L_0x010c
        L_0x0186:
            boolean r0 = r1 instanceof X.C95804uY
            int r0 = X.C86664Kz.A04(r0)
            goto L_0x010c
        L_0x018d:
            android.view.View r0 = r4.A05
            r0.setVisibility(r3)
            goto L_0x011c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51v.A0K(android.view.View):void");
    }

    public void A0L(boolean z) {
        super.A0L(z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass51v(X.C116985rC r34, X.C116985rC r35, X.C116985rC r36, X.C184988ss r37, X.C111095hX r38, X.C69263Wi r39, X.C56972sr r40, X.AnonymousClass5Ul r41, X.C621033m r42, com.whatsapp.bridge.wfal.WfalManager r43, X.C29301ib r44, X.C64773Ex r45, X.C29421in r46, X.AnonymousClass5ZU r47, X.C105365Uq r48, X.C114015mM r49, X.C106355Yq r50, X.C55262q4 r51, X.C620633i r52, X.C56612sH r53, X.AnonymousClass33p r54, X.C620733j r55, X.C66543Lv r56, X.C29431io r57, X.C114635nM r58, X.C54012o2 r59, X.C620233e r60, X.AnonymousClass36Y r61, X.AnonymousClass1VX r62, X.AnonymousClass5U1 r63, X.C29241iV r64, X.C28071fd r65, X.C56232re r66, X.C48132eP r67, X.AnonymousClass5UP r68, X.C624134x r69, X.C50222hp r70, X.C45042Yl r71, X.AnonymousClass1R1 r72, X.C102335Il r73, X.C113995mK r74, X.AnonymousClass5X9 r75, X.C103005Lc r76, X.AnonymousClass5SJ r77, X.C55832qz r78, X.C105025Tg r79, X.AnonymousClass4FS r80, X.C105215Ua r81, X.C45662aN r82, X.AnonymousClass5H2 r83, X.AnonymousClass5YA r84, X.C104745Se r85) {
        /*
            r33 = this;
            r2 = r33
            r17 = r62
            r16 = r61
            r15 = r60
            r14 = r59
            r13 = r58
            r12 = r56
            r11 = r55
            r10 = r53
            r9 = r52
            r8 = r48
            r3 = r37
            r4 = r38
            r5 = r39
            r25 = r74
            r26 = r75
            r27 = r76
            r28 = r77
            r29 = r78
            r30 = r79
            r31 = r80
            r32 = r81
            r24 = r72
            r23 = r71
            r7 = r42
            r22 = r70
            r6 = r41
            r21 = r69
            r20 = r67
            r19 = r66
            r18 = r65
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r1 = 11
            X.4Jb r0 = new X.4Jb
            r0.<init>(r2, r1)
            r2.A0I = r0
            X.5Gq r0 = new X.5Gq
            r0.<init>(r2)
            r2.A0N = r0
            r2.A0F = r10
            r2.A05 = r5
            r0 = r40
            r2.A06 = r0
            r0 = r85
            r2.A0R = r0
            r0 = r49
            r2.A0C = r0
            r0 = r45
            r2.A09 = r0
            r0 = r47
            r2.A0B = r0
            r2.A0H = r11
            r0 = r46
            r2.A0A = r0
            r0 = r57
            r2.A0J = r0
            r0 = r43
            r2.A07 = r0
            r0 = r44
            r2.A08 = r0
            r0 = r54
            r2.A0G = r0
            r0 = r84
            r2.A0Q = r0
            r0 = r82
            r2.A0O = r0
            r0 = r64
            r2.A0L = r0
            r0 = r83
            r2.A0P = r0
            r0 = r51
            r2.A0E = r0
            boolean r0 = X.C18300x5.A1S(r68)
            r2.A0S = r0
            r0 = r63
            r2.A0K = r0
            r0 = r73
            r2.A0M = r0
            r0 = r34
            r2.A04 = r0
            r0 = r35
            r2.A03 = r0
            r0 = r50
            r2.A0D = r0
            X.34x r1 = r2.A06
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r0 = r36
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51v.<init>(X.5rC, X.5rC, X.5rC, X.8ss, X.5hX, X.3Wi, X.2sr, X.5Ul, X.33m, com.whatsapp.bridge.wfal.WfalManager, X.1ib, X.3Ex, X.1in, X.5ZU, X.5Uq, X.5mM, X.5Yq, X.2q4, X.33i, X.2sH, X.33p, X.33j, X.3Lv, X.1io, X.5nM, X.2o2, X.33e, X.36Y, X.1VX, X.5U1, X.1iV, X.1fd, X.2re, X.2eP, X.5UP, X.34x, X.2hp, X.2Yl, X.1R1, X.5Il, X.5mK, X.5X9, X.5Lc, X.5SJ, X.2qz, X.5Tg, X.4FS, X.5Ua, X.2aN, X.5H2, X.5YA, X.5Se):void");
    }
}
