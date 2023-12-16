package X;

import android.text.TextUtils;

@Deprecated
/* renamed from: X.3Ku  reason: invalid class name and case insensitive filesystem */
public class C66293Ku implements AnonymousClass4ED, C838049v {
    public void B17(C56862sg r11, C41492Kl r12) {
        String str;
        String str2;
        C56862sg r4 = r11;
        String A00 = C626235v.A00(r11, "table", "message_quoted_group_invite");
        boolean A1U = C18320x8.A1U(C626235v.A00(r11, "table", "message_quoted_group_invite_legacy"));
        boolean A1U2 = C18320x8.A1U(A00);
        if (!A1U) {
            if (A1U2) {
                str = "ALTER TABLE message_quoted_group_invite RENAME TO message_quoted_group_invite_legacy";
                str2 = "ALTER_NAME_FOR_QUOTED_GROUP_INVITELEGACY_TABLE";
            } else {
                str = "CREATE TABLE message_quoted_group_invite_legacy (message_row_id INTEGER PRIMARY KEY, group_jid_row_id INTEGER NOT NULL, admin_jid_row_id INTEGER NOT NULL, group_name TEXT, invite_code TEXT, expiration INTEGER, invite_time INTEGER, expired INTEGER, group_type INTEGER NOT NULL DEFAULT 0)";
                str2 = "CREATE_QUOTED_GROUP_INVITE_MESSAGE_TABLE_LEGACY";
            }
            r11.A0H(str, str2);
        }
        String A002 = C626235v.A00(r11, "table", "message_quoted_group_invite_legacy");
        if (!TextUtils.isEmpty(A002)) {
            C626235v.A05(r4, A002, "message_quoted_group_invite_legacy", "group_type", "INTEGER NOT NULL DEFAULT 0", "LegacyQuotedGroupInviteTable");
        }
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3j(C41492Kl r1, C56622sI r2) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
