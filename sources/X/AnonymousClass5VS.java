package X;

import com.whatsapp.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.5VS  reason: invalid class name */
public class AnonymousClass5VS {
    public static String A01(C620733j r2, String... strArr) {
        return A00(r2, Arrays.asList(strArr), false);
    }

    public static String A00(C620733j r8, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return r8.A0H(AnonymousClass001.A0n(list, 0));
        }
        if (size != 2) {
            Object[] objArr = new Object[2];
            C620733j.A03(r8, AnonymousClass001.A0n(list, 0), objArr, 0);
            C620733j.A03(r8, AnonymousClass001.A0n(list, 1), objArr, 1);
            String A0D = r8.A0D(236, objArr);
            for (int i = 2; i < AnonymousClass002.A04(list, 1); i++) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = A0D;
                C620733j.A03(r8, AnonymousClass001.A0n(list, i), objArr2, 1);
                A0D = r8.A0D(235, objArr2);
            }
            if (z) {
                Object[] objArr3 = new Object[2];
                objArr3[0] = A0D;
                C620733j.A03(r8, AnonymousClass001.A0n(list, size - 1), objArr3, 1);
                return r8.A0D(234, objArr3);
            }
            Object[] objArr4 = new Object[2];
            objArr4[0] = A0D;
            C620733j.A03(r8, AnonymousClass001.A0n(list, size - 1), objArr4, 1);
            return r8.A0E(R.string.f11nameremoved, objArr4);
        } else if (z) {
            Object[] objArr5 = new Object[2];
            C620733j.A03(r8, AnonymousClass001.A0n(list, 0), objArr5, 0);
            C620733j.A03(r8, AnonymousClass001.A0n(list, 1), objArr5, 1);
            return r8.A0D(237, objArr5);
        } else {
            Object[] objArr6 = new Object[2];
            C620733j.A03(r8, AnonymousClass001.A0n(list, 0), objArr6, 0);
            C620733j.A03(r8, AnonymousClass001.A0n(list, 1), objArr6, 1);
            return r8.A0E(R.string.f11nameremoved, objArr6);
        }
    }
}
