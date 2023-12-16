package X;

import java.util.List;

/* renamed from: X.2ih  reason: invalid class name and case insensitive filesystem */
public final class C50742ih {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50742ih) && C162457s7.A0P(this.A00, ((C50742ih) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C50742ih(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GetPromotionsResult(promotions=");
        return C18260x0.A04(this.A00, A0o);
    }
}
