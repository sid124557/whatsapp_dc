package X;

import java.util.List;

/* renamed from: X.2kD  reason: invalid class name and case insensitive filesystem */
public final class C51682kD {
    public final C60742z5 A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51682kD) {
                C51682kD r5 = (C51682kD) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public C51682kD(C60742z5 r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsMetadataResponse(extensionIdLinks=");
        A0o.append(this.A01);
        A0o.append(", compatibility=");
        return C18260x0.A04(this.A00, A0o);
    }
}
