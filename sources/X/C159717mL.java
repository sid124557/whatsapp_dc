package X;

import com.google.protobuf.UnsafeUtil;

/* renamed from: X.7mL  reason: invalid class name and case insensitive filesystem */
public final class C159717mL {
    public static final AnonymousClass7XY A00;

    static {
        AnonymousClass7XY r0;
        if (!UnsafeUtil.A04 || !UnsafeUtil.A05 || (C155397eo.A00 != null && !C155397eo.A01)) {
            r0 = new C130866cf();
        } else {
            r0 = new C130876cg();
        }
        A00 = r0;
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = charSequence.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i) >= 65536) {
                                i++;
                            } else {
                                throw new C143986zo(i, length2);
                            }
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UTF-8 length does not fit in int: ");
        A0o.append(((long) i2) + 4294967296L);
        throw C18310x6.A0d(A0o);
    }
}
