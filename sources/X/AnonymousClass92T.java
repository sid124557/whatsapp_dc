package X;

/* renamed from: X.92T  reason: invalid class name */
public class AnonymousClass92T implements C83884Ae {
    public Object A00;
    public final int A01;

    public AnonymousClass92T(C618132i r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final boolean AxF(AnonymousClass33C r7, C30471mV r8, Object obj) {
        switch (this.A01) {
            case 0:
                C149567My r9 = (C149567My) obj;
                r7.A0F = r9.A01;
                r8.A06 = r9.A02;
                r8.A00 = r9.A00;
                if (r8.A0y() != null) {
                    r8.A0y().A03(r9.A03);
                    break;
                }
                break;
            case 1:
                Number number = (Number) obj;
                boolean z = false;
                if (r8.A1I == 1) {
                    return false;
                }
                long j = r7.A0C;
                long intValue = (long) number.intValue();
                if (j != intValue) {
                    z = true;
                }
                r7.A0C = intValue;
                return z;
            case 2:
                int A0K = AnonymousClass001.A0K(obj);
                r7.A0c = false;
                if (A0K == 0) {
                    r7.A0R = true;
                    break;
                }
                break;
            case 3:
                r7.A0I = (String) obj;
                break;
            case 4:
                r8.A1G(1);
                r7.A0c = true;
                r7.A0C = 0;
                r7.A0M = true;
                break;
            default:
                r7.A0C = (long) AnonymousClass001.A0K(obj);
                break;
        }
        return true;
    }
}
