package X;

/* renamed from: X.5UP  reason: invalid class name */
public final class AnonymousClass5UP {
    public final C56972sr A00;
    public final AnonymousClass1VX A01;

    public final boolean A03(int i) {
        return AnonymousClass000.A1U(this.A01.A0N(3778), i);
    }

    public final boolean A04(int i) {
        AnonymousClass1VX r1 = this.A01;
        if ((r1.A0X(3956) || !this.A00.A0Y()) && r1.A0N(i) == C999958z.ENABLED.value) {
            return true;
        }
        return false;
    }

    public final boolean A05(int i) {
        return AnonymousClass000.A1U(this.A01.A0N(i), C999958z.NEEDS_UPGRADE.value);
    }

    public AnonymousClass5UP(C56972sr r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean A00() {
        if (!C18300x5.A1S(this) || !A04(3878)) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (!C18300x5.A1S(this) || !A04(3879)) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        if (!A01() || !A04(4356) || !this.A01.A0X(5096)) {
            return false;
        }
        return true;
    }
}
