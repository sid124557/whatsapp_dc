package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0VW  reason: invalid class name */
public class AnonymousClass0VW {
    public static final Map A00;
    public static final Map A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0067, code lost:
        if (r1 == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004f, code lost:
        if (r1 == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.View r17, X.C153427bI r18, X.AnonymousClass84O r19, X.AnonymousClass84O r20) {
        /*
            r4 = r18
            r6 = r19
            java.lang.Object r11 = X.C162377rs.A05(r4, r6)
            X.0Ml r11 = (X.C04010Ml) r11
            if (r11 == 0) goto L_0x01bb
            r7 = r17
            java.lang.CharSequence r0 = r7.getContentDescription()
            java.lang.String r0 = (java.lang.String) r0
            r11.A03 = r0
            int r0 = r7.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A00 = r0
            int r0 = X.C06360Xi.A00(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A01 = r0
            boolean r0 = r7.isFocusable()
            r11.A05 = r0
            boolean r0 = r7.isSelected()
            r11.A08 = r0
            boolean r0 = r7.isEnabled()
            r11.A04 = r0
            r1 = 3
            X.0vm r0 = new X.0vm
            r0.<init>(r1)
            java.lang.Object r0 = r0.A02(r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0051
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            r11.A06 = r0
            r8 = 0
            X.0vm r0 = new X.0vm
            r0.<init>(r8)
            java.lang.Object r0 = r0.A02(r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0069
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            r11.A07 = r0
            X.065 r1 = new X.065
            r0 = r20
            r1.<init>(r4, r6, r0)
            X.C06560Yg.A0O(r7, r1)
            java.lang.String r0 = r11.A03
            r1 = 35
            java.lang.String r13 = r6.A0P(r1, r0)
            java.util.Map r2 = A00
            r0 = 42
            java.lang.String r0 = r6.A0O(r0)
            java.lang.Object r12 = r2.get(r0)
            java.lang.Number r12 = (java.lang.Number) r12
            java.util.Map r2 = A01
            r0 = 44
            java.lang.String r0 = r6.A0O(r0)
            java.lang.Object r10 = r2.get(r0)
            java.lang.Number r10 = (java.lang.Number) r10
            r2 = 40
            boolean r0 = r11.A05
            boolean r19 = r6.A0W(r2, r0)
            r2 = 49
            boolean r0 = r11.A08
            boolean r9 = r6.A0W(r2, r0)
            boolean r2 = r11.A04
            r0 = 38
            boolean r5 = r6.A0W(r0, r2)
            r2 = 41
            boolean r0 = r11.A06
            boolean r3 = r6.A0W(r2, r0)
            r2 = 48
            boolean r0 = r11.A07
            boolean r18 = r6.A0W(r2, r0)
            java.lang.Object r2 = r6.A0M()
            r0 = 55
            java.util.List r14 = r6.A0S(r0)
            if (r14 == 0) goto L_0x0141
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0141
            java.util.Iterator r17 = r14.iterator()
        L_0x00d8:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0141
            java.lang.Object r14 = r17.next()
            X.84O r14 = (X.AnonymousClass84O) r14
            java.lang.String r1 = r14.A0O(r1)
            r0 = 38
            X.48t r16 = r14.A0L(r0)
            if (r1 == 0) goto L_0x012f
            java.util.Map r15 = X.AnonymousClass065.A05
            boolean r0 = r15.containsKey(r1)
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r15.get(r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            java.lang.String r1 = "click"
            java.lang.Object r1 = r15.get(r1)
            X.AnonymousClass71S.A00(r1)
            int r14 = X.AnonymousClass001.A0K(r1)
            java.lang.String r1 = "long_click"
            java.lang.Object r1 = r15.get(r1)
            X.AnonymousClass71S.A00(r1)
            int r1 = X.AnonymousClass001.A0K(r1)
            r15 = 1
            if (r0 != r14) goto L_0x0132
            if (r16 == 0) goto L_0x012f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r1 > r0) goto L_0x012f
            r11.A09 = r15
            X.0aB r0 = new X.0aB
            r0.<init>(r14)
            r7.setOnClickListener(r0)
        L_0x012f:
            r1 = 35
            goto L_0x00d8
        L_0x0132:
            if (r0 != r1) goto L_0x012f
            if (r16 == 0) goto L_0x012f
            r11.A0A = r15
            X.0aN r0 = new X.0aN
            r0.<init>(r1)
            r7.setOnLongClickListener(r0)
            goto L_0x012f
        L_0x0141:
            java.lang.String r1 = r11.A02
            r7.setContentDescription(r13)
            r11.A02 = r13
            if (r10 == 0) goto L_0x0150
            int r0 = r10.intValue()
            if (r0 != 0) goto L_0x017b
        L_0x0150:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x017b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x017b
            boolean r0 = r13.equals(r1)
            if (r0 != 0) goto L_0x017b
            boolean r0 = r7.isAccessibilityFocused()
            if (r0 == 0) goto L_0x017b
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r0 = 2048(0x800, float:2.87E-42)
            r1.setEventType(r0)
            r0 = 4
            r1.setContentChangeTypes(r0)
            r1.setContentDescription(r13)
            r7.sendAccessibilityEventUnchecked(r1)
        L_0x017b:
            if (r12 != 0) goto L_0x017f
            java.lang.Integer r12 = r11.A00
        L_0x017f:
            int r0 = r12.intValue()
            r7.setImportantForAccessibility(r0)
            if (r10 != 0) goto L_0x018a
            java.lang.Integer r10 = r11.A01
        L_0x018a:
            int r0 = r10.intValue()
            X.C06360Xi.A01(r7, r0)
            r0 = r19
            r7.setFocusable(r0)
            if (r2 == 0) goto L_0x019b
            A01(r7, r4, r2)
        L_0x019b:
            r7.setSelected(r9)
            r7.setEnabled(r5)
            X.C06560Yg.A0T(r7, r3)
            X.0vm r1 = new X.0vm
            r1.<init>(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            r1.A03(r7, r0)
            r0 = 56
            java.util.List r1 = r6.A0S(r0)
            r0 = r20
            X.AnonymousClass0S5.A01(r4, r0, r1)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VW.A00(android.view.View, X.7bI, X.84O, X.84O):void");
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("auto", 0);
        Integer A0f = AnonymousClass001.A0f();
        A0t.put("yes", A0f);
        A0t.put("no", 2);
        A0t.put("no_hide_descendants", 4);
        A00 = Collections.unmodifiableMap(A0t);
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put("none", 0);
        A0t2.put("polite", A0f);
        A0t2.put("assertive", 2);
        A01 = Collections.unmodifiableMap(A0t2);
    }

    public static void A01(View view, C153427bI r3, Object obj) {
        new Handler(Looper.myLooper()).post(new C12750m4(view, r3, obj));
    }
}
