package X;

/* renamed from: X.8dA  reason: invalid class name and case insensitive filesystem */
public class C176538dA extends AnonymousClass8Q0 {
    public C176998du A00;

    public static C161377pW A0A() {
        return new C161377pW(2);
    }

    public static C176538dA A0B(Object obj) {
        if (obj instanceof C176538dA) {
            return (C176538dA) obj;
        }
        if (obj != null) {
            return new C176538dA(C176998du.A0A(obj));
        }
        return null;
    }

    public C176448d1 A0N() {
        C183618qL[] r1 = this.A00.A01;
        if (r1.length == 0) {
            return null;
        }
        return C176448d1.A0A(r1[0]);
    }

    public C176448d1[] A0O() {
        C183618qL[] r4 = this.A00.A01;
        int length = r4.length;
        C176448d1[] r2 = new C176448d1[length];
        for (int i = 0; i != length; i++) {
            r2[i] = C176448d1.A0A(r4[i]);
        }
        return r2;
    }

    public C176538dA(C183618qL r3, C176768dX r4) {
        C161377pW A0A = A0A();
        A0A.A03(r4);
        this.A00 = new C176988dt((C183618qL) C161377pW.A00(r3, A0A));
    }

    public C176538dA(C176448d1[] r2) {
        this.A00 = new C176988dt((C183618qL[]) r2);
    }

    public C176538dA(C176998du r1) {
        this.A00 = r1;
    }
}
