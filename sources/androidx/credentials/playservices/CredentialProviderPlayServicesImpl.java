package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass06X;
import X.AnonymousClass0GV;
import X.AnonymousClass0GW;
import X.AnonymousClass0KT;
import X.AnonymousClass0u5;
import X.AnonymousClass4GP;
import X.AnonymousClass4GQ;
import X.AnonymousClass6Q8;
import X.AnonymousClass72F;
import X.C03710Lg;
import X.C162457s7;
import X.C16630ti;
import X.C378924l;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl implements AnonymousClass0u5 {
    public static final Companion Companion = new Companion();
    public static final String TAG = "PlayServicesImpl";
    public final Context context;
    public AnonymousClass6Q8 googleApiAvailability = AnonymousClass6Q8.A01();

    public final class Companion {
        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, AnonymousClass4GP r3) {
            C162457s7.A0J(r3, 1);
            if (!cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                r3.invoke();
            }
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            } else if (!cancellationSignal.isCanceled()) {
                return false;
            } else {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
                return true;
            }
        }

        public /* synthetic */ Companion(C378924l r1) {
        }

        public Companion() {
        }
    }

    public CredentialProviderPlayServicesImpl(Context context2) {
        C162457s7.A0J(context2, 1);
        this.context = context2;
    }

    public static final void onClearCredential$lambda$0(AnonymousClass4GQ r1, Object obj) {
        C162457s7.A0J(r1, 0);
        r1.invoke(obj);
    }

    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, C16630ti r4, Exception exc) {
        C162457s7.A0J(executor, 2);
        C162457s7.A0J(r4, 3);
        C162457s7.A0J(exc, 4);
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(exc, executor, r4));
    }

    public void onClearCredential(AnonymousClass0GV r4, CancellationSignal cancellationSignal, Executor executor, C16630ti r7) {
        C162457s7.A0J(executor, 2);
        C162457s7.A0J(r7, 3);
        if (!Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            Task BpJ = AnonymousClass72F.A00(this.context).BpJ();
            BpJ.addOnSuccessListener(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(new CredentialProviderPlayServicesImpl$onClearCredential$1(cancellationSignal, executor, r7)));
            BpJ.addOnFailureListener(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1(this, cancellationSignal, executor, r7));
        }
    }

    public void onCreateCredential(Context context2, C03710Lg r3, CancellationSignal cancellationSignal, Executor executor, C16630ti r6) {
        C162457s7.A0J(context2, 0);
        C162457s7.A0J(r3, 1);
        C162457s7.A0J(executor, 3);
        C162457s7.A0J(r6, 4);
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (r3 instanceof AnonymousClass06X) {
            CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context2).invokePlayServices((AnonymousClass06X) r3, r6, executor, cancellationSignal);
            return;
        }
        throw AnonymousClass002.A0G("Create Credential request is unsupported, not password or publickeycredential");
    }

    public void onGetCredential(Context context2, AnonymousClass0KT r3, CancellationSignal cancellationSignal, Executor executor, C16630ti r6) {
        C162457s7.A0J(context2, 0);
        C162457s7.A0J(r3, 1);
        C162457s7.A0J(executor, 3);
        C162457s7.A0J(r6, 4);
        if (!Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            new CredentialProviderBeginSignInController(context2).invokePlayServices(r3, r6, executor, cancellationSignal);
        }
    }

    public final void setGoogleApiAvailability(AnonymousClass6Q8 r2) {
        C162457s7.A0J(r2, 0);
        this.googleApiAvailability = r2;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context2) {
        return this.googleApiAvailability.A03(context2);
    }

    public final AnonymousClass6Q8 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public boolean isAvailableOnDevice() {
        return AnonymousClass000.A1T(isGooglePlayServicesAvailable(this.context));
    }

    public /* synthetic */ void onPrepareCredential(AnonymousClass0KT r1, CancellationSignal cancellationSignal, Executor executor, C16630ti r4) {
    }

    public /* synthetic */ void onGetCredential(Context context2, AnonymousClass0GW r2, CancellationSignal cancellationSignal, Executor executor, C16630ti r5) {
    }
}
