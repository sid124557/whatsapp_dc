package X;

/* renamed from: X.9V5  reason: invalid class name */
public class AnonymousClass9V5 {
    public static final AnonymousClass9N0 A01 = new AnonymousClass9N0(2);
    public static final AnonymousClass9N0 A02 = new AnonymousClass9N0(4);
    public static final AnonymousClass9N0 A03 = new AnonymousClass9N0(3);
    public static final AnonymousClass9N0 A04 = new AnonymousClass9N0(1);
    public boolean A00 = true;

    public Object A01(AnonymousClass9N0 r4) {
        boolean z;
        int i = r4.A00;
        if (i == 1) {
            return null;
        }
        if (i == 2 || i != 3) {
            z = false;
        } else {
            z = this.A00;
        }
        return Boolean.valueOf(z);
    }

    public static boolean A00(AnonymousClass9N0 r0, AnonymousClass9V5 r1) {
        Object A012 = r1.A01(r0);
        A012.getClass();
        return ((Boolean) A012).booleanValue();
    }
}
