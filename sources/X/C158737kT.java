package X;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.math.BigDecimal;
import java.util.Locale;

/* renamed from: X.7kT  reason: invalid class name and case insensitive filesystem */
public class C158737kT {
    public static final boolean A02 = C18280x3.A1U(Build.VERSION.SDK_INT, 24);
    public final DecimalFormat A00;
    public final C151177Ts A01;

    public Number A00(String str) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C626936e.A06(decimalFormat);
            return decimalFormat.parse(str);
        }
        C151177Ts r0 = this.A01;
        C626936e.A06(r0);
        return r0.A04.parse(str.replace(String.valueOf(r0.A01), ""));
    }

    public String A01() {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C626936e.A06(decimalFormat);
            return decimalFormat.format(1.0d);
        }
        C151177Ts r1 = this.A01;
        C626936e.A06(r1);
        return r1.A00(r1.A04.format(1.0d));
    }

    public String A02(BigDecimal bigDecimal) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C626936e.A06(decimalFormat);
            return decimalFormat.format(bigDecimal);
        }
        C151177Ts r1 = this.A01;
        C626936e.A06(r1);
        return r1.A00(r1.A04.format(bigDecimal));
    }

    public void A03(int i) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C626936e.A06(decimalFormat);
            decimalFormat.setMinimumFractionDigits(i);
            decimalFormat.setMaximumFractionDigits(i);
            return;
        }
        C151177Ts r0 = this.A01;
        C626936e.A06(r0);
        java.text.DecimalFormat decimalFormat2 = r0.A04;
        decimalFormat2.setMinimumFractionDigits(i);
        decimalFormat2.setMaximumFractionDigits(i);
    }

    public C158737kT(String str, Locale locale) {
        if (A02) {
            this.A00 = new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale));
        } else {
            this.A01 = new C151177Ts(str, locale);
        }
    }
}
