package X;

import java.io.IOException;

/* renamed from: X.8dB  reason: invalid class name and case insensitive filesystem */
public class C176548dB extends AnonymousClass8Q0 {
    public static final C176768dX A03 = C176768dX.A0C("1.3.6.1.5.5.7.1.4");
    public static final C176768dX A04 = C176768dX.A0C("1.3.6.1.5.5.7.1.1");
    public static final C176768dX A05 = C176768dX.A0C("2.5.29.35");
    public static final C176768dX A06 = C176768dX.A0C("2.5.29.19");
    public static final C176768dX A07 = C176768dX.A0C("1.3.6.1.5.5.7.1.2");
    public static final C176768dX A08 = C176768dX.A0C("2.5.29.31");
    public static final C176768dX A09 = C176768dX.A0C("2.5.29.20");
    public static final C176768dX A0A = C176768dX.A0C("2.5.29.29");
    public static final C176768dX A0B = C176768dX.A0C("2.5.29.32");
    public static final C176768dX A0C = C176768dX.A0C("2.5.29.27");
    public static final C176768dX A0D = C176768dX.A0C("2.5.29.60");
    public static final C176768dX A0E = C176768dX.A0C("2.5.29.37");
    public static final C176768dX A0F = C176768dX.A0C("2.5.29.46");
    public static final C176768dX A0G = C176768dX.A0C("2.5.29.54");
    public static final C176768dX A0H = C176768dX.A0C("2.5.29.23");
    public static final C176768dX A0I = C176768dX.A0C("2.5.29.24");
    public static final C176768dX A0J = C176768dX.A0C("2.5.29.18");
    public static final C176768dX A0K = C176768dX.A0C("2.5.29.28");
    public static final C176768dX A0L = C176768dX.A0C("2.5.29.15");
    public static final C176768dX A0M = C176768dX.A0C("1.3.6.1.5.5.7.1.12");
    public static final C176768dX A0N = C176768dX.A0C("2.5.29.30");
    public static final C176768dX A0O = C176768dX.A0C("2.5.29.56");
    public static final C176768dX A0P = C176768dX.A0C("2.5.29.36");
    public static final C176768dX A0Q = C176768dX.A0C("2.5.29.33");
    public static final C176768dX A0R = C176768dX.A0C("2.5.29.16");
    public static final C176768dX A0S = C176768dX.A0C("1.3.6.1.5.5.7.1.3");
    public static final C176768dX A0T = C176768dX.A0C("2.5.29.21");
    public static final C176768dX A0U = C176768dX.A0C("2.5.29.17");
    public static final C176768dX A0V = C176768dX.A0C("2.5.29.9");
    public static final C176768dX A0W = C176768dX.A0C("1.3.6.1.5.5.7.1.11");
    public static final C176768dX A0X = C176768dX.A0C("2.5.29.14");
    public static final C176768dX A0Y = C176768dX.A0C("2.5.29.55");
    public C176768dX A00;
    public C176778dY A01;
    public boolean A02;

    public C176548dB(C176768dX r2, byte[] bArr, boolean z) {
        C176648dL r0 = new C176648dL(bArr);
        this.A00 = r2;
        this.A02 = z;
        this.A01 = r0;
    }

    public static C177088e3 A0A(C176548dB r2) {
        try {
            return C177088e3.A0I(r2.A01.A00);
        } catch (IOException e) {
            throw AnonymousClass000.A0E(e, "can't convert extension: ", AnonymousClass001.A0o());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C176548dB)) {
            return false;
        }
        C176548dB r4 = (C176548dB) obj;
        if (!r4.A00.A0T(this.A00) || !r4.A01.A0T(this.A01) || r4.A02 != this.A02) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.A02;
        int A052 = AnonymousClass6CA.A05(this.A00, this.A01.hashCode());
        if (!z) {
            return ~A052;
        }
        return A052;
    }

    public C176548dB(C176958dq r6) {
        C183618qL A0W2;
        if (r6.A0U() == 2) {
            this.A00 = C176768dX.A0A(r6.A0W(0));
            this.A02 = false;
            A0W2 = r6.A0W(1);
        } else if (r6.A0U() == 3) {
            this.A00 = C176768dX.A0A(r6.A0W(0));
            this.A02 = AnonymousClass000.A1S(C176738dU.A0A(r6.A0W(1)).A00);
            A0W2 = r6.A0W(2);
        } else {
            throw AnonymousClass8Q0.A01(r6);
        }
        this.A01 = C176778dY.A0A(A0W2);
    }
}
