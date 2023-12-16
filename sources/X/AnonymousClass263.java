package X;

/* renamed from: X.263  reason: invalid class name */
public final class AnonymousClass263 {
    public static String A00(int i) {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        AnonymousClass0x2.A1O(A0h, C57212tH.A01("group_participant_user", new String[]{"group_jid_row_id", "user_jid_row_id"}));
        A0h.append("group_participant_user");
        AnonymousClass0x2.A1P(A0h, " JOIN (  SELECT group_jid_row_id FROM group_participant_user WHERE user_jid_row_id = ? ) as meSubSelect ON group_participant_user.group_jid_row_id = meSubSelect.group_jid_row_id");
        A0h.append("user_jid_row_id");
        C57212tH.A02(" IN ", A0h, i);
        return A0h.toString();
    }
}
