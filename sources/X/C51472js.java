package X;

import java.util.Map;

/* renamed from: X.2js  reason: invalid class name and case insensitive filesystem */
public final class C51472js {
    public final Map A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C77513tW(this));

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51472js) && C162457s7.A0P(this.A00, ((C51472js) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C51472js(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CompoundedLoaderResults(mappedContacts=");
        return C18260x0.A04(this.A00, A0o);
    }
}
