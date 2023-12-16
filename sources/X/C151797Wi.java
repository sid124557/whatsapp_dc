package X;

/* renamed from: X.7Wi  reason: invalid class name and case insensitive filesystem */
public class C151797Wi {
    public char A00;
    public int A01;
    public String A02;
    public StringBuffer A03 = AnonymousClass6CA.A0X();

    public String A00() {
        int i = this.A01;
        String str = this.A02;
        int length = str.length();
        if (i == length) {
            return null;
        }
        int i2 = i + 1;
        StringBuffer stringBuffer = this.A03;
        stringBuffer.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i2 != length) {
            char charAt = str.charAt(i2);
            if (charAt == '\"') {
                if (!z) {
                    z2 = !z2;
                }
            } else if (!z && !z2) {
                if (charAt != '\\') {
                    if (charAt == this.A00) {
                        break;
                    }
                    stringBuffer.append(charAt);
                } else {
                    stringBuffer.append(charAt);
                    z = true;
                }
                i2++;
            }
            stringBuffer.append(charAt);
            z = false;
            i2++;
        }
        this.A01 = i2;
        return stringBuffer.toString();
    }

    public C151797Wi(String str, char c) {
        this.A02 = str;
        this.A01 = -1;
        this.A00 = c;
    }
}
