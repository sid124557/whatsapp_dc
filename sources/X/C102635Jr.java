package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Jr  reason: invalid class name and case insensitive filesystem */
public class C102635Jr {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C102635Jr(View view) {
        this.A01 = AnonymousClass0x9.A0F(view, R.id.icon);
        this.A04 = C86614Ku.A0I(view);
        this.A03 = AnonymousClass002.A09(view, R.id.size);
        this.A02 = AnonymousClass002.A09(view, R.id.date);
        this.A00 = view.findViewById(R.id.selection_check);
    }
}
