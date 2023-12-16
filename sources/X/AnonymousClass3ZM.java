package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.3ZM  reason: invalid class name */
public final class AnonymousClass3ZM implements Comparable {
    public final C95814uZ A00;
    public final String A01;

    public AnonymousClass3ZM(C95814uZ r2, String str) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3ZM) {
                AnonymousClass3ZM r5 = (AnonymousClass3ZM) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass3ZM r3 = (AnonymousClass3ZM) obj;
        C162457s7.A0J(r3, 0);
        return this.A00.compareTo((Jid) r3.A00);
    }

    public int hashCode() {
        return C18300x5.A04(this.A00) + C18270x1.A00(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Mention(jid=");
        A0o.append(this.A00);
        A0o.append(", displayName=");
        return C18260x0.A07(this.A01, A0o);
    }
}
