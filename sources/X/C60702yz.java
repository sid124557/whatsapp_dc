package X;

/* renamed from: X.2yz  reason: invalid class name and case insensitive filesystem */
public final class C60702yz {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public C60702yz(Integer num, String str, String str2) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60702yz) {
                C60702yz r5 = (C60702yz) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A01) + C18270x1.A00(this.A02)) * 31) + C18310x6.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UsernameModel(currentUsername=");
        A0o.append(this.A01);
        A0o.append(", requestedUsername=");
        A0o.append(this.A02);
        A0o.append(", errorMessage=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C60702yz() {
        this((Integer) null, "", (String) null);
    }
}
