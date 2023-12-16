package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.103  reason: invalid class name */
public class AnonymousClass103 extends AnonymousClass08N {
    public List A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass0XV A02;
    public final Set A03;

    public final void A0D() {
        C48432et r0;
        AnonymousClass08M r8 = this.A01;
        List list = this.A00;
        Set set = this.A03;
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < list.size(); i++) {
            C166447yh r2 = (C166447yh) list.get(i);
            if (set.contains(r2)) {
                r0 = new C48432et(r2, true);
            } else {
                r0 = new C48432et(r2, false);
            }
            A0s.add(r0);
        }
        r8.A0G(A0s);
    }

    public AnonymousClass103(Application application, AnonymousClass0XV r4, List list, List list2) {
        super(application);
        HashSet A0K = AnonymousClass002.A0K();
        this.A03 = A0K;
        this.A02 = r4;
        this.A00 = list;
        if (list2 != null) {
            A0K.addAll(list2);
        }
        List list3 = (List) r4.A04("saved_all_categories");
        if (list3 != null) {
            this.A00 = list3;
        }
        Collection collection = (Collection) r4.A04("saved_selected_categories");
        if (collection != null) {
            Set set = this.A03;
            set.clear();
            set.addAll(collection);
        }
        A0D();
    }
}
