package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2tx  reason: invalid class name and case insensitive filesystem */
public final class C57632tx {
    public static boolean A00(C624134x r1) {
        if (!r1.A1p() || (r1 instanceof C30351mJ)) {
            return false;
        }
        return true;
    }

    public static byte[] A01(UserJid userJid, UserJid userJid2, String str, String str2, byte[] bArr) {
        StringBuilder A0l = AnonymousClass000.A0l(str2);
        C18280x3.A0u(userJid, A0l);
        return AnonymousClass31Q.A00(bArr, AnonymousClass000.A0V(userJid2.getRawString(), str, A0l).getBytes(AnonymousClass79X.A05), 32);
    }
}
