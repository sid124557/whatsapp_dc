package X;

/* renamed from: X.4Ki  reason: invalid class name and case insensitive filesystem */
public class C86494Ki implements AnonymousClass49N {
    public Object A00;
    public final int A01;

    public C86494Ki(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRw(boolean z, Object obj, Object obj2, Object obj3) {
        Object obj4;
        if (this.A01 != 0) {
            ((C33151sW) this.A00).A06().execute(new C69993Zl(obj2, 35));
            return;
        }
        AnonymousClass49N r2 = (AnonymousClass49N) this.A00;
        C41282Jq r7 = (C41282Jq) obj3;
        Object obj5 = ((C41282Jq) obj2).A01;
        if (r7 == null) {
            obj4 = null;
        } else {
            obj4 = r7.A01;
        }
        r2.BRw(z, obj, obj5, obj4);
    }
}
