package X;

import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.90m  reason: invalid class name and case insensitive filesystem */
public class C1892290m implements AnonymousClass4AQ {
    public Object A00;
    public final int A01;

    public C1892290m(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BLi(C95814uZ r3) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C97564yl r1 = (C97564yl) obj;
            AnonymousClass3ZH r0 = r1.A09;
            if (r0 != null) {
                C95814uZ A0H = r0.A0H();
                C626936e.A06(A0H);
                if (A0H.equals(r3)) {
                    r1.A5T();
                    return;
                }
                return;
            }
            return;
        }
        GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) obj;
        C27991fJ r02 = groupAdminPickerActivity.A0L;
        C626936e.A06(r02);
        if (r02.equals(r3)) {
            groupAdminPickerActivity.A76();
            groupAdminPickerActivity.A77(groupAdminPickerActivity.A0M);
        }
    }
}
