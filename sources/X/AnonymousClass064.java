package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.064  reason: invalid class name */
public class AnonymousClass064 extends AnonymousClass0WH {
    public Map A00 = new WeakHashMap();
    public final AnonymousClass063 A01;

    public static AnonymousClass0WH A00(AnonymousClass064 r0, Object obj) {
        return (AnonymousClass0WH) r0.A00.get(obj);
    }

    public boolean A09(View view, int i, Bundle bundle) {
        boolean A09;
        RecyclerView recyclerView = this.A01.A00;
        if (recyclerView.A0z() || recyclerView.getLayoutManager() == null) {
            return super.A09(view, i, bundle);
        }
        AnonymousClass0WH A002 = A00(this, view);
        if (A002 != null) {
            A09 = A002.A09(view, i, bundle);
        } else {
            A09 = super.A09(view, i, bundle);
        }
        if (A09) {
            return true;
        }
        return false;
    }

    public void A0D(View view, C05650Ui r4) {
        C06440Xs layoutManager;
        RecyclerView recyclerView = this.A01.A00;
        if (!recyclerView.A0z() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.A0k(view, r4);
            AnonymousClass0WH A002 = A00(this, view);
            if (A002 != null) {
                A002.A0D(view, r4);
                return;
            }
        }
        super.A0D(view, r4);
    }

    public AnonymousClass064(AnonymousClass063 r2) {
        this.A01 = r2;
    }

    public void A05(View view, int i) {
        AnonymousClass0WH A002 = A00(this, view);
        if (A002 != null) {
            A002.A05(view, i);
        } else {
            super.A05(view, i);
        }
    }

    public void A06(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass0WH A002 = A00(this, view);
        if (A002 != null) {
            A002.A06(view, accessibilityEvent);
        } else {
            super.A06(view, accessibilityEvent);
        }
    }

    public void A07(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass0WH A002 = A00(this, view);
        if (A002 != null) {
            A002.A07(view, accessibilityEvent);
        } else {
            super.A07(view, accessibilityEvent);
        }
    }

    public void A08(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass0WH A002 = A00(this, view);
        if (A002 != null) {
            A002.A08(view, accessibilityEvent);
        } else {
            super.A08(view, accessibilityEvent);
        }
    }

    public boolean A0A(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass0WH A002 = A00(this, view);
        if (A002 != null) {
            return A002.A0A(view, accessibilityEvent);
        }
        return this.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean A0B(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass0WH A002 = A00(this, viewGroup);
        if (A002 != null) {
            return A002.A0B(viewGroup, view, accessibilityEvent);
        }
        return super.A0B(viewGroup, view, accessibilityEvent);
    }

    public AnonymousClass0U3 A0C(View view) {
        AnonymousClass0WH A002 = A00(this, view);
        if (A002 != null) {
            return A002.A0C(view);
        }
        return super.A0C(view);
    }
}
