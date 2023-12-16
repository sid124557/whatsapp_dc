package X;

/* renamed from: X.2lW  reason: invalid class name and case insensitive filesystem */
public final class C52462lW {
    public final int A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52462lW) {
                C52462lW r5 = (C52462lW) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && C162457s7.A0P(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public C52462lW(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SampleSearchData(image=");
        A0o.append(this.A00);
        A0o.append(", prompt=");
        A0o.append(this.A01);
        A0o.append(", downloadableResourceId=");
        return C18260x0.A07(this.A02, A0o);
    }
}
