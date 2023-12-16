package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.0Cy  reason: invalid class name and case insensitive filesystem */
public class C01970Cy extends AnonymousClass6NB {
    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r3, AnonymousClass84O r4, Object obj, Object obj2) {
        ((C17030uR) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r3.A0W(58, false) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void A0P(android.view.View r21, X.C153427bI r22, X.AnonymousClass84O r23) {
        /*
            r20 = this;
            r0 = 35
            r1 = 0
            r3 = r23
            boolean r4 = r3.A0W(r0, r1)
            r0 = 51
            boolean r0 = r3.A0W(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x001c
            r0 = 58
            boolean r0 = r3.A0W(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r18 = 1
        L_0x001e:
            r0 = 36
            X.48t r17 = r3.A0L(r0)
            r13 = r21
            r1 = r13
            X.0uR r1 = (X.C17030uR) r1
            r1.setChecked(r4)
            r0 = 38
            boolean r0 = r3.A0W(r0, r2)
            r13.setEnabled(r0)
            r15 = r22
            if (r18 != 0) goto L_0x003b
            if (r17 == 0) goto L_0x0049
        L_0x003b:
            X.0am r12 = new X.0am
            r14 = r20
            r16 = r3
            r19 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1.setOnCheckedChangeListener(r12)
        L_0x0049:
            android.content.Context r4 = r15.A00()
            r0 = 40
            X.84O r0 = r3.A0K(r0)
            r14 = 0
            if (r0 != 0) goto L_0x0128
            r5 = r14
        L_0x0057:
            r0 = 41
            X.84O r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x011e
            r6 = r14
        L_0x0060:
            r0 = 43
            X.84O r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x0114
            r8 = r14
        L_0x0069:
            r0 = 48
            X.84O r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x010a
            r9 = r14
        L_0x0072:
            r0 = 42
            X.84O r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x0100
            r10 = r14
        L_0x007b:
            r0 = 46
            X.84O r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x00f7
            r11 = r14
        L_0x0084:
            r0 = 45
            X.84O r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x00ee
            r7 = r14
        L_0x008d:
            r0 = 50
            X.84O r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x00e5
            r12 = r14
        L_0x0096:
            r0 = 44
            X.84O r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x00dc
            r13 = r14
        L_0x009f:
            r0 = 49
            X.84O r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x00d3
            r3 = r14
        L_0x00a8:
            if (r8 != 0) goto L_0x00cb
            if (r10 != 0) goto L_0x00cb
            if (r9 != 0) goto L_0x00af
            r9 = r5
        L_0x00af:
            if (r11 != 0) goto L_0x00b2
            r11 = r6
        L_0x00b2:
            android.content.res.ColorStateList r0 = X.AnonymousClass0VQ.A00(r4, r5, r6, r9, r11)
            r1.setThumbTintList(r0)
        L_0x00b9:
            if (r7 != 0) goto L_0x0132
            if (r13 != 0) goto L_0x0132
            if (r12 != 0) goto L_0x00c0
            r12 = r5
        L_0x00c0:
            if (r3 != 0) goto L_0x00c3
            r3 = r6
        L_0x00c3:
            android.content.res.ColorStateList r0 = X.AnonymousClass0VQ.A01(r4, r5, r6, r12, r3)
            r1.Bne(r0, r2)
            return r14
        L_0x00cb:
            android.content.res.ColorStateList r0 = X.AnonymousClass0VQ.A00(r4, r8, r10, r9, r11)
            r1.setThumbTintList(r0)
            goto L_0x00b9
        L_0x00d3:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x00a8
        L_0x00dc:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            goto L_0x009f
        L_0x00e5:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            goto L_0x0096
        L_0x00ee:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x008d
        L_0x00f7:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            goto L_0x0084
        L_0x0100:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            goto L_0x007b
        L_0x010a:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto L_0x0072
        L_0x0114:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L_0x0069
        L_0x011e:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            goto L_0x0060
        L_0x0128:
            int r0 = X.C154127ce.A00(r15, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L_0x0057
        L_0x0132:
            android.content.res.ColorStateList r0 = X.AnonymousClass0VQ.A01(r4, r7, r13, r12, r3)
            r1.Bne(r0, r2)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01970Cy.A0P(android.view.View, X.7bI, X.84O):java.lang.Void");
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return new AnonymousClass03O(context);
    }

    public C01970Cy(C153427bI r1, AnonymousClass84O r2) {
        super(r1, r2);
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, C153427bI r3, AnonymousClass84O r4, Object obj) {
        return A0P(view, r3, r4);
    }
}
