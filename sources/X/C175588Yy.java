package X;

import android.content.Intent;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel;

/* renamed from: X.8Yy  reason: invalid class name and case insensitive filesystem */
public final class C175588Yy extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ IndiaUpiInternationalValidateQrActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175588Yy(IndiaUpiInternationalValidateQrActivity indiaUpiInternationalValidateQrActivity) {
        super(1);
        this.this$0 = indiaUpiInternationalValidateQrActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1452974y r15 = (C1452974y) obj;
        if (r15 instanceof C137166oA) {
            IndiaUpiInternationalValidateQrActivity indiaUpiInternationalValidateQrActivity = this.this$0;
            C195909Zz r0 = indiaUpiInternationalValidateQrActivity.A00;
            if (r0 != null) {
                Intent A00 = r0.A00(indiaUpiInternationalValidateQrActivity);
                IndiaUpiInternationalValidateQrViewModel indiaUpiInternationalValidateQrViewModel = (IndiaUpiInternationalValidateQrViewModel) this.this$0.A01.getValue();
                C162457s7.A0H(A00);
                C166207yJ r10 = ((C137166oA) r15).A00;
                String str = this.this$0.A0e;
                C162457s7.A0J(r10, 1);
                Class<String> cls = String.class;
                A00.putExtra("extra_payment_handle", new C166557yt(AnonymousClass3QD.A00(), cls, r10.A0B, "upiHandle"));
                A00.putExtra("extra_merchant_code", r10.A06);
                AnonymousClass3QD A002 = AnonymousClass3QD.A00();
                String str2 = r10.A07;
                A00.putExtra("extra_payee_name", new C166557yt(A002, cls, str2, "accountHolderName"));
                A00.putExtra("extra_initiation_mode", r10.A04);
                A00.putExtra("extra_purpose_code", "11");
                A00.putExtra("extra_payment_preset_amount", r10.A08);
                A00.putExtra("extra_payment_preset_min_amount", (String) null);
                A00.putExtra("extra_skip_value_props_display", false);
                String str3 = r10.A02;
                int i = 9;
                if (!str3.equals("DEEP_LINK")) {
                    i = 8;
                }
                A00.putExtra("extra_payments_entry_type", i);
                AnonymousClass1VX r1 = indiaUpiInternationalValidateQrViewModel.A01;
                C162457s7.A0J(r1, 0);
                int A0N = r1.A0N(3327);
                if (A0N == 0) {
                    A0N = SearchActionVerificationClientService.NOTIFICATION_ID;
                }
                A00.putExtra("extra_payment_preset_max_amount", A0N);
                A00.putExtra("extra_payee_name", new C166557yt(AnonymousClass3QD.A00(), cls, str2, "accountHolderName"));
                A00.putExtra("extra_is_first_payment_method", true);
                A00.putExtra("extra_upi_global_meta_data", r10);
                A00.putExtra("referral_screen", str);
                A00.putExtra("extra_is_pay_money_only", true);
                A00.putExtra("return-after-pay", "DEEP_LINK".equals(str3));
                A00.putExtra("verify-vpa-in-background", false);
                A00.addFlags(33554432);
                this.this$0.startActivity(A00);
                this.this$0.finish();
            } else {
                throw C18270x1.A0S("paymentActivityLauncher");
            }
        }
        return C59022wD.A00;
    }
}
