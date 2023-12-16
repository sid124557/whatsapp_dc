package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.6xw  reason: invalid class name and case insensitive filesystem */
public enum C142876xw {
    A0Q("UNKNOWN", false);
    
    public final int errorCode;
    public final C1443971k reliabilityLabel;
    public final boolean retryable;

    public static C142876xw A01(String str, int i, int i2, boolean z) {
        return new C142876xw(i, i2, str, z);
    }

    /* access modifiers changed from: public */
    C142876xw(String str, boolean z) {
        this.errorCode = r3;
        this.reliabilityLabel = new C1443971k();
        this.retryable = z;
    }

    public static C142876xw A00(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException | NullPointerException e) {
            Object[] A1b = AnonymousClass000.A1b(str);
            if (C162477s9.A01.BI0(3)) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Cannot convert errorCode %s", A1b);
                if (C162477s9.A01.BI0(3)) {
                    C162477s9.A01.B1D("VideoErrorCode", formatStrLocaleSafe, e);
                }
            }
            return A0Q;
        }
    }
}
