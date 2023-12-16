package X;

/* renamed from: X.2hp  reason: invalid class name and case insensitive filesystem */
public class C50222hp {
    public final AnonymousClass2DU A00;
    public final AnonymousClass2DV A01;
    public final AnonymousClass2DW A02;
    public final AnonymousClass2DX A03;
    public final AnonymousClass2DY A04;
    public final AnonymousClass2DZ A05;
    public final C39712Da A06;
    public final C39722Db A07;

    public AnonymousClass315 A00(AnonymousClass39W r9) {
        AnonymousClass39W r4 = r9;
        int i = r9.A00;
        switch (i) {
            case 1:
                C64333Db r0 = this.A00.A00.A01;
                return new AnonymousClass1pL(r0.AnC(), r9, r0.Aq8());
            case 2:
                return new AnonymousClass1pM(r9, this.A01.A00.A01.Aq8());
            case 3:
                C64333Db r02 = this.A02.A00.A01;
                return new C32021pQ(C64333Db.A4B(r02), r9, r02.Aq8());
            case 4:
                return new AnonymousClass1pO(r9, this.A03.A00.A01.Aq8());
            case 5:
                if (!r9.A04() || r9.A03.A01 != 2) {
                    C64333Db r03 = this.A04.A00.A01;
                    return new AnonymousClass1pP(C64333Db.A4B(r03), r9, r03.Aq8());
                }
                C64333Db r04 = this.A07.A00.A01;
                return new AnonymousClass1pR(C64333Db.A4B(r04), r9, r04.Aq8());
            case 6:
                C64333Db r05 = this.A05.A00.A01;
                return new AnonymousClass1pK(C64333Db.A4B(r05), r9, r05.Aq8());
            case 7:
                C64333Db r06 = this.A06.A00.A01;
                return new C32011pN(C64333Db.A4B(r06), r4, r06.Aq3(), r06.Aq5(), r06.Aq8(), this);
            default:
                throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Unknown type of interactive message does not support customizations: ", AnonymousClass001.A0o(), i));
        }
    }

    public C50222hp(AnonymousClass2DU r1, AnonymousClass2DV r2, AnonymousClass2DW r3, AnonymousClass2DX r4, AnonymousClass2DY r5, AnonymousClass2DZ r6, C39712Da r7, C39722Db r8) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
    }

    public AnonymousClass315 A01(AnonymousClass4DV r2) {
        AnonymousClass39W B5s = r2.B5s();
        if (B5s == null) {
            return null;
        }
        return A00(B5s);
    }
}
