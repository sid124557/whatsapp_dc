package X;

import android.net.Uri;
import java.io.File;
import java.net.MalformedURLException;

/* renamed from: X.2t9  reason: invalid class name and case insensitive filesystem */
public class C57132t9 {
    public static String A00(C106685Zz r4, String str) {
        try {
            String host = C18330xA.A0B(str).getHost();
            C18260x0.A0O(r4, str);
            Uri parse = Uri.parse(C106685Zz.A01(str));
            C162457s7.A0H(parse);
            boolean z = true;
            if (!AnonymousClass35G.A03(parse, AnonymousClass35G.A01)) {
                if (!AnonymousClass35G.A03(parse, AnonymousClass35G.A00) || !"1".equalsIgnoreCase(parse.getQueryParameter("fw"))) {
                    z = false;
                }
            }
            if (!z) {
                return host;
            }
            StringBuilder A0l = AnonymousClass000.A0l(host);
            A0l.append("/watch");
            return A0l.toString();
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public static boolean A01(C624134x r5, C33141sV r6, boolean z) {
        String str;
        File A03;
        if (z) {
            AnonymousClass2U8 r0 = r5.A0c;
            if (r0 == null || r0.A01 != 1) {
                C55592qb r4 = r5.A0l;
                if (r4 != null && (!((str = r4.A04) == null && r4.A07 == null) && r4.A01 > 0 && r4.A00 > 0)) {
                    if (r4.A09 || (r5.A1J.A02 && !r5.A1W)) {
                        if (r5 instanceof C30481mW) {
                            C64393Dh r02 = r6.A05.A02;
                            if (str != null) {
                                A03 = r02.A0T(str);
                            } else {
                                String str2 = r4.A07;
                                if (str2 != null) {
                                    File file = r02.A08().A0R;
                                    C64393Dh.A07(file, false);
                                    C626936e.A06(str2);
                                    A03 = C64393Dh.A03(file, str2);
                                }
                            }
                            if (A03 == null || !A03.exists()) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
