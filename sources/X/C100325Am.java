package X;

/* renamed from: X.5Am  reason: invalid class name and case insensitive filesystem */
public class C100325Am {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r2.size() >= 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C93314oJ r14, X.AnonymousClass677 r15, com.whatsapp.conversation.conversationrow.DynamicButtonsLayout r16, com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout r17, X.C620733j r18, X.C42592Ot r19) {
        /*
            r0 = r19
            if (r19 == 0) goto L_0x003e
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.List r3 = r0.A02
            java.util.Iterator r2 = r3.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r2.next()
            X.2bn r1 = (X.C46532bn) r1
            X.398 r0 = r1.A02
            if (r0 != 0) goto L_0x000e
            r4.add(r1)
            goto L_0x000e
        L_0x0022:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r3.iterator()
        L_0x002a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r3.next()
            X.2bn r1 = (X.C46532bn) r1
            X.398 r0 = r1.A02
            if (r0 == 0) goto L_0x002a
            r2.add(r1)
            goto L_0x002a
        L_0x003e:
            r4 = 0
            r2 = r4
        L_0x0040:
            r8 = 0
            r11 = 8
            r1 = r16
            if (r15 == 0) goto L_0x0182
            boolean r0 = r15.BoV()
            if (r0 == 0) goto L_0x0182
            if (r4 == 0) goto L_0x0182
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0182
            X.5MT r0 = r14.A2U
            r1.A04(r0, r4)
            r1.setVisibility(r8)
        L_0x005d:
            r9 = r17
            if (r2 == 0) goto L_0x018b
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x018b
            int r0 = r2.size()
            r7 = 0
            if (r0 <= 0) goto L_0x0076
            int r3 = r2.size()
            r1 = 3
            r0 = 1
            if (r3 < r1) goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            X.C626936e.A0B(r0)
            com.whatsapp.TextEmojiLabel[] r6 = r9.A08
            r0 = r6[r8]
            r0.setVisibility(r11)
            android.view.View[] r5 = r9.A07
            r0 = r5[r8]
            r0.setVisibility(r11)
            r1 = 1
            r0 = r6[r1]
            r0.setVisibility(r11)
            r0 = r5[r1]
            r0.setVisibility(r11)
            android.view.View r12 = r9.A03
            r12.setVisibility(r11)
            android.view.View r10 = r9.A04
            r10.setVisibility(r11)
            java.util.List r4 = r9.A06
            r4.clear()
            r4.addAll(r2)
            r3 = 0
            java.lang.Object r0 = r4.get(r8)
            X.2bn r0 = (X.C46532bn) r0
            X.398 r1 = r0.A02
            if (r1 == 0) goto L_0x00c1
            X.8qC r0 = r9.A00
            java.lang.Object r0 = r0.get()
            X.30C r0 = (X.AnonymousClass30C) r0
            java.lang.String r2 = r1.A00
            java.lang.String r1 = r1.A01
            X.2Vs r0 = r0.A02
            r0.A00(r2, r1)
        L_0x00c1:
            r13 = -2
            r2 = 1
            android.widget.LinearLayout r0 = r9.A05
            r0.setOrientation(r2)
            r0 = -1
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r13)
            r0 = r5[r8]
            r0.setLayoutParams(r1)
            r0 = r5[r2]
            r0.setLayoutParams(r1)
            int r0 = r4.size()
            if (r0 > r2) goto L_0x00e0
            r3 = 8
        L_0x00e0:
            r12.setVisibility(r3)
            r10.setVisibility(r11)
        L_0x00e6:
            int r0 = r4.size()
            if (r7 >= r0) goto L_0x0187
            java.lang.Object r10 = r4.get(r7)
            X.2bn r10 = (X.C46532bn) r10
            X.C626936e.A06(r10)
            X.398 r12 = r10.A02
            if (r12 == 0) goto L_0x0180
            X.8qC r0 = r9.A00
            java.lang.Object r0 = r0.get()
            X.30C r0 = (X.AnonymousClass30C) r0
            java.lang.String r2 = r12.A00
            java.lang.String r1 = r12.A01
            X.2Vs r0 = r0.A02
            X.2sP r13 = r0.A00(r2, r1)
        L_0x010b:
            r11 = r6[r7]
            r3 = r5[r7]
            r11.setVisibility(r8)
            float r0 = r14.getTextFontSize()
            r11.setTextSize(r0)
            r3.setVisibility(r8)
            X.C626936e.A06(r12)
            X.8qC r0 = r9.A00
            java.lang.Object r0 = r0.get()
            X.30C r0 = (X.AnonymousClass30C) r0
            java.lang.String r2 = r12.A00
            java.lang.String r1 = r12.A01
            X.2Vs r0 = r0.A02
            X.2sP r1 = r0.A00(r2, r1)
            if (r1 != 0) goto L_0x0177
            r2 = 0
        L_0x0134:
            r11.setText(r2)
            boolean r0 = r10.A00
            r11.setSelected(r0)
            if (r13 == 0) goto L_0x0152
            int r1 = r13.A03()
            r0 = -1
            if (r1 == r0) goto L_0x0152
            android.content.Context r0 = r9.getContext()
            r12 = r18
            X.6dx r0 = X.AnonymousClass0x7.A0J(r0, r12, r1)
            r11.A0G(r0)
        L_0x0152:
            boolean r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x016f
            r3.setClickable(r8)
        L_0x015a:
            r3.setContentDescription(r2)
            X.C107295b4.A02(r3)
            r3.setLongClickable(r1)
            X.4TC r0 = new X.4TC
            r0.<init>(r9, r2)
            X.C06560Yg.A0O(r3, r0)
            int r7 = r7 + 1
            goto L_0x00e6
        L_0x016f:
            r3.setClickable(r1)
            r0 = 2
            X.C109715f4.A00(r3, r10, r14, r7, r0)
            goto L_0x015a
        L_0x0177:
            android.content.Context r0 = r9.getContext()
            java.lang.String r2 = r1.A06(r0, r12)
            goto L_0x0134
        L_0x0180:
            r13 = 0
            goto L_0x010b
        L_0x0182:
            r1.setVisibility(r11)
            goto L_0x005d
        L_0x0187:
            r9.setVisibility(r8)
            return
        L_0x018b:
            r9.setVisibility(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100325Am.A00(X.4oJ, X.677, com.whatsapp.conversation.conversationrow.DynamicButtonsLayout, com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout, X.33j, X.2Ot):void");
    }
}
