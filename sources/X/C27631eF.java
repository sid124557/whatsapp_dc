package X;

/* renamed from: X.1eF  reason: invalid class name and case insensitive filesystem */
public final class C27631eF extends AnonymousClass27J {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27631eF) && this.A00 == ((C27631eF) obj).A00);
    }

    public C27631eF(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StringError(stringResource=");
        return C18260x0.A09(A0o, this.A00);
    }
}
