package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass06W;
import X.AnonymousClass0KR;
import X.C006106a;
import X.C127646St;
import X.C162457s7;
import X.C16630ti;
import X.C378924l;
import X.C59022wD;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController extends CredentialProviderController {
    public static final Companion Companion = new Companion();
    public static final String TAG = "CreatePassword";
    public static CredentialProviderCreatePasswordController controller;
    public C16630ti callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver = new CredentialProviderCreatePasswordController$resultReceiver$1(this, AnonymousClass000.A0A());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController(Context context2) {
        super(context2);
        C162457s7.A0J(context2, 1);
        this.context = context2;
    }

    public C127646St convertRequestToPlayServices(AnonymousClass06W r2) {
        C162457s7.A0J(r2, 0);
        throw AnonymousClass001.A0g("getId");
    }

    public void invokePlayServices(AnonymousClass06W r2, C16630ti r3, Executor executor2, CancellationSignal cancellationSignal2) {
        C162457s7.A0J(r2, 0);
        C162457s7.A0J(r3, 1);
        C162457s7.A0J(executor2, 2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = r3;
        this.executor = executor2;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            convertRequestToPlayServices(r2);
            throw AnonymousClass000.A0L();
        }
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context2) {
        return Companion.getInstance(context2);
    }

    public AnonymousClass0KR convertResponseToCredentialManager(C59022wD r2) {
        return new C006106a();
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2) {
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Returned request code ");
            A0o.append(i3);
            Log.w(TAG, AnonymousClass000.A0Y(" which does not match what was given ", A0o, i));
        } else if (!CredentialProviderController.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new CredentialProviderCreatePasswordController$handleResponse$2(this), this.cancellationSignal)) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePasswordController$handleResponse$3(this, new C006106a()));
        }
    }

    public final class Companion {
        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            C162457s7.A0J(context, 0);
            CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.controller;
            if (credentialProviderCreatePasswordController == null) {
                credentialProviderCreatePasswordController = new CredentialProviderCreatePasswordController(context);
                CredentialProviderCreatePasswordController.controller = credentialProviderCreatePasswordController;
            }
            C162457s7.A0H(credentialProviderCreatePasswordController);
            return credentialProviderCreatePasswordController;
        }

        public /* synthetic */ Companion(C378924l r1) {
        }

        public Companion() {
        }
    }

    public /* bridge */ /* synthetic */ Object convertRequestToPlayServices(Object obj) {
        convertRequestToPlayServices((AnonymousClass06W) null);
        throw AnonymousClass000.A0L();
    }

    public /* bridge */ /* synthetic */ Object convertResponseToCredentialManager(Object obj) {
        return new C006106a();
    }

    public /* bridge */ /* synthetic */ void invokePlayServices(Object obj, C16630ti r3, Executor executor2, CancellationSignal cancellationSignal2) {
        invokePlayServices((AnonymousClass06W) null, r3, executor2, cancellationSignal2);
    }
}
