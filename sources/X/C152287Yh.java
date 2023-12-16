package X;

/* renamed from: X.7Yh  reason: invalid class name and case insensitive filesystem */
public final class C152287Yh {
    public final Object A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152287Yh) {
                C152287Yh r5 = (C152287Yh) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A02, C18310x6.A09(this.A01)) + AnonymousClass000.A07(this.A00);
    }

    public C152287Yh(Object obj, String str, String str2) {
        C18260x0.A0Q(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BreadCrumbItem(itemId=");
        A0o.append(this.A01);
        A0o.append(", itemName=");
        A0o.append(this.A02);
        A0o.append(", data=");
        return C18260x0.A04(this.A00, A0o);
    }
}
