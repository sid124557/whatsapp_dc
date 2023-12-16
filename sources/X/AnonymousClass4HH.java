package X;

/* renamed from: X.4HH  reason: invalid class name */
public class AnonymousClass4HH extends C117875sd {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HH(C56972sr r2, AnonymousClass5ZU r3, Object obj, int i) {
        super(r2, r3, 1);
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((AnonymousClass3ZH) obj, (AnonymousClass3ZH) obj2);
    }

    public int A01(AnonymousClass3ZH r2, AnonymousClass3ZH r3) {
        if (r2.A0J() == null && r3.A0J() != null) {
            return 1;
        }
        if (r2.A0J() == null || r3.A0J() != null) {
            return super.compare(r2, r3);
        }
        return -1;
    }
}
