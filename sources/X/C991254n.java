package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.54n  reason: invalid class name and case insensitive filesystem */
public class C991254n extends AnonymousClass5ZM {
    public final C620733j A00;
    public final WeakReference A01;
    public final ArrayList A02;
    public final List A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A02;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            arrayList = this.A03;
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            for (C104215Qc r3 : this.A03) {
                if (C107155an.A05(this.A00, r3.A06, arrayList2, true)) {
                    A0s.add(r3);
                }
            }
            arrayList = A0s;
        }
        Collections.sort(arrayList, new C117735sP(this.A00));
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Collection collection = (Collection) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A01.get();
        if (phoneContactsSelector != null && !phoneContactsSelector.BHW()) {
            phoneContactsSelector.A0L = null;
            ArrayList arrayList = phoneContactsSelector.A0f;
            arrayList.clear();
            arrayList.addAll(collection);
            phoneContactsSelector.A0K.notifyDataSetChanged();
            View findViewById = phoneContactsSelector.findViewById(R.id.contacts_empty_permission_denied);
            View findViewById2 = phoneContactsSelector.findViewById(R.id.contacts_empty);
            View findViewById3 = phoneContactsSelector.findViewById(R.id.search_no_matches);
            View findViewById4 = phoneContactsSelector.findViewById(R.id.init_contacts_progress);
            if (!phoneContactsSelector.A0C.A00()) {
                findViewById4.setVisibility(8);
                C86654Ky.A16(findViewById, findViewById2, findViewById3, 0, 8);
                phoneContactsSelector.A03.setVisibility(8);
                return;
            }
            if (phoneContactsSelector.A0M != null) {
                C86654Ky.A16(findViewById4, findViewById, findViewById2, 0, 8);
            } else {
                boolean isEmpty = TextUtils.isEmpty(phoneContactsSelector.A0a);
                findViewById4.setVisibility(8);
                if (!isEmpty) {
                    findViewById.setVisibility(8);
                    findViewById2.setVisibility(8);
                    findViewById3.setVisibility(0);
                    Object[] A0L = AnonymousClass002.A0L();
                    A0L[0] = phoneContactsSelector.A0a;
                    AnonymousClass001.A0y(phoneContactsSelector, (TextView) findViewById3, A0L, R.string.f11nameremoved);
                    return;
                }
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
            }
            findViewById3.setVisibility(8);
        }
    }

    public C991254n(PhoneContactsSelector phoneContactsSelector, C620733j r3, List list, List list2) {
        ArrayList arrayList;
        this.A00 = r3;
        this.A01 = AnonymousClass0x9.A14(phoneContactsSelector);
        if (list != null) {
            arrayList = AnonymousClass002.A0J(list);
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        this.A03 = AnonymousClass002.A0J(list2);
    }
}
