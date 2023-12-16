package com.whatsapp.payments.ui.orderdetails;

import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass39L;
import X.AnonymousClass4DV;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass4Tu;
import X.AnonymousClass5SZ;
import X.AnonymousClass5UW;
import X.AnonymousClass9QL;
import X.AnonymousClass9XZ;
import X.C06560Yg;
import X.C101195Dv;
import X.C103115Lp;
import X.C104205Qb;
import X.C105145Tt;
import X.C106715a2;
import X.C107695bk;
import X.C111685iW;
import X.C114015mM;
import X.C116855qy;
import X.C152967aS;
import X.C154197cm;
import X.C181798nL;
import X.C1899593h;
import X.C1899693i;
import X.C1907099n;
import X.C194069Rl;
import X.C195219Wq;
import X.C196849bq;
import X.C203479nl;
import X.C204209oz;
import X.C29441ip;
import X.C33141sV;
import X.C53762nc;
import X.C54292oU;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C86604Kt;
import X.C86654Ky;
import X.C88834as;
import X.C88864av;
import X.C95814uZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

public class PaymentCheckoutOrderDetailsViewV2 extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public LinearLayout A01;
    public RelativeLayout A02;
    public RelativeLayout A03;
    public RelativeLayout A04;
    public RelativeLayout A05;
    public RecyclerView A06;
    public C101195Dv A07;
    public TextEmojiLabel A08;
    public TextEmojiLabel A09;
    public WaButtonWithLoader A0A;
    public WaButtonWithLoader A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public C53762nc A0G;
    public AnonymousClass5UW A0H;
    public C154197cm A0I;
    public C105145Tt A0J;
    public C104205Qb A0K;
    public C152967aS A0L;
    public C181798nL A0M;
    public AnonymousClass4Tu A0N;
    public C29441ip A0O;
    public C114015mM A0P;
    public C620633i A0Q;
    public C54292oU A0R;
    public C620733j A0S;
    public AnonymousClass1VX A0T;
    public C103115Lp A0U;
    public AnonymousClass5SZ A0V;
    public C1907099n A0W;
    public C195219Wq A0X;
    public C106715a2 A0Y;
    public C33141sV A0Z;
    public AnonymousClass4FS A0a;
    public WDSButton A0b;
    public C116855qy A0c;
    public boolean A0d;

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void A01(Context context, C194069Rl r17, AnonymousClass9QL r18, String str) {
        String str2 = str;
        C194069Rl r4 = r17;
        AnonymousClass9QL r13 = r18;
        if (!this.A0V.A02(new C196849bq(context, this, r4, r13, str2))) {
            C203479nl r0 = r13.A0A;
            AnonymousClass4DV r5 = r13.A0B;
            C95814uZ r2 = r13.A08;
            AnonymousClass39L r1 = r13.A06;
            String str3 = r13.A0L;
            AnonymousClass9XZ r3 = r13.A09;
            String str4 = r13.A0D;
            HashMap hashMap = r13.A0M;
            if (str == null) {
                str2 = "order_details";
            }
            r0.BOs(r1, r2, r3, r4, r5, str3, str4, str2, hashMap);
        }
    }

    public boolean A03(C194069Rl r4, AnonymousClass9QL r5, int i) {
        if (r5.A0T && i != 4) {
            if (r4 == null) {
                C1899593h.A1Q("PaymentCheckoutOrderDetailsViewV2", "renderUi, this payment method is not supported");
            } else {
                this.A0B.A00 = new C204209oz(r4, this, r5, 8);
                return true;
            }
        }
        return false;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0c;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0c = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0074 A[EDGE_INSN: B:58:0x0074->B:23:0x0074 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C194069Rl A00(X.AnonymousClass213 r12, X.AnonymousClass9QL r13, java.lang.String r14, java.util.List r15, int r16) {
        /*
            r11 = this;
            android.content.Context r3 = r11.getContext()
            X.1VX r1 = r11.A0T
            r0 = 1767(0x6e7, float:2.476E-42)
            java.lang.String r0 = r1.A0Q(r0)
            r6 = 0
            java.util.Map r2 = X.AnonymousClass9UM.A02(r0)
            X.9Xj r1 = X.AnonymousClass9UM.A00(r3, r15)
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "checkout_lite"
            r2.put(r0, r1)
        L_0x001c:
            java.lang.Object r0 = r2.get(r14)
            X.9Xj r0 = (X.C195339Xj) r0
            r10 = 1
            r1 = r16
            if (r1 != r10) goto L_0x003b
            if (r0 == 0) goto L_0x003b
            X.2nc r2 = r11.A0G
            java.lang.String r1 = r0.A05
            java.lang.String r0 = r0.A04
            java.lang.String r8 = X.C1899593h.A0b(r2, r1, r0)
            X.9Rl r5 = new X.9Rl
            r9 = r6
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x003a:
            return r5
        L_0x003b:
            X.213 r0 = X.AnonymousClass213.NONE
            if (r12 != r0) goto L_0x00a4
            java.util.HashMap r0 = r13.A0M
            java.lang.Object r5 = X.C18290x4.A0j(r0, r1)
        L_0x0045:
            X.9Rl r5 = (X.C194069Rl) r5
            if (r5 == 0) goto L_0x003a
        L_0x0049:
            X.213 r0 = X.AnonymousClass213.INACTIVE
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0074
            boolean r0 = r13.A0O
            if (r0 == 0) goto L_0x0074
            java.lang.String r4 = "WhatsappPay"
            r3 = 0
        L_0x0058:
            java.util.List r2 = r13.A0N
            int r0 = r2.size()
            r1 = -1
            if (r3 >= r0) goto L_0x0074
            java.lang.Object r0 = r2.get(r3)
            X.9Xj r0 = (X.C195339Xj) r0
            java.lang.String r0 = r0.A0A
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            if (r3 <= r1) goto L_0x0074
            r2.remove(r3)
        L_0x0074:
            int r3 = r5.A01
            r2 = -1
            if (r3 == r2) goto L_0x009d
            if (r3 == 0) goto L_0x009d
            android.widget.LinearLayout r1 = r11.A01
            r0 = 8
        L_0x007f:
            r1.setVisibility(r0)
            if (r3 != r2) goto L_0x003a
            X.99n r0 = r11.A0W
            boolean r2 = r0.A0G()
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131896202(0x7f12278a, float:1.9427259E38)
            if (r2 == 0) goto L_0x0096
            r0 = 2131891414(0x7f1214d6, float:1.9417547E38)
        L_0x0096:
            java.lang.String r0 = r1.getString(r0)
            r5.A00 = r0
            return r5
        L_0x009d:
            android.widget.LinearLayout r1 = r11.A01
            r0 = 0
            goto L_0x007f
        L_0x00a1:
            int r3 = r3 + 1
            goto L_0x0058
        L_0x00a4:
            X.213 r0 = X.AnonymousClass213.ACTIVE
            r5 = 3
            if (r12 != r0) goto L_0x00cf
            r4 = 0
            r3 = 1
        L_0x00ab:
            java.util.HashMap r2 = r13.A0M
            java.util.Iterator r1 = X.AnonymousClass001.A0u(r2)
        L_0x00b1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r1)
            java.lang.Object r0 = r0.getKey()
            int r0 = X.AnonymousClass001.A0K(r0)
            if (r0 == r4) goto L_0x00b1
            if (r0 == r5) goto L_0x00b1
            if (r0 == 0) goto L_0x00b1
            if (r4 != r5) goto L_0x00cc
            r4 = r0
        L_0x00cc:
            int r3 = r3 + 1
            goto L_0x00b1
        L_0x00cf:
            X.213 r0 = X.AnonymousClass213.INACTIVE
            if (r12 != r0) goto L_0x00eb
            r4 = 3
            r3 = 0
            goto L_0x00ab
        L_0x00d6:
            if (r3 <= r10) goto L_0x00e5
            java.lang.String r8 = ""
            r10 = -1
            java.util.List r9 = r13.A0N
            X.9Rl r5 = new X.9Rl
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0049
        L_0x00e5:
            java.lang.Object r5 = X.C18290x4.A0j(r2, r4)
            goto L_0x0045
        L_0x00eb:
            java.lang.String r0 = "Unknown merchant status"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2.A00(X.213, X.9QL, java.lang.String, java.util.List, int):X.9Rl");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01de  */
    public void A02(X.C009707r r39, X.C56972sr r40, X.AnonymousClass213 r41, X.AnonymousClass9QL r42, java.lang.String r43, java.util.List r44, int r45, int r46) {
        /*
            r38 = this;
            r6 = r38
            X.2oU r9 = r6.A0R
            X.1VX r8 = r6.A0T
            X.5a2 r7 = r6.A0Y
            X.5mM r3 = r6.A0P
            X.9Wq r2 = r6.A0X
            X.33i r0 = r6.A0Q
            r37 = r0
            X.7aS r1 = r6.A0L
            X.99n r0 = r6.A0W
            r36 = r0
            X.33j r0 = r6.A0S
            r35 = r0
            X.1sV r0 = r6.A0Z
            X.2nc r4 = r6.A0G
            X.95C r5 = new X.95C
            r10 = r40
            r13 = r3
            r14 = r37
            r15 = r9
            r16 = r35
            r17 = r8
            r18 = r36
            r19 = r2
            r20 = r7
            r21 = r0
            r9 = r5
            r11 = r4
            r12 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r9 = r42
            X.34w r7 = r9.A07
            if (r7 == 0) goto L_0x03fa
            X.1S4 r0 = r7.A0A
            if (r0 == 0) goto L_0x03fa
            X.9Xg r18 = r0.A0D()
        L_0x0046:
            r11 = r41
            r17 = r43
            r1 = r44
            r15 = r45
            r10 = r6
            r12 = r9
            r13 = r17
            r14 = r1
            X.9Rl r14 = r10.A00(r11, r12, r13, r14, r15)
            boolean r13 = r9.A0S
            r2 = 8
            r3 = 0
            r16 = r46
            if (r13 == 0) goto L_0x0395
            android.widget.RelativeLayout r0 = r6.A03
            r0.setVisibility(r3)
            android.widget.RelativeLayout r0 = r6.A04
            r0.setVisibility(r2)
            android.view.View r0 = r6.A00
            r0.setVisibility(r3)
            android.widget.RelativeLayout r0 = r6.A05
            r0.setVisibility(r3)
            com.whatsapp.WaButtonWithLoader r2 = r6.A0A
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131888081(0x7f1207d1, float:1.9410787E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setButtonText((java.lang.String) r0)
            X.4DV r0 = r9.A0B
            X.39W r0 = r0.B5s()
            X.C626936e.A06(r0)
            X.39S r0 = r0.A01
            X.C626936e.A06(r0)
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0392
            java.lang.String r0 = "pix"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x037e
            r4 = 6
        L_0x009f:
            com.whatsapp.wds.components.button.WDSButton r3 = r6.A0b
            r1 = 0
            X.9p5 r0 = new X.9p5
            r0.<init>(r9, r4, r1)
            r3.setOnClickListener(r0)
            r1 = 1
            X.9p5 r0 = new X.9p5
            r0.<init>(r9, r4, r1)
            r2.A00 = r0
        L_0x00b2:
            android.content.Context r12 = r6.getContext()
            X.4DV r0 = r9.A0B
            r34 = r0
            X.39W r1 = r34.B5s()
            X.C626936e.A06(r1)
            X.39S r0 = r1.A01
            X.C626936e.A06(r0)
            X.39S r0 = r1.A01
            X.39H r0 = r0.A07
            java.util.List r0 = r0.A09
            X.C626936e.A06(r0)
            java.util.List r4 = r5.A0C
            r4.clear()
            X.39S r11 = r1.A01
            X.39W r10 = r34.B5s()
            X.C626936e.A06(r10)
            X.39S r0 = r10.A01
            X.C626936e.A06(r0)
            X.39S r0 = r10.A01
            X.39H r0 = r0.A07
            java.util.List r0 = r0.A09
            X.C626936e.A06(r0)
            r4.clear()
            int r15 = r4.size()
            X.39S r0 = r10.A01
            X.C626936e.A06(r0)
            X.9Wq r0 = r5.A09
            r33 = r0
            X.99n r1 = r0.A0C
            java.lang.String r3 = r11.A0D
            java.util.List r0 = r11.A0K
            r32 = r0
            boolean r0 = r1.A0L(r3, r0)
            if (r0 == 0) goto L_0x0112
            if (r7 == 0) goto L_0x0112
            boolean r1 = r7.A0M()
            r0 = 1
            if (r1 != 0) goto L_0x0113
        L_0x0112:
            r0 = 0
        L_0x0113:
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x02b2
            X.39H r0 = r11.A07
            java.lang.String r0 = r0.A01
            int r0 = X.AnonymousClass39S.A00(r0)
            if (r0 != r2) goto L_0x02b2
            r10 = 2131232576(0x7f080740, float:1.8081265E38)
            r0 = 2131894470(0x7f1220c6, float:1.9423746E38)
            java.lang.String r2 = r12.getString(r0)
            r0 = 2131891584(0x7f121580, float:1.9417892E38)
        L_0x012e:
            java.lang.String r0 = r12.getString(r0)
            X.9E4 r13 = new X.9E4
            r13.<init>(r1, r2, r0, r10)
        L_0x0137:
            r4.add(r13)
        L_0x013a:
            r2 = 2131167679(0x7f0709bf, float:1.7949638E38)
            r1 = 0
            X.9E2 r0 = new X.9E2
            r0.<init>(r1, r2, r1)
            r4.add(r0)
            X.3ZH r13 = r9.A04
            boolean r10 = r9.A0P
            java.lang.String r0 = r9.A0E
            r31 = r0
            java.lang.String r14 = r9.A0J
            X.9E3 r2 = new X.9E3
            r2.<init>(r13, r0, r14, r10)
            r4.add(r2)
            X.99n r2 = r5.A08
            boolean r23 = r2.A0K(r3)
            boolean r3 = r9.A0R
            java.lang.String r15 = r9.A0I
            X.39L r10 = r9.A06
            X.4Fi r14 = r10.A01
            r13 = 1
            if (r23 == 0) goto L_0x0171
            r0 = r16
            if (r0 != r13) goto L_0x0171
            r25 = 0
            if (r3 != 0) goto L_0x0173
        L_0x0171:
            r25 = 1
        L_0x0173:
            X.9E5 r0 = new X.9E5
            r19 = r0
            r20 = r14
            r21 = r15
            r22 = r16
            r24 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r4.add(r0)
            X.39H r3 = r11.A07
            java.lang.String r13 = r3.A08
            java.lang.String r0 = "PAYMENT_REQUEST"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x022c
            X.1VX r13 = r2.A02
            r0 = 5574(0x15c6, float:7.811E-42)
            boolean r0 = r13.A0X(r0)
            if (r0 != 0) goto L_0x01a3
            r0 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = r13.A0X(r0)
            if (r0 == 0) goto L_0x022c
        L_0x01a3:
            java.lang.String r0 = r9.A0D
            X.9Dz r10 = new X.9Dz
            r10.<init>(r0)
        L_0x01aa:
            r4.add(r10)
        L_0x01ad:
            r3 = 2130970953(0x7f040949, float:1.755063E38)
            r0 = 2131102580(0x7f060b74, float:1.7817602E38)
            int r10 = X.AnonymousClass5Yj.A02(r12, r3, r0)
            r3 = 2131165327(0x7f07008f, float:1.7944868E38)
            X.4Fi r0 = r11.A06
            X.C626936e.A06(r0)
            android.graphics.drawable.Drawable r16 = X.C195219Wq.A03(r12, r0, r10, r3)
            r10 = 180(0xb4, float:2.52E-43)
            r3 = 2131167680(0x7f0709c0, float:1.794964E38)
            X.9E2 r0 = new X.9E2
            r0.<init>(r10, r1, r3)
            r4.add(r0)
            if (r23 == 0) goto L_0x01e6
            boolean r0 = r9.A0T
            if (r0 == 0) goto L_0x01e6
            java.lang.String r1 = r9.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01e6
            X.9Dy r0 = new X.9Dy
            r0.<init>(r1)
            r4.add(r0)
        L_0x01e6:
            boolean r14 = r9.A0Q
            boolean r15 = r9.A0U
            X.9nl r13 = r9.A0A
            X.4uZ r11 = r9.A08
            java.lang.String r12 = r9.A0L
            long r0 = r9.A01
            X.9O6 r10 = r9.A05
            X.9E8 r3 = new X.9E8
            r18 = r7
            r19 = r11
            r20 = r13
            r21 = r34
            r22 = r12
            r23 = r31
            r24 = r0
            r26 = r14
            r27 = r15
            r15 = r3
            r17 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27)
            r4.add(r3)
            r0 = r32
            boolean r0 = r2.A0M(r0)
            if (r0 == 0) goto L_0x0225
            boolean r0 = r9.A0T
            if (r0 != 0) goto L_0x0225
            X.9Dw r0 = new X.9Dw
            r0.<init>()
            r4.add(r0)
        L_0x0225:
            if (r14 != 0) goto L_0x0419
            if (r7 == 0) goto L_0x0419
            monitor-enter(r7)
            goto L_0x03fe
        L_0x022c:
            java.util.List r0 = r3.A09
            X.C626936e.A06(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0235:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x024c
            java.lang.Object r13 = r14.next()
            X.39F r13 = (X.AnonymousClass39F) r13
            X.9E1 r3 = new X.9E1
            r0 = r34
            r3.<init>(r13, r0)
            r4.add(r3)
            goto L_0x0235
        L_0x024c:
            boolean r0 = r9.A0V
            if (r0 == 0) goto L_0x026c
            java.lang.String r14 = r9.A0L
            X.9nl r13 = r9.A0A
            java.util.List r3 = r9.A0N
            X.9E6 r0 = new X.9E6
            r24 = r0
            r25 = r10
            r26 = r13
            r27 = r34
            r28 = r14
            r29 = r17
            r30 = r3
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r4.add(r0)
        L_0x026c:
            X.33j r14 = r5.A06
            boolean r13 = r9.A0W
            java.lang.String r10 = r9.A0F
            java.lang.String r3 = r9.A0H
            X.9E7 r0 = new X.9E7
            r19 = r11
            r20 = r10
            r21 = r3
            r22 = r13
            r15 = r0
            r16 = r12
            r17 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r4.add(r0)
            java.lang.String r3 = r9.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x01ad
            X.2sr r0 = r5.A00
            X.4uZ r10 = r9.A08
            boolean r0 = r0.A0a(r10)
            if (r0 != 0) goto L_0x01ad
            X.1VX r13 = r5.A07
            r0 = 6012(0x177c, float:8.425E-42)
            boolean r0 = r13.A0X(r0)
            if (r0 != 0) goto L_0x01ad
            r0 = r33
            boolean r0 = r0.A0t(r10)
            X.9E0 r10 = new X.9E0
            r10.<init>(r3, r0)
            goto L_0x01aa
        L_0x02b2:
            X.39S r0 = r10.A01
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x02d3
            boolean r0 = r9.A0T
            if (r0 == 0) goto L_0x02d3
            r10 = 2131232346(0x7f08065a, float:1.8080799E38)
            r0 = 2131891577(0x7f121579, float:1.9417878E38)
            java.lang.String r2 = r12.getString(r0)
            r13 = 2
            X.9pH r0 = new X.9pH
            r0.<init>(r4, r5, r15, r13)
            X.9E4 r13 = new X.9E4
            r13.<init>(r0, r1, r2, r10)
            goto L_0x0137
        L_0x02d3:
            r10 = 0
            if (r13 == 0) goto L_0x02eb
            r14 = 2131232346(0x7f08065a, float:1.8080799E38)
            r13 = 2131891490(0x7f121522, float:1.9417702E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r9.A0E
            java.lang.String r0 = X.AnonymousClass002.A0F(r12, r0, r2, r10, r13)
            X.9E4 r13 = new X.9E4
            r13.<init>(r1, r1, r0, r14)
            goto L_0x0137
        L_0x02eb:
            X.99n r0 = r5.A08
            X.1VX r13 = r0.A02
            r0 = 4252(0x109c, float:5.958E-42)
            org.json.JSONObject r13 = r13.A0S(r0)
            java.lang.String r0 = "buyer_ed_nudge_enabled"
            boolean r15 = r13.has(r0)
            if (r15 == 0) goto L_0x013a
            int r0 = r13.getInt(r0)     // Catch:{ JSONException -> 0x0376 }
            if (r0 != r2) goto L_0x013a
            boolean r0 = r9.A0T
            if (r0 == 0) goto L_0x013a
            if (r14 == 0) goto L_0x013a
            int r13 = r14.A01
            r0 = -1
            if (r13 != r0) goto L_0x032a
            r10 = 2131232346(0x7f08065a, float:1.8080799E38)
            X.2dl r2 = X.AnonymousClass2BO.A00
            X.1VX r0 = r5.A07
            boolean r2 = r2.A01(r0)
            r0 = 2131891488(0x7f121520, float:1.9417697E38)
            if (r2 == 0) goto L_0x0321
            r0 = 2131891489(0x7f121521, float:1.94177E38)
        L_0x0321:
            java.lang.String r2 = r12.getString(r0)
            r0 = 2131891487(0x7f12151f, float:1.9417695E38)
            goto L_0x012e
        L_0x032a:
            r0 = 2
            if (r13 != r0) goto L_0x033c
            r10 = 2131232346(0x7f08065a, float:1.8080799E38)
            r0 = 2131891486(0x7f12151e, float:1.9417693E38)
            java.lang.String r2 = r12.getString(r0)
            r0 = 2131891485(0x7f12151d, float:1.9417691E38)
            goto L_0x012e
        L_0x033c:
            r14 = 3
            if (r13 != r14) goto L_0x013a
            X.2dl r0 = X.AnonymousClass2BO.A00
            X.1VX r13 = r5.A07
            boolean r15 = r0.A01(r13)
            r0 = 2131891483(0x7f12151b, float:1.9417687E38)
            if (r15 == 0) goto L_0x034f
            r0 = 2131891484(0x7f12151c, float:1.941769E38)
        L_0x034f:
            java.lang.String r15 = r12.getString(r0)
            X.C162457s7.A0J(r13, r10)
            r0 = 4248(0x1098, float:5.953E-42)
            int r13 = r13.A0N(r0)
            r0 = 2131891481(0x7f121519, float:1.9417683E38)
            if (r13 != r14) goto L_0x0364
            r0 = 2131891482(0x7f12151a, float:1.9417685E38)
        L_0x0364:
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.String r2 = r9.A0E
            java.lang.String r2 = X.AnonymousClass002.A0F(r12, r2, r13, r10, r0)
            r0 = 2131232346(0x7f08065a, float:1.8080799E38)
            X.9E4 r13 = new X.9E4
            r13.<init>(r1, r15, r2, r0)
            goto L_0x0137
        L_0x0376:
            r1 = move-exception
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_ED_CAPABILITIES_CODE#buyer_ed_nudge_enabled"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x013a
        L_0x037e:
            java.lang.String r0 = "confirm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0389
            r4 = 3
            goto L_0x009f
        L_0x0389:
            java.lang.String r0 = "payment_instruction"
            boolean r0 = r0.equals(r1)
            r4 = 2
            if (r0 != 0) goto L_0x009f
        L_0x0392:
            r4 = -1
            goto L_0x009f
        L_0x0395:
            r0 = r16
            boolean r0 = r6.A03(r14, r9, r0)
            if (r0 == 0) goto L_0x03ea
            android.widget.RelativeLayout r0 = r6.A03
            r0.setVisibility(r3)
            android.widget.RelativeLayout r0 = r6.A04
            r0.setVisibility(r3)
            android.view.View r0 = r6.A00
            r0.setVisibility(r3)
            android.content.Context r0 = r6.getContext()
            java.util.Map r1 = X.AnonymousClass9UM.A01(r0, r8, r1)
            r0 = r17
            java.lang.Object r0 = r1.get(r0)
            X.9Xj r0 = (X.C195339Xj) r0
            if (r0 != 0) goto L_0x03df
            if (r14 == 0) goto L_0x03d6
            java.lang.String r0 = r14.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03d6
            com.whatsapp.WaButtonWithLoader r3 = r6.A0B
            java.lang.String r0 = r14.A00
        L_0x03cc:
            r3.setButtonText((java.lang.String) r0)
        L_0x03cf:
            android.widget.RelativeLayout r0 = r6.A05
            r0.setVisibility(r2)
            goto L_0x00b2
        L_0x03d6:
            com.whatsapp.WaButtonWithLoader r1 = r6.A0B
            r0 = 2131896202(0x7f12278a, float:1.9427259E38)
            r1.setButtonText((int) r0)
            goto L_0x03cf
        L_0x03df:
            com.whatsapp.WaButtonWithLoader r3 = r6.A0B
            java.lang.String r1 = r0.A05
            java.lang.String r0 = r0.A04
            java.lang.String r0 = X.C1899593h.A0b(r4, r1, r0)
            goto L_0x03cc
        L_0x03ea:
            android.view.View r0 = r6.A00
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r6.A03
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r6.A04
            r0.setVisibility(r2)
            goto L_0x03cf
        L_0x03fa:
            r18 = 0
            goto L_0x0046
        L_0x03fe:
            X.1S4 r0 = r7.A0A     // Catch:{ all -> 0x040a }
            if (r0 == 0) goto L_0x040d
            boolean r1 = r0.A0c()     // Catch:{ all -> 0x040a }
            r0 = 1
            if (r1 != 0) goto L_0x040e
            goto L_0x040d
        L_0x040a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x040d:
            r0 = 0
        L_0x040e:
            monitor-exit(r7)
            if (r0 == 0) goto L_0x0419
            X.9Dx r0 = new X.9Dx
            r0.<init>(r11)
            r4.add(r0)
        L_0x0419:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A06
            r0.setAdapter(r5)
            com.whatsapp.WaTextView r10 = r6.A0F
            java.lang.String r0 = r9.A0D
            r10.setText(r0)
            com.whatsapp.WaTextView r7 = r6.A0D
            r4 = 8
            r7.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r3 = r6.A08
            r3.setVisibility(r4)
            boolean r0 = r9.A0W
            r2 = 0
            com.whatsapp.WaTextView r1 = r6.A0E
            if (r0 == 0) goto L_0x04d9
            r1.setVisibility(r4)
            r10.setVisibility(r4)
        L_0x043e:
            X.39W r0 = r34.B5s()
            X.C626936e.A06(r0)
            X.39S r12 = r0.A01
            X.C626936e.A06(r12)
            java.lang.String r13 = r12.A0D
            r0 = r36
            boolean r14 = r0.A0K(r13)
            java.lang.String r13 = r9.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x04d3
            if (r14 != 0) goto L_0x04d3
            com.whatsapp.WaTextView r0 = r6.A0C
            r0.setText(r13)
            r0.setVisibility(r2)
        L_0x0464:
            android.widget.LinearLayout r0 = r6.A01
            r0.setVisibility(r4)
            java.lang.CharSequence r13 = r9.A0C
            boolean r9 = android.text.TextUtils.isEmpty(r13)
            com.whatsapp.TextEmojiLabel r0 = r6.A09
            if (r9 == 0) goto L_0x04c9
            r0.setVisibility(r4)
        L_0x0476:
            android.widget.RelativeLayout r8 = r6.A02
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0496
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L_0x0496
            int r0 = r10.getVisibility()
            if (r0 == 0) goto L_0x0496
            int r0 = r7.getVisibility()
            if (r0 == 0) goto L_0x0496
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0497
        L_0x0496:
            r4 = 0
        L_0x0497:
            r8.setVisibility(r4)
            boolean r0 = r11 instanceof com.whatsapp.jid.UserJid
            X.C626936e.A0B(r0)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            X.39H r0 = r12.A07
            java.util.List r8 = r0.A09
            X.C626936e.A06(r8)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r8.iterator()
        L_0x04b0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0541
            java.lang.Object r0 = r3.next()
            X.39F r0 = (X.AnonymousClass39F) r0
            java.lang.String r1 = r0.A00()
            X.392 r0 = new X.392
            r0.<init>((java.lang.String) r1)
            r7.add(r0)
            goto L_0x04b0
        L_0x04c9:
            X.AnonymousClass0x2.A14(r8, r0)
            r0.setVisibility(r2)
            r0.setText(r13)
            goto L_0x0476
        L_0x04d3:
            com.whatsapp.WaTextView r0 = r6.A0C
            r0.setVisibility(r4)
            goto L_0x0464
        L_0x04d9:
            r1.setVisibility(r2)
            r10.setVisibility(r2)
            X.9XZ r12 = r9.A09
            android.text.SpannableString r0 = r9.A02
            r17 = r0
            if (r12 == 0) goto L_0x043e
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x043e
            r0 = 4443(0x115b, float:6.226E-42)
            boolean r0 = r8.A0X(r0)
            if (r0 == 0) goto L_0x043e
            X.38n r12 = r12.A00()
            if (r12 == 0) goto L_0x043e
            int r0 = r12.A00
            X.39L r12 = r12.A01
            if (r12 == 0) goto L_0x043e
            android.content.res.Resources r16 = r6.getResources()
            r14 = 2131891769(0x7f121639, float:1.9418267E38)
            java.lang.Object[] r13 = X.AnonymousClass002.A0M()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13[r2] = r0
            X.4Fi r15 = X.AnonymousClass1S3.A04
            X.39Q r0 = r12.A02
            java.math.BigDecimal r12 = r0.A00
            r0 = r35
            java.lang.String r15 = r15.B3W(r0, r12)
            r12 = 1
            r0 = r16
            java.lang.String r0 = X.C18320x8.A0b(r0, r15, r13, r12, r14)
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x053c
            r3.setVisibility(r2)
            r0 = r37
            X.AnonymousClass0x2.A12(r3, r0)
            X.AnonymousClass0x2.A14(r8, r3)
            r0 = r17
            r3.setText(r0)
        L_0x053c:
            r7.setVisibility(r2)
            goto L_0x043e
        L_0x0541:
            r0 = 0
            X.396 r4 = new X.396
            r4.<init>(r0, r7)
            java.lang.Object r0 = r8.get(r2)
            X.39F r0 = (X.AnonymousClass39F) r0
            java.lang.String r1 = r0.A00()
            if (r1 != 0) goto L_0x0555
            java.lang.String r1 = ""
        L_0x0555:
            byte[] r0 = r12.A0M
            X.39B r3 = new X.39B
            r3.<init>(r0, r1, r2)
            java.util.List r0 = java.util.Collections.singletonList(r4)
            X.39E r1 = new X.39E
            r1.<init>(r11, r3, r0)
            X.4Tu r0 = r6.A0N
            r3 = r39
            if (r0 != 0) goto L_0x058b
            X.8nL r0 = r6.A0M
            X.5Qn r9 = r0.Azv(r11)
            X.5Lp r0 = r6.A0U
            X.5Dv r8 = r6.A07
            X.5go r7 = new X.5go
            r10 = r11
            r11 = r0
            r12 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            X.0XL r1 = X.AnonymousClass4L0.A0F(r7, r3)
            java.lang.Class<X.4Tu> r0 = X.AnonymousClass4Tu.class
            X.0Ty r0 = r1.A01(r0)
            X.4Tu r0 = (X.AnonymousClass4Tu) r0
            r6.A0N = r0
        L_0x058b:
            X.08J r2 = r0.A01
            r1 = 3
            X.9qM r0 = new X.9qM
            r0.<init>(r5, r1, r6)
            r2.A0B(r3, r0)
            X.4Tu r0 = r6.A0N
            r0.A0D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2.A02(X.07r, X.2sr, X.213, X.9QL, java.lang.String, java.util.List, int, int):void");
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A0d) {
            this.A0d = true;
            C88864av r1 = (C88864av) ((C111685iW) generatedComponent());
            C64333Db r2 = r1.A0K;
            this.A0T = C64333Db.A4B(r2);
            C107695bk r3 = r2.A00;
            this.A0Y = C1899593h.A0V(r3);
            this.A0R = C64333Db.A2q(r2);
            this.A0a = C64333Db.A8y(r2);
            this.A0H = (AnonymousClass5UW) r2.A4T.get();
            this.A0X = C1899693i.A0S(r2);
            this.A0P = C86604Kt.A0S(r2);
            this.A0Q = C64333Db.A2o(r2);
            this.A0S = C64333Db.A2t(r2);
            this.A0U = (C103115Lp) r3.A8P.get();
            this.A0Z = (C33141sV) r2.AMe.get();
            C88834as r12 = r1.A0I;
            this.A0L = r12.ABV();
            this.A0K = (C104205Qb) r2.ARe.get();
            this.A0W = C1899593h.A0H(r2);
            this.A0J = (C105145Tt) r2.A4V.get();
            this.A0O = (C29441ip) r2.A68.get();
            this.A0V = (AnonymousClass5SZ) r2.AQ4.get();
            this.A0G = (C53762nc) r2.A5P.get();
            this.A0I = new C154197cm();
            this.A07 = (C101195Dv) r12.A1u.get();
            this.A0M = (C181798nL) r12.A1N.get();
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A06 = (RecyclerView) C06560Yg.A02(this, R.id.order_detail_recycler_view);
        this.A0E = AnonymousClass0x7.A0L(this, R.id.total_key);
        this.A0F = AnonymousClass0x7.A0L(this, R.id.total_amount);
        this.A0D = AnonymousClass0x7.A0L(this, R.id.installment_info);
        this.A08 = AnonymousClass0x7.A0K(this, R.id.learn_more_text);
        this.A0B = (WaButtonWithLoader) C06560Yg.A02(this, R.id.proceed_to_pay_btn);
        this.A0A = (WaButtonWithLoader) C06560Yg.A02(this, R.id.confirm_pay_btn);
        this.A0b = C86654Ky.A0f(this, R.id.not_yet_btn);
        this.A0C = AnonymousClass0x7.A0L(this, R.id.expiry_footer);
        this.A01 = C86654Ky.A0N(this, R.id.secure_footer);
        this.A09 = AnonymousClass0x7.A0K(this, R.id.terms_of_services_footer);
        this.A00 = C06560Yg.A02(this, R.id.shadow_top);
        this.A03 = (RelativeLayout) C06560Yg.A02(this, R.id.buttons);
        this.A04 = (RelativeLayout) C06560Yg.A02(this, R.id.payment_button_wrapper);
        this.A02 = (RelativeLayout) C06560Yg.A02(this, R.id.button_additional_info);
        this.A05 = (RelativeLayout) C06560Yg.A02(this, R.id.pending_payment_button_wrapper);
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context) {
        this(context, (AttributeSet) null);
    }
}
