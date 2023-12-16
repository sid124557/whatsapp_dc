package X;

import java.util.Arrays;

/* renamed from: X.2ks  reason: invalid class name and case insensitive filesystem */
public final class C52092ks {
    public final String A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52092ks) {
                C52092ks r5 = (C52092ks) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A00) + 1880189433) * 31) + Arrays.hashCode(this.A01);
    }

    public C52092ks(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Response(recipientNodeId=");
        A0o.append(this.A00);
        A0o.append(", path=");
        A0o.append("/altLinkingPrefillResponse");
        A0o.append(", payload=");
        return C18260x0.A07(Arrays.toString(this.A01), A0o);
    }
}
