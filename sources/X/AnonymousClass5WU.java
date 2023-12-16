package X;

/* renamed from: X.5WU  reason: invalid class name */
public class AnonymousClass5WU {
    public final String A00;
    public final String A01;

    public boolean A00(char c, char c2) {
        int i = 0;
        while (true) {
            String str = this.A01;
            if (i >= str.length()) {
                return false;
            }
            if (str.charAt(i) == c && this.A00.charAt(i) == c2) {
                return true;
            }
            i++;
        }
    }

    public AnonymousClass5WU(AnonymousClass5WU... r8) {
        String str = "";
        String str2 = str;
        for (AnonymousClass5WU r2 : r8) {
            str = AnonymousClass000.A0X(r2.A01, AnonymousClass000.A0l(str));
            str2 = AnonymousClass000.A0X(r2.A00, AnonymousClass000.A0l(str2));
        }
        this.A01 = str;
        this.A00 = str2;
    }

    public AnonymousClass5WU(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
