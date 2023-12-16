package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.inappbugreporting.BugReportingCategoriesActivity;

/* renamed from: X.90s  reason: invalid class name and case insensitive filesystem */
public class C1892890s implements C183518qA {
    public Object A00;
    public final int A01;

    public C1892890s(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BZI(String str) {
        if (this.A01 != 0) {
            C162457s7.A0J(str, 0);
            AnonymousClass4XE r0 = ((BugReportingCategoriesActivity) this.A00).A01;
            if (r0 == null) {
                throw C18270x1.A0S("bugCategoryListAdapter");
            }
            r0.getFilter().filter(str);
            return;
        }
        ((ContactPickerFragment) this.A00).A1w(str);
    }
}
