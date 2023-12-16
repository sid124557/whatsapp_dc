package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.net.ssl.SSLException;

/* renamed from: X.7aO  reason: invalid class name and case insensitive filesystem */
public abstract class C152927aO {
    public final C140726uO A00;
    public final C140726uO A01;
    public final InputStream A02;

    public AnonymousClass7EH A00() {
        Throwable th;
        try {
            C140726uO r6 = this.A00;
            if (r6.available() <= 0) {
                return null;
            }
            r6.A00();
            byte[] bArr = new byte[4];
            if (r6.read(bArr) < 4) {
                r6.reset();
                return new C136606mw();
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            byte[] bArr2 = new byte[3];
            wrap.get(bArr2);
            int A012 = C162257rX.A01(bArr2);
            if (r6.available() < A012) {
                r6.reset();
                return new C136606mw();
            }
            r6.reset();
            int i = A012 + 4;
            byte[] bArr3 = new byte[i];
            if (r6.read(bArr3) == i) {
                byte b2 = (byte) b;
                if (b2 == 1) {
                    return new C136536mp(bArr3);
                }
                if (b2 != 2) {
                    if (b2 == 4) {
                        return new C136596mv(bArr3);
                    }
                    if (b2 == 8) {
                        return new C136576mt(bArr3);
                    }
                    if (b2 == 11) {
                        return new C136626my(bArr3);
                    }
                    if (b2 == 13) {
                        return new C136516mn(bArr3);
                    }
                    if (b2 == 15) {
                        return new C136636mz(bArr3);
                    }
                    if (b2 == 20) {
                        return new AnonymousClass6n0(bArr3);
                    }
                    if (b2 == 24) {
                        return new C136616mx(bArr3);
                    }
                    th = new SSLException(AnonymousClass000.A0Y("Invalid handshake message type ", AnonymousClass001.A0o(), b2));
                } else if (i < 38 || !C162257rX.A06(Arrays.copyOfRange(bArr3, 6, 38), C155667fH.A05)) {
                    return new C136646n1(bArr3);
                } else {
                    return new C136586mu(bArr3);
                }
            } else {
                th = C143806zV.A01(AnonymousClass000.A0Y("Could not read handshake message of length ", AnonymousClass001.A0o(), i), (byte) 80);
            }
            throw th;
        } catch (IOException e) {
            throw C143806zV.A03(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0218, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x021d, code lost:
        throw X.C143806zV.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x021e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0229, code lost:
        throw new X.C143806zV(new javax.net.ssl.SSLException(r1), (byte) 80, true);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x021e A[ExcHandler: SocketException | SocketTimeoutException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:49:0x00e0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7EH A01() {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C136666n3
            if (r0 == 0) goto L_0x00da
            r4 = 1
            r3 = 80
            X.7EH r1 = r14.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            if (r1 == 0) goto L_0x0012
            boolean r0 = r1 instanceof X.C136606mw     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r14.A02()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r7 = 0
            if (r0 == 0) goto L_0x0094
            r5 = 5
            byte[] r0 = new byte[r5]     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            X.6uO r10 = r14.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            int r1 = r10.read(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            java.lang.String r9 = " != "
            java.lang.String r2 = "read returned fewer than expected bytes "
            if (r1 != r5) goto L_0x0084
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            byte r8 = r0.get()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r0.getShort()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            int r6 = X.C162257rX.A00(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            byte[] r5 = new byte[r6]     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            int r1 = r10.read(r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            if (r1 != r6) goto L_0x0074
            r0 = 20
            if (r8 != r0) goto L_0x0049
            X.6mw r1 = new X.6mw     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            return r1
        L_0x0049:
            r2 = 10
            switch(r8) {
                case 21: goto L_0x0064;
                case 22: goto L_0x006a;
                case 23: goto L_0x004f;
                default: goto L_0x004e;
            }     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
        L_0x004e:
            goto L_0x00b9
        L_0x004f:
            X.6uO r0 = r14.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            int r0 = r0.available()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            if (r0 <= 0) goto L_0x005e
            java.lang.String r0 = "App data and handshake messages cannot interleave"
            X.6zV r1 = X.C143806zV.A01(r0, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            goto L_0x00c7
        L_0x005e:
            X.6ml r1 = new X.6ml     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r1.<init>(r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            return r1
        L_0x0064:
            X.6mk r1 = new X.6mk     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r1.<init>(r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            return r1
        L_0x006a:
            X.6uO r0 = r14.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r0.Ax5(r5, r7, r6)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            X.7EH r1 = r14.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            return r1
        L_0x0074:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            X.AnonymousClass6C7.A1J(r2, r9, r0, r1, r6)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            X.6zV r1 = X.C143806zV.A01(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            goto L_0x00c7
        L_0x0084:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            X.AnonymousClass6C7.A1J(r2, r9, r0, r1, r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            X.6zV r1 = X.C143806zV.A01(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            goto L_0x00c7
        L_0x0094:
            r0 = 16645(0x4105, float:2.3325E-41)
            byte[] r2 = new byte[r0]     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            java.io.InputStream r0 = r14.A02     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            int r1 = r0.read(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r0 = -1
            if (r1 == r0) goto L_0x00ac
            X.6uO r0 = r14.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r0.Ax5(r2, r7, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            X.6mw r1 = new X.6mw     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            return r1
        L_0x00ac:
            java.lang.String r1 = "Transport layer is reached end of file."
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r0.<init>(r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            X.6zV r1 = new X.6zV     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            r1.<init>(r0, r3, r4)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            goto L_0x00c7
        L_0x00b9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            java.lang.String r0 = "Received Message with invalid type "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r8)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
            X.6zV r1 = X.C143806zV.A01(r0, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
        L_0x00c7:
            throw r1     // Catch:{ SocketException | SocketTimeoutException -> 0x00ce, IOException -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            X.6zV r0 = X.C143806zV.A03(r0)
            throw r0
        L_0x00ce:
            r0 = move-exception
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0)
            X.6zV r0 = new X.6zV
            r0.<init>(r1, r3, r4)
            throw r0
        L_0x00da:
            r6 = r14
            X.6n4 r6 = (X.C136676n4) r6
            r4 = 1
            r3 = 80
            X.7EH r1 = r6.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            if (r1 == 0) goto L_0x00eb
            boolean r0 = r1 instanceof X.C136606mw     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            if (r0 != 0) goto L_0x00eb
            return r1
        L_0x00eb:
            boolean r0 = r6.A02()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r5 = 0
            if (r0 == 0) goto L_0x01e2
            r8 = 5
            byte[] r11 = new byte[r8]     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.6uO r1 = r6.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            int r7 = r1.read(r11)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            java.lang.String r12 = " != "
            java.lang.String r2 = "read returned fewer than expected bytes "
            if (r7 != r8) goto L_0x01d2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r11)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            byte r13 = r0.get()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r0.getShort()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            int r7 = X.C162257rX.A00(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r0 = 23
            java.lang.String r9 = "Invalid content type "
            r10 = 20
            if (r13 == r0) goto L_0x011c
            if (r13 == r10) goto L_0x011c
            goto L_0x0207
        L_0x011c:
            byte[] r8 = new byte[r7]     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            int r1 = r1.read(r8)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            if (r1 != r7) goto L_0x01c2
            if (r13 != r10) goto L_0x012c
            X.6mw r1 = new X.6mw     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            return r1
        L_0x012c:
            X.8jI r2 = r6.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            long r0 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.8Hm r2 = (X.C171548Hm) r2     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            byte[] r12 = r2.A02     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            byte[] r1 = X.C171538Hl.A00(r12, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r0 = 128(0x80, float:1.794E-43)
            javax.crypto.spec.GCMParameterSpec r13 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r13.<init>(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            javax.crypto.Cipher r12 = r2.A00     // Catch:{ BadPaddingException -> 0x01ba, IllegalBlockSizeException -> 0x01b2, InvalidAlgorithmParameterException -> 0x01aa, InvalidKeyException -> 0x01a2, SocketException | SocketTimeoutException -> 0x021e }
            javax.crypto.SecretKey r1 = r2.A01     // Catch:{ BadPaddingException -> 0x01ba, IllegalBlockSizeException -> 0x01b2, InvalidAlgorithmParameterException -> 0x01aa, InvalidKeyException -> 0x01a2, SocketException | SocketTimeoutException -> 0x021e }
            r0 = 2
            r12.init(r0, r1, r13)     // Catch:{ BadPaddingException -> 0x01ba, IllegalBlockSizeException -> 0x01b2, InvalidAlgorithmParameterException -> 0x01aa, InvalidKeyException -> 0x01a2, SocketException | SocketTimeoutException -> 0x021e }
            javax.crypto.Cipher r0 = r2.A00     // Catch:{ BadPaddingException -> 0x01ba, IllegalBlockSizeException -> 0x01b2, InvalidAlgorithmParameterException -> 0x01aa, InvalidKeyException -> 0x01a2, SocketException | SocketTimeoutException -> 0x021e }
            r0.updateAAD(r11)     // Catch:{ BadPaddingException -> 0x01ba, IllegalBlockSizeException -> 0x01b2, InvalidAlgorithmParameterException -> 0x01aa, InvalidKeyException -> 0x01a2, SocketException | SocketTimeoutException -> 0x021e }
            javax.crypto.Cipher r0 = r2.A00     // Catch:{ BadPaddingException -> 0x01ba, IllegalBlockSizeException -> 0x01b2, InvalidAlgorithmParameterException -> 0x01aa, InvalidKeyException -> 0x01a2, SocketException | SocketTimeoutException -> 0x021e }
            byte[] r2 = r0.doFinal(r8, r5, r7)     // Catch:{ BadPaddingException -> 0x01ba, IllegalBlockSizeException -> 0x01b2, InvalidAlgorithmParameterException -> 0x01aa, InvalidKeyException -> 0x01a2, SocketException | SocketTimeoutException -> 0x021e }
            long r0 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r7 = 1
            long r0 = r0 + r7
            r6.A00 = r0     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            int r1 = r2.length     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
        L_0x015a:
            int r1 = r1 + -1
            byte r0 = r2[r1]     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            if (r0 == 0) goto L_0x015a
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r5, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            if (r0 != r10) goto L_0x016c
            X.6mw r1 = new X.6mw     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            return r1
        L_0x016c:
            r1 = 10
            switch(r0) {
                case 21: goto L_0x0191;
                case 22: goto L_0x0197;
                case 23: goto L_0x017b;
                default: goto L_0x0171;
            }     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
        L_0x0171:
            java.lang.String r0 = X.C18260x0.A05(r9, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.6zV r1 = X.C143806zV.A01(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            goto L_0x0217
        L_0x017b:
            X.6uO r0 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            int r0 = r0.available()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            if (r0 <= 0) goto L_0x018b
            java.lang.String r0 = "App data and handshake messages cannot interleave"
            X.6zV r1 = X.C143806zV.A01(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            goto L_0x0217
        L_0x018b:
            X.6ml r1 = new X.6ml     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r1.<init>(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            return r1
        L_0x0191:
            X.6mk r1 = new X.6mk     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r1.<init>(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            return r1
        L_0x0197:
            X.6uO r1 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            int r0 = r2.length     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r1.Ax5(r2, r5, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.7EH r1 = r6.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            return r1
        L_0x01a2:
            r1 = move-exception
            java.lang.String r0 = " Invalid Key"
            X.6zV r1 = X.C143806zV.A02(r0, r1, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            goto L_0x0217
        L_0x01aa:
            r1 = move-exception
            java.lang.String r0 = "Invalid Algorithm Params"
            X.6zV r1 = X.C143806zV.A02(r0, r1, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            goto L_0x0217
        L_0x01b2:
            r1 = move-exception
            java.lang.String r0 = "Illegal block size "
            X.6zV r1 = X.C143806zV.A02(r0, r1, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            goto L_0x0217
        L_0x01ba:
            r1 = move-exception
            java.lang.String r0 = "Bad padding"
            X.6zV r1 = X.C143806zV.A02(r0, r1, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            goto L_0x0217
        L_0x01c2:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.AnonymousClass6C7.A1J(r2, r12, r0, r1, r7)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.6zV r1 = X.C143806zV.A01(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            goto L_0x0217
        L_0x01d2:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.AnonymousClass6C7.A1J(r2, r12, r0, r7, r8)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.6zV r1 = X.C143806zV.A01(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            goto L_0x0217
        L_0x01e2:
            r0 = 16645(0x4105, float:2.3325E-41)
            byte[] r2 = new byte[r0]     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            java.io.InputStream r0 = r6.A02     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            int r1 = r0.read(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r0 = -1
            if (r1 == r0) goto L_0x01fa
            X.6uO r0 = r6.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r0.Ax5(r2, r5, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.6mw r1 = new X.6mw     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            return r1
        L_0x01fa:
            java.lang.String r1 = "Transport layer is reached end of file."
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r0.<init>(r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            X.6zV r1 = new X.6zV     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r1.<init>(r0, r3, r4)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            goto L_0x0217
        L_0x0207:
            java.lang.String r0 = X.C18260x0.A05(r9, r13)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            javax.net.ssl.SSLException r2 = new javax.net.ssl.SSLException     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r2.<init>(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r0 = 47
            X.6zV r1 = new X.6zV     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
            r1.<init>(r2, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
        L_0x0217:
            throw r1     // Catch:{ SocketException | SocketTimeoutException -> 0x021e, IOException -> 0x0218 }
        L_0x0218:
            r0 = move-exception
            X.6zV r1 = X.C143806zV.A03(r0)
            throw r1
        L_0x021e:
            r1 = move-exception
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            X.6zV r1 = new X.6zV
            r1.<init>(r0, r3, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152927aO.A01():X.7EH");
    }

    public boolean A02() {
        C143806zV r2;
        try {
            C140726uO r6 = this.A01;
            if (r6.available() < 5) {
                return false;
            }
            byte[] bArr = new byte[5];
            r6.A00();
            int read = r6.read(bArr);
            if (read == 5) {
                r6.reset();
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                short s = wrap.getShort();
                int A002 = C162257rX.A00(wrap);
                if (!C100735Cb.A00.contains(Byte.valueOf(b)) || s != 771) {
                    r2 = new C143806zV(new SSLException(AnonymousClass000.A0X(C162257rX.A04(bArr), AnonymousClass000.A0l("Invalid record header "))), (byte) 10, true);
                } else if (A002 < 0 || A002 > 16640) {
                    r2 = new C143806zV(new SSLException(AnonymousClass000.A0X(C162257rX.A04(bArr), AnonymousClass000.A0l("Invalid record header "))), (byte) 22, true);
                } else if (r6.available() >= A002 + 5) {
                    return true;
                } else {
                    return false;
                }
                throw r2;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("read returned fewer than expected bytes ");
            A0o.append(read);
            throw C143806zV.A01(AnonymousClass000.A0Y(" != ", A0o, 5), (byte) 80);
        } catch (IOException e) {
            throw C143806zV.A03(e);
        }
    }

    public C152927aO(C140726uO r2, InputStream inputStream) {
        if (inputStream == null || r2 == null) {
            throw C143806zV.A00("transportIn or recordStream is null");
        }
        this.A02 = inputStream;
        this.A00 = new C140726uO();
        this.A01 = r2;
    }
}
