package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.HashMap;

/* renamed from: X.9Wl  reason: invalid class name and case insensitive filesystem */
public class C195179Wl {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;

    public static C195179Wl A00(Uri uri, String str) {
        Uri uri2 = uri;
        if (uri == null) {
            return null;
        }
        String str2 = str;
        if (AnonymousClass0x9.A0z(uri2.toString()).startsWith("upi://mandate")) {
            return new C195179Wl(A02(uri2, "pn"), A02(uri2, "am"), A02(uri2, "tr"), A02(uri2, "mc"), A03(uri2, str2), A02(uri2, "purpose"), A02(uri2, "pa"), A02(uri2, "sign"), A02(uri2, "amrule"), A02(uri2, "tn"), A02(uri2, "mn"), A02(uri2, "validitystart"), A02(uri2, "validityend"), A02(uri2, "recur"), A02(uri2, "recurvalue"), A02(uri2, "recurtype"), A02(uri2, "rev"), A02(uri2, "share"), A02(uri2, "block"), A02(uri2, "umn"), str);
        }
        if ("upi".equalsIgnoreCase(uri2.getScheme())) {
            String A022 = A02(uri2, "am");
            String A023 = A02(uri2, "mam");
            String A024 = A02(uri2, "pn");
            String A025 = A02(uri2, "tr");
            String A026 = A02(uri2, "mc");
            String A027 = A02(uri2, "tid");
            String queryParameter = uri2.getQueryParameter("url");
            String A032 = A03(uri2, str2);
            String A028 = A02(uri2, "purpose");
            if (!TextUtils.isEmpty(A022) && A022.equals(A023)) {
                A023 = null;
            }
            return new C195179Wl(A024, A022, A025, A026, A027, queryParameter, A032, A028, A023, A02(uri2, "pa"), A02(uri2, "sign"), str2);
        }
        try {
            String obj = uri2.toString();
            AnonymousClass9QS r1 = new AnonymousClass9QS();
            HashMap A002 = r1.A00(obj.trim());
            HashMap A003 = r1.A00(C18320x8.A0e("26", A002));
            HashMap A004 = r1.A00(C18320x8.A0e("27", A002));
            return new C195179Wl(C18320x8.A0e("59", A002), C18320x8.A0e("54", A002), C18320x8.A0e("01", A004), C18320x8.A0e("52", A002), (String) null, C18320x8.A0e("02", A004), "03", (String) null, C18320x8.A0e("02", A003), C18320x8.A0e("01", A003), (String) null, str2);
        } catch (Exception unused) {
            Log.e("PAY: unknown uri");
            return null;
        }
    }

    public static C195179Wl A01(String str, String str2) {
        C195179Wl A002;
        if (str == null || (A002 = A00(Uri.parse(str), str2)) == null) {
            return null;
        }
        A002.A08 = str;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r9.equals("GALLERY_QR_CODE") != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.net.Uri r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "am"
            java.lang.String r0 = r8.getQueryParameter(r0)
            boolean r7 = X.C18320x8.A1U(r0)
            java.lang.String r0 = "mode"
            java.lang.String r6 = A02(r8, r0)
            java.lang.String r0 = "SCANNED_QR_CODE"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "GALLERY_QR_CODE"
            boolean r0 = r9.equals(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r5 = 1
        L_0x0022:
            java.lang.String r0 = "DEEP_LINK"
            boolean r4 = r9.equals(r0)
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ Exception -> 0x003c }
            java.lang.String r2 = "%02d"
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()     // Catch:{ Exception -> 0x003c }
            int r0 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x003c }
            X.AnonymousClass000.A1L(r1, r0)     // Catch:{ Exception -> 0x003c }
            java.lang.String r1 = java.lang.String.format(r3, r2, r1)     // Catch:{ Exception -> 0x003c }
            goto L_0x0047
        L_0x003c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: IndiaUpiInitiationModeUtil/getInitiationMode"
            X.C18260x0.A1Q(r1, r0, r2)
            r1 = 0
        L_0x0047:
            if (r5 == 0) goto L_0x0061
            if (r7 == 0) goto L_0x0056
            java.util.HashSet r0 = X.AnonymousClass9MA.A00
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "15"
        L_0x0055:
            return r1
        L_0x0056:
            java.util.HashSet r0 = X.AnonymousClass9MA.A03
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "01"
            return r1
        L_0x0061:
            if (r4 == 0) goto L_0x006e
            java.util.HashSet r0 = X.AnonymousClass9MA.A01
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "04"
            return r1
        L_0x006e:
            java.lang.String r1 = "00"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195179Wl.A03(android.net.Uri, java.lang.String):java.lang.String");
    }

    public String A06() {
        String A0V;
        StringBuffer stringBuffer = new StringBuffer();
        A05("pn", this.A09, stringBuffer);
        A05("am", this.A0A, stringBuffer);
        A05("tr", this.A0K, stringBuffer);
        A05("mc", this.A06, stringBuffer);
        A05("tid", this.A0J, stringBuffer);
        A05("url", this.A0F, stringBuffer);
        A05("mode", this.A04, stringBuffer);
        A05("purpose", this.A0C, stringBuffer);
        A05("mam", this.A0B, stringBuffer);
        A05("pa", this.A0O, stringBuffer);
        A05("sign", this.A0I, stringBuffer);
        A05("tn", this.A07, stringBuffer);
        String obj = stringBuffer.toString();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("upi://pay");
        if (TextUtils.isEmpty(obj)) {
            A0V = "";
        } else {
            A0V = AnonymousClass000.A0V("?", obj, AnonymousClass001.A0o());
        }
        return AnonymousClass000.A0X(A0V, A0o);
    }

    public C195179Wl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        this.A09 = A04(str, false);
        this.A0A = A07(str2);
        this.A0K = A04(str3, false);
        this.A06 = A04(str4, false);
        this.A04 = A04(str5, false);
        this.A0C = A04(str6, false);
        this.A0O = A04(str7, true);
        this.A0I = A04(str8, false);
        this.A02 = str21;
        this.A00 = A04(str9, false);
        this.A07 = A04(str10, false);
        this.A05 = A04(str11, false);
        this.A0N = A04(str12, false);
        this.A0M = A04(str13, false);
        this.A03 = A04(str14, false);
        this.A0D = A04(str15, false);
        this.A0E = A04(str16, false);
        this.A0G = A04(str17, false);
        this.A0H = A04(str18, false);
        this.A01 = A04(str19, false);
        this.A0L = A04(str20, false);
    }

    public static String A02(Uri uri, String str) {
        int indexOf;
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null || (indexOf = queryParameter.indexOf(63)) <= 0) {
            return queryParameter;
        }
        return queryParameter.replace(queryParameter.substring(indexOf), "");
    }

    public static final String A04(String str, boolean z) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "na".equalsIgnoreCase(str)) {
            return null;
        }
        String trim = str.trim();
        if (z) {
            return AnonymousClass0x9.A0z(trim);
        }
        return trim;
    }

    public static void A05(String str, String str2, StringBuffer stringBuffer) {
        if (!TextUtils.isEmpty(str2)) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("&");
            }
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append(Uri.encode(str2, "@"));
        }
    }

    public final String A07(String str) {
        boolean z;
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "0".equals(str) || "0.0".equals(str) || "0.00".equals(str)) {
            return null;
        }
        try {
            new BigDecimal(str.trim());
            z = true;
        } catch (NumberFormatException unused) {
            Log.w("PAY: IndiaUpiDeeplinkMetadata - Unable to parse amount field");
            z = false;
        }
        if (z) {
            return str.trim();
        }
        return null;
    }

    public C195179Wl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A09 = A04(str, false);
        this.A0A = A07(str2);
        this.A0K = A04(str3, false);
        this.A06 = A04(str4, false);
        this.A0J = A04(str5, false);
        this.A0F = A04(str6, false);
        this.A04 = A04(str7, false);
        this.A0C = A04(str8, false);
        this.A0B = A07(str9);
        this.A0O = A04(str10, true);
        this.A07 = A04((String) null, false);
        this.A0I = A04(str11, false);
        this.A02 = str12;
    }

    public C195179Wl() {
    }
}
