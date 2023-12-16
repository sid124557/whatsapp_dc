package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.6JG  reason: invalid class name */
public abstract class AnonymousClass6JG extends AnonymousClass0R4 {
    public Object A0H(ViewGroup viewGroup, int i) {
        int i2;
        C131676dy r3 = (C131676dy) this;
        C162457s7.A0J(viewGroup, 0);
        int A0L = r3.A0L(i);
        C626936e.A06(r3.A01[A0L]);
        Iterator it = r3.A05.iterator();
        while (it.hasNext()) {
            AnonymousClass0O5 r1 = (AnonymousClass0O5) it.next();
            RecyclerView recyclerView = ((AnonymousClass8J3) r3.A01[A0L]).A04;
            if (recyclerView != null) {
                recyclerView.A0q(r1);
            }
        }
        AnonymousClass8s6 r7 = r3.A01[A0L];
        String id = r7.getId();
        r3.A00.put(id, r7);
        AnonymousClass8J3 r72 = (AnonymousClass8J3) r7;
        LayoutInflater layoutInflater = r72.A0C;
        if (!(r72 instanceof C137906pS)) {
            if (!(r72 instanceof C137896pR)) {
                if (r72 instanceof C137916pT) {
                    ((C137916pT) r72).A09.A0Y();
                } else if (r72 instanceof C137886pQ) {
                    i2 = R.layout.f8nameremoved;
                }
            }
            i2 = R.layout.f8nameremoved;
        } else if (((C137906pS) r72) instanceof C137866pO) {
            i2 = R.layout.f8nameremoved;
        } else {
            i2 = R.layout.f8nameremoved;
        }
        View inflate = layoutInflater.inflate(i2, (ViewGroup) null);
        inflate.setBackgroundColor(r72.A08);
        r72.A04 = (RecyclerView) C06560Yg.A02(inflate, R.id.sticker_grid);
        int i3 = r72.A00;
        if (i3 <= 0) {
            i3 = 1;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i3);
        r72.A03 = gridLayoutManager;
        r72.A04.setLayoutManager(gridLayoutManager);
        r72.A04.A0o(new C125356Hs(r72.A0E, r72.A02));
        RecyclerView recyclerView2 = r72.A04;
        C125306Hh A00 = r72.A00();
        recyclerView2.suppressLayout(false);
        recyclerView2.A0m(A00, true, false);
        recyclerView2.A0v(true);
        recyclerView2.requestLayout();
        RecyclerView recyclerView3 = r72.A04;
        recyclerView3.A0q(new C88064Xe(recyclerView3.getResources(), r72.A03, r72.A0D));
        r72.A03(inflate);
        r72.A01();
        inflate.setTag(id);
        viewGroup.addView(inflate, 0);
        C626936e.A04(inflate);
        return inflate;
    }

    public void A0I(ViewGroup viewGroup, Object obj, int i) {
        C131676dy r2 = (C131676dy) this;
        View view = (View) obj;
        C18260x0.A0P(viewGroup, view);
        int A0L = r2.A0L(i);
        Object tag = view.getTag();
        C162457s7.A0K(tag, "null cannot be cast to non-null type kotlin.String");
        viewGroup.removeView(view);
        AnonymousClass8s6 r3 = (AnonymousClass8s6) r2.A00.remove(tag);
        if (r3 != null) {
            Iterator it = r2.A05.iterator();
            while (it.hasNext()) {
                AnonymousClass0O5 r1 = (AnonymousClass0O5) it.next();
                RecyclerView recyclerView = ((AnonymousClass8J3) r3).A04;
                if (recyclerView != null) {
                    recyclerView.A0r(r1);
                }
            }
            r3.BQv(view, viewGroup, A0L);
        }
    }

    public int A0G(Object obj) {
        if (!(this instanceof C131676dy)) {
            return -1;
        }
        C131676dy r1 = (C131676dy) this;
        View view = (View) obj;
        C162457s7.A0J(view, 0);
        Object tag = view.getTag();
        C162457s7.A0K(tag, "null cannot be cast to non-null type kotlin.String");
        Number A0p = AnonymousClass0x9.A0p(tag, r1.A04);
        if (A0p != null) {
            HashMap hashMap = r1.A03;
            if (A0p.equals(hashMap.get(tag))) {
                return -1;
            }
            hashMap.put(tag, A0p);
            return A0p.intValue();
        }
        r1.A03.remove(tag);
        return -2;
    }

    @Deprecated
    public final int A02(Object obj) {
        return A0G(obj);
    }

    @Deprecated
    public final Object A0D(ViewGroup viewGroup, int i) {
        return A0H(viewGroup, i);
    }

    @Deprecated
    public final boolean A0F(View view, Object obj) {
        return A0K(view, obj);
    }

    public boolean A0K(View view, Object obj) {
        C18260x0.A0O(view, obj);
        return AnonymousClass000.A1Y(view, obj);
    }

    @Deprecated
    public final void A0B(ViewGroup viewGroup, Object obj, int i) {
        A0J(viewGroup, obj, i);
    }

    @Deprecated
    public final void A0E(ViewGroup viewGroup, Object obj, int i) {
        A0I(viewGroup, obj, i);
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
    }
}
