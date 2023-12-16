package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.BrazilDyiReportActivity;

/* renamed from: X.9BX  reason: invalid class name */
public abstract class AnonymousClass9BX extends AnonymousClass97X {
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public C85244Fm A03;
    public TextEmojiLabel A04;
    public WaImageView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public WaTextView A09;
    public WaTextView A0A;
    public C620733j A0B;
    public C66543Lv A0C;
    public C40602Ha A0D;
    public C620933l A0E;
    public AnonymousClass9U5 A0F;
    public AnonymousClass9WM A0G;
    public C197769dq A0H;
    public AnonymousClass9U4 A0I;
    public AnonymousClass9VU A0J;
    public AnonymousClass9VV A0K;
    public AnonymousClass9W3 A0L;
    public AnonymousClass9VB A0M;
    public AnonymousClass9TR A0N;
    public C191689Fx A0O;
    public AnonymousClass9YG A0P;
    public C194259Se A0Q;
    public C66433Lk A0R;
    public String A0S;
    public String A0T = "";
    public String A0U = "";
    public boolean A0V;

    public void A7A(int i, int i2) {
        AnonymousClass043 A012;
        BrazilDyiReportActivity brazilDyiReportActivity = (BrazilDyiReportActivity) this;
        int i3 = i;
        if (i == 477) {
            A012 = AnonymousClass9WM.A01(brazilDyiReportActivity, (DialogInterface.OnDismissListener) null, brazilDyiReportActivity.getString(R.string.f11nameremoved), brazilDyiReportActivity.getString(R.string.f11nameremoved));
        } else {
            A012 = brazilDyiReportActivity.A01.A01(brazilDyiReportActivity, brazilDyiReportActivity.A0D, brazilDyiReportActivity.A02, i3, i2);
        }
        A012.show();
    }

    public abstract void A7B(String str);

    public int A74() {
        String str = this.A0S;
        if (str.equals("business")) {
            return R.string.f11nameremoved;
        }
        if (!str.equals("personal")) {
            C18260x0.A0r("PAY: DyiReportBaseActivity/getDefaultReportFooterHeaderTextRes - this payment account type is not supported. Payment account type = ", str, AnonymousClass001.A0o());
            return -1;
        } else if (this.A0V) {
            return R.string.f11nameremoved;
        } else {
            return R.string.f11nameremoved;
        }
    }

    public int A75() {
        String str = this.A0S;
        if (str.equals("business") || str.equals("personal")) {
            return R.string.f11nameremoved;
        }
        C18260x0.A0r("PAY: DyiReportBaseActivity/getDefaultRequestReportTextRes - this payment account type is not supported. Payment account type = ", str, AnonymousClass001.A0o());
        return -1;
    }

    public int A76() {
        String str = this.A0S;
        if (str.equals("business") || str.equals("personal")) {
            return R.string.f11nameremoved;
        }
        C18260x0.A0r("PAY: DyiReportBaseActivity/getDyiReportButtonTitleRes - this payment account type is not supported. Payment account type = ", str, AnonymousClass001.A0o());
        return -1;
    }

    public int A77() {
        String str = this.A0S;
        if (str.equals("business") || str.equals("personal")) {
            return R.string.f11nameremoved;
        }
        C18260x0.A0r("PAY: DyiReportBaseActivity/getDyiDownloadingLabelTextRes - this payment account type is not supported. Payment account type = ", str, AnonymousClass001.A0o());
        return -1;
    }

    public int A78() {
        String str = this.A0S;
        if (str.equals("business") || str.equals("personal")) {
            return R.string.f11nameremoved;
        }
        C18260x0.A0r("PAY: DyiReportBaseActivity/getDyiExportButtonLabelTextRes - this payment account type is not supported. Payment account type = ", str, AnonymousClass001.A0o());
        return -1;
    }

    public String A79() {
        return this.A0R.A04("payments", "how-to-request-your-payments-account-information-br").toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: android.text.SpannableString} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0186, code lost:
        if (r8 == null) goto L_0x0188;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r7 = r27
            r13 = r28
            super.onCreate(r13)
            r0 = 2131624799(0x7f0e035f, float:1.8876788E38)
            int r12 = X.C1899693i.A01(r7, r0)
            X.0R8 r2 = r7.getSupportActionBar()
            r1 = 1
            if (r2 == 0) goto L_0x0021
            r0 = 2131888748(0x7f120a6c, float:1.941214E38)
            r2.A0B(r0)
            r2.A0N(r1)
            X.C1899593h.A0j(r7, r2, r12)
        L_0x0021:
            android.content.Intent r3 = r7.getIntent()
            if (r3 == 0) goto L_0x004d
            android.os.Bundle r0 = r3.getExtras()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x00e6
            android.os.Bundle r1 = r3.getExtras()
            java.lang.String r0 = "extra_paymentProvider"
            java.lang.String r0 = r1.getString(r0, r2)
        L_0x0039:
            r7.A0T = r0
            android.os.Bundle r0 = r3.getExtras()
            if (r0 == 0) goto L_0x00e2
            android.os.Bundle r1 = r3.getExtras()
            java.lang.String r0 = "extra_paymentAccountType"
            java.lang.String r0 = r1.getString(r0, r2)
        L_0x004b:
            r7.A0S = r0
        L_0x004d:
            r0 = 2131429607(0x7f0b08e7, float:1.8480892E38)
            android.view.View r1 = r7.findViewById(r0)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            r7.A04 = r1
            X.1VX r0 = r7.A0D
            X.AnonymousClass0x2.A14(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r7.A04
            X.33i r0 = r7.A08
            X.AnonymousClass0x2.A12(r1, r0)
            X.3Lk r2 = r7.A0R
            java.lang.String r1 = "payments"
            java.lang.String r0 = "how-to-request-your-payments-account-information-br"
            r2.A04(r1, r0)
            com.whatsapp.TextEmojiLabel r11 = r7.A04
            java.lang.String r2 = r7.A0S
            java.lang.String r0 = "business"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "personal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00f3
            java.lang.String r2 = r7.A79()
            r1 = 2131892048(0x7f121750, float:1.9418833E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            r10 = 0
            java.lang.String r0 = X.AnonymousClass002.A0F(r7, r2, r0, r10, r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r0)
            int r1 = r9.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r8 = r9.getSpans(r10, r1, r0)
            android.text.style.URLSpan[] r8 = (android.text.style.URLSpan[]) r8
            if (r8 == 0) goto L_0x010f
            int r6 = r8.length
            r5 = 0
        L_0x00aa:
            if (r5 >= r6) goto L_0x00e9
            r15 = r8[r5]
            int r4 = r9.getSpanStart(r15)
            int r3 = r9.getSpanEnd(r15)
            int r2 = r9.getSpanFlags(r15)
            X.3Wi r14 = r7.A05
            X.33i r1 = r7.A08
            X.4Fm r0 = r7.A03
            java.lang.String r20 = r15.getURL()
            X.4b3 r15 = new X.4b3
            r16 = r7
            r17 = r0
            r18 = r14
            r19 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r9.setSpan(r15, r4, r3, r2)
            r1 = 2132083512(0x7f150338, float:1.9807168E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r7, r1)
            r9.setSpan(r0, r4, r3, r2)
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00e2:
            java.lang.String r0 = "personal"
            goto L_0x004b
        L_0x00e6:
            r0 = r2
            goto L_0x0039
        L_0x00e9:
            if (r10 >= r6) goto L_0x010f
            r0 = r8[r10]
            r9.removeSpan(r0)
            int r10 = r10 + 1
            goto L_0x00e9
        L_0x00f3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDyiHeaderText - this payment account type is not supported. Payment account type = "
            X.C18260x0.A0r(r0, r2, r1)
            java.lang.String r0 = "Invalid payment account type"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        L_0x0103:
            r0 = 2131891897(0x7f1216b9, float:1.9418527E38)
            java.lang.String r0 = r7.getString(r0)
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
        L_0x010f:
            r11.setText(r9)
            r0 = 2131429608(0x7f0b08e8, float:1.8480894E38)
            android.view.View r1 = r7.findViewById(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r7.A0A = r1
            int r0 = r7.A74()
            r1.setText(r0)
            r0 = 2131429606(0x7f0b08e6, float:1.848089E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A09 = r0
            r0 = 2131429605(0x7f0b08e5, float:1.8480887E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A08 = r0
            r0 = 2131429602(0x7f0b08e2, float:1.8480881E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r7.A05 = r0
            X.C107335b8.A0E(r0, r12)
            r0 = 2131429603(0x7f0b08e3, float:1.8480883E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A07 = r0
            r0 = 2131430303(0x7f0b0b9f, float:1.8482303E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A06 = r0
            r0 = 2131429601(0x7f0b08e1, float:1.848088E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.A02 = r0
            r0 = 2131429604(0x7f0b08e4, float:1.8480885E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.A01 = r0
            r0 = 2131429360(0x7f0b07f0, float:1.848039E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.A00 = r0
            if (r28 == 0) goto L_0x0188
            java.lang.String r0 = "random_password"
            java.lang.String r8 = r13.getString(r0)
            r12 = 0
            if (r8 != 0) goto L_0x01aa
        L_0x0188:
            r12 = 1
            r6 = 20
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            r4 = 0
        L_0x0190:
            double r2 = java.lang.Math.random()
            r0 = 62
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = (int) r2
            java.lang.String r0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            char r0 = r0.charAt(r1)
            r5.append(r0)
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x0190
            java.lang.String r8 = r5.toString()
        L_0x01aa:
            r7.A0U = r8
            r0 = 1
            r7.A0V = r0
            X.2sH r15 = r7.A06
            X.3Wi r14 = r7.A05
            X.4FS r6 = r7.A04
            X.9VV r5 = r7.A0K
            X.9VB r4 = r7.A0M
            X.9Se r11 = r7.A0Q
            X.9U4 r10 = r7.A0I
            X.3Lv r3 = r7.A0C
            X.33l r2 = r7.A0E
            X.9U5 r9 = r7.A0F
            X.9dq r1 = r7.A0H
            X.2Ha r0 = r7.A0D
            X.9Sl r16 = new X.9Sl
            r17 = r7
            r18 = r14
            r19 = r3
            r20 = r0
            r21 = r2
            r22 = r9
            r23 = r1
            r24 = r10
            r25 = r11
            r26 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.9TR r3 = r7.A0N
            X.9VU r2 = r7.A0J
            java.lang.String r23 = "DYI-REPORT"
            X.9Rt r17 = new X.9Rt
            r18 = r7
            r19 = r14
            r21 = r9
            r22 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.9W3 r1 = r7.A0L
            java.lang.String r0 = r7.A0S
            X.9YG r13 = new X.9YG
            r20 = r1
            r21 = r4
            r22 = r3
            r23 = r6
            r24 = r8
            r25 = r0
            r18 = r2
            r19 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7.A0P = r13
            X.0XL r1 = X.AnonymousClass4L0.A0F(r13, r7)
            java.lang.Class<X.9Fx> r0 = X.C191689Fx.class
            X.0Ty r0 = r1.A01(r0)
            X.9Fx r0 = (X.C191689Fx) r0
            r7.A0O = r0
            X.08M r1 = r0.A03
            r0 = 15
            X.C205049qL.A02(r7, r1, r0)
            X.9Fx r0 = r7.A0O
            X.08M r1 = r0.A03
            r0 = 16
            X.C205049qL.A02(r7, r1, r0)
            X.9Fx r0 = r7.A0O
            X.08M r1 = r0.A00
            r0 = 17
            X.C205049qL.A02(r7, r1, r0)
            X.9Fx r0 = r7.A0O
            X.08M r1 = r0.A02
            r0 = 18
            X.C205049qL.A02(r7, r1, r0)
            X.9Fx r0 = r7.A0O
            X.08M r1 = r0.A01
            r0 = 19
            X.C205049qL.A02(r7, r1, r0)
            X.9Fx r0 = r7.A0O
            X.08M r1 = r0.A00
            r0 = 20
            X.C205049qL.A02(r7, r1, r0)
            X.9Fx r8 = r7.A0O
            if (r12 == 0) goto L_0x025b
            X.9VV r1 = r8.A07
            java.lang.String r0 = r8.A09
            r1.A04(r0)
        L_0x025b:
            X.9VV r5 = r8.A07
            java.lang.String r6 = r8.A09
            monitor-enter(r5)
            int r2 = r5.A01(r6)     // Catch:{ all -> 0x0323 }
            if (r2 < 0) goto L_0x02f3
            r0 = 4
            if (r2 > r0) goto L_0x02f3
            r9 = 2
            if (r2 != r0) goto L_0x0288
            X.3Dh r0 = r5.A02     // Catch:{ all -> 0x0323 }
            java.io.File r0 = r0.A0P(r6)     // Catch:{ all -> 0x0323 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0323 }
            if (r0 != 0) goto L_0x0295
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0323 }
            java.lang.String r0 = "dyiReportManager/validate-state/report-media-file-missing for account type = "
            X.C18260x0.A0r(r0, r6, r1)     // Catch:{ all -> 0x0323 }
            X.33l r0 = r5.A0A     // Catch:{ all -> 0x0323 }
            r0.A0G(r9, r6)     // Catch:{ all -> 0x0323 }
            goto L_0x0309
        L_0x0288:
            if (r2 != r9) goto L_0x028b
            goto L_0x028f
        L_0x028b:
            r0 = 3
            if (r2 != r0) goto L_0x0295
            goto L_0x02ad
        L_0x028f:
            X.9Oy r0 = r5.A02(r6)     // Catch:{ all -> 0x0323 }
            if (r0 == 0) goto L_0x02b3
        L_0x0295:
            X.33l r0 = r5.A0A     // Catch:{ all -> 0x0323 }
            android.content.SharedPreferences r1 = r0.A03()     // Catch:{ all -> 0x0323 }
            java.lang.String r0 = "personal"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0323 }
            if (r0 == 0) goto L_0x02aa
            java.lang.String r0 = "payment_dyi_report_expiration_timestamp"
        L_0x02a5:
            long r3 = X.AnonymousClass0x2.A0A(r1, r0)     // Catch:{ all -> 0x0323 }
            goto L_0x02c2
        L_0x02aa:
            java.lang.String r0 = "business_payment_dyi_report_expiration_timestamp"
            goto L_0x02a5
        L_0x02ad:
            X.9Oy r0 = r5.A02(r6)     // Catch:{ all -> 0x0323 }
            if (r0 != 0) goto L_0x0295
        L_0x02b3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0323 }
            java.lang.String r0 = "dyiReportManager/validate-state/report-message-missing for account type = "
            X.C18260x0.A0r(r0, r6, r1)     // Catch:{ all -> 0x0323 }
            X.33l r0 = r5.A0A     // Catch:{ all -> 0x0323 }
            r0.A0I(r6)     // Catch:{ all -> 0x0323 }
            goto L_0x0309
        L_0x02c2:
            if (r2 != r9) goto L_0x0309
            X.2sH r9 = r5.A05     // Catch:{ all -> 0x0323 }
            long r1 = r9.A0H()     // Catch:{ all -> 0x0323 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0309
            long r1 = r9.A0H()     // Catch:{ all -> 0x0323 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0309
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0323 }
            java.lang.String r0 = "dyiReportManager/validate-state/report-too-old for account type = "
            r9.append(r0)     // Catch:{ all -> 0x0323 }
            r9.append(r6)     // Catch:{ all -> 0x0323 }
            java.lang.String r0 = ", current:"
            r9.append(r0)     // Catch:{ all -> 0x0323 }
            r9.append(r1)     // Catch:{ all -> 0x0323 }
            java.lang.String r0 = " expired:"
            X.C18260x0.A12(r0, r9, r3)     // Catch:{ all -> 0x0323 }
            r5.A04(r6)     // Catch:{ all -> 0x0323 }
            goto L_0x0309
        L_0x02f3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0323 }
            java.lang.String r0 = "dyiReportManager/validate-state/wrong-state for account type = "
            r1.append(r0)     // Catch:{ all -> 0x0323 }
            r1.append(r6)     // Catch:{ all -> 0x0323 }
            java.lang.String r0 = ", state = "
            X.C18260x0.A0x(r0, r1, r2)     // Catch:{ all -> 0x0323 }
            X.33l r0 = r5.A0A     // Catch:{ all -> 0x0323 }
            r0.A0I(r6)     // Catch:{ all -> 0x0323 }
        L_0x0309:
            monitor-exit(r5)
            X.08M r1 = r8.A02
            int r0 = r5.A01(r6)
            X.C06270Wx.A04(r1, r0)
            X.08M r1 = r8.A01
            X.9Oy r0 = r5.A02(r6)
            r1.A0G(r0)
            android.widget.FrameLayout r1 = r7.A01
            r0 = 0
            X.C203969ob.A00(r1, r7, r0)
            return
        L_0x0323:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BX.onCreate(android.os.Bundle):void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.A0U;
        if (str != null) {
            bundle.putString("random_password", str);
        }
    }
}
