package X;

import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.54P  reason: invalid class name */
public abstract class AnonymousClass54P extends AnonymousClass5ZM {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Object obj2;
        AnonymousClass5L3 r10 = (AnonymousClass5L3) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00.get();
        if (contactPickerFragment != null && contactPickerFragment.A16()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("contactpicker/loaded all:");
            List list = r10.A01;
            A0o.append(list.size());
            A0o.append(" top:");
            A0o.append(r10.A08.size());
            A0o.append(" group:");
            List list2 = r10.A02;
            if (list2 != null) {
                obj2 = AnonymousClass0x9.A0l(list2);
            } else {
                obj2 = "0";
            }
            C18260x0.A0m(obj2, A0o);
            contactPickerFragment.A17 = null;
            if (contactPickerFragment.A26() && !list.isEmpty()) {
                AnonymousClass0R8 A002 = C111355hx.A00(contactPickerFragment);
                C620733j r5 = contactPickerFragment.A1V;
                long size = (long) list.size();
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass000.A1L(A0L, list.size());
                A002.A0I(r5.A0L(A0L, R.plurals.f9nameremoved, size));
            }
            contactPickerFragment.A1r(r10);
        }
    }

    public AnonymousClass54P(ContactPickerFragment contactPickerFragment) {
        this.A00 = AnonymousClass0x9.A14(contactPickerFragment);
    }
}
