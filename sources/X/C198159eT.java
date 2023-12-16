package X;

/* renamed from: X.9eT  reason: invalid class name and case insensitive filesystem */
public class C198159eT implements Cloneable {
    public AnonymousClass9JX A00;
    public boolean A01 = true;

    public C198159eT(AnonymousClass9JX r2) {
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A01 == ((C198159eT) obj).A01;
        }
        return true;
    }

    public int hashCode() {
        return ((this.A01 ? 1 : 0) * true) + this.A00.hashCode();
    }

    public C198159eT A00() {
        try {
            return (C198159eT) super.clone();
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
