package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.36r  reason: invalid class name and case insensitive filesystem */
public class C627736r {
    public static Intent A05(Context context) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.registration.RegisterPhone");
        className.putExtra("com.whatsapp.registration.RegisterPhone.resetstate", true);
        className.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        return className;
    }

    public static Intent A0D(Context context, long j) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity");
        A07.putExtra("allowSkipKey", false);
        A07.putExtra("spaceNeededInBytes", j);
        return A07;
    }

    public static Intent A0F(Context context, long j, long j2, boolean z, boolean z2) {
        Intent A0A = C18280x3.A0A(context);
        A1H(A0A, j, j2);
        A0A.putExtra("use_sms_retriever", z);
        A0A.putExtra("show_request_code_progress_dialog", true);
        A0A.putExtra("changenumber", z2);
        A0A.putExtra("EXTRA_SHOULD_REQUEST_VOICE_CALL", true);
        return A0A;
    }

    public static Intent A0G(Context context, Uri uri) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.deeplink.DeepLinkActivity");
        A07.setData(uri);
        A07.putExtra("source", 2);
        return A07;
    }

    public static Intent A0Q(Context context, C95814uZ r6, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.gallery.MediaGalleryActivity");
        A07.putExtra("pos", -1);
        C627336j.A0D(A07, r6, "jid");
        A07.putExtra("alert", true);
        A07.putExtra("key", i);
        return A07;
    }

    public static Intent A0q(Context context, Integer num) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.textstatuscomposer.TextStatusComposerActivity");
        A07.putExtra("camera_origin", 4);
        A07.putExtra("entry_point", num);
        return A07;
    }

    public static Intent A0u(Context context, String str, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.camera.CameraActivity");
        A07.putExtra("jid", str);
        A07.putExtra("camera_origin", i);
        A07.putExtra("is_coming_from_chat", false);
        A07.putExtra("selected_uris", (Serializable) null);
        return A07;
    }

    public static Intent A11(Context context, String str, String str2, int i) {
        C626936e.A0B(AnonymousClass001.A1W(i));
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
        A07.putExtra("request_type", 3);
        if (!TextUtils.isEmpty(str)) {
            A07.putExtra("switch_to_account_lid", str);
        }
        A07.putExtra("number_of_accounts", i - 1);
        A07.putExtra("source", 12);
        if (!TextUtils.isEmpty(str2)) {
            A07.putExtra("account_language", str2);
        }
        A07.addFlags(268468224);
        return A07;
    }

    public static Intent A13(Context context, String str, String str2, int i, int i2, long j) {
        C626936e.A0B(AnonymousClass001.A1W(i));
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
        A07.putExtra("request_type", 4);
        A07.putExtra("remove_account_lid", str);
        A07.putExtra("number_of_accounts", i - 1);
        A07.putExtra("source", i2);
        A07.putExtra("switching_start_time_ms", j);
        if (!TextUtils.isEmpty(str2)) {
            A07.putExtra("account_language", str2);
        }
        A07.addFlags(268468224);
        return A07;
    }

    public static Intent A14(Context context, String str, String str2, String str3) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.MessageWithLinkWebViewActivity");
        C626936e.A06(str);
        A07.putExtra("webview_url", str);
        A07.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            A07.putExtra("webview_callback", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            A07.putExtra("webview_cancel_callback", str3);
        }
        A07.putExtra("webview_should_ask_before_close", true);
        A07.putExtra("webview_hide_url", false);
        A07.putExtra("webview_open_new_tab_in_external_browser", true);
        A07.putExtra("webview_title_show_domain_only", false);
        A07.putExtra("webview_toolbar_v2", true);
        A07.putExtra("webview_can_navigate_back", true);
        A07.putExtra("deep_link_type_support", 1);
        A07.putExtra("webview_deeplink_enabled", true);
        return A07;
    }

    public static Intent A17(Context context, String str, String str2, boolean z, boolean z2) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.webview.ui.WaInAppBrowsingActivity");
        C626936e.A06(str);
        A07.putExtra("webview_url", str);
        A07.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            A07.putExtra("webview_callback", str2);
        }
        A07.putExtra("webview_hide_url", z);
        A07.putExtra("webview_javascript_enabled", true);
        A07.putExtra("webview_can_navigate_back", z2);
        return A07;
    }

    public Intent A1J(Context context) {
        return A0t(context, (String) null);
    }

    public Intent A1N(Context context, C95814uZ r3) {
        return A1O(context, r3, 0);
    }

    public Intent A1P(Context context, C95814uZ r6, String str) {
        Intent A1O = A1O(context, r6, 0);
        A1O.putExtra("wa_type", (byte) 0);
        A1O.putExtra("share_msg", str);
        A1O.putExtra("has_share", true);
        A1O.putExtra("confirm", true);
        A1O.putExtra("text_from_url", true);
        A1O.putExtra("number_from_url", true);
        C57352tV.A00(context, A1O);
        return A1O;
    }

    public static Intent A0H(Context context, Uri uri, int i) {
        Intent A08 = A08(context, i);
        A08.setData(uri);
        A08.setAction("com.whatsapp.intent.action.OPEN");
        A08.addFlags(335544320);
        return A08;
    }

    public static Intent A0N(Context context, AnonymousClass3ZH r2) {
        return new C627736r().A1L(context, r2);
    }

    public static Intent A0O(Context context, C95814uZ r3) {
        return new C627736r().A1O(context, r3, 0);
    }

    public static Intent A0m(Context context, UserJid userJid, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C47242cw r0 = new C47242cw(context, userJid, str);
        r0.A05 = z;
        r0.A00 = z2;
        r0.A04 = z3;
        r0.A02 = z4;
        r0.A03 = z5;
        return r0.A00();
    }

    public static AnonymousClass5UF A1F(Context context) {
        return new AnonymousClass5UF(context);
    }

    public static final void A1I(Intent intent, Rect rect, Bundle bundle, int i, int i2, int i3, int i4) {
        intent.putExtra("EXTRA_INITIAL_TOP_MARGIN", i);
        intent.putExtra("EXTRA_START_MARGIN", i2);
        intent.putExtra("EXTRA_MSG_PADDING_START", rect.left);
        intent.putExtra("EXTRA_MSG_PADDING_TOP", rect.top);
        intent.putExtra("EXTRA_MSG_PADDING_END", rect.right);
        intent.putExtra("EXTRA_CUSTOMIZER_ID", i4);
        intent.putExtra("EXTRA_MSG_PADDING_BOTTOM", rect.bottom);
        intent.putExtra("EXTRA_PROFILE_PICTURE_WIDTH", i3);
        intent.putExtra("EXTRA_SAVE_STATE_BUNDLE", bundle);
    }

    @Deprecated
    public Intent A1K(Context context, AnonymousClass3ZH r5) {
        return A0l(context, (UserJid) AnonymousClass3ZH.A05(r5, UserJid.class), (Integer) null, true, true);
    }

    public Intent A1M(Context context, AnonymousClass3ZH r4, Integer num) {
        return A0l(context, (UserJid) AnonymousClass3ZH.A05(r4, UserJid.class), num, true, true);
    }

    public Intent A1R(Context context, C624134x r7) {
        AnonymousClass2z0 r4 = r7.A1J;
        Intent putExtra = A1O(context, r4.A00, 0).putExtra("start_t", SystemClock.uptimeMillis()).putExtra("row_id", r7.A1L).putExtra("sort_id", r7.A1M);
        C107395bF.A00(putExtra, r4);
        return putExtra;
    }

    public Intent A1S(Context context, String str, int i, boolean z) {
        Intent A0o = A0o(context, Boolean.valueOf(z), (Boolean) null, (Boolean) null, (Boolean) null, (List) null);
        A0o.setAction("com.whatsapp.intent.action.ACCEPT_CALL");
        A0o.putExtra("call_ui_action", i);
        A0o.putExtra("call_id", str);
        A0o.putExtra("isTaskRoot", z);
        return A0o;
    }

    public static Intent A00(Context context) {
        return A02(context).addFlags(603979776);
    }

    public static Intent A01(Context context) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.registration.EULA");
        A07.setFlags(268468224);
        return A07;
    }

    public static Intent A02(Context context) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.HomeActivity");
        return A07;
    }

    public static Intent A03(Context context) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.Main");
        return A07;
    }

    public static Intent A04(Context context) {
        return C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.registration.RegisterPhone");
    }

    public static Intent A06(Context context) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.settings.SettingsPrivacy");
        return A07;
    }

    public static Intent A07(Context context) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.status.audienceselector.StatusPrivacyActivity");
        return A07;
    }

    public static Intent A08(Context context, int i) {
        return C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.Conversation").putExtra("mat_entry_point", i);
    }

    public static Intent A09(Context context, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.backup.encryptedbackup.EncBackupMainActivity");
        A07.putExtra("user_action", i);
        return A07;
    }

    public static Intent A0A(Context context, int i, int i2, long j, long j2, long j3, boolean z, boolean z2) {
        Intent A0A = C18280x3.A0A(context);
        A0A.putExtra("changenumber", z);
        A1H(A0A, j, j2);
        A0A.putExtra("wa_old_retry_time", j3);
        A0A.putExtra("use_sms_retriever", z2);
        A0A.putExtra("wa_old_eligible", i);
        A0A.putExtra("code_verification_mode", i2);
        return A0A;
    }

    public static Intent A0B(Context context, int i, long j, long j2, long j3, long j4, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.registration.deviceswitching.DeviceSwitchingSelfServeEducationScreen");
        A07.putExtra("flash_type", i);
        A07.putExtra("change_number", z);
        A1H(A07, j, j2);
        A07.putExtra("wa_old_retry_time", j3);
        A07.putExtra("email_otp_retry_time", j4);
        return A07;
    }

    public static Intent A0C(Context context, int i, long j, long j2, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen");
        A07.putExtra("flash_type", i);
        A1H(A07, j, j2);
        A07.putExtra("change_number", z);
        return A07;
    }

    public static Intent A0E(Context context, long j, long j2, boolean z, boolean z2) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity");
        className.putExtra("change_number", z);
        A1H(className, j, j2);
        className.putExtra("use_sms_retriever", z2);
        return className;
    }

    public static Intent A0I(Context context, Uri uri, Parcelable parcelable, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.inappbugreporting.InAppBugReportingActivity");
        if (uri != null) {
            A07.putExtra("extra_screenshot_uri", uri.toString());
        }
        if (parcelable != null) {
            A07.putExtra("extra_call_log_key", parcelable);
        }
        A07.putExtra("extra_is_calling_bug", z);
        return A07;
    }

    public static Intent A0J(Context context, Uri uri, C95814uZ r5, String str, String str2, boolean z) {
        return C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.documentpicker.DocumentPreviewActivity").putExtra("jid", C627336j.A07(r5)).putExtra("uri", uri).putExtra("caption", str).putExtra("mentions", str2).putExtra("send", z).putExtra("clear_message_after_send", C18320x8.A1U(str));
    }

    public static Intent A0K(Context context, Bundle bundle, ArrayList arrayList, int i, int i2) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.inappsupport.ui.SupportTopicsActivity");
        className.putParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", arrayList);
        className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", i);
        className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", i2);
        if (bundle != null) {
            className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle", bundle);
        }
        return className;
    }

    public static Intent A0L(Context context, Parcelable parcelable, String str, String str2) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.wabloks.ui.WaBloksActivity");
        C18310x6.A11(A07, str, str2);
        A07.putExtra("screen_cache_config", parcelable);
        return A07;
    }

    public static Intent A0M(Context context, C108845de r4, Integer num, String str) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.textstatuscomposer.TextStatusComposerActivity");
        A07.putExtra("status_distribution", r4);
        A07.putExtra("android.intent.extra.TEXT", str);
        A07.putExtra("entry_point", num);
        return A07;
    }

    public static Intent A0P(Context context, C95814uZ r4) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity");
        AnonymousClass0x2.A0u(A07, r4, "jid");
        return A07;
    }

    public static Intent A0R(Context context, C95814uZ r4, int i, int i2) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.ephemeral.ChangeEphemeralSettingActivity");
        AnonymousClass0x2.A0u(className, r4, "jid");
        className.putExtra("current_setting", i);
        className.putExtra("entry_point", i2);
        return className;
    }

    public static Intent A0S(Context context, C95814uZ r4, boolean z, boolean z2, boolean z3) {
        Intent A07 = C18320x8.A07();
        C627336j.A0E(A07, r4, context.getPackageName(), "com.whatsapp.status.playback.StatusPlaybackActivity");
        A07.putExtra("single_contact_update", z);
        A07.putExtra("should_chain_viewed_statuses", z2);
        A07.putExtra("should_chain_viewed_statuses", z3);
        return A07;
    }

    public static Intent A0T(Context context, GroupJid groupJid) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.community.ManageGroupsInCommunityActivity");
        AnonymousClass0x2.A0u(A07, groupJid, "parent_group_jid");
        return A07;
    }

    public static Intent A0U(Context context, GroupJid groupJid, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityHomeActivity");
        A07.putExtra("parent_group_jid", groupJid.getRawString());
        A07.putExtra("tab_start_position", i);
        StringBuilder A0o = AnonymousClass001.A0o();
        C18280x3.A1G(A0o, "whatsapp://community/", groupJid);
        A07.setData(Uri.parse(A0o.toString()));
        A07.setFlags(603979776);
        return A07;
    }

    public static Intent A0V(Context context, GroupJid groupJid, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.group.GroupPermissionsActivity");
        AnonymousClass0x2.A0u(A07, groupJid, "gid");
        A07.putExtra("entry_point", i);
        return A07;
    }

    public static Intent A0W(Context context, GroupJid groupJid, Long l, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.invites.InviteGroupParticipantsActivity");
        A07.putExtra("sms_invites_jids", arrayList3);
        A07.putExtra("jids", arrayList);
        A07.putExtra("invite_hashes", arrayList2);
        A07.putExtra("invite_expiration", l);
        AnonymousClass0x2.A0u(A07, groupJid, "group_jid");
        A07.putExtra("invite_trigger_source", i);
        return A07;
    }

    public static Intent A0X(Context context, GroupJid groupJid, ArrayList arrayList, int i, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.invites.SMSPreviewInviteGroupParticipantsActivity");
        A07.putExtra("sms_invites_jids", arrayList);
        AnonymousClass0x2.A0u(A07, groupJid, "group_jid");
        A07.putExtra("all_participants_non_wa_in_request", z);
        A07.putExtra("invite_trigger_source", i);
        return A07;
    }

    public static Intent A0Y(Context context, GroupJid groupJid, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityMembersActivity");
        C627336j.A0D(A07, groupJid, "extra_community_jid");
        A07.putExtra("extra_non_cag_members_view", z);
        return A07;
    }

    public static Intent A0Z(Context context, GroupJid groupJid, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityNavigationActivity");
        A07.putExtra("parent_group_jid", groupJid.getRawString());
        A07.putExtra("post_creation_flow", z);
        StringBuilder A0o = AnonymousClass001.A0o();
        C18280x3.A1G(A0o, "whatsapp://communityNavigation/", groupJid);
        A07.setData(Uri.parse(A0o.toString()));
        A07.setFlags(603979776);
        return A07;
    }

    public static Intent A0a(Context context, Jid jid) {
        Intent A07 = C18320x8.A07();
        C627336j.A0E(A07, jid, context.getPackageName(), "com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
        return A07;
    }

    public static Intent A0b(Context context, Jid jid, int i, int i2, boolean z) {
        Intent A07 = C18320x8.A07();
        C627336j.A0E(A07, jid, context.getPackageName(), "com.whatsapp.newsletter.NewsletterInfoActivity");
        A07.putExtra("circular_transition", z);
        A07.putExtra("mat_entry_point", i);
        A07.putExtra("extra_forwarded_message_thread_type", i2);
        return A07;
    }

    public static Intent A0c(Context context, Jid jid, Integer num, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.biz.catalog.view.activity.CatalogListActivity");
        AnonymousClass0x2.A0u(A07, jid, "cache_jid");
        A07.putExtra("source", num);
        A07.putExtra("entry_point", i);
        return A07;
    }

    public static Intent A0d(Context context, Jid jid, String str) {
        Intent A07 = C18320x8.A07();
        C627336j.A0E(A07, jid, context.getPackageName(), "com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoActivity");
        A07.putExtra("country_code", str);
        A07.setFlags(603979776);
        return A07;
    }

    public static Intent A0e(Context context, Jid jid, String str, float f, int i, int i2, int i3, int i4, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.profile.ViewProfilePhoto");
        AnonymousClass0x2.A0u(A07, jid, "jid");
        A07.putExtra("circular_transition", z);
        if (str != null) {
            A07.putExtra("circular_return_name", str);
        }
        A07.putExtra("start_transition_alpha", f);
        A07.putExtra("start_transition_status_bar_color", i);
        A07.putExtra("return_transition_status_bar_color", i2);
        A07.putExtra("start_transition_navigation_bar_color", i3);
        A07.putExtra("return_transition_navigation_bar_color", i4);
        return A07;
    }

    public static Intent A0f(Context context, Jid jid, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.chatinfo.ListChatInfoActivity");
        C627336j.A0D(A07, jid, "gid");
        A07.putExtra("circular_transition", z);
        return A07;
    }

    public static Intent A0g(Context context, Jid jid, boolean z, boolean z2, boolean z3) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.group.GroupChatInfoActivity");
        C627336j.A0D(A07, jid, "gid");
        A07.putExtra("circular_transition", z);
        A07.putExtra("show_description", z2);
        A07.putExtra("show_chat_action", z3);
        return A07;
    }

    public static Intent A0h(Context context, C27991fJ r4) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.community.CommunitySettingsActivity");
        AnonymousClass0x2.A0u(className, r4, "parent_jid");
        return className;
    }

    public static Intent A0i(Context context, C27991fJ r4) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity");
        AnonymousClass0x2.A0u(className, r4, "parent_jid");
        className.setFlags(335544320);
        return className;
    }

    public static Intent A0j(Context context, UserJid userJid) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.identity.IdentityVerificationActivity");
        AnonymousClass0x2.A0u(A07, userJid, "jid");
        return A07;
    }

    public static Intent A0k(Context context, UserJid userJid, Integer num, Integer num2, String str, String str2, String str3) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.businesscollection.view.activity.CollectionProductListActivity");
        A07.putExtra("collection_id", str);
        A07.putExtra("collection_name", str2);
        AnonymousClass0x2.A0u(A07, userJid, "cache_jid");
        A07.putExtra("collection_index", str3);
        if (num != null) {
            A07.putExtra("category_browsing_entry_point", num);
        }
        if (num2 != null) {
            A07.putExtra("category_level", num2);
        }
        return A07;
    }

    public static Intent A0l(Context context, UserJid userJid, Integer num, boolean z, boolean z2) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.chatinfo.ContactInfoActivity");
        AnonymousClass0x2.A0u(className, userJid, "jid");
        className.putExtra("circular_transition", z);
        className.putExtra("should_show_chat_action", z2);
        className.putExtra("profile_entry_point", num);
        return className;
    }

    public static Intent A0n(Context context, C53732nZ r4) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.registration.parole.CustomRegistrationBlockActivity");
        if (r4 != null) {
            A07.putExtra("show_custom_fields", true);
            A07.putExtra("title_text", r4.A05);
            A07.putExtra("body_text", r4.A00);
            A07.putExtra("button_primary_text", r4.A02);
            A07.putExtra("button_primary_link", r4.A01);
            A07.putExtra("button_secondary_text", r4.A04);
            A07.putExtra("button_secondary_link", r4.A03);
        }
        return A07;
    }

    public static Intent A0o(Context context, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
        if (list != null) {
            ArrayList A0u = C18300x5.A0u(list);
            C627336j.A0H(list, A0u);
            className.putStringArrayListExtra("jid", A0u);
        }
        if (bool != null) {
            className.putExtra("isTaskRoot", bool);
        }
        if (bool4 != null) {
            className.putExtra("newCall", bool4);
        }
        if (bool2 != null) {
            className.putExtra("video_call", bool2);
        }
        if (bool3 != null || C621633u.A00(context) == null) {
            className.setFlags(268435456);
        }
        return className;
    }

    public static Intent A0p(Context context, Integer num) {
        Intent A07 = C18320x8.A07();
        if (num != null) {
            A07.putExtra("bonsaiOnboardingEntryPoint", num);
        }
        A07.setClassName(context.getPackageName(), "com.whatsapp.bonsai.onboarding.BonsaiOnboardingActivity");
        return A07;
    }

    public static Intent A0r(Context context, String str) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.contact.picker.ContactPicker");
        A07.putExtra("android.intent.extra.TEXT", str);
        A07.setType("text/plain");
        A07.addFlags(524288);
        return A07;
    }

    public static Intent A0s(Context context, String str) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context, "com.whatsapp.inappsupport.ui.SupportBloksActivity");
        try {
            A07.putExtra("screen_params", AnonymousClass0x9.A1G().put("params", AnonymousClass0x9.A1G().put("server_params", AnonymousClass0x9.A1G().put("entrypointid", str))).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        A07.putExtra("screen_name", "com.bloks.www.cxthelp.whatsapp");
        return A07;
    }

    public static Intent A0t(Context context, String str) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.backup.google.GoogleBackupService");
        if (!TextUtils.isEmpty(str)) {
            A07.setAction(str);
        }
        return A07;
    }

    public static Intent A0v(Context context, String str, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.email.EmailVerificationActivity");
        C18310x6.A10(A07, str, i);
        return A07;
    }

    public static Intent A0w(Context context, String str, int i, int i2) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
        A07.putExtra("appeal_request_token", str);
        A07.putExtra("ban_violation_type", i);
        A07.putExtra("launch_source", i2);
        return A07;
    }

    public static Intent A0x(Context context, String str, int i, int i2) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.email.UpdateEmailActivity");
        A07.putExtra("state", i);
        C18310x6.A10(A07, str, i2);
        return A07;
    }

    public static Intent A0y(Context context, String str, int i, int i2, int i3, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intent A0A = C18280x3.A0A(context);
        A0A.putExtra("server_start_message", str);
        A0A.putExtra("flash_type", i);
        A1H(A0A, j, j2);
        A0A.putExtra("wa_old_retry_time", j3);
        A0A.putExtra("email_otp_retry_time", j4);
        A0A.putExtra("use_sms_retriever", z);
        A0A.putExtra("show_request_code_progress_dialog", z2);
        A0A.putExtra("changenumber", z3);
        A0A.putExtra("should_request_flash_call", z4);
        A0A.putExtra("wa_old_eligible", i2);
        A0A.putExtra("fraud_eligible", z5);
        A0A.putExtra("silent_auth_eligible", i3);
        A0A.putExtra("code_verification_mode", 0);
        return A0A;
    }

    public static Intent A0z(Context context, String str, int i, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.addFlags(268435456);
        A07.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.routing.AccountSwitchingRoutingActivity");
        A07.putExtra("switch_to_account_lid", str);
        A07.putExtra("is_missed_call_notification", z);
        A07.putExtra("source", i);
        return A07;
    }

    public static Intent A10(Context context, String str, String str2) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.phonematching.CountryPicker");
        A07.putExtra("country_iso", str);
        A07.putExtra("country_display_name", str2);
        return A07;
    }

    public static Intent A12(Context context, String str, String str2, int i) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.storage.StorageUsageActivity");
        className.putExtra("session_id", str);
        className.putExtra("entry_point", i);
        if (str2 != null) {
            className.putExtra("search_result_key", str2);
        }
        return className;
    }

    public static Intent A15(Context context, String str, String str2, String str3, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.PaymentWebViewActivity");
        C626936e.A06(str);
        A07.putExtra("webview_url", str);
        boolean z = true;
        A07.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            A07.putExtra("webview_callback", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            A07.putExtra("webview_cancel_callback", str3);
        }
        A07.putExtra("webview_toolbar_v2", true);
        A07.putExtra("webview_hide_url", false);
        A07.putExtra("webview_title_show_domain_only", true);
        A07.putExtra("webview_open_new_tab_in_external_browser", true);
        A07.putExtra("deep_link_type_support", i);
        if (i == -1) {
            z = false;
        }
        A07.putExtra("webview_deeplink_enabled", z);
        return A07;
    }

    public static Intent A16(Context context, String str, String str2, String str3, List list, int i, int i2, boolean z, boolean z2) {
        Intent putExtra = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.gifvideopreview.GifVideoPreviewActivity").putExtra("preview_media_url", str).putExtra("media_url", str2).putExtra("static_preview_url", str3);
        ArrayList A0u = C18300x5.A0u(list);
        C627336j.A0H(list, A0u);
        return putExtra.putExtra("jids", A0u).putExtra("send", z2).putExtra("provider", i).putExtra("number_from_url", z).putExtra("origin", i2);
    }

    public static Intent A18(Context context, String str, boolean z, boolean z2) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.migration.transfer.ui.ChatTransferActivity");
        A07.putExtra("is_donor", z);
        A07.putExtra("started_on_receiver", z2);
        A07.putExtra("qr_code_data", str);
        return A07;
    }

    public static Intent A19(Context context, String str, int... iArr) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.twofactor.TwoFactorAuthActivity");
        A07.putExtra("primaryCTA", str);
        A07.putExtra("workflows", iArr);
        return A07;
    }

    public static Intent A1A(Context context, Collection collection, int i) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.group.GroupMembersSelector");
        A07.putExtra("entry_point", i);
        if (collection != null && !collection.isEmpty()) {
            A07.putExtra("selected", AnonymousClass002.A0J(collection));
        }
        return A07;
    }

    public static Intent A1B(Context context, Set set) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.contact.picker.ListMembersSelector");
        if (!set.isEmpty()) {
            ArrayList A0u = C18300x5.A0u(set);
            C627336j.A0H(set, A0u);
            A07.putExtra("selected", A0u);
        }
        return A07;
    }

    public static Intent A1C(Context context, boolean z) {
        Intent className = C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.registration.VerifyCaptcha");
        className.putExtra("change_number", z);
        return className;
    }

    public static Intent A1D(Context context, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.registration.VerifyTwoFactorAuth");
        A07.putExtra("changenumber", z);
        return A07;
    }

    public static Intent A1E(Context context, boolean z, boolean z2) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.biz.product.view.activity.ProductDetailActivity");
        A07.putExtra("is_from_product_detail_screen", z);
        A07.putExtra("go_back_to_catalog_from_deeplink", z2);
        return A07;
    }

    public static final void A1G(Context context, Intent intent, int i) {
        intent.setClassName(context.getPackageName(), "com.whatsapp.dmsetting.ChangeDMSettingActivity");
        intent.putExtra("entry_point", i);
    }

    public static void A1H(Intent intent, long j, long j2) {
        intent.putExtra("sms_retry_time", j);
        intent.putExtra("voice_retry_time", j2);
    }

    public Intent A1L(Context context, AnonymousClass3ZH r4) {
        return A1O(context, AnonymousClass3ZH.A01(r4), 0);
    }

    public Intent A1O(Context context, C95814uZ r4, int i) {
        return C627336j.A01(context, r4, i).addFlags(335544320);
    }

    public Intent A1Q(Context context, UserJid userJid, Boolean bool) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (userJid != null) {
            A0s.add(userJid);
        }
        return A0o(context, bool, (Boolean) null, (Boolean) null, (Boolean) null, A0s);
    }
}
