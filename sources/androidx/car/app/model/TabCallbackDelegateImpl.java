package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.C14770qF;
import X.C14780qG;
import X.C18100wk;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;

public class TabCallbackDelegateImpl implements C14770qF {
    public final ITabCallback mStubCallback = null;

    public class TabCallbackStub extends ITabCallback.Stub {
        public final C14780qG mCallback;

        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18100wk(4, str, this), "onTabSelected");
        }

        private /* synthetic */ Object lambda$onTabSelected$0(String str) {
            throw AnonymousClass001.A0g("onTabSelected");
        }

        public static /* synthetic */ Object $r8$lambda$_zdJ9Sz7LyWrU55g8W2ta3htz5w(TabCallbackStub tabCallbackStub, String str) {
            tabCallbackStub.lambda$onTabSelected$0(str);
            throw AnonymousClass000.A0L();
        }

        public TabCallbackStub(C14780qG r1) {
            this.mCallback = r1;
        }
    }
}
