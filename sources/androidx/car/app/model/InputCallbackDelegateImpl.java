package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WP;
import X.C14640q2;
import X.C14650q3;
import X.C18100wk;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;

public class InputCallbackDelegateImpl implements C14650q3 {
    public final IInputCallback mCallback = null;

    public class OnInputCallbackStub extends IInputCallback.Stub {
        public final C14640q2 mCallback;

        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18100wk(0, str, this), "onInputSubmitted");
        }

        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0WP.A01(iOnDoneCallback, new C18100wk(1, str, this), "onInputTextChanged");
        }

        private /* synthetic */ Object lambda$onInputSubmitted$0(String str) {
            throw AnonymousClass001.A0g("onInputSubmitted");
        }

        private /* synthetic */ Object lambda$onInputTextChanged$1(String str) {
            throw AnonymousClass001.A0g("onInputTextChanged");
        }

        public static /* synthetic */ Object $r8$lambda$eBHPiP8W8cRmVPgNJbI3aEtxKRI(OnInputCallbackStub onInputCallbackStub, String str) {
            onInputCallbackStub.lambda$onInputTextChanged$1(str);
            throw AnonymousClass000.A0L();
        }

        /* renamed from: $r8$lambda$fXh5ps0gWZC7E28te7-xLK6HzGw  reason: not valid java name */
        public static /* synthetic */ Object m3$r8$lambda$fXh5ps0gWZC7E28te7xLK6HzGw(OnInputCallbackStub onInputCallbackStub, String str) {
            onInputCallbackStub.lambda$onInputSubmitted$0(str);
            throw AnonymousClass000.A0L();
        }

        public OnInputCallbackStub(C14640q2 r1) {
            this.mCallback = r1;
        }
    }
}
