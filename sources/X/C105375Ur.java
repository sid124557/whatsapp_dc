package X;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5Ur  reason: invalid class name and case insensitive filesystem */
public class C105375Ur {
    public List A00;
    public Set A01 = AnonymousClass002.A0K();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final C1223964f A05;
    public final AnonymousClass5HM A06;
    public final C620733j A07;
    public final C105355Up A08;

    public void A07() {
        this.A03 = false;
        this.A04 = false;
        this.A01 = AnonymousClass002.A0K();
        this.A02 = false;
    }

    public AnonymousClass7HE A02() {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        ArrayList A0J = AnonymousClass002.A0J(list);
        Collections.sort(A0J, new AnonymousClass91R(C86614Ku.A0w(this.A07), 10));
        return new AnonymousClass7HE(A0J, AnonymousClass002.A0J(this.A01));
    }

    public final C136186lz A03(C185648u1 r10, int i) {
        Integer num;
        if (this.A04) {
            num = AnonymousClass001.A0f();
        } else {
            num = null;
        }
        AnonymousClass5HM r0 = this.A06;
        Set set = this.A01;
        List list = this.A00;
        boolean z = this.A03;
        boolean z2 = this.A02;
        ArrayList A0s = AnonymousClass001.A0s();
        if (r0.A00.BHb()) {
            A0s.add(new C132626fh(z2));
        }
        boolean z3 = true;
        if (list != null && !list.isEmpty()) {
            A0s.add(new C132616fg(set, !set.isEmpty()));
        }
        if (num == null) {
            z3 = false;
        }
        A0s.add(new C132646fj(z3));
        A0s.add(new C132636fi(z));
        if (!set.isEmpty() || num != null || z || z2) {
            A0s.add(new C132606ff());
        }
        if (!A0s.isEmpty()) {
            return new C135996lg(r10, A0s, i);
        }
        return null;
    }

    public Boolean A05() {
        if (this.A05.BHb()) {
            return Boolean.valueOf(this.A02);
        }
        return null;
    }

    public String A06() {
        if (this.A01.isEmpty()) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (C166447yh r0 : this.A01) {
            A0s.add(r0.A00);
        }
        return TextUtils.join(",", A0s);
    }

    public void A08(Bundle bundle) {
        HashSet A0K;
        boolean z = bundle.getBoolean("saved_open_now");
        boolean z2 = false;
        if (Boolean.valueOf(z) == null) {
            z = false;
        }
        this.A04 = z;
        boolean z3 = bundle.getBoolean("saved_has_catalog");
        if (Boolean.valueOf(z3) == null) {
            z3 = false;
        }
        this.A03 = z3;
        boolean z4 = bundle.getBoolean("saved_distance");
        if (Boolean.valueOf(z4) != null) {
            z2 = z4;
        }
        this.A02 = z2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("saved_selected_multiple_choice_category");
        if (parcelableArrayList != null) {
            A0K = AnonymousClass0x9.A15(parcelableArrayList);
        } else {
            A0K = AnonymousClass002.A0K();
        }
        this.A01 = A0K;
        this.A00 = bundle.getParcelableArrayList("saved_current_filter_categories");
    }

    public void A09(AnonymousClass0XV r3) {
        boolean z;
        boolean z2;
        HashSet A0K;
        Boolean bool = (Boolean) r3.A04("saved_open_now");
        boolean z3 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.A04 = z;
        Boolean bool2 = (Boolean) r3.A04("saved_has_catalog");
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        this.A03 = z2;
        Boolean bool3 = (Boolean) r3.A04("saved_distance");
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        }
        this.A02 = z3;
        Collection collection = (Collection) r3.A04("saved_selected_multiple_choice_category");
        if (collection != null) {
            A0K = AnonymousClass0x9.A15(collection);
        } else {
            A0K = AnonymousClass002.A0K();
        }
        this.A01 = A0K;
        this.A00 = (List) r3.A04("saved_current_filter_categories");
    }

    public void A0A(AnonymousClass0XV r3) {
        r3.A06("saved_open_now", Boolean.valueOf(this.A04));
        r3.A06("saved_has_catalog", Boolean.valueOf(this.A03));
        r3.A06("saved_distance", Boolean.valueOf(this.A02));
        r3.A06("saved_selected_multiple_choice_category", AnonymousClass002.A0J(this.A01));
        r3.A06("saved_current_filter_categories", this.A00);
    }

    public boolean A0B() {
        if (!this.A01.isEmpty() || this.A04 || this.A03) {
            return false;
        }
        return true;
    }

    public boolean A0C(Bundle bundle) {
        if (bundle.getBoolean("saved_open_now") == this.A04 && this.A03 == bundle.getBoolean("saved_has_catalog") && this.A02 == bundle.getBoolean("saved_distance")) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("saved_selected_multiple_choice_category");
            if (this.A01.size() == parcelableArrayList.size()) {
                Iterator it = parcelableArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!this.A01.contains(it.next())) {
                            break;
                        }
                    } else {
                        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("saved_current_filter_categories");
                        List list = this.A00;
                        if (list == null || parcelableArrayList2 == null) {
                            return false;
                        }
                        if (list.size() == parcelableArrayList2.size()) {
                            for (Object contains : this.A00) {
                                if (!parcelableArrayList2.contains(contains)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public C105375Ur(C1223864e r3, C1223964f r4, C620733j r5, C105355Up r6) {
        C64333Db r0;
        this.A07 = r5;
        this.A08 = r6;
        C124046At r32 = (C124046At) r3;
        int i = r32.A01;
        Object obj = r32.A00;
        if (i != 0) {
            r0 = ((C118065sw) obj).A02;
        } else {
            r0 = ((C118075sx) obj).A03;
        }
        this.A06 = new AnonymousClass5HM(r4, C107695bk.A2l(r0.A00));
        this.A05 = r4;
    }

    public Bundle A00() {
        Bundle A082 = AnonymousClass002.A08();
        A082.putBoolean("saved_open_now", this.A04);
        A082.putBoolean("saved_has_catalog", this.A03);
        A082.putBoolean("saved_distance", this.A02);
        A082.putParcelableArrayList("saved_selected_multiple_choice_category", AnonymousClass002.A0J(this.A01));
        List list = this.A00;
        if (list != null) {
            A082.putParcelableArrayList("saved_current_filter_categories", AnonymousClass002.A0J(list));
        }
        return A082;
    }

    public C150967Sx A01() {
        Integer num;
        ArrayList A0s = AnonymousClass001.A0s();
        for (C166447yh r0 : this.A01) {
            A0s.add(r0.A00);
        }
        if (A0s.isEmpty()) {
            A0s = null;
        }
        if (this.A04) {
            num = AnonymousClass001.A0f();
        } else {
            num = null;
        }
        return new C150967Sx(num, A0s, this.A03);
    }

    public C136186lz A04(C185648u1 r7, List list) {
        HashSet A0K = AnonymousClass002.A0K();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C166447yh r0 = (C166447yh) it.next();
            A0K.add(new C166447yh(r0.A00, r0.A01));
        }
        A0K.addAll(this.A01);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it2 = A0K.iterator();
        while (it2.hasNext()) {
            C166447yh r02 = (C166447yh) it2.next();
            A0s.add(new C91824lC(r02.A00, r02.A01));
        }
        this.A00 = A0s;
        return A03(r7, 76);
    }
}
