package X;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.87h  reason: invalid class name and case insensitive filesystem */
public abstract class C1689287h implements C180688lT {
    public C166547ys A06(AnonymousClass6OZ r16, ByteBuffer byteBuffer) {
        String str;
        C187368x6[] r1;
        C1688687b r0;
        CharsetDecoder charsetDecoder;
        CharsetDecoder charsetDecoder2;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (this instanceof AnonymousClass6P1) {
            return ((AnonymousClass6P1) this).A07(byteBuffer2.array(), byteBuffer2.limit());
        }
        if (this instanceof AnonymousClass6P0) {
            AnonymousClass6P0 r3 = (AnonymousClass6P0) this;
            try {
                charsetDecoder = r3.A01;
                str = charsetDecoder.decode(byteBuffer2).toString();
            } catch (CharacterCodingException unused) {
                r3.A01.reset();
                byteBuffer2.rewind();
                try {
                    charsetDecoder = r3.A00;
                    str = charsetDecoder.decode(byteBuffer2).toString();
                } catch (CharacterCodingException unused2) {
                    r3.A00.reset();
                    byteBuffer2.rewind();
                    str = null;
                } catch (Throwable th) {
                    th = th;
                    charsetDecoder2 = r3.A00;
                    charsetDecoder2.reset();
                    byteBuffer2.rewind();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                charsetDecoder2 = r3.A01;
                charsetDecoder2.reset();
                byteBuffer2.rewind();
                throw th;
            }
            charsetDecoder.reset();
            byteBuffer2.rewind();
            byte[] bArr = new byte[byteBuffer2.limit()];
            byteBuffer2.get(bArr);
            String str2 = null;
            if (str == null) {
                r1 = new C187368x6[1];
                r0 = new C1688687b((String) null, bArr, (String) null);
            } else {
                Matcher matcher = AnonymousClass6P0.A02.matcher(str);
                String str3 = null;
                for (int i = 0; matcher.find(i); i = matcher.end()) {
                    String group = matcher.group(1);
                    if (group != null) {
                        group = AnonymousClass0x9.A0z(group);
                    }
                    String group2 = matcher.group(2);
                    if (group != null) {
                        if (group.equals("streamurl")) {
                            str3 = group2;
                        } else if (group.equals("streamtitle")) {
                            str2 = group2;
                        }
                    }
                }
                r1 = new C187368x6[1];
                r0 = new C1688687b(str2, bArr, str3);
            }
            r1[0] = r0;
            return new C166547ys(r1);
        } else if (this instanceof C126696Oy) {
            C161467pi r02 = new C161467pi(byteBuffer2.array(), byteBuffer2.limit());
            String A0L = r02.A0L();
            A0L.getClass();
            String A0L2 = r02.A0L();
            A0L2.getClass();
            return new C166547ys(new C1689087f(A0L, A0L2, Arrays.copyOfRange(r02.A02, r02.A01, r02.A00), r02.A0I(), r02.A0I()));
        } else if (byteBuffer2.get() != 116) {
            return null;
        } else {
            C160807oL r10 = new C160807oL(byteBuffer2.array(), byteBuffer2.limit());
            r10.A09(12);
            int A04 = r10.A04(12);
            C161487pm.A04(AnonymousClass000.A1T(r10.A00));
            int i2 = (r10.A02 + A04) - 4;
            r10.A0A(C160807oL.A01(r10, 44, 12));
            r10.A09(16);
            ArrayList A0s = AnonymousClass001.A0s();
            while (true) {
                C161487pm.A04(AnonymousClass000.A1T(r10.A00));
                String str4 = null;
                if (r10.A02 >= i2) {
                    break;
                }
                r10.A09(48);
                int A042 = r10.A04(8);
                int A01 = C160807oL.A01(r10, 4, 12);
                C161487pm.A04(AnonymousClass000.A1T(r10.A00));
                int i3 = r10.A02 + A01;
                String str5 = null;
                while (true) {
                    C161487pm.A04(AnonymousClass000.A1T(r10.A00));
                    if (r10.A02 >= i3) {
                        break;
                    }
                    int A043 = r10.A04(8);
                    int A044 = r10.A04(8);
                    C161487pm.A04(AnonymousClass000.A1T(r10.A00));
                    int i4 = r10.A02 + A044;
                    if (A043 == 2) {
                        int A045 = r10.A04(16);
                        r10.A09(8);
                        if (A045 != 3) {
                        }
                        while (true) {
                            C161487pm.A04(AnonymousClass000.A1T(r10.A00));
                            if (r10.A02 >= i4) {
                                break;
                            }
                            int A046 = r10.A04(8);
                            Charset charset = AnonymousClass79T.A01;
                            byte[] bArr2 = new byte[A046];
                            r10.A0C(bArr2, A046);
                            str4 = new String(bArr2, charset);
                            int A047 = r10.A04(8);
                            for (int i5 = 0; i5 < A047; i5++) {
                                r10.A0A(r10.A04(8));
                            }
                        }
                    } else if (A043 == 21) {
                        Charset charset2 = AnonymousClass79T.A01;
                        byte[] bArr3 = new byte[A044];
                        r10.A0C(bArr3, A044);
                        str5 = new String(bArr3, charset2);
                    }
                    r10.A08(i4 * 8);
                }
                r10.A08(i3 * 8);
                if (!(str4 == null || str5 == null)) {
                    A0s.add(new AnonymousClass87Y(A042, AnonymousClass000.A0T(str4, str5)));
                }
            }
            if (!A0s.isEmpty()) {
                return new C166547ys((List) A0s);
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2.arrayOffset() != 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C166547ys B1G(X.AnonymousClass6OZ r4) {
        /*
            r3 = this;
            java.nio.ByteBuffer r2 = r4.A01
            r2.getClass()
            int r0 = r2.position()
            if (r0 != 0) goto L_0x0018
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto L_0x0018
            int r1 = r2.arrayOffset()
            r0 = 1
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            X.C161487pm.A03(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r4.flags
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 == 0) goto L_0x0029
            r0 = 0
            return r0
        L_0x0029:
            X.7ys r0 = r3.A06(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689287h.B1G(X.6OZ):X.7ys");
    }
}
