package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.98z  reason: invalid class name and case insensitive filesystem */
public class C1905798z extends AnonymousClass54P {
    public final C64773Ex A00;
    public final AnonymousClass36F A01;
    public final C1907099n A02;
    public final AnonymousClass9U4 A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList arrayList;
        Log.d("payment-contact-picker/load-contacts");
        ArrayList A0s = AnonymousClass001.A0s();
        this.A00.A0h(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            if (C627336j.A0L(C18310x6.A0R(it).A0H)) {
                it.remove();
            }
        }
        if (this.A02.A02.A0X(2026)) {
            List<AnonymousClass3ZQ> A0K = this.A01.A0K();
            arrayList = AnonymousClass001.A0s();
            if (!A0K.isEmpty()) {
                HashMap A0t = AnonymousClass001.A0t();
                Iterator it2 = A0s.iterator();
                while (it2.hasNext()) {
                    C1899593h.A1T(A0t, it2);
                }
                for (AnonymousClass3ZQ r0 : A0K) {
                    Object obj = A0t.get(r0.A04.getRawString());
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = AnonymousClass001.A0s();
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        ArrayList A0s4 = AnonymousClass001.A0s();
        A0F(new AnonymousClass5L3((C60122y2) null, arrayList, A0s, A0s2, A0s3, (List) null, (List) null, A0s4, (List) null, (Set) null));
        return new AnonymousClass5L3((C60122y2) null, arrayList, A0s, A0s2, A0s3, (List) null, AnonymousClass9U4.A03(this.A03).A0C(), A0s4, (List) null, (Set) null);
    }

    public C1905798z(C64773Ex r1, ContactPickerFragment contactPickerFragment, AnonymousClass36F r3, C1907099n r4, AnonymousClass9U4 r5) {
        super(contactPickerFragment);
        this.A00 = r1;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }
}
