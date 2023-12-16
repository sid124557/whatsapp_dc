package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.7Tq  reason: invalid class name and case insensitive filesystem */
public class C151157Tq {
    public final int A00;
    public final int A01;
    public final UserJid A02;
    public final String A03;
    public final Set A04;

    public C151157Tq(UserJid userJid, String str, Set set, int i, int i2) {
        this.A02 = userJid;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = set;
        this.A03 = str;
    }

    public String toString() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A02;
        A0M[1] = this.A04;
        return String.format("GetCategoriesRequest{bizJid=%s, categoryIds=%s'}", A0M);
    }
}
