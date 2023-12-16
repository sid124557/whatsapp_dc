package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0pZ  reason: invalid class name and case insensitive filesystem */
public final class C14390pZ extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ Set $splitPairFilters;

    /* renamed from: A00 */
    public final Boolean invoke(Activity activity, Intent intent) {
        C162457s7.A0J(activity, 0);
        C162457s7.A0J(intent, 1);
        Set set = this.$splitPairFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass0QC r3 = (AnonymousClass0QC) it.next();
                ComponentName componentName = activity.getComponentName();
                C05900Vk r2 = C05900Vk.A00;
                if (r2.A01(componentName, r3.A00) && r2.A01(intent.getComponent(), r3.A01)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14390pZ(Set set) {
        super(2);
        this.$splitPairFilters = set;
    }
}
