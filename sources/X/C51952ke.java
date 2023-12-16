package X;

/* renamed from: X.2ke  reason: invalid class name and case insensitive filesystem */
public final class C51952ke {
    public final C166557yt A00;
    public final C166557yt A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51952ke) {
                C51952ke r5 = (C51952ke) obj;
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

    public C51952ke(C166557yt r1, C166557yt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarUserBackup(fbId=");
        A0o.append(this.A00);
        A0o.append(", password=");
        return C18260x0.A04(this.A01, A0o);
    }
}
