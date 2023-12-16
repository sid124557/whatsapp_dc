package X;

import android.text.InputFilter;

/* renamed from: X.7mP  reason: invalid class name and case insensitive filesystem */
public class C159757mP {
    public static final InputFilter[] A00 = new InputFilter[0];

    public static int A00(C153427bI r4, String str) {
        if (str.equals("text_no_suggestion")) {
            return 655361;
        }
        if (!str.equals("numbers_and_punctuation")) {
            try {
                return C162407s0.A08(str);
            } catch (AnonymousClass6u2 e) {
                C159737mN.A00(r4, "WaRcFormInputComponentBinderUtils", "Error parsing text input type", e);
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017e, code lost:
        if ((r8 & 128) == 128) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(android.view.View r11, X.C153427bI r12, X.AnonymousClass84O r13, java.lang.String r14) {
        /*
            r0 = 36
            r5 = 0
            boolean r10 = r13.A0W(r0, r5)
            r0 = 2131429051(0x7f0b06bb, float:1.8479764E38)
            android.view.View r8 = X.C06560Yg.A02(r11, r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r0 = r8.getChildCount()
            r2 = 0
            java.lang.String r4 = "WaRcFormInputComponentBinderUtils"
            if (r0 != 0) goto L_0x006f
            r0 = 52
            java.lang.Object r0 = X.AnonymousClass84O.A05(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0032
            float r0 = X.C162407s0.A02(r0)     // Catch:{ 6u2 -> 0x002c }
            java.lang.Float r9 = java.lang.Float.valueOf(r0)     // Catch:{ 6u2 -> 0x002c }
            goto L_0x0033
        L_0x002c:
            r1 = move-exception
            java.lang.String r0 = "PAY: WaFormInputBinder/bindView cannot parse text size"
            X.C159737mN.A00(r12, r4, r0, r1)
        L_0x0032:
            r9 = r2
        L_0x0033:
            android.content.Context r3 = r12.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131626331(0x7f0e095b, float:1.8879895E38)
            if (r10 == 0) goto L_0x0041
            r0 = 2131626332(0x7f0e095c, float:1.8879897E38)
        L_0x0041:
            android.view.View r7 = r1.inflate(r0, r2, r5)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131626329(0x7f0e0959, float:1.8879891E38)
            if (r10 == 0) goto L_0x0053
            r0 = 2131626330(0x7f0e095a, float:1.8879893E38)
        L_0x0053:
            android.view.View r6 = r1.inflate(r0, r2, r5)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r9 == 0) goto L_0x0062
            float r0 = r9.floatValue()
            r6.setTextSize(r0)
        L_0x0062:
            r3 = -1
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r3, r1)
            r7.addView(r6, r5, r0)
            r8.addView(r7)
        L_0x006f:
            r0 = 2131429347(0x7f0b07e3, float:1.8480364E38)
            android.view.View r6 = X.C06560Yg.A02(r11, r0)
            com.google.android.material.textfield.TextInputLayout r6 = (com.google.android.material.textfield.TextInputLayout) r6
            r0 = 2131434234(0x7f0b1afa, float:1.8490276E38)
            android.view.View r3 = X.C06560Yg.A02(r6, r0)
            android.widget.EditText r3 = (android.widget.EditText) r3
            if (r14 == 0) goto L_0x0094
            android.text.Editable r0 = r3.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0094
            r3.setText(r14)
        L_0x0094:
            r0 = 57
            java.lang.Object r1 = X.AnonymousClass84O.A05(r13, r0)
            java.lang.String r1 = (java.lang.String) r1
            r7 = 1
            if (r1 != 0) goto L_0x00ce
            r6.setError(r2)
            r6.setErrorEnabled(r5)
            r0 = 2132083186(0x7f1501f2, float:1.9806507E38)
            r6.setErrorTextAppearance(r0)
            r0 = 2132083262(0x7f15023e, float:1.9806661E38)
            if (r10 == 0) goto L_0x00b3
            r0 = 2132083263(0x7f15023f, float:1.9806663E38)
        L_0x00b3:
            r6.setHintTextAppearance(r0)
            r0 = 43
            java.lang.Object r0 = X.AnonymousClass84O.A05(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00c3
            r6.setHint((java.lang.CharSequence) r0)
        L_0x00c3:
            r0 = 51
            java.lang.Object r0 = X.AnonymousClass84O.A05(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x010a
            goto L_0x00fc
        L_0x00ce:
            r6.setErrorEnabled(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = " "
        L_0x00d9:
            r6.setError(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00f3
            int r0 = r6.getChildCount()
            if (r0 <= r7) goto L_0x00f3
            android.view.View r1 = r6.getChildAt(r7)
            if (r1 == 0) goto L_0x00f3
            r0 = 8
            r1.setVisibility(r0)
        L_0x00f3:
            r0 = 2132083186(0x7f1501f2, float:1.9806507E38)
            r6.setErrorTextAppearance(r0)
            goto L_0x00b3
        L_0x00fa:
            r0 = r1
            goto L_0x00d9
        L_0x00fc:
            int r0 = X.C162407s0.A07(r0)     // Catch:{ 6u2 -> 0x0104 }
            r3.setGravity(r0)     // Catch:{ 6u2 -> 0x0104 }
            goto L_0x010a
        L_0x0104:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text align"
            X.C159737mN.A00(r12, r4, r0, r1)
        L_0x010a:
            r0 = 42
            java.lang.Object r0 = X.AnonymousClass84O.A05(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x011b
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r5)
            r3.setTypeface(r0)
        L_0x011b:
            r0 = 59
            java.lang.Object r1 = X.AnonymousClass84O.A05(r13, r0)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 53
            java.lang.Object r0 = X.AnonymousClass84O.A05(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L_0x0161
            int r0 = A00(r12, r1)
            if (r0 == 0) goto L_0x0136
            r3.setInputType(r0)
        L_0x0136:
            r0 = 35
            boolean r0 = r13.A0W(r0, r5)
            r0 = r0 ^ 1
            r3.setSingleLine(r0)
            r0 = 40
            boolean r0 = r13.A0W(r0, r5)
            if (r0 == 0) goto L_0x014c
            r6.setPasswordVisibilityToggleEnabled(r7)
        L_0x014c:
            r0 = 38
            boolean r0 = r13.A0W(r0, r5)
            if (r0 == 0) goto L_0x015c
            android.text.method.PasswordTransformationMethod r0 = new android.text.method.PasswordTransformationMethod
            r0.<init>()
            r3.setTransformationMethod(r0)
        L_0x015c:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r6, r3)
            return r0
        L_0x0161:
            if (r0 == 0) goto L_0x0136
            int r8 = X.C162407s0.A08(r0)     // Catch:{ 6u2 -> 0x0189 }
            r1 = 32
            r0 = r8 & 32
            if (r0 == r1) goto L_0x0180
            r1 = 8192(0x2000, float:1.14794E-41)
            r0 = r8 & r1
            if (r0 == r1) goto L_0x0180
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r8 & r1
            if (r0 == r1) goto L_0x0180
            r1 = 128(0x80, float:1.794E-43)
            r0 = r8 & r1
            r2 = 0
            if (r0 != r1) goto L_0x0181
        L_0x0180:
            r2 = 1
        L_0x0181:
            if (r2 != 0) goto L_0x0185
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x0185:
            r3.setInputType(r8)     // Catch:{ 6u2 -> 0x0189 }
            goto L_0x0136
        L_0x0189:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text input type"
            X.C159737mN.A00(r12, r4, r0, r1)
            goto L_0x0136
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159757mP.A01(android.view.View, X.7bI, X.84O, java.lang.String):android.util.Pair");
    }
}
