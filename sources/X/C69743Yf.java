package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.3Yf  reason: invalid class name and case insensitive filesystem */
public final class C69743Yf implements AnonymousClass4GO {
    public static AnonymousClass2JB A00() {
        if (AnonymousClass2JB.A01 == null) {
            synchronized (AnonymousClass2JB.class) {
                if (AnonymousClass2JB.A01 == null) {
                    AnonymousClass2JB.A01 = new AnonymousClass2JB(JniBridge.getInstance());
                }
            }
        }
        AnonymousClass2JB r0 = AnonymousClass2JB.A01;
        C615931l.A00(r0);
        return r0;
    }
}
