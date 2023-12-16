package X;

import java.lang.ref.Reference;
import java.util.Map;

/* renamed from: X.932  reason: invalid class name */
public class AnonymousClass932 implements C15800rx {
    public final int A00;

    public AnonymousClass932(int i) {
        this.A00 = i;
    }

    public final boolean Bqd(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                i = ((C54562ov) ((Map.Entry) obj).getKey()).A01;
                break;
            case 1:
                i = ((C54562ov) obj).A01;
                break;
            default:
                return AnonymousClass000.A1X(((Reference) ((Map.Entry) obj).getValue()).get());
        }
        return !AnonymousClass000.A1T(i);
    }
}
