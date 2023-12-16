package X;

import android.app.Activity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0pa  reason: invalid class name and case insensitive filesystem */
public final class C14400pa extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ Set $splitPairFilters;

    /* renamed from: A00 */
    public final Boolean invoke(Activity activity, Activity activity2) {
        C162457s7.A0J(activity, 0);
        C162457s7.A0J(activity2, 1);
        Set set = this.$splitPairFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AnonymousClass0QC) it.next()).A00(activity, activity2)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14400pa(Set set) {
        super(2);
        this.$splitPairFilters = set;
    }
}
