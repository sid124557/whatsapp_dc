package X;

import com.whatsapp.status.playback.widget.StatusEditText;

/* renamed from: X.52Q  reason: invalid class name */
public class AnonymousClass52Q extends C166677z5 {
    public final /* synthetic */ AnonymousClass5WL A00;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d4, code lost:
        if (r4.A05 != false) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r14) {
        /*
            r13 = this;
            r8 = r14
            int r1 = r14.length()
            java.lang.Class<android.text.style.UnderlineSpan> r0 = android.text.style.UnderlineSpan.class
            r12 = 0
            java.lang.Object[] r3 = r14.getSpans(r12, r1, r0)
            android.text.style.UnderlineSpan[] r3 = (android.text.style.UnderlineSpan[]) r3
            int r2 = r3.length
            r1 = 0
        L_0x0010:
            if (r1 >= r2) goto L_0x001a
            r0 = r3[r1]
            r14.removeSpan(r0)
            int r1 = r1 + 1
            goto L_0x0010
        L_0x001a:
            X.5WL r4 = r13.A00
            com.whatsapp.status.playback.widget.StatusEditText r3 = r4.A0L
            android.content.Context r7 = r3.getContext()
            X.5Y0 r6 = r4.A0D
            X.33i r5 = r4.A0B
            X.2y5 r2 = r4.A0H
            android.text.TextPaint r1 = r3.getPaint()
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            r11 = 1
            X.C18270x1.A11(r7, r11, r6)
            X.C107345b9.A08(r7, r1, r14, r6, r0)
            X.C107635bd.A0M(r14, r12)
            int r0 = r1.getColor()
            X.C107635bd.A09(r5, r2, r14, r0, r11)
            java.lang.String r2 = r14.toString()
            X.5po r0 = r4.A0N
            X.7VK r0 = r0.A05
            r0.A01(r2)
            int r0 = android.text.TextUtils.getTrimmedLength(r2)
            boolean r1 = X.AnonymousClass001.A1W(r0)
            X.2X0 r0 = r4.A0J
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x008a
            if (r1 == 0) goto L_0x008a
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x008a
            X.5mK r0 = r4.A0K
            X.5Z9 r6 = r0.A0C
            X.2X0 r0 = r6.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0088
            X.4sW r5 = r6.A01()
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A03 = r0
            X.5Hx r1 = r6.A05
            java.lang.Integer r0 = r1.A01
            r5.A02 = r0
            java.lang.Integer r0 = r1.A00
            r5.A01 = r0
            X.4FV r0 = r6.A02
            r0.BhB(r5)
        L_0x0088:
            r4.A04 = r11
        L_0x008a:
            X.5Zz r0 = r4.A0F
            java.lang.String r6 = r0.A03(r2)
            int r5 = r2.length()
            int r1 = X.C107415bH.A03(r2, r12, r5)
            X.08M r0 = r4.A08
            X.C06270Wx.A03(r0, r1)
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x00b7
            X.4UA r7 = r4.A0A
            X.7aS r9 = r4.A01
            if (r9 != 0) goto L_0x00b2
            X.7Ua r1 = r4.A09
            X.7SV r0 = r4.A0I
            X.7aS r9 = new X.7aS
            r9.<init>(r1, r0)
            r4.A01 = r9
        L_0x00b2:
            X.4uZ r10 = r4.A0E
            r7.A0E(r8, r9, r10, r11, r12)
        L_0x00b7:
            int r0 = r14.length()
            int r7 = X.AnonymousClass5VB.A01(r14, r12, r0)
            int r0 = X.AnonymousClass5WL.A00(r14, r12, r0)
            int r0 = r0 * 49
            int r7 = r7 + r0
            if (r6 == 0) goto L_0x00d6
            java.lang.String r0 = r4.A03
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00d6
            boolean r1 = r4.A05
            r0 = 350(0x15e, float:4.9E-43)
            if (r1 == 0) goto L_0x00d8
        L_0x00d6:
            r0 = 700(0x2bc, float:9.81E-43)
        L_0x00d8:
            if (r7 < r0) goto L_0x00f2
            int r0 = r4.A00
            if (r0 != 0) goto L_0x00f2
            int r1 = r3.getInputType()
            r4.A00 = r1
            if (r1 == 0) goto L_0x00f2
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r3.setInputType(r1)
            r3.setText(r2)
            r3.setCursorPosition(r5)
        L_0x00f2:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r9 = 0
            if (r0 != 0) goto L_0x0144
            java.util.regex.Pattern r1 = X.C100885Cq.A01
            r0 = 4096(0x1000, float:5.74E-42)
            if (r5 <= r0) goto L_0x0142
            java.lang.String r0 = r2.substring(r12, r0)
        L_0x0103:
            java.util.regex.Matcher r10 = r1.matcher(r0)
        L_0x0107:
            boolean r0 = r10.find()
            if (r0 == 0) goto L_0x0144
            int r1 = r10.start()
            int r0 = r10.end()
            android.util.Pair r8 = X.C106685Zz.A00(r2, r1, r0)
            if (r8 == 0) goto L_0x0107
            int r1 = X.C18280x3.A03(r8)
            int r0 = X.C18290x4.A03(r8)
            java.lang.String r7 = r2.substring(r1, r0)
            java.lang.String[] r5 = X.C100885Cq.A03
            int r4 = r5.length
            r1 = 0
        L_0x012b:
            if (r1 >= r4) goto L_0x0107
            r0 = r5[r1]
            boolean r0 = X.C106685Zz.A02(r7, r0)
            if (r0 == 0) goto L_0x013f
            if (r9 != 0) goto L_0x013b
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
        L_0x013b:
            X.C86614Ku.A1T(r8, r9)
            goto L_0x0107
        L_0x013f:
            int r1 = r1 + 1
            goto L_0x012b
        L_0x0142:
            r0 = r2
            goto L_0x0103
        L_0x0144:
            if (r6 == 0) goto L_0x019b
            if (r9 == 0) goto L_0x019b
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x019b
            android.text.Editable r0 = r3.getText()
            if (r0 == 0) goto L_0x019b
        L_0x0154:
            int r0 = r9.size()
            if (r12 >= r0) goto L_0x019b
            int r1 = X.C86624Kv.A03(r3)
            java.lang.Object r0 = r9.get(r12)
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C18280x3.A03(r0)
            if (r0 >= r1) goto L_0x0198
            java.lang.Object r0 = r9.get(r12)
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C18290x4.A03(r0)
            if (r0 >= r1) goto L_0x0198
            android.text.Editable r5 = r3.getText()
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            java.lang.Object r0 = r9.get(r12)
            android.util.Pair r0 = (android.util.Pair) r0
            int r2 = X.C18280x3.A03(r0)
            java.lang.Object r0 = r9.get(r12)
            android.util.Pair r0 = (android.util.Pair) r0
            int r1 = X.C18290x4.A03(r0)
            r0 = 33
            r5.setSpan(r4, r2, r1, r0)
        L_0x0198:
            int r12 = r12 + 1
            goto L_0x0154
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52Q.afterTextChanged(android.text.Editable):void");
    }

    public AnonymousClass52Q(AnonymousClass5WL r1) {
        this.A00 = r1;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        AnonymousClass5WL r4 = this.A00;
        r4.A0G.A00(C135166kE.A00);
        AnonymousClass4UA r3 = r4.A0A;
        boolean z = false;
        if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
            z = true;
        }
        r3.A09 = z;
        StatusEditText statusEditText = r4.A0L;
        if (statusEditText.getText() != null && i + i3 == C86624Kv.A03(statusEditText)) {
            r4.A07.post(new C117635sF(this, 46));
        }
    }
}
