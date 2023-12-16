package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.063  reason: invalid class name */
public class AnonymousClass063 extends AnonymousClass0WH {
    public final RecyclerView A00;
    public final AnonymousClass064 A01;

    public AnonymousClass0WH A0E() {
        return this.A01;
    }

    public AnonymousClass063(RecyclerView recyclerView) {
        AnonymousClass064 r1;
        this.A00 = recyclerView;
        AnonymousClass0WH A0E = A0E();
        if (A0E == null || !(A0E instanceof AnonymousClass064)) {
            r1 = new AnonymousClass064(this);
        } else {
            r1 = (AnonymousClass064) A0E;
        }
        this.A01 = r1;
    }

    public void A06(View view, AccessibilityEvent accessibilityEvent) {
        C06440Xs layoutManager;
        super.A06(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.A00.A0z() && (layoutManager = ((RecyclerView) view).getLayoutManager()) != null) {
            layoutManager.A0m(accessibilityEvent);
        }
    }

    public boolean A09(View view, int i, Bundle bundle) {
        C06440Xs layoutManager;
        if (super.A09(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A0z() || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return false;
        }
        RecyclerView recyclerView2 = layoutManager.A07;
        return layoutManager.A1D(bundle, recyclerView2.A0w, recyclerView2.A0y, i);
    }

    public void A0D(View view, C05650Ui r5) {
        C06440Xs layoutManager;
        super.A0D(view, r5);
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A0z() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            RecyclerView recyclerView2 = layoutManager.A07;
            layoutManager.A0n(r5, recyclerView2.A0w, recyclerView2.A0y);
        }
    }
}
