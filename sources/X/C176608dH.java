package X;

import java.io.IOException;

/* renamed from: X.8dH  reason: invalid class name and case insensitive filesystem */
public class C176608dH extends AnonymousClass8Q0 implements C180078kS {
    public int A00;
    public C183618qL A01;

    public static C176608dH A0A(Object obj) {
        C183618qL r1;
        if (obj == null || (obj instanceof C176608dH)) {
            return (C176608dH) obj;
        }
        if (obj instanceof C176908dl) {
            C176908dl r4 = (C176908dl) obj;
            int i = r4.A00;
            switch (i) {
                case 0:
                case 3:
                case 5:
                    r1 = C176958dq.A0D(r4, false);
                    break;
                case 1:
                case 2:
                case 6:
                    C177088e3 A03 = AnonymousClass8Q0.A03(r4);
                    if (!(A03 instanceof C176898dk)) {
                        r1 = new C176898dk(C176778dY.A0C(A03));
                        break;
                    } else {
                        r1 = C176898dk.A0A(A03);
                        break;
                    }
                case 4:
                    return new C176608dH(C176618dI.A0B(C176958dq.A0D(r4, true)), i);
                case 7:
                    r1 = C176778dY.A0B(r4, false);
                    break;
                case 8:
                    C177088e3 A032 = AnonymousClass8Q0.A03(r4);
                    if (!(A032 instanceof C176768dX)) {
                        byte[] A0C = C176778dY.A0C(A032);
                        r1 = (AnonymousClass8Q0) C176768dX.A02.get(new C151707Vz(A0C));
                        if (r1 == null) {
                            r1 = new C176768dX(A0C);
                            break;
                        }
                    } else {
                        r1 = C176768dX.A0A(A032);
                        break;
                    }
                    break;
                default:
                    throw AnonymousClass000.A0G("unknown tag: ", AnonymousClass001.A0o(), i);
            }
            return new C176608dH(r1, i);
        } else if (obj instanceof byte[]) {
            try {
                return A0A(C177088e3.A0I((byte[]) obj));
            } catch (IOException unused) {
                throw AnonymousClass001.A0c("unable to parse encoded general name");
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "unknown object in getInstance: ", obj);
            throw C18310x6.A0d(A0o);
        }
    }

    public C176608dH(C183618qL r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        String A02;
        Object A0B;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        int i = this.A00;
        A0X.append(i);
        A0X.append(": ");
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                A0B = C176618dI.A0B(this.A01);
            } else if (i != 6) {
                A0B = this.A01;
            }
            A02 = A0B.toString();
            return AnonymousClass6C9.A0f(A02, A0X);
        }
        A02 = AnonymousClass8Q0.A02(this);
        return AnonymousClass6C9.A0f(A02, A0X);
    }

    public C176608dH(String str) {
        this.A00 = 1;
        this.A01 = new C176898dk(str);
    }

    public C176608dH(C176618dI r2) {
        this.A01 = r2;
        this.A00 = 4;
    }
}
