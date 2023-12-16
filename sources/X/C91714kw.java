package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4kw  reason: invalid class name and case insensitive filesystem */
public final class C91714kw extends AnonymousClass5AY {
    public final UserJid A00;
    public final AnonymousClass4GP A01;
    public final AnonymousClass4GQ A02;

    public C91714kw(UserJid userJid, AnonymousClass4GP r3, AnonymousClass4GQ r4) {
        C162457s7.A0J(userJid, 1);
        this.A00 = userJid;
        this.A02 = r4;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C91714kw) {
                C91714kw r5 = (C91714kw) obj;
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

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OnRequestFailedErrorWithRetry(userJid=");
        A0o.append(this.A00);
        A0o.append(", onRetryRequested=");
        A0o.append(this.A02);
        A0o.append(", onErrorDismissed=");
        return C18260x0.A04(this.A01, A0o);
    }
}
