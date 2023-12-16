package X;

/* renamed from: X.4JD  reason: invalid class name */
public class AnonymousClass4JD implements C84344Bz {
    public Object A00;
    public final int A01;

    public AnonymousClass4JD(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onError(int i) {
        switch (this.A01) {
            case 0:
                ((C45722aT) this.A00).A00(i, (Integer) null);
                return;
            case 1:
                ((AnonymousClass4GR) this.A00).invoke(Integer.valueOf(i), (Object) null);
                return;
            case 2:
                ((C45732aU) this.A00).A00(i, (Integer) null);
                return;
            default:
                ((C46242bJ) this.A00).A00(i, (Integer) null);
                return;
        }
    }
}
