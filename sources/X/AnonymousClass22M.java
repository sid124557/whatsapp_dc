package X;

import java.util.Locale;

/* renamed from: X.22M  reason: invalid class name */
public enum AnonymousClass22M {
    A0U("spamXmppMethods_unrecognizedJid", 0),
    A0R("spamXmppMethods_newFlowException", 1),
    A0S("spamXmppMethods_mismatchingNodes", 2),
    A0Q("spamXmppMethods_exceptionNewFlowCompare", 3),
    A0P("selected_message_cache_null", 4),
    A0T("spamXmppMethods_nullTemplateId", 5),
    A0L("selectionAction_nullGroupContact", 6),
    A0J("corrupt_report_notification", 7),
    A0M("ReportToAdminDialogFragment_nullSenderJid", 8),
    A0K("ReportToAdminDialogFragment_nullSelectedMessageJid", 9),
    A0F("reporting_token_r_token_hmac_exception", 10),
    A0G("reporting_token_msg_missing_msg_secret", 11),
    A0I("reporting_token_unhandled_reporting_type", 12),
    A0H("reporting_token_null_sender_jod", 13),
    A0D("perf_timer_already_started", 14),
    A0E("perf_timer_end_non_started", 15),
    A02("newsletterStore_failedToFindNewsletterInfoToUpdateEnforcedUpdatesBanner", 16),
    A09("newsletterNotificationHandler_missing_message_for_add_enforcement", 17),
    A0A("newsletterNotificationHandler_missing_message_for_remove_enforcement", 18),
    A0N("newsletterAdminMetadataUpdateHandler_server_id_missing_for_add_enforcement", 19),
    A0O("newsletterAdminMetadataUpdateHandler_server_id_missing_for_remove_enforcement", 20),
    A06("gpia_reg_client_prepare", 21),
    A05("gpia_reg_client_init_prepare", 22),
    A07("gpia_reg_client_trigger", 23),
    A08("ka_at_md_generate_attestation", 24),
    A03("gpia_at_md_prepare", 25),
    A04("gpia_at_md_generate_attestation", 26),
    A0C("newsletterUnexpectedSuspensionState", 27),
    A0B("newsletterInfraDbInsertFailure", 28);
    
    public final String project;
    public final String team;
    public final String title;
    public final int version;

    /* access modifiers changed from: public */
    AnonymousClass22M(String str, int i) {
        this.title = str;
        this.version = 0;
        this.project = r2.title;
        this.team = r2.team;
    }

    /* access modifiers changed from: public */
    static {
        AnonymousClass22M[] r2;
        A00 = C73653fr.A00(r2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        String str = this.team;
        Locale locale = Locale.ROOT;
        A0o.append(C18320x8.A0g(locale, str));
        A0o.append('/');
        A0o.append(C18320x8.A0g(locale, this.project));
        A0o.append('/');
        String A0X = AnonymousClass000.A0X(this.title, A0o);
        int i = this.version;
        if (i <= 0) {
            return A0X;
        }
        StringBuilder A0l = AnonymousClass000.A0l(A0X);
        A0l.append('_');
        return AnonymousClass000.A0h(A0l, i);
    }
}
