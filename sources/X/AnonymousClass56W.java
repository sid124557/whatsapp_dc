package X;

import java.util.ArrayList;

/* renamed from: X.56W  reason: invalid class name */
public final class AnonymousClass56W extends C35561x4 {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"account_info", "account_info_report", "album_media_menu_report", "biz_account_info_block", "biz_block_header_chat", "biz_call_log_block", "biz_overflow_menu_block", "biz_spam_banner_block", "block_dialog", "block_header_chat", "call_log", "call_log_block", "call_spam_dialog_block", "call_spam_dialog_report", "chat", "chat_fmx_card_block", "chat_fmx_card_block_suspicious", "chat_fmx_card_safety_tools_block", "chat_fmx_card_safety_tools_block_suspicious", "chat_fmx_card_safety_tools_report", "chat_fmx_card_safety_tools_report_suspicious", "chat_list_block", "chat_list_context_menu_block", "chat_list_noinsub_block", "comment_actions_bottom_sheet", "community_home", "ent_client", "extension_menu_report", "frx", "group_info", "group_info_report", "group_spam_banner_exit", "group_spam_banner_report", "left_group_spam_banner_report", "media_viewer", "message_menu", "missed_call_notification_block", "newsletter_info_report", "notification_block", "overflow_menu", "overflow_menu_block", "overflow_menu_community_report", "overflow_menu_report", "status_post_report", "triggered_block", "view_once_viewer", "1_1_old_spam_banner_block", "1_1_spam_banner_block", "1_1_spam_banner_report"});

    public AnonymousClass56W(String str) {
        C56052rL r3 = new C56052rL("iq");
        r3.A0G(AnonymousClass39V.A00());
        C56052rL.A0D(r3, "xmlns", "spam");
        C56052rL r2 = new C56052rL("spam_list");
        r2.A0L(str, "spam_flow", A00);
        r3.A0H(r2.A0F());
        this.A00 = r3.A0F();
    }
}
