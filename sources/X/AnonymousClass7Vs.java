package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.7Vs  reason: invalid class name */
public class AnonymousClass7Vs {
    public final UserJid A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass7Vs r5 = (AnonymousClass7Vs) obj;
            if (this.A01 != r5.A01 || !AnonymousClass75J.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass7Vs(UserJid userJid, boolean z) {
        this.A01 = z;
        this.A00 = userJid;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A00;
        AnonymousClass000.A1R(A0M, this.A01);
        return Arrays.hashCode(A0M);
    }
}
