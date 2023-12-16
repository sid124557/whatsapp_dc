package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.126  reason: invalid class name */
public class AnonymousClass126 extends C04580Ov {
    public final C620733j A00;

    public AnonymousClass126(C620733j r1) {
        this.A00 = r1;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r6, RecyclerView recyclerView) {
        int dimensionPixelSize = C18290x4.A0G(view).getDimensionPixelSize(R.dimen.f6nameremoved);
        if (C620733j.A04(this.A00)) {
            rect.set(0, 0, dimensionPixelSize, 0);
        } else {
            rect.set(dimensionPixelSize, 0, 0, 0);
        }
    }
}
