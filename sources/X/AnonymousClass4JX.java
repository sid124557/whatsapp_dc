package X;

/* renamed from: X.4JX  reason: invalid class name */
public class AnonymousClass4JX implements C83994Ap {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4JX(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void Bjl(String str) {
        if (this.A02 != 0) {
            C53852nm r1 = (C53852nm) this.A01;
            synchronized (r1) {
                AnonymousClass360.A00(r1.A07).remove(str);
            }
            C83994Ap r0 = (C83994Ap) this.A00;
            if (r0 != null) {
                r0.Bjl(str);
                return;
            }
            return;
        }
        ((AnonymousClass2T6) this.A01).A04.A00((C624134x) this.A00);
    }
}
