package X;

import java.util.Map;

/* renamed from: X.7YP  reason: invalid class name */
public final class AnonymousClass7YP {
    public final C137066ni A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YP) {
                AnonymousClass7YP r5 = (AnonymousClass7YP) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A00) + AnonymousClass000.A07(this.A01);
    }

    public AnonymousClass7YP(C137066ni r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StateInputCacheData(cachedState=");
        A0o.append(this.A00);
        A0o.append(", cachedStateInput=");
        return C18260x0.A04(this.A01, A0o);
    }
}
