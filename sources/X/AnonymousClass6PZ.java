package X;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.6PZ  reason: invalid class name */
public final class AnonymousClass6PZ extends C126516Og {
    public static final AnonymousClass7BJ A01 = new AnonymousClass7BJ(15);
    public static final C148677Jh A02 = new C148677Jh(1, 1, 30.0f);
    public static final Pattern A03 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final Pattern A04 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern A05 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern A06 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern A07 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern A08 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern A09 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public final XmlPullParserFactory A00;

    public AnonymousClass6PZ() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.A00 = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw AnonymousClass6CA.A0Q("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        r1 = r1 * r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        r1 = r1 / r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A00(X.C148677Jh r12, java.lang.String r13) {
        /*
            java.util.regex.Pattern r0 = A04
            java.util.regex.Matcher r4 = r0.matcher(r13)
            boolean r0 = r4.matches()
            r10 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r7 = 4
            r8 = 3
            r9 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = X.AnonymousClass6C8.A0f(r4, r1)
            long r0 = java.lang.Long.parseLong(r0)
            r2 = 3600(0xe10, double:1.7786E-320)
            long r0 = r0 * r2
            double r5 = (double) r0
            java.lang.String r0 = X.AnonymousClass6C8.A0f(r4, r9)
            long r2 = java.lang.Long.parseLong(r0)
            r0 = 60
            long r2 = r2 * r0
            double r0 = (double) r2
            double r5 = r5 + r0
            java.lang.String r0 = X.AnonymousClass6C8.A0f(r4, r8)
            long r2 = java.lang.Long.parseLong(r0)
            double r0 = (double) r2
            double r5 = r5 + r0
            java.lang.String r0 = r4.group(r7)
            r2 = 0
            if (r0 == 0) goto L_0x0071
            double r0 = java.lang.Double.parseDouble(r0)
        L_0x0044:
            double r5 = r5 + r0
            r0 = 5
            java.lang.String r0 = r4.group(r0)
            if (r0 == 0) goto L_0x006e
            long r7 = java.lang.Long.parseLong(r0)
            float r1 = (float) r7
            float r0 = r12.A00
            float r1 = r1 / r0
            double r0 = (double) r1
        L_0x0055:
            double r5 = r5 + r0
            r0 = 6
            java.lang.String r0 = r4.group(r0)
            if (r0 == 0) goto L_0x006a
            long r0 = java.lang.Long.parseLong(r0)
            double r2 = (double) r0
            int r0 = r12.A01
            double r0 = (double) r0
            double r2 = r2 / r0
            float r0 = r12.A00
            double r0 = (double) r0
            double r2 = r2 / r0
        L_0x006a:
            double r5 = r5 + r2
            double r5 = r5 * r10
            long r3 = (long) r5
            return r3
        L_0x006e:
            r0 = 0
            goto L_0x0055
        L_0x0071:
            r0 = 0
            goto L_0x0044
        L_0x0074:
            java.util.regex.Pattern r0 = A06
            java.util.regex.Matcher r3 = r0.matcher(r13)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = X.AnonymousClass6C8.A0f(r3, r1)
            double r1 = java.lang.Double.parseDouble(r0)
            java.lang.String r3 = X.AnonymousClass6C8.A0f(r3, r9)
            int r0 = r3.hashCode()
            switch(r0) {
                case 102: goto L_0x0096;
                case 104: goto L_0x00a2;
                case 109: goto L_0x00b0;
                case 116: goto L_0x00bc;
                case 3494: goto L_0x00c8;
                default: goto L_0x0093;
            }
        L_0x0093:
            double r1 = r1 * r10
            long r3 = (long) r1
            return r3
        L_0x0096:
            java.lang.String r0 = "f"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            float r0 = r12.A00
            double r3 = (double) r0
            goto L_0x00d5
        L_0x00a2:
            java.lang.String r0 = "h"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r3 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            goto L_0x00ba
        L_0x00b0:
            java.lang.String r0 = "m"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r3 = 4633641066610819072(0x404e000000000000, double:60.0)
        L_0x00ba:
            double r1 = r1 * r3
            goto L_0x0093
        L_0x00bc:
            java.lang.String r0 = "t"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            int r0 = r12.A02
            double r3 = (double) r0
            goto L_0x00d5
        L_0x00c8:
            java.lang.String r0 = "ms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00d5:
            double r1 = r1 / r3
            goto L_0x0093
        L_0x00d7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r13, r1)
            X.6OY r0 = new X.6OY
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PZ.A00(X.7Jh, java.lang.String):long");
    }

    public static C151287Ud A01(C151287Ud r0) {
        if (r0 == null) {
            return new C151287Ud();
        }
        return r0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02d2, code lost:
        if (r2 != r8) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0458, code lost:
        r2 = r12.equals(r2);
        r34 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0467, code lost:
        if (r2 != false) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x057e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        android.util.Log.w("TtmlDecoder", X.AnonymousClass000.A0T("Ignoring malformed cell resolution: ", r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.AnonymousClass6C7.A1F("Ignoring malformed tts extent: ", r10, "TtmlDecoder", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0113 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01ce */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee A[Catch:{ 6OY -> 0x02fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0447 A[Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0563 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0125 A[Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01de A[SYNTHETIC, Splitter:B:90:0x01de] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f4 A[Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C185358tW A04(byte[] r38, int r39, boolean r40) {
        /*
            r37 = this;
            java.lang.String r18 = ""
            r0 = r37
            org.xmlpull.v1.XmlPullParserFactory r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.HashMap r20 = X.AnonymousClass001.A0t()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.HashMap r6 = X.AnonymousClass001.A0t()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.HashMap r19 = X.AnonymousClass001.A0t()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            X.7Po r2 = new X.7Po     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r11 = r9
            r12 = r9
            r13 = r9
            r16 = r14
            r17 = r14
            r7 = r2
            r8 = r18
            r10 = r9
            r15 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r6.put(r8, r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r4 = r38
            r3 = r39
            r2.<init>(r4, r1, r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r1 = 0
            r0.setInput(r2, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.ArrayDeque r21 = X.AnonymousClass6CA.A0a()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            int r3 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            X.7Jh r5 = A02     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            X.7BJ r23 = A01     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r36 = r23
            r15 = r1
            r22 = 0
        L_0x004e:
            r2 = 1
            if (r3 == r2) goto L_0x056c
            java.lang.Object r4 = r21.peek()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            X.7oA r4 = (X.C160707oA) r4     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r2 = 2
            if (r22 != 0) goto L_0x053d
            java.lang.String r8 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r7 = "tt"
            if (r3 != r2) goto L_0x04ed
            boolean r2 = r7.equals(r8)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x013c
            java.lang.String r1 = "frameRate"
            java.lang.String r9 = "http://www.w3.org/ns/ttml#parameter"
            java.lang.String r1 = r0.getAttributeValue(r9, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r1 == 0) goto L_0x0094
            int r10 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x0076:
            java.lang.String r1 = "frameRateMultiplier"
            java.lang.String r2 = r0.getAttributeValue(r9, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x009a
            java.lang.String r1 = " "
            java.lang.String[] r2 = X.AnonymousClass6CA.A0j(r2, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            int r3 = r2.length     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r1 = 2
            if (r3 != r1) goto L_0x0577
            r1 = 0
            int r1 = X.AnonymousClass6CA.A0F(r2, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            float r5 = (float) r1     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r1 = 1
            int r1 = X.AnonymousClass6CA.A0F(r2, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x0097
        L_0x0094:
            r10 = 30
            goto L_0x0076
        L_0x0097:
            float r1 = (float) r1     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            float r5 = r5 / r1
            goto L_0x009c
        L_0x009a:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x009c:
            r3 = 1
            java.lang.String r1 = "subFrameRate"
            java.lang.String r1 = r0.getAttributeValue(r9, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r1 == 0) goto L_0x00a9
            int r3 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x00a9:
            r2 = 1
            java.lang.String r1 = "tickRate"
            java.lang.String r1 = r0.getAttributeValue(r9, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r1 == 0) goto L_0x00b6
            int r2 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x00b6:
            float r1 = (float) r10     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            float r1 = r1 * r5
            X.7Jh r5 = new X.7Jh     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r5.<init>(r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r1 = "cellResolution"
            java.lang.String r10 = r0.getAttributeValue(r9, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r10 == 0) goto L_0x011a
            java.util.regex.Pattern r1 = A03     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.regex.Matcher r2 = r1.matcher(r10)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            boolean r1 = r2.matches()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r9 = "Ignoring malformed cell resolution: "
            java.lang.String r3 = "TtmlDecoder"
            if (r1 != 0) goto L_0x00dd
            java.lang.String r1 = X.AnonymousClass000.A0T(r9, r10)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            android.util.Log.w(r3, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x011a
        L_0x00dd:
            r1 = 1
            java.lang.String r1 = X.AnonymousClass6C8.A0f(r2, r1)     // Catch:{ NumberFormatException -> 0x0113 }
            int r12 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0113 }
            r1 = 2
            java.lang.String r1 = X.AnonymousClass6C8.A0f(r2, r1)     // Catch:{ NumberFormatException -> 0x0113 }
            int r11 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0113 }
            if (r12 == 0) goto L_0x00fb
            if (r11 == 0) goto L_0x00fb
            X.7BJ r23 = new X.7BJ     // Catch:{ NumberFormatException -> 0x0113 }
            r1 = r23
            r1.<init>(r11)     // Catch:{ NumberFormatException -> 0x0113 }
            goto L_0x011c
        L_0x00fb:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0113 }
            java.lang.String r1 = "Invalid cell resolution "
            r2.append(r1)     // Catch:{ NumberFormatException -> 0x0113 }
            r2.append(r12)     // Catch:{ NumberFormatException -> 0x0113 }
            java.lang.String r1 = " "
            java.lang.String r2 = X.AnonymousClass000.A0Y(r1, r2, r11)     // Catch:{ NumberFormatException -> 0x0113 }
            X.6OY r1 = new X.6OY     // Catch:{ NumberFormatException -> 0x0113 }
            r1.<init>((java.lang.String) r2)     // Catch:{ NumberFormatException -> 0x0113 }
            throw r1     // Catch:{ NumberFormatException -> 0x0113 }
        L_0x0113:
            java.lang.String r1 = X.AnonymousClass000.A0T(r9, r10)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            android.util.Log.w(r3, r1)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x011a:
            r23 = r36
        L_0x011c:
            java.lang.String r1 = "extent"
            java.lang.String r10 = X.C159317ld.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r1 = 0
            if (r10 == 0) goto L_0x013c
            java.util.regex.Pattern r2 = A08     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.regex.Matcher r3 = r2.matcher(r10)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            boolean r2 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r9 = "TtmlDecoder"
            if (r2 != 0) goto L_0x01b4
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = "Ignoring non-pixel tts extent: "
            X.AnonymousClass6C7.A1F(r2, r10, r9, r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x013c:
            boolean r2 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "head"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "body"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "div"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "p"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "span"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "br"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "style"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "styling"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "layout"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "region"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "metadata"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "image"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "data"
            boolean r2 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "information"
            boolean r3 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r2 = 0
            if (r3 == 0) goto L_0x01da
            goto L_0x01d9
        L_0x01b4:
            r2 = 1
            java.lang.String r2 = X.AnonymousClass6C8.A0f(r3, r2)     // Catch:{ NumberFormatException -> 0x01ce }
            int r11 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x01ce }
            r2 = 2
            java.lang.String r2 = X.AnonymousClass6C8.A0f(r3, r2)     // Catch:{ NumberFormatException -> 0x01ce }
            int r3 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x01ce }
            X.7G9 r2 = new X.7G9     // Catch:{ NumberFormatException -> 0x01ce }
            r2.<init>(r11, r3)     // Catch:{ NumberFormatException -> 0x01ce }
            r1 = r2
            goto L_0x013c
        L_0x01ce:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = "Ignoring malformed tts extent: "
            X.AnonymousClass6C7.A1F(r2, r10, r9, r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x013c
        L_0x01d9:
            r2 = 1
        L_0x01da:
            java.lang.String r11 = "TtmlDecoder"
            if (r2 != 0) goto L_0x01f4
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = "Ignoring unsupported tag: "
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = X.AnonymousClass000.A0X(r2, r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            android.util.Log.i(r11, r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x0303
        L_0x01f4:
            java.lang.String r9 = "head"
            boolean r2 = r9.equals(r8)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x0307
            int r10 = r0.getAttributeCount()     // Catch:{ 6OY -> 0x02fd }
            r12 = 0
            X.7Ud r26 = A02(r12, r0)     // Catch:{ 6OY -> 0x02fd }
            r29 = r18
            r30 = r12
            r9 = 0
            r32 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0219:
            if (r9 >= r10) goto L_0x029e
            java.lang.String r8 = r0.getAttributeName(r9)     // Catch:{ 6OY -> 0x02fd }
            java.lang.String r7 = r0.getAttributeValue(r9)     // Catch:{ 6OY -> 0x02fd }
            int r2 = r8.hashCode()     // Catch:{ 6OY -> 0x02fd }
            r3 = 1
            switch(r2) {
                case -934795532: goto L_0x022c;
                case 99841: goto L_0x023d;
                case 100571: goto L_0x024a;
                case 93616297: goto L_0x0257;
                case 109780401: goto L_0x0264;
                case 1292595405: goto L_0x0284;
                default: goto L_0x022b;
            }     // Catch:{ 6OY -> 0x02fd }
        L_0x022b:
            goto L_0x029a
        L_0x022c:
            java.lang.String r2 = "region"
            boolean r2 = r8.equals(r2)     // Catch:{ 6OY -> 0x02fd }
            if (r2 == 0) goto L_0x029a
            boolean r2 = r6.containsKey(r7)     // Catch:{ 6OY -> 0x02fd }
            if (r2 == 0) goto L_0x029a
            r29 = r7
            goto L_0x029a
        L_0x023d:
            java.lang.String r2 = "dur"
            boolean r2 = r8.equals(r2)     // Catch:{ 6OY -> 0x02fd }
            if (r2 == 0) goto L_0x029a
            long r13 = A00(r5, r7)     // Catch:{ 6OY -> 0x02fd }
            goto L_0x029a
        L_0x024a:
            java.lang.String r2 = "end"
            boolean r2 = r8.equals(r2)     // Catch:{ 6OY -> 0x02fd }
            if (r2 == 0) goto L_0x029a
            long r16 = A00(r5, r7)     // Catch:{ 6OY -> 0x02fd }
            goto L_0x029a
        L_0x0257:
            java.lang.String r2 = "begin"
            boolean r2 = r8.equals(r2)     // Catch:{ 6OY -> 0x02fd }
            if (r2 == 0) goto L_0x029a
            long r32 = A00(r5, r7)     // Catch:{ 6OY -> 0x02fd }
            goto L_0x029a
        L_0x0264:
            java.lang.String r2 = "style"
            boolean r2 = r8.equals(r2)     // Catch:{ 6OY -> 0x02fd }
            if (r2 == 0) goto L_0x029a
            java.lang.String r3 = r7.trim()     // Catch:{ 6OY -> 0x02fd }
            boolean r2 = r3.isEmpty()     // Catch:{ 6OY -> 0x02fd }
            if (r2 == 0) goto L_0x027d
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ 6OY -> 0x02fd }
        L_0x0279:
            int r2 = r3.length     // Catch:{ 6OY -> 0x02fd }
            if (r2 <= 0) goto L_0x029a
            goto L_0x0299
        L_0x027d:
            java.lang.String r2 = "\\s+"
            java.lang.String[] r3 = X.AnonymousClass6CA.A0j(r3, r2)     // Catch:{ 6OY -> 0x02fd }
            goto L_0x0279
        L_0x0284:
            java.lang.String r2 = "backgroundImage"
            boolean r2 = r8.equals(r2)     // Catch:{ 6OY -> 0x02fd }
            if (r2 == 0) goto L_0x029a
            java.lang.String r2 = "#"
            boolean r2 = r7.startsWith(r2)     // Catch:{ 6OY -> 0x02fd }
            if (r2 == 0) goto L_0x029a
            java.lang.String r30 = r7.substring(r3)     // Catch:{ 6OY -> 0x02fd }
            goto L_0x029a
        L_0x0299:
            r12 = r3
        L_0x029a:
            int r9 = r9 + 1
            goto L_0x0219
        L_0x029e:
            if (r4 == 0) goto L_0x02b8
            long r2 = r4.A02     // Catch:{ 6OY -> 0x02fd }
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x02bd
            int r7 = (r32 > r8 ? 1 : (r32 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x02b1
            long r32 = r32 + r2
        L_0x02b1:
            int r7 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x02bd
            long r16 = r16 + r2
            goto L_0x02bd
        L_0x02b8:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02bd:
            int r2 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x02cb
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x02c8
            long r2 = r32 + r13
            goto L_0x02d4
        L_0x02c8:
            if (r4 == 0) goto L_0x02cb
            goto L_0x02ce
        L_0x02cb:
            r2 = r16
            goto L_0x02d4
        L_0x02ce:
            long r2 = r4.A01     // Catch:{ 6OY -> 0x02fd }
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x02cb
        L_0x02d4:
            java.lang.String r27 = r0.getName()     // Catch:{ 6OY -> 0x02fd }
            r28 = 0
            X.7oA r7 = new X.7oA     // Catch:{ 6OY -> 0x02fd }
            r24 = r7
            r25 = r4
            r31 = r12
            r34 = r2
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34)     // Catch:{ 6OY -> 0x02fd }
            r2 = r21
            r2.push(r7)     // Catch:{ 6OY -> 0x02fd }
            if (r4 == 0) goto L_0x0563
            java.util.List r2 = r4.A00     // Catch:{ 6OY -> 0x02fd }
            if (r2 != 0) goto L_0x02f8
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ 6OY -> 0x02fd }
            r4.A00 = r2     // Catch:{ 6OY -> 0x02fd }
        L_0x02f8:
            r2.add(r7)     // Catch:{ 6OY -> 0x02fd }
            goto L_0x0563
        L_0x02fd:
            r3 = move-exception
            java.lang.String r2 = "Suppressing parser error"
            X.C159307lc.A01(r2, r11, r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x0303:
            r22 = 1
            goto L_0x0563
        L_0x0307:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r3 = "style"
            boolean r2 = X.C159317ld.A01(r3, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x0354
            java.lang.String r3 = X.C159317ld.A00(r3, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            X.7Ud r2 = new X.7Ud     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            X.7Ud r8 = A02(r2, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r3 == 0) goto L_0x0349
            java.lang.String r3 = r3.trim()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            boolean r2 = r3.isEmpty()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x0342
            r2 = 0
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x032e:
            int r7 = r10.length     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r4 = 0
        L_0x0330:
            if (r4 >= r7) goto L_0x0349
            r3 = r10[r4]     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r2 = r20
            java.lang.Object r2 = r2.get(r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            X.7Ud r2 = (X.C151287Ud) r2     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r8.A00(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            int r4 = r4 + 1
            goto L_0x0330
        L_0x0342:
            java.lang.String r2 = "\\s+"
            java.lang.String[] r10 = X.AnonymousClass6CA.A0j(r3, r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x032e
        L_0x0349:
            java.lang.String r3 = r8.A0F     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r3 == 0) goto L_0x04de
            r2 = r20
            r2.put(r3, r8)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x04de
        L_0x0354:
            java.lang.String r2 = "region"
            boolean r2 = X.C159317ld.A01(r2, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x0494
            java.lang.String r2 = "id"
            java.lang.String r25 = X.C159317ld.A00(r2, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r25 == 0) goto L_0x04de
            java.lang.String r2 = "origin"
            java.lang.String r13 = X.C159317ld.A00(r2, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r13 == 0) goto L_0x048b
            java.util.regex.Pattern r2 = A07     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.regex.Matcher r3 = r2.matcher(r13)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.regex.Pattern r4 = A08     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.regex.Matcher r7 = r4.matcher(r13)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            boolean r8 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r14 = "Ignoring region with malformed origin: "
            java.lang.String r17 = "Ignoring region with missing tts:extent: "
            r16 = 1120403456(0x42c80000, float:100.0)
            r12 = 2
            r10 = 1
            if (r8 == 0) goto L_0x039b
            java.lang.String r7 = X.AnonymousClass6C8.A0f(r3, r10)     // Catch:{ NumberFormatException -> 0x0473 }
            float r8 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0473 }
            float r8 = r8 / r16
            java.lang.String r3 = X.AnonymousClass6C8.A0f(r3, r12)     // Catch:{ NumberFormatException -> 0x0473 }
            float r7 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x0473 }
            float r7 = r7 / r16
            goto L_0x03bd
        L_0x039b:
            boolean r3 = r7.matches()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r3 == 0) goto L_0x047d
            if (r1 == 0) goto L_0x0478
            java.lang.String r3 = X.AnonymousClass6C8.A0f(r7, r10)     // Catch:{ NumberFormatException -> 0x0473 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0473 }
            java.lang.String r7 = X.AnonymousClass6C8.A0f(r7, r12)     // Catch:{ NumberFormatException -> 0x0473 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0473 }
            float r8 = (float) r3     // Catch:{ NumberFormatException -> 0x0473 }
            int r3 = r1.A01     // Catch:{ NumberFormatException -> 0x0473 }
            float r3 = (float) r3     // Catch:{ NumberFormatException -> 0x0473 }
            float r8 = r8 / r3
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x0473 }
            int r3 = r1.A00     // Catch:{ NumberFormatException -> 0x0473 }
            float r3 = (float) r3     // Catch:{ NumberFormatException -> 0x0473 }
            float r7 = r7 / r3
        L_0x03bd:
            java.lang.String r3 = "extent"
            java.lang.String r3 = X.C159317ld.A00(r3, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r3 == 0) goto L_0x048e
            java.util.regex.Matcher r2 = r2.matcher(r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            boolean r4 = r2.matches()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r14 = "Ignoring region with malformed extent: "
            if (r4 == 0) goto L_0x03ea
            java.lang.String r3 = X.AnonymousClass6C8.A0f(r2, r10)     // Catch:{ NumberFormatException -> 0x0473 }
            float r4 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x0473 }
            float r4 = r4 / r16
            java.lang.String r2 = X.AnonymousClass6C8.A0f(r2, r12)     // Catch:{ NumberFormatException -> 0x0473 }
            float r3 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0473 }
            float r3 = r3 / r16
            goto L_0x040c
        L_0x03ea:
            boolean r2 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x046c
            if (r1 == 0) goto L_0x0478
            java.lang.String r2 = X.AnonymousClass6C8.A0f(r3, r10)     // Catch:{ NumberFormatException -> 0x0473 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0473 }
            java.lang.String r3 = X.AnonymousClass6C8.A0f(r3, r12)     // Catch:{ NumberFormatException -> 0x0473 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0473 }
            float r4 = (float) r2     // Catch:{ NumberFormatException -> 0x0473 }
            int r2 = r1.A01     // Catch:{ NumberFormatException -> 0x0473 }
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x0473 }
            float r4 = r4 / r2
            float r3 = (float) r3     // Catch:{ NumberFormatException -> 0x0473 }
            int r2 = r1.A00     // Catch:{ NumberFormatException -> 0x0473 }
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x0473 }
            float r3 = r3 / r2
        L_0x040c:
            java.lang.String r2 = "displayAlign"
            java.lang.String r2 = X.C159317ld.A00(r2, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x0434
            java.lang.String r12 = X.AnonymousClass0x9.A0z(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = "center"
            boolean r2 = r12.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x042c
            java.lang.String r2 = "after"
            boolean r2 = r12.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x0434
            float r7 = r7 + r3
            r32 = 2
            goto L_0x0436
        L_0x042c:
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r3 / r2
            float r7 = r7 + r2
            r32 = 1
            goto L_0x0436
        L_0x0434:
            r32 = 0
        L_0x0436:
            r2 = r23
            int r2 = r2.A00     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            float r2 = (float) r2     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r30 = 1065353216(0x3f800000, float:1.0)
            float r30 = r30 / r2
            java.lang.String r2 = "writingMode"
            java.lang.String r2 = X.C159317ld.A00(r2, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x0469
            java.lang.String r12 = X.AnonymousClass0x9.A0z(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            int r2 = r12.hashCode()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            switch(r2) {
                case 3694: goto L_0x0453;
                case 3553396: goto L_0x0456;
                case 3553576: goto L_0x045f;
                default: goto L_0x0452;
            }     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x0452:
            goto L_0x0469
        L_0x0453:
            java.lang.String r2 = "tb"
            goto L_0x0458
        L_0x0456:
            java.lang.String r2 = "tblr"
        L_0x0458:
            boolean r2 = r12.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r34 = 2
            goto L_0x0467
        L_0x045f:
            java.lang.String r2 = "tbrl"
            boolean r2 = r12.equals(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r34 = 1
        L_0x0467:
            if (r2 != 0) goto L_0x04c6
        L_0x0469:
            r34 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x04c6
        L_0x046c:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = "Ignoring region with unsupported extent: "
            goto L_0x0483
        L_0x0473:
            java.lang.String r2 = X.AnonymousClass000.A0T(r14, r13)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x0490
        L_0x0478:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r17)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x0486
        L_0x047d:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = "Ignoring region with unsupported origin: "
        L_0x0483:
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x0486:
            java.lang.String r2 = X.AnonymousClass000.A0X(r13, r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x0490
        L_0x048b:
            java.lang.String r2 = "Ignoring region without an origin"
            goto L_0x0490
        L_0x048e:
            java.lang.String r2 = "Ignoring region without an extent"
        L_0x0490:
            android.util.Log.w(r11, r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x04de
        L_0x0494:
            java.lang.String r7 = "metadata"
            boolean r2 = X.C159317ld.A01(r7, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x04de
        L_0x049c:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = "image"
            boolean r2 = X.C159317ld.A01(r2, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x04b8
            java.lang.String r2 = "id"
            java.lang.String r4 = X.C159317ld.A00(r2, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r4 == 0) goto L_0x04b8
            java.lang.String r3 = r0.nextText()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r2 = r19
            r2.put(r4, r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x04b8:
            int r3 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r2 = 3
            if (r3 != r2) goto L_0x049c
            boolean r2 = X.AnonymousClass6C8.A1T(r7, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x04de
            goto L_0x049c
        L_0x04c6:
            r31 = 0
            X.7Po r2 = new X.7Po     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r24 = r2
            r26 = r8
            r27 = r7
            r28 = r4
            r29 = r3
            r33 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r3 = r2.A09     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r6.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x04de:
            int r3 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r2 = 3
            if (r3 != r2) goto L_0x0307
            boolean r2 = X.AnonymousClass6C8.A1T(r9, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x0563
            goto L_0x0307
        L_0x04ed:
            r2 = 4
            if (r3 != r2) goto L_0x0539
            r4.getClass()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r3 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r25 = 0
            java.lang.String r2 = "\r\n"
            java.lang.String r8 = "\n"
            java.lang.String r3 = r3.replaceAll(r2, r8)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = " *\n *"
            java.lang.String r2 = r3.replaceAll(r2, r8)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r7 = " "
            java.lang.String r3 = r2.replaceAll(r8, r7)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.lang.String r2 = "[ \t\\x0B\f\r]+"
            java.lang.String r28 = r3.replaceAll(r2, r7)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r32 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.7oA r3 = new X.7oA     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r27 = r25
            r30 = r25
            r31 = r25
            r24 = r3
            r26 = r25
            r29 = r18
            r34 = r32
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            java.util.List r2 = r4.A00     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 != 0) goto L_0x0535
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r4.A00 = r2     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x0535:
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x0563
        L_0x0539:
            r2 = 3
            if (r3 != r2) goto L_0x0563
            goto L_0x0548
        L_0x053d:
            if (r3 != r2) goto L_0x0542
            int r22 = r22 + 1
            goto L_0x0563
        L_0x0542:
            r2 = 3
            if (r3 != r2) goto L_0x0563
            int r22 = r22 + -1
            goto L_0x0563
        L_0x0548:
            boolean r2 = X.AnonymousClass6C8.A1T(r7, r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            if (r2 == 0) goto L_0x0560
            java.lang.Object r4 = r21.peek()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r4.getClass()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            X.7oA r4 = (X.C160707oA) r4     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            X.88M r15 = new X.88M     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r3 = r19
            r2 = r20
            r15.<init>(r4, r2, r6, r3)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x0560:
            r21.pop()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x0563:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            int r3 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x004e
        L_0x056c:
            if (r15 == 0) goto L_0x056f
            return r15
        L_0x056f:
            java.lang.String r0 = "No TTML subtitles found"
            X.6OY r1 = new X.6OY     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r1.<init>((java.lang.String) r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            goto L_0x057e
        L_0x0577:
            java.lang.String r0 = "frameRateMultiplier doesn't have 2 parts"
            X.6OY r1 = new X.6OY     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
            r1.<init>((java.lang.String) r0)     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x057e:
            throw r1     // Catch:{ XmlPullParserException -> 0x0588, IOException -> 0x057f }
        L_0x057f:
            r1 = move-exception
            java.lang.String r0 = "Unexpected error when reading input."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0, r1)
            throw r2
        L_0x0588:
            r1 = move-exception
            java.lang.String r0 = "Unable to decode source"
            X.6OY r2 = new X.6OY
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PZ.A04(byte[], int, boolean):X.8tW");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0196, code lost:
        if (r10.equals("em") == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0198, code lost:
        r6.A05 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a1, code lost:
        if (r10.equals("px") == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a3, code lost:
        r6.A05 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a5, code lost:
        r6.A00 = java.lang.Float.parseFloat(X.AnonymousClass6C8.A0f(r1, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b1, code lost:
        r1 = new X.AnonymousClass6OY(X.AnonymousClass000.A0U("Invalid expression for fontSize: '", r2, "'.", X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c1, code lost:
        if (r7 != 2) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c3, code lost:
        r1 = A05.matcher(r0[1]);
        android.util.Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d1, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Invalid number of entries for fontSize: ");
        r1.append(r7);
        r1 = new X.AnonymousClass6OY(X.AnonymousClass000.A0X(".", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e9, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Failed parsing fontSize value: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01f1, code lost:
        r12 = A01(r12);
        r12.A06 = "italic".equalsIgnoreCase(r2) ? 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ff, code lost:
        r12 = A01(r12);
        r12.A0E = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0207, code lost:
        r12 = A01(r12);
        r12.A03 = "bold".equalsIgnoreCase(r2) ? 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0215, code lost:
        r12 = A01(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r12.A04 = X.C155547f5.A00(r2, false);
        r12.A0H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0225, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Failed parsing color value: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        switch(r2.hashCode()) {
            case -1364013995: goto L_0x002d;
            case 100571: goto L_0x003c;
            case 3317767: goto L_0x003f;
            case 108511772: goto L_0x0042;
            case 109757538: goto L_0x0051;
            default: goto L_0x002c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022d, code lost:
        r12 = A01(r12);
        r1 = A09.matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x023b, code lost:
        if (r1.matches() != false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x023d, code lost:
        X.AnonymousClass6C7.A1F("Invalid value for shear: ", r2, "TtmlDecoder", X.AnonymousClass001.A0o());
        r0 = Float.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r0 = java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat(X.AnonymousClass6C8.A0f(r1, 1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0263, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0264, code lost:
        X.C159307lc.A01(X.AnonymousClass000.A0V("Failed to parse shear: ", r2, X.AnonymousClass001.A0o()), "TtmlDecoder", r6);
        r0 = Float.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0275, code lost:
        r12 = A01(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0279, code lost:
        if (r2 == null) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x027b, code lost:
        r2 = X.AnonymousClass0x9.A0z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x027f, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0280, code lost:
        if (r2 == null) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0282, code lost:
        r1 = r2.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x028a, code lost:
        if (r1.isEmpty() != false) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x028c, code lost:
        r7 = X.C129526aS.copyOf((java.lang.Object[]) android.text.TextUtils.split(r1, X.C156547go.A07));
        r5 = (java.lang.String) X.C162247rW.getFirst(X.C162207rR.intersection(X.C156547go.A05, r7), "outside");
        r1 = r5.hashCode();
        r6 = 2;
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ae, code lost:
        if (r1 == -1392885889) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b3, code lost:
        if (r1 == -1106037339) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r2.equals("center") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02b8, code lost:
        if (r1 != 92734940) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ba, code lost:
        r0 = r5.equals("after");
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c1, code lost:
        if (r0 != false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02c3, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02c4, code lost:
        r1 = X.C162207rR.intersection(X.C156547go.A06, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ce, code lost:
        if (r1.isEmpty() != false) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02d0, code lost:
        r6 = X.AnonymousClass001.A0m(r1.iterator());
        r1 = r6.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02df, code lost:
        if (r1 == 3005871) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r12 = A01(r12);
        r0 = android.text.Layout.Alignment.ALIGN_CENTER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02e4, code lost:
        if (r1 != 3387192) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02ec, code lost:
        if (r6.equals("none") == false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02ee, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02ef, code lost:
        r7 = new X.C156547go(r2, 0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02f4, code lost:
        r12.A0D = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02f8, code lost:
        r1 = X.C162207rR.intersection(X.C156547go.A03, r7);
        r7 = X.C162207rR.intersection(X.C156547go.A04, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0308, code lost:
        if (r1.isEmpty() == false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030e, code lost:
        if (r7.isEmpty() == false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r0 = "end";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0311, code lost:
        r2 = (java.lang.String) X.C162247rW.getFirst(r1, "filled");
        r1 = r2.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0320, code lost:
        if (r1 == -1274499742) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0325, code lost:
        if (r1 != 3417674) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0327, code lost:
        r0 = r2.equals("open");
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x032e, code lost:
        if (r0 != false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0330, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0331, code lost:
        r7 = (java.lang.String) X.C162247rW.getFirst(r7, "circle");
        r1 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0340, code lost:
        if (r1 == -1360216880) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r0 = "left";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0345, code lost:
        if (r1 == -905816648) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x034a, code lost:
        if (r1 != 99657) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0352, code lost:
        if (r7.equals("dot") == false) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0354, code lost:
        r7 = new X.C156547go(r6, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035a, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0361, code lost:
        if (r7.equals("sesame") != false) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0363, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0365, code lost:
        r0 = r5.equals("outside");
        r5 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r0 = "right";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036c, code lost:
        r12 = A01(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        r12.A02 = X.C155547f5.A00(r2, false);
        r12.A0G = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x037c, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Failed parsing background value: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0382, code lost:
        X.AnonymousClass6C7.A1F(r0, r2, "TtmlDecoder", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0391, code lost:
        if ("style".equals(r13.getName()) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0393, code lost:
        r12 = A01(r12);
        r12.A0F = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r2.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0410, code lost:
        if (r0 == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r12 = A01(r12);
        r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r0 = "start";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r2.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r12 = A01(r12);
        r0 = android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        r12.A0C = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r2 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r2 = X.AnonymousClass0x9.A0z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        switch(r2.hashCode()) {
            case -1461280213: goto L_0x0070;
            case -1026963764: goto L_0x007e;
            case 913457136: goto L_0x008e;
            case 1679736913: goto L_0x009c;
            default: goto L_0x006f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r2.equals("nounderline") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        r12 = A01(r12);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r2.equals("underline") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r12 = A01(r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        r12.A0B = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (r2.equals("nolinethrough") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        r12 = A01(r12);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        if (r2.equals("linethrough") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        r12 = A01(r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
        r12.A07 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        if (r2 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        r2 = X.AnonymousClass0x9.A0z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        switch(r2.hashCode()) {
            case -618561360: goto L_0x00bc;
            case -410956671: goto L_0x00bf;
            case -250518009: goto L_0x00cd;
            case -136074796: goto L_0x00db;
            case 3016401: goto L_0x00de;
            case 3556653: goto L_0x00ec;
            default: goto L_0x00ba;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        r0 = "baseContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r2.equals("container") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c7, code lost:
        r12 = A01(r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d3, code lost:
        if (r2.equals("delimiter") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d5, code lost:
        r12 = A01(r12);
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00db, code lost:
        r0 = "textContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00de, code lost:
        r0 = "base";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e4, code lost:
        if (r2.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e6, code lost:
        r12 = A01(r12);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ec, code lost:
        r0 = "text";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f2, code lost:
        if (r2.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f4, code lost:
        r12 = A01(r12);
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f9, code lost:
        r12.A09 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fd, code lost:
        if (r2 == null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ff, code lost:
        r2 = X.AnonymousClass0x9.A0z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0109, code lost:
        if (r2.equals("all") != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        switch(r1) {
            case 0: goto L_0x01f1;
            case 1: goto L_0x01ff;
            case 2: goto L_0x001f;
            case 3: goto L_0x0062;
            case 4: goto L_0x0207;
            case 5: goto L_0x0387;
            case 6: goto L_0x00ad;
            case 7: goto L_0x0215;
            case 8: goto L_0x022d;
            case 9: goto L_0x00fd;
            case 10: goto L_0x0147;
            case 11: goto L_0x0275;
            case 12: goto L_0x0122;
            case 13: goto L_0x036c;
            default: goto L_0x001c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0111, code lost:
        if (r2.equals("none") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0113, code lost:
        r12 = A01(r12);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0118, code lost:
        r12.A0A = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011c, code lost:
        r12 = A01(r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0122, code lost:
        if (r2 == null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0124, code lost:
        r2 = X.AnonymousClass0x9.A0z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012e, code lost:
        if (r2.equals("before") != false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0136, code lost:
        if (r2.equals("after") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0138, code lost:
        r12 = A01(r12);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013d, code lost:
        r12.A08 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0141, code lost:
        r12 = A01(r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0147, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0148, code lost:
        if (r12 != null) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r6 = new X.C151287Ud();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x014f, code lost:
        r12 = r6;
        r0 = X.AnonymousClass6CA.A0j(r2, "\\s+");
        r7 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0159, code lost:
        if (r7 != 1) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015b, code lost:
        r1 = A05.matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r2 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0167, code lost:
        if (r1.matches() == false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0169, code lost:
        r10 = X.AnonymousClass6C8.A0f(r1, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0172, code lost:
        switch(r10.hashCode()) {
            case 37: goto L_0x0185;
            case 3240: goto L_0x0190;
            case 3592: goto L_0x019b;
            default: goto L_0x0175;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0175, code lost:
        r1 = new X.AnonymousClass6OY(X.AnonymousClass000.A0U("Invalid unit for fontSize: '", r10, "'.", X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0184, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x018b, code lost:
        if (r10.equals("%") == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018d, code lost:
        r6.A05 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r2 = X.AnonymousClass0x9.A0z(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C151287Ud A02(X.C151287Ud r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            int r4 = r13.getAttributeCount()
            r3 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0414
            java.lang.String r2 = r13.getAttributeValue(r3)
            java.lang.String r1 = r13.getAttributeName(r3)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1550943582: goto L_0x039b;
                case -1224696685: goto L_0x03a3;
                case -1065511464: goto L_0x03ab;
                case -879295043: goto L_0x03b3;
                case -734428249: goto L_0x03bb;
                case 3355: goto L_0x03c3;
                case 3511770: goto L_0x03cb;
                case 94842723: goto L_0x03d3;
                case 109403361: goto L_0x03db;
                case 110138194: goto L_0x03e4;
                case 365601008: goto L_0x03ed;
                case 921125321: goto L_0x03f6;
                case 1115953443: goto L_0x03ff;
                case 1287124693: goto L_0x0408;
                default: goto L_0x0016;
            }
        L_0x0016:
            r1 = -1
        L_0x0017:
            java.lang.String r5 = "TtmlDecoder"
            switch(r1) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01ff;
                case 2: goto L_0x001f;
                case 3: goto L_0x0062;
                case 4: goto L_0x0207;
                case 5: goto L_0x0387;
                case 6: goto L_0x00ad;
                case 7: goto L_0x0215;
                case 8: goto L_0x022d;
                case 9: goto L_0x00fd;
                case 10: goto L_0x0147;
                case 11: goto L_0x0275;
                case 12: goto L_0x0122;
                case 13: goto L_0x036c;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x001f:
            if (r2 == 0) goto L_0x0025
            java.lang.String r2 = X.AnonymousClass0x9.A0z(r2)
        L_0x0025:
            int r0 = r2.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x002d;
                case 100571: goto L_0x003c;
                case 3317767: goto L_0x003f;
                case 108511772: goto L_0x0042;
                case 109757538: goto L_0x0051;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x001c
        L_0x002d:
            java.lang.String r0 = "center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x005f
        L_0x003c:
            java.lang.String r0 = "end"
            goto L_0x0044
        L_0x003f:
            java.lang.String r0 = "left"
            goto L_0x0053
        L_0x0042:
            java.lang.String r0 = "right"
        L_0x0044:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x005f
        L_0x0051:
            java.lang.String r0 = "start"
        L_0x0053:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x005f:
            r12.A0C = r0
            goto L_0x001c
        L_0x0062:
            if (r2 == 0) goto L_0x0068
            java.lang.String r2 = X.AnonymousClass0x9.A0z(r2)
        L_0x0068:
            int r0 = r2.hashCode()
            switch(r0) {
                case -1461280213: goto L_0x0070;
                case -1026963764: goto L_0x007e;
                case 913457136: goto L_0x008e;
                case 1679736913: goto L_0x009c;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x001c
        L_0x0070:
            java.lang.String r0 = "nounderline"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 0
            goto L_0x008b
        L_0x007e:
            java.lang.String r0 = "underline"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 1
        L_0x008b:
            r12.A0B = r0
            goto L_0x001c
        L_0x008e:
            java.lang.String r0 = "nolinethrough"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 0
            goto L_0x00a9
        L_0x009c:
            java.lang.String r0 = "linethrough"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 1
        L_0x00a9:
            r12.A07 = r0
            goto L_0x001c
        L_0x00ad:
            if (r2 == 0) goto L_0x00b3
            java.lang.String r2 = X.AnonymousClass0x9.A0z(r2)
        L_0x00b3:
            int r0 = r2.hashCode()
            switch(r0) {
                case -618561360: goto L_0x00bc;
                case -410956671: goto L_0x00bf;
                case -250518009: goto L_0x00cd;
                case -136074796: goto L_0x00db;
                case 3016401: goto L_0x00de;
                case 3556653: goto L_0x00ec;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x001c
        L_0x00bc:
            java.lang.String r0 = "baseContainer"
            goto L_0x00e0
        L_0x00bf:
            java.lang.String r0 = "container"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 1
            goto L_0x00f9
        L_0x00cd:
            java.lang.String r0 = "delimiter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 4
            goto L_0x00f9
        L_0x00db:
            java.lang.String r0 = "textContainer"
            goto L_0x00ee
        L_0x00de:
            java.lang.String r0 = "base"
        L_0x00e0:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 2
            goto L_0x00f9
        L_0x00ec:
            java.lang.String r0 = "text"
        L_0x00ee:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 3
        L_0x00f9:
            r12.A09 = r0
            goto L_0x001c
        L_0x00fd:
            if (r2 == 0) goto L_0x0103
            java.lang.String r2 = X.AnonymousClass0x9.A0z(r2)
        L_0x0103:
            java.lang.String r0 = "all"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x011c
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 0
        L_0x0118:
            r12.A0A = r0
            goto L_0x001c
        L_0x011c:
            X.7Ud r12 = A01(r12)
            r0 = 1
            goto L_0x0118
        L_0x0122:
            if (r2 == 0) goto L_0x0128
            java.lang.String r2 = X.AnonymousClass0x9.A0z(r2)
        L_0x0128:
            java.lang.String r0 = "before"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0141
            java.lang.String r0 = "after"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r0 = 2
        L_0x013d:
            r12.A08 = r0
            goto L_0x001c
        L_0x0141:
            X.7Ud r12 = A01(r12)
            r0 = 1
            goto L_0x013d
        L_0x0147:
            r6 = r12
            if (r12 != 0) goto L_0x014f
            X.7Ud r6 = new X.7Ud     // Catch:{ 6OY -> 0x01e9 }
            r6.<init>()     // Catch:{ 6OY -> 0x01e9 }
        L_0x014f:
            r12 = r6
            java.lang.String r0 = "\\s+"
            java.lang.String[] r0 = X.AnonymousClass6CA.A0j(r2, r0)     // Catch:{ 6OY -> 0x01e9 }
            int r7 = r0.length     // Catch:{ 6OY -> 0x01e9 }
            r9 = 2
            r8 = 1
            if (r7 != r8) goto L_0x01c1
            java.util.regex.Pattern r0 = A05     // Catch:{ 6OY -> 0x01e9 }
            java.util.regex.Matcher r1 = r0.matcher(r2)     // Catch:{ 6OY -> 0x01e9 }
        L_0x0161:
            boolean r0 = r1.matches()     // Catch:{ 6OY -> 0x01e9 }
            java.lang.String r7 = "'."
            if (r0 == 0) goto L_0x01b1
            r11 = 3
            java.lang.String r10 = X.AnonymousClass6C8.A0f(r1, r11)     // Catch:{ 6OY -> 0x01e9 }
            int r0 = r10.hashCode()     // Catch:{ 6OY -> 0x01e9 }
            switch(r0) {
                case 37: goto L_0x0185;
                case 3240: goto L_0x0190;
                case 3592: goto L_0x019b;
                default: goto L_0x0175;
            }     // Catch:{ 6OY -> 0x01e9 }
        L_0x0175:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6OY -> 0x01e9 }
            java.lang.String r0 = "Invalid unit for fontSize: '"
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r10, r7, r1)     // Catch:{ 6OY -> 0x01e9 }
            X.6OY r1 = new X.6OY     // Catch:{ 6OY -> 0x01e9 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 6OY -> 0x01e9 }
        L_0x0184:
            throw r1     // Catch:{ 6OY -> 0x01e9 }
        L_0x0185:
            java.lang.String r0 = "%"
            boolean r0 = r10.equals(r0)     // Catch:{ 6OY -> 0x01e9 }
            if (r0 == 0) goto L_0x0175
            r6.A05 = r11     // Catch:{ 6OY -> 0x01e9 }
            goto L_0x01a5
        L_0x0190:
            java.lang.String r0 = "em"
            boolean r0 = r10.equals(r0)     // Catch:{ 6OY -> 0x01e9 }
            if (r0 == 0) goto L_0x0175
            r6.A05 = r9     // Catch:{ 6OY -> 0x01e9 }
            goto L_0x01a5
        L_0x019b:
            java.lang.String r0 = "px"
            boolean r0 = r10.equals(r0)     // Catch:{ 6OY -> 0x01e9 }
            if (r0 == 0) goto L_0x0175
            r6.A05 = r8     // Catch:{ 6OY -> 0x01e9 }
        L_0x01a5:
            java.lang.String r0 = X.AnonymousClass6C8.A0f(r1, r8)     // Catch:{ 6OY -> 0x01e9 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ 6OY -> 0x01e9 }
            r6.A00 = r0     // Catch:{ 6OY -> 0x01e9 }
            goto L_0x001c
        L_0x01b1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6OY -> 0x01e9 }
            java.lang.String r0 = "Invalid expression for fontSize: '"
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r2, r7, r1)     // Catch:{ 6OY -> 0x01e9 }
            X.6OY r1 = new X.6OY     // Catch:{ 6OY -> 0x01e9 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 6OY -> 0x01e9 }
            goto L_0x0184
        L_0x01c1:
            if (r7 != r9) goto L_0x01d1
            java.util.regex.Pattern r1 = A05     // Catch:{ 6OY -> 0x01e9 }
            r0 = r0[r8]     // Catch:{ 6OY -> 0x01e9 }
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ 6OY -> 0x01e9 }
            java.lang.String r0 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            android.util.Log.w(r5, r0)     // Catch:{ 6OY -> 0x01e9 }
            goto L_0x0161
        L_0x01d1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6OY -> 0x01e9 }
            java.lang.String r0 = "Invalid number of entries for fontSize: "
            r1.append(r0)     // Catch:{ 6OY -> 0x01e9 }
            r1.append(r7)     // Catch:{ 6OY -> 0x01e9 }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 6OY -> 0x01e9 }
            X.6OY r1 = new X.6OY     // Catch:{ 6OY -> 0x01e9 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 6OY -> 0x01e9 }
            goto L_0x0184
        L_0x01e9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed parsing fontSize value: "
            goto L_0x0382
        L_0x01f1:
            X.7Ud r12 = A01(r12)
            java.lang.String r0 = "italic"
            boolean r0 = r0.equalsIgnoreCase(r2)
            r12.A06 = r0
            goto L_0x001c
        L_0x01ff:
            X.7Ud r12 = A01(r12)
            r12.A0E = r2
            goto L_0x001c
        L_0x0207:
            X.7Ud r12 = A01(r12)
            java.lang.String r0 = "bold"
            boolean r0 = r0.equalsIgnoreCase(r2)
            r12.A03 = r0
            goto L_0x001c
        L_0x0215:
            X.7Ud r12 = A01(r12)
            r0 = 0
            int r0 = X.C155547f5.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0225 }
            r12.A04 = r0     // Catch:{ IllegalArgumentException -> 0x0225 }
            r0 = 1
            r12.A0H = r0     // Catch:{ IllegalArgumentException -> 0x0225 }
            goto L_0x001c
        L_0x0225:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed parsing color value: "
            goto L_0x0382
        L_0x022d:
            X.7Ud r12 = A01(r12)
            java.util.regex.Pattern r0 = A09
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.matches()
            if (r0 != 0) goto L_0x024d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid value for shear: "
            X.AnonymousClass6C7.A1F(r0, r2, r5, r1)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0249:
            r12.A01 = r0
            goto L_0x001c
        L_0x024d:
            r0 = 1
            java.lang.String r0 = X.AnonymousClass6C8.A0f(r1, r0)     // Catch:{ NumberFormatException -> 0x0263 }
            float r1 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0263 }
            r0 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r1 = java.lang.Math.max(r0, r1)     // Catch:{ NumberFormatException -> 0x0263 }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = java.lang.Math.min(r0, r1)     // Catch:{ NumberFormatException -> 0x0263 }
            goto L_0x0249
        L_0x0263:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to parse shear: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            X.C159307lc.A01(r0, r5, r6)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x0249
        L_0x0275:
            X.7Ud r12 = A01(r12)
            if (r2 == 0) goto L_0x027f
            java.lang.String r2 = X.AnonymousClass0x9.A0z(r2)
        L_0x027f:
            r7 = 0
            if (r2 == 0) goto L_0x02f4
            java.lang.String r1 = r2.trim()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02f4
            java.util.regex.Pattern r0 = X.C156547go.A07
            java.lang.String[] r0 = android.text.TextUtils.split(r1, r0)
            X.6aS r7 = X.C129526aS.copyOf((java.lang.Object[]) r0)
            X.6aS r0 = X.C156547go.A05
            X.8TL r0 = X.C162207rR.intersection(r0, r7)
            java.lang.String r9 = "outside"
            java.lang.Object r5 = X.C162247rW.getFirst(r0, r9)
            java.lang.String r5 = (java.lang.String) r5
            int r1 = r5.hashCode()
            r0 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            r6 = 2
            r8 = 0
            r2 = -1
            if (r1 == r0) goto L_0x02c3
            r0 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r1 == r0) goto L_0x0365
            r0 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r1 != r0) goto L_0x02c3
            java.lang.String r0 = "after"
            boolean r0 = r5.equals(r0)
            r5 = 2
        L_0x02c1:
            if (r0 != 0) goto L_0x02c4
        L_0x02c3:
            r5 = 1
        L_0x02c4:
            X.6aS r0 = X.C156547go.A06
            X.8TL r1 = X.C162207rR.intersection(r0, r7)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02f8
            java.util.Iterator r0 = r1.iterator()
            java.lang.String r6 = X.AnonymousClass001.A0m(r0)
            int r1 = r6.hashCode()
            r0 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r0) goto L_0x02ef
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 != r0) goto L_0x02ef
            java.lang.String r0 = "none"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x02ef
            r2 = 0
        L_0x02ef:
            X.7go r7 = new X.7go
            r7.<init>(r2, r8, r5)
        L_0x02f4:
            r12.A0D = r7
            goto L_0x001c
        L_0x02f8:
            X.6aS r0 = X.C156547go.A03
            X.8TL r1 = X.C162207rR.intersection(r0, r7)
            X.6aS r0 = X.C156547go.A04
            X.8TL r7 = X.C162207rR.intersection(r0, r7)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0311
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0311
            goto L_0x02ef
        L_0x0311:
            java.lang.String r0 = "filled"
            java.lang.Object r2 = X.C162247rW.getFirst(r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r2.hashCode()
            r0 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r1 == r0) goto L_0x0330
            r0 = 3417674(0x34264a, float:4.789181E-39)
            if (r1 != r0) goto L_0x0330
            java.lang.String r0 = "open"
            boolean r0 = r2.equals(r0)
            r2 = 2
            if (r0 != 0) goto L_0x0331
        L_0x0330:
            r2 = 1
        L_0x0331:
            java.lang.String r0 = "circle"
            java.lang.Object r7 = X.C162247rW.getFirst(r7, r0)
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r7.hashCode()
            r0 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r1 == r0) goto L_0x0363
            r0 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r1 == r0) goto L_0x035a
            r0 = 99657(0x18549, float:1.39649E-40)
            if (r1 != r0) goto L_0x0363
            java.lang.String r0 = "dot"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0363
        L_0x0354:
            X.7go r7 = new X.7go
            r7.<init>(r6, r2, r5)
            goto L_0x02f4
        L_0x035a:
            java.lang.String r0 = "sesame"
            boolean r0 = r7.equals(r0)
            r6 = 3
            if (r0 != 0) goto L_0x0354
        L_0x0363:
            r6 = 1
            goto L_0x0354
        L_0x0365:
            boolean r0 = r5.equals(r9)
            r5 = -2
            goto L_0x02c1
        L_0x036c:
            X.7Ud r12 = A01(r12)
            r0 = 0
            int r0 = X.C155547f5.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x037c }
            r12.A02 = r0     // Catch:{ IllegalArgumentException -> 0x037c }
            r0 = 1
            r12.A0G = r0     // Catch:{ IllegalArgumentException -> 0x037c }
            goto L_0x001c
        L_0x037c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed parsing background value: "
        L_0x0382:
            X.AnonymousClass6C7.A1F(r0, r2, r5, r1)
            goto L_0x001c
        L_0x0387:
            java.lang.String r1 = "style"
            java.lang.String r0 = r13.getName()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.7Ud r12 = A01(r12)
            r12.A0F = r2
            goto L_0x001c
        L_0x039b:
            java.lang.String r0 = "fontStyle"
            boolean r0 = r1.equals(r0)
            r1 = 0
            goto L_0x0410
        L_0x03a3:
            java.lang.String r0 = "fontFamily"
            boolean r0 = r1.equals(r0)
            r1 = 1
            goto L_0x0410
        L_0x03ab:
            java.lang.String r0 = "textAlign"
            boolean r0 = r1.equals(r0)
            r1 = 2
            goto L_0x0410
        L_0x03b3:
            java.lang.String r0 = "textDecoration"
            boolean r0 = r1.equals(r0)
            r1 = 3
            goto L_0x0410
        L_0x03bb:
            java.lang.String r0 = "fontWeight"
            boolean r0 = r1.equals(r0)
            r1 = 4
            goto L_0x0410
        L_0x03c3:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            r1 = 5
            goto L_0x0410
        L_0x03cb:
            java.lang.String r0 = "ruby"
            boolean r0 = r1.equals(r0)
            r1 = 6
            goto L_0x0410
        L_0x03d3:
            java.lang.String r0 = "color"
            boolean r0 = r1.equals(r0)
            r1 = 7
            goto L_0x0410
        L_0x03db:
            java.lang.String r0 = "shear"
            boolean r0 = r1.equals(r0)
            r1 = 8
            goto L_0x0410
        L_0x03e4:
            java.lang.String r0 = "textCombine"
            boolean r0 = r1.equals(r0)
            r1 = 9
            goto L_0x0410
        L_0x03ed:
            java.lang.String r0 = "fontSize"
            boolean r0 = r1.equals(r0)
            r1 = 10
            goto L_0x0410
        L_0x03f6:
            java.lang.String r0 = "textEmphasis"
            boolean r0 = r1.equals(r0)
            r1 = 11
            goto L_0x0410
        L_0x03ff:
            java.lang.String r0 = "rubyPosition"
            boolean r0 = r1.equals(r0)
            r1 = 12
            goto L_0x0410
        L_0x0408:
            java.lang.String r0 = "backgroundColor"
            boolean r0 = r1.equals(r0)
            r1 = 13
        L_0x0410:
            if (r0 != 0) goto L_0x0017
            goto L_0x0016
        L_0x0414:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PZ.A02(X.7Ud, org.xmlpull.v1.XmlPullParser):X.7Ud");
    }
}
