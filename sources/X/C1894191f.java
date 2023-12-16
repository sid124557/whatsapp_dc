package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.91f  reason: invalid class name and case insensitive filesystem */
public class C1894191f implements MenuItem.OnActionExpandListener {
    public Object A00;
    public final int A01;

    public C1894191f(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                C89104bW r1 = (C89104bW) obj;
                r1.A0J = null;
                C89104bW.A0C(r1);
                return true;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) obj;
                contactPickerFragment.A2y = null;
                contactPickerFragment.A1c();
                return true;
            default:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) obj;
                phoneContactsSelector.A0b = null;
                phoneContactsSelector.A75();
                return true;
        }
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
