package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8FX  reason: invalid class name */
public final class AnonymousClass8FX implements C185658u2 {
    public final int A00;
    public final UserJid A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8FX) {
                AnonymousClass8FX r5 = (AnonymousClass8FX) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C117005rE B58() {
        return null;
    }

    public int B8k() {
        return 1;
    }

    public /* bridge */ /* synthetic */ C95814uZ B8o() {
        return this.A01;
    }

    public int BCW() {
        return this.A00;
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A01) + this.A00) * 31) + AnonymousClass000.A07(this.A02);
    }

    public AnonymousClass8FX(UserJid userJid, int i, List list) {
        this.A01 = userJid;
        this.A00 = i;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallsHistoryContactItem(userJid=");
        A0o.append(this.A01);
        A0o.append(", resultPosition=");
        A0o.append(this.A00);
        A0o.append(", terms=");
        return C18260x0.A04(this.A02, A0o);
    }
}
