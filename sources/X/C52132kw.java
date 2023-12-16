package X;

import java.util.List;

/* renamed from: X.2kw  reason: invalid class name and case insensitive filesystem */
public final class C52132kw {
    public final int A00;
    public final String A01;
    public final List A02;

    public C52132kw(List list, int i, String str) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52132kw) {
                C52132kw r5 = (C52132kw) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, (C18310x6.A09(this.A01) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AsyncComponentContainerTargetInfo(serverId=");
        A0o.append(this.A01);
        A0o.append(", clientId=");
        A0o.append(this.A00);
        A0o.append(", keyPath=");
        return C18260x0.A04(this.A02, A0o);
    }
}
