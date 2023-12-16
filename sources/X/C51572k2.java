package X;

/* renamed from: X.2k2  reason: invalid class name and case insensitive filesystem */
public final class C51572k2 {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51572k2) {
                C51572k2 r5 = (C51572k2) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C18270x1.A00(this.A01) * 31) + AnonymousClass0x7.A07(this.A00);
    }

    public C51572k2(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TemplateMessageMetadata(templateId=");
        A0o.append(this.A01);
        A0o.append(", hsmTag=");
        return C18260x0.A07(this.A00, A0o);
    }
}
