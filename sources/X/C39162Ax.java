package X;

/* renamed from: X.2Ax  reason: invalid class name and case insensitive filesystem */
public final class C39162Ax {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        String[] strArr = AnonymousClass2C5.A03;
        AnonymousClass0x2.A1O(A0h, C57212tH.A01("message", strArr));
        A0h.append("message_view AS message");
        A0h.append(" JOIN ");
        C18300x5.A1P(A0h, "status AS status_list");
        AnonymousClass0x2.A1P(A0h, "status_list.jid_row_id = message.sender_jid_row_id");
        String A0p = C18310x6.A0p("message.chat_row_id = ?", A0h);
        A0h.append("message.from_me = 0");
        A0h.append(A0p);
        A0h.append("status_list.last_read_message_table_id >= message._id");
        A0h.append(A0p);
        A0h.append("status_list.last_read_receipt_sent_message_table_id < message._id");
        A0h.append(A0p);
        A0h.append("status_list.last_read_receipt_sent_message_table_id > 0");
        A0h.append(A0p);
        A0h.append("message.message_type != 15");
        A0h.append(" ORDER BY message.");
        A0h.append("_id");
        A00 = AnonymousClass000.A0X(" DESC LIMIT 4096", A0h);
        C57212tH.A01("message", strArr);
    }
}
