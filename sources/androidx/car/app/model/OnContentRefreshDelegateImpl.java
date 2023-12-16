package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.C14710q9;
import X.C14720qA;
import X.C18090wj;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;

public class OnContentRefreshDelegateImpl implements C14710q9 {
    public final IOnContentRefreshListener mListener = null;

    public class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        public final C14720qA mOnContentRefreshListener;

        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18090wj(this, 6), "onClick");
        }

        private /* synthetic */ Object lambda$onContentRefreshRequested$0() {
            throw AnonymousClass001.A0g("onContentRefreshRequested");
        }

        public static /* synthetic */ Object $r8$lambda$qpIEmDYiOPiQhLLEH06VjZMpOLY(OnContentRefreshListenerStub onContentRefreshListenerStub) {
            onContentRefreshListenerStub.lambda$onContentRefreshRequested$0();
            throw AnonymousClass000.A0L();
        }

        public OnContentRefreshListenerStub(C14720qA r1) {
            this.mOnContentRefreshListener = r1;
        }
    }
}
