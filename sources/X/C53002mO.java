package X;

import java.util.List;

/* renamed from: X.2mO  reason: invalid class name and case insensitive filesystem */
public final class C53002mO {
    public final long A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53002mO) {
                C53002mO r8 = (C53002mO) obj;
                if (!C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00((AnonymousClass000.A08(this.A03, C18300x5.A04(this.A02)) + C18270x1.A00(this.A01)) * 31, this.A00);
    }

    public C53002mO(String str, List list, List list2, long j) {
        this.A02 = list;
        this.A03 = list2;
        this.A01 = str;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParsedOtpRetrieverUrl(packageNames=");
        A0o.append(this.A02);
        A0o.append(", signatureHashes=");
        A0o.append(this.A03);
        A0o.append(", ctaDisplayName=");
        A0o.append(this.A01);
        A0o.append(", codeExpirationMinutes=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
