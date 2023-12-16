package X;

/* renamed from: X.7Z9  reason: invalid class name */
public final class AnonymousClass7Z9 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public AnonymousClass7Z9(String str, String str2, String str3, String str4) {
        C18260x0.A0a(str2, str3, str4, 2);
        this.A03 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Z9) {
                AnonymousClass7Z9 r5 = (AnonymousClass7Z9) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, AnonymousClass0x2.A07(this.A02, AnonymousClass0x2.A07(this.A00, C18310x6.A09(this.A03))));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AIBotEmbodimentStatusData(state=");
        A0o.append(this.A03);
        A0o.append(", action=");
        A0o.append(this.A00);
        A0o.append(", sentiment=");
        A0o.append(this.A02);
        A0o.append(", intensity=");
        return C18260x0.A07(this.A01, A0o);
    }
}
