package X;

import android.net.Uri;
import org.json.JSONObject;

/* renamed from: X.5QP  reason: invalid class name */
public final class AnonymousClass5QP {
    public final AnonymousClass5N1 A00;
    public final C49452gY A01;
    public final C105605Vr A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4FV A04;

    public AnonymousClass5QP(AnonymousClass5N1 r2, C49452gY r3, C105605Vr r4, AnonymousClass1VX r5, AnonymousClass4FV r6) {
        C18260x0.A0b(r6, r4, r5, 2);
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0281, code lost:
        if (r1 != null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0189, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r2 = X.AnonymousClass001.A0o();
        r2.append("JWT: ");
        X.C18260x0.A14(": Can't verify signature ", r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r2 = new X.C133826i0(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021e, code lost:
        if (r2 == 0) goto L_0x0220;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a1 A[ExcHandler: Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException (r0v95 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:17:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b7 A[Catch:{ 6yg -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bc A[Catch:{ 6yg -> 0x01f0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C105845Wq A02(android.net.Uri r29, int r30) {
        /*
            r28 = this;
            java.lang.String r0 = "token"
            r9 = r29
            java.lang.String r7 = r9.getQueryParameter(r0)
            r1 = 0
            r8 = r28
            if (r7 == 0) goto L_0x01fa
            r3 = 0
            r6 = 46
            int r5 = r7.indexOf(r6)     // Catch:{ 6yg -> 0x01f0 }
            int r4 = r7.lastIndexOf(r6)     // Catch:{ 6yg -> 0x01f0 }
            r0 = -1
            if (r5 == r0) goto L_0x01e3
            if (r4 == r0) goto L_0x01e3
            if (r5 == r4) goto L_0x01e3
            int r2 = r5 + 1
            int r0 = r7.indexOf(r6, r2)     // Catch:{ 6yg -> 0x01f0 }
            if (r0 != r4) goto L_0x01e3
            java.lang.String r6 = r7.substring(r3, r5)     // Catch:{ 6yg -> 0x01f0 }
            java.lang.String r5 = r7.substring(r2, r4)     // Catch:{ 6yg -> 0x01f0 }
            int r0 = r4 + 1
            java.lang.String r4 = r7.substring(r0)     // Catch:{ 6yg -> 0x01f0 }
            r0 = 8
            byte[] r2 = android.util.Base64.decode(r6, r0)     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            byte[] r7 = android.util.Base64.decode(r5, r0)     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            android.util.Base64.decode(r4, r0)     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            java.lang.String r0 = new java.lang.String     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            org.json.JSONObject r11 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            java.lang.String r0 = "alg"
            java.lang.String r0 = r11.getString(r0)     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            java.lang.String r2 = X.C86664Kz.A1L(r0)     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            java.lang.String r0 = new java.lang.String     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            r0.<init>(r7)     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            org.json.JSONObject r15 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x01d8, IllegalArgumentException -> 0x01d0 }
            java.util.Set r0 = X.C105475Vb.A00     // Catch:{ 6yg -> 0x01f0 }
            boolean r0 = r0.contains(r2)     // Catch:{ 6yg -> 0x01f0 }
            if (r0 == 0) goto L_0x01c8
            X.5Vr r7 = r8.A02     // Catch:{ 6yg -> 0x01f0 }
            java.lang.String r10 = "kid"
            boolean r0 = r11.has(r10)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            if (r0 == 0) goto L_0x0199
            java.util.Map r2 = X.C105605Vr.A02     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r0 = r11.getString(r10)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r2 = X.C18310x6.A0o(r0, r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            if (r2 == 0) goto L_0x0199
            java.lang.String r0 = "-----BEGIN PUBLIC KEY-----\n"
            java.lang.String r12 = ""
            r11 = 0
            java.lang.String r2 = X.C175738Zn.A0U(r2, r0, r12, r3)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r0 = "-----END PUBLIC KEY-----"
            java.lang.String r10 = X.C175738Zn.A0U(r2, r0, r12, r3)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r2 = "\n"
            X.5rB r0 = new X.5rB     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0.<init>((java.lang.String) r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r10 = r0.A00(r10, r12)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            int r12 = r10.length()     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r14 = 1
            int r12 = r12 - r14
            r13 = 0
        L_0x009d:
            if (r11 > r12) goto L_0x00bf
            r0 = r12
            if (r13 != 0) goto L_0x00a3
            r0 = r11
        L_0x00a3:
            char r2 = r10.charAt(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0 = 32
            int r0 = X.C162457s7.A00(r2, r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            boolean r0 = X.AnonymousClass0x7.A1P(r0)
            if (r13 != 0) goto L_0x00ba
            if (r0 != 0) goto L_0x00b7
            r13 = 1
            goto L_0x009d
        L_0x00b7:
            int r11 = r11 + 1
            goto L_0x009d
        L_0x00ba:
            if (r0 == 0) goto L_0x00bf
            int r12 = r12 + -1
            goto L_0x009d
        L_0x00bf:
            int r0 = r12 + 1
            java.lang.CharSequence r0 = r10.subSequence(r11, r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            byte[] r0 = android.util.Base64.decode(r0, r3)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.security.spec.X509EncodedKeySpec r2 = new java.security.spec.X509EncodedKeySpec     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r2.<init>(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.security.PublicKey r2 = r0.generatePublic(r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            X.3FI r0 = r7.A00     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            monitor-enter(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            monitor-exit(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r0 = "SHA256withECDSA"
            java.security.Signature r7 = java.security.Signature.getInstance(r0)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r7.initVerify(r2)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r2 = "."
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ UnsupportedEncodingException -> 0x016e }
            r0[r3] = r6     // Catch:{ UnsupportedEncodingException -> 0x016e }
            r0[r14] = r5     // Catch:{ UnsupportedEncodingException -> 0x016e }
            java.lang.String r2 = android.text.TextUtils.join(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x016e }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException -> 0x016e }
            byte[] r0 = r2.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x016e }
            r7.update(r0)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0 = 8
            byte[] r4 = android.util.Base64.decode(r4, r0)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            int r2 = r4.length     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r13 = 2
            int r0 = r2 % r13
            java.lang.String r10 = "Invalid JWT Signature"
            if (r0 != 0) goto L_0x0168
            int r2 = r2 / r13
            byte[][] r2 = X.AnonymousClass36A.A07(r4, r2, r2)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0 = r2[r3]     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            byte[] r12 = X.C105475Vb.A00(r0)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0 = r2[r14]     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            byte[] r6 = X.C105475Vb.A00(r0)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            int r11 = r12.length     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            int r4 = r11 + 4
            int r5 = r6.length     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            int r4 = r4 + r5
            r0 = 255(0xff, float:3.57E-43)
            if (r4 > r0) goto L_0x0183
            r0 = 127(0x7f, float:1.78E-43)
            r2 = 48
            if (r4 <= r0) goto L_0x013c
            int r0 = r4 + 3
            byte[] r10 = new byte[r0]     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r10[r3] = r2     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0 = -127(0xffffffffffffff81, float:NaN)
            r10[r14] = r0     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            byte r0 = (byte) r4     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r10[r13] = r0     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0 = 3
            goto L_0x0146
        L_0x013c:
            int r0 = r4 + 2
            byte[] r10 = new byte[r0]     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r10[r3] = r2     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            byte r0 = (byte) r4     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r10[r14] = r0     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0 = 2
        L_0x0146:
            int r4 = r0 + 1
            r10[r0] = r13     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            int r2 = r4 + 1
            byte r0 = (byte) r11     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r10[r4] = r0     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.System.arraycopy(r12, r3, r10, r2, r11)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            int r2 = r2 + r11
            int r4 = r2 + 1
            r10[r2] = r13     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            int r2 = r4 + 1
            byte r0 = (byte) r5     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r10[r4] = r0     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.System.arraycopy(r6, r3, r10, r2, r5)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            boolean r0 = r7.verify(r10)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            if (r0 == 0) goto L_0x01ac
            X.6i1 r2 = X.C133836i1.A00     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            goto L_0x01b3
        L_0x0168:
            X.6yg r0 = new X.6yg     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            goto L_0x0188
        L_0x016e:
            r4 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r0 = "JWT: "
            r2.append(r0)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r0 = ": getSigningPayload threw "
            X.C18260x0.A1S(r2, r0, r4)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.Error r0 = new java.lang.Error     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            goto L_0x0188
        L_0x0183:
            X.6yg r0 = new X.6yg     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
        L_0x0188:
            throw r0     // Catch:{ Exception -> 0x0189, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
        L_0x0189:
            r4 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r0 = "JWT: "
            r2.append(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            java.lang.String r0 = ": Can't verify signature "
            X.C18260x0.A14(r0, r2, r4)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            goto L_0x01ac
        L_0x0199:
            java.lang.String r0 = "Public key doesn't exist"
            X.6i0 r2 = new X.6i0     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            r2.<init>(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x01a1 }
            goto L_0x01b3
        L_0x01a1:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ 6yg -> 0x01f0 }
            X.6i0 r2 = new X.6i0     // Catch:{ 6yg -> 0x01f0 }
            r2.<init>(r0)     // Catch:{ 6yg -> 0x01f0 }
            goto L_0x01b3
        L_0x01ac:
            java.lang.String r0 = "Token did not verify"
            X.6i0 r2 = new X.6i0     // Catch:{ 6yg -> 0x01f0 }
            r2.<init>(r0)     // Catch:{ 6yg -> 0x01f0 }
        L_0x01b3:
            boolean r0 = r2 instanceof X.C133836i1     // Catch:{ 6yg -> 0x01f0 }
            if (r0 == 0) goto L_0x01bc
            r0 = 1
            r8.A03(r0, r1)     // Catch:{ 6yg -> 0x01f0 }
            goto L_0x01f9
        L_0x01bc:
            boolean r0 = r2 instanceof X.C133826i0     // Catch:{ 6yg -> 0x01f0 }
            if (r0 == 0) goto L_0x01eb
            X.6i0 r2 = (X.C133826i0) r2     // Catch:{ 6yg -> 0x01f0 }
            java.lang.String r0 = r2.A00     // Catch:{ 6yg -> 0x01f0 }
            r8.A03(r3, r0)     // Catch:{ 6yg -> 0x01f0 }
            goto L_0x01fa
        L_0x01c8:
            java.lang.String r0 = "JWT algorithm not supported"
            X.6yg r2 = new X.6yg     // Catch:{ 6yg -> 0x01f0 }
            r2.<init>(r0)     // Catch:{ 6yg -> 0x01f0 }
            goto L_0x01ef
        L_0x01d0:
            java.lang.String r0 = "Wrong Base64 encoding."
            X.6yg r2 = new X.6yg     // Catch:{ 6yg -> 0x01f0 }
            r2.<init>(r0)     // Catch:{ 6yg -> 0x01f0 }
            goto L_0x01ef
        L_0x01d8:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ 6yg -> 0x01f0 }
            X.6yg r2 = new X.6yg     // Catch:{ 6yg -> 0x01f0 }
            r2.<init>(r0)     // Catch:{ 6yg -> 0x01f0 }
            goto L_0x01ef
        L_0x01e3:
            java.lang.String r0 = "Invalid JWT Token"
            X.6yg r2 = new X.6yg     // Catch:{ 6yg -> 0x01f0 }
            r2.<init>(r0)     // Catch:{ 6yg -> 0x01f0 }
            goto L_0x01ef
        L_0x01eb:
            X.3f1 r2 = X.C73153f1.A00()     // Catch:{ 6yg -> 0x01f0 }
        L_0x01ef:
            throw r2     // Catch:{ 6yg -> 0x01f0 }
        L_0x01f0:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r8.A03(r3, r0)
            goto L_0x01fa
        L_0x01f9:
            r1 = r15
        L_0x01fa:
            X.5N1 r15 = r8.A00
            boolean r0 = r15.A00()
            java.lang.String r13 = "lid"
            r7 = 0
            if (r0 == 0) goto L_0x0234
            if (r1 == 0) goto L_0x0211
            X.5Yw r2 = X.C95814uZ.A00
            java.lang.String r0 = X.AnonymousClass355.A03(r13, r1)
            X.4uZ r7 = r2.A05(r0)
        L_0x0211:
            java.lang.String r3 = "data_filter_required"
            java.lang.String r0 = r9.getQueryParameter(r3)
            if (r0 == 0) goto L_0x0220
            int r2 = r0.length()
            r0 = 0
            if (r2 != 0) goto L_0x0221
        L_0x0220:
            r0 = 1
        L_0x0221:
            r27 = r0 ^ 1
            r5 = r30
            if (r1 == 0) goto L_0x026f
            java.lang.String r0 = "client_filters"
            boolean r0 = r1.has(r0)
            if (r0 == 0) goto L_0x026f
            java.lang.String r4 = "Error during parsing of payload object "
            r3 = 0
            r6 = 0
            goto L_0x0243
        L_0x0234:
            if (r1 == 0) goto L_0x0211
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "jid"
            java.lang.String r0 = X.AnonymousClass355.A03(r0, r1)
            com.whatsapp.jid.UserJid r7 = r2.A0E(r0)
            goto L_0x0211
        L_0x0243:
            java.lang.String r0 = "payload"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x025c }
            if (r2 == 0) goto L_0x0255
            int r0 = r2.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x025c }
            if (r0 == 0) goto L_0x0255
            if (r0 > r5) goto L_0x0255
            r6 = r2
            goto L_0x0283
        L_0x0255:
            X.2gY r2 = r8.A01     // Catch:{ IllegalArgumentException | JSONException -> 0x025c }
            r0 = 7
            r2.A01(r7, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x025c }
            goto L_0x0283
        L_0x025c:
            r2 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass000.A0a(r4, r0, r2)
            r8.A03(r3, r0)
            X.2gY r2 = r8.A01
            r0 = 6
            r2.A01(r7, r0)
            goto L_0x0283
        L_0x026f:
            if (r27 != 0) goto L_0x0273
            java.lang.String r3 = "data"
        L_0x0273:
            java.lang.String r6 = r9.getQueryParameter(r3)
            if (r6 == 0) goto L_0x029a
            int r0 = r6.length()
            if (r0 == 0) goto L_0x029a
            if (r0 > r5) goto L_0x029a
        L_0x0281:
            if (r1 == 0) goto L_0x03ee
        L_0x0283:
            java.lang.String r26 = "Error during parsing of payload object "
            java.lang.String r25 = "cd"
            java.lang.String r24 = "category_id"
            java.lang.String r16 = "land_on_whatsapp_catalog"
            java.lang.String r3 = "product_id"
            java.lang.String r4 = "source_url"
            java.lang.String r5 = "show_keyboard"
            java.lang.String r11 = "show_ad_attribution"
            java.lang.String r12 = "have_wm"
            java.lang.String r14 = "have_ib"
            java.lang.String r10 = "1"
            goto L_0x02a2
        L_0x029a:
            X.2gY r2 = r8.A01
            r0 = 7
            r2.A01(r7, r0)
            r6 = 0
            goto L_0x0281
        L_0x02a2:
            boolean r0 = r15.A00()     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            if (r0 == 0) goto L_0x02c5
            X.5Yw r2 = X.C95814uZ.A00     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r0 = X.AnonymousClass355.A03(r13, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            X.4uZ r13 = r2.A05(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
        L_0x02b2:
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r0 = "jid"
            java.lang.String r0 = X.AnonymousClass355.A03(r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            com.whatsapp.jid.UserJid r23 = r2.A0E(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r2 = "source"
            java.lang.String r15 = X.AnonymousClass355.A03(r2, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            goto L_0x02c7
        L_0x02c5:
            r13 = 0
            goto L_0x02b2
        L_0x02c7:
            if (r15 == 0) goto L_0x02cf
            int r0 = r15.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            if (r0 != 0) goto L_0x02d5
        L_0x02cf:
            java.lang.String r15 = r9.getQueryParameter(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            if (r15 == 0) goto L_0x02e0
        L_0x02d5:
            int r2 = r15.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            if (r2 == 0) goto L_0x02e0
            r0 = 32
            if (r2 > r0) goto L_0x02e0
            goto L_0x02e1
        L_0x02e0:
            r15 = 0
        L_0x02e1:
            java.lang.String r22 = A01(r9, r14, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r21 = A01(r9, r12, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r20 = A01(r9, r11, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r19 = A01(r9, r5, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r18 = A00(r9, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r0 = "context"
            java.lang.String r12 = r9.getQueryParameter(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r2 = "icebreaker"
            java.lang.String r11 = X.AnonymousClass355.A03(r2, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            if (r11 == 0) goto L_0x0309
            int r0 = r11.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            if (r0 != 0) goto L_0x030f
        L_0x0309:
            java.lang.String r11 = r9.getQueryParameter(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            if (r11 == 0) goto L_0x0318
        L_0x030f:
            int r2 = r11.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = 140(0x8c, float:1.96E-43)
            if (r2 < r0) goto L_0x0318
            r11 = 0
        L_0x0318:
            java.lang.String r17 = A00(r9, r3, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r16
            java.lang.String r16 = A00(r9, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r24
            java.lang.String r5 = A00(r9, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r0 = "banner"
            org.json.JSONObject r4 = r1.optJSONObject(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            X.1VX r2 = r8.A03     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = 6095(0x17cf, float:8.541E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            if (r0 == 0) goto L_0x033f
            r0 = r25
            java.lang.String r3 = A00(r9, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            goto L_0x0340
        L_0x033f:
            r3 = 0
        L_0x0340:
            java.lang.String r0 = "client_filters"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch:{ IllegalArgumentException -> 0x034d }
            if (r0 == 0) goto L_0x0367
            java.util.List r2 = X.AnonymousClass25q.A00(r0)     // Catch:{ IllegalArgumentException -> 0x034d }
            goto L_0x0368
        L_0x034d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r0 = "Data payload dropped due to client filter parsing error: "
            r1.append(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.append(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            java.lang.String r0 = ".message"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = 0
            r8.A03(r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r2 = 0
            r1 = 1
            goto L_0x0369
        L_0x0367:
            r2 = 0
        L_0x0368:
            r1 = 0
        L_0x0369:
            if (r27 != 0) goto L_0x0375
            if (r2 == 0) goto L_0x0377
            X.21a r0 = X.C371221a.GREEN_TOS     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            boolean r0 = r2.contains(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            if (r0 == 0) goto L_0x0377
        L_0x0375:
            r14 = 1
            goto L_0x0378
        L_0x0377:
            r14 = 0
        L_0x0378:
            r0 = r6
            if (r1 == 0) goto L_0x037d
            r0 = 0
            r15 = 0
        L_0x037d:
            if (r12 != 0) goto L_0x0380
            r12 = r6
        L_0x0380:
            X.5R8 r1 = new X.5R8     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.<init>()     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A04 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A08 = r15     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r22
            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A0E = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r21
            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A0F = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A0C = r14     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r20
            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A0G = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r19
            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A0H = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r18
            r1.A09 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A03 = r12     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A05 = r11     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A00 = r13     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r23
            r1.A01 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r17
            r1.A07 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r0 = r16
            r1.A06 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A02 = r5     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A0B = r4     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A0A = r2     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            boolean r0 = r10.equalsIgnoreCase(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            r1.A0D = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            X.5Wq r0 = r1.A00()     // Catch:{ IllegalArgumentException | JSONException -> 0x03d2 }
            return r0
        L_0x03d2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r26
            java.lang.String r1 = X.AnonymousClass000.A0a(r0, r1, r2)
            r0 = 0
            r8.A03(r0, r1)
            X.2gY r1 = r8.A01
            r0 = 6
            r1.A01(r7, r0)
            java.lang.String r0 = r2.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x03ee:
            java.lang.String r0 = "source"
            java.lang.String r14 = r9.getQueryParameter(r0)
            if (r14 == 0) goto L_0x04af
            int r1 = r14.length()
            if (r1 == 0) goto L_0x04af
            r0 = 32
            if (r1 > r0) goto L_0x04af
        L_0x0400:
            java.lang.String r0 = "have_ib"
            java.lang.String r15 = r9.getQueryParameter(r0)
            java.lang.String r0 = "have_wm"
            java.lang.String r0 = r9.getQueryParameter(r0)
            java.lang.String r1 = "show_ad_attribution"
            java.lang.String r13 = r9.getQueryParameter(r1)
            java.lang.String r1 = "show_keyboard"
            java.lang.String r12 = r9.getQueryParameter(r1)
            java.lang.String r1 = "product_id"
            java.lang.String r11 = r9.getQueryParameter(r1)
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r1 = "jid"
            java.lang.String r1 = r9.getQueryParameter(r1)
            com.whatsapp.jid.UserJid r10 = r2.A0E(r1)
            java.lang.String r1 = "source_url"
            java.lang.String r7 = r9.getQueryParameter(r1)
            java.lang.String r1 = "context"
            java.lang.String r5 = r9.getQueryParameter(r1)
            java.lang.String r1 = "icebreaker"
            java.lang.String r4 = r9.getQueryParameter(r1)
            if (r4 == 0) goto L_0x0447
            int r2 = r4.length()
            r1 = 140(0x8c, float:1.96E-43)
            if (r2 < r1) goto L_0x0447
            r4 = 0
        L_0x0447:
            java.lang.String r1 = "land_on_whatsapp_catalog"
            java.lang.String r3 = r9.getQueryParameter(r1)
            java.lang.String r1 = "category_id"
            java.lang.String r2 = r9.getQueryParameter(r1)
            X.1VX r8 = r8.A03
            r1 = 6095(0x17cf, float:8.541E-42)
            boolean r1 = r8.A0X(r1)
            if (r1 == 0) goto L_0x04ad
            java.lang.String r1 = "cd"
            java.lang.String r8 = r9.getQueryParameter(r1)
        L_0x0463:
            if (r5 != 0) goto L_0x0466
            r5 = r6
        L_0x0466:
            X.5R8 r1 = new X.5R8
            r1.<init>()
            r1.A04 = r6
            r1.A08 = r14
            java.lang.String r6 = "1"
            boolean r9 = r6.equalsIgnoreCase(r15)
            r1.A0E = r9
            boolean r0 = r6.equalsIgnoreCase(r0)
            r1.A0F = r0
            r0 = r27
            r1.A0C = r0
            boolean r0 = r6.equalsIgnoreCase(r13)
            r1.A0G = r0
            boolean r0 = r6.equalsIgnoreCase(r12)
            r1.A0H = r0
            r1.A09 = r7
            r1.A03 = r5
            r1.A05 = r4
            r0 = 0
            r1.A00 = r0
            r1.A01 = r10
            r1.A07 = r11
            r1.A06 = r3
            r1.A02 = r2
            r1.A0B = r0
            r1.A0A = r0
            boolean r0 = r6.equalsIgnoreCase(r8)
            r1.A0D = r0
            X.5Wq r0 = r1.A00()
            return r0
        L_0x04ad:
            r8 = 0
            goto L_0x0463
        L_0x04af:
            r14 = 0
            goto L_0x0400
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5QP.A02(android.net.Uri, int):X.5Wq");
    }

    public final void A03(boolean z, String str) {
        AnonymousClass1XB r1 = new AnonymousClass1XB();
        r1.A00 = Integer.valueOf(AnonymousClass000.A1S(z ? 1 : 0) ? 1 : 0);
        if (!this.A00.A00()) {
            r1.A01 = str;
        }
        this.A04.BhD(r1);
    }

    public static String A00(Uri uri, String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return uri.getQueryParameter(str);
        }
        return jSONObject.getString(str);
    }

    public static String A01(Uri uri, String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return uri.getQueryParameter(str);
        }
        return String.valueOf(jSONObject.getInt(str));
    }
}
