package X;

import android.view.View;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;

/* renamed from: X.6AK  reason: invalid class name */
public class AnonymousClass6AK implements AnonymousClass4A8 {
    public Object A00;
    public final int A01;

    public AnonymousClass6AK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BSd() {
        View view;
        Runnable A002;
        long A0R;
        int i;
        if (this.A01 != 0) {
            AnonymousClass5YE r2 = (AnonymousClass5YE) this.A00;
            ExpressionsBottomSheetView expressionsBottomSheetView = r2.A0F;
            if (expressionsBottomSheetView != null) {
                if (r2 instanceof C94334qy) {
                    i = 4;
                } else if (r2 instanceof C94324qx) {
                    i = 3;
                } else {
                    i = 7;
                }
                expressionsBottomSheetView.setExpressionsTabs(i);
            }
            view = r2.A0A;
            if (view != null) {
                A002 = new C69993Zl(r2, 14);
                A0R = (long) (((float) 50) * r2.A01());
            } else {
                return;
            }
        } else {
            C106765a8 r3 = (C106765a8) this.A00;
            C113245l7 r22 = (C113245l7) r3.A00;
            ExpressionsBottomSheetView expressionsBottomSheetView2 = r22.A40;
            if (expressionsBottomSheetView2 != null) {
                expressionsBottomSheetView2.setExpressionsTabs(r22.A0T());
            }
            view = r22.A4P;
            A002 = C117625sE.A00(r3, 1);
            A0R = (long) ((int) (r22.A0R() * 50.0f));
        }
        view.postDelayed(A002, A0R);
    }
}
