package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09Q  reason: invalid class name */
public class AnonymousClass09Q extends C04580Ov {
    public int A00;
    public Drawable A01;
    public boolean A02 = true;
    public final /* synthetic */ PreferenceFragmentCompat A03;

    public AnonymousClass09Q(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A03 = preferenceFragmentCompat;
    }

    public void A02(Canvas canvas, AnonymousClass0Q1 r9, RecyclerView recyclerView) {
        if (this.A01 != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (A04(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.A01.setBounds(0, y, width, this.A00 + y);
                    this.A01.draw(canvas);
                }
            }
        }
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r4, RecyclerView recyclerView) {
        if (A04(view, recyclerView)) {
            rect.bottom = this.A00;
        }
    }

    public final boolean A04(View view, RecyclerView recyclerView) {
        C05570Ua A0H = recyclerView.A0H(view);
        if (!(A0H instanceof C011409i) || !((C011409i) A0H).A01) {
            return false;
        }
        boolean z = this.A02;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        C05570Ua A0H2 = recyclerView.A0H(recyclerView.getChildAt(indexOfChild + 1));
        if (!(A0H2 instanceof C011409i) || !((C011409i) A0H2).A00) {
            return false;
        }
        return true;
    }
}
