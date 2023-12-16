package X;

/* renamed from: X.3EJ  reason: invalid class name */
public final class AnonymousClass3EJ implements C85264Fo {
    public final C54002o1 A00;
    public final C52822m6 A01;
    public final AnonymousClass3ZH A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3EJ) {
                AnonymousClass3EJ r5 = (AnonymousClass3EJ) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)));
    }

    public AnonymousClass3EJ(C54002o1 r1, C52822m6 r2, AnonymousClass3ZH r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public C52822m6 B4n() {
        return this.A01;
    }

    public C54002o1 B4o() {
        return this.A00;
    }

    public AnonymousClass3ZH BEQ() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SmallBot(bot=");
        A0o.append(this.A01);
        A0o.append(", botProfile=");
        A0o.append(this.A00);
        A0o.append(", waContact=");
        return C18260x0.A04(this.A02, A0o);
    }
}
