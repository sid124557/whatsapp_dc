package X;

/* renamed from: X.0dA  reason: invalid class name and case insensitive filesystem */
public class C08000dA implements C15780rv {
    public static final C08000dA A00 = new C08000dA();

    public int Aym(CharSequence charSequence, int i, int i2) {
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            i3 = 1;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i3 = 2;
                            continue;
                    }
                }
                i3 = 0;
            }
        }
        return i3;
    }
}
