package X;

/* renamed from: X.5OC  reason: invalid class name */
public final class AnonymousClass5OC {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass5OC(String str, String str2, String str3, String str4) {
        C626936e.A06(str);
        this.A01 = str;
        this.A04 = str2;
        C626936e.A06(str3);
        this.A00 = str3;
        C626936e.A06(str4);
        this.A03 = str4;
        StringBuilder A0o = AnonymousClass001.A0o();
        for (int i = 0; i < str4.length(); i++) {
            A0o.appendCodePoint((str4.charAt(i) + 61926) - 65);
        }
        this.A02 = A0o.toString();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append(" ");
        A0o.append(this.A00);
        A0o.append(" ");
        A0o.append(this.A04);
        A0o.append(" ");
        return AnonymousClass000.A0X(this.A02, A0o);
    }
}
