package X;

/* renamed from: X.5X7  reason: invalid class name */
public class AnonymousClass5X7 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public static String A00(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int length = str.length();
            if (i >= length) {
                return stringBuffer.toString();
            }
            char charAt = str.charAt(i);
            if (charAt != '\\' || i >= length - 3) {
                stringBuffer.append(charAt);
            } else if (str.charAt(i + 1) == 'r' && str.charAt(i + 2) == '\\') {
                int i2 = i + 3;
                if (str.charAt(i2) == 'n') {
                    stringBuffer.append(10);
                    i = i2;
                }
            }
            i++;
        }
    }

    public String A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        String str = this.A03;
        if (str != null) {
            A0o.append(str);
        }
        A0o.append(";");
        String str2 = this.A00;
        if (str2 != null) {
            A0o.append(str2);
        }
        A0o.append(";");
        String str3 = this.A02;
        if (str3 != null) {
            A0o.append(str3);
        }
        A0o.append(";");
        String str4 = this.A04;
        if (str4 != null) {
            A0o.append(str4);
        }
        A0o.append(";");
        String str5 = this.A01;
        if (str5 != null) {
            A0o.append(str5);
        }
        return A0o.toString();
    }

    public String toString() {
        String A002;
        StringBuilder A0o = AnonymousClass001.A0o();
        String str = this.A03;
        if (str == null) {
            A002 = null;
        } else {
            A002 = A00(str);
        }
        A0o.append(A002);
        A0o.append(" ");
        A0o.append(this.A00);
        A0o.append(" ");
        A0o.append(this.A02);
        A0o.append(" ");
        A0o.append(this.A04);
        A0o.append(" ");
        return AnonymousClass000.A0X(this.A01, A0o);
    }
}
