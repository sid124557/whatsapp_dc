package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.7Ts  reason: invalid class name and case insensitive filesystem */
public class C151177Ts {
    public final char A00;
    public final char A01;
    public final int A02;
    public final int A03;
    public final DecimalFormat A04;

    public final String A00(String str) {
        int lastIndexOf = str.lastIndexOf(this.A00);
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        int i = lastIndexOf - 1;
        while (i > 0 && Character.isDigit(str.charAt(i - 1))) {
            i--;
        }
        int i2 = i + 1;
        StringBuilder A0A = C18330xA.A0A(AnonymousClass0x7.A0r(str, i2));
        while (i2 < lastIndexOf) {
            int i3 = (lastIndexOf - i2) - this.A02;
            if (i3 == 0 || (i3 > 0 && i3 % this.A03 == 0)) {
                A0A.append(this.A01);
            }
            A0A.append(str.charAt(i2));
            i2++;
        }
        return AnonymousClass000.A0X(str.substring(lastIndexOf), A0A);
    }

    public C151177Ts(String str, Locale locale) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
        this.A04 = decimalFormat;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        this.A00 = decimalFormatSymbols.getDecimalSeparator();
        this.A01 = decimalFormatSymbols.getGroupingSeparator();
        decimalFormat.applyPattern(str);
        decimalFormat.setGroupingUsed(false);
        int indexOf = str.indexOf(46);
        indexOf = indexOf == -1 ? str.length() : indexOf;
        int lastIndexOf = str.lastIndexOf(44, indexOf - 1);
        int i = (indexOf - lastIndexOf) - 1;
        this.A02 = i;
        int lastIndexOf2 = str.lastIndexOf(44, lastIndexOf - 1);
        if (lastIndexOf2 == -1) {
            this.A03 = i;
        } else {
            this.A03 = (lastIndexOf - lastIndexOf2) - 1;
        }
    }
}
