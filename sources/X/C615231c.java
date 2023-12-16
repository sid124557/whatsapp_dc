package X;

import com.whatsapp.util.Log;

/* renamed from: X.31c  reason: invalid class name and case insensitive filesystem */
public final class C615231c {
    public static byte[] A02(C25811b7 r4, AnonymousClass1gS r5, byte[] bArr) {
        int length;
        String str;
        if (bArr == null || (length = bArr.length) == 0) {
            Log.w("MessageUtil/removePadding/ axolotl derived null or empty plaintext from message");
            return null;
        }
        byte b = bArr[length - 1] & 255;
        if (b == 0) {
            str = "MessageUtil/removePadding/ axolotl derived plaintext has invalid padding";
        } else if (b < length) {
            return C18320x8.A1Z(bArr, length - b);
        } else {
            str = "MessageUtil/removePadding/ axolotl derived entire plaintext as padding";
        }
        Log.w(str);
        A01(r4, r5, 10);
        return null;
    }

    public static AnonymousClass1EU A00(AnonymousClass1EU r2) {
        if (!AnonymousClass000.A1S(r2.bitField0_ & 33554432)) {
            return r2;
        }
        AnonymousClass1C1 r0 = r2.deviceSentMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1C1.DEFAULT_INSTANCE;
        }
        AnonymousClass1EU r22 = r0.message_;
        if (r22 == null) {
            return AnonymousClass1EU.DEFAULT_INSTANCE;
        }
        return r22;
    }

    public static void A01(C25811b7 r1, AnonymousClass1gS r2, int i) {
        if (r2 != null) {
            r2.A02 = false;
        }
        if (r1 != null) {
            r1.A00 = Boolean.FALSE;
            r1.A07 = Integer.valueOf(i);
        }
    }
}
