package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.33L  reason: invalid class name */
public class AnonymousClass33L {
    public static final Object A04 = AnonymousClass002.A0D();
    public final C55472qP A00;
    public final C55472qP A01;
    public final C43372Rw A02;
    public final C52122kv A03;

    public static final Cipher A00(SecretKeySpec secretKeySpec, int i, int i2) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr = new byte[16];
            bArr[3] = (byte) i2;
            bArr[2] = (byte) (i2 >> 8);
            bArr[1] = (byte) (i2 >> 16);
            bArr[0] = (byte) (i2 >> 24);
            instance.init(i, secretKeySpec, C18330xA.A0D(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0119, code lost:
        throw X.AnonymousClass0x9.A0i(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114 A[ExcHandler: BadPaddingException | IllegalBlockSizeException (r0v28 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:11:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C84844Dx A01(byte[] r27) {
        /*
            r26 = this;
            r0 = r26
            X.2qP r4 = r0.A01
            X.2kv r3 = r0.A03
            X.2wy r2 = r4.A01(r3)
            X.34s r1 = r2.A01
            X.2y1 r5 = r1.A05()
            X.2Ql r8 = r5.A00()
            X.1E1 r0 = r1.A00     // Catch:{ 24R -> 0x011a }
            X.1Cz r0 = r0.senderChain_     // Catch:{ 24R -> 0x011a }
            if (r0 != 0) goto L_0x001c
            X.1Cz r0 = X.C21741Cz.DEFAULT_INSTANCE     // Catch:{ 24R -> 0x011a }
        L_0x001c:
            X.8Lq r0 = r0.senderRatchetKey_     // Catch:{ 24R -> 0x011a }
            X.3ZK r13 = X.C616431q.A00(r0)     // Catch:{ 24R -> 0x011a }
            X.1E1 r0 = r1.A00
            int r6 = r0.previousCounter_
            int r15 = r0.sessionVersion_
            if (r15 != 0) goto L_0x002b
            r15 = 2
        L_0x002b:
            r0 = 3
            r10 = 1
            if (r15 < r0) goto L_0x0043
            javax.crypto.spec.SecretKeySpec r9 = r8.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0114 }
            javax.crypto.spec.IvParameterSpec r7 = r8.A01     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0114 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x003d, BadPaddingException | IllegalBlockSizeException -> 0x0114 }
            r0.init(r10, r9, r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x003d, BadPaddingException | IllegalBlockSizeException -> 0x0114 }
            goto L_0x004b
        L_0x003d:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0114 }
            throw r0     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0114 }
        L_0x0043:
            javax.crypto.spec.SecretKeySpec r7 = r8.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0114 }
            int r0 = r8.A00     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0114 }
            javax.crypto.Cipher r0 = A00(r7, r10, r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0114 }
        L_0x004b:
            r7 = r27
            byte[] r14 = r0.doFinal(r7)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0114 }
            X.3ev r9 = new X.3ev
            javax.crypto.spec.SecretKeySpec r10 = r8.A03
            int r0 = r5.A00
            X.2xf r11 = r1.A03()
            X.2xf r12 = r1.A04()
            r18 = r9
            r17 = r6
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            X.1E1 r7 = r1.A00
            int r6 = r7.bitField0_
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00c5
            X.1Ca r6 = r7.pendingPreKey_     // Catch:{ 24R -> 0x00a8 }
            r7 = r6
            if (r6 != 0) goto L_0x0077
            X.1Ca r6 = X.C21491Ca.DEFAULT_INSTANCE     // Catch:{ 24R -> 0x00a8 }
        L_0x0077:
            int r6 = r6.bitField0_     // Catch:{ 24R -> 0x00a8 }
            r6 = r6 & 1
            if (r6 == 0) goto L_0x0090
            if (r7 != 0) goto L_0x0081
            X.1Ca r7 = X.C21491Ca.DEFAULT_INSTANCE     // Catch:{ 24R -> 0x00a8 }
        L_0x0081:
            int r6 = r7.preKeyId_     // Catch:{ 24R -> 0x00a8 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ 24R -> 0x00a8 }
            r6.getClass()     // Catch:{ 24R -> 0x00a8 }
            X.47r r8 = new X.47r     // Catch:{ 24R -> 0x00a8 }
            r8.<init>(r6)     // Catch:{ 24R -> 0x00a8 }
            goto L_0x0092
        L_0x0090:
            X.47s r8 = X.AnonymousClass47s.A00     // Catch:{ 24R -> 0x00a8 }
        L_0x0092:
            X.1E1 r6 = r1.A00     // Catch:{ 24R -> 0x00a8 }
            X.1Ca r7 = r6.pendingPreKey_     // Catch:{ 24R -> 0x00a8 }
            r6 = r7
            if (r7 != 0) goto L_0x009b
            X.1Ca r7 = X.C21491Ca.DEFAULT_INSTANCE     // Catch:{ 24R -> 0x00a8 }
        L_0x009b:
            int r7 = r7.signedPreKeyId_     // Catch:{ 24R -> 0x00a8 }
            if (r6 != 0) goto L_0x00a1
            X.1Ca r6 = X.C21491Ca.DEFAULT_INSTANCE     // Catch:{ 24R -> 0x00a8 }
        L_0x00a1:
            X.8Lq r6 = r6.baseKey_     // Catch:{ 24R -> 0x00a8 }
            X.3ZK r20 = X.C616431q.A00(r6)     // Catch:{ 24R -> 0x00a8 }
            goto L_0x00ae
        L_0x00a8:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x00ae:
            X.1E1 r6 = r1.A00
            int r6 = r6.localRegistrationId_
            X.2xf r19 = r1.A03()
            X.3et r18 = new X.3et
            r21 = r9
            r22 = r8
            r23 = r15
            r24 = r6
            r25 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
        L_0x00c5:
            byte[] r6 = X.C60112y1.A03
            byte[] r6 = r5.A01(r6)
            X.2yQ r5 = r5.A01
            int r0 = r0 + 1
            X.2y1 r7 = new X.2y1
            r7.<init>(r5, r6, r0)
            X.1Bq r0 = X.C21391Bq.DEFAULT_INSTANCE
            X.6c9 r6 = r0.A0G()
            X.19s r6 = (X.C208919s) r6
            byte[] r5 = r7.A02
            int r0 = r5.length
            X.1Bq r5 = X.C208919s.A00(r7, r6, r5, r0)
            X.1E1 r0 = r1.A00
            X.1Cz r0 = r0.senderChain_
            if (r0 != 0) goto L_0x00eb
            X.1Cz r0 = X.C21741Cz.DEFAULT_INSTANCE
        L_0x00eb:
            X.6c9 r0 = r0.A0H()
            X.19l r0 = (X.C208219l) r0
            r0.A09(r5)
            X.6cX r0 = r0.A06()
            X.1Cz r0 = (X.C21741Cz) r0
            X.6c9 r6 = X.C623634s.A00(r1)
            X.6cX r5 = r6.A00
            X.1E1 r5 = (X.AnonymousClass1E1) r5
            r0.getClass()
            r5.senderChain_ = r0
            int r0 = r5.bitField0_
            r0 = r0 | 32
            r5.bitField0_ = r0
            X.C623634s.A01(r6, r1)
            r4.A03(r3, r2)
            return r18
        L_0x0114:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x011a:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33L.A01(byte[]):X.4Dx");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0251, code lost:
        if (X.AnonymousClass001.A0K(r10.A00()) != 16777215) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A02(X.AnonymousClass4CB r22, X.C73073et r23) {
        /*
            r21 = this;
            r8 = r21
            X.2qP r0 = r8.A01
            r20 = r0
            X.2kv r0 = r8.A03
            r19 = r0
            r1 = r20
            X.2wy r12 = r1.A01(r0)
            X.2Rw r3 = r8.A02
            r14 = r23
            X.2xf r13 = r14.A03
            X.2qP r11 = r3.A00
            X.2kv r0 = r3.A04
            r18 = r0
            X.2ov r2 = X.AnonymousClass31S.A00(r18)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl trusting "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " key pair"
            X.C18260x0.A1L(r1, r0)
            int r2 = r14.A02
            X.3ZK r0 = r14.A04
            r17 = r0
            byte[] r5 = r17.A00()
            X.34s r0 = r12.A01
            X.1E1 r1 = r0.A00
            int r0 = r1.sessionVersion_
            if (r0 != 0) goto L_0x0044
            r0 = 2
        L_0x0044:
            if (r0 != r2) goto L_0x009d
            X.8Lq r0 = r1.aliceBaseKey_
            byte[] r0 = r0.A07()
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 == 0) goto L_0x009d
        L_0x0052:
            java.lang.String r3 = "SessionBuilder"
            java.lang.String r2 = "We've already setup a session for this V3 message, letting bundled message fall through..."
            X.73Y r0 = X.C379124n.A00
            if (r0 == 0) goto L_0x006b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SignalProtocolLogger ("
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "): "
            X.C18260x0.A0t(r0, r2, r1)
        L_0x006b:
            X.47s r10 = X.AnonymousClass47s.A00
        L_0x006d:
            r0 = r18
            r11.A02(r13, r0)
            X.3ev r0 = r14.A05
            byte[] r3 = r8.A04(r0, r12)
            r0 = r22
            r0.BF5(r3)
            r1 = r20
            r0 = r19
            r1.A03(r0, r12)
            boolean r0 = r10 instanceof X.AnonymousClass47r
            if (r0 == 0) goto L_0x009b
            r0 = 1
        L_0x0089:
            if (r0 == 0) goto L_0x009a
            X.2qP r2 = r8.A00
            java.lang.Object r0 = r10.A00()
            int r1 = X.AnonymousClass001.A0K(r0)
            X.2q3 r0 = r2.A04
            r0.A02(r1)
        L_0x009a:
            return r3
        L_0x009b:
            r0 = 0
            goto L_0x0089
        L_0x009d:
            java.util.LinkedList r4 = r12.A00
            java.util.Iterator r6 = r4.iterator()
        L_0x00a3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r0 = r6.next()
            X.34s r0 = (X.C623634s) r0
            X.1E1 r1 = r0.A00
            int r0 = r1.sessionVersion_
            if (r0 != 0) goto L_0x00b6
            r0 = 2
        L_0x00b6:
            if (r0 != r2) goto L_0x00a3
            X.8Lq r0 = r1.aliceBaseKey_
            byte[] r0 = r0.A07()
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 == 0) goto L_0x00a3
            goto L_0x0052
        L_0x00c5:
            X.2EX r0 = r3.A03
            int r5 = r14.A01
            X.2jN r0 = r0.A00
            byte[] r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x02b1
            X.2v8 r2 = new X.2v8     // Catch:{ IOException -> 0x0293 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0293 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0293 }
            java.lang.String r0 = "axolotl loaded a signed pre key with id "
            X.C18260x0.A0y(r0, r1, r5)     // Catch:{ IOException -> 0x0293 }
            X.1DQ r1 = r2.A00     // Catch:{ 24R -> 0x028d }
            X.8Lq r0 = r1.publicKey_     // Catch:{ 24R -> 0x028d }
            X.3ZK r5 = X.C616431q.A00(r0)     // Catch:{ 24R -> 0x028d }
            X.8Lq r0 = r1.privateKey_     // Catch:{ 24R -> 0x028d }
            byte[] r1 = r0.A07()     // Catch:{ 24R -> 0x028d }
            X.2JA r0 = new X.2JA     // Catch:{ 24R -> 0x028d }
            r0.<init>(r1)     // Catch:{ 24R -> 0x028d }
            X.2Ml r2 = new X.2Ml     // Catch:{ 24R -> 0x028d }
            r2.<init>(r0, r5)     // Catch:{ 24R -> 0x028d }
            X.2Sg r1 = new X.2Sg
            r1.<init>()
            r0 = r17
            r1.A02 = r0
            r1.A00 = r13
            X.2Mk r0 = r11.A00()
            r1.A01 = r0
            r1.A04 = r2
            r1.A03 = r2
            X.3Z4 r10 = r14.A06
            boolean r0 = r10 instanceof X.AnonymousClass47r
            if (r0 == 0) goto L_0x0129
            r16 = 1
        L_0x0114:
            if (r16 == 0) goto L_0x013b
            X.2qP r2 = r3.A01
            java.lang.Object r0 = r10.A00()
            int r3 = X.AnonymousClass001.A0K(r0)
            X.2q3 r5 = r2.A04
            byte[] r6 = r5.A04(r3)
            if (r6 == 0) goto L_0x0270
            goto L_0x012c
        L_0x0129:
            r16 = 0
            goto L_0x0114
        L_0x012c:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0255 }
            java.lang.String r0 = "axolotl found a pre key with id "
            X.C18260x0.A0y(r0, r2, r3)     // Catch:{ IOException -> 0x0255 }
            X.2wS r0 = new X.2wS     // Catch:{ IOException -> 0x0255 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0255 }
            goto L_0x013e
        L_0x013b:
            X.47s r0 = X.AnonymousClass47s.A00
            goto L_0x0147
        L_0x013e:
            X.2Ml r2 = r0.A00()
            X.47r r0 = new X.47r
            r0.<init>(r2)
        L_0x0147:
            r1.A05 = r0
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x0155
            X.34s r0 = new X.34s
            r0.<init>()
            X.C59472wy.A00(r4, r12, r0)
        L_0x0155:
            X.34s r9 = r12.A01
            X.2Mk r7 = r1.A01
            X.2Ml r6 = r1.A04
            X.2Ml r5 = r1.A03
            X.3Z4 r4 = r1.A05
            X.2xf r3 = r1.A00
            X.3ZK r2 = r1.A02
            if (r7 == 0) goto L_0x0286
            if (r6 == 0) goto L_0x0286
            if (r5 == 0) goto L_0x0286
            if (r4 == 0) goto L_0x0286
            if (r3 == 0) goto L_0x0286
            if (r2 == 0) goto L_0x0286
            X.6c9 r15 = X.C623634s.A00(r9)     // Catch:{ IOException -> 0x0280 }
            X.6cX r1 = r15.A00     // Catch:{ IOException -> 0x0280 }
            X.1E1 r1 = (X.AnonymousClass1E1) r1     // Catch:{ IOException -> 0x0280 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x0280 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x0280 }
            r0 = 3
            r1.sessionVersion_ = r0     // Catch:{ IOException -> 0x0280 }
            X.C623634s.A01(r15, r9)     // Catch:{ IOException -> 0x0280 }
            r9.A08(r3)     // Catch:{ IOException -> 0x0280 }
            X.2xf r0 = r7.A00     // Catch:{ IOException -> 0x0280 }
            r9.A07(r0)     // Catch:{ IOException -> 0x0280 }
            java.io.ByteArrayOutputStream r1 = X.AnonymousClass0x9.A0e()     // Catch:{ IOException -> 0x0280 }
            r0 = 32
            byte[] r15 = new byte[r0]     // Catch:{ IOException -> 0x0280 }
            r0 = -1
            java.util.Arrays.fill(r15, r0)     // Catch:{ IOException -> 0x0280 }
            r1.write(r15)     // Catch:{ IOException -> 0x0280 }
            X.3ZK r0 = r3.A00     // Catch:{ IOException -> 0x0280 }
            X.2JA r3 = r6.A00     // Catch:{ IOException -> 0x0280 }
            byte[] r0 = X.C616431q.A03(r3, r0)     // Catch:{ IOException -> 0x0280 }
            r1.write(r0)     // Catch:{ IOException -> 0x0280 }
            X.2JA r0 = r7.A01     // Catch:{ IOException -> 0x0280 }
            byte[] r0 = X.C616431q.A03(r0, r2)     // Catch:{ IOException -> 0x0280 }
            r1.write(r0)     // Catch:{ IOException -> 0x0280 }
            byte[] r0 = X.C616431q.A03(r3, r2)     // Catch:{ IOException -> 0x0280 }
            r1.write(r0)     // Catch:{ IOException -> 0x0280 }
            boolean r0 = r4 instanceof X.AnonymousClass47r     // Catch:{ IOException -> 0x0280 }
            if (r0 == 0) goto L_0x01bb
            r0 = 1
            goto L_0x01bc
        L_0x01bb:
            r0 = 0
        L_0x01bc:
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r0 = r4.A00()     // Catch:{ IOException -> 0x0280 }
            X.2Ml r0 = (X.C42012Ml) r0     // Catch:{ IOException -> 0x0280 }
            X.2JA r0 = r0.A00     // Catch:{ IOException -> 0x0280 }
            byte[] r0 = X.C616431q.A03(r0, r2)     // Catch:{ IOException -> 0x0280 }
            r1.write(r0)     // Catch:{ IOException -> 0x0280 }
        L_0x01cd:
            byte[] r2 = r1.toByteArray()     // Catch:{ IOException -> 0x0280 }
            X.47q r4 = new X.47q     // Catch:{ IOException -> 0x0280 }
            r4.<init>()     // Catch:{ IOException -> 0x0280 }
            java.lang.String r0 = "WhisperText"
            byte[] r1 = r0.getBytes()     // Catch:{ IOException -> 0x0280 }
            r0 = 64
            byte[] r1 = r4.A01(r2, r1, r0)     // Catch:{ IOException -> 0x0280 }
            r0 = 32
            byte[][] r1 = X.C616531r.A01(r1, r0, r0)     // Catch:{ IOException -> 0x0280 }
            r3 = 0
            r0 = r1[r3]     // Catch:{ IOException -> 0x0280 }
            X.2ZD r2 = new X.2ZD     // Catch:{ IOException -> 0x0280 }
            r2.<init>(r4, r0)     // Catch:{ IOException -> 0x0280 }
            r0 = 1
            r1 = r1[r0]     // Catch:{ IOException -> 0x0280 }
            X.2y1 r0 = new X.2y1     // Catch:{ IOException -> 0x0280 }
            r0.<init>(r4, r1, r3)     // Catch:{ IOException -> 0x0280 }
            X.2Mm r1 = new X.2Mm     // Catch:{ IOException -> 0x0280 }
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x0280 }
            X.2y1 r0 = r1.A00     // Catch:{ IOException -> 0x0280 }
            r9.A0A(r5, r0)     // Catch:{ IOException -> 0x0280 }
            X.2ZD r0 = r1.A01     // Catch:{ IOException -> 0x0280 }
            r9.A0B(r0)     // Catch:{ IOException -> 0x0280 }
            X.34s r4 = r12.A01
            X.33n r0 = r11.A07
            X.2qF r0 = r0.A07
            int r3 = r0.A01()
            X.6c9 r2 = X.C623634s.A00(r4)
            X.6cX r1 = r2.A00
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.localRegistrationId_ = r3
            X.C623634s.A01(r2, r4)
            X.34s r4 = r12.A01
            int r3 = r14.A00
            X.6c9 r2 = X.C623634s.A00(r4)
            X.6cX r1 = r2.A00
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.remoteRegistrationId_ = r3
            X.C623634s.A01(r2, r4)
            X.34s r1 = r12.A01
            byte[] r0 = r17.A00()
            r1.A0C(r0)
            if (r16 == 0) goto L_0x006b
            java.lang.Object r0 = r10.A00()
            int r1 = X.AnonymousClass001.A0K(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r1 == r0) goto L_0x006b
            goto L_0x006d
        L_0x0255:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "error reading prekey "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; deleting"
            X.C18260x0.A15(r0, r1, r2)
            r5.A02(r3)
            X.24S r0 = new X.24S
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0270:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "No prekey found with id "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r3)
            X.24S r0 = new X.24S
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0280:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x0286:
            java.lang.String r0 = "Null value!"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x028d:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x0293:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "failed to parse signed pre key record during load for id "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "invalid prekey record with id "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r5)
            X.24S r0 = new X.24S
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02b1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "no signed prekey available with id "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r5)
            X.24S r0 = new X.24S
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33L.A02(X.4CB, X.3et):byte[]");
    }

    public byte[] A03(AnonymousClass4CB r5, C73093ev r6) {
        C55472qP r3 = this.A01;
        C52122kv r2 = this.A03;
        if (r3.A07.A0Z(AnonymousClass31S.A00(r2))) {
            C59472wy A012 = r3.A01(r2);
            byte[] A042 = A04(r6, A012);
            r5.BF5(A042);
            r3.A03(r2, A012);
            return A042;
        }
        throw new AnonymousClass24T(AnonymousClass000.A0P(r2, "No session for: ", AnonymousClass001.A0o()));
    }

    public final byte[] A04(C73093ev r6, C59472wy r7) {
        LinkedList linkedList = r7.A00;
        Iterator it = linkedList.iterator();
        LinkedList A18 = AnonymousClass0x9.A18();
        try {
            C623634s r0 = new C623634s(r7.A01);
            byte[] A05 = A05(r6, r0);
            r7.A01 = r0;
            return A05;
        } catch (AnonymousClass24X e) {
            while (true) {
                A18.add(e);
                if (it.hasNext()) {
                    C623634s r02 = new C623634s((C623634s) it.next());
                    byte[] A052 = A05(r6, r02);
                    it.remove();
                    C59472wy.A00(linkedList, r7, r02);
                    return A052;
                }
                throw new AnonymousClass24X((List) A18);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0329, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x032f, code lost:
        throw new X.AnonymousClass24X(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0329 A[ExcHandler: BadPaddingException | IllegalBlockSizeException (r1v19 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:80:0x02f4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A05(X.C73093ev r13, X.C623634s r14) {
        /*
            r12 = this;
            X.1E1 r1 = r14.A00
            int r0 = r1.bitField0_
            r0 = r0 & 32
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x0373
            int r6 = r13.A01
            int r0 = r1.sessionVersion_
            if (r0 != 0) goto L_0x0013
            r0 = 2
        L_0x0013:
            if (r6 != r0) goto L_0x035d
            X.3ZK r5 = r13.A02
            int r1 = r13.A00
            X.2fY r0 = r14.A06(r5)     // Catch:{ 24R -> 0x0356 }
            if (r0 == 0) goto L_0x0051
            X.2fY r0 = r14.A06(r5)     // Catch:{ 24R -> 0x0356 }
            java.lang.Object r4 = r0.A00     // Catch:{ 24R -> 0x0356 }
            X.1Cz r4 = (X.C21741Cz) r4     // Catch:{ 24R -> 0x0356 }
            if (r4 != 0) goto L_0x002b
            goto L_0x00d5
        L_0x002b:
            X.1E1 r0 = r14.A00     // Catch:{ 24R -> 0x0356 }
            int r0 = r0.sessionVersion_     // Catch:{ 24R -> 0x0356 }
            if (r0 != 0) goto L_0x0032
            r0 = 2
        L_0x0032:
            X.2yQ r3 = X.C60352yQ.A00(r0)     // Catch:{ 24R -> 0x0356 }
            X.1Bq r0 = r4.chainKey_     // Catch:{ 24R -> 0x0356 }
            if (r0 != 0) goto L_0x003c
            X.1Bq r0 = X.C21391Bq.DEFAULT_INSTANCE     // Catch:{ 24R -> 0x0356 }
        L_0x003c:
            X.8Lq r0 = r0.key_     // Catch:{ 24R -> 0x0356 }
            byte[] r2 = r0.A07()     // Catch:{ 24R -> 0x0356 }
            X.1Bq r0 = r4.chainKey_     // Catch:{ 24R -> 0x0356 }
            if (r0 != 0) goto L_0x0048
            X.1Bq r0 = X.C21391Bq.DEFAULT_INSTANCE     // Catch:{ 24R -> 0x0356 }
        L_0x0048:
            int r0 = r0.index_     // Catch:{ 24R -> 0x0356 }
            X.2y1 r4 = new X.2y1     // Catch:{ 24R -> 0x0356 }
            r4.<init>(r3, r2, r0)     // Catch:{ 24R -> 0x0356 }
            goto L_0x00d6
        L_0x0051:
            X.1E1 r0 = r14.A00     // Catch:{ 24R -> 0x0356 }
            int r0 = r0.sessionVersion_     // Catch:{ 24R -> 0x0356 }
            if (r0 != 0) goto L_0x0058
            r0 = 2
        L_0x0058:
            X.2yQ r2 = X.C60352yQ.A00(r0)     // Catch:{ 24R -> 0x0356 }
            X.1E1 r0 = r14.A00     // Catch:{ 24R -> 0x0356 }
            X.8Lq r0 = r0.rootKey_     // Catch:{ 24R -> 0x0356 }
            byte[] r0 = r0.A07()     // Catch:{ 24R -> 0x0356 }
            X.2ZD r4 = new X.2ZD     // Catch:{ 24R -> 0x0356 }
            r4.<init>(r2, r0)     // Catch:{ 24R -> 0x0356 }
            X.1E1 r0 = r14.A00     // Catch:{ 24R -> 0x0350 }
            X.1Cz r0 = r0.senderChain_     // Catch:{ 24R -> 0x0350 }
            if (r0 != 0) goto L_0x0071
            X.1Cz r0 = X.C21741Cz.DEFAULT_INSTANCE     // Catch:{ 24R -> 0x0350 }
        L_0x0071:
            X.8Lq r0 = r0.senderRatchetKey_     // Catch:{ 24R -> 0x0350 }
            X.3ZK r3 = X.C616431q.A00(r0)     // Catch:{ 24R -> 0x0350 }
            X.1E1 r0 = r14.A00     // Catch:{ 24R -> 0x0356 }
            X.1Cz r0 = r0.senderChain_     // Catch:{ 24R -> 0x0356 }
            if (r0 != 0) goto L_0x007f
            X.1Cz r0 = X.C21741Cz.DEFAULT_INSTANCE     // Catch:{ 24R -> 0x0356 }
        L_0x007f:
            X.8Lq r0 = r0.senderRatchetKeyPrivate_     // Catch:{ 24R -> 0x0356 }
            byte[] r0 = r0.A07()     // Catch:{ 24R -> 0x0356 }
            X.2JA r2 = new X.2JA     // Catch:{ 24R -> 0x0356 }
            r2.<init>(r0)     // Catch:{ 24R -> 0x0356 }
            X.2Ml r0 = new X.2Ml     // Catch:{ 24R -> 0x0356 }
            r0.<init>(r2, r3)     // Catch:{ 24R -> 0x0356 }
            X.2fY r2 = r4.A00(r5, r0)     // Catch:{ 24R -> 0x0356 }
            X.2Ml r8 = X.C616431q.A02()     // Catch:{ 24R -> 0x0356 }
            java.lang.Object r0 = r2.A00     // Catch:{ 24R -> 0x0356 }
            X.2ZD r0 = (X.AnonymousClass2ZD) r0     // Catch:{ 24R -> 0x0356 }
            X.2fY r9 = r0.A00(r5, r8)     // Catch:{ 24R -> 0x0356 }
            java.lang.Object r0 = r9.A00     // Catch:{ 24R -> 0x0356 }
            X.2ZD r0 = (X.AnonymousClass2ZD) r0     // Catch:{ 24R -> 0x0356 }
            r14.A0B(r0)     // Catch:{ 24R -> 0x0356 }
            java.lang.Object r4 = r2.A01     // Catch:{ 24R -> 0x0356 }
            X.2y1 r4 = (X.C60112y1) r4     // Catch:{ 24R -> 0x0356 }
            r14.A09(r5, r4)     // Catch:{ 24R -> 0x0356 }
            X.2y1 r0 = r14.A05()     // Catch:{ 24R -> 0x0356 }
            int r0 = r0.A00     // Catch:{ 24R -> 0x0356 }
            int r2 = r0 + -1
            r0 = 0
            int r7 = java.lang.Math.max(r2, r0)     // Catch:{ 24R -> 0x0356 }
            X.6c9 r3 = X.C623634s.A00(r14)     // Catch:{ 24R -> 0x0356 }
            X.6cX r2 = r3.A00     // Catch:{ 24R -> 0x0356 }
            X.1E1 r2 = (X.AnonymousClass1E1) r2     // Catch:{ 24R -> 0x0356 }
            int r0 = r2.bitField0_     // Catch:{ 24R -> 0x0356 }
            r0 = r0 | 16
            r2.bitField0_ = r0     // Catch:{ 24R -> 0x0356 }
            r2.previousCounter_ = r7     // Catch:{ 24R -> 0x0356 }
            X.C623634s.A01(r3, r14)     // Catch:{ 24R -> 0x0356 }
            java.lang.Object r0 = r9.A01     // Catch:{ 24R -> 0x0356 }
            X.2y1 r0 = (X.C60112y1) r0     // Catch:{ 24R -> 0x0356 }
            r14.A0A(r8, r0)     // Catch:{ 24R -> 0x0356 }
            goto L_0x00d6
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            int r3 = r4.A00
            if (r3 <= r1) goto L_0x01b7
            X.2fY r0 = r14.A06(r5)
            java.lang.Object r0 = r0.A00
            X.1Cz r0 = (X.C21741Cz) r0
            if (r0 == 0) goto L_0x0338
            X.8ya r0 = r0.messageKeys_
            java.util.Iterator r2 = r0.iterator()
        L_0x00ea:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0338
            java.lang.Object r0 = r2.next()
            X.1Cy r0 = (X.C21731Cy) r0
            int r0 = r0.index_
            if (r0 != r1) goto L_0x00ea
            X.2fY r4 = r14.A06(r5)
            java.lang.Object r8 = r4.A00
            X.1Cz r8 = (X.C21741Cz) r8
            r5 = 0
            if (r8 == 0) goto L_0x018b
            X.8ya r0 = r8.messageKeys_
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>(r0)
            java.util.Iterator r10 = r7.iterator()
        L_0x0110:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x014b
            java.lang.Object r9 = r10.next()
            X.1Cy r9 = (X.C21731Cy) r9
            int r0 = r9.index_
            if (r0 != r1) goto L_0x0110
            X.8Lq r0 = r9.cipherKey_
            byte[] r0 = r0.A07()
            javax.crypto.spec.SecretKeySpec r3 = X.C18300x5.A0y(r0)
            X.8Lq r0 = r9.macKey_
            byte[] r1 = r0.A07()
            java.lang.String r0 = "HmacSHA256"
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            r2.<init>(r1, r0)
            X.8Lq r0 = r9.iv_
            byte[] r0 = r0.A07()
            javax.crypto.spec.IvParameterSpec r1 = X.C18330xA.A0D(r0)
            int r0 = r9.index_
            X.2Ql r5 = new X.2Ql
            r5.<init>(r1, r3, r2, r0)
            r10.remove()
        L_0x014b:
            X.6c9 r3 = r8.A0H()
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1Cz r1 = (X.C21741Cz) r1
            X.6bd r0 = X.C130236bd.A02
            r1.messageKeys_ = r0
            X.6cX r2 = X.C18320x8.A0C(r3)
            X.1Cz r2 = (X.C21741Cz) r2
            X.8ya r1 = r2.messageKeys_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x016e
            X.8ya r1 = X.C130786cX.A07(r1)
            r2.messageKeys_ = r1
        L_0x016e:
            X.C170208Ch.A05(r7, r1)
            X.6cX r2 = r3.A06()
            X.1Cz r2 = (X.C21741Cz) r2
            X.1E1 r0 = r14.A00
            X.6c9 r1 = r0.A0H()
            X.19k r1 = (X.C208119k) r1
            java.lang.Object r0 = r4.A01
            int r0 = X.AnonymousClass001.A0K(r0)
            r1.A09(r2, r0)
            X.C623634s.A01(r1, r14)
        L_0x018b:
            X.2xf r7 = r14.A04()
            X.2xf r4 = r14.A03()
            javax.crypto.spec.SecretKeySpec r3 = r5.A03
            byte[] r2 = r13.A04
            int r1 = r2.length
            r0 = 8
            int r1 = r1 - r0
            byte[][] r2 = X.C616531r.A01(r2, r1, r0)
            r0 = 0
            r0 = r2[r0]
            byte[] r1 = X.C73093ev.A00(r3, r7, r4, r0, r6)
            r0 = 1
            r0 = r2[r0]
            boolean r0 = java.security.MessageDigest.isEqual(r1, r0)
            if (r0 == 0) goto L_0x0330
            byte[] r4 = r13.A03
            r0 = 3
            r3 = 2
            if (r6 < r0) goto L_0x0308
            goto L_0x02f4
        L_0x01b7:
            int r2 = r1 - r3
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 <= r0) goto L_0x01c5
            java.lang.String r0 = "Over 2000 messages into the future!"
            X.24X r1 = new X.24X
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x01c5:
            int r3 = r4.A00
            if (r3 >= r1) goto L_0x02a5
            X.2Ql r11 = r4.A00()
            X.2fY r8 = r14.A06(r5)
            java.lang.Object r7 = r8.A00
            X.6cX r7 = (X.C130786cX) r7
            X.1Cy r0 = X.C21731Cy.DEFAULT_INSTANCE
            X.6c9 r10 = r0.A0G()
            javax.crypto.spec.SecretKeySpec r0 = r11.A02
            byte[] r2 = r0.getEncoded()
            int r0 = r2.length
            r9 = 0
            X.8Lq r3 = X.C18300x5.A0J(r10, r2, r0)
            X.6cX r2 = r10.A00
            X.1Cy r2 = (X.C21731Cy) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.cipherKey_ = r3
            javax.crypto.spec.SecretKeySpec r0 = r11.A03
            byte[] r0 = r0.getEncoded()
            X.8Lq r3 = X.C18280x3.A0H(r10, r0)
            X.6cX r2 = r10.A00
            X.1Cy r2 = (X.C21731Cy) r2
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.macKey_ = r3
            int r3 = r11.A00
            X.6cX r2 = X.C18320x8.A0C(r10)
            X.1Cy r2 = (X.C21731Cy) r2
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            r2.index_ = r3
            javax.crypto.spec.IvParameterSpec r0 = r11.A01
            byte[] r0 = r0.getIV()
            X.8Lq r3 = X.C18280x3.A0H(r10, r0)
            X.6cX r2 = r10.A00
            X.1Cy r2 = (X.C21731Cy) r2
            int r0 = r2.bitField0_
            r0 = r0 | 8
            r2.bitField0_ = r0
            r2.iv_ = r3
            X.6cX r10 = r10.A06()
            X.6c9 r7 = r7.A0H()
            X.6cX r3 = X.C18320x8.A0C(r7)
            X.1Cz r3 = (X.C21741Cz) r3
            r10.getClass()
            X.8ya r2 = r3.messageKeys_
            r0 = r2
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x024f
            X.8ya r2 = X.C130786cX.A07(r2)
            r3.messageKeys_ = r2
        L_0x024f:
            r2.add(r10)
            X.6cX r0 = r7.A00
            X.1Cz r0 = (X.C21741Cz) r0
            X.8ya r0 = r0.messageKeys_
            int r2 = r0.size()
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 <= r0) goto L_0x0278
            X.6cX r3 = X.C18320x8.A0C(r7)
            X.1Cz r3 = (X.C21741Cz) r3
            X.8ya r2 = r3.messageKeys_
            r0 = r2
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0275
            X.8ya r2 = X.C130786cX.A07(r2)
            r3.messageKeys_ = r2
        L_0x0275:
            r2.remove(r9)
        L_0x0278:
            X.1E1 r0 = r14.A00
            X.6c9 r3 = r0.A0H()
            X.19k r3 = (X.C208119k) r3
            java.lang.Object r0 = r8.A01
            int r2 = X.AnonymousClass001.A0K(r0)
            X.6cX r0 = r7.A06()
            X.1Cz r0 = (X.C21741Cz) r0
            r3.A09(r0, r2)
            X.C623634s.A01(r3, r14)
            byte[] r0 = X.C60112y1.A03
            byte[] r3 = r4.A01(r0)
            X.2yQ r2 = r4.A01
            int r0 = r4.A00
            int r0 = r0 + 1
            X.2y1 r4 = new X.2y1
            r4.<init>(r2, r3, r0)
            goto L_0x01c5
        L_0x02a5:
            byte[] r0 = X.C60112y1.A03
            byte[] r2 = r4.A01(r0)
            X.2yQ r1 = r4.A01
            int r0 = r3 + 1
            X.2y1 r7 = new X.2y1
            r7.<init>(r1, r2, r0)
            X.2fY r5 = r14.A06(r5)
            java.lang.Object r3 = r5.A00
            X.6cX r3 = (X.C130786cX) r3
            X.1Bq r0 = X.C21391Bq.DEFAULT_INSTANCE
            X.6c9 r2 = r0.A0G()
            X.19s r2 = (X.C208919s) r2
            byte[] r1 = r7.A02
            int r0 = r1.length
            X.1Bq r1 = X.C208919s.A00(r7, r2, r1, r0)
            X.6c9 r0 = r3.A0H()
            X.19l r0 = (X.C208219l) r0
            r0.A09(r1)
            X.6cX r2 = r0.A06()
            X.1Cz r2 = (X.C21741Cz) r2
            X.1E1 r0 = r14.A00
            X.6c9 r1 = r0.A0H()
            X.19k r1 = (X.C208119k) r1
            java.lang.Object r0 = r5.A01
            int r0 = X.AnonymousClass001.A0K(r0)
            r1.A09(r2, r0)
            X.C623634s.A01(r1, r14)
            X.2Ql r5 = r4.A00()
            goto L_0x018b
        L_0x02f4:
            javax.crypto.spec.SecretKeySpec r2 = r5.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0329 }
            javax.crypto.spec.IvParameterSpec r1 = r5.A01     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0329 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0302, BadPaddingException | IllegalBlockSizeException -> 0x0329 }
            r0.init(r3, r2, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0302, BadPaddingException | IllegalBlockSizeException -> 0x0329 }
            goto L_0x0310
        L_0x0302:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0329 }
            throw r0     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0329 }
        L_0x0308:
            javax.crypto.spec.SecretKeySpec r1 = r5.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0329 }
            int r0 = r5.A00     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0329 }
            javax.crypto.Cipher r0 = A00(r1, r3, r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0329 }
        L_0x0310:
            byte[] r3 = r0.doFinal(r4)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0329 }
            X.6c9 r2 = X.C623634s.A00(r14)
            X.6cX r1 = r2.A00
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            r0 = 0
            r1.pendingPreKey_ = r0
            int r0 = r1.bitField0_
            r0 = r0 & -129(0xffffffffffffff7f, float:NaN)
            r1.bitField0_ = r0
            X.C623634s.A01(r2, r14)
            return r3
        L_0x0329:
            r1 = move-exception
            X.24X r0 = new X.24X
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0330:
            java.lang.String r1 = "Bad Mac!"
            X.24X r0 = new X.24X
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0338:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Received message with old counter: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " , "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r2, r1)
            X.23s r1 = new X.23s
            r1.<init>(r0)
            throw r1
        L_0x0350:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ 24R -> 0x0356 }
            throw r0     // Catch:{ 24R -> 0x0356 }
        L_0x0356:
            r1 = move-exception
            X.24X r0 = new X.24X
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x035d:
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A1L(r1, r6)
            X.AnonymousClass000.A1M(r1, r0)
            java.lang.String r0 = "Message version %d, but session version %d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.24X r0 = new X.24X
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0373:
            java.lang.String r1 = "Uninitialized session!"
            X.24X r0 = new X.24X
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33L.A05(X.3ev, X.34s):byte[]");
    }

    public AnonymousClass33L(C55472qP r7, C55472qP r8, C55472qP r9, AnonymousClass2EX r10, C52122kv r11) {
        this.A01 = r7;
        this.A00 = r8;
        this.A03 = r11;
        this.A02 = new C43372Rw(r7, r8, r9, r10, r11);
    }
}
