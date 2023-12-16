package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass06X;
import X.AnonymousClass06Z;
import X.AnonymousClass072;
import X.AnonymousClass07O;
import X.AnonymousClass07R;
import X.AnonymousClass0GP;
import X.AnonymousClass0KR;
import X.AnonymousClass4GP;
import X.AnonymousClass6UX;
import X.C127836Tm;
import X.C162457s7;
import X.C16630ti;
import X.C378924l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;
import org.json.JSONException;

public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController {
    public static final Companion Companion = new Companion();
    public static final String TAG = "CreatePublicKey";
    public static CredentialProviderCreatePublicKeyCredentialController controller;
    public C16630ti callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1(this, AnonymousClass000.A0A());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController(Context context2) {
        super(context2);
        C162457s7.A0J(context2, 1);
        this.context = context2;
    }

    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        C162457s7.A0J(credentialProviderCreatePublicKeyCredentialController, 0);
        C16630ti r3 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (r3 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else {
            r3.BSE(new AnonymousClass07R(new AnonymousClass07O(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        }
    }

    public AnonymousClass6UX convertRequestToPlayServices(AnonymousClass06X r2) {
        C162457s7.A0J(r2, 0);
        return PublicKeyCredentialControllerUtility.Companion.convert(r2);
    }

    public AnonymousClass0KR convertResponseToCredentialManager(C127836Tm r4) {
        C162457s7.A0J(r4, 0);
        String createPasskeyResponseJson = PublicKeyCredentialControllerUtility.Companion.toCreatePasskeyResponseJson(r4);
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", createPasskeyResponseJson);
        return new AnonymousClass06Z(createPasskeyResponseJson, A08);
    }

    public void invokePlayServices(AnonymousClass06X r5, C16630ti r6, Executor executor2, CancellationSignal cancellationSignal2) {
        AnonymousClass4GP r1;
        C162457s7.A0J(r5, 0);
        C162457s7.A0J(r6, 1);
        C162457s7.A0J(executor2, 2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = r6;
        this.executor = executor2;
        try {
            AnonymousClass6UX convertRequestToPlayServices = convertRequestToPlayServices(r5);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
                Intent intent = new Intent(this.context, HiddenActivity.class);
                intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
                generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
                try {
                    this.context.startActivity(intent);
                } catch (Exception unused) {
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(this));
                }
            }
        } catch (JSONException e) {
            r1 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(this, e);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
        } catch (Throwable th) {
            r1 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(this, th);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
        }
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context2) {
        return Companion.getInstance(context2);
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        CancellationSignal cancellationSignal2;
        AnonymousClass4GP r1;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Returned request code ");
            A0o.append(i3);
            Log.w(TAG, AnonymousClass000.A0Y(" does not match what was given ", A0o, i));
        } else if (CredentialProviderController.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
        } else {
            if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA")) != null) {
                C127836Tm A00 = C127836Tm.A00(byteArrayExtra);
                C162457s7.A0D(A00);
                AnonymousClass0GP publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(A00);
                if (publicKeyCredentialResponseContainsError != null) {
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, publicKeyCredentialResponseContainsError));
                    return;
                }
                try {
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(A00)));
                } catch (JSONException e) {
                    cancellationSignal2 = this.cancellationSignal;
                    r1 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e);
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
                } catch (Throwable th) {
                    cancellationSignal2 = this.cancellationSignal;
                    r1 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th);
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
                }
            } else if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                Executor executor2 = this.executor;
                if (executor2 == null) {
                    C162457s7.A0M("executor");
                    throw AnonymousClass000.A0L();
                } else {
                    executor2.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0(this));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final AnonymousClass07R JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        if (message == null || message.length() <= 0) {
            return new AnonymousClass07R(new AnonymousClass072(), "Unknown error");
        }
        return new AnonymousClass07R(new AnonymousClass072(), message);
    }

    public final class Companion {
        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            C162457s7.A0J(context, 0);
            CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.controller;
            if (credentialProviderCreatePublicKeyCredentialController == null) {
                credentialProviderCreatePublicKeyCredentialController = new CredentialProviderCreatePublicKeyCredentialController(context);
                CredentialProviderCreatePublicKeyCredentialController.controller = credentialProviderCreatePublicKeyCredentialController;
            }
            C162457s7.A0H(credentialProviderCreatePublicKeyCredentialController);
            return credentialProviderCreatePublicKeyCredentialController;
        }

        public /* synthetic */ Companion(C378924l r1) {
        }

        public Companion() {
        }
    }
}
