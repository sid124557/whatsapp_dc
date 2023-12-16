package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.9UO  reason: invalid class name */
public class AnonymousClass9UO {
    public static SpannableStringBuilder A00(Context context, C620733j r3, C85204Fi r4, AnonymousClass39Q r5) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A01(r3, r4, r5, 0, true));
        if (AnonymousClass9KX.A00 == null) {
            try {
                AnonymousClass9KX.A00 = C06400Xn.A02(context, R.font.payment_icons_regular);
                return spannableStringBuilder;
            } catch (Resources.NotFoundException unused) {
                Log.e("PAY: PaymentsTypeface/loadTypefaceSync could not load font R.font.payment_icons_regular");
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(X.C620733j r9, X.C85204Fi r10, X.AnonymousClass39Q r11, int r12, boolean r13) {
        /*
            r1 = r10
            X.3H6 r1 = (X.AnonymousClass3H6) r1
            r8 = 1
            r3 = r9
            if (r12 != r8) goto L_0x0053
            java.lang.String r4 = r1.A04
            java.lang.String r5 = r1.A05
            java.math.BigDecimal r6 = r11.A00
            int r7 = r6.scale()
        L_0x0011:
            java.lang.String r2 = X.AnonymousClass359.A00(r3, r4, r5, r6, r7, r8)
        L_0x0015:
            java.lang.String r0 = r10.B3U(r9, r11)
            int r1 = r6.scale()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            int r3 = r2.indexOf(r0)
            int r2 = r0.length()
            int r0 = r1 + 1
            if (r1 > 0) goto L_0x002f
            r0 = 0
        L_0x002f:
            int r1 = r2 - r0
            int r1 = r1 + r3
            int r3 = r3 + r2
            int r0 = r6.signum()
            if (r0 == 0) goto L_0x0049
            int r0 = r6.scale()
            if (r0 <= 0) goto L_0x0049
            java.math.BigDecimal r0 = r6.stripTrailingZeros()
            int r0 = r0.scale()
            if (r0 > 0) goto L_0x004e
        L_0x0049:
            if (r13 == 0) goto L_0x004e
            r4.delete(r1, r3)
        L_0x004e:
            java.lang.String r0 = r4.toString()
            return r0
        L_0x0053:
            r0 = 2
            java.lang.String r4 = r1.A04
            if (r12 != r0) goto L_0x0062
            java.lang.String r5 = r1.A05
            java.math.BigDecimal r6 = r11.A00
            int r7 = r6.scale()
            r8 = 0
            goto L_0x0011
        L_0x0062:
            java.math.BigDecimal r6 = r11.A00
            int r7 = r6.scale()
            java.lang.String r5 = r1.A05
            java.lang.String r2 = X.AnonymousClass359.A01(r3, r4, r5, r6, r7, r8)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UO.A01(X.33j, X.4Fi, X.39Q, int, boolean):java.lang.String");
    }
}
