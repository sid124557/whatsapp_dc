package X;

import java.util.LinkedList;

/* renamed from: X.2ei  reason: invalid class name and case insensitive filesystem */
public class C48322ei {
    public final C48882fd A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1 = X.AnonymousClass0x9.A0i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        throw X.AnonymousClass0x9.A0i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087 A[ExcHandler: 24R | 24S (r0v0 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C73063es A00(X.C48822fX r11) {
        /*
            r10 = this;
            X.2fd r3 = r10.A00     // Catch:{ 24R | 24S -> 0x0087 }
            X.2v7 r2 = r3.A00(r11)     // Catch:{ 24R | 24S -> 0x0087 }
            java.util.LinkedList r1 = r2.A00     // Catch:{ 24R | 24S -> 0x0087 }
            boolean r0 = r1.isEmpty()     // Catch:{ 24R | 24S -> 0x0087 }
            if (r0 == 0) goto L_0x0049
            java.lang.String r5 = "SHA1PRNG"
            java.security.SecureRandom r4 = java.security.SecureRandom.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0081, 24R | 24S -> 0x0087 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r4.nextInt(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0081, 24R | 24S -> 0x0087 }
            r0 = 32
            byte[] r7 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x0027, 24R | 24S -> 0x0087 }
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0027, 24R | 24S -> 0x0087 }
            r0.nextBytes(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0027, 24R | 24S -> 0x0087 }
            goto L_0x002d
        L_0x0027:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ 24R | 24S -> 0x0087 }
            goto L_0x0086
        L_0x002d:
            X.2Ml r0 = X.C616431q.A02()     // Catch:{ 24R | 24S -> 0x0087 }
            r1.clear()     // Catch:{ 24R | 24S -> 0x0087 }
            r9 = 0
            X.3ZK r5 = r0.A01     // Catch:{ 24R | 24S -> 0x0087 }
            X.2JA r0 = r0.A00     // Catch:{ 24R | 24S -> 0x0087 }
            X.47r r6 = new X.47r     // Catch:{ 24R | 24S -> 0x0087 }
            r6.<init>(r0)     // Catch:{ 24R | 24S -> 0x0087 }
            X.2xg r4 = new X.2xg     // Catch:{ 24R | 24S -> 0x0087 }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ 24R | 24S -> 0x0087 }
            r1.add(r4)     // Catch:{ 24R | 24S -> 0x0087 }
            r3.A01(r11, r2)     // Catch:{ 24R | 24S -> 0x0087 }
        L_0x0049:
            boolean r0 = r1.isEmpty()     // Catch:{ 24R | 24S -> 0x0087 }
            if (r0 != 0) goto L_0x0079
            java.lang.Object r1 = X.AnonymousClass0x9.A0t(r1)     // Catch:{ 24R | 24S -> 0x0087 }
            X.2xg r1 = (X.C59902xg) r1     // Catch:{ 24R | 24S -> 0x0087 }
            X.1Cx r0 = r1.A00     // Catch:{ 24R | 24S -> 0x0087 }
            int r4 = r0.senderKeyId_     // Catch:{ 24R | 24S -> 0x0087 }
            X.2xr r0 = r1.A00()     // Catch:{ 24R | 24S -> 0x0087 }
            int r3 = r0.A00     // Catch:{ 24R | 24S -> 0x0087 }
            X.2xr r0 = r1.A00()     // Catch:{ 24R | 24S -> 0x0087 }
            byte[] r2 = r0.A01     // Catch:{ 24R | 24S -> 0x0087 }
            X.1Cx r0 = r1.A00     // Catch:{ 24R | 24S -> 0x0087 }
            X.1Bp r0 = r0.senderSigningKey_     // Catch:{ 24R | 24S -> 0x0087 }
            if (r0 != 0) goto L_0x006d
            X.1Bp r0 = X.C21381Bp.DEFAULT_INSTANCE     // Catch:{ 24R | 24S -> 0x0087 }
        L_0x006d:
            X.8Lq r0 = r0.public_     // Catch:{ 24R | 24S -> 0x0087 }
            X.3ZK r1 = X.C616431q.A00(r0)     // Catch:{ 24R | 24S -> 0x0087 }
            X.3es r0 = new X.3es     // Catch:{ 24R | 24S -> 0x0087 }
            r0.<init>(r1, r2, r4, r3)     // Catch:{ 24R | 24S -> 0x0087 }
            return r0
        L_0x0079:
            java.lang.String r0 = "No key state in record!"
            X.24S r1 = new X.24S     // Catch:{ 24R | 24S -> 0x0087 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 24R | 24S -> 0x0087 }
            goto L_0x0086
        L_0x0081:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ 24R | 24S -> 0x0087 }
        L_0x0086:
            throw r1     // Catch:{ 24R | 24S -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48322ei.A00(X.2fX):X.3es");
    }

    public void A01(C48822fX r12, C73063es r13) {
        C48882fd r4 = this.A00;
        C58352v7 A002 = r4.A00(r12);
        int i = r13.A00;
        int i2 = r13.A01;
        byte[] bArr = r13.A03;
        AnonymousClass3ZK r6 = r13.A02;
        LinkedList linkedList = A002.A00;
        linkedList.addFirst(new C59902xg(r6, AnonymousClass47s.A00, bArr, i, i2));
        if (linkedList.size() > 5) {
            linkedList.removeLast();
        }
        r4.A01(r12, A002);
    }

    public C48322ei(C48882fd r1) {
        this.A00 = r1;
    }
}
