package X;

import android.net.Uri;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5i4  reason: invalid class name and case insensitive filesystem */
public class C111425i4 implements C185388tZ {
    public boolean A00 = false;
    public final ArrayList A01 = AnonymousClass001.A0s();
    public final ArrayList A02 = AnonymousClass001.A0s();
    public final /* synthetic */ ContactPickerFragment A03;
    public final /* synthetic */ List A04;

    public void BSk() {
        this.A00 = true;
    }

    public C111425i4(ContactPickerFragment contactPickerFragment, List list) {
        this.A03 = contactPickerFragment;
        this.A04 = list;
    }

    public final void A00() {
        ArrayList arrayList = this.A02;
        int size = arrayList.size() + this.A01.size();
        ContactPickerFragment contactPickerFragment = this.A03;
        if (size == contactPickerFragment.A2z.size()) {
            if (!arrayList.isEmpty() && !this.A00) {
                C111355hx r0 = contactPickerFragment.A19;
                r0.A00.Bqv(this.A04);
            }
            C111355hx.A01(contactPickerFragment);
        }
    }

    public boolean AyS() {
        return false;
    }

    public void Bf3(Uri uri) {
        this.A01.add(uri);
        A00();
    }

    public void Bf4(Uri uri) {
        this.A02.add(uri);
        A00();
    }
}
