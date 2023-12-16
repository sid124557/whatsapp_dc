package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Yc  reason: invalid class name */
public class AnonymousClass0Yc {
    public static final Float A00;
    public static final Float A01;
    public static final Float A02;
    public static final Float A03 = Float.valueOf(Float.MIN_VALUE);

    static {
        Float valueOf = Float.valueOf(0.0f);
        A02 = valueOf;
        A00 = valueOf;
        A01 = valueOf;
    }

    public static void A06(Spannable spannable, float f, int i, int i2) {
        if (f != Float.MIN_VALUE) {
            A05(C158977kt.A00().A02(), spannable, f, i, i2);
        }
    }

    public static void A07(Spannable spannable, C153427bI r4, AnonymousClass84O r5, float f, float f2, float f3, int i, int i2) {
        int i3;
        if (f > 0.0f) {
            if (r5 != null) {
                i3 = C154127ce.A00(r4, r5);
            } else {
                i3 = 0;
            }
            spannable.setSpan(new AnonymousClass02C(f, f2, f3, i3), i, i2, 0);
        }
    }

    public static void A09(Spannable spannable, C153427bI r11, AnonymousClass84O r12, AnonymousClass84O r13, C835248t r14, String str, String str2, int i, int i2) {
        C835248t r6 = r14;
        if (r14 != null) {
            spannable.setSpan(new C01950Cv(r11, r12, r13, r6, str, str2, false), i, i2, 0);
        }
    }

    public static void A0G(SpannableStringBuilder spannableStringBuilder, C153427bI r7, AnonymousClass84O r8, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        C153427bI r1 = r7;
        A07(spannableStringBuilder2, r1, r8.A0K(53), r8.A0B(56, 0.0f), r8.A0B(54, 0.0f), r8.A0B(55, 0.0f), i, i2);
    }

    public static void A0L(SpannableStringBuilder spannableStringBuilder, C153427bI r12, AnonymousClass84O r13, AnonymousClass84O r14, StringBuilder sb) {
        AnonymousClass84O r8 = r14;
        CharSequence A04 = A04(r14.A0K(40), r14.A0P(38, ""), A0O(r14));
        SpannableString spannableString = new SpannableString(A04);
        String A0O = r14.A0O(35);
        if (!TextUtils.isEmpty(A0O)) {
            A04 = A0O;
        }
        for (AnonymousClass84O r9 : r14.A0S(36)) {
            int A0D = r9.A0D();
            C153427bI r6 = r12;
            switch (A0D) {
                case 16870:
                case 16871:
                case 16873:
                case 16874:
                case 16875:
                case 16876:
                    A08(spannableString, r6, r13, r8, r9, A0D);
                    break;
                default:
                    C159737mN.A00(r12, "TextNodeUtils", "Span style is not supported", (Throwable) null);
                    break;
            }
        }
        spannableStringBuilder.append(spannableString);
        sb.append(A04);
    }

    public static void A0M(SpannableStringBuilder spannableStringBuilder, AnonymousClass84O r3, int i, int i2) {
        A06(spannableStringBuilder, r3.A0B(49, Float.MIN_VALUE), i, i2);
    }

    public static AnonymousClass0LR A01(C153427bI r6, AnonymousClass84O r7, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass84O r2 = (AnonymousClass84O) it.next();
            if (r2.A0D() != 16887) {
                A0L(spannableStringBuilder, r6, r7, r2, A0o);
            }
        }
        return new AnonymousClass0LR(A0o.toString(), spannableStringBuilder);
    }

    public static AnonymousClass0LR A02(C153427bI r12, AnonymousClass84O r13, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass84O r9 = (AnonymousClass84O) it.next();
            int length = spannableStringBuilder.length();
            CharSequence A04 = A04(r9.A0K(41), r9.A0P(38, ""), A0O(r9));
            spannableStringBuilder.append(A04);
            int length2 = spannableStringBuilder.length();
            C153427bI r7 = r12;
            if (A0O(r9)) {
                A0N(r12, r9);
            } else {
                A0I(spannableStringBuilder, r12, r9, length, length2);
            }
            A0K(spannableStringBuilder, r7, r13, r9, length, length2);
            String A0O = r9.A0O(66);
            if (!TextUtils.isEmpty(A0O)) {
                A0o.append(A0O);
            } else {
                A0o.append(A04);
            }
        }
        return new AnonymousClass0LR(A0o.toString(), spannableStringBuilder);
    }

    public static AnonymousClass0LR A03(C153427bI r0, AnonymousClass84O r1, List list, boolean z) {
        if (z) {
            return A01(r0, r1, list);
        }
        return A02(r0, r1, list);
    }

    public static CharSequence A04(AnonymousClass84O r1, CharSequence charSequence, boolean z) {
        if (z) {
            return " ";
        }
        if (r1 == null) {
            return charSequence;
        }
        CharSequence A002 = C158977kt.A00().A06().A00(r1);
        if (A002 == null) {
            return "";
        }
        return A002;
    }

    public static void A08(Spannable spannable, C153427bI r13, AnonymousClass84O r14, AnonymousClass84O r15, AnonymousClass84O r16, int i) {
        int length;
        int i2;
        Object underlineSpan;
        String A0O;
        Spannable spannable2 = spannable;
        C153427bI r6 = r13;
        AnonymousClass84O r1 = r16;
        int i3 = i;
        if (i3 == 16873) {
            C162457s7.A0J(r13, 0);
            int length2 = spannable2.length();
            AnonymousClass84O r8 = r15;
            int A0D = r15.A0D();
            if (A0D == 16880 || A0D == 16887) {
                A0O = r15.A0O(35);
            } else {
                A0O = null;
            }
            AnonymousClass84O r7 = r14;
            A09(spannable2, r6, r7, r8, r1.A0L(36), A0O, r1.A0O(35), 0, length2);
        } else if (i3 == 16875) {
            C162457s7.A0J(r13, 0);
            A0A(spannable2, r6, r1.A0K(35), (String) null, 0, spannable.length());
        } else if (i3 == 16871) {
            C162457s7.A0J(r13, 0);
            int length3 = spannable.length();
            C162457s7.A0F(A02);
            float A0B = r1.A0B(40, 0.0f);
            C162457s7.A0F(A00);
            float A0B2 = r1.A0B(36, 0.0f);
            C162457s7.A0F(A01);
            A07(spannable2, r6, r1.A0K(35), A0B, A0B2, r1.A0B(38, 0.0f), 0, length3);
        } else {
            if (i3 == 16874) {
                length = spannable.length();
                i2 = 0;
                if (r1.A0W(35, false)) {
                    underlineSpan = new StrikethroughSpan();
                } else {
                    return;
                }
            } else if (i3 == 16870) {
                C162457s7.A0J(r13, 0);
                int length4 = spannable.length();
                A0C(spannable, r13, r1.A0O(41), 0, length4);
                String A0O2 = r1.A0O(42);
                A0B(spannable, r13, r1.A0O(35), 0, length4);
                A0D(spannable, r13, A0O2, 0, length4);
                C162457s7.A0F(A03);
                A06(spannable, r1.A0B(44, Float.MIN_VALUE), 0, length4);
                return;
            } else if (i3 == 16876) {
                length = spannable.length();
                i2 = 0;
                if (r1.A0W(35, false)) {
                    underlineSpan = new UnderlineSpan();
                } else {
                    return;
                }
            } else {
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass000.A1P(A0L, i3, 0);
                throw AnonymousClass001.A0c(String.format("No implementation bound to key: %s", A0L));
            }
            spannable.setSpan(underlineSpan, i2, length, i2);
        }
    }

    public static void A0A(Spannable spannable, C153427bI r3, AnonymousClass84O r4, String str, int i, int i2) {
        Integer valueOf;
        if (r4 != null) {
            valueOf = Integer.valueOf(C154127ce.A00(r3, r4));
        } else if (str != null) {
            try {
                valueOf = Integer.valueOf(C162407s0.A05(str));
            } catch (AnonymousClass6u2 e) {
                C159737mN.A00(r3, "TextNodeUtils", "Error parsing TextSpan color", e);
                return;
            }
        } else {
            return;
        }
        if (valueOf != null) {
            spannable.setSpan(new ForegroundColorSpan(valueOf.intValue()), i, i2, 0);
        }
    }

    public static void A0B(Spannable spannable, C153427bI r3, String str, int i, int i2) {
        if (str != null) {
            spannable.setSpan(new AnonymousClass02F(A00(r3.A00(), str)), i, i2, 0);
        }
    }

    public static void A0C(Spannable spannable, C153427bI r4, String str, int i, int i2) {
        if (str != null) {
            try {
                spannable.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, C162407s0.A02(str), AnonymousClass000.A0B(r4.A00()))), i, i2, 0);
            } catch (AnonymousClass6u2 e) {
                C159737mN.A00(r4, "TextNodeUtils", "Error parsing TextSpan size", e);
            }
        }
    }

    public static void A0D(Spannable spannable, C153427bI r3, String str, int i, int i2) {
        if (str != null) {
            try {
                spannable.setSpan(new StyleSpan(C162407s0.A09(str)), i, i2, 0);
            } catch (AnonymousClass6u2 e) {
                C159737mN.A00(r3, "TextNodeUtils", "Error parsing TextSpan textStyle", e);
            }
        }
    }

    public static void A0E(SpannableStringBuilder spannableStringBuilder, C153427bI r2, AnonymousClass84O r3, int i, int i2) {
        A0B(spannableStringBuilder, r2, r3.A0O(35), i, i2);
    }

    public static void A0F(SpannableStringBuilder spannableStringBuilder, C153427bI r5, AnonymousClass84O r6, int i, int i2) {
        A0A(spannableStringBuilder, r5, r6.A0K(44), r6.A0O(40), i, i2);
    }

    public static void A0H(SpannableStringBuilder spannableStringBuilder, C153427bI r2, AnonymousClass84O r3, int i, int i2) {
        A0C(spannableStringBuilder, r2, r3.A0O(42), i, i2);
    }

    public static void A0J(SpannableStringBuilder spannableStringBuilder, C153427bI r3, AnonymousClass84O r4, int i, int i2) {
        A0D(spannableStringBuilder, r3, r4.A0O(43), i, i2);
        if (r4.A0W(45, false)) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 0);
        }
        if (r4.A0W(52, false)) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 0);
        }
    }

    public static void A0K(SpannableStringBuilder spannableStringBuilder, C153427bI r13, AnonymousClass84O r14, AnonymousClass84O r15, int i, int i2) {
        String A0O = r15.A0O(66);
        String A0O2 = r15.A0O(67);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        AnonymousClass84O r3 = r14;
        int i3 = i;
        int i4 = i2;
        A09(spannableStringBuilder2, r13, r3, r15, r15.A0L(36), A0O, A0O2, i3, i4);
        C835248t A0L = r15.A0L(57);
        if (A0L != null) {
            spannableStringBuilder2.setSpan(new C01950Cv(r13, r3, r15, A0L, A0O, A0O2, true), i3, i4, 0);
        }
    }

    public static void A0N(C153427bI r5, AnonymousClass84O r6) {
        String A0O = r6.A0O(62);
        String A0O2 = r6.A0O(61);
        AnonymousClass84O A0J = r6.A0K(59);
        if (A0O == null || A0O2 == null || A0J == null) {
            C159737mN.A01("TextNodeUtils", "Invalid image span attributes specified.");
            return;
        }
        try {
            float A012 = C162407s0.A01(A0O);
            if (C162407s0.A01(A0O2) == 0.0f || A012 == 0.0f) {
                C159737mN.A00(r5, "TextNodeUtils", "Invalid dimensions specified for image span", (Throwable) null);
                return;
            }
            r6.A0O(68);
            AnonymousClass84O A0J2 = r6.A0K(69);
            new Rect();
            if (A0J2 != null) {
                C154117cd.A01(A0J2).A00(AnonymousClass73E.A00(r5.A00()));
            }
        } catch (AnonymousClass6u2 e) {
            C159737mN.A00(r5, "TextNodeUtils", "Error parsing image width", e);
        }
    }

    public static boolean A0O(AnonymousClass84O r1) {
        return AnonymousClass000.A1W(r1.A0K(59));
    }

    public static Typeface A00(Context context, String str) {
        return C158977kt.A00().A05().A00(context, str, 0);
    }

    public static void A05(Context context, Spannable spannable, float f, int i, int i2) {
        spannable.setSpan(new AnonymousClass6EG(f, AnonymousClass000.A0B(context).scaledDensity), i, i2, 0);
    }

    public static void A0I(SpannableStringBuilder spannableStringBuilder, C153427bI r1, AnonymousClass84O r2, int i, int i2) {
        A0F(spannableStringBuilder, r1, r2, i, i2);
        A0H(spannableStringBuilder, r1, r2, i, i2);
        A0E(spannableStringBuilder, r1, r2, i, i2);
        A0J(spannableStringBuilder, r1, r2, i, i2);
        A0G(spannableStringBuilder, r1, r2, i, i2);
        A0M(spannableStringBuilder, r2, i, i2);
    }
}
