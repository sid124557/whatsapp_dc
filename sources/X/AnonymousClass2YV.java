package X;

import android.content.res.Resources;
import java.util.Arrays;

/* renamed from: X.2YV  reason: invalid class name */
public final class AnonymousClass2YV {
    public final C54292oU A00;
    public final AnonymousClass1VX A01;

    public final String A00(int i, int i2, Object... objArr) {
        String string;
        boolean A0Y = this.A01.A0Y(C58422vE.A02, 5846);
        C54292oU r2 = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Resources A002 = C54292oU.A00(r2);
        if (A0Y) {
            string = A002.getString(i2, copyOf);
        } else {
            string = A002.getString(i, copyOf);
        }
        C162457s7.A0H(string);
        return string;
    }

    public AnonymousClass2YV(C54292oU r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
