package X;

/* renamed from: X.9oO  reason: invalid class name and case insensitive filesystem */
public class C203839oO extends AnonymousClass9SG {
    public Object A00;
    public Object A01;
    public final int A02;

    public C203839oO(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A00(Exception exc) {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            C195079Vu r1 = (C195079Vu) obj;
            r1.A0F = false;
            AnonymousClass9WT.A00();
            r1.A02((AnonymousClass9SQ) this.A01, exc);
            return;
        }
        ((AnonymousClass9ZR) obj).A0f = false;
        ((AnonymousClass9SG) this.A01).A00(exc);
    }

    public /* bridge */ /* synthetic */ void A01(Object obj) {
        if (this.A02 != 0) {
            ((C195079Vu) this.A00).A0F = false;
        } else {
            ((AnonymousClass9SG) this.A01).A01(obj);
        }
    }
}
