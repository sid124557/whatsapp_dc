package X;

/* renamed from: X.5RT  reason: invalid class name */
public class AnonymousClass5RT {
    public final long A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((AnonymousClass5RT) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return Long.valueOf(this.A00).hashCode();
    }

    public AnonymousClass5RT(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Timestamp{timeInMillis=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
