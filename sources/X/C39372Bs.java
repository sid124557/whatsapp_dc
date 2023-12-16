package X;

import java.util.Arrays;

/* renamed from: X.2Bs  reason: invalid class name and case insensitive filesystem */
public final class C39372Bs {
    public static final String A00;
    public static final byte[] A01;

    static {
        byte[] bArr = {1, 3, 13, 9, 25, 26, 28, 29, 42, 43};
        A01 = bArr;
        String arrays = Arrays.toString(bArr);
        String substring = arrays.substring(1, arrays.length() - 1);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(" SELECT message_thumbnail.message_row_id FROM message_thumbnail INNER JOIN available_message_view WHERE message_thumbnail.message_row_id = available_message_view._id AND available_message_view.message_type IN (");
        A0o.append(substring);
        A00 = AnonymousClass000.A0e(A0o);
    }
}
