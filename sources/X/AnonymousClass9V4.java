package X;

import java.util.Locale;

/* renamed from: X.9V4  reason: invalid class name */
public class AnonymousClass9V4 {
    public final AnonymousClass34V A00;
    public final Integer A01;

    public String toString() {
        String str;
        int intValue;
        AnonymousClass34V r0 = this.A00;
        if (r0 != null) {
            str = "NETWORK";
            intValue = r0.A00;
        } else {
            str = "CLIENT";
            Integer num = this.A01;
            C626936e.A06(num);
            intValue = num.intValue();
        }
        Locale locale = Locale.US;
        Object[] A1Z = AnonymousClass6C9.A1Z(str, 2);
        AnonymousClass000.A1P(A1Z, intValue, 1);
        return String.format(locale, "[type=%s, code=%d]", A1Z);
    }

    public AnonymousClass9V4(int i) {
        this.A00 = null;
        this.A01 = Integer.valueOf(i);
    }

    public AnonymousClass9V4(AnonymousClass34V r2) {
        this.A00 = r2;
        this.A01 = null;
    }
}
