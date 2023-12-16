package X;

/* renamed from: X.4Zj  reason: invalid class name */
public class AnonymousClass4Zj extends C172748Mo {
    public final /* synthetic */ C103015Ld A00;

    public AnonymousClass4Zj(C103015Ld r1) {
        this.A00 = r1;
    }

    public void run() {
        C103015Ld r0 = this.A00;
        C177688gH r5 = r0.A0L;
        float f = r0.A09;
        float f2 = r0.A0A;
        AnonymousClass4PH r52 = (AnonymousClass4PH) r5;
        r52.A06();
        C110815h5 r02 = r52.A0O;
        if (r02 == null || !r02.A0A(f, f2)) {
            r52.A0T.BlT("gesture_single_tap");
            C110885hC r2 = r52.A0M;
            C110815h5 r03 = r2.A0D;
            if (r03 != null) {
                r03.A04();
            }
            r2.A0D = null;
            C110885hC r04 = r52.A0M;
            C180278km r1 = r04.A0B;
            if (r1 != null) {
                r1.BVz(r04.A0S.A05(f, f2));
                return;
            }
            return;
        }
        C110885hC r22 = r52.A0M;
        C110815h5 r12 = r52.A0O;
        C110815h5 r05 = r22.A0D;
        if (!(r05 == null || r05 == r12)) {
            r05.A04();
        }
        r22.A0D = r12;
    }
}
