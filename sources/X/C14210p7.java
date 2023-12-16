package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0p7  reason: invalid class name and case insensitive filesystem */
public final class C14210p7 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Set $activityFilters;

    /* renamed from: A00 */
    public final Boolean invoke(Activity activity) {
        Intent intent;
        ComponentName component;
        C162457s7.A0J(activity, 0);
        Set set = this.$activityFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C05900Vk r2 = C05900Vk.A00;
                ComponentName componentName = ((AnonymousClass0P7) it.next()).A00;
                if (r2.A01(activity.getComponentName(), componentName) || !((intent = activity.getIntent()) == null || (component = intent.getComponent()) == null || !r2.A01(component, componentName))) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14210p7(Set set) {
        super(1);
        this.$activityFilters = set;
    }
}
