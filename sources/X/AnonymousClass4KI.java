package X;

import java.util.regex.Pattern;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.4KI  reason: invalid class name */
public class AnonymousClass4KI implements AnonymousClass4C1 {
    public final int A00;

    public AnonymousClass4KI(int i) {
        this.A00 = i;
    }

    public final Object get() {
        String str;
        switch (this.A00) {
            case 0:
                return new C64373Df();
            case 1:
                return new C66783Mt();
            case 2:
                Integer[] numArr = new Integer[84];
                AnonymousClass000.A1L(numArr, 28);
                AnonymousClass000.A1M(numArr, 4);
                AnonymousClass000.A1N(numArr, 7);
                AnonymousClass000.A1O(numArr, 10);
                AnonymousClass000.A1P(numArr, 12, 4);
                numArr[5] = 14;
                C18290x4.A1U(numArr, 18);
                AnonymousClass000.A1P(numArr, 67, 7);
                numArr[8] = 129;
                numArr[9] = 20;
                AnonymousClass000.A1P(numArr, 79, 10);
                AnonymousClass000.A1P(numArr, 5, 11);
                AnonymousClass000.A1P(numArr, 51, 12);
                numArr[13] = 52;
                AnonymousClass000.A1P(numArr, 13, 14);
                numArr[15] = 22;
                numArr[16] = 23;
                numArr[17] = 24;
                AnonymousClass000.A1P(numArr, 25, 18);
                numArr[19] = 26;
                AnonymousClass000.A1P(numArr, 34, 20);
                numArr[21] = 35;
                AnonymousClass000.A1P(numArr, 36, 22);
                AnonymousClass000.A1P(numArr, 46, 23);
                AnonymousClass000.A1P(numArr, 47, 24);
                AnonymousClass000.A1P(numArr, 48, 25);
                AnonymousClass000.A1P(numArr, 49, 26);
                numArr[27] = 50;
                AnonymousClass000.A1P(numArr, 55, 28);
                numArr[29] = 37;
                numArr[30] = 39;
                numArr[31] = 40;
                numArr[32] = 41;
                numArr[33] = 42;
                AnonymousClass000.A1P(numArr, 43, 34);
                AnonymousClass000.A1P(numArr, 44, 35);
                AnonymousClass000.A1P(numArr, 45, 36);
                numArr[37] = 56;
                numArr[38] = 57;
                numArr[39] = 59;
                numArr[40] = 60;
                numArr[41] = 61;
                numArr[42] = 69;
                numArr[43] = 62;
                numArr[44] = 63;
                numArr[45] = 64;
                numArr[46] = 65;
                numArr[47] = 66;
                numArr[48] = 68;
                numArr[49] = 71;
                numArr[50] = 75;
                AnonymousClass000.A1P(numArr, 113, 51);
                AnonymousClass000.A1P(numArr, 112, 52);
                numArr[53] = 114;
                numArr[54] = 116;
                numArr[55] = 122;
                numArr[56] = 123;
                numArr[57] = 124;
                numArr[58] = Integer.valueOf(MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT);
                numArr[59] = 125;
                numArr[60] = 126;
                numArr[61] = 127;
                numArr[62] = 128;
                numArr[63] = 76;
                numArr[64] = 77;
                numArr[65] = 78;
                numArr[66] = 86;
                AnonymousClass000.A1P(numArr, 87, 67);
                numArr[68] = 90;
                numArr[69] = 93;
                numArr[70] = 94;
                numArr[71] = 97;
                numArr[72] = 98;
                numArr[73] = 105;
                numArr[74] = 106;
                numArr[75] = Integer.valueOf(C627136h.A03);
                numArr[76] = 109;
                numArr[77] = 143;
                numArr[78] = 148;
                AnonymousClass000.A1P(numArr, 149, 79);
                numArr[80] = 147;
                numArr[81] = 155;
                numArr[82] = 156;
                numArr[83] = 166;
                return C18280x3.A0h(numArr);
            case 3:
                str = "\\+12225551[0-9]{3}";
                break;
            case 4:
                str = "\\+1[0-9]{3}555[0-9]{4}";
                break;
            case 5:
                return new AnonymousClass2H5();
            case 6:
                try {
                    Class.forName("androidx.test.espresso.Espresso");
                    return Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    return Boolean.FALSE;
                }
            case 7:
                return new C64363De();
            case 8:
                return new C64343Dc();
            case 9:
                return new C64353Dd();
            default:
                return new AnonymousClass3WM();
        }
        return Pattern.compile(str);
    }
}
