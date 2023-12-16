package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.6GS  reason: invalid class name */
public class AnonymousClass6GS extends AnonymousClass0WH {
    public final TextInputLayout A00;

    public AnonymousClass6GS(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    public void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        C153787c0 endIconDelegate = this.A00.A17.getEndIconDelegate();
        if (endIconDelegate instanceof AnonymousClass6ZR) {
            AnonymousClass6ZR r2 = (AnonymousClass6ZR) endIconDelegate;
            if (accessibilityEvent.getEventType() == 1 && r2.A03.isEnabled() && r2.A04.getInputType() == 0) {
                r2.A09();
                r2.A05 = true;
                r2.A00 = System.currentTimeMillis();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e0, code lost:
        if (r1 != null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (android.text.TextUtils.isEmpty(r12) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.view.View r14, X.C05650Ui r15) {
        /*
            r13 = this;
            super.A0D(r14, r15)
            com.google.android.material.textfield.TextInputLayout r3 = r13.A00
            android.widget.EditText r0 = r3.A0b
            if (r0 == 0) goto L_0x00e7
            android.text.Editable r2 = r0.getText()
        L_0x000d:
            java.lang.CharSequence r7 = r3.getHint()
            java.lang.CharSequence r5 = r3.getError()
            java.lang.CharSequence r1 = r3.getPlaceholderText()
            int r4 = r3.A07
            java.lang.CharSequence r12 = r3.getCounterOverflowDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r11 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r6 = r0 ^ 1
            boolean r0 = r3.A0w
            r10 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r9 = r0 ^ 1
            if (r9 != 0) goto L_0x003e
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r8 = 0
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r8 = 1
        L_0x003f:
            if (r6 == 0) goto L_0x00e3
            java.lang.String r6 = r7.toString()
        L_0x0045:
            X.6Fe r0 = r3.A19
            r0.setupAccessibilityNodeInfo(r15)
            java.lang.String r7 = ", "
            if (r11 == 0) goto L_0x00c2
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A01
            r0.setText(r2)
        L_0x0053:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0067
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00af
            r15.A0A(r6)
        L_0x0062:
            r0 = r11 ^ 1
            r15.A0K(r0)
        L_0x0067:
            if (r2 == 0) goto L_0x00ad
            int r0 = r2.length()
            if (r0 != r4) goto L_0x00ad
        L_0x006f:
            android.view.accessibility.AccessibilityNodeInfo r2 = r15.A01
            r2.setMaxTextLength(r4)
            if (r8 == 0) goto L_0x007c
            if (r9 != 0) goto L_0x0079
            r5 = r12
        L_0x0079:
            r2.setError(r5)
        L_0x007c:
            X.7bX r0 = r3.A18
            android.widget.TextView r0 = r0.A0D
            if (r0 == 0) goto L_0x0085
            r2.setLabelFor(r0)
        L_0x0085:
            X.6Ff r0 = r3.A17
            X.7c0 r1 = r0.getEndIconDelegate()
            boolean r0 = r1 instanceof X.AnonymousClass6ZR
            if (r0 == 0) goto L_0x00ac
            X.6ZR r1 = (X.AnonymousClass6ZR) r1
            android.widget.AutoCompleteTextView r0 = r1.A04
            int r0 = r0.getInputType()
            if (r0 != 0) goto L_0x00a2
            java.lang.Class<android.widget.Spinner> r0 = android.widget.Spinner.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
        L_0x00a2:
            boolean r0 = r15.A0L()
            if (r0 == 0) goto L_0x00ac
            r0 = 0
            r15.A0A(r0)
        L_0x00ac:
            return
        L_0x00ad:
            r4 = -1
            goto L_0x006f
        L_0x00af:
            if (r11 == 0) goto L_0x00bc
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            r0.append(r2)
            java.lang.String r6 = X.AnonymousClass000.A0V(r7, r6, r0)
        L_0x00bc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A01
            r0.setText(r6)
            goto L_0x0062
        L_0x00c2:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00e0
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A01
            r0.setText(r6)
            if (r10 == 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r6, r7)
            java.lang.String r1 = X.AnonymousClass000.A0R(r1, r0)
        L_0x00d9:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A01
            r0.setText(r1)
            goto L_0x0053
        L_0x00e0:
            if (r1 == 0) goto L_0x0053
            goto L_0x00d9
        L_0x00e3:
            java.lang.String r6 = ""
            goto L_0x0045
        L_0x00e7:
            r2 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GS.A0D(android.view.View, X.0Ui):void");
    }
}
