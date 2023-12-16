package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.3XQ  reason: invalid class name */
public final class AnonymousClass3XQ implements C84184Bj {
    public void Bgk(Activity activity, C41182Jg r6, Map map) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (map != null) {
            if (map.containsKey("is_intermediate_screen")) {
                z2 = C18280x3.A1Y(map, "is_intermediate_screen");
            } else {
                z2 = false;
            }
            if (map.containsKey("show_loading")) {
                z3 = C18280x3.A1Y(map, "show_loading");
            }
            z = z3;
            z3 = z2;
        } else {
            z = false;
        }
        if (activity instanceof C84734Dm) {
            C84734Dm r5 = (C84734Dm) activity;
            r5.Bnb(z3);
            r5.Bnc(z);
        }
    }
}
