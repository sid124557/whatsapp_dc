package com.whatsapp.calling.callhistory.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4s0;
import X.AnonymousClass556;
import X.AnonymousClass55B;
import X.AnonymousClass55H;
import X.AnonymousClass55I;
import X.AnonymousClass55J;
import X.AnonymousClass5IP;
import X.AnonymousClass5XL;
import X.AnonymousClass5ZM;
import X.AnonymousClass5ZU;
import X.AnonymousClass68M;
import X.AnonymousClass7D9;
import X.AnonymousClass7DA;
import X.AnonymousClass7DB;
import X.AnonymousClass7DC;
import X.AnonymousClass7DD;
import X.AnonymousClass7DE;
import X.AnonymousClass7DF;
import X.AnonymousClass8FU;
import X.AnonymousClass8FV;
import X.AnonymousClass8FW;
import X.AnonymousClass8FZ;
import X.C05550Ty;
import X.C104375Qs;
import X.C107145am;
import X.C107505bQ;
import X.C107565bW;
import X.C112415jh;
import X.C112425ji;
import X.C117005rE;
import X.C137926pU;
import X.C150187Pq;
import X.C150477Qw;
import X.C150987Sz;
import X.C162307rf;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C185658u2;
import X.C187958y5;
import X.C28781hl;
import X.C44772Xk;
import X.C47732dj;
import X.C50392i6;
import X.C52472lX;
import X.C55422qK;
import X.C56572sD;
import X.C56612sH;
import X.C56762sW;
import X.C56892sj;
import X.C56972sr;
import X.C620733j;
import X.C626936e;
import X.C627336j;
import X.C627436k;
import X.C64773Ex;
import X.C66493Lq;
import X.C72173dI;
import X.C86654Ky;
import X.C87304Ox;
import X.C992755c;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

public class CallsHistoryFragmentV2ViewModel extends C05550Ty {
    public int A00;
    public AnonymousClass8FU A01;
    public AnonymousClass8FV A02;
    public AnonymousClass8FW A03;
    public C112425ji A04;
    public AnonymousClass55H A05;
    public AnonymousClass55J A06;
    public AnonymousClass55B A07;
    public C992755c A08;
    public AnonymousClass55I A09;
    public AnonymousClass556 A0A;
    public C72173dI A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public ArrayList A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final AnonymousClass08M A0J = AnonymousClass08M.A01();
    public final C56972sr A0K;
    public final AnonymousClass5XL A0L;
    public final AnonymousClass7D9 A0M = new AnonymousClass7D9(this);
    public final AnonymousClass7DA A0N = new AnonymousClass7DA(this);
    public final AnonymousClass7DB A0O = new AnonymousClass7DB(this);
    public final AnonymousClass7DC A0P = new AnonymousClass7DC(this);
    public final AnonymousClass7DD A0Q;
    public final AnonymousClass7DE A0R = new AnonymousClass7DE(this);
    public final AnonymousClass7DF A0S = new AnonymousClass7DF(this);
    public final C87304Ox A0T = new C87304Ox(this);
    public final C150987Sz A0U;
    public final AnonymousClass5IP A0V;
    public final C112415jh A0W;
    public final C44772Xk A0X;
    public final C64773Ex A0Y;
    public final AnonymousClass5ZU A0Z;
    public final C56612sH A0a;
    public final C620733j A0b;
    public final C56762sW A0c;
    public final C56892sj A0d;
    public final C55422qK A0e;
    public final AnonymousClass1VX A0f;
    public final C66493Lq A0g;
    public final C47732dj A0h;
    public final C28781hl A0i;
    public final C52472lX A0j;
    public final C56572sD A0k;
    public final AnonymousClass107 A0l;
    public final C187958y5 A0m;
    public final AnonymousClass4FS A0n;
    public final ArrayList A0o;
    public final HashMap A0p;
    public final LinkedHashMap A0q;
    public final Lock A0r;
    public final boolean A0s;

    public C104375Qs A0G(C50392i6 r12, int i, long j) {
        C150477Qw r8;
        int i2 = R.color.f5nameremoved;
        int i3 = 0;
        if (i == 1) {
            i3 = R.drawable.joinable_call_log_button_background;
            i2 = R.color.f5nameremoved;
        }
        int i4 = r12.A00;
        boolean z = false;
        int i5 = R.drawable.ic_action_call;
        int i6 = R.string.f11nameremoved;
        if (i4 == 2) {
            z = true;
            i5 = R.drawable.ic_action_videocall;
            i6 = R.string.f11nameremoved;
        }
        int i7 = R.color.f5nameremoved;
        if (i != 2) {
            i7 = R.color.f5nameremoved;
            if (i == 0) {
                C620733j r10 = this.A0b;
                long j2 = r12.A03;
                r8 = AnonymousClass4L0.A0N(AnonymousClass4L0.A0V(C107505bQ.A02(r10, j2), C107145am.A00(r10, j2), 2), R.string.f11nameremoved);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(CallsHistoryFragmentV2.class.getName());
                AnonymousClass0x2.A1N(A0o2, r12.A04.getRawString());
                String A0k2 = AnonymousClass001.A0k(A0o2, r12.A01);
                C150187Pq r0 = new C150187Pq();
                r0.A00 = i7;
                r0.A01 = i;
                r0.A06 = r8;
                String str = r12.A06;
                r0.A07 = str;
                r0.A02 = i3;
                r0.A03 = i6;
                r0.A04 = i5;
                r0.A05 = i2;
                r0.A08 = A0k2;
                r0.A09 = z;
                C104375Qs r02 = new C104375Qs();
                r02.A00 = i7;
                r02.A01 = i;
                r02.A06 = r8;
                r02.A07 = str;
                r02.A02 = i3;
                r02.A03 = i6;
                r02.A04 = i5;
                r02.A05 = i2;
                r02.A08 = A0k2;
                r02.A09 = z;
                return r02;
            }
        }
        r8 = new C137926pU(C107565bW.A03(this.A0b, j).toString());
        StringBuilder A0o22 = AnonymousClass001.A0o();
        A0o22.append(CallsHistoryFragmentV2.class.getName());
        AnonymousClass0x2.A1N(A0o22, r12.A04.getRawString());
        String A0k22 = AnonymousClass001.A0k(A0o22, r12.A01);
        C150187Pq r03 = new C150187Pq();
        r03.A00 = i7;
        r03.A01 = i;
        r03.A06 = r8;
        String str2 = r12.A06;
        r03.A07 = str2;
        r03.A02 = i3;
        r03.A03 = i6;
        r03.A04 = i5;
        r03.A05 = i2;
        r03.A08 = A0k22;
        r03.A09 = z;
        C104375Qs r022 = new C104375Qs();
        r022.A00 = i7;
        r022.A01 = i;
        r022.A06 = r8;
        r022.A07 = str2;
        r022.A02 = i3;
        r022.A03 = i6;
        r022.A04 = i5;
        r022.A05 = i2;
        r022.A08 = A0k22;
        r022.A09 = z;
        return r022;
    }

    public static final String A01(AnonymousClass3ZH r3) {
        if (r3 == null) {
            return "";
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(CallsHistoryFragmentV2.class.getName());
        AnonymousClass0x2.A1N(A0o2, C627336j.A07(r3.A0H));
        return AnonymousClass001.A0k(A0o2, r3.A0C);
    }

    public static /* synthetic */ void A02(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel) {
        C87304Ox r1 = callsHistoryFragmentV2ViewModel.A0T;
        if (C18320x8.A1U(r1.A01)) {
            r1.filter(r1.A01);
            callsHistoryFragmentV2ViewModel.A0H();
            return;
        }
        AnonymousClass5ZM.A05(callsHistoryFragmentV2ViewModel, new AnonymousClass68M((Object) callsHistoryFragmentV2ViewModel, 5));
    }

    public static /* synthetic */ void A03(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, C50392i6 r9) {
        C112425ji r0;
        if (r9 == null) {
            r0 = null;
        } else {
            r0 = new C112425ji((C117005rE) null, callsHistoryFragmentV2ViewModel.A0G(r9, 0, 0), r9.A04, r9.A03, r9.A02);
        }
        callsHistoryFragmentV2ViewModel.A04 = r0;
    }

    public void A0C() {
        AnonymousClass5XL r2 = this.A0L;
        r2.A0U.A07(r2.A0T);
        r2.A0S.A07(r2.A0R);
        r2.A0E.A07(r2.A0D);
        Log.d("CallsHistoryDataSource/detached");
        if (r2.A03 != null) {
            Log.d("CallsHistoryDataSource/cancelRefreshCalls");
            r2.A03.A0D(true);
        }
        if (C627436k.A0I(r2.A0J)) {
            r2.A0O.A07(r2.A0N);
            r2.A0M.A07(r2.A0L);
        }
        r2.A06 = null;
        if (C86654Ky.A1Z(this.A0f)) {
            this.A0i.A07(this.A0h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r0 == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r19 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
        if (r1 == 5) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
        if (r2.A0j.A01(r10) == false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass5RB A0D(X.C117005rE r18, X.AnonymousClass3ZH r19) {
        /*
            r17 = this;
            r16 = r18
            X.3ZH r9 = r16.A02()
            X.C626936e.A06(r9)
            r0 = r16
            java.util.ArrayList r8 = r0.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)
            r7 = 0
            java.lang.Object r6 = r0.get(r7)
            X.C626936e.A06(r6)
            X.3ZF r6 = (X.AnonymousClass3ZF) r6
            boolean r0 = r16.A04()
            r10 = r19
            if (r0 == 0) goto L_0x0026
            r5 = 1
            if (r19 == 0) goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r2 = r17
            if (r5 == 0) goto L_0x02ea
            X.1VX r1 = r2.A0f
            X.2sr r0 = r2.A0K
            java.util.List r3 = X.C106255Yf.A01(r0, r1, r6)
            r9 = 0
        L_0x003c:
            int r0 = r3.size()
            if (r9 >= r0) goto L_0x005e
            X.3Ex r1 = r2.A0Y
            java.lang.Object r0 = r3.get(r9)
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r0 = r1.A07(r0)
            r1 = 3
            if (r0 == 0) goto L_0x0056
            if (r9 >= r1) goto L_0x0056
            r4.add(r0)
        L_0x0056:
            int r0 = r4.size()
            int r9 = r9 + 1
            if (r0 < r1) goto L_0x003c
        L_0x005e:
            r9 = 0
        L_0x005f:
            X.3Ex r11 = r2.A0Y
            X.5ZU r1 = r2.A0Z
            if (r9 != 0) goto L_0x02dc
            r0 = 3
            X.7Qw r13 = X.C107305b5.A04(r11, r1, r3, r0, r7)
            X.C626936e.A06(r13)
        L_0x006d:
            java.lang.String r14 = A01(r10)
            if (r19 == 0) goto L_0x00a0
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00a0
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r7)
            com.whatsapp.jid.GroupJid r0 = r0.A05
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r16.A05()
            if (r0 != 0) goto L_0x00a0
            X.4uZ r12 = r10.A0H
            boolean r0 = r12 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x00a0
            X.1VX r11 = r2.A0f
            X.2sr r1 = r2.A0K
            X.2sj r0 = r2.A0d
            X.1fL r12 = (X.C28011fL) r12
            int r0 = X.C86664Kz.A0H(r0, r12)
            boolean r0 = X.C627436k.A0B(r1, r11, r0)
            r12 = 1
            if (r0 != 0) goto L_0x00a1
        L_0x00a0:
            r12 = 0
        L_0x00a1:
            X.5LX r11 = new X.5LX
            r11.<init>()
            int r0 = r8.size()
            r11.A00 = r0
            r0 = 2131887238(0x7f120486, float:1.9409077E38)
            r11.A01 = r0
            int r1 = r16.A00()
            if (r1 == 0) goto L_0x02ce
            r0 = 1
            if (r1 == r0) goto L_0x02c0
            r0 = 2
            if (r1 == r0) goto L_0x02b2
            r0 = 4
            if (r1 == r0) goto L_0x02a4
            r0 = 5
            if (r1 == r0) goto L_0x0296
            r1 = 0
        L_0x00c4:
            r11.A02 = r1
            int r1 = r16.A00()
            r15 = 2131233930(0x7f080c8a, float:1.8084011E38)
            if (r1 == 0) goto L_0x00df
            r0 = 1
            if (r1 == r0) goto L_0x0291
            r0 = 2
            if (r1 == r0) goto L_0x0291
            r0 = 4
            if (r1 == r0) goto L_0x00dc
            r0 = 5
            r15 = 0
            if (r1 != r0) goto L_0x00df
        L_0x00dc:
            r15 = 2131234190(0x7f080d8e, float:1.8084539E38)
        L_0x00df:
            r11.A03 = r15
            int r0 = X.C107215at.A01(r6)
            r11.A04 = r0
            int r1 = r6.A00
            r0 = 5
            if (r1 == r0) goto L_0x00f6
            X.39J r0 = r6.A0E
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x028c
            X.2l8 r0 = r6.A0I
            if (r0 != 0) goto L_0x028c
        L_0x00f6:
            r0 = 2131101335(0x7f060697, float:1.7815077E38)
        L_0x00f9:
            r11.A05 = r0
            r11.A0A = r9
            r11.A0E = r4
            r11.A0B = r13
            if (r19 == 0) goto L_0x010c
            X.2lX r0 = r2.A0j
            boolean r1 = r0.A01(r10)
            r0 = 0
            if (r1 != 0) goto L_0x010d
        L_0x010c:
            r0 = 1
        L_0x010d:
            r11.A0G = r0
            boolean r0 = r16.A05()
            if (r0 == 0) goto L_0x0116
            r7 = 1
        L_0x0116:
            r11.A0I = r7
            r11.A0F = r3
            r11.A0H = r5
            X.1VX r1 = r2.A0f
            boolean r0 = X.C627436k.A0F(r1)
            if (r0 != 0) goto L_0x0289
            boolean r0 = r8.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x0257
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r3)
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0257
            r0 = 1972(0x7b4, float:2.763E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0257
            r0 = 2131887388(0x7f12051c, float:1.9409382E38)
        L_0x0140:
            r11.A08 = r0
            boolean r0 = X.C627436k.A0F(r1)
            if (r0 == 0) goto L_0x0254
            boolean r0 = r8.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x0161
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r3)
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0161
            r0 = 1972(0x7b4, float:2.763E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0179
        L_0x0161:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x023f
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r3)
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x023f
            r0 = 6307(0x18a3, float:8.838E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x023f
        L_0x0179:
            r0 = 2131234098(0x7f080d32, float:1.8084352E38)
        L_0x017c:
            r11.A07 = r0
            boolean r0 = X.C627436k.A0F(r1)
            if (r0 == 0) goto L_0x023c
            boolean r0 = r8.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x020a
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r3)
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x020a
            r0 = 1972(0x7b4, float:2.763E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x020a
            r0 = 2131887389(0x7f12051d, float:1.9409384E38)
        L_0x01a0:
            r11.A06 = r0
            r11.A0D = r14
            long r0 = r16.A01()
            r11.A09 = r0
            X.33j r2 = r2.A0b
            long r0 = r16.A01()
            java.lang.CharSequence r3 = X.C107565bW.A03(r2, r0)
            r11.A0C = r3
            r11.A0J = r12
            X.5RB r2 = new X.5RB
            r2.<init>()
            int r0 = r11.A00
            r2.A00 = r0
            int r0 = r11.A01
            r2.A01 = r0
            int r0 = r11.A02
            r2.A02 = r0
            int r0 = r11.A03
            r2.A03 = r0
            int r0 = r11.A04
            r2.A04 = r0
            X.3ZH r0 = r11.A0A
            r2.A0A = r0
            java.util.List r0 = r11.A0E
            r2.A0E = r0
            int r0 = r11.A05
            r2.A05 = r0
            X.7Qw r0 = r11.A0B
            r2.A0B = r0
            boolean r0 = r11.A0G
            r2.A0G = r0
            boolean r0 = r11.A0I
            r2.A0I = r0
            java.util.List r0 = r11.A0F
            r2.A0F = r0
            boolean r0 = r11.A0H
            r2.A0H = r0
            int r0 = r11.A08
            r2.A08 = r0
            int r0 = r11.A07
            r2.A07 = r0
            int r0 = r11.A06
            r2.A06 = r0
            java.lang.String r0 = r11.A0D
            r2.A0D = r0
            long r0 = r11.A09
            r2.A09 = r0
            r2.A0C = r3
            r2.A0J = r12
            return r2
        L_0x020a:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0227
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r3)
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x0227
            r0 = 6307(0x18a3, float:8.838E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0227
            r0 = 2131887385(0x7f120519, float:1.9409376E38)
            goto L_0x01a0
        L_0x0227:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x023c
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r3)
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x023c
            r0 = 2131887387(0x7f12051b, float:1.940938E38)
            goto L_0x01a0
        L_0x023c:
            r0 = 0
            goto L_0x01a0
        L_0x023f:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0254
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r3)
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x0254
            r0 = 2131233998(0x7f080cce, float:1.808415E38)
            goto L_0x017c
        L_0x0254:
            r0 = 0
            goto L_0x017c
        L_0x0257:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0274
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r3)
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x0274
            r0 = 6307(0x18a3, float:8.838E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0274
            r0 = 2131887384(0x7f120518, float:1.9409374E38)
            goto L_0x0140
        L_0x0274:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0289
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r8, r3)
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x0289
            r0 = 2131887386(0x7f12051a, float:1.9409378E38)
            goto L_0x0140
        L_0x0289:
            r0 = 0
            goto L_0x0140
        L_0x028c:
            r0 = 2131102686(0x7f060bde, float:1.7817817E38)
            goto L_0x00f9
        L_0x0291:
            r15 = 2131233926(0x7f080c86, float:1.8084003E38)
            goto L_0x00df
        L_0x0296:
            boolean r0 = r16.A05()
            r1 = 2131887258(0x7f12049a, float:1.9409118E38)
            if (r0 == 0) goto L_0x00c4
            r1 = 2131887256(0x7f120498, float:1.9409114E38)
            goto L_0x00c4
        L_0x02a4:
            boolean r0 = r16.A05()
            r1 = 2131887257(0x7f120499, float:1.9409116E38)
            if (r0 == 0) goto L_0x00c4
            r1 = 2131887255(0x7f120497, float:1.9409112E38)
            goto L_0x00c4
        L_0x02b2:
            boolean r0 = r16.A05()
            r1 = 2131890807(0x7f121277, float:1.9416316E38)
            if (r0 == 0) goto L_0x00c4
            r1 = 2131890806(0x7f121276, float:1.9416314E38)
            goto L_0x00c4
        L_0x02c0:
            boolean r0 = r16.A05()
            r1 = 2131890171(0x7f120ffb, float:1.9415026E38)
            if (r0 == 0) goto L_0x00c4
            r1 = 2131890169(0x7f120ff9, float:1.9415022E38)
            goto L_0x00c4
        L_0x02ce:
            boolean r0 = r16.A05()
            r1 = 2131891564(0x7f12156c, float:1.9417852E38)
            if (r0 == 0) goto L_0x00c4
            r1 = 2131891563(0x7f12156b, float:1.941785E38)
            goto L_0x00c4
        L_0x02dc:
            r0 = -1
            X.7HU r0 = r1.A0B(r9, r0)
            java.lang.String r0 = r0.A01
            X.6pU r13 = new X.6pU
            r13.<init>(r0)
            goto L_0x006d
        L_0x02ea:
            if (r19 == 0) goto L_0x005f
            boolean r0 = r16.A04()
            if (r0 == 0) goto L_0x005f
            r9 = r10
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A0D(X.5rE, X.3ZH):X.5RB");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        if (r2 != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r8.A0U() == false) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass5R4 A0E(X.C117005rE r16, X.AnonymousClass3ZH r17, java.lang.String r18) {
        /*
            r15 = this;
            r2 = r16
            java.util.ArrayList r0 = r2.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r7 = 0
            java.lang.Object r6 = r0.get(r7)
            X.C626936e.A06(r6)
            X.3ZF r6 = (X.AnonymousClass3ZF) r6
            r5 = 1
            r8 = r17
            if (r17 == 0) goto L_0x001e
            boolean r1 = r8.A0U()
            r0 = 1
            if (r1 != 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            if (r0 == 0) goto L_0x002d
            boolean r0 = r15.A0s
            if (r0 == 0) goto L_0x0075
        L_0x002d:
            X.1VX r11 = r15.A0f
            X.2sr r10 = r15.A0K
            java.util.List r3 = X.C106255Yf.A01(r10, r11, r6)
            r9 = 0
        L_0x0036:
            int r13 = r3.size()
            int r12 = r3.size()
            r0 = 3675(0xe5b, float:5.15E-42)
            boolean r1 = r11.A0X(r0)
            r0 = 3
            if (r1 == 0) goto L_0x004c
            r0 = 8
            if (r12 <= r0) goto L_0x004c
            r0 = 5
        L_0x004c:
            int r0 = java.lang.Math.min(r13, r0)
            if (r9 >= r0) goto L_0x0060
            X.3Ex r1 = r15.A0Y
            java.lang.Object r0 = r3.get(r9)
            X.4uZ r0 = (X.C95814uZ) r0
            X.C86614Ku.A1P(r1, r0, r4)
            int r9 = r9 + 1
            goto L_0x0036
        L_0x0060:
            int r0 = r4.size()
            if (r0 != 0) goto L_0x0075
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r10)
            if (r1 == 0) goto L_0x0075
            X.3Ex r0 = r15.A0Y
            X.3ZH r0 = r0.A07(r1)
            r4.add(r0)
        L_0x0075:
            boolean r2 = r2.A05()
            com.whatsapp.voipcalling.CallInfo r9 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r9 == 0) goto L_0x0093
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 != r0) goto L_0x015d
            boolean r0 = r9.isAudioChat()
            if (r0 == 0) goto L_0x015d
            X.1VX r0 = r15.A0f
            boolean r0 = X.C627436k.A0J(r0)
            if (r0 == 0) goto L_0x015d
        L_0x0093:
            r12 = 0
        L_0x0094:
            int r0 = r6.A0H
            r1 = 2
            if (r0 != r1) goto L_0x014e
            r14 = 2131234233(0x7f080db9, float:1.8084626E38)
            if (r2 == 0) goto L_0x0158
        L_0x009e:
            r10 = 2131895363(0x7f122443, float:1.9425557E38)
        L_0x00a1:
            if (r12 == 0) goto L_0x0144
            r0 = 2131895297(0x7f122401, float:1.9425423E38)
        L_0x00a6:
            r13 = 2131101294(0x7f06066e, float:1.7814994E38)
            r9 = r18
            if (r18 != 0) goto L_0x00b0
            r13 = 2131102700(0x7f060bec, float:1.7817845E38)
        L_0x00b0:
            X.5Wp r11 = new X.5Wp
            r11.<init>()
            r11.A00 = r14
            r11.A01 = r0
            r11.A0A = r4
            r11.A02 = r10
            r11.A0C = r12
            r11.A0E = r2
            boolean r10 = r15.A0s
            int r0 = r6.A0H
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r10 == 0) goto L_0x013b
            if (r0 == 0) goto L_0x0132
            r1 = 2131890494(0x7f12113e, float:1.9415681E38)
        L_0x00d0:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.6pW r0 = X.AnonymousClass4L0.A0N(r0, r1)
            r11.A07 = r0
            r11.A0B = r3
            r1 = 0
            if (r10 == 0) goto L_0x0130
            int r2 = r3.size()
            int r0 = r4.size()
            if (r2 <= r0) goto L_0x0130
            java.lang.Object[] r2 = new java.lang.Object[r5]
            int r14 = r3.size()
            int r0 = r4.size()
            int r14 = r14 - r0
            X.AnonymousClass000.A1P(r2, r14, r7)
            r0 = 2131892301(0x7f12184d, float:1.9419346E38)
            X.6pW r0 = X.AnonymousClass4L0.A0N(r2, r0)
        L_0x00fc:
            r11.A08 = r0
            if (r10 == 0) goto L_0x010e
            r1 = 2131896425(0x7f122869, float:1.942771E38)
            if (r12 == 0) goto L_0x0108
            r1 = 2131895416(0x7f122478, float:1.9425664E38)
        L_0x0108:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.6pW r1 = X.AnonymousClass4L0.A0N(r0, r1)
        L_0x010e:
            r11.A06 = r1
            r11.A03 = r13
            if (r10 == 0) goto L_0x011d
            int r0 = r3.size()
            if (r0 > r5) goto L_0x011c
            if (r12 != 0) goto L_0x011d
        L_0x011c:
            r7 = 1
        L_0x011d:
            r11.A0F = r7
            X.5R4 r1 = r11.A00()
            java.util.List r0 = r6.A08()
            int r0 = r0.size()
            X.5R4 r0 = r15.A0F(r1, r8, r9, r0)
            return r0
        L_0x0130:
            r0 = r1
            goto L_0x00fc
        L_0x0132:
            r1 = 2131890495(0x7f12113f, float:1.9415683E38)
            if (r2 == 0) goto L_0x00d0
            r1 = 2131890493(0x7f12113d, float:1.941568E38)
            goto L_0x00d0
        L_0x013b:
            r1 = 2131895345(0x7f122431, float:1.942552E38)
            if (r12 == 0) goto L_0x00d0
            r1 = 2131895346(0x7f122432, float:1.9425522E38)
            goto L_0x00d0
        L_0x0144:
            r0 = 2131895365(0x7f122445, float:1.942556E38)
            if (r2 == 0) goto L_0x00a6
            r0 = 2131895362(0x7f122442, float:1.9425555E38)
            goto L_0x00a6
        L_0x014e:
            r14 = 2131231718(0x7f0803e6, float:1.8079525E38)
            if (r2 == 0) goto L_0x0158
            r14 = 2131231803(0x7f08043b, float:1.8079697E38)
            goto L_0x009e
        L_0x0158:
            r10 = 2131895366(0x7f122446, float:1.9425563E38)
            goto L_0x00a1
        L_0x015d:
            X.39J r0 = r6.A0E
            java.lang.String r0 = r0.A02
            java.lang.String r1 = X.C627436k.A07(r0)
            java.lang.String r0 = r9.callId
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0093
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0187
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 == r0) goto L_0x0187
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0187
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 == r0) goto L_0x0187
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 == r0) goto L_0x0187
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0093
        L_0x0187:
            r12 = 1
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A0E(X.5rE, X.3ZH, java.lang.String):X.5R4");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r11.A0U() == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r11.A0U() == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass5R4 A0F(X.AnonymousClass5R4 r10, X.AnonymousClass3ZH r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            X.5Wp r2 = new X.5Wp
            r2.<init>(r10)
            if (r11 == 0) goto L_0x000e
            boolean r1 = r11.A0U()
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2.A0D = r0
            boolean r8 = r9.A0s
            java.util.List r7 = r10.A0B
            X.3Ex r6 = r9.A0Y
            X.5ZU r4 = r9.A0Z
            r5 = 1
            r3 = 0
            if (r11 == 0) goto L_0x0024
            boolean r1 = r11.A0U()
            r0 = 1
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r12 == 0) goto L_0x0053
            X.6pU r1 = new X.6pU
            r1.<init>(r12)
        L_0x002c:
            X.C626936e.A06(r1)
            r2.A05 = r1
            if (r11 == 0) goto L_0x0051
            boolean r0 = r11.A0U()
            if (r0 == 0) goto L_0x0051
            if (r12 == 0) goto L_0x0051
            java.lang.String r0 = X.C18300x5.A0h(r4, r11)
            X.6pU r1 = new X.6pU
            r1.<init>(r0)
        L_0x0044:
            r2.A04 = r1
            java.lang.String r0 = A01(r11)
            r2.A09 = r0
            X.5R4 r0 = r2.A00()
            return r0
        L_0x0051:
            r1 = 0
            goto L_0x0044
        L_0x0053:
            if (r8 == 0) goto L_0x006f
            if (r11 == 0) goto L_0x006f
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r4.A0H(r11)
        L_0x005d:
            X.6pU r1 = new X.6pU
            r1.<init>(r0)
            goto L_0x002c
        L_0x0063:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = X.C18300x5.A0h(r4, r11)
            r1[r3] = r0
            r0 = 2131890492(0x7f12113c, float:1.9415677E38)
            goto L_0x0076
        L_0x006f:
            if (r13 != 0) goto L_0x007b
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131895368(0x7f122448, float:1.9425567E38)
        L_0x0076:
            X.6pW r1 = X.AnonymousClass4L0.A0N(r1, r0)
            goto L_0x002c
        L_0x007b:
            if (r0 == 0) goto L_0x0086
            if (r11 == 0) goto L_0x0086
            java.lang.String r0 = X.C18300x5.A0h(r4, r11)
            if (r0 == 0) goto L_0x0086
            goto L_0x005d
        L_0x0086:
            r0 = 3
            X.7Qw r1 = X.C107305b5.A04(r6, r4, r7, r0, r3)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A0F(X.5R4, X.3ZH, java.lang.String, int):X.5R4");
    }

    public void A0H() {
        if (!this.A0F) {
            Log.d("CallsHistoryFragmentV2ViewModel/refreshScreenState skip");
            return;
        }
        Log.d("CallsHistoryFragmentV2ViewModel/refreshScreenState");
        C18270x1.A0w(new AnonymousClass68M((Object) this, 4), this.A0n);
    }

    public final void A0I() {
        int i;
        if (C627436k.A0I(this.A0f) && (i = this.A00) > 0) {
            C620733j r0 = this.A0b;
            String A062 = C162307rf.A06(C620733j.A02(r0), String.valueOf(i));
            ArrayList arrayList = this.A0C;
            arrayList.add(new AnonymousClass8FZ(A062));
            C112425ji r6 = this.A04;
            if (r6 != null && r6.A00 < System.currentTimeMillis() + 604800000) {
                arrayList.add(r6);
            }
        }
    }

    public void A0J(C185658u2 r7) {
        if (C18320x8.A1U(this.A0T.A01)) {
            int BCW = r7.BCW();
            C626936e.A0D(AnonymousClass001.A1U(BCW), "search result is -1");
            C150987Sz r5 = this.A0U;
            long j = (long) BCW;
            Integer A002 = A00(r7);
            if (r5.A00 == null) {
                C626936e.A0D(false, "sessionId is null");
                return;
            }
            AnonymousClass4s0 A003 = r5.A00();
            A003.A02 = A002;
            A003.A04 = Long.valueOf(j);
            A003.A01 = C18290x4.A0Z();
            A003.A03 = C18290x4.A0b();
            r5.A02.BhD(A003);
        }
    }

    public void A0K(C185658u2 r7, boolean z) {
        if (C18320x8.A1U(this.A0T.A01)) {
            int BCW = r7.BCW();
            C626936e.A0D(AnonymousClass001.A1U(BCW), "search result is -1");
            C150987Sz r5 = this.A0U;
            long j = (long) BCW;
            Integer A002 = A00(r7);
            if (r5.A00 == null) {
                C626936e.A0D(false, "sessionId is null");
                return;
            }
            AnonymousClass4s0 A003 = r5.A00();
            A003.A02 = A002;
            A003.A04 = Long.valueOf(j);
            A003.A01 = C18290x4.A0Z();
            A003.A03 = C18280x3.A0S();
            A003.A00 = Integer.valueOf(z ? 1 : 0);
            r5.A02.BhD(A003);
        }
    }

    public void A0L(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        C87304Ox r1 = this.A0T;
        if (C18320x8.A1U(r1.A01)) {
            r1.filter(r1.A01);
        } else {
            A0M(arrayList, linkedHashMap);
        }
        A0H();
    }

    public static final Integer A00(C185658u2 r3) {
        int B8k = r3.B8k();
        if (B8k == 1) {
            return C18290x4.A0Z();
        }
        if (B8k == 2 || B8k == 3 || B8k == 4 || B8k == 7) {
            return 2;
        }
        if (B8k == 8) {
            return 1;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Unknown itemType: ");
        A0o2.append(B8k);
        C18270x1.A0z(A0o2);
        return null;
    }

    public final void A0M(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        ArrayList A0s2 = AnonymousClass001.A0s();
        this.A0C = A0s2;
        AnonymousClass8FU r0 = this.A01;
        if (r0 != null) {
            A0s2.add(r0);
        }
        AnonymousClass8FV r02 = this.A02;
        if (r02 != null) {
            A0s2.add(r02);
        }
        if (arrayList.size() > 0) {
            A0s2.add(this.A0p.get(C18290x4.A0Z()));
            this.A0C.addAll(arrayList);
        }
        A0I();
        if (linkedHashMap.size() > 0) {
            this.A0C.add(this.A0p.get(AnonymousClass001.A0f()));
            this.A0C.addAll(linkedHashMap.values());
        }
        if (this.A0H && (!this.A0q.isEmpty() || !this.A0o.isEmpty())) {
            AnonymousClass8FW r1 = this.A03;
            if (r1 == null) {
                r1 = new AnonymousClass8FW();
                this.A03 = r1;
            }
            this.A0C.add(r1);
        }
        this.A0l.A0H(this.A0C);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.8FU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.8FV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.8FU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.8FU} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallsHistoryFragmentV2ViewModel(X.C56972sr r11, X.AnonymousClass5XL r12, X.C150987Sz r13, X.AnonymousClass5IP r14, X.C112415jh r15, X.C44772Xk r16, X.C64773Ex r17, X.AnonymousClass5ZU r18, X.C56612sH r19, X.C620733j r20, X.C56762sW r21, X.C56892sj r22, X.C55422qK r23, X.AnonymousClass1VX r24, X.C66493Lq r25, X.C28781hl r26, X.C52472lX r27, X.C56572sD r28, X.C187958y5 r29, X.AnonymousClass4FS r30) {
        /*
            r10 = this;
            r10.<init>()
            r2 = 0
            X.686 r1 = new X.686
            r1.<init>(r10, r2)
            r10.A0h = r1
            X.7DD r7 = new X.7DD
            r7.<init>(r10)
            r10.A0Q = r7
            X.7D9 r0 = new X.7D9
            r0.<init>(r10)
            r10.A0M = r0
            X.7DA r0 = new X.7DA
            r0.<init>(r10)
            r10.A0N = r0
            X.7DE r0 = new X.7DE
            r0.<init>(r10)
            r10.A0R = r0
            X.7DF r0 = new X.7DF
            r0.<init>(r10)
            r10.A0S = r0
            X.7DB r0 = new X.7DB
            r0.<init>(r10)
            r10.A0O = r0
            X.7DC r0 = new X.7DC
            r0.<init>(r10)
            r10.A0P = r0
            X.08M r0 = X.AnonymousClass08M.A01()
            r10.A0J = r0
            X.4Ox r0 = new X.4Ox
            r0.<init>(r10)
            r10.A0T = r0
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            r10.A0p = r4
            java.util.LinkedHashMap r0 = X.C18320x8.A0r()
            r10.A0q = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r10.A0r = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r10.A0C = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r10.A0o = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            X.107 r3 = X.AnonymousClass4L0.A0O(r0)
            r10.A0l = r3
            r0 = r19
            r10.A0a = r0
            r6 = r24
            r10.A0f = r6
            r10.A0K = r11
            r9 = r30
            r10.A0n = r9
            r10.A0W = r15
            r0 = r28
            r10.A0k = r0
            r10.A0U = r13
            r0 = r17
            r10.A0Y = r0
            r0 = r18
            r10.A0Z = r0
            r0 = r29
            r10.A0m = r0
            r0 = r20
            r10.A0b = r0
            r10.A0L = r12
            r0 = r25
            r10.A0g = r0
            r0 = r27
            r10.A0j = r0
            r0 = r21
            r10.A0c = r0
            r0 = r16
            r10.A0X = r0
            r0 = r23
            r10.A0e = r0
            r8 = r26
            r10.A0i = r8
            r10.A0V = r14
            r0 = r22
            r10.A0d = r0
            r5 = 1
            X.3dI r0 = new X.3dI
            r0.<init>(r9, r5)
            r10.A0B = r0
            r0 = 3675(0xe5b, float:5.15E-42)
            boolean r0 = r6.A0X(r0)
            r10.A0s = r0
            r0 = 6792(0x1a88, float:9.518E-42)
            boolean r0 = X.C56952sp.A0J(r6, r0)
            r10.A0G = r0
            r12.A06 = r7
            X.2vE r7 = X.C58422vE.A01
            r0 = 3637(0xe35, float:5.097E-42)
            boolean r0 = r6.A0Y(r7, r0)
            if (r0 == 0) goto L_0x00df
            r8.A06(r1)
        L_0x00df:
            r0 = 5370(0x14fa, float:7.525E-42)
            int r0 = r6.A0N(r0)
            if (r0 != r5) goto L_0x014b
            X.8FV r1 = new X.8FV
            r1.<init>()
            r10.A02 = r1
        L_0x00ee:
            java.util.ArrayList r0 = r10.A0C
            r0.add(r2, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 2131887369(0x7f120509, float:1.9409343E38)
            X.8FZ r0 = new X.8FZ
            r0.<init>((int) r1)
            r4.put(r2, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1 = 2131887370(0x7f12050a, float:1.9409345E38)
            X.8FZ r0 = new X.8FZ
            r0.<init>((int) r1)
            r4.put(r2, r0)
            r0 = 3637(0xe35, float:5.097E-42)
            boolean r0 = r6.A0Y(r7, r0)
            java.lang.Integer r2 = X.C18280x3.A0S()
            r1 = 2131893375(0x7f121c7f, float:1.9421525E38)
            if (r0 == 0) goto L_0x013b
            r1 = 2131887367(0x7f120507, float:1.940934E38)
            X.8FZ r0 = new X.8FZ
            r0.<init>((int) r1)
            java.lang.Integer r2 = X.C18270x1.A0F(r2, r0, r4)
            r1 = 2131887368(0x7f120508, float:1.9409341E38)
            X.8FZ r0 = new X.8FZ
            r0.<init>((int) r1)
            java.lang.Integer r2 = X.C18270x1.A0G(r2, r0, r4)
            r1 = 2131887366(0x7f120506, float:1.9409337E38)
        L_0x013b:
            X.8FZ r0 = new X.8FZ
            r0.<init>((int) r1)
            r4.put(r2, r0)
            r10.A0H = r5
            java.util.ArrayList r0 = r10.A0C
            r3.A0H(r0)
            return
        L_0x014b:
            X.8FU r1 = new X.8FU
            r1.<init>()
            r10.A01 = r1
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.<init>(X.2sr, X.5XL, X.7Sz, X.5IP, X.5jh, X.2Xk, X.3Ex, X.5ZU, X.2sH, X.33j, X.2sW, X.2sj, X.2qK, X.1VX, X.3Lq, X.1hl, X.2lX, X.2sD, X.8y5, X.4FS):void");
    }
}
