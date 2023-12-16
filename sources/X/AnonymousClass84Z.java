package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.84Z  reason: invalid class name */
public class AnonymousClass84Z implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((AnonymousClass6NE) obj2).A09;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            recyclerView.A0q((AnonymousClass0O5) list.get(i));
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = ((AnonymousClass6NE) obj).A09;
        List list2 = ((AnonymousClass6NE) obj2).A09;
        if (list == list2) {
            return false;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return true;
        }
        return !list.equals(list2);
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((AnonymousClass6NE) obj2).A09;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                recyclerView.A0r((AnonymousClass0O5) list.get(i));
            }
        }
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }
}
