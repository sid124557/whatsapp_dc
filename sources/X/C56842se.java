package X;

import android.content.ContentValues;

/* renamed from: X.2se  reason: invalid class name and case insensitive filesystem */
public final class C56842se {
    public C39822Dl A00;
    public C39832Dm A01;
    public C39842Dn A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C69263Wi A06;
    public final C49712gy A07;
    public final AnonymousClass33p A08;
    public final C56982ss A09;
    public final C66543Lv A0A;
    public final C56652sL A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass31C A0D;
    public final AnonymousClass5UP A0E;
    public final C53942nv A0F;
    public final C45362Zt A0G;
    public final C47112cj A0H;
    public final C161747qM A0I;
    public final C56212rc A0J;
    public final AnonymousClass2LW A0K;
    public final AnonymousClass2QN A0L;
    public final AnonymousClass2SP A0M;
    public final AnonymousClass32F A0N;
    public final C40712Hl A0O;
    public final C55952rB A0P;
    public final AnonymousClass4FS A0Q;
    public final AnonymousClass66R A0R = C154517dI.A01(C817040t.A00);

    public final AnonymousClass495 A00(C95804uY r16, AnonymousClass4DF r17, String str, boolean z, boolean z2) {
        AnonymousClass4DF r6 = r17;
        C162457s7.A0J(r6, 4);
        if (!C18300x5.A1S(this.A0E)) {
            return null;
        }
        C39832Dm r1 = this.A01;
        if (r1 != null) {
            AnonymousClass4FS A8y = C64333Db.A8y(r1.A00.A01);
            C64333Db r12 = r1.A00.A01;
            C49552gi Anh = r12.Anh();
            C56842se A66 = C64333Db.A66(r12);
            C162047r8 AoV = r12.AoV();
            AnonymousClass1h3 r13 = new AnonymousClass1h3(C64333Db.A39(r12), C64333Db.A3L(r12), Anh, r16, r6, (AnonymousClass48L) r12.AOH.get(), (C53942nv) r12.AOM.get(), A66, AoV, A8y, str, z, z2);
            r13.A00();
            return r13;
        }
        throw C18270x1.A0S("getNewsletterPreviewGraphqlHandler");
    }

    public final C136746nC A01(C184498rv r4, String str, String str2) {
        C136746nC r1;
        C162457s7.A0J(str, 0);
        if (!C18300x5.A1S(this.A0E)) {
            r1 = new C136806nI(r4);
        } else {
            r1 = new C136796nH(r4, str, str2, this.A0C.A0O(C58422vE.A02, 5853));
        }
        this.A07.A02(r1);
        return r1;
    }

    public final synchronized void A02() {
        AnonymousClass5UP r4 = this.A0E;
        if (C18300x5.A1S(r4)) {
            C183538qC r3 = this.A08.A01;
            if (!C18300x5.A0B(r3).getBoolean("newsletter_subscriptions_fetched", false) && !this.A05) {
                A0C(false);
            }
            if (!C18300x5.A0B(r3).getBoolean("newsletter_my_reactions_fetched", false) && !this.A04 && C18300x5.A1S(r4)) {
                this.A04 = true;
                this.A0J.A01((C95804uY) null);
            }
        }
    }

    public final void A04(C372321l r6, C95804uY r7) {
        C162457s7.A0J(r6, 1);
        C56652sL r4 = this.A0B;
        AnonymousClass1RL r3 = (AnonymousClass1RL) C56982ss.A00(r4.A02, r7);
        if (r3 != null) {
            r3.A0B = r6;
            ContentValues A062 = AnonymousClass0x9.A06();
            A062.put("suspended", Integer.valueOf(r3.A0B.value));
            r4.A01(A062, r3);
        } else {
            C18260x0.A1Q(AnonymousClass001.A0o(), "NewsletterStore/failed to find newsletter in chatsCache for ", r7);
        }
        this.A0I.A06(r7);
    }

    public final void A06(C95804uY r18) {
        C95804uY r3 = r18;
        C162457s7.A0J(r3, 0);
        AnonymousClass5UP r1 = this.A0E;
        if (C18300x5.A1S(r1) && C106855aH.A04(this.A09, r3, r1)) {
            this.A07.A02(new AnonymousClass1h0(r3, (AnonymousClass4DF) null, new C157007hZ(false, false, false, true, false, false, false, false, false, true, true, true)));
        }
    }

    public final void A07(C95804uY r12) {
        C95804uY r6 = r12;
        C162457s7.A0J(r12, 0);
        if (C18300x5.A1S(this.A0E)) {
            AnonymousClass1RL r0 = (AnonymousClass1RL) this.A09.A0A(r12, false);
            if (r0 != null && r0.A0K()) {
                this.A0A.A0Q(r12, (Long) null, false, true);
            }
            C56652sL r4 = this.A0B;
            AnonymousClass1RL r3 = (AnonymousClass1RL) r4.A02.A0A(r12, false);
            if (r3 != null) {
                if (r3.A0K()) {
                    C372821q r02 = C372821q.GUEST;
                    C162457s7.A0J(r02, 0);
                    r3.A07 = r02;
                }
                r3.A0K = true;
                ContentValues A062 = AnonymousClass0x9.A06();
                C382326g.A00(A062, "deleted", true);
                A062.put("membership", Integer.valueOf(r3.A07.value));
                r4.A01(A062, r3);
            }
            C53942nv r5 = this.A0F;
            C624134x A002 = C55122pp.A00(r5.A08, r5.A02.A02(r12));
            if (A002 == null || !(A002 instanceof C30341mI) || ((C30341mI) A002).A00 != 133) {
                r5.A01(r6, (Long) null, 133, r5.A03.A06(r12) + 1);
            }
            this.A0I.A06(r12);
        }
    }

    public final void A08(C95804uY r3) {
        C162457s7.A0J(r3, 0);
        AnonymousClass5UP r1 = this.A0E;
        if (C18300x5.A1S(r1) && C106855aH.A04(this.A09, r3, r1)) {
            C70113Zy.A01(this.A0Q, this, r3, 42);
        }
    }

    public final void A09(C95804uY r3) {
        C162457s7.A0J(r3, 0);
        AnonymousClass5UP r1 = this.A0E;
        if (C18300x5.A1S(r1) && C106855aH.A04(this.A09, r3, r1)) {
            C70113Zy.A01(this.A0Q, this, r3, 43);
        }
    }

    public final void A0A(C95804uY r3) {
        C162457s7.A0J(r3, 0);
        if (C18300x5.A1S(this.A0E)) {
            C70113Zy.A01(this.A0Q, this, r3, 45);
        }
    }

    public final void A0B(C95804uY r13, AnonymousClass4DF r14, String str, String str2, byte[] bArr, boolean z, boolean z2) {
        C95804uY r3 = r13;
        C162457s7.A0J(r13, 0);
        if (C18300x5.A1S(this.A0E)) {
            this.A07.A02(new C28501gz((C372921r) null, r3, r14, str, str2, bArr, true, z, z2, false));
        }
    }

    public C56842se(C69263Wi r21, C49712gy r22, AnonymousClass33p r23, C56982ss r24, C66543Lv r25, C56652sL r26, AnonymousClass1VX r27, AnonymousClass31C r28, AnonymousClass5UP r29, C53942nv r30, C45362Zt r31, C47112cj r32, C161747qM r33, C56212rc r34, AnonymousClass2LW r35, AnonymousClass2QN r36, AnonymousClass2SP r37, AnonymousClass32F r38, C40712Hl r39, C55952rB r40, AnonymousClass4FS r41) {
        AnonymousClass4FS r15 = r41;
        C56982ss r16 = r24;
        AnonymousClass1VX r0 = r27;
        C69263Wi r19 = r21;
        C49712gy r18 = r22;
        C18260x0.A0f(r0, r19, r15, r16, r18);
        AnonymousClass31C r12 = r28;
        AnonymousClass33p r17 = r23;
        C56652sL r13 = r26;
        C18260x0.A0W(r12, r17, r13);
        AnonymousClass5UP r11 = r29;
        C162457s7.A0J(r11, 9);
        AnonymousClass2QN r6 = r36;
        AnonymousClass32F r4 = r38;
        C45362Zt r9 = r31;
        C47112cj r8 = r32;
        C66543Lv r14 = r25;
        C18260x0.A0h(r14, r4, r9, r8, r6);
        C40712Hl r3 = r39;
        C55952rB r2 = r40;
        AnonymousClass0x2.A1C(r2, r3);
        C56212rc r7 = r34;
        AnonymousClass2SP r5 = r37;
        C53942nv r10 = r30;
        C18290x4.A1N(r10, r7, r5);
        this.A0C = r0;
        this.A06 = r19;
        this.A0Q = r15;
        this.A09 = r16;
        this.A07 = r18;
        this.A0D = r12;
        this.A08 = r17;
        this.A0B = r13;
        this.A0E = r11;
        this.A0I = r33;
        this.A0K = r35;
        this.A0A = r14;
        this.A0N = r4;
        this.A0G = r9;
        this.A0H = r8;
        this.A0L = r6;
        this.A0P = r2;
        this.A0O = r3;
        this.A0F = r10;
        this.A0J = r7;
        this.A0M = r5;
    }

    public final void A03(AnonymousClass1RL r3, AnonymousClass4GP r4) {
        if (C18300x5.A1S(this.A0E)) {
            C70353aM.A00(this.A0Q, this, r3, r4, 20);
        }
    }

    public final void A05(C95804uY r3) {
        AnonymousClass5UP r1 = this.A0E;
        if (C18300x5.A1S(r1) && C106855aH.A04(this.A09, r3, r1)) {
            this.A07.A02(C384827s.A00(r3, (AnonymousClass4DF) null));
        }
    }

    public final void A0C(boolean z) {
        if (C18300x5.A1S(this.A0E)) {
            A0D(true);
            this.A05 = true;
            C39842Dn r1 = this.A02;
            if (r1 != null) {
                AnonymousClass4FS A8y = C64333Db.A8y(r1.A00.A01);
                C64333Db r12 = r1.A00.A01;
                C56652sL A3L = C64333Db.A3L(r12);
                AnonymousClass33S r5 = (AnonymousClass33S) r12.AUY.get();
                new AnonymousClass1h1(C64333Db.A2s(r12), A3L, r12.Anh(), r5, (AnonymousClass48L) r12.AOH.get(), r12.AoV(), A8y, z).A00();
                return;
            }
            throw C18270x1.A0S("getAllSubscribedNewslettersGraphqlHandler");
        }
    }

    public final void A0D(boolean z) {
        if (!this.A03) {
            this.A03 = true;
            this.A0Q.BkM(new C71703cX(46, (Object) this, z));
        }
    }
}
