package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1fL  reason: invalid class name and case insensitive filesystem */
public abstract class C28011fL extends C95814uZ {
    public static final C28011fL A01(String str) {
        Object obj;
        try {
            Jid A01 = AnonymousClass32W.A01(str);
            if (!(A01 instanceof C28011fL) || (obj = (C28011fL) A01) == null) {
                throw AnonymousClass24P.A00(str);
            }
            if (obj instanceof AnonymousClass3Z0) {
                obj = null;
            }
            return (C28011fL) obj;
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
    }

    public C28011fL(String str) {
        super(str);
    }
}
