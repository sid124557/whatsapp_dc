package androidx.car.app.model;

import X.AnonymousClass0WP;
import X.C14690q7;
import X.C14700q8;
import X.C18090wj;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;

public class OnClickDelegateImpl implements C14690q7 {
    public final boolean mIsParkedOnly = false;
    public final IOnClickListener mListener = null;

    public class OnClickListenerStub extends IOnClickListener.Stub {
        public final C14700q8 mOnClickListener;

        public void onClick(IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18090wj(this, 5), "onClick");
        }

        private /* synthetic */ Object lambda$onClick$0() {
            return null;
        }

        public OnClickListenerStub(C14700q8 r1) {
            this.mOnClickListener = r1;
        }

        public static /* synthetic */ Object $r8$lambda$hBurHfjgoNp7dYb5RG4AbNHxQG4(OnClickListenerStub onClickListenerStub) {
            return null;
        }
    }
}
