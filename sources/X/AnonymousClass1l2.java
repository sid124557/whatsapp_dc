package X;

import java.util.List;

/* renamed from: X.1l2  reason: invalid class name */
public final class AnonymousClass1l2 extends C376423l {
    public final List list;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1l2) && C162457s7.A0P(this.list, ((AnonymousClass1l2) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public AnonymousClass1l2(List list2) {
        this.list = list2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MultipleErrors(list=");
        return C18260x0.A04(this.list, A0o);
    }
}
