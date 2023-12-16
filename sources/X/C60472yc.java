package X;

/* renamed from: X.2yc  reason: invalid class name and case insensitive filesystem */
public final class C60472yc {
    public static final C44012Ui A01 = new C44012Ui();
    public final Object A00;

    public boolean equals(Object obj) {
        Object obj2 = this.A00;
        if (!(obj instanceof C60472yc) || !C162457s7.A0P(obj2, ((C60472yc) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public String toString() {
        Object obj = this.A00;
        if (obj instanceof C831746k) {
            return obj.toString();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Value(");
        return C18260x0.A04(obj, A0o);
    }

    public /* synthetic */ C60472yc(Object obj) {
        this.A00 = obj;
    }
}
