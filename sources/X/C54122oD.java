package X;

/* renamed from: X.2oD  reason: invalid class name and case insensitive filesystem */
public class C54122oD {
    public final C116985rC A00;
    public final C69263Wi A01;
    public final C50422i9 A02;
    public final C56612sH A03;
    public final AnonymousClass33p A04;
    public final C56542sA A05;
    public final C56982ss A06;
    public final C28891hw A07;
    public final C56152rV A08;
    public final AnonymousClass2R8 A09;
    public final AnonymousClass3LP A0A;
    public final AnonymousClass4FV A0B;
    public final C619933b A0C;
    public final C55832qz A0D;
    public final AnonymousClass4FS A0E;

    public void A00(C95814uZ r7, int i, boolean z, boolean z2) {
        A01(r7, i, z, z2, false);
    }

    public void A01(C95814uZ r15, int i, boolean z, boolean z2, boolean z3) {
        C56542sA r5 = this.A05;
        C95814uZ r6 = r15;
        if (r5.A09(r15)) {
            int i2 = this.A06.A0B(r15).A00;
            if (i2 > 0) {
                AnonymousClass3LP r0 = this.A0A;
                AnonymousClass4FV r2 = this.A0B;
                C56152rV r9 = this.A08;
                AnonymousClass4FS r1 = this.A0E;
                if (C57362tW.A00(r0, r15)) {
                    r1.BkM(new C71433c6(r9, r15, r2, i2, 0));
                }
            }
            if (z2) {
                this.A0C.A08(r15);
            }
            this.A0C.A09(r15, (C624134x) null);
            r5.A05(r6, (C624134x) null, 0, 0, i, z, z3);
            AnonymousClass33p r12 = this.A04;
            C18270x1.A0i(C18270x1.A03(r12), "last_read_conversation_time", this.A03.A0H());
            this.A01.A0T(new C70333aK(this.A07, r15, this.A02, 0), 300);
        }
    }

    public void A02(C95814uZ r10, boolean z) {
        C56542sA r4 = this.A05;
        C183538qC r3 = r4.A02;
        C95814uZ r5 = r10;
        C18310x6.A0Q(r3).A02.A00(r10, 8);
        AnonymousClass31A A0A2 = r4.A00.A0A(r10, false);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A0A2 == null) {
            C18260x0.A1R(A0o, "msgstore/setchatunseen/nochat/", r10);
        } else {
            AnonymousClass0x7.A1F(A0o, "msgstore/setchatunseen/", r10);
            C18260x0.A1L(A0o, A0A2.A08());
            A0A2.A0G(-1, 0, 0, 0);
            C18310x6.A0Q(r3).A09.A01(new C71643cR(r4, r5, A0A2, 15, z), 1);
        }
        this.A07.A0A(r10);
    }

    public C54122oD(C116985rC r1, C69263Wi r2, C50422i9 r3, C56612sH r4, AnonymousClass33p r5, C56542sA r6, C56982ss r7, C28891hw r8, C56152rV r9, AnonymousClass2R8 r10, AnonymousClass3LP r11, AnonymousClass4FV r12, C619933b r13, C55832qz r14, AnonymousClass4FS r15) {
        this.A03 = r4;
        this.A01 = r2;
        this.A0E = r15;
        this.A06 = r7;
        this.A0B = r12;
        this.A05 = r6;
        this.A0A = r11;
        this.A02 = r3;
        this.A0D = r14;
        this.A08 = r9;
        this.A0C = r13;
        this.A09 = r10;
        this.A04 = r5;
        this.A07 = r8;
        this.A00 = r1;
    }
}
