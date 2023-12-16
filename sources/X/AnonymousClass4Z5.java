package X;

import android.view.View;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.4Z5  reason: invalid class name */
public abstract class AnonymousClass4Z5 extends C05570Ua {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Z5(View view) {
        super(view);
        C162457s7.A0J(view, 1);
    }

    public final void A07(boolean z) {
        SelectionCheckView selectionCheckView;
        SelectionCheckView selectionCheckView2;
        SelectionCheckView selectionCheckView3;
        boolean z2 = this instanceof C91244jD;
        if (z2) {
            selectionCheckView = ((C91244jD) this).A0B;
        } else {
            selectionCheckView = (SelectionCheckView) ((C91254jE) this).A0G.getValue();
        }
        int i = 0;
        if (AnonymousClass000.A1T(selectionCheckView.getVisibility()) != z) {
            View view = this.A0H;
            if (z) {
                view.setBackgroundResource(AnonymousClass5Yj.A05(view));
            } else {
                C107235av.A02(view);
            }
            view.setSelected(z);
            if (z2) {
                selectionCheckView2 = ((C91244jD) this).A0B;
            } else {
                selectionCheckView2 = (SelectionCheckView) ((C91254jE) this).A0G.getValue();
            }
            selectionCheckView2.A06(z, true);
            if (z2) {
                selectionCheckView3 = ((C91244jD) this).A0B;
            } else {
                selectionCheckView3 = (SelectionCheckView) ((C91254jE) this).A0G.getValue();
            }
            if (!z) {
                i = 8;
            }
            selectionCheckView3.setVisibility(i);
        }
    }
}
