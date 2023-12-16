package X;

import java.util.List;

/* renamed from: X.6lg  reason: invalid class name and case insensitive filesystem */
public class C135996lg extends C136186lz {
    public final C185648u1 A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((C135996lg) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public C135996lg(C185648u1 r1, List list, int i) {
        super(i);
        this.A01 = list;
        this.A00 = r1;
    }
}
