package X;

/* renamed from: X.5SH  reason: invalid class name */
public class AnonymousClass5SH {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass5SH r5 = (AnonymousClass5SH) obj;
            if (!this.A02.equals(r5.A02) || !AnonymousClass75J.A00(this.A01, r5.A01) || !AnonymousClass75J.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass5SH(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A02;
        A1X[1] = this.A01;
        return C18310x6.A08(this.A00, A1X, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Bullet{text='");
        A0o.append(this.A02);
        A0o.append('\'');
        A0o.append(", iconLightUrl='");
        A0o.append(this.A01);
        A0o.append('\'');
        A0o.append(", iconDarkUrl='");
        A0o.append(this.A00);
        A0o.append('\'');
        return AnonymousClass000.A0d(A0o);
    }
}
