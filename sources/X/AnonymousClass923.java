package X;

/* renamed from: X.923  reason: invalid class name */
public class AnonymousClass923 implements C15630rg {
    public final int A00;

    public AnonymousClass923(int i) {
        this.A00 = i;
    }

    public final Object apply(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                return Boolean.valueOf(AnonymousClass000.A1W(obj));
            case 1:
                i = ((C106025Xi) obj).A00;
                break;
            case 2:
                i = ((C106025Xi) obj).A00();
                break;
            case 3:
                return new C152107Xo(((AnonymousClass5XX) obj).A04);
            default:
                return obj;
        }
        return Integer.valueOf(i);
    }
}
