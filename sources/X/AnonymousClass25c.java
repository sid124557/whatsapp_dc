package X;

import java.util.Arrays;

/* renamed from: X.25c  reason: invalid class name */
public final class AnonymousClass25c {
    public static final C51052jC A00(String str, String str2) {
        C162457s7.A0J(str2, 1);
        byte[] digest = AnonymousClass0x7.A0t().digest(AnonymousClass0x2.A1a(AnonymousClass000.A0T(str, str2)));
        C162457s7.A0H(digest);
        String str3 = "";
        for (byte A1T : digest) {
            StringBuilder A0l = AnonymousClass000.A0l(str3);
            Object[] objArr = new Object[1];
            C18310x6.A1T(objArr, A1T, 0);
            String format = String.format("%02x", Arrays.copyOf(objArr, 1));
            C162457s7.A0D(format);
            str3 = AnonymousClass000.A0X(format, A0l);
        }
        return new C51052jC(str3);
    }
}
