package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.31g  reason: invalid class name and case insensitive filesystem */
public class C615431g {
    public static boolean A01(AnonymousClass1VX r3, C69183Wa r4) {
        int A00 = r4.A08.A00("20210210");
        if (!r3.A0Y(C58422vE.A02, 791) || A00 != 2) {
            return false;
        }
        return true;
    }

    public static boolean A00(C56422rx r2, AnonymousClass1VX r3, AnonymousClass3LP r4, UserJid userJid, C69183Wa r6) {
        if (!A01(r3, r6) || userJid == null) {
            return false;
        }
        return C615031a.A00(r2, r4, userJid);
    }
}
