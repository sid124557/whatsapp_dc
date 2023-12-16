package X;

import android.content.res.Resources;
import com.whatsapp.WaImageView;

/* renamed from: X.1Pq  reason: invalid class name */
public class AnonymousClass1Pq extends C150427Qr {
    public WaImageView A00;
    public final Resources A01;
    public final C620733j A02;
    public final AnonymousClass1VX A03;
    public final C1907099n A04;
    public final C195219Wq A05;
    public final C185528tp A06 = new C57252tL(this, 0);
    public final C33141sV A07;

    public AnonymousClass1Pq(C54292oU r3, C620733j r4, AnonymousClass1VX r5, C1907099n r6, C195219Wq r7, C33141sV r8) {
        this.A03 = r5;
        this.A05 = r7;
        this.A02 = r4;
        this.A01 = C54292oU.A00(r3);
        this.A07 = r8;
        this.A04 = r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0192 A[SYNTHETIC, Splitter:B:54:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.widget.FrameLayout r12, X.C93314oJ r13, X.C624134x r14, X.AnonymousClass39W r15) {
        /*
            r11 = this;
            r12.removeAllViews()
            java.lang.String r0 = "payment_method"
            boolean r0 = X.AnonymousClass39W.A00(r15, r0)
            if (r0 != 0) goto L_0x020c
            java.lang.String r0 = "payment_status"
            boolean r0 = X.AnonymousClass39W.A00(r15, r0)
            if (r0 != 0) goto L_0x020c
            android.content.Context r0 = r12.getContext()
            X.1Hg r3 = new X.1Hg
            r3.<init>(r0)
            r12.addView(r3)
            X.39S r7 = r15.A01
            X.C626936e.A06(r7)
            android.content.res.Resources r8 = r11.A01
            X.1VX r6 = r11.A03
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r0 = 4248(0x1098, float:5.953E-42)
            X.2vE r5 = X.C58422vE.A02
            int r1 = r6.A0O(r5, r0)
            r0 = 1
            if (r1 == r0) goto L_0x018d
            r0 = 2
            if (r1 == r0) goto L_0x0188
            r0 = 3
            r2 = 2131895749(0x7f1225c5, float:1.942634E38)
            if (r1 == r0) goto L_0x0045
            r2 = 2131895746(0x7f1225c2, float:1.9426334E38)
        L_0x0045:
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            java.lang.String r0 = r7.A0E
            r4 = 0
            java.lang.String r1 = X.C18320x8.A0b(r8, r0, r1, r4, r2)
            com.whatsapp.TextEmojiLabel r0 = r3.A05
            r0.setText(r1)
            X.99n r1 = r11.A04
            java.lang.String r2 = r7.A0D
            java.util.List r0 = r7.A0K
            boolean r0 = r1.A0L(r2, r0)
            r2 = 8
            if (r0 == 0) goto L_0x017d
            java.lang.String r8 = "captured"
            java.lang.String r0 = r7.A03
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x017d
            X.5UY r0 = r3.A08
            android.view.View r0 = r0.A04()
            r0.setVisibility(r4)
        L_0x0076:
            X.33j r10 = r11.A02
            java.lang.String r0 = r7.A05(r10)
            com.whatsapp.TextEmojiLabel r8 = r3.A03
            java.lang.CharSequence r0 = r13.A1E(r0)
            r8.setText(r0)
            X.9Wq r0 = r11.A05
            boolean r0 = r0.A0x(r7)
            if (r0 == 0) goto L_0x016a
            X.39L r0 = r7.A01
            if (r0 != 0) goto L_0x0159
            r0 = 0
        L_0x0092:
            com.whatsapp.TextEmojiLabel r9 = r3.A02
            java.lang.CharSequence r0 = r13.A1E(r0)
            r9.setText(r0)
            r9.setVisibility(r4)
            r8.A0A()
            X.C192719Lh.A00(r8)
        L_0x00a4:
            android.view.View r0 = r3.A00
            r0.setVisibility(r4)
            java.lang.String r4 = r7.A0A
            X.1VX r1 = r1.A02
            r0 = 5574(0x15c6, float:7.811E-42)
            boolean r0 = r1.A0Y(r5, r0)
            r8 = 8
            if (r0 != 0) goto L_0x0150
            r0 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = r1.A0Y(r5, r0)
            if (r0 != 0) goto L_0x0150
        L_0x00bf:
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.setVisibility(r8)
            if (r8 != 0) goto L_0x00c9
            r0.setText(r4)
        L_0x00c9:
            X.39H r4 = r7.A07
            java.lang.String r8 = r4.A08
            java.lang.String r0 = "PAYMENT_REQUEST"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0100
            r0 = 5574(0x15c6, float:7.811E-42)
            boolean r0 = r1.A0Y(r5, r0)
            if (r0 != 0) goto L_0x00e5
            r0 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = r1.A0Y(r5, r0)
            if (r0 == 0) goto L_0x0100
        L_0x00e5:
            com.whatsapp.TextEmojiLabel r0 = r3.A06
            r0.setVisibility(r2)
        L_0x00ea:
            com.whatsapp.TextEmojiLabel r0 = r3.A04
            r0.setVisibility(r2)
        L_0x00ef:
            r0 = 5944(0x1738, float:8.33E-42)
            org.json.JSONObject r4 = r6.A0T(r5, r0)
            java.lang.String r1 = "updated_order_bubble_subtext"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x019d
            goto L_0x0192
        L_0x0100:
            com.whatsapp.TextEmojiLabel r1 = r3.A06
            java.lang.String r0 = r7.A0F
            java.lang.CharSequence r0 = r13.A1E(r0)
            r1.setText(r0)
            java.util.List r10 = r4.A09
            int r0 = r4.A00()
            if (r0 == 0) goto L_0x00ea
            X.C626936e.A06(r10)
            int r1 = r10.size()
            r8 = 0
            r0 = 1
            if (r1 != r0) goto L_0x0140
            android.content.Context r9 = r12.getContext()
            r4 = 2131887771(0x7f12069b, float:1.9410158E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r0 = r10.get(r8)
            X.39F r0 = (X.AnonymousClass39F) r0
            int r0 = r0.A00
            X.AnonymousClass000.A1P(r1, r0, r8)
            java.lang.String r0 = r9.getString(r4, r1)
        L_0x0136:
            com.whatsapp.TextEmojiLabel r1 = r3.A04
            java.lang.CharSequence r0 = r13.A1E(r0)
            r1.setText(r0)
            goto L_0x00ef
        L_0x0140:
            int r4 = r4.A00()
            android.content.res.Resources r1 = X.C18290x4.A0G(r12)
            r0 = 2131755373(0x7f10016d, float:1.9141623E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r4, r8, r0)
            goto L_0x0136
        L_0x0150:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00bf
            r8 = 0
            goto L_0x00bf
        L_0x0159:
            X.4Fi r9 = r7.A06
            X.C626936e.A06(r9)
            X.39L r0 = r7.A01
            X.39Q r0 = r0.A02
            java.math.BigDecimal r0 = r0.A00
            java.lang.String r0 = r9.B3W(r10, r0)
            goto L_0x0092
        L_0x016a:
            com.whatsapp.TextEmojiLabel r0 = r3.A02
            r0.setVisibility(r2)
            X.C106905aM.A04(r8)
            int r0 = r8.getPaintFlags()
            r0 = r0 & -17
            r8.setPaintFlags(r0)
            goto L_0x00a4
        L_0x017d:
            X.5UY r0 = r3.A08
            android.view.View r0 = r0.A04()
            r0.setVisibility(r2)
            goto L_0x0076
        L_0x0188:
            r2 = 2131895748(0x7f1225c4, float:1.9426338E38)
            goto L_0x0045
        L_0x018d:
            r2 = 2131895747(0x7f1225c3, float:1.9426336E38)
            goto L_0x0045
        L_0x0192:
            int r0 = r4.getInt(r1)     // Catch:{ JSONException -> 0x0197 }
            goto L_0x019e
        L_0x0197:
            r1 = move-exception
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_AWARENESS_EXPERIENCES_CODE#updated_order_bubble_subtext"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x019d:
            r0 = 0
        L_0x019e:
            r4 = 0
            if (r0 == 0) goto L_0x01d0
            X.5UY r5 = r3.A09
            android.view.View r1 = r5.A04()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131891503(0x7f12152f, float:1.9417728E38)
            r1.setText(r0)
            android.view.View r0 = r5.A04()
            r0.setVisibility(r4)
        L_0x01b6:
            com.whatsapp.WaImageView r0 = r3.A07
            r11.A00 = r0
            X.30w r0 = r14.A0y()
            if (r0 == 0) goto L_0x0207
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0207
            X.1sV r2 = r11.A07
            com.whatsapp.WaImageView r1 = r11.A00
            X.8tp r0 = r11.A06
            r2.A09(r1, r14, r0)
            return
        L_0x01d0:
            X.390 r0 = r7.A08
            if (r0 == 0) goto L_0x01fd
            int r1 = r0.A00
            r0 = 1
            if (r1 <= r0) goto L_0x01fd
            X.2z0 r0 = r14.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01fd
            r0 = 4443(0x115b, float:6.226E-42)
            boolean r0 = r6.A0Y(r5, r0)
            if (r0 == 0) goto L_0x01fd
            X.5UY r1 = r3.A09
            android.view.View r0 = r1.A04()
            r0.setVisibility(r4)
            android.view.View r1 = r1.A04()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131891502(0x7f12152e, float:1.9417726E38)
            r1.setText(r0)
            goto L_0x01b6
        L_0x01fd:
            X.5UY r0 = r3.A09
            android.view.View r0 = r0.A04()
            r0.setVisibility(r2)
            goto L_0x01b6
        L_0x0207:
            com.whatsapp.WaImageView r0 = r11.A00
            r0.setVisibility(r2)
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Pq.A00(android.widget.FrameLayout, X.4oJ, X.34x, X.39W):void");
    }
}
