package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.profile.ViewProfilePhoto;
import com.whatsapp.util.Log;

/* renamed from: X.8zv  reason: invalid class name and case insensitive filesystem */
public class C189058zv extends C54232oO {
    public Object A00;
    public final int A01;

    public C189058zv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01(C95814uZ r2) {
        if (2 - this.A01 != 0) {
            super.A01(r2);
        } else {
            ((AnonymousClass7XG) this.A00).A04.A0L(r2);
        }
    }

    public void A02(C95814uZ r3) {
        switch (this.A01) {
            case 0:
                Log.d("statusrecipients/onContactsChanged");
                ((C89104bW) this.A00).A79();
                return;
            case 1:
                ContactPickerFragment.A00((ContactPickerFragment) this.A00);
                return;
            case 2:
                ((AnonymousClass7XG) this.A00).A04.A0L(r3);
                return;
            case 3:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                groupAdminPickerActivity.A77(groupAdminPickerActivity.A0M);
                return;
            case 4:
                ((C111445i6) this.A00).A0h.A05();
                return;
            default:
                ViewProfilePhoto.A0C((ViewProfilePhoto) this.A00);
                return;
        }
    }
}
