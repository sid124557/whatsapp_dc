package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.4WA  reason: invalid class name */
public class AnonymousClass4WA extends AnonymousClass09G {
    public Map A00 = AnonymousClass001.A0t();

    public AnonymousClass4WA() {
        super(C86624Kv.A0E(3));
    }

    public static C125656Iw A00(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C133666hk(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        if (i == 2) {
            return new C94254qd(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        if (i == 3) {
            return new C125656Iw(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        String A0Y = AnonymousClass000.A0Y("ItemAdapter/onCreateViewHolder type not handled - ", AnonymousClass001.A0o(), i);
        Log.e(A0Y);
        throw AnonymousClass001.A0e(A0Y);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        ((C125656Iw) r2).A07((AnonymousClass7VI) A0K(i));
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return A00(viewGroup, i);
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass7VI) A0K(i)).A00;
    }
}
