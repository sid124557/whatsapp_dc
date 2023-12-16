package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4GP;
import X.C006806h;
import X.C162457s7;
import X.C16630ti;
import X.C829045j;
import android.util.Log;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C16630ti $callback;
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ Executor $executor;

    public static final void invoke$lambda$0(C16630ti r2, Exception exc) {
        C162457s7.A0J(r2, 0);
        C162457s7.A0J(exc, 1);
        r2.BSE(new C006806h(exc.getMessage()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, C16630ti r4) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = r4;
    }

    public final void invoke() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("During clear credential sign out failed with ");
        Log.w(CredentialProviderPlayServicesImpl.TAG, AnonymousClass000.A0R(this.$e, A0o));
        this.$executor.execute(new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1$$ExternalSyntheticLambda0(this.$callback, this.$e));
    }
}
