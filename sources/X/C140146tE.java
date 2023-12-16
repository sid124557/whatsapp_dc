package X;

/* renamed from: X.6tE  reason: invalid class name and case insensitive filesystem */
public final class C140146tE extends AnonymousClass75Y {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140146tE) {
                C140146tE r5 = (C140146tE) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18310x6.A09(this.A01) + C18270x1.A00(this.A00);
    }

    public C140146tE(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(phoneNumber=");
        String str2 = this.A01;
        int length = str2.length();
        int i = 4;
        if (4 > length) {
            i = length;
        }
        String substring = str2.substring(length - i);
        C162457s7.A0D(substring);
        A0o.append(substring);
        A0o.append(", openOnPhoneNonce=");
        String str3 = this.A00;
        if (str3 != null) {
            int length2 = str3.length();
            int i2 = 4;
            if (4 > length2) {
                i2 = length2;
            }
            str = str3.substring(length2 - i2);
            C162457s7.A0D(str);
        } else {
            str = null;
        }
        return C18260x0.A07(str, A0o);
    }
}
