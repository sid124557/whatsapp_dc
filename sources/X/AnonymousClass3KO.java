package X;

/* renamed from: X.3KO  reason: invalid class name */
public class AnonymousClass3KO implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("group_admin_settings_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_admin_settings_jid_index ON wa_group_admin_settings (jid)");
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0C("group_admin_settings_deletion_trigger", "CREATE TRIGGER group_admin_settings_deletion_trigger BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_group_admin_settings WHERE jid = old.jid; END");
    }

    public void B3j(C41492Kl r10, C56622sI r11) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[20];
        A00.A02 = "jid";
        AnonymousClass220 r7 = AnonymousClass220.TEXT;
        A00.A00 = r7;
        A00.A04 = true;
        r3[0] = A00.A0x();
        A00.A02 = "restrict_mode";
        AnonymousClass220 r2 = AnonymousClass220.BOOLEAN;
        C54912pU.A0c(A00, r2, r3, true);
        r3[2] = C54912pU.A05(A00, r2, "announcement_group", 0, true);
        r3[3] = C54912pU.A05(A00, r2, "no_frequently_forwarded", 0, true);
        A00.A02 = "ephemeral_duration";
        AnonymousClass220 r8 = AnonymousClass220.INTEGER;
        A00.A00 = r8;
        A00.A01 = "NULL";
        r3[4] = A00.A0x();
        C54912pU.A0D(A00, r7, "creator_jid", r3);
        r3[6] = C54912pU.A05(A00, r2, "in_app_support", 0, true);
        C54912pU.A0F(A00, r2, "is_suspended", r3);
        r3[8] = C54912pU.A05(A00, r8, "group_state", 0, true);
        r3[9] = C54912pU.A05(A00, r2, "require_membership_approval", 0, true);
        r3[10] = C54912pU.A05(A00, r8, "member_add_mode", 0, true);
        C54912pU.A0J(A00, r2, "incognito", r3);
        r3[12] = C54912pU.A05(A00, r2, "is_pending_requests_banner_acknowledged", 0, true);
        C54912pU.A0L(A00, r2, "is_report_to_admin_enabled", r3);
        C54912pU.A09(A00, r7, "addressing_mode", true);
        A00.A01 = "'pn'";
        r3[14] = A00.A0x();
        C54912pU.A0N(A00, r2, "allow_non_admin_subgroup_creation", r3);
        r3[16] = C54912pU.A05(A00, r2, "is_pending_suggestions_banner_acknowledged", 0, true);
        r3[17] = C54912pU.A05(A00, r2, "is_name_group_banner_dismissed", 0, true);
        C54912pU.A0Q(A00, r2, "history_enabled", r3);
        C54912pU.A0R(A00, r2, "auto_add_disabled", r3);
        r11.A0E("wa_group_admin_settings", r3);
    }
}
