package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4x6  reason: invalid class name and case insensitive filesystem */
public final class C96854x6 extends AnonymousClass5BN {
    public final UserJid A00;

    public C96854x6(UserJid userJid) {
        C162457s7.A0J(userJid, 1);
        this.A00 = userJid;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96854x6) && C162457s7.A0P(this.A00, ((C96854x6) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(user=");
        return C18260x0.A04(this.A00, A0o);
    }
}
