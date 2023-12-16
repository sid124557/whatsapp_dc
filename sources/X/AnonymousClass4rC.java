package X;

/* renamed from: X.4rC  reason: invalid class name */
public final class AnonymousClass4rC extends AnonymousClass5MX {
    public final int A00;
    public final AnonymousClass5SX A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4rC(AnonymousClass5SX r2, String str, int i) {
        super(r2);
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4rC) {
                AnonymousClass4rC r5 = (AnonymousClass4rC) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (C18310x6.A09(this.A02) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Section(id=");
        A0o.append(this.A02);
        A0o.append(", title=");
        A0o.append(this.A00);
        A0o.append(", section=");
        return C18260x0.A04(this.A01, A0o);
    }
}
