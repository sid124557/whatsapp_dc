package X;

/* renamed from: X.4ZM  reason: invalid class name */
public class AnonymousClass4ZM extends C012009o {
    public final C71893cq A00;

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        AnonymousClass7HP r4 = (AnonymousClass7HP) obj;
        AnonymousClass7HP r5 = (AnonymousClass7HP) obj2;
        int i = r4.A00;
        if (i != r5.A00) {
            return false;
        }
        if (i == 1) {
            return ((C52882mC) r4.A01).A02.equals(((C52882mC) r5.A01).A02);
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        AnonymousClass7HP r4 = (AnonymousClass7HP) obj;
        AnonymousClass7HP r5 = (AnonymousClass7HP) obj2;
        int i = r4.A00;
        if (i != r5.A00) {
            return false;
        }
        if (i == 1) {
            return ((C52882mC) r4.A01).A02.equals(((C52882mC) r5.A01).A02);
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass7HP r4 = (AnonymousClass7HP) obj;
        AnonymousClass7HP r5 = (AnonymousClass7HP) obj2;
        int i = r4.A00;
        int i2 = r5.A00;
        if (i != i2) {
            return i - i2;
        }
        if (i != 1) {
            return 0;
        }
        return this.A00.compare((C52882mC) r4.A01, (C52882mC) r5.A01);
    }

    public AnonymousClass4ZM(AnonymousClass0R6 r2, C56982ss r3) {
        super(r2);
        this.A00 = new C71893cq(r3);
    }
}
