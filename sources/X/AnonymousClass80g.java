package X;

/* renamed from: X.80g  reason: invalid class name */
public final class AnonymousClass80g implements C177618gA {
    public static final AnonymousClass80g A02 = new AnonymousClass80g(1);
    public C1463379w A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && AnonymousClass80g.class == obj.getClass() && this.A01 == ((AnonymousClass80g) obj).A01;
        }
        return true;
    }

    public AnonymousClass80g(int i) {
        this.A01 = i;
    }

    public int hashCode() {
        return (((506447 + this.A01) * 31) + 1) * 31;
    }
}
