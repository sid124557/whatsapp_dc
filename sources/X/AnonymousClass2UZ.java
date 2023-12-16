package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.2UZ  reason: invalid class name */
public final class AnonymousClass2UZ {
    public final C28001fK A00(C56972sr r4, String str) {
        C28001fK r1;
        C162457s7.A0J(str, 1);
        PhoneUserJid A05 = C56972sr.A05(r4);
        C162457s7.A0D(A05);
        StringBuilder A0o = AnonymousClass001.A0o();
        String str2 = A05.user;
        C626936e.A06(str2);
        A0o.append(str2);
        A0o.append('-');
        A0o.append(str);
        String A0X = AnonymousClass000.A0X("@temp", A0o);
        Jid A01 = AnonymousClass32W.A01(A0X);
        if ((A01 instanceof C28001fK) && (r1 = (C28001fK) A01) != null) {
            return r1;
        }
        throw AnonymousClass24P.A00(A0X);
    }
}
