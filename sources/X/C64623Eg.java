package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3Eg  reason: invalid class name and case insensitive filesystem */
public final class C64623Eg implements C84384Cd {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C56942so A02;
    public final C58372v9 A03;
    public final C64773Ex A04;
    public final AnonymousClass5ZU A05;
    public final C620733j A06;
    public final C56982ss A07;
    public final C56892sj A08;
    public final C51562k1 A09;
    public final AnonymousClass1VX A0A;
    public final C29241iV A0B;
    public final C52472lX A0C;
    public final AnonymousClass31C A0D;
    public final AnonymousClass4FS A0E;

    public int B9t(C27991fJ r4) {
        Object next;
        C162457s7.A0J(r4, 0);
        if (this.A07.A06(r4) != 1 && (r4 = this.A02.A01(r4)) == null) {
            return 0;
        }
        C129526aS A042 = C56892sj.A01(this.A08, r4).A04();
        C162457s7.A0D(A042);
        C71983cz r1 = new C71983cz(new C72623e1(C826744m.A00, C829345m.A04(new AnonymousClass41P(this), new C626335w(A042, 1))));
        if (!r1.hasNext()) {
            next = null;
        } else {
            next = r1.next();
        }
        Number number = (Number) next;
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public C64623Eg(C69263Wi r13, C56972sr r14, C56942so r15, C58372v9 r16, C64773Ex r17, AnonymousClass5ZU r18, C620733j r19, C56982ss r20, C56892sj r21, C51562k1 r22, AnonymousClass1VX r23, C29241iV r24, C52472lX r25, AnonymousClass31C r26, AnonymousClass4FS r27) {
        AnonymousClass4FS r1 = r27;
        AnonymousClass1VX r5 = r23;
        C56982ss r8 = r20;
        C18260x0.A0f(r5, r13, r1, r14, r8);
        AnonymousClass31C r2 = r26;
        C52472lX r3 = r25;
        C620733j r9 = r19;
        AnonymousClass5ZU r10 = r18;
        C64773Ex r11 = r17;
        C18260x0.A0g(r2, r11, r10, r9, r3);
        C29241iV r4 = r24;
        C56892sj r7 = r21;
        C18260x0.A0Y(r15, r7, r4);
        C51562k1 r6 = r22;
        C162457s7.A0J(r6, 14);
        this.A0A = r5;
        this.A00 = r13;
        this.A0E = r1;
        this.A01 = r14;
        this.A07 = r8;
        this.A0D = r2;
        this.A04 = r11;
        this.A05 = r10;
        this.A06 = r9;
        this.A0C = r3;
        this.A02 = r15;
        this.A08 = r7;
        this.A0B = r4;
        this.A09 = r6;
        this.A03 = r16;
    }

    public Set B5g(C27991fJ r4) {
        C27991fJ A032;
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        if (this.A07.A06(r4) == 1) {
            A17.add(r4);
            C52882mC A002 = this.A02.A0H.A00(r4);
            if (!(A002 == null || (A032 = AnonymousClass34R.A03(A002.A02)) == null || !this.A08.A0C(A032))) {
                A17.add(A032);
            }
        }
        return C73723fy.A0P(A17);
    }
}
