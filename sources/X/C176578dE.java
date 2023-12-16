package X;

/* renamed from: X.8dE  reason: invalid class name and case insensitive filesystem */
public class C176578dE extends AnonymousClass8Q0 implements C180078kS {
    public int A00;
    public C183618qL A01;

    public C176578dE(C176908dl r4) {
        C183618qL r1;
        int i = r4.A00;
        this.A00 = i;
        if (i != 0) {
            if (i == 1) {
                C176958dq A0D = C176958dq.A0D(r4, false);
                if (A0D != null) {
                    r1 = new C176158cY(C176958dq.A0C(A0D));
                } else {
                    r1 = null;
                }
                this.A01 = r1;
            } else if (i != 2) {
                throw AnonymousClass000.A0G("Unknown tag encountered: ", AnonymousClass001.A0o(), i);
            }
        }
        r1 = C176108cT.A00;
        this.A01 = r1;
    }

    public C176578dE() {
        this.A00 = 0;
        this.A01 = C176108cT.A00;
    }
}
