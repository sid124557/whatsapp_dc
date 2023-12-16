package X;

/* renamed from: X.1eG  reason: invalid class name and case insensitive filesystem */
public final class C27641eG extends AnonymousClass27J {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27641eG) {
                C27641eG r5 = (C27641eG) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C27641eG(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LinkExistingSubgroupsPartialSuccessResult(totalCount=");
        A0o.append(this.A01);
        A0o.append(", successCount=");
        return C18260x0.A09(A0o, this.A00);
    }
}
