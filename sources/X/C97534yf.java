package X;

import java.util.Map;

/* renamed from: X.4yf  reason: invalid class name and case insensitive filesystem */
public final class C97534yf extends C100495Bd {
    public final Map A00;

    public C97534yf(Map map) {
        C162457s7.A0J(map, 1);
        this.A00 = map;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97534yf) && C162457s7.A0P(this.A00, ((C97534yf) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Ready(newsletterAppealsMap=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C97534yf() {
        this(C73813g7.A0A());
    }
}
