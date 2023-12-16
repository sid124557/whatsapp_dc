package X;

/* renamed from: X.7dz  reason: invalid class name and case insensitive filesystem */
public final class C154937dz {
    public static final AnonymousClass7XU A00;

    static {
        AnonymousClass7XU r0;
        if (!C162367ro.A06 || !C162367ro.A05 || C155367ek.A00()) {
            r0 = new AnonymousClass6YH();
        } else {
            r0 = new AnonymousClass6YI();
        }
        A00 = r0;
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C143976zn(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw AnonymousClass6C7.A0V("UTF-8 length does not fit in int: ", AnonymousClass6CA.A0Y(54), ((long) i3) + 4294967296L);
    }
}
