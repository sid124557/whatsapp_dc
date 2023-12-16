package X;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.0d6  reason: invalid class name and case insensitive filesystem */
public final class C07960d6 implements C16590te {
    public final LocaleList A00;

    public Locale B3y(int i) {
        return this.A00.get(0);
    }

    public Object B9A() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        return this.A00.equals(((C16590te) obj).B9A());
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    public C07960d6(Object obj) {
        this.A00 = (LocaleList) obj;
    }
}
