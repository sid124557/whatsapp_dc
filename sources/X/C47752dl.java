package X;

import android.content.res.Resources;
import java.util.Arrays;

/* renamed from: X.2dl  reason: invalid class name and case insensitive filesystem */
public final class C47752dl {
    public final boolean A01(AnonymousClass1VX r3) {
        C162457s7.A0J(r3, 0);
        return AnonymousClass000.A1S(r3.A0O(C58422vE.A02, 4248));
    }

    public final String A00(Resources resources, AnonymousClass1VX r5, Object[] objArr, int i) {
        C18260x0.A0O(resources, r5);
        String[] stringArray = resources.getStringArray(i);
        C162457s7.A0D(stringArray);
        String str = stringArray[r5.A0O(C58422vE.A02, 4248)];
        C162457s7.A0A(str);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        C162457s7.A0D(format);
        return format;
    }
}
