package X;

/* renamed from: X.2je  reason: invalid class name and case insensitive filesystem */
public final class C51332je {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51332je) {
                C51332je r5 = (C51332je) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A00, C18270x1.A00(this.A01) * 31);
    }

    public C51332je(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SharePnDialogData(myMaskedNumber=");
        A0o.append(this.A01);
        A0o.append(", learnMoreLink=");
        return C18260x0.A07(this.A00, A0o);
    }
}
