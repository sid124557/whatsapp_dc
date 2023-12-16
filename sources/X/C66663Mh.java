package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Mh  reason: invalid class name and case insensitive filesystem */
public class C66663Mh implements AnonymousClass4AE {
    public static C22071Ek A06 = A01(Integer.MIN_VALUE, 172800, "privatestats_token_first_delay_seconds", "privatestats_token_first_delay_seconds", 21600);
    public static C22071Ek A07 = A01(43200, Integer.MAX_VALUE, "privatestats_token_max_expiry_seconds", "privatestats_token_max_expiry_seconds", 86400);
    public static C22071Ek A08 = A01(1, 43200, "privatestats_token_prec_lead_seconds", "privatestats_token_prec_lead_seconds", 7200);
    public static C22071Ek A09 = A01(C18280x3.A0S(), Integer.MAX_VALUE, "privatestats_token_pre_redeem_count", "privatestats_token_pre_redeem_count", 388);
    public static final C22051Ei A0A = A00("abprops_encryption", "abprops_encryption", false);
    public static final C22051Ei A0B = A00("abprops_prefs_file_rollback_usage_enabled", "abprops_prefs_file_rollback_usage_enabled", false);
    public static final C22051Ei A0C = A00("abprops_rollback_enabled", "abprops_rollback_enabled", false);
    public static final C22051Ei A0D = A00("async_init_fts_migration", "async_init_fts_migration", false);
    public static final C22051Ei A0E = A00("async_init_md_migrations", "async_init_md_migrations", true);
    public static final C22051Ei A0F = A00("audio_data_for_notification", "audio_data_for_notification", true);
    public static final C22051Ei A0G = A00("bsp_system_message_enabled", "bsp_system_message_enabled", false);
    public static final C22051Ei A0H = A00("ctwa_first_business_reply_logging", "ctwa_first_business_reply_logging", false);
    public static final C22051Ei A0I = A00("enhanced_storage_mgmt_sort_fw_score", "enhanced_storage_mgmt_sort_fw_score", false);
    public static final C22051Ei A0J;
    public static final C22051Ei A0K = A00("fbns_disabled_for_secondary", "fbns_disabled_for_secondary", false);
    public static final C22051Ei A0L = A00("fbns_enabled", "fbns_enabled", false);
    public static final C22051Ei A0M = A00("force_long_connect", "force_long_connect", false);
    public static final C22051Ei A0N = A00("frequently_forwarded_group_setting", "frequently_forwarded_group_setting", false);
    public static final C22051Ei A0O = A00("gif_search_v2", "gif_search_v2", false);
    public static final C22051Ei A0P = A00("google_drive_enabled", "google_drive_enabled", true);
    public static final C22051Ei A0Q = A00("group_message_notification_use_jid_instead_of_from_me", "group_message_notification_use_jid_instead_of_from_me", true);
    public static final C22051Ei A0R = A00("grp_uii_cleanup", "grp_uii_cleanup", false);
    public static final C22051Ei A0S = A00("disable_hfm_autodownload", "disable_hfm_autodownload", false);
    public static final C22051Ei A0T = A00("linked_devices_re_auth_enabled", "linked_devices_re_auth_enabled", false);
    public static final C22051Ei A0U = A00("syncd_android_unsupported_mutation_enabled", "syncd_android_unsupported_mutation_enabled", false);
    public static final C22051Ei A0V = A00("syncd_clear_chat_delete_chat_enabled", "syncd_clear_chat_delete_chat_enabled", false);
    public static final C22051Ei A0W = A00("syncd_patch_device_index_included", "syncd_patch_device_index_included", false);
    public static final C22051Ei A0X = A00("md_pin_chat_enabled", "md_pin_chat_enabled", false);
    public static final C22051Ei A0Y = A00("md_voip_enabled", "md_voip_enabled", false);
    public static final C22051Ei A0Z = A00("mms_forward_uploading_media_enabled", "mms_forward_uploading_media_enabled", false);
    public static final C22051Ei A0a = A00("mms_vcache_aggregation_enabled", "mms_vcache_aggregation_enabled", false);
    public static final C22051Ei A0b = A00("p2m_pay", "p2m_pay", false);
    public static final C22051Ei A0c = A00("p2p_pay", "p2p_pay", false);
    public static final C22051Ei A0d = A00("payments_cs_email_disabled", "payments_cs_email_disabled", false);
    public static final C22051Ei A0e = A00("payments_deeplink_signup_enabled", "payments_deeplink_signup_enabled", false);
    public static final C22051Ei A0f = A00("payments_disable_switch_psp", "payments_disable_switch_psp", false);
    public static final C22051Ei A0g = A00("novi_p2p", "novi_p2p", false);
    public static final C22051Ei A0h = A00("payments_request_messages", "payments_request_messages", true);
    public static final C22051Ei A0i = A00("payments_upi_qr_signing", "payments_upi_qr_signing", false);
    public static final C22051Ei A0j = A00("payments_upi_settings_privacy_banner_enabled", "payments_upi_settings_privacy_banner_enabled", true);
    public static final C22051Ei A0k = A00("payments_upi_enable_sim_swap_detection", "payments_upi_enable_sim_swap_detection", false);
    public static final C22051Ei A0l = A00("payments_upi_view_in_inbox", "payments_upi_view_in_inbox", false);
    public static final C22051Ei A0m = A00("payment_history_fts_enabled", "payment_history_fts_enabled", false);
    public static final C22051Ei A0n = A00("portal_optimization_enabled", "p_opt", false);
    public static final C22051Ei A0o = A00("profilo_enabled", "profilo_enabled", false);
    public static final C22051Ei A0p = A00("qr_scanning", "qr_scanning", false);
    public static final C22051Ei A0q = A00("quick_message_search_enabled", "quick_message_search_enabled", false);
    public static final C22051Ei A0r = A00("receipt_processing_dedup", "receipt_processing_dedup", true);
    public static final C22051Ei A0s = A00("receipt_processing_thread", "receipt_processing_thread", false);
    public static final C22051Ei A0t = A00("reg_log_advertiser_id", "reg_log_advertiser_id", false);
    public static final C22051Ei A0u = A00("smb_upsell_chat_banner_enabled", "smb_upsell_chat_banner_enabled", false);
    public static final C22051Ei A0v = A00("stella_contact_ranking_enabled", "stella_contact_ranking_enabled", false);
    public static final C22051Ei A0w = A00("stella_interop_enabled", "stella_interop_enabled", false);
    public static final C22051Ei A0x = A00("track_battery_metrics", "track_battery_metrics", false);
    public static final C22051Ei A0y = A00("wa_msys_crypto", "wa_msys_crypto", true);
    public static final C22051Ei A0z = A00("wa_msys_fingerprint", "wa_msys_fingerprint", false);
    public static final C22041Eh A10;
    public static final C22071Ek A11 = A01((Integer) null, (Integer) null, "abprops_revert_bg_crash_count", "abprops_revert_bg_crash_count", 10);
    public static final C22071Ek A12 = A01((Integer) null, (Integer) null, "abprops_revert_fg_crash_count", "abprops_revert_fg_crash_count", 5);
    public static final C22071Ek A13 = A01((Integer) null, (Integer) null, "announcement_toggle_time_hours", "announcement_toggle_time_hours", 72);
    public static final C22071Ek A14 = A01((Integer) null, (Integer) null, "biz_block_reasons_version", "biz_block_reasons_version", 0);
    public static final C22071Ek A15 = A01(256, (Integer) null, "broadcast_list_size_limit", "max_list_recipients", 256);
    public static final C22071Ek A16 = A01((Integer) null, (Integer) null, "biz_profile_options", "biz_profile_options", 4);
    public static final C22071Ek A17 = A01((Integer) null, (Integer) null, "max_keys", "max_keys", 812);
    public static final C22071Ek A18 = A01((Integer) null, (Integer) null, "direct_db_migration_timeout_in_secs", "direct_db_migration_timeout_in_secs", 360);
    public static final C22071Ek A19 = A01((Integer) null, (Integer) null, "gif_provider", "gif_provider", -1);
    public static final C22071Ek A1A = A01((Integer) null, (Integer) null, "group_description_length", "group_description_length", 0);
    public static final C22071Ek A1B = A01((Integer) null, (Integer) null, "hq_image_bw_threshold", "hq_image_bw_threshold", 75);
    public static final C22071Ek A1C = A01((Integer) null, (Integer) null, "hq_image_max_edge", "hq_image_max_edge", 0);
    public static final C22071Ek A1D = A01((Integer) null, (Integer) null, "hq_image_quality", "hq_image_quality", 0);
    public static final C22071Ek A1E = A01((Integer) null, (Integer) null, "image_max_edge", "image_max_edge", 1600);
    public static final C22071Ek A1F = A01(Integer.valueOf(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH), (Integer) null, "image_max_kbytes", "image_max_kbytes", EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final C22071Ek A1G = A01((Integer) null, (Integer) null, "image_quality", "image_quality", 80);
    public static final C22071Ek A1H = A01((Integer) null, (Integer) null, "linked_device_max_count", "linked_device_max_count", 4);
    public static final C22071Ek A1I = A01((Integer) null, (Integer) null, "md_mhfs_days", "md_mhfs_days", 732);
    public static final C22071Ek A1J = A01((Integer) null, (Integer) null, "md_mhfs_limit", "md_mhfs_limit", 200);
    public static final C22071Ek A1K = A01(0, 100, "md_mhfs_start_progress", "md_mhfs_start_progress", 70);
    public static final C22071Ek A1L = A01((Integer) null, (Integer) null, "md_mhrs_days", "md_mhrs_days", 90);
    public static final C22071Ek A1M = A01(1, C18290x4.A0c(), "syncd_additional_mutations_for_key_catch_up", "syncd_additional_mutations_for_key_catch_up", 1);
    public static final C22071Ek A1N = A01(100, 5000, "syncd_critical_contacts_limit", "syncd_critical_contacts_limit", 1000);
    public static final C22071Ek A1O = A01(0, 7, "syncd_fatal_error_timeout_days", "syncd_fatal_error_timeout_days", 0);
    public static final C22071Ek A1P = A01(100, 2000, "syncd_inline_mutations_max_count", "syncd_inline_mutations_max_count", 100);
    public static final C22071Ek A1Q = A01(0, 43200, "syncd_keep_alive_mins", "syncd_keep_alive_mins", 1440);
    public static final C22071Ek A1R = A01(1, 90, "syncd_key_max_use_days", "syncd_key_max_use_days", 30);
    public static final C22071Ek A1S;
    public static final C22071Ek A1T = A01(10, 100, "syncd_patch_protobuf_max_size", "syncd_patch_protobuf_max_size", 10);
    public static final C22071Ek A1U = A01(0, 20, "syncd_sentinel_timeout_seconds", "syncd_sentinel_timeout_seconds", 3);
    public static final C22071Ek A1V;
    public static final C22071Ek A1W = A01(10, 300, "critical_payload_download_and_applied_timeout_secs", "critical_payload_download_and_applied_timeout_secs", 120);
    public static final C22071Ek A1X = A01(10, 300, "critical_payload_upload_timeout_secs", "critical_payload_upload_timeout_secs", 60);
    public static final C22071Ek A1Y = A01(0, (Integer) null, "media_limit_auto_download_mb", "media_max_autodownload", 32);
    public static final C22071Ek A1Z = A01((Integer) null, (Integer) null, "media_limit_auto_download_wifi_mb", "media_max_autodownload_wifi_mb", 100);
    public static final C22071Ek A1a = A01(16, (Integer) null, "media_limit_mb", "media", 16);
    public static final C22071Ek A1b = A01((Integer) null, (Integer) null, "mms_hot_content_time_span", "mms_hot_content_timespan_in_seconds", 0);
    public static final C22071Ek A1c = A01((Integer) null, (Integer) null, "mms_vcard_autodownload_size_kb", "mms_vcard_autodownload_size_kb", EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final C22071Ek A1d = A01((Integer) null, (Integer) null, "one_tap_calling_in_group_chat_size", "one_tap_calling_in_group_chat_size", 4);
    public static final C22071Ek A1e = A01(0, 300, "overnight_alarms_jitter_limit_in_sec", "overnight_alarms_jitter_limit_in_sec", 0);
    public static final C22071Ek A1f = A01((Integer) null, (Integer) null, "partial_pjpeg_bw_threshold", "partial_pjpeg_bw_threshold", 125);
    public static final C22071Ek A1g = A01(257, (Integer) null, "participants_size_limit", "max_participants", 257);
    public static final C22071Ek A1h = A01((Integer) null, (Integer) null, "payments_br_transaction_limit", "payments_transaction_limit", 1000);
    public static final C22071Ek A1i = A01((Integer) null, (Integer) null, "payments_upi_first_day_max_transaction_limit", "payments_upi_first_day_max_transaction_limit", 5000);
    public static final C22071Ek A1j = A01((Integer) null, (Integer) null, "payments_upi_generate_qr_amount_limit", "payments_upi_generate_qr_amount_limit", 5000);
    public static final C22071Ek A1k = A01((Integer) null, (Integer) null, "payments_upi_intent_transaction_limit", "payments_upi_intent_transaction_limit", 2000);
    public static final C22071Ek A1l = A01((Integer) null, (Integer) null, "payments_upi_transaction_limit", "payments_upi_transaction_limit", 5000);
    public static final C22071Ek A1m = A01((Integer) null, (Integer) null, "payments_upi_transaction_limit_request", "payments_upi_transaction_limit_request", 5000);
    public static final C22071Ek A1n = A01((Integer) null, (Integer) null, "ping_timeout_s", "ping_timeout_s", 32);
    public static final C22071Ek A1o = A01(30, 180, "prekey_expiration_days", "prekey_expiration_days", 60);
    public static final C22071Ek A1p = A01((Integer) null, (Integer) null, "ptt_playback_speed_hide_delay", "ptt_playback_speed_hide_delay", 1500);
    public static final C22071Ek A1q = A01((Integer) null, (Integer) null, "shops_required_tos_version", "shops_required_tos_version", 0);
    public static final C22071Ek A1r = A01((Integer) null, (Integer) null, "status_image_max_edge", "status_image_max_edge", 1280);
    public static final C22071Ek A1s = A01((Integer) null, (Integer) null, "status_image_quality", "status_image_quality", 50);
    public static final C22071Ek A1t = A01((Integer) null, (Integer) null, "status_video_max_duration", "status_video_max_duration", 45);
    public static final C22071Ek A1u = A01(0, 20, "stella_addressbook_restriction_type", "stella_addressbook_restriction_type", 10);
    public static final C22071Ek A1v = A01(25, (Integer) null, "subject_length_limit", "max_subject", 25);
    public static final C22071Ek A1w = A01((Integer) null, (Integer) null, "sync_wifi_threshold_kb", "sync_wifi_threshold_kb", 5000);
    public static final C22071Ek A1x = A01((Integer) null, (Integer) null, "template_doc_mime_types_int", "template_doc_mime_types", 0);
    public static final C22071Ek A1y = A01((Integer) null, (Integer) null, "vcard_as_document_size_kb", "vcard_as_document_size_kb", 0);
    public static final C22071Ek A1z = A01((Integer) null, (Integer) null, "vcard_max_size_kb", "vcard_max_size_kb", EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final C22071Ek A20 = A01((Integer) null, (Integer) null, "video_max_bitrate", "video_max_bitrate", 5000);
    public static final C22071Ek A21 = A01((Integer) null, (Integer) null, "vname_cert_staleness_threshold", "vname_cert_staleness_threshold", 43200);
    public static final C22071Ek A22 = A01(0, 500, "web_max_size_kb", "web_max_size_kb", 100);
    public static final C22071Ek A23 = A01((Integer) null, (Integer) null, "web_service_delay", "web_service_delay", 120);
    public static final C22061Ej A24;
    public static final C22061Ej A25;
    public static final C22061Ej A26;
    public static final C22061Ej A27;
    public static final List A28 = AnonymousClass001.A0s();
    public static final List A29 = AnonymousClass001.A0s();
    public final SharedPreferences A00;
    public final C42062Mq A01;
    public final C28921hz A02;
    public final C58622vY A03;
    public final C54292oU A04;
    public final AnonymousClass4AF A05;

    public static C22051Ei A00(String str, String str2, boolean z) {
        C22051Ei r1 = new C22051Ei(str, z, str2);
        A29.add(r1);
        return r1;
    }

    public static C22071Ek A01(Integer num, Integer num2, String str, String str2, int i) {
        C22071Ek r1 = new C22071Ek(num, num2, str, str2, i);
        A29.add(r1);
        return r1;
    }

    public int A02() {
        return C18280x3.A02(this.A00, "server_props:last_version");
    }

    public int A03(C22071Ek r5) {
        int i;
        synchronized (C66663Mh.class) {
            i = this.A00.getInt(r5.A00, r5.A00);
        }
        return i;
    }

    public long A04() {
        return this.A00.getLong("server_props:refresh", 86400000);
    }

    public long A05() {
        return AnonymousClass0x2.A0B(this.A00, "groups_server_props_last_refresh_time");
    }

    public String A06(C22061Ej r5) {
        String string;
        synchronized (C66663Mh.class) {
            string = this.A00.getString(r5.A00, r5.A00);
        }
        return string;
    }

    public void A07(C56612sH r10, String str, String str2, Map map, int i, int i2, long j) {
        boolean z;
        ObjectOutputStream objectOutputStream;
        SharedPreferences sharedPreferences;
        ArrayList A0v2;
        SharedPreferences sharedPreferences2 = this.A00;
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        synchronized (C66663Mh.class) {
            edit.putLong("groups_server_props_last_refresh_time", r10.A0H());
            edit.putInt("server_props:last_version", i);
            edit.putLong("server_props:refresh", Math.max(j, 600000));
            z = true;
            if (i2 == 1 || !TextUtils.isEmpty(str)) {
                Iterator A032 = C61102zi.A03(this.A02);
                while (A032.hasNext()) {
                    A032.next();
                }
                for (AnonymousClass2XN A002 : A29) {
                    A002.A00(edit, map);
                }
                C58622vY r7 = this.A03;
                Log.d("ABTestManager/onServerProperties");
                synchronized (r7) {
                    try {
                        sharedPreferences = r7.A00;
                        if (sharedPreferences == null) {
                            sharedPreferences = r7.A01.A03(C58152un.A0A);
                            r7.A00 = sharedPreferences;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                synchronized (r7.A02) {
                    try {
                        A0v2 = C18300x5.A0v(C58622vY.A03);
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                Iterator it = A0v2.iterator();
                if (it.hasNext()) {
                    it.next();
                    th = AnonymousClass001.A0g("remoteKey");
                    throw th;
                }
                edit2.apply();
                if (sharedPreferences2.getBoolean("server_props:one_time_unlocked", true)) {
                    for (AnonymousClass2XN A003 : A28) {
                        A003.A00(edit, map);
                    }
                    edit.putBoolean("server_props:one_time_unlocked", false);
                }
            } else {
                z = false;
            }
            if (i2 == 2) {
                edit.putString("server_props:config_key", str2);
                AnonymousClass4AF r1 = this.A05;
                C162457s7.A0J(r1, 0);
                C18300x5.A1G(r1, str2, 2141);
                if (!TextUtils.isEmpty(str)) {
                    edit.putString("server_props:config_hash", str);
                }
            } else {
                edit.remove("server_props:config_key");
                AnonymousClass4AF r2 = this.A05;
                C162457s7.A0J(r2, 0);
                C18300x5.A1G(r2, (Object) null, 2141);
                edit.remove("server_props:config_hash");
            }
            Context context = this.A04.A00;
            String A0o2 = C18310x6.A0o("debug_chat_host", map);
            File A0A2 = AnonymousClass002.A0A(context.getFilesDir(), "debug_chat_host");
            synchronized (C58032ub.class) {
                try {
                    if (TextUtils.isEmpty(A0o2)) {
                        C58032ub.A00 = null;
                        C58032ub.A01 = true;
                        A0A2.delete();
                    } else {
                        C58032ub.A00 = A0o2;
                        C58032ub.A01 = true;
                        try {
                            FileOutputStream A0h2 = AnonymousClass0x9.A0h(A0A2);
                            try {
                                objectOutputStream = new ObjectOutputStream(A0h2);
                                objectOutputStream.writeObject(C58032ub.A00);
                                objectOutputStream.close();
                                A0h2.close();
                            } catch (Throwable th3) {
                                A0h2.close();
                                throw th3;
                            }
                        } catch (IOException e) {
                            Log.w((Throwable) e);
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            edit.apply();
        }
        C42062Mq r12 = this.A01;
        C18270x1.A0j(AnonymousClass0x2.A0E(r12.A01), "server_props:hash", C57622tw.A00(C18300x5.A0B(r12.A02).getAll()));
        if (z) {
            Iterator A033 = C61102zi.A03(this.A02);
            while (A033.hasNext()) {
                C65203Gp r22 = (C65203Gp) A033.next();
                C69963Zi.A01(r22.A0h, r22, 20);
            }
            return;
        }
        return;
        throw th;
    }

    public boolean A08(C22051Ei r5) {
        boolean z;
        synchronized (C66663Mh.class) {
            z = this.A00.getBoolean(r5.A00, r5.A00);
        }
        return z;
    }

    public void BTO(AnonymousClass4AF r4) {
        synchronized (C66663Mh.class) {
            C18300x5.A1G(r4, C18280x3.A0Z(this.A00, "server_props:config_key"), 2141);
        }
    }

    static {
        Integer A0j2 = AnonymousClass0x9.A0j();
        A1S = A01(A0j2, 90, "syncd_key_stale_days", "syncd_key_stale_days", 31);
        A1V = A01(1, A0j2, "syncd_wait_for_key_timeout_days", "syncd_wait_for_key_timeout_days", 7);
        C22061Ej r13 = new C22061Ej("payments_cs_faq_url", "https://faq.whatsapp.com/payments");
        A29.add(r13);
        A26 = r13;
        C22061Ej r132 = new C22061Ej("payments_cs_email_address", (String) null);
        A29.add(r132);
        A25 = r132;
        C22061Ej r133 = new C22061Ej("payments_cs_phone_number", (String) null);
        A29.add(r133);
        A27 = r133;
        C22061Ej r134 = new C22061Ej("ephemeral_messages_allowed_values", C58152un.A06);
        A29.add(r134);
        A24 = r134;
        C22051Ei r1 = new C22051Ei("enable_export", true, "enable_export");
        A28.add(r1);
        A0J = r1;
        C22041Eh r12 = new C22041Eh();
        A29.add(r12);
        A10 = r12;
    }

    public C66663Mh(C42062Mq r2, C28921hz r3, C58622vY r4, C54292oU r5, AnonymousClass4AF r6, C60152y5 r7) {
        SharedPreferences A032 = r7.A03("server_prop_preferences");
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = A032;
        this.A02 = r3;
        this.A01 = r2;
    }
}
