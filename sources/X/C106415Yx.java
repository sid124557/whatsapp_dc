package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.5Yx  reason: invalid class name and case insensitive filesystem */
public final class C106415Yx {
    public static final C95804uY A00(String str) {
        C95804uY r1;
        Jid A01 = AnonymousClass32W.A01(str);
        if ((A01 instanceof C95804uY) && (r1 = (C95804uY) A01) != null) {
            return r1;
        }
        throw new AnonymousClass24P(str);
    }

    public final C95804uY A01(String str) {
        Object obj;
        try {
            obj = A00(str);
        } catch (Throwable th) {
            obj = new AnonymousClass3Z0(th);
        }
        if (obj instanceof AnonymousClass3Z0) {
            obj = null;
        }
        return (C95804uY) obj;
    }
}
