package X;

import java.util.Map;

/* renamed from: X.7Xi  reason: invalid class name and case insensitive filesystem */
public final class C152047Xi {
    public final Map A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C152047Xi) && C162457s7.A0P(this.A00, ((C152047Xi) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C152047Xi(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BloksFunctionTable(entries=");
        return C18260x0.A04(this.A00, A0o);
    }
}
