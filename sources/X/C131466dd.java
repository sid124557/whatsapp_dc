package X;

import java.util.regex.Pattern;

/* renamed from: X.6dd  reason: invalid class name and case insensitive filesystem */
public class C131466dd extends C159187lJ {
    public final String A00;
    public final String A01;
    public final Pattern A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C131466dd)) {
                return false;
            }
            Pattern pattern = this.A02;
            Pattern pattern2 = ((C131466dd) obj).A02;
            if (pattern == null) {
                return pattern2 == null;
            }
            if (!pattern.equals(pattern2)) {
                return false;
            }
        }
    }

    public String toString() {
        String str = this.A01;
        if (str.startsWith("/")) {
            return str;
        }
        StringBuilder A0m = AnonymousClass000.A0m("/", str);
        A0m.append("/");
        return AnonymousClass000.A0X(this.A00, A0m);
    }

    public C131466dd(CharSequence charSequence) {
        String str;
        int i;
        String charSequence2 = charSequence.toString();
        int indexOf = charSequence2.indexOf(47);
        int lastIndexOf = charSequence2.lastIndexOf(47);
        String substring = charSequence2.substring(indexOf + 1, lastIndexOf);
        this.A01 = substring;
        int i2 = lastIndexOf + 1;
        if (charSequence2.length() > i2) {
            str = charSequence2.substring(i2);
        } else {
            str = "";
        }
        this.A00 = str;
        int i3 = 0;
        for (char c : str.toCharArray()) {
            C142626xV[] values = C142626xV.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i = 0;
                    break;
                }
                C142626xV r1 = values[i4];
                if (r1.flag == c) {
                    i = r1.code;
                    break;
                }
                i4++;
            }
            i3 |= i;
        }
        this.A02 = Pattern.compile(substring, i3);
    }

    public C131466dd(Pattern pattern) {
        this.A01 = pattern.pattern();
        this.A02 = pattern;
        int flags = pattern.flags();
        StringBuilder A0o = AnonymousClass001.A0o();
        for (C142626xV r2 : C142626xV.values()) {
            int i = r2.code;
            if ((i & flags) == i) {
                A0o.append(r2.flag);
            }
        }
        this.A00 = A0o.toString();
    }
}
