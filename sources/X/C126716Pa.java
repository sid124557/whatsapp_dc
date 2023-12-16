package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6Pa  reason: invalid class name and case insensitive filesystem */
public final class C126716Pa extends C126516Og {
    public static final Pattern A05 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public float A00;
    public float A01;
    public Map A02;
    public final C156717h5 A03;
    public final boolean A04;

    public C126716Pa(List list) {
        super("SsaDecoder");
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.A04 = false;
            this.A03 = null;
            return;
        }
        this.A04 = true;
        String str = new String(AnonymousClass6C9.A1V(list, 0), AnonymousClass79T.A05);
        C161487pm.A03(str.startsWith("Format:"));
        C156717h5 A002 = C156717h5.A00(str);
        A002.getClass();
        this.A03 = A002;
        A05(new C161467pi(AnonymousClass6C9.A1V(list, 1)));
    }

    public static long A01(String str) {
        Matcher matcher = A05.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (AnonymousClass6C9.A0O(matcher, 1) * 60 * 60 * SearchActionVerificationClientService.MS_TO_NS) + (AnonymousClass6C9.A0O(matcher, 2) * 60 * SearchActionVerificationClientService.MS_TO_NS) + (AnonymousClass6C9.A0O(matcher, 3) * SearchActionVerificationClientService.MS_TO_NS) + (AnonymousClass6C9.A0O(matcher, 4) * 10000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b4 A[Catch:{ RuntimeException -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c2 A[Catch:{ RuntimeException -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d6 A[Catch:{ RuntimeException -> 0x01e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C161467pi r26) {
        /*
            r25 = this;
        L_0x0000:
            r4 = r26
            java.lang.String r1 = r4.A0M()
            if (r1 == 0) goto L_0x026e
            java.lang.String r0 = "[Script Info]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r3 = r25
            if (r0 != 0) goto L_0x020d
            java.lang.String r0 = "[V4+ Styles]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x01fc
            java.util.LinkedHashMap r2 = X.C18320x8.A0r()
        L_0x001e:
            r1 = 0
        L_0x001f:
            java.lang.String r8 = r4.A0M()
            if (r8 == 0) goto L_0x01f8
            int r0 = r4.A00
            int r5 = r4.A01
            int r0 = r0 - r5
            if (r0 == 0) goto L_0x0036
            byte[] r0 = r4.A02
            byte r0 = r0[r5]
            r5 = r0 & 255(0xff, float:3.57E-43)
            r0 = 91
            if (r5 == r0) goto L_0x01f8
        L_0x0036:
            java.lang.String r0 = "Format:"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x00b2
            r0 = 7
            java.lang.String r1 = r8.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r7 = android.text.TextUtils.split(r1, r0)
            r6 = -1
            r1 = 0
            r5 = -1
            r9 = -1
            r10 = -1
            r11 = -1
            r12 = -1
            r13 = -1
        L_0x0051:
            int r0 = r7.length
            if (r1 >= r0) goto L_0x00a6
            r0 = r7[r1]
            java.lang.String r8 = r0.trim()
            if (r8 == 0) goto L_0x0060
            java.lang.String r8 = X.AnonymousClass0x9.A0z(r8)
        L_0x0060:
            int r0 = r8.hashCode()
            switch(r0) {
                case -1178781136: goto L_0x009c;
                case -70925746: goto L_0x0092;
                case 3029637: goto L_0x0088;
                case 3373707: goto L_0x007e;
                case 366554320: goto L_0x0074;
                case 1767875043: goto L_0x006a;
                default: goto L_0x0067;
            }
        L_0x0067:
            int r1 = r1 + 1
            goto L_0x0051
        L_0x006a:
            java.lang.String r0 = "alignment"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0067
            r9 = r1
            goto L_0x0067
        L_0x0074:
            java.lang.String r0 = "fontsize"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0067
            r11 = r1
            goto L_0x0067
        L_0x007e:
            java.lang.String r0 = "name"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0067
            r5 = r1
            goto L_0x0067
        L_0x0088:
            java.lang.String r0 = "bold"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0067
            r12 = r1
            goto L_0x0067
        L_0x0092:
            java.lang.String r0 = "primarycolour"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0067
            r10 = r1
            goto L_0x0067
        L_0x009c:
            java.lang.String r0 = "italic"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0067
            r13 = r1
            goto L_0x0067
        L_0x00a6:
            if (r5 == r6) goto L_0x001e
            X.7P2 r1 = new X.7P2
            r8 = r5
            r14 = r0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x001f
        L_0x00b2:
            java.lang.String r0 = "Style:"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x001f
            if (r1 != 0) goto L_0x00cd
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r5 = X.AnonymousClass000.A0V(r0, r8, r5)
            java.lang.String r0 = "SsaDecoder"
            android.util.Log.w(r0, r5)
            goto L_0x001f
        L_0x00cd:
            r0 = 6
            java.lang.String r5 = r8.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r5, r0)
            int r5 = r9.length
            int r0 = r1.A04
            java.lang.String r7 = "SsaStyle"
            r19 = 0
            r6 = 0
            if (r5 == r0) goto L_0x00fc
            java.lang.Object[] r9 = X.AnonymousClass0x9.A1X()
            X.AnonymousClass000.A1P(r9, r0, r6)
            X.AnonymousClass000.A1M(r9, r5)
            r0 = 2
            r9[r0] = r8
            java.lang.String r5 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r0, r5, r9)
            android.util.Log.w(r7, r0)
            goto L_0x001f
        L_0x00fc:
            int r0 = r1.A05     // Catch:{ RuntimeException -> 0x01e0 }
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r20 = r0.trim()     // Catch:{ RuntimeException -> 0x01e0 }
            int r0 = r1.A00     // Catch:{ RuntimeException -> 0x01e0 }
            r5 = -1
            if (r0 == r5) goto L_0x011e
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01e0 }
            int r22 = X.C160137n6.A00(r0)     // Catch:{ RuntimeException -> 0x01e0 }
        L_0x0113:
            int r0 = r1.A06     // Catch:{ RuntimeException -> 0x01e0 }
            if (r0 == r5) goto L_0x0188
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r12 = r0.trim()     // Catch:{ RuntimeException -> 0x01e0 }
            goto L_0x0121
        L_0x011e:
            r22 = -1
            goto L_0x0113
        L_0x0121:
            java.lang.String r0 = "&H"
            boolean r10 = r12.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0172 }
            r0 = 16
            if (r10 == 0) goto L_0x0135
            r10 = 2
            java.lang.String r10 = r12.substring(r10)     // Catch:{ IllegalArgumentException -> 0x0172 }
            long r17 = java.lang.Long.parseLong(r10, r0)     // Catch:{ IllegalArgumentException -> 0x0172 }
            goto L_0x0139
        L_0x0135:
            long r17 = java.lang.Long.parseLong(r12)     // Catch:{ IllegalArgumentException -> 0x0172 }
        L_0x0139:
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r10 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            boolean r10 = X.AnonymousClass0x7.A1P(r10)
            X.C161487pm.A03(r10)     // Catch:{ IllegalArgumentException -> 0x0172 }
            r10 = 24
            long r10 = r17 >> r10
            r15 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r15
            long r10 = r10 ^ r15
            int r12 = X.C159357lh.A00(r10)     // Catch:{ RuntimeException -> 0x01e0 }
            long r10 = r17 >> r0
            long r10 = r10 & r15
            int r11 = X.C159357lh.A00(r10)     // Catch:{ RuntimeException -> 0x01e0 }
            r0 = 8
            long r13 = r17 >> r0
            long r13 = r13 & r15
            int r10 = X.C159357lh.A00(r13)     // Catch:{ RuntimeException -> 0x01e0 }
            long r17 = r17 & r15
            int r0 = X.C159357lh.A00(r17)     // Catch:{ RuntimeException -> 0x01e0 }
            int r0 = android.graphics.Color.argb(r12, r0, r10, r11)     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x01e0 }
            goto L_0x0188
        L_0x0172:
            r11 = move-exception
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r0 = "Failed to parse color expression: '"
            r10.append(r0)     // Catch:{ RuntimeException -> 0x01e0 }
            r10.append(r12)     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r0 = "'"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r10)     // Catch:{ RuntimeException -> 0x01e0 }
            X.C159307lc.A01(r0, r7, r11)     // Catch:{ RuntimeException -> 0x01e0 }
        L_0x0188:
            int r0 = r1.A02     // Catch:{ RuntimeException -> 0x01e0 }
            if (r0 == r5) goto L_0x01ad
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r12 = r0.trim()     // Catch:{ RuntimeException -> 0x01e0 }
            float r21 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x0197 }
            goto L_0x01b0
        L_0x0197:
            r10 = move-exception
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r0 = "Failed to parse font size: '"
            r11.append(r0)     // Catch:{ RuntimeException -> 0x01e0 }
            r11.append(r12)     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r0 = "'"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r11)     // Catch:{ RuntimeException -> 0x01e0 }
            X.C159307lc.A01(r0, r7, r10)     // Catch:{ RuntimeException -> 0x01e0 }
        L_0x01ad:
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x01b0:
            int r0 = r1.A01     // Catch:{ RuntimeException -> 0x01e0 }
            if (r0 == r5) goto L_0x01d6
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01e0 }
            boolean r23 = X.C160137n6.A01(r0)     // Catch:{ RuntimeException -> 0x01e0 }
        L_0x01be:
            int r0 = r1.A03     // Catch:{ RuntimeException -> 0x01e0 }
            if (r0 == r5) goto L_0x01cc
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01e0 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01e0 }
            boolean r6 = X.C160137n6.A01(r0)     // Catch:{ RuntimeException -> 0x01e0 }
        L_0x01cc:
            X.7n6 r5 = new X.7n6     // Catch:{ RuntimeException -> 0x01e0 }
            r18 = r5
            r24 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ RuntimeException -> 0x01e0 }
            goto L_0x01d9
        L_0x01d6:
            r23 = 0
            goto L_0x01be
        L_0x01d9:
            java.lang.String r0 = r5.A03
            r2.put(r0, r5)
            goto L_0x001f
        L_0x01e0:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipping malformed 'Style:' line: '"
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = "'"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r5)
            X.C159307lc.A01(r0, r7, r6)
            goto L_0x001f
        L_0x01f8:
            r3.A02 = r2
            goto L_0x0000
        L_0x01fc:
            java.lang.String r0 = "[V4 Styles]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0266
            java.lang.String r1 = "SsaDecoder"
            java.lang.String r0 = "[V4 Styles] are not supported"
            android.util.Log.i(r1, r0)
            goto L_0x0000
        L_0x020d:
            java.lang.String r2 = r4.A0M()
            if (r2 == 0) goto L_0x0000
            int r0 = r4.A00
            int r1 = r4.A01
            int r0 = r0 - r1
            if (r0 == 0) goto L_0x0224
            byte[] r0 = r4.A02
            byte r0 = r0[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 91
            if (r1 == r0) goto L_0x0000
        L_0x0224:
            java.lang.String r0 = ":"
            java.lang.String[] r5 = r2.split(r0)
            int r1 = r5.length
            r0 = 2
            if (r1 != r0) goto L_0x020d
            r0 = 0
            r0 = r5[r0]
            java.lang.String r2 = r0.trim()
            if (r2 == 0) goto L_0x023b
            java.lang.String r2 = X.AnonymousClass0x9.A0z(r2)
        L_0x023b:
            java.lang.String r0 = "playresx"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0259
            java.lang.String r0 = "playresy"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x020d
            r0 = r5[r1]     // Catch:{ NumberFormatException -> 0x020d }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x020d }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x020d }
            r3.A00 = r0     // Catch:{ NumberFormatException -> 0x020d }
            goto L_0x020d
        L_0x0259:
            r0 = r5[r1]     // Catch:{ NumberFormatException -> 0x020d }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x020d }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x020d }
            r3.A01 = r0     // Catch:{ NumberFormatException -> 0x020d }
            goto L_0x020d
        L_0x0266:
            java.lang.String r0 = "[Events]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0000
        L_0x026e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126716Pa.A05(X.7pi):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = X.AnonymousClass001.A0s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r5.add(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r0 = X.AnonymousClass002.A0J((java.util.Collection) r5.get(r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r4.add(r3, java.lang.Long.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3 != 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.util.List r4, java.util.List r5, long r6) {
        /*
            int r3 = r4.size()
        L_0x0004:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0038
            long r1 = X.AnonymousClass6C7.A0K(r4, r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            long r1 = X.AnonymousClass6C7.A0K(r4, r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0004
            int r3 = r3 + 1
        L_0x001a:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r4.add(r3, r0)
            if (r3 != 0) goto L_0x002b
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
        L_0x0027:
            r5.add(r3, r0)
        L_0x002a:
            return r3
        L_0x002b:
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            goto L_0x0027
        L_0x0038:
            r3 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126716Pa.A00(java.util.List, java.util.List, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023a, code lost:
        if (r0 == false) goto L_0x01aa;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0116 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C185358tW A04(byte[] r23, int r24, boolean r25) {
        /*
            r22 = this;
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.7pi r21 = new X.7pi
            r4 = r23
            r1 = r24
            r0 = r21
            r0.<init>(r4, r1)
            r5 = r22
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x023e
            r0 = r21
            r5.A05(r0)
            r6 = 0
        L_0x001f:
            java.lang.String r4 = r21.A0M()
            if (r4 == 0) goto L_0x0242
            java.lang.String r0 = "Format:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0032
            X.7h5 r6 = X.C156717h5.A00(r4)
            goto L_0x001f
        L_0x0032:
            java.lang.String r0 = "Dialogue:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x001f
            if (r6 != 0) goto L_0x004c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipping dialogue line before complete format: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r4, r1)
            java.lang.String r0 = "SsaDecoder"
            android.util.Log.w(r0, r1)
            goto L_0x001f
        L_0x004c:
            r0 = 9
            java.lang.String r1 = r4.substring(r0)
            int r8 = r6.A01
            java.lang.String r0 = ","
            java.lang.String[] r7 = r1.split(r0, r8)
            int r0 = r7.length
            java.lang.String r1 = "SsaDecoder"
            if (r0 == r8) goto L_0x006c
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipping dialogue line with fewer columns than format: "
            r7.append(r0)
        L_0x0068:
            X.AnonymousClass000.A1F(r4, r1, r7)
            goto L_0x001f
        L_0x006c:
            int r0 = r6.A02
            r0 = r7[r0]
            long r19 = A01(r0)
            java.lang.String r10 = "Skipping invalid timing: "
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            int r0 = r6.A00
            r0 = r7[r0]
            long r17 = A01(r0)
            int r0 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            java.util.Map r4 = r5.A02
            if (r4 == 0) goto L_0x0130
            int r1 = r6.A03
            r0 = -1
            if (r1 == r0) goto L_0x0130
            r0 = r7[r1]
            java.lang.String r0 = r0.trim()
            java.lang.Object r13 = r4.get(r0)
            X.7n6 r13 = (X.C160137n6) r13
        L_0x00a0:
            int r0 = r6.A04
            r8 = r7[r0]
            java.util.regex.Pattern r7 = X.AnonymousClass79D.A01
            java.util.regex.Matcher r4 = r7.matcher(r8)
            r11 = 0
            r12 = -1
        L_0x00ac:
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x0139
            r9 = 1
            java.lang.String r10 = X.AnonymousClass6C8.A0f(r4, r9)
            java.util.regex.Pattern r0 = X.AnonymousClass79D.A03     // Catch:{ RuntimeException -> 0x0116 }
            java.util.regex.Matcher r15 = r0.matcher(r10)     // Catch:{ RuntimeException -> 0x0116 }
            java.util.regex.Pattern r0 = X.AnonymousClass79D.A02     // Catch:{ RuntimeException -> 0x0116 }
            java.util.regex.Matcher r1 = r0.matcher(r10)     // Catch:{ RuntimeException -> 0x0116 }
            boolean r16 = r15.find()     // Catch:{ RuntimeException -> 0x0116 }
            boolean r0 = r1.find()     // Catch:{ RuntimeException -> 0x0116 }
            r14 = 2
            if (r16 == 0) goto L_0x00f0
            if (r0 == 0) goto L_0x00e7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ RuntimeException -> 0x0116 }
            java.lang.String r0 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x0116 }
            r1.append(r10)     // Catch:{ RuntimeException -> 0x0116 }
            java.lang.String r0 = "'"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ RuntimeException -> 0x0116 }
            java.lang.String r0 = "SsaStyle.Overrides"
            android.util.Log.i(r0, r1)     // Catch:{ RuntimeException -> 0x0116 }
        L_0x00e7:
            java.lang.String r0 = r15.group(r9)     // Catch:{ RuntimeException -> 0x0116 }
            java.lang.String r1 = r15.group(r14)     // Catch:{ RuntimeException -> 0x0116 }
            goto L_0x00fa
        L_0x00f0:
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r1.group(r9)     // Catch:{ RuntimeException -> 0x0116 }
            java.lang.String r1 = r1.group(r14)     // Catch:{ RuntimeException -> 0x0116 }
        L_0x00fa:
            r0.getClass()     // Catch:{ RuntimeException -> 0x0116 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0116 }
            float r14 = java.lang.Float.parseFloat(r0)     // Catch:{ RuntimeException -> 0x0116 }
            r1.getClass()     // Catch:{ RuntimeException -> 0x0116 }
            java.lang.String r0 = r1.trim()     // Catch:{ RuntimeException -> 0x0116 }
            float r1 = java.lang.Float.parseFloat(r0)     // Catch:{ RuntimeException -> 0x0116 }
            android.graphics.PointF r0 = new android.graphics.PointF     // Catch:{ RuntimeException -> 0x0116 }
            r0.<init>(r14, r1)     // Catch:{ RuntimeException -> 0x0116 }
            r11 = r0
        L_0x0116:
            java.util.regex.Pattern r0 = X.AnonymousClass79D.A00     // Catch:{ RuntimeException -> 0x00ac }
            java.util.regex.Matcher r1 = r0.matcher(r10)     // Catch:{ RuntimeException -> 0x00ac }
            boolean r0 = r1.find()     // Catch:{ RuntimeException -> 0x00ac }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = X.AnonymousClass6C8.A0f(r1, r9)     // Catch:{ RuntimeException -> 0x00ac }
            int r1 = X.C160137n6.A00(r0)     // Catch:{ RuntimeException -> 0x00ac }
            r0 = -1
            if (r1 == r0) goto L_0x00ac
            r12 = r1
            goto L_0x00ac
        L_0x0130:
            r13 = 0
            goto L_0x00a0
        L_0x0133:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0l(r10)
            goto L_0x0068
        L_0x0139:
            java.util.regex.Matcher r1 = r7.matcher(r8)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            java.lang.String r0 = "\\N"
            java.lang.String r4 = "\n"
            java.lang.String r1 = r1.replace(r0, r4)
            java.lang.String r0 = "\\n"
            java.lang.String r4 = r1.replace(r0, r4)
            java.lang.String r1 = "\\h"
            java.lang.String r0 = " "
            java.lang.String r0 = r4.replace(r1, r0)
            float r1 = r5.A01
            float r10 = r5.A00
            android.text.SpannableString r14 = new android.text.SpannableString
            r14.<init>(r0)
            X.7ip r8 = new X.7ip
            r8.<init>()
            r8.A0E = r14
            r16 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r7 = 0
            if (r13 == 0) goto L_0x01aa
            java.lang.Integer r0 = r13.A02
            r9 = 33
            if (r0 == 0) goto L_0x0185
            int r0 = r0.intValue()
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            r4.<init>(r0)
            int r0 = r14.length()
            r14.setSpan(r4, r7, r0, r9)
        L_0x0185:
            float r4 = r13.A00
            r15 = 1
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0195
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0195
            float r4 = r4 / r10
            r8.A05 = r4
            r8.A09 = r15
        L_0x0195:
            boolean r4 = r13.A04
            boolean r0 = r13.A05
            if (r4 == 0) goto L_0x0239
            if (r0 == 0) goto L_0x019e
            r15 = 3
        L_0x019e:
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r15)
            int r0 = r14.length()
            r14.setSpan(r4, r7, r0, r9)
        L_0x01aa:
            r0 = -1
            if (r12 != r0) goto L_0x01b1
            if (r13 == 0) goto L_0x0236
            int r12 = r13.A01
        L_0x01b1:
            r0 = 0
            switch(r12) {
                case -1: goto L_0x01b7;
                case 0: goto L_0x01b5;
                case 1: goto L_0x0230;
                case 2: goto L_0x0233;
                case 3: goto L_0x01b5;
                case 4: goto L_0x0230;
                case 5: goto L_0x0233;
                case 6: goto L_0x01b5;
                case 7: goto L_0x0230;
                case 8: goto L_0x0233;
                default: goto L_0x01b5;
            }
        L_0x01b5:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x01b7:
            r8.A0D = r0
            switch(r12) {
                case -1: goto L_0x0229;
                case 0: goto L_0x01bc;
                case 1: goto L_0x022c;
                case 2: goto L_0x022e;
                case 3: goto L_0x01bc;
                case 4: goto L_0x022c;
                case 5: goto L_0x022e;
                case 6: goto L_0x01bc;
                case 7: goto L_0x022c;
                case 8: goto L_0x022e;
                default: goto L_0x01bc;
            }
        L_0x01bc:
            r9 = 2
        L_0x01bd:
            r8.A08 = r9
            switch(r12) {
                case -1: goto L_0x0222;
                case 0: goto L_0x01c2;
                case 1: goto L_0x0225;
                case 2: goto L_0x0225;
                case 3: goto L_0x0225;
                case 4: goto L_0x0227;
                case 5: goto L_0x0227;
                case 6: goto L_0x0227;
                default: goto L_0x01c2;
            }
        L_0x01c2:
            r4 = 0
        L_0x01c3:
            r8.A06 = r4
            if (r11 == 0) goto L_0x01f9
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x01f9
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x01f9
            float r0 = r11.x
            float r0 = r0 / r1
            r8.A02 = r0
            float r1 = r11.y
            float r1 = r1 / r10
        L_0x01d7:
            r8.A01 = r1
            r8.A07 = r7
            X.7hc r7 = r8.A00()
            r0 = r19
            int r4 = A00(r2, r3, r0)
            r0 = r17
            int r1 = A00(r2, r3, r0)
        L_0x01eb:
            if (r4 >= r1) goto L_0x001f
            java.lang.Object r0 = r3.get(r4)
            java.util.List r0 = (java.util.List) r0
            r0.add(r7)
            int r4 = r4 + 1
            goto L_0x01eb
        L_0x01f9:
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            if (r9 == 0) goto L_0x020c
            r0 = 1
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r9 == r0) goto L_0x020c
            r0 = 2
            r1 = 1064514355(0x3f733333, float:0.95)
            if (r9 == r0) goto L_0x020c
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x020c:
            r8.A02 = r1
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            if (r4 == 0) goto L_0x01d7
            r0 = 1
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r4 == r0) goto L_0x01d7
            r0 = 2
            r1 = 1064514355(0x3f733333, float:0.95)
            if (r4 == r0) goto L_0x01d7
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x01d7
        L_0x0222:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01c3
        L_0x0225:
            r4 = 2
            goto L_0x01c3
        L_0x0227:
            r4 = 1
            goto L_0x01c3
        L_0x0229:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01bd
        L_0x022c:
            r9 = 0
            goto L_0x01bd
        L_0x022e:
            r9 = 1
            goto L_0x01bd
        L_0x0230:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x01b7
        L_0x0233:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01b7
        L_0x0236:
            r12 = -1
            goto L_0x01b1
        L_0x0239:
            r15 = 2
            if (r0 != 0) goto L_0x019e
            goto L_0x01aa
        L_0x023e:
            X.7h5 r6 = r5.A03
            goto L_0x001f
        L_0x0242:
            X.88J r0 = new X.88J
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126716Pa.A04(byte[], int, boolean):X.8tW");
    }

    public C126716Pa() {
        this((List) null);
    }
}
