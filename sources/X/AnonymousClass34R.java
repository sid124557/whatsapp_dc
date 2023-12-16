package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.34R  reason: invalid class name */
public final class AnonymousClass34R {
    public static final boolean A06(String str) {
        int length;
        C162457s7.A0J(str, 0);
        if (!C175728Zm.A0S(str, "-", false) && (length = str.length()) >= 1 && length <= 20) {
            char charAt = str.charAt(0);
            if (C162457s7.A00(charAt, 49) >= 0 && C162457s7.A00(charAt, 57) <= 0) {
                int i = 1;
                while (i < length) {
                    char charAt2 = str.charAt(i);
                    if (C162457s7.A00(charAt2, 48) >= 0 && C162457s7.A00(charAt2, 57) <= 0) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final C27991fJ A03(Jid jid) {
        if (jid instanceof C27991fJ) {
            return (C27991fJ) jid;
        }
        return null;
    }

    public static C27991fJ A04(String str) {
        return C27991fJ.A01.A07(str);
    }

    public static C27991fJ A00(Jid jid) {
        C27991fJ A03 = A03(C627336j.A02(jid));
        C626936e.A06(A03);
        return A03;
    }

    public static C27991fJ A01(Jid jid) {
        return A03(jid);
    }

    public static C27991fJ A02(Jid jid) {
        C27991fJ A03 = A03(jid);
        C626936e.A06(A03);
        return A03;
    }

    public static final C27991fJ A05(String str) {
        C27991fJ r1;
        Jid A01 = AnonymousClass32W.A01(str);
        if ((A01 instanceof C27991fJ) && (r1 = (C27991fJ) A01) != null) {
            return r1;
        }
        throw AnonymousClass24P.A00(str);
    }

    public final C27991fJ A07(String str) {
        Object obj;
        try {
            obj = A05(str);
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
        if (obj instanceof AnonymousClass3Z0) {
            obj = null;
        }
        return (C27991fJ) obj;
    }
}
