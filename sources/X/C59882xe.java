package X;

/* renamed from: X.2xe  reason: invalid class name and case insensitive filesystem */
public class C59882xe {
    public final AnonymousClass4FV A00;

    public void A02(int i, int i2) {
        AnonymousClass1YQ r1 = new AnonymousClass1YQ();
        r1.A02 = Integer.valueOf(i);
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = C18290x4.A0Z();
        this.A00.BhD(r1);
    }

    public C59882xe(AnonymousClass4FV r1) {
        this.A00 = r1;
    }

    public static void A00(AnonymousClass4FV r3, String str, int i) {
        C18260x0.A1K(AnonymousClass000.A0l(str), "/missing message secret");
        AnonymousClass1YQ r2 = new AnonymousClass1YQ();
        r2.A02 = 0;
        r2.A00 = Integer.valueOf(i);
        r2.A01 = 0;
        r3.BhD(r2);
    }

    public final Integer A01(C624134x r3, int i) {
        int i2;
        if (!C57632tx.A00(r3)) {
            return null;
        }
        if (!r3.A1n()) {
            A02(0, i);
            i2 = 66;
        } else if (r3.A1a.length == 32) {
            return null;
        } else {
            A02(1, i);
            i2 = 67;
        }
        return Integer.valueOf(i2);
    }
}
