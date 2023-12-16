package X;

import android.view.View;
import java.util.List;

/* renamed from: X.0m3  reason: invalid class name and case insensitive filesystem */
public class C12740m3 implements Runnable {
    public final /* synthetic */ C153427bI A00;
    public final /* synthetic */ AnonymousClass84O A01;
    public final /* synthetic */ List A02;

    public C12740m3(C153427bI r1, AnonymousClass84O r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        String valueOf;
        int i = -1;
        for (Object next : this.A02) {
            AnonymousClass84O r2 = this.A01;
            if (next == null) {
                valueOf = null;
            } else if (next instanceof String) {
                valueOf = (String) next;
            } else {
                valueOf = String.valueOf(next);
            }
            AnonymousClass84O A002 = AnonymousClass738.A00(r2, new AnonymousClass8DA(valueOf));
            if (A002 != null) {
                View A0G = A002.A0G(this.A00);
                if (A0G != null) {
                    A0G.setFocusable(true);
                    if (A0G.getId() == -1) {
                        A0G.setId(View.generateViewId());
                    }
                    if (i != -1) {
                        A0G.setAccessibilityTraversalAfter(i);
                    }
                    i = A0G.getId();
                } else {
                    return;
                }
            } else {
                throw AnonymousClass000.A0H(next, "Component does not exists in this hierarchy for id: ", AnonymousClass001.A0o());
            }
        }
    }
}
