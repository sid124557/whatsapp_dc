package X;

import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.jcajce.provider.symmetric.AES;

/* renamed from: X.8fj  reason: invalid class name and case insensitive filesystem */
public class C177478fj extends AnonymousClass8U1 implements C180118kW {
    public static final Class A0F = C1454375w.A00("javax.crypto.spec.GCMParameterSpec", C177478fj.class);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public PBEParameterSpec A06;
    public C185768uD A07;
    public AnonymousClass8QK A08;
    public AnonymousClass8QP A09;
    public AES.ECB.AnonymousClass1 A0A;
    public C186318v6 A0B;
    public boolean A0C;
    public boolean A0D;
    public Class[] A0E;

    public C177478fj(C185768uD r6, int i, int i2) {
        this.A0E = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, A0F, AnonymousClass8NA.class, IvParameterSpec.class, PBEParameterSpec.class};
        A04(this);
        this.A07 = r6;
        this.A03 = 2;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = 16;
        this.A0B = new C173548Qp(r6);
    }

    public static void A04(C177478fj r1) {
        r1.A0C = true;
        r1.A06 = null;
        r1.A05 = null;
        r1.A04 = null;
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    public static AlgorithmParameters A02(String str, AnonymousClass8U1 r2) {
        AlgorithmParameters instance = AlgorithmParameters.getInstance(str, ((C173558Qq) r2.A07).A00);
        r2.A01 = instance;
        return instance;
    }

    public static C834748n A03(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, int i, int i2, int i3, int i4) {
        C834748n A022;
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw AnonymousClass6CA.A0Z("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        C158467k1 A012 = C160987om.A01(i, i2);
        byte[] salt = pBEParameterSpec.getSalt();
        int iterationCount = pBEParameterSpec.getIterationCount();
        A012.A01 = bArr;
        A012.A02 = salt;
        A012.A00 = iterationCount;
        if (i4 != 0) {
            A022 = A012.A03(i3, i4);
        } else {
            A022 = A012.A02(i3);
        }
        if (str.startsWith("DES")) {
            C834748n r0 = A022;
            if (A022 instanceof AnonymousClass8QP) {
                r0 = ((AnonymousClass8QP) r0).A00;
            }
            C177408eZ.A00(((AnonymousClass8QN) r0).A00);
        }
        return A022;
    }

    public static void A05(C177478fj r3, Class[] clsArr) {
        clsArr[1] = RC5ParameterSpec.class;
        clsArr[2] = A0F;
        clsArr[3] = AnonymousClass8NA.class;
        clsArr[4] = IvParameterSpec.class;
        clsArr[5] = PBEParameterSpec.class;
        r3.A0E = clsArr;
        r3.A03 = -1;
        r3.A01 = 0;
    }

    public static final boolean A06(String str) {
        if ("CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "OCB".equals(str)) {
            return true;
        }
        return false;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        int BAJ = this.A0B.BAJ(i2);
        byte[] bArr2 = new byte[BAJ];
        if (i2 != 0) {
            i3 = this.A0B.Bhb(bArr, i, i4, bArr2, 0);
        } else {
            i3 = 0;
        }
        try {
            int B24 = i3 + this.A0B.B24(bArr2, i3);
            if (B24 == BAJ) {
                return bArr2;
            }
            if (B24 <= BAJ) {
                byte[] bArr3 = new byte[B24];
                System.arraycopy(bArr2, 0, bArr3, 0, B24);
                return bArr3;
            }
            throw new IllegalBlockSizeException("internal buffer overflow");
        } catch (C177248eJ e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public int engineGetBlockSize() {
        C185768uD r0 = this.A07;
        if (r0 == null) {
            return -1;
        }
        return r0.B4g();
    }

    public byte[] engineGetIV() {
        AnonymousClass8QK r0 = this.A08;
        if (r0 != null) {
            return C161007oo.A02(r0.A03);
        }
        AnonymousClass8QP r02 = this.A09;
        if (r02 != null) {
            return r02.A01;
        }
        return null;
    }

    public int engineGetOutputSize(int i) {
        return this.A0B.BAJ(i);
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.A01 == null) {
            if (this.A06 != null) {
                try {
                    A02(this.A05, this).init(this.A06);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.A08 != null) {
                if (this.A07 == null) {
                    try {
                        A02(C186938wB.A0r.A01, this).init(new C176648dL(C161007oo.A02(this.A08.A03)).A0L());
                    } catch (Exception e) {
                        throw AnonymousClass6C7.A0e(e);
                    }
                } else {
                    try {
                        A02("GCM", this).init(new C176438d0(C161007oo.A02(this.A08.A03), this.A08.A00 / 8).A0L());
                    } catch (Exception e2) {
                        throw AnonymousClass6C7.A0e(e2);
                    }
                }
            } else if (this.A09 != null) {
                String B4N = this.A0B.BE1().B4N();
                int indexOf = B4N.indexOf(47);
                if (indexOf >= 0) {
                    B4N = AnonymousClass0x7.A0r(B4N, indexOf);
                }
                try {
                    A02(B4N, this).init(new IvParameterSpec(this.A09.A01));
                } catch (Exception e3) {
                    throw AnonymousClass6C7.A0e(e3);
                }
            }
        }
        return this.A01;
    }

    public void engineSetMode(String str) {
        C186178us r1;
        C186318v6 r0;
        C158947kq r12;
        C185768uD r02;
        C173548Qp r13;
        C185768uD r14;
        C185768uD r3;
        C185768uD r2 = this.A07;
        if (r2 != null) {
            String A012 = C162077rB.A01(str);
            this.A04 = A012;
            if (A012.equals("ECB")) {
                this.A01 = 0;
                r14 = r2;
            } else if (A012.equals("CBC")) {
                this.A01 = r2.B4g();
                r14 = new AnonymousClass8QA(r2);
            } else {
                if (A012.startsWith("OFB")) {
                    int B4g = r2.B4g();
                    this.A01 = B4g;
                    if (A012.length() != 3) {
                        r3 = new C177268eL(r2, Integer.parseInt(A012.substring(3)));
                    } else {
                        r14 = new C177268eL(r2, B4g * 8);
                    }
                } else if (A012.startsWith("CFB")) {
                    int B4g2 = r2.B4g();
                    this.A01 = B4g2;
                    if (A012.length() != 3) {
                        r3 = new C177278eM(r2, Integer.parseInt(A012.substring(3)));
                    } else {
                        r14 = new C177278eM(r2, B4g2 * 8);
                    }
                } else if (A012.startsWith("PGPCFB")) {
                    boolean equals = A012.equals("PGPCFBWITHIV");
                    if (equals || A012.length() == 6) {
                        this.A01 = r2.B4g();
                        r3 = new AnonymousClass8QC(r2, equals);
                    } else {
                        throw new NoSuchAlgorithmException(AnonymousClass000.A0V("no mode support for ", A012, AnonymousClass001.A0o()));
                    }
                } else if (A012.equals("OPENPGPCFB")) {
                    this.A01 = 0;
                    r14 = new AnonymousClass8QB(r2);
                } else {
                    if (A012.equals("SIC")) {
                        int B4g3 = r2.B4g();
                        this.A01 = B4g3;
                        if (B4g3 >= 16) {
                            this.A0C = false;
                            r02 = new C177308eP(r2);
                        } else {
                            throw AnonymousClass001.A0c("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                        }
                    } else if (A012.equals("CTR")) {
                        this.A01 = r2.B4g();
                        this.A0C = false;
                        r13 = new C173548Qp(new C158947kq(new C177308eP(r2)));
                        this.A0B = r13;
                        return;
                    } else if (A012.equals("GOFB")) {
                        this.A01 = r2.B4g();
                        r02 = new C177288eN(r2);
                    } else if (A012.equals("GCFB")) {
                        this.A01 = r2.B4g();
                        r02 = new C177298eO(r2);
                    } else if (A012.equals("CTS")) {
                        this.A01 = r2.B4g();
                        r12 = new C177158eA(new AnonymousClass8QA(r2));
                        r0 = new C173548Qp(r12);
                        this.A0B = r0;
                        return;
                    } else {
                        if (A012.equals("CCM")) {
                            this.A01 = 12;
                            r1 = new C173408Qb(r2);
                        } else if (A012.equals("OCB")) {
                            if (this.A0A != null) {
                                this.A01 = 15;
                                r1 = new C173428Qd(r2, new AnonymousClass8QD());
                            } else {
                                throw new NoSuchAlgorithmException(AnonymousClass000.A0T("can't support mode ", str));
                            }
                        } else if (A012.equals("EAX")) {
                            this.A01 = r2.B4g();
                            r1 = new C173418Qc(r2);
                        } else if (A012.equals("GCM")) {
                            this.A01 = r2.B4g();
                            r1 = new C173438Qe(r2);
                        } else {
                            throw new NoSuchAlgorithmException(AnonymousClass000.A0T("can't support mode ", str));
                        }
                        r0 = new C173538Qo(r1);
                        this.A0B = r0;
                        return;
                    }
                    r12 = new C158947kq(r02);
                    r0 = new C173548Qp(r12);
                    this.A0B = r0;
                    return;
                }
                r13 = new C173548Qp(r3);
                this.A0B = r13;
                return;
            }
            r0 = new C173548Qp(r14);
            this.A0B = r0;
            return;
        }
        throw new NoSuchAlgorithmException("no mode supported for this algorithm");
    }

    public void engineSetPadding(String str) {
        C158947kq r1;
        C173548Qp r2;
        C185768uD BE1;
        C185188tE r0;
        if (this.A07 != null) {
            String A012 = C162077rB.A01(str);
            if (A012.equals("NOPADDING")) {
                C186318v6 r12 = this.A0B;
                if (r12.BsZ()) {
                    r1 = new C158947kq(r12.BE1());
                } else {
                    return;
                }
            } else if (A012.equals("WITHCTS") || A012.equals("CTSPADDING") || A012.equals("CS3PADDING")) {
                r1 = new C177158eA(this.A0B.BE1());
            } else {
                this.A0D = true;
                if (A06(this.A04)) {
                    throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
                } else if (A012.equals("PKCS5PADDING") || A012.equals("PKCS7PADDING")) {
                    r2 = new C173548Qp(this.A0B.BE1());
                    this.A0B = r2;
                    return;
                } else {
                    if (A012.equals("ZEROBYTEPADDING")) {
                        BE1 = this.A0B.BE1();
                        r0 = new C173478Qi();
                    } else if (A012.equals("ISO10126PADDING") || A012.equals("ISO10126-2PADDING")) {
                        BE1 = this.A0B.BE1();
                        r0 = new C173488Qj();
                    } else if (A012.equals("X9.23PADDING") || A012.equals("X923PADDING")) {
                        BE1 = this.A0B.BE1();
                        r0 = new C173498Qk();
                    } else if (A012.equals("ISO7816-4PADDING") || A012.equals("ISO9797-1PADDING")) {
                        BE1 = this.A0B.BE1();
                        r0 = new C173448Qf();
                    } else if (A012.equals("TBCPADDING")) {
                        BE1 = this.A0B.BE1();
                        r0 = new C173468Qh();
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Padding ");
                        A0o.append(str);
                        throw new NoSuchPaddingException(AnonymousClass000.A0X(" unknown.", A0o));
                    }
                    r2 = new C173548Qp(BE1, r0);
                    this.A0B = r2;
                    return;
                }
            }
            r2 = new C173548Qp(r1);
            this.A0B = r2;
            return;
        }
        throw new NoSuchPaddingException("no padding supported for this algorithm");
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        C186318v6 r1 = this.A0B;
        int i3 = i2;
        int BE4 = r1.BE4(i2);
        byte[] bArr2 = bArr;
        int i4 = i;
        if (BE4 > 0) {
            byte[] bArr3 = new byte[BE4];
            int Bhb = r1.Bhb(bArr2, i4, i3, bArr3, 0);
            if (Bhb == 0) {
                return null;
            }
            if (Bhb == BE4) {
                return bArr3;
            }
            byte[] bArr4 = new byte[Bhb];
            System.arraycopy(bArr3, 0, bArr4, 0, Bhb);
            return bArr4;
        }
        r1.Bhb(bArr, i, i2, (byte[]) null, 0);
        return null;
    }

    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.A0B.BrY(bArr, i, i2);
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        C186318v6 r2 = this.A0B;
        int i4 = i2;
        int i5 = i3;
        byte[] bArr3 = bArr2;
        if (r2.BE4(i2) + i3 <= bArr2.length) {
            try {
                return r2.Bhb(bArr, i, i4, bArr3, i5);
            } catch (C177248eJ e) {
                throw AnonymousClass001.A0e(e.toString());
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            byteBuffer.position(byteBuffer.limit());
        } else if (remaining <= 512) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            Arrays.fill(bArr, (byte) 0);
        } else {
            byte[] bArr2 = new byte[512];
            do {
                int min = Math.min(512, remaining);
                byteBuffer.get(bArr2, 0, min);
                engineUpdateAAD(bArr2, 0, min);
                remaining -= min;
            } while (remaining > 0);
            Arrays.fill(bArr2, (byte) 0);
        }
    }

    public C177478fj(C188618zD r5, int i, boolean z) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        this.A07 = r5.BE1();
        this.A0C = false;
        this.A01 = 12;
        this.A0B = new C173538Qo(r5);
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5 = i3;
        int i6 = i2;
        byte[] bArr3 = bArr2;
        if (this.A0B.BAJ(i2) + i3 <= bArr2.length) {
            if (i2 != 0) {
                try {
                    i4 = this.A0B.Bhb(bArr, i, i6, bArr3, i5);
                } catch (C177198eE e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                } catch (C177248eJ e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            } else {
                i4 = 0;
            }
            return i4 + this.A0B.B24(bArr2, i3 + i4);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0388 A[Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:? A[Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r18, java.security.Key r19, java.security.spec.AlgorithmParameterSpec r20, java.security.SecureRandom r21) {
        /*
            r17 = this;
            r1 = r20
            r4 = 0
            r0 = r17
            r0.A06 = r4
            r0.A05 = r4
            r0.A01 = r4
            r0.A08 = r4
            r2 = r19
            boolean r3 = r2 instanceof javax.crypto.SecretKey
            if (r3 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Key for algorithm "
            r1.append(r0)
            if (r19 == 0) goto L_0x0022
            java.lang.String r4 = r2.getAlgorithm()
        L_0x0022:
            r1.append(r4)
            java.lang.String r0 = " not suitable for symmetric enryption."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0031:
            java.lang.String r4 = "RC5-64"
            if (r20 != 0) goto L_0x004a
            X.8uD r3 = r0.A07
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r3.B4N()
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x004a
            java.lang.String r0 = "RC5 requires an RC5ParametersSpec to be passed in."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x004a:
            int r9 = r0.A03
            r5 = 4
            java.lang.String r10 = "Algorithm requires a PBE key"
            r13 = 2
            r3 = 1
            if (r9 == r13) goto L_0x0114
            boolean r6 = r2 instanceof X.C173268Oy
            if (r6 == 0) goto L_0x00e4
            r7 = r2
            X.8Oy r7 = (X.C173268Oy) r7
            X.C173268Oy.A00(r7)
            X.8dX r6 = r7.oid
            if (r6 == 0) goto L_0x00df
            X.C173268Oy.A00(r7)
            X.8dX r6 = r7.oid
            java.lang.String r6 = r6.A01
        L_0x0068:
            r0.A05 = r6
            X.C173268Oy.A00(r7)
            X.48n r6 = r7.param
            if (r6 == 0) goto L_0x00c7
            X.C173268Oy.A00(r7)
            X.48n r8 = r7.param
            boolean r6 = r8 instanceof X.AnonymousClass8QP
            if (r6 == 0) goto L_0x00b3
            r6 = r8
            X.8QP r6 = (X.AnonymousClass8QP) r6
            X.48n r7 = r6.A00
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x0091
            r6 = r1
            javax.crypto.spec.IvParameterSpec r6 = (javax.crypto.spec.IvParameterSpec) r6
            byte[] r6 = r6.getIV()
            X.8QP r8 = new X.8QP
            r8.<init>(r7, r6)
            r0.A09 = r8
        L_0x0091:
            boolean r6 = r8 instanceof X.AnonymousClass8QP
            if (r6 == 0) goto L_0x009a
            r6 = r8
            X.8QP r6 = (X.AnonymousClass8QP) r6
            r0.A09 = r6
        L_0x009a:
            boolean r6 = r1 instanceof X.AnonymousClass8U5
            if (r6 == 0) goto L_0x0180
            java.lang.String r2 = r0.A04
            boolean r2 = A06(r2)
            if (r2 != 0) goto L_0x02b7
            X.8v6 r2 = r0.A0B
            boolean r2 = r2 instanceof X.C173538Qo
            if (r2 != 0) goto L_0x02b7
            java.lang.String r0 = "AEADParameterSpec can only be used with AEAD modes."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x00b3:
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x0091
            r6 = r1
            javax.crypto.spec.IvParameterSpec r6 = (javax.crypto.spec.IvParameterSpec) r6
            byte[] r7 = r6.getIV()
            X.8QP r6 = new X.8QP
            r6.<init>(r8, r7)
            r0.A09 = r6
            r8 = r6
            goto L_0x0091
        L_0x00c7:
            boolean r6 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r6 == 0) goto L_0x03bc
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A06 = r6
            X.8v6 r6 = r0.A0B
            X.8uD r6 = r6.BE1()
            java.lang.String r6 = r6.B4N()
            X.48n r8 = X.C160987om.A00(r6, r1, r7)
            goto L_0x0091
        L_0x00df:
            java.lang.String r6 = r7.getAlgorithm()
            goto L_0x0068
        L_0x00e4:
            boolean r6 = r2 instanceof javax.crypto.interfaces.PBEKey
            if (r6 == 0) goto L_0x0106
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A06 = r6
            byte[] r8 = r2.getEncoded()
            int r10 = r0.A00
            int r11 = r0.A02
            int r6 = r0.A01
            int r12 = r6 * 8
            javax.crypto.spec.PBEParameterSpec r7 = r0.A06
            X.8v6 r6 = r0.A0B
            java.lang.String r6 = r6.B4N()
            X.48n r8 = A03(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0091
        L_0x0106:
            if (r9 == 0) goto L_0x03c3
            if (r9 == r3) goto L_0x03c3
            byte[] r6 = r2.getEncoded()
            X.8QN r8 = new X.8QN
            r8.<init>(r6)
            goto L_0x009a
        L_0x0114:
            r9 = r2
            javax.crypto.SecretKey r9 = (javax.crypto.SecretKey) r9     // Catch:{ Exception -> 0x03d0 }
            boolean r6 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r6 == 0) goto L_0x0120
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A06 = r6
        L_0x0120:
            boolean r11 = r9 instanceof javax.crypto.interfaces.PBEKey
            if (r11 == 0) goto L_0x0140
            javax.crypto.spec.PBEParameterSpec r6 = r0.A06
            if (r6 != 0) goto L_0x0140
            r7 = r9
            javax.crypto.interfaces.PBEKey r7 = (javax.crypto.interfaces.PBEKey) r7
            byte[] r6 = r7.getSalt()
            if (r6 == 0) goto L_0x03c9
            byte[] r8 = r7.getSalt()
            int r7 = r7.getIterationCount()
            javax.crypto.spec.PBEParameterSpec r6 = new javax.crypto.spec.PBEParameterSpec
            r6.<init>(r8, r7)
            r0.A06 = r6
        L_0x0140:
            javax.crypto.spec.PBEParameterSpec r6 = r0.A06
            if (r6 != 0) goto L_0x014c
            if (r11 != 0) goto L_0x014c
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r10)
            throw r0
        L_0x014c:
            boolean r6 = r2 instanceof X.C173268Oy
            if (r6 == 0) goto L_0x0166
            r6 = r2
            X.8Oy r6 = (X.C173268Oy) r6
            X.C173268Oy.A00(r6)
            X.48n r8 = r6.param
            boolean r6 = r8 instanceof X.AnonymousClass8QP
            if (r6 != 0) goto L_0x0091
            if (r8 == 0) goto L_0x0166
            java.lang.String r1 = "Algorithm requires a PBE key suitable for PKCS12"
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0166:
            byte[] r12 = r9.getEncoded()
            int r14 = r0.A00
            int r15 = r0.A02
            int r6 = r0.A01
            int r16 = r6 * 8
            javax.crypto.spec.PBEParameterSpec r11 = r0.A06
            X.8v6 r6 = r0.A0B
            java.lang.String r10 = r6.B4N()
            X.48n r8 = A03(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0091
        L_0x0180:
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x01c7
            int r2 = r0.A01
            if (r2 == 0) goto L_0x01b4
            javax.crypto.spec.IvParameterSpec r1 = (javax.crypto.spec.IvParameterSpec) r1
            byte[] r2 = r1.getIV()
            int r2 = r2.length
            int r4 = r0.A01
            if (r2 == r4) goto L_0x02ed
            X.8v6 r2 = r0.A0B
            boolean r2 = r2 instanceof X.C173538Qo
            if (r2 != 0) goto L_0x02ed
            boolean r2 = r0.A0C
            if (r2 == 0) goto L_0x02ed
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "IV must be "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " bytes long."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x01b4:
            java.lang.String r2 = r0.A04
            if (r2 == 0) goto L_0x0301
            java.lang.String r1 = "ECB"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0301
            java.lang.String r0 = "ECB mode does not use an IV"
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x01c7:
            boolean r6 = r1 instanceof javax.crypto.spec.RC2ParameterSpec
            if (r6 == 0) goto L_0x01f1
            javax.crypto.spec.RC2ParameterSpec r1 = (javax.crypto.spec.RC2ParameterSpec) r1
            byte[] r2 = r2.getEncoded()
            r1.getEffectiveKeyBits()
            X.8ea r8 = new X.8ea
            r8.<init>(r2)
            byte[] r2 = r1.getIV()
            if (r2 == 0) goto L_0x0301
            int r2 = r0.A01
            if (r2 == 0) goto L_0x0301
            byte[] r2 = r1.getIV()
        L_0x01e7:
            X.8QP r1 = new X.8QP
            r1.<init>(r8, r2)
            r0.A09 = r1
            r8 = r1
            goto L_0x0301
        L_0x01f1:
            boolean r6 = r1 instanceof javax.crypto.spec.RC5ParameterSpec
            if (r6 == 0) goto L_0x0282
            javax.crypto.spec.RC5ParameterSpec r1 = (javax.crypto.spec.RC5ParameterSpec) r1
            byte[] r2 = r2.getEncoded()
            r1.getRounds()
            X.8QI r8 = new X.8QI
            r8.<init>(r2)
            X.8uD r7 = r0.A07
            java.lang.String r6 = r7.B4N()
            java.lang.String r2 = "RC5"
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L_0x027b
            java.lang.String r6 = r7.B4N()
            java.lang.String r2 = "RC5-32"
            boolean r2 = r6.equals(r2)
            java.lang.String r6 = "."
            if (r2 == 0) goto L_0x0240
            int r4 = r1.getWordSize()
            r2 = 32
            if (r4 == r2) goto L_0x026b
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RC5 already set up for a word size of 32 not "
            r2.append(r0)
            int r0 = r1.getWordSize()
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r6, r2)
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x0240:
            java.lang.String r2 = r7.B4N()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x026b
            int r4 = r1.getWordSize()
            r2 = 64
            if (r4 == r2) goto L_0x026b
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RC5 already set up for a word size of 64 not "
            r2.append(r0)
            int r0 = r1.getWordSize()
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r6, r2)
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x026b:
            byte[] r2 = r1.getIV()
            if (r2 == 0) goto L_0x0301
            int r2 = r0.A01
            if (r2 == 0) goto L_0x0301
            byte[] r2 = r1.getIV()
            goto L_0x01e7
        L_0x027b:
            java.lang.String r0 = "RC5 parameters passed to a cipher that is not RC5."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x0282:
            java.lang.Class r2 = A0F
            if (r2 == 0) goto L_0x02e0
            boolean r2 = r2.isInstance(r1)
            if (r2 == 0) goto L_0x02e0
            java.lang.String r2 = r0.A04
            boolean r2 = A06(r2)
            if (r2 != 0) goto L_0x02a1
            X.8v6 r2 = r0.A0B
            boolean r2 = r2 instanceof X.C173538Qo
            if (r2 != 0) goto L_0x02a1
            java.lang.String r0 = "GCMParameterSpec can only be used with AEAD modes."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x02a1:
            boolean r2 = r8 instanceof X.AnonymousClass8QP
            if (r2 == 0) goto L_0x02a9
            X.8QP r8 = (X.AnonymousClass8QP) r8
            X.48n r8 = r8.A00
        L_0x02a9:
            X.8QN r8 = (X.AnonymousClass8QN) r8
            X.8N5 r2 = new X.8N5     // Catch:{ Exception -> 0x02d9 }
            r2.<init>(r1, r8)     // Catch:{ Exception -> 0x02d9 }
            java.lang.Object r8 = java.security.AccessController.doPrivileged(r2)     // Catch:{ Exception -> 0x02d9 }
            X.8QK r8 = (X.AnonymousClass8QK) r8     // Catch:{ Exception -> 0x02d9 }
            goto L_0x02d4
        L_0x02b7:
            X.8U5 r1 = (X.AnonymousClass8U5) r1
            boolean r2 = r8 instanceof X.AnonymousClass8QP
            if (r2 == 0) goto L_0x02d7
            X.8QP r8 = (X.AnonymousClass8QP) r8
            X.48n r6 = r8.A00
        L_0x02c1:
            X.8QN r6 = (X.AnonymousClass8QN) r6
            int r4 = r1.A00
            byte[] r2 = r1.getIV()
            byte[] r1 = r1.A01
            byte[] r1 = X.C161007oo.A02(r1)
            X.8QK r8 = new X.8QK
            r8.<init>(r6, r2, r1, r4)
        L_0x02d4:
            r0.A08 = r8
            goto L_0x0301
        L_0x02d7:
            r6 = r8
            goto L_0x02c1
        L_0x02d9:
            java.lang.String r0 = "Cannot process GCMParameterSpec."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x02e0:
            if (r20 == 0) goto L_0x0301
            boolean r1 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r1 != 0) goto L_0x0301
            java.lang.String r0 = "unknown parameter type."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x02ed:
            boolean r2 = r8 instanceof X.AnonymousClass8QP
            if (r2 == 0) goto L_0x02f5
            X.8QP r8 = (X.AnonymousClass8QP) r8
            X.48n r8 = r8.A00
        L_0x02f5:
            byte[] r2 = r1.getIV()
            X.8QP r1 = new X.8QP
            r1.<init>(r8, r2)
            r8 = r1
            r0.A09 = r1
        L_0x0301:
            int r1 = r0.A01
            r6 = 3
            r4 = r18
            r7 = r21
            if (r1 == 0) goto L_0x0346
            boolean r1 = r8 instanceof X.AnonymousClass8QP
            if (r1 != 0) goto L_0x0346
            boolean r1 = r8 instanceof X.AnonymousClass8QK
            if (r1 != 0) goto L_0x0346
            if (r21 != 0) goto L_0x0335
            java.security.SecureRandom r9 = X.C161657qB.A00()
        L_0x0318:
            if (r4 == r3) goto L_0x0337
            if (r4 == r6) goto L_0x0337
            X.8v6 r1 = r0.A0B
            X.8uD r1 = r1.BE1()
            java.lang.String r2 = r1.B4N()
            java.lang.String r1 = "PGPCFB"
            int r1 = r2.indexOf(r1)
            if (r1 >= 0) goto L_0x0346
            java.lang.String r0 = "no IV set when one expected"
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x0335:
            r9 = r7
            goto L_0x0318
        L_0x0337:
            int r1 = r0.A01
            byte[] r2 = new byte[r1]
            r9.nextBytes(r2)
            X.8QP r1 = new X.8QP
            r1.<init>(r8, r2)
            r0.A09 = r1
            r8 = r1
        L_0x0346:
            if (r21 == 0) goto L_0x0352
            boolean r1 = r0.A0D
            if (r1 == 0) goto L_0x0352
            X.8QJ r1 = new X.8QJ
            r1.<init>(r7, r8)
            r8 = r1
        L_0x0352:
            if (r4 == r3) goto L_0x0379
            if (r4 == r13) goto L_0x0372
            if (r4 == r6) goto L_0x0379
            if (r4 == r5) goto L_0x0372
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            java.lang.String r0 = "unknown opmode "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            r1.append(r4)     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            java.lang.String r0 = " passed"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
        L_0x0372:
            X.8v6 r2 = r0.A0B     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            r1 = 0
            r2.BFw(r8, r1)     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            goto L_0x037e
        L_0x0379:
            X.8v6 r1 = r0.A0B     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            r1.BFw(r8, r3)     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
        L_0x037e:
            X.8v6 r2 = r0.A0B     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            boolean r1 = r2 instanceof X.C173538Qo     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            if (r1 == 0) goto L_0x03a5
            X.8QK r1 = r0.A08     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            if (r1 != 0) goto L_0x03a5
            X.8Qo r2 = (X.C173538Qo) r2     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            X.8us r2 = r2.A00     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            X.8QP r1 = r0.A09     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            X.48n r5 = r1.A00     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            X.8QN r5 = (X.AnonymousClass8QN) r5     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            byte[] r1 = r2.B9G()     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            int r1 = r1.length     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            int r4 = r1 * 8
            X.8QP r1 = r0.A09     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            byte[] r3 = r1.A01     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            r2 = 0
            X.8QK r1 = new X.8QK     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            r1.<init>(r5, r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
            r0.A08 = r1     // Catch:{ IllegalArgumentException -> 0x03b1, Exception -> 0x03a6 }
        L_0x03a5:
            return
        L_0x03a6:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            X.8SS r2 = new X.8SS
            r2.<init>(r0, r1)
            throw r2
        L_0x03b1:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            r2.<init>(r0, r1)
            throw r2
        L_0x03bc:
            java.lang.String r0 = "PBE requires PBE parameters to be set."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x03c3:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r10)
            throw r0
        L_0x03c9:
            java.lang.String r0 = "PBEKey requires parameters to specify salt"
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        L_0x03d0:
            java.lang.String r1 = "PKCS12 requires a SecretKey/PBEKey"
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177478fj.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    public C177478fj(C158947kq r5) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        this.A07 = r5.A01;
        this.A0B = new C173548Qp(r5);
        this.A0C = true;
        this.A01 = 16;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r4, java.security.Key r5, java.security.AlgorithmParameters r6, java.security.SecureRandom r7) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x001b
            java.lang.Class[] r2 = r3.A0E
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
            r3.engineInit((int) r4, (java.security.Key) r5, (java.security.spec.AlgorithmParameterSpec) r0, (java.security.SecureRandom) r7)
            r3.A01 = r6
            return
        L_0x0025:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "can't handle parameter "
            X.C18270x1.A1H(r1, r0, r6)
            java.lang.String r0 = r1.toString()
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass6CA.A0Z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177478fj.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    public C177478fj(C185768uD r5, int i) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = r5;
        this.A0C = true;
        this.A0B = new C173548Qp(r5);
        this.A01 = 16;
    }

    public C177478fj(C185768uD r4) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        this.A07 = r4;
        this.A0B = new C173548Qp(r4);
    }

    public C177478fj(AES.ECB.AnonymousClass1 r4) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        this.A07 = new AnonymousClass8QD();
        this.A0A = r4;
        this.A0B = new C173548Qp((C185768uD) new AnonymousClass8QD());
    }

    public C177478fj(C188618zD r4) {
        Class[] clsArr = new Class[6];
        clsArr[0] = RC2ParameterSpec.class;
        A05(this, clsArr);
        A04(this);
        C185768uD BE1 = r4.BE1();
        this.A07 = BE1;
        this.A01 = BE1.B4g();
        this.A0B = new C173538Qo(r4);
    }
}
