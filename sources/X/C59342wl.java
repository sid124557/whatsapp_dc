package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.2wl  reason: invalid class name and case insensitive filesystem */
public final class C59342wl {
    public static final C48302eg A02 = new C48302eg(C817440x.A00);
    public final C47512dN A00;
    public final C619132t A01;

    public C59342wl(C47512dN r2, C619132t r3) {
        C162457s7.A0J(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final C833748d A00(C833648c r8, String str, int i) {
        C162457s7.A0J(str, 1);
        List A022 = this.A01.A02(str, i);
        if (!A022.isEmpty()) {
            HashSet A0K = AnonymousClass002.A0K();
            int i2 = 0;
            Integer num = ((AnonymousClass3YL) A022.get(0)).A0B;
            if (num != null) {
                i2 = num.intValue();
            }
            A0K.add(str);
            C833748d A002 = A02.A00(this.A00.A00(r8, Integer.valueOf(i), Integer.valueOf(i2), A0K), A022);
            if (A002 != null) {
                return A002;
            }
        }
        return null;
    }
}
