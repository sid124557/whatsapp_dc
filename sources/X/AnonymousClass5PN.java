package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.5PN  reason: invalid class name */
public class AnonymousClass5PN {
    public final Map A00;

    public void A00(Context context, C624134x r7) {
        AnonymousClass39W B5s;
        AnonymousClass39P r2;
        AnonymousClass391 r0;
        if (!(!(r7 instanceof AnonymousClass4DV) || (B5s = ((AnonymousClass4DV) r7).B5s()) == null || (r2 = B5s.A03) == null)) {
            if (r2.A01 != 2 || (r0 = r2.A00) == null) {
                if (r2.A03.size() > 0 && ((AnonymousClass395) B5s.A03.A03.get(0)).A00) {
                    return;
                }
            } else if (r0.A00) {
                return;
            }
        }
        A01(context, r7, 0);
    }

    public void A01(Context context, C624134x r6, int i) {
        AnonymousClass39W B5s;
        int i2;
        Map map;
        int i3;
        if ((r6 instanceof AnonymousClass4DV) && (B5s = ((AnonymousClass4DV) r6).B5s()) != null && (i2 = B5s.A00) != 0) {
            switch (i2) {
                case 1:
                    map = this.A00;
                    i3 = 2;
                    break;
                case 2:
                case 6:
                    map = this.A00;
                    i3 = 1;
                    break;
                case 3:
                    map = this.A00;
                    i3 = 3;
                    break;
                case 4:
                    map = this.A00;
                    i3 = 4;
                    break;
                case 5:
                case 7:
                    map = this.A00;
                    i3 = 5;
                    break;
                default:
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("InteractiveMessageCallToAction/performAction/message type: ");
                    A0o.append(i2);
                    C18260x0.A1J(A0o, " is unsupported");
                    return;
            }
            ((C182268o8) AnonymousClass001.A0i(map, i3)).Bgi(context, r6, B5s, i);
        }
    }

    public AnonymousClass5PN(Map map) {
        this.A00 = map;
    }
}
