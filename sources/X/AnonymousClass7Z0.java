package X;

import java.io.InputStream;

/* renamed from: X.7Z0  reason: invalid class name */
public class AnonymousClass7Z0 {
    public final int A00;
    public final InputStream A01;
    public final byte[][] A02 = new byte[11][];

    public C177088e3 A02(int i, boolean z) {
        C183618qL r0;
        C176928dn r02;
        if (!z) {
            r0 = new C176648dL(((C177108e5) this.A01).A02());
        } else {
            C161377pW A012 = A01();
            boolean z2 = this.A01 instanceof C177098e4;
            int i2 = A012.A00;
            if (z2) {
                if (i2 == 1) {
                    return new C177008dv(A012.A02(0), i, true);
                }
                if (i2 < 1) {
                    r02 = C1461278t.A00;
                } else {
                    r02 = new C176928dn(A012);
                }
                return new C177008dv(r02, i, false);
            } else if (i2 == 1) {
                return new C177018dw(A012.A02(0), i, true);
            } else {
                if (i2 < 1) {
                    r0 = C1461378u.A00;
                } else {
                    r0 = new C176938do(A012);
                }
            }
        }
        return new C177018dw(r0, i, false);
    }

    public C183618qL A00() {
        InputStream inputStream = this.A01;
        int read = inputStream.read();
        if (read == -1) {
            return null;
        }
        boolean z = false;
        if (inputStream instanceof C177098e4) {
            C177098e4 r0 = (C177098e4) inputStream;
            r0.A02 = false;
            r0.A02();
        }
        int A002 = C140356tb.A00(inputStream, read);
        boolean A1S = AnonymousClass000.A1S(read & 32);
        int i = this.A00;
        if (A002 == 4 || A002 == 16 || A002 == 17 || A002 == 8) {
            z = true;
        }
        int A012 = C140356tb.A01(inputStream, i, z);
        if (A012 >= 0) {
            C177108e5 r2 = new C177108e5(inputStream, A012, i);
            if ((read & 64) != 0) {
                return new C176048cN(r2.A02(), A002, A1S);
            }
            if ((read & 128) != 0) {
                return new AnonymousClass8Q9(new AnonymousClass7Z0(r2, C161127p3.A02(r2)), A002, A1S);
            }
            if (A1S) {
                if (A002 == 4) {
                    return new AnonymousClass8Q3(new AnonymousClass7Z0(r2, C161127p3.A02(r2)));
                }
                if (A002 == 8) {
                    return new AnonymousClass8Q1(new AnonymousClass7Z0(r2, C161127p3.A02(r2)));
                }
                if (A002 == 16) {
                    return new AnonymousClass8Q6(new AnonymousClass7Z0(r2, C161127p3.A02(r2)));
                }
                if (A002 == 17) {
                    return new AnonymousClass8Q8(new AnonymousClass7Z0(r2, C161127p3.A02(r2)));
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("unknown tag ");
                A0o.append(A002);
                throw AnonymousClass002.A0C(AnonymousClass000.A0X(" encountered", A0o));
            } else if (A002 == 4) {
                return new AnonymousClass8Q4(r2);
            } else {
                try {
                    return C140356tb.A04(r2, this.A02, A002);
                } catch (IllegalArgumentException e) {
                    throw new AnonymousClass6u6("corrupted stream detected", e);
                }
            }
        } else if (A1S) {
            AnonymousClass7Z0 r1 = new AnonymousClass7Z0(new C177098e4(inputStream, i), i);
            if ((read & 64) != 0) {
                return new AnonymousClass8Q2(r1, A002);
            }
            if ((read & 128) != 0) {
                return new AnonymousClass8Q9(r1, A002, true);
            }
            if (A002 == 4) {
                return new AnonymousClass8Q3(r1);
            }
            if (A002 == 8) {
                return new AnonymousClass8Q1(r1);
            }
            if (A002 == 16) {
                return new AnonymousClass8Q5(r1);
            }
            if (A002 == 17) {
                return new AnonymousClass8Q7(r1);
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A1G("unknown BER object encountered: 0x", A0o2, A002);
            throw new AnonymousClass6u6(A0o2.toString());
        } else {
            throw AnonymousClass002.A0C("indefinite-length primitive encoding encountered");
        }
    }

    public AnonymousClass7Z0(InputStream inputStream, int i) {
        this.A01 = inputStream;
        this.A00 = i;
    }

    public C161377pW A01() {
        C177088e3 Bqk;
        C183618qL A002 = A00();
        if (A002 == null) {
            return new C161377pW(0);
        }
        C161377pW r1 = new C161377pW();
        do {
            if (A002 instanceof C183638qN) {
                Bqk = ((C183638qN) A002).B99();
            } else {
                Bqk = A002.Bqk();
            }
            r1.A03(Bqk);
            A002 = A00();
        } while (A002 != null);
        return r1;
    }
}
