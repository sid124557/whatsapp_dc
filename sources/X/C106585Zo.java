package X;

import java.util.regex.Pattern;

/* renamed from: X.5Zo  reason: invalid class name and case insensitive filesystem */
public final class C106585Zo {
    public static final String A00;

    public static final boolean A00(String str) {
        Pattern pattern = AnonymousClass0K8.A04;
        C162457s7.A0F(pattern);
        if (str == null || str.length() == 0 || !C18280x3.A1X(str, pattern)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(String str) {
        Pattern compile = Pattern.compile(A00);
        C162457s7.A0D(compile);
        if (str == null || str.length() == 0 || !C18280x3.A1X(str, compile)) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("^(");
        A0o.append(AnonymousClass0K8.A02.pattern());
        A00 = AnonymousClass000.A0X(")(\\:\\d{1,5})?$", A0o);
    }
}
