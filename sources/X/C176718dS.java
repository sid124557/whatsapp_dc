package X;

/* renamed from: X.8dS  reason: invalid class name and case insensitive filesystem */
public abstract class C176718dS extends C177088e3 {
    public int A00;
    public C176748dV A01;
    public C176768dX A02;
    public C177088e3 A03;
    public C177088e3 A04;

    public static final C177088e3 A0A(C161377pW r1, int i) {
        if (r1.A00 > i) {
            return r1.A02(i).Bqk();
        }
        throw AnonymousClass001.A0c("too few objects in input vector");
    }

    public C177088e3 A0O() {
        C176768dX r2 = this.A02;
        return new C176088cR(this.A01, r2, this.A03, this.A04, this.A00);
    }

    public int hashCode() {
        int A042 = C18280x3.A04(this.A02);
        C176748dV r0 = this.A01;
        if (r0 != null) {
            A042 = AnonymousClass6CA.A05(r0, A042);
        }
        C177088e3 r02 = this.A03;
        if (r02 != null) {
            A042 = AnonymousClass6CA.A05(r02, A042);
        }
        return AnonymousClass6CA.A05(this.A04, A042);
    }

    public C176718dS(C161377pW r5) {
        int i = 0;
        C177088e3 A0A = A0A(r5, 0);
        if (A0A instanceof C176768dX) {
            this.A02 = (C176768dX) A0A;
            A0A = A0A(r5, 1);
            i = 1;
        }
        if (A0A instanceof C176748dV) {
            this.A01 = (C176748dV) A0A;
            i++;
            A0A = A0A(r5, i);
        }
        if (!(A0A instanceof C176908dl)) {
            this.A03 = A0A;
            i++;
            A0A = A0A(r5, i);
        }
        if (r5.A00 != i + 1) {
            throw AnonymousClass001.A0c("input vector too large");
        } else if (A0A instanceof C176908dl) {
            C176908dl r3 = (C176908dl) A0A;
            int i2 = r3.A00;
            if (i2 < 0 || i2 > 2) {
                throw AnonymousClass000.A0G("invalid encoding value: ", AnonymousClass001.A0o(), i2);
            }
            this.A00 = i2;
            this.A04 = AnonymousClass8Q0.A03(r3);
        } else {
            throw AnonymousClass001.A0c("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    public C176718dS(C176748dV r1, C176768dX r2, C177088e3 r3, C177088e3 r4, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = r4;
    }
}
