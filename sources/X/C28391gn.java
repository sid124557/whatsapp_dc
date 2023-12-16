package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.1gn  reason: invalid class name and case insensitive filesystem */
public class C28391gn extends AnonymousClass6mM {
    public final ViewGroup A00;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        LayoutInflater A0D = C18280x3.A0D(this.A00);
        ViewGroup viewGroup = (ViewGroup) C06560Yg.A02(this.A0H, R.id.shimmer_items);
        viewGroup.removeAllViews();
        int i = 0;
        do {
            A0D.inflate(R.layout.f8nameremoved, viewGroup, true);
            i++;
        } while (i < 14);
    }

    public C28391gn(View view, ViewGroup viewGroup) {
        super(view);
        this.A00 = viewGroup;
    }
}
