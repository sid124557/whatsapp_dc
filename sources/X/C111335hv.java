package X;

import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.5hv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111335hv implements C181548mw {
    public final /* synthetic */ ContactPickerFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final void BP1() {
        ContactPickerFragment contactPickerFragment = this.A00;
        String str = this.A01;
        int i = 20;
        if (this.A02) {
            i = 19;
        }
        contactPickerFragment.A1F.A01(contactPickerFragment.A1D(), Integer.valueOf(i), str, "sms:");
    }

    public /* synthetic */ C111335hv(ContactPickerFragment contactPickerFragment, String str, boolean z) {
        this.A00 = contactPickerFragment;
        this.A01 = str;
        this.A02 = z;
    }
}
