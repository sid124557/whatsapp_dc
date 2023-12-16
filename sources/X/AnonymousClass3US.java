package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.3US  reason: invalid class name */
public final class AnonymousClass3US implements C84914Ef {
    public Set B9Z(C624134x r2) {
        if (r2.A1F) {
            return Collections.singleton("s");
        }
        return null;
    }

    public AnonymousClass2M8 B9w(C56532s8 r4) {
        if (r4.A08 == null) {
            return null;
        }
        boolean booleanValue = r4.A01().booleanValue();
        AnonymousClass2M8 r1 = new AnonymousClass2M8();
        Set singleton = Collections.singleton("s");
        if (booleanValue) {
            r1.A00 = singleton;
            return r1;
        }
        r1.A01 = singleton;
        return r1;
    }

    public String B9v() {
        return "m";
    }
}
