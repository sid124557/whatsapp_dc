package X;

/* renamed from: X.5XS  reason: invalid class name */
public final class AnonymousClass5XS {
    public int A00;
    public int A01;
    public AnonymousClass5XY A02;

    public /* synthetic */ AnonymousClass5XS(AnonymousClass5XY r9, C378924l r10, int i, int i2, int i3) {
        AnonymousClass5XY r0 = new AnonymousClass5XY("", 0, 0, 0, false, false);
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = r0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5XS) {
                AnonymousClass5XS r5 = (AnonymousClass5XS) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && C162457s7.A0P(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupTrustSignalData(commonGroupSize=");
        A0o.append(this.A00);
        A0o.append(", highlightGroupType=");
        A0o.append(this.A01);
        A0o.append(", info=");
        return C18260x0.A04(this.A02, A0o);
    }

    public AnonymousClass5XS() {
        this((AnonymousClass5XY) null, (C378924l) null, 0, 0, 7);
    }
}
