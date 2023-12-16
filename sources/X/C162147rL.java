package X;

import java.lang.reflect.Method;

/* renamed from: X.7rL  reason: invalid class name and case insensitive filesystem */
public final class C162147rL {
    public static final C162147rL A04 = new C162147rL(1, 1, "VZCBSIFJD", 2);
    public static final C162147rL A05 = new C162147rL(3, 3, "VZCBSIFJD", 4);
    public static final C162147rL A06 = new C162147rL(2, 2, "VZCBSIFJD", 3);
    public static final C162147rL A07 = new C162147rL(8, 8, "VZCBSIFJD", 9);
    public static final C162147rL A08 = new C162147rL(6, 6, "VZCBSIFJD", 7);
    public static final C162147rL A09 = new C162147rL(5, 5, "VZCBSIFJD", 6);
    public static final C162147rL A0A = new C162147rL(7, 7, "VZCBSIFJD", 8);
    public static final C162147rL A0B = new C162147rL(4, 4, "VZCBSIFJD", 5);
    public static final C162147rL A0C = new C162147rL(0, 0, "VZCBSIFJD", 1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public static int A00(String str) {
        int i = 1;
        char charAt = str.charAt(1);
        int i2 = 1;
        int i3 = 1;
        while (charAt != ')') {
            if (charAt == 'J' || charAt == 'D') {
                i2++;
                i3 += 2;
            } else {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i4 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    i4 = Math.max(i4, str.indexOf(59, i4) + 1);
                }
                i3++;
                i2 = i4;
            }
            charAt = str.charAt(i2);
        }
        char charAt2 = str.charAt(i2 + 1);
        if (charAt2 == 'V') {
            return i3 << 2;
        }
        if (charAt2 == 'J' || charAt2 == 'D') {
            i = 2;
        }
        return (i3 << 2) | i;
    }

    public static C162147rL[] A05(String str) {
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (str.charAt(i2) != ')') {
            while (str.charAt(i2) == '[') {
                i2++;
            }
            int i4 = i2 + 1;
            if (str.charAt(i2) == 'L') {
                i2 = Math.max(i4, str.indexOf(59, i4) + 1);
            } else {
                i2 = i4;
            }
            i3++;
        }
        C162147rL[] r4 = new C162147rL[i3];
        int i5 = 1;
        while (str.charAt(i5) != ')') {
            int i6 = i5;
            while (str.charAt(i6) == '[') {
                i6++;
            }
            int i7 = i6 + 1;
            if (str.charAt(i6) == 'L') {
                i7 = Math.max(i7, str.indexOf(59, i7) + 1);
            }
            r4[i] = A03(str, i5, i7);
            i++;
            i5 = i7;
        }
        return r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C162147rL) {
                C162147rL r8 = (C162147rL) obj;
                int i = this.A00;
                int i2 = 10;
                if (i == 12) {
                    i = 10;
                }
                int i3 = r8.A00;
                if (i3 != 12) {
                    i2 = i3;
                }
                if (i == i2) {
                    int i4 = this.A01;
                    int i5 = this.A02;
                    int i6 = r8.A01;
                    if (i5 - i4 == r8.A02 - i6) {
                        while (i4 < i5) {
                            if (this.A03.charAt(i4) == r8.A03.charAt(i6)) {
                                i4++;
                                i6++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public String A06() {
        String str;
        int i;
        int i2;
        int i3 = this.A00;
        if (i3 == 10) {
            str = this.A03;
            i = this.A01 - 1;
            i2 = this.A02 + 1;
        } else if (i3 == 12) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append('L');
            A0o.append(this.A03.substring(this.A01, this.A02));
            return AnonymousClass001.A0j(A0o, ';');
        } else {
            str = this.A03;
            i = this.A01;
            i2 = this.A02;
        }
        return str.substring(i, i2);
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = i;
        if (i == 12) {
            i2 = 10;
        }
        int i3 = i2 * 13;
        if (i >= 9) {
            int i4 = this.A02;
            for (int i5 = this.A01; i5 < i4; i5++) {
                i3 = (i3 + this.A03.charAt(i5)) * 17;
            }
        }
        return i3;
    }

    public C162147rL(int i, int i2, String str, int i3) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A02 = i3;
    }

    public static String A01(Method method) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('(');
        for (Class A042 : method.getParameterTypes()) {
            A04(A042, A0o);
        }
        A0o.append(')');
        A04(method.getReturnType(), A0o);
        return A0o.toString();
    }

    public static C162147rL A02(Class cls) {
        if (!cls.isPrimitive()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A04(cls, A0o);
            String obj = A0o.toString();
            return A03(obj, 0, obj.length());
        } else if (cls == Integer.TYPE) {
            return A09;
        } else {
            if (cls == Void.TYPE) {
                return A0C;
            }
            if (cls == Boolean.TYPE) {
                return A04;
            }
            if (cls == Byte.TYPE) {
                return A05;
            }
            if (cls == Character.TYPE) {
                return A06;
            }
            if (cls == Short.TYPE) {
                return A0B;
            }
            if (cls == Double.TYPE) {
                return A07;
            }
            if (cls == Float.TYPE) {
                return A08;
            }
            if (cls == Long.TYPE) {
                return A0A;
            }
            throw new AssertionError();
        }
    }

    public static C162147rL A03(String str, int i, int i2) {
        char charAt = str.charAt(i);
        int i3 = 11;
        if (charAt != '(') {
            if (charAt == 'F') {
                return A08;
            }
            if (charAt == 'L') {
                i++;
                i2--;
                i3 = 10;
            } else if (charAt == 'S') {
                return A0B;
            } else {
                if (charAt == 'V') {
                    return A0C;
                }
                if (charAt == 'I') {
                    return A09;
                }
                if (charAt == 'J') {
                    return A0A;
                }
                if (charAt == 'Z') {
                    return A04;
                }
                if (charAt != '[') {
                    switch (charAt) {
                        case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                            return A05;
                        case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                            return A06;
                        case 'D':
                            return A07;
                        default:
                            throw AnonymousClass6CA.A0N();
                    }
                } else {
                    i3 = 9;
                }
            }
        }
        return new C162147rL(i3, i, str, i2);
    }

    public static void A04(Class<?> cls, StringBuilder sb) {
        char c;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb.append('L');
            sb.append(cls.getName().replace('.', '/'));
            c = ';';
        } else if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else if (cls == Long.TYPE) {
            c = 'J';
        } else {
            throw new AssertionError();
        }
        sb.append(c);
    }

    public String toString() {
        return A06();
    }
}
