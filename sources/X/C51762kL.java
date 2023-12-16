package X;

/* renamed from: X.2kL  reason: invalid class name and case insensitive filesystem */
public class C51762kL {
    public final Object A00;
    public final Object A01;

    public Object A00() {
        if (this instanceof C27871eo) {
            return ((C27871eo) this).A00;
        }
        return this.A00;
    }

    public Object A01() {
        if (this instanceof C27871eo) {
            return ((C27871eo) this).A01;
        }
        return this.A01;
    }

    public C51762kL(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GraphQlResult(data=");
        A0o.append(A00());
        A0o.append(", errors=");
        return C18260x0.A04(A01(), A0o);
    }
}
