package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.34O  reason: invalid class name */
public final class AnonymousClass34O {
    public static final List A00;
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final List A05;
    public static final List A06;
    public static final List A07;
    public static final Map A08;
    public static final Map A09;

    static {
        List A12 = C18290x4.A12(1);
        A07 = A12;
        Integer[] numArr = new Integer[3];
        numArr[0] = 100;
        numArr[1] = 150;
        List A19 = AnonymousClass0x9.A19(999, numArr, 2);
        A05 = A19;
        Integer[] numArr2 = new Integer[4];
        numArr2[0] = 110;
        numArr2[1] = 120;
        numArr2[2] = 150;
        List A192 = AnonymousClass0x9.A19(999, numArr2, 3);
        A06 = A192;
        Integer[] numArr3 = new Integer[5];
        numArr3[0] = 120;
        numArr3[1] = 130;
        numArr3[2] = 150;
        numArr3[3] = 170;
        List A193 = AnonymousClass0x9.A19(999, numArr3, 4);
        A01 = A193;
        ArrayList A0c = C73783g4.A0c(A193);
        boolean z = false;
        for (Object next : A193) {
            if (z || !C162457s7.A0P(next, 120)) {
                A0c.add(next);
            } else {
                z = true;
            }
        }
        A00 = A0c;
        Integer[] numArr4 = new Integer[3];
        numArr4[0] = 170;
        numArr4[1] = 150;
        List A194 = AnonymousClass0x9.A19(999, numArr4, 2);
        A04 = A194;
        Integer[] numArr5 = new Integer[2];
        numArr5[0] = 170;
        List A195 = AnonymousClass0x9.A19(999, numArr5, 1);
        A02 = A195;
        List A122 = C18290x4.A12(999);
        A03 = A122;
        AnonymousClass3Z6[] r15 = new AnonymousClass3Z6[2];
        AnonymousClass3Z6.A09((Object) null, A12, r15, 0);
        AnonymousClass3Z6.A09(1, A19, r15, 1);
        A09 = C73813g7.A0F(r15);
        AnonymousClass3Z6[] r1 = new AnonymousClass3Z6[6];
        AnonymousClass3Z6.A09(100, A192, r1, 0);
        AnonymousClass3Z6.A09(110, A193, r1, 1);
        AnonymousClass3Z6.A06(120, A0c, r1);
        AnonymousClass3Z6.A07(130, A194, r1);
        AnonymousClass3Z6.A08(150, A195, r1);
        r1[5] = AnonymousClass3Z6.A02(170, A122);
        A08 = C73813g7.A0F(r1);
    }

    public static final boolean A01(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return false;
        }
        Map map = A09;
        if (!map.containsKey(num2)) {
            map = A08;
            if (!map.containsKey(num2)) {
                return false;
            }
        } else if (!map.containsKey(num)) {
            return A08.containsKey(num);
        }
        List A0s = C18320x8.A0s(num2, map);
        if (A0s != null) {
            return A0s.contains(num);
        }
        return false;
    }

    public static final Integer A00(int i) {
        if (i == 0) {
            return C18290x4.A0Z();
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 100;
            if (i != 100) {
                i2 = 110;
                if (i != 110) {
                    i2 = 120;
                    if (i != 120) {
                        i2 = 130;
                        if (i != 130) {
                            i2 = 150;
                            if (!(i == 150 || i == 170)) {
                                i2 = 999;
                                if (i != 999) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
        return Integer.valueOf(i2);
    }
}
