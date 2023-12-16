package X;

import java.util.Set;

/* renamed from: X.2uk  reason: invalid class name and case insensitive filesystem */
public abstract class C58122uk {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String str = AnonymousClass2C5.A01;
        String A10 = AnonymousClass0x9.A10(str, A0o);
        A0o.append("message_view");
        A02 = AnonymousClass000.A0X(" WHERE chat_row_id=? AND from_me=? AND key_id=?", A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18260x0.A0p("SELECT ", str, A10, "message_view", A0o2);
        A0o2.append(" WHERE ");
        String A0p = C18310x6.A0p("chat_row_id = ?", A0o2);
        A0o2.append("from_me = ?");
        A0o2.append(A0p);
        A03 = AnonymousClass000.A0X("key_id = ?", A0o2);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        AnonymousClass001.A1K("SELECT ", str, A10, A0o3);
        A0o3.append("message_system AS message_system");
        A0o3.append(" JOIN ");
        A0o3.append("available_message_view AS message");
        C18260x0.A0p(" ON message_system.message_row_id = message._id", " WHERE ", "chat_row_id = ?", A0p, A0o3);
        A0o3.append("from_me = 1");
        A0o3.append(A0p);
        A0o3.append("message_type = 7");
        A0o3.append(A0p);
        A0o3.append("message_system.action_type = 6");
        A0o3.append(" ORDER BY sort_id DESC");
        A00 = AnonymousClass000.A0X(" LIMIT 1", A0o3);
        StringBuilder A0B = C18260x0.A0B("SELECT ", str, A10, "message_system AS message_system", " JOIN ");
        A0B.append("available_message_view AS message");
        AnonymousClass001.A1K(" WHERE message_system.message_row_id = message._id", A0p, "chat_row_id = ?", A0B);
        A0B.append(A0p);
        A0B.append("from_me = 1");
        A0B.append(A0p);
        C18260x0.A0p("message_type = 7", A0p, "message_system.action_type = 6", " ORDER BY sort_id DESC", A0B);
        A01 = AnonymousClass000.A0X(" LIMIT 1", A0B);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        C18260x0.A0p("SELECT ", str, A10, "available_message_view AS message", A0o4);
        A0o4.append(" LEFT JOIN ");
        A0o4.append("message_system");
        AnonymousClass001.A1K(" AS message_system", " ON message_system.message_row_id = message._id", " LEFT JOIN ", A0o4);
        A0o4.append("message_system_group");
        A0o4.append(" AS system_group");
        A0o4.append(" ON message_system.message_row_id = system_group.message_row_id");
        A0o4.append(" WHERE ");
        A0o4.append("message.chat_row_id = ?");
        A0o4.append(A0p);
        A0o4.append("message.message_type NOT IN ('8' , '10' , '36' , '77' , '90' , '12')");
        A0o4.append(" AND (");
        A0o4.append("message.from_me = 0 OR (message_system.action_type = 4 AND system_group.is_me_joined = 1) OR (message_system.action_type = 12 AND system_group.is_me_joined = 1))");
        A0o4.append(" AND (view_mode IS NULL OR view_mode = 0) ");
        A04 = AnonymousClass000.A0V(" ORDER BY sort_id", " DESC LIMIT ?", A0o4);
        C183538qC r2 = AnonymousClass34J.A00;
        C57212tH.A00(((Set) r2.get()).size());
        StringBuilder A0o5 = AnonymousClass001.A0o();
        A0o5.append("SELECT _id FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE _id > ?  AND chat_row_id = ?  AND action_type IN ");
        A05 = AnonymousClass000.A0X(C57212tH.A00(((Set) r2.get()).size()), A0o5);
        C135166kE.A00.getRawString();
    }

    public C58122uk() {
        throw null;
    }
}
