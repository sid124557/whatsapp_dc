package X;

import java.util.List;

/* renamed from: X.6gr  reason: invalid class name and case insensitive filesystem */
public final class C133206gr extends AnonymousClass7DS {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C133206gr) && C162457s7.A0P(this.A00, ((C133206gr) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C133206gr(List list) {
        super(list);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LoadingStartSearch(loadingItems=");
        return C18260x0.A04(this.A00, A0o);
    }
}
