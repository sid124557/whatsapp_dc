package X;

import java.util.regex.Matcher;

/* renamed from: X.7Mm  reason: invalid class name and case insensitive filesystem */
public class C149447Mm {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C149447Mm(String str, boolean z) {
        Matcher matcher = C159827mW.A01.matcher(str);
        matcher.find();
        this.A00 = matcher.group();
        boolean z2 = false;
        if (z) {
            int indexOf = str.indexOf(164);
            this.A01 = str.substring(0, indexOf);
            this.A02 = AnonymousClass6C9.A0c(indexOf, str);
            if (matcher.start() > indexOf) {
                z2 = true;
            }
        } else {
            this.A02 = "";
            this.A01 = "";
        }
        this.A03 = z2;
    }
}
