package androidx.car.app.model;

import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.C07720ci;
import X.C14660q4;
import X.C14730qB;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;

public class OnItemVisibilityChangedDelegateImpl implements C14730qB {
    public final IOnItemVisibilityChangedListener mStub = null;

    public class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        public final C14660q4 mListener;

        public static /* synthetic */ Object $r8$lambda$L9b2ADhpclS72pxSCs8LEKoinxM(OnItemVisibilityChangedListenerStub onItemVisibilityChangedListenerStub, int i, int i2) {
            throw AnonymousClass001.A0g("onItemVisibilityChanged");
        }

        private /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i, int i2) {
            throw AnonymousClass001.A0g("onItemVisibilityChanged");
        }

        public void onItemVisibilityChanged(int i, int i2, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C07720ci(this, i, i2), "onItemVisibilityChanged");
        }

        public OnItemVisibilityChangedListenerStub(C14660q4 r1) {
            this.mListener = r1;
        }
    }
}
