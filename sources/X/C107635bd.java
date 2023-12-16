package X;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5bd  reason: invalid class name and case insensitive filesystem */
public class C107635bd {
    public static Pair A04(TextPaint textPaint, C620633i r12, C60152y5 r13, CharSequence charSequence, int i, int i2, boolean z) {
        boolean z2;
        int i3;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        int A01 = AnonymousClass34G.A01(r12, r13);
        int i4 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        if (A01 < 2011) {
            i4 = 512;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        TextPaint textPaint2 = textPaint;
        float textSize = textPaint.getTextSize();
        Pair A05 = A05(charSequence, i4, true);
        List<C156797hD> list = (List) A05.first;
        List list2 = (List) A05.second;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C156797hD) it.next()).A02 == 6) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        Boolean valueOf2 = Boolean.valueOf(z2);
        if (list2.size() > 0) {
            List A0D = A0D(textPaint2, charSequence2, list, textSize, i4, i, true);
            if (A0D.size() > 0) {
                valueOf2 = Boolean.TRUE;
            }
            A0K(valueOf, A0D);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (C156797hD r3 : list) {
            if (r3.A02 == 6) {
                if (z) {
                    A0H(valueOf, r3, -16777216);
                }
                A0s.add(r3);
            } else {
                if (z) {
                    A0H(valueOf, r3, -16777216);
                } else {
                    A0I(valueOf, r3, list);
                }
                valueOf.setSpan(r3.A04, r3.A00, r3.A01, 17);
            }
        }
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            C156797hD r7 = (C156797hD) it2.next();
            valueOf.setSpan(r7.A04, r7.A00, r7.A01, 17);
            if (!z) {
                int i5 = r7.A00;
                int i6 = r7.A03;
                String str = C58152un.A08;
                valueOf.replace(i5 - i6, i5, str);
                int i7 = r7.A01;
                valueOf.replace(i7, i6 + i7, str);
                i3 = 1;
            } else {
                i3 = 0;
            }
            valueOf.setSpan(new BackgroundColorSpan(i2), r7.A00 - i3, r7.A01 + i3, 17);
        }
        return AnonymousClass0x9.A0C(valueOf, valueOf2);
    }

    public static CharSequence A07(C620633i r2, C60152y5 r3, CharSequence charSequence) {
        return A09(r2, r3, charSequence, -16777216, false);
    }

    public static CharSequence A0A(CharSequence charSequence, float f, int i, int i2, boolean z) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        List list = (List) A05(charSequence, i2, false).first;
        A0K(valueOf, A0D((TextPaint) null, charSequence2, list, f, i2, -16777216, false));
        A0L(valueOf, list, i, z);
        return valueOf;
    }

    public static void A0J(Editable editable, Class cls, int i) {
        Object[] spans = editable.getSpans(0, i, cls);
        if (spans != null) {
            for (Object removeSpan : spans) {
                editable.removeSpan(removeSpan);
            }
        }
    }

    public static CharSequence A08(C620633i r4, C60152y5 r5, CharSequence charSequence, float f) {
        int A01 = AnonymousClass34G.A01(r4, r5);
        int i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        if (A01 < 2011) {
            i = 512;
        }
        return A0A(charSequence, f, -16777216, i, false);
    }

    public static CharSequence A09(C620633i r1, C60152y5 r2, CharSequence charSequence, int i, boolean z) {
        if (charSequence == null) {
            return null;
        }
        int A01 = AnonymousClass34G.A01(r1, r2);
        int i2 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        if (A01 < 2011) {
            i2 = 512;
        }
        List list = (List) A05(charSequence, i2, false).first;
        if (list.isEmpty()) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        A0L(valueOf, list, i, z);
        return valueOf;
    }

    public static String A0B(String str, boolean z) {
        if (str == null) {
            return "";
        }
        if (str.contains("⠀")) {
            str = str.replace("⠀", " ");
        }
        String trim = str.trim();
        if (!z || !C107535bT.A07() || !trim.contains("­")) {
            return trim;
        }
        return trim.replace("­", "");
    }

    public static List A0C(Spannable spannable) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        Object[] spans = spannable.getSpans(0, spannable.length(), URLSpan.class);
        if (spans == null || spans.length == 0) {
            return null;
        }
        ArrayList A0i = AnonymousClass0x2.A0i(spans);
        Collections.sort(A0i, new AnonymousClass91R(spannable, 17));
        int size = A0i.size();
        while (i4 < size - 1) {
            Object obj = A0i.get(i4);
            int i5 = i4 + 1;
            Object obj2 = A0i.get(i5);
            int spanStart = spannable.getSpanStart(obj);
            int spanEnd = spannable.getSpanEnd(obj);
            int spanStart2 = spannable.getSpanStart(obj2);
            int spanEnd2 = spannable.getSpanEnd(obj2);
            if (spanStart <= spanStart2 && spanEnd > spanStart2) {
                if (spanEnd2 <= spanEnd || (i2 = spanEnd - spanStart) > (i3 = spanEnd2 - spanStart2)) {
                    spannable.removeSpan(obj2);
                    i = i5;
                } else if (i2 < i3) {
                    spannable.removeSpan(obj);
                    i = i4;
                }
                if (i != -1) {
                    A0i.remove(i);
                    size--;
                }
            }
            i4 = i5;
        }
        return A0i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075 A[LOOP:0: B:4:0x0035->B:20:0x0075, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e6 A[EDGE_INSN: B:64:0x00e6->B:45:0x00e6 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A0D(android.text.TextPaint r24, java.lang.CharSequence r25, java.util.List r26, float r27, int r28, int r29, boolean r30) {
        /*
            r10 = r30
            r1 = r27
            if (r30 == 0) goto L_0x00df
            X.6pa r9 = new X.6pa
            r9.<init>(r1)
        L_0x000b:
            r0 = 1043207291(0x3e2e147b, float:0.17)
            float r0 = r0 * r27
            int r8 = (int) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r27
            int r7 = (int) r0
            r0 = 1041194025(0x3e0f5c29, float:0.14)
            float r0 = r27 * r0
            int r6 = (int) r0
            r0 = 1072902963(0x3ff33333, float:1.9)
            float r1 = r27 * r0
            int r0 = (int) r1
            r17 = r0
            r12 = r25
            int r5 = r12.length()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r2 = 0
            r1 = -1
            r14 = 0
        L_0x0035:
            r13 = r24
            r11 = r29
            if (r2 >= r5) goto L_0x00e6
            char r15 = r12.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r15)
            X.7hC r16 = A06(r12, r0, r2, r10)
            if (r16 == 0) goto L_0x007c
            java.util.Iterator r15 = r26.iterator()
        L_0x004d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r14 = r15.next()
            X.7hD r14 = (X.C156797hD) r14
            int r1 = r14.A02
            r0 = 1
            if (r1 != r0) goto L_0x004d
            int r0 = r14.A00
            if (r0 >= r2) goto L_0x004d
            int r0 = r14.A01
            if (r0 <= r2) goto L_0x004d
        L_0x0066:
            r1 = -1
            r14 = 0
        L_0x0068:
            int r15 = r26.size()
            int r0 = r4.size()
            int r15 = r15 + r0
            r0 = r28
            if (r15 >= r0) goto L_0x00e6
            int r2 = r2 + 1
            goto L_0x0035
        L_0x0078:
            r14 = r16
            r1 = r2
            goto L_0x0068
        L_0x007c:
            r0 = 10
            if (r15 == r0) goto L_0x0084
            int r0 = r5 + -1
            if (r2 != r0) goto L_0x0068
        L_0x0084:
            if (r14 == 0) goto L_0x0066
            r0 = -1
            if (r1 == r0) goto L_0x0066
            int r15 = r14.A03
            r0 = 2
            if (r15 != r0) goto L_0x0092
            A0N(r9, r4, r1, r2)
            goto L_0x0066
        L_0x0092:
            if (r30 == 0) goto L_0x0066
            if (r24 == 0) goto L_0x00b2
            r0 = 4
            if (r15 != r0) goto L_0x00b2
            int r1 = r14.A03
            if (r1 != r0) goto L_0x00b0
            int r1 = r14.A04
            int r0 = r14.A02
            int r0 = r0 + r1
            int r0 = r0 + 2
            float r0 = android.text.Layout.getDesiredWidth(r12, r1, r0, r13)
        L_0x00a8:
            r14.A00 = r0
            r14.A01 = r2
            r3.add(r14)
            goto L_0x0066
        L_0x00b0:
            r0 = 0
            goto L_0x00a8
        L_0x00b2:
            r0 = 5
            if (r15 != r0) goto L_0x0066
            int r15 = r2 + 1
            android.text.style.ForegroundColorSpan r14 = new android.text.style.ForegroundColorSpan
            r14.<init>(r11)
            X.7hD r0 = new X.7hD
            r0.<init>(r14, r1, r15)
            r4.add(r0)
            r22 = 2
            float r0 = (float) r6
            X.4Mx r14 = new X.4Mx
            r14.<init>(r0, r8, r7, r11)
            r23 = 5
            X.7hD r0 = new X.7hD
            r19 = r14
            r20 = r1
            r21 = r15
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            r4.add(r0)
            goto L_0x0066
        L_0x00df:
            X.7TC r9 = new X.7TC
            r9.<init>(r1)
            goto L_0x000b
        L_0x00e6:
            if (r14 == 0) goto L_0x00f3
            r0 = -1
            if (r1 == r0) goto L_0x00f3
            int r15 = r14.A03
            r0 = 2
            if (r15 != r0) goto L_0x011e
            A0N(r9, r4, r1, r5)
        L_0x00f3:
            java.util.Iterator r3 = r3.iterator()
        L_0x00f7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x015c
            java.lang.Object r2 = r3.next()
            X.7hC r2 = (X.C156787hC) r2
            float r0 = r2.A00
            int r0 = (int) r0
            int r1 = r17 - r0
            int r7 = r2.A04
            int r8 = r2.A01
            X.6EF r6 = new X.6EF
            r0 = r17
            r6.<init>(r1, r0)
            r9 = 2
            r10 = 4
            X.7hD r5 = new X.7hD
            r5.<init>(r6, r7, r8, r9, r10)
            r4.add(r5)
            goto L_0x00f7
        L_0x011e:
            if (r30 == 0) goto L_0x00f3
            if (r24 == 0) goto L_0x0138
            r2 = 4
            if (r15 != r2) goto L_0x0138
            int r1 = r14.A04
            int r0 = r14.A02
            int r0 = r0 + r1
            int r0 = r0 + 2
            float r0 = android.text.Layout.getDesiredWidth(r12, r1, r0, r13)
            r14.A00 = r0
            r14.A01 = r5
            r3.add(r14)
            goto L_0x00f3
        L_0x0138:
            r2 = 5
            if (r15 != r2) goto L_0x00f3
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan
            r9.<init>(r11)
            X.7hD r2 = new X.7hD
            r2.<init>(r9, r1, r5)
            r4.add(r2)
            float r6 = (float) r6
            X.4Mx r2 = new X.4Mx
            r2.<init>(r6, r8, r7, r11)
            r11 = 5
            X.7hD r6 = new X.7hD
            r7 = r2
            r8 = r1
            r9 = r5
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r4.add(r6)
            goto L_0x00f3
        L_0x015c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107635bd.A0D(android.text.TextPaint, java.lang.CharSequence, java.util.List, float, int, int, boolean):java.util.List");
    }

    public static void A0E(Context context, Uri uri, C111095hX r10, C69263Wi r11, TextEmojiLabel textEmojiLabel, C620633i r13, AnonymousClass1VX r14, String str, String str2) {
        A0G(context, r10, r11, textEmojiLabel, r13, r14, str, new C73363fN(str2, uri));
    }

    public static void A0I(Editable editable, C156797hD r5, List list) {
        int i = r5.A00;
        int i2 = r5.A03;
        editable.replace(i - i2, i, "");
        A0O(list, r5.A00 - i2, i2);
        int i3 = r5.A01;
        editable.replace(i3, i2 + i3, "");
        A0O(list, r5.A01, i2);
    }

    public static void A0N(AnonymousClass7TC r8, List list, int i, int i2) {
        int i3 = r8.A02;
        int A00 = r8.A00();
        int i4 = i;
        int i5 = i2;
        list.add(new C156797hD(new LeadingMarginSpan.Standard(i3, (A00 * 2) + i3), i4, i5, 2, 3));
        list.add(new C156797hD(new C87064My(A00, r8.A01), i4, i5, 2, 2));
    }

    public static boolean A0P(C620633i r0, C60152y5 r1, CharSequence charSequence) {
        if (charSequence == null || C107575bX.A0F(A07(r0, r1, charSequence))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (java.lang.Character.codePointAt(r8, r1) != 46) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (java.lang.Character.codePointAt(r8, r6 + 2) != 32) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r8.charAt(r6 + 3) != ' ') goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.CharSequence r8, java.lang.Character r9, int r10) {
        /*
            char r0 = r9.charValue()
            boolean r0 = java.lang.Character.isDigit(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0017
            if (r10 <= 0) goto L_0x0018
            int r0 = r10 + -1
            char r1 = r8.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x001a
        L_0x0017:
            return r7
        L_0x0018:
            if (r10 != 0) goto L_0x0017
        L_0x001a:
            r6 = r10
        L_0x001b:
            int r1 = r6 + 1
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x002f
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x002f
            r6 = r1
            goto L_0x001b
        L_0x002f:
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x003e
            int r1 = java.lang.Character.codePointAt(r8, r1)
            r0 = 46
            r5 = 1
            if (r1 == r0) goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            int r0 = r8.length()
            r4 = 2
            int r0 = r0 - r4
            r1 = 32
            if (r6 >= r0) goto L_0x0052
            int r0 = r6 + 2
            int r0 = java.lang.Character.codePointAt(r8, r0)
            r3 = 1
            if (r0 == r1) goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            int r0 = r8.length()
            int r0 = r0 + -3
            if (r6 >= r0) goto L_0x0066
            int r0 = r6 + 3
            char r2 = r8.charAt(r0)
            r0 = 32
            r1 = 1
            if (r2 == r0) goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            int r6 = r6 - r10
            int r0 = r6 + 1
            if (r0 > r4) goto L_0x0017
            if (r1 != 0) goto L_0x0017
            if (r5 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x0017
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107635bd.A00(java.lang.CharSequence, java.lang.Character, int):int");
    }

    public static Spannable A01(String str) {
        SpannableStringBuilder A00 = C18330xA.A00(str);
        A00.setSpan(new AnonymousClass4N1(), 0, str.length(), 0);
        return A00;
    }

    public static SpannableStringBuilder A02(String str, Map map) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder A00 = C18330xA.A00(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                Object obj = map.get(uRLSpan.getURL());
                if (obj != null) {
                    int spanStart = A00.getSpanStart(uRLSpan);
                    int spanEnd = A00.getSpanEnd(uRLSpan);
                    int spanFlags = A00.getSpanFlags(uRLSpan);
                    A00.removeSpan(uRLSpan);
                    A00.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A00;
    }

    public static SpannableStringBuilder A03(String str, Spannable... spannableArr) {
        SpannableStringBuilder A00 = C18330xA.A00(str);
        int i = 0;
        while (i < spannableArr.length) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("%");
            int i2 = i + 1;
            A0o.append(i2);
            String A0X = AnonymousClass000.A0X("$s", A0o);
            int indexOf = A00.toString().indexOf(A0X);
            if (indexOf != -1) {
                A00.replace(indexOf, C86664Kz.A0L(A0X, indexOf), spannableArr[i]);
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("RichTextUtils/formatSpannableString: skipping placeholder of index ");
                A0o2.append(i2);
                C18260x0.A0r(" as we cannot find it in template: ", str, A0o2);
            }
            i = i2;
        }
        return A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01a5, code lost:
        if (r12 == '`') goto L_0x01a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A05(java.lang.CharSequence r19, int r20, boolean r21) {
        /*
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            r6 = r19
            int r4 = r6.length()
            r3 = 0
            r13 = 32
            r2 = -1
            r10 = -1
            r12 = 32
            r1 = 0
        L_0x0016:
            if (r1 >= r4) goto L_0x01cc
            char r0 = r6.charAt(r1)
            r8 = 42
            if (r0 != r8) goto L_0x0035
            int r8 = r4 + -1
            if (r1 >= r8) goto L_0x0035
            int r8 = r1 + 1
            int r9 = java.lang.Character.codePointAt(r6, r8)
            r8 = 8419(0x20e3, float:1.1798E-41)
            if (r9 == r8) goto L_0x0033
            r8 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r8) goto L_0x0035
        L_0x0033:
            r0 = 32
        L_0x0035:
            r11 = r21
            if (r21 == 0) goto L_0x01aa
            java.lang.Character r8 = java.lang.Character.valueOf(r0)
            X.7hC r8 = A06(r6, r8, r1, r11)
            if (r8 == 0) goto L_0x0046
            r7.add(r8)
        L_0x0046:
            int r8 = r4 + -1
            if (r1 >= r8) goto L_0x01aa
            int r8 = r1 + 1
            char r9 = r6.charAt(r8)
        L_0x0050:
            r19 = r12
            r8 = 42
            if (r0 != r8) goto L_0x018e
            r9 = 0
        L_0x0057:
            java.lang.String r11 = "monospace"
            r8 = r20
            if (r9 < 0) goto L_0x0112
            if (r3 != 0) goto L_0x0066
            r3 = 4
            int[] r3 = new int[r3]
            r13 = -1
            java.util.Arrays.fill(r3, r13)
        L_0x0066:
            r13 = r3[r9]
            if (r13 >= 0) goto L_0x00ad
            if (r12 == r0) goto L_0x00ad
            boolean r13 = java.lang.Character.isWhitespace(r12)
            if (r13 != 0) goto L_0x0096
            r13 = 95
            if (r12 == r13) goto L_0x0096
            r13 = 126(0x7e, float:1.77E-43)
            if (r12 == r13) goto L_0x0096
            r13 = 42
            if (r12 == r13) goto L_0x0096
            r13 = 46
            if (r12 == r13) goto L_0x0096
            r13 = 44
            if (r12 == r13) goto L_0x0096
            r13 = 58
            if (r12 == r13) goto L_0x0096
            r13 = 34
            if (r12 == r13) goto L_0x0096
            r13 = 40
            if (r12 == r13) goto L_0x0096
            r13 = 59
            if (r12 != r13) goto L_0x00ad
        L_0x0096:
            int r11 = r1 + 1
            if (r11 >= r4) goto L_0x00a6
            char r8 = r6.charAt(r11)
            boolean r8 = java.lang.Character.isWhitespace(r8)
            if (r8 != 0) goto L_0x00a6
        L_0x00a4:
            r3[r9] = r11
        L_0x00a6:
            int r1 = r1 + 1
            r12 = r0
            r13 = r19
            goto L_0x0016
        L_0x00ad:
            r13 = r3[r9]
            if (r13 < 0) goto L_0x00a6
            boolean r12 = java.lang.Character.isWhitespace(r12)
            if (r12 != 0) goto L_0x00a6
            int r12 = r4 + -1
            if (r1 == r12) goto L_0x00c7
            int r12 = r1 + 1
            int r12 = java.lang.Character.codePointAt(r6, r12)
            boolean r12 = java.lang.Character.isLetterOrDigit(r12)
            if (r12 != 0) goto L_0x00a6
        L_0x00c7:
            r12 = r3[r9]
            if (r12 >= r1) goto L_0x01d1
            r13 = 3
            if (r9 != r13) goto L_0x00f0
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()
            java.util.Iterator r16 = r5.iterator()
        L_0x00d6:
            boolean r12 = r16.hasNext()
            if (r12 == 0) goto L_0x01ae
            java.lang.Object r13 = r16.next()
            X.7hD r13 = (X.C156797hD) r13
            int r15 = r13.A00
            r12 = r3[r9]
            if (r15 <= r12) goto L_0x00d6
            int r12 = r13.A01
            if (r12 >= r1) goto L_0x00d6
            r14.add(r13)
            goto L_0x00d6
        L_0x00f0:
            r11 = 42
            r13 = 1
            if (r0 == r11) goto L_0x010c
            r11 = 95
            r13 = 2
            if (r0 == r11) goto L_0x010c
            r11 = 126(0x7e, float:1.77E-43)
            if (r0 == r11) goto L_0x0106
            r11 = 0
        L_0x00ff:
            X.7hD r13 = new X.7hD
            r13.<init>(r11, r12, r1)
            goto L_0x01c3
        L_0x0106:
            android.text.style.StrikethroughSpan r11 = new android.text.style.StrikethroughSpan
            r11.<init>()
            goto L_0x00ff
        L_0x010c:
            android.text.style.StyleSpan r11 = new android.text.style.StyleSpan
            r11.<init>(r13)
            goto L_0x00ff
        L_0x0112:
            r9 = 96
            if (r0 != r9) goto L_0x0182
            if (r12 != r9) goto L_0x00a6
            if (r13 != r9) goto L_0x00a6
            if (r10 < 0) goto L_0x0120
            int r9 = r1 + -2
            if (r10 >= r9) goto L_0x00a6
        L_0x0120:
            if (r2 >= 0) goto L_0x0125
            int r2 = r1 + 1
            goto L_0x00a6
        L_0x0125:
            int r9 = r1 + -2
            r13 = r2
            if (r2 < r9) goto L_0x012c
            goto L_0x00a6
        L_0x012c:
            if (r13 >= r9) goto L_0x00a6
            char r12 = r6.charAt(r13)
            boolean r12 = java.lang.Character.isWhitespace(r12)
            if (r12 != 0) goto L_0x016c
            r15 = 3
            android.text.style.TypefaceSpan r12 = new android.text.style.TypefaceSpan
            r12.<init>(r11)
            r16 = 1
            X.7hD r11 = new X.7hD
            r13 = r2
            r14 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r5.add(r11)
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            java.util.Iterator r14 = r5.iterator()
        L_0x0152:
            boolean r10 = r14.hasNext()
            if (r10 == 0) goto L_0x016f
            java.lang.Object r12 = r14.next()
            X.7hD r12 = (X.C156797hD) r12
            int r11 = r12.A00
            int r10 = r2 + -1
            if (r11 <= r10) goto L_0x0152
            int r10 = r12.A01
            if (r10 >= r9) goto L_0x0152
            r13.add(r12)
            goto L_0x0152
        L_0x016c:
            int r13 = r13 + 1
            goto L_0x012c
        L_0x016f:
            r5.removeAll(r13)
            if (r3 == 0) goto L_0x0178
            r2 = -1
            java.util.Arrays.fill(r3, r2)
        L_0x0178:
            int r2 = r5.size()
            if (r2 >= r8) goto L_0x01cc
            r10 = r1
            r2 = -1
            goto L_0x00a6
        L_0x0182:
            r8 = 10
            if (r0 != r8) goto L_0x00a6
            if (r3 == 0) goto L_0x00a6
            r8 = -1
            java.util.Arrays.fill(r3, r8)
            goto L_0x00a6
        L_0x018e:
            r8 = 95
            if (r0 != r8) goto L_0x0195
            r9 = 1
            goto L_0x0057
        L_0x0195:
            r8 = 126(0x7e, float:1.77E-43)
            if (r0 != r8) goto L_0x019c
            r9 = 2
            goto L_0x0057
        L_0x019c:
            if (r21 == 0) goto L_0x01a7
            r8 = 96
            if (r0 != r8) goto L_0x01a7
            if (r9 == r8) goto L_0x01a7
            r9 = 3
            if (r12 != r8) goto L_0x0057
        L_0x01a7:
            r9 = -1
            goto L_0x0057
        L_0x01aa:
            r9 = 32
            goto L_0x0050
        L_0x01ae:
            r5.removeAll(r14)
            r15 = r3[r9]
            android.text.style.TypefaceSpan r14 = new android.text.style.TypefaceSpan
            r14.<init>(r11)
            r17 = 1
            r18 = 6
            X.7hD r13 = new X.7hD
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18)
        L_0x01c3:
            r5.add(r13)
            int r11 = r5.size()
            if (r11 < r8) goto L_0x01d1
        L_0x01cc:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r5, r7)
            return r0
        L_0x01d1:
            r12 = 0
        L_0x01d2:
            int r8 = r3.length
            if (r12 >= r8) goto L_0x01e3
            if (r12 == r9) goto L_0x01e0
            r11 = r3[r9]
            r8 = r3[r12]
            if (r11 >= r8) goto L_0x01e0
            r8 = -1
            r3[r12] = r8
        L_0x01e0:
            int r12 = r12 + 1
            goto L_0x01d2
        L_0x01e3:
            r11 = -1
            r8 = r3[r9]
            if (r8 >= r2) goto L_0x00a4
            r2 = -1
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107635bd.A05(java.lang.CharSequence, int, boolean):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (java.lang.Character.codePointAt(r6, r8 + 1) != 32) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C156787hC A06(java.lang.CharSequence r6, java.lang.Character r7, int r8, boolean r9) {
        /*
            char r4 = r7.charValue()
            r0 = 42
            r5 = 1
            if (r4 == r0) goto L_0x000d
            r0 = 45
            if (r4 != r0) goto L_0x003c
        L_0x000d:
            if (r8 <= 0) goto L_0x0038
            int r0 = r8 + -1
            char r1 = r6.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x003a
        L_0x0019:
            r3 = 0
        L_0x001a:
            int r0 = r6.length()
            int r0 = r0 - r5
            if (r8 >= r0) goto L_0x002c
            int r0 = r8 + 1
            int r2 = java.lang.Character.codePointAt(r6, r0)
            r1 = 32
            r0 = 1
            if (r2 == r1) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x003c
            if (r0 == 0) goto L_0x003c
            r0 = 2
        L_0x0032:
            X.7hC r2 = new X.7hC
            r2.<init>(r0, r8)
            return r2
        L_0x0038:
            if (r8 != 0) goto L_0x0019
        L_0x003a:
            r3 = 1
            goto L_0x001a
        L_0x003c:
            if (r9 == 0) goto L_0x008d
            int r1 = A00(r6, r7, r8)
            if (r1 <= 0) goto L_0x004b
            r0 = 4
            X.7hC r2 = new X.7hC
            r2.<init>(r0, r8, r1)
            return r2
        L_0x004b:
            r0 = 62
            if (r4 != r0) goto L_0x008d
            if (r8 <= 0) goto L_0x0089
            int r0 = r8 + -1
            char r1 = r6.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x008b
        L_0x005b:
            r2 = 0
        L_0x005c:
            int r0 = r6.length()
            int r0 = r0 - r5
            if (r8 >= r0) goto L_0x0087
            int r0 = r8 + 1
            int r1 = java.lang.Character.codePointAt(r6, r0)
            r0 = 32
            if (r1 != r0) goto L_0x0087
        L_0x006d:
            int r1 = r8 + 2
            int r0 = r6.length()
            if (r1 >= r0) goto L_0x0085
            char r0 = r6.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
        L_0x007d:
            if (r2 == 0) goto L_0x008d
            if (r5 == 0) goto L_0x008d
            if (r0 != 0) goto L_0x008d
            r0 = 5
            goto L_0x0032
        L_0x0085:
            r0 = 1
            goto L_0x007d
        L_0x0087:
            r5 = 0
            goto L_0x006d
        L_0x0089:
            if (r8 != 0) goto L_0x005b
        L_0x008b:
            r2 = 1
            goto L_0x005c
        L_0x008d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107635bd.A06(java.lang.CharSequence, java.lang.Character, int, boolean):X.7hC");
    }

    public static void A0F(Context context, Editable editable, TextPaint textPaint, C620633i r12, AnonymousClass5Y0 r13, C60152y5 r14, int i, boolean z) {
        Editable editable2 = editable;
        TextPaint textPaint2 = textPaint;
        C620633i r3 = r12;
        C60152y5 r4 = r14;
        if (z) {
            int A04 = AnonymousClass0Y8.A04(context, i);
            int A042 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
            C18270x1.A11(context, 1, r13);
            C107345b9.A08(context, textPaint, editable, r13, 1.3f);
            A0M(editable, true);
            A04(textPaint2, r3, r4, editable2, A04, A042, true);
            return;
        }
        C18270x1.A11(context, 1, r13);
        C107345b9.A08(context, textPaint, editable, r13, 1.3f);
        A0M(editable, false);
        A09(r12, r14, editable, textPaint.getColor(), true);
    }

    public static void A0G(Context context, C111095hX r11, C69263Wi r12, TextEmojiLabel textEmojiLabel, C620633i r14, AnonymousClass1VX r15, String str, Map map) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (true) {
            C620633i r8 = r14;
            if (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A0t.put(A0w.getKey(), new C88944b3(context, r11, r12, r8, A0w.getValue().toString()));
            } else {
                SpannableStringBuilder A02 = A02(str, A0t);
                AnonymousClass0x2.A14(r15, textEmojiLabel);
                AnonymousClass0x2.A12(textEmojiLabel, r14);
                textEmojiLabel.setText(A02);
                return;
            }
        }
    }

    public static void A0H(Editable editable, C156797hD r6, int i) {
        int i2 = (i & 16777215) | 855638016;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
        int i3 = r6.A00;
        int i4 = r6.A03;
        editable.setSpan(foregroundColorSpan, i3 - i4, i3, 18);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i2);
        int i5 = r6.A01;
        editable.setSpan(foregroundColorSpan2, i5, i4 + i5, 18);
    }

    public static void A0K(Editable editable, List list) {
        AbsoluteSizeSpan absoluteSizeSpan;
        int i;
        int i2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C156797hD r4 = (C156797hD) it.next();
            int i3 = r4.A02;
            if (i3 == 2) {
                absoluteSizeSpan = new AbsoluteSizeSpan(0, false);
                i = r4.A00;
                i2 = i + 1;
            } else if (i3 == 5) {
                absoluteSizeSpan = new AbsoluteSizeSpan(0, false);
                i = r4.A00;
                i2 = i + 2;
            } else {
                editable.setSpan(r4.A04, r4.A00, r4.A01, 33);
            }
            editable.setSpan(absoluteSizeSpan, i, i2, 33);
            editable.setSpan(r4.A04, r4.A00, r4.A01, 33);
        }
    }

    public static void A0L(Editable editable, List list, int i, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C156797hD r0 = (C156797hD) it.next();
            if (z) {
                A0H(editable, r0, i);
            } else {
                A0I(editable, r0, list);
            }
            editable.setSpan(r0.A04, r0.A00, r0.A01, 17);
        }
    }

    public static void A0M(Editable editable, boolean z) {
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class)) {
            if (!(foregroundColorSpan instanceof C179758jf)) {
                editable.removeSpan(foregroundColorSpan);
            }
        }
        A0J(editable, StyleSpan.class, editable.length());
        A0J(editable, StrikethroughSpan.class, editable.length());
        A0J(editable, TypefaceSpan.class, editable.length());
        A0J(editable, C87064My.class, editable.length());
        A0J(editable, LeadingMarginSpan.Standard.class, editable.length());
        A0J(editable, AbsoluteSizeSpan.class, editable.length());
        if (z) {
            A0J(editable, BackgroundColorSpan.class, editable.length());
        }
    }

    public static void A0O(List list, int i, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C156797hD r1 = (C156797hD) it.next();
            int i3 = r1.A00;
            if (i3 > i) {
                r1.A00 = i3 - i2;
            }
            int i4 = r1.A01;
            if (i4 > i) {
                r1.A01 = i4 - i2;
            }
        }
    }
}
