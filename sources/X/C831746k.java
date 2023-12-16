package X;

/* renamed from: X.46k  reason: invalid class name and case insensitive filesystem */
public final class C831746k extends C44012Ui {
    public final Throwable A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C831746k) || !C162457s7.A0P(this.A00, ((C831746k) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18280x3.A04(this.A00);
    }

    public C831746k(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Closed(");
        return C18260x0.A04(this.A00, A0o);
    }
}
