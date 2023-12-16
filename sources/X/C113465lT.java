package X;

import java.text.Format;
import java.text.SimpleDateFormat;

/* renamed from: X.5lT  reason: invalid class name and case insensitive filesystem */
public class C113465lT implements C182348oG {
    public Format B7o(C620733j r4) {
        try {
            return new SimpleDateFormat("LLLL yyyy", C620733j.A02(r4));
        } catch (IllegalArgumentException unused) {
            return new SimpleDateFormat("MMMM yyyy", C620733j.A02(r4));
        }
    }
}
