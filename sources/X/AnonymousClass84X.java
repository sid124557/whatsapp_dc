package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: X.84X  reason: invalid class name */
public class AnonymousClass84X implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass6NE r6 = (AnonymousClass6NE) obj2;
        recyclerView.setAdapter(r6.A0E);
        recyclerView.setItemAnimator((AnonymousClass0UY) null);
        C146477Ak r0 = r6.A07;
        if (r0 == null || r0.A00 == null) {
            int i = r6.A03;
            if (i >= 0) {
                recyclerView.A0Z(i);
                return null;
            }
        } else {
            C06440Xs layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager);
            layoutManager.A0e(r6.A07.A00);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return C18300x5.A1W(((AnonymousClass6NE) obj).A0E, ((AnonymousClass6NE) obj2).A0E);
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C146477Ak r1 = ((AnonymousClass6NE) obj2).A07;
        if (r1 != null) {
            C06440Xs layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager);
            r1.A00 = layoutManager.A0O();
        }
        recyclerView.setAdapter((AnonymousClass0R6) null);
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }
}
