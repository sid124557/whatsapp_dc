package X;

/* renamed from: X.2XJ  reason: invalid class name */
public class AnonymousClass2XJ {
    public final C48872fc A00;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = X.AnonymousClass0x9.A0i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r0 = X.AnonymousClass0x9.A0i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        throw X.AnonymousClass0x9.A0i(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e A[ExcHandler: 24R | 24S (r0v1 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:3:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C73053er A00(X.C48822fX r15) {
        /*
            r14 = this;
            java.lang.Object r7 = X.C39312Bm.A00
            monitor-enter(r7)
            r1 = 3
            X.2fc r5 = r14.A00     // Catch:{ 24R | 24S -> 0x009e }
            X.2wQ r4 = r5.A00(r15)     // Catch:{ 24R | 24S -> 0x009e }
            java.util.LinkedList r3 = r4.A00     // Catch:{ 24R | 24S -> 0x009e }
            boolean r0 = r3.isEmpty()     // Catch:{ 24R | 24S -> 0x009e }
            if (r0 != 0) goto L_0x0026
            X.2wR r0 = r4.A00()     // Catch:{ 24R | 24S -> 0x009e }
            r2 = 1
            int r2 = r2 << r1
            X.1CY r0 = r0.A00     // Catch:{ 24R | 24S -> 0x009e }
            X.8ya r1 = r0.senderChainKeys_     // Catch:{ 24R | 24S -> 0x009e }
            X.35L r0 = new X.35L     // Catch:{ 24R | 24S -> 0x009e }
            r0.<init>((java.util.List) r1)     // Catch:{ 24R | 24S -> 0x009e }
            byte[][] r0 = r0.A01     // Catch:{ 24R | 24S -> 0x009e }
            int r0 = r0.length     // Catch:{ 24R | 24S -> 0x009e }
            if (r2 == r0) goto L_0x0061
        L_0x0026:
            r0 = 32
            byte[] r6 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x0092, 24R | 24S -> 0x009e }
            java.lang.String r1 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0092, 24R | 24S -> 0x009e }
            r0.nextBytes(r6)     // Catch:{ NoSuchAlgorithmException -> 0x0092, 24R | 24S -> 0x009e }
            X.35L r2 = new X.35L     // Catch:{ 24R | 24S -> 0x009e }
            r2.<init>((byte[]) r6)     // Catch:{ 24R | 24S -> 0x009e }
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0098, 24R | 24S -> 0x009e }
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r1.nextInt(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0098, 24R | 24S -> 0x009e }
            byte[][] r11 = r2.A01     // Catch:{ 24R | 24S -> 0x009e }
            X.2Ml r0 = X.C616431q.A02()     // Catch:{ 24R | 24S -> 0x009e }
            r3.clear()     // Catch:{ 24R | 24S -> 0x009e }
            r13 = 0
            X.3ZK r9 = r0.A01     // Catch:{ 24R | 24S -> 0x009e }
            X.2JA r0 = r0.A00     // Catch:{ 24R | 24S -> 0x009e }
            X.47r r10 = new X.47r     // Catch:{ 24R | 24S -> 0x009e }
            r10.<init>(r0)     // Catch:{ 24R | 24S -> 0x009e }
            X.2wR r8 = new X.2wR     // Catch:{ 24R | 24S -> 0x009e }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ 24R | 24S -> 0x009e }
            r3.add(r8)     // Catch:{ 24R | 24S -> 0x009e }
            r5.A01(r15, r4)     // Catch:{ 24R | 24S -> 0x009e }
        L_0x0061:
            X.2wR r5 = r4.A00()     // Catch:{ 24R | 24S -> 0x009e }
            X.1CY r0 = r5.A00     // Catch:{ 24R | 24S -> 0x009e }
            int r4 = r0.senderKeyId_     // Catch:{ 24R | 24S -> 0x009e }
            X.8ya r1 = r0.senderChainKeys_     // Catch:{ 24R | 24S -> 0x009e }
            X.35L r0 = new X.35L     // Catch:{ 24R | 24S -> 0x009e }
            r0.<init>((java.util.List) r1)     // Catch:{ 24R | 24S -> 0x009e }
            int r3 = r0.A00     // Catch:{ 24R | 24S -> 0x009e }
            X.1CY r0 = r5.A00     // Catch:{ 24R | 24S -> 0x009e }
            X.8ya r1 = r0.senderChainKeys_     // Catch:{ 24R | 24S -> 0x009e }
            X.35L r0 = new X.35L     // Catch:{ 24R | 24S -> 0x009e }
            r0.<init>((java.util.List) r1)     // Catch:{ 24R | 24S -> 0x009e }
            byte[][] r2 = r0.A01     // Catch:{ 24R | 24S -> 0x009e }
            X.1CY r0 = r5.A00     // Catch:{ 24R | 24S -> 0x009e }
            X.1Bp r0 = r0.senderSigningKey_     // Catch:{ 24R | 24S -> 0x009e }
            if (r0 != 0) goto L_0x0085
            X.1Bp r0 = X.C21381Bp.DEFAULT_INSTANCE     // Catch:{ 24R | 24S -> 0x009e }
        L_0x0085:
            X.8Lq r0 = r0.public_     // Catch:{ 24R | 24S -> 0x009e }
            X.3ZK r1 = X.C616431q.A00(r0)     // Catch:{ 24R | 24S -> 0x009e }
            X.3er r0 = new X.3er     // Catch:{ 24R | 24S -> 0x009e }
            r0.<init>(r1, r2, r4, r3)     // Catch:{ 24R | 24S -> 0x009e }
            monitor-exit(r7)     // Catch:{ all -> 0x00a4 }
            return r0
        L_0x0092:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ 24R | 24S -> 0x009e }
            goto L_0x009d
        L_0x0098:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ 24R | 24S -> 0x009e }
        L_0x009d:
            throw r0     // Catch:{ 24R | 24S -> 0x009e }
        L_0x009e:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2XJ.A00(X.2fX):X.3er");
    }

    public AnonymousClass2XJ(C48872fc r1) {
        this.A00 = r1;
    }
}
