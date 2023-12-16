package X;

import java.util.regex.Pattern;

/* renamed from: X.8IS  reason: invalid class name */
public final class AnonymousClass8IS implements C186988wG {
    public static final C171858Ir A02 = new C171858Ir();
    public final String A00;
    public final String A01;

    public boolean B2j(C150587Rj r4) {
        C162457s7.A0J(r4, 0);
        String str = this.A01;
        boolean A0Y = C175738Zn.A0Y(str, "$.", false);
        Object obj = str;
        if (A0Y) {
            obj = r4.A00(str);
        }
        if (obj instanceof String) {
            return Pattern.compile(this.A00).matcher((CharSequence) obj).find();
        }
        throw AnonymousClass002.A0G("Input string is null");
    }

    public AnonymousClass8IS(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
