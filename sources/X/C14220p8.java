package X;

import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0p8  reason: invalid class name and case insensitive filesystem */
public final class C14220p8 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Set $activityFilters;

    /* renamed from: A00 */
    public final Boolean invoke(Intent intent) {
        C162457s7.A0J(intent, 0);
        Set set = this.$activityFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C05900Vk.A00.A01(intent.getComponent(), ((AnonymousClass0P7) it.next()).A00)) {
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
    public C14220p8(Set set) {
        super(1);
        this.$activityFilters = set;
    }
}
