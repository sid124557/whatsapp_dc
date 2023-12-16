package X;

/* renamed from: X.0d9  reason: invalid class name and case insensitive filesystem */
public class C07990d9 implements C15780rv {
    public static final C07990d9 A00 = new C07990d9();

    public int Aym(CharSequence charSequence, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            if (directionality == 0) {
                z = true;
            } else if (directionality == 1 || directionality == 2) {
                return 0;
            }
        }
        if (z) {
            return 1;
        }
        return 2;
    }
}
