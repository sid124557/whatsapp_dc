package X;

import com.whatsapp.jid.UserJid;
import java.util.Comparator;
import java.util.Set;

/* renamed from: X.5sU  reason: invalid class name and case insensitive filesystem */
public class C117785sU implements Comparator {
    public Set A00;
    public final C117875sd A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C148337Hz r6 = (C148337Hz) obj;
        C148337Hz r7 = (C148337Hz) obj2;
        int i = r6.A00;
        if (i != 32) {
            int i2 = r7.A00;
            if (i2 == 32 || i == 4 || i == 8) {
                return -1;
            }
            if (!(i2 == 4 || i2 == 8)) {
                AnonymousClass3ZH r3 = (AnonymousClass3ZH) r6.A01;
                AnonymousClass3ZH r2 = (AnonymousClass3ZH) r7.A01;
                if (r3.A0U() == r2.A0U()) {
                    Set set = this.A00;
                    C626936e.A06(set);
                    Class<UserJid> cls = UserJid.class;
                    if (!C86644Kx.A1Y(r3, cls, set) || !C86644Kx.A1Y(r2, cls, this.A00)) {
                        if (C86644Kx.A1Y(r3, cls, this.A00)) {
                            return -1;
                        }
                        if (C86644Kx.A1Y(r2, cls, this.A00)) {
                            return 1;
                        }
                    }
                    return this.A01.compare(r3, r2);
                } else if (r3.A0U()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        return 1;
    }

    public C117785sU(C56972sr r2, AnonymousClass5ZU r3, int i) {
        this.A01 = new C117875sd(r2, r3, i);
    }
}
