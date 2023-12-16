package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.33p  reason: invalid class name */
public class AnonymousClass33p {
    public static final String A05;
    public final C380625j A00;
    public final C183538qC A01;
    public final Object A02 = AnonymousClass002.A0D();
    public final Object A03 = AnonymousClass002.A0D();
    public final Object A04 = AnonymousClass002.A0D();

    public int A05() {
        try {
            return Integer.parseInt(AnonymousClass0x2.A0F(this).getString("interface_gdrive_backup_frequency", String.valueOf(0)));
        } catch (NumberFormatException e) {
            Log.e("wa-shared-preferences/get-backup-freq", e);
            return 0;
        }
    }

    public int A06() {
        try {
            return Integer.parseInt(AnonymousClass0x2.A0F(this).getString("interface_gdrive_backup_network_setting", String.valueOf(0)));
        } catch (NumberFormatException e) {
            Log.w("wa-shared-preferences/get-backup-network-settings", e);
            return 0;
        }
    }

    public int A08() {
        try {
            return Integer.parseInt(AnonymousClass0x2.A0F(this).getString("gdrive_media_restore_network_setting", String.valueOf(0)));
        } catch (NumberFormatException e) {
            Log.e("wa-shared-preferences/get-media-restore-network-setting", e);
            return 0;
        }
    }

    public int A0B() {
        return AnonymousClass0x2.A0F(this).getInt("connection_sequence_state", 0);
    }

    public void A0v() {
        C18270x1.A0l(C18270x1.A03(this), "bg_gpb", false);
    }

    public void A0w() {
        C18270x1.A0l(C18270x1.A03(this), "backup_warning_shown", true);
    }

    public void A0x() {
        C18270x1.A0j(C18270x1.A03(this), "gdrive_media_restore_network_setting", String.valueOf(1));
    }

    public void A0z() {
        C18270x1.A0l(C18270x1.A03(this), "show_statuses_education", false);
    }

    public long A0I() {
        return AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(this), "gdrive_backup_start_timestamp");
    }

    public long A0L() {
        return AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(this), "gdrive_restore_start_timestamp");
    }

    public long A0M() {
        return AnonymousClass0x2.A0F(this).getLong("gdrive_next_prompt_for_setup_timestamp", -1);
    }

    public long A0N() {
        long currentTimeMillis = System.currentTimeMillis();
        C18260x0.A0M(this, "gdrive_backup_start_timestamp", currentTimeMillis);
        return currentTimeMillis;
    }

    public long A0O(C95814uZ r6) {
        if (r6 != null) {
            return AnonymousClass0x2.A0F(this).getLong(C18260x0.A03(r6, "show_expired_group_dialog", AnonymousClass001.A0o()), 0);
        }
        return 0;
    }

    public long A0R(String str) {
        if (str != null) {
            return AnonymousClass0x2.A0F(this).getLong(AnonymousClass000.A0V("gdrive_last_successful_backup_timestamp:", str, AnonymousClass001.A0o()), 0);
        }
        Log.w("wa-shared-preferences/get-backup-timestamp accountName passed is null.");
        return 0;
    }

    public Pair A0V() {
        C183538qC r4 = this.A01;
        int i = C18300x5.A0B(r4).getInt("gdrive_activity_state", -1);
        return C18290x4.A0K(Integer.valueOf(i), C18300x5.A0B(r4).getInt("gdrive_activity_msgstore_init_key", -1));
    }

    public Integer A0W() {
        int i;
        C183538qC r3 = this.A01;
        if (C18300x5.A0B(r3).getBoolean("need_to_get_groups", false)) {
            i = 3;
        } else if (!C18300x5.A0B(r3).contains("get_groups_params")) {
            return null;
        } else {
            i = C18300x5.A0B(r3).getInt("get_groups_params", 0);
        }
        return Integer.valueOf(i);
    }

    public void A0y() {
        A1Y("gdrive_restore_start_timestamp");
    }

    public void A1K(C95814uZ r4, long j) {
        if (r4 != null) {
            C18270x1.A0i(C18270x1.A03(this), C18260x0.A03(r4, "show_expired_group_dialog", AnonymousClass001.A0o()), j);
        }
    }

    public void A1b(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-media-size account name is null");
            return;
        }
        SharedPreferences.Editor A032 = C18270x1.A03(this);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive_last_successful_backup_media_size:");
        C18270x1.A0k(A032, str, A0o, j);
    }

    public void A1c(String str, long j) {
        if (str == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("wa-shared-preferences/set-backup-timestamp last successful backup timestamp is set to ");
            A0o.append(j);
            C18260x0.A1K(A0o, " but accountName associated is null, ignoring.");
            return;
        }
        SharedPreferences.Editor A032 = C18270x1.A03(this);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("gdrive_last_successful_backup_timestamp:");
        C18270x1.A0k(A032, str, A0o2, j);
    }

    public void A1d(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-total-backup-size account name is null");
            return;
        }
        SharedPreferences.Editor A032 = C18270x1.A03(this);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive_last_successful_backup_total_size:");
        C18270x1.A0k(A032, str, A0o, j);
    }

    public void A1e(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-video-size account name is null");
            return;
        }
        SharedPreferences.Editor A032 = C18270x1.A03(this);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive_last_successful_backup_video_size:");
        C18270x1.A0k(A032, str, A0o, j);
    }

    public void A1l(String str, boolean z) {
        if (str == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("wa-shared-preferences/set-encrypted is set to ");
            A0o.append(z);
            C18260x0.A1K(A0o, " but accountName associated is null, ignoring.");
            return;
        }
        C18270x1.A0l(C18270x1.A03(this), AnonymousClass000.A0V("gdrive_last_successful_backup_encrypted:", str, AnonymousClass001.A0o()), z);
    }

    public boolean A2J() {
        boolean z;
        synchronized (this.A02) {
            z = AnonymousClass0x2.A0F(this).getBoolean("need_to_get_pre_key_digest", true);
        }
        return z;
    }

    public boolean A2K() {
        boolean A1W;
        synchronized (this.A03) {
            A1W = C18280x3.A1W(AnonymousClass0x2.A0F(this), "signal_protocol_store_is_new");
        }
        return A1W;
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C58152un.A0A);
        A05 = AnonymousClass000.A0X("_light", A0o);
    }

    public AnonymousClass33p(C380625j r2, C60152y5 r3) {
        this.A00 = r2;
        this.A01 = C72333dY.A05(r3, 13);
    }

    public static List A00() {
        ArrayList A0s = AnonymousClass001.A0s();
        Integer A0f = AnonymousClass001.A0f();
        AnonymousClass0x2.A1G("security_notifications", A0f, A0s);
        AnonymousClass0x2.A1G("input_enter_send", A0f, A0s);
        Integer A0S = C18280x3.A0S();
        AnonymousClass0x2.A1G("interface_font_size", A0S, A0s);
        AnonymousClass0x2.A1G("settings_language", A0S, A0s);
        AnonymousClass0x2.A1G("conversation_sound", A0f, A0s);
        Integer A0Z = C18290x4.A0Z();
        AnonymousClass0x2.A1G("autodownload_wifi_mask", A0Z, A0s);
        AnonymousClass0x2.A1G("autodownload_cellular_mask", A0Z, A0s);
        AnonymousClass0x2.A1G("autodownload_roaming_mask", A0Z, A0s);
        AnonymousClass0x2.A1G("voip_low_data_usage", A0f, A0s);
        AnonymousClass0x2.A1G("gdrive_backup_filters", C18290x4.A0a(), A0s);
        AnonymousClass0x2.A1G("lock_folder_hidden", A0f, A0s);
        AnonymousClass0x2.A1G("does_user_have_passcode", A0f, A0s);
        return A0s;
    }

    public int A01() {
        return C18310x6.A03(AnonymousClass0x2.A0F(this), "autoconf_type");
    }

    public int A02() {
        return C18280x3.A02(AnonymousClass0x2.A0F(this), "bg_gpb_count");
    }

    public int A03() {
        return C18280x3.A02(AnonymousClass0x2.A0F(this), "connection_sequence_attempts");
    }

    public int A04() {
        return C18310x6.A03(AnonymousClass0x2.A0F(this), "pref_flash_call_education_link_clicked");
    }

    public int A07() {
        return AnonymousClass0x2.A0F(this).getInt("gdrive_error_code", 10);
    }

    public int A09() {
        return C18280x3.A02(AnonymousClass0x2.A0F(this), "gdrive_setup_user_prompted_count");
    }

    public int A0A() {
        return C18280x3.A02(AnonymousClass0x2.A0F(this), "gdrive_state");
    }

    public int A0C() {
        return C18280x3.A02(AnonymousClass0x2.A0F(this), "number_of_inactive_accounts");
    }

    public int A0D() {
        return C18280x3.A02(AnonymousClass0x2.A0F(this), "encrypted_backup_num_attempts_remaining");
    }

    public int A0E() {
        return C18280x3.A02(AnonymousClass0x2.A0F(this), "gdrive_successive_backup_failed_count");
    }

    public int A0F() {
        int i = AnonymousClass0x2.A0F(this).getInt("reg_attempts_generate_code", 0) + 1;
        C18260x0.A0L(this, "reg_attempts_generate_code", i);
        return i;
    }

    public int A0G(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return AnonymousClass0x2.A0F(this).getInt(AnonymousClass000.A0V("gdrive_old_media_encryption_status:", str, AnonymousClass001.A0o()), 0);
    }

    public long A0H() {
        return AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this), "gdrive_approx_media_download_size");
    }

    public long A0J() {
        return AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this), "gdrive_already_downloaded_bytes");
    }

    public long A0K() {
        return AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this), "gdrive_already_uploaded_bytes");
    }

    public long A0P(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return AnonymousClass0x2.A0F(this).getLong(AnonymousClass000.A0V("gdrive_old_media_encryption_start_time:", str, AnonymousClass001.A0o()), 0);
    }

    public long A0Q(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return AnonymousClass0x2.A0F(this).getLong(AnonymousClass000.A0V("gdrive_last_successful_backup_media_size:", str, AnonymousClass001.A0o()), -1);
    }

    public long A0S(String str) {
        return AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(this), AnonymousClass000.A0V("gdrive_last_successful_backup_total_size:", str, AnonymousClass001.A0o()));
    }

    public long A0T(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return AnonymousClass0x2.A0F(this).getLong(AnonymousClass000.A0V("gdrive_last_successful_backup_video_size:", str, AnonymousClass001.A0o()), -1);
    }

    public final SharedPreferences.Editor A0U() {
        return C18270x1.A03(this);
    }

    public String A0X() {
        return C18280x3.A0Z(AnonymousClass0x2.A0F(this), "gdrive_account_name");
    }

    public String A0Y() {
        String string = AnonymousClass0x2.A0F(this).getString("perf_device_id", (String) null);
        if (string != null) {
            return string;
        }
        String A0Y = C18280x3.A0Y();
        C18270x1.A0j(C18270x1.A03(this), "perf_device_id", A0Y);
        return A0Y;
    }

    public String A0Z() {
        return AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(this), "cc");
    }

    public String A0a() {
        return C18280x3.A0Z(AnonymousClass0x2.A0F(this), "registration_jid");
    }

    public String A0b() {
        return AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(this), "ph");
    }

    public String A0c(String str) {
        return C18280x3.A0Z(AnonymousClass0x2.A0F(this), AnonymousClass000.A0V("dc_user_postcode_", str, AnonymousClass001.A0o()));
    }

    public Map A0d() {
        Set<String> set;
        List<AnonymousClass0PJ> A002 = A00();
        A002.add(AnonymousClass0x9.A0G("smb_priority_inbox_label_id", C18290x4.A0b()));
        A002.add(AnonymousClass0x9.A0G("smb_priority_inbox_label_switch", AnonymousClass001.A0f()));
        HashMap A0t = AnonymousClass001.A0t();
        for (AnonymousClass0PJ r0 : A002) {
            Object obj = r0.A00;
            C626936e.A06(obj);
            String str = (String) obj;
            Object obj2 = r0.A01;
            C626936e.A06(obj2);
            int A0K = AnonymousClass001.A0K(obj2);
            C183538qC r4 = this.A01;
            if (C18300x5.A0B(r4).contains(str)) {
                if (A0K == 0) {
                    set = Integer.valueOf(C18300x5.A0B(r4).getInt(str, 0));
                } else if (A0K == 1) {
                    set = Boolean.valueOf(C18300x5.A0B(r4).getBoolean(str, false));
                } else if (A0K == 2) {
                    Object A0Z = C18280x3.A0Z(C18300x5.A0B(r4), str);
                    set = A0Z;
                    if (A0Z == null) {
                    }
                } else if (A0K == 3) {
                    Set<String> stringSet = C18300x5.A0B(r4).getStringSet(str, AnonymousClass002.A0K());
                    if (stringSet != null) {
                        boolean isEmpty = stringSet.isEmpty();
                        set = stringSet;
                        if (isEmpty) {
                        }
                    }
                } else if (A0K == 4) {
                    set = Long.valueOf(AnonymousClass0x2.A0B(C18300x5.A0B(r4), str));
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Unexpected key type: ");
                    A0o.append(str);
                    throw AnonymousClass001.A0e(AnonymousClass000.A0Y(" ", A0o, A0K));
                }
                A0t.put(str, set);
            }
        }
        return A0t;
    }

    public void A0e() {
        C18270x1.A0g(C18270x1.A03(this).remove("gdrive_backup_start_timestamp").remove("gdrive_already_uploaded_bytes"), "gdrive_user_initiated_backup");
    }

    public void A0f() {
        C18270x1.A0g(C18270x1.A03(this).remove("gdrive_already_downloaded_bytes").remove("gdrive_restore_overwrite_local_files").remove("gdrive_restore_start_timestamp").remove("gdrive_media_restore_network_setting"), "gdrive_approx_media_download_size");
    }

    public void A0g() {
        Log.i("wa-shared-preferences/cleangcmregsettings");
        C18270x1.A0g(C18270x1.A03(this).remove("c2dm_reg_id").remove("c2dm_app_vers"), "saved_gcm_token_server_unreg");
    }

    public void A0h() {
        C18270x1.A0g(C18270x1.A03(this), "connection_sequence_state");
    }

    public void A0i() {
        Log.i("washaredpreferences/clearPreChatdAbHash");
        C18270x1.A0g(C18270x1.A03(this), "pref_pre_chatd_ab_hash");
    }

    public void A0j() {
        C18270x1.A0g(C18270x1.A03(this).remove("pref_fail_too_many").remove("pref_no_route_sms").remove("pref_no_route_voice").remove("pref_fail_too_many_attempts"), "pref_fail_too_many_guesses");
    }

    public void A0k() {
        C18270x1.A0g(C18270x1.A03(this), "pref_wfs_blob");
        C18270x1.A0g(C18270x1.A03(this), "pref_wfs_user");
        C18270x1.A0g(C18270x1.A03(this), "pref_wfs_pw");
        C18270x1.A0g(C18270x1.A03(this), "pref_wfs_id_sign");
        C18270x1.A0g(C18270x1.A03(this), "pref_wfs_name");
        C18270x1.A0g(C18270x1.A03(this), "pref_wfs_source");
    }

    public void A0l() {
        C18270x1.A0h(C18270x1.A03(this), "bg_gpb_count", A02() + 1);
    }

    public void A0m() {
        Log.i("wa-shared-prefs/increment-gdrive-prompt-shown-count");
        int A09 = A09();
        if (A09 < 0) {
            A09 = 0;
        }
        int i = A09 + 1;
        C18270x1.A0h(C18270x1.A03(this), "gdrive_setup_user_prompted_count", i);
        C18260x0.A0y("wa-shared-prefs/increment-gdriveprompt-shown-count/new-count/", AnonymousClass001.A0o(), i);
    }

    public void A0n() {
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(this), "connection_lc");
        if (A022 == Integer.MAX_VALUE) {
            A022 = -1;
        }
        C18270x1.A0h(C18270x1.A03(this), "connection_lc", A022 + 1);
    }

    public void A0o() {
        int i = AnonymousClass0x2.A0F(this).getInt("gdrive_successive_backup_failed_count", 0) + 1;
        C18260x0.A0y("wa-shared-preferences/increment-backup-failed-count/updated-count/", AnonymousClass001.A0o(), i);
        C18260x0.A0L(this, "gdrive_successive_backup_failed_count", i);
    }

    public void A0p() {
        C18270x1.A0g(C18270x1.A03(this).remove("gdrive_activity_state"), "gdrive_activity_msgstore_init_key");
    }

    public void A0q() {
        C18270x1.A0g(C18270x1.A03(this).remove("message_store_verified_time").remove("eula_accepted_time").remove("registration_retry_fetching_biz_profile").remove("registration_attempt_skip_with_no_vertical").remove("registration_sibling_app_phone_number").remove("registration_sibling_app_country_code").remove("registration_sibling_app_min_storage_needed").remove("sister_app_content_provider_is_enabled").remove("direct_migration_start_time").remove("direct_db_migration_timeout_in_secs").remove("migrate_from_consumer_app_directly").remove("direct_migration_session_id").remove("google_migrate_import_start_time").remove("registration_use_sms_retriever").remove("reg_backup_status_key").remove("reg_profile_pic_source_key").remove("reg_profile_pic_tapped_key").remove("email_address").remove("registration_code").remove("registration_code_request_method").remove("pref_autoconf_secure_verifier").remove("mbs_migration_phone_number").remove("mbs_migration_countery_code").remove("mbs_migration_session_id"), "is_latam_tos_shown_during_reg");
    }

    public void A0r() {
        C18270x1.A0g(C18270x1.A03(this).remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry"), "registration_wipe_server_time");
        C18260x0.A0K(this, "registration_wipe_info_timestamp");
    }

    public void A0s() {
        C18270x1.A0g(C18270x1.A03(this).remove("business_activity_report_expiration_timestamp").remove("business_activity_report_size").remove("business_activity_report_name").remove("business_activity_report_url").remove("business_activity_report_direct_url").remove("business_activity_report_media_key").remove("business_activity_report_file_sha").remove("business_activity_report_file_enc_sha").remove("business_activity_report_timestamp"), "business_activity_report_state");
    }

    public void A0t() {
        Log.i("wa-shared-prefs/reset-gdrive-prompt-shown-count");
        C18270x1.A0g(C18270x1.A03(this), "gdrive_setup_user_prompted_count");
    }

    public void A0u() {
        C18270x1.A0h(C18270x1.A03(this), "gdrive_successive_backup_failed_count", 0);
    }

    public void A10() {
        C18270x1.A0h(C18270x1.A03(this), "video_transcode_compliance_v5", Build.VERSION.SDK_INT);
    }

    public void A11(int i) {
        C18260x0.A0y("wa-shared-preferences/set-backup-restore-state/", AnonymousClass001.A0o(), i);
        C18270x1.A0h(C18270x1.A03(this), "backup_restore_state", i);
    }

    public void A12(int i) {
        C18270x1.A0h(C18270x1.A03(this), "connection_sequence_attempts", i);
    }

    public void A13(int i) {
        C18270x1.A03(this).putInt("external_dir_migration_stage", i).commit();
    }

    public void A14(int i) {
        C18270x1.A0j(C18270x1.A03(this), "interface_gdrive_backup_network_setting", String.valueOf(i));
    }

    public void A15(int i) {
        C18270x1.A0h(C18270x1.A03(this), "gdrive_error_code", i);
    }

    public void A16(int i) {
        C18260x0.A0y("wa-shared-preferences/getgroupsparams ", AnonymousClass001.A0o(), i);
        C18270x1.A0h(C18270x1.A03(this).remove("need_to_get_groups"), "get_groups_params", i);
    }

    public void A17(int i) {
        C18260x0.A0y("wa-shared-preferences/set-gdrive-state/", AnonymousClass001.A0o(), i);
        C18270x1.A0h(C18270x1.A03(this), "gdrive_state", i);
    }

    public void A18(int i) {
        C18270x1.A0h(C18270x1.A03(this), "connection_sequence_state", i);
    }

    public void A19(int i) {
        C18260x0.A0w("wa-shared-prefs/setlogincountwithmsgs ", AnonymousClass001.A0o(), i);
        C18270x1.A0h(C18270x1.A03(this), "logins_with_messages", i);
    }

    public void A1A(int i) {
        C18260x0.A0y("wa-shared-prefs/setNumberOfInactiveAccounts/", AnonymousClass001.A0o(), i);
        C18270x1.A0h(C18270x1.A03(this), "number_of_inactive_accounts", i);
    }

    public void A1B(int i) {
        C18270x1.A0h(C18270x1.A03(this), "encrypted_backup_fleet_migration_state", i);
    }

    public void A1C(int i) {
        C18270x1.A0h(C18270x1.A03(this), "encrypted_backup_num_attempts_remaining", i);
    }

    public void A1D(int i, Integer num) {
        SharedPreferences.Editor A032 = C18270x1.A03(this);
        A032.putInt("gdrive_activity_state", i);
        if (num != null) {
            A032.putInt("gdrive_activity_msgstore_init_key", num.intValue());
        } else {
            A032.remove("gdrive_activity_msgstore_init_key");
        }
        A032.apply();
    }

    public void A1E(long j) {
        C18270x1.A0i(C18270x1.A03(this), "gdrive_approx_media_download_size", j);
        C18260x0.A12("washaredpreferences/save-gdrive-media-download-transfer-size/", AnonymousClass001.A0o(), j);
    }

    public void A1F(long j) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wa-shared-prefs/save-gdrive-user-prompt-again-timestamp/");
        A0o.append(j);
        AnonymousClass001.A1L(A0o);
        SimpleDateFormat A0u = AnonymousClass0x7.A0u("yyyy-MM-dd");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        C18260x0.A1L(A0o, A0u.format(instance.getTime()));
        C18260x0.A0M(this, "gdrive_next_prompt_for_setup_timestamp", j);
    }

    public void A1G(long j) {
        C18270x1.A0i(C18270x1.A03(this), "gdrive_already_downloaded_bytes", j);
    }

    public void A1H(long j) {
        C18270x1.A0i(C18270x1.A03(this), "gdrive_already_uploaded_bytes", j);
    }

    public void A1I(long j) {
        C18270x1.A0i(C18270x1.A03(this), "last_login_time", j);
    }

    public void A1J(C95814uZ r4) {
        C18270x1.A0g(C18270x1.A03(this), C18260x0.A03(r4, "show_expired_group_dialog", AnonymousClass001.A0o()));
    }

    public void A1L(String str) {
        C18260x0.A0G(C18270x1.A03(this), "smb_business_direct_connection_enc_string_", str, AnonymousClass001.A0o());
    }

    public void A1M(String str) {
        C18260x0.A0G(C18270x1.A03(this), "smb_business_direct_connection_enc_string_expired_timestamp_", str, AnonymousClass001.A0o());
    }

    public void A1N(String str) {
        C18260x0.A0G(C18270x1.A03(this), "smb_business_direct_connection_public_key_", str, AnonymousClass001.A0o());
    }

    public void A1O(String str) {
        C18260x0.A0G(C18270x1.A03(this), "galaxy_biz_public_key_", str, AnonymousClass001.A0o());
    }

    public void A1P(String str) {
        C18260x0.A0G(C18270x1.A03(this).remove(AnonymousClass000.A0V("gdrive_last_successful_backup_timestamp:", str, AnonymousClass001.A0o())).remove(AnonymousClass000.A0V("gdrive_last_successful_backup_total_size:", str, AnonymousClass001.A0o())).remove(AnonymousClass000.A0V("gdrive_last_successful_backup_media_size:", str, AnonymousClass001.A0o())).remove(AnonymousClass000.A0V("gdrive_last_successful_backup_video_size:", str, AnonymousClass001.A0o())), "gdrive_last_successful_backup_encrypted:", str, AnonymousClass001.A0o());
    }

    public void A1Q(String str) {
        C18270x1.A0j(C18270x1.A03(this), "pref_captcha_status", str);
    }

    public void A1R(String str) {
        C18270x1.A0j(C18270x1.A03(this), "pref_email_otp_status", str);
    }

    public void A1S(String str) {
        C18270x1.A0j(C18270x1.A03(this), "gdrive_account_name", str);
    }

    public void A1T(String str) {
        SharedPreferences.Editor putString;
        if (TextUtils.isEmpty(str)) {
            putString = C18300x5.A09(this, "last_datacenter");
        } else {
            putString = C18270x1.A03(this).putString("last_datacenter", str);
        }
        putString.apply();
    }

    public void A1U(String str) {
        C18270x1.A0j(C18270x1.A03(this), "registration_code", str);
    }

    public void A1V(String str) {
        C18270x1.A0g(C18270x1.A03(this).putString("registration_jid", str).remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry"), "registration_wipe_server_time");
        C18260x0.A0K(this, "registration_wipe_info_timestamp");
    }

    public void A1W(String str) {
        C18270x1.A0j(C18270x1.A03(this), "settings_verification_email_address", str);
    }

    public void A1X(String str) {
        C18270x1.A0j(C18270x1.A03(this), "pref_silent_auth_status", str);
    }

    public void A1Y(String str) {
        C18260x0.A0M(this, str, System.currentTimeMillis());
    }

    public void A1Z(String str) {
        C18270x1.A0j(C18270x1.A03(this), "pref_wa_old_status", str);
    }

    public void A1a(String str, int i) {
        C18270x1.A0h(C18270x1.A03(this), AnonymousClass000.A0V("gdrive_old_media_encryption_status:", str, AnonymousClass001.A0o()), i);
        if (i == 1) {
            C18270x1.A0i(C18270x1.A03(this), AnonymousClass000.A0V("gdrive_old_media_encryption_start_time:", str, AnonymousClass001.A0o()), System.currentTimeMillis());
        }
    }

    public void A1g(String str, String str2) {
        C18260x0.A0F(C18270x1.A03(this), "dc_default_postcode_", str, str2, AnonymousClass001.A0o());
    }

    public void A1h(String str, String str2) {
        SharedPreferences.Editor A032 = C18270x1.A03(this);
        if (str == null) {
            A032.remove("my_current_status");
        } else {
            A032.putString("my_current_status", str);
            if (!TextUtils.isEmpty(str2)) {
                A032.putString("my_current_status_hash", str2);
                A032.apply();
            }
        }
        A032.remove("my_current_status_hash");
        A032.apply();
    }

    public void A1i(String str, String str2) {
        C18260x0.A0F(C18270x1.A03(this), "downloadable_category_local_info_json_", str, str2, AnonymousClass001.A0o());
    }

    public void A1j(String str, String str2) {
        C18270x1.A0j(C18270x1.A03(this).putString("cc", str), "ph", str2);
    }

    public void A1k(String str, String str2, long j, long j2, long j3, long j4) {
        C18270x1.A0i(C18270x1.A03(this).putString("registration_wipe_type", str).putString("registration_wipe_token", str2).putLong("registration_wipe_wait", j).putLong("registration_wipe_expiry", j2), "registration_wipe_server_time", j3);
        C18260x0.A0M(this, "registration_wipe_info_timestamp", j4);
    }

    public void A1m(JSONObject jSONObject) {
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        SharedPreferences.Editor A032 = C18270x1.A03(this);
        List<AnonymousClass0PJ> A002 = A00();
        A002.add(AnonymousClass0x9.A0G("smb_priority_inbox_label_id", C18290x4.A0b()));
        A002.add(AnonymousClass0x9.A0G("smb_priority_inbox_label_switch", AnonymousClass001.A0f()));
        for (AnonymousClass0PJ r0 : A002) {
            Object obj = r0.A00;
            C626936e.A06(obj);
            String str2 = (String) obj;
            Object obj2 = r0.A01;
            C626936e.A06(obj2);
            int A0K = AnonymousClass001.A0K(obj2);
            if (jSONObject.has(str2)) {
                if (A0K == 0) {
                    try {
                        A032.putInt(str2, jSONObject.getInt(str2));
                    } catch (JSONException e) {
                        e = e;
                        sb = AnonymousClass001.A0o();
                        AnonymousClass001.A1K("wa-shared-preferences/set-local-settings/error-while-inserting ", str2, ":", sb);
                        sb.append(AnonymousClass0x2.A0F(this).getInt(str2, 0));
                    }
                } else if (A0K == 1) {
                    try {
                        A032.putBoolean(str2, jSONObject.getBoolean(str2));
                    } catch (JSONException e2) {
                        e = e2;
                        sb = AnonymousClass001.A0o();
                        AnonymousClass001.A1K("wa-shared-preferences/set-local-settings/error-while-inserting ", str2, ":", sb);
                        sb.append(AnonymousClass0x2.A0F(this).getBoolean(str2, false));
                    }
                } else if (A0K == 2) {
                    try {
                        A032.putString(str2, jSONObject.getString(str2));
                    } catch (JSONException e3) {
                        e = e3;
                        sb2 = AnonymousClass001.A0o();
                        AnonymousClass001.A1K("wa-shared-preferences/set-local-settings/error-while-inserting ", str2, ":", sb2);
                        sb2.append(AnonymousClass0x2.A0F(this).getString(str2, (String) null));
                    }
                } else if (A0K == 3) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray(str2);
                        HashSet hashSet = new HashSet(jSONArray.length());
                        for (int i = 0; i < jSONArray.length(); i++) {
                            hashSet.add(jSONArray.get(i));
                        }
                        A032.putStringSet(str2, hashSet);
                    } catch (JSONException e4) {
                        e = e4;
                        sb2 = AnonymousClass001.A0o();
                        AnonymousClass001.A1K("wa-shared-preferences/set-local-settings/error-while-inserting ", str2, ":", sb2);
                        sb2.append(AnonymousClass0x2.A0F(this).getStringSet(str2, (Set) null));
                        str = sb2.toString();
                        Log.e(str, e);
                    }
                } else if (A0K == 4) {
                    try {
                        A032.putLong(str2, jSONObject.getLong(str2));
                    } catch (JSONException e5) {
                        e = e5;
                        sb2 = AnonymousClass001.A0o();
                        AnonymousClass001.A1K("wa-shared-preferences/set-local-settings/error-while-inserting ", str2, ":", sb2);
                        sb2.append(AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(this), str2));
                    }
                }
            }
        }
        A032.apply();
        return;
        str = sb.toString();
        Log.e(str, e);
    }

    public void A1n(boolean z) {
        SharedPreferences.Editor remove = C18270x1.A03(this).remove("external_dir_migration_attempt_n").remove("ext_dir_migration_rescan_time").remove("ext_dir_migration_move_time").remove("ext_dir_migration_start_time");
        if (!z) {
            remove.remove("external_dir_migration_stage");
        }
        remove.commit();
    }

    public void A1o(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "future_proof_processing_needed", z);
    }

    public void A1p(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "gdrive_user_initiated_backup", z);
    }

    public void A1q(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "gdrive_restore_overwrite_local_files", z);
    }

    public void A1r(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "gdrive_include_videos_in_backup", z);
    }

    public void A1s(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "net_new_jid", z);
    }

    public void A1t(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "new_jid", z);
    }

    public void A1u(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "encrypted_backup_enabled", z);
    }

    public void A1v(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "encrypted_backup_using_encryption_key", z);
    }

    public void A1w(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "encrypted_backup_show_forced_reg_after_logout", z);
    }

    public void A1x(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "gdrive_last_restore_file_is_encrypted", z);
    }

    public void A1y(boolean z) {
        C18270x1.A0l(C18270x1.A03(this), "settings_verification_email_address_verified", z);
    }

    public void A1z(boolean z) {
        C18260x0.A1E("wa-shared-prefs/setshouldgetprekeydigest/", AnonymousClass001.A0o(), z);
        synchronized (this.A02) {
            C18270x1.A0l(C18270x1.A03(this), "need_to_get_pre_key_digest", z);
        }
    }

    public void A20(boolean z) {
        SharedPreferences.Editor A032 = C18270x1.A03(this);
        if (z) {
            A032.putBoolean("show_post_reg_logged_out_dialog", true);
        } else {
            A032.remove("show_post_reg_logged_out_dialog");
        }
        A032.apply();
    }

    public void A21(boolean z) {
        C18260x0.A1E("wa-shared-prefs/setsignalprotocolstoreisnew/", AnonymousClass001.A0o(), z);
        synchronized (this.A03) {
            C18270x1.A0l(C18270x1.A03(this), "signal_protocol_store_is_new", z);
        }
    }

    public void A22(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C18270x1.A0l(C18270x1.A03(this).putBoolean("pref_fail_too_many", z).putBoolean("pref_no_route_sms", z2).putBoolean("pref_no_route_voice", z3).putBoolean("pref_fail_too_many_attempts", z4), "pref_fail_too_many_guesses", z5);
    }

    public void A23(byte[] bArr) {
        C18270x1.A0j(C18270x1.A03(this), "token_used_during_reg", C18320x8.A0i(bArr));
    }

    public boolean A24() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "mock_acs_reqeust");
    }

    public boolean A25() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "gdrive_restore_overwrite_local_files");
    }

    public boolean A26() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "gdrive_last_restore_file_is_encrypted");
    }

    public boolean A27() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "gdrive_include_videos_in_backup");
    }

    public boolean A28() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "archive_v2_enabled");
    }

    public boolean A29() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "backup_warning_shown");
    }

    public boolean A2A() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "chat_transfer_finished");
    }

    public boolean A2B() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "companion_reg_opt_in_enabled");
    }

    public boolean A2C() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "gdrive_user_initiated_backup");
    }

    public boolean A2D() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "new_jid");
    }

    public boolean A2E() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "encrypted_backup_enabled");
    }

    public boolean A2F() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this), "encrypted_backup_using_encryption_key");
    }

    public boolean A2G() {
        return AnonymousClass0x2.A0F(this).getBoolean("read_receipts_enabled", true);
    }

    public boolean A2H() {
        return AnonymousClass000.A1U(Build.VERSION.SDK_INT, C18310x6.A03(AnonymousClass0x2.A0F(this), "video_transcode_compliance_v5"));
    }

    public boolean A2I() {
        return AnonymousClass0x2.A0F(this).getBoolean("bg_gpb", true);
    }

    public boolean A2L(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            C18270x1.A0j(C18270x1.A03(this), "interface_gdrive_backup_frequency", String.valueOf(i));
            return true;
        }
        C18260x0.A0x("wa-shared-preferences/set-backup-freq/", AnonymousClass001.A0o(), i);
        return false;
    }

    public boolean A2M(String str) {
        return AnonymousClass0x2.A0F(this).contains(AnonymousClass000.A0V("gdrive_last_successful_backup_timestamp:", str, AnonymousClass001.A0o()));
    }

    public boolean A2N(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return AnonymousClass0x2.A0F(this).getBoolean(AnonymousClass000.A0V("gdrive_last_successful_backup_encrypted:", str, AnonymousClass001.A0o()), false);
    }

    public boolean A2O(String str) {
        boolean A1W = C18280x3.A1W(AnonymousClass0x2.A0F(this), str);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wa-shared-prefs/is-permission-requested ");
        A0o.append(str);
        C18260x0.A1D(" - ", A0o, A1W);
        return A1W;
    }

    public boolean A2P(String str, long j) {
        long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(this), str);
        if (A0A == -1 || System.currentTimeMillis() > A0A + j) {
            return true;
        }
        return false;
    }

    public boolean A2Q(String str, String str2) {
        SharedPreferences A0F = AnonymousClass0x2.A0F(this);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("dc_customer_sent_message_");
        A0o.append(str);
        return C18280x3.A1W(A0F, AnonymousClass0x2.A0e(str2, A0o, '_'));
    }

    public void A1f(String str, long j) {
        C18260x0.A0M(this, str, j);
    }
}
