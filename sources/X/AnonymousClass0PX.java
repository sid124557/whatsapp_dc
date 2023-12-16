package X;

/* renamed from: X.0PX  reason: invalid class name */
public final class AnonymousClass0PX {
    public final int A00;
    public final int A01;
    public final String A02;

    public AnonymousClass0PX(String str, int i, int i2) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0PX) {
                AnonymousClass0PX r5 = (AnonymousClass0PX) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SystemIdInfo(workSpecId=");
        A0o.append(this.A02);
        A0o.append(", generation=");
        A0o.append(this.A00);
        A0o.append(", systemId=");
        A0o.append(this.A01);
        return AnonymousClass000.A0c(A0o);
    }
}
