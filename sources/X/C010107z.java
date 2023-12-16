package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.07z  reason: invalid class name and case insensitive filesystem */
public class C010107z extends AnonymousClass0UN {
    public void A07(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!AnonymousClass0I9.A00(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        A07(childAt, arrayList);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void A00(AnonymousClass05C r1, Collection collection) {
        Iterator it = r1.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(AnonymousClass0YZ.A06((View) AnonymousClass001.A0w(it).getValue()))) {
                it.remove();
            }
        }
    }

    public void A08(View view, Map map) {
        String A06 = AnonymousClass0YZ.A06(view);
        if (A06 != null) {
            map.put(A06, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    A08(childAt, map);
                }
            }
        }
    }

    public C010107z(ViewGroup viewGroup) {
        super(viewGroup);
    }
}
