package X;

import java.util.Map;

/* renamed from: X.2lx  reason: invalid class name and case insensitive filesystem */
public final class C52732lx {
    public final C129586aY A00;
    public final String A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52732lx) {
                C52732lx r5 = (C52732lx) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A00, C18310x6.A09(this.A01)));
    }

    public C52732lx(C129586aY r1, String str, Map map) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostSessionData(sessionId=");
        A0o.append(this.A01);
        A0o.append(", messageToCrosspost=");
        A0o.append(this.A00);
        A0o.append(", cachedDBDataMap=");
        return C18260x0.A04(this.A02, A0o);
    }
}
