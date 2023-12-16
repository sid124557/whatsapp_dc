package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.5RO  reason: invalid class name */
public class AnonymousClass5RO {
    public final AnonymousClass66R A00 = C154517dI.A01(new C119485x3(this));

    public final int A00(int i) {
        Number number = (Number) AnonymousClass001.A0i((Map) this.A00.getValue(), i);
        if (number != null) {
            return number.intValue();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Unknown actionId ");
        A0o.append(i);
        throw AnonymousClass000.A0F(". Add it to getSortList().", A0o);
    }

    public List A02() {
        Integer[] numArr = new Integer[35];
        C18270x1.A1Q(numArr, 35);
        C86624Kv.A1V(numArr, 1);
        C86624Kv.A1V(numArr, 2);
        C86624Kv.A1V(numArr, 3);
        numArr[4] = 19;
        numArr[5] = 20;
        numArr[6] = 4;
        numArr[7] = 26;
        numArr[8] = 21;
        numArr[9] = 5;
        numArr[10] = 6;
        numArr[11] = 7;
        numArr[12] = 8;
        numArr[13] = 34;
        numArr[14] = 33;
        numArr[15] = 32;
        AnonymousClass000.A1P(numArr, 9, 16);
        AnonymousClass000.A1P(numArr, 12, 17);
        numArr[18] = 24;
        AnonymousClass000.A1P(numArr, 25, 19);
        C86604Kt.A1X(numArr, 17, 20, 18, 21);
        AnonymousClass000.A1P(numArr, 10, 22);
        AnonymousClass000.A1P(numArr, 11, 23);
        AnonymousClass000.A1P(numArr, 13, 24);
        numArr[25] = 36;
        AnonymousClass000.A1P(numArr, 14, 26);
        numArr[27] = 31;
        AnonymousClass000.A1P(numArr, 15, 28);
        numArr[29] = 16;
        numArr[30] = 22;
        numArr[31] = 23;
        numArr[32] = 27;
        AnonymousClass000.A1P(numArr, 28, 33);
        AnonymousClass000.A1P(numArr, 30, 34);
        return AnonymousClass8UF.A0o(numArr);
    }

    public C997257y A01(int i) {
        switch (i) {
            case 8:
            case 21:
            case 34:
                return C997257y.TOP_LEVEL;
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 18:
            case 22:
            case 23:
            case 27:
            case 30:
            case 31:
            case 35:
                return C997257y.OVERFLOW;
            default:
                return C997257y.NO_PREFERENCE;
        }
    }
}
