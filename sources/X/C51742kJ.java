package X;

/* renamed from: X.2kJ  reason: invalid class name and case insensitive filesystem */
public final class C51742kJ {
    public final int A00;
    public final AnonymousClass3PA A01;

    public C51742kJ(AnonymousClass3PA r2, int i) {
        C162457s7.A0J(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51742kJ) {
                C51742kJ r5 = (C51742kJ) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("E2eMessageParserInfo(messageType=");
        A0o.append(this.A00);
        A0o.append(", parser=");
        return C18260x0.A04(this.A01, A0o);
    }
}
