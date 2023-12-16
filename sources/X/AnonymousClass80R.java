package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* renamed from: X.80R  reason: invalid class name */
public final class AnonymousClass80R implements C16850u7 {
    public final /* synthetic */ SignInHubActivity A00;

    public /* synthetic */ AnonymousClass80R(SignInHubActivity signInHubActivity) {
        this.A00 = signInHubActivity;
    }

    public final C04740Ql BQO(Bundle bundle, int i) {
        SignInHubActivity signInHubActivity = this.A00;
        Set set = C159087l6.A00;
        synchronized (set) {
        }
        return new AnonymousClass6H7(signInHubActivity, set);
    }

    public final /* bridge */ /* synthetic */ void BVX(C04740Ql r4, Object obj) {
        SignInHubActivity signInHubActivity = this.A00;
        signInHubActivity.setResult(signInHubActivity.A00, signInHubActivity.A01);
        signInHubActivity.finish();
    }

    public final void BVf(C04740Ql r1) {
    }
}
