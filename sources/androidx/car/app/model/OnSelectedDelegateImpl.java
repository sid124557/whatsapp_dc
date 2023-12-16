package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.C14670q5;
import X.C14740qC;
import X.C18080wi;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;

public class OnSelectedDelegateImpl implements C14740qC {
    public final IOnSelectedListener mStub = null;

    public class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        public final C14670q5 mListener;

        public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18080wi(this, i, 1), "onSelectedListener");
        }

        private /* synthetic */ Object lambda$onSelected$0(int i) {
            throw AnonymousClass001.A0g("onSelected");
        }

        public static /* synthetic */ Object $r8$lambda$fKUdzFllb1AVIyam1QyB6oddRTc(OnSelectedListenerStub onSelectedListenerStub, int i) {
            onSelectedListenerStub.lambda$onSelected$0(i);
            throw AnonymousClass000.A0L();
        }

        public OnSelectedListenerStub(C14670q5 r1) {
            this.mListener = r1;
        }
    }
}
