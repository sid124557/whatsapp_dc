package X;

/* renamed from: X.7nW  reason: invalid class name and case insensitive filesystem */
public final class C160367nW {
    public static final C160367nW A02 = new C160367nW(new C146747Bl(false), 4);
    public static final C160367nW A03 = new C160367nW(new C146747Bl(false), 5);
    public final int A00;
    public final C146747Bl A01;

    public boolean A00() {
        int i = this.A00;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public boolean A01() {
        int i = this.A00;
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public C160367nW(C146747Bl r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }
}
