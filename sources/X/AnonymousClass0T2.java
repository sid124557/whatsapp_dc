package X;

import java.io.IOException;

/* renamed from: X.0T2  reason: invalid class name */
public final class AnonymousClass0T2 {
    public final AnonymousClass8TA A00;
    public final String[] A01;

    public static AnonymousClass0T2 A00(String... strArr) {
        try {
            int length = strArr.length;
            AnonymousClass8Lk[] r3 = new AnonymousClass8Lk[length];
            C172278Kj r2 = new C172278Kj();
            for (int i = 0; i < length; i++) {
                C10470hz.A06(strArr[i], r2);
                r2.readByte();
                r3[i] = r2.A06();
            }
            return new AnonymousClass0T2(AnonymousClass8TA.A00(r3), (String[]) strArr.clone());
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public AnonymousClass0T2(AnonymousClass8TA r1, String[] strArr) {
        this.A01 = strArr;
        this.A00 = r1;
    }
}
