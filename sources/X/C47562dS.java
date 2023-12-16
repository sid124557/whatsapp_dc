package X;

/* renamed from: X.2dS  reason: invalid class name and case insensitive filesystem */
public class C47562dS {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C56612sH A02;
    public final C56982ss A03;
    public final C66543Lv A04;
    public final AnonymousClass313 A05;
    public final C56412rw A06;
    public final C56892sj A07;
    public final C72303dV A08;
    public final C56662sM A09;
    public final C40482Fz A0A;
    public final C66443Ll A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass4FV A0D;
    public final AnonymousClass30N A0E;
    public final C42932Qc A0F;

    public void A00(C624134x r5, C30551md r6, Integer num, Integer num2) {
        C25201a8 r3 = new C25201a8();
        int i = 1;
        if (r6.A01 != 1) {
            i = 2;
        }
        r3.A01 = Integer.valueOf(i);
        r3.A02 = num;
        r3.A00 = num2;
        r3.A05 = Long.valueOf(r6.A0K);
        if (r5 != null) {
            r3.A04 = AnonymousClass0x9.A0m(r5.A05);
            Integer A032 = this.A06.A03(r5);
            if (A032 != null) {
                r3.A04 = C18280x3.A0U(A032);
            }
        }
        C95814uZ r2 = r6.A1J.A00;
        if (r2 != null) {
            r3.A06 = this.A0E.A04(r2.getRawString());
            r3.A03 = AnonymousClass0x9.A0m(this.A03.A04(r2));
        }
        this.A0D.BhD(r3);
    }

    public C47562dS(C56972sr r2, C64773Ex r3, C56612sH r4, C56982ss r5, C66543Lv r6, AnonymousClass313 r7, C56412rw r8, C56892sj r9, C72303dV r10, C56662sM r11, C40482Fz r12, C66443Ll r13, AnonymousClass1VX r14, AnonymousClass4FV r15, AnonymousClass30N r16, C42932Qc r17) {
        this.A02 = r4;
        this.A0C = r14;
        this.A00 = r2;
        this.A03 = r5;
        this.A0D = r15;
        this.A01 = r3;
        this.A09 = r11;
        this.A0B = r13;
        this.A0E = r16;
        this.A08 = r10;
        this.A05 = r7;
        this.A04 = r6;
        this.A0F = r17;
        this.A07 = r9;
        this.A0A = r12;
        this.A06 = r8;
    }
}
