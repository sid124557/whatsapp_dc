package X;

import java.util.List;

/* renamed from: X.0g5  reason: invalid class name and case insensitive filesystem */
public class C09370g5 implements C16890uC {
    public final C01610Bn A00;
    public final C01610Bn A01;

    public C04850Qx B0O() {
        return new AnonymousClass0BY(AnonymousClass0BW.A00(this.A00), AnonymousClass0BW.A00(this.A01));
    }

    public List B8y() {
        throw AnonymousClass002.A0G("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public boolean BJ2() {
        if (!this.A00.BJ2() || !this.A01.BJ2()) {
            return false;
        }
        return true;
    }

    public C09370g5(C01610Bn r1, C01610Bn r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
