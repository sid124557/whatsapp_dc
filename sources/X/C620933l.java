package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.33l  reason: invalid class name and case insensitive filesystem */
public class C620933l {
    public SharedPreferences A00;
    public final C56612sH A01;
    public final C160757oG A02 = C160757oG.A00("PaymentSharedPrefs", "infra", "COMMON");
    public final C60152y5 A03;

    public synchronized SharedPreferences A03() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A03("com.whatsapp_payment_preferences");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A0C() {
        C18270x1.A0l(A00(this), "pref_p2m_hybrid_tos_accepted", true);
    }

    public void A0D() {
        long A0H = this.A01.A0H();
        C18270x1.A0i(A00(this), "payment_account_recoverable_time_ms", A0H);
        this.A02.A06(AnonymousClass000.A0Z("setIsPaymentAccountRecoverableTimeMs to: ", AnonymousClass001.A0o(), A0H));
    }

    public void A0E() {
        long A0H = this.A01.A0H();
        C18270x1.A0i(A00(this), "payments_methods_last_sync_time", A0H);
        this.A02.A06(AnonymousClass000.A0Z("updateMethodsLastSyncTimeMilli to: ", AnonymousClass001.A0o(), A0H));
    }

    public void A0F(int i, long j) {
        String str;
        if (i == 0 || i == 1) {
            str = "payments_enabled_till";
        } else {
            str = "merchant_payments_enabled_till";
        }
        C18270x1.A0o(A03(), str, j);
    }

    public void A0H(String str) {
        SharedPreferences.Editor remove;
        String str2;
        boolean equals = "merchant_account_linking_context".equals(str);
        SharedPreferences.Editor A002 = A00(this);
        if (equals) {
            remove = A002.remove("payments_merchant_setup_completed_steps").remove("payment_smb_upsell_view_count").remove("business_payment_dyi_report_expiration_timestamp").remove("business_payment_dyi_report_timestamp");
            str2 = "business_payment_dyi_report_state";
        } else {
            remove = A002.remove("payments_setup_completed_steps").remove("payments_p2m_setup_completed_steps").remove("payments_methods_last_sync_time").remove("payments_card_can_receive_payment").remove("payments_all_transactions_last_sync_time").remove("payments_pending_transactions_last_sync_time").remove("payments_nagged_transactions").remove("payments_sent_payment_with_account").remove("payments_sandbox").remove("payments_invitee_jids").remove("payments_inviter_jids").remove("payments_enabled_till").remove("merchant_payments_enabled_till").remove("payments_support_phone_number").remove("payments_device_id").remove("payments_network_id_map").remove("payment_trusted_device_credential").remove("payment_trusted_device_credential_encrypted_aes").remove("payments_trusted_device_credential_network_map").remove("payment_kyc_info").remove("payment_step_up_info").remove("payment_dyi_report_expiration_timestamp").remove("payment_dyi_report_timestamp").remove("payment_dyi_report_state").remove("payments_invitee_jids_with_expiry").remove("payments_inviter_jids_with_expiry").remove("payment_usync_triggered").remove("payment_incentive_offer_details").remove("payment_incentive_user_claim_info").remove("payment_incentive_tooltip_viewed").remove("payments_last_two_factor_nudge_time").remove("payments_two_factor_nudge_count").remove("payments_upi_pin_primer_dialog_shown").remove("payment_trusted_device_elo_wallet_store").remove("payment_account_recovered").remove("payments_home_account_recovery_banner_dismissed").remove("payments_upi_transactions_sync_status").remove("payments_upi_last_transactions_sync_time").remove("payments_resume_onboarding_banner_started").remove("payment_account_recoverable").remove("payment_account_recoverable_time_ms").remove("is_payment_account_created").remove("has_p2mlite_account").remove("payments_home_scan_to_pay_banner_dismissed").remove("payments_home_recovery_2fa_upsell_banner_impression").remove("payments_home_recovery_upin_upsell_banner_impression").remove("payments_home_recovery_2fa_upsell_banner_display").remove("payments_home_recovery_upin_upsell_banner_display").remove("payments_home_recovery_2fa_upsell_banner_impression_update_timestamp").remove("payments_home_recovery_upin_upsell_banner_impression_update_timestamp").remove("pref_p2m_hybrid_tos_accepted").remove("pref_p2m_hybrid_v2_tos_accepted").remove("pref_p2m_hybrid_last_used_payment_option").remove("pref_br_onboarding_add_kyc_step_migration").remove("pref_payments_custom_payment_method_tos_completed_steps");
            str2 = "pref_income_verification_state";
        }
        C18270x1.A0g(remove, str2);
    }

    public C620933l(C56612sH r4, C60152y5 r5) {
        this.A01 = r4;
        this.A03 = r5;
    }

    public static SharedPreferences.Editor A00(C620933l r0) {
        return r0.A03().edit();
    }

    public static final String A01(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1060082597:
                if (str.equals("p2m_context")) {
                    return "payments_p2m_setup_completed_steps";
                }
                break;
            case -467703759:
                if (str.equals("custom_payment_method_linking")) {
                    return "pref_payments_custom_payment_method_tos_completed_steps";
                }
                break;
            case 610582159:
                if (str.equals("merchant_account_linking_context")) {
                    return "payments_merchant_setup_completed_steps";
                }
                break;
            case 1692409671:
                str2 = "generic_context";
                break;
            case 2107488606:
                str2 = "p2p_context";
                break;
        }
        if (str.equals(str2)) {
            return "payments_setup_completed_steps";
        }
        throw AnonymousClass001.A0c("Unsupported flow. See PaymentConstants.PaymentFlow for all supported flows");
    }

    public static final String A02(Map map) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A1G.put(AnonymousClass0x9.A0R(A0w).getRawString(), A0w.getValue());
            }
        } catch (JSONException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: PaymentSharedPrefs/getRawFromJidsWithExpiration/exception: ", e);
        }
        return A1G.toString();
    }

    public C165897xo A04() {
        String string = A03().getString("payment_step_up_info", (String) null);
        if (string != null) {
            return C154407d7.A01(string);
        }
        return null;
    }

    public Boolean A05() {
        if (A03().contains("payment_is_first_send")) {
            return Boolean.valueOf(C18280x3.A1W(A03(), "payment_is_first_send"));
        }
        return null;
    }

    public String A06() {
        return AnonymousClass0x9.A0v(A03(), "payments_setup_country_specific_info");
    }

    public String A07() {
        return AnonymousClass0x9.A0v(A03(), "payments_sent_payment_with_account");
    }

    public String A08() {
        JSONObject jSONObject;
        String string = A03().getString("payment_trusted_device_elo_wallet_store", (String) null);
        if (string != null) {
            try {
                jSONObject = AnonymousClass0x9.A1H(string);
            } catch (JSONException unused) {
                this.A02.A06("Failed to get the wallet_id");
                return null;
            }
        } else {
            jSONObject = AnonymousClass0x9.A1G();
        }
        return jSONObject.getString("wallet_id");
    }

    public final Map A09(String str) {
        HashMap A0t = AnonymousClass001.A0t();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                long A0H = this.A01.A0H();
                Iterator<String> keys = A1H.keys();
                while (keys.hasNext()) {
                    String A0m = AnonymousClass001.A0m(keys);
                    UserJid A08 = AnonymousClass32Y.A08(A0m);
                    long j = A1H.getLong(A0m);
                    if (A08 != null && j >= A0H) {
                        AnonymousClass0x2.A1J(A08, A0t, j);
                    }
                }
            } catch (JSONException e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: PaymentSharedPrefs/getJidsWithExpirationFromRaw/exception: ", e);
            }
        }
        return A0t;
    }

    public void A0A() {
        C18270x1.A0g(A00(this), "payment_step_up_info");
    }

    public void A0B() {
        C18270x1.A0f(A00(this), "payments_resume_onboarding_banner_started");
    }

    public void A0G(int i, String str) {
        String str2;
        SharedPreferences.Editor A002 = A00(this);
        if ("personal".equals(str)) {
            str2 = "payment_dyi_report_state";
        } else {
            str2 = "business_payment_dyi_report_state";
        }
        C18270x1.A0h(A002, str2, i);
    }

    public void A0I(String str) {
        SharedPreferences.Editor remove;
        String str2;
        SharedPreferences.Editor A002 = A00(this);
        if ("personal".equals(str)) {
            remove = A002.remove("payment_dyi_report_state").remove("payment_dyi_report_timestamp");
            str2 = "payment_dyi_report_expiration_timestamp";
        } else {
            remove = A002.remove("business_payment_dyi_report_state").remove("business_payment_dyi_report_timestamp");
            str2 = "business_payment_dyi_report_expiration_timestamp";
        }
        C18270x1.A0g(remove, str2);
    }

    public void A0J(String str) {
        C18270x1.A0j(A00(this), "payments_setup_country_specific_info", str);
    }

    public void A0K(String str) {
        C18270x1.A0j(A00(this), "payments_sent_payment_with_account", str);
    }

    public void A0L(String str) {
        C18270x1.A0j(A00(this), "pref_income_verification_state", str);
    }
}
