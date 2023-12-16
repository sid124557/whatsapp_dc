package X;

import com.whatsapp.jid.UserJid;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: X.2ya  reason: invalid class name and case insensitive filesystem */
public final class C60452ya {
    public final C47922e3 A00;

    public static final boolean A00(byte b) {
        return b == 1 || b == 57 || b == 42 || b == 3 || b == 62 || b == 43 || b == 2 || b == 20 || b == 9 || b == 63 || b == 13;
    }

    public boolean A01(C624134x r3) {
        byte b = r3.A1I;
        if (b == 0 || b == 78 || A00(b)) {
            return true;
        }
        return false;
    }

    public byte[] A03(C624134x r8) {
        byte[] bArr;
        if ((r8 instanceof C30481mW) || (r8 instanceof C31931p6)) {
            String A13 = r8.A13();
            if (A13 == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            C162457s7.A0F(charset);
            return C18320x8.A1a(A13, charset);
        } else if (!(r8 instanceof C30471mV)) {
            return null;
        } else {
            byte b = r8.A1I;
            if (A00(b)) {
                C30471mV r82 = (C30471mV) r8;
                String str = r82.A03;
                if (str != null) {
                    bArr = AnonymousClass0x2.A1a(str);
                } else {
                    bArr = null;
                }
                String A1w = r82.A1w();
                if (A1w == null) {
                    return bArr;
                }
                if (bArr == null) {
                    return null;
                }
                byte[] A1a = AnonymousClass0x2.A1a(A1w);
                int length = bArr.length;
                int length2 = A1a.length;
                byte[] copyOf = Arrays.copyOf(bArr, length + length2);
                System.arraycopy(A1a, 0, copyOf, length, length2);
                C162457s7.A0H(copyOf);
                return copyOf;
            } else if (!A01(r8)) {
                return null;
            } else {
                this.A00.A01(AnonymousClass22M.A0I, String.valueOf(b));
                return null;
            }
        }
    }

    public C60452ya(C47922e3 r1) {
        this.A00 = r1;
    }

    public final byte[] A02(UserJid userJid, UserJid userJid2, C624134x r7, byte[] bArr) {
        if (A01(r7)) {
            byte[] A01 = C57632tx.A01(userJid, userJid2, "Report Token", AnonymousClass2z0.A06(r7), bArr);
            C162457s7.A0D(A01);
            byte[] A03 = A03(r7);
            if (A03 != null) {
                try {
                    byte[] A002 = C380825n.A00(A03, A01);
                    C162457s7.A0D(A002);
                    return AnonymousClass29O.A01(A002.length);
                } catch (Exception e) {
                    this.A00.A00(AnonymousClass22M.A0F, e, (String) null);
                    return null;
                }
            }
        }
        return null;
    }
}
