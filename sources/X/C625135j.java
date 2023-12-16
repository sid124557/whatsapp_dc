package X;

import android.net.Uri;
import com.whatsapp.wamsys.SecureUriParser;
import java.util.List;

/* renamed from: X.35j  reason: invalid class name and case insensitive filesystem */
public final class C625135j {
    public static final C625135j A00 = new C625135j();

    public final Integer A04(AnonymousClass1VX r8, C58932w3 r9) {
        Uri parseEncodedRFC2396;
        C162457s7.A0J(r9, 1);
        boolean A01 = A01(r8, r9);
        Integer A0S = C18280x3.A0S();
        if (!A01) {
            if (!A02(r8, r9) || (parseEncodedRFC2396 = SecureUriParser.parseEncodedRFC2396(r9.A01)) == null) {
                return null;
            }
            String queryParameter = parseEncodedRFC2396.getQueryParameter("otp_type");
            if (queryParameter == null) {
                return 0;
            }
            int hashCode = queryParameter.hashCode();
            if (hashCode != -601943542) {
                if (hashCode != 26351735) {
                    if (hashCode == 1470813548 && queryParameter.equals("ZERO_TAP")) {
                        return 1;
                    }
                } else if (!queryParameter.equals("COPY_CODE")) {
                    return null;
                }
            } else if (queryParameter.equals("ONE_TAP")) {
                return 0;
            }
            return null;
        }
        return A0S;
    }

    public static final C58932w3 A00(AnonymousClass1VX r4, C624134x r5) {
        List<C58932w3> list;
        if ((r5 instanceof AnonymousClass1p5) && (list = ((AnonymousClass1p5) r5).A00.A06) != null) {
            for (C58932w3 r1 : list) {
                C625135j r0 = A00;
                C162457s7.A0H(r1);
                if (r0.A04(r4, r1) != null) {
                    return r1;
                }
            }
        }
        return null;
    }

    public static final boolean A03(C624134x r1) {
        if (!(r1 instanceof AnonymousClass1p5) || !C162457s7.A0P(((AnonymousClass1p5) r1).A00.A04, "AUTHENTICATION")) {
            return false;
        }
        return true;
    }

    public static final boolean A01(AnonymousClass1VX r5, C58932w3 r6) {
        boolean A1W = C18290x4.A1W(r6);
        String A0R = r5.A0R(C58422vE.A02, 3827);
        if (A0R == null) {
            return A1W;
        }
        if (r6.A06 != 2) {
            return false;
        }
        String str = r6.A01;
        C162457s7.A0C(str);
        if (str.startsWith(A0R)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(AnonymousClass1VX r5, C58932w3 r6) {
        boolean A1W = C18290x4.A1W(r6);
        String A0R = r5.A0R(C58422vE.A02, 3828);
        if (A0R == null) {
            return A1W;
        }
        if (r6.A06 != 2) {
            return false;
        }
        String str = r6.A01;
        C162457s7.A0C(str);
        if (str.startsWith(A0R)) {
            return true;
        }
        return false;
    }
}
