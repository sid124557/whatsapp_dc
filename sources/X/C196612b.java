package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.12b  reason: invalid class name and case insensitive filesystem */
public class C196612b extends C05570Ua {
    public final Context A00;
    public final View A01;
    public final LinearLayout A02;
    public final AnonymousClass67D A03;
    public final AnonymousClass1VX A04;

    public C196612b(View view, AnonymousClass67D r7, C620733j r8, AnonymousClass1VX r9) {
        super(view);
        this.A04 = r9;
        Context context = view.getContext();
        this.A00 = context;
        this.A01 = C005205m.A00(C111095hX.A02(view.getContext()), 16908290);
        View view2 = this.A0H;
        this.A02 = (LinearLayout) C06560Yg.A02(view2, R.id.row);
        this.A03 = r7;
        AnonymousClass0x9.A0E(view2, R.id.chevron).setImageDrawable(new C131666dx(C107335b8.A04(context, C1001059l.A04 ? R.drawable.vec_ic_chevron_right_wds : R.drawable.chevron, R.color.f5nameremoved), r8));
        view2.setBackground((Drawable) null);
        C06560Yg.A02(view2, R.id.divider).setVisibility(8);
    }
}
