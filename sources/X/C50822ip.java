package X;

import java.util.List;

/* renamed from: X.2ip  reason: invalid class name and case insensitive filesystem */
public final class C50822ip {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50822ip) && C162457s7.A0P(this.A00, ((C50822ip) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C50822ip(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PersonalizedAvatarGetMetadataEntity(effectCategories=");
        return C18260x0.A04(this.A00, A0o);
    }
}
