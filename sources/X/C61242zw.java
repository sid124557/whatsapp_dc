package X;

/* renamed from: X.2zw  reason: invalid class name and case insensitive filesystem */
public final class C61242zw {
    public final C56612sH A00;
    public final AnonymousClass33p A01;
    public final C66543Lv A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass31C A04;
    public final C49202g9 A05;
    public final C55312q9 A06;
    public final C44982Yf A07;
    public final C44992Yg A08;
    public final C56832sd A09;
    public final AnonymousClass4FS A0A;

    public final void A01(C95814uZ r12) {
        C162457s7.A0J(r12, 0);
        C44992Yg r4 = this.A08;
        C56612sH r3 = this.A00;
        r4.A00(r3.A0H(), true);
        A02(r12);
        C41772Ln r0 = new C41772Ln(r3, this.A04);
        C44972Ye r32 = new C44972Ye(r12, this);
        AnonymousClass31C r42 = r0.A01;
        String A032 = r42.A03();
        r42.A0D(new AnonymousClass4KQ(r32, 7), C41032Ir.A05(new C35711xJ(new C35371wl((Long) 20231028L), new C35371wl(A032, 22))), A032, 434, 20000);
    }

    public static final /* synthetic */ void A00(C61242zw r2, AnonymousClass4GP r3) {
        if (r2.A03.A0Y(C58422vE.A02, 6730)) {
            r3.invoke();
        }
    }

    public final boolean A03(C95814uZ r7) {
        if (C18280x3.A1W(C18310x6.A0F(this.A08.A01), "pref_disclosure_tos_state")) {
            AnonymousClass66R r2 = this.A07.A01;
            if (C18310x6.A0F(r2).getBoolean(r7.getRawString(), false)) {
                long A0B = AnonymousClass0x2.A0B(C18310x6.A0F(r2), C18260x0.A03(r7, "pref_disclosure_eligibility_ts_", AnonymousClass001.A0o()));
                if (C56612sH.A03(this.A00, A0B) > C56952sp.A04(this.A03, 5990)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean A04(C95814uZ r4) {
        if (!this.A03.A0Y(C58422vE.A02, 5869) || !C18310x6.A0F(this.A07.A01).getBoolean(r4.getRawString(), false) || !C18310x6.A0F(this.A08.A01).getBoolean("pref_disclosure_tos_state", false)) {
            return false;
        }
        return true;
    }

    public C61242zw(C56612sH r2, AnonymousClass33p r3, C66543Lv r4, AnonymousClass1VX r5, AnonymousClass31C r6, C49202g9 r7, C55312q9 r8, C44982Yf r9, C44992Yg r10, C56832sd r11, AnonymousClass4FS r12) {
        C18260x0.A0f(r2, r5, r12, r6, r3);
        C18260x0.A0g(r11, r4, r7, r8, r9);
        C162457s7.A0J(r10, 11);
        this.A00 = r2;
        this.A03 = r5;
        this.A0A = r12;
        this.A04 = r6;
        this.A01 = r3;
        this.A09 = r11;
        this.A02 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A08 = r10;
    }

    public final void A02(C95814uZ r6) {
        if (A03(r6)) {
            AnonymousClass66R r3 = this.A07.A01;
            if (!C18310x6.A0F(r3).getBoolean(C18260x0.A03(r6, "pref_disclosure_system_message_shown_", AnonymousClass001.A0o()), false)) {
                C18270x1.A0f(C18270x1.A04(r3), C18260x0.A03(r6, "pref_disclosure_system_message_shown_", AnonymousClass001.A0o()));
                C70133a0.A01(this.A0A, this, r6, 17);
            }
        }
    }
}
