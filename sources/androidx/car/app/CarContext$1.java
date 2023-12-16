package androidx.car.app;

import X.AnonymousClass001;
import X.AnonymousClass00l;
import X.AnonymousClass08A;
import X.AnonymousClass0GC;
import X.AnonymousClass0O9;
import X.C11780kC;
import X.C14590pw;
import androidx.car.app.IOnRequestPermissionsListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    public final /* synthetic */ AnonymousClass00l this$0;
    public final /* synthetic */ Executor val$executor;
    public final /* synthetic */ AnonymousClass0O9 val$lifecycle;
    public final /* synthetic */ C14590pw val$listener;

    /* renamed from: $r8$lambda$JkwbRKtcw-K0At_ARcPdE2GdQW0  reason: not valid java name */
    public static /* synthetic */ void m2$r8$lambda$JkwbRKtcwK0At_ARcPdE2GdQW0(C14590pw r0, List list, List list2) {
        throw AnonymousClass001.A0g("onRequestPermissionsResult");
    }

    public CarContext$1(AnonymousClass00l r1, AnonymousClass0O9 r2, Executor executor, C14590pw r4) {
        this.this$0 = r1;
        this.val$lifecycle = r2;
        this.val$executor = executor;
        this.val$listener = r4;
    }

    public static /* synthetic */ void lambda$onRequestPermissionsResult$0(C14590pw r0, List list, List list2) {
        throw AnonymousClass001.A0g("onRequestPermissionsResult");
    }

    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (AnonymousClass001.A1U(((AnonymousClass08A) this.val$lifecycle).A02.compareTo(AnonymousClass0GC.CREATED))) {
            this.val$executor.execute(new C11780kC(Arrays.asList(strArr), Arrays.asList(strArr2)));
        }
    }
}
