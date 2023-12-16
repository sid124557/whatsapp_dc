package X;

/* renamed from: X.2uh  reason: invalid class name and case insensitive filesystem */
public final class C58092uh {
    public static final String A00;
    public static final String A01;
    public static final String A02;

    static {
        String[] strArr = AnonymousClass2C5.A03;
        String A012 = C57212tH.A01("available_message_view", strArr);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("\n              SELECT ");
        A0o.append(A012);
        A02 = C830345w.A08(AnonymousClass000.A0X("\n              FROM message_comment\n              JOIN available_message_view\n              WHERE message_comment.message_row_id = available_message_view._id\n                AND\n                parent_message_row_id = ?\n                AND\n                sort_id < ?\n              ORDER BY sort_id DESC\n              LIMIT ?\n          ", A0o));
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("\n        SELECT\n            ");
        C57212tH.A03("available_message_view", A0o2, strArr);
        A00 = C830345w.A08(AnonymousClass000.A0X("\n        FROM message_comment\n        JOIN available_message_view \n        WHERE\n            message_comment.message_row_id = available_message_view._id\n            AND\n            parent_message_row_id = ?\n        ORDER BY sort_id\n        DESC\n        ", A0o2));
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("\n        SELECT \n            ");
        C57212tH.A03("available_message_view", A0o3, strArr);
        A01 = C830345w.A08(AnonymousClass000.A0X("\n        FROM message_comment \n        JOIN available_message_view \n        WHERE\n            message_comment.message_row_id = available_message_view._id\n            AND\n            parent_message_row_id = ?\n        ORDER BY sort_id\n        DESC \n        LIMIT ?\n        ", A0o3));
    }
}
