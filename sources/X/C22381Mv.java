package X;

import java.util.List;

/* renamed from: X.1Mv  reason: invalid class name and case insensitive filesystem */
public final class C22381Mv extends AnonymousClass23V {
    public final List list;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C22381Mv) && C162457s7.A0P(this.list, ((C22381Mv) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public C22381Mv(List list2) {
        this.list = list2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MultipleErrors(list=");
        return C18260x0.A04(this.list, A0o);
    }
}
