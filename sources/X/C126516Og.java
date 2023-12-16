package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.6Og  reason: invalid class name and case insensitive filesystem */
public abstract class C126516Og extends AnonymousClass86D implements C187598xV {
    public final String A00;

    public C126516Og(String str) {
        super(new C126476Oa[2], new C126506Oe[2]);
        this.A00 = str;
        int i = this.A00;
        C161487pm.A04(AnonymousClass000.A1U(i, r2));
        for (C126496Oc A01 : this.A0B) {
            A01.A01(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0344, code lost:
        r8.A08 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0346, code lost:
        switch(r15) {
            case -685620710: goto L_0x0386;
            case -685620679: goto L_0x038b;
            case -685620648: goto L_0x0381;
            case -685620524: goto L_0x0391;
            case -685620493: goto L_0x0396;
            case -685620462: goto L_0x037c;
            default: goto L_0x0349;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0349, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x034a, code lost:
        r8.A06 = r6;
        r1 = 0.08f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x034f, code lost:
        if (r7 == 0) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0351, code lost:
        r1 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0354, code lost:
        if (r7 == 1) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0356, code lost:
        r1 = 0.92f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0359, code lost:
        r8.A02 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x035b, code lost:
        if (r6 == 0) goto L_0x0378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x035d, code lost:
        r1 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0360, code lost:
        if (r6 == 1) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0362, code lost:
        r1 = 0.92f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0365, code lost:
        r8.A01 = r1;
        r8.A07 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0378, code lost:
        r1 = 0.08f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037c, code lost:
        r0 = r14.equals("{\\an9}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0381, code lost:
        r0 = r14.equals("{\\an3}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0386, code lost:
        r0 = r14.equals("{\\an1}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x038b, code lost:
        r0 = r14.equals("{\\an2}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x038f, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0391, code lost:
        r0 = r14.equals("{\\an7}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0396, code lost:
        r0 = r14.equals("{\\an8}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x039a, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x039b, code lost:
        if (r0 != false) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b6, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03bc, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03bd, code lost:
        if (r0 != false) goto L_0x0344;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C185358tW A04(byte[] r25, int r26, boolean r27) {
        /*
            r24 = this;
            r11 = r24
            boolean r0 = r11 instanceof X.AnonymousClass6PU
            r7 = r25
            r1 = r26
            if (r0 == 0) goto L_0x00af
            X.6PU r11 = (X.AnonymousClass6PU) r11
            X.7pi r6 = r11.A00
            r6.A0U(r7, r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
        L_0x0015:
            int r1 = X.C161467pi.A00(r6)
            if (r1 <= 0) goto L_0x00a9
            r0 = 8
            if (r1 < r0) goto L_0x00a1
            int r2 = r6.A07()
            int r1 = r6.A07()
            r0 = 1987343459(0x76747463, float:1.2395323E33)
            int r3 = r2 + -8
            if (r1 != r0) goto L_0x0094
            r9 = 0
            r10 = r9
            r8 = r9
        L_0x0031:
            if (r3 <= 0) goto L_0x0074
            r0 = 8
            if (r3 < r0) goto L_0x0099
            int r7 = r6.A07()
            int r4 = r6.A07()
            int r3 = r3 + -8
            int r7 = r7 - r0
            byte[] r2 = r6.A02
            int r1 = r6.A01
            java.nio.charset.Charset r0 = X.AnonymousClass79T.A05
            java.lang.String r1 = X.AnonymousClass6CA.A0W(r0, r2, r1, r7)
            r6.A0T(r7)
            int r3 = r3 - r7
            r0 = 1937011815(0x73747467, float:1.9367696E31)
            if (r4 != r0) goto L_0x0062
            X.7UZ r0 = new X.7UZ
            r0.<init>()
            X.C161857qf.A04(r0, r1)
            X.7ip r8 = r0.A00()
            goto L_0x0031
        L_0x0062:
            r0 = 1885436268(0x7061796c, float:2.7912367E29)
            if (r4 != r0) goto L_0x0031
            java.lang.String r1 = r1.trim()
            java.util.List r0 = java.util.Collections.emptyList()
            android.text.SpannedString r10 = X.C161857qf.A00(r9, r1, r0)
            goto L_0x0031
        L_0x0074:
            if (r10 != 0) goto L_0x0078
            java.lang.String r10 = ""
        L_0x0078:
            if (r8 == 0) goto L_0x0084
            r8.A0E = r10
            X.7hc r0 = r8.A00()
        L_0x0080:
            r5.add(r0)
            goto L_0x0015
        L_0x0084:
            X.7UZ r0 = new X.7UZ
            r0.<init>()
            r0.A0A = r10
            X.7ip r0 = r0.A00()
            X.7hc r0 = r0.A00()
            goto L_0x0080
        L_0x0094:
            r6.A0T(r3)
            goto L_0x0015
        L_0x0099:
            java.lang.String r1 = "Incomplete vtt cue box header found."
            X.6OY r0 = new X.6OY
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00a1:
            java.lang.String r1 = "Incomplete Mp4Webvtt Top Level box header found."
            X.6OY r0 = new X.6OY
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00a9:
            X.88I r0 = new X.88I
            r0.<init>(r5)
            return r0
        L_0x00af:
            boolean r0 = r11 instanceof X.AnonymousClass6PX
            if (r0 == 0) goto L_0x0248
            X.6PX r11 = (X.AnonymousClass6PX) r11
            X.7pi r10 = r11.A04
            r10.A0U(r7, r1)
            int r4 = r10.A00
            int r0 = r10.A01
            int r1 = r4 - r0
            r0 = 2
            if (r1 < r0) goto L_0x0240
            int r3 = r10.A0F()
            if (r3 != 0) goto L_0x00d4
            java.lang.String r1 = ""
        L_0x00cb:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00fb
            X.88N r1 = X.AnonymousClass88N.A01
            return r1
        L_0x00d4:
            int r2 = r10.A01
            int r4 = r4 - r2
            if (r4 < r0) goto L_0x00f8
            byte[] r0 = r10.A02
            int r0 = X.AnonymousClass6C8.A0F(r0, r2)
            char r1 = (char) r0
            r0 = 65279(0xfeff, float:9.1475E-41)
            if (r1 == r0) goto L_0x00ea
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r1 != r0) goto L_0x00f8
        L_0x00ea:
            java.nio.charset.Charset r1 = X.AnonymousClass79T.A02
        L_0x00ec:
            byte[] r0 = r10.A02
            java.lang.String r1 = X.AnonymousClass6CA.A0W(r1, r0, r2, r3)
            int r0 = r10.A01
            int r0 = r0 + r3
            r10.A01 = r0
            goto L_0x00cb
        L_0x00f8:
            java.nio.charset.Charset r1 = X.AnonymousClass79T.A05
            goto L_0x00ec
        L_0x00fb:
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r1)
            int r0 = r11.A03
            r20 = r0
            int r16 = r9.length()
            r17 = 16711680(0xff0000, float:2.3418052E-38)
            r14 = 0
            r3 = 0
            r15 = r14
            r12 = r9
            r13 = r0
            X.AnonymousClass6PX.A00(r12, r13, r14, r15, r16, r17)
            int r14 = r11.A02
            int r2 = r9.length()
            r0 = -1
            if (r14 == r0) goto L_0x012d
            r0 = r14 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 24
            int r0 = r14 >>> 8
            r0 = r0 | r1
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            r0 = 16711713(0xff0021, float:2.3418098E-38)
            r9.setSpan(r1, r3, r2, r0)
        L_0x012d:
            java.lang.String r3 = r11.A05
            int r2 = r9.length()
            r13 = 0
            java.lang.String r0 = "sans-serif"
            if (r3 == r0) goto L_0x0143
            android.text.style.TypefaceSpan r1 = new android.text.style.TypefaceSpan
            r1.<init>(r3)
            r0 = 16711713(0xff0021, float:2.3418098E-38)
            r9.setSpan(r1, r15, r2, r0)
        L_0x0143:
            float r12 = r11.A00
        L_0x0145:
            int r2 = r10.A00
            int r8 = r10.A01
            int r1 = r2 - r8
            r0 = 8
            if (r1 < r0) goto L_0x0229
            int r17 = r10.A07()
            int r1 = r10.A07()
            r0 = 1937013100(0x7374796c, float:1.936925E31)
            r7 = 2
            if (r1 != r0) goto L_0x01eb
            int r0 = r10.A01
            int r2 = r2 - r0
            if (r2 < r7) goto L_0x0219
            int r16 = r10.A0F()
            r6 = 0
        L_0x0167:
            r0 = r16
            if (r6 >= r0) goto L_0x020a
            int r2 = X.C161467pi.A00(r10)
            r1 = 12
            r0 = 1
            if (r2 < r1) goto L_0x0211
            int r5 = r10.A0F()
            int r4 = r10.A0F()
            int r19 = X.C161467pi.A02(r10, r7)
            r10.A0T(r0)
            int r3 = r10.A07()
            int r0 = r9.length()
            java.lang.String r2 = ")."
            java.lang.String r1 = "Tx3gDecoder"
            if (r4 <= r0) goto L_0x01b0
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r15 = "Truncating styl end ("
            r0.append(r15)
            r0.append(r4)
            java.lang.String r4 = ") to cueText.length() ("
            r0.append(r4)
            int r4 = r9.length()
            r0.append(r4)
            X.AnonymousClass000.A1F(r2, r1, r0)
            int r4 = r9.length()
        L_0x01b0:
            if (r5 < r4) goto L_0x01cc
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Ignoring styl with start ("
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = ") >= end ("
            r3.append(r0)
            r3.append(r4)
            X.AnonymousClass000.A1F(r2, r1, r3)
        L_0x01c9:
            int r6 = r6 + 1
            goto L_0x0167
        L_0x01cc:
            r18 = r9
            r21 = r5
            r22 = r4
            r23 = r13
            X.AnonymousClass6PX.A00(r18, r19, r20, r21, r22, r23)
            if (r3 == r14) goto L_0x01c9
            r0 = r3 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 24
            int r0 = r3 >>> 8
            r0 = r0 | r1
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            r0 = 33
            r9.setSpan(r1, r5, r4, r0)
            goto L_0x01c9
        L_0x01eb:
            r0 = 1952608120(0x74626f78, float:7.176025E31)
            if (r1 != r0) goto L_0x020a
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x020a
            int r0 = r10.A01
            int r2 = r2 - r0
            if (r2 < r7) goto L_0x0221
            int r0 = r10.A0F()
            float r2 = (float) r0
            int r0 = r11.A01
            float r0 = (float) r0
            float r2 = r2 / r0
            r1 = 0
            r0 = 1064514355(0x3f733333, float:0.95)
            float r12 = X.AnonymousClass001.A01(r2, r0, r1)
        L_0x020a:
            int r8 = r8 + r17
            r10.A0S(r8)
            goto L_0x0145
        L_0x0211:
            java.lang.String r1 = "Unexpected subtitle format."
            X.6OY r0 = new X.6OY
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0219:
            java.lang.String r1 = "Unexpected subtitle format."
            X.6OY r0 = new X.6OY
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0221:
            java.lang.String r1 = "Unexpected subtitle format."
            X.6OY r0 = new X.6OY
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0229:
            X.7ip r0 = new X.7ip
            r0.<init>()
            r0.A0E = r9
            r0.A01 = r12
            r0.A07 = r13
            r0.A06 = r13
            X.7hc r0 = r0.A00()
            X.88N r1 = new X.88N
            r1.<init>(r0)
            return r1
        L_0x0240:
            java.lang.String r1 = "Unexpected subtitle format."
            X.6OY r0 = new X.6OY
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0248:
            X.6PY r11 = (X.AnonymousClass6PY) r11
            java.lang.String r5 = "SubripDecoder"
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.7Vf r3 = new X.7Vf
            r3.<init>()
            X.7pi r2 = new X.7pi
            r2.<init>(r7, r1)
        L_0x025a:
            java.lang.String r7 = r2.A0M()
            r6 = 0
            if (r7 == 0) goto L_0x0280
            int r0 = r7.length()
            if (r0 == 0) goto L_0x025a
            java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x026b }
            goto L_0x0275
        L_0x026b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipping invalid index: "
            X.AnonymousClass6C7.A1F(r0, r7, r5, r1)
            goto L_0x025a
        L_0x0275:
            java.lang.String r8 = r2.A0M()
            if (r8 != 0) goto L_0x0296
            java.lang.String r0 = "Unexpected end"
            android.util.Log.w(r5, r0)
        L_0x0280:
            X.7hc[] r0 = new X.C157037hc[r6]
            java.lang.Object[] r2 = r4.toArray(r0)
            X.7hc[] r2 = (X.C157037hc[]) r2
            long[] r1 = r3.A01
            int r0 = r3.A00
            long[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.88K r0 = new X.88K
            r0.<init>(r1, r2)
            return r0
        L_0x0296:
            java.util.regex.Pattern r0 = X.AnonymousClass6PY.A03
            java.util.regex.Matcher r7 = r0.matcher(r8)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L_0x03c0
            r0 = 1
            long r0 = X.AnonymousClass6PY.A00(r7, r0)
            r3.A00(r0)
            r0 = 6
            long r0 = X.AnonymousClass6PY.A00(r7, r0)
            r3.A00(r0)
            java.lang.StringBuilder r13 = r11.A00
            r13.setLength(r6)
            java.util.ArrayList r8 = r11.A01
            r8.clear()
        L_0x02bc:
            java.lang.String r1 = r2.A0M()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0303
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x02d1
            java.lang.String r0 = "<br>"
            r13.append(r0)
        L_0x02d1:
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r12 = X.C18330xA.A0A(r1)
            java.util.regex.Pattern r0 = X.AnonymousClass6PY.A02
            java.util.regex.Matcher r14 = r0.matcher(r1)
            r10 = 0
        L_0x02e0:
            boolean r0 = r14.find()
            if (r0 == 0) goto L_0x02ff
            java.lang.String r0 = r14.group()
            r8.add(r0)
            int r9 = r14.start()
            int r9 = r9 - r10
            int r7 = r0.length()
            int r1 = r9 + r7
            java.lang.String r0 = ""
            r12.replace(r9, r1, r0)
            int r10 = r10 + r7
            goto L_0x02e0
        L_0x02ff:
            X.AnonymousClass000.A1B(r12, r13)
            goto L_0x02bc
        L_0x0303:
            java.lang.String r0 = r13.toString()
            android.text.Spanned r1 = android.text.Html.fromHtml(r0)
        L_0x030b:
            int r0 = r8.size()
            if (r6 >= r0) goto L_0x0322
            java.lang.Object r14 = r8.get(r6)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r0 = "\\{\\\\an[1-9]\\}"
            boolean r0 = r14.matches(r0)
            if (r0 != 0) goto L_0x0323
            int r6 = r6 + 1
            goto L_0x030b
        L_0x0322:
            r14 = 0
        L_0x0323:
            X.7ip r8 = new X.7ip
            r8.<init>()
            r8.A0E = r1
            if (r14 == 0) goto L_0x036a
            int r15 = r14.hashCode()
            java.lang.String r13 = "{\\an9}"
            java.lang.String r12 = "{\\an8}"
            java.lang.String r10 = "{\\an7}"
            java.lang.String r7 = "{\\an6}"
            java.lang.String r0 = "{\\an4}"
            java.lang.String r9 = "{\\an3}"
            java.lang.String r6 = "{\\an2}"
            java.lang.String r1 = "{\\an1}"
            switch(r15) {
                case -685620710: goto L_0x03a8;
                case -685620648: goto L_0x03ad;
                case -685620617: goto L_0x03b2;
                case -685620555: goto L_0x03b8;
                case -685620524: goto L_0x03a3;
                case -685620462: goto L_0x039e;
                default: goto L_0x0343;
            }
        L_0x0343:
            r7 = 1
        L_0x0344:
            r8.A08 = r7
            switch(r15) {
                case -685620710: goto L_0x0386;
                case -685620679: goto L_0x038b;
                case -685620648: goto L_0x0381;
                case -685620524: goto L_0x0391;
                case -685620493: goto L_0x0396;
                case -685620462: goto L_0x037c;
                default: goto L_0x0349;
            }
        L_0x0349:
            r6 = 1
        L_0x034a:
            r8.A06 = r6
            r1 = 1034147594(0x3da3d70a, float:0.08)
            if (r7 == 0) goto L_0x0359
            r0 = 1
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r7 == r0) goto L_0x0359
            r1 = 1064011039(0x3f6b851f, float:0.92)
        L_0x0359:
            r8.A02 = r1
            if (r6 == 0) goto L_0x0378
            r0 = 1
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r6 == r0) goto L_0x0365
            r1 = 1064011039(0x3f6b851f, float:0.92)
        L_0x0365:
            r0 = 0
            r8.A01 = r1
            r8.A07 = r0
        L_0x036a:
            X.7hc r0 = r8.A00()
            r4.add(r0)
            X.7hc r0 = X.C157037hc.A0G
            r4.add(r0)
            goto L_0x025a
        L_0x0378:
            r1 = 1034147594(0x3da3d70a, float:0.08)
            goto L_0x0365
        L_0x037c:
            boolean r0 = r14.equals(r13)
            goto L_0x039a
        L_0x0381:
            boolean r0 = r14.equals(r9)
            goto L_0x038f
        L_0x0386:
            boolean r0 = r14.equals(r1)
            goto L_0x038f
        L_0x038b:
            boolean r0 = r14.equals(r6)
        L_0x038f:
            r6 = 2
            goto L_0x039b
        L_0x0391:
            boolean r0 = r14.equals(r10)
            goto L_0x039a
        L_0x0396:
            boolean r0 = r14.equals(r12)
        L_0x039a:
            r6 = 0
        L_0x039b:
            if (r0 != 0) goto L_0x034a
            goto L_0x0349
        L_0x039e:
            boolean r0 = r14.equals(r13)
            goto L_0x03bc
        L_0x03a3:
            boolean r0 = r14.equals(r10)
            goto L_0x03b6
        L_0x03a8:
            boolean r0 = r14.equals(r1)
            goto L_0x03b6
        L_0x03ad:
            boolean r0 = r14.equals(r9)
            goto L_0x03bc
        L_0x03b2:
            boolean r0 = r14.equals(r0)
        L_0x03b6:
            r7 = 0
            goto L_0x03bd
        L_0x03b8:
            boolean r0 = r14.equals(r7)
        L_0x03bc:
            r7 = 2
        L_0x03bd:
            if (r0 != 0) goto L_0x0344
            goto L_0x0343
        L_0x03c0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipping invalid timing: "
            X.AnonymousClass6C7.A1F(r0, r8, r5, r1)
            goto L_0x025a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126516Og.A04(byte[], int, boolean):X.8tW");
    }

    public void Bn1(long j) {
    }

    public final String getName() {
        return this.A00;
    }
}
