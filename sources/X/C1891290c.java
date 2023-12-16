package X;

import android.view.View;

/* renamed from: X.90c  reason: invalid class name and case insensitive filesystem */
public class C1891290c implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C1891290c(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C1891290c(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x036f, code lost:
        r1.A0S(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0372, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0223, code lost:
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0226, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0399;
                case 1: goto L_0x0373;
                case 2: goto L_0x0134;
                case 3: goto L_0x0364;
                case 4: goto L_0x034a;
                case 5: goto L_0x0330;
                case 6: goto L_0x010e;
                case 7: goto L_0x00f6;
                case 8: goto L_0x0095;
                case 9: goto L_0x031f;
                case 10: goto L_0x0089;
                case 11: goto L_0x02d4;
                case 12: goto L_0x0068;
                case 13: goto L_0x02c3;
                case 14: goto L_0x031f;
                case 15: goto L_0x02b7;
                case 16: goto L_0x02af;
                case 17: goto L_0x02a7;
                case 18: goto L_0x029f;
                case 19: goto L_0x0297;
                case 20: goto L_0x0005;
                case 21: goto L_0x005c;
                case 22: goto L_0x0050;
                case 23: goto L_0x0252;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x022e;
                case 27: goto L_0x0204;
                case 28: goto L_0x01dd;
                case 29: goto L_0x01aa;
                case 30: goto L_0x0163;
                case 31: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r4 = r8.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity r4 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity) r4
            X.9ca r5 = r4.A02
            if (r5 == 0) goto L_0x03b0
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r4)
            java.lang.String r0 = "alias_intro"
            r5.BKB(r3, r2, r0, r1)
            X.7bU r0 = r4.A03
            if (r0 == 0) goto L_0x03a9
            X.7yE r0 = r0.A00()
            if (r0 == 0) goto L_0x000c
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r3 = "extra_payment_name"
            android.os.Parcelable r1 = r0.getParcelableExtra(r3)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r4, r0)
            r2.putExtra(r3, r1)
            java.lang.String r1 = "extra_mapper_recover_alias"
            r0 = 1
            r2.putExtra(r1, r0)
            r4.A6T(r2, r0)
            return
        L_0x0050:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet r0 = (com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet) r0
            X.8s1 r0 = r0.A00
            if (r0 == 0) goto L_0x000c
            r0.BOO()
            return
        L_0x005c:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet r0 = (com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet) r0
            X.8s1 r0 = r0.A00
            if (r0 == 0) goto L_0x000c
            r0.BQ1()
            return
        L_0x0068:
            java.lang.Object r5 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment r5 = (com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment) r5
            X.9ca r4 = r5.A00
            if (r4 == 0) goto L_0x03b7
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = "available_payment_methods_prompt"
            java.lang.String r0 = r5.A01
            r4.BKB(r3, r2, r1, r0)
            X.8p6 r1 = r5.A03
            if (r1 == 0) goto L_0x000c
            boolean r0 = r5.A02
            r1.BQ6(r0)
            return
        L_0x0089:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r0 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r0
            X.8ui r0 = r0.A0C
            if (r0 == 0) goto L_0x000c
            r0.BM8()
            return
        L_0x0095:
            java.lang.Object r6 = r8.A00
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r6 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r6
            X.6Hl r0 = r6.A0A
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "methodListAdapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00a4:
            int r5 = r0.A00
            r0 = -1
            if (r5 == r0) goto L_0x000c
            X.39S r1 = r6.A0F
            if (r1 == 0) goto L_0x03cc
            X.9Wq r0 = r6.A0E
            if (r0 == 0) goto L_0x03c5
            X.6wO r4 = r0.A0H(r1)
            X.C162457s7.A0D(r4)
            X.6wO r0 = X.C141946wO.TOS_NONE
            if (r4 == r0) goto L_0x03cc
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.6wO r0 = X.C141946wO.TOS_V1
            if (r4 == r0) goto L_0x00c8
            X.6wO r0 = X.C141946wO.TOS_ALL
            if (r4 != r0) goto L_0x00d2
        L_0x00c8:
            java.lang.String r1 = "upi_pay_privacy_policy"
            X.6sN r0 = new X.6sN
            r0.<init>(r1)
            r3.add(r0)
        L_0x00d2:
            X.6wO r0 = X.C141946wO.TOS_V2
            if (r4 == r0) goto L_0x00da
            X.6wO r0 = X.C141946wO.TOS_ALL
            if (r4 != r0) goto L_0x00e4
        L_0x00da:
            java.lang.String r1 = "pay_tos_v3"
            X.6sN r0 = new X.6sN
            r0.<init>(r1)
            r3.add(r0)
        L_0x00e4:
            X.1ws r2 = new X.1ws
            r2.<init>(r3)
            X.9U5 r1 = r6.A08
            if (r1 == 0) goto L_0x03be
            X.8Hs r0 = new X.8Hs
            r0.<init>(r4, r6, r5)
            r1.A0D(r0, r2)
            return
        L_0x00f6:
            java.lang.Object r2 = r8.A00
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r2 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r2
            X.0eF r1 = r2.A0E
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet"
            X.C162457s7.A0K(r1, r0)
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            r1.A1K()
            X.8ui r0 = r2.A0C
            if (r0 == 0) goto L_0x000c
            r0.BOO()
            return
        L_0x010e:
            java.lang.Object r3 = r8.A00
            com.whatsapp.payments.ui.BusinessHubActivity r3 = (com.whatsapp.payments.ui.BusinessHubActivity) r3
            X.66R r0 = r3.A0D
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r1 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r1
            r2 = 0
            r0 = 107(0x6b, float:1.5E-43)
            r1.A0D(r0)
            X.9U4 r0 = r3.A0B
            if (r0 == 0) goto L_0x03d0
            X.9oC r1 = r0.A0G()
            java.lang.String r0 = "business"
            android.content.Intent r0 = r1.B7D(r3, r0, r2)
            if (r0 == 0) goto L_0x000c
            r3.startActivity(r0)
            return
        L_0x0134:
            java.lang.Object r3 = r8.A00
            com.whatsapp.payments.ui.BrazilPixBottomSheet r3 = (com.whatsapp.payments.ui.BrazilPixBottomSheet) r3
            X.03q r2 = r3.A0Q()
            boolean r0 = r2 instanceof X.C182838p4
            if (r0 == 0) goto L_0x000c
            java.lang.Boolean r0 = r3.A09
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            if (r0 == 0) goto L_0x015b
            java.lang.String r1 = "payment_options_prompt"
            java.lang.String r0 = r3.A0E
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x015b
            boolean r0 = r2 instanceof X.C202459m3
            if (r0 == 0) goto L_0x015b
            X.9XA r0 = r3.A05
            r0.A00()
        L_0x015b:
            r3.A1K()
            r0 = 1
            r3.A1f(r0)
            return
        L_0x0163:
            java.lang.Object r5 = r8.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity) r5
            X.9ca r4 = r5.A02
            if (r4 == 0) goto L_0x01a3
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 167(0xa7, float:2.34E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r5)
            java.lang.String r0 = "alias_intro"
            r4.BKB(r3, r2, r0, r1)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r3 = "extra_referral_screen"
            java.lang.String r1 = r0.getStringExtra(r3)
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5, r0)
            r2.putExtra(r3, r1)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "extra_payment_name"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            r2.putExtra(r1, r0)
            r5.startActivity(r2)
            return
        L_0x01a3:
            java.lang.String r0 = "fieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01aa:
            java.lang.Object r6 = r8.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity r6 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity) r6
            X.9ca r5 = r6.A00
            if (r5 == 0) goto L_0x01d6
            r4 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0 = 129(0x81, float:1.81E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r6)
            java.lang.String r0 = "pending_alias_setup"
            r5.BKB(r3, r2, r0, r1)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r0)
            r6.A6T(r1, r4)
            return
        L_0x01d6:
            java.lang.String r0 = "indiaUpiFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01dd:
            java.lang.Object r5 = r8.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity) r5
            X.9ca r4 = r5.A00
            if (r4 == 0) goto L_0x01fd
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 121(0x79, float:1.7E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r5)
            java.lang.String r0 = "pending_alias_setup"
            r4.BKB(r3, r2, r0, r1)
            r0 = -1
            r5.setResult(r0)
            goto L_0x0223
        L_0x01fd:
            java.lang.String r0 = "indiaUpiFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0204:
            java.lang.Object r5 = r8.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity) r5
            r0 = -1
            r5.setResult(r0)
            X.9ca r4 = r5.A03
            if (r4 == 0) goto L_0x0227
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 85
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r5)
            java.lang.String r0 = "alias_complete"
            r4.BKB(r3, r2, r0, r1)
        L_0x0223:
            r5.finish()
            return
        L_0x0227:
            java.lang.String r0 = "indiaUpiFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x022e:
            java.lang.Object r5 = r8.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity) r5
            X.9ca r4 = r5.A05
            if (r4 == 0) goto L_0x024b
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r5)
            java.lang.String r0 = "create_numeric_upi_alias"
            r4.BKB(r3, r2, r0, r1)
            r5.A74()
            return
        L_0x024b:
            java.lang.String r0 = "fieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0252:
            java.lang.Object r6 = r8.A00
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity r6 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity) r6
            java.lang.String r7 = r6.A0e
            if (r7 == 0) goto L_0x028f
            X.66R r0 = r6.A0B
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel r5 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel) r5
            X.08M r4 = r5.A00
            java.lang.Object r0 = r4.A07()
            X.7k0 r0 = (X.C158457k0) r0
            if (r0 == 0) goto L_0x0295
            r3 = 1
            X.7Ys r2 = r0.A00
            X.7yj r1 = r0.A01
            X.7k0 r0 = new X.7k0
            r0.<init>(r2, r1, r3)
        L_0x0276:
            r4.A0H(r0)
            r0 = 183(0xb7, float:2.56E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1
            X.9ca r2 = r5.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "international_payment_prompt"
            X.6ig r0 = r2.A05(r1, r3, r0, r7)
            r2.BKA(r0)
        L_0x028f:
            X.9AL r0 = r6.A09
            r0.A00()
            return
        L_0x0295:
            r0 = 0
            goto L_0x0276
        L_0x0297:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment.A01(r0)
            return
        L_0x029f:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment.A04(r0)
            return
        L_0x02a7:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment.A02(r0)
            return
        L_0x02af:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.InstallmentBottomSheetFragment r0 = (com.whatsapp.payments.ui.InstallmentBottomSheetFragment) r0
            r0.A1J()
            return
        L_0x02b7:
            java.lang.Object r1 = r8.A00
            com.whatsapp.payments.ui.InstallmentBottomSheetFragment r1 = (com.whatsapp.payments.ui.InstallmentBottomSheetFragment) r1
            r0 = 1
            r1.A1K(r0)
            r1.A1J()
            return
        L_0x02c3:
            java.lang.Object r0 = r8.A00
            X.0eF r0 = (X.C08310eF) r0
            X.0eF r1 = r0.A0E
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet"
            X.C162457s7.A0K(r1, r0)
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            r1.A1K()
            return
        L_0x02d4:
            java.lang.Object r5 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity r5 = (com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity) r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            android.widget.EditText r0 = r5.A00
            if (r0 != 0) goto L_0x02e7
            java.lang.String r0 = "aadhaarNumber1"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02e7:
            android.text.Editable r0 = r0.getText()
            r1.append(r0)
            android.widget.EditText r0 = r5.A01
            if (r0 != 0) goto L_0x02f9
            java.lang.String r0 = "aadhaarNumber2"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02f9:
            android.text.Editable r0 = r0.getText()
            java.lang.String r4 = X.AnonymousClass000.A0R(r0, r1)
            X.3QD r3 = X.AnonymousClass3QD.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = "upiPartialAadhaarNumber"
            X.7yt r0 = new X.7yt
            r0.<init>(r3, r2, r4, r1)
            r5.A03 = r0
            X.6hm r0 = r5.A02
            if (r0 != 0) goto L_0x031b
            java.lang.String r0 = "bankAccount"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x031b:
            r5.A7k(r0)
            return
        L_0x031f:
            java.lang.Object r0 = r8.A00
            X.0eF r0 = (X.C08310eF) r0
            X.0eF r1 = r0.A0E
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet"
            X.C162457s7.A0K(r1, r0)
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = (com.whatsapp.payments.ui.PaymentBottomSheet) r1
            r1.A1Y()
            return
        L_0x0330:
            java.lang.Object r4 = r8.A00
            com.whatsapp.payments.ui.BrazilPixKeySettingActivity r4 = (com.whatsapp.payments.ui.BrazilPixKeySettingActivity) r4
            r0 = 194(0xc2, float:2.72E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 1
            java.lang.String r1 = "custom_payment_method_settings"
            java.lang.String r0 = "orders_home"
            r4.A75(r3, r1, r0, r2)
            X.3Wi r1 = r4.A05
            X.8M1 r0 = new X.8M1
            r0.<init>(r4)
            goto L_0x036f
        L_0x034a:
            java.lang.Object r4 = r8.A00
            com.whatsapp.payments.ui.BrazilPixKeySettingActivity r4 = (com.whatsapp.payments.ui.BrazilPixKeySettingActivity) r4
            r0 = 194(0xc2, float:2.72E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 1
            java.lang.String r1 = "custom_payment_method_settings"
            java.lang.String r0 = "orders_home"
            r4.A75(r3, r1, r0, r2)
            X.3Wi r1 = r4.A05
            X.8M2 r0 = new X.8M2
            r0.<init>(r4)
            goto L_0x036f
        L_0x0364:
            java.lang.Object r2 = r8.A00
            com.whatsapp.payments.ui.BrazilPixKeySettingActivity r2 = (com.whatsapp.payments.ui.BrazilPixKeySettingActivity) r2
            X.3Wi r1 = r2.A05
            X.8M0 r0 = new X.8M0
            r0.<init>(r2)
        L_0x036f:
            r1.A0S(r0)
            return
        L_0x0373:
            java.lang.Object r5 = r8.A00
            com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet r5 = (com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet) r5
            java.lang.Integer r4 = X.C18290x4.A0a()
            java.lang.String r3 = "income_collection_prompt"
            java.lang.String r2 = r5.A04
            X.9no r1 = r5.A00
            if (r1 != 0) goto L_0x038a
            java.lang.String r0 = "paymentFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x038a:
            r0 = 1
            X.C626936e.A06(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.BKB(r0, r4, r3, r2)
            r5.A1K()
            return
        L_0x0399:
            java.lang.Object r2 = r8.A00
            com.whatsapp.payments.ui.BrazilContentCopiedBottomSheet r2 = (com.whatsapp.payments.ui.BrazilContentCopiedBottomSheet) r2
            java.lang.Integer r1 = X.C18290x4.A0b()
            r0 = 1
            r2.A1e(r0, r1)
            r2.A1K()
            return
        L_0x03a9:
            java.lang.String r0 = "indiaUpiMapperAliasManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03b0:
            java.lang.String r0 = "fieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03b7:
            java.lang.String r0 = "indiaUpiFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03be:
            java.lang.String r0 = "paymentsActionManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03c5:
            java.lang.String r0 = "paymentsUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03cc:
            r6.A1J(r5)
            return
        L_0x03d0:
            java.lang.String r0 = "paymentsManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891290c.onClick(android.view.View):void");
    }
}
