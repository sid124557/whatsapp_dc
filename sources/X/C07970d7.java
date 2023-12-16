package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.0d7  reason: invalid class name and case insensitive filesystem */
public final class C07970d7 implements C16590te {
    public static final Locale A01;
    public static final Locale A02 = new Locale("ar", "XB");
    public static final Locale A03 = new Locale("en", "XA");
    public static final Locale[] A04 = new Locale[0];
    public final Locale[] A00;

    static {
        Locale locale;
        String str = "-";
        if (!"en-Latn".contains(str)) {
            str = "_";
            if (!"en-Latn".contains(str)) {
                locale = new Locale("en-Latn");
                A01 = locale;
            }
        }
        String[] split = "en-Latn".split(str, -1);
        int length = split.length;
        if (length > 2) {
            locale = new Locale(split[0], split[1], split[2]);
        } else if (length > 1) {
            locale = new Locale(split[0], split[1]);
        } else if (length == 1) {
            locale = new Locale(split[0]);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Can not parse language tag: [");
            A0o.append("en-Latn");
            throw AnonymousClass000.A0F("]", A0o);
        }
        A01 = locale;
    }

    public Locale B3y(int i) {
        Locale[] localeArr = this.A00;
        if (0 < localeArr.length) {
            return localeArr[0];
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C07970d7) {
                Locale[] localeArr = ((C07970d7) obj).A00;
                Locale[] localeArr2 = this.A00;
                int length = localeArr2.length;
                if (length == localeArr.length) {
                    int i = 0;
                    while (i < length) {
                        if (localeArr2[i].equals(localeArr[i])) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Object B9A() {
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale A022 : this.A00) {
            i = AnonymousClass002.A02(A022, i * 31);
        }
        return i;
    }

    public C07970d7(Locale... localeArr) {
        Locale[] localeArr2;
        int length = localeArr.length;
        if (length == 0) {
            localeArr2 = A04;
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            HashSet A0K = AnonymousClass002.A0K();
            int i = 0;
            do {
                Locale locale = localeArr[i];
                if (locale != null) {
                    if (!A0K.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        A0s.add(locale2);
                        locale2.getCountry();
                        A0K.add(locale2);
                    }
                    i++;
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("list[");
                    A0o.append(i);
                    throw AnonymousClass001.A0g(AnonymousClass000.A0X("] is null", A0o));
                }
            } while (i < length);
            localeArr2 = (Locale[]) A0s.toArray(new Locale[0]);
        }
        this.A00 = localeArr2;
    }

    public String toString() {
        StringBuilder A0p = AnonymousClass001.A0p();
        int i = 0;
        while (true) {
            Locale[] localeArr = this.A00;
            int length = localeArr.length;
            if (i >= length) {
                return AnonymousClass000.A0f(A0p);
            }
            A0p.append(localeArr[i]);
            if (i < length - 1) {
                A0p.append(',');
            }
            i++;
        }
    }
}
