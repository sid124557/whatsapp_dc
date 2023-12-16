package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.regex.Pattern;

/* renamed from: X.68H  reason: invalid class name */
public class AnonymousClass68H extends C166677z5 {
    public Object A00;
    public final int A01;

    public AnonymousClass68H(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new AnonymousClass68H(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r3.equalsIgnoreCase(r0) != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0107, code lost:
        if (r2 != null) goto L_0x0109;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            r10 = r18
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0009;
                case 2: goto L_0x0042;
                case 3: goto L_0x00aa;
                case 4: goto L_0x011f;
                case 5: goto L_0x01ea;
                case 6: goto L_0x0009;
                case 7: goto L_0x0341;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x0009;
                case 11: goto L_0x0009;
                case 12: goto L_0x0355;
                case 13: goto L_0x039b;
                case 14: goto L_0x0140;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.afterTextChanged(r10)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r4 = r1.A00
            X.4d8 r4 = (X.C89524d8) r4
            com.google.android.material.textfield.TextInputEditText r0 = r4.A00
            java.lang.String r2 = "secretCodeEditText"
            r1 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x001d:
            android.os.Handler r0 = r0.getHandler()
            if (r0 == 0) goto L_0x0026
            r0.removeCallbacksAndMessages(r1)
        L_0x0026:
            com.google.android.material.textfield.TextInputEditText r0 = r4.A00
            if (r0 != 0) goto L_0x002f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x002f:
            android.os.Handler r3 = r0.getHandler()
            if (r3 == 0) goto L_0x000c
            r0 = 22
            X.3cI r2 = new X.3cI
            r2.<init>((java.lang.Object) r4, (int) r0)
            r0 = 250(0xfa, double:1.235E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0042:
            java.lang.String r3 = r10.toString()
            java.lang.Object r4 = r1.A00
            com.whatsapp.components.PhoneNumberEntry r4 = (com.whatsapp.components.PhoneNumberEntry) r4
            java.lang.String r1 = r4.A07
            if (r1 == 0) goto L_0x009b
            X.5Xx r0 = r4.A01
            X.5Ow r0 = r0.A01(r1)
            if (r0 != 0) goto L_0x0094
            r0 = 0
        L_0x0057:
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x009b
        L_0x005d:
            java.lang.String r5 = r4.A07
        L_0x005f:
            if (r5 == 0) goto L_0x008c
            com.whatsapp.WaEditText r0 = r4.A02
            boolean r0 = X.C86634Kw.A1X(r0)
            if (r0 != 0) goto L_0x008c
            r4.A03(r5)
            com.whatsapp.WaEditText r0 = r4.A03
            java.lang.String r2 = X.C18290x4.A0m(r0)
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.replaceAll(r1, r0)
            com.whatsapp.WaEditText r0 = r4.A03
            r0.setText(r1)
            com.whatsapp.WaEditText r0 = r4.A02
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x008c
            com.whatsapp.WaEditText r0 = r4.A03
            r0.requestFocus()
        L_0x008c:
            X.7Uw r0 = r4.A04
            if (r0 == 0) goto L_0x000c
            r0.A01(r3, r5)
            return
        L_0x0094:
            int r0 = r0.A00
            java.lang.String r0 = java.lang.Integer.toString(r0)
            goto L_0x0057
        L_0x009b:
            java.lang.String r0 = r4.A07
            if (r0 == 0) goto L_0x00a5
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x005d
        L_0x00a5:
            java.lang.String r5 = X.C106675Zy.A00(r3)
            goto L_0x005f
        L_0x00aa:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            X.4UY r4 = r0.A0A
            com.whatsapp.mentions.MentionableEntry r5 = r0.A0I
            r11 = 0
            X.C162457s7.A0J(r5, r11)
            java.lang.String r0 = r5.getStringText()
            java.lang.String r0 = X.C107635bd.A0B(r0, r11)
            r4.A00 = r0
            X.34x r1 = r4.A0D
            boolean r0 = r1 instanceof X.AnonymousClass1nF
            r6 = 1
            if (r0 == 0) goto L_0x010b
            X.1nF r1 = (X.AnonymousClass1nF) r1
            java.lang.String r1 = r1.A01
        L_0x00cb:
            java.lang.String r0 = r4.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            r3 = 0
            if (r0 != 0) goto L_0x00da
            r3 = 1
            X.08M r0 = r4.A04
            X.AnonymousClass0x7.A18(r0)
        L_0x00da:
            X.3Ls r0 = r4.A07
            X.4UA r7 = r4.A09
            X.3Ls r2 = r7.A01
            if (r0 == 0) goto L_0x0106
            if (r2 == 0) goto L_0x0109
            java.lang.String r1 = r0.A0Z
            java.lang.String r0 = r2.A0Z
            boolean r0 = android.text.TextUtils.equals(r1, r0)
        L_0x00ec:
            r0 = r0 ^ 1
            if (r3 != 0) goto L_0x00f3
            if (r0 != 0) goto L_0x00f3
            r6 = 0
        L_0x00f3:
            r4.A02 = r6
            X.2z0 r0 = r4.A0E
            X.4uZ r10 = r0.A00
            if (r10 == 0) goto L_0x000c
            android.text.Editable r8 = r5.getEditableText()
            X.7aS r9 = r4.A08
            r12 = r11
            r7.A0E(r8, r9, r10, r11, r12)
            return
        L_0x0106:
            r0 = 1
            if (r2 == 0) goto L_0x00ec
        L_0x0109:
            r0 = 0
            goto L_0x00ec
        L_0x010b:
            boolean r0 = r1 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0116
            X.1mV r1 = (X.C30471mV) r1
            java.lang.String r1 = r1.A1w()
            goto L_0x00cb
        L_0x0116:
            if (r1 == 0) goto L_0x011d
            java.lang.String r1 = r1.A13()
            goto L_0x00cb
        L_0x011d:
            r1 = 0
            goto L_0x00cb
        L_0x011f:
            java.lang.Object r3 = r1.A00
            X.5l7 r3 = (X.C113245l7) r3
            boolean r0 = r3.A6W
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = r10.toString()
            int r0 = r0.length()
            r2 = 0
            if (r0 == 0) goto L_0x03ae
            X.33m r1 = X.C113245l7.A08(r3)
            X.3ZH r0 = r3.A3n
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r0)
            r1.A0F(r0, r2)
            return
        L_0x0140:
            if (r18 == 0) goto L_0x000c
            java.lang.Object r4 = r1.A00
            com.whatsapp.text.FinalBackspaceAwareEntry r4 = (com.whatsapp.text.FinalBackspaceAwareEntry) r4
            java.lang.String r0 = r10.toString()
            boolean r0 = com.whatsapp.text.FinalBackspaceAwareEntry.A03(r0)
            if (r0 != 0) goto L_0x01c2
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x01c2
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x01bf
            java.util.Iterator r9 = r0.iterator()
        L_0x015c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r0 = r9.next()
            X.7ET r0 = (X.AnonymousClass7ET) r0
            com.whatsapp.search.views.TokenizedSearchInput r7 = r0.A00
            com.whatsapp.search.SearchViewModel r0 = r7.A0F
            if (r0 == 0) goto L_0x015c
            com.whatsapp.jid.UserJid r8 = r0.A0J()
            com.whatsapp.search.SearchViewModel r0 = r7.A0F
            int r6 = r0.A0E()
            int r5 = r7.A00
            r3 = 1
            if (r5 != r3) goto L_0x0183
            com.google.android.material.chip.Chip r0 = r7.A0U
        L_0x017f:
            com.whatsapp.search.views.TokenizedSearchInput.A00(r0, r7)
            goto L_0x015c
        L_0x0183:
            r0 = 2
            if (r5 != r0) goto L_0x0189
            com.google.android.material.chip.Chip r0 = r7.A0S
            goto L_0x017f
        L_0x0189:
            r2 = 3
            if (r5 != r2) goto L_0x018f
            com.google.android.material.chip.Chip r0 = r7.A0T
            goto L_0x017f
        L_0x018f:
            r1 = 5
            if (r5 != r1) goto L_0x0195
            com.google.android.material.chip.Chip r0 = r7.A07
            goto L_0x017f
        L_0x0195:
            if (r5 != 0) goto L_0x015c
            if (r8 != 0) goto L_0x01bb
            if (r6 == 0) goto L_0x01a3
            r0 = 98
            if (r6 == r0) goto L_0x01a3
            r7.setFocus(r3)
            goto L_0x015c
        L_0x01a3:
            com.whatsapp.search.SearchViewModel r0 = r7.A0F
            X.5dZ r0 = r0.A0M()
            if (r0 == 0) goto L_0x01af
            r7.setFocus(r2)
            goto L_0x015c
        L_0x01af:
            com.whatsapp.search.SearchViewModel r0 = r7.A0F
            X.5dh r0 = r0.A0I()
            if (r0 == 0) goto L_0x015c
            r7.setFocus(r1)
            goto L_0x015c
        L_0x01bb:
            r7.setFocus(r0)
            goto L_0x015c
        L_0x01bf:
            r4.A0C(r10)
        L_0x01c2:
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x000c
            java.util.Iterator r3 = r0.iterator()
        L_0x01ca:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r2 = r3.next()
            X.7ET r2 = (X.AnonymousClass7ET) r2
            android.text.Editable r0 = r4.A0A(r10)
            java.lang.String r1 = r0.toString()
            com.whatsapp.search.views.TokenizedSearchInput r0 = r2.A00
            com.whatsapp.search.SearchViewModel r0 = r0.A0F
            if (r0 == 0) goto L_0x01ca
            if (r1 == 0) goto L_0x01ca
            r0.A0e(r1)
            goto L_0x01ca
        L_0x01ea:
            java.lang.String r3 = r10.toString()
            boolean r2 = X.C107575bX.A0F(r3)
            java.lang.Object r1 = r1.A00
            X.5l7 r1 = (X.C113245l7) r1
            r1.A18()
            X.4VH r0 = r1.A38
            r0.A0G(r2)
            X.4Uw r0 = r1.A3C
            r0.A0E(r2)
            boolean r0 = r1.A6a
            r13 = 0
            r14 = 1
            if (r2 == r0) goto L_0x0267
            r1.A6a = r2
            android.widget.ImageButton r4 = r1.A0h
            X.33j r0 = r1.A3L
            boolean r0 = X.C620733j.A04(r0)
            if (r2 == 0) goto L_0x02e8
            android.view.animation.Animation r0 = X.AnonymousClass31N.A00(r0, r14, r13)
            r4.startAnimation(r0)
            android.widget.ImageButton r4 = r1.A0e
            X.33j r0 = r1.A3L
            boolean r0 = X.C620733j.A04(r0)
            android.view.animation.Animation r0 = X.AnonymousClass31N.A00(r0, r14, r14)
            r4.startAnimation(r0)
            X.8y5 r0 = r1.A5a
            boolean r0 = r0.BFD()
            if (r0 == 0) goto L_0x0236
            r1.A1W(r13)
        L_0x0236:
            X.9Wq r4 = r1.A4k
            X.4uZ r0 = r1.A4J
            int r5 = r4.A0C(r0)
            boolean r0 = r1.A2Z(r5)
            if (r0 == 0) goto L_0x0267
            X.5UY r0 = r1.A5e
            int r0 = r0.A03()
            if (r0 == 0) goto L_0x0267
            X.5UY r0 = r1.A5e
            r0.A06(r13)
            X.5UY r0 = r1.A5e
            android.view.View r4 = r0.A04()
            X.33j r0 = r1.A3L
            boolean r0 = X.C620733j.A04(r0)
            android.view.animation.Animation r0 = X.AnonymousClass31N.A00(r0, r14, r14)
            r4.startAnimation(r0)
            r1.A1U(r5)
        L_0x0267:
            X.4UA r9 = r1.A3D
            X.7aS r11 = r1.A0X()
            X.4uZ r12 = r1.A4J
            r9.A0E(r10, r11, r12, r13, r14)
            X.4eZ r9 = X.C113245l7.A09(r1)
            X.676 r0 = r1.A2z
            X.5Y0 r13 = r0.getEmojiLoader()
            X.676 r0 = r1.A2z
            X.33i r12 = r0.getSystemServices()
            X.2y5 r14 = r1.A4r
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P
            android.text.TextPaint r11 = r0.getPaint()
            r15 = 2131102273(0x7f060a41, float:1.781698E38)
            boolean r0 = r1.A6T
            r16 = r0
            X.C107635bd.A0F(r9, r10, r11, r12, r13, r14, r15, r16)
            X.2gE r0 = r1.A5B
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x02ad
            X.5Nu r4 = r1.A5E
            if (r4 == 0) goto L_0x02ad
            X.676 r0 = r1.A2z
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r0.getEmojiSearchProvider()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x02ad
            r4.A00(r3)
        L_0x02ad:
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r10 = r1.A29
            if (r10 == 0) goto L_0x02d3
            if (r2 != 0) goto L_0x02d3
            X.3Wi r9 = r10.A04
            java.lang.Runnable r8 = r10.A0A
            r9.A0R(r8)
            java.lang.Runnable r2 = r10.A0B
            X.66R r0 = r10.A0D
            long r4 = X.C18290x4.A0D(r0)
            r9.A0T(r2, r4)
            long r6 = X.C18290x4.A0D(r0)
            X.66R r0 = r10.A0C
            long r4 = X.C18290x4.A0D(r0)
            long r6 = r6 + r4
            r9.A0T(r8, r6)
        L_0x02d3:
            X.4Qj r2 = r1.A2A
            if (r2 == 0) goto L_0x02e4
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.4V1 r0 = r2.getViewModel()
            r0.A01 = r3
            r0.A0D()
        L_0x02e4:
            r1.A1J()
            return
        L_0x02e8:
            android.view.animation.Animation r0 = X.AnonymousClass31N.A00(r0, r13, r13)
            r4.startAnimation(r0)
            X.33j r0 = r1.A3L
            boolean r0 = X.C620733j.A04(r0)
            android.view.animation.Animation r4 = X.AnonymousClass31N.A00(r0, r13, r14)
            android.widget.ImageButton r0 = r1.A0e
            r5 = 3
            X.C86624Kv.A19(r4, r0, r5)
            android.widget.ImageButton r0 = r1.A0e
            r0.startAnimation(r4)
            X.9Wq r4 = r1.A4k
            X.4uZ r0 = r1.A4J
            int r0 = r4.A0C(r0)
            boolean r0 = r1.A2Z(r0)
            if (r0 == 0) goto L_0x0267
            X.5UY r0 = r1.A5e
            int r4 = r0.A03()
            r0 = 8
            if (r4 == r0) goto L_0x0267
            X.33j r0 = r1.A3L
            boolean r0 = X.C620733j.A04(r0)
            android.view.animation.Animation r4 = X.AnonymousClass31N.A00(r0, r13, r14)
            X.5UY r0 = r1.A5e
            android.view.View r0 = r0.A04()
            X.C86624Kv.A19(r4, r0, r5)
            X.5UY r0 = r1.A5e
            android.view.View r0 = r0.A04()
            r0.startAnimation(r4)
            android.animation.ObjectAnimator r0 = r1.A08
            if (r0 == 0) goto L_0x0267
            r0.cancel()
            goto L_0x0267
        L_0x0341:
            java.lang.Object r0 = r1.A00
            com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment r0 = (com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r0.A0O
            java.lang.String r0 = r10.toString()
            boolean r0 = X.C107575bX.A0F(r0)
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            return
        L_0x0355:
            java.lang.Object r9 = r1.A00
            com.whatsapp.notification.PopupNotification r9 = (com.whatsapp.notification.PopupNotification) r9
            X.2qc r1 = r9.A17
            r0 = 1
            r1.A04(r0)
            java.lang.String r3 = r10.toString()
            X.3ZH r1 = r9.A0q
            if (r1 == 0) goto L_0x0377
            int r0 = r3.length()
            X.33m r2 = r9.A0O
            X.4uZ r1 = X.AnonymousClass3ZH.A01(r1)
            if (r0 == 0) goto L_0x0397
            r0 = 0
            r2.A0F(r1, r0)
        L_0x0377:
            X.5Y0 r13 = r9.A0C
            X.33i r12 = r9.A08
            X.2y5 r14 = r9.A16
            X.4mU r0 = r9.A0c
            android.text.TextPaint r11 = r0.getPaint()
            r15 = 2131102273(0x7f060a41, float:1.781698E38)
            boolean r0 = r9.A1R
            r16 = r0
            X.C107635bd.A0F(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = X.C107575bX.A0F(r3)
            X.4VH r0 = r9.A0h
            r0.A0G(r1)
            return
        L_0x0397:
            r2.A0D(r1)
            goto L_0x0377
        L_0x039b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            X.5rC r0 = r0.A0D
            r0.A04()
            r10.toString()
            java.lang.String r0 = "recordFieldAddedAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x03ae:
            r3.A6R = r2
            X.33m r1 = X.C113245l7.A08(r3)
            X.3ZH r0 = r3.A3n
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r0)
            r1.A0D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68H.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        C71733ca r3;
        WDSButton wDSButton;
        String str;
        switch (this.A01) {
            case 0:
                if (charSequence != null) {
                    String obj = charSequence.toString();
                    C162457s7.A0J(obj, 0);
                    ((C89524d8) this.A00).A05 = obj;
                }
                C89524d8 r0 = (C89524d8) this.A00;
                wDSButton = r0.A76();
                str = r0.A77();
                break;
            case 1:
                if (charSequence != null) {
                    ((SecretCodeAuthenticationBottomSheet) this.A00).A05 = charSequence.toString();
                }
                SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = (SecretCodeAuthenticationBottomSheet) this.A00;
                wDSButton = secretCodeAuthenticationBottomSheet.A03;
                if (wDSButton != null) {
                    str = secretCodeAuthenticationBottomSheet.A05;
                    break;
                } else {
                    return;
                }
            case 5:
                AnonymousClass4UA r32 = ((C113245l7) this.A00).A3D;
                boolean z = false;
                if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
                    z = true;
                }
                r32.A09 = z;
                return;
            case 6:
                AnonymousClass5RH r5 = (AnonymousClass5RH) this.A00;
                if (r5.A0H == 2) {
                    int length = charSequence.length();
                    C71733ca r1 = r5.A04;
                    if (r1 == null) {
                        r3 = new C71733ca((Object) new C69983Zk(r5, 14), (Object) new C69983Zk(r5, 13), length, 35);
                        r5.A04 = r3;
                    } else {
                        r5.A0K.A0R(r1);
                        r3 = r5.A04;
                        r3.A00 = length;
                    }
                    r5.A0K.A0T(r3, 275);
                    return;
                }
                return;
            case 8:
                C162457s7.A0J(charSequence, 0);
                GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A00;
                gifSearchContainer.A0K = charSequence;
                WaEditText waEditText = gifSearchContainer.A07;
                if (waEditText != null) {
                    waEditText.removeCallbacks(gifSearchContainer.A0T);
                }
                WaEditText waEditText2 = gifSearchContainer.A07;
                if (waEditText2 != null) {
                    waEditText2.postDelayed(gifSearchContainer.A0T, 500);
                }
                View view = gifSearchContainer.A01;
                if (view != null) {
                    int i4 = 0;
                    if (charSequence.length() == 0) {
                        i4 = 4;
                    }
                    view.setVisibility(i4);
                    return;
                }
                return;
            case 9:
                C162457s7.A0J(charSequence, 0);
                InAppBugReportingActivity inAppBugReportingActivity = (InAppBugReportingActivity) this.A00;
                WDSButton wDSButton2 = inAppBugReportingActivity.A0M;
                if (wDSButton2 != null) {
                    boolean z2 = true;
                    if (charSequence.length() <= 0 || AnonymousClass4SG.A4B(inAppBugReportingActivity)) {
                        z2 = false;
                    }
                    wDSButton2.setEnabled(z2);
                    InAppBugReportingViewModel inAppBugReportingViewModel = (InAppBugReportingViewModel) inAppBugReportingActivity.A0Q.getValue();
                    String replaceAll = Pattern.compile("[^\\p{L}\\p{N}\\p{P}\\p{Z}]").matcher(AnonymousClass2AB.A00(charSequence.toString())).replaceAll("");
                    C162457s7.A0D(replaceAll);
                    if (replaceAll.length() >= 10) {
                        inAppBugReportingViewModel.A08.A0H(C134716jV.A00);
                        return;
                    }
                    return;
                }
                throw C18270x1.A0S("submitButton");
            case 10:
            case 11:
                AnonymousClass5Y5 r4 = ((ContactUsActivity) this.A00).A0H;
                C626936e.A06(r4.A02);
                ContactUsActivity contactUsActivity = r4.A02;
                boolean A1W = AnonymousClass001.A1W(charSequence.length());
                boolean A76 = contactUsActivity.A76();
                int i5 = R.id.contact_us_send_button;
                if (A76) {
                    i5 = R.id.saga_contact_us_send_button;
                }
                contactUsActivity.findViewById(i5).setEnabled(A1W);
                if (C86604Kt.A0o(r4.A02.A00).length() >= 10) {
                    ContactUsActivity contactUsActivity2 = r4.A02;
                    if (contactUsActivity2.A01.getVisibility() == 0) {
                        contactUsActivity2.A00.setBackgroundDrawable(AnonymousClass0RP.A00(contactUsActivity2, R.drawable.description_field_background_state_list));
                        contactUsActivity2.A01.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
        wDSButton.setEnabled(AnonymousClass001.A1W(str.length()));
    }
}
