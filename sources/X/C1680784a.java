package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: X.84a  reason: invalid class name and case insensitive filesystem */
public class C1680784a implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass09Z r0 = ((AnonymousClass6NE) obj2).A06;
        if (r0 == null) {
            return null;
        }
        r0.A06(recyclerView);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return !Objects.equals(((AnonymousClass6NE) obj).A06, ((AnonymousClass6NE) obj2).A06);
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass09Z r0 = ((AnonymousClass6NE) obj2).A06;
        if (r0 != null) {
            r0.A06((RecyclerView) null);
        }
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }
}
