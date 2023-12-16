package X;

/* renamed from: X.2uC  reason: invalid class name and case insensitive filesystem */
public class C57782uC {
    public static C174218Tk A00 = new C174218Tk(16);

    public static C66513Ls A00(String str) {
        C66513Ls r0;
        C174218Tk r1 = A00;
        synchronized (r1) {
            if (str == null) {
                r0 = null;
            } else {
                r0 = (C66513Ls) r1.get(str);
            }
        }
        return r0;
    }
}
