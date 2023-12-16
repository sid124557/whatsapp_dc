package X;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.34d  reason: invalid class name */
public final class AnonymousClass34d {
    public static final Pattern A02 = Pattern.compile("(\\d{3})(\\d{2,3})");
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (AnonymousClass34d.class != obj.getClass()) {
            return false;
        }
        AnonymousClass34d r5 = (AnonymousClass34d) obj;
        return TextUtils.equals(this.A00, r5.A00) && TextUtils.equals(this.A01, r5.A01);
    }

    public static AnonymousClass34d A00(String str) {
        String str2 = "000";
        String str3 = str2;
        if (str != null) {
            Matcher matcher = A02.matcher(str);
            if (matcher.matches()) {
                str3 = matcher.group(1);
                try {
                    str2 = String.format(Locale.US, "%03d", new Object[]{Integer.valueOf(matcher.group(2))});
                } catch (NumberFormatException e) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("mccmnc/parse mnc not parseable as integer: ");
                    C18260x0.A15(matcher.group(2), A0o, e);
                }
            }
        }
        return new AnonymousClass34d(str3, str2);
    }

    public static String A01(String str, String str2) {
        if (str != null) {
            Matcher matcher = A02.matcher(str);
            if (matcher.matches()) {
                return AnonymousClass000.A0V("-", matcher.group(2), AnonymousClass000.A0l(matcher.group(1)));
            }
        }
        return str2;
    }

    public int hashCode() {
        int A002 = C18270x1.A00(this.A00);
        return (A002 * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public AnonymousClass34d(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MccMnc<");
        A0o.append(this.A00);
        C18320x8.A1K(A0o);
        A0o.append(this.A01);
        return AnonymousClass000.A0X(">", A0o);
    }
}
