package X;

import android.content.Context;
import com.whatsapp.R;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: X.5A8  reason: invalid class name */
public class AnonymousClass5A8 {
    public static String A00(Context context, Locale locale, float f) {
        int i;
        Object[] objArr;
        Object valueOf;
        DecimalFormat decimalFormat;
        String str;
        if (C106945aQ.A03(locale)) {
            int A07 = AnonymousClass001.A07(f, 1.09f);
            float f2 = ((float) A07) / 1760.0f;
            if (A07 < 325) {
                Object[] objArr2 = new Object[1];
                AnonymousClass000.A1P(objArr2, A07, 0);
                return context.getString(R.string.f11nameremoved, objArr2);
            }
            if (f2 < 1000.0f) {
                str = "0.#";
            } else {
                decimalFormat = new DecimalFormat();
                str = "#,###";
            }
            decimalFormat.applyPattern(str);
            return AnonymousClass002.A0F(context, decimalFormat.format((double) f2), new Object[1], 0, R.string.f11nameremoved);
        }
        if (f < 1000.0f) {
            i = R.string.f11nameremoved;
            objArr = new Object[1];
            valueOf = Integer.valueOf(Math.round(f));
        } else {
            int i2 = (f > 10000.0f ? 1 : (f == 10000.0f ? 0 : -1));
            float f3 = f / 1000.0f;
            if (i2 < 0) {
                return AnonymousClass002.A0F(context, String.format(Locale.US, "%.1f", new Object[]{Double.valueOf((double) f3)}), new Object[1], 0, R.string.f11nameremoved);
            }
            int round = Math.round(f3);
            i = R.string.f11nameremoved;
            objArr = new Object[1];
            valueOf = String.valueOf(round);
        }
        return AnonymousClass002.A0F(context, valueOf, objArr, 0, i);
    }
}
