package X;

import java.util.List;

/* renamed from: X.6gs  reason: invalid class name and case insensitive filesystem */
public final class C133216gs extends AnonymousClass7DS {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C133216gs) && C162457s7.A0P(this.A00, ((C133216gs) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C133216gs(List list) {
        super(list);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SuccessContinueSearch(successItems=");
        return C18260x0.A04(this.A00, A0o);
    }
}
