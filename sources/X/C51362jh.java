package X;

/* renamed from: X.2jh  reason: invalid class name and case insensitive filesystem */
public final class C51362jh {
    public final AnonymousClass20R A00;
    public final AnonymousClass21C A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51362jh) {
                C51362jh r5 = (C51362jh) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
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

    public C51362jh(AnonymousClass20R r1, AnonymousClass21C r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AllowNonAdminSubgroupCreationUiState(permission=");
        A0o.append(this.A00);
        A0o.append(", requestStatus=");
        return C18260x0.A04(this.A01, A0o);
    }
}
