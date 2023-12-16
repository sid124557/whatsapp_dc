package X;

/* renamed from: X.8Gr  reason: invalid class name and case insensitive filesystem */
public class C171338Gr implements C184408rk {
    public final AnonymousClass5ZO A00;
    public final /* synthetic */ C112275jT A01;

    public C171338Gr(AnonymousClass5ZO r1, C112275jT r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BSO(AnonymousClass7T4 r2, int i) {
        C184198rP r0 = this.A01.A0C;
        if (r0 != null) {
            r0.BNv(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass5TI r4 = (AnonymousClass5TI) obj;
        C112275jT r2 = this.A01;
        if (r2.A0C != null) {
            AnonymousClass5ZO r1 = this.A00;
            if (r1 != null && r2.A0U.A01()) {
                AnonymousClass5ZZ.A03(r1, r4.A09);
            }
            r2.A0C.BNw(r4);
        }
    }
}
