package X;

/* renamed from: X.1NM  reason: invalid class name */
public final class AnonymousClass1NM extends AnonymousClass2FD {
    public final AnonymousClass20Q A00;
    public final C30461mU A01;
    public final C372421m A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1NM) {
                AnonymousClass1NM r5 = (AnonymousClass1NM) obj;
                if (!(C162457s7.A0P(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)) + AnonymousClass000.A07(this.A02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1NM(AnonymousClass20Q r2, C30461mU r3, C372421m r4) {
        super(C370120p.EVENT);
        C18260x0.A0Q(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EventItem(message=");
        A0o.append(this.A01);
        A0o.append(", eventType=");
        A0o.append(this.A00);
        A0o.append(", responseStatus=");
        return C18260x0.A04(this.A02, A0o);
    }
}
