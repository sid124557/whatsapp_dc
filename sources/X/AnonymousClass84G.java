package X;

import java.util.Map;

/* renamed from: X.84G  reason: invalid class name */
public class AnonymousClass84G implements C180478l8 {
    public final C181918nZ A00;

    public void Bjb(C141226vE r10, String str, String str2, Throwable th, Map map, int i) {
        String str3;
        C181918nZ r0 = this.A00;
        if (r0 != null) {
            if (th != null) {
                str3 = th.toString();
            } else {
                str3 = "Undefined error";
            }
            r0.Bje(str2, str3, (String) null, "", "", str, (Map) null, 0);
        }
    }

    public AnonymousClass84G(C181918nZ r1) {
        this.A00 = r1;
    }
}
