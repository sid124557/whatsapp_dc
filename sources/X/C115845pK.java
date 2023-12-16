package X;

/* renamed from: X.5pK  reason: invalid class name and case insensitive filesystem */
public class C115845pK implements AnonymousClass4BK {
    public AnonymousClass66F[] A00;
    public final C69263Wi A01;
    public final C54292oU A02;
    public final AnonymousClass5PU A03;
    public final AnonymousClass3LZ A04;

    public C115845pK(C69263Wi r4, C54292oU r5, AnonymousClass5PU r6, AnonymousClass3LZ r7) {
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A00 = new AnonymousClass66F[]{new C115825pI(r5), new C115835pJ(r5)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if ((r3 instanceof X.C30481mW) != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fa, code lost:
        if (r9 != 6) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C102345Im BCw(android.content.Context r27, java.lang.String r28, java.util.List r29) {
        /*
            r26 = this;
            X.C626936e.A00()
            r3 = r29
            boolean r0 = r3.isEmpty()
            r7 = 0
            if (r0 == 0) goto L_0x000d
            return r7
        L_0x000d:
            X.5Im r6 = new X.5Im
            r6.<init>()
            r2 = 0
        L_0x0013:
            r12 = r26
            X.66F[] r1 = r12.A00
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0131
            r11 = r1[r2]
            boolean r0 = r11.BJI()
            if (r0 == 0) goto L_0x00c5
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            X.3LZ r0 = r12.A04
            r1 = r27
            X.5Vv r0 = X.C105645Vv.A00(r1, r0, r3)
            int r9 = r0.A00
            if (r9 == 0) goto L_0x0131
            java.util.Map r0 = r0.A01
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r17 = X.AnonymousClass000.A0q(r0)
        L_0x003c:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r17)
            java.lang.Object r3 = r0.getKey()
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r10 = r0.getValue()
            X.5Hw r10 = (X.C102205Hw) r10
            java.io.File r5 = r10.A00
            X.2oU r0 = r12.A02     // Catch:{ IllegalArgumentException -> 0x00c9 }
            android.content.Context r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00c9 }
            java.lang.String r0 = X.C58152un.A07     // Catch:{ IllegalArgumentException -> 0x00c9 }
            android.net.Uri r4 = androidx.core.content.FileProvider.A00(r1, r5, r0)     // Catch:{ IllegalArgumentException -> 0x00c9 }
            java.lang.Integer r0 = X.C18290x4.A0Z()
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
            boolean r2 = r3 instanceof X.AnonymousClass1n2
            java.lang.String r21 = ""
            if (r2 != 0) goto L_0x00b4
            boolean r0 = r3 instanceof X.C31981pC
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r3 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0078
        L_0x0074:
            android.util.Pair r1 = X.C107655bf.A0L(r5)
        L_0x0078:
            if (r4 == 0) goto L_0x003c
            java.lang.Object r0 = r1.first
            X.C626936e.A06(r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            double r2 = (double) r0
            java.lang.Object r0 = r1.second
            X.C626936e.A06(r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            double r0 = (double) r0
            r15 = 0
            int r14 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x00b2
            r0 = 0
        L_0x0096:
            int r25 = X.C107655bf.A0F(r5)
            java.lang.String r3 = r10.A01
            r8.add(r4)
            X.5KK r2 = new X.5KK
            r20 = r5
            r22 = r3
            r23 = r0
            r18 = r2
            r19 = r4
            r18.<init>(r19, r20, r21, r22, r23, r25)
            r13.add(r2)
            goto L_0x003c
        L_0x00b2:
            double r0 = r0 / r2
            goto L_0x0096
        L_0x00b4:
            X.1mV r3 = (X.C30471mV) r3
            java.lang.String r0 = r3.A1w()
            if (r0 == 0) goto L_0x00be
            r21 = r0
        L_0x00be:
            if (r2 != 0) goto L_0x0074
            android.util.Pair r1 = X.C107655bf.A0N(r5)
            goto L_0x0078
        L_0x00c5:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x00c9:
            X.3Wi r3 = r12.A01
            X.5PU r2 = r12.A03
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            r4 = r28
            X.C18260x0.A0Q(r2, r4)
            r1 = 12
            X.3c0 r0 = new X.3c0
            r0.<init>(r1, r4, r2)
            r3.A0S(r0)
            java.lang.String r0 = "getSharingIntent: Attempting to share file failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x00e6:
            android.content.Intent r5 = r11.BCv(r13, r9)
            r6.A01 = r5
            r6.A02 = r8
            if (r5 != 0) goto L_0x0100
            boolean r0 = r11 instanceof X.C115825pI
            if (r0 == 0) goto L_0x00fc
            r0 = 7
            r1 = 1
            if (r9 == r0) goto L_0x00fd
            r0 = 6
            r1 = 2
            if (r9 == r0) goto L_0x00fd
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            r6.A00 = r1
            return r6
        L_0x0100:
            int r0 = r8.size()
            r4 = 1
            if (r0 <= 0) goto L_0x012e
            java.lang.Object r0 = X.AnonymousClass0x9.A0t(r8)
            android.net.Uri r0 = (android.net.Uri) r0
            android.content.ClipData r3 = android.content.ClipData.newRawUri(r7, r0)
            r2 = 1
        L_0x0112:
            int r0 = r8.size()
            if (r2 >= r0) goto L_0x0129
            java.lang.Object r1 = r8.get(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            android.content.ClipData$Item r0 = new android.content.ClipData$Item
            r0.<init>(r1)
            r3.addItem(r0)
            int r2 = r2 + 1
            goto L_0x0112
        L_0x0129:
            if (r3 == 0) goto L_0x012e
            r5.setClipData(r3)
        L_0x012e:
            r5.addFlags(r4)
        L_0x0131:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115845pK.BCw(android.content.Context, java.lang.String, java.util.List):X.5Im");
    }
}
