package X;

import android.net.Uri;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3UQ  reason: invalid class name */
public class AnonymousClass3UQ implements C185518to {
    public int A00 = 0;
    public C47502dM A01;
    public AnonymousClass7US A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final C29411im A07;
    public final C54672p6 A08;
    public final C56312rm A09;
    public final C47502dM A0A;
    public final C47502dM A0B;
    public final C29011i8 A0C;
    public final C60902zM A0D;
    public final AnonymousClass7VN A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;

    public void BSM(boolean z, int i) {
        if (i != -1) {
            C29011i8 r2 = this.A0C;
            C18260x0.A0y("routeselector/onmediatransfererrororresponsecode/code ", AnonymousClass001.A0o(), i);
            if (i == 401 || i == 403) {
                r2.A0E();
            }
        }
        this.A00++;
        A04(z);
    }

    public static String A02(C55682qk r6, AnonymousClass1VX r7, AnonymousClass5LI r8, String str) {
        long j;
        if (!r7.A0Y(C58422vE.A02, 2134)) {
            return null;
        }
        long j2 = r8.A06;
        if (j2 <= 0) {
            return null;
        }
        try {
            j = new BigInteger(1, Base64.decode(str, 2)).mod(BigInteger.valueOf(Math.abs(j2))).longValue();
        } catch (IllegalArgumentException e) {
            C18260x0.A0u("routesupplier/bigMod/could not parse hash: ", str, AnonymousClass001.A0o(), e);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("hash=");
            A0o.append(str);
            r6.A0A("routesupplier/hash not parsed", true, AnonymousClass000.A0P(e, " error=", A0o));
            j = 0;
        }
        return Long.toString(j + 100);
    }

    public static String A03(C56612sH r9, AnonymousClass1VX r10, String str, String str2, boolean z) {
        Long l;
        if (!z && !str2.startsWith("newsletter")) {
            long A042 = C56952sp.A04(r10, 2136);
            if (A042 > 0) {
                String queryParameter = Uri.parse(C18300x5.A0f(new Uri.Builder().encodedPath(str))).getQueryParameter("_nc_hot");
                if (queryParameter == null) {
                    l = null;
                } else {
                    try {
                        l = Long.valueOf(Long.parseLong(queryParameter) * 1000);
                    } catch (NumberFormatException unused) {
                        C18260x0.A0r("catv1/cannot parse hot timestamp: ", queryParameter, AnonymousClass001.A0o());
                        l = null;
                    }
                }
                long A0H2 = r9.A0H();
                if (l == null || A0H2 - l.longValue() >= A042) {
                    return null;
                }
            }
            return null;
        }
        return "1";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r12.A07.A05 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r11 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r11.A0C == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r12.A0H != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r4 >= 3) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r5 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (r4 == 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r4 < 2) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r12.A0H != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r11 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0085, code lost:
        if (r21 == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0087, code lost:
        r10 = r11.A00;
        X.C626936e.A06(r10);
        r9 = r11.A01;
        r2 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0090, code lost:
        r8 = "fna";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009c, code lost:
        if (r10.toLowerCase(java.util.Locale.ROOT).contains(r8) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009e, code lost:
        r8 = "pop";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a2, code lost:
        if (r15 == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a4, code lost:
        if (r2 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a7, code lost:
        r10 = r11.A04;
        r9 = r11.A05;
        r2 = r11.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r15 = java.net.InetAddress.getByName(r2).getHostAddress();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("[");
        r1.append(r2);
        r1.append("]");
        r9 = r1.toString();
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00cd, code lost:
        r15 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ce, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cf, code lost:
        r5 = r12.A09;
        r1 = r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d5, code lost:
        if (r1 != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d7, code lost:
        r1 = X.C175728Zm.A0P(r1, new java.lang.String[]{":"}, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f4, code lost:
        r2 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0108, code lost:
        r12.A0E.A00(r3, r10);
        r9 = X.AnonymousClass000.A0h(X.AnonymousClass000.A0m(r3, ":"), r5.A01.A03("user_proxy_setting_pref").getInt("proxy_media_port", 587));
        r6 = X.C106585Zo.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x012b, code lost:
        r2 = r11.A08;
        r1 = r12.A0F;
        X.C626936e.A06(r1);
        r13 = new X.AnonymousClass7US(r10, r9, r1, r8, r12.A0G, r2, r6, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0147, code lost:
        if (r16 == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0159, code lost:
        r12.A0E.A00(r15, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015e, code lost:
        if (r6 != 2) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0160, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0162, code lost:
        r9 = r10;
        r6 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(boolean r23) {
        /*
            r22 = this;
            r12 = r22
            int r2 = r12.A00
            int r1 = r12.A04
            if (r2 < r1) goto L_0x0015
            if (r23 == 0) goto L_0x000f
            int r0 = r12.A03
            int r1 = r1 + r0
            if (r2 < r1) goto L_0x0014
        L_0x000f:
            r13 = 0
            r12.A01 = r13
        L_0x0012:
            r12.A02 = r13
        L_0x0014:
            return
        L_0x0015:
            if (r23 != 0) goto L_0x0014
            X.2p6 r0 = r12.A08
            r17 = r0
            X.1VX r14 = r0.A03
            r0 = 59
            X.2vE r13 = X.C58422vE.A02
            boolean r0 = r14.A0Y(r13, r0)
            r15 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0030
            X.1im r0 = r12.A07
            boolean r0 = r0.A05
            r5 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            int r4 = r12.A00
            r3 = 3
            if (r4 > r6) goto L_0x005d
            X.2dM r11 = r12.A0B
            r12.A01 = r11
        L_0x003a:
            r21 = 0
            if (r11 == 0) goto L_0x0042
        L_0x003e:
            boolean r0 = r11.A0C
            if (r0 != 0) goto L_0x0048
        L_0x0042:
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x005a
            if (r4 >= r3) goto L_0x005a
        L_0x0048:
            r16 = 1
        L_0x004a:
            if (r5 == 0) goto L_0x0056
            if (r4 == 0) goto L_0x0051
            r0 = 2
            if (r4 < r0) goto L_0x0056
        L_0x0051:
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x0056
            r15 = 1
        L_0x0056:
            if (r11 != 0) goto L_0x0085
            r13 = 0
            goto L_0x0012
        L_0x005a:
            r16 = 0
            goto L_0x004a
        L_0x005d:
            X.2dM r2 = r12.A0A
            if (r2 == 0) goto L_0x006f
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x006f
            X.2dM r11 = r12.A01
            if (r11 != r2) goto L_0x006f
            r0 = 4
            if (r4 != r0) goto L_0x006f
        L_0x006c:
            r21 = 1
            goto L_0x003e
        L_0x006f:
            int r1 = r1 - r6
            if (r4 == r1) goto L_0x0081
            if (r4 == r3) goto L_0x0081
            X.2dM r1 = r12.A0B
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x0081
            X.2dM r11 = r12.A01
            if (r11 != r1) goto L_0x0081
            goto L_0x006c
        L_0x0081:
            r12.A01 = r2
            r11 = r2
            goto L_0x003a
        L_0x0085:
            if (r21 == 0) goto L_0x00a7
            java.lang.String r10 = r11.A00
            X.C626936e.A06(r10)
            java.lang.String r9 = r11.A01
            java.lang.String r2 = r11.A02
        L_0x0090:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r10.toLowerCase(r0)
            java.lang.String r8 = "fna"
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r8 = "pop"
        L_0x00a1:
            r7 = 2
            if (r15 == 0) goto L_0x00cd
            if (r2 == 0) goto L_0x00cd
            goto L_0x00ae
        L_0x00a7:
            java.lang.String r10 = r11.A04
            java.lang.String r9 = r11.A05
            java.lang.String r2 = r11.A06
            goto L_0x0090
        L_0x00ae:
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r2)     // Catch:{ UnknownHostException -> 0x00cd }
            java.lang.String r15 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00cd }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnknownHostException -> 0x00ce }
            java.lang.String r0 = "["
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x00ce }
            r1.append(r2)     // Catch:{ UnknownHostException -> 0x00ce }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x00ce }
            java.lang.String r9 = r1.toString()     // Catch:{ UnknownHostException -> 0x00ce }
            r6 = 2
            goto L_0x00cf
        L_0x00cd:
            r15 = r9
        L_0x00ce:
            r6 = 0
        L_0x00cf:
            X.2rm r5 = r12.A09
            java.lang.String r1 = r5.A00()
            if (r1 == 0) goto L_0x0147
            java.lang.String r4 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r4}
            r2 = 0
            java.util.List r1 = X.C175728Zm.A0P(r1, r0, r2)
            int r0 = r1.size()
            if (r0 != r7) goto L_0x0147
            java.lang.String r3 = X.AnonymousClass001.A0n(r1, r2)
            if (r3 == 0) goto L_0x0147
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0147
            X.1VX r2 = r5.A00
            X.2vE r1 = X.C58422vE.A01
            r0 = 3641(0xe39, float:5.102E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0147
            r0 = 4073(0xfe9, float:5.707E-42)
            boolean r0 = r2.A0Y(r13, r0)
            if (r0 == 0) goto L_0x0147
            X.7VN r0 = r12.A0E
            r0.A00(r3, r10)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0m(r3, r4)
            X.2y5 r1 = r5.A01
            java.lang.String r0 = "user_proxy_setting_pref"
            android.content.SharedPreferences r2 = r1.A03(r0)
            java.lang.String r1 = "proxy_media_port"
            r0 = 587(0x24b, float:8.23E-43)
            int r0 = r2.getInt(r1, r0)
            java.lang.String r9 = X.AnonymousClass000.A0h(r4, r0)
            boolean r6 = X.C106585Zo.A00(r3)
        L_0x012b:
            java.lang.String r2 = r11.A08
            java.lang.String r1 = r12.A0F
            X.C626936e.A06(r1)
            java.lang.String r0 = r12.A0G
            X.7US r13 = new X.7US
            r16 = r1
            r17 = r8
            r18 = r0
            r19 = r2
            r20 = r6
            r14 = r10
            r15 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0012
        L_0x0147:
            if (r16 == 0) goto L_0x0162
            boolean r0 = r17.A01()
            if (r0 == 0) goto L_0x0162
            r0 = 58
            boolean r0 = r14.A0Y(r13, r0)
            if (r0 == 0) goto L_0x0162
            if (r9 == 0) goto L_0x0162
            X.7VN r0 = r12.A0E
            r0.A00(r15, r10)
            if (r6 == r7) goto L_0x012b
            r6 = 1
            goto L_0x012b
        L_0x0162:
            r9 = r10
            r6 = 0
            goto L_0x012b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UQ.A04(boolean):void");
    }

    public long B4c() {
        C60902zM r2 = this.A0D;
        if (r2 != null && this.A00 >= this.A04) {
            Long A012 = r2.A01();
            if (A012 != null) {
                return A012.longValue();
            }
            Log.e("Mms4RouteSupplier/getBackoffTime unexpected exponential backoff of null");
        }
        return this.A06;
    }

    public AnonymousClass3UQ(C29411im r7, C54672p6 r8, C56312rm r9, C47502dM r10, C47502dM r11, C29011i8 r12, AnonymousClass7VN r13, String str, String str2, int i, int i2, long j, long j2, boolean z, boolean z2) {
        C60902zM r4;
        this.A0C = r12;
        this.A0B = r10;
        this.A0A = r11;
        this.A0F = str;
        this.A05 = j;
        this.A0G = str2;
        this.A0E = r13;
        this.A07 = r7;
        this.A09 = r9;
        this.A08 = r8;
        this.A04 = i;
        int i3 = i2;
        this.A03 = i3;
        this.A06 = j2;
        if (i2 <= 0 || !z) {
            r4 = null;
        } else {
            r4 = new C60902zM(AnonymousClass0x9.A1C(), i3, 3000);
        }
        this.A0D = r4;
        this.A0H = z2;
        A04(false);
    }

    public static C47502dM A00(String str, String str2, String str3, Collection collection, boolean z) {
        Set set;
        Set set2;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C47502dM r1 = (C47502dM) it.next();
            String str4 = r1.A04;
            try {
                if (!C18330xA.A0B(AnonymousClass000.A0V("https://", str4, AnonymousClass001.A0o())).getHost().endsWith(".whatsapp.net")) {
                }
            } catch (MalformedURLException unused) {
                if (!str4.endsWith(".whatsapp.net")) {
                    continue;
                }
            }
            if (str == null || str.equals(r1.A08)) {
                if (z) {
                    set = r1.A0B;
                } else {
                    set = r1.A09;
                }
                if ((set == null || set.contains(str2)) && (str3 == null || ((set2 = r1.A0A) != null && set2.contains(str3)))) {
                    return r1;
                }
            }
        }
        return null;
    }

    public int B6N() {
        return this.A00;
    }

    public AnonymousClass7US B6Y() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r45 != 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r35 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r35 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A0Y(X.C58422vE.A02, 2648) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3UQ A01(X.C55682qk r33, X.C29411im r34, X.C56612sH r35, X.AnonymousClass1VX r36, X.C54672p6 r37, X.C56312rm r38, X.C29011i8 r39, X.AnonymousClass5LI r40, X.AnonymousClass7VN r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, int r45, int r46, long r47, boolean r49, boolean r50) {
        /*
            r1 = 1
            r4 = r36
            if (r49 != 0) goto L_0x0011
            r2 = 2648(0xa58, float:3.71E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r2)
            r30 = 0
            if (r0 == 0) goto L_0x0013
        L_0x0011:
            r30 = 1
        L_0x0013:
            r0 = 256(0x100, float:3.59E-43)
            X.2vE r5 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r5, r0)
            r2 = r45
            if (r0 == 0) goto L_0x004f
            if (r45 != 0) goto L_0x004f
            r0 = 258(0x102, float:3.62E-43)
            int r24 = r4.A0O(r5, r0)
        L_0x0027:
            r15 = r37
            r27 = r47
            r14 = r34
            r16 = r38
            r19 = r39
            r9 = r40
            r20 = r41
            if (r40 != 0) goto L_0x0052
            r17 = 0
            r25 = 0
            int r23 = 4 - r46
            r0 = 257(0x101, float:3.6E-43)
            boolean r29 = r4.A0Y(r5, r0)
            X.3UQ r13 = new X.3UQ
            r21 = r17
            r22 = r17
            r18 = r17
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)
            return r13
        L_0x004f:
            r24 = 0
            goto L_0x0027
        L_0x0052:
            long r11 = r9.A04
            java.lang.String r13 = r9.A08
            int r41 = 4 - r46
            if (r1 != r2) goto L_0x00c4
            int r0 = r9.A00
        L_0x005c:
            int r41 = r0 + 1
            r6 = 1
            if (r45 == 0) goto L_0x0062
        L_0x0061:
            r6 = 0
        L_0x0062:
            java.util.List r3 = r9.A0A
            java.lang.String r0 = "fallback"
            r2 = 0
            r8 = r42
            X.2dM r36 = A00(r0, r8, r2, r3, r6)
            java.lang.String r1 = "primary"
            r0 = r2
            if (r6 != 0) goto L_0x009a
            r7 = r44
            r0 = r50
            r10 = r35
            java.lang.String r0 = A03(r10, r4, r7, r8, r0)
            if (r0 != 0) goto L_0x0089
            r7 = r43
            if (r43 == 0) goto L_0x0089
            r0 = r33
            java.lang.String r0 = A02(r0, r4, r9, r7)
        L_0x0089:
            r7 = 0
            if (r0 == 0) goto L_0x0092
            X.2dM r35 = A00(r1, r8, r0, r3, r7)
            if (r35 != 0) goto L_0x00a2
        L_0x0092:
            java.lang.String r9 = "0"
            X.2dM r35 = A00(r1, r8, r9, r3, r7)
            if (r35 != 0) goto L_0x00a2
        L_0x009a:
            X.2dM r35 = A00(r1, r8, r2, r3, r6)
            if (r35 != 0) goto L_0x00a2
            r35 = r36
        L_0x00a2:
            r1 = 257(0x101, float:3.6E-43)
            boolean r47 = r4.A0Y(r5, r1)
            X.3UQ r31 = new X.3UQ
            r43 = r11
            r32 = r14
            r33 = r15
            r34 = r16
            r37 = r19
            r38 = r20
            r39 = r13
            r40 = r0
            r42 = r24
            r45 = r27
            r48 = r30
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r48)
            return r31
        L_0x00c4:
            if (r45 == 0) goto L_0x00d3
            r0 = 2
            if (r0 == r2) goto L_0x00d3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Mms4RouteSupplier/invalid mode = "
            X.C18260x0.A0x(r0, r1, r2)
            goto L_0x0061
        L_0x00d3:
            int r0 = r9.A01
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UQ.A01(X.2qk, X.1im, X.2sH, X.1VX, X.2p6, X.2rm, X.1i8, X.5LI, X.7VN, java.lang.String, java.lang.String, java.lang.String, int, int, long, boolean, boolean):X.3UQ");
    }
}
