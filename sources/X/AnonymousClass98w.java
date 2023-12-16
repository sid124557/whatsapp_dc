package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.98w  reason: invalid class name */
public class AnonymousClass98w extends C994255r {
    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long j;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        HashSet A0K = AnonymousClass002.A0K();
        ArrayList A0s4 = AnonymousClass001.A0s();
        HashSet A0K2 = AnonymousClass002.A0K();
        boolean A0M = A0M();
        A0L(this.A0A, A0s2, A0K, A0K2, A0M);
        AnonymousClass4MC r3 = this.A02;
        if (!r3.isCancelled()) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it);
                Jid A0I = A0R.A0I(C95814uZ.class);
                if (!A0K.contains(A0I) && !A0R.A0U() && this.A03.A0f(A0R, this.A07, true) && !this.A0C.contains(A0I) && !(A0I instanceof C135216kJ) && !(A0I instanceof C135166kE) && A0P(A0R, A0M)) {
                    A0s3.add(A0R);
                    C51602k5 r0 = A0R.A0F;
                    if (r0 == null) {
                        j = 0;
                    } else {
                        j = r0.A00;
                    }
                    A0s4.add(Long.valueOf(j));
                }
            }
            if (!r3.isCancelled()) {
                C08310eF r02 = (C08310eF) this.A06.get();
                if (r02 != null && r02.A16()) {
                    A0K(A0s, A0s2, AnonymousClass001.A0s(), AnonymousClass001.A0s(), AnonymousClass001.A0s(), A0s3);
                }
                C994255r.A01(A0s, A0s3);
                if (!r3.isCancelled() && A0s.isEmpty()) {
                    A0I(A0s);
                }
            }
        }
        return new AnonymousClass7HS(A0s, this.A07);
    }

    public boolean A0O(AnonymousClass3ZH r2) {
        return true;
    }

    public AnonymousClass98w(C56972sr r1, C64773Ex r2, C56422rx r3, AnonymousClass5ZU r4, ContactPickerFragment contactPickerFragment, C620733j r6, String str, HashSet hashSet, List list, List list2, List list3, List list4, Set set) {
        super(r1, r2, r3, r4, contactPickerFragment, r6, str, hashSet, list, list2, list3, list4, set);
    }
}
