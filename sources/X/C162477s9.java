package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* renamed from: X.7s9  reason: invalid class name and case insensitive filesystem */
public class C162477s9 {
    public static final List A00 = AnonymousClass001.A0s();
    public static volatile C186438vJ A01 = AnonymousClass82I.A01;

    static {
        ((AnonymousClass82I) A01).A00 = 5;
        C161577py.A00 = A01;
    }

    public static int A00() {
        return A01.B9n();
    }

    public static synchronized void A01(AnonymousClass0JK r2) {
        synchronized (C162477s9.class) {
            A00.add(r2);
        }
    }

    public static void A02(Class cls, String str) {
        if (A01.BI0(3)) {
            A01.B1C(cls.getSimpleName(), str);
        }
    }

    public static void A03(Object obj, Object obj2, String str, String str2) {
        if (A01.BI0(3)) {
            A06(str, StringFormatUtil.formatStrLocaleSafe(str2, obj, obj2));
        }
    }

    public static void A04(Object obj, String str, String str2) {
        if (A01.BI0(3)) {
            A06(str, StringFormatUtil.formatStrLocaleSafe(str2, obj));
        }
    }

    public static void A05(Object obj, String str, String str2) {
        if (A01.BI0(4)) {
            A07(str, StringFormatUtil.formatStrLocaleSafe(str2, obj));
        }
    }

    public static void A06(String str, String str2) {
        if (A01.BI0(3)) {
            A01.B1C(str, str2);
        }
    }

    public static void A07(String str, String str2) {
        if (A01.BI0(4)) {
            A01.BFi(str, str2);
        }
    }

    public static void A08(String str, String str2) {
        if (A01.BI0(5)) {
            A01.BsJ(str, str2);
        }
    }

    public static void A0E(String str, String str2, Object... objArr) {
        if (A01.BI0(6)) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str2, objArr);
            if (A01.BI0(6)) {
                A01.B2F(str, formatStrLocaleSafe);
            }
        }
    }

    public static void A0F(String str, String str2, Object... objArr) {
        if (A01.BI0(5)) {
            A08(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A0H(Throwable th) {
        if (A01.BI0(5)) {
            A01.BsK("CDSThreadTracing", "Thread tracing stacktrace", th);
        }
    }

    public static void A09(String str, String str2) {
        if (AnonymousClass6C8.A1N()) {
            A01.Bsm(str, str2);
        }
    }

    public static void A0A(String str, String str2, Throwable th) {
        if (AnonymousClass6C8.A1N()) {
            A01.B2G(str, str2, th);
        }
    }

    public static void A0B(String str, String str2, Throwable th) {
        if (AnonymousClass6C8.A1N()) {
            A01.Bsn(str, str2, th);
        }
    }

    public static void A0C(String str, String str2, Throwable th, Object... objArr) {
        if (AnonymousClass6C8.A1N()) {
            A0A(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0D(String str, String str2, Throwable th, Object... objArr) {
        if (AnonymousClass6C8.A1N()) {
            A0B(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0G(String str, String str2, Object... objArr) {
        if (AnonymousClass6C8.A1N()) {
            A09(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }
}
