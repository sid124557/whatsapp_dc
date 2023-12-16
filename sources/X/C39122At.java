package X;

/* renamed from: X.2At  reason: invalid class name and case insensitive filesystem */
public final class C39122At {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        AnonymousClass0x2.A1O(A0h, AnonymousClass2C5.A01);
        A0h.append("message_edit_info");
        A0h.append(" JOIN message_view ON ");
        AnonymousClass0x2.A1P(A0h, "message_view._id = message_edit_info.message_row_id");
        A0h.append("original_key_id = ? AND ");
        A0h.append("chat_row_id = ? AND ");
        A00 = AnonymousClass000.A0X("from_me = ?", A0h);
    }
}
