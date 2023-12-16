package X;

/* renamed from: X.6lv  reason: invalid class name and case insensitive filesystem */
public class C136146lv extends C136186lz {
    public final int A00;

    public C136146lv(int i) {
        super(1);
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.A00 == ((C136146lv) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return this.A00;
    }

    public C136146lv() {
        this(0);
    }
}
