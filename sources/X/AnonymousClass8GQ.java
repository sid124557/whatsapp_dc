package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.util.Log;

/* renamed from: X.8GQ  reason: invalid class name */
public class AnonymousClass8GQ implements C184318rb {
    public final /* synthetic */ C87964Wu A00;

    public AnonymousClass8GQ(C87964Wu r1) {
        this.A00 = r1;
    }

    public void BRy() {
        Log.d("FilterThumbnailAdapter/fetchFilters failed to get filters");
        RecyclerView recyclerView = this.A00.A09.A0P;
        if (recyclerView != null) {
            recyclerView.post(new C70013Zn(this, 9));
        }
    }

    public /* bridge */ /* synthetic */ void BZS(Object obj) {
        RecyclerView recyclerView = this.A00.A09.A0P;
        if (recyclerView != null) {
            recyclerView.post(new C71353by(this, 42, obj));
        }
    }
}
