package X;

import android.view.View;

/* renamed from: X.9ob  reason: invalid class name and case insensitive filesystem */
public class C203969ob extends C109665ez {
    public Object A00;
    public final int A01;

    public C203969ob(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C203969ob(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f3, code lost:
        r3.BkM(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01be, code lost:
        X.C204219p0.A01(r2, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c1, code lost:
        X.C18280x3.A0q(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x003a;
                case 2: goto L_0x0184;
                case 3: goto L_0x008f;
                case 4: goto L_0x009b;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00dc;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00f7;
                case 9: goto L_0x0107;
                case 10: goto L_0x0123;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r5.A00
            com.whatsapp.shops.ShopsProductPreviewFragment r4 = (com.whatsapp.shops.ShopsProductPreviewFragment) r4
            X.4Fm r3 = r4.A02
            X.03q r2 = r4.A0R()
            java.lang.String r0 = r4.A07
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r3.BkW(r2, r1, r0)
            com.whatsapp.shops.ShopsProductPreviewFragmentViewModel r2 = r4.A04
            X.65p r0 = r2.A01
            boolean r0 = r0.BJ8()
            if (r0 == 0) goto L_0x0039
            X.4rS r1 = new X.4rS
            r1.<init>()
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A01 = r0
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A00 = r0
            X.4FV r0 = r2.A00
            r0.BhD(r1)
        L_0x0039:
            return
        L_0x003a:
            java.lang.Object r4 = r5.A00
            X.9BX r4 = (X.AnonymousClass9BX) r4
            X.9Fx r2 = r4.A0O
            java.lang.String r0 = "DyiViewModel/download-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 3
            r2.A0G(r1)
            X.08M r0 = r2.A02
            X.C06270Wx.A04(r0, r1)
            X.4FS r1 = r2.A08
            X.9gs r0 = new X.9gs
            r0.<init>(r2)
            r1.BkM(r0)
            boolean r0 = r4.A0V
            if (r0 == 0) goto L_0x0039
            X.33i r0 = r4.A08
            android.content.ClipboardManager r2 = r0.A0C()
            if (r2 == 0) goto L_0x0140
            goto L_0x012e
        L_0x0066:
            java.lang.Object r1 = r5.A00
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            r0 = 2132083223(0x7f150217, float:1.9806582E38)
            X.0zH r2 = X.AnonymousClass5V0.A01(r1, r0)
            r0 = 2131888761(0x7f120a79, float:1.9412166E38)
            r2.A0U(r0)
            android.content.Context r1 = r1.getBaseContext()
            r0 = 2131888762(0x7f120a7a, float:1.9412168E38)
            X.C19340zH.A01(r1, r2, r0)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 0
            r2.A0W(r0, r1)
            r1 = 2131895799(0x7f1225f7, float:1.9426441E38)
            r0 = 8
            goto L_0x01be
        L_0x008f:
            java.lang.Object r1 = r5.A00
            X.9BX r1 = (X.AnonymousClass9BX) r1
            java.lang.String r0 = X.C1899693i.A0b(r1)
            r1.A7B(r0)
            return
        L_0x009b:
            java.lang.Object r2 = r5.A00
            X.9BY r2 = (X.AnonymousClass9BY) r2
            X.9Ss r1 = r2.A0H
            X.99n r0 = r1.A0D
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00b1
            X.4FS r3 = r1.A0A
            X.9iS r0 = new X.9iS
            r0.<init>(r2, r1)
            goto L_0x00f3
        L_0x00b1:
            r0 = 101(0x65, float:1.42E-43)
            X.C621433s.A01(r2, r0)
            return
        L_0x00b7:
            java.lang.Object r3 = r5.A00
            X.9BY r3 = (X.AnonymousClass9BY) r3
            X.9Ss r0 = r3.A0H
            X.9U4 r1 = r0.A07
            java.lang.String r0 = "FBPAY"
            X.9oC r2 = r1.A0H(r0)
            X.C626936e.A06(r2)
            java.lang.String r1 = "personal"
            java.lang.String r0 = "FB"
            android.content.Intent r0 = r2.B7D(r3, r1, r0)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "PAY: BrazilPaymentAccountActionsContainerPresenter/onRequestPaymentInfoSelected - Invalid dyi report intent"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x00d8:
            r3.startActivity(r0)
            return
        L_0x00dc:
            java.lang.Object r0 = r5.A00
            X.9BI r0 = (X.AnonymousClass9BI) r0
            X.4FS r3 = r0.A0F
            X.9gf r0 = new X.9gf
            r0.<init>(r5)
            goto L_0x00f3
        L_0x00e8:
            java.lang.Object r0 = r5.A00
            X.9BI r0 = (X.AnonymousClass9BI) r0
            X.4FS r3 = r0.A0F
            X.9gg r0 = new X.9gg
            r0.<init>(r5)
        L_0x00f3:
            r3.BkM(r0)
            return
        L_0x00f7:
            java.lang.Object r2 = r5.A00
            com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet r2 = (com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet) r2
            java.lang.Integer r1 = X.C18290x4.A0a()
            r0 = 1
            r2.A1e(r0, r1)
            r2.A1K()
            return
        L_0x0107:
            java.lang.Object r2 = r5.A00
            X.9an r2 = (X.C196409an) r2
            android.widget.LinearLayout r1 = r2.A07
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r2.A0D = r0
            r2.A0F = r0
            com.whatsapp.mentions.MentionableEntry r0 = r2.A0B
            r1 = 0
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r2.A06
            r0.setVisibility(r1)
            return
        L_0x0123:
            java.lang.Object r0 = r5.A00
            com.whatsapp.payments.ui.widget.PaymentView r0 = (com.whatsapp.payments.ui.widget.PaymentView) r0
            X.9Su r1 = r0.A14
            r0 = 2
            r1.A01(r0)
            return
        L_0x012e:
            java.lang.String r1 = "password"
            java.lang.String r0 = r4.A0U     // Catch:{ NullPointerException | SecurityException -> 0x013a }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x013a }
            r2.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x013a }
            goto L_0x0140
        L_0x013a:
            r1 = move-exception
            java.lang.String r0 = "paymentsDyi/clipboard/"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0140:
            r0 = 2132083223(0x7f150217, float:1.9806582E38)
            X.0zH r2 = X.AnonymousClass5V0.A01(r4, r0)
            r0 = 2131888771(0x7f120a83, float:1.9412187E38)
            r2.A0U(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            android.content.Context r1 = r4.getBaseContext()
            r0 = 2131888769(0x7f120a81, float:1.9412183E38)
            java.lang.String r0 = r1.getString(r0)
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            java.lang.String r0 = r4.A0U
            r3.append(r0)
            java.lang.String r0 = "\n\n"
            r3.append(r0)
            r0 = 2131888770(0x7f120a82, float:1.9412185E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)
            r2.A0g(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 0
            r2.A0W(r0, r1)
            goto L_0x01c1
        L_0x0184:
            java.lang.Object r1 = r5.A00
            X.9BX r1 = (X.AnonymousClass9BX) r1
            r0 = 2132083223(0x7f150217, float:1.9806582E38)
            X.0zH r2 = X.AnonymousClass5V0.A01(r1, r0)
            android.content.Context r4 = r1.getBaseContext()
            java.lang.String r3 = r1.A0S
            java.lang.String r0 = "business"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01c9
            java.lang.String r0 = "personal"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01c5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDyiExportDialogLabelTextRes - this payment account type is not supported. Payment account type = "
            X.C18260x0.A0r(r0, r3, r1)
            r0 = -1
        L_0x01af:
            X.C19340zH.A01(r4, r2, r0)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 0
            r2.A0W(r0, r1)
            r1 = 2131888765(0x7f120a7d, float:1.9412175E38)
            r0 = 9
        L_0x01be:
            X.C204219p0.A01(r2, r5, r0, r1)
        L_0x01c1:
            X.C18280x3.A0q(r2)
            return
        L_0x01c5:
            r0 = 2131888766(0x7f120a7e, float:1.9412177E38)
            goto L_0x01af
        L_0x01c9:
            r0 = 2131888758(0x7f120a76, float:1.941216E38)
            goto L_0x01af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203969ob.A07(android.view.View):void");
    }
}
