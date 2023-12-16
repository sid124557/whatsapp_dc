package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.6xt  reason: invalid class name and case insensitive filesystem */
public enum C142846xt {
    ;
    
    public final String value;

    public static C142846xt A01(String str, int i) {
        return new C142846xt(str, i, str);
    }

    /* access modifiers changed from: public */
    C142846xt(String str) {
        this.value = str;
    }

    public static C142846xt A00(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException | NullPointerException e) {
            Object[] A1b = AnonymousClass000.A1b(str);
            if (C162477s9.A01.BI0(3)) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Cannot convert errorDomain %s", A1b);
                if (C162477s9.A01.BI0(3)) {
                    C162477s9.A01.B1D("VideoErrorDomain", formatStrLocaleSafe, e);
                }
            }
            return A0E;
        }
    }
}
