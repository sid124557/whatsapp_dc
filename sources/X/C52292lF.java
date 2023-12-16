package X;

/* renamed from: X.2lF  reason: invalid class name and case insensitive filesystem */
public final class C52292lF {
    public final int A00;
    public final AnonymousClass8OQ A01;
    public final C129526aS A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52292lF) {
                C52292lF r5 = (C52292lF) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A01, this.A00 * 31));
    }

    public C52292lF(AnonymousClass8OQ r1, C129526aS r2, int i) {
        C18260x0.A0S(r1, r2);
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessContactSyncUpdateResult(usersModified=");
        A0o.append(this.A00);
        A0o.append(", sideListOldVnameMap=");
        A0o.append(this.A01);
        A0o.append(", userMightNeedPrivacySystemMessageUpdate=");
        return C18260x0.A04(this.A02, A0o);
    }
}
