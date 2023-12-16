package X;

import android.net.Uri;
import java.net.URI;

/* renamed from: X.35d  reason: invalid class name and case insensitive filesystem */
public final class C624635d {
    public static final C150287Qa A00 = new C150287Qa();

    public static Uri A00(C834948q r4, String str) {
        if (str != null) {
            try {
                return A01(str);
            } catch (SecurityException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Parse uri <sanitized \"");
                A0o.append(A00.A00(str));
                r4.Bja("UriParser", AnonymousClass000.A0b("\"> failed. Fail open: ", A0o, false), e);
                return null;
            }
        } else {
            throw AnonymousClass001.A0c("Url string is null");
        }
    }

    public static boolean A04(String str, String str2) {
        if (str != null && !str.equals("")) {
            return str.equals(str2);
        }
        if (str2 == null || str2.equals("")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:22|23|24|25|(1:(1:28))|38|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c8, code lost:
        if (r1.contains("_") != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ca, code lost:
        r1 = r2.getHost();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d2, code lost:
        if (r3.getHost() != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        if (r1 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dd, code lost:
        if (r1.contains("_") != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        A02(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e3, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00ad */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c0 A[Catch:{ URISyntaxException -> 0x00e4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri A01(java.lang.String r11) {
        /*
            android.net.Uri r2 = android.net.Uri.parse(r11)
            java.lang.String r0 = r2.getScheme()
            if (r0 != 0) goto L_0x000e
            r0 = 1
        L_0x000b:
            if (r0 != 0) goto L_0x0052
            goto L_0x0019
        L_0x000e:
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "([a-zA-Z][a-zA-Z0-9+.-]*)?"
            boolean r0 = r1.matches(r0)
            goto L_0x000b
        L_0x0019:
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x006d }
            r2.<init>(r11)     // Catch:{ URISyntaxException -> 0x006d }
            boolean r0 = r2.isOpaque()
            if (r0 == 0) goto L_0x0049
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = r2.getScheme()
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = r2.getRawSchemeSpecificPart()
            android.net.Uri$Builder r1 = r1.encodedOpaquePart(r0)
            java.lang.String r0 = r2.getRawFragment()
            android.net.Uri$Builder r0 = r1.encodedFragment(r0)
            android.net.Uri r1 = r0.build()
            A03(r11, r2, r1)
            return r1
        L_0x0049:
            android.net.Uri r1 = X.AnonymousClass0x2.A0H(r2)
            r0 = 0
            A02(r1, r2, r0)
            return r1
        L_0x0052:
            boolean r0 = r2.isOpaque()
            if (r0 == 0) goto L_0x008b
            java.lang.String r4 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x006d }
            java.lang.String r3 = r2.getSchemeSpecificPart()     // Catch:{ URISyntaxException -> 0x006d }
            java.lang.String r1 = r2.getFragment()     // Catch:{ URISyntaxException -> 0x006d }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x006d }
            r0.<init>(r4, r3, r1)     // Catch:{ URISyntaxException -> 0x006d }
            A03(r11, r0, r2)
            return r2
        L_0x006d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Parsing url <sanitized \""
            r1.append(r0)
            X.7Qa r0 = A00
            java.lang.String r0 = r0.A00(r11)
            r1.append(r0)
            java.lang.String r0 = "\"> caused exception"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        L_0x008b:
            java.lang.String r4 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x00ad }
            java.lang.String r5 = r2.getUserInfo()     // Catch:{ URISyntaxException -> 0x00ad }
            java.lang.String r6 = r2.getHost()     // Catch:{ URISyntaxException -> 0x00ad }
            int r7 = r2.getPort()     // Catch:{ URISyntaxException -> 0x00ad }
            java.lang.String r8 = r2.getPath()     // Catch:{ URISyntaxException -> 0x00ad }
            java.lang.String r9 = r2.getQuery()     // Catch:{ URISyntaxException -> 0x00ad }
            java.lang.String r10 = r2.getFragment()     // Catch:{ URISyntaxException -> 0x00ad }
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00ad }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ URISyntaxException -> 0x00ad }
            goto L_0x00ca
        L_0x00ad:
            java.lang.String r0 = r2.toString()     // Catch:{ URISyntaxException -> 0x00e4 }
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00e4 }
            r3.<init>(r0)     // Catch:{ URISyntaxException -> 0x00e4 }
            java.lang.String r1 = r2.getHost()     // Catch:{ URISyntaxException -> 0x00e4 }
            java.lang.String r0 = r3.getHost()     // Catch:{ URISyntaxException -> 0x00e4 }
            if (r0 != 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00e4
            java.lang.String r0 = "_"
            boolean r0 = r1.contains(r0)     // Catch:{ URISyntaxException -> 0x00e4 }
            if (r0 == 0) goto L_0x00e4
        L_0x00ca:
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = r3.getHost()
            if (r0 != 0) goto L_0x00df
            if (r1 == 0) goto L_0x00df
            java.lang.String r0 = "_"
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00e0
        L_0x00df:
            r0 = 0
        L_0x00e0:
            A02(r2, r3, r0)
            return r2
        L_0x00e4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Parsing url <sanitized \""
            r1.append(r0)
            X.7Qa r0 = A00
            java.lang.String r0 = r0.A00(r11)
            r1.append(r0)
            java.lang.String r0 = "\"> caused exception"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624635d.A01(java.lang.String):android.net.Uri");
    }

    public static void A02(Uri uri, URI uri2, boolean z) {
        boolean A04 = A04(uri2.getScheme(), uri.getScheme());
        boolean A042 = A04(uri2.getAuthority(), uri.getAuthority());
        boolean A043 = A04(uri2.getPath(), uri.getPath());
        if (!A04 || !A042 || !A043) {
            String str = "";
            if (!A04) {
                StringBuilder A0l = AnonymousClass000.A0l(str);
                A0l.append("javaUri scheme: \"");
                A0l.append(uri2.getScheme());
                A0l.append("\". androidUri scheme: \"");
                str = AnonymousClass000.A0V(uri.getScheme(), "\".", A0l);
            }
            if (!z && !A042) {
                StringBuilder A0l2 = AnonymousClass000.A0l(str);
                A0l2.append("javaUri authority: \"");
                A0l2.append(uri2.getAuthority());
                A0l2.append("\". androidUri authority: \"");
                str = AnonymousClass000.A0V(uri.getAuthority(), "\".", A0l2);
            }
            if (!A043) {
                StringBuilder A0l3 = AnonymousClass000.A0l(str);
                A0l3.append("javaUri path: \"");
                A0l3.append(uri2.getPath());
                A0l3.append("\". androidUri path: \"");
                str = AnonymousClass000.A0V(uri.getPath(), "\".", A0l3);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            String A0k = C18300x5.A0k(uri2, "java uri <sanitized \"", A0o);
            C150287Qa r1 = A00;
            A0o.append(r1.A00(A0k));
            A0o.append(r1.A00(C18300x5.A0k(uri, "\"> not equal to android uri <sanitized \"", A0o)));
            A0o.append("\">. Debug info ");
            A0o.append(str);
            throw new SecurityException(AnonymousClass000.A0X(".", A0o));
        }
    }

    public static void A03(String str, URI uri, Uri uri2) {
        boolean A04 = A04(uri.getScheme(), uri2.getScheme());
        boolean A042 = A04(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (!A04 || !A042) {
            StringBuilder A0o = AnonymousClass001.A0o();
            String A0k = C18300x5.A0k(uri, "java uri <sanitized \"", A0o);
            C150287Qa r1 = A00;
            A0o.append(r1.A00(A0k));
            A0o.append(r1.A00(C18300x5.A0k(uri2, "\"> not equal to android uri <sanitized \"", A0o)));
            A0o.append("\"> from original <sanitized \"");
            A0o.append(r1.A00(str));
            throw new SecurityException(AnonymousClass000.A0X("\">", A0o));
        }
    }
}
