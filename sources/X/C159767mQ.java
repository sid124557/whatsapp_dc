package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import java.text.MessageFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7mQ  reason: invalid class name and case insensitive filesystem */
public final class C159767mQ {
    public static final Pattern A00 = Pattern.compile("\\[(\\d+)]");

    public static Spannable A00(C153427bI r15, AnonymousClass84O r16, C186518vU r17) {
        Object[] objArr;
        Integer num;
        AnonymousClass84O r10 = r16;
        Object A05 = AnonymousClass84O.A05(r10, 44);
        int i = 0;
        if (A05 != null) {
            objArr = ((List) A05).toArray(new String[0]);
        } else {
            objArr = null;
        }
        String A07 = AnonymousClass84O.A07(r10);
        if (objArr != null) {
            A07 = MessageFormat.format(A07, objArr);
        }
        if (A07 == null) {
            return new SpannableStringBuilder();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A07);
        AnonymousClass84O A0J = r10.A0K(43);
        String str = (String) AnonymousClass84O.A05(r10, 40);
        C153427bI r11 = r15;
        if (A0J != null) {
            num = Integer.valueOf(C154127ce.A01(r15, A0J, 0));
        } else {
            if (str != null) {
                try {
                    num = Integer.valueOf(C162407s0.A05(str));
                } catch (AnonymousClass6u2 e) {
                    C159737mN.A00(r15, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse text color %s", new Object[]{str}), e);
                }
            }
            num = null;
        }
        if (num != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, A07.length(), 0);
        }
        String str2 = (String) AnonymousClass84O.A05(r10, 41);
        if (str2 != null) {
            try {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(Math.round(C162407s0.A01(str2))), 0, A07.length(), 0);
            } catch (AnonymousClass6u2 e2) {
                C159737mN.A00(r15, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse text color %s", new Object[]{str}), e2);
            }
        }
        String str3 = (String) AnonymousClass84O.A05(r10, 42);
        if (str3 != null) {
            try {
                spannableStringBuilder.setSpan(new StyleSpan(C162407s0.A09(str3)), 0, A07.length(), 0);
            } catch (AnonymousClass6u2 e3) {
                C159737mN.A00(r15, "WaRcRichTextComponentBinderUtils", String.format("Failed to textStyle  %s", new Object[]{str2}), e3);
            }
        }
        Matcher matcher = A00.matcher(A07);
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            int A01 = C615531h.A01(group.replaceAll("[\\[\\]]", ""), -1);
            if (A01 >= 0 && A01 < r10.A0Q().size()) {
                AnonymousClass84O A0V = AnonymousClass6C9.A0V(r10.A0Q(), A01);
                String str4 = (String) AnonymousClass84O.A05(A0V, 38);
                if (objArr != null) {
                    str4 = MessageFormat.format(str4, objArr);
                }
                int start = matcher.start() + i2;
                if (str4 != null) {
                    int length = str4.length();
                    int length2 = group.length();
                    i2 += length - length2;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                    String str5 = (String) AnonymousClass84O.A05(A0V, 40);
                    if (str5 != null) {
                        try {
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(C162407s0.A05(str5)), i, length, i);
                        } catch (AnonymousClass6u2 unused) {
                            C159737mN.A01("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan color");
                        }
                    }
                    AnonymousClass84O A0J2 = A0V.A0K(44);
                    if (A0J2 != null) {
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(C154127ce.A01(r11, A0J2, i)), 0, length, 0);
                    }
                    String str6 = (String) AnonymousClass84O.A05(A0V, 42);
                    if (str6 != null) {
                        try {
                            spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(Math.round(TypedValue.applyDimension(2, C162407s0.A02(str6), AnonymousClass000.A0B(r11.A00)))), 0, length, 0);
                        } catch (AnonymousClass6u2 unused2) {
                            C159737mN.A01("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan size");
                        }
                    }
                    String str7 = (String) AnonymousClass84O.A05(A0V, 43);
                    if (str7 != null) {
                        try {
                            spannableStringBuilder2.setSpan(new StyleSpan(C162407s0.A09(str7)), 0, length, 0);
                        } catch (AnonymousClass6u2 unused3) {
                            C159737mN.A01("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan textStyle");
                        }
                    }
                    String A06 = AnonymousClass84O.A06(A0V);
                    if (A06 != null) {
                        spannableStringBuilder2.setSpan(new TypefaceSpan(A06), 0, length, 0);
                    }
                    C835248t A0L = A0V.A0L(36);
                    if (A0L != null) {
                        int A062 = C18310x6.A06(num);
                        if (A0J2 != null) {
                            A062 = C154127ce.A01(r11, A0J2, 0);
                        }
                        spannableStringBuilder2.setSpan(r17.BER(new C172708Mj(r10, A0L, r11, 48), A062, -65536, 1711315404), 0, length, 0);
                    }
                    spannableStringBuilder.replace(start, length2 + start, spannableStringBuilder2);
                }
            }
            i = 0;
        }
        return spannableStringBuilder;
    }

    public static void A01(Spannable spannable, AnonymousClass03n r7, C153427bI r8, AnonymousClass84O r9, C186518vU r10) {
        r10.BmV(r7);
        r7.setText(spannable);
        String str = (String) AnonymousClass84O.A05(r9, 38);
        if (str != null) {
            try {
                r7.setGravity(C162407s0.A07(str));
            } catch (AnonymousClass6u2 e) {
                C159737mN.A00(r8, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse text align %s", new Object[]{str}), e);
            }
        }
        String A06 = AnonymousClass84O.A06(r9);
        if (A06 != null) {
            try {
                r7.setLineHeight((int) C162407s0.A01(A06));
            } catch (AnonymousClass6u2 e2) {
                C159737mN.A00(r8, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse line height pixel  %s", new Object[]{A06}), e2);
            }
        }
    }
}
