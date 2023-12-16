package X;

/* renamed from: X.324  reason: invalid class name */
public class AnonymousClass324 {
    public static final Object A00 = AnonymousClass002.A0D();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r0 = X.C21381Bp.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r2.A00(X.C616431q.A00(r0.public_));
        r4 = r2.A00;
        r6 = r7.A00();
        r3 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r3 <= r4) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r1 = r7.A00.senderMessageKeys_.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r1.hasNext() == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (((X.C21371Bo) r1.next()).iteration_ != r4) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r9 = new java.util.LinkedList(r7.A00.senderMessageKeys_);
        r1 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r1.hasNext() == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r8 = (X.C21371Bo) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r8.iteration_ != r4) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        r1.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r4 = r7.A00.A0H();
        ((X.C21721Cx) X.C18320x8.A0C(r4)).senderMessageKeys_ = X.C130236bd.A02;
        r3 = (X.C21721Cx) X.C18320x8.A0C(r4);
        r1 = r3.senderMessageKeys_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        if (((X.AnonymousClass8T6) r1).A00 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        r1 = X.C130786cX.A07(r1);
        r3.senderMessageKeys_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        X.C170208Ch.A05(r9, r1);
        r7.A00 = (X.C21721Cx) r4.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        if (r8 == null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r6 = new X.C43012Qk(r8.iteration_, r8.seed_.A07());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Received message with old counter: ");
        r1.append(r3);
        r1 = new X.C377123s(X.AnonymousClass000.A0Y(" , ", r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if ((r4 - r3) <= 2000) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
        if (r6.A00 >= r4) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        r9 = r6.A01();
        r8 = X.C21371Bo.DEFAULT_INSTANCE.A0G();
        r3 = r9.A00;
        r1 = (X.C21371Bo) X.C18320x8.A0C(r8);
        r1.bitField0_ |= 1;
        r1.iteration_ = r3;
        r1 = r9.A03;
        r3 = X.C18300x5.A0J(r8, r1, r1.length);
        r1 = (X.C21371Bo) r8.A00;
        r1.bitField0_ |= 2;
        r1.seed_ = r3;
        r10 = r8.A06();
        r8 = r7.A00.A0H();
        r3 = (X.C21721Cx) X.C18320x8.A0C(r8);
        r10.getClass();
        r1 = r3.senderMessageKeys_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012c, code lost:
        if (((X.AnonymousClass8T6) r1).A00 != false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012e, code lost:
        r1 = X.C130786cX.A07(r1);
        r3.senderMessageKeys_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0134, code lost:
        r1.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0143, code lost:
        if (((X.C21721Cx) r8.A00).senderMessageKeys_.size() <= 2000) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0145, code lost:
        r3 = (X.C21721Cx) X.C18320x8.A0C(r8);
        r1 = r3.senderMessageKeys_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0152, code lost:
        if (((X.AnonymousClass8T6) r1).A00 != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0154, code lost:
        r1 = X.C130786cX.A07(r1);
        r3.senderMessageKeys_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015a, code lost:
        r1.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015d, code lost:
        r7.A00 = (X.C21721Cx) r8.A06();
        r6 = r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016b, code lost:
        r7.A01(r6.A00());
        r6 = r6.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0176, code lost:
        r0 = r6.A02;
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0 = X.C18310x6.A1Y(X.C18300x5.A0y(r1), X.C18330xA.A0D(r0), javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding"), r2.A02, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.BF5(r0);
        r11.A01(r13, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0195, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c3, code lost:
        r1 = new X.AnonymousClass24X("Over 2000 messages into the future!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01cb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d1, code lost:
        throw new X.AnonymousClass24X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r0 = r1.senderSigningKey_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r0 != null) goto L_0x002f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01cb A[ExcHandler: 24R | 24S (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A00(X.C48882fd r11, X.AnonymousClass4CB r12, X.C48822fX r13, byte[] r14) {
        /*
            X.2v7 r5 = r11.A00(r13)     // Catch:{ 24R | 24S -> 0x01cb }
            java.util.LinkedList r1 = r5.A00     // Catch:{ 24R | 24S -> 0x01cb }
            boolean r0 = r1.isEmpty()     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 != 0) goto L_0x01b3
            X.3eu r2 = new X.3eu     // Catch:{ 24R | 24S -> 0x01cb }
            r2.<init>(r14)     // Catch:{ 24R | 24S -> 0x01cb }
            int r4 = r2.A01     // Catch:{ 24R | 24S -> 0x01cb }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x0017:
            boolean r0 = r3.hasNext()     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r7 = r3.next()     // Catch:{ 24R | 24S -> 0x01cb }
            X.2xg r7 = (X.C59902xg) r7     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Cx r1 = r7.A00     // Catch:{ 24R | 24S -> 0x01cb }
            int r0 = r1.senderKeyId_     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 != r4) goto L_0x0017
            X.1Bp r0 = r1.senderSigningKey_     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 != 0) goto L_0x002f
            X.1Bp r0 = X.C21381Bp.DEFAULT_INSTANCE     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x002f:
            X.8Lq r0 = r0.public_     // Catch:{ 24R | 24S -> 0x01cb }
            X.3ZK r0 = X.C616431q.A00(r0)     // Catch:{ 24R | 24S -> 0x01cb }
            r2.A00(r0)     // Catch:{ 24R | 24S -> 0x01cb }
            int r4 = r2.A00     // Catch:{ 24R | 24S -> 0x01cb }
            X.2xr r6 = r7.A00()     // Catch:{ 24R | 24S -> 0x01cb }
            int r3 = r6.A00     // Catch:{ 24R | 24S -> 0x01cb }
            if (r3 <= r4) goto L_0x00d8
            X.1Cx r0 = r7.A00     // Catch:{ 24R | 24S -> 0x01cb }
            X.8ya r0 = r0.senderMessageKeys_     // Catch:{ 24R | 24S -> 0x01cb }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x004a:
            boolean r0 = r1.hasNext()     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r1.next()     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Bo r0 = (X.C21371Bo) r0     // Catch:{ 24R | 24S -> 0x01cb }
            int r0 = r0.iteration_     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 != r4) goto L_0x004a
            X.1Cx r0 = r7.A00     // Catch:{ 24R | 24S -> 0x01cb }
            X.8ya r0 = r0.senderMessageKeys_     // Catch:{ 24R | 24S -> 0x01cb }
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ 24R | 24S -> 0x01cb }
            r9.<init>(r0)     // Catch:{ 24R | 24S -> 0x01cb }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x0067:
            boolean r0 = r1.hasNext()     // Catch:{ 24R | 24S -> 0x01cb }
            r6 = 0
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r8 = r1.next()     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Bo r8 = (X.C21371Bo) r8     // Catch:{ 24R | 24S -> 0x01cb }
            int r0 = r8.iteration_     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 != r4) goto L_0x0067
            r1.remove()     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x007b:
            X.1Cx r0 = r7.A00     // Catch:{ 24R | 24S -> 0x01cb }
            X.6c9 r4 = r0.A0H()     // Catch:{ 24R | 24S -> 0x01cb }
            X.6cX r1 = X.C18320x8.A0C(r4)     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Cx r1 = (X.C21721Cx) r1     // Catch:{ 24R | 24S -> 0x01cb }
            X.6bd r0 = X.C130236bd.A02     // Catch:{ 24R | 24S -> 0x01cb }
            r1.senderMessageKeys_ = r0     // Catch:{ 24R | 24S -> 0x01cb }
            X.6cX r3 = X.C18320x8.A0C(r4)     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Cx r3 = (X.C21721Cx) r3     // Catch:{ 24R | 24S -> 0x01cb }
            X.8ya r1 = r3.senderMessageKeys_     // Catch:{ 24R | 24S -> 0x01cb }
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0     // Catch:{ 24R | 24S -> 0x01cb }
            boolean r0 = r0.A00     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 != 0) goto L_0x00a0
            X.8ya r1 = X.C130786cX.A07(r1)     // Catch:{ 24R | 24S -> 0x01cb }
            r3.senderMessageKeys_ = r1     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x00a0:
            X.C170208Ch.A05(r9, r1)     // Catch:{ 24R | 24S -> 0x01cb }
            X.6cX r0 = r4.A06()     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Cx r0 = (X.C21721Cx) r0     // Catch:{ 24R | 24S -> 0x01cb }
            r7.A00 = r0     // Catch:{ 24R | 24S -> 0x01cb }
            goto L_0x00ae
        L_0x00ac:
            r8 = r6
            goto L_0x007b
        L_0x00ae:
            if (r8 == 0) goto L_0x0176
            int r1 = r8.iteration_     // Catch:{ 24R | 24S -> 0x01cb }
            X.8Lq r0 = r8.seed_     // Catch:{ 24R | 24S -> 0x01cb }
            byte[] r0 = r0.A07()     // Catch:{ 24R | 24S -> 0x01cb }
            X.2Qk r6 = new X.2Qk     // Catch:{ 24R | 24S -> 0x01cb }
            r6.<init>(r1, r0)     // Catch:{ 24R | 24S -> 0x01cb }
            goto L_0x0176
        L_0x00bf:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24R | 24S -> 0x01cb }
            java.lang.String r0 = "Received message with old counter: "
            r1.append(r0)     // Catch:{ 24R | 24S -> 0x01cb }
            r1.append(r3)     // Catch:{ 24R | 24S -> 0x01cb }
            java.lang.String r0 = " , "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ 24R | 24S -> 0x01cb }
            X.23s r1 = new X.23s     // Catch:{ 24R | 24S -> 0x01cb }
            r1.<init>(r0)     // Catch:{ 24R | 24S -> 0x01cb }
            goto L_0x01ca
        L_0x00d8:
            int r1 = r4 - r3
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 <= r0) goto L_0x00e0
            goto L_0x01c3
        L_0x00e0:
            int r0 = r6.A00     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 >= r4) goto L_0x016b
            X.2Qk r9 = r6.A01()     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Bo r0 = X.C21371Bo.DEFAULT_INSTANCE     // Catch:{ 24R | 24S -> 0x01cb }
            X.6c9 r8 = r0.A0G()     // Catch:{ 24R | 24S -> 0x01cb }
            int r3 = r9.A00     // Catch:{ 24R | 24S -> 0x01cb }
            X.6cX r1 = X.C18320x8.A0C(r8)     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Bo r1 = (X.C21371Bo) r1     // Catch:{ 24R | 24S -> 0x01cb }
            int r0 = r1.bitField0_     // Catch:{ 24R | 24S -> 0x01cb }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 24R | 24S -> 0x01cb }
            r1.iteration_ = r3     // Catch:{ 24R | 24S -> 0x01cb }
            byte[] r1 = r9.A03     // Catch:{ 24R | 24S -> 0x01cb }
            int r0 = r1.length     // Catch:{ 24R | 24S -> 0x01cb }
            r9 = 0
            X.8Lq r3 = X.C18300x5.A0J(r8, r1, r0)     // Catch:{ 24R | 24S -> 0x01cb }
            X.6cX r1 = r8.A00     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Bo r1 = (X.C21371Bo) r1     // Catch:{ 24R | 24S -> 0x01cb }
            int r0 = r1.bitField0_     // Catch:{ 24R | 24S -> 0x01cb }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ 24R | 24S -> 0x01cb }
            r1.seed_ = r3     // Catch:{ 24R | 24S -> 0x01cb }
            X.6cX r10 = r8.A06()     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Cx r0 = r7.A00     // Catch:{ 24R | 24S -> 0x01cb }
            X.6c9 r8 = r0.A0H()     // Catch:{ 24R | 24S -> 0x01cb }
            X.6cX r3 = X.C18320x8.A0C(r8)     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Cx r3 = (X.C21721Cx) r3     // Catch:{ 24R | 24S -> 0x01cb }
            r10.getClass()     // Catch:{ 24R | 24S -> 0x01cb }
            X.8ya r1 = r3.senderMessageKeys_     // Catch:{ 24R | 24S -> 0x01cb }
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0     // Catch:{ 24R | 24S -> 0x01cb }
            boolean r0 = r0.A00     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 != 0) goto L_0x0134
            X.8ya r1 = X.C130786cX.A07(r1)     // Catch:{ 24R | 24S -> 0x01cb }
            r3.senderMessageKeys_ = r1     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x0134:
            r1.add(r10)     // Catch:{ 24R | 24S -> 0x01cb }
            X.6cX r0 = r8.A00     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Cx r0 = (X.C21721Cx) r0     // Catch:{ 24R | 24S -> 0x01cb }
            X.8ya r0 = r0.senderMessageKeys_     // Catch:{ 24R | 24S -> 0x01cb }
            int r1 = r0.size()     // Catch:{ 24R | 24S -> 0x01cb }
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 <= r0) goto L_0x015d
            X.6cX r3 = X.C18320x8.A0C(r8)     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Cx r3 = (X.C21721Cx) r3     // Catch:{ 24R | 24S -> 0x01cb }
            X.8ya r1 = r3.senderMessageKeys_     // Catch:{ 24R | 24S -> 0x01cb }
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0     // Catch:{ 24R | 24S -> 0x01cb }
            boolean r0 = r0.A00     // Catch:{ 24R | 24S -> 0x01cb }
            if (r0 != 0) goto L_0x015a
            X.8ya r1 = X.C130786cX.A07(r1)     // Catch:{ 24R | 24S -> 0x01cb }
            r3.senderMessageKeys_ = r1     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x015a:
            r1.remove(r9)     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x015d:
            X.6cX r0 = r8.A06()     // Catch:{ 24R | 24S -> 0x01cb }
            X.1Cx r0 = (X.C21721Cx) r0     // Catch:{ 24R | 24S -> 0x01cb }
            r7.A00 = r0     // Catch:{ 24R | 24S -> 0x01cb }
            X.2xr r6 = r6.A00()     // Catch:{ 24R | 24S -> 0x01cb }
            goto L_0x00e0
        L_0x016b:
            X.2xr r0 = r6.A00()     // Catch:{ 24R | 24S -> 0x01cb }
            r7.A01(r0)     // Catch:{ 24R | 24S -> 0x01cb }
            X.2Qk r6 = r6.A01()     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x0176:
            byte[] r0 = r6.A02     // Catch:{ 24R | 24S -> 0x01cb }
            byte[] r1 = r6.A01     // Catch:{ 24R | 24S -> 0x01cb }
            byte[] r4 = r2.A02     // Catch:{ 24R | 24S -> 0x01cb }
            javax.crypto.spec.IvParameterSpec r3 = X.C18330xA.A0D(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x019d, BadPaddingException | IllegalBlockSizeException -> 0x0196, 24R | 24S -> 0x01cb }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x019d, BadPaddingException | IllegalBlockSizeException -> 0x0196, 24R | 24S -> 0x01cb }
            javax.crypto.spec.SecretKeySpec r1 = X.C18300x5.A0y(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x019d, BadPaddingException | IllegalBlockSizeException -> 0x0196, 24R | 24S -> 0x01cb }
            r0 = 2
            byte[] r0 = X.C18310x6.A1Y(r1, r3, r2, r4, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x019d, BadPaddingException | IllegalBlockSizeException -> 0x0196, 24R | 24S -> 0x01cb }
            r12.BF5(r0)     // Catch:{ 24R | 24S -> 0x01cb }
            r11.A01(r13, r5)     // Catch:{ 24R | 24S -> 0x01cb }
            return r0
        L_0x0196:
            r0 = move-exception
            X.24X r1 = new X.24X     // Catch:{ 24R | 24S -> 0x01cb }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ 24R | 24S -> 0x01cb }
            goto L_0x01ca
        L_0x019d:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ 24R | 24S -> 0x01cb }
            goto L_0x01ca
        L_0x01a3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24R | 24S -> 0x01cb }
            java.lang.String r0 = "No keys for: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ 24R | 24S -> 0x01cb }
            X.24S r1 = new X.24S     // Catch:{ 24R | 24S -> 0x01cb }
            r1.<init>((java.lang.String) r0)     // Catch:{ 24R | 24S -> 0x01cb }
            goto L_0x01ca
        L_0x01b3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24R | 24S -> 0x01cb }
            java.lang.String r0 = "No sender key for: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r13, r0, r1)     // Catch:{ 24R | 24S -> 0x01cb }
            X.24T r1 = new X.24T     // Catch:{ 24R | 24S -> 0x01cb }
            r1.<init>((java.lang.String) r0)     // Catch:{ 24R | 24S -> 0x01cb }
            goto L_0x01ca
        L_0x01c3:
            java.lang.String r0 = "Over 2000 messages into the future!"
            X.24X r1 = new X.24X     // Catch:{ 24R | 24S -> 0x01cb }
            r1.<init>((java.lang.String) r0)     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x01ca:
            throw r1     // Catch:{ 24R | 24S -> 0x01cb }
        L_0x01cb:
            r1 = move-exception
            X.24X r0 = new X.24X
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass324.A00(X.2fd, X.4CB, X.2fX, byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[SYNTHETIC, Splitter:B:19:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076 A[Catch:{ 24S -> 0x008c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(X.C48882fd r8, X.C48822fX r9, byte[] r10) {
        /*
            X.2v7 r5 = r8.A00(r9)     // Catch:{ 24S -> 0x008c }
            java.util.LinkedList r1 = r5.A00     // Catch:{ 24S -> 0x008c }
            boolean r0 = r1.isEmpty()     // Catch:{ 24S -> 0x008c }
            if (r0 != 0) goto L_0x007e
            java.lang.Object r4 = X.AnonymousClass0x9.A0t(r1)     // Catch:{ 24S -> 0x008c }
            X.2xg r4 = (X.C59902xg) r4     // Catch:{ 24S -> 0x008c }
            X.2xr r0 = r4.A00()     // Catch:{ 24S -> 0x008c }
            X.2Qk r7 = r0.A01()     // Catch:{ 24S -> 0x008c }
            X.1Cx r1 = r4.A00     // Catch:{ 24S -> 0x008c }
            int r0 = r1.bitField0_     // Catch:{ 24S -> 0x008c }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0032
            X.1Bp r0 = r1.senderSigningKey_     // Catch:{ 24S -> 0x008c }
            r1 = r0
            if (r0 != 0) goto L_0x0029
            X.1Bp r0 = X.C21381Bp.DEFAULT_INSTANCE     // Catch:{ 24S -> 0x008c }
        L_0x0029:
            int r0 = r0.bitField0_     // Catch:{ 24S -> 0x008c }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0032
            if (r1 != 0) goto L_0x0036
            goto L_0x0034
        L_0x0032:
            r6 = 0
            goto L_0x0041
        L_0x0034:
            X.1Bp r1 = X.C21381Bp.DEFAULT_INSTANCE     // Catch:{ 24S -> 0x008c }
        L_0x0036:
            X.8Lq r0 = r1.private_     // Catch:{ 24S -> 0x008c }
            byte[] r0 = r0.A07()     // Catch:{ 24S -> 0x008c }
            X.2JA r6 = new X.2JA     // Catch:{ 24S -> 0x008c }
            r6.<init>(r0)     // Catch:{ 24S -> 0x008c }
        L_0x0041:
            byte[] r0 = r7.A02     // Catch:{ 24S -> 0x008c }
            byte[] r1 = r7.A01     // Catch:{ 24S -> 0x008c }
            javax.crypto.spec.IvParameterSpec r3 = X.C18330xA.A0D(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0086 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0086 }
            javax.crypto.spec.SecretKeySpec r1 = X.C18300x5.A0y(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0086 }
            r0 = 1
            byte[] r3 = X.C18310x6.A1Y(r1, r3, r2, r10, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0086 }
            if (r6 == 0) goto L_0x0076
            X.1Cx r0 = r4.A00     // Catch:{ 24S -> 0x008c }
            int r2 = r0.senderKeyId_     // Catch:{ 24S -> 0x008c }
            int r0 = r7.A00     // Catch:{ 24S -> 0x008c }
            X.3eu r1 = new X.3eu     // Catch:{ 24S -> 0x008c }
            r1.<init>(r6, r3, r2, r0)     // Catch:{ 24S -> 0x008c }
            X.2xr r0 = r4.A00()     // Catch:{ 24S -> 0x008c }
            X.2xr r0 = r0.A00()     // Catch:{ 24S -> 0x008c }
            r4.A01(r0)     // Catch:{ 24S -> 0x008c }
            r8.A01(r9, r5)     // Catch:{ 24S -> 0x008c }
            byte[] r0 = r1.A03     // Catch:{ 24S -> 0x008c }
            return r0
        L_0x0076:
            java.lang.String r0 = "Session missing signature key!"
            X.24R r1 = new X.24R     // Catch:{ 24S -> 0x008c }
            r1.<init>(r0)     // Catch:{ 24S -> 0x008c }
            goto L_0x008b
        L_0x007e:
            java.lang.String r0 = "No key state in record!"
            X.24S r1 = new X.24S     // Catch:{ 24S -> 0x008c }
            r1.<init>((java.lang.String) r0)     // Catch:{ 24S -> 0x008c }
            goto L_0x008b
        L_0x0086:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ 24S -> 0x008c }
        L_0x008b:
            throw r1     // Catch:{ 24S -> 0x008c }
        L_0x008c:
            r1 = move-exception
            X.24T r0 = new X.24T
            r0.<init>((java.lang.Exception) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass324.A01(X.2fd, X.2fX, byte[]):byte[]");
    }
}
