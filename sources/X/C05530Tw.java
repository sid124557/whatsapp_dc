package X;

/* renamed from: X.0Tw  reason: invalid class name and case insensitive filesystem */
public class C05530Tw {
    public static final C05530Tw A02 = new C05530Tw(AnonymousClass0G6.xMidYMid, AnonymousClass0FY.meet);
    public static final C05530Tw A03 = new C05530Tw(AnonymousClass0G6.none, (AnonymousClass0FY) null);
    public AnonymousClass0G6 A00;
    public AnonymousClass0FY A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C05530Tw r5 = (C05530Tw) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C05530Tw(AnonymousClass0G6 r1, AnonymousClass0FY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        AnonymousClass001.A1L(A0o);
        return AnonymousClass000.A0R(this.A01, A0o);
    }
}
