package X;

/* renamed from: X.4kZ  reason: invalid class name and case insensitive filesystem */
public final class C91614kZ extends AnonymousClass5AU {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91614kZ) && this.A00 == ((C91614kZ) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C91614kZ(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(errorCode=");
        return C18260x0.A09(A0o, this.A00);
    }
}
