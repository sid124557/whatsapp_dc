package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.care.csat.CsatSurveyBloksActivity;
import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;
import com.whatsapp.payments.ui.BrazilDyiReportActivity;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactOmbudsmanActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity;
import com.whatsapp.payments.ui.BrazilPaymentReportPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.BrazilViralityLinkVerifierActivity;
import com.whatsapp.payments.ui.IncentiveValuePropsActivity;
import com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiQuickBuyActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.9cb  reason: invalid class name and case insensitive filesystem */
public abstract class C197119cb implements C203719oC {
    public C56612sH A00;
    public C1906899l A01;
    public final C64773Ex A02;
    public final AnonymousClass5ZU A03;
    public final C620633i A04;
    public final C54292oU A05;
    public final AnonymousClass9U4 A06;
    public final C195219Wq A07;
    public final String A08;

    public AnonymousClass36K B9q(AnonymousClass39L r4) {
        AnonymousClass39V[] r2 = new AnonymousClass39V[3];
        AnonymousClass39V.A06("currency", C1899693i.A0d(r4, r2), r2);
        return AnonymousClass36K.A0I("money", r2);
    }

    public boolean AyT() {
        if (this instanceof C190969An) {
            return true;
        }
        return false;
    }

    public void B2Y(C624034w r3, C624034w r4) {
        AnonymousClass9W2 r0;
        String str;
        if ((this instanceof C190969An) && r4 != null) {
            AnonymousClass9W2 r1 = C1899693i.A0K(r3).A0G;
            AnonymousClass99L A0K = C1899693i.A0K(r4);
            if (r1 != null && (r0 = A0K.A0G) != null && (str = r0.A0D) != null) {
                r1.A0I = str;
            }
        }
    }

    public Class B42() {
        if (this instanceof C190969An) {
            return IndiaUpiBankAccountDetailsActivity.class;
        }
        if (this instanceof C190959Am) {
            return BrazilPaymentCardDetailsActivity.class;
        }
        return null;
    }

    public Intent B43(Context context) {
        if (this instanceof C190959Am) {
            return AnonymousClass0x9.A08(context, BrazilAccountRecoveryPinActivity.class);
        }
        return null;
    }

    public Class B44() {
        if (this instanceof C190969An) {
            return IndiaUpiPaymentsAccountSetupActivity.class;
        }
        if (this instanceof C190959Am) {
            return BrazilPayBloksActivity.class;
        }
        return null;
    }

    public Intent B45(Context context) {
        if (!(this instanceof C190959Am)) {
            return null;
        }
        Intent A032 = C1899693i.A03(context);
        A032.putExtra("screen_name", ((C190959Am) this).A0T.A03("p2p_context", false));
        AnonymousClass98s.A0a(A032, "referral_screen", "payment_home");
        AnonymousClass98s.A0a(A032, "onboarding_context", "generic_context");
        return A032;
    }

    public Class B5P() {
        if (this instanceof C190969An) {
            return IndiaUpiCheckBalanceActivity.class;
        }
        return null;
    }

    public String B5Q() {
        if (this instanceof C190969An) {
            return "upi_p2p_check_balance";
        }
        return "";
    }

    public AnonymousClass9RF B5e() {
        boolean z = this instanceof C190969An;
        C54292oU r3 = this.A05;
        AnonymousClass5ZU r2 = this.A03;
        C64773Ex r1 = this.A02;
        if (z) {
            return new C1907199o(r1, r2, r3);
        }
        return new AnonymousClass9RF(r1, r2, r3);
    }

    public Class B5p() {
        if (this instanceof C190959Am) {
            return BrazilPaymentContactOmbudsmanActivity.class;
        }
        return null;
    }

    public Class B5q() {
        if (this instanceof C190969An) {
            return DescribeProblemActivity.class;
        }
        if (this instanceof C190959Am) {
            return BrazilPaymentContactSupportActivity.class;
        }
        return null;
    }

    public Class B5r() {
        if (!(this instanceof C190959Am) || !((C190959Am) this).A0M.A02.A0X(1615)) {
            return null;
        }
        return BrazilPaymentContactSupportP2pActivity.class;
    }

    public C185728u9 B63() {
        if (this instanceof C190969An) {
            return ((C190969An) this).A0F;
        }
        if (this instanceof C190959Am) {
            return ((C190959Am) this).A0C;
        }
        return null;
    }

    public C194619Tt B64() {
        if (this instanceof C190969An) {
            return ((C190969An) this).A0C;
        }
        return null;
    }

    public C203549nv B66() {
        if (this instanceof C190969An) {
            return ((C190969An) this).A0D;
        }
        if (!(this instanceof C190959Am)) {
            return null;
        }
        C190959Am r0 = (C190959Am) this;
        C54292oU r1 = r0.A05;
        AnonymousClass1VX r3 = r0.A0B;
        C620733j r2 = r0.A0A;
        C1907099n r7 = r0.A0M;
        C203499no r8 = r0.A0N;
        return new C196709bc(r1, r2, r3, r0.A0E, r0.A0I, r0.A0L, r7, r8);
    }

    public C202929mq B67() {
        if (this instanceof C190969An) {
            C190969An r0 = (C190969An) this;
            C54292oU r2 = r0.A05;
            C56492s4 r1 = r0.A03;
            AnonymousClass9U4 r6 = r0.A06;
            return new C196509ax(r1, r2, r0.A0F, r0.A0I, r0.A0K, r6);
        } else if (!(this instanceof C190959Am)) {
            return null;
        } else {
            C190959Am r02 = (C190959Am) this;
            C56612sH r3 = r02.A08;
            C69263Wi r12 = r02.A02;
            C56492s4 r22 = r02.A05;
            AnonymousClass9U4 r8 = r02.A06;
            C620933l r7 = r02.A0K;
            return new C196519ay(r12, r22, r3, r02.A0G, r02.A0H, r02.A0I, r7, r8, r02.A0R);
        }
    }

    public C203319nV B6C() {
        if (this instanceof C190969An) {
            return ((C190969An) this).A0H;
        }
        if (this instanceof C190959Am) {
            return ((C190959Am) this).A0F;
        }
        return null;
    }

    public AnonymousClass9SM B6f() {
        if (!(this instanceof C190969An)) {
            return null;
        }
        C190969An r0 = (C190969An) this;
        C56612sH r2 = r0.A06;
        AnonymousClass1VX r4 = r0.A0A;
        C54292oU r3 = r0.A05;
        C66663Mh r1 = r0.A02;
        C195219Wq r10 = r0.A07;
        AnonymousClass9WN r9 = r0.A0V;
        C1906899l r6 = r0.A0I;
        C197109ca r8 = r0.A0Q;
        return new C1907299p(r1, r2, r3, r4, r0.A0F, r6, r0.A0L, r8, r9, r10);
    }

    public Intent B6q(Context context, Uri uri, boolean z) {
        if (!(this instanceof C190969An)) {
            return AnonymousClass0x9.A08(context, BBA());
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP ");
        Class<IndiaUpiPaymentSettingsActivity> cls = IndiaUpiPaymentSettingsActivity.class;
        A0o.append(cls);
        C18280x3.A14(A0o);
        Intent A082 = AnonymousClass0x9.A08(context, cls);
        A082.putExtra("extra_is_invalid_deep_link_url", z);
        A082.putExtra("referral_screen", "deeplink");
        A082.putExtra("extra_deep_link_url", uri);
        return A082;
    }

    public Intent B6r(Context context, Uri uri) {
        int length;
        if (this instanceof C190969An) {
            C190969An r2 = (C190969An) this;
            boolean A002 = AnonymousClass9LX.A00(uri, r2.A0S);
            if (r2.A0I.A0C() || A002) {
                return r2.B6q(context, uri, A002);
            }
            Log.i("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP for new user");
            Intent B6q = r2.B6q(context, uri, false);
            B6q.putExtra("actual_deep_link", uri.toString());
            AnonymousClass5VI.A00(B6q, "deepLink");
            return B6q;
        } else if (this instanceof C190959Am) {
            C190959Am r22 = (C190959Am) this;
            if (AnonymousClass9LX.A00(uri, r22.A0S)) {
                Intent A082 = AnonymousClass0x9.A08(context, BrazilPaymentSettingsActivity.class);
                A082.putExtra("referral_screen", "deeplink");
                return A082;
            }
            Intent BBE = r22.BBE(context, "generic_context", "deeplink");
            BBE.putExtra("extra_deep_link_url", uri);
            String stringExtra = BBE.getStringExtra("screen_name");
            if ("brpay_p_pin_nux_create".equals(stringExtra) || "brpay_p_compliance_kyc_next_screen_router".equals(stringExtra)) {
                AnonymousClass98s.A0a(BBE, "deep_link_continue_setup", "1");
            }
            if (r22.A0T.A08("p2p_context")) {
                return BBE;
            }
            String queryParameter = uri.getQueryParameter("c");
            if (queryParameter != null && (length = queryParameter.length()) >= 5 && !(!queryParameter.substring(length - 5, length).equals("9Y6XA"))) {
                return BBE;
            }
            AnonymousClass98s.A0a(BBE, "campaign_id", uri.getQueryParameter("c"));
            return BBE;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP for new user");
            Class B44 = B44();
            A0o.append(B44);
            C18280x3.A14(A0o);
            Intent A083 = AnonymousClass0x9.A08(context, B44);
            AnonymousClass5VI.A00(A083, "deepLink");
            return A083;
        }
    }

    public int B72() {
        if (this instanceof C190959Am) {
            return R.style.f12nameremoved;
        }
        return 0;
    }

    public Intent B7D(Context context, String str, String str2) {
        if (!(this instanceof C190959Am)) {
            return null;
        }
        Intent A082 = AnonymousClass0x9.A08(context, BrazilDyiReportActivity.class);
        A082.putExtra("extra_paymentProvider", str2);
        A082.putExtra("extra_paymentAccountType", str);
        return A082;
    }

    public C203499no B7b() {
        if (this instanceof C190969An) {
            return ((C190969An) this).A0Q;
        }
        return ((C190959Am) this).A0N;
    }

    public Intent B8I(Context context) {
        Intent A082;
        if (this instanceof C190969An) {
            A082 = AnonymousClass0x9.A08(context, IndiaUpiIncentivesValuePropsActivity.class);
            A082.putExtra("extra_payments_entry_type", 1);
            A082.putExtra("extra_banner_type", 20);
        } else if (!(this instanceof C190959Am)) {
            return null;
        } else {
            A082 = AnonymousClass0x9.A08(context, IncentiveValuePropsActivity.class);
        }
        A082.putExtra("referral_screen", "in_app_banner");
        return A082;
    }

    public Intent B8Q(Context context) {
        if (this instanceof C190959Am) {
            return AnonymousClass0x9.A08(context, BCl());
        }
        if (this.A01.A0D() || this.A01.A0B()) {
            return AnonymousClass0x9.A08(context, this.A06.A0G().BCl());
        }
        Intent A082 = AnonymousClass0x9.A08(context, this.A06.A0G().B44());
        A082.putExtra("extra_setup_mode", 1);
        return A082;
    }

    public String B9M(C166587yw r2) {
        if (this instanceof C190969An) {
            return ((C190969An) this).A0G.A04(r2);
        }
        return "";
    }

    public C195069Vt B9W() {
        if (this instanceof C190959Am) {
            return ((C190959Am) this).A0D;
        }
        return null;
    }

    public AnonymousClass9TY B9X() {
        if (!(this instanceof C190959Am)) {
            return null;
        }
        C190959Am r0 = (C190959Am) this;
        C56612sH r1 = r0.A08;
        C620933l r5 = r0.A0K;
        return new AnonymousClass9TY(r1, r0.A09, r0.A0D, r0.A0I, r5, r0.A0N);
    }

    public Class B9x(Bundle bundle) {
        String A0V;
        if (!(this instanceof C190959Am)) {
            return null;
        }
        String string = bundle.getString("nfm_action");
        if (TextUtils.isEmpty(string)) {
            A0V = "[PAY]: BrazilPayNFMController -- NFM action not passed";
        } else {
            switch (string.hashCode()) {
                case -229223458:
                    if (string.equals("wa_payment_learn_more")) {
                        return WaInAppBrowsingActivity.class;
                    }
                    break;
                case 48886399:
                    if (string.equals("payments_care_csat")) {
                        return CsatSurveyBloksActivity.class;
                    }
                    break;
                case 127237947:
                    if (string.equals("wa_payment_fbpin_reset")) {
                        return BrazilPayBloksActivity.class;
                    }
                    break;
                case 540952115:
                    if (string.equals("wa_payment_transaction_details")) {
                        return BrazilPaymentTransactionDetailActivity.class;
                    }
                    break;
            }
            A0V = AnonymousClass000.A0V("[PAY]: BrazilPayNFMController -- Unsupported NFM action: ", string, AnonymousClass001.A0o());
        }
        Log.e(A0V);
        return null;
    }

    public C202529mA BAY() {
        if (this instanceof C190969An) {
            return new C196839bp(((C190969An) this).A0N);
        }
        if (this instanceof C190959Am) {
            return new C196829bo();
        }
        return null;
    }

    public List BAe(C624034w r5, AnonymousClass2z0 r6) {
        AnonymousClass39L r1;
        AnonymousClass1S4 r12 = r5.A0A;
        if (r5.A0L() || r12 == null || (r1 = r12.A01) == null) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass36K.A0O(B9q(r1), "amount", A0s, new AnonymousClass39V[0]);
        return A0s;
    }

    public C153527bU BAh() {
        if (this instanceof C190969An) {
            return ((C190969An) this).A0T;
        }
        return null;
    }

    public C150457Qu BAi() {
        return new C150457Qu();
    }

    public C185418tc BAj(C620733j r2, AnonymousClass1VX r3, C194589Tn r4, C150457Qu r5) {
        return new C196359ai(r2, r3, r4, r5);
    }

    public Class BAk() {
        if (this instanceof C190969An) {
            return IndiaUpiCheckOrderDetailsActivity.class;
        }
        return BrazilOrderDetailsActivity.class;
    }

    public C202959mt BAl() {
        if (this instanceof C190969An) {
            C190969An r0 = (C190969An) this;
            AnonymousClass1VX r5 = r0.A0A;
            C69263Wi r1 = r0.A01;
            C54292oU r2 = r0.A05;
            AnonymousClass4FS r14 = r0.A0X;
            AnonymousClass31C r6 = r0.A0B;
            C194259Se r13 = r0.A0W;
            AnonymousClass9U4 r11 = r0.A06;
            AnonymousClass9U1 r8 = r0.A0E;
            AnonymousClass9U5 r10 = r0.A0O;
            return new C196659bX(r1, r2, r0.A08, r0.A09, r5, r6, r0.A0C, r8, r0.A0J, r10, r11, r0.A0U, r13, r14);
        } else if (this instanceof C190959Am) {
            return new C196649bW();
        } else {
            return null;
        }
    }

    public C203329nW BAn() {
        if (this instanceof C190969An) {
            return ((C190969An) this).A0S;
        }
        if (this instanceof C190959Am) {
            return ((C190959Am) this).A0S;
        }
        return null;
    }

    public AnonymousClass9RX BAo(C54292oU r3, C620933l r4) {
        if (this instanceof C190969An) {
            return new C190989Ap(((C190969An) this).A05, r3, r4);
        }
        if (this instanceof C190959Am) {
            return new C190979Ao(((C190959Am) this).A07, r3, r4);
        }
        return new AnonymousClass9RX(this.A04, r3, r4);
    }

    public int BAp() {
        if (!(this instanceof C190969An) && !(this instanceof C190959Am)) {
            return 0;
        }
        return R.string.f11nameremoved;
    }

    public Class BAq() {
        if (this instanceof C190959Am) {
            return BrazilFbPayHubActivity.class;
        }
        return null;
    }

    public C185468tj BAs() {
        if (this instanceof C190969An) {
            return new C191009Ar();
        }
        if (this instanceof C190959Am) {
            return new C190999Aq();
        }
        return null;
    }

    public Class BAt() {
        if (this instanceof C190969An) {
            return IndiaPaymentTransactionHistoryActivity.class;
        }
        if (this instanceof C190959Am) {
            return PaymentTransactionHistoryActivity.class;
        }
        return null;
    }

    public int BAv() {
        if (this instanceof C190969An) {
            return R.string.f11nameremoved;
        }
        return 0;
    }

    public Pattern BAw() {
        if (this instanceof C190969An) {
            return AnonymousClass9M6.A00;
        }
        return null;
    }

    public C194659Tz BAx() {
        if (this instanceof C190969An) {
            C190969An r0 = (C190969An) this;
            C56612sH r5 = r0.A06;
            AnonymousClass1VX r7 = r0.A0A;
            C50382i5 r2 = r0.A04;
            C195219Wq r9 = r0.A07;
            return new C1907499r(r0.A00, r2, r0.A02, r0.A03, r5, r0.A07, r7, r0.A0I, r9);
        } else if (!(this instanceof C190959Am)) {
            return null;
        } else {
            C190959Am r02 = (C190959Am) this;
            C56612sH r52 = r02.A08;
            AnonymousClass1VX r72 = r02.A0B;
            C50382i5 r22 = r02.A06;
            C195219Wq r92 = r02.A0V;
            return new C1907399q(r02.A01, r22, r02.A02, r02.A03, r52, r02.A0A, r72, r02.A0T, r92);
        }
    }

    public AnonymousClass9TC BAy() {
        if (!(this instanceof C190969An)) {
            return null;
        }
        C190969An r0 = (C190969An) this;
        C56612sH r1 = r0.A06;
        AnonymousClass1VX r3 = r0.A0A;
        return new AnonymousClass9TC(r1, r0.A05, r3, r0.A0I, r0.A07);
    }

    public /* synthetic */ Pattern BAz() {
        if (this instanceof C190969An) {
            return AnonymousClass9M6.A01;
        }
        return null;
    }

    public String BB0(C203549nv r2, C624134x r3) {
        return this.A07.A0a(r2, r3);
    }

    public C194039Ri BB2() {
        if (!(this instanceof C190959Am)) {
            return null;
        }
        C190959Am r1 = (C190959Am) this;
        return new C194039Ri(r1.A05.A00, r1.A00, r1.A03, r1.A06);
    }

    public Class BB3() {
        if (this instanceof C190969An) {
            return IndiaUpiVpaContactInfoActivity.class;
        }
        return null;
    }

    public int BB4() {
        if (this instanceof C190969An) {
            return R.string.f11nameremoved;
        }
        return 0;
    }

    public Class BB5() {
        if (this instanceof C190969An) {
            return IndiaUpiProfileDetailsActivity.class;
        }
        return null;
    }

    public AnonymousClass4FF BB6() {
        if (this instanceof C190969An) {
            C190969An r0 = (C190969An) this;
            C196629bS r3 = r0.A0F;
            return new C196789bk(r0.A02, r0.A0A, r3, r0.A0Q, r0.A0V);
        } else if (this instanceof C190959Am) {
            return new C196779bj(((C190959Am) this).A0B);
        } else {
            return null;
        }
    }

    public Class BB7() {
        if (this instanceof C190969An) {
            return IndiaUpiQuickBuyActivity.class;
        }
        if (this instanceof C190959Am) {
            return BrazilOrderDetailsActivity.class;
        }
        return null;
    }

    public Class BBA() {
        if (this instanceof C190969An) {
            return IndiaUpiPaymentSettingsActivity.class;
        }
        if (this instanceof C190959Am) {
            return BrazilPaymentSettingsActivity.class;
        }
        return null;
    }

    public C193769Px BBB() {
        if (!(this instanceof C190959Am)) {
            return null;
        }
        C190959Am r0 = (C190959Am) this;
        return new C193769Px(r0.A02, r0.A03, r0.A08, r0.A0K, r0.A0V, r0.A0W);
    }

    public Class BBC() {
        if (this instanceof C190969An) {
            return IndiaUpiPaymentTransactionDetailsActivity.class;
        }
        return BrazilPaymentTransactionDetailActivity.class;
    }

    public Class BBD() {
        if (this instanceof C190959Am) {
            return BrazilViralityLinkVerifierActivity.class;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent BBE(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C190969An
            if (r0 == 0) goto L_0x001c
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r5, r0)
            java.lang.String r1 = "extra_payments_entry_type"
            r0 = 1
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r2.putExtra(r1, r0)
            java.lang.String r0 = "inAppBanner"
            X.AnonymousClass5VI.A00(r2, r0)
            return r2
        L_0x001c:
            boolean r0 = r4 instanceof X.C190959Am
            if (r0 == 0) goto L_0x007b
            r2 = r4
            X.9Am r2 = (X.C190959Am) r2
            java.lang.String r0 = "in_app_banner"
            if (r7 != r0) goto L_0x006b
            X.1VX r1 = r2.A0B
            r0 = 567(0x237, float:7.95E-43)
        L_0x002b:
            boolean r3 = r1.A0X(r0)
        L_0x002f:
            X.9Ty r2 = r2.A0T
            r1 = 0
            java.lang.String r0 = "merchant_account_linking_context"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = r2.A02()
        L_0x003e:
            if (r3 == 0) goto L_0x005a
            if (r1 == 0) goto L_0x005a
            android.content.Intent r2 = X.C1899693i.A03(r5)
            java.lang.String r0 = "screen_name"
            r2.putExtra(r0, r1)
            if (r7 == 0) goto L_0x0052
            java.lang.String r0 = "referral_screen"
            X.AnonymousClass98s.A0a(r2, r0, r7)
        L_0x0052:
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "generic_context"
            X.AnonymousClass98s.A0a(r2, r1, r0)
            return r2
        L_0x005a:
            java.lang.Class<com.whatsapp.payments.ui.BrazilPaymentSettingsActivity> r0 = com.whatsapp.payments.ui.BrazilPaymentSettingsActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r5, r0)
            java.lang.String r0 = "referral_screen"
            r2.putExtra(r0, r7)
            goto L_0x0052
        L_0x0066:
            java.lang.String r1 = r2.A03(r6, r1)
            goto L_0x003e
        L_0x006b:
            java.lang.String r0 = "alt_virality"
            if (r7 != r0) goto L_0x0074
            X.1VX r1 = r2.A0B
            r0 = 570(0x23a, float:7.99E-43)
            goto L_0x002b
        L_0x0074:
            java.lang.String r0 = "deeplink"
            boolean r3 = X.AnonymousClass000.A1Y(r7, r0)
            goto L_0x002f
        L_0x007b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197119cb.BBE(android.content.Context, java.lang.String, java.lang.String):android.content.Intent");
    }

    public Class BBL() {
        if (this instanceof C190969An) {
            return IndiaUpiPinPrimerFullSheetActivity.class;
        }
        return null;
    }

    public Class BC8() {
        if (this instanceof C190959Am) {
            return BrazilPaymentReportPaymentActivity.class;
        }
        return null;
    }

    public int BCS(C624034w r3) {
        AnonymousClass9W2 r0;
        int A002;
        if (!(this instanceof C190969An) || (r0 = C1899693i.A0K(r3).A0G) == null || (A002 = r0.A00()) == 1 || A002 == 2 || A002 == 4 || A002 != 6) {
            return R.string.f11nameremoved;
        }
        return R.string.f11nameremoved;
    }

    public Class BCl() {
        if (this instanceof C190969An) {
            if (C154437dA.A00(((C190969An) this).A0A)) {
                return IndiaUpiSendPaymentActivityBottomSheet.class;
            }
            return IndiaUpiSendPaymentActivity.class;
        } else if (!(this instanceof C190959Am)) {
            return null;
        } else {
            C190959Am r2 = (C190959Am) this;
            boolean A002 = r2.A0M.A00();
            boolean A003 = C154437dA.A00(r2.A0B);
            if (A002) {
                if (A003) {
                    return BrazilSmbPaymentActivityBottomSheet.class;
                }
                return BrazilSmbPaymentActivity.class;
            } else if (A003) {
                return BrazilPaymentActivityBottomSheet.class;
            } else {
                return BrazilPaymentActivity.class;
            }
        }
    }

    public int BDu(C624034w r2) {
        if ((this instanceof C190969An) || (this instanceof C190959Am)) {
            return C195219Wq.A01(r2);
        }
        return R.color.f5nameremoved;
    }

    public int BDw(C624034w r2) {
        C195219Wq r0;
        if (this instanceof C190969An) {
            r0 = this.A07;
        } else if (!(this instanceof C190959Am)) {
            return 0;
        } else {
            r0 = ((C190959Am) this).A0V;
        }
        return r0.A0B(r2);
    }

    public boolean BFO() {
        if (this instanceof C190959Am) {
            return ((C190959Am) this).A0T.A05.A03();
        }
        return false;
    }

    public C133766hu BFz() {
        if (this instanceof C190969An) {
            return new AnonymousClass99H();
        }
        if (this instanceof C190959Am) {
            return new AnonymousClass99G();
        }
        return null;
    }

    public C133786hw BG0() {
        if (this instanceof C190959Am) {
            return new AnonymousClass99I();
        }
        return null;
    }

    public C133676hl BG1() {
        if (this instanceof C190969An) {
            return new AnonymousClass99D();
        }
        if (this instanceof C190959Am) {
            return new AnonymousClass99C();
        }
        return null;
    }

    public C133756ht BG2() {
        if (this instanceof C190959Am) {
            return new AnonymousClass99F();
        }
        return null;
    }

    public C133776hv BG3() {
        if (this instanceof C190959Am) {
            return new AnonymousClass99J();
        }
        return null;
    }

    public AnonymousClass1S4 BG4() {
        if (this instanceof C190969An) {
            return new AnonymousClass99L();
        }
        return new AnonymousClass99M();
    }

    public boolean BHL() {
        if ((this instanceof C190969An) || (this instanceof C190959Am)) {
            return true;
        }
        return false;
    }

    public boolean BIH() {
        if (this instanceof C190969An) {
            return true;
        }
        return false;
    }

    public boolean BIO(Uri uri) {
        C203329nW r0;
        if (this instanceof C190969An) {
            r0 = ((C190969An) this).A0S;
        } else if (!(this instanceof C190959Am)) {
            return false;
        } else {
            r0 = ((C190959Am) this).A0S;
        }
        return AnonymousClass9LX.A00(uri, r0);
    }

    public boolean BJJ(AnonymousClass9LZ r2) {
        if ((this instanceof C190969An) || (this instanceof C190959Am)) {
            return true;
        }
        return false;
    }

    public void BK6(Uri uri) {
        String queryParameter;
        int length;
        String str;
        if (this instanceof C190969An) {
            C196699bb r5 = ((C190969An) this).A0S;
            if (!uri.getQueryParameterNames().isEmpty()) {
                String queryParameter2 = uri.getQueryParameter("campaignID");
                String str2 = null;
                if (queryParameter2 == null) {
                    str = "Unknown signup url";
                } else {
                    if (AnonymousClass9LX.A00(uri, r5)) {
                        str = "Blocked signup url";
                    } else {
                        str = null;
                    }
                    try {
                        JSONObject A1G = AnonymousClass0x9.A1G();
                        A1G.put("campaign_id", queryParameter2);
                        str2 = A1G.toString();
                    } catch (Exception e) {
                        Log.e("IN PAY: error logging campaign id", e);
                    }
                }
                C134246ig r1 = new C134246ig();
                r1.A0b = "deeplink";
                r1.A08 = C18290x4.A0Z();
                r1.A0Z = str2;
                r1.A0T = str;
                r5.A01.BKA(r1);
            }
        } else if (this instanceof C190959Am) {
            C190959Am r0 = (C190959Am) this;
            C196689ba r3 = r0.A0S;
            boolean A082 = r0.A0T.A08("generic_context");
            String queryParameter3 = uri.getQueryParameter("c");
            if ("br".equals(r3.A00.A0F(uri)) && queryParameter3 != null) {
                if (A082 || ((queryParameter = uri.getQueryParameter("c")) != null && (length = queryParameter.length()) >= 5 && !(!queryParameter.substring(length - 5, length).equals("9Y6XA")))) {
                    AnonymousClass303 r4 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
                    r4.A03("campaign_id", queryParameter3);
                    r3.A02.BKE(r4, 0, (Integer) null, "deeplink", (String) null);
                }
            }
        }
    }

    public void BLt(Context context, AnonymousClass4FU r10, C624034w r11) {
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet;
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet2;
        if (this instanceof C190959Am) {
            C190959Am r7 = (C190959Am) this;
            C194649Ty r3 = r7.A0T;
            String A032 = r3.A03("p2p_context", false);
            if (A032 == null) {
                AnonymousClass9U4.A00(r7.A06).A02().A03(new C205009qH(r10, 3, r7));
            } else if ("brpay_p_account_recovery_eligibility_screen".equals(A032)) {
                r7.A0U.A02((C89644eZ) C111095hX.A02(context), "p2p_context", "receive_flow");
            } else {
                C197449dB r4 = new C197449dB(context, A032);
                if (r3.A09("p2p_context")) {
                    PaymentsWarmWelcomeBottomSheet A002 = AnonymousClass9UL.A00("receive_flow");
                    A002.A02 = new C204709pn(r7, 0);
                    paymentsWarmWelcomeBottomSheet2 = A002;
                } else if (r7.A0B.A0X(3013)) {
                    paymentsWarmWelcomeBottomSheet2 = AnonymousClass9UL.A01("receive_flow");
                } else {
                    AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
                    Bundle A082 = AnonymousClass002.A08();
                    A082.putString("referral_screen", "receive_flow");
                    addPaymentMethodBottomSheet.A0u(A082);
                    addPaymentMethodBottomSheet.A03 = new AnonymousClass9P2(0, R.string.f11nameremoved, 0);
                    addPaymentMethodBottomSheet.A04 = r4;
                    paymentsWarmWelcomeBottomSheet = addPaymentMethodBottomSheet;
                    r10.Boo(paymentsWarmWelcomeBottomSheet);
                }
                paymentsWarmWelcomeBottomSheet2.A01 = r4;
                paymentsWarmWelcomeBottomSheet = paymentsWarmWelcomeBottomSheet2;
                r10.Boo(paymentsWarmWelcomeBottomSheet);
            }
        } else {
            C626936e.A06(r11);
            Intent A083 = AnonymousClass0x9.A08(context, B44());
            A083.putExtra("extra_setup_mode", 2);
            A083.putExtra("extra_receive_nux", true);
            if (r11.A0A != null && !TextUtils.isEmpty((CharSequence) null)) {
                A083.putExtra("extra_onboarding_provider", (String) null);
            }
            AnonymousClass5VI.A00(A083, "acceptPayment");
            context.startActivity(A083);
        }
    }

    public void Bh0(C161307pP r6, List list) {
        if (this instanceof C190969An) {
            r6.A02 = 0;
            r6.A03 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass9W2 r0 = C1899693i.A0K(C1899693i.A0E(it)).A0G;
                if (r0 != null) {
                    if (AnonymousClass9WN.A02(r0.A0E)) {
                        r6.A03++;
                    } else {
                        r6.A02++;
                    }
                }
            }
        }
    }

    public void Bnx(C153087ae r5) {
        if (this instanceof C190969An) {
            C190969An r3 = (C190969An) this;
            C161357pU A022 = r5.A02();
            if (A022 == C161357pU.A0F) {
                C85204Fi r2 = A022.A02;
                ((AnonymousClass1S3) r2).A00 = C1899593h.A08(r2, new BigDecimal(r3.A02.A03(C66663Mh.A1l)));
            }
        } else if (this instanceof C190959Am) {
            C190959Am r32 = (C190959Am) this;
            C161357pU A023 = r5.A02();
            if (A023 == C161357pU.A0E) {
                C85204Fi r22 = A023.A02;
                ((AnonymousClass1S3) r22).A00 = C1899593h.A08(r22, new BigDecimal(r32.A04.A03(C66663Mh.A1h)));
            }
        }
    }

    public boolean BoD() {
        if (this instanceof C190959Am) {
            return true;
        }
        return false;
    }

    public boolean BoO() {
        if (this instanceof C190959Am) {
            return ((C190959Am) this).A0T.A06();
        }
        return false;
    }

    public C197119cb(C64773Ex r1, AnonymousClass5ZU r2, C620633i r3, C54292oU r4, AnonymousClass9U4 r5, C195219Wq r6, String str) {
        this.A08 = str;
        this.A05 = r4;
        this.A07 = r6;
        this.A03 = r2;
        this.A02 = r1;
        this.A04 = r3;
        this.A06 = r5;
    }

    public /* synthetic */ boolean B28(String str) {
        C203329nW BAn = BAn();
        if (BAn == null || !BAn.B28(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List BAf(X.C624034w r6, X.AnonymousClass2z0 r7) {
        /*
            r5 = this;
            boolean r0 = r6.A0L()
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.lang.String r1 = "type"
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "request"
            X.AnonymousClass39V.A03(r1, r0, r2)
            X.4uZ r0 = r7.A00
            boolean r0 = X.C627336j.A0K(r0)
            if (r0 == 0) goto L_0x0023
            com.whatsapp.jid.UserJid r1 = r6.A0E
            X.C626936e.A06(r1)
            java.lang.String r0 = "sender"
            X.AnonymousClass39V.A01(r1, r0, r2)
        L_0x0023:
            java.lang.String r1 = r6.A0K
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = "request-id"
            X.AnonymousClass39V.A03(r0, r1, r2)
        L_0x002c:
            X.1S4 r0 = r6.A0A
            if (r0 == 0) goto L_0x0041
            long r0 = r0.A0B()
            long r0 = X.C18290x4.A0B(r0)
            java.lang.String r1 = java.lang.Long.toString(r0)
            java.lang.String r0 = "expiry-ts"
            X.AnonymousClass39V.A03(r0, r1, r2)
        L_0x0041:
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = "country"
            java.lang.String r0 = r6.A0G
            X.AnonymousClass39V.A03(r1, r0, r2)
            java.lang.String r3 = "version"
            int r1 = r6.A04
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r3, (int) r1)
        L_0x0059:
            r2.add(r0)
        L_0x005c:
            return r2
        L_0x005d:
            java.lang.String r0 = "send"
            X.AnonymousClass39V.A03(r1, r0, r2)
            int r1 = r6.A03
            r0 = 100
            if (r1 != r0) goto L_0x011e
            java.lang.String r1 = "p2m"
        L_0x006a:
            java.lang.String r0 = "transaction-type"
            X.AnonymousClass39V.A03(r0, r1, r2)
            X.4uZ r0 = r7.A00
            boolean r0 = X.C627336j.A0K(r0)
            if (r0 == 0) goto L_0x0081
            com.whatsapp.jid.UserJid r1 = r6.A0D
            X.C626936e.A06(r1)
            java.lang.String r0 = "receiver"
            X.AnonymousClass39V.A01(r1, r0, r2)
        L_0x0081:
            java.util.ArrayList r1 = r6.A0N
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x009c
            int r0 = r1.size()
            if (r0 != r4) goto L_0x009c
            java.lang.Object r0 = r1.get(r3)
            X.2Nx r0 = (X.C42392Nx) r0
            X.7yw r0 = r0.A01
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential-id"
            X.AnonymousClass39V.A03(r0, r1, r2)
        L_0x009c:
            X.1S4 r0 = r6.A0A
            if (r0 == 0) goto L_0x00a3
            r0.A06(r2, r3)
        L_0x00a3:
            java.lang.String r0 = r6.A0K
            boolean r0 = X.AnonymousClass36S.A07(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = r6.A0K
            X.C626936e.A06(r1)
            java.lang.String r0 = "id"
            X.AnonymousClass39V.A03(r0, r1, r2)
        L_0x00b5:
            java.lang.String r0 = r6.A0M
            if (r0 == 0) goto L_0x00d1
            X.9U4 r0 = r5.A06
            X.36F r3 = X.AnonymousClass9U4.A01(r0)
            java.lang.String r1 = r6.A0M
            r0 = 0
            X.34w r0 = X.AnonymousClass36F.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r1 = r0.A0K
            if (r1 == 0) goto L_0x00d1
            java.lang.String r0 = "request-id"
            X.AnonymousClass39V.A03(r0, r1, r2)
        L_0x00d1:
            int r0 = r6.A00
            if (r0 != r4) goto L_0x00dc
            java.lang.String r1 = "payment_initiator"
            java.lang.String r0 = "buyer"
            X.AnonymousClass39V.A03(r1, r0, r2)
        L_0x00dc:
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f6
            java.lang.String r1 = "country"
            java.lang.String r0 = r6.A0G
            X.AnonymousClass39V.A03(r1, r0, r2)
            int r0 = r6.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "version"
            X.AnonymousClass39V.A03(r0, r1, r2)
        L_0x00f6:
            X.9U4 r1 = r5.A06
            java.lang.String r0 = r6.A0G
            X.9SU r1 = r1.A0F(r0)
            if (r1 == 0) goto L_0x005c
            java.lang.String r0 = r6.A0I
            X.9oC r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x005c
            X.9nV r1 = r0.B6C()
            if (r1 == 0) goto L_0x005c
            boolean r0 = r1.BJ6()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r6.A0H
            X.39V r0 = r1.B3k(r0)
            if (r0 == 0) goto L_0x005c
            goto L_0x0059
        L_0x011e:
            java.lang.String r1 = "p2p"
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197119cb.BAf(X.34w, X.2z0):java.util.List");
    }

    public Intent BDq(Context context, String str) {
        return null;
    }

    public boolean AyU() {
        return true;
    }

    public /* synthetic */ String B6g() {
        return null;
    }

    public String BAm() {
        return null;
    }

    public C133746hs BG5() {
        return null;
    }

    public String getName() {
        return this.A08;
    }

    public int B6K(String str) {
        return 1000;
    }

    public String BDT(String str) {
        return null;
    }
}
