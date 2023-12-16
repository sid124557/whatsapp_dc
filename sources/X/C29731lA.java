package X;

import java.util.List;

/* renamed from: X.1lA  reason: invalid class name and case insensitive filesystem */
public final class C29731lA extends C376523m {
    public final List list;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29731lA) && C162457s7.A0P(this.list, ((C29731lA) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public C29731lA(List list2) {
        this.list = list2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MultipleErrors(list=");
        return C18260x0.A04(this.list, A0o);
    }
}
