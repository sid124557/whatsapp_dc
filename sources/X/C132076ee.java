package X;

/* renamed from: X.6ee  reason: invalid class name and case insensitive filesystem */
public final class C132076ee extends C132086ef {
    public final Integer A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132076ee) {
                C132076ee r5 = (C132076ee) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x9.A04(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public C132076ee(Integer num, boolean z) {
        this.A01 = z;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Loading(isSelected=");
        A0o.append(this.A01);
        A0o.append(", ringColor=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C132076ee() {
        this((Integer) null, false);
    }
}
