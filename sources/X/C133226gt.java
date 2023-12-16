package X;

import java.util.List;

/* renamed from: X.6gt  reason: invalid class name and case insensitive filesystem */
public final class C133226gt extends AnonymousClass7DS {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C133226gt) && C162457s7.A0P(this.A00, ((C133226gt) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C133226gt(List list) {
        super(list);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SuccessStartSearch(successItems=");
        return C18260x0.A04(this.A00, A0o);
    }
}
