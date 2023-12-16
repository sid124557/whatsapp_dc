package X;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;

/* renamed from: X.74q  reason: invalid class name and case insensitive filesystem */
public class C1452174q {
    public static void A00(C171558Hn r14, byte[] bArr, boolean z) {
        Set set;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        short s = wrap.getShort();
        wrap.get(new byte[32]);
        byte[] bArr2 = new byte[((short) ((short) AnonymousClass6CA.A07(wrap)))];
        wrap.get(bArr2);
        short s2 = wrap.getShort();
        byte b = wrap.get();
        C158537k8 r6 = new C158537k8(C162257rX.A0C(wrap));
        AnonymousClass7SO A00 = r6.A00(43);
        if (A00 != null) {
            Set set2 = C155667fH.A01;
            byte[] bArr3 = A00.A01;
            if (set2.contains(Short.valueOf((short) C162257rX.A02(bArr3)))) {
                byte[] bArr4 = r14.A0n;
                if (bArr4 == null || C162257rX.A06(bArr3, bArr4)) {
                    if (z) {
                        set = C155667fH.A03;
                    } else {
                        set = C155667fH.A04;
                    }
                    HashSet A0s = C18310x6.A0s(r6.A03);
                    A0s.removeAll(set);
                    if (A0s.size() != 0) {
                        throw C143806zV.A01("Unexpected extension provided by the server", (byte) 47);
                    }
                    Short sh = C155667fH.A00;
                    if (s != 771) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18270x1.A19("Unexpected protocol version", " != ", A0o, s);
                        throw C143806zV.A01(AnonymousClass000.A0R(sh, A0o), (byte) 80);
                    } else if (C162257rX.A06(r14.A0l, bArr2)) {
                        short s3 = r14.A0V;
                        if (s3 != 0 && s3 != s2) {
                            throw C143806zV.A01("Cipher suite in server hello does not match HelloRetryRequest cipher suite.", (byte) 47);
                        } else if (s2 != 4865) {
                            throw C143806zV.A01("Server selected invalid cipher suite", (byte) 80);
                        } else if (b == 0) {
                            AnonymousClass7SO A002 = r6.A00(51);
                            if (A002 != null) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(A002.A01);
                                short s4 = wrap2.getShort();
                                if (s4 == 29) {
                                    if (!z) {
                                        byte[] bArr5 = new byte[2];
                                        wrap2.get(bArr5);
                                        int A02 = C162257rX.A02(bArr5);
                                        if (A02 == 32) {
                                            byte[] bArr6 = new byte[32];
                                            r14.A0m = bArr6;
                                            wrap2.get(bArr6);
                                        } else {
                                            StringBuilder A0o2 = AnonymousClass001.A0o();
                                            AnonymousClass6C7.A1J("Key length mismatch ", " != ", A0o2, A02, 32);
                                            throw C143806zV.A01(A0o2.toString(), (byte) 80);
                                        }
                                    }
                                    AnonymousClass7SO A003 = r6.A00(41);
                                    if (!(r14.A0C.A03 == null || A003 == null)) {
                                        if (C162257rX.A02(A003.A01) <= 0) {
                                            r14.A0b = true;
                                            r14.A0g = true;
                                        } else {
                                            throw C143806zV.A01(AnonymousClass000.A0P(A003, "Incorrect PSK index value chosen by server ", AnonymousClass001.A0o()), (byte) 80);
                                        }
                                    }
                                    if (z) {
                                        r14.A0n = bArr3;
                                        r14.A0V = s2;
                                        r14.A0W = s4;
                                        AnonymousClass7SO A004 = r6.A00(44);
                                        if (A004 != null) {
                                            r14.A0k = C162257rX.A0C(ByteBuffer.wrap(A004.A01));
                                        }
                                    }
                                    if (wrap.hasRemaining()) {
                                        throw C143806zV.A01("Server Hello has more bytes than expected.", (byte) 80);
                                    }
                                    return;
                                }
                                throw C143806zV.A01("Key share algorithm mismatch.", (byte) 80);
                            }
                            throw C143806zV.A01("Key share extension not found.", (byte) 109);
                        } else {
                            throw C143806zV.A01("Invalid compression method.0", (byte) 80);
                        }
                    } else {
                        throw C143806zV.A01("Bad session id", (byte) 80);
                    }
                } else {
                    throw C143806zV.A01("Supported version in server hello does not match HelloRetryRequest supported version.", (byte) 47);
                }
            } else {
                throw new C143806zV(new SSLException("Server sent an unsupported version."), (byte) 110);
            }
        } else {
            throw C143806zV.A01("Supported version extension not found.", (byte) 109);
        }
    }
}
