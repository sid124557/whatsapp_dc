package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.12B  reason: invalid class name */
public class AnonymousClass12B extends C05570Ua {
    public AnonymousClass12B(View view, AnonymousClass1VX r12, C106715a2 r13, Runnable runnable) {
        super(view);
        TextView A0G = C18300x5.A0G(view, R.id.e2ee_main_text);
        C106715a2 r4 = r13;
        Runnable runnable2 = runnable;
        A0G.setText(r4.A06(A0G.getContext(), runnable2, view.getContext().getString(R.string.f11nameremoved), "%s", AnonymousClass5Yj.A02(A0G.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
        C18270x1.A0q(A0G, r12);
    }
}
