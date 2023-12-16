package X;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.8U1  reason: invalid class name */
public abstract class AnonymousClass8U1 extends CipherSpi implements C180118kW {
    public int A00;
    public AlgorithmParameters A01;
    public C185538tq A02;
    public C140266tQ A03;
    public boolean A04;
    public byte[] A05;
    public Class[] A06;
    public final C180128kX A07 = A01(this);

    public static C173558Qq A01(AnonymousClass8U1 r3) {
        r3.A06 = new Class[]{AnonymousClass8NB.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        r3.A01 = null;
        r3.A02 = null;
        r3.A03 = null;
        return new C173558Qq();
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new AnonymousClass8SS(e.getMessage(), e);
        }
    }

    public static AnonymousClass8QA A00() {
        return new AnonymousClass8QA(new AnonymousClass8QD());
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        Throwable th;
        byte[] bArr2;
        C140266tQ r0 = this.A03;
        if (r0 != null) {
            if (bArr != null) {
                r0.write(bArr, i, i2);
            }
            try {
                if (this.A04) {
                    C185538tq r2 = this.A02;
                    C140266tQ r02 = this.A03;
                    bArr2 = r2.BsY(r02.A01(), 0, r02.size());
                } else {
                    try {
                        C185538tq r22 = this.A02;
                        C140266tQ r03 = this.A03;
                        bArr2 = r22.BrR(r03.A01(), 0, r03.size());
                    } catch (C177188eD e) {
                        th = new BadPaddingException(e.getMessage());
                        throw th;
                    }
                }
                this.A03.A00();
                return bArr2;
            } catch (Exception e2) {
                th = new IllegalBlockSizeException(e2.getMessage());
            } catch (Throwable th2) {
                this.A03.A00();
                throw th2;
            }
        } else {
            throw AnonymousClass001.A0e("not supported in a wrapping mode");
        }
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return C161007oo.A02(this.A05);
    }

    public int engineGetOutputSize(int i) {
        return -1;
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.A01 == null && this.A05 != null) {
            String B4N = this.A02.B4N();
            int indexOf = B4N.indexOf(47);
            if (indexOf >= 0) {
                B4N = AnonymousClass0x7.A0r(B4N, indexOf);
            }
            try {
                C177478fj.A02(B4N, this).init(new IvParameterSpec(this.A05));
            } catch (Exception e) {
                throw AnonymousClass6C7.A0e(e);
            }
        }
        return this.A01;
    }

    public Key engineUnwrap(byte[] bArr, String str, int i) {
        byte[] bArr2;
        C176188cb r4;
        try {
            C185538tq r2 = this.A02;
            if (r2 == null) {
                bArr2 = engineDoFinal(bArr, 0, bArr.length);
            } else {
                bArr2 = r2.BrR(bArr, 0, bArr.length);
            }
            if (i == 3) {
                return new SecretKeySpec(bArr2, str);
            }
            if (!str.equals("") || i != 2) {
                try {
                    KeyFactory instance = KeyFactory.getInstance(str, ((C173558Qq) this.A07).A00);
                    if (i == 1) {
                        return instance.generatePublic(new X509EncodedKeySpec(bArr2));
                    }
                    if (i == 2) {
                        return instance.generatePrivate(new PKCS8EncodedKeySpec(bArr2));
                    }
                    throw new InvalidKeyException(C18260x0.A05("Unknown key type ", i));
                } catch (NoSuchProviderException e) {
                    throw new InvalidKeyException(AnonymousClass000.A0a("Unknown key type ", AnonymousClass001.A0o(), e));
                } catch (InvalidKeySpecException e2) {
                    throw new InvalidKeyException(AnonymousClass000.A0a("Unknown key type ", AnonymousClass001.A0o(), e2));
                }
            } else {
                try {
                    if (bArr2 instanceof C176188cb) {
                        r4 = (C176188cb) bArr2;
                    } else {
                        r4 = new C176188cb(C176958dq.A0C(bArr2));
                    }
                    C176768dX r22 = r4.A04.A01;
                    Map map = AnonymousClass8SV.A00;
                    synchronized (map) {
                        try {
                            map.get(r22);
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("algorithm ");
                    A0o.append(r22);
                    th = new InvalidKeyException(AnonymousClass000.A0X(" not supported", A0o));
                    throw th;
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
        } catch (C177188eD e3) {
            throw new InvalidKeyException(e3.getMessage());
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        C140266tQ r0 = this.A03;
        if (r0 != null) {
            r0.write(bArr, i, i2);
            return null;
        }
        throw AnonymousClass001.A0e("not supported in a wrapping mode");
    }

    public AnonymousClass8U1(C185538tq r2, int i) {
        this.A02 = r2;
        this.A00 = i;
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    public void engineSetMode(String str) {
        throw new NoSuchAlgorithmException(AnonymousClass000.A0V("can't support mode ", str, AnonymousClass001.A0o()));
    }

    public void engineSetPadding(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Padding ");
        A0o.append(str);
        throw new NoSuchPaddingException(AnonymousClass000.A0X(" unknown.", A0o));
    }

    public byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                C185538tq r2 = this.A02;
                if (r2 == null) {
                    return engineDoFinal(encoded, 0, encoded.length);
                }
                return r2.BsY(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }

    public AnonymousClass8U1() {
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        C140266tQ r0 = this.A03;
        if (r0 != null) {
            r0.write(bArr, i, i2);
            return 0;
        }
        throw AnonymousClass001.A0e("not supported in a wrapping mode");
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        Throwable th;
        byte[] bArr3;
        C140266tQ r0 = this.A03;
        if (r0 != null) {
            r0.write(bArr, i, i2);
            try {
                if (this.A04) {
                    C185538tq r2 = this.A02;
                    C140266tQ r02 = this.A03;
                    bArr3 = r2.BsY(r02.A01(), 0, r02.size());
                } else {
                    try {
                        C185538tq r22 = this.A02;
                        C140266tQ r03 = this.A03;
                        bArr3 = r22.BrR(r03.A01(), 0, r03.size());
                    } catch (C177188eD e) {
                        th = new BadPaddingException(e.getMessage());
                        throw th;
                    }
                }
                int length = bArr3.length;
                if (length + i3 <= bArr2.length) {
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    this.A03.A00();
                    return length;
                }
                throw new ShortBufferException("output buffer too short for input.");
            } catch (Exception e2) {
                th = new IllegalBlockSizeException(e2.getMessage());
            } catch (Throwable th2) {
                this.A03.A00();
                throw th2;
            }
        } else {
            throw AnonymousClass001.A0e("not supported in a wrapping mode");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r10 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r7, java.security.Key r8, java.security.spec.AlgorithmParameterSpec r9, java.security.SecureRandom r10) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C173268Oy
            if (r0 == 0) goto L_0x0066
            X.8Oy r8 = (X.C173268Oy) r8
            boolean r0 = r9 instanceof javax.crypto.spec.PBEParameterSpec
            if (r0 == 0) goto L_0x0059
            X.8tq r0 = r6.A02
            java.lang.String r0 = r0.B4N()
            X.48n r3 = X.C160987om.A00(r0, r9, r8)
        L_0x0014:
            boolean r0 = r9 instanceof javax.crypto.spec.IvParameterSpec
            if (r0 == 0) goto L_0x0026
            javax.crypto.spec.IvParameterSpec r9 = (javax.crypto.spec.IvParameterSpec) r9
            byte[] r1 = r9.getIV()
            r6.A05 = r1
            X.8QP r0 = new X.8QP
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0026:
            boolean r0 = r3 instanceof X.AnonymousClass8QN
            r5 = 3
            r4 = 1
            if (r0 == 0) goto L_0x0056
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0056
            if (r7 == r5) goto L_0x0034
            if (r7 != r4) goto L_0x0056
        L_0x0034:
            byte[] r0 = new byte[r0]
            r6.A05 = r0
            r10.nextBytes(r0)
            byte[] r1 = r6.A05
            X.8QP r0 = new X.8QP
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0043:
            X.8QJ r0 = new X.8QJ
            r0.<init>(r10, r3)
            r3 = r0
        L_0x0049:
            if (r7 == r4) goto L_0x0097
            r0 = 2
            r2 = 0
            if (r7 == r0) goto L_0x0088
            r1 = 0
            if (r7 == r5) goto L_0x0080
            r0 = 4
            if (r7 != r0) goto L_0x0078
            goto L_0x0070
        L_0x0056:
            if (r10 == 0) goto L_0x0049
            goto L_0x0043
        L_0x0059:
            X.C173268Oy.A00(r8)
            X.48n r0 = r8.param
            if (r0 == 0) goto L_0x00b1
            X.C173268Oy.A00(r8)
            X.48n r3 = r8.param
            goto L_0x0014
        L_0x0066:
            byte[] r0 = r8.getEncoded()
            X.8QN r3 = new X.8QN
            r3.<init>(r0)
            goto L_0x0014
        L_0x0070:
            X.8tq r0 = r6.A02     // Catch:{ Exception -> 0x00a6 }
            r0.BFw(r3, r2)     // Catch:{ Exception -> 0x00a6 }
            r6.A03 = r1     // Catch:{ Exception -> 0x00a6 }
            goto L_0x0094
        L_0x0078:
            java.lang.String r1 = "Unknown mode parameter passed to init."
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ Exception -> 0x00a6 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00a6 }
            throw r0     // Catch:{ Exception -> 0x00a6 }
        L_0x0080:
            X.8tq r0 = r6.A02     // Catch:{ Exception -> 0x00a6 }
            r0.BFw(r3, r4)     // Catch:{ Exception -> 0x00a6 }
            r6.A03 = r1     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00a3
        L_0x0088:
            X.8tq r0 = r6.A02     // Catch:{ Exception -> 0x00a6 }
            r0.BFw(r3, r2)     // Catch:{ Exception -> 0x00a6 }
            X.6tQ r0 = new X.6tQ     // Catch:{ Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ Exception -> 0x00a6 }
            r6.A03 = r0     // Catch:{ Exception -> 0x00a6 }
        L_0x0094:
            r6.A04 = r2     // Catch:{ Exception -> 0x00a6 }
            return
        L_0x0097:
            X.8tq r0 = r6.A02     // Catch:{ Exception -> 0x00a6 }
            r0.BFw(r3, r4)     // Catch:{ Exception -> 0x00a6 }
            X.6tQ r0 = new X.6tQ     // Catch:{ Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ Exception -> 0x00a6 }
            r6.A03 = r0     // Catch:{ Exception -> 0x00a6 }
        L_0x00a3:
            r6.A04 = r4     // Catch:{ Exception -> 0x00a6 }
            return
        L_0x00a6:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            X.8SS r0 = new X.8SS
            r0.<init>(r1, r2)
            throw r0
        L_0x00b1:
            java.lang.String r0 = "PBE requires PBE parameters to be set."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8U1.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r4, java.security.Key r5, java.security.AlgorithmParameters r6, java.security.SecureRandom r7) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x001b
            java.lang.Class[] r2 = r3.A06
            java.lang.Class<java.security.spec.AlgorithmParameterSpec> r0 = java.security.spec.AlgorithmParameterSpec.class
            java.security.spec.AlgorithmParameterSpec r0 = r6.getParameterSpec(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x001d
        L_0x000b:
            r1 = 0
        L_0x000c:
            int r0 = r2.length
            if (r1 == r0) goto L_0x0025
            r0 = r2[r1]
            if (r0 == 0) goto L_0x0018
            java.security.spec.AlgorithmParameterSpec r0 = r6.getParameterSpec(r0)     // Catch:{ Exception -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            r0 = 0
            goto L_0x001f
        L_0x001d:
            if (r0 == 0) goto L_0x0025
        L_0x001f:
            r3.A01 = r6
            r3.engineInit((int) r4, (java.security.Key) r5, (java.security.spec.AlgorithmParameterSpec) r0, (java.security.SecureRandom) r7)
            return
        L_0x0025:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "can't handle parameter "
            X.C18270x1.A1H(r1, r0, r6)
            java.lang.String r0 = r1.toString()
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8U1.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }
}
