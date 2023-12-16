package X;

/* renamed from: X.5Pe  reason: invalid class name and case insensitive filesystem */
public final class C103985Pe {
    public final C56982ss A00;
    public final AnonymousClass1VX A01;

    public final boolean A00(AnonymousClass1RL r4) {
        C372321l r1;
        C372321l r12;
        AnonymousClass1VX r2 = this.A01;
        if (r2.A0X(3149)) {
            if (r4 != null) {
                r12 = r4.A0B;
            } else {
                r12 = null;
            }
            if (r12 == C372321l.SUSPENDED) {
                return true;
            }
        }
        if (!r2.A0X(5161)) {
            return false;
        }
        if (r4 != null) {
            r1 = r4.A0B;
        } else {
            r1 = null;
        }
        if (r1 == C372321l.GEOSUSPENDED) {
            return true;
        }
        return false;
    }

    public final boolean A01(C95804uY r2) {
        if (r2 == null) {
            return false;
        }
        return A00((AnonymousClass1RL) C56982ss.A00(this.A00, r2));
    }

    public C103985Pe(C56982ss r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
