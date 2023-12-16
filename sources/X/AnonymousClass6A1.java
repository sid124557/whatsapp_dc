package X;

import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.6A1  reason: invalid class name */
public class AnonymousClass6A1 implements C1224164h {
    public Object A00;
    public final int A01;

    public AnonymousClass6A1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BO4(AnonymousClass3ZF r4) {
        switch (this.A01) {
            case 0:
                C92274mN r2 = (C92274mN) this.A00;
                r2.A03 = r4;
                r2.A0K.Brj(r4);
                if (r4 != null && r4.A0H == 2) {
                    r2.A01.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) this.A00;
                if (!AnonymousClass75J.A00(r4, groupCallButtonController.A08)) {
                    groupCallButtonController.A08 = r4;
                    C86624Kv.A1J(groupCallButtonController);
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                quickContactActivity.A0w = r4;
                AnonymousClass4SG.A3n(quickContactActivity);
                return;
        }
    }
}
