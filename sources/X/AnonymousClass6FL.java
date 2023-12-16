package X;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6FL  reason: invalid class name */
public final class AnonymousClass6FL extends FrameLayout implements C180758la {
    public float A00 = 0.08f;
    public float A01 = 0.0533f;
    public C156877hM A02 = C156877hM.A06;
    public List A03 = Collections.emptyList();
    public final WebView A04;
    public final C124916Ek A05;

    public AnonymousClass6FL(Context context) {
        super(context, (AttributeSet) null);
        C124916Ek r1 = new C124916Ek(context, (AttributeSet) null);
        this.A05 = r1;
        AnonymousClass6F7 r0 = new AnonymousClass6F7(context, this);
        this.A04 = r0;
        r0.setBackgroundColor(0);
        addView(r1);
        addView(r0);
    }

    public static String A00(int i) {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, Color.red(i));
        AnonymousClass000.A1M(objArr, Color.green(i));
        AnonymousClass000.A1N(objArr, Color.blue(i));
        objArr[3] = Double.valueOf(((double) Color.alpha(i)) / 255.0d);
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public void BrX(C156877hM r10, List list, float f, float f2, int i) {
        C156877hM r4 = r10;
        this.A02 = r10;
        float f3 = f;
        this.A01 = f;
        float f4 = f2;
        this.A00 = f2;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C157037hc r1 = (C157037hc) list.get(i2);
            if (r1.A0C != null) {
                A0s.add(r1);
            } else {
                A0s2.add(r1);
            }
        }
        if (!this.A03.isEmpty() || !A0s2.isEmpty()) {
            this.A03 = A0s2;
            A03();
        }
        this.A05.BrX(r4, A0s, f3, f4, 0);
        invalidate();
    }

    public static String A01(CharSequence charSequence) {
        return C1455876l.A00.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(float r5, int r6) {
        /*
            r4 = this;
            int r3 = r4.getHeight()
            int r1 = r4.getHeight()
            int r0 = r4.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r4.getPaddingBottom()
            int r1 = r1 - r0
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            float r1 = (float) r1
            if (r6 == 0) goto L_0x0026
            r0 = 1
            float r1 = (float) r3
            if (r6 == r0) goto L_0x0026
            r0 = 2
            if (r6 == r0) goto L_0x0027
        L_0x0023:
            java.lang.String r0 = "unset"
            return r0
        L_0x0026:
            float r5 = r5 * r1
        L_0x0027:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            android.content.Context r0 = r4.getContext()
            float r0 = X.C86604Kt.A00(r0)
            float r5 = r5 / r0
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            r0 = 0
            X.AnonymousClass001.A1P(r2, r5, r0)
            java.lang.String r1 = "%.2fpx"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FL.A02(float, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02bc, code lost:
        if (((android.text.style.TypefaceSpan) r2).getFamily() != null) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04de, code lost:
        if (r3 != false) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04e1, code lost:
        if (r3 != false) goto L_0x04e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04e3, code lost:
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04e5, code lost:
        r22 = r21;
        r0 = 2;
        r21 = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r39 = this;
            java.lang.StringBuilder r18 = X.AnonymousClass001.A0o()
            r0 = 4
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r11 = r39
            X.7hM r0 = r11.A02
            int r0 = r0.A03
            java.lang.String r0 = A00(r0)
            r10 = 0
            r4[r10] = r0
            float r0 = r11.A01
            java.lang.String r0 = r11.A02(r0, r10)
            r1 = 1
            r4[r1] = r0
            r14 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            r0 = 2
            r4[r0] = r2
            X.7hM r5 = r11.A02
            int r2 = r5.A02
            if (r2 == r1) goto L_0x0559
            if (r2 == r0) goto L_0x054c
            r0 = 3
            if (r2 == r0) goto L_0x0566
            r0 = 4
            if (r2 == r0) goto L_0x053f
            java.lang.String r2 = "unset"
        L_0x0037:
            r0 = 3
            r4[r0] = r2
            java.lang.String r0 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2fem;text-shadow:%s;'>"
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r9, r0, r4)
            r0 = r18
            r0.append(r2)
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            java.lang.String r26 = "default_bg"
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r25 = "."
            r0 = r25
            r2.append(r0)
            r0 = r26
            r2.append(r0)
            java.lang.String r27 = ",."
            r0 = r27
            r2.append(r0)
            r0 = r26
            r2.append(r0)
            java.lang.String r28 = " *"
            r0 = r28
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            X.7hM r0 = r11.A02
            int r0 = r0.A00
            java.lang.String r0 = A00(r0)
            r3[r10] = r0
            java.lang.String r29 = "background-color:%s;"
            r0 = r29
            java.lang.String r0 = java.lang.String.format(r9, r0, r3)
            r8.put(r2, r0)
            r30 = 0
        L_0x008a:
            java.util.List r0 = r11.A03
            int r2 = r0.size()
            r0 = r30
            if (r0 >= r2) goto L_0x057a
            java.util.List r2 = r11.A03
            java.lang.Object r7 = r2.get(r0)
            X.7hc r7 = (X.C157037hc) r7
            float r0 = r7.A02
            r35 = r0
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r13 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x053b
            float r35 = r35 * r13
        L_0x00ab:
            int r2 = r7.A08
            if (r2 == r1) goto L_0x0537
            r0 = 2
            r12 = -100
            if (r2 == r0) goto L_0x00b5
            r12 = 0
        L_0x00b5:
            float r6 = r7.A01
            r5 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r4 = "%.2f%%"
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0526
            int r0 = r7.A07
            if (r0 == r1) goto L_0x0506
            java.lang.Object[] r0 = new java.lang.Object[r1]
            float r6 = r6 * r13
            X.AnonymousClass001.A1P(r0, r6, r10)
            java.lang.String r34 = java.lang.String.format(r9, r4, r0)
            int r3 = r7.A0A
            int r2 = r7.A06
            if (r2 == r1) goto L_0x0502
            r0 = 2
            if (r2 != r0) goto L_0x00d8
            r10 = -100
        L_0x00d8:
            if (r3 != r1) goto L_0x00db
            int r10 = -r10
        L_0x00db:
            r3 = 0
        L_0x00dc:
            float r0 = r7.A04
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x04fe
            java.lang.Object[] r2 = new java.lang.Object[r1]
            float r0 = r0 * r13
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.String r33 = java.lang.String.format(r9, r4, r2)
        L_0x00f3:
            android.text.Layout$Alignment r1 = r7.A0D
            java.lang.String r32 = "center"
            if (r1 == 0) goto L_0x0107
            int[] r0 = X.C1455976m.A00
            int r1 = X.AnonymousClass6CA.A04(r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x04fa
            r0 = 2
            if (r1 != r0) goto L_0x0107
            java.lang.String r32 = "end"
        L_0x0107:
            int r6 = r7.A0A
            r0 = 1
            if (r6 == r0) goto L_0x04f6
            r0 = 2
            if (r6 == r0) goto L_0x04f2
            java.lang.String r31 = "horizontal-tb"
        L_0x0111:
            int r1 = r7.A09
            float r0 = r7.A05
            java.lang.String r24 = r11.A02(r0, r1)
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x04ec
            int r0 = r7.A0B
        L_0x011f:
            java.lang.String r23 = A00(r0)
            java.lang.String r1 = "right"
            java.lang.String r22 = "left"
            java.lang.String r21 = "top"
            r0 = 1
            if (r6 == r0) goto L_0x04e1
            r0 = 2
            if (r6 == r0) goto L_0x04de
            if (r3 == 0) goto L_0x0133
            java.lang.String r21 = "bottom"
        L_0x0133:
            if (r6 == r0) goto L_0x04d7
            r0 = 1
            if (r6 == r0) goto L_0x04d7
            java.lang.String r20 = "width"
            r38 = r12
        L_0x013c:
            java.lang.CharSequence r12 = r7.A0E
            android.content.Context r0 = r11.getContext()
            float r19 = X.C86604Kt.A00(r0)
            if (r12 != 0) goto L_0x0205
            java.lang.String r1 = ""
        L_0x014a:
            X.8OQ r0 = X.AnonymousClass8OQ.of()
            X.7GB r4 = new X.7GB
            r4.<init>(r1, r0)
        L_0x0153:
            java.util.Iterator r3 = X.C18290x4.A11(r8)
        L_0x0157:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r2 = r3.next()
            java.lang.Object r0 = r8.get(r2)
            java.lang.Object r1 = r8.put(r2, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0178
            java.lang.Object r0 = r8.get(r2)
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0179
        L_0x0178:
            r0 = 1
        L_0x0179:
            X.C161487pm.A04(r0)
            goto L_0x0157
        L_0x017d:
            r1 = 13
            r0 = r22
            java.lang.Object[] r5 = X.AnonymousClass6C9.A1Z(r0, r1)
            java.lang.Float r3 = java.lang.Float.valueOf(r35)
            r2 = r21
            r1 = r20
            r0 = r34
            X.AnonymousClass000.A11(r3, r2, r0, r1, r5)
            r3 = r33
            r2 = r32
            r1 = r31
            r0 = r24
            X.AnonymousClass000.A12(r3, r2, r1, r0, r5)
            r0 = 9
            r5[r0] = r23
            r1 = 10
            r0 = r38
            X.AnonymousClass000.A1P(r5, r0, r1)
            r0 = 11
            X.AnonymousClass000.A1P(r5, r10, r0)
            r10 = 12
            float r3 = r7.A03
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0202
            r2 = 1
            r1 = 2
            if (r6 == r1) goto L_0x01ff
            if (r6 == r2) goto L_0x01ff
            java.lang.String r0 = "skewX"
        L_0x01be:
            java.lang.Object[] r1 = X.AnonymousClass6C9.A1Z(r0, r1)
            X.AnonymousClass001.A1P(r1, r3, r2)
            java.lang.String r0 = "%s(%.2fdeg)"
            java.lang.String r0 = java.lang.String.format(r9, r0, r1)
        L_0x01cb:
            r5[r10] = r0
            java.lang.String r0 = "<div style='position:absolute;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r1 = java.lang.String.format(r9, r0, r5)
            r0 = r18
            r0.append(r1)
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r26)
            java.lang.String r0 = "<span class='%s'>"
            java.lang.String r1 = java.lang.String.format(r9, r0, r1)
            r0 = r18
            r0.append(r1)
            java.lang.String r1 = r4.A00
            r0.append(r1)
            java.lang.String r1 = "</span>"
            r0.append(r1)
            java.lang.String r1 = "</div>"
            r0.append(r1)
            int r30 = r30 + 1
            r14 = 1067030938(0x3f99999a, float:1.2)
            r10 = 0
            r1 = 1
            goto L_0x008a
        L_0x01ff:
            java.lang.String r0 = "skewY"
            goto L_0x01be
        L_0x0202:
            java.lang.String r0 = ""
            goto L_0x01cb
        L_0x0205:
            boolean r0 = r12 instanceof android.text.Spanned
            if (r0 != 0) goto L_0x020f
            java.lang.String r1 = A01(r12)
            goto L_0x014a
        L_0x020f:
            android.text.Spanned r12 = (android.text.Spanned) r12
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            int r1 = r12.length()
            java.lang.Class<android.text.style.BackgroundColorSpan> r0 = android.text.style.BackgroundColorSpan.class
            r5 = 0
            java.lang.Object[] r3 = r12.getSpans(r5, r1, r0)
            android.text.style.BackgroundColorSpan[] r3 = (android.text.style.BackgroundColorSpan[]) r3
            int r2 = r3.length
            r1 = 0
        L_0x0224:
            if (r1 >= r2) goto L_0x0232
            r0 = r3[r1]
            int r0 = r0.getBackgroundColor()
            X.C18270x1.A1K(r4, r0)
            int r1 = r1 + 1
            goto L_0x0224
        L_0x0232:
            java.util.HashMap r17 = X.AnonymousClass001.A0t()
            java.util.Iterator r13 = r4.iterator()
        L_0x023a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0272
            int r4 = X.C18280x3.A05(r13)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "bg_"
            java.lang.String r3 = X.AnonymousClass000.A0Y(r0, r1, r4)
            r0 = r25
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0m(r0, r3)
            r1 = r27
            r0 = r28
            java.lang.String r2 = X.AnonymousClass000.A0U(r1, r3, r0, r2)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            java.lang.String r0 = A00(r4)
            r1[r5] = r0
            r0 = r29
            java.lang.String r1 = java.lang.String.format(r9, r0, r1)
            r0 = r17
            r0.put(r2, r1)
            goto L_0x023a
        L_0x0272:
            android.util.SparseArray r4 = X.AnonymousClass6CA.A0I()
            int r1 = r12.length()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r3 = 0
            java.lang.Object[] r16 = r12.getSpans(r5, r1, r0)
            r0 = r16
            int r0 = r0.length
            r37 = r0
        L_0x0286:
            r0 = r37
            if (r3 >= r0) goto L_0x045c
            r2 = r16[r3]
            boolean r0 = r2 instanceof android.text.style.StrikethroughSpan
            if (r0 == 0) goto L_0x0345
            java.lang.String r14 = "<span style='text-decoration:line-through;'>"
        L_0x0292:
            boolean r0 = r2 instanceof android.text.style.StrikethroughSpan
            java.lang.String r1 = "</span>"
            if (r0 != 0) goto L_0x02be
            boolean r0 = r2 instanceof android.text.style.ForegroundColorSpan
            if (r0 != 0) goto L_0x02be
            boolean r0 = r2 instanceof android.text.style.BackgroundColorSpan
            if (r0 != 0) goto L_0x02be
            boolean r0 = r2 instanceof X.AnonymousClass72D
            if (r0 != 0) goto L_0x02be
            boolean r0 = r2 instanceof android.text.style.AbsoluteSizeSpan
            if (r0 != 0) goto L_0x02be
            boolean r0 = r2 instanceof android.text.style.RelativeSizeSpan
            if (r0 != 0) goto L_0x02be
            boolean r0 = r2 instanceof X.C148667Jg
            if (r0 != 0) goto L_0x02be
            boolean r0 = r2 instanceof android.text.style.TypefaceSpan
            r13 = 0
            if (r0 == 0) goto L_0x02fd
            r0 = r2
            android.text.style.TypefaceSpan r0 = (android.text.style.TypefaceSpan) r0
            java.lang.String r0 = r0.getFamily()
            if (r0 == 0) goto L_0x0342
        L_0x02be:
            int r0 = r12.getSpanStart(r2)
            int r13 = r12.getSpanEnd(r2)
            if (r14 == 0) goto L_0x02fa
            r1.getClass()
            X.7h1 r2 = new X.7h1
            r2.<init>(r0, r13, r14, r1)
            java.lang.Object r1 = r4.get(r0)
            X.7GC r1 = (X.AnonymousClass7GC) r1
            if (r1 != 0) goto L_0x02e0
            X.7GC r1 = new X.7GC
            r1.<init>()
            r4.put(r0, r1)
        L_0x02e0:
            java.util.List r0 = r1.A00
            r0.add(r2)
            java.lang.Object r0 = r4.get(r13)
            X.7GC r0 = (X.AnonymousClass7GC) r0
            if (r0 != 0) goto L_0x02f5
            X.7GC r0 = new X.7GC
            r0.<init>()
            r4.put(r13, r0)
        L_0x02f5:
            java.util.List r0 = r0.A01
            r0.add(r2)
        L_0x02fa:
            int r3 = r3 + 1
            goto L_0x0286
        L_0x02fd:
            boolean r0 = r2 instanceof android.text.style.StyleSpan
            if (r0 == 0) goto L_0x031a
            r0 = r2
            android.text.style.StyleSpan r0 = (android.text.style.StyleSpan) r0
            int r1 = r0.getStyle()
            r0 = 1
            if (r1 == r0) goto L_0x0317
            r0 = 2
            if (r1 == r0) goto L_0x0314
            r0 = 3
            if (r1 != r0) goto L_0x0342
            java.lang.String r1 = "</i></b>"
            goto L_0x02be
        L_0x0314:
            java.lang.String r1 = "</i>"
            goto L_0x02be
        L_0x0317:
            java.lang.String r1 = "</b>"
            goto L_0x02be
        L_0x031a:
            boolean r0 = r2 instanceof X.AnonymousClass7G8
            if (r0 == 0) goto L_0x033a
            r13 = r2
            X.7G8 r13 = (X.AnonymousClass7G8) r13
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "<rt>"
            r1.append(r0)
            java.lang.String r0 = r13.A01
            java.lang.String r0 = A01(r0)
            r1.append(r0)
            java.lang.String r0 = "</rt></ruby>"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x02be
        L_0x033a:
            boolean r0 = r2 instanceof android.text.style.UnderlineSpan
            if (r0 == 0) goto L_0x0342
            java.lang.String r1 = "</u>"
            goto L_0x02be
        L_0x0342:
            r1 = r13
            goto L_0x02be
        L_0x0345:
            boolean r0 = r2 instanceof android.text.style.ForegroundColorSpan
            r13 = 1
            if (r0 == 0) goto L_0x0361
            r0 = r2
            android.text.style.ForegroundColorSpan r0 = (android.text.style.ForegroundColorSpan) r0
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r0 = r0.getForegroundColor()
            java.lang.String r0 = A00(r0)
            r13[r5] = r0
            java.lang.String r0 = "<span style='color:%s;'>"
        L_0x035b:
            java.lang.String r14 = java.lang.String.format(r9, r0, r13)
            goto L_0x0292
        L_0x0361:
            boolean r0 = r2 instanceof android.text.style.BackgroundColorSpan
            if (r0 == 0) goto L_0x0374
            r0 = r2
            android.text.style.BackgroundColorSpan r0 = (android.text.style.BackgroundColorSpan) r0
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r0 = r0.getBackgroundColor()
            X.AnonymousClass000.A1P(r13, r0, r5)
            java.lang.String r0 = "<span class='bg_%s'>"
            goto L_0x035b
        L_0x0374:
            boolean r0 = r2 instanceof X.AnonymousClass72D
            if (r0 == 0) goto L_0x037c
            java.lang.String r14 = "<span style='text-combine-upright:all;'>"
            goto L_0x0292
        L_0x037c:
            boolean r0 = r2 instanceof android.text.style.AbsoluteSizeSpan
            if (r0 == 0) goto L_0x0398
            r0 = r2
            android.text.style.AbsoluteSizeSpan r0 = (android.text.style.AbsoluteSizeSpan) r0
            boolean r1 = r0.getDip()
            int r0 = r0.getSize()
            float r0 = (float) r0
            if (r1 != 0) goto L_0x0390
            float r0 = r0 / r19
        L_0x0390:
            java.lang.Object[] r13 = new java.lang.Object[r13]
            X.AnonymousClass001.A1P(r13, r0, r5)
            java.lang.String r0 = "<span style='font-size:%.2fpx;'>"
            goto L_0x035b
        L_0x0398:
            boolean r0 = r2 instanceof android.text.style.RelativeSizeSpan
            if (r0 == 0) goto L_0x03ae
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r0 = r2
            android.text.style.RelativeSizeSpan r0 = (android.text.style.RelativeSizeSpan) r0
            float r1 = r0.getSizeChange()
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            X.AnonymousClass001.A1P(r13, r1, r5)
            java.lang.String r0 = "<span style='font-size:%.2f%%;'>"
            goto L_0x035b
        L_0x03ae:
            boolean r0 = r2 instanceof android.text.style.TypefaceSpan
            r14 = 0
            if (r0 == 0) goto L_0x03c8
            r0 = r2
            android.text.style.TypefaceSpan r0 = (android.text.style.TypefaceSpan) r0
            java.lang.String r0 = r0.getFamily()
            if (r0 == 0) goto L_0x0292
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r5] = r0
            java.lang.String r0 = "<span style='font-family:\"%s\";'>"
            java.lang.String r14 = java.lang.String.format(r9, r0, r1)
            goto L_0x0292
        L_0x03c8:
            boolean r0 = r2 instanceof android.text.style.StyleSpan
            r1 = 2
            if (r0 == 0) goto L_0x03e7
            r0 = r2
            android.text.style.StyleSpan r0 = (android.text.style.StyleSpan) r0
            int r15 = r0.getStyle()
            if (r15 == r13) goto L_0x03e3
            if (r15 == r1) goto L_0x03df
            r0 = 3
            if (r15 != r0) goto L_0x0292
            java.lang.String r14 = "<b><i>"
            goto L_0x0292
        L_0x03df:
            java.lang.String r14 = "<i>"
            goto L_0x0292
        L_0x03e3:
            java.lang.String r14 = "<b>"
            goto L_0x0292
        L_0x03e7:
            boolean r0 = r2 instanceof X.AnonymousClass7G8
            if (r0 == 0) goto L_0x0408
            r0 = r2
            X.7G8 r0 = (X.AnonymousClass7G8) r0
            int r0 = r0.A00
            r36 = r0
            r0 = -1
            r15 = r0
            r0 = r36
            if (r0 == r15) goto L_0x0404
            if (r0 == r13) goto L_0x0400
            if (r0 != r1) goto L_0x0292
            java.lang.String r14 = "<ruby style='ruby-position:under;'>"
            goto L_0x0292
        L_0x0400:
            java.lang.String r14 = "<ruby style='ruby-position:over;'>"
            goto L_0x0292
        L_0x0404:
            java.lang.String r14 = "<ruby style='ruby-position:unset;'>"
            goto L_0x0292
        L_0x0408:
            boolean r0 = r2 instanceof android.text.style.UnderlineSpan
            if (r0 == 0) goto L_0x0410
            java.lang.String r14 = "<u>"
            goto L_0x0292
        L_0x0410:
            boolean r0 = r2 instanceof X.C148667Jg
            if (r0 == 0) goto L_0x0292
            r0 = r2
            X.7Jg r0 = (X.C148667Jg) r0
            r36 = r0
            int r0 = r0.A01
            r15 = r0
            r0 = r36
            int r0 = r0.A00
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()
            if (r0 == r13) goto L_0x0459
            if (r0 != r1) goto L_0x042d
            java.lang.String r0 = "open "
        L_0x042a:
            r14.append(r0)
        L_0x042d:
            if (r15 == 0) goto L_0x0456
            if (r15 == r13) goto L_0x0453
            if (r15 == r1) goto L_0x0450
            java.lang.String r13 = "sesame"
        L_0x0435:
            java.lang.String r13 = X.AnonymousClass000.A0X(r13, r14)
            r0 = r36
            int r0 = r0.A02
            if (r0 == r1) goto L_0x044d
            java.lang.String r0 = "over right"
        L_0x0441:
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0V(r13, r0, r1)
            java.lang.String r0 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r14 = java.lang.String.format(r9, r0, r1)
            goto L_0x0292
        L_0x044d:
            java.lang.String r0 = "under left"
            goto L_0x0441
        L_0x0450:
            java.lang.String r13 = "dot"
            goto L_0x0435
        L_0x0453:
            java.lang.String r13 = "circle"
            goto L_0x0435
        L_0x0456:
            java.lang.String r13 = "none"
            goto L_0x0435
        L_0x0459:
            java.lang.String r0 = "filled "
            goto L_0x042a
        L_0x045c:
            int r0 = r12.length()
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            r2 = 0
        L_0x0465:
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x04be
            int r3 = r4.keyAt(r5)
            java.lang.CharSequence r0 = r12.subSequence(r2, r3)
            java.lang.String r0 = A01(r0)
            r1.append(r0)
            java.lang.Object r13 = r4.get(r3)
            X.7GC r13 = (X.AnonymousClass7GC) r13
            java.util.List r2 = r13.A01
            java.util.Comparator r0 = X.C156677h1.A04
            java.util.Collections.sort(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x048b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x049d
            java.lang.Object r0 = r2.next()
            X.7h1 r0 = (X.C156677h1) r0
            java.lang.String r0 = r0.A02
            r1.append(r0)
            goto L_0x048b
        L_0x049d:
            java.util.List r2 = r13.A00
            java.util.Comparator r0 = X.C156677h1.A05
            java.util.Collections.sort(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x04a8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04ba
            java.lang.Object r0 = r2.next()
            X.7h1 r0 = (X.C156677h1) r0
            java.lang.String r0 = r0.A03
            r1.append(r0)
            goto L_0x04a8
        L_0x04ba:
            int r5 = r5 + 1
            r2 = r3
            goto L_0x0465
        L_0x04be:
            int r0 = r12.length()
            java.lang.CharSequence r0 = r12.subSequence(r2, r0)
            java.lang.String r0 = A01(r0)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.7GB r4 = new X.7GB
            r0 = r17
            r4.<init>(r1, r0)
            goto L_0x0153
        L_0x04d7:
            java.lang.String r20 = "height"
            r38 = r10
            r10 = r12
            goto L_0x013c
        L_0x04de:
            if (r3 == 0) goto L_0x04e3
            goto L_0x04e5
        L_0x04e1:
            if (r3 == 0) goto L_0x04e5
        L_0x04e3:
            r1 = r22
        L_0x04e5:
            r22 = r21
            r0 = 2
            r21 = r1
            goto L_0x0133
        L_0x04ec:
            X.7hM r0 = r11.A02
            int r0 = r0.A04
            goto L_0x011f
        L_0x04f2:
            java.lang.String r31 = "vertical-lr"
            goto L_0x0111
        L_0x04f6:
            java.lang.String r31 = "vertical-rl"
            goto L_0x0111
        L_0x04fa:
            java.lang.String r32 = "start"
            goto L_0x0107
        L_0x04fe:
            java.lang.String r33 = "fit-content"
            goto L_0x00f3
        L_0x0502:
            r10 = -50
            goto L_0x00d8
        L_0x0506:
            r0 = 0
            java.lang.String r3 = "%.2fem"
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            java.lang.Object[] r2 = new java.lang.Object[r1]
            if (r0 < 0) goto L_0x0519
            float r6 = r6 * r14
            X.AnonymousClass001.A1P(r2, r6, r10)
            java.lang.String r34 = java.lang.String.format(r9, r3, r2)
            goto L_0x00db
        L_0x0519:
            float r0 = -r6
            float r0 = r0 - r5
            float r0 = r0 * r14
            X.AnonymousClass001.A1P(r2, r0, r10)
            java.lang.String r34 = java.lang.String.format(r9, r3, r2)
            r3 = 1
            goto L_0x00dc
        L_0x0526:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            float r0 = r11.A00
            float r5 = r5 - r0
            float r5 = r5 * r13
            X.AnonymousClass001.A1P(r2, r5, r10)
            java.lang.String r34 = java.lang.String.format(r9, r4, r2)
            r10 = -100
            goto L_0x00db
        L_0x0537:
            r12 = -50
            goto L_0x00b5
        L_0x053b:
            r35 = 1112014848(0x42480000, float:50.0)
            goto L_0x00ab
        L_0x053f:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            int r0 = r5.A01
            java.lang.String r0 = A00(r0)
            r3[r10] = r0
            java.lang.String r2 = "-0.05em -0.05em 0.15em %s"
            goto L_0x0572
        L_0x054c:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            int r0 = r5.A01
            java.lang.String r0 = A00(r0)
            r3[r10] = r0
            java.lang.String r2 = "0.1em 0.12em 0.15em %s"
            goto L_0x0572
        L_0x0559:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            int r0 = r5.A01
            java.lang.String r0 = A00(r0)
            r3[r10] = r0
            java.lang.String r2 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            goto L_0x0572
        L_0x0566:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            int r0 = r5.A01
            java.lang.String r0 = A00(r0)
            r3[r10] = r0
            java.lang.String r2 = "0.06em 0.08em 0.15em %s"
        L_0x0572:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            goto L_0x0037
        L_0x057a:
            java.lang.String r2 = "</div></body></html>"
            r0 = r18
            java.lang.StringBuilder r4 = X.C18290x4.A0w(r2, r0)
            java.lang.String r0 = "<html><head><style>"
            r4.append(r0)
            java.util.Iterator r3 = X.C18290x4.A11(r8)
        L_0x058b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05aa
            java.lang.String r2 = X.AnonymousClass001.A0m(r3)
            r4.append(r2)
            java.lang.String r0 = "{"
            r4.append(r0)
            java.lang.String r0 = X.C18320x8.A0e(r2, r8)
            r4.append(r0)
            java.lang.String r0 = "}"
            r4.append(r0)
            goto L_0x058b
        L_0x05aa:
            java.lang.String r0 = "</style></head>"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r4)
            r0 = r18
            r0.insert(r10, r2)
            android.webkit.WebView r3 = r11.A04
            java.lang.String r2 = r18.toString()
            java.nio.charset.Charset r0 = X.AnonymousClass79T.A05
            byte[] r0 = r2.getBytes(r0)
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r1)
            java.lang.String r1 = "text/html"
            java.lang.String r0 = "base64"
            r3.loadData(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FL.A03():void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.A03.isEmpty()) {
            A03();
        }
    }
}
