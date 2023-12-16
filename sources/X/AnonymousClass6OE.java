package X;

/* renamed from: X.6OE  reason: invalid class name */
public final class AnonymousClass6OE extends AnonymousClass861 {
    public long A00;
    public final C126496Oc A01 = new C126496Oc(1);
    public final C161467pi A02 = new C161467pi();

    public AnonymousClass6OE() {
        super(6);
    }

    public void A0B() {
    }

    public void A0C(long j, boolean z) {
        this.A00 = Long.MIN_VALUE;
    }

    public boolean BIe() {
        return true;
    }

    public int BqO(C166527yp r3) {
        if ("application/x-camera-motion".equals(r3.A0T)) {
            return 4;
        }
        return 0;
    }

    public String getName() {
        return "CameraMotionRenderer";
    }

    public boolean BHW() {
        return BFS();
    }

    public void BjR(long j, long j2) {
        while (!BFS() && this.A00 < 100000 + j) {
            C126496Oc r2 = this.A01;
            r2.clear();
            C147807Fu r1 = this.A0A;
            r1.A01 = null;
            r1.A00 = null;
            if (A05(r1, r2, false) == -4 && !C153567bZ.A00(r2)) {
                this.A00 = r2.A00;
            } else {
                return;
            }
        }
    }
}
