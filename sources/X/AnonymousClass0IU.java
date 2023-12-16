package X;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.0IU  reason: invalid class name */
public final class AnonymousClass0IU {
    public static final AnonymousClass0XV A00(Bundle bundle, Bundle bundle2) {
        AbstractMap abstractMap;
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            int i = 0;
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw AnonymousClass001.A0e("Invalid bundle passed as restored state");
            }
            abstractMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            while (i < size) {
                Object obj = parcelableArrayList.get(i);
                if (obj != null) {
                    abstractMap.put(obj, parcelableArrayList2.get(i));
                    i++;
                } else {
                    throw AnonymousClass001.A0g("null cannot be cast to non-null type kotlin.String");
                }
            }
        } else if (bundle2 == null) {
            return new AnonymousClass0XV();
        } else {
            abstractMap = AnonymousClass001.A0t();
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                C162457s7.A0B(A0m);
                abstractMap.put(A0m, bundle2.get(A0m));
            }
        }
        return new AnonymousClass0XV(abstractMap);
    }
}
