package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.27Y  reason: invalid class name */
public final class AnonymousClass27Y {
    public static final AnonymousClass1fI A00(String str) {
        Object obj;
        try {
            Jid A01 = AnonymousClass32W.A01(str);
            if (!(A01 instanceof AnonymousClass1fI) || (obj = (AnonymousClass1fI) A01) == null) {
                throw AnonymousClass24P.A00(str);
            }
            if (obj instanceof AnonymousClass3Z0) {
                obj = null;
            }
            return (AnonymousClass1fI) obj;
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
    }
}
