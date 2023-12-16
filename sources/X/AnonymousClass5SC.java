package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.5SC  reason: invalid class name */
public final class AnonymousClass5SC {
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SC) {
                AnonymousClass5SC r5 = (AnonymousClass5SC) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, ((C18270x1.A00(this.A01) * 31) + this.A00) * 31);
    }

    public AnonymousClass5SC(ArrayList arrayList, int i, String str) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = arrayList;
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[3];
        objArr[0] = this.A01;
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A02;
        return C86654Ky.A0n(locale, "ModelMetadata: name=%s version=%d assets=%s", Arrays.copyOf(objArr, 3));
    }
}
