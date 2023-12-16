package X;

import java.util.Map;

/* renamed from: X.1gU  reason: invalid class name */
public class AnonymousClass1gU extends C56202rb {
    public static final Map A01 = new C73333fK();
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1gU(C55682qk r17, C56612sH r18, AnonymousClass4FV r19, C55892r5 r20, Integer num, Integer num2, String str, String str2, long j, long j2) {
        super(r17, r18, r19, r20, num, num2, str, 3, j, j2);
        int i;
        Map map = A01;
        String str3 = str2;
        if (map.containsKey(str3)) {
            i = AnonymousClass001.A0K(C18320x8.A0Z(map, str3));
        } else {
            i = 18;
        }
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18310x6.A1O(A0o, "LoggableCallStanza");
        A0o.append(super.toString());
        A0o.append("; type=");
        A0o.append(this.A00);
        return AnonymousClass000.A0e(A0o);
    }
}
