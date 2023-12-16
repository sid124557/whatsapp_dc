package X;

import java.util.List;

/* renamed from: X.7Xk  reason: invalid class name and case insensitive filesystem */
public final class C152067Xk {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C152067Xk) && C162457s7.A0P(this.A00, ((C152067Xk) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C152067Xk(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VariantsCarouselFragmentUiState(carouselDisplayData=");
        return C18260x0.A04(this.A00, A0o);
    }
}
