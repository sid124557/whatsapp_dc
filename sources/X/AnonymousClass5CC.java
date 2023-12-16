package X;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* renamed from: X.5CC  reason: invalid class name */
public final class AnonymousClass5CC {
    public static final String A00(String str) {
        C162457s7.A0J(str, 0);
        try {
            URL url = new URL(str);
            String host = url.getHost();
            C162457s7.A0D(host);
            int i = 0;
            int A0G = C175728Zm.A0G(str, host, 0, false);
            if (A0G < 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("cannot find host ");
                A0o.append(url.getHost());
                C18260x0.A0r(" in ", str, A0o);
                int length = str.length();
                if (length > 34) {
                    length = 34;
                }
                String substring = str.substring(0, length);
                C162457s7.A0D(substring);
                return substring;
            }
            String substring2 = str.substring(A0G + url.getHost().length());
            C162457s7.A0D(substring2);
            String host2 = url.getHost();
            C162457s7.A0D(host2);
            String A0g = C18320x8.A0g(Locale.ROOT, host2);
            C162457s7.A0J("www.", 1);
            if (A0g.startsWith("www.")) {
                host2 = host2.substring(4);
                C162457s7.A0D(host2);
            }
            int length2 = substring2.length();
            if (length2 > 12 || C86664Kz.A0L(host2, length2) > 34) {
                int i2 = length2 - 12;
                int A0L = C86664Kz.A0L(host2, length2) - 34;
                if (i2 < A0L) {
                    i2 = A0L;
                }
                i = length2;
                if (length2 > i2) {
                    i = i2;
                }
                substring2 = substring2.substring(0, length2 - i);
                C162457s7.A0D(substring2);
            }
            if (substring2.length() == 1) {
                substring2 = "";
            }
            String A0T = AnonymousClass000.A0T(host2, substring2);
            int length3 = A0T.length();
            if (length3 > 34) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(8230);
                String substring3 = A0T.substring(length3 - 34);
                C162457s7.A0D(substring3);
                A0T = AnonymousClass000.A0X(substring3, A0o2);
            }
            if (i > 0) {
                return AnonymousClass001.A0j(AnonymousClass000.A0l(A0T), 8230);
            }
            return A0T;
        } catch (MalformedURLException e) {
            C18260x0.A0u("invalid url ", str, AnonymousClass001.A0o(), e);
            int length4 = str.length();
            if (length4 > 34) {
                length4 = 34;
            }
            String substring4 = str.substring(0, length4);
            C162457s7.A0D(substring4);
            return substring4;
        }
    }
}
