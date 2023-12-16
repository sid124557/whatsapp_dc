package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Af  reason: invalid class name and case insensitive filesystem */
public final class C01340Af extends AnonymousClass0O7 {
    public final C16090sS A00;
    public final C02180Fe A01;
    public final AnonymousClass0GM A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C01340Af(C16090sS r4, C02180Fe r5, Object obj, String str, String str2) {
        C162457s7.A0J(r5, 5);
        this.A03 = obj;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = r4;
        this.A01 = r5;
        AnonymousClass0GM r2 = new AnonymousClass0GM(AnonymousClass000.A0P(obj, " value: ", AnonymousClass000.A0l(str2)));
        StackTraceElement[] stackTrace = r2.getStackTrace();
        C162457s7.A0D(stackTrace);
        Object[] array = A00(stackTrace).toArray(new StackTraceElement[0]);
        C162457s7.A0K(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        r2.setStackTrace((StackTraceElement[]) array);
        this.A02 = r2;
    }

    public static final List A00(Object[] objArr) {
        int length = objArr.length;
        int i = length - 2;
        if (i < 0 || i == 0) {
            return C72023d3.A00;
        }
        if (i >= length) {
            return C73703fw.A04(objArr);
        }
        if (i == 1) {
            return C159507lx.A0g(objArr[length - 1]);
        }
        ArrayList A0I = AnonymousClass002.A0I(i);
        for (int i2 = length - i; i2 < length; i2++) {
            A0I.add(objArr[i2]);
        }
        return A0I;
    }

    public Object A02() {
        int ordinal = this.A01.ordinal();
        if (ordinal == 0) {
            throw this.A02;
        } else if (ordinal == 1) {
            this.A00.B1F(this.A05, AnonymousClass000.A0P(this.A03, " value: ", AnonymousClass000.A0l(this.A04)));
            return null;
        } else if (ordinal == 2) {
            return null;
        } else {
            throw new C73153f1();
        }
    }

    public AnonymousClass0O7 A01(String str, AnonymousClass4GQ r2) {
        return this;
    }
}
