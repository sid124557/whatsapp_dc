package X;

/* renamed from: X.2z6  reason: invalid class name and case insensitive filesystem */
public final class C60752z6 {
    public static final C60752z6 A03 = new C60752z6((Integer) null, "NOT_CATCHABLE_ERROR", (String) null);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public C60752z6(Integer num, String str, String str2) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A00 = num;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60752z6) {
                C60752z6 r5 = (C60752z6) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A02) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A02);
        A0o.append(" (");
        A0o.append(this.A00);
        A0o.append("): ");
        return AnonymousClass000.A0X(this.A01, A0o);
    }
}
