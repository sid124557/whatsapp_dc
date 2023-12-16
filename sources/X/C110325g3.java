package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5g3  reason: invalid class name and case insensitive filesystem */
public class C110325g3 implements C16910uE {
    public final /* synthetic */ ContactPickerFragment A00;

    public C110325g3(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public boolean BQL(Menu menu, AnonymousClass0R2 r7) {
        ContactPickerFragment contactPickerFragment = this.A00;
        if (contactPickerFragment.A3V || contactPickerFragment.A3d || contactPickerFragment.A3b || contactPickerFragment.A3e) {
            C86624Kv.A0q(menu.add(0, R.id.menuitem_share, 0, R.string.f11nameremoved), R.drawable.input_send);
            return true;
        }
        if (!contactPickerFragment.A0b.A0Y()) {
            contactPickerFragment.A1x.A0X(5968);
            menu.add(0, R.id.menuitem_new_broadcast, 0, R.string.f11nameremoved).setShowAsAction(1);
        }
        menu.add(0, R.id.menuitem_new_group, 0, R.string.f11nameremoved).setShowAsAction(1);
        return true;
    }

    public void BQw(AnonymousClass0R2 r5) {
        ContactPickerFragment contactPickerFragment = this.A00;
        Set set = contactPickerFragment.A3p;
        set.clear();
        Map map = contactPickerFragment.A3n;
        set.addAll(map.keySet());
        C86644Kx.A0s(contactPickerFragment.A3g, contactPickerFragment.A3j);
        map.clear();
        contactPickerFragment.A1W();
        contactPickerFragment.A0O = null;
    }

    public boolean BYg(Menu menu, AnonymousClass0R2 r3) {
        return false;
    }

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r10) {
        C111355hx r0;
        int i;
        if (menuItem.getItemId() == R.id.menuitem_new_broadcast) {
            ContactPickerFragment contactPickerFragment = this.A00;
            int A03 = contactPickerFragment.A0d.A03(C66663Mh.A15);
            if (A03 <= 0 || contactPickerFragment.A3n.size() <= A03) {
                contactPickerFragment.A0m(C627736r.A1B(contactPickerFragment.A1D(), contactPickerFragment.A3n.keySet()));
            } else {
                contactPickerFragment.A19.Bou(C86604Kt.A0q(contactPickerFragment.A1V, A03, 0, R.plurals.f9nameremoved));
            }
            r0 = contactPickerFragment.A19;
        } else if (menuItem.getItemId() == R.id.menuitem_new_group) {
            ContactPickerFragment contactPickerFragment2 = this.A00;
            int A02 = contactPickerFragment2.A1i.A02((C27991fJ) null) - 1;
            if (A02 <= 0 || contactPickerFragment2.A3n.size() <= (i = A02 - 1)) {
                contactPickerFragment2.A24.A00(4);
                C003203q A0R = contactPickerFragment2.A0R();
                A0R.startActivity(C627736r.A1A(A0R, C627336j.A0A(contactPickerFragment2.A3n.keySet()), 4));
                if (C104985Tc.A00(contactPickerFragment2.A1Q)) {
                    contactPickerFragment2.A1Q.A01();
                }
            } else {
                contactPickerFragment2.A19.Bou(C86604Kt.A0q(contactPickerFragment2.A1V, i, 0, R.plurals.f9nameremoved));
            }
            r0 = contactPickerFragment2.A19;
        } else {
            if (menuItem.getItemId() == R.id.menuitem_share) {
                ContactPickerFragment contactPickerFragment3 = this.A00;
                boolean z = contactPickerFragment3.A1K().getBoolean("skip_preview", false);
                ArrayList arrayList = contactPickerFragment3.A2z;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (contactPickerFragment3.A28.A00(C86664Kz.A0c(it)) != 1) {
                            break;
                        }
                    }
                }
                if (!z) {
                    contactPickerFragment3.A1t((AnonymousClass3ZH) null);
                    return false;
                }
                C621433s.A01(contactPickerFragment3.A0Q(), 1);
                return false;
            }
            return false;
        }
        r0.A02();
        return false;
    }
}
