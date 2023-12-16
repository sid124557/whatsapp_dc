package X;

/* renamed from: X.3ZL  reason: invalid class name */
public final class AnonymousClass3ZL implements Comparable {
    public final String A00;
    public final String A01;

    public AnonymousClass3ZL(String str, String str2) {
        C162457s7.A0J(str2, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3ZL) {
                AnonymousClass3ZL r5 = (AnonymousClass3ZL) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass3ZL r3 = (AnonymousClass3ZL) obj;
        C162457s7.A0J(r3, 0);
        return AnonymousClass2A6.A00(this.A01, r3.A01);
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A00, C18310x6.A09(this.A01));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BotCommand(name=");
        A0o.append(this.A01);
        A0o.append(", description=");
        return C18260x0.A07(this.A00, A0o);
    }
}
