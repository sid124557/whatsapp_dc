package X;

/* renamed from: X.2Av  reason: invalid class name and case insensitive filesystem */
public final class C39142Av {
    public static final String A00;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("\n           SELECT ");
        String[] strArr = C66133Ke.A00;
        C57212tH.A03("message_orphan", A0o, strArr);
        A00 = AnonymousClass000.A0X("\n           FROM message_orphan\n           WHERE \n              orphan_message_type = ? \n              AND _id > ?\n           ORDER BY _id ASC \n           LIMIT ?\n      ", A0o);
        C57212tH.A01("message_orphan", strArr);
    }
}
