package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.C14750qD;
import X.C14760qE;
import X.C18100wk;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;

public class SearchCallbackDelegateImpl implements C14750qD {
    public final ISearchCallback mStubCallback = null;

    public class SearchCallbackStub extends ISearchCallback.Stub {
        public final C14760qE mCallback;

        public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18100wk(2, str, this), "onSearchSubmitted");
        }

        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18100wk(3, str, this), "onSearchTextChanged");
        }

        private /* synthetic */ Object lambda$onSearchSubmitted$1(String str) {
            throw AnonymousClass001.A0g("onSearchSubmitted");
        }

        private /* synthetic */ Object lambda$onSearchTextChanged$0(String str) {
            throw AnonymousClass001.A0g("onSearchTextChanged");
        }

        public static /* synthetic */ Object $r8$lambda$7_1W9_T5a2DIwVbigN8QKwBUMDg(SearchCallbackStub searchCallbackStub, String str) {
            searchCallbackStub.lambda$onSearchSubmitted$1(str);
            throw AnonymousClass000.A0L();
        }

        /* renamed from: $r8$lambda$lWaS-liOrYxg3ODag2RALLEM1OQ  reason: not valid java name */
        public static /* synthetic */ Object m4$r8$lambda$lWaSliOrYxg3ODag2RALLEM1OQ(SearchCallbackStub searchCallbackStub, String str) {
            searchCallbackStub.lambda$onSearchTextChanged$0(str);
            throw AnonymousClass000.A0L();
        }

        public SearchCallbackStub(C14760qE r1) {
            this.mCallback = r1;
        }
    }
}
