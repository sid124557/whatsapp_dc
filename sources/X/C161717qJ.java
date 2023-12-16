package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.7qJ  reason: invalid class name and case insensitive filesystem */
public class C161717qJ {
    public static final C04840Qw A07 = new C04840Qw(100);
    public int A00 = Integer.MAX_VALUE;
    public int A01 = 2;
    public int A02 = 0;
    public int A03 = 2;
    public Layout A04 = null;
    public boolean A05 = true;
    public final AnonymousClass7XQ A06 = new AnonymousClass7XQ();

    public static StaticLayout A00(Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, C15770ru r16, CharSequence charSequence, float f, float f2, int i, int i2, int i3, int i4, boolean z) {
        Layout.Alignment alignment2 = alignment;
        TextPaint textPaint2 = textPaint;
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        CharSequence charSequence2 = charSequence;
        float f3 = f;
        float f4 = f2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        boolean z2 = z;
        try {
            return new StaticLayout(charSequence2, 0, i5, textPaint2, i6, alignment2, A01(r16), f3, f4, z2, truncateAt2, i7, i8);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence2, 0, i5, textPaint2, i6, alignment2, A01(r16), f3, f4, z2, truncateAt2, i7, i8);
            }
            throw e;
        }
    }

    public static TextDirectionHeuristic A01(C15770ru r1) {
        if (r1 == AnonymousClass0K7.A04) {
            return TextDirectionHeuristics.LTR;
        }
        if (r1 == AnonymousClass0K7.A05) {
            return TextDirectionHeuristics.RTL;
        }
        if (r1 != AnonymousClass0K7.A01) {
            if (r1 == AnonymousClass0K7.A02) {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            if (r1 == AnonymousClass0K7.A00) {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            if (r1 == AnonymousClass0K7.A03) {
                return TextDirectionHeuristics.LOCALE;
            }
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01b4, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01a8, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01a8, code lost:
        r2 = A00(r33, r34, r6, r29, r21, r32, r31, r24, r7, r7, r8, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ff, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cb, code lost:
        r4 = android.text.StaticLayout.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r3 = r4.getDeclaredField("mLines");
        r3.setAccessible(true);
        r1 = r4.getDeclaredField("mColumns");
        r1.setAccessible(true);
        r13 = (int[]) r3.get(r2);
        r12 = r1.getInt(r2);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ea, code lost:
        if (r6 >= r12) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ec, code lost:
        r5 = (r12 * r14) + r6;
        r4 = r5 + r12;
        r3 = r13[r5];
        r13[r5] = r13[r4];
        r13[r4] = r3;
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fe, code lost:
        r1 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0231 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x028b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0189 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.Layout A02() {
        /*
            r35 = this;
            r11 = r35
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            android.text.Layout r0 = r11.A04
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            X.7XQ r10 = r11.A06
            java.lang.CharSequence r0 = r10.A0I
            r23 = 0
            if (r0 == 0) goto L_0x001d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001e
            boolean r0 = r10.A0L
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            return r23
        L_0x001e:
            boolean r0 = r11.A05
            r9 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r1 = r10.A0I
            boolean r0 = r1 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x003e
            r3 = r1
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r1 = r1.length()
            int r1 = r1 - r2
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r3.getSpans(r9, r1, r0)
            android.text.style.ClickableSpan[] r0 = (android.text.style.ClickableSpan[]) r0
            int r0 = r0.length
            if (r0 <= 0) goto L_0x003e
            r9 = 1
        L_0x003e:
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x0057
            if (r9 != 0) goto L_0x0057
            int r16 = r10.hashCode()
            X.0Qw r1 = A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r1.A04(r0)
            android.text.Layout r0 = (android.text.Layout) r0
            if (r0 == 0) goto L_0x0059
            return r0
        L_0x0057:
            r16 = -1
        L_0x0059:
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x0061
            r8 = 1
        L_0x005e:
            if (r8 != r2) goto L_0x0075
            goto L_0x0064
        L_0x0061:
            int r8 = r10.A0A
            goto L_0x005e
        L_0x0064:
            java.lang.CharSequence r1 = r10.A0I     // Catch:{ NullPointerException -> 0x006d }
            android.text.TextPaint r0 = r10.A0F     // Catch:{ NullPointerException -> 0x006d }
            android.text.BoringLayout$Metrics r23 = android.text.BoringLayout.isBoring(r1, r0)     // Catch:{ NullPointerException -> 0x006d }
            goto L_0x0075
        L_0x006d:
            r3 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0075
            throw r3
        L_0x0075:
            int r0 = r10.A0B
            if (r0 == 0) goto L_0x02c6
            if (r0 == r2) goto L_0x02c2
            java.lang.CharSequence r1 = r10.A0I
            android.text.TextPaint r0 = r10.A0F
            float r0 = android.text.Layout.getDesiredWidth(r1, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            int r0 = r10.A0C
            int r3 = java.lang.Math.min(r3, r0)
        L_0x008f:
            android.text.TextPaint r1 = r10.A0F
            r0 = 0
            int r0 = r1.getFontMetricsInt(r0)
            float r0 = (float) r0
            float r6 = r10.A05
            float r0 = r0 * r6
            float r5 = r10.A04
            float r0 = r0 + r5
            int r4 = java.lang.Math.round(r0)
            int r1 = r11.A01
            int r0 = r11.A00
            if (r1 != r2) goto L_0x00a8
            int r0 = r0 * r4
        L_0x00a8:
            int r3 = java.lang.Math.min(r3, r0)
            int r1 = r11.A03
            int r0 = r11.A02
            if (r1 != r2) goto L_0x00b3
            int r0 = r0 * r4
        L_0x00b3:
            int r7 = java.lang.Math.max(r3, r0)
            if (r23 == 0) goto L_0x00ee
            java.lang.CharSequence r4 = r10.A0I
            android.text.TextPaint r3 = r10.A0F
            android.text.Layout$Alignment r2 = r10.A0E
            boolean r1 = r10.A0J
            android.text.TextUtils$TruncateAt r0 = r10.A0G
            r26 = r7
            r18 = r3
            r19 = r7
            r20 = r2
            r21 = r6
            r22 = r5
            r24 = r1
            r25 = r0
            r17 = r4
            android.text.BoringLayout r2 = android.text.BoringLayout.make(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00d9:
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x00ea
            if (r9 != 0) goto L_0x00ea
            r11.A04 = r2
            X.0Qw r1 = A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A08(r0, r2)
        L_0x00ea:
            r0 = 1
            r10.A0K = r0
            return r2
        L_0x00ee:
            java.lang.CharSequence r13 = r10.A0I     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            int r12 = r13.length()     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            android.text.TextPaint r0 = r10.A0F     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r34 = r0
            android.text.Layout$Alignment r0 = r10.A0E     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r33 = r0
            float r0 = r10.A05     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r32 = r0
            float r0 = r10.A04     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r31 = r0
            boolean r0 = r10.A0J     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r30 = r0
            android.text.TextUtils$TruncateAt r6 = r10.A0G     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            X.0ru r0 = r10.A0H     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r29 = r0
            int r14 = r10.A06     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            int r5 = r10.A07     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            int r4 = r10.A08     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            boolean r3 = r10.A0N     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r0 = 0
            r2 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r15 = 23
            if (r1 < r15) goto L_0x016c
            r15 = r34
            android.text.StaticLayout$Builder r12 = android.text.StaticLayout.Builder.obtain(r13, r0, r12, r15, r7)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r0 = r33
            android.text.StaticLayout$Builder r13 = r12.setAlignment(r0)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r12 = r31
            r0 = r32
            android.text.StaticLayout$Builder r12 = r13.setLineSpacing(r12, r0)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r0 = r30
            android.text.StaticLayout$Builder r0 = r12.setIncludePad(r0)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            android.text.StaticLayout$Builder r0 = r0.setEllipsize(r6)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            android.text.StaticLayout$Builder r0 = r0.setEllipsizedWidth(r7)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            android.text.StaticLayout$Builder r6 = r0.setMaxLines(r8)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            android.text.TextDirectionHeuristic r0 = A01(r29)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            android.text.StaticLayout$Builder r0 = r6.setTextDirection(r0)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            android.text.StaticLayout$Builder r0 = r0.setBreakStrategy(r14)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            android.text.StaticLayout$Builder r0 = r0.setHyphenationFrequency(r5)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            android.text.StaticLayout$Builder r2 = r0.setIndents(r2, r2)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r0 = 26
            if (r1 < r0) goto L_0x0166
            r2.setJustificationMode(r4)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r0 = 28
            if (r1 < r0) goto L_0x0166
            r2.setUseLineSpacingFromFallbacks(r3)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
        L_0x0166:
            android.text.StaticLayout r2 = r2.build()     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            goto L_0x00d9
        L_0x016c:
            r26 = r7
            r21 = r13
            r22 = r32
            r23 = r31
            r24 = r12
            r25 = r7
            r27 = r8
            r28 = r30
            r17 = r33
            r18 = r34
            r19 = r6
            r20 = r29
            android.text.StaticLayout r2 = A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ LinkageError -> 0x0189 }
            goto L_0x01a6
        L_0x0189:
            android.text.StaticLayout r2 = new android.text.StaticLayout     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r28 = r7
            r17 = r2
            r18 = r13
            r19 = r0
            r20 = r12
            r21 = r34
            r22 = r7
            r23 = r33
            r24 = r32
            r25 = r31
            r26 = r30
            r27 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
        L_0x01a6:
            if (r8 <= 0) goto L_0x01b4
        L_0x01a8:
            int r1 = r2.getLineCount()     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            if (r1 <= r8) goto L_0x01b4
            int r3 = r2.getLineStart(r8)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            if (r3 < r12) goto L_0x0202
        L_0x01b4:
            int r4 = r2.getLineStart(r0)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            int r3 = r2.getLineCount()     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r14 = 0
        L_0x01bd:
            r5 = 1
            if (r14 >= r3) goto L_0x01fc
            int r1 = r2.getLineEnd(r14)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            if (r1 >= r4) goto L_0x01c7
            goto L_0x01cb
        L_0x01c7:
            int r14 = r14 + 1
            r4 = r1
            goto L_0x01bd
        L_0x01cb:
            java.lang.Class<android.text.StaticLayout> r4 = android.text.StaticLayout.class
            java.lang.String r1 = "mLines"
            java.lang.reflect.Field r3 = r4.getDeclaredField(r1)     // Catch:{ Exception -> 0x01fc }
            r3.setAccessible(r5)     // Catch:{ Exception -> 0x01fc }
            java.lang.String r1 = "mColumns"
            java.lang.reflect.Field r1 = r4.getDeclaredField(r1)     // Catch:{ Exception -> 0x01fc }
            r1.setAccessible(r5)     // Catch:{ Exception -> 0x01fc }
            java.lang.Object r13 = r3.get(r2)     // Catch:{ Exception -> 0x01fc }
            int[] r13 = (int[]) r13     // Catch:{ Exception -> 0x01fc }
            int r12 = r1.getInt(r2)     // Catch:{ Exception -> 0x01fc }
            r6 = 0
        L_0x01ea:
            if (r6 >= r12) goto L_0x01fe
            int r5 = r12 * r14
            int r5 = r5 + r6
            int r4 = r5 + r12
            r3 = r13[r5]     // Catch:{ Exception -> 0x01fc }
            r1 = r13[r4]     // Catch:{ Exception -> 0x01fc }
            r13[r5] = r1     // Catch:{ Exception -> 0x01fc }
            r13[r4] = r3     // Catch:{ Exception -> 0x01fc }
            int r6 = r6 + 1
            goto L_0x01ea
        L_0x01fc:
            r1 = 1
            goto L_0x01ff
        L_0x01fe:
            r1 = 0
        L_0x01ff:
            if (r1 != 0) goto L_0x00d9
            goto L_0x01b4
        L_0x0202:
            if (r3 <= r0) goto L_0x0213
            int r1 = r3 + -1
            char r1 = r13.charAt(r1)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            boolean r1 = java.lang.Character.isSpace(r1)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            if (r1 == 0) goto L_0x0213
            int r3 = r3 + -1
            goto L_0x0202
        L_0x0213:
            r12 = r3
            r26 = r7
            r21 = r13
            r22 = r32
            r23 = r31
            r24 = r3
            r25 = r7
            r27 = r8
            r28 = r30
            r17 = r33
            r18 = r34
            r19 = r6
            r20 = r29
            android.text.StaticLayout r2 = A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ LinkageError -> 0x0231 }
            goto L_0x024e
        L_0x0231:
            android.text.StaticLayout r2 = new android.text.StaticLayout     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r28 = r7
            r17 = r2
            r18 = r13
            r19 = r0
            r20 = r3
            r21 = r34
            r22 = r7
            r23 = r33
            r24 = r32
            r25 = r31
            r26 = r30
            r27 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
        L_0x024e:
            int r1 = r2.getLineCount()     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            if (r1 < r8) goto L_0x01a8
            int r1 = r8 + -1
            int r1 = r2.getEllipsisCount(r1)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            if (r1 != 0) goto L_0x01a8
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            java.lang.CharSequence r1 = r13.subSequence(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r2.append(r1)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            java.lang.String r1 = " …"
            java.lang.String r21 = X.AnonymousClass000.A0X(r1, r2)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            int r24 = r21.length()     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r26 = r7
            r22 = r32
            r23 = r31
            r25 = r7
            r27 = r8
            r28 = r30
            r17 = r33
            r18 = r34
            r19 = r6
            r20 = r29
            android.text.StaticLayout r2 = A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ LinkageError -> 0x028b }
            goto L_0x01a8
        L_0x028b:
            android.text.StaticLayout r2 = new android.text.StaticLayout     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r28 = r7
            r17 = r2
            r18 = r21
            r19 = r0
            r20 = r24
            r21 = r34
            r22 = r7
            r23 = r33
            r24 = r32
            r25 = r31
            r26 = r30
            r27 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            goto L_0x01a8
        L_0x02aa:
            r2 = move-exception
            java.lang.CharSequence r0 = r10.A0I
            boolean r0 = r0 instanceof java.lang.String
            if (r0 != 0) goto L_0x02d6
            java.lang.String r1 = "TextLayoutBuilder"
            java.lang.String r0 = "Hit bug #35412, retrying with Spannables removed"
            android.util.Log.e(r1, r0, r2)
            java.lang.CharSequence r0 = r10.A0I
            java.lang.String r0 = r0.toString()
            r10.A0I = r0
            goto L_0x00ee
        L_0x02c2:
            int r3 = r10.A0C
            goto L_0x008f
        L_0x02c6:
            java.lang.CharSequence r1 = r10.A0I
            android.text.TextPaint r0 = r10.A0F
            float r0 = android.text.Layout.getDesiredWidth(r1, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            goto L_0x008f
        L_0x02d6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161717qJ.A02():android.text.Layout");
    }

    public void A03(int i) {
        AnonymousClass7XQ r1 = this.A06;
        if (r1.A07 != i) {
            r1.A07 = i;
            if (Build.VERSION.SDK_INT >= 23) {
                this.A04 = null;
            }
        }
    }

    public void A04(int i) {
        AnonymousClass7XQ r1 = this.A06;
        if (r1.A08 != i) {
            r1.A08 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                this.A04 = null;
            }
        }
    }
}
