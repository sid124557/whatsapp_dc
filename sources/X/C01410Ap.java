package X;

/* renamed from: X.0Ap  reason: invalid class name and case insensitive filesystem */
public final class C01410Ap extends C03070Is {
    public final AnonymousClass0Xq A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C01410Ap.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C01410Ap) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C01410Ap.class.getName().hashCode() * 31);
    }

    public C01410Ap(AnonymousClass0Xq r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success {mOutputData=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }

    public C01410Ap() {
        this(AnonymousClass0Xq.A01);
    }
}
