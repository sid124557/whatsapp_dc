package X;

/* renamed from: X.82C  reason: invalid class name */
public class AnonymousClass82C implements C183708qU {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (!this.A01) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass82C) obj).A00);
    }

    public int hashCode() {
        if (!this.A01) {
            return super.hashCode();
        }
        return this.A00.hashCode();
    }

    public AnonymousClass82C(int i, boolean z) {
        this.A00 = AnonymousClass000.A0Y("anim://", AnonymousClass001.A0o(), i);
        this.A01 = z;
    }
}
