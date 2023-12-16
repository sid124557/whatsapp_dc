package X;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0vl  reason: invalid class name and case insensitive filesystem */
public class C17550vl extends AnonymousClass0WH {
    public Object A00;
    public final int A01;

    public C17550vl(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean A09(View view, int i, Bundle bundle) {
        if (this.A01 == 0) {
            return ((C011609k) this.A00).A00.A09(view, i, bundle);
        }
        if (i == 1048576) {
            AnonymousClass00P r1 = (AnonymousClass00P) this.A00;
            if (r1.A0B) {
                r1.A03(AnonymousClass0FG.ACCESSIBILITY_ACTION);
                return true;
            }
        }
        return super.A09(view, i, bundle);
    }

    public void A0D(View view, C05650Ui r5) {
        Preference A0K;
        if (this.A01 != 0) {
            super.A0D(view, r5);
            boolean z = false;
            if (((AnonymousClass00P) this.A00).A0B) {
                r5.A01.addAction(1048576);
                z = true;
            }
            r5.A01.setDismissable(z);
            return;
        }
        C011609k r1 = (C011609k) this.A00;
        r1.A00.A0D(view, r5);
        RecyclerView recyclerView = r1.A02;
        int A002 = RecyclerView.A00(view);
        AnonymousClass0R6 r12 = recyclerView.A0N;
        if ((r12 instanceof AnonymousClass09H) && (A0K = ((AnonymousClass09H) r12).A0K(A002)) != null) {
            A0K.A0J(r5);
        }
    }
}
