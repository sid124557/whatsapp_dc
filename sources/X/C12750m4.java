package X;

import android.view.View;

/* renamed from: X.0m4  reason: invalid class name and case insensitive filesystem */
public class C12750m4 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C153427bI A01;
    public final /* synthetic */ Object A02;

    public C12750m4(View view, C153427bI r2, Object obj) {
        this.A02 = obj;
        this.A01 = r2;
        this.A00 = view;
    }

    public void run() {
        String valueOf;
        Object obj = this.A02;
        if (obj instanceof String) {
            valueOf = (String) obj;
        } else {
            valueOf = String.valueOf(obj);
        }
        C153427bI r2 = this.A01;
        AnonymousClass84O A002 = AnonymousClass738.A00(C162377rs.A02(r2).A03(), new AnonymousClass8DA(valueOf));
        if (A002 != null) {
            View A0G = A002.A0G(r2);
            if (A0G == null) {
                C159737mN.A01("AccessibilityUtils", AnonymousClass000.A0V("No View found for component with id: ", valueOf, AnonymousClass001.A0o()));
                return;
            }
            int id = A0G.getId();
            if (id == -1) {
                id = View.generateViewId();
                A0G.setId(id);
            }
            AnonymousClass0YH.A05(this.A00, id);
            return;
        }
        throw AnonymousClass001.A0e(String.format("Component does not exist in the hierarchy for id: %s. Is the component with this ID not yet rendered? If so, this will not work.", AnonymousClass000.A1b(valueOf)));
    }
}
