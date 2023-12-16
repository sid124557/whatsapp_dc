package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.9VB  reason: invalid class name */
public class AnonymousClass9VB {
    public C194149Rt A00;
    public AnonymousClass9V6 A01;
    public final C69263Wi A02;
    public final C29441ip A03;
    public final C54292oU A04;
    public final C40602Ha A05;
    public final C194089Rn A06;
    public final AnonymousClass9VU A07;
    public final C160757oG A08 = C160757oG.A00("PaymentPinHelper", "network", "COMMON");
    public final AnonymousClass9W3 A09;
    public final AnonymousClass9TR A0A;

    public static byte[] A00(Object... objArr) {
        int length = objArr.length;
        byte[][] bArr = new byte[length][];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            try {
                String str = objArr[i];
                if (str == null) {
                    bArr[i] = new byte[0];
                } else if (str instanceof Long) {
                    bArr[i] = String.valueOf(C18310x6.A0B(str)).getBytes(C58152un.A0B);
                } else if (str instanceof Integer) {
                    bArr[i] = String.valueOf(AnonymousClass001.A0K(str)).getBytes(C58152un.A0B);
                } else if (str instanceof byte[]) {
                    bArr[i] = str;
                } else if (str instanceof String) {
                    bArr[i] = str.getBytes(C58152un.A0B);
                } else {
                    throw AnonymousClass001.A0c(C160757oG.A01("PaymentPinHelper", "constructPayload: should only accept long, byte[], and String args"));
                }
                i2 += bArr[i].length;
                i++;
            } catch (UnsupportedEncodingException e) {
                C1899593h.A1Q("PaymentPinHelper", AnonymousClass000.A0P(e, " UTF-8 not supported: ", AnonymousClass001.A0o()));
                throw new Error(e);
            }
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        return bArr2;
    }

    public final void A01(C202689mQ r3, C202699mR r4, String str) {
        C67993Rl A012 = this.A07.A01(str, "PIN");
        if (A012 == null) {
            this.A00.A00(new C197009cJ(r3, r4), str);
        } else {
            r3.BaK(new C193849Qh(A012));
        }
    }

    public AnonymousClass9VB(C69263Wi r8, C56972sr r9, C29441ip r10, C56612sH r11, C54292oU r12, C40602Ha r13, AnonymousClass9U5 r14, C194089Rn r15, AnonymousClass9VU r16, AnonymousClass9W3 r17, AnonymousClass9TR r18) {
        this.A04 = r12;
        this.A02 = r8;
        this.A06 = r15;
        this.A0A = r18;
        this.A03 = r10;
        this.A05 = r13;
        this.A09 = r17;
        AnonymousClass9VU r5 = r16;
        this.A07 = r5;
        this.A01 = new AnonymousClass9V6(r9, r11, r14);
        this.A00 = new C194149Rt(r12.A00, r8, r13, r14, r5, "PIN");
    }
}
