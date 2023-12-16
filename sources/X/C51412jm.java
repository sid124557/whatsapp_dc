package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2jm  reason: invalid class name and case insensitive filesystem */
public final class C51412jm {
    public final GroupJid A00;
    public final AnonymousClass4GP A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51412jm) {
                C51412jm r5 = (C51412jm) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C51412jm(GroupJid groupJid, AnonymousClass4GP r2) {
        C18260x0.A0Q(groupJid, r2);
        this.A00 = groupJid;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InviteRowUiState(parentJid=");
        A0o.append(this.A00);
        A0o.append(", onRemove=");
        return C18260x0.A04(this.A01, A0o);
    }
}
