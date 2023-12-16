package X;

/* renamed from: X.2Br  reason: invalid class name and case insensitive filesystem */
public final class C39362Br {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String[] strArr = AnonymousClass2C5.A03;
        C57212tH.A03("available_message_view", A0o, strArr);
        A00 = AnonymousClass000.A0X(" FROM newsletter_message_enforcements JOIN available_message_view WHERE newsletter_message_enforcements.message_row_id = available_message_view._id AND available_message_view.chat_row_id = ? AND available_message_view.message_type != 15", A0o);
        StringBuilder A0l = AnonymousClass000.A0l("SELECT ");
        C57212tH.A03("available_message_view", A0l, strArr);
        A01 = AnonymousClass000.A0X(" FROM newsletter_message_enforcements JOIN available_message_view WHERE newsletter_message_enforcements.message_row_id = available_message_view._id AND available_message_view.chat_row_id = ?", A0l);
    }
}
