package X;

import java.util.Map;

/* renamed from: X.3Ww  reason: invalid class name and case insensitive filesystem */
public final class C69403Ww implements AnonymousClass48Z {
    public Map A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C69403Ww) && C162457s7.A0P(this.A00, ((C69403Ww) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C69403Ww(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BkMockGalaxyActionEvent(data=");
        return C18260x0.A04(this.A00, A0o);
    }
}
