package X;

/* renamed from: X.1gR  reason: invalid class name */
public class AnonymousClass1gR extends C56202rb {
    public String A00;
    public final String A01;

    public AnonymousClass1gR(C55682qk r15, C56612sH r16, AnonymousClass4FV r17, C55892r5 r18, Integer num, Integer num2, String str, String str2, long j, long j2) {
        super(r15, r16, r17, r18, num, num2, str, 2, j, j2);
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18310x6.A1O(A0o, "LoggableNotificationStanza");
        A0o.append(super.toString());
        A0o.append("; type=");
        A0o.append(this.A01);
        A0o.append("; subType=");
        A0o.append(this.A00);
        return AnonymousClass000.A0e(A0o);
    }
}
