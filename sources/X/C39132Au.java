package X;

/* renamed from: X.2Au  reason: invalid class name and case insensitive filesystem */
public final class C39132Au {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        A0h.append(AnonymousClass2C5.A01);
        AnonymousClass001.A1M(A0h);
        AnonymousClass0x2.A1O(A0h, "links.link_index AS link_index");
        A0h.append("available_message_view AS message, ");
        AnonymousClass0x2.A1P(A0h, "(SELECT message_row_id, link_index FROM message_link AS link WHERE link.chat_row_id = ?) links");
        A0h.append("message._id = links.message_row_id");
        A00 = AnonymousClass000.A0X(" ORDER BY sort_id DESC", A0h);
    }
}
