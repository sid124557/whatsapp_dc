package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.C14680q6;
import X.C14800qI;
import X.C18110wl;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;

public class OnCheckedChangeDelegateImpl implements C14680q6 {
    public final IOnCheckedChangeListener mStub = null;

    public class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        public final C14800qI mListener;

        public void onCheckedChange(boolean z, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18110wl(0, this, z), "onCheckedChange");
        }

        private /* synthetic */ Object lambda$onCheckedChange$0(boolean z) {
            throw AnonymousClass001.A0g("onCheckedChange");
        }

        public static /* synthetic */ Object $r8$lambda$ajJY3J__wF0eQzHmi5qujwF7Tbg(OnCheckedChangeListenerStub onCheckedChangeListenerStub, boolean z) {
            onCheckedChangeListenerStub.lambda$onCheckedChange$0(z);
            throw AnonymousClass000.A0L();
        }

        public OnCheckedChangeListenerStub(C14800qI r1) {
            this.mListener = r1;
        }
    }
}
