package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5ON  reason: invalid class name */
public class AnonymousClass5ON {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C56982ss A02;
    public final C56892sj A03;
    public final C56152rV A04;
    public final C56662sM A05;

    public final Map A00(AnonymousClass3ZH r10) {
        Object obj;
        UserJid userJid;
        C27981fH A012;
        C95814uZ r8 = r10.A0H;
        if (!(r8 instanceof PhoneUserJid) ? !(!C627336j.A0L(r8) || (obj = this.A05.A02((C27981fH) r8)) == null) : (obj = (UserJid) r8) != null) {
            C56972sr r7 = this.A00;
            AnonymousClass1RR A013 = C56972sr.A01(r7);
            if (!(A013 == null || (userJid = (UserJid) A013.A0H) == null)) {
                HashSet A0K = AnonymousClass002.A0K();
                C56892sj r5 = this.A03;
                C620533h r6 = r5.A09;
                A0K.addAll(r6.A09(userJid, Collections.singleton(obj), -1).keySet());
                HashSet A0K2 = AnonymousClass002.A0K();
                if ((obj instanceof PhoneUserJid) && (A012 = this.A05.A01((PhoneUserJid) obj)) != null) {
                    Iterator A11 = C18290x4.A11(r6.A09(r7.A0H(), Collections.singleton(A012), -1));
                    while (A11.hasNext()) {
                        C95814uZ A0P = C18300x5.A0P(A11);
                        if (r5.A0B(A0P)) {
                            A0K2.add(A0P);
                        }
                    }
                }
                A0K.addAll(A0K2);
                return this.A01.A0I(A0K);
            }
        }
        return Collections.emptyMap();
    }

    public AnonymousClass5ON(C56972sr r1, C64773Ex r2, C56982ss r3, C56892sj r4, C56152rV r5, C56662sM r6) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
    }
}
