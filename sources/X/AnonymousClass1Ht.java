package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Ht  reason: invalid class name */
public final class AnonymousClass1Ht extends AnonymousClass3OH {
    public final C56972sr A00;
    public final C56982ss A01;
    public final AnonymousClass2RB A02;
    public final AnonymousClass1VX A03;

    public void AyD(C55032pg r18, C624134x r19) {
        boolean z;
        UserJid A0H;
        UserJid A032;
        C172548Lq A022;
        C373922i r4;
        C55032pg r3 = r18;
        C624134x r8 = r19;
        C18260x0.A0O(r8, r3);
        AnonymousClass275.A00(C815740g.A00, r8 instanceof C30601mi);
        C30601mi r82 = (C30601mi) r8;
        boolean z2 = false;
        if (r82.A01 == null && (r82.A02 == null || r82.A03 == null)) {
            z = false;
        } else {
            z = true;
        }
        AnonymousClass275.A00(C815840h.A00, z);
        byte[] bArr = r82.A04;
        AnonymousClass275.A00(C815940i.A00, AnonymousClass000.A1W(bArr));
        AnonymousClass2z0 A1v = r82.A1v();
        AnonymousClass275.A00(C816040j.A00, AnonymousClass000.A1W(A1v));
        C56972sr r6 = this.A00;
        C56982ss r1 = this.A01;
        C95814uZ r0 = A1v.A00;
        boolean z3 = r3.A06;
        if (r1.A06(AnonymousClass32V.A00(r0)) == 3 || z3) {
            A0H = r6.A0H();
        } else {
            A0H = C56972sr.A05(r6);
        }
        AnonymousClass275.A00(C816140k.A00, AnonymousClass000.A1W(A0H));
        C95814uZ A002 = C30331mH.A00(r82);
        if (!A1v.A02) {
            A032 = AnonymousClass32Y.A03(A002);
        } else if (z3) {
            A032 = r6.A0I();
        } else {
            A032 = C56972sr.A05(r6);
        }
        if (A032 != null) {
            z2 = true;
        }
        AnonymousClass275.A00(C816240l.A00, z2);
        AnonymousClass1A4 r32 = r3.A00;
        AnonymousClass1C3 r02 = ((AnonymousClass1EU) r32.A00).encEventResponseMessage_;
        if (r02 == null) {
            r02 = AnonymousClass1C3.DEFAULT_INSTANCE;
        }
        C130546c9 A0H2 = r02.A0H();
        AnonymousClass1ET r03 = ((AnonymousClass1C3) A0H2.A00).eventCreationMessageKey_;
        if (r03 == null) {
            r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r03);
        C33051sM.A02(C30331mH.A00(r82), A0X, A1v, false);
        AnonymousClass1ET r04 = (AnonymousClass1ET) A0X.A06();
        AnonymousClass1C3 r12 = (AnonymousClass1C3) C18320x8.A0C(A0H2);
        r04.getClass();
        r12.eventCreationMessageKey_ = r04;
        r12.bitField0_ |= 1;
        C372421m r62 = r82.A01;
        if (r62 != null) {
            AnonymousClass2RB r7 = this.A02;
            long j = r82.A00;
            String str = A1v.A01;
            C162457s7.A0C(str);
            C162457s7.A0J(bArr, 1);
            C18260x0.A0T(A032, A0H);
            C130546c9 A0G = AnonymousClass1BE.DEFAULT_INSTANCE.A0G();
            int ordinal = r62.ordinal();
            if (ordinal == 1) {
                r4 = C373922i.GOING;
            } else if (ordinal == 2) {
                r4 = C373922i.NOT_GOING;
            } else if (ordinal == 0) {
                r4 = C373922i.UNKNOWN;
            } else {
                throw C73153f1.A00();
            }
            AnonymousClass1BE r63 = (AnonymousClass1BE) C18320x8.A0C(A0G);
            r63.response_ = r4.value;
            r63.bitField0_ |= 1;
            AnonymousClass1BE r64 = (AnonymousClass1BE) C18320x8.A0C(A0G);
            r64.bitField0_ |= 2;
            r64.timestampMs_ = j;
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(0);
            C18280x3.A0u(A0H, A0l);
            C41852Lv A003 = C57512tl.A00(A032, A0H, r7.A04, str, "Event Response", bArr, C18290x4.A1b(A0l.toString()), C18290x4.A1Z(A0G));
            AnonymousClass275.A00(C815640f.A00, AnonymousClass000.A1W(A003));
            C172548Lq r42 = A003.A00;
            AnonymousClass1C3 r13 = (AnonymousClass1C3) C18320x8.A0C(A0H2);
            r13.bitField0_ |= 4;
            r13.encIv_ = r42;
            A022 = A003.A01;
        } else {
            C172548Lq A0H3 = C18280x3.A0H(A0H2, r82.A02);
            AnonymousClass1C3 r14 = (AnonymousClass1C3) A0H2.A00;
            r14.bitField0_ |= 4;
            r14.encIv_ = A0H3;
            byte[] bArr2 = r82.A03;
            A022 = C172548Lq.A02(bArr2, 0, bArr2.length);
        }
        AnonymousClass1C3 r15 = (AnonymousClass1C3) C18320x8.A0C(A0H2);
        r15.bitField0_ |= 2;
        r15.encPayload_ = A022;
        AnonymousClass1C3 r05 = (AnonymousClass1C3) A0H2.A06();
        AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r32, r05);
        A0L.encEventResponseMessage_ = r05;
        A0L.bitField1_ |= 536870912;
    }

    public AnonymousClass1Ht(C56972sr r1, C56982ss r2, AnonymousClass2RB r3, AnonymousClass1VX r4) {
        C18260x0.A0V(r4, r1, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
