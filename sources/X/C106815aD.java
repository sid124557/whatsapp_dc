package X;

import android.os.Build;
import com.whatsapp.emoji.EmojiDescriptor;

/* renamed from: X.5aD  reason: invalid class name and case insensitive filesystem */
public abstract class C106815aD {
    public static int A00(CharSequence charSequence) {
        C94284qs r8 = new C94284qs(charSequence);
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            r8.A00 = i;
            long A00 = EmojiDescriptor.A00(r8, false);
            if (A00 != -1) {
                i += r8.A03(i, A00);
                i2++;
                if (i2 > 3) {
                }
            }
            return 0;
        }
        return i2;
    }

    public static String A02(CharSequence charSequence) {
        int A00;
        if (charSequence == null) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C94284qs r4 = new C94284qs(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            r4.A00 = i;
            long A0N = C86664Kz.A0N(r4);
            int A02 = r4.A02(i, A0N);
            if (A0N != -1) {
                if (((int) (A0N & 15)) == 1) {
                    r4.A00 = i;
                    do {
                        A00 = r4.A00();
                    } while (A00 == 65039);
                    A0o.append(Character.toChars(A00));
                } else if (Build.VERSION.SDK_INT < 23) {
                    A0o.append(9633);
                }
                i += A02;
            }
            A0o.append(charSequence.subSequence(i, i + A02));
            i += A02;
        }
        return A0o.toString();
    }

    public static String A04(String str, int i) {
        C94284qs r8 = new C94284qs(str);
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length() && i3 < i) {
            r8.A00 = i2;
            long A00 = EmojiDescriptor.A00(r8, false);
            if (A00 != -1) {
                i3++;
            }
            i2 += r8.A02(i2, A00);
        }
        return str.substring(0, i2);
    }

    public static CharSequence A01(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        C94284qs r4 = new C94284qs(charSequence);
        int i4 = 0;
        int i5 = i;
        while (i5 < i2) {
            r4.A00 = i5;
            i5 += r4.A02(i5, C86664Kz.A0N(r4));
            i4++;
            if (i4 >= i3) {
                return charSequence.subSequence(i, i5);
            }
        }
        return null;
    }

    public static String A03(CharSequence charSequence) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C94284qs r10 = new C94284qs(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            r10.A00 = i;
            long A0N = C86664Kz.A0N(r10);
            int A02 = r10.A02(i, A0N);
            if (A0N != -1) {
                for (int i2 = 0; i2 < ((int) (A0N & 15)); i2++) {
                    A0o.append(' ');
                }
            } else {
                A0o.append(charSequence.subSequence(i, i + A02));
            }
            i += A02;
        }
        return A0o.toString();
    }
}
