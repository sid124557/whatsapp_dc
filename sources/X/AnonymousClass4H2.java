package X;

/* renamed from: X.4H2  reason: invalid class name */
public class AnonymousClass4H2 extends C04640Qa {
    public Object A00;
    public final int A01;

    public AnonymousClass4H2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A05() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C89654ea r2 = (C89654ea) obj;
            C69263Wi.A03(r2.A05, r2, 39);
            return;
        }
        AnonymousClass5WH r22 = (AnonymousClass5WH) obj;
        r22.A01.A0a(0);
        r22.A05.A01.unregisterObserver(this);
    }
}
