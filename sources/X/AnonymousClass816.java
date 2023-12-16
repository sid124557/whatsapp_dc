package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;

/* renamed from: X.816  reason: invalid class name */
public final class AnonymousClass816 implements C184718sP, C185218tH {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = -1;
    public long A07;
    public long A08;
    public C184708sO A09;
    public C161457ph A0A;
    public boolean A0B;
    public boolean A0C;
    public C149157Lg[] A0D;
    public long[][] A0E;
    public final C161457ph A0F = new C161457ph(16);
    public final C161457ph A0G = new C161457ph(4);
    public final C161457ph A0H = new C161457ph(AnonymousClass79B.A02);
    public final C161457ph A0I = new C161457ph();
    public final ArrayDeque A0J = AnonymousClass6CA.A0a();

    public boolean BpR(C153437bJ r2) {
        return C154607dS.A00(r2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v207, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: X.7yg} */
    /* JADX WARNING: type inference failed for: r39v1, types: [X.8sQ] */
    /* JADX WARNING: type inference failed for: r0v338, types: [X.81A] */
    /* JADX WARNING: type inference failed for: r0v339, types: [X.819] */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x086f, code lost:
        if (r9 == 1) goto L_0x0871;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0905  */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x03fe A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(long r54) {
        /*
            r53 = this;
        L_0x0000:
            r52 = r53
            r0 = r52
            java.util.ArrayDeque r0 = r0.A0J
            r51 = r0
            boolean r0 = r51.isEmpty()
            if (r0 != 0) goto L_0x0b97
            java.lang.Object r0 = r51.peek()
            X.6Jp r0 = (X.C125816Jp) r0
            long r1 = r0.A00
            int r0 = (r1 > r54 ? 1 : (r1 == r54 ? 0 : -1))
            if (r0 != 0) goto L_0x0b97
            java.lang.Object r19 = r51.pop()
            r0 = r19
            X.6Jp r0 = (X.C125816Jp) r0
            r19 = r0
            int r1 = r0.A00
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r0) goto L_0x0b74
            java.util.ArrayList r24 = X.AnonymousClass001.A0s()
            r18 = 0
            r23 = -1
            r16 = -1
            r1 = 1969517665(0x75647461, float:2.8960062E32)
            r0 = r19
            X.6Jo r0 = r0.A01(r1)
            r17 = 0
            if (r0 == 0) goto L_0x0396
            X.7ph r13 = r0.A00
            r12 = 8
            r13.A0H(r12)
            r6 = 0
            r11 = r6
        L_0x004b:
            int r0 = r13.A00
            int r10 = r13.A01
            int r0 = r0 - r10
            if (r0 < r12) goto L_0x0399
            int r20 = r13.A03()
            int r1 = r13.A03()
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r1 != r0) goto L_0x0341
            r13.A0H(r10)
            int r2 = r10 + r20
            r13.A0I(r12)
            int r3 = r13.A01
            r0 = 4
            r13.A0I(r0)
            int r1 = r13.A03()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r0) goto L_0x0078
            int r3 = r3 + 4
        L_0x0078:
            r13.A0H(r3)
        L_0x007b:
            int r9 = r13.A01
            if (r9 >= r2) goto L_0x033f
            int r3 = r13.A03()
            int r1 = r13.A03()
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r1 != r0) goto L_0x0339
            r13.A0H(r9)
            int r9 = r9 + r3
            r13.A0I(r12)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
        L_0x0097:
            int r7 = r13.A01
            if (r7 >= r9) goto L_0x0324
            int r0 = r13.A03()
            int r7 = r7 + r0
            int r3 = r13.A03()
            int r0 = r3 >> 24
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 169(0xa9, float:2.37E-43)
            if (r1 == r0) goto L_0x024e
            r0 = 253(0xfd, float:3.55E-43)
            if (r1 == r0) goto L_0x024e
            r0 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r3 != r0) goto L_0x00ec
            r0 = 4
            r13.A0I(r0)     // Catch:{ all -> 0x0b89 }
            int r1 = r13.A03()     // Catch:{ all -> 0x0b89 }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x00dc
            int r2 = X.C161457ph.A01(r13, r12)     // Catch:{ all -> 0x0b89 }
            if (r2 <= 0) goto L_0x00e3
            java.lang.String[] r1 = X.C161017op.A00     // Catch:{ all -> 0x0b89 }
            int r0 = r1.length     // Catch:{ all -> 0x0b89 }
            if (r2 > r0) goto L_0x00e3
            int r0 = r2 + -1
            r1 = r1[r0]     // Catch:{ all -> 0x0b89 }
            if (r1 == 0) goto L_0x00e3
            java.lang.String r0 = "TCON"
            X.6Jv r6 = new X.6Jv     // Catch:{ all -> 0x0b89 }
            r6.<init>(r0, r1)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x00dc:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse uint8 attribute value"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0b89 }
        L_0x00e3:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse standard genre code"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0b89 }
            goto L_0x0318
        L_0x00ec:
            r0 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r3 != r0) goto L_0x00f9
            java.lang.String r0 = "TPOS"
            X.6Jv r6 = X.C161017op.A01(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x00f9:
            r0 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r3 != r0) goto L_0x0106
            java.lang.String r0 = "TRCK"
            X.6Jv r6 = X.C161017op.A01(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x0106:
            r0 = 1953329263(0x746d706f, float:7.5247484E31)
            r2 = 0
            r1 = 1
            if (r3 != r0) goto L_0x0115
            java.lang.String r0 = "TBPM"
            X.81M r6 = X.C161017op.A00(r13, r0, r3, r1, r2)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x0115:
            r0 = 1668311404(0x6370696c, float:4.434815E21)
            if (r3 != r0) goto L_0x0122
            java.lang.String r0 = "TCMP"
            X.81M r6 = X.C161017op.A00(r13, r0, r3, r1, r1)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x0122:
            r0 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r3 != r0) goto L_0x0171
            int r5 = r13.A03()     // Catch:{ all -> 0x0b89 }
            int r1 = r13.A03()     // Catch:{ all -> 0x0b89 }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r4 = "MetadataUtil"
            if (r1 != r0) goto L_0x015d
            int r3 = r13.A03()     // Catch:{ all -> 0x0b89 }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r0
            r0 = 13
            if (r3 != r0) goto L_0x0156
            java.lang.String r3 = "image/jpeg"
        L_0x0144:
            r0 = 4
            r13.A0I(r0)     // Catch:{ all -> 0x0b89 }
            int r1 = r5 + -16
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x0b89 }
            r13.A0J(r0, r2, r1)     // Catch:{ all -> 0x0b89 }
            X.6Jy r6 = new X.6Jy     // Catch:{ all -> 0x0b89 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x0156:
            r0 = 14
            if (r3 != r0) goto L_0x0160
            java.lang.String r3 = "image/png"
            goto L_0x0144
        L_0x015d:
            java.lang.String r0 = "Failed to parse cover art attribute"
            goto L_0x016a
        L_0x0160:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b89 }
            java.lang.String r0 = "Unrecognized cover art flags: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ all -> 0x0b89 }
        L_0x016a:
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0b89 }
            r6 = r18
            goto L_0x031a
        L_0x0171:
            r0 = 1631670868(0x61415254, float:2.2288462E20)
            if (r3 != r0) goto L_0x017e
            java.lang.String r0 = "TPE2"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x017e:
            r0 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r3 != r0) goto L_0x018b
            java.lang.String r0 = "TSOT"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x018b:
            r0 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r3 != r0) goto L_0x0198
            java.lang.String r0 = "TSO2"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x0198:
            r0 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r3 != r0) goto L_0x01a5
            java.lang.String r0 = "TSOA"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x01a5:
            r0 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r3 != r0) goto L_0x01b2
            java.lang.String r0 = "TSOP"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x01b2:
            r0 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r3 != r0) goto L_0x01bf
            java.lang.String r0 = "TSOC"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x01bf:
            r0 = 1920233063(0x72746e67, float:4.84146E30)
            if (r3 != r0) goto L_0x01cc
            java.lang.String r0 = "ITUNESADVISORY"
            X.81M r6 = X.C161017op.A00(r13, r0, r3, r2, r2)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x01cc:
            r0 = 1885823344(0x70676170, float:2.8643533E29)
            if (r3 != r0) goto L_0x01d9
            java.lang.String r0 = "ITUNESGAPLESS"
            X.81M r6 = X.C161017op.A00(r13, r0, r3, r2, r1)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x01d9:
            r0 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r3 != r0) goto L_0x01e6
            java.lang.String r0 = "TVSHOWSORT"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x01e6:
            r0 = 1953919848(0x74767368, float:7.810338E31)
            if (r3 != r0) goto L_0x01f3
            java.lang.String r0 = "TVSHOW"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x01f3:
            r0 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r3 != r0) goto L_0x02ef
            r6 = 0
            r5 = r6
            r4 = r6
            r3 = -1
            r2 = -1
        L_0x01fd:
            int r14 = r13.A01     // Catch:{ all -> 0x0b89 }
            if (r14 >= r7) goto L_0x0232
            int r15 = r13.A03()     // Catch:{ all -> 0x0b89 }
            int r1 = r13.A03()     // Catch:{ all -> 0x0b89 }
            r0 = 4
            r13.A0I(r0)     // Catch:{ all -> 0x0b89 }
            r0 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r1 != r0) goto L_0x0219
            int r0 = r15 + -12
            java.lang.String r5 = r13.A0C(r0)     // Catch:{ all -> 0x0b89 }
            goto L_0x01fd
        L_0x0219:
            r0 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r1 != r0) goto L_0x0225
            int r0 = r15 + -12
            java.lang.String r4 = r13.A0C(r0)     // Catch:{ all -> 0x0b89 }
            goto L_0x01fd
        L_0x0225:
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x022c
            r3 = r14
            r2 = r15
        L_0x022c:
            int r0 = r15 + -12
            r13.A0I(r0)     // Catch:{ all -> 0x0b89 }
            goto L_0x01fd
        L_0x0232:
            if (r5 == 0) goto L_0x031a
            if (r4 == 0) goto L_0x031a
            r0 = r23
            if (r3 == r0) goto L_0x031a
            r13.A0H(r3)     // Catch:{ all -> 0x0b89 }
            r0 = 16
            r13.A0I(r0)     // Catch:{ all -> 0x0b89 }
            int r2 = r2 - r0
            java.lang.String r0 = r13.A0C(r2)     // Catch:{ all -> 0x0b89 }
            X.6Jx r6 = new X.6Jx     // Catch:{ all -> 0x0b89 }
            r6.<init>(r5, r4, r0)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x024e:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r0 = 6516084(0x636d74, float:9.130979E-39)
            if (r1 != r0) goto L_0x0287
            int r2 = r13.A03()     // Catch:{ all -> 0x0b89 }
            int r1 = r13.A03()     // Catch:{ all -> 0x0b89 }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0274
            r13.A0I(r12)     // Catch:{ all -> 0x0b89 }
            int r0 = r2 + -16
            java.lang.String r0 = r13.A0C(r0)     // Catch:{ all -> 0x0b89 }
            X.6Jw r6 = new X.6Jw     // Catch:{ all -> 0x0b89 }
            r6.<init>(r0, r0)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x0274:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b89 }
            java.lang.String r0 = "Failed to parse comment attribute: "
            r1.append(r0)     // Catch:{ all -> 0x0b89 }
            java.lang.String r0 = X.C160197nC.A00(r3)     // Catch:{ all -> 0x0b89 }
            X.AnonymousClass6C7.A1N(r1, r0)     // Catch:{ all -> 0x0b89 }
            r6 = 0
            goto L_0x031a
        L_0x0287:
            r0 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r1 == r0) goto L_0x0311
            r0 = 7631467(0x74726b, float:1.0693963E-38)
            if (r1 == r0) goto L_0x0311
            r0 = 6516589(0x636f6d, float:9.131686E-39)
            if (r1 == r0) goto L_0x030a
            r0 = 7828084(0x777274, float:1.0969482E-38)
            if (r1 == r0) goto L_0x030a
            r0 = 6578553(0x646179, float:9.218516E-39)
            if (r1 != r0) goto L_0x02a7
            java.lang.String r0 = "TDRC"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x02a7:
            r0 = 4280916(0x415254, float:5.998841E-39)
            if (r1 != r0) goto L_0x02b3
            java.lang.String r0 = "TPE1"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x02b3:
            r0 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r1 != r0) goto L_0x02bf
            java.lang.String r0 = "TSSE"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x02bf:
            r0 = 6384738(0x616c62, float:8.946924E-39)
            if (r1 != r0) goto L_0x02cb
            java.lang.String r0 = "TALB"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x02cb:
            r0 = 7108978(0x6c7972, float:9.9618E-39)
            if (r1 != r0) goto L_0x02d7
            java.lang.String r0 = "USLT"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x02d7:
            r0 = 6776174(0x67656e, float:9.495442E-39)
            if (r1 != r0) goto L_0x02e3
            java.lang.String r0 = "TCON"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x02e3:
            r0 = 6779504(0x677270, float:9.500109E-39)
            if (r1 != r0) goto L_0x02ef
            java.lang.String r0 = "TIT1"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x02ef:
            java.lang.String r2 = "MetadataUtil"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b89 }
            java.lang.String r0 = "Skipped unknown metadata entry: "
            r1.append(r0)     // Catch:{ all -> 0x0b89 }
            java.lang.String r0 = X.C160197nC.A00(r3)     // Catch:{ all -> 0x0b89 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0b89 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0b89 }
            r13.A0H(r7)
            goto L_0x0097
        L_0x030a:
            java.lang.String r0 = "TCOM"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x0311:
            java.lang.String r0 = "TIT2"
            X.6Jv r6 = X.C161017op.A02(r13, r0, r3)     // Catch:{ all -> 0x0b89 }
            goto L_0x031a
        L_0x0318:
            r6 = r18
        L_0x031a:
            r13.A0H(r7)
            if (r6 == 0) goto L_0x0097
            r8.add(r6)
            goto L_0x0097
        L_0x0324:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x033f
            r0 = 0
            X.8x1[] r0 = new X.C187338x1[r0]
            java.lang.Object[] r0 = r8.toArray(r0)
            X.8x1[] r0 = (X.C187338x1[]) r0
            X.7yg r6 = new X.7yg
            r6.<init>((X.C187338x1[]) r0)
            goto L_0x0387
        L_0x0339:
            int r9 = r9 + r3
            r13.A0H(r9)
            goto L_0x007b
        L_0x033f:
            r6 = 0
            goto L_0x0387
        L_0x0341:
            r0 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r1 != r0) goto L_0x0387
            r13.A0H(r10)
            int r5 = r10 + r20
            r4 = 12
            r13.A0I(r4)
        L_0x0350:
            int r3 = r13.A01
            r11 = 0
            if (r3 >= r5) goto L_0x0387
            int r2 = r13.A03()
            int r1 = r13.A03()
            r0 = 1935766900(0x73617574, float:1.7862687E31)
            if (r1 != r0) goto L_0x0391
            r0 = 14
            if (r2 < r0) goto L_0x0387
            r0 = 5
            int r1 = X.C161457ph.A01(r13, r0)
            if (r1 == r4) goto L_0x038e
            r0 = 13
            if (r1 != r0) goto L_0x0387
            r3 = 1123024896(0x42f00000, float:120.0)
        L_0x0373:
            r1 = 1
            int r0 = X.C161457ph.A01(r13, r1)
            X.8x1[] r2 = new X.C187338x1[r1]
            X.81N r1 = new X.81N
            r1.<init>(r3, r0)
            r0 = 0
            r2[r0] = r1
            X.7yg r11 = new X.7yg
            r11.<init>((X.C187338x1[]) r2)
        L_0x0387:
            int r10 = r10 + r20
            r13.A0H(r10)
            goto L_0x004b
        L_0x038e:
            r3 = 1131413504(0x43700000, float:240.0)
            goto L_0x0373
        L_0x0391:
            int r3 = r3 + r2
            r13.A0H(r3)
            goto L_0x0350
        L_0x0396:
            r20 = r18
            goto L_0x03aa
        L_0x0399:
            android.util.Pair r0 = android.util.Pair.create(r6, r11)
            java.lang.Object r0 = r0.first
            r20 = r0
            r0 = r20
            X.7yg r0 = (X.C166437yg) r0
            r20 = r0
            r1 = 0
            if (r0 != 0) goto L_0x0400
        L_0x03aa:
            r1 = 1835365473(0x6d657461, float:4.4382975E27)
            r0 = r19
            X.6Jp r3 = r0.A00(r1)
            if (r3 == 0) goto L_0x04df
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.6Jo r1 = r3.A01(r0)
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            X.6Jo r2 = r3.A01(r0)
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            X.6Jo r4 = r3.A01(r0)
            if (r1 == 0) goto L_0x04df
            if (r2 == 0) goto L_0x04df
            if (r4 == 0) goto L_0x04df
            X.7ph r1 = r1.A00
            r0 = 16
            int r1 = X.C161457ph.A02(r1, r0)
            r0 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r1 != r0) goto L_0x04df
            X.7ph r3 = r2.A00
            r0 = 12
            int r11 = X.C161457ph.A02(r3, r0)
            java.lang.String[] r10 = new java.lang.String[r11]
            r2 = 0
        L_0x03e8:
            r9 = 8
            if (r2 >= r11) goto L_0x0464
            int r1 = r3.A03()
            r0 = 4
            r3.A0I(r0)
            int r1 = r1 - r9
            java.lang.String r0 = r3.A0D(r1)
            r10[r2] = r0
            int r2 = r2 + 1
            goto L_0x03e8
        L_0x03fe:
            int r1 = r1 + 1
        L_0x0400:
            r0 = r20
            X.8x1[] r0 = r0.A01
            int r0 = r0.length
            if (r1 >= r0) goto L_0x03aa
            r0 = r20
            X.8x1[] r0 = r0.A01
            r3 = r0[r1]
            boolean r0 = r3 instanceof X.C125886Jw
            java.lang.String r4 = "iTunSMPB"
            if (r0 == 0) goto L_0x0449
            X.6Jw r3 = (X.C125886Jw) r3
            java.lang.String r0 = r3.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x03fe
            java.lang.String r2 = r3.A02
        L_0x041f:
            java.util.regex.Pattern r0 = X.AnonymousClass76I.A00
            java.util.regex.Matcher r4 = r0.matcher(r2)
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x03fe
            r0 = 1
            java.lang.String r0 = r4.group(r0)     // Catch:{ NumberFormatException -> 0x03fe }
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r0, r3)     // Catch:{ NumberFormatException -> 0x03fe }
            r0 = 2
            java.lang.String r0 = r4.group(r0)     // Catch:{ NumberFormatException -> 0x03fe }
            int r0 = java.lang.Integer.parseInt(r0, r3)     // Catch:{ NumberFormatException -> 0x03fe }
            if (r2 > 0) goto L_0x0443
            if (r0 <= 0) goto L_0x03fe
        L_0x0443:
            r23 = r2
            r16 = r0
            goto L_0x03aa
        L_0x0449:
            boolean r0 = r3 instanceof X.C125896Jx
            if (r0 == 0) goto L_0x03fe
            X.6Jx r3 = (X.C125896Jx) r3
            java.lang.String r2 = r3.A01
            java.lang.String r0 = "com.apple.iTunes"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03fe
            java.lang.String r0 = r3.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x03fe
            java.lang.String r2 = r3.A02
            goto L_0x041f
        L_0x0464:
            X.7ph r8 = r4.A00
            r8.A0H(r9)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
        L_0x046d:
            int r0 = r8.A00
            int r6 = r8.A01
            int r0 = r0 - r6
            if (r0 <= r9) goto L_0x04c9
            int r13 = r8.A03()
            int r0 = r8.A03()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x04b9
            if (r2 >= r11) goto L_0x04b9
            r5 = r10[r2]
            int r3 = r6 + r13
        L_0x0486:
            int r2 = r8.A01
            if (r2 >= r3) goto L_0x04af
            int r12 = r8.A03()
            int r1 = r8.A03()
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x04b4
            int r4 = r8.A03()
            int r3 = r8.A03()
            int r2 = r12 + -16
            byte[] r1 = new byte[r2]
            r0 = 0
            r8.A0J(r1, r0, r2)
            X.81O r0 = new X.81O
            r0.<init>(r1, r3, r4, r5)
            r7.add(r0)
        L_0x04af:
            int r6 = r6 + r13
            r8.A0H(r6)
            goto L_0x046d
        L_0x04b4:
            int r2 = r2 + r12
            r8.A0H(r2)
            goto L_0x0486
        L_0x04b9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipped metadata with unknown key index: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r2)
            java.lang.String r0 = "AtomParsers"
            android.util.Log.w(r0, r1)
            goto L_0x04af
        L_0x04c9:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x04df
            r0 = 0
            X.8x1[] r0 = new X.C187338x1[r0]
            java.lang.Object[] r1 = r7.toArray(r0)
            X.8x1[] r1 = (X.C187338x1[]) r1
            X.7yg r17 = new X.7yg
            r0 = r17
            r0.<init>((X.C187338x1[]) r1)
        L_0x04df:
            r22 = 0
            java.util.ArrayList r21 = X.AnonymousClass001.A0s()
            r25 = 0
        L_0x04e7:
            r0 = r19
            java.util.List r2 = r0.A01
            int r1 = r2.size()
            r0 = r25
            if (r0 >= r1) goto L_0x09b7
            java.lang.Object r1 = r2.get(r0)
            X.6Jp r1 = (X.C125816Jp) r1
            int r2 = r1.A00
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 != r0) goto L_0x056e
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            r0 = r19
            X.6Jo r9 = r0.A01(r2)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r52
            boolean r0 = r0.A0C
            r13 = 0
            r6 = 0
            r7 = r18
            r8 = r1
            r12 = r0
            X.7Pw r31 = X.C161567px.A03(r7, r8, r9, r10, r12)
            if (r31 == 0) goto L_0x056e
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            X.6Jp r1 = r1.A00(r0)
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.6Jp r1 = r1.A00(r0)
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.6Jp r4 = r1.A00(r0)
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            X.6Jo r2 = r4.A01(r0)
            if (r2 == 0) goto L_0x09a5
            r0 = r31
            X.7z1 r1 = r0.A07
            X.819 r39 = new X.819
            r0 = r39
            r0.<init>(r1, r2)
        L_0x0547:
            int r38 = r39.BCQ()
            if (r38 != 0) goto L_0x0572
            long[] r4 = new long[r13]
            int[] r3 = new int[r13]
            long[] r2 = new long[r13]
            int[] r1 = new int[r13]
            r12 = 0
            X.7UL r0 = new X.7UL
            r5 = r0
            r6 = r31
            r7 = r3
            r8 = r1
            r9 = r4
            r10 = r2
            r11 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x0565:
            int r1 = r0.A01
            if (r1 == 0) goto L_0x056e
            r1 = r21
            r1.add(r0)
        L_0x056e:
            int r25 = r25 + 1
            goto L_0x04e7
        L_0x0572:
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            X.6Jo r0 = r4.A01(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0646
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            X.6Jo r0 = r4.A01(r0)
            r0.getClass()
            r3 = 1
        L_0x0587:
            X.7ph r2 = r0.A00
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            X.6Jo r0 = r4.A01(r0)
            r0.getClass()
            X.7ph r1 = r0.A00
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            X.6Jo r0 = r4.A01(r0)
            r0.getClass()
            X.7ph r0 = r0.A00
            r40 = r0
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            X.6Jo r0 = r4.A01(r0)
            if (r0 == 0) goto L_0x0642
            X.7ph r0 = r0.A00
            r33 = r0
        L_0x05b0:
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            X.6Jo r0 = r4.A01(r0)
            if (r0 == 0) goto L_0x063f
            X.7ph r15 = r0.A00
        L_0x05bb:
            X.7UT r9 = new X.7UT
            r9.<init>(r1, r2, r3)
            r1 = 12
            r0 = r40
            r0.A0H(r1)
            int r8 = r40.A05()
            int r8 = r8 - r5
            int r12 = r40.A05()
            int r32 = r40.A05()
            if (r15 == 0) goto L_0x063c
            r15.A0H(r1)
            int r29 = r15.A05()
        L_0x05dd:
            r2 = -1
            if (r33 == 0) goto L_0x0639
            r0 = r33
            r0.A0H(r1)
            int r7 = r33.A05()
            if (r7 <= 0) goto L_0x0636
            int r0 = r33.A05()
            int r14 = r0 + -1
        L_0x05f1:
            int r30 = r39.B7i()
            r0 = r31
            X.7z1 r0 = r0.A07
            r47 = r0
            java.lang.String r1 = r0.A0S
            r0 = r30
            if (r0 == r2) goto L_0x06ba
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0619
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0619
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x06ba
        L_0x0619:
            if (r8 != 0) goto L_0x06ba
            if (r29 != 0) goto L_0x06ba
            if (r7 != 0) goto L_0x06ba
            int r11 = r9.A05
            long[] r12 = new long[r11]
            int[] r10 = new int[r11]
        L_0x0625:
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x0649
            int r2 = r9.A00
            long r0 = r9.A04
            r12[r2] = r0
            int r0 = r9.A02
            r10[r2] = r0
            goto L_0x0625
        L_0x0636:
            r33 = 0
            goto L_0x063a
        L_0x0639:
            r7 = 0
        L_0x063a:
            r14 = -1
            goto L_0x05f1
        L_0x063c:
            r29 = 0
            goto L_0x05dd
        L_0x063f:
            r15 = 0
            goto L_0x05bb
        L_0x0642:
            r33 = 0
            goto L_0x05b0
        L_0x0646:
            r3 = 0
            goto L_0x0587
        L_0x0649:
            r0 = r32
            long r3 = (long) r0
            r9 = 8192(0x2000, float:1.14794E-41)
            int r9 = r9 / r30
            r8 = 0
            r1 = 0
            r0 = 0
        L_0x0653:
            if (r1 >= r11) goto L_0x065f
            r2 = r10[r1]
            int r2 = r2 + r9
            int r2 = r2 + -1
            int r2 = r2 / r9
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L_0x0653
        L_0x065f:
            long[] r15 = new long[r0]
            int[] r7 = new int[r0]
            long[] r14 = new long[r0]
            int[] r13 = new int[r0]
            r29 = 0
            r5 = 0
        L_0x066a:
            if (r8 >= r11) goto L_0x0696
            r2 = r10[r8]
            r27 = r12[r8]
        L_0x0670:
            if (r2 <= 0) goto L_0x0693
            int r26 = java.lang.Math.min(r9, r2)
            r15[r29] = r27
            int r0 = r30 * r26
            r7[r29] = r0
            int r5 = java.lang.Math.max(r5, r0)
            long r0 = (long) r6
            long r0 = r0 * r3
            r14[r29] = r0
            r0 = 1
            r13[r29] = r0
            r0 = r7[r29]
            long r0 = (long) r0
            long r27 = r27 + r0
            int r6 = r6 + r26
            int r2 = r2 - r26
            int r29 = r29 + 1
            goto L_0x0670
        L_0x0693:
            int r8 = r8 + 1
            goto L_0x066a
        L_0x0696:
            long r0 = (long) r6
            long r3 = r3 * r0
            X.7OF r0 = new X.7OF
            r8 = r15
            r9 = r14
            r10 = r5
            r11 = r3
            r5 = r0
            r6 = r7
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            long[] r1 = r0.A04
            r37 = r1
            int[] r1 = r0.A03
            r36 = r1
            int r1 = r0.A00
            r34 = r1
            long[] r10 = r0.A05
            int[] r1 = r0.A02
            r35 = r1
            long r0 = r0.A01
            goto L_0x079e
        L_0x06ba:
            r0 = r38
            long[] r0 = new long[r0]
            r37 = r0
            r0 = r38
            int[] r0 = new int[r0]
            r36 = r0
            r0 = r38
            long[] r10 = new long[r0]
            int[] r0 = new int[r0]
            r35 = r0
            r34 = 0
            r28 = 0
            r11 = 0
            r0 = 0
            r4 = 0
        L_0x06d7:
            java.lang.String r26 = "AtomParsers"
            r2 = r38
            if (r6 >= r2) goto L_0x0764
        L_0x06dd:
            if (r11 != 0) goto L_0x06ea
            boolean r2 = r9.A00()
            if (r2 == 0) goto L_0x0745
            long r4 = r9.A04
            int r11 = r9.A02
            goto L_0x06dd
        L_0x06ea:
            if (r15 == 0) goto L_0x06fd
        L_0x06ec:
            if (r13 != 0) goto L_0x06fb
            if (r29 <= 0) goto L_0x06fb
            int r13 = r15.A05()
            int r28 = r15.A03()
            int r29 = r29 + -1
            goto L_0x06ec
        L_0x06fb:
            int r13 = r13 + -1
        L_0x06fd:
            r37[r6] = r4
            int r3 = r39.BiO()
            r36[r6] = r3
            r2 = r34
            if (r3 <= r2) goto L_0x070b
            r34 = r3
        L_0x070b:
            r2 = r28
            long r2 = (long) r2
            long r2 = r2 + r0
            r10[r6] = r2
            boolean r2 = X.AnonymousClass000.A1X(r33)
            r35[r6] = r2
            if (r6 != r14) goto L_0x0728
            r2 = 1
            r35[r6] = r2
            int r7 = r7 + -1
            if (r7 <= 0) goto L_0x0728
            r33.getClass()
            int r14 = r33.A05()
            int r14 = r14 - r2
        L_0x0728:
            r2 = r32
            long r2 = (long) r2
            long r0 = r0 + r2
            int r12 = r12 + -1
            if (r12 != 0) goto L_0x073c
            if (r8 <= 0) goto L_0x073c
            int r12 = r40.A05()
            int r32 = r40.A03()
            int r8 = r8 + -1
        L_0x073c:
            r2 = r36[r6]
            long r2 = (long) r2
            long r4 = r4 + r2
            int r11 = r11 + -1
            int r6 = r6 + 1
            goto L_0x06d7
        L_0x0745:
            java.lang.String r3 = "Unexpected end of chunk data"
            r2 = r26
            android.util.Log.w(r2, r3)
            r2 = r37
            long[] r37 = java.util.Arrays.copyOf(r2, r6)
            r2 = r36
            int[] r36 = java.util.Arrays.copyOf(r2, r6)
            long[] r10 = java.util.Arrays.copyOf(r10, r6)
            r2 = r35
            int[] r35 = java.util.Arrays.copyOf(r2, r6)
            r38 = r6
        L_0x0764:
            r2 = r28
            long r2 = (long) r2
            long r0 = r0 + r2
            if (r15 == 0) goto L_0x07d0
        L_0x076a:
            if (r29 <= 0) goto L_0x07d0
            int r2 = r15.A05()
            if (r2 == 0) goto L_0x07ca
            r4 = 0
        L_0x0773:
            if (r7 != 0) goto L_0x077f
            if (r12 != 0) goto L_0x077f
            if (r11 != 0) goto L_0x077f
            if (r8 != 0) goto L_0x077f
            if (r13 != 0) goto L_0x077f
            if (r4 != 0) goto L_0x079e
        L_0x077f:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Inconsistent stbl box for track "
            r3.append(r2)
            r2 = r31
            int r2 = r2.A00
            r3.append(r2)
            X.AnonymousClass6C9.A18(r3, r7, r12, r11, r8)
            r3.append(r13)
            if (r4 != 0) goto L_0x07c7
            java.lang.String r4 = ", ctts invalid"
        L_0x0799:
            r2 = r26
            X.AnonymousClass000.A1F(r4, r2, r3)
        L_0x079e:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            r2 = r31
            long r2 = r2.A06
            r4 = r0
            r8 = r2
            long r11 = com.facebook.android.exoplayer2.util.Util.A07(r4, r6, r8)
            r4 = r31
            long[] r8 = r4.A08
            if (r8 != 0) goto L_0x07d2
            com.facebook.android.exoplayer2.util.Util.A0A(r10, r2)
            X.7UL r0 = new X.7UL
            r4 = r0
            r5 = r31
            r6 = r36
            r7 = r35
            r8 = r37
            r9 = r10
            r10 = r34
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0565
        L_0x07c7:
            java.lang.String r4 = ""
            goto L_0x0799
        L_0x07ca:
            r15.A03()
            int r29 = r29 + -1
            goto L_0x076a
        L_0x07d0:
            r4 = 1
            goto L_0x0773
        L_0x07d2:
            int r9 = r8.length
            r5 = 1
            if (r9 != r5) goto L_0x086f
            int r4 = r4.A03
            if (r4 != r5) goto L_0x0871
            int r6 = r10.length
            r4 = 2
            if (r6 < r4) goto L_0x0871
            r4 = r31
            long[] r4 = r4.A09
            r4.getClass()
            r45 = r4[r22]
            r39 = r8[r22]
            r4 = r31
            long r11 = r4.A05
            r41 = r2
            r43 = r11
            long r4 = com.facebook.android.exoplayer2.util.Util.A07(r39, r41, r43)
            long r26 = r45 + r4
            r4 = 1
            int r7 = r6 - r4
            r5 = 4
            r4 = r22
            int r15 = X.AnonymousClass001.A0D(r5, r7, r4)
            int r6 = r6 - r5
            int r7 = X.AnonymousClass001.A0D(r6, r7, r4)
            r13 = r10[r22]
            int r4 = (r13 > r45 ? 1 : (r13 == r45 ? 0 : -1))
            if (r4 > 0) goto L_0x0871
            r5 = r10[r15]
            int r4 = (r45 > r5 ? 1 : (r45 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0871
            r5 = r10[r7]
            int r4 = (r5 > r26 ? 1 : (r5 == r26 ? 0 : -1))
            if (r4 >= 0) goto L_0x0871
            int r4 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0871
            long r39 = r0 - r26
            long r45 = r45 - r13
            r4 = r47
            int r4 = r4.A0F
            long r6 = (long) r4
            r49 = r2
            r47 = r6
            long r4 = com.facebook.android.exoplayer2.util.Util.A07(r45, r47, r49)
            r41 = r6
            r43 = r2
            long r6 = com.facebook.android.exoplayer2.util.Util.A07(r39, r41, r43)
            r14 = 0
            int r13 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x083f
            int r13 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r13 == 0) goto L_0x0871
        L_0x083f:
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x0871
            int r13 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x0871
            int r0 = (int) r4
            r23 = r0
            int r0 = (int) r6
            r16 = r0
            r4 = 1000000(0xf4240, double:4.940656E-318)
            com.facebook.android.exoplayer2.util.Util.A0A(r10, r2)
            r2 = r8[r22]
            r6 = r11
            long r7 = com.facebook.android.exoplayer2.util.Util.A07(r2, r4, r6)
        L_0x085d:
            X.7UL r0 = new X.7UL
            r1 = r31
            r2 = r36
            r3 = r35
            r4 = r37
            r5 = r10
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0565
        L_0x086f:
            if (r9 != r5) goto L_0x0898
        L_0x0871:
            r11 = r8[r22]
            r5 = 0
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0898
            r4 = r31
            long[] r4 = r4.A09
            r4.getClass()
            r7 = r4[r22]
            r6 = 0
        L_0x0883:
            int r4 = r10.length
            if (r6 >= r4) goto L_0x0892
            r4 = r10[r6]
            long r4 = r4 - r7
            long r4 = com.facebook.android.exoplayer2.util.Util.A06(r4, r2)
            r10[r6] = r4
            int r6 = r6 + 1
            goto L_0x0883
        L_0x0892:
            long r0 = r0 - r7
            long r7 = com.facebook.android.exoplayer2.util.Util.A06(r0, r2)
            goto L_0x085d
        L_0x0898:
            r0 = r31
            int r1 = r0.A03
            r0 = 1
            boolean r26 = X.AnonymousClass000.A1U(r1, r0)
            int[] r4 = new int[r9]
            int[] r13 = new int[r9]
            r0 = r31
            long[] r0 = r0.A09
            r33 = r0
            r33.getClass()
            r7 = 0
            r32 = 0
            r11 = 0
            r6 = 0
        L_0x08b3:
            if (r7 >= r9) goto L_0x090d
            r0 = r33[r7]
            r14 = -1
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x0908
            r39 = r8[r7]
            r5 = r31
            long r14 = r5.A05
            r41 = r2
            r43 = r14
            long r14 = com.facebook.android.exoplayer2.util.Util.A07(r39, r41, r43)
            r5 = 1
            int r5 = com.facebook.android.exoplayer2.util.Util.A03(r10, r0, r5)
            r4[r7] = r5
            long r0 = r0 + r14
            int r12 = java.util.Arrays.binarySearch(r10, r0)
            if (r12 >= 0) goto L_0x08f7
            int r12 = ~r12
        L_0x08da:
            r13[r7] = r12
        L_0x08dc:
            r1 = r4[r7]
            r0 = r13[r7]
            if (r1 >= r0) goto L_0x08ed
            r5 = r35[r1]
            r5 = r5 & 1
            if (r5 != 0) goto L_0x08ed
            int r0 = r1 + 1
            r4[r7] = r0
            goto L_0x08dc
        L_0x08ed:
            int r5 = r0 - r1
            int r11 = r11 + r5
            boolean r1 = X.AnonymousClass001.A1X(r6, r1)
            r32 = r32 | r1
            goto L_0x0909
        L_0x08f7:
            int r12 = r12 + 1
            int r5 = r10.length
            if (r12 >= r5) goto L_0x0903
            r14 = r10[r12]
            int r5 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0903
            goto L_0x08f7
        L_0x0903:
            if (r26 == 0) goto L_0x08da
            int r12 = r12 + -1
            goto L_0x08da
        L_0x0908:
            r0 = r6
        L_0x0909:
            int r7 = r7 + 1
            r6 = r0
            goto L_0x08b3
        L_0x090d:
            r7 = 0
            r1 = 1
            r0 = r38
            if (r11 != r0) goto L_0x0914
            r1 = 0
        L_0x0914:
            r32 = r32 | r1
            if (r32 == 0) goto L_0x097f
            long[] r0 = new long[r11]
            r45 = r0
            int[] r15 = new int[r11]
            r34 = 0
            int[] r0 = new int[r11]
            r44 = r0
        L_0x0924:
            long[] r0 = new long[r11]
            r30 = r0
            r38 = 0
            r6 = 0
        L_0x092b:
            if (r7 >= r9) goto L_0x0986
            r28 = r33[r7]
            r5 = r4[r7]
            r14 = r13[r7]
            if (r32 == 0) goto L_0x094a
            int r11 = r14 - r5
            r1 = r37
            r0 = r45
            java.lang.System.arraycopy(r1, r5, r0, r6, r11)
            r0 = r36
            java.lang.System.arraycopy(r0, r5, r15, r6, r11)
            r1 = r35
            r0 = r44
            java.lang.System.arraycopy(r1, r5, r0, r6, r11)
        L_0x094a:
            if (r5 >= r14) goto L_0x0978
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r31
            long r0 = r0.A05
            r42 = r0
            long r26 = com.facebook.android.exoplayer2.util.Util.A07(r38, r40, r42)
            r11 = r10[r5]
            r0 = r28
            long r0 = X.AnonymousClass6C8.A0Q(r11, r0)
            long r0 = com.facebook.android.exoplayer2.util.Util.A06(r0, r2)
            long r26 = r26 + r0
            r30[r6] = r26
            if (r32 == 0) goto L_0x0973
            r1 = r15[r6]
            r0 = r34
            if (r1 <= r0) goto L_0x0973
            r34 = r36[r5]
        L_0x0973:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L_0x094a
        L_0x0978:
            r0 = r8[r7]
            long r38 = r38 + r0
            int r7 = r7 + 1
            goto L_0x092b
        L_0x097f:
            r45 = r37
            r15 = r36
            r44 = r35
            goto L_0x0924
        L_0x0986:
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r31
            long r0 = r0.A05
            r42 = r0
            long r7 = com.facebook.android.exoplayer2.util.Util.A07(r38, r40, r42)
            X.7UL r0 = new X.7UL
            r1 = r31
            r2 = r15
            r3 = r44
            r4 = r45
            r5 = r30
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0565
        L_0x09a5:
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            X.6Jo r1 = r4.A01(r0)
            if (r1 == 0) goto L_0x0b8e
            X.81A r39 = new X.81A
            r0 = r39
            r0.<init>(r1)
            goto L_0x0547
        L_0x09b7:
            int r9 = r21.size()
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r7 = -1
        L_0x09c7:
            if (r8 >= r9) goto L_0x0acf
            r0 = r21
            java.lang.Object r11 = r0.get(r8)
            X.7UL r11 = (X.AnonymousClass7UL) r11
            X.7Pw r3 = r11.A03
            long r5 = r3.A04
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x09db
            long r5 = r11.A02
        L_0x09db:
            long r1 = java.lang.Math.max(r1, r5)
            r0 = r52
            X.8sO r0 = r0.A09
            int r12 = r3.A03
            X.8tI r0 = r0.Bqz(r8, r12)
            X.7Lg r10 = new X.7Lg
            r10.<init>(r0, r3, r11)
            int r0 = r11.A00
            int r13 = r0 + 30
            X.7z1 r4 = r3.A07
            X.7it r0 = new X.7it
            r0.<init>(r4)
            r0.A09 = r13
            X.7z1 r4 = new X.7z1
            r4.<init>(r0)
            r0 = 2
            if (r12 != r0) goto L_0x0a21
            r12 = 0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a21
            int r11 = r11.A01
            r0 = 1
            if (r11 <= r0) goto L_0x0a21
            float r11 = (float) r11
            float r0 = (float) r5
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r5
            float r11 = r11 / r0
            X.7it r0 = new X.7it
            r0.<init>(r4)
            r0.A00 = r11
            X.7z1 r4 = new X.7z1
            r4.<init>(r0)
        L_0x0a21:
            int r5 = r3.A03
            r11 = 1
            if (r5 != r11) goto L_0x0a6e
            r3 = -1
            r0 = r23
            if (r0 == r3) goto L_0x0a41
            r0 = r16
            if (r0 == r3) goto L_0x0a41
            X.7it r0 = new X.7it
            r0.<init>(r4)
            r3 = r23
            r0.A06 = r3
            r3 = r16
            r0.A07 = r3
            X.7z1 r4 = new X.7z1
            r4.<init>(r0)
        L_0x0a41:
            if (r20 == 0) goto L_0x0a51
            X.7it r0 = new X.7it
            r0.<init>(r4)
            r3 = r20
            r0.A0L = r3
            X.7z1 r4 = new X.7z1
            r4.<init>(r0)
        L_0x0a51:
            X.8tI r0 = r10.A01
            r0.B3S(r4)
            r0 = 2
            if (r5 != r0) goto L_0x0a60
            r0 = -1
            if (r7 != r0) goto L_0x0a60
            int r7 = r24.size()
        L_0x0a60:
            r0 = r24
            r0.add(r10)
            int r8 = r8 + 1
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x09c7
        L_0x0a6e:
            r0 = 2
            if (r5 != r0) goto L_0x0a51
            if (r17 == 0) goto L_0x0a51
            r6 = 0
        L_0x0a74:
            r0 = r17
            X.8x1[] r3 = r0.A01
            int r0 = r3.length
            if (r6 >= r0) goto L_0x0a51
            r12 = r3[r6]
            boolean r0 = r12 instanceof X.AnonymousClass81O
            if (r0 == 0) goto L_0x0acc
            X.81O r12 = (X.AnonymousClass81O) r12
            java.lang.String r3 = r12.A02
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0acc
            int r3 = r12.A01
            r0 = 23
            if (r3 != r0) goto L_0x0acc
            byte[] r0 = r12.A03     // Catch:{ NumberFormatException -> 0x0ac5 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ NumberFormatException -> 0x0ac5 }
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()     // Catch:{ NumberFormatException -> 0x0ac5 }
            float r0 = r0.get()     // Catch:{ NumberFormatException -> 0x0ac5 }
            X.7it r3 = new X.7it     // Catch:{ NumberFormatException -> 0x0ac5 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0ac5 }
            r3.A00 = r0     // Catch:{ NumberFormatException -> 0x0ac5 }
            X.7z1 r0 = new X.7z1     // Catch:{ NumberFormatException -> 0x0ac5 }
            r0.<init>(r3)     // Catch:{ NumberFormatException -> 0x0ac5 }
            r4 = r0
            X.8x1[] r0 = new X.C187338x1[r11]     // Catch:{ NumberFormatException -> 0x0ac5 }
            r0[r22] = r12     // Catch:{ NumberFormatException -> 0x0ac5 }
            X.7yg r3 = new X.7yg     // Catch:{ NumberFormatException -> 0x0ac5 }
            r3.<init>((X.C187338x1[]) r0)     // Catch:{ NumberFormatException -> 0x0ac5 }
            X.7it r0 = new X.7it     // Catch:{ NumberFormatException -> 0x0ac5 }
            r0.<init>(r4)     // Catch:{ NumberFormatException -> 0x0ac5 }
            r0.A0L = r3     // Catch:{ NumberFormatException -> 0x0ac5 }
            X.7z1 r3 = new X.7z1     // Catch:{ NumberFormatException -> 0x0ac5 }
            r3.<init>(r0)     // Catch:{ NumberFormatException -> 0x0ac5 }
            r4 = r3
            goto L_0x0acc
        L_0x0ac5:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r0 = "Ignoring invalid framerate"
            android.util.Log.w(r3, r0)
        L_0x0acc:
            int r6 = r6 + 1
            goto L_0x0a74
        L_0x0acf:
            r0 = r52
            r0.A02 = r7
            r0.A08 = r1
            r0 = r22
            X.7Lg[] r1 = new X.C149157Lg[r0]
            r0 = r24
            java.lang.Object[] r7 = r0.toArray(r1)
            X.7Lg[] r7 = (X.C149157Lg[]) r7
            r0 = r52
            r0.A0D = r7
            int r8 = r7.length
            long[][] r6 = new long[r8][]
            int[] r5 = new int[r8]
            long[] r4 = new long[r8]
            boolean[] r3 = new boolean[r8]
            r2 = 0
            r9 = 0
        L_0x0af0:
            if (r9 >= r8) goto L_0x0b09
            r0 = r7[r9]
            X.7UL r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r6[r9] = r0
            r0 = r7[r9]
            X.7UL r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r22]
            r4[r9] = r0
            int r9 = r9 + 1
            goto L_0x0af0
        L_0x0b09:
            r14 = 0
        L_0x0b0b:
            if (r2 >= r8) goto L_0x0b49
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = -1
            r1 = 0
        L_0x0b14:
            if (r1 >= r8) goto L_0x0b25
            boolean r0 = r3[r1]
            if (r0 != 0) goto L_0x0b22
            r9 = r4[r1]
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0b22
            r13 = r1
            r11 = r9
        L_0x0b22:
            int r1 = r1 + 1
            goto L_0x0b14
        L_0x0b25:
            r12 = r5[r13]
            r11 = r6[r13]
            r11[r12] = r14
            r0 = r7[r13]
            X.7UL r10 = r0.A03
            int[] r0 = r10.A05
            r0 = r0[r12]
            long r0 = (long) r0
            long r14 = r14 + r0
            r9 = 1
            int r1 = r12 + 1
            r5[r13] = r1
            int r0 = r11.length
            if (r1 >= r0) goto L_0x0b44
            long[] r0 = r10.A07
            r0 = r0[r1]
            r4[r13] = r0
            goto L_0x0b0b
        L_0x0b44:
            r3[r13] = r9
            int r2 = r2 + 1
            goto L_0x0b0b
        L_0x0b49:
            r0 = r52
            r0.A0E = r6
            X.8sO r2 = r0.A09
            X.812 r2 = (X.AnonymousClass812) r2
            r0 = 1
            r2.A0H = r0
            android.os.Handler r1 = r2.A0Q
            java.lang.Runnable r0 = r2.A0Y
            r1.post(r0)
            r0 = r52
            X.8sO r2 = r0.A09
            X.812 r2 = (X.AnonymousClass812) r2
            r2.A07 = r0
            android.os.Handler r1 = r2.A0Q
            java.lang.Runnable r0 = r2.A0Y
            r1.post(r0)
            r51.clear()
            r1 = 2
            r0 = r52
            r0.A03 = r1
            goto L_0x0000
        L_0x0b74:
            boolean r0 = r51.isEmpty()
            if (r0 != 0) goto L_0x0000
            java.lang.Object r0 = r51.peek()
            X.6Jp r0 = (X.C125816Jp) r0
            java.util.List r1 = r0.A01
            r0 = r19
            r1.add(r0)
            goto L_0x0000
        L_0x0b89:
            r0 = move-exception
            r13.A0H(r7)
            throw r0
        L_0x0b8e:
            java.lang.String r3 = "Track has no sample table size information"
            r2 = 1
            X.6uD r1 = new X.6uD
            r1.<init>(r3, r7, r2)
            throw r1
        L_0x0b97:
            r0 = r52
            int r1 = r0.A03
            r0 = 2
            if (r1 == r0) goto L_0x0ba5
            r1 = 0
            r0 = r52
            r0.A03 = r1
            r0.A00 = r1
        L_0x0ba5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass816.A00(long):void");
    }

    public long B7B() {
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r3 == -1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r1 == -1) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C152137Xr BCa(long r18) {
        /*
            r17 = this;
            r8 = r18
            r12 = r17
            X.7Lg[] r1 = r12.A0D
            int r0 = r1.length
            if (r0 == 0) goto L_0x0033
            int r0 = r12.A02
            r11 = -1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = -1
            if (r0 == r11) goto L_0x0061
            r0 = r1[r0]
            X.7UL r10 = r0.A03
            long[] r1 = r10.A07
            r0 = 0
            int r3 = com.facebook.android.exoplayer2.util.Util.A03(r1, r8, r0)
        L_0x0020:
            if (r3 < 0) goto L_0x002d
            int[] r0 = r10.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x003b
            int r3 = r3 + -1
            goto L_0x0020
        L_0x002d:
            int r3 = r10.A00(r8)
            if (r3 != r11) goto L_0x003b
        L_0x0033:
            X.7jv r0 = X.C158407jv.A02
            X.7Xr r2 = new X.7Xr
            r2.<init>(r0, r0)
            return r2
        L_0x003b:
            long[] r2 = r10.A07
            r13 = r2[r3]
            long[] r1 = r10.A06
            r6 = r1[r3]
            int r0 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            int r0 = r10.A01
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x005b
            int r0 = r10.A00(r8)
            if (r0 == r11) goto L_0x005b
            if (r0 == r3) goto L_0x005b
            r2 = r2[r0]
            r4 = r1[r0]
        L_0x0059:
            r8 = r13
            goto L_0x006b
        L_0x005b:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0059
        L_0x0061:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006b:
            r10 = 0
        L_0x006c:
            X.7Lg[] r1 = r12.A0D
            int r0 = r1.length
            if (r10 >= r0) goto L_0x00c6
            int r0 = r12.A02
            if (r10 == r0) goto L_0x00ba
            r0 = r1[r10]
            X.7UL r13 = r0.A03
            long[] r1 = r13.A07
            r0 = 0
            int r1 = com.facebook.android.exoplayer2.util.Util.A03(r1, r8, r0)
        L_0x0080:
            if (r1 < 0) goto L_0x008d
            int[] r0 = r13.A04
            r0 = r0[r1]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x00ab
            int r1 = r1 + -1
            goto L_0x0080
        L_0x008d:
            int r1 = r13.A00(r8)
            if (r1 != r11) goto L_0x00ab
        L_0x0093:
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00ba
            long[] r1 = r13.A07
            r0 = 0
            int r1 = com.facebook.android.exoplayer2.util.Util.A03(r1, r2, r0)
        L_0x009e:
            if (r1 < 0) goto L_0x00b4
            int[] r0 = r13.A04
            r0 = r0[r1]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x00bd
            int r1 = r1 + -1
            goto L_0x009e
        L_0x00ab:
            long[] r0 = r13.A06
            r0 = r0[r1]
            long r6 = java.lang.Math.min(r0, r6)
            goto L_0x0093
        L_0x00b4:
            int r1 = r13.A00(r2)
            if (r1 != r11) goto L_0x00bd
        L_0x00ba:
            int r10 = r10 + 1
            goto L_0x006c
        L_0x00bd:
            long[] r0 = r13.A06
            r0 = r0[r1]
            long r4 = java.lang.Math.min(r0, r4)
            goto L_0x00ba
        L_0x00c6:
            X.7jv r1 = new X.7jv
            r1.<init>(r8, r6)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x00d5
            X.7Xr r2 = new X.7Xr
            r2.<init>(r1, r1)
            return r2
        L_0x00d5:
            X.7jv r0 = new X.7jv
            r0.<init>(r2, r4)
            X.7Xr r2 = new X.7Xr
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass816.BCa(long):X.7Xr");
    }

    public void BFq(C184708sO r1) {
        this.A09 = r1;
    }

    public boolean BIq() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r5 == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r17 < r19) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r5 = r3;
        r19 = r17;
        r25 = r6;
        r21 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r15 >= r23) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        r11 = r3;
        r4 = r6;
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (true == r5) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0354 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiC(X.C153437bJ r27, X.AnonymousClass7A1 r28) {
        /*
            r26 = this;
        L_0x0000:
            r9 = r26
            int r0 = r9.A03
            r13 = r27
            if (r0 == 0) goto L_0x00e5
            r12 = 1
            r14 = r28
            if (r0 == r12) goto L_0x006e
            long r0 = r13.A02
            int r4 = r9.A06
            r10 = -1
            if (r4 != r10) goto L_0x0276
            r4 = -1
            r25 = -1
            r6 = 0
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 1
            r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 1
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0029:
            X.7Lg[] r7 = r9.A0D
            int r2 = r7.length
            if (r6 >= r2) goto L_0x024c
            r2 = r7[r6]
            int r3 = r2.A00
            X.7UL r7 = r2.A03
            int r2 = r7.A01
            if (r3 == r2) goto L_0x0067
            long[] r2 = r7.A06
            r17 = r2[r3]
            long[][] r2 = r9.A0E
            r2 = r2[r6]
            r15 = r2[r3]
            long r17 = r17 - r0
            r7 = 0
            int r2 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x006a
            r7 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            r3 = 0
            if (r5 != 0) goto L_0x0058
        L_0x0054:
            int r2 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r2 >= 0) goto L_0x005f
        L_0x0058:
            r5 = r3
            r19 = r17
            r25 = r6
            r21 = r15
        L_0x005f:
            int r2 = (r15 > r23 ? 1 : (r15 == r23 ? 0 : -1))
            if (r2 >= 0) goto L_0x0067
            r11 = r3
            r4 = r6
            r23 = r15
        L_0x0067:
            int r6 = r6 + 1
            goto L_0x0029
        L_0x006a:
            r3 = 1
            if (r12 != r5) goto L_0x005f
            goto L_0x0054
        L_0x006e:
            long r2 = r9.A07
            int r6 = r9.A00
            long r0 = (long) r6
            long r2 = r2 - r0
            long r0 = r13.A02
            long r0 = r0 + r2
            X.7ph r4 = r9.A0A
            if (r4 == 0) goto L_0x00d5
            byte[] r5 = r4.A02
            int r4 = (int) r2
            r2 = 0
            r13.A05(r5, r6, r4, r2)
            int r3 = r9.A01
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r3 != r2) goto L_0x00b8
            X.7ph r5 = r9.A0A
            r2 = 8
            int r2 = X.C161457ph.A02(r5, r2)
            r4 = 1903435808(0x71742020, float:1.2088509E30)
            if (r2 == r4) goto L_0x00a7
            r2 = 4
            r5.A0I(r2)
        L_0x009a:
            int r3 = r5.A00
            int r2 = r5.A01
            int r3 = r3 - r2
            if (r3 <= 0) goto L_0x00b6
            int r2 = r5.A03()
            if (r2 != r4) goto L_0x009a
        L_0x00a7:
            r2 = 1
        L_0x00a8:
            r9.A0C = r2
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            r9.A00(r0)
            if (r2 == 0) goto L_0x0000
            int r1 = r9.A03
            r0 = 2
            if (r1 == r0) goto L_0x0000
            return r12
        L_0x00b6:
            r2 = 0
            goto L_0x00a8
        L_0x00b8:
            java.util.ArrayDeque r3 = r9.A0J
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00aa
            java.lang.Object r5 = r3.peek()
            X.6Jp r5 = (X.C125816Jp) r5
            int r4 = r9.A01
            X.7ph r2 = r9.A0A
            X.6Jo r3 = new X.6Jo
            r3.<init>(r2, r4)
            java.util.List r2 = r5.A02
            r2.add(r3)
            goto L_0x00aa
        L_0x00d5:
            r5 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00e1
            int r4 = (int) r2
            r13.A01(r4)
            goto L_0x00aa
        L_0x00e1:
            r14.A00 = r0
            r2 = 1
            goto L_0x00ab
        L_0x00e5:
            int r0 = r9.A00
            r8 = 1
            r7 = 8
            r6 = 0
            if (r0 != 0) goto L_0x0108
            X.7ph r2 = r9.A0F
            byte[] r0 = r2.A02
            boolean r0 = r13.A05(r0, r6, r7, r8)
            if (r0 == 0) goto L_0x035b
            r9.A00 = r7
            r2.A0H(r6)
            long r0 = r2.A09()
            r9.A07 = r0
            int r0 = r2.A03()
            r9.A01 = r0
        L_0x0108:
            long r0 = r9.A07
            r3 = 1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01d7
            X.7ph r1 = r9.A0F
            byte[] r0 = r1.A02
            r13.A05(r0, r7, r7, r6)
            int r0 = r9.A00
            int r0 = r0 + 8
            r9.A00 = r0
            long r2 = r1.A0A()
        L_0x0121:
            r9.A07 = r2
        L_0x0123:
            long r4 = r9.A07
            int r1 = r9.A00
            long r2 = (long) r1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0354
            int r10 = r9.A01
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r10 == r0) goto L_0x0202
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r10 == r0) goto L_0x0202
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r10 == r0) goto L_0x0202
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r10 == r0) goto L_0x0202
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r10 == r0) goto L_0x0202
            r0 = 1701082227(0x65647473, float:6.742798E22)
            if (r10 == r0) goto L_0x0202
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r10 == r0) goto L_0x0202
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r10 == r0) goto L_0x01b2
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r10 == r0) goto L_0x01b2
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r10 == r0) goto L_0x01b2
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r10 == r0) goto L_0x01b2
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r10 == r0) goto L_0x01b2
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r10 == r0) goto L_0x01b2
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r10 == r0) goto L_0x01b2
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r10 == r0) goto L_0x01b2
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r10 == r0) goto L_0x01b2
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r10 == r0) goto L_0x01b2
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r10 == r0) goto L_0x01b2
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r10 == r0) goto L_0x01b2
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r10 == r0) goto L_0x01b2
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r10 == r0) goto L_0x01b2
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 == r0) goto L_0x01b2
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r10 == r0) goto L_0x01b2
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r10 == r0) goto L_0x01b2
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r10 == r0) goto L_0x01b2
            r0 = 0
            r9.A0A = r0
        L_0x01ae:
            r9.A03 = r8
            goto L_0x0000
        L_0x01b2:
            boolean r0 = X.AnonymousClass000.A1U(r1, r7)
            X.C159197lM.A02(r0)
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass0x7.A1P(r0)
            X.C159197lM.A02(r0)
            int r0 = (int) r4
            X.7ph r2 = new X.7ph
            r2.<init>((int) r0)
            r9.A0A = r2
            X.7ph r0 = r9.A0F
            byte[] r1 = r0.A02
            byte[] r0 = r2.A02
            java.lang.System.arraycopy(r1, r6, r0, r6, r7)
            goto L_0x01ae
        L_0x01d7:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0123
            long r2 = r13.A04
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01f5
            java.util.ArrayDeque r1 = r9.A0J
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01f5
            java.lang.Object r0 = r1.peek()
            X.6Jp r0 = (X.C125816Jp) r0
            long r2 = r0.A00
        L_0x01f5:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0123
            long r0 = r13.A02
            long r2 = r2 - r0
            int r0 = r9.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            goto L_0x0121
        L_0x0202:
            long r0 = r13.A02
            long r0 = r0 + r4
            long r0 = r0 - r2
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0228
            r2 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r10 != r2) goto L_0x0228
            X.7ph r3 = r9.A0I
            r3.A0F(r7)
            byte[] r2 = r3.A02
            r13.A03(r2, r6, r7)
            r4 = 4
            r3.A0I(r4)
            int r3 = r3.A03()
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 != r2) goto L_0x0242
            r13.A01 = r6
        L_0x0228:
            java.util.ArrayDeque r4 = r9.A0J
            int r3 = r9.A01
            X.6Jp r2 = new X.6Jp
            r2.<init>(r3, r0)
            r4.push(r2)
            long r7 = r9.A07
            int r2 = r9.A00
            long r3 = (long) r2
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0246
            r9.A00(r0)
            goto L_0x0000
        L_0x0242:
            r13.A01(r4)
            goto L_0x0228
        L_0x0246:
            r9.A03 = r6
            r9.A00 = r6
            goto L_0x0000
        L_0x024c:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0260
            if (r11 == 0) goto L_0x0260
            r2 = 10485760(0xa00000, double:5.180654E-317)
            long r23 = r23 + r2
            int r2 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r2 >= 0) goto L_0x0262
        L_0x0260:
            r4 = r25
        L_0x0262:
            r9.A06 = r4
            if (r4 == r10) goto L_0x035b
            r2 = r7[r4]
            X.7Pw r2 = r2.A02
            X.7z1 r2 = r2.A07
            java.lang.String r3 = r2.A0S
            java.lang.String r2 = "audio/ac4"
            boolean r2 = r2.equals(r3)
            r9.A0B = r2
        L_0x0276:
            X.7Lg[] r2 = r9.A0D
            r8 = r2[r4]
            X.8tI r7 = r8.A01
            int r11 = r8.A00
            X.7UL r3 = r8.A03
            long[] r2 = r3.A06
            r5 = r2[r11]
            int[] r2 = r3.A05
            r4 = r2[r11]
            long r2 = r5 - r0
            int r0 = r9.A04
            long r0 = (long) r0
            long r2 = r2 + r0
            r15 = 0
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0350
            r15 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0350
            X.7Pw r0 = r8.A02
            int r0 = r0.A02
            if (r0 != r12) goto L_0x02a6
            r0 = 8
            long r2 = r2 + r0
            int r4 = r4 + -8
        L_0x02a6:
            int r0 = (int) r2
            r13.A01(r0)
            X.7Pw r0 = r8.A02
            int r6 = r0.A01
            r1 = 0
            if (r6 == 0) goto L_0x02f8
            X.7ph r5 = r9.A0G
            byte[] r3 = r5.A02
            r3[r1] = r1
            r3[r12] = r1
            r0 = 2
            r3[r0] = r1
            int r12 = 4 - r6
        L_0x02be:
            int r0 = r9.A04
            if (r0 >= r4) goto L_0x0331
            int r0 = r9.A05
            if (r0 != 0) goto L_0x02e2
            r13.A05(r3, r12, r6, r1)
            int r0 = X.C161457ph.A02(r5, r1)
            if (r0 < 0) goto L_0x02f1
            r9.A05 = r0
            X.7ph r2 = r9.A0H
            r2.A0H(r1)
            r0 = 4
            r7.Bkb(r2, r0)
            int r0 = r9.A04
            int r0 = r0 + 4
            r9.A04 = r0
            int r4 = r4 + r12
            goto L_0x02be
        L_0x02e2:
            int r2 = r7.Bka(r13, r0, r1)
            int r0 = r9.A04
            int r0 = r0 + r2
            r9.A04 = r0
            int r0 = r9.A05
            int r0 = r0 - r2
            r9.A05 = r0
            goto L_0x02be
        L_0x02f1:
            java.lang.String r0 = "Invalid NAL length"
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        L_0x02f8:
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x031c
            X.7ph r3 = r9.A0I
            r0 = 7
            r3.A0F(r0)
            byte[] r2 = r3.A02
            r0 = -84
            r2[r1] = r0
            r0 = 64
            r2[r12] = r0
            X.AnonymousClass6C9.A1F(r2, r4)
            int r2 = r3.A00
            r7.Bkb(r3, r2)
            int r4 = r4 + r2
            int r0 = r9.A04
            int r0 = r0 + r2
            r9.A04 = r0
            r9.A0B = r1
        L_0x031c:
            int r0 = r9.A04
            if (r0 >= r4) goto L_0x0331
            int r0 = r4 - r0
            int r2 = r7.Bka(r13, r0, r1)
            int r0 = r9.A04
            int r0 = r0 + r2
            r9.A04 = r0
            int r0 = r9.A05
            int r0 = r0 - r2
            r9.A05 = r0
            goto L_0x031c
        L_0x0331:
            X.7UL r2 = r8.A03
            long[] r0 = r2.A07
            r16 = r0[r11]
            int[] r0 = r2.A04
            r13 = r0[r11]
            r12 = 0
            r14 = r4
            r15 = r1
            r11 = r7
            r11.Bkg(r12, r13, r14, r15, r16)
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
            r9.A06 = r10
            r9.A04 = r1
            r9.A05 = r1
            r0 = 0
            return r0
        L_0x0350:
            r14.A00 = r5
            r0 = 1
            return r0
        L_0x0354:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        L_0x035b:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass816.BiC(X.7bJ, X.7A1):int");
    }

    public void Bkz(long j, long j2) {
        this.A0J.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        this.A0B = false;
        if (j == 0) {
            this.A03 = 0;
            this.A00 = 0;
            return;
        }
        C149157Lg[] r6 = this.A0D;
        if (r6 != null) {
            for (C149157Lg r3 : r6) {
                AnonymousClass7UL r2 = r3.A03;
                int A032 = Util.A03(r2.A07, j2, false);
                while (true) {
                    if (A032 >= 0) {
                        if ((r2.A04[A032] & 1) != 0) {
                            break;
                        }
                        A032--;
                    } else {
                        A032 = r2.A00(j2);
                        break;
                    }
                }
                r3.A00 = A032;
            }
        }
    }
}
