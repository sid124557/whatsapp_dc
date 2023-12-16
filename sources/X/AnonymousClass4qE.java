package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4qE  reason: invalid class name */
public class AnonymousClass4qE extends C117935sj {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Paint A03;
    public final C620633i A04;
    public final C620733j A05;
    public final AnonymousClass5Y0 A06;
    public final C60152y5 A07;
    public final CharSequence A08;
    public final List A09;

    public AnonymousClass4qE(Context context, Paint paint, C620633i r3, C620733j r4, AnonymousClass5Y0 r5, C60152y5 r6, CharSequence charSequence, List list, int i, int i2) {
        this.A02 = context;
        this.A03 = paint;
        this.A01 = i;
        this.A00 = i2;
        this.A08 = charSequence;
        this.A09 = list;
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
        this.A07 = r6;
    }

    public static List A00(BreakIterator breakIterator, List list, int i, int i2) {
        if (list.size() == 0) {
            return list;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        int min = Math.min(list.size(), 5);
        for (int i3 = 0; i3 < min; i3++) {
            AnonymousClass0PJ r1 = (AnonymousClass0PJ) list.get(i3);
            Number number = (Number) r1.A00;
            C626936e.A06(number);
            Number number2 = (Number) r1.A01;
            C626936e.A06(number2);
            int max = Math.max(0, breakIterator.preceding(AnonymousClass001.A0C(number.intValue(), i, 0)));
            int following = breakIterator.following(Math.min(i2, number2.intValue() + i)) - 1;
            if (following < 0) {
                following = i2;
            }
            AnonymousClass0PJ A0G = AnonymousClass0x9.A0G(Integer.valueOf(max), Integer.valueOf(following));
            if (A0s.size() != 0) {
                int A0M = C86664Kz.A0M(A0s);
                AnonymousClass0PJ r10 = (AnonymousClass0PJ) A0s.get(A0M);
                Object obj = A0G.A00;
                C626936e.A06(obj);
                int A0K = AnonymousClass001.A0K(obj);
                Object obj2 = A0G.A01;
                C626936e.A06(obj2);
                int A0K2 = AnonymousClass001.A0K(obj2);
                Object obj3 = r10.A00;
                C626936e.A06(obj3);
                int A0K3 = AnonymousClass001.A0K(obj3);
                Object obj4 = r10.A01;
                C626936e.A06(obj4);
                int A0K4 = AnonymousClass001.A0K(obj4);
                if ((A0K <= A0K3 && A0K3 <= A0K2) || (A0K3 <= A0K && A0K <= A0K4)) {
                    int min2 = Math.min(A0K, A0K3);
                    int max2 = Math.max(A0K2, A0K4);
                    A0s.remove(A0M);
                    A0G = AnonymousClass0x9.A0G(Integer.valueOf(min2), Integer.valueOf(max2));
                }
            }
            A0s.add(A0G);
        }
        return A0s;
    }

    public final void A01(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, List list) {
        long length = (long) (charSequence.length() - 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0PJ r6 = (AnonymousClass0PJ) it.next();
            this.A00.A02();
            Object obj = r6.A00;
            if (!(obj == null || AnonymousClass001.A0K(obj) == 0)) {
                if (spannableStringBuilder.length() == 0) {
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append("…");
                } else if (!"…".equals(String.valueOf(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1)))) {
                    if (!Character.isWhitespace(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1))) {
                        spannableStringBuilder.append(" ");
                    }
                    spannableStringBuilder.append("…");
                    spannableStringBuilder.append(" ");
                }
            }
            C626936e.A06(obj);
            int A0K = AnonymousClass001.A0K(obj);
            Number number = (Number) r6.A01;
            spannableStringBuilder.append(charSequence.subSequence(A0K, C86664Kz.A0K(number)));
            if (((long) number.intValue()) < length) {
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append("…");
            }
        }
    }
}
