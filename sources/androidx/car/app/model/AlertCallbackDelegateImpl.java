package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.AnonymousClass0q0;
import X.C14630q1;
import X.C18080wi;
import X.C18090wj;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IAlertCallback;

public class AlertCallbackDelegateImpl implements C14630q1 {
    public final IAlertCallback mCallback = null;

    public class AlertCallbackStub extends IAlertCallback.Stub {
        public final AnonymousClass0q0 mCallback;

        public void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18080wi(this, i, 0), "onCancel");
        }

        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18090wj(this, 4), "onDismiss");
        }

        private /* synthetic */ Object lambda$onAlertCancelled$0(int i) {
            throw AnonymousClass001.A0g("onCancel");
        }

        private /* synthetic */ Object lambda$onAlertDismissed$1() {
            throw AnonymousClass001.A0g("onDismiss");
        }

        public static /* synthetic */ Object $r8$lambda$JmL_KwhfYm06GTqsky9CjbsY8_o(AlertCallbackStub alertCallbackStub) {
            alertCallbackStub.lambda$onAlertDismissed$1();
            throw AnonymousClass000.A0L();
        }

        public static /* synthetic */ Object $r8$lambda$x1zoKpRCTVEbSbYWKHNstLhHAFE(AlertCallbackStub alertCallbackStub, int i) {
            alertCallbackStub.lambda$onAlertCancelled$0(i);
            throw AnonymousClass000.A0L();
        }

        public AlertCallbackStub(AnonymousClass0q0 r1) {
            this.mCallback = r1;
        }
    }
}
