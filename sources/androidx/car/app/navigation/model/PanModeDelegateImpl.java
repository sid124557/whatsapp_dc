package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.C14830qL;
import X.C14840qM;
import X.C18110wl;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;

public class PanModeDelegateImpl implements C14830qL {
    public final IPanModeListener mStub = null;

    public class PanModeListenerStub extends IPanModeListener.Stub {
        public final C14840qM mListener;

        public void onPanModeChanged(boolean z, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18110wl(1, this, z), "onPanModeChanged");
        }

        private /* synthetic */ Object lambda$onPanModeChanged$0(boolean z) {
            throw AnonymousClass001.A0g("onPanModeChanged");
        }

        public static /* synthetic */ Object $r8$lambda$LqYy1vRrRropiFqxnLxOFkdo8I0(PanModeListenerStub panModeListenerStub, boolean z) {
            panModeListenerStub.lambda$onPanModeChanged$0(z);
            throw AnonymousClass000.A0L();
        }

        public PanModeListenerStub(C14840qM r1) {
            this.mListener = r1;
        }
    }
}
