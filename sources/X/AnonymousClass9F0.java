package X;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.whatsapp.R;

/* renamed from: X.9F0  reason: invalid class name */
public class AnonymousClass9F0 extends AnonymousClass95V {
    public boolean A00 = false;
    public final Context A01;
    public final View A02;
    public final ListView A03;
    public final C203499no A04;

    public AnonymousClass9F0(View view, C203499no r3) {
        super(view);
        this.A04 = r3;
        this.A01 = view.getContext();
        this.A02 = C06560Yg.A02(view, R.id.view_more_row);
        this.A03 = (ListView) C06560Yg.A02(view, R.id.timeline_list_view);
    }
}
