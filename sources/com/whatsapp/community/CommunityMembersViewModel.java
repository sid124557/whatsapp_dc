package com.whatsapp.community;

import X.AnonymousClass0IV;
import X.AnonymousClass20D;
import X.AnonymousClass2C3;
import X.AnonymousClass31C;
import X.AnonymousClass34B;
import X.AnonymousClass36K;
import X.AnonymousClass491;
import X.AnonymousClass4AQ;
import X.AnonymousClass4HW;
import X.AnonymousClass5G2;
import X.AnonymousClass5ZU;
import X.AnonymousClass681;
import X.AnonymousClass687;
import X.AnonymousClass697;
import X.C05550Ty;
import X.C06270Wx;
import X.C1001859w;
import X.C104485Rd;
import X.C111395i1;
import X.C116825qv;
import X.C117815sX;
import X.C118195t9;
import X.C1219962r;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C27991fJ;
import X.C29241iV;
import X.C29421in;
import X.C29441ip;
import X.C41032Ir;
import X.C50932j0;
import X.C54042o5;
import X.C56892sj;
import X.C56972sr;
import X.C58102ui;
import X.C61102zi;
import X.C616131n;
import X.C64773Ex;
import X.C72023d3;
import X.C72553du;
import X.C72923eW;
import X.C73813g7;
import X.C73853gB;
import X.C832246p;
import X.C84384Cd;
import X.C84814Du;
import X.C85474Gj;
import X.C85524Gp;
import X.C85564Gt;
import X.C86634Kw;
import X.C91734ky;
import X.C91744kz;
import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.FlowLiveDataConversions$asLiveData$1;
import com.whatsapp.jid.UserJid;

public final class CommunityMembersViewModel extends C05550Ty {
    public final C06270Wx A00;
    public final C06270Wx A01;
    public final C06270Wx A02;
    public final C06270Wx A03;
    public final C56972sr A04;
    public final AnonymousClass491 A05 = new C111395i1(this);
    public final C54042o5 A06;
    public final C84384Cd A07;
    public final AnonymousClass5G2 A08;
    public final C29441ip A09;
    public final C64773Ex A0A;
    public final C29421in A0B;
    public final AnonymousClass681 A0C = AnonymousClass681.A00(this, 12);
    public final AnonymousClass5ZU A0D;
    public final C56892sj A0E;
    public final AnonymousClass4AQ A0F = new AnonymousClass697(this, 1);
    public final C50932j0 A0G;
    public final C117815sX A0H;
    public final C29241iV A0I;
    public final AnonymousClass687 A0J = new AnonymousClass687(this, 4);
    public final C27991fJ A0K;
    public final C73853gB A0L;
    public final C85524Gp A0M;
    public final C85524Gp A0N;
    public final C85524Gp A0O;
    public final C85524Gp A0P;
    public final C85564Gt A0Q;
    public final C85564Gt A0R;
    public final C85564Gt A0S;
    public final C85564Gt A0T;

    public void A0C() {
        C54042o5 r0 = this.A06;
        ((C61102zi) r0.A0C.get()).A07(this.A05);
        this.A0B.A07(this.A0C);
        this.A0I.A07(this.A0J);
        this.A0G.A01(this.A0F);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047 A[LOOP:0: B:10:0x0041->B:12:0x0047, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.C84814Du r10, X.AnonymousClass4C5 r11, boolean r12) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C118715tz
            if (r0 == 0) goto L_0x008f
            r6 = r10
            X.5tz r6 = (X.C118715tz) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008f
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r8 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 != r8) goto L_0x0096
            boolean r12 = r6.Z$0
            java.lang.Object r5 = r6.L$1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r6 = r6.L$0
            com.whatsapp.community.CommunityMembersViewModel r6 = (com.whatsapp.community.CommunityMembersViewModel) r6
            X.C57682u2.A01(r2)
        L_0x002a:
            java.util.Map r2 = (java.util.Map) r2
            X.4C5 r1 = X.C73723fy.A0R(r5)
            X.63F r0 = new X.63F
            r0.<init>(r6, r2, r12)
            X.4C5 r0 = X.C829345m.A05(r0, r1)
            java.util.LinkedHashMap r7 = X.C18320x8.A0r()
            java.util.Iterator r2 = r0.iterator()
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5QZ r0 = (X.AnonymousClass5QZ) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            r7.put(r0, r1)
            goto L_0x0041
        L_0x0054:
            X.C57682u2.A01(r2)
            X.63c r0 = X.C1221063c.A00
            X.4C5 r1 = X.C829345m.A05(r0, r11)
            X.60f r0 = new X.60f
            r0.<init>(r9)
            X.4C5 r0 = X.C829345m.A05(r0, r1)
            java.util.List r5 = X.C829345m.A01(r0)
            boolean r0 = X.C18310x6.A1X(r5)
            if (r0 == 0) goto L_0x00c3
            X.4Cd r4 = r9.A07
            X.1fJ r3 = r9.A0K
            X.3gB r2 = r9.A0L
            r6.L$0 = r9
            r6.L$1 = r5
            r6.Z$0 = r12
            r6.label = r8
            X.3Eg r4 = (X.C64623Eg) r4
            r1 = 0
            com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4 r0 = new com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4
            r0.<init>(r4, r3, r1)
            java.lang.Object r2 = X.C616131n.A00(r6, r2, r0)
            if (r2 != r7) goto L_0x008d
            return r7
        L_0x008d:
            r6 = r9
            goto L_0x002a
        L_0x008f:
            X.5tz r6 = new X.5tz
            r6.<init>(r9, r10)
            goto L_0x0012
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x009b:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r3)
            r0.putAll(r7)
            boolean r0 = r5.AzD(r4, r0)
            if (r0 == 0) goto L_0x00c8
            X.2sr r0 = r6.A04
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r2 = r7.get(r0)
            if (r2 == 0) goto L_0x00c3
            X.4Gp r1 = r6.A0O
        L_0x00b9:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AzD(r0, r2)
            if (r0 == 0) goto L_0x00b9
        L_0x00c3:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00c6:
            X.4Gp r5 = r6.A0M
        L_0x00c8:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r3 = X.C18320x8.A0r()
            java.util.Iterator r2 = X.AnonymousClass000.A0q(r0)
        L_0x00d7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009b
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r2)
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r0 = r7.get(r0)
            if (r0 != 0) goto L_0x00d7
            X.C18270x1.A1N(r3, r1)
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersViewModel.A0D(X.4Du, X.4C5, boolean):java.lang.Object");
    }

    public final void A0F(UserJid userJid) {
        C85524Gp r2 = this.A0P;
        do {
        } while (!r2.AzD(r2.getValue(), C91744kz.A00));
        AnonymousClass5G2 r22 = this.A08;
        C27991fJ r1 = this.A0K;
        UserJid userJid2 = userJid;
        C1219962r r4 = new C1219962r(this, userJid2);
        AnonymousClass31C r8 = r22.A00;
        String A032 = r8.A03();
        C116825qv r3 = new C116825qv(r1, A032, C18290x4.A12(userJid2));
        C1001859w r5 = new C1001859w(r22, 0);
        C1001859w r6 = new C1001859w(r22, 1);
        AnonymousClass36K r10 = ((C41032Ir) r3.A03.getValue()).A00;
        C162457s7.A0D(r10);
        r8.A0D(new AnonymousClass4HW(r3, r4, r5, r6, 1), r10, A032, 347, 32000);
    }

    public CommunityMembersViewModel(C56972sr r7, C54042o5 r8, C84384Cd r9, AnonymousClass5G2 r10, C29441ip r11, C64773Ex r12, C29421in r13, AnonymousClass5ZU r14, C56892sj r15, C50932j0 r16, C29241iV r17, C27991fJ r18, C73853gB r19) {
        C18260x0.A0f(r8, r7, r14, r12, r13);
        C50932j0 r0 = r16;
        C18260x0.A0W(r9, r0, r15);
        C29241iV r1 = r17;
        C86634Kw.A1S(r11, r1);
        this.A06 = r8;
        this.A04 = r7;
        this.A0D = r14;
        this.A0A = r12;
        this.A0B = r13;
        this.A07 = r9;
        this.A0G = r0;
        this.A0E = r15;
        this.A0L = r19;
        this.A09 = r11;
        this.A0I = r1;
        this.A08 = r10;
        C27991fJ r110 = r18;
        this.A0K = r110;
        this.A0H = new C117815sX(r7, r14);
        C832246p r111 = new C832246p(new C104485Rd(r15.A0D(r110) ^ true ? 1 : 0, (Integer) null));
        this.A0N = r111;
        C72923eW r02 = new C72923eW((C85474Gj) null, r111);
        this.A0R = r02;
        C72553du r2 = C72553du.A00;
        this.A01 = new CoroutineLiveData(r2, new FlowLiveDataConversions$asLiveData$1((C84814Du) null, r02));
        C832246p r03 = new C832246p(C73813g7.A0A());
        this.A0M = r03;
        C118195t9 r5 = new C118195t9(this, r03);
        C85564Gt A032 = AnonymousClass34B.A03(C72023d3.A00, AnonymousClass0IV.A00(this), r5, C58102ui.A00);
        this.A0Q = A032;
        this.A00 = new CoroutineLiveData(r2, new FlowLiveDataConversions$asLiveData$1((C84814Du) null, A032));
        C832246p r112 = new C832246p(AnonymousClass2C3.A01);
        this.A0O = r112;
        C72923eW r04 = new C72923eW((C85474Gj) null, r112);
        this.A0S = r04;
        this.A02 = new CoroutineLiveData(r2, new FlowLiveDataConversions$asLiveData$1((C84814Du) null, r04));
        C832246p r113 = new C832246p(C91734ky.A00);
        this.A0P = r113;
        C72923eW r05 = new C72923eW((C85474Gj) null, r113);
        this.A0T = r05;
        this.A03 = new CoroutineLiveData(r2, new FlowLiveDataConversions$asLiveData$1((C84814Du) null, r05));
    }

    public final void A0E() {
        C616131n.A02(this.A0L, new CommunityMembersViewModel$refreshCommunityMembers$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
    }
}
