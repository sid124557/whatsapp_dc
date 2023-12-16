package X;

/* renamed from: X.3DB  reason: invalid class name */
public class AnonymousClass3DB implements AnonymousClass66U {
    public final AnonymousClass3S7 A00;
    public final AnonymousClass33X A01;
    public final C55522qU A02;

    public void BMd() {
        AnonymousClass33X r3 = this.A01;
        boolean A0Y = r3.A03.A0Y(C58422vE.A02, 366);
        if (A0Y && !C18280x3.A1W(r3.A05.A01(), "is_cleared")) {
            r3.A03();
            r3.A06();
        }
        C18270x1.A0l(r3.A05.A01().edit(), "is_cleared", A0Y);
        C55522qU r4 = this.A02;
        if (r4.A01 == null) {
            C72173dI r32 = new C72173dI(r4.A08, false);
            r4.A01 = r32;
            r32.A04(C71263bp.A00(r4, 33), 800);
        }
        if (r4.A04.A0Y(C58422vE.A01, 1799)) {
            AnonymousClass3S8 r42 = r4.A07;
            C71263bp A002 = C71263bp.A00(r42, 38);
            r42.A00.A04(A002, ((long) AnonymousClass0x9.A1C().nextInt(400)) + 800);
        }
    }

    public AnonymousClass3DB(AnonymousClass3S7 r1, AnonymousClass33X r2, C55522qU r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public String BDW() {
        return "UserNoticeAsyncInit";
    }

    public /* synthetic */ void BMe() {
    }
}
