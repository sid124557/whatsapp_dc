package androidx.credentials.playservices;

import X.AnonymousClass4GP;
import X.AnonymousClass4GQ;
import X.C162457s7;
import X.C16630ti;
import X.C59022wD;
import X.C829045j;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl$onClearCredential$1 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C16630ti $callback;
    public final /* synthetic */ CancellationSignal $cancellationSignal;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$1(CancellationSignal cancellationSignal, Executor executor, C16630ti r4) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = r4;
    }

    public final void invoke(Void voidR) {
        CredentialProviderPlayServicesImpl.Companion companion = CredentialProviderPlayServicesImpl.Companion;
        CancellationSignal cancellationSignal = this.$cancellationSignal;
        final Executor executor = this.$executor;
        final C16630ti r1 = this.$callback;
        companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AnonymousClass4GP() {
            public static final void invoke$lambda$0(C16630ti r1) {
                C162457s7.A0J(r1, 0);
                r1.onResult((Object) null);
            }

            public final void invoke() {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "During clear credential, signed out successfully!");
                executor.execute(new CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0(r1));
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Void) null);
        return C59022wD.A00;
    }
}
