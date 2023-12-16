package X;

/* renamed from: X.9VG  reason: invalid class name */
public class AnonymousClass9VG {
    public final int A00;
    public final C194869Uu A01;
    public final C194839Ur A02;

    public int A00(long j) {
        C194869Uu r6 = this.A01;
        if (r6 != null) {
            int i = r6.A03;
            if (i != 2 && i != 1) {
                C194839Ur r0 = this.A02;
                if (r0 != null && ((long) r0.A01) == r6.A05) {
                    return 2;
                }
                if (r6.A06 > j || j >= r6.A04) {
                    return 3;
                }
                return 1;
            } else if (r6.A06 > j || j >= r6.A04) {
                return 0;
            } else {
                return 4;
            }
        }
        return 0;
    }

    public AnonymousClass9VG(C194869Uu r2, C194839Ur r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = 6;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IncentiveResult{offerInfo=");
        A0o.append(this.A01);
        A0o.append(", accountIncentiveEligibility=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }

    public AnonymousClass9VG(C194869Uu r1, C194839Ur r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }
}
