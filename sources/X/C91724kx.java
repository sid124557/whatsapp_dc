package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4kx  reason: invalid class name and case insensitive filesystem */
public final class C91724kx extends AnonymousClass5AY {
    public final UserJid A00;
    public final AnonymousClass4GP A01;
    public final AnonymousClass4GQ A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C91724kx) {
                C91724kx r5 = (C91724kx) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A02, C18300x5.A04(this.A00)));
    }

    public C91724kx(UserJid userJid, AnonymousClass4GP r2, AnonymousClass4GQ r3) {
        this.A00 = userJid;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserConfirmationRequired(userJid=");
        A0o.append(this.A00);
        A0o.append(", onUserConfirmationGranted=");
        A0o.append(this.A02);
        A0o.append(", onUserConfirmationDenied=");
        return C18260x0.A04(this.A01, A0o);
    }
}
