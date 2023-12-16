package X;

/* renamed from: X.2zS  reason: invalid class name and case insensitive filesystem */
public final class C60962zS {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60962zS) {
                C60962zS r5 = (C60962zS) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && C162457s7.A0P(this.A05, r5.A05) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(((((((C18270x1.A00(this.A02) * 31) + AnonymousClass0x7.A07(this.A05)) * 31) + this.A00) * 31) + this.A01) * 31, this.A06);
    }

    public C60962zS(String str, String str2, int i, int i2, boolean z) {
        this.A02 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = z;
        if (str == null) {
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        this.A03 = str;
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(':');
        this.A04 = AnonymousClass000.A0h(A0l, i);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProxySetting(domain=");
        A0o.append(this.A02);
        A0o.append(", ip=");
        A0o.append(this.A05);
        A0o.append(", chatPort=");
        A0o.append(this.A00);
        A0o.append(", mediaPort=");
        A0o.append(this.A01);
        A0o.append(", useChatTls=");
        return C18260x0.A0A(A0o, this.A06);
    }

    public C60962zS() {
        this((String) null, (String) null, 443, 587, true);
    }
}
