package X;

/* renamed from: X.3EK  reason: invalid class name */
public final class AnonymousClass3EK implements C85264Fo {
    public final C54002o1 A00;
    public final C52812m5 A01;
    public final C52822m6 A02;
    public final AnonymousClass3ZH A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3EK) {
                AnonymousClass3EK r5 = (AnonymousClass3EK) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A00, C18300x5.A04(this.A02))));
    }

    public AnonymousClass3EK(C54002o1 r1, C52812m5 r2, C52822m6 r3, AnonymousClass3ZH r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }

    public C52822m6 B4n() {
        return this.A02;
    }

    public C54002o1 B4o() {
        return this.A00;
    }

    public AnonymousClass3ZH BEQ() {
        return this.A03;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LargeBot(bot=");
        A0o.append(this.A02);
        A0o.append(", botProfile=");
        A0o.append(this.A00);
        A0o.append(", waContact=");
        A0o.append(this.A03);
        A0o.append(", theme=");
        return C18260x0.A04(this.A01, A0o);
    }
}
