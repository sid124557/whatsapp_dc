package X;

/* renamed from: X.2pA  reason: invalid class name and case insensitive filesystem */
public class C54712pA {
    public final C380625j A00;
    public final C42512Ol A01;
    public final AnonymousClass2ST A02;
    public final C40732Hn A03;

    public int A00(int i) {
        if (!this.A03.A00.A0Y(C58422vE.A02, 2003)) {
            return -1;
        }
        C42512Ol r2 = this.A01;
        int andIncrement = r2.A02.getAndIncrement();
        r2.A00.markerStart(i, andIncrement);
        return andIncrement;
    }

    public void A01(AnonymousClass2QO r2, int i, int i2) {
        C40732Hn.A00(r2, this, i, i2, 11);
    }

    public void A02(AnonymousClass2QO r2, int i, int i2) {
        C40732Hn.A00(r2, this, i, i2, 10);
    }

    public C54712pA(C380625j r1, C42512Ol r2, AnonymousClass2ST r3, C40732Hn r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }
}
