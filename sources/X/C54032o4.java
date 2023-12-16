package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2o4  reason: invalid class name and case insensitive filesystem */
public final class C54032o4 {
    public final C56612sH A00;
    public final C50202hn A01;
    public final C40362Fn A02;
    public final C44902Xx A03;
    public final C50002hT A04;
    public final C66543Lv A05;
    public final C40772Hr A06;
    public final C49202g9 A07;
    public final C56832sd A08;
    public final AnonymousClass4FS A09;
    public final C183538qC A0A;
    public final AnonymousClass66R A0B = C154517dI.A01(new C77813u0(this));

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r7.A03.A00() != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(com.whatsapp.jid.UserJid r8, boolean r9) {
        /*
            r7 = this;
            r6 = 0
            if (r8 == 0) goto L_0x0066
            X.2hn r0 = r7.A01
            X.1Qq r0 = r0.A01
            X.2e5 r3 = r0.A00(r8)
            boolean r0 = r3 instanceof X.C22891Qm
            if (r0 == 0) goto L_0x0066
            X.1Qm r3 = (X.C22891Qm) r3
            if (r3 == 0) goto L_0x0066
            X.66R r0 = r7.A0B
            java.lang.Object r0 = r0.getValue()
            X.2bm r0 = (X.C46522bm) r0
            boolean r5 = r0.A00()
            boolean r0 = r3.A06
            r4 = 1
            if (r0 != 0) goto L_0x0032
            X.2Fn r0 = r7.A02
            X.1VX r2 = r0.A00
            r1 = 976(0x3d0, float:1.368E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x003b
        L_0x0032:
            X.2Xx r0 = r7.A03
            boolean r0 = r0.A00()
            r1 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            if (r9 == 0) goto L_0x0067
            X.2hT r0 = r7.A04
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0067
            if (r5 == 0) goto L_0x0067
            if (r1 == 0) goto L_0x0067
            X.2Hr r0 = r7.A06
            X.1VX r2 = r0.A00
            r1 = 2935(0xb77, float:4.113E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x005c
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0067
        L_0x005c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            if (r0 == 0) goto L_0x0066
            boolean r6 = r0.booleanValue()
        L_0x0066:
            return r6
        L_0x0067:
            r4 = 0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54032o4.A01(com.whatsapp.jid.UserJid, boolean):boolean");
    }

    public final boolean A02(UserJid userJid, boolean z, boolean z2) {
        boolean z3 = this.A01.A01.A00(userJid) instanceof C22891Qm;
        boolean z4 = !((C46522bm) this.A0B.getValue()).A00();
        boolean A0Y = this.A06.A00.A0Y(C58422vE.A02, 2935);
        boolean z5 = !this.A07.A01(C369220g.CTWA);
        if (!this.A04.A01() || !z3 || !z4 || !z || !z5) {
            return false;
        }
        if (A0Y || z2) {
            return true;
        }
        return false;
    }

    public C54032o4(C56612sH r2, C50202hn r3, C40362Fn r4, C44902Xx r5, C50002hT r6, C66543Lv r7, C40772Hr r8, C49202g9 r9, C56832sd r10, AnonymousClass4FS r11, C183538qC r12) {
        C18260x0.A0f(r2, r11, r10, r7, r6);
        C18260x0.A0W(r5, r12, r9);
        C162457s7.A0J(r4, 11);
        this.A00 = r2;
        this.A09 = r11;
        this.A08 = r10;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
        this.A0A = r12;
        this.A07 = r9;
        this.A06 = r8;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void A00(C95814uZ r7, boolean z) {
        if (A01(AnonymousClass32Y.A03(r7), z)) {
            AnonymousClass66R r5 = this.A0B;
            C41782Lo r4 = ((C46522bm) r5.getValue()).A02;
            if (!C18310x6.A0F(r4.A01).getBoolean(C18260x0.A03(r7, "pref_consumer_disclosure_message_shown_", AnonymousClass001.A0o()), false)) {
                C41782Lo r2 = ((C46522bm) r5.getValue()).A02;
                C18270x1.A0f(C18270x1.A04(r2.A01), C18260x0.A03(r7, "pref_consumer_disclosure_message_shown_", AnonymousClass001.A0o()));
                C71343bx.A00(this.A09, this, r7, 24);
            }
        }
    }
}
