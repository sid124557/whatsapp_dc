package X;

/* renamed from: X.91F  reason: invalid class name */
public class AnonymousClass91F implements C182018nj {
    public Object A00;
    public final int A01;

    public AnonymousClass91F(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final String BCg() {
        C166447yh r0;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            r0 = ((AnonymousClass4U5) obj).A0E();
            if (r0 == null) {
                return null;
            }
        } else {
            r0 = ((AnonymousClass4U8) obj).A0T;
        }
        return r0.A00;
    }
}
