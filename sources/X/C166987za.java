package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7za  reason: invalid class name and case insensitive filesystem */
public final class C166987za implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final RecyclerView A01;
    public final C88064Xe A02;

    public void onGlobalLayout() {
        if (this.A00) {
            this.A02.A06(this.A01);
            this.A00 = false;
        }
    }

    public C166987za(RecyclerView recyclerView, C88064Xe r2) {
        this.A01 = recyclerView;
        this.A02 = r2;
    }
}
