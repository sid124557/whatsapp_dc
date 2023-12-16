package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.4X5  reason: invalid class name */
public class AnonymousClass4X5 extends AnonymousClass0R6 {
    public AnonymousClass5QZ A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C54042o5 A03;
    public final AnonymousClass64J A04;
    public final C44272Vj A05;
    public final C56942so A06;
    public final AnonymousClass5PX A07 = new AnonymousClass5PX(7, (Object) null);
    public final AnonymousClass5PX A08 = new AnonymousClass5PX(0, (Object) null);
    public final AnonymousClass5PX A09 = new AnonymousClass5PX(1, (Object) null);
    public final AnonymousClass5PX A0A = new AnonymousClass5PX(6, (Object) null);
    public final AnonymousClass5PX A0B = new AnonymousClass5PX(5, (Object) null);
    public final AnonymousClass5PX A0C = new AnonymousClass5PX(4, (Object) null);
    public final C102895Kr A0D;
    public final AnonymousClass5UX A0E;
    public final AnonymousClass5ZU A0F;
    public final C105365Uq A0G;
    public final C620733j A0H;
    public final C56892sj A0I;
    public final C620533h A0J;
    public final AnonymousClass1VX A0K;
    public final GroupJid A0L;
    public final C27991fJ A0M;
    public final List A0N;

    public long A0B(int i) {
        List list = this.A0N;
        int i2 = ((AnonymousClass5PX) list.get(i)).A00;
        if (i2 == 2) {
            Object obj = ((AnonymousClass5PX) list.get(i)).A01;
            C626936e.A06(obj);
            i2 = ((AnonymousClass5QZ) obj).A04.hashCode();
        }
        return (long) i2;
    }

    public int A0G() {
        return this.A0N.size();
    }

    public final void A0K(List list) {
        List list2 = this.A0N;
        C18280x3.A0s(new C87734Vp(list2, list), this, list, list2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r4.A02.A0a(r5.A04) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r13, int r14) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C88434Ys
            if (r0 == 0) goto L_0x00d3
            X.4Ys r13 = (X.C88434Ys) r13
            java.util.List r0 = r12.A0N
            java.lang.Object r0 = r0.get(r14)
            X.5PX r0 = (X.AnonymousClass5PX) r0
            java.lang.Object r5 = r0.A01
            X.5QZ r5 = (X.AnonymousClass5QZ) r5
            X.5Kr r4 = r12.A0D
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0023
            X.2sr r1 = r4.A02
            com.whatsapp.jid.UserJid r0 = r5.A04
            boolean r0 = r1.A0a(r0)
            r3 = 0
            if (r0 != 0) goto L_0x002f
        L_0x0023:
            r3 = 1
            android.view.ViewGroup r2 = r13.A00
            r1 = 0
            X.6Bd r0 = new X.6Bd
            r0.<init>(r5, r1, r4)
            r2.setOnCreateContextMenuListener(r0)
        L_0x002f:
            android.view.ViewGroup r1 = r13.A00
            r1.setClickable(r3)
            if (r3 == 0) goto L_0x00c9
            r0 = 23
            X.AnonymousClass0x2.A0z(r1, r13, r0)
            r0 = 2131233591(0x7f080b37, float:1.8083324E38)
        L_0x003e:
            r1.setBackgroundResource(r0)
            X.3ZH r8 = r5.A03
            r2 = r8
            if (r8 != 0) goto L_0x004d
            com.whatsapp.jid.UserJid r0 = r5.A04
            X.3ZH r8 = new X.3ZH
            r8.<init>(r0)
        L_0x004d:
            X.58i r3 = X.C998258i.UNKNOWN
            X.2sr r1 = r13.A02
            com.whatsapp.jid.UserJid r0 = r5.A04
            boolean r0 = r1.A0a(r0)
            r10 = 7
            if (r0 == 0) goto L_0x00b2
            X.5YB r0 = r13.A06
            r0.A05()
            com.whatsapp.TextEmojiLabel r1 = r13.A05
            X.2o5 r0 = r13.A03
            java.lang.String r0 = r0.A00()
        L_0x0067:
            r4 = 0
            r1.A0K(r4, r0)
            if (r2 == 0) goto L_0x00a7
            X.5Uq r1 = r13.A0A
            android.widget.ImageView r0 = r13.A01
            r1.A08(r0, r2)
        L_0x0074:
            int r7 = r5.A01
            r6 = 0
            r5 = 8
            if (r7 != 0) goto L_0x0095
            com.whatsapp.WaTextView r0 = r13.A07
            r0.setVisibility(r5)
        L_0x0080:
            X.5ZU r0 = r13.A09
            java.lang.String r2 = r0.A0G(r3, r8, r10)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            com.whatsapp.TextEmojiLabel r0 = r13.A04
            if (r1 != 0) goto L_0x0131
            r0.setVisibility(r6)
            r0.A0K(r4, r2)
        L_0x0094:
            return
        L_0x0095:
            com.whatsapp.WaTextView r2 = r13.A07
            r1 = 1
            r0 = 2131887944(0x7f120748, float:1.941051E38)
            if (r7 != r1) goto L_0x00a0
            r0 = 2131887930(0x7f12073a, float:1.941048E38)
        L_0x00a0:
            r2.setText(r0)
            r2.setVisibility(r6)
            goto L_0x0080
        L_0x00a7:
            X.5UX r2 = r13.A08
            android.widget.ImageView r1 = r13.A01
            r0 = 2131231006(0x7f08011e, float:1.807808E38)
            r2.A06(r1, r0)
            goto L_0x0074
        L_0x00b2:
            X.5ZU r0 = r13.A09
            X.7HU r7 = r0.A0B(r8, r10)
            X.58i r3 = r7.A00
            X.5YB r6 = r13.A06
            r9 = 0
            boolean r11 = r8.A0W()
            r6.A07(r7, r8, r9, r10, r11)
            com.whatsapp.TextEmojiLabel r1 = r13.A05
            java.lang.String r0 = r5.A05
            goto L_0x0067
        L_0x00c9:
            android.content.Context r0 = r1.getContext()
            int r0 = X.AnonymousClass5Yj.A01(r0)
            goto L_0x003e
        L_0x00d3:
            boolean r0 = r13 instanceof X.C88154Xq
            if (r0 == 0) goto L_0x00fe
            X.4Xq r13 = (X.C88154Xq) r13
            java.util.List r0 = r12.A0N
            java.lang.Object r0 = r0.get(r14)
            X.5PX r0 = (X.AnonymousClass5PX) r0
            java.lang.Object r5 = r0.A01
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x0094
            com.whatsapp.WaTextView r4 = r13.A00
            android.view.View r0 = r13.A0H
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131755397(0x7f100185, float:1.9141672E38)
            int r1 = r5.intValue()
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r5)
            X.C86614Ku.A16(r3, r4, r0, r2, r1)
            return
        L_0x00fe:
            boolean r0 = r13 instanceof X.AnonymousClass4Xp
            if (r0 == 0) goto L_0x0094
            X.4Xp r13 = (X.AnonymousClass4Xp) r13
            com.whatsapp.jid.GroupJid r4 = r12.A0L
            X.1fJ r0 = X.AnonymousClass34R.A01(r4)
            if (r0 == 0) goto L_0x0094
            X.1fJ r4 = (X.C27991fJ) r4
            X.1fJ r3 = r12.A0M
            X.4Rw r2 = r13.A00
            X.C18260x0.A0O(r4, r3)
            r2.A02 = r4
            r2.A03 = r3
            X.4ea r1 = r2.getActivity()
            X.C162457s7.A0D(r1)
            X.63x r0 = r2.getCommunityMembersViewModelFactory$community_consumerBeta()
            com.whatsapp.community.CommunityMembersViewModel r0 = X.AnonymousClass5AV.A00(r1, r0, r3)
            r2.A01 = r0
            android.view.View r1 = r2.A07
            r0 = 7
            X.AnonymousClass547.A00(r1, r2, r4, r3, r0)
            return
        L_0x0131:
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X5.BNf(X.0Ua, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        r3 = X.AnonymousClass001.A0R(r1, r10, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05570Ua BQR(android.view.ViewGroup r10, int r11) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x0064
            switch(r11) {
                case 2: goto L_0x00ad;
                case 3: goto L_0x0095;
                case 4: goto L_0x0038;
                case 5: goto L_0x0044;
                case 6: goto L_0x0030;
                case 7: goto L_0x0086;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r10)
            r0 = 2131624403(0x7f0e01d3, float:1.8875985E38)
            android.view.View r3 = X.AnonymousClass001.A0R(r1, r10, r0)
            X.1VX r1 = r9.A0K
            r0 = 3795(0xed3, float:5.318E-42)
            boolean r2 = r1.A0X(r0)
            r0 = 2131429480(0x7f0b0868, float:1.8480634E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r3, r0)
            r0 = 2131888012(0x7f12078c, float:1.9410647E38)
            if (r2 == 0) goto L_0x0027
            r0 = 2131888013(0x7f12078d, float:1.941065E38)
        L_0x0027:
            r1.setText(r0)
        L_0x002a:
            X.4Xj r2 = new X.4Xj
            r2.<init>(r3)
            return r2
        L_0x0030:
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r10)
            r0 = 2131624394(0x7f0e01ca, float:1.8875966E38)
            goto L_0x003f
        L_0x0038:
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r10)
            r0 = 2131624395(0x7f0e01cb, float:1.8875969E38)
        L_0x003f:
            android.view.View r3 = X.AnonymousClass001.A0R(r1, r10, r0)
            goto L_0x002a
        L_0x0044:
            X.1fJ r2 = r9.A0M
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r10)
            r0 = 2131625029(0x7f0e0445, float:1.8877254E38)
            android.view.View r3 = X.AnonymousClass001.A0R(r1, r10, r0)
            r0 = 2131434200(0x7f0b1ad8, float:1.8490207E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r3, r0)
            r0 = 2131890653(0x7f1211dd, float:1.9416004E38)
            r1.setText(r0)
            r0 = 9
            X.AnonymousClass547.A00(r3, r2, r9, r10, r0)
            goto L_0x002a
        L_0x0064:
            X.1fJ r2 = r9.A0M
            android.content.Context r0 = r10.getContext()
            r1 = 0
            com.whatsapp.components.InviteViaLinkView r3 = new com.whatsapp.components.InviteViaLinkView
            r3.<init>(r0, r1)
            android.app.Activity r0 = X.C111095hX.A04(r10)
            X.4ea r0 = (X.C89654ea) r0
            r3.setupOnClick(r2, r0, r1)
            r0 = 2131430829(0x7f0b0dad, float:1.848337E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r3, r0)
            if (r1 == 0) goto L_0x002a
            r0 = 2131887960(0x7f120758, float:1.9410542E38)
            goto L_0x0027
        L_0x0086:
            android.content.Context r1 = r10.getContext()
            X.4Rw r0 = new X.4Rw
            r0.<init>(r1)
            X.4Xp r2 = new X.4Xp
            r2.<init>(r0)
            return r2
        L_0x0095:
            X.1fJ r2 = r9.A0M
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r10)
            r0 = 2131625029(0x7f0e0445, float:1.8877254E38)
            android.view.View r1 = X.AnonymousClass001.A0R(r1, r10, r0)
            r0 = 8
            X.AnonymousClass547.A00(r1, r2, r9, r10, r0)
            X.4Xq r2 = new X.4Xq
            r2.<init>(r1)
            return r2
        L_0x00ad:
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r10)
            r0 = 2131624393(0x7f0e01c9, float:1.8875964E38)
            android.view.View r1 = X.AnonymousClass001.A0R(r1, r10, r0)
            X.2o5 r3 = r9.A03
            X.2sr r2 = r9.A02
            X.5UX r5 = r9.A0E
            X.5ZU r6 = r9.A0F
            X.64J r4 = r9.A04
            X.5Uq r7 = r9.A0G
            X.1fJ r8 = r9.A0M
            X.4Ys r0 = new X.4Ys
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X5.BQR(android.view.ViewGroup, int):X.0Ua");
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass5PX) this.A0N.get(i)).A00;
    }

    public AnonymousClass4X5(C69263Wi r4, C56972sr r5, C54042o5 r6, AnonymousClass64J r7, C44272Vj r8, C56942so r9, C102895Kr r10, AnonymousClass5UX r11, AnonymousClass5ZU r12, C105365Uq r13, C620733j r14, C56892sj r15, C620533h r16, AnonymousClass1VX r17, GroupJid groupJid, C27991fJ r19) {
        this.A0K = r17;
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
        this.A0E = r11;
        this.A0H = r14;
        this.A0F = r12;
        this.A06 = r9;
        this.A0J = r16;
        this.A05 = r8;
        this.A0I = r15;
        this.A04 = r7;
        this.A0L = groupJid;
        this.A0M = r19;
        this.A0G = r13;
        this.A0D = r10;
        this.A0N = AnonymousClass001.A0s();
    }
}
