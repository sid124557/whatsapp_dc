package X;

/* renamed from: X.5RV  reason: invalid class name */
public final class AnonymousClass5RV {
    public final AnonymousClass4FV A00;

    public AnonymousClass5RV(AnonymousClass4FV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final C94574rZ A00(Integer num, Integer num2, int i) {
        Integer valueOf;
        C94574rZ r2 = new C94574rZ();
        int i2 = 1;
        if (i != 4) {
            i2 = 2;
            if (i != 5) {
                i2 = 0;
                if (i != 6) {
                    i2 = 3;
                    if (i != 7) {
                        valueOf = null;
                        r2.A02 = valueOf;
                        r2.A03 = num;
                        r2.A01 = num2;
                        return r2;
                    }
                }
            }
        }
        valueOf = Integer.valueOf(i2);
        r2.A02 = valueOf;
        r2.A03 = num;
        r2.A01 = num2;
        return r2;
    }

    public final void A01(int i) {
        AnonymousClass1Y2 r1 = new AnonymousClass1Y2();
        r1.A01 = 49;
        r1.A00 = Integer.valueOf(i);
        this.A00.BhD(r1);
    }

    public final void A02(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Integer A0Z = C18290x4.A0Z();
        C94574rZ A002 = A00(valueOf, A0Z, i);
        A002.A00 = A0Z;
        this.A00.BhA(A002);
    }
}
