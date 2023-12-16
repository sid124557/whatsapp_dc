package X;

/* renamed from: X.2lT  reason: invalid class name and case insensitive filesystem */
public final class C52432lT {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52432lT) {
                C52432lT r5 = (C52432lT) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public C52432lT(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RollingPromptModel(previousIndex=");
        A0o.append(this.A01);
        A0o.append(", newIndex=");
        A0o.append(this.A00);
        A0o.append(", prompt=");
        return C18260x0.A09(A0o, this.A02);
    }
}
