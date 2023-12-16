package X;

import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.69t  reason: invalid class name and case insensitive filesystem */
public class C1237869t implements C84904Ee {
    public Object A00;
    public final int A01;

    public C1237869t(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Avq(long j, int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                C92274mN r3 = (C92274mN) obj;
                C50392i6 r0 = r3.A02;
                if (r0 != null && r0.A02 == j && i != 0) {
                    r3.A02 = null;
                    r3.A01.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) obj;
                C50392i6 r02 = groupCallButtonController.A02;
                if (r02 != null && r02.A02 == j && i != 0) {
                    groupCallButtonController.A02 = null;
                    C86624Kv.A1J(groupCallButtonController);
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) obj;
                C50392i6 r03 = quickContactActivity.A0Y;
                if (r03 != null && r03.A02 == j && i != 0) {
                    quickContactActivity.A0Y = null;
                    AnonymousClass4SG.A3n(quickContactActivity);
                    return;
                }
                return;
        }
    }

    public void Avr(C95814uZ r3, String str, int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                C92274mN r1 = (C92274mN) obj;
                if (r1.A02 != null && r3.equals(r1.A0W) && str.equals(r1.A02.A07)) {
                    r1.A02 = null;
                    r1.A01.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) obj;
                if (groupCallButtonController.A02 != null && r3.equals(groupCallButtonController.A06) && str.equals(groupCallButtonController.A02.A07)) {
                    groupCallButtonController.A02 = null;
                    C86624Kv.A1J(groupCallButtonController);
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) obj;
                if (quickContactActivity.A0Y != null && r3.equals(quickContactActivity.A0h) && str.equals(quickContactActivity.A0Y.A07)) {
                    quickContactActivity.A0Y = null;
                    AnonymousClass4SG.A3n(quickContactActivity);
                    return;
                }
                return;
        }
    }

    public void Bao(C50392i6 r4) {
        switch (this.A01) {
            case 0:
                C92274mN r2 = (C92274mN) this.A00;
                if (r2.A0V.equals(r4.A04)) {
                    r2.A02 = r4;
                    r2.A01.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                C95814uZ r22 = r4.A04;
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) this.A00;
                if (r22.equals(groupCallButtonController.A06)) {
                    groupCallButtonController.A02 = r4;
                    C86624Kv.A1J(groupCallButtonController);
                    return;
                }
                return;
            default:
                C95814uZ r23 = r4.A04;
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                if (r23.equals(quickContactActivity.A0h)) {
                    quickContactActivity.A0Y = r4;
                    AnonymousClass4SG.A3n(quickContactActivity);
                    return;
                }
                return;
        }
    }
}
