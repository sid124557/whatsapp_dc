package X;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4mx  reason: invalid class name and case insensitive filesystem */
public class C92604mx extends C93314oJ {
    public int A00;
    public C116985rC A01;
    public C45742aV A02;
    public C29291ia A03;
    public C41242Jm A04;
    public AnonymousClass5UX A05;
    public C105975Xd A06;
    public C53802nh A07;
    public C64223Cq A08;
    public C33981u0 A09;
    public C106055Xl A0A;
    public AnonymousClass5PP A0B;
    public AnonymousClass4FV A0C;
    public C27981fH A0D;
    public C106165Xw A0E;
    public C56072rN A0F;
    public AnonymousClass2ML A0G;
    public C90004fd A0H;
    public AnonymousClass2Z2 A0I;
    public C183538qC A0J;
    public String A0K;
    public C106705a1 A0L;
    public boolean A0M;
    public boolean A0N = false;
    public boolean A0O;
    public final ImageView A0P;
    public final LinearLayout A0Q;
    public final TextView A0R;
    public final TextView A0S;
    public final TextView A0T;
    public final TextView A0U;
    public final TextView A0V;
    public final C105365Uq A0W;
    public final AnonymousClass5UY A0X;
    public final AnonymousClass5UY A0Y;
    public final C95894up A0Z;
    public final AnonymousClass66v A0a;
    public final ArrayList A0b = AnonymousClass001.A0s();
    public final ArrayList A0c = AnonymousClass001.A0s();

    public void A1H() {
        A1t(false);
        A22();
    }

    public final boolean A25(C106705a1 r7) {
        boolean z;
        if (r7 != null) {
            List list = r7.A06;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (this.A0Z.A0a(AnonymousClass4L0.A0R(it).A01)) {
                        z = true;
                        break;
                    }
                }
                if (list.size() > 0 && !z) {
                    return true;
                }
            }
            List<AnonymousClass5KP> list2 = r7.A03;
            if (list2 != null) {
                for (AnonymousClass5KP r0 : list2) {
                    if (r0.A01 == ContactsContract.CommonDataKinds.Email.class) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r10.A24() != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0284  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A01(X.C92604mx r25, X.AnonymousClass7O9 r26) {
        /*
            r4 = r26
            X.34x r2 = r4.A01
            X.2z0 r5 = r2.A1J
            r10 = r25
            android.widget.TextView r9 = r10.A0V
            boolean r0 = X.C86664Kz.A1U(r9, r5)
            if (r0 == 0) goto L_0x02ce
            X.5a1 r0 = r4.A04
            r10.A0L = r0
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.A03()
            r10.A23(r0)
        L_0x001d:
            X.5a1 r0 = r10.A0L
            r15 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0034
            X.5Ot r0 = r0.A0A
            java.lang.String r0 = r0.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0034
            boolean r0 = r10.A24()
            r14 = 1
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r14 = 0
        L_0x0035:
            r3 = 8
            if (r14 == 0) goto L_0x00ab
            android.widget.TextView r7 = r10.A0R
            r7.setVisibility(r8)
            r0 = 2131887158(0x7f120436, float:1.9408915E38)
            r7.setText(r0)
            X.5a1 r0 = r10.A0L
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.widget.TextView r1 = r10.A0T
            if (r0 != 0) goto L_0x00b3
            r1.setVisibility(r8)
            X.5a1 r0 = r10.A0L
            java.lang.String r0 = r0.A02
            r1.setText(r0)
        L_0x005a:
            X.5a1 r6 = r10.A0L
            if (r6 == 0) goto L_0x0065
            X.5Uq r1 = r10.A0W
            android.widget.ImageView r0 = r10.A0P
            r1.A0B(r0, r6)
        L_0x0065:
            r10.A00 = r8
            java.util.ArrayList r6 = r10.A0b
            r6.clear()
            java.util.ArrayList r12 = r10.A0c
            r12.clear()
            X.5a1 r0 = r10.A0L
            r11 = 0
            if (r0 == 0) goto L_0x00b7
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x00b7
            java.util.Iterator r13 = r0.iterator()
        L_0x007e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00b7
            X.7OD r1 = X.AnonymousClass4L0.A0R(r13)
            java.lang.String r0 = r1.A02
            r12.add(r0)
            com.whatsapp.jid.UserJid r1 = r1.A01
            if (r1 == 0) goto L_0x00a7
            X.2sr r0 = r10.A0Z
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x009d
            r6.add(r11)
            goto L_0x007e
        L_0x009d:
            r6.add(r1)
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            goto L_0x007e
        L_0x00a7:
            r6.add(r11)
            goto L_0x007e
        L_0x00ab:
            android.widget.TextView r0 = r10.A0T
            r0.setVisibility(r3)
            android.widget.TextView r1 = r10.A0R
            r7 = r1
        L_0x00b3:
            r1.setVisibility(r3)
            goto L_0x005a
        L_0x00b7:
            X.2ML r0 = r10.A0G
            X.1VX r1 = r0.A01
            r0 = 3790(0xece, float:5.311E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00c9
            X.1fH r0 = r10.getLidUserJid()
            r10.A0D = r0
        L_0x00c9:
            boolean r12 = r5.A02
            if (r12 != 0) goto L_0x02c4
            X.4uZ r5 = r5.A00
            boolean r0 = X.C627336j.A0K(r5)
            X.3Ex r1 = r10.A0t
            if (r0 == 0) goto L_0x02bd
            X.4uZ r0 = r2.A0n()
            X.3ZH r2 = X.C64773Ex.A00(r1, r0)
            X.2sD r0 = r10.A1y
            boolean r1 = r0.A05(r5)
            X.3Lq r0 = r10.A1V
            X.1fJ r5 = (X.C27991fJ) r5
            X.2sj r0 = r0.A0b
            boolean r0 = r0.A0G(r5)
            r0 = r0 ^ 1
            r1 = r1 & r0
        L_0x00f2:
            X.2k5 r0 = r2.A0F
            if (r0 == 0) goto L_0x00f7
            r15 = 0
        L_0x00f7:
            r15 = r15 & r1
            X.2sD r1 = r10.A1y
            X.4uZ r0 = X.C86604Kt.A0a(r2)
            boolean r0 = r1.A05(r0)
            r15 = r15 & r0
        L_0x0103:
            r0 = 2131428340(0x7f0b03f4, float:1.8478322E38)
            android.view.View r2 = r10.findViewById(r0)
            r0 = 2131428363(0x7f0b040b, float:1.8478368E38)
            android.view.View r1 = r10.findViewById(r0)
            if (r15 != 0) goto L_0x02a6
            int r0 = r10.A00
            if (r0 > 0) goto L_0x0294
            boolean r0 = r10.A0N
            if (r0 != 0) goto L_0x0294
            X.5a1 r0 = r10.A0L
            boolean r0 = r10.A25(r0)
            android.widget.TextView r5 = r10.A0U
            if (r0 == 0) goto L_0x028f
            r5.setVisibility(r8)
            r0 = 2131890282(0x7f12106a, float:1.9415251E38)
            r5.setText(r0)
            r0 = 25
            X.AnonymousClass54F.A00(r5, r10, r0)
        L_0x0133:
            if (r12 == 0) goto L_0x0230
            if (r14 == 0) goto L_0x013b
            int r0 = r10.A00
            if (r0 > 0) goto L_0x026a
        L_0x013b:
            r1.setVisibility(r3)
            android.widget.TextView r12 = r10.A0S
            r12.setVisibility(r3)
            X.5UY r0 = r10.A0Y
            r0.A06(r3)
            android.widget.LinearLayout r11 = r10.A0Q
            r0 = 29
            X.AnonymousClass54F.A00(r11, r10, r0)
        L_0x014f:
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L_0x022b
            int r0 = r12.getVisibility()
            if (r0 == 0) goto L_0x022b
            r2.setVisibility(r3)
        L_0x015e:
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x02b8
            int r0 = r12.getVisibility()
            if (r0 != 0) goto L_0x02b8
            r1.setVisibility(r8)
        L_0x016d:
            java.lang.String r4 = r4.A02
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0221
            java.lang.Object r0 = r6.get(r8)
            if (r0 == 0) goto L_0x0221
            boolean r0 = r10.A24()
            if (r0 == 0) goto L_0x0221
            X.8qC r0 = r10.A29
            java.lang.Object r14 = r0.get()
            X.8qC r0 = r10.A28
            java.lang.Object r3 = r0.get()
            X.66o r3 = (X.C1229766o) r3
            X.8qC r0 = r10.A0J
            java.lang.Object r13 = r0.get()
            java.lang.Object r15 = r6.get(r8)
            android.app.Activity r17 = X.C86614Ku.A0A(r10)
            X.4FS r11 = r10.A25
            X.4FV r2 = r10.A0C
            r1 = 27
            X.54F r0 = new X.54F
            r0.<init>(r10, r1)
            X.5f6 r12 = new X.5f6
            r19 = r2
            r20 = r8
            r18 = r11
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 26
            X.54F r1 = new X.54F
            r1.<init>(r10, r0)
            X.5f6 r0 = new X.5f6
            r18 = r0
            r19 = r13
            r20 = r14
            r21 = r15
            r22 = r1
            r23 = r17
            r24 = r11
            r25 = r2
            r26 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r5.setOnClickListener(r0)
            android.widget.LinearLayout r0 = r10.A0Q
            r0.setOnClickListener(r12)
            r9.setText(r4)
            r7.setVisibility(r8)
            r0 = 2131886931(0x7f120353, float:1.9408455E38)
            r7.setText(r0)
            r1 = 2131099936(0x7f060120, float:1.781224E38)
            r0 = 1
            r3.AxS(r7, r1, r0)
            X.5UY r0 = r10.A0X
            android.view.View r0 = X.AnonymousClass5UY.A00(r0, r8)
            r0.setOnClickListener(r12)
        L_0x01f7:
            X.5a1 r2 = r10.A0L
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x02ce
            java.lang.Object r0 = r6.get(r8)
            if (r0 == 0) goto L_0x02ce
            X.1VX r0 = r10.A0O
            boolean r0 = X.AnonymousClass75P.A00(r0)
            if (r0 == 0) goto L_0x02ce
            if (r2 == 0) goto L_0x02ce
            java.lang.String r1 = "3p_full"
            java.lang.String r0 = r2.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02c7
            X.5Ot r0 = r2.A0A
            java.lang.String r0 = r0.A08
            r10.setupViewIfThirdPartyBotContact(r0)
            return
        L_0x0221:
            X.5UY r1 = r10.A0X
            android.view.View r0 = r1.A01
            if (r0 == 0) goto L_0x01f7
            r1.A06(r3)
            goto L_0x01f7
        L_0x022b:
            r2.setVisibility(r8)
            goto L_0x015e
        L_0x0230:
            if (r14 != 0) goto L_0x026a
            X.2sr r0 = r10.A0Z
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0261
            boolean r0 = r10.A24()
            if (r0 != 0) goto L_0x0261
            r1.setVisibility(r8)
            android.widget.TextView r12 = r10.A0S
            r12.setVisibility(r8)
            r0 = 2131886337(0x7f120101, float:1.940725E38)
            r12.setText(r0)
            r0 = 24
            X.AnonymousClass54F.A00(r12, r10, r0)
        L_0x0253:
            android.widget.LinearLayout r11 = r10.A0Q
            r0 = 29
            X.AnonymousClass54F.A00(r11, r10, r0)
        L_0x025a:
            X.5UY r0 = r10.A0Y
            r0.A06(r3)
            goto L_0x014f
        L_0x0261:
            r1.setVisibility(r3)
            android.widget.TextView r12 = r10.A0S
            r12.setVisibility(r3)
            goto L_0x0253
        L_0x026a:
            r1.setVisibility(r3)
            int r0 = r10.A00
            if (r0 <= 0) goto L_0x0284
            android.widget.TextView r12 = r10.A0S
            r12.setVisibility(r3)
            android.widget.LinearLayout r11 = r10.A0Q
            r0 = 28
            X.AnonymousClass54F.A00(r11, r10, r0)
            X.5UY r0 = r10.A0Y
            r0.A06(r8)
            goto L_0x014f
        L_0x0284:
            android.widget.LinearLayout r0 = r10.A0Q
            r0.setOnClickListener(r11)
            android.widget.TextView r12 = r10.A0S
            r12.setVisibility(r3)
            goto L_0x025a
        L_0x028f:
            r5.setVisibility(r3)
            goto L_0x0133
        L_0x0294:
            android.widget.TextView r5 = r10.A0U
            r5.setVisibility(r8)
            r0 = 2131893513(0x7f121d09, float:1.9421805E38)
            r5.setText(r0)
            r0 = 26
            X.AnonymousClass54F.A00(r5, r10, r0)
            goto L_0x0133
        L_0x02a6:
            android.widget.TextView r5 = r10.A0U
            r5.setVisibility(r3)
            android.widget.TextView r0 = r10.A0S
            r0.setVisibility(r3)
            X.5UY r0 = r10.A0Y
            r0.A06(r3)
            r2.setVisibility(r3)
        L_0x02b8:
            r1.setVisibility(r3)
            goto L_0x016d
        L_0x02bd:
            X.3ZH r2 = X.C64773Ex.A00(r1, r5)
            r1 = 1
            goto L_0x00f2
        L_0x02c4:
            r15 = 0
            goto L_0x0103
        L_0x02c7:
            X.4FS r1 = r10.A25
            r0 = 34
            X.C117085rM.A01(r1, r10, r0)
        L_0x02ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92604mx.A01(X.4mx, X.7O9):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r1.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C27981fH getLidUserJid() {
        /*
            r3 = this;
            X.5a1 r1 = r3.A0L
            java.util.List r0 = r1.A06
            if (r0 != 0) goto L_0x0014
            X.7Ik r2 = r1.A09
            X.1fH r1 = r2.A00
            if (r1 == 0) goto L_0x0014
            r0 = 1
            r3.A0N = r0
            java.lang.String r0 = r2.A01
            r3.A0K = r0
            return r1
        L_0x0014:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92604mx.getLidUserJid():X.1fH");
    }

    public void A0v() {
        if (!this.A0M) {
            this.A0M = true;
            C88864av A0C2 = C87094Nz.A0C(this);
            C64333Db r1 = A0C2.A0K;
            C87094Nz.A0W(r1, this);
            C87094Nz.A0X(r1, this);
            C87094Nz.A0Y(r1, this);
            C87094Nz.A0Z(r1, this);
            C87094Nz.A0a(r1, this, C87094Nz.A0D(r1));
            C116985rC A0A2 = C87094Nz.A0A(r1, this);
            C87094Nz.A0R(r1, r1.A00, this);
            C87094Nz.A0M(A0A2, r1, this, r1.A4V);
            C87094Nz.A0S(r1, A0C2, this);
            C87094Nz.A0b(r1, this, C87094Nz.A0E(r1));
            C87094Nz.A0I(A0A2, r1, A0C2, this, C86604Kt.A0i(r1));
            C87094Nz.A0L(A0A2, r1, this);
            this.A02 = (C45742aV) r1.A00.A3s.get();
            this.A05 = C86614Ku.A0Q(r1);
            this.A06 = (C105975Xd) r1.A00.AAt.get();
            this.A0E = C86614Ku.A0l(r1);
            this.A08 = C86604Kt.A0T(r1);
            this.A07 = (C53802nh) r1.A00.A6e.get();
            this.A0B = (AnonymousClass5PP) r1.A00.A1y.get();
            this.A0G = (AnonymousClass2ML) r1.AIy.get();
            this.A03 = (C29291ia) r1.A3w.get();
            this.A0J = C72343dZ.A00(r1.A34);
            this.A01 = A0A2;
            this.A0C = C86604Kt.A0Z(r1);
            this.A04 = r1.Ahy();
            this.A0I = (AnonymousClass2Z2) r1.A2L.get();
            this.A0F = C86634Kw.A0r(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        if (r15.A04 == false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A22() {
        /*
            r20 = this;
            r7 = r20
            X.34x r13 = r7.getFMessage()
            android.widget.TextView r1 = r7.A0V
            X.2z0 r0 = r13.A1J
            r1.setTag(r0)
            X.4fd r1 = r7.A0H
            if (r1 == 0) goto L_0x0016
            X.4up r0 = r7.A0Z
            r0.A04(r1)
        L_0x0016:
            X.4up r1 = r7.A0Z
            monitor-enter(r1)
            r3 = 0
            java.lang.Runnable r2 = r1.A02(r13, r3)     // Catch:{ all -> 0x00d3 }
            monitor-exit(r1)
            X.4fd r2 = (X.C90004fd) r2
            r7.A0H = r2
            r0 = 1
            X.92X r1 = new X.92X
            r1.<init>(r7, r0)
            X.3Wi r0 = r7.A0X
            java.util.concurrent.Executor r0 = r0.A08
            r2.A04(r1, r0)
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = X.C615731j.A01(r0, r13)
            r7.A23(r0)
            X.5UX r2 = r7.A05
            android.widget.ImageView r1 = r7.A0P
            r0 = 2131231006(0x7f08011e, float:1.807808E38)
            r2.A06(r1, r0)
            r0 = 1024(0x400, float:1.435E-42)
            boolean r1 = r13.A1s(r0)
            r0 = 2131434886(0x7f0b1d86, float:1.8491599E38)
            if (r1 == 0) goto L_0x00bc
            android.view.ViewGroup r2 = X.C86644Kx.A0J(r7, r0)
            if (r2 == 0) goto L_0x00bb
            X.1VX r1 = r7.A0O
            X.5Zz r0 = r7.A1Z
            X.32K r15 = X.AnonymousClass32K.A00(r1, r0, r13)
            r0 = 0
            r2.setVisibility(r0)
            X.5Xl r0 = r7.A0A
            if (r0 != 0) goto L_0x0098
            android.content.Context r4 = r7.getContext()
            X.679 r8 = r7.A0n
            X.4Fm r5 = r7.A0Y
            X.2rN r11 = r7.A0F
            X.5nM r9 = r7.A1M
            X.1sV r12 = r7.A22
            X.5KC r6 = r7.A1B()
            X.5rC r1 = r7.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0083
            r1.A04()
        L_0x0083:
            X.1VX r10 = r7.A0O
            X.5Xl r3 = new X.5Xl
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r7.A0A = r3
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r3.A0D
            X.C86624Kv.A15(r0, r2)
            X.5Xl r0 = r7.A0A
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0D
            X.C93314oJ.A0q(r0, r7)
        L_0x0098:
            X.66v r14 = r7.A0a
            boolean r0 = r14 instanceof X.C116505qO
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r15.A04
            r1 = 1
            if (r0 != 0) goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            r7.A0O = r1
            X.5Xl r12 = r7.A0A
            X.5PP r0 = r7.A0B
            boolean r17 = r0.A00(r13)
            X.5PP r0 = r7.A0B
            boolean r18 = r0.A01(r13)
            r19 = 0
            r16 = r1
            r12.A04(r13, r14, r15, r16, r17, r18, r19)
        L_0x00bb:
            return
        L_0x00bc:
            android.view.ViewGroup r1 = X.C86644Kx.A0J(r7, r0)
            if (r1 == 0) goto L_0x00bb
            X.5Xl r0 = r7.A0A
            if (r0 == 0) goto L_0x00cd
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0D
            r1.removeView(r0)
            r7.A0A = r3
        L_0x00cd:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92604mx.A22():void");
    }

    public final void A23(String str) {
        CharSequence A022;
        String A0C2 = C107575bX.A0C(str, 128);
        Context context = getContext();
        TextView textView = this.A0V;
        TextPaint paint = textView.getPaint();
        AnonymousClass5Y0 r1 = this.A1R;
        if (A0C2 == null) {
            A022 = null;
        } else {
            A022 = C107345b9.A02(context, paint, new AnonymousClass8GT(), r1, A0C2);
        }
        textView.setText(A1E(A022));
    }

    public final boolean A24() {
        List list;
        C56722sS r4 = (C56722sS) this.A29.get();
        C106705a1 r0 = this.A0L;
        if (r0 == null || (list = r0.A06) == null || list.size() != 1 || list.get(0) == null || !C155477ey.A00(((AnonymousClass7OD) list.get(0)).A01)) {
            return false;
        }
        return C56952sp.A0K(r4.A01.A03, 4165, false);
    }

    public int getMainChildMaxWidth() {
        if (this.A0n.BHf(getFMessage())) {
            return 0;
        }
        int A062 = C87094Nz.A06(this);
        if (this.A0O) {
            return Math.min(A062, AnonymousClass5YO.A02(this));
        }
        return A062;
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void onDetachedFromWindow() {
        C33981u0 r1 = this.A09;
        if (r1 != null) {
            r1.A0D(true);
            this.A09 = null;
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.AnonymousClass31H.A02(r3) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.C624134x r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C30421mQ
            if (r0 != 0) goto L_0x000b
            boolean r1 = X.AnonymousClass31H.A02(r3)
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C626936e.A0C(r0)
            r2.A0S = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92604mx.setFMessage(X.34x):void");
    }

    public C92604mx(Context context, C105365Uq r4, AnonymousClass677 r5, C624134x r6, C95894up r7) {
        super(context, r5, r6);
        A0v();
        this.A0W = r4;
        this.A0Z = r7;
        this.A0V = AnonymousClass002.A09(this, R.id.vcard_text);
        this.A0R = AnonymousClass002.A09(this, R.id.account_type);
        this.A0T = AnonymousClass002.A09(this, R.id.description);
        this.A0P = AnonymousClass0x9.A0F(this, R.id.picture);
        this.A0U = AnonymousClass002.A09(this, R.id.msg_contact_btn);
        this.A0S = AnonymousClass002.A09(this, R.id.action_contact_btn);
        this.A0X = AnonymousClass0x2.A0M(this, R.id.action_view_ai_container);
        AnonymousClass5UY A0M2 = AnonymousClass0x2.A0M(this, R.id.action_view_business_container);
        this.A0Y = A0M2;
        AnonymousClass5UY.A02(A0M2, this, 4);
        LinearLayout A0v = C86664Kz.A0v(this, R.id.contact_card);
        this.A0Q = A0v;
        C93314oJ.A0q(A0v, this);
        this.A0a = C107315b6.A01(context);
        A22();
    }

    /* access modifiers changed from: private */
    public void setupViewIfThirdPartyBotContact(String str) {
        TextView A092;
        int color = getResources().getColor(R.color.f5nameremoved);
        AnonymousClass54F r5 = new AnonymousClass54F(this, 28);
        TextView textView = this.A0U;
        C109345eT.A00(textView, this, 17);
        textView.setTextColor(color);
        TextView textView2 = this.A0V;
        textView2.setText(str);
        C18320x8.A11(getResources(), textView2, R.color.f5nameremoved);
        TextView textView3 = this.A0R;
        textView3.setVisibility(0);
        textView3.setText(R.string.f11nameremoved);
        C109475eg.A00(this.A0Q, this, r5, 9);
        AnonymousClass5UY r2 = this.A0X;
        C109475eg.A00(AnonymousClass5UY.A00(r2, 0), this, r5, 10);
        View A042 = r2.A04();
        if (!(A042 == null || (A092 = AnonymousClass002.A09(A042, R.id.action_view_ai_btn)) == null)) {
            A092.setTextColor(color);
        }
        this.A0Y.A06(8);
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A0V.getText());
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.A0V.getText());
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
