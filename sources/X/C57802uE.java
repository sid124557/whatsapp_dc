package X;

/* renamed from: X.2uE  reason: invalid class name and case insensitive filesystem */
public final class C57802uE {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        AnonymousClass0x2.A1O(A0h, C57212tH.A01("message", AnonymousClass2C5.A03));
        A0h.append("available_message_view AS message");
        A0h.append(" JOIN ");
        A0h.append("chat AS chat");
        AnonymousClass0x2.A1P(A0h, " ON message.chat_row_id = chat._id");
        String A0p = C18310x6.A0p("message.from_me = 0", A0h);
        A0h.append("status != 16");
        A0h.append(A0p);
        A0h.append("status != 10");
        A0h.append(A0p);
        A0h.append("(chat.last_read_message_sort_id >= message.sort_id OR status = 17)");
        A0h.append(A0p);
        A0h.append("chat.last_read_receipt_sent_message_sort_id < message.sort_id");
        A0h.append(A0p);
        A0h.append("chat.last_read_receipt_sent_message_row_id > 0");
        A0h.append(A0p);
        A0h.append("message.message_type NOT IN ('8', '10', '15')");
        A0h.append(A0p);
        A0h.append("(chat.hidden IS NULL OR chat.hidden = 0)");
        A0h.append(" ORDER BY message.sort_id DESC");
        A00 = AnonymousClass000.A0X(" LIMIT 4096", A0h);
    }
}
