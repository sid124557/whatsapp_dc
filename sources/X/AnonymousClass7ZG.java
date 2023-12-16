package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.7ZG  reason: invalid class name */
public final class AnonymousClass7ZG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final UserJid A03;

    public AnonymousClass7ZG(UserJid userJid, int i, int i2, int i3) {
        C162457s7.A0J(userJid, 1);
        this.A03 = userJid;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZG) {
                AnonymousClass7ZG r5 = (AnonymousClass7ZG) obj;
                if (!(C162457s7.A0P(this.A03, r5.A03) && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C18300x5.A04(this.A03) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScreenShareEvent(jid=");
        A0o.append(this.A03);
        A0o.append(", state=");
        A0o.append(this.A02);
        A0o.append(", sharerVersion=");
        A0o.append(this.A01);
        A0o.append(", endReason=");
        return C18260x0.A09(A0o, this.A00);
    }
}
