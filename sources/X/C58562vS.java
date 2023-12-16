package X;

/* renamed from: X.2vS  reason: invalid class name and case insensitive filesystem */
public class C58562vS {
    public final C56612sH A00;
    public final C46392bY A01;
    public final AnonymousClass1RJ A02;

    public C58562vS(C56612sH r1, C46392bY r2, AnonymousClass1RJ r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static String A00(AnonymousClass2z0 r2) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("msg_key_remote_jid = ? AND recipient_id = ? AND recipient_type = ? AND device_id = ? AND msg_key_from_me");
        if (r2.A02) {
            str = " != ";
        } else {
            str = " = ";
        }
        A0o.append(str);
        A0o.append("0 AND ");
        A0o.append("msg_key_id");
        return AnonymousClass000.A0X(" = ?", A0o);
    }
}
