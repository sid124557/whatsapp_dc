package X;

/* renamed from: X.2lA  reason: invalid class name and case insensitive filesystem */
public final class C52242lA {
    public boolean A00 = false;
    public boolean A01 = false;
    public boolean A02 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52242lA) {
                C52242lA r5 = (C52242lA) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A01), this.A00), this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IncomingCallNotificationState(dndModeEnabled=");
        A0o.append(this.A01);
        A0o.append(", callNotificationDisabled=");
        A0o.append(this.A00);
        A0o.append(", waAppNotificationDisabled=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
