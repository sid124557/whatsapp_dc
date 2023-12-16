package X;

/* renamed from: X.7ps  reason: invalid class name and case insensitive filesystem */
public class C161537ps implements C183258pk {
    public final int A00;

    public C161537ps(int i) {
        this.A00 = i;
    }

    public final Object Ax8(Object obj, Object obj2) {
        if (this.A00 == 0) {
            C152567Zj r2 = (C152567Zj) obj;
            C152107Xo r3 = (C152107Xo) obj2;
            C162457s7.A0H(r2);
            C162457s7.A0H(r3);
            return new C153237au(r2, r3);
        } else if (obj == null) {
            throw AnonymousClass001.A0c("Required value was null.");
        } else if (obj2 != null) {
            return AnonymousClass3Z6.A02(obj, obj2);
        } else {
            throw AnonymousClass001.A0c("Required value was null.");
        }
    }
}
