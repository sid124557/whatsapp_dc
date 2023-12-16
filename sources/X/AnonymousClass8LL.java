package X;

/* renamed from: X.8LL  reason: invalid class name */
public class AnonymousClass8LL implements Cloneable {
    public C141196vB A00;
    public boolean A01 = true;

    public AnonymousClass8LL(C141196vB r2) {
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A01 == ((AnonymousClass8LL) obj).A01;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, (this.A01 ? 1 : 0) * true);
    }

    public AnonymousClass8LL A00() {
        try {
            return (AnonymousClass8LL) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
