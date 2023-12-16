package X;

/* renamed from: X.35h  reason: invalid class name and case insensitive filesystem */
public class C625035h {
    public static String A00 = A01((byte) 68);
    public static String A01;
    public static final String A02;
    public static final String A03 = AnonymousClass000.A0U(C57212tH.A01("message_add_on_orphan", C66153Kg.A00), " FROM ", "message_add_on_orphan", AnonymousClass000.A0l("SELECT "));
    public static final String A04;
    public static final String A05;
    public static final String A06;

    public static String A00(byte b) {
        String str;
        String A012;
        String str2;
        StringBuilder A0l;
        if (b == 56) {
            str = "message_add_on_reaction";
            A012 = C57212tH.A01(str, C66183Kj.A00);
            str2 = "message_add_on_reaction.message_add_on_row_id";
        } else if (b == 67) {
            str = "message_add_on_poll_vote";
            A012 = C57212tH.A01(str, C66173Ki.A00);
            str2 = "message_add_on_poll_vote.message_add_on_row_id";
        } else if (b == 68) {
            str = "message_add_on_keep_in_chat";
            A012 = C57212tH.A01(str, C66143Kf.A00);
            str2 = "message_add_on_keep_in_chat.message_add_on_row_id";
        } else if (b == 79) {
            str = "message_add_on_pin_in_chat";
            A012 = C57212tH.A01(str, C66163Kh.A00);
            str2 = "message_add_on_pin_in_chat.message_add_on_row_id";
        } else if (b == 74) {
            A0l = AnonymousClass000.A0l("SELECT ");
            AnonymousClass001.A1K(C57212tH.A01("message_add_on", C66203Kl.A00), " FROM ", "message_add_on", A0l);
            return AnonymousClass000.A0X(" ", A0l);
        } else if (b == 86) {
            str = "message_add_on_scheduled_call_edit";
            A012 = C57212tH.A01(str, C66193Kk.A00);
            str2 = "message_add_on_scheduled_call_edit.message_add_on_row_id";
        } else if (b == 93) {
            str = "message_add_on_event_response";
            A012 = C57212tH.A01(str, C39112As.A00);
            str2 = "message_add_on_event_response.message_add_on_row_id";
        } else {
            throw AnonymousClass000.A0G("Not supported type :", AnonymousClass001.A0o(), b);
        }
        A0l = AnonymousClass000.A0l("SELECT ");
        C57212tH.A03("message_add_on", A0l, C66203Kl.A00);
        C18260x0.A0p(",", A012, " FROM ", "message_add_on", A0l);
        A0l.append(" LEFT JOIN ");
        C18300x5.A1P(A0l, str);
        A0l.append("message_add_on._id = ");
        A0l.append(str2);
        return AnonymousClass000.A0X(" ", A0l);
    }

    public static String A01(byte b) {
        String str = "SELECT COUNT(message_add_on._id) as unread_count, MAX(message_add_on._id) as last_message_add_on_row_id, message_add_on.parent_message_row_id as parent_message_row_id FROM message_add_on";
        if (b == 68) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" LEFT JOIN ");
            C18300x5.A1P(A0l, "message_add_on_keep_in_chat");
            str = AnonymousClass000.A0X("message_add_on._id=message_add_on_keep_in_chat.message_add_on_row_id", A0l);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x2.A1P(A0o, str);
        String A0p = C18310x6.A0p("message_add_on.chat_row_id = ?", A0o);
        C18270x1.A19("message_add_on.message_add_on_type = ", A0p, A0o, b);
        A0o.append("message_add_on.status = ?");
        A0o.append(A0p);
        A0o.append("message_add_on.from_me = 0");
        A0o.append(A0p);
        A0o.append("message_add_on._id > ?");
        A0o.append(A0p);
        String A0X = AnonymousClass000.A0X("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0o);
        if (b == 68) {
            StringBuilder A0m = AnonymousClass000.A0m(A0X, A0p);
            A0m.append("message_add_on_keep_in_chat.keep_in_chat_state=1");
            A0m.append(A0p);
            A0X = AnonymousClass000.A0X("message_add_on_keep_in_chat.keep_count <= 1", A0m);
        }
        StringBuilder A0l2 = AnonymousClass000.A0l(A0X);
        A0l2.append(" GROUP BY ");
        C18320x8.A1L(A0l2, "message_add_on.parent_message_row_id");
        A0l2.append("last_message_add_on_row_id");
        return AnonymousClass000.A0X(" DESC LIMIT ?", A0l2);
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String[] strArr = C66203Kl.A00;
        C57212tH.A03("message_add_on", A0o, strArr);
        A0o.append(" FROM ");
        A0o.append("message_add_on");
        A0o.append(" WHERE ");
        A0o.append("message_add_on.chat_row_id");
        A0o.append(" = ? AND ");
        A0o.append("message_add_on.key_id");
        A0o.append(" = ? AND ");
        A0o.append("message_add_on.from_me");
        A0o.append(" = ? AND ");
        A05 = AnonymousClass000.A0X("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0o);
        StringBuilder A0l = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C57212tH.A01("message_add_on", strArr), " FROM ", "message_add_on", " WHERE ", A0l);
        A0l.append("message_add_on._id = ?");
        A04 = AnonymousClass000.A0V(" AND ", "(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0l);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("SELECT DISTINCT ");
        AnonymousClass001.A1K(C57212tH.A01("message_view", AnonymousClass2C5.A03), " FROM ", "message_add_on", A0o2);
        A0o2.append(" JOIN ");
        C18300x5.A1P(A0o2, "message_view");
        C18300x5.A1O(A0o2, "message_add_on.parent_message_row_id");
        A0o2.append("message_view._id");
        A0o2.append(" WHERE ");
        A0o2.append("message_add_on.expiry_timestamp <= ? AND message_add_on.expiry_timestamp != 0 AND message_add_on.expiry_timestamp is not null");
        A06 = AnonymousClass000.A0X(" LIMIT ?", A0o2);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("SELECT COUNT(*) as count FROM message_add_on JOIN message_add_on_pin_in_chat ON message_add_on._id = message_add_on_pin_in_chat.message_add_on_row_id ");
        A02 = AnonymousClass000.A0X(" WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = 79 AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0) AND message_add_on_pin_in_chat.pin_in_chat_state = 1", A0o3);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("SELECT _id FROM message_add_on WHERE ");
        A01 = AnonymousClass000.A0X("message_add_on_type=11 AND key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", A0o4);
    }

    public static String A02(byte b) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x2.A1P(A0o, A00(b));
        String A0p = C18310x6.A0p("message_add_on.chat_row_id = ?", A0o);
        C18270x1.A19("message_add_on.message_add_on_type = ", A0p, A0o, b);
        A0o.append("message_add_on._id > ?");
        A0o.append(A0p);
        A0o.append("message_add_on.from_me = 0");
        A0o.append(A0p);
        return AnonymousClass000.A0X("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0o);
    }

    public static String A03(byte b, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT  DISTINCT (message_add_on.sender_jid_row_id), message_add_on.parent_message_row_id FROM message_add_on WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = ");
        A0o.append(b);
        A0o.append(" AND ");
        A0o.append("message_add_on.status = ?");
        A0o.append(" AND ");
        A0o.append("message_add_on.from_me = 0");
        A0o.append(" AND ");
        A0o.append("message_add_on._id > ?");
        A0o.append(" AND ");
        C57212tH.A02("message_add_on.parent_message_row_id IN ", A0o, i);
        A0o.append(" AND ");
        return AnonymousClass000.A0X("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0o);
    }
}
