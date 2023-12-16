package X;

/* renamed from: X.0gR  reason: invalid class name and case insensitive filesystem */
public class C09590gR implements C16250si {
    public static final C09590gR A00 = new C09590gR();
    public static final AnonymousClass0T2 A01 = AnonymousClass0T2.A00("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    public /* bridge */ /* synthetic */ Object BgT(C10470hz r15, float f) {
        AnonymousClass0FL r2 = AnonymousClass0FL.CENTER;
        r15.A0H();
        String str = null;
        AnonymousClass0FL r3 = r2;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (r15.A0N()) {
            switch (r15.A0A(A01)) {
                case 0:
                    str = r15.A0F();
                    break;
                case 1:
                    str2 = r15.A0F();
                    break;
                case 2:
                    f2 = C10470hz.A03(r15);
                    break;
                case 3:
                    int A09 = r15.A09();
                    r3 = r2;
                    if (A09 <= 2 && A09 >= 0) {
                        r3 = AnonymousClass0FL.values()[A09];
                        break;
                    }
                case 4:
                    i = r15.A09();
                    break;
                case 5:
                    f3 = C10470hz.A03(r15);
                    break;
                case 6:
                    f4 = C10470hz.A03(r15);
                    break;
                case 7:
                    i2 = AnonymousClass0X5.A01(r15);
                    break;
                case 8:
                    i3 = AnonymousClass0X5.A01(r15);
                    break;
                case 9:
                    f5 = C10470hz.A03(r15);
                    break;
                case 10:
                    z = r15.A0O();
                    break;
                default:
                    r15.A0K();
                    r15.A0L();
                    break;
            }
        }
        r15.A0J();
        return new AnonymousClass0O0(r3, str, str2, f2, f3, f4, f5, i, i2, i3, z);
    }
}
