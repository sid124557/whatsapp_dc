package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.98y  reason: invalid class name and case insensitive filesystem */
public class C1905698y extends AnonymousClass54P {
    public final C64773Ex A00;
    public final C194909Va A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Log.d("payment-merchant-contact-picker/load-contacts");
        ArrayList A0s = AnonymousClass001.A0s();
        this.A00.A0h(A0s);
        return new AnonymousClass5L3((C60122y2) null, AnonymousClass001.A0s(), AnonymousClass002.A0J(AnonymousClass9Lr.A00(A0s, this.A01.A02())), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Set) null);
    }

    public C1905698y(C64773Ex r1, ContactPickerFragment contactPickerFragment, C194909Va r3) {
        super(contactPickerFragment);
        this.A00 = r1;
        this.A01 = r3;
    }
}
