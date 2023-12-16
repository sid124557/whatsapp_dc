package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;

/* renamed from: X.84b  reason: invalid class name and case insensitive filesystem */
public class C1680884b implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<C04580Ov> list = ((AnonymousClass6NE) obj2).A08;
        if (list == null) {
            return null;
        }
        for (C04580Ov A0o : list) {
            recyclerView.A0o(A0o);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return !Objects.equals(((AnonymousClass6NE) obj).A08, ((AnonymousClass6NE) obj2).A08);
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<C04580Ov> list = ((AnonymousClass6NE) obj2).A08;
        if (list != null) {
            for (C04580Ov A0p : list) {
                recyclerView.A0p(A0p);
            }
        }
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }
}
