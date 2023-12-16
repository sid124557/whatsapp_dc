package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.31S  reason: invalid class name */
public class AnonymousClass31S {
    public static C54562ov A00(C52122kv r4) {
        int A02;
        UserJid A08 = AnonymousClass32Y.A08(r4.A01);
        C626936e.A06(A08);
        String str = A08.user;
        if (A08 instanceof C27981fH) {
            A02 = 1;
        } else {
            A02 = C18310x6.A02(A08 instanceof C135146kC ? 1 : 0);
        }
        return new C54562ov(str, A02, r4.A00);
    }

    public static String A01(C54562ov r3) {
        String str;
        int i = r3.A01;
        if (i == 1) {
            str = "lid";
        } else if (i != 2) {
            str = "s.whatsapp.net";
        } else {
            str = "interop";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r3.A02);
        return AnonymousClass0x2.A0e(str, A0o, '@');
    }

    public static C48822fX A02(C54422oh r3) {
        C54562ov r0 = r3.A00;
        return new C48822fX(r3.A01, new C52122kv(A01(r0), r0.A00));
    }
}
