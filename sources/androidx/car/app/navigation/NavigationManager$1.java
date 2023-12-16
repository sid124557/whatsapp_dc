package androidx.car.app.navigation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0O9;
import X.AnonymousClass0WP;
import X.C07710bl;
import X.C18090wj;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;

public class NavigationManager$1 extends INavigationManager.Stub {
    public final /* synthetic */ C07710bl this$0;
    public final /* synthetic */ AnonymousClass0O9 val$lifecycle;

    public NavigationManager$1(C07710bl r1, AnonymousClass0O9 r2) {
        this.this$0 = r1;
        this.val$lifecycle = r2;
    }

    private /* synthetic */ Object lambda$onStopNavigation$0() {
        throw AnonymousClass001.A0g("onStopNavigation");
    }

    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18090wj(this, 7), this.val$lifecycle, "onStopNavigation");
    }

    public static /* synthetic */ Object $r8$lambda$RsBMa_HbLu0DtZV9bYmvxrUt9U4(NavigationManager$1 navigationManager$1) {
        navigationManager$1.lambda$onStopNavigation$0();
        throw AnonymousClass000.A0L();
    }
}
