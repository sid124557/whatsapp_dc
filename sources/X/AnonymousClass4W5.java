package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.Map;

/* renamed from: X.4W5  reason: invalid class name */
public class AnonymousClass4W5 extends AnonymousClass09G {
    public long A00 = 1;
    public final Map A01 = AnonymousClass001.A0t();

    public AnonymousClass4W5() {
        super(C86624Kv.A0E(0));
        A0E(true);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r7, int i) {
        int i2;
        AnonymousClass6IR r72 = (AnonymousClass6IR) r7;
        C151647Vp r5 = (C151647Vp) A0K(i);
        View view = r72.A0H;
        String string = view.getContext().getString(R.string.f11nameremoved);
        WaTextView waTextView = r72.A01;
        boolean z = r5.A01;
        if (z || string.equals(r5.A01())) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = AnonymousClass5YI.A02(view.getContext());
        }
        waTextView.setMaxWidth(i2);
        C18290x4.A1H(waTextView, r5, 23);
        waTextView.setText(r5.A01());
        r72.A00.setVisibility(C86614Ku.A01(z ? 1 : 0));
    }

    public long A0B(int i) {
        Map map = this.A01;
        String A002 = ((C151647Vp) A0K(i)).A00();
        Number A0q = AnonymousClass0x9.A0q(A002, map);
        if (A0q == null) {
            long j = this.A00;
            this.A00 = 1 + j;
            A0q = Long.valueOf(j);
            map.put(A002, A0q);
        }
        return A0q.longValue();
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass6IR(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
    }
}
