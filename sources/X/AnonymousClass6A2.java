package X;

import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.6A2  reason: invalid class name */
public class AnonymousClass6A2 implements AnonymousClass49R {
    public Object A00;
    public final int A01;

    public AnonymousClass6A2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BUv(C53312mt r4) {
        switch (this.A01) {
            case 0:
                C92274mN r2 = (C92274mN) this.A00;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("groupconversationmenu/fetchJoinableCallLogCallback groupJid: ");
                C18260x0.A0o(r2.A0V, A0o);
                if (!AnonymousClass75J.A00(r4, r2.A04)) {
                    r2.A04 = r4;
                    if (r4 != null) {
                        r2.A07(r4.A00);
                    }
                    r2.A01.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) this.A00;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("GroupCallButtonController/fetchJoinableCallLogCallback groupJid: ");
                C18260x0.A0o(groupCallButtonController.A06, A0o2);
                if (!AnonymousClass75J.A00(r4, groupCallButtonController.A09)) {
                    groupCallButtonController.A09 = r4;
                    if (r4 != null) {
                        groupCallButtonController.A00(r4.A00);
                    }
                }
                C86624Kv.A1J(groupCallButtonController);
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                if (r4 != null) {
                    quickContactActivity.A0z = r4;
                    quickContactActivity.A74();
                    AnonymousClass4SG.A3n(quickContactActivity);
                    return;
                }
                return;
        }
    }
}
