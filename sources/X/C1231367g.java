package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.67g  reason: invalid class name and case insensitive filesystem */
public class C1231367g extends C04580Ov {
    public int A00;
    public final int A01 = 0;

    public C1231367g(GifSearchContainer gifSearchContainer) {
        this.A00 = gifSearchContainer.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r6, RecyclerView recyclerView) {
        int i = this.A01;
        C162457s7.A0J(rect, 0);
        int i2 = this.A00;
        if (i != 0) {
            rect.set(0, i2, i2, 0);
        } else {
            rect.set(0, i2, 0, i2);
        }
    }

    public C1231367g(int i) {
        this.A00 = i;
    }
}
