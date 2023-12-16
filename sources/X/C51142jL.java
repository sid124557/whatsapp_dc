package X;

/* renamed from: X.2jL  reason: invalid class name and case insensitive filesystem */
public final class C51142jL {
    public final String A00;
    public final String A01;

    public C51142jL(String str, String str2) {
        C162457s7.A0J(str2, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51142jL) {
                C51142jL r5 = (C51142jL) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A00, C18310x6.A09(this.A01));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BotPrompt(text=");
        A0o.append(this.A01);
        A0o.append(", emoji=");
        return C18260x0.A07(this.A00, A0o);
    }
}
