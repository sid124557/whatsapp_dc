package X;

/* renamed from: X.2z1  reason: invalid class name */
public final class AnonymousClass2z1 {
    public final C60492ye A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2z1) {
                AnonymousClass2z1 r5 = (AnonymousClass2z1) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A00) + C18270x1.A00(this.A01)) * 31) + AnonymousClass0x7.A07(this.A02);
    }

    public AnonymousClass2z1(C60492ye r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaffleCacheQueryResponse(multiDestinationAutoCrosspostingSetting=");
        A0o.append(this.A00);
        A0o.append(", obfuscatedFBCrosspostingDestinationId=");
        A0o.append(this.A01);
        A0o.append(", obfuscatedIGCrosspostingDestinationId=");
        return C18260x0.A07(this.A02, A0o);
    }

    public AnonymousClass2z1() {
        this(new C60492ye(false, false), (String) null, (String) null);
    }
}
