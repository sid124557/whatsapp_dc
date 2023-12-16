package X;

/* renamed from: X.2Ar  reason: invalid class name and case insensitive filesystem */
public class C39102Ar {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        A0h.append(AnonymousClass2C5.A01);
        A0h.append(", deleted_msg.remove_files AS remove_files FROM ");
        A0h.append("deleted_messages_view");
        A0h.append(" AS deleted_msg  WHERE ");
        A0h.append("chat_row_id");
        A0h.append(" = ? AND ");
        A0h.append("message_type");
        A0h.append(" != ");
        A0h.append(8);
        A0h.append(" ORDER BY sort_id ASC");
        A00 = AnonymousClass000.A0X(" LIMIT ?", A0h);
    }
}
