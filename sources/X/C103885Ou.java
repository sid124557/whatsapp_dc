package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5Ou  reason: invalid class name and case insensitive filesystem */
public class C103885Ou {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public RecyclerView A05;
    public WDSButton A06;
    public final Context A07;
    public final ViewGroup A08;
    public final ImageView A09;

    public void A00(AnonymousClass123 r3) {
        View view = this.A02;
        if (view != null && view.getVisibility() == 0) {
            this.A04.setVisibility(8);
            this.A01.setVisibility(0);
            RecyclerView recyclerView = this.A05;
            if (recyclerView.A0N == null) {
                recyclerView.setAdapter(r3);
            }
        }
    }

    public C103885Ou(Context context, ViewGroup viewGroup) {
        this.A08 = viewGroup;
        this.A07 = context;
        this.A09 = AnonymousClass0x9.A0E(viewGroup, R.id.gif_tab);
    }
}
