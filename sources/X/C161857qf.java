package X;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7qf  reason: invalid class name and case insensitive filesystem */
public final class C161857qf {
    public static final Map A00;
    public static final Map A01;
    public static final Pattern A02 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A03 = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r1.equals(r0) != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f4, code lost:
        switch(r0) {
            case 1: goto L_0x0176;
            case 2: goto L_0x0183;
            case 3: goto L_0x017c;
            default: goto L_0x00f7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        r0 = new android.text.style.UnderlineSpan();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fc, code lost:
        r14.setSpan(r0, r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ff, code lost:
        r7 = A02(r8, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0107, code lost:
        if (r3 >= r7.size()) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0109, code lost:
        r8 = ((X.AnonymousClass8LT) r7.get(r3)).A01;
        r10 = r8.A01;
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0114, code lost:
        if (r10 != -1) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0118, code lost:
        if (r8.A03 != -1) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        if (r1 == -1) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011f, code lost:
        X.C1001259n.A00(r9, new android.text.style.StyleSpan(r1), r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0129, code lost:
        if (r8.A05 != 1) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012b, code lost:
        r9.setSpan(new android.text.style.UnderlineSpan(), r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0135, code lost:
        if (r8.A0D == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0137, code lost:
        X.C1001259n.A00(r9, new android.text.style.ForegroundColorSpan(r8.A02), r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0143, code lost:
        if (r8.A0C == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0145, code lost:
        X.C1001259n.A00(r9, new android.text.style.BackgroundColorSpan(r8.A00), r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014f, code lost:
        r1 = r8.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0151, code lost:
        if (r1 == null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0153, code lost:
        X.C1001259n.A00(r9, new android.text.style.TypefaceSpan(r1), r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015d, code lost:
        if (r8.A0B == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015f, code lost:
        r9.setSpan(new X.AnonymousClass72D(), r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0167, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016a, code lost:
        r6 = 0;
        r1 = X.AnonymousClass000.A1U(r10, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0171, code lost:
        if (r8.A03 != 1) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0173, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0174, code lost:
        r1 = r1 | r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0176, code lost:
        r0 = new android.text.style.StyleSpan(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x017c, code lost:
        r0 = new android.text.style.StyleSpan(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0183, code lost:
        r12 = r15.A03.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018d, code lost:
        if (r12.hasNext() == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018f, code lost:
        r11 = r12.next();
        r1 = A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019b, code lost:
        if (r1.containsKey(r11) == false) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019d, code lost:
        r1 = new android.text.style.ForegroundColorSpan(X.AnonymousClass001.A0K(r1.get(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01aa, code lost:
        r14.setSpan(r1, r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ae, code lost:
        r1 = A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b4, code lost:
        if (r1.containsKey(r11) == false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b6, code lost:
        r1 = new android.text.style.BackgroundColorSpan(X.AnonymousClass001.A0K(r1.get(r11)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.text.SpannableStringBuilder r14, X.AnonymousClass7MB r15, java.lang.String r16, java.util.List r17, java.util.List r18) {
        /*
            r8 = r15
            int r5 = r15.A00
            r9 = r14
            int r4 = r14.length()
            java.lang.String r1 = r15.A01
            int r0 = r1.hashCode()
            r10 = 2
            r3 = 0
            r2 = 1
            r7 = r16
            r6 = r18
            switch(r0) {
                case 0: goto L_0x0024;
                case 98: goto L_0x0019;
                case 99: goto L_0x0027;
                case 105: goto L_0x0030;
                case 117: goto L_0x00e9;
                case 118: goto L_0x003b;
                case 3314158: goto L_0x003e;
                case 3511770: goto L_0x0047;
                default: goto L_0x0018;
            }
        L_0x0018:
            return
        L_0x0019:
            java.lang.String r0 = "b"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 1
            goto L_0x00f2
        L_0x0024:
            java.lang.String r0 = ""
            goto L_0x0040
        L_0x0027:
            java.lang.String r0 = "c"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0183
            return
        L_0x0030:
            java.lang.String r0 = "i"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 3
            goto L_0x00f2
        L_0x003b:
            java.lang.String r0 = "v"
            goto L_0x0040
        L_0x003e:
            java.lang.String r0 = "lang"
        L_0x0040:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ff
            return
        L_0x0047:
            java.lang.String r0 = "ruby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.util.List r11 = A02(r15, r7, r6)
            r10 = 0
        L_0x0054:
            int r0 = r11.size()
            r1 = -1
            if (r10 >= r0) goto L_0x006a
            java.lang.Object r0 = r11.get(r10)
            X.8LT r0 = (X.AnonymousClass8LT) r0
            X.7QE r0 = r0.A01
            int r13 = r0.A04
            if (r13 != r1) goto L_0x006b
            int r10 = r10 + 1
            goto L_0x0054
        L_0x006a:
            r13 = -1
        L_0x006b:
            r0 = r17
            java.util.ArrayList r12 = X.AnonymousClass000.A0p(r0)
            r12.addAll(r0)
            java.util.Comparator r0 = X.C156217gF.A02
            java.util.Collections.sort(r12, r0)
            r18 = r5
            r11 = 0
            r17 = 0
        L_0x007e:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x00ff
            java.lang.Object r0 = r12.get(r11)
            X.7gF r0 = (X.C156217gF) r0
            X.7MB r0 = r0.A01
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "rt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r15 = r12.get(r11)
            X.7gF r15 = (X.C156217gF) r15
            X.7MB r14 = r15.A01
            java.util.List r16 = A02(r14, r7, r6)
            r10 = 0
        L_0x00a3:
            int r0 = r16.size()
            r1 = -1
            if (r10 >= r0) goto L_0x00bb
            r0 = r16
            java.lang.Object r0 = r0.get(r10)
            X.8LT r0 = (X.AnonymousClass8LT) r0
            X.7QE r0 = r0.A01
            int r0 = r0.A04
            if (r0 != r1) goto L_0x00bf
            int r10 = r10 + 1
            goto L_0x00a3
        L_0x00bb:
            r0 = 1
            if (r13 == r1) goto L_0x00bf
            r0 = r13
        L_0x00bf:
            int r1 = r14.A00
            int r1 = r1 - r17
            int r10 = r15.A00
            int r10 = r10 - r17
            java.lang.CharSequence r15 = r9.subSequence(r1, r10)
            r9.delete(r1, r10)
            java.lang.String r10 = r15.toString()
            X.7G8 r14 = new X.7G8
            r14.<init>(r10, r0)
            r10 = 33
            r0 = r18
            r9.setSpan(r14, r0, r1, r10)
            int r0 = r15.length()
            int r17 = r17 + r0
            r18 = r1
        L_0x00e6:
            int r11 = r11 + 1
            goto L_0x007e
        L_0x00e9:
            java.lang.String r0 = "u"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 4
        L_0x00f2:
            r1 = 33
            switch(r0) {
                case 1: goto L_0x0176;
                case 2: goto L_0x0183;
                case 3: goto L_0x017c;
                default: goto L_0x00f7;
            }
        L_0x00f7:
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L_0x00fc:
            r14.setSpan(r0, r5, r4, r1)
        L_0x00ff:
            java.util.List r7 = A02(r8, r7, r6)
        L_0x0103:
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x0018
            java.lang.Object r0 = r7.get(r3)
            X.8LT r0 = (X.AnonymousClass8LT) r0
            X.7QE r8 = r0.A01
            int r10 = r8.A01
            r1 = -1
            if (r10 != r1) goto L_0x016a
            int r0 = r8.A03
            if (r0 != r1) goto L_0x016a
        L_0x011a:
            r0 = -1
            r6 = 33
            if (r1 == r0) goto L_0x0127
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            X.C1001259n.A00(r9, r0, r5, r4)
        L_0x0127:
            int r0 = r8.A05
            if (r0 != r2) goto L_0x0133
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r9.setSpan(r0, r5, r4, r6)
        L_0x0133:
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x0141
            int r1 = r8.A02
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            X.C1001259n.A00(r9, r0, r5, r4)
        L_0x0141:
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x014f
            int r1 = r8.A00
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            X.C1001259n.A00(r9, r0, r5, r4)
        L_0x014f:
            java.lang.String r1 = r8.A06
            if (r1 == 0) goto L_0x015b
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r1)
            X.C1001259n.A00(r9, r0, r5, r4)
        L_0x015b:
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0167
            X.72D r0 = new X.72D
            r0.<init>()
            r9.setSpan(r0, r5, r4, r6)
        L_0x0167:
            int r3 = r3 + 1
            goto L_0x0103
        L_0x016a:
            r6 = 0
            boolean r1 = X.AnonymousClass000.A1U(r10, r2)
            int r0 = r8.A03
            if (r0 != r2) goto L_0x0174
            r6 = 2
        L_0x0174:
            r1 = r1 | r6
            goto L_0x011a
        L_0x0176:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            goto L_0x00fc
        L_0x017c:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r10)
            goto L_0x00fc
        L_0x0183:
            java.util.Set r0 = r15.A03
            java.util.Iterator r12 = r0.iterator()
        L_0x0189:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r11 = r12.next()
            java.util.Map r1 = A01
            boolean r0 = r1.containsKey(r11)
            r10 = 33
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r0 = r1.get(r11)
            int r0 = X.AnonymousClass001.A0K(r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
        L_0x01aa:
            r14.setSpan(r1, r5, r4, r10)
            goto L_0x0189
        L_0x01ae:
            java.util.Map r1 = A00
            boolean r0 = r1.containsKey(r11)
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r1.get(r11)
            int r0 = X.AnonymousClass001.A0K(r0)
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            r1.<init>(r0)
            goto L_0x01aa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161857qf.A03(android.text.SpannableStringBuilder, X.7MB, java.lang.String, java.util.List, java.util.List):void");
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        A0t.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        A0t.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        A0t.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        A0t.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        A0t.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        A0t.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        A0t.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        A01 = Collections.unmodifiableMap(A0t);
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        A0t2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        A0t2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        A0t2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        A0t2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        A0t2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        A0t2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        A0t2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        A00 = Collections.unmodifiableMap(A0t2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013b, code lost:
        r7 = X.AnonymousClass001.A0o();
        r7.append("ignoring unsupported entity: '&");
        r7.append(r6);
        android.util.Log.w("WebvttCueParser", X.AnonymousClass000.A0X(";'", r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0152, code lost:
        if (r5 != r3) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0154, code lost:
        r4.append(" ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0159, code lost:
        r6 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0188, code lost:
        r4.append(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannedString A00(java.lang.String r12, java.lang.String r13, java.util.List r14) {
        /*
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.util.ArrayDeque r2 = X.AnonymousClass6CA.A0a()
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            r6 = 0
        L_0x000e:
            int r5 = r13.length()
            if (r6 >= r5) goto L_0x0198
            char r7 = r13.charAt(r6)
            r0 = 38
            if (r7 == r0) goto L_0x011c
            r0 = 60
            if (r7 == r0) goto L_0x0026
            r4.append(r7)
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0026:
            int r9 = r6 + 1
            if (r9 >= r5) goto L_0x007f
            char r0 = r13.charAt(r9)
            r7 = 47
            r11 = 1
            boolean r10 = X.AnonymousClass000.A1U(r0, r7)
            r0 = 62
            int r3 = r13.indexOf(r0, r9)
            r0 = -1
            if (r3 == r0) goto L_0x0040
            int r5 = r3 + 1
        L_0x0040:
            r9 = r5
            int r3 = r5 + -2
            char r0 = r13.charAt(r3)
            boolean r8 = X.AnonymousClass000.A1U(r0, r7)
            if (r10 == 0) goto L_0x004e
            r11 = 2
        L_0x004e:
            int r6 = r6 + r11
            if (r8 != 0) goto L_0x0053
            int r3 = r5 + -1
        L_0x0053:
            java.lang.String r7 = r13.substring(r6, r3)
            java.lang.String r0 = r7.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007f
            java.lang.String r5 = r7.trim()
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            X.C161487pm.A03(r0)
            java.lang.String r3 = "[ \\.]"
            r0 = 2
            java.lang.String[] r3 = r5.split(r3, r0)
            r0 = 0
            r6 = r3[r0]
            int r0 = r6.hashCode()
            switch(r0) {
                case 98: goto L_0x0096;
                case 99: goto L_0x0093;
                case 105: goto L_0x0090;
                case 117: goto L_0x008d;
                case 118: goto L_0x008a;
                case 3650: goto L_0x0087;
                case 3314158: goto L_0x0084;
                case 3511770: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            r6 = r9
            goto L_0x000e
        L_0x0081:
            java.lang.String r0 = "ruby"
            goto L_0x0098
        L_0x0084:
            java.lang.String r0 = "lang"
            goto L_0x0098
        L_0x0087:
            java.lang.String r0 = "rt"
            goto L_0x0098
        L_0x008a:
            java.lang.String r0 = "v"
            goto L_0x0098
        L_0x008d:
            java.lang.String r0 = "u"
            goto L_0x0098
        L_0x0090:
            java.lang.String r0 = "i"
            goto L_0x0098
        L_0x0093:
            java.lang.String r0 = "c"
            goto L_0x0098
        L_0x0096:
            java.lang.String r0 = "b"
        L_0x0098:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x007f
            if (r10 != 0) goto L_0x00ed
            if (r8 != 0) goto L_0x007f
            int r8 = r4.length()
            java.lang.String r6 = r7.trim()
            boolean r0 = r6.isEmpty()
            r10 = 1
            r0 = r0 ^ 1
            X.C161487pm.A03(r0)
            java.lang.String r0 = " "
            int r5 = r6.indexOf(r0)
            r0 = -1
            r3 = 0
            if (r5 != r0) goto L_0x00d7
            java.lang.String r7 = ""
        L_0x00c0:
            java.lang.String r0 = "\\."
            java.lang.String[] r6 = X.AnonymousClass6CA.A0j(r6, r0)
            r5 = r6[r3]
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
        L_0x00cc:
            int r0 = r6.length
            if (r10 >= r0) goto L_0x00e4
            r0 = r6[r10]
            r3.add(r0)
            int r10 = r10 + 1
            goto L_0x00cc
        L_0x00d7:
            java.lang.String r0 = r6.substring(r5)
            java.lang.String r7 = r0.trim()
            java.lang.String r6 = r6.substring(r3, r5)
            goto L_0x00c0
        L_0x00e4:
            X.7MB r0 = new X.7MB
            r0.<init>(r5, r7, r3, r8)
            r2.push(r0)
            goto L_0x007f
        L_0x00ed:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x007f
            java.lang.Object r5 = r2.pop()
            X.7MB r5 = (X.AnonymousClass7MB) r5
            A03(r4, r5, r12, r1, r14)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0118
            int r3 = r4.length()
            X.7gF r0 = new X.7gF
            r0.<init>(r5, r3)
            r1.add(r0)
        L_0x010e:
            java.lang.String r0 = r5.A01
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00ed
            goto L_0x007f
        L_0x0118:
            r1.clear()
            goto L_0x010e
        L_0x011c:
            int r6 = r6 + 1
            r0 = 59
            int r5 = r13.indexOf(r0, r6)
            r0 = 32
            int r3 = r13.indexOf(r0, r6)
            r0 = -1
            if (r5 != r0) goto L_0x018c
            r5 = r3
        L_0x012e:
            if (r5 == r0) goto L_0x0193
            java.lang.String r6 = r13.substring(r6, r5)
            int r0 = r6.hashCode()
            switch(r0) {
                case 3309: goto L_0x017e;
                case 3464: goto L_0x0173;
                case 96708: goto L_0x0168;
                case 3374865: goto L_0x015d;
                default: goto L_0x013b;
            }
        L_0x013b:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ignoring unsupported entity: '&"
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = ";'"
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r7)
            java.lang.String r0 = "WebvttCueParser"
            android.util.Log.w(r0, r6)
        L_0x0152:
            if (r5 != r3) goto L_0x0159
            java.lang.String r0 = " "
            r4.append(r0)
        L_0x0159:
            int r6 = r5 + 1
            goto L_0x000e
        L_0x015d:
            java.lang.String r0 = "nbsp"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013b
            r0 = 32
            goto L_0x0188
        L_0x0168:
            java.lang.String r0 = "amp"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013b
            r0 = 38
            goto L_0x0188
        L_0x0173:
            java.lang.String r0 = "lt"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013b
            r0 = 60
            goto L_0x0188
        L_0x017e:
            java.lang.String r0 = "gt"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013b
            r0 = 62
        L_0x0188:
            r4.append(r0)
            goto L_0x0152
        L_0x018c:
            if (r3 == r0) goto L_0x012e
            int r5 = java.lang.Math.min(r5, r3)
            goto L_0x012e
        L_0x0193:
            r4.append(r7)
            goto L_0x000e
        L_0x0198:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01a8
            java.lang.Object r0 = r2.pop()
            X.7MB r0 = (X.AnonymousClass7MB) r0
            A03(r4, r0, r12, r1, r14)
            goto L_0x0198
        L_0x01a8:
            r3 = 0
            java.util.Set r2 = java.util.Collections.emptySet()
            java.lang.String r0 = ""
            X.7MB r1 = new X.7MB
            r1.<init>(r0, r0, r2, r3)
            java.util.List r0 = java.util.Collections.emptyList()
            A03(r4, r1, r12, r0, r14)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161857qf.A00(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static C148687Ji A01(C161467pi r5, String str, List list, Matcher matcher) {
        AnonymousClass7UZ r3 = new AnonymousClass7UZ();
        try {
            r3.A09 = C159617mB.A01(AnonymousClass6C8.A0f(matcher, 1));
            r3.A08 = C159617mB.A01(AnonymousClass6C8.A0f(matcher, 2));
            A04(r3, AnonymousClass6C8.A0f(matcher, 3));
            StringBuilder A0o = AnonymousClass001.A0o();
            while (true) {
                String A0M = r5.A0M();
                if (!TextUtils.isEmpty(A0M)) {
                    if (A0o.length() > 0) {
                        A0o.append("\n");
                    }
                    A0o.append(A0M.trim());
                } else {
                    r3.A0A = A00(str, A0o.toString(), list);
                    return new C148687Ji(r3.A00().A00(), r3.A09, r3.A08);
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Skipping cue with bad header: ");
            Log.w("WebvttCueParser", AnonymousClass000.A0X(matcher.group(), A0o2));
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r7.equals(r0) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        r8.A03 = r0;
        r4 = r4.substring(0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        X.AnonymousClass6C7.A1F("Invalid alignment value: ", r4, "WebvttCueParser", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        if (r4.equals(r0) != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        r8.A06 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0110, code lost:
        if (r5.equals(r0) == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0119, code lost:
        if (r5.equals(r0) == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0122, code lost:
        if (r5.equals(r0) == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0128, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012a, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012c, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x012d, code lost:
        r8.A05 = r0;
        r4 = X.AnonymousClass0x7.A0r(r4, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass7UZ r8, java.lang.String r9) {
        /*
            java.lang.String r2 = "WebvttCueParser"
            java.util.regex.Pattern r0 = A03
            java.util.regex.Matcher r3 = r0.matcher(r9)
        L_0x0008:
            boolean r0 = r3.find()
            if (r0 == 0) goto L_0x019b
            r0 = 1
            java.lang.String r5 = X.AnonymousClass6C8.A0f(r3, r0)
            r0 = 2
            java.lang.String r4 = X.AnonymousClass6C8.A0f(r3, r0)
            java.lang.String r0 = "line"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x0085
            r0 = 44
            int r6 = r4.indexOf(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            r0 = -1
            r5 = 0
            if (r6 == r0) goto L_0x006b
            java.lang.String r7 = X.AnonymousClass6C9.A0c(r6, r4)     // Catch:{ NumberFormatException -> 0x0189 }
            int r0 = r7.hashCode()     // Catch:{ NumberFormatException -> 0x0189 }
            switch(r0) {
                case -1364013995: goto L_0x0054;
                case -1074341483: goto L_0x0051;
                case 100571: goto L_0x0048;
                case 109757538: goto L_0x003f;
                default: goto L_0x0035;
            }     // Catch:{ NumberFormatException -> 0x0189 }
        L_0x0035:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0189 }
            java.lang.String r0 = "Invalid anchor value: "
            X.AnonymousClass6C7.A1F(r0, r7, r2, r1)     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x005d
        L_0x003f:
            java.lang.String r0 = "start"
            boolean r0 = r7.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x0035
            goto L_0x0060
        L_0x0048:
            java.lang.String r0 = "end"
            boolean r0 = r7.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x0035
            goto L_0x0062
        L_0x0051:
            java.lang.String r0 = "middle"
            goto L_0x0056
        L_0x0054:
            java.lang.String r0 = "center"
        L_0x0056:
            boolean r0 = r7.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x0035
            goto L_0x0064
        L_0x005d:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0065
        L_0x0060:
            r0 = 0
            goto L_0x0065
        L_0x0062:
            r0 = 2
            goto L_0x0065
        L_0x0064:
            r0 = 1
        L_0x0065:
            r8.A03 = r0     // Catch:{ NumberFormatException -> 0x0189 }
            java.lang.String r4 = r4.substring(r5, r6)     // Catch:{ NumberFormatException -> 0x0189 }
        L_0x006b:
            boolean r0 = X.AnonymousClass6C9.A1P(r4)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x007a
            float r0 = X.C159617mB.A00(r4)     // Catch:{ NumberFormatException -> 0x0189 }
            r8.A00 = r0     // Catch:{ NumberFormatException -> 0x0189 }
            r8.A04 = r5     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x0008
        L_0x007a:
            int r0 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0189 }
            float r0 = (float) r0     // Catch:{ NumberFormatException -> 0x0189 }
            r8.A00 = r0     // Catch:{ NumberFormatException -> 0x0189 }
            r0 = 1
            r8.A04 = r0     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x0008
        L_0x0085:
            java.lang.String r0 = "align"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x00db
            int r0 = r4.hashCode()     // Catch:{ NumberFormatException -> 0x0189 }
            switch(r0) {
                case -1364013995: goto L_0x009e;
                case -1074341483: goto L_0x00a1;
                case 100571: goto L_0x00aa;
                case 3317767: goto L_0x00b3;
                case 108511772: goto L_0x00bc;
                case 109757538: goto L_0x00c5;
                default: goto L_0x0094;
            }     // Catch:{ NumberFormatException -> 0x0189 }
        L_0x0094:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0189 }
            java.lang.String r0 = "Invalid alignment value: "
            X.AnonymousClass6C7.A1F(r0, r4, r2, r1)     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x00ce
        L_0x009e:
            java.lang.String r0 = "center"
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r0 = "middle"
        L_0x00a3:
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 != 0) goto L_0x00ce
            goto L_0x0094
        L_0x00aa:
            java.lang.String r0 = "end"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x0094
            goto L_0x00d0
        L_0x00b3:
            java.lang.String r0 = "left"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x0094
            goto L_0x00d2
        L_0x00bc:
            java.lang.String r0 = "right"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x0094
            goto L_0x00d4
        L_0x00c5:
            java.lang.String r0 = "start"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x0094
            goto L_0x00d6
        L_0x00ce:
            r0 = 2
            goto L_0x00d7
        L_0x00d0:
            r0 = 3
            goto L_0x00d7
        L_0x00d2:
            r0 = 4
            goto L_0x00d7
        L_0x00d4:
            r0 = 5
            goto L_0x00d7
        L_0x00d6:
            r0 = 1
        L_0x00d7:
            r8.A06 = r0     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x0008
        L_0x00db:
            java.lang.String r0 = "position"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x013b
            r0 = 44
            int r6 = r4.indexOf(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            r0 = -1
            if (r6 == r0) goto L_0x0133
            java.lang.String r5 = X.AnonymousClass6C9.A0c(r6, r4)     // Catch:{ NumberFormatException -> 0x0189 }
            int r0 = r5.hashCode()     // Catch:{ NumberFormatException -> 0x0189 }
            switch(r0) {
                case -1842484672: goto L_0x011c;
                case -1364013995: goto L_0x0113;
                case -1276788989: goto L_0x010a;
                case -1074341483: goto L_0x0107;
                case 100571: goto L_0x0104;
                case 109757538: goto L_0x0101;
                default: goto L_0x00f7;
            }     // Catch:{ NumberFormatException -> 0x0189 }
        L_0x00f7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0189 }
            java.lang.String r0 = "Invalid anchor value: "
            X.AnonymousClass6C7.A1F(r0, r5, r2, r1)     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x0125
        L_0x0101:
            java.lang.String r0 = "start"
            goto L_0x011e
        L_0x0104:
            java.lang.String r0 = "end"
            goto L_0x010c
        L_0x0107:
            java.lang.String r0 = "middle"
            goto L_0x0115
        L_0x010a:
            java.lang.String r0 = "line-right"
        L_0x010c:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x00f7
            goto L_0x0128
        L_0x0113:
            java.lang.String r0 = "center"
        L_0x0115:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x00f7
            goto L_0x012a
        L_0x011c:
            java.lang.String r0 = "line-left"
        L_0x011e:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x00f7
            goto L_0x012c
        L_0x0125:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x012d
        L_0x0128:
            r0 = 2
            goto L_0x012d
        L_0x012a:
            r0 = 1
            goto L_0x012d
        L_0x012c:
            r0 = 0
        L_0x012d:
            r8.A05 = r0     // Catch:{ NumberFormatException -> 0x0189 }
            java.lang.String r4 = X.AnonymousClass0x7.A0r(r4, r6)     // Catch:{ NumberFormatException -> 0x0189 }
        L_0x0133:
            float r0 = X.C159617mB.A00(r4)     // Catch:{ NumberFormatException -> 0x0189 }
            r8.A01 = r0     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x0008
        L_0x013b:
            java.lang.String r0 = "size"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x014b
            float r0 = X.C159617mB.A00(r4)     // Catch:{ NumberFormatException -> 0x0189 }
            r8.A02 = r0     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x0008
        L_0x014b:
            java.lang.String r0 = "vertical"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = "lr"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 != 0) goto L_0x0171
            java.lang.String r0 = "rl"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            if (r0 != 0) goto L_0x016f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0189 }
            java.lang.String r0 = "Invalid 'vertical' value: "
            X.AnonymousClass6C7.A1F(r0, r4, r2, r1)     // Catch:{ NumberFormatException -> 0x0189 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0172
        L_0x016f:
            r0 = 1
            goto L_0x0172
        L_0x0171:
            r0 = 2
        L_0x0172:
            r8.A07 = r0     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x0008
        L_0x0176:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0189 }
            java.lang.String r0 = "Unknown cue setting "
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0189 }
            r1.append(r5)     // Catch:{ NumberFormatException -> 0x0189 }
            java.lang.String r0 = ":"
            X.AnonymousClass6C7.A1F(r0, r4, r2, r1)     // Catch:{ NumberFormatException -> 0x0189 }
            goto L_0x0008
        L_0x0189:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipping bad cue setting: "
            r1.append(r0)
            java.lang.String r0 = r3.group()
            X.AnonymousClass000.A1F(r0, r2, r1)
            goto L_0x0008
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161857qf.A04(X.7UZ, java.lang.String):void");
    }

    public static List A02(AnonymousClass7MB r10, String str, List list) {
        int size;
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass7QE r2 = (AnonymousClass7QE) list.get(i);
            String str2 = r10.A01;
            Set set = r10.A03;
            String str3 = r10.A02;
            if (!r2.A07.isEmpty() || !r2.A08.isEmpty() || !r2.A0A.isEmpty() || !r2.A09.isEmpty()) {
                String str4 = r2.A07;
                int i2 = 0;
                if (!str4.isEmpty()) {
                    i2 = -1;
                    if (str4.equals(str)) {
                        i2 = 1073741824;
                    }
                }
                String str5 = r2.A08;
                if (!str5.isEmpty()) {
                    int i3 = -1;
                    if (i2 != -1) {
                        if (str5.equals(str2)) {
                            i3 = i2 + 2;
                        }
                        i2 = i3;
                    }
                }
                String str6 = r2.A09;
                if (!str6.isEmpty()) {
                    if (i2 != -1 && str6.equals(str3)) {
                        i2 += 4;
                    }
                }
                if (i2 != -1 && set.containsAll(r2.A0A)) {
                    size = i2 + (r2.A0A.size() * 4);
                }
            } else {
                size = TextUtils.isEmpty(str2);
            }
            if (size > 0) {
                A0s.add(new AnonymousClass8LT(r2, size));
            }
        }
        Collections.sort(A0s);
        return A0s;
    }
}
