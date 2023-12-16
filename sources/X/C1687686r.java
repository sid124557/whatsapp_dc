package X;

import java.util.ArrayDeque;
import java.util.List;

/* renamed from: X.86r  reason: invalid class name and case insensitive filesystem */
public final class C1687686r implements C184868sg, C185328tT {
    public static final C180658lQ A0M = new C1686586g();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public C187028wK A0B;
    public C161467pi A0C;
    public AnonymousClass7M5[] A0D;
    public long[][] A0E;
    public final C155947fm A0F;
    public final C161467pi A0G;
    public final C161467pi A0H;
    public final C161467pi A0I;
    public final C161467pi A0J;
    public final ArrayDeque A0K;
    public final List A0L;

    public boolean BpS(C187648xa r2) {
        return C154817dn.A00(r2, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x04ed: MOVE  (r0v66 X.7i9) = (r23v0 X.7i9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0093 A[SYNTHETIC] */
    public final void A00(long r33) {
        /*
            r32 = this;
        L_0x0000:
            r9 = r32
            java.util.ArrayDeque r0 = r9.A0K
            r31 = r0
            boolean r0 = r31.isEmpty()
            if (r0 != 0) goto L_0x061e
            java.lang.Object r0 = r31.peek()
            X.6Oq r0 = (X.C126616Oq) r0
            long r1 = r0.A00
            int r0 = (r1 > r33 ? 1 : (r1 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x061e
            java.lang.Object r8 = r31.pop()
            X.6Oq r8 = (X.C126616Oq) r8
            int r1 = r8.A00
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r0) goto L_0x0606
            java.util.ArrayList r22 = X.AnonymousClass001.A0s()
            int r1 = r9.A02
            r0 = 1
            boolean r30 = X.AnonymousClass000.A1U(r1, r0)
            X.7i9 r23 = new X.7i9
            r23.<init>()
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            X.6Op r0 = r8.A01(r0)
            if (r0 == 0) goto L_0x03a5
            X.7pi r12 = r0.A00
            r11 = 8
            r12.A0S(r11)
            r3 = 0
            r10 = r3
        L_0x0047:
            int r0 = r12.A00
            int r7 = r12.A01
            int r0 = r0 - r7
            if (r0 < r11) goto L_0x0391
            int r18 = r12.A07()
            int r1 = r12.A07()
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r1 != r0) goto L_0x033c
            r12.A0S(r7)
            int r3 = r7 + r18
            r12.A0T(r11)
            int r2 = r12.A01
            r0 = 4
            r12.A0T(r0)
            int r1 = r12.A07()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r0) goto L_0x0074
            int r2 = r2 + 4
        L_0x0074:
            r12.A0S(r2)
        L_0x0077:
            int r6 = r12.A01
            if (r6 >= r3) goto L_0x033a
            int r2 = r12.A07()
            int r1 = r12.A07()
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r1 != r0) goto L_0x0334
            r12.A0S(r6)
            int r6 = r6 + r2
            r12.A0T(r11)
            java.util.ArrayList r17 = X.AnonymousClass001.A0s()
        L_0x0093:
            int r5 = r12.A01
            if (r5 >= r6) goto L_0x0326
            int r0 = r12.A07()
            int r5 = r5 + r0
            int r3 = r12.A07()
            int r0 = r3 >> 24
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 169(0xa9, float:2.37E-43)
            if (r1 == r0) goto L_0x024d
            r0 = 253(0xfd, float:3.55E-43)
            if (r1 == r0) goto L_0x024d
            r0 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r3 != r0) goto L_0x00eb
            r0 = 4
            r12.A0T(r0)     // Catch:{ all -> 0x0619 }
            int r1 = r12.A07()     // Catch:{ all -> 0x0619 }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x00c3
            int r3 = X.C161467pi.A02(r12, r11)     // Catch:{ all -> 0x0619 }
            goto L_0x00cb
        L_0x00c3:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse uint8 attribute value"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0619 }
            r3 = -1
        L_0x00cb:
            r2 = 0
            if (r3 <= 0) goto L_0x00e2
            java.lang.String[] r1 = X.C161057ov.A00     // Catch:{ all -> 0x0619 }
            int r0 = r1.length     // Catch:{ all -> 0x0619 }
            if (r3 > r0) goto L_0x00e2
            int r0 = r3 + -1
            r1 = r1[r0]     // Catch:{ all -> 0x0619 }
            if (r1 == 0) goto L_0x00e2
            java.lang.String r0 = "TCON"
            X.6P5 r4 = new X.6P5     // Catch:{ all -> 0x0619 }
            r4.<init>(r0, r2, r1)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x00e2:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse standard genre code"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0619 }
            goto L_0x0319
        L_0x00eb:
            r0 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r3 != r0) goto L_0x00f8
            java.lang.String r0 = "TPOS"
            X.6P5 r4 = X.C161057ov.A01(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x00f8:
            r0 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r3 != r0) goto L_0x0105
            java.lang.String r0 = "TRCK"
            X.6P5 r4 = X.C161057ov.A01(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x0105:
            r0 = 1953329263(0x746d706f, float:7.5247484E31)
            r1 = 0
            r2 = 1
            if (r3 != r0) goto L_0x0114
            java.lang.String r0 = "TBPM"
            X.87X r4 = X.C161057ov.A00(r12, r0, r3, r2, r1)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x0114:
            r0 = 1668311404(0x6370696c, float:4.434815E21)
            if (r3 != r0) goto L_0x0121
            java.lang.String r0 = "TCMP"
            X.87X r4 = X.C161057ov.A00(r12, r0, r3, r2, r2)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x0121:
            r0 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r3 != r0) goto L_0x0170
            int r13 = r12.A07()     // Catch:{ all -> 0x0619 }
            int r4 = r12.A07()     // Catch:{ all -> 0x0619 }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r3 = "MetadataUtil"
            r2 = 0
            if (r4 != r0) goto L_0x015e
            int r4 = r12.A07()     // Catch:{ all -> 0x0619 }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            r0 = 13
            if (r4 != r0) goto L_0x0157
            java.lang.String r3 = "image/jpeg"
        L_0x0144:
            r0 = 4
            r12.A0T(r0)     // Catch:{ all -> 0x0619 }
            int r4 = r13 + -16
            byte[] r0 = new byte[r4]     // Catch:{ all -> 0x0619 }
            r12.A0V(r0, r1, r4)     // Catch:{ all -> 0x0619 }
            r1 = 3
            X.6P9 r4 = new X.6P9     // Catch:{ all -> 0x0619 }
            r4.<init>(r3, r2, r0, r1)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x0157:
            r0 = 14
            if (r4 != r0) goto L_0x0161
            java.lang.String r3 = "image/png"
            goto L_0x0144
        L_0x015e:
            java.lang.String r0 = "Failed to parse cover art attribute"
            goto L_0x016b
        L_0x0161:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0619 }
            java.lang.String r0 = "Unrecognized cover art flags: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ all -> 0x0619 }
        L_0x016b:
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0619 }
            goto L_0x0319
        L_0x0170:
            r0 = 1631670868(0x61415254, float:2.2288462E20)
            if (r3 != r0) goto L_0x017d
            java.lang.String r0 = "TPE2"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x017d:
            r0 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r3 != r0) goto L_0x018a
            java.lang.String r0 = "TSOT"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x018a:
            r0 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r3 != r0) goto L_0x0197
            java.lang.String r0 = "TSO2"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x0197:
            r0 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r3 != r0) goto L_0x01a4
            java.lang.String r0 = "TSOA"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x01a4:
            r0 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r3 != r0) goto L_0x01b1
            java.lang.String r0 = "TSOP"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x01b1:
            r0 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r3 != r0) goto L_0x01be
            java.lang.String r0 = "TSOC"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x01be:
            r0 = 1920233063(0x72746e67, float:4.84146E30)
            if (r3 != r0) goto L_0x01cb
            java.lang.String r0 = "ITUNESADVISORY"
            X.87X r4 = X.C161057ov.A00(r12, r0, r3, r1, r1)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x01cb:
            r0 = 1885823344(0x70676170, float:2.8643533E29)
            if (r3 != r0) goto L_0x01d8
            java.lang.String r0 = "ITUNESGAPLESS"
            X.87X r4 = X.C161057ov.A00(r12, r0, r3, r1, r2)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x01d8:
            r0 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r3 != r0) goto L_0x01e5
            java.lang.String r0 = "TVSHOWSORT"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x01e5:
            r0 = 1953919848(0x74767368, float:7.810338E31)
            if (r3 != r0) goto L_0x01f2
            java.lang.String r0 = "TVSHOW"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x01f2:
            r0 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r3 != r0) goto L_0x02f0
            r4 = 0
            r13 = r4
            r3 = r4
            r2 = -1
            r1 = -1
        L_0x01fc:
            int r15 = r12.A01     // Catch:{ all -> 0x0619 }
            if (r15 >= r5) goto L_0x0232
            int r16 = r12.A07()     // Catch:{ all -> 0x0619 }
            int r0 = r12.A07()     // Catch:{ all -> 0x0619 }
            r14 = 4
            r12.A0T(r14)     // Catch:{ all -> 0x0619 }
            r14 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r0 != r14) goto L_0x0218
            int r0 = r16 + -12
            java.lang.String r13 = r12.A0N(r0)     // Catch:{ all -> 0x0619 }
            goto L_0x01fc
        L_0x0218:
            r14 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r0 != r14) goto L_0x0224
            int r0 = r16 + -12
            java.lang.String r3 = r12.A0N(r0)     // Catch:{ all -> 0x0619 }
            goto L_0x01fc
        L_0x0224:
            r14 = 1684108385(0x64617461, float:1.6635614E22)
            if (r0 != r14) goto L_0x022c
            r2 = r15
            r1 = r16
        L_0x022c:
            int r0 = r16 + -12
            r12.A0T(r0)     // Catch:{ all -> 0x0619 }
            goto L_0x01fc
        L_0x0232:
            if (r13 == 0) goto L_0x031a
            if (r3 == 0) goto L_0x031a
            r0 = -1
            if (r2 == r0) goto L_0x031a
            r12.A0S(r2)     // Catch:{ all -> 0x0619 }
            r0 = 16
            r12.A0T(r0)     // Catch:{ all -> 0x0619 }
            int r1 = r1 - r0
            java.lang.String r0 = r12.A0N(r1)     // Catch:{ all -> 0x0619 }
            X.6P8 r4 = new X.6P8     // Catch:{ all -> 0x0619 }
            r4.<init>(r13, r3, r0)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x024d:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r0 = 6516084(0x636d74, float:9.130979E-39)
            if (r1 != r0) goto L_0x0288
            int r2 = r12.A07()     // Catch:{ all -> 0x0619 }
            int r1 = r12.A07()     // Catch:{ all -> 0x0619 }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0275
            r12.A0T(r11)     // Catch:{ all -> 0x0619 }
            int r0 = r2 + -16
            java.lang.String r1 = r12.A0N(r0)     // Catch:{ all -> 0x0619 }
            java.lang.String r0 = "und"
            X.6P7 r4 = new X.6P7     // Catch:{ all -> 0x0619 }
            r4.<init>(r0, r1, r1)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x0275:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0619 }
            java.lang.String r0 = "Failed to parse comment attribute: "
            r1.append(r0)     // Catch:{ all -> 0x0619 }
            java.lang.String r0 = X.C157147ho.A00(r3)     // Catch:{ all -> 0x0619 }
            X.AnonymousClass6C7.A1N(r1, r0)     // Catch:{ all -> 0x0619 }
            r4 = 0
            goto L_0x031a
        L_0x0288:
            r0 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r1 == r0) goto L_0x0312
            r0 = 7631467(0x74726b, float:1.0693963E-38)
            if (r1 == r0) goto L_0x0312
            r0 = 6516589(0x636f6d, float:9.131686E-39)
            if (r1 == r0) goto L_0x030b
            r0 = 7828084(0x777274, float:1.0969482E-38)
            if (r1 == r0) goto L_0x030b
            r0 = 6578553(0x646179, float:9.218516E-39)
            if (r1 != r0) goto L_0x02a8
            java.lang.String r0 = "TDRC"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x02a8:
            r0 = 4280916(0x415254, float:5.998841E-39)
            if (r1 != r0) goto L_0x02b4
            java.lang.String r0 = "TPE1"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x02b4:
            r0 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r1 != r0) goto L_0x02c0
            java.lang.String r0 = "TSSE"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x02c0:
            r0 = 6384738(0x616c62, float:8.946924E-39)
            if (r1 != r0) goto L_0x02cc
            java.lang.String r0 = "TALB"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x02cc:
            r0 = 7108978(0x6c7972, float:9.9618E-39)
            if (r1 != r0) goto L_0x02d8
            java.lang.String r0 = "USLT"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x02d8:
            r0 = 6776174(0x67656e, float:9.495442E-39)
            if (r1 != r0) goto L_0x02e4
            java.lang.String r0 = "TCON"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x02e4:
            r0 = 6779504(0x677270, float:9.500109E-39)
            if (r1 != r0) goto L_0x02f0
            java.lang.String r0 = "TIT1"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x02f0:
            java.lang.String r2 = "MetadataUtil"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0619 }
            java.lang.String r0 = "Skipped unknown metadata entry: "
            r1.append(r0)     // Catch:{ all -> 0x0619 }
            java.lang.String r0 = X.C157147ho.A00(r3)     // Catch:{ all -> 0x0619 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0619 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0619 }
            r12.A0S(r5)
            goto L_0x0093
        L_0x030b:
            java.lang.String r0 = "TCOM"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x0312:
            java.lang.String r0 = "TIT2"
            X.6P5 r4 = X.C161057ov.A02(r12, r0, r3)     // Catch:{ all -> 0x0619 }
            goto L_0x031a
        L_0x0319:
            r4 = r2
        L_0x031a:
            r12.A0S(r5)
            if (r4 == 0) goto L_0x0093
            r0 = r17
            r0.add(r4)
            goto L_0x0093
        L_0x0326:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x033a
            X.7ys r3 = new X.7ys
            r0 = r17
            r3.<init>((java.util.List) r0)
            goto L_0x0382
        L_0x0334:
            int r6 = r6 + r2
            r12.A0S(r6)
            goto L_0x0077
        L_0x033a:
            r3 = 0
            goto L_0x0382
        L_0x033c:
            r0 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r1 != r0) goto L_0x0382
            r12.A0S(r7)
            int r6 = r7 + r18
            r2 = 12
            r12.A0T(r2)
        L_0x034b:
            int r5 = r12.A01
            r10 = 0
            if (r5 >= r6) goto L_0x0382
            int r4 = r12.A07()
            int r1 = r12.A07()
            r0 = 1935766900(0x73617574, float:1.7862687E31)
            if (r1 != r0) goto L_0x038c
            r0 = 14
            if (r4 < r0) goto L_0x0382
            r0 = 5
            int r1 = X.C161467pi.A02(r12, r0)
            if (r1 == r2) goto L_0x0389
            r0 = 13
            if (r1 != r0) goto L_0x0382
            r4 = 1123024896(0x42f00000, float:120.0)
        L_0x036e:
            r1 = 1
            int r0 = X.C161467pi.A02(r12, r1)
            X.8x6[] r2 = new X.C187368x6[r1]
            X.87a r1 = new X.87a
            r1.<init>(r4, r0)
            r0 = 0
            r2[r0] = r1
            X.7ys r10 = new X.7ys
            r10.<init>((X.C187368x6[]) r2)
        L_0x0382:
            int r7 = r7 + r18
            r12.A0S(r7)
            goto L_0x0047
        L_0x0389:
            r4 = 1131413504(0x43700000, float:240.0)
            goto L_0x036e
        L_0x038c:
            int r5 = r5 + r4
            r12.A0S(r5)
            goto L_0x034b
        L_0x0391:
            android.util.Pair r0 = android.util.Pair.create(r3, r10)
            java.lang.Object r7 = r0.first
            X.7ys r7 = (X.C166547ys) r7
            java.lang.Object r0 = r0.second
            r21 = r0
            if (r7 == 0) goto L_0x03a8
            r0 = r23
            r0.A00(r7)
            goto L_0x03a8
        L_0x03a5:
            r21 = 0
            r7 = 0
        L_0x03a8:
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            X.6Oq r3 = r8.A00(r0)
            if (r3 == 0) goto L_0x0462
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.6Op r1 = r3.A01(r0)
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            X.6Op r2 = r3.A01(r0)
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            X.6Op r4 = r3.A01(r0)
            r15 = 0
            if (r1 == 0) goto L_0x046f
            if (r2 == 0) goto L_0x046f
            if (r4 == 0) goto L_0x046f
            X.7pi r1 = r1.A00
            r0 = 16
            int r1 = X.C161467pi.A04(r1, r0)
            r0 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r1 != r0) goto L_0x046f
            X.7pi r3 = r2.A00
            r0 = 12
            int r12 = X.C161467pi.A04(r3, r0)
            java.lang.String[] r11 = new java.lang.String[r12]
            r2 = 0
        L_0x03e5:
            r10 = 8
            if (r2 >= r12) goto L_0x03fb
            int r1 = r3.A07()
            r0 = 4
            r3.A0T(r0)
            int r1 = r1 - r10
            java.lang.String r0 = r3.A0O(r1)
            r11[r2] = r0
            int r2 = r2 + 1
            goto L_0x03e5
        L_0x03fb:
            X.7pi r6 = r4.A00
            r6.A0S(r10)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
        L_0x0404:
            int r0 = r6.A00
            int r4 = r6.A01
            int r0 = r0 - r4
            if (r0 <= r10) goto L_0x0464
            int r17 = r6.A07()
            int r0 = r6.A07()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x0452
            if (r2 >= r12) goto L_0x0452
            r14 = r11[r2]
            int r3 = r4 + r17
        L_0x041d:
            int r2 = r6.A01
            if (r2 >= r3) goto L_0x0446
            int r16 = r6.A07()
            int r1 = r6.A07()
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x044c
            int r13 = r6.A07()
            int r3 = r6.A07()
            int r2 = r16 + -16
            byte[] r1 = new byte[r2]
            r0 = 0
            r6.A0V(r1, r0, r2)
            X.87c r0 = new X.87c
            r0.<init>(r1, r3, r13, r14)
            r5.add(r0)
        L_0x0446:
            int r4 = r4 + r17
            r6.A0S(r4)
            goto L_0x0404
        L_0x044c:
            int r2 = r2 + r16
            r6.A0S(r2)
            goto L_0x041d
        L_0x0452:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipped metadata with unknown key index: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r2)
            java.lang.String r0 = "AtomParsers"
            android.util.Log.w(r0, r1)
            goto L_0x0446
        L_0x0462:
            r15 = 0
            goto L_0x046f
        L_0x0464:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x046f
            X.7ys r15 = new X.7ys
            r15.<init>((java.util.List) r5)
        L_0x046f:
            r2 = 0
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            X.922 r0 = new X.922
            r0.<init>(r2)
            r25 = r23
            r26 = r8
            r27 = r0
            java.util.List r20 = X.C161587q0.A03(r24, r25, r26, r27, r28, r30)
            X.8wK r0 = r9.A0B
            r24 = r0
            r24.getClass()
            int r19 = r20.size()
            r5 = 0
            r18 = -1
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0499:
            r0 = r19
            if (r5 >= r0) goto L_0x057e
            r0 = r20
            java.lang.Object r10 = r0.get(r5)
            X.7UO r10 = (X.AnonymousClass7UO) r10
            int r0 = r10.A01
            if (r0 == 0) goto L_0x0546
            X.7Q0 r4 = r10.A03
            long r0 = r4.A04
            int r3 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r3 != 0) goto L_0x04b3
            long r0 = r10.A02
        L_0x04b3:
            long r12 = java.lang.Math.max(r12, r0)
            int r8 = r4.A03
            r3 = r24
            X.8tw r3 = r3.Br0(r5, r8)
            X.7M5 r14 = new X.7M5
            r14.<init>(r3, r4, r10)
            int r3 = r10.A00
            int r11 = r3 + 30
            X.7yp r6 = r4.A07
            X.7he r3 = new X.7he
            r3.<init>(r6)
            r3.A08 = r11
            r6 = 2
            if (r8 != r6) goto L_0x04e8
            r16 = 0
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x04e8
            int r8 = r10.A01
            r6 = 1
            if (r8 <= r6) goto L_0x04e8
            float r8 = (float) r8
            float r6 = (float) r0
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r6 = r6 / r0
            float r8 = r8 / r6
            r3.A00 = r8
        L_0x04e8:
            int r10 = r4.A03
            r6 = 1
            if (r10 != r6) goto L_0x04fc
            r0 = r23
            int r8 = r0.A00
            r1 = -1
            if (r8 == r1) goto L_0x04fc
            int r0 = r0.A01
            if (r0 == r1) goto L_0x04fc
            r3.A05 = r8
            r3.A06 = r0
        L_0x04fc:
            r0 = 2
            X.7ys[] r8 = new X.C166547ys[r0]
            r8[r2] = r21
            java.util.List r1 = r9.A0L
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0578
            r0 = 0
        L_0x050a:
            r8[r6] = r0
            r1 = r7
            r6 = 0
            X.8x6[] r11 = new X.C187368x6[r2]
            X.7ys r16 = new X.7ys
            r0 = r16
            r0.<init>((X.C187368x6[]) r11)
            r0 = 1
            if (r10 != r0) goto L_0x054a
            if (r7 == 0) goto L_0x0575
        L_0x051c:
            r0 = r8[r6]
            X.7ys r1 = r1.A00(r0)
            int r6 = r6 + 1
            r0 = 2
            if (r6 < r0) goto L_0x051c
            X.8x6[] r0 = r1.A00
            int r0 = r0.length
            if (r0 <= 0) goto L_0x052e
            r3.A0J = r1
        L_0x052e:
            X.8tw r0 = r14.A01
            X.C166527yp.A01(r3, r0)
            int r1 = r4.A03
            r0 = 2
            if (r1 != r0) goto L_0x0541
            r1 = -1
            r0 = r18
            if (r0 != r1) goto L_0x0541
            int r18 = r22.size()
        L_0x0541:
            r0 = r22
            r0.add(r14)
        L_0x0546:
            int r5 = r5 + 1
            goto L_0x0499
        L_0x054a:
            r0 = 2
            if (r10 != r0) goto L_0x0575
            if (r15 == 0) goto L_0x0575
            r11 = 0
        L_0x0550:
            X.8x6[] r1 = r15.A00
            int r0 = r1.length
            if (r11 >= r0) goto L_0x0575
            r10 = r1[r11]
            boolean r0 = r10 instanceof X.C1688787c
            if (r0 == 0) goto L_0x0572
            X.87c r10 = (X.C1688787c) r10
            java.lang.String r1 = r10.A02
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0572
            r0 = 1
            X.8x6[] r0 = new X.C187368x6[r0]
            r0[r2] = r10
            X.7ys r1 = new X.7ys
            r1.<init>((X.C187368x6[]) r0)
            goto L_0x051c
        L_0x0572:
            int r11 = r11 + 1
            goto L_0x0550
        L_0x0575:
            r1 = r16
            goto L_0x051c
        L_0x0578:
            X.7ys r0 = new X.7ys
            r0.<init>((java.util.List) r1)
            goto L_0x050a
        L_0x057e:
            r0 = r18
            r9.A03 = r0
            r9.A0A = r12
            X.7M5[] r1 = new X.AnonymousClass7M5[r2]
            r0 = r22
            java.lang.Object[] r10 = r0.toArray(r1)
            X.7M5[] r10 = (X.AnonymousClass7M5[]) r10
            r9.A0D = r10
            int r8 = r10.length
            long[][] r7 = new long[r8][]
            int[] r6 = new int[r8]
            long[] r5 = new long[r8]
            boolean[] r4 = new boolean[r8]
            r3 = 0
            r11 = 0
        L_0x059b:
            if (r11 >= r8) goto L_0x05b4
            r0 = r10[r11]
            X.7UO r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r7[r11] = r0
            r0 = r10[r11]
            X.7UO r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r2]
            r5[r11] = r0
            int r11 = r11 + 1
            goto L_0x059b
        L_0x05b4:
            r15 = 0
        L_0x05b6:
            if (r3 >= r8) goto L_0x05f4
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = -1
            r11 = 0
        L_0x05bf:
            if (r11 >= r8) goto L_0x05d0
            boolean r0 = r4[r11]
            if (r0 != 0) goto L_0x05cd
            r1 = r5[r11]
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x05cd
            r14 = r11
            r12 = r1
        L_0x05cd:
            int r11 = r11 + 1
            goto L_0x05bf
        L_0x05d0:
            r13 = r6[r14]
            r12 = r7[r14]
            r12[r13] = r15
            r0 = r10[r14]
            X.7UO r11 = r0.A03
            int[] r0 = r11.A05
            r0 = r0[r13]
            long r0 = (long) r0
            long r15 = r15 + r0
            r2 = 1
            int r1 = r13 + 1
            r6[r14] = r1
            int r0 = r12.length
            if (r1 >= r0) goto L_0x05ef
            long[] r0 = r11.A07
            r0 = r0[r1]
            r5[r14] = r0
            goto L_0x05b6
        L_0x05ef:
            r4[r14] = r2
            int r3 = r3 + 1
            goto L_0x05b6
        L_0x05f4:
            r9.A0E = r7
            r24.B2W()
            r0 = r24
            r0.Bl0(r9)
            r31.clear()
            r0 = 2
            r9.A04 = r0
            goto L_0x0000
        L_0x0606:
            boolean r0 = r31.isEmpty()
            if (r0 != 0) goto L_0x0000
            java.lang.Object r0 = r31.peek()
            X.6Oq r0 = (X.C126616Oq) r0
            java.util.List r0 = r0.A01
            r0.add(r8)
            goto L_0x0000
        L_0x0619:
            r0 = move-exception
            r12.A0S(r5)
            throw r0
        L_0x061e:
            int r1 = r9.A04
            r0 = 2
            if (r1 == r0) goto L_0x0628
            r0 = 0
            r9.A04 = r0
            r9.A00 = r0
        L_0x0628:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687686r.A00(long):void");
    }

    public long B7B() {
        return this.A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r3 == -1) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0095, code lost:
        if (r7 == -1) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C152177Xv BCb(long r13) {
        /*
            r12 = this;
            X.7M5[] r0 = r12.A0D
            r0.getClass()
            int r0 = r0.length
            if (r0 == 0) goto L_0x0032
            int r1 = r12.A03
            r8 = -1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == r8) goto L_0x0062
            X.7M5[] r0 = r12.A0D
            r0 = r0[r1]
            X.7UO r9 = r0.A03
            long[] r1 = r9.A07
            r0 = 0
            int r3 = X.C162387ry.A04(r1, r13, r0)
        L_0x001f:
            if (r3 < 0) goto L_0x002c
            int[] r0 = r9.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x003a
            int r3 = r3 + -1
            goto L_0x001f
        L_0x002c:
            int r3 = r9.A00(r13)
            if (r3 != r8) goto L_0x003a
        L_0x0032:
            X.7jy r1 = X.C158437jy.A02
            X.7Xv r0 = new X.7Xv
            r0.<init>(r1, r1)
            return r0
        L_0x003a:
            long[] r2 = r9.A07
            r6 = r2[r3]
            long[] r1 = r9.A06
            r4 = r1[r3]
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x005a
            int r0 = r9.A01
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x005a
            int r0 = r9.A00(r13)
            if (r0 == r8) goto L_0x005a
            if (r0 == r3) goto L_0x005a
            r2 = r2[r0]
            r0 = r1[r0]
        L_0x0058:
            r13 = r6
            goto L_0x006e
        L_0x005a:
            r0 = -1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0058
        L_0x0062:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = -1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006e:
            r8 = 0
        L_0x006f:
            X.7M5[] r7 = r12.A0D
            int r6 = r7.length
            if (r8 >= r6) goto L_0x00cb
            int r6 = r12.A03
            if (r8 == r6) goto L_0x00bf
            r6 = r7[r8]
            X.7UO r9 = r6.A03
            long[] r7 = r9.A07
            r6 = 0
            int r7 = X.C162387ry.A04(r7, r13, r6)
        L_0x0083:
            if (r7 < 0) goto L_0x0090
            int[] r6 = r9.A04
            r6 = r6[r7]
            r6 = r6 & 1
            if (r6 != 0) goto L_0x00af
            int r7 = r7 + -1
            goto L_0x0083
        L_0x0090:
            int r7 = r9.A00(r13)
            r6 = -1
            if (r7 != r6) goto L_0x00af
        L_0x0097:
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00bf
            long[] r7 = r9.A07
            r6 = 0
            int r7 = X.C162387ry.A04(r7, r2, r6)
        L_0x00a2:
            if (r7 < 0) goto L_0x00b8
            int[] r6 = r9.A04
            r6 = r6[r7]
            r6 = r6 & 1
            if (r6 != 0) goto L_0x00c2
            int r7 = r7 + -1
            goto L_0x00a2
        L_0x00af:
            long[] r6 = r9.A06
            r6 = r6[r7]
            long r4 = java.lang.Math.min(r6, r4)
            goto L_0x0097
        L_0x00b8:
            int r7 = r9.A00(r2)
            r6 = -1
            if (r7 != r6) goto L_0x00c2
        L_0x00bf:
            int r8 = r8 + 1
            goto L_0x006f
        L_0x00c2:
            long[] r6 = r9.A06
            r6 = r6[r7]
            long r0 = java.lang.Math.min(r6, r0)
            goto L_0x00bf
        L_0x00cb:
            X.7jy r6 = new X.7jy
            r6.<init>(r13, r4)
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x00da
            X.7Xv r0 = new X.7Xv
            r0.<init>(r6, r6)
            return r0
        L_0x00da:
            X.7Xv r0 = X.C152177Xv.A00(r6, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687686r.BCb(long):X.7Xv");
    }

    public void BFs(C187028wK r1) {
        this.A0B = r1;
    }

    public boolean BIq() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r4 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r15 < r17) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r4 = r1;
        r17 = r15;
        r11 = r5;
        r19 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r9 >= r21) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        r6 = r1;
        r3 = r5;
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (true == r4) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x025e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiD(X.C187648xa r26, X.AnonymousClass7BG r27) {
        /*
            r25 = this;
        L_0x0000:
            r8 = r25
            int r0 = r8.A04
            r12 = r26
            if (r0 == 0) goto L_0x00f1
            r13 = 1
            r14 = r27
            if (r0 == r13) goto L_0x006e
            long r23 = r12.BBW()
            int r3 = r8.A08
            r7 = -1
            if (r3 != r7) goto L_0x0280
            r3 = -1
            r11 = -1
            r5 = 0
            r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 1
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x002a:
            X.7M5[] r1 = r8.A0D
            int r0 = r1.length
            if (r5 >= r0) goto L_0x0265
            r0 = r1[r5]
            int r2 = r0.A00
            X.7UO r1 = r0.A03
            int r0 = r1.A01
            if (r2 == r0) goto L_0x0067
            long[] r0 = r1.A06
            r15 = r0[r2]
            long[][] r0 = r8.A0E
            r0 = r0[r5]
            r9 = r0[r2]
            long r15 = r15 - r23
            r1 = 0
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006a
            r1 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            r1 = 0
            if (r4 != 0) goto L_0x0059
        L_0x0055:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
        L_0x0059:
            r4 = r1
            r17 = r15
            r11 = r5
            r19 = r9
        L_0x005f:
            int r0 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x0067
            r6 = r1
            r3 = r5
            r21 = r9
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x006a:
            r1 = 1
            if (r13 != r4) goto L_0x005f
            goto L_0x0055
        L_0x006e:
            long r2 = r8.A09
            int r7 = r8.A00
            long r0 = (long) r7
            long r2 = r2 - r0
            long r0 = r12.BBW()
            long r0 = r0 + r2
            X.7pi r5 = r8.A0C
            if (r5 == 0) goto L_0x00d2
            byte[] r6 = r5.A02
            int r4 = (int) r2
            r12.readFully(r6, r7, r4)
            int r3 = r8.A01
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r3 != r2) goto L_0x00b7
            r2 = 8
            int r3 = X.C161467pi.A04(r5, r2)
            r2 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r2) goto L_0x00b5
            r2 = 1903435808(0x71742020, float:1.2088509E30)
            if (r3 == r2) goto L_0x00b3
            r2 = 4
            r5.A0T(r2)
        L_0x009e:
            int r2 = X.C161467pi.A00(r5)
            if (r2 <= 0) goto L_0x00e2
            int r3 = r5.A07()
            r2 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r2) goto L_0x00b5
            r2 = 1903435808(0x71742020, float:1.2088509E30)
            if (r3 == r2) goto L_0x00b3
            goto L_0x009e
        L_0x00b3:
            r2 = 1
            goto L_0x00e3
        L_0x00b5:
            r2 = 2
            goto L_0x00e3
        L_0x00b7:
            java.util.ArrayDeque r3 = r8.A0K
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00e5
            java.lang.Object r4 = r3.peek()
            X.6Oq r4 = (X.C126616Oq) r4
            int r2 = r8.A01
            X.6Op r3 = new X.6Op
            r3.<init>(r5, r2)
            java.util.List r2 = r4.A02
            r2.add(r3)
            goto L_0x00e5
        L_0x00d2:
            r5 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00de
            int r4 = (int) r2
            r12.BpP(r4)
            goto L_0x00e5
        L_0x00de:
            r14.A00 = r0
            r2 = 1
            goto L_0x00e6
        L_0x00e2:
            r2 = 0
        L_0x00e3:
            r8.A02 = r2
        L_0x00e5:
            r2 = 0
        L_0x00e6:
            r8.A00(r0)
            if (r2 == 0) goto L_0x0000
            int r1 = r8.A04
            r0 = 2
            if (r1 == r0) goto L_0x0000
            return r13
        L_0x00f1:
            int r0 = r8.A00
            r9 = 1
            r7 = 8
            r6 = 0
            if (r0 != 0) goto L_0x0114
            X.7pi r2 = r8.A0G
            byte[] r0 = r2.A02
            boolean r0 = r12.BiM(r0, r6, r7, r9)
            if (r0 == 0) goto L_0x027e
            r8.A00 = r7
            r2.A0S(r6)
            long r0 = r2.A0I()
            r8.A09 = r0
            int r0 = r2.A07()
            r8.A01 = r0
        L_0x0114:
            long r0 = r8.A09
            r3 = 1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01e0
            X.7pi r1 = r8.A0G
            byte[] r0 = r1.A02
            r12.readFully(r0, r7, r7)
            int r0 = r8.A00
            int r0 = r0 + 8
            r8.A00 = r0
            long r2 = r1.A0J()
        L_0x012d:
            r8.A09 = r2
        L_0x012f:
            long r4 = r8.A09
            int r1 = r8.A00
            long r2 = (long) r1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x025e
            int r10 = r8.A01
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r10 == r0) goto L_0x020b
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r10 == r0) goto L_0x020b
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r10 == r0) goto L_0x020b
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r10 == r0) goto L_0x020b
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r10 == r0) goto L_0x020b
            r0 = 1701082227(0x65647473, float:6.742798E22)
            if (r10 == r0) goto L_0x020b
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r10 == r0) goto L_0x020b
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r10 == r0) goto L_0x01be
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r10 == r0) goto L_0x01be
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r10 == r0) goto L_0x01be
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r10 == r0) goto L_0x01be
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r10 == r0) goto L_0x01be
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r10 == r0) goto L_0x01be
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r10 == r0) goto L_0x01be
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r10 == r0) goto L_0x01be
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r10 == r0) goto L_0x01be
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r10 == r0) goto L_0x01be
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r10 == r0) goto L_0x01be
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r10 == r0) goto L_0x01be
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r10 == r0) goto L_0x01be
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r10 == r0) goto L_0x01be
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 == r0) goto L_0x01be
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r10 == r0) goto L_0x01be
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r10 == r0) goto L_0x01be
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r10 == r0) goto L_0x01be
            r2 = 0
        L_0x01b8:
            r8.A0C = r2
            r8.A04 = r9
            goto L_0x0000
        L_0x01be:
            boolean r0 = X.AnonymousClass000.A1U(r1, r7)
            X.C161487pm.A04(r0)
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass0x7.A1P(r0)
            X.C161487pm.A04(r0)
            int r0 = (int) r4
            X.7pi r2 = X.C161467pi.A05(r0)
            X.7pi r0 = r8.A0G
            byte[] r1 = r0.A02
            byte[] r0 = r2.A02
            java.lang.System.arraycopy(r1, r6, r0, r6, r7)
            goto L_0x01b8
        L_0x01e0:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x012f
            long r2 = r12.getLength()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01fc
            java.util.ArrayDeque r0 = r8.A0K
            java.lang.Object r0 = r0.peek()
            X.6Oq r0 = (X.C126616Oq) r0
            if (r0 == 0) goto L_0x01fc
            long r2 = r0.A00
        L_0x01fc:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x012f
            long r0 = r12.BBW()
            long r2 = r2 - r0
            int r0 = r8.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            goto L_0x012d
        L_0x020b:
            long r0 = r12.BBW()
            long r0 = r0 + r4
            long r0 = r0 - r2
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x023e
            r2 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r10 != r2) goto L_0x023e
            X.7pi r5 = r8.A0J
            r5.A0Q(r7)
            X.C161467pi.A06(r12, r5, r7)
            int r4 = r5.A01
            r2 = 4
            r5.A0T(r2)
            int r3 = r5.A07()
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 == r2) goto L_0x0233
            int r4 = r4 + 4
        L_0x0233:
            r5.A0S(r4)
            int r2 = r5.A01
            r12.BpP(r2)
            r12.Bjy()
        L_0x023e:
            java.util.ArrayDeque r4 = r8.A0K
            int r3 = r8.A01
            X.6Oq r2 = new X.6Oq
            r2.<init>(r3, r0)
            r4.push(r2)
            long r9 = r8.A09
            int r2 = r8.A00
            long r3 = (long) r2
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0258
            r8.A00(r0)
            goto L_0x0000
        L_0x0258:
            r8.A04 = r6
            r8.A00 = r6
            goto L_0x0000
        L_0x025e:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x0265:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0279
            if (r6 == 0) goto L_0x0279
            r0 = 10485760(0xa00000, double:5.180654E-317)
            long r21 = r21 + r0
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x027a
        L_0x0279:
            r3 = r11
        L_0x027a:
            r8.A08 = r3
            if (r3 != r7) goto L_0x0280
        L_0x027e:
            r0 = -1
            return r0
        L_0x0280:
            X.7M5[] r0 = r8.A0D
            r6 = r0[r3]
            X.8tw r10 = r6.A01
            int r11 = r6.A00
            X.7UO r1 = r6.A03
            long[] r0 = r1.A06
            r4 = r0[r11]
            int[] r0 = r1.A05
            r9 = r0[r11]
            long r2 = r4 - r23
            int r0 = r8.A05
            long r0 = (long) r0
            long r2 = r2 + r0
            r15 = 0
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0375
            r15 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0375
            X.7Q0 r0 = r6.A02
            int r0 = r0.A02
            if (r0 != r13) goto L_0x02b0
            r0 = 8
            long r2 = r2 + r0
            int r9 = r9 + -8
        L_0x02b0:
            int r0 = (int) r2
            r12.BpP(r0)
            X.7Q0 r0 = r6.A02
            int r5 = r0.A01
            r2 = 0
            if (r5 == 0) goto L_0x030c
            X.7pi r4 = r8.A0H
            byte[] r3 = r4.A02
            r3[r2] = r2
            r3[r13] = r2
            r0 = 2
            r3[r0] = r2
            int r13 = 4 - r5
        L_0x02c8:
            int r0 = r8.A06
            if (r0 >= r9) goto L_0x0355
            int r0 = r8.A07
            if (r0 != 0) goto L_0x02f1
            r12.readFully(r3, r13, r5)
            int r0 = r8.A05
            int r0 = r0 + r5
            r8.A05 = r0
            int r0 = X.C161467pi.A04(r4, r2)
            if (r0 < 0) goto L_0x0305
            r8.A07 = r0
            X.7pi r1 = r8.A0I
            r1.A0S(r2)
            r0 = 4
            r10.Bkc(r1, r0)
            int r0 = r8.A06
            int r0 = r0 + 4
            r8.A06 = r0
            int r9 = r9 + r13
            goto L_0x02c8
        L_0x02f1:
            int r1 = r10.Bkf(r12, r0, r2, r2)
            int r0 = r8.A05
            int r0 = r0 + r1
            r8.A05 = r0
            int r0 = r8.A06
            int r0 = r0 + r1
            r8.A06 = r0
            int r0 = r8.A07
            int r0 = r0 - r1
            r8.A07 = r0
            goto L_0x02c8
        L_0x0305:
            java.lang.String r0 = "Invalid NAL length"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x030c:
            X.7yp r0 = r0.A07
            java.lang.String r1 = r0.A0T
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x033b
            int r0 = r8.A06
            if (r0 != 0) goto L_0x0339
            X.7pi r3 = r8.A0J
            r0 = 7
            r3.A0Q(r0)
            byte[] r1 = r3.A02
            r0 = -84
            r1[r2] = r0
            r0 = 64
            r1[r13] = r0
            X.AnonymousClass6C9.A1F(r1, r9)
            r0 = 7
            r10.Bkc(r3, r0)
            int r0 = r8.A06
            int r0 = r0 + 7
            r8.A06 = r0
        L_0x0339:
            int r9 = r9 + 7
        L_0x033b:
            int r0 = r8.A06
            if (r0 >= r9) goto L_0x0355
            int r0 = r9 - r0
            int r1 = r10.Bkf(r12, r0, r2, r2)
            int r0 = r8.A05
            int r0 = r0 + r1
            r8.A05 = r0
            int r0 = r8.A06
            int r0 = r0 + r1
            r8.A06 = r0
            int r0 = r8.A07
            int r0 = r0 - r1
            r8.A07 = r0
            goto L_0x033b
        L_0x0355:
            X.7UO r1 = r6.A03
            long[] r0 = r1.A07
            r15 = r0[r11]
            int[] r0 = r1.A04
            r12 = r0[r11]
            r11 = 0
            r13 = r9
            r14 = r2
            r10.Bkh(r11, r12, r13, r14, r15)
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            r8.A08 = r7
            r8.A05 = r2
            r8.A06 = r2
            r8.A07 = r2
            r0 = 0
            return r0
        L_0x0375:
            r14.A00 = r4
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687686r.BiD(X.8xa, X.7BG):int");
    }

    public void Bkz(long j, long j2) {
        this.A0K.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j == 0) {
            this.A04 = 0;
            this.A00 = 0;
            return;
        }
        AnonymousClass7M5[] r6 = this.A0D;
        if (r6 != null) {
            for (AnonymousClass7M5 r3 : r6) {
                AnonymousClass7UO r2 = r3.A03;
                int A042 = C162387ry.A04(r2.A07, j2, false);
                while (true) {
                    if (A042 >= 0) {
                        if ((r2.A04[A042] & 1) != 0) {
                            break;
                        }
                        A042--;
                    } else {
                        A042 = r2.A00(j2);
                        break;
                    }
                }
                r3.A00 = A042;
            }
        }
    }

    public C1687686r(int i) {
        this.A04 = 0;
        this.A0F = new C155947fm();
        this.A0L = AnonymousClass001.A0s();
        this.A0G = C161467pi.A05(16);
        this.A0K = AnonymousClass6CA.A0a();
        this.A0I = new C161467pi(C161627q8.A02);
        this.A0H = C161467pi.A05(4);
        this.A0J = new C161467pi();
        this.A08 = -1;
    }

    public C1687686r() {
        this(0);
    }
}
