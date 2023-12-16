package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;
import com.bloks.stdlib.components.bkcomponentstextinput.EditTextForMeasure;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.0YO  reason: invalid class name */
public class AnonymousClass0YO {
    public static final InputFilter[] A00 = new InputFilter[0];

    public static final EditTextForMeasure A01(Context context) {
        try {
            EditTextForMeasure editTextForMeasure = new EditTextForMeasure(context, (AttributeSet) null);
            editTextForMeasure.setBackgroundResource(17170445);
            return editTextForMeasure;
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message == null || !C175728Zm.A0S(message, "ConstantState.newDrawable", false)) {
                throw e;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
            C162457s7.A0K(inflate, "null cannot be cast to non-null type com.bloks.stdlib.components.bkcomponentstextinput.EditTextForMeasure");
            return (EditTextForMeasure) inflate;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C04080Ms A02(com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText r12, X.AnonymousClass7S1 r13, X.C153427bI r14, X.AnonymousClass84O r15, java.lang.Object r16) {
        /*
            r10 = r14
            r11 = r15
            java.lang.Object r9 = X.C162377rs.A06(r14, r15)
            X.0Ms r9 = (X.C04080Ms) r9
            r1 = r16
            r5 = r1
            X.0LW r5 = (X.AnonymousClass0LW) r5
            java.lang.Object r0 = r9.A0N
            if (r0 == r1) goto L_0x0017
            int r0 = r5.A00
            r9.A04 = r0
            r9.A0N = r1
        L_0x0017:
            r8 = r12
            r9.A0K = r12
            float r0 = r12.getTextSize()
            r9.A00 = r0
            android.text.TextUtils$TruncateAt r0 = r12.getEllipsize()
            r9.A0F = r0
            android.os.Parcelable r0 = r9.A0D
            r2 = 0
            if (r0 == 0) goto L_0x0030
            r12.onRestoreInstanceState(r0)
            r9.A0D = r2
        L_0x0030:
            int r0 = r9.A03
            if (r0 != 0) goto L_0x003a
            int r0 = r12.getInputType()
            r9.A03 = r0
        L_0x003a:
            android.graphics.Rect r6 = r9.A0A
            int r4 = r12.getPaddingLeft()
            int r3 = r12.getPaddingTop()
            int r1 = r12.getPaddingRight()
            int r0 = r12.getPaddingBottom()
            r6.set(r4, r3, r1, r0)
            android.text.method.KeyListener r0 = r9.A0I
            if (r0 != 0) goto L_0x0059
            android.text.method.KeyListener r0 = r12.getKeyListener()
            r9.A0I = r0
        L_0x0059:
            android.text.method.KeyListener r3 = r12.getKeyListener()
            android.text.Editable r0 = r9.A0E
            java.lang.String r12 = r0.toString()
            android.graphics.Typeface r7 = r5.A01
            A05(r7, r8, r9, r10, r11, r12)
            android.text.method.KeyListener r0 = r8.getKeyListener()
            r1 = 0
            r6 = 1
            r7 = 0
            if (r3 == r0) goto L_0x0072
            r7 = 1
        L_0x0072:
            int r4 = r9.A07
            r3 = -1
            if (r4 != r3) goto L_0x0259
            android.text.Editable r0 = r8.getText()
            if (r0 == 0) goto L_0x0088
            android.text.Editable r0 = r8.getText()
            int r0 = r0.length()
            r8.setSelection(r0)
        L_0x0088:
            r0 = 74
            boolean r5 = r15.A0W(r0, r6)
            r0 = 83
            java.lang.String r0 = r15.A0O(r0)
            if (r5 == 0) goto L_0x023d
            if (r0 == 0) goto L_0x0244
            android.text.method.DigitsKeyListener r4 = android.text.method.DigitsKeyListener.getInstance(r0)
            android.text.method.KeyListener r0 = r8.getKeyListener()
            if (r0 == r4) goto L_0x00a5
            r8.setKeyListener(r4)
        L_0x00a5:
            r9.A0P = r6
        L_0x00a7:
            boolean r0 = r8.isEnabled()
            if (r5 == r0) goto L_0x00b0
            r8.setEnabled(r5)
        L_0x00b0:
            boolean r5 = X.AnonymousClass0YA.A07(r8)
            if (r5 == 0) goto L_0x00bb
            android.text.TextUtils$TruncateAt r0 = r9.A0G
            X.AnonymousClass0YA.A00(r0, r8, r9)
        L_0x00bb:
            r0 = 84
            boolean r0 = r15.A0W(r0, r1)
            if (r0 == 0) goto L_0x00ce
            r8.setShowSoftInputOnFocus(r1)
            X.0aJ r0 = new X.0aJ
            r0.<init>()
            r8.setOnKeyListener(r0)
        L_0x00ce:
            X.0Zs r0 = r9.A0M
            if (r0 != 0) goto L_0x00d9
            X.0Zs r0 = new X.0Zs
            r0.<init>(r13, r14, r15)
            r9.A0M = r0
        L_0x00d9:
            X.0rO r0 = r9.A0L
            if (r0 != 0) goto L_0x00e4
            X.0gb r0 = new X.0gb
            r0.<init>(r14, r15)
            r9.A0L = r0
        L_0x00e4:
            r8.A00 = r0
            X.0Zs r0 = r9.A0M
            r8.removeTextChangedListener(r0)
            X.0Zs r0 = r9.A0M
            r8.addTextChangedListener(r0)
            r0 = 41
            java.lang.String r0 = r15.A0O(r0)
            if (r0 == 0) goto L_0x0113
            android.text.TextWatcher r1 = r9.A0H
            if (r1 != 0) goto L_0x0103
            X.0Zt r1 = new X.0Zt
            r1.<init>(r8, r0)
            r9.A0H = r1
        L_0x0103:
            X.0Zs r0 = r9.A0M
            java.util.List r0 = r0.A05
            r0.remove(r1)
            X.0Zs r0 = r9.A0M
            android.text.TextWatcher r1 = r9.A0H
            java.util.List r0 = r0.A05
            r0.add(r1)
        L_0x0113:
            r0 = 42
            X.48t r4 = r15.A0L(r0)
            r0 = 45
            X.48t r1 = r15.A0L(r0)
            if (r4 != 0) goto L_0x0236
            if (r1 != 0) goto L_0x0236
            if (r5 == 0) goto L_0x012d
            X.0aI r0 = new X.0aI
            r0.<init>(r14, r15, r2, r2)
        L_0x012a:
            r8.setOnFocusChangeListener(r0)
        L_0x012d:
            r0 = 55
            X.84O r1 = r15.A0K(r0)
            android.content.res.ColorStateList r0 = r8.getTextColors()
            r9.A09 = r0
            if (r1 == 0) goto L_0x021b
            int r0 = X.C154127ce.A00(r14, r1)
            r8.setTextColor(r0)
        L_0x0142:
            r0 = 65
            X.84O r1 = r15.A0K(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r2 < r0) goto L_0x0151
            X.AnonymousClass0YA.A03(r8, r9, r14, r1)
        L_0x0151:
            android.content.res.ColorStateList r0 = r8.getHintTextColors()
            r9.A08 = r0
            r0 = 38
            X.84O r0 = r15.A0K(r0)
            if (r0 == 0) goto L_0x0166
            int r0 = X.C154127ce.A00(r14, r0)
            r8.setHintTextColor(r0)
        L_0x0166:
            android.graphics.drawable.Drawable r0 = r8.getBackground()
            r9.A0B = r0
            r0 = 140(0x8c, float:1.96E-43)
            X.84O r0 = r15.A0K(r0)
            if (r0 == 0) goto L_0x0180
            int r1 = X.C154127ce.A00(r14, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r8.setBackground(r0)
        L_0x0180:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r0 = 40
            int r1 = r15.A0E(r0, r3)
            if (r1 <= r3) goto L_0x0194
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            r4.add(r0)
        L_0x0194:
            r0 = 62
            X.48t r1 = r15.A0L(r0)
            if (r1 == 0) goto L_0x01a4
            X.0Zp r0 = new X.0Zp
            r0.<init>(r14, r15, r1)
            r4.add(r0)
        L_0x01a4:
            int r0 = r4.size()
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r8.setFilters(r0)
            int r0 = r8.getImeOptions()
            r9.A02 = r0
            r0 = 70
            java.lang.String r5 = r15.A0O(r0)
            if (r5 == 0) goto L_0x01cb
            int r0 = r5.hashCode()
            r4 = 4
            r3 = 3
            r1 = 2
            switch(r0) {
                case -906336856: goto L_0x020f;
                case 3304: goto L_0x0203;
                case 3089282: goto L_0x01fb;
                case 3377907: goto L_0x01f3;
                case 3526536: goto L_0x01e7;
                default: goto L_0x01cb;
            }
        L_0x01cb:
            r0 = 46
            X.48t r1 = r15.A0L(r0)
            X.0as r0 = new X.0as
            r0.<init>(r14, r15, r1)
            r8.setOnEditorActionListener(r0)
            r0 = 75
            java.lang.String r1 = r15.A0O(r0)
            r0 = 28
            if (r2 < r0) goto L_0x01e6
            X.AnonymousClass0YA.A04(r8, r14, r1)
        L_0x01e6:
            return r9
        L_0x01e7:
            java.lang.String r0 = "send"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01cb
            r8.setImeOptions(r4)
            goto L_0x01cb
        L_0x01f3:
            java.lang.String r0 = "next"
            boolean r0 = r5.equals(r0)
            r1 = 5
            goto L_0x0209
        L_0x01fb:
            java.lang.String r0 = "done"
            boolean r0 = r5.equals(r0)
            r1 = 6
            goto L_0x0209
        L_0x0203:
            java.lang.String r0 = "go"
            boolean r0 = r5.equals(r0)
        L_0x0209:
            if (r0 == 0) goto L_0x01cb
            r8.setImeOptions(r1)
            goto L_0x01cb
        L_0x020f:
            java.lang.String r0 = "search"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01cb
            r8.setImeOptions(r3)
            goto L_0x01cb
        L_0x021b:
            r0 = 52
            java.lang.String r0 = r15.A0O(r0)
            if (r0 == 0) goto L_0x0142
            int r0 = X.C162407s0.A05(r0)     // Catch:{ 6u2 -> 0x022c }
            r8.setTextColor(r0)     // Catch:{ 6u2 -> 0x022c }
            goto L_0x0142
        L_0x022c:
            r2 = move-exception
            java.lang.String r1 = "TextInputBinderUtils"
            java.lang.String r0 = "Error parsing text color for Text input"
            X.C159737mN.A00(r14, r1, r0, r2)
            goto L_0x0142
        L_0x0236:
            X.0aI r0 = new X.0aI
            r0.<init>(r14, r15, r4, r1)
            goto L_0x012a
        L_0x023d:
            r8.setKeyListener(r2)
            A06(r8, r9, r1)
            goto L_0x0255
        L_0x0244:
            if (r7 != 0) goto L_0x0255
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x0250
            android.text.method.KeyListener r0 = r8.getKeyListener()
            if (r0 != 0) goto L_0x0255
        L_0x0250:
            android.text.method.KeyListener r0 = r9.A0I
            r8.setKeyListener(r0)
        L_0x0255:
            r9.A0P = r1
            goto L_0x00a7
        L_0x0259:
            int r0 = r9.A06
            r8.setSelection(r4, r0)
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YO.A02(com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText, X.7S1, X.7bI, X.84O, java.lang.Object):X.0Ms");
    }

    public static C157477iM A03(C152987aU r12, AnonymousClass84O r13, String str, int i, int i2) {
        int measuredWidth;
        String str2 = str;
        C153427bI r9 = (C153427bI) r12.A04();
        Context A02 = r12.A02();
        EditTextForMeasure A01 = A01(A02);
        AnonymousClass84O r10 = r13;
        String A0O = r13.A0O(35);
        String A0O2 = r13.A0O(54);
        int i3 = 0;
        Typeface typeface = null;
        if (A0O != null) {
            if (A0O2 != null) {
                try {
                    i3 = C162407s0.A09(A0O2);
                } catch (AnonymousClass6u2 e) {
                    C159737mN.A00(r9, "TextInputBinderUtils", "Error parsing text style for text input", e);
                }
            }
            typeface = A00(A02, A0O, i3);
        }
        Objects.requireNonNull(r9);
        C04080Ms r0 = (C04080Ms) C162377rs.A06(r9, r13);
        if (str == null) {
            str2 = r0.A0O;
        }
        A05(typeface, A01, (C04080Ms) null, r9, r10, str2);
        A01.measure(i, i2);
        AnonymousClass0LW r3 = new AnonymousClass0LW(typeface, A01.getLineCount());
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            measuredWidth = View.MeasureSpec.getSize(i);
        } else {
            measuredWidth = A01.getMeasuredWidth();
        }
        int measuredHeight = A01.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            C159737mN.A01("TextInputBinderUtils", "TextInput is being measured with unspecified width");
        }
        return new C157477iM(r3, measuredWidth, measuredHeight);
    }

    public static Object A04(C153427bI r3, AnonymousClass84O r4) {
        float f;
        String A0O = r4.A0O(53);
        if (A0O != null) {
            try {
                f = C162407s0.A01(A0O);
            } catch (AnonymousClass6u2 e) {
                C159737mN.A00(r3, "TextInputBinderUtils", "Error parsing text input size", e);
            }
            return new C04080Ms(r4.A0P(50, ""), f);
        }
        f = 0.0f;
        return new C04080Ms(r4.A0P(50, ""), f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ef A[SYNTHETIC, Splitter:B:57:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0133 A[Catch:{ 6u2 -> 0x013b }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(android.graphics.Typeface r9, com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText r10, X.C04080Ms r11, X.C153427bI r12, X.AnonymousClass84O r13, java.lang.String r14) {
        /*
            r0 = 59
            r4 = 0
            boolean r0 = r13.A0W(r0, r4)
            if (r0 == 0) goto L_0x000c
            r10.setPadding(r4, r4, r4, r4)
        L_0x000c:
            r0 = 90
            X.84O r8 = r13.A0K(r0)
            r3 = 36
            java.lang.String r2 = "TextInputBinderUtils"
            if (r8 == 0) goto L_0x004b
            r0 = 35
            X.84O r1 = r8.A0K(r0)     // Catch:{ 6u2 -> 0x0045 }
            int r0 = r10.A01     // Catch:{ 6u2 -> 0x0045 }
            int r6 = X.C154127ce.A01(r12, r1, r0)     // Catch:{ 6u2 -> 0x0045 }
            r0 = 40
            java.lang.String r0 = r8.A0O(r0)     // Catch:{ 6u2 -> 0x0045 }
            r7 = 0
            float r5 = X.C162407s0.A03(r0, r7)     // Catch:{ 6u2 -> 0x0045 }
            java.lang.String r0 = r8.A0O(r3)     // Catch:{ 6u2 -> 0x0045 }
            float r1 = X.C162407s0.A03(r0, r7)     // Catch:{ 6u2 -> 0x0045 }
            r0 = 38
            java.lang.String r0 = r8.A0O(r0)     // Catch:{ 6u2 -> 0x0045 }
            float r0 = X.C162407s0.A03(r0, r7)     // Catch:{ 6u2 -> 0x0045 }
            r10.setShadowLayer(r5, r1, r0, r6)     // Catch:{ 6u2 -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text shadow"
            X.C159737mN.A00(r12, r2, r0, r1)
        L_0x004b:
            if (r14 == 0) goto L_0x005e
            android.text.Editable r0 = r10.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x005e
            r10.setText(r14)
        L_0x005e:
            java.lang.String r0 = r13.A0O(r3)
            r10.setHint(r0)
            r0 = 51
            java.lang.String r0 = r13.A0O(r0)
            if (r0 == 0) goto L_0x007b
            int r0 = X.C162407s0.A07(r0)     // Catch:{ 6u2 -> 0x0075 }
            r10.setGravity(r0)     // Catch:{ 6u2 -> 0x0075 }
            goto L_0x007b
        L_0x0075:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text align"
            X.C159737mN.A00(r12, r2, r0, r1)
        L_0x007b:
            r0 = 56
            java.lang.String r0 = r13.A0O(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0095
            int r6 = X.C162407s0.A08(r0)     // Catch:{ 6u2 -> 0x008f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 6u2 -> 0x008f }
            if (r0 == 0) goto L_0x0095
            goto L_0x009b
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text input type"
            X.C159737mN.A00(r12, r2, r0, r1)
        L_0x0095:
            if (r11 == 0) goto L_0x00ea
            int r6 = r11.A05
            if (r6 == 0) goto L_0x00ea
        L_0x009b:
            r0 = r6 & 15
            r1 = 2
            r5 = 1
            if (r0 != r5) goto L_0x00ad
            r0 = 73
            int r0 = r13.A0E(r0, r4)
            if (r0 != r5) goto L_0x00e3
            r0 = -32769(0xffffffffffff7fff, float:NaN)
            r6 = r6 & r0
        L_0x00ad:
            int r0 = r10.getInputType()
            if (r6 == r0) goto L_0x00b6
            A06(r10, r11, r6)
        L_0x00b6:
            r0 = 49
            boolean r0 = r13.A0W(r0, r4)
            if (r0 == 0) goto L_0x00e1
            int r0 = r10.getInputType()
            boolean r0 = X.AnonymousClass0YA.A06(r0)
            if (r0 != 0) goto L_0x00e1
        L_0x00c8:
            if (r11 == 0) goto L_0x00cf
            boolean r0 = r11.A0Q
            if (r0 == 0) goto L_0x00cf
            r4 = 1
        L_0x00cf:
            if (r5 == r4) goto L_0x00d8
            r10.setSingleLine(r5)
            if (r11 == 0) goto L_0x00d8
            r11.A0Q = r5
        L_0x00d8:
            r0 = 53
            java.lang.String r0 = r13.A0O(r0)
            if (r0 == 0) goto L_0x00fd
            goto L_0x00ef
        L_0x00e1:
            r5 = 0
            goto L_0x00c8
        L_0x00e3:
            if (r0 != r1) goto L_0x00ad
            r0 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 | r0
            goto L_0x00ad
        L_0x00ea:
            int r6 = r10.getInputType()
            goto L_0x009b
        L_0x00ef:
            float r0 = X.C162407s0.A02(r0)     // Catch:{ 6u2 -> 0x00f7 }
            r10.setTextSize(r1, r0)     // Catch:{ 6u2 -> 0x00f7 }
            goto L_0x00fd
        L_0x00f7:
            r1 = move-exception
            java.lang.String r0 = "Error parsing scaled text size for text input"
            X.C159737mN.A00(r12, r2, r0, r1)
        L_0x00fd:
            if (r9 == 0) goto L_0x0105
            r10.setTypeface(r9)
        L_0x0102:
            r0 = 91
            goto L_0x011c
        L_0x0105:
            r0 = 54
            java.lang.String r0 = r13.A0O(r0)
            if (r0 == 0) goto L_0x0102
            int r0 = X.C162407s0.A09(r0)     // Catch:{ 6u2 -> 0x0115 }
            r10.setTypeface(r3, r0)     // Catch:{ 6u2 -> 0x0115 }
            goto L_0x0102
        L_0x0115:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text style for text input"
            X.C159737mN.A00(r12, r2, r0, r1)
            goto L_0x0102
        L_0x011c:
            java.lang.String r1 = r13.A0O(r0)     // Catch:{ 6u2 -> 0x013b }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = X.C162407s0.A03(r1, r0)     // Catch:{ 6u2 -> 0x013b }
            int r1 = (int) r0     // Catch:{ 6u2 -> 0x013b }
            if (r1 < 0) goto L_0x0141
            android.text.TextPaint r0 = r10.getPaint()     // Catch:{ 6u2 -> 0x013b }
            int r0 = r0.getFontMetricsInt(r3)     // Catch:{ 6u2 -> 0x013b }
            if (r1 == r0) goto L_0x0141
            int r1 = r1 - r0
            float r1 = (float) r1     // Catch:{ 6u2 -> 0x013b }
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.setLineSpacing(r1, r0)     // Catch:{ 6u2 -> 0x013b }
            return
        L_0x013b:
            r1 = move-exception
            java.lang.String r0 = "Error parsing lineHeight for text input"
            X.C159737mN.A00(r12, r2, r0, r1)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YO.A05(android.graphics.Typeface, com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText, X.0Ms, X.7bI, X.84O, java.lang.String):void");
    }

    public static Typeface A00(Context context, String str, int i) {
        return C158977kt.A00().A05().A00(context, str, i);
    }

    public static void A06(BloksEditText bloksEditText, C04080Ms r4, int i) {
        if (AnonymousClass0YA.A06(i) || (r4 != null && AnonymousClass0YA.A06(r4.A05))) {
            bloksEditText.setInputType(i);
            AnonymousClass0YA.A00((TextUtils.TruncateAt) null, bloksEditText, r4);
        } else if ((i & 131087) != 131073 && (r4 == null || (r4.A05 & 131087) != 131073)) {
            bloksEditText.setRawInputType(i);
            InputMethodManager A0C = AnonymousClass000.A0C(bloksEditText);
            if (A0C != null) {
                A0C.restartInput(bloksEditText);
            }
            if (r4 == null) {
                return;
            }
            r4.A05 = i;
        } else if (i == 0) {
            bloksEditText.setRawInputType(0);
            InputMethodManager A0C2 = AnonymousClass000.A0C(bloksEditText);
            if (A0C2 != null) {
                A0C2.restartInput(bloksEditText);
            }
        } else {
            bloksEditText.setInputType(i);
        }
        if (r4 != null) {
            r4.A0Q = false;
            r4.A05 = i;
        }
    }

    public static void A07(BloksEditText bloksEditText, C153427bI r3, AnonymousClass84O r4) {
        C04080Ms r1 = (C04080Ms) C162377rs.A06(r3, r4);
        r1.A0D = bloksEditText.onSaveInstanceState();
        bloksEditText.setEnabled(true);
        bloksEditText.setKeyListener(r1.A0I);
        bloksEditText.setText("");
        A06(bloksEditText, r1, r1.A03);
        bloksEditText.setSingleLine(false);
        r1.A0Q = false;
    }

    public static void A08(BloksEditText bloksEditText, C153427bI r7, AnonymousClass84O r8) {
        C04080Ms r5 = (C04080Ms) C162377rs.A06(r7, r8);
        r5.A0E = bloksEditText.getText();
        bloksEditText.removeTextChangedListener(r5.A0M);
        TextWatcher textWatcher = r5.A0H;
        if (textWatcher != null) {
            bloksEditText.removeTextChangedListener(textWatcher);
        }
        bloksEditText.setFocusable(true);
        bloksEditText.A00 = null;
        bloksEditText.setFilters(A00);
        bloksEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        bloksEditText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        bloksEditText.setGravity(8388659);
        bloksEditText.setTypeface(Typeface.DEFAULT);
        bloksEditText.setHint("");
        bloksEditText.setMaxLines(Integer.MAX_VALUE);
        bloksEditText.setImeOptions(r5.A02);
        bloksEditText.setTextColor(r5.A09);
        bloksEditText.setHintTextColor(r5.A08);
        bloksEditText.setBackground(r5.A0B);
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass0YA.A02(bloksEditText, r5);
        }
        bloksEditText.setShowSoftInputOnFocus(true);
        bloksEditText.setOnKeyListener((View.OnKeyListener) null);
        bloksEditText.setTextSize(0, r5.A00);
        Rect rect = r5.A0A;
        bloksEditText.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        r5.A0K = null;
        bloksEditText.setEllipsize(r5.A0F);
        bloksEditText.setShadowLayer(0.0f, 0.0f, 0.0f, bloksEditText.A01);
        bloksEditText.setLineSpacing(0.0f, 1.0f);
    }
}
