package X;

import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.6A3  reason: invalid class name */
public class AnonymousClass6A3 implements AnonymousClass4BI {
    public Object A00;
    public final int A01;

    public AnonymousClass6A3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Ban(C50392i6 r3) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                C92274mN r0 = (C92274mN) obj;
                if (r3 != null) {
                    r0.A02 = r3;
                    r0.A01.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) obj;
                if (r3 != null) {
                    groupCallButtonController.A02 = r3;
                    C86624Kv.A1J(groupCallButtonController);
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) obj;
                if (r3 != null) {
                    quickContactActivity.A0Y = r3;
                    AnonymousClass4SG.A3n(quickContactActivity);
                    return;
                }
                return;
        }
    }
}
