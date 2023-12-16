package X;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: X.0XH  reason: invalid class name */
public final class AnonymousClass0XH {
    public static final AnonymousClass0XH A02;
    public static final AnonymousClass0XH A03;
    public static final C15770ru A04;
    public static final String A05 = Character.toString(8206);
    public static final String A06 = Character.toString(8207);
    public final C15770ru A00;
    public final boolean A01;

    static {
        C15770ru r2 = AnonymousClass0K7.A01;
        A04 = r2;
        A02 = new AnonymousClass0XH(r2, false);
        A03 = new AnonymousClass0XH(r2, true);
    }

    public CharSequence A03(C15770ru r7, CharSequence charSequence) {
        C15770ru r2;
        String str;
        C15770ru r22;
        String str2;
        if (charSequence == null) {
            return null;
        }
        boolean BIl = r7.BIl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (BIl) {
            r2 = AnonymousClass0K7.A05;
        } else {
            r2 = AnonymousClass0K7.A04;
        }
        boolean BIl2 = r2.BIl(charSequence, 0, charSequence.length());
        boolean z = this.A01;
        if (!z) {
            if (BIl2 || A00(charSequence) == 1) {
                str = A05;
            }
            str = "";
        } else {
            if (!BIl2 || A00(charSequence) == -1) {
                str = A06;
            }
            str = "";
        }
        spannableStringBuilder.append(str);
        if (BIl != z) {
            char c = 8234;
            if (BIl) {
                c = 8235;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (BIl) {
            r22 = AnonymousClass0K7.A05;
        } else {
            r22 = AnonymousClass0K7.A04;
        }
        boolean BIl3 = r22.BIl(charSequence, 0, charSequence.length());
        if (!z) {
            if (BIl3 || A01(charSequence) == 1) {
                str2 = A05;
            }
            str2 = "";
        } else {
            if (!BIl3 || A01(charSequence) == -1) {
                str2 = A06;
            }
            str2 = "";
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }

    public AnonymousClass0XH(C15770ru r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public static int A00(CharSequence charSequence) {
        int i;
        byte directionality;
        byte directionality2;
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i2 < length) {
                if (i3 == 0) {
                    char charAt = charSequence.charAt(i2);
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(charSequence, i2);
                        i2 += Character.charCount(codePointAt);
                        directionality2 = Character.getDirectionality(codePointAt);
                    } else {
                        i2++;
                        if (charAt < 1792) {
                            directionality2 = AnonymousClass0JX.A00[charAt];
                        } else {
                            directionality2 = Character.getDirectionality(charAt);
                        }
                    }
                    if (directionality2 != 0) {
                        if (directionality2 == 1 || directionality2 == 2) {
                            if (i5 == 0) {
                                return 1;
                            }
                        } else if (directionality2 != 9) {
                            switch (directionality2) {
                                case 14:
                                case 15:
                                    i5++;
                                    i4 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i5++;
                                    i4 = 1;
                                    continue;
                                case 18:
                                    i5--;
                                    i4 = 0;
                                    continue;
                            }
                        }
                    } else if (i5 == 0) {
                        return -1;
                    }
                    i3 = i5;
                }
            } else if (i3 == 0) {
                return 0;
            }
        }
        if (i4 != 0) {
            return i4;
        }
        while (i2 > 0) {
            int i6 = i2 - 1;
            char charAt2 = charSequence.charAt(i6);
            if (Character.isLowSurrogate(charAt2)) {
                int codePointBefore = Character.codePointBefore(charSequence, i2);
                i = i2 - Character.charCount(codePointBefore);
                directionality = Character.getDirectionality(codePointBefore);
            } else {
                i = i6;
                if (charAt2 < 1792) {
                    directionality = AnonymousClass0JX.A00[charAt2];
                } else {
                    directionality = Character.getDirectionality(charAt2);
                }
            }
            switch (directionality) {
                case 14:
                case 15:
                    if (i3 == i5) {
                        return -1;
                    }
                    break;
                case 16:
                case 17:
                    if (i3 == i5) {
                        return 1;
                    }
                    break;
                case 18:
                    i5++;
                    continue;
            }
            i5--;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r3 = r3 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.CharSequence r5) {
        /*
            int r4 = r5.length()
            r3 = 0
            r2 = 0
        L_0x0006:
            r0 = 0
            if (r4 <= 0) goto L_0x0055
            int r0 = r4 + -1
            char r1 = r5.charAt(r0)
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 == 0) goto L_0x0042
            int r1 = java.lang.Character.codePointBefore(r5, r4)
            int r0 = java.lang.Character.charCount(r1)
            int r4 = r4 - r0
            byte r1 = java.lang.Character.getDirectionality(r1)
        L_0x0022:
            if (r1 == 0) goto L_0x003b
            r0 = 1
            if (r1 == r0) goto L_0x0038
            r0 = 2
            if (r1 == r0) goto L_0x0038
            r0 = 9
            if (r1 == r0) goto L_0x0006
            switch(r1) {
                case 14: goto L_0x003e;
                case 15: goto L_0x003e;
                case 16: goto L_0x0052;
                case 17: goto L_0x0052;
                case 18: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            if (r2 != 0) goto L_0x0006
            r2 = r3
            goto L_0x0006
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x0038:
            if (r3 != 0) goto L_0x0031
            goto L_0x0054
        L_0x003b:
            if (r3 != 0) goto L_0x0031
            goto L_0x0040
        L_0x003e:
            if (r2 != r3) goto L_0x0056
        L_0x0040:
            r0 = -1
            return r0
        L_0x0042:
            int r4 = r4 + -1
            r0 = 1792(0x700, float:2.511E-42)
            if (r1 >= r0) goto L_0x004d
            byte[] r0 = X.AnonymousClass0JX.A00
            byte r1 = r0[r1]
            goto L_0x0022
        L_0x004d:
            byte r1 = java.lang.Character.getDirectionality(r1)
            goto L_0x0022
        L_0x0052:
            if (r2 != r3) goto L_0x0056
        L_0x0054:
            r0 = 1
        L_0x0055:
            return r0
        L_0x0056:
            int r3 = r3 + -1
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XH.A01(java.lang.CharSequence):int");
    }

    public static AnonymousClass0XH A02() {
        boolean A1T = AnonymousClass001.A1T(AnonymousClass0I0.A00(Locale.getDefault()));
        C15770ru r1 = A04;
        if (r1 != r1) {
            return new AnonymousClass0XH(r1, A1T);
        }
        if (A1T) {
            return A03;
        }
        return A02;
    }
}
