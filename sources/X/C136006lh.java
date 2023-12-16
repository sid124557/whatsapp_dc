package X;

/* renamed from: X.6lh  reason: invalid class name and case insensitive filesystem */
public class C136006lh extends C136186lz {
    public AnonymousClass5ZO A00;
    public C109665ez A01;

    public C136006lh(AnonymousClass5ZO r2, C109665ez r3) {
        super(4);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C136006lh) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
