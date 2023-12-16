package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0GQ;
import X.AnonymousClass0KS;
import X.AnonymousClass0KT;
import X.AnonymousClass0KU;
import X.AnonymousClass4GP;
import X.AnonymousClass4TG;
import X.AnonymousClass5UZ;
import X.AnonymousClass6T3;
import X.AnonymousClass6TI;
import X.AnonymousClass72F;
import X.C006306c;
import X.C006406d;
import X.C007906s;
import X.C008006t;
import X.C008206v;
import X.C162457s7;
import X.C16630ti;
import X.C378924l;
import X.C69903Yy;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import java.util.concurrent.Executor;

public final class CredentialProviderBeginSignInController extends CredentialProviderController {
    public static final Companion Companion = new Companion();
    public static final String TAG = "BeginSignIn";
    public static CredentialProviderBeginSignInController controller;
    public C16630ti callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver = new CredentialProviderBeginSignInController$resultReceiver$1(this, AnonymousClass000.A0A());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController(Context context2) {
        super(context2);
        C162457s7.A0J(context2, 1);
        this.context = context2;
    }

    public AnonymousClass6T3 convertRequestToPlayServices(AnonymousClass0KT r3) {
        C162457s7.A0J(r3, 0);
        return BeginSignInControllerUtility.Companion.constructBeginSignInRequest$credentials_play_services_auth_release(r3, this.context);
    }

    public AnonymousClass0KU convertResponseToCredentialManager(AnonymousClass6TI r6) {
        AnonymousClass0KS r3;
        C162457s7.A0J(r6, 0);
        String A07 = r6.A07();
        if (A07 != null) {
            String A06 = r6.A06();
            C162457s7.A0D(A06);
            C162457s7.A0H(A07);
            Bundle A08 = AnonymousClass002.A08();
            A08.putString("androidx.credentials.BUNDLE_KEY_ID", A06);
            A08.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", A07);
            r3 = new C006406d(A07, A08);
        } else if (r6.A05() != null) {
            r3 = createGoogleIdCredential(r6);
        } else if (r6.A01() != null) {
            String assertPasskeyResponse = PublicKeyCredentialControllerUtility.Companion.toAssertPasskeyResponse(r6);
            Bundle A082 = AnonymousClass002.A08();
            A082.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", assertPasskeyResponse);
            r3 = new C006306c(assertPasskeyResponse, A082);
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            throw new C008206v("When attempting to convert get response, null credential found");
        }
        return new AnonymousClass0KU(r3);
    }

    public void invokePlayServices(AnonymousClass0KT r5, C16630ti r6, Executor executor2, CancellationSignal cancellationSignal2) {
        C162457s7.A0J(r5, 0);
        C162457s7.A0J(r6, 1);
        C162457s7.A0J(executor2, 2);
        this.cancellationSignal = cancellationSignal2;
        setCallback(r6);
        setExecutor(executor2);
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            AnonymousClass6T3 convertRequestToPlayServices = convertRequestToPlayServices(r5);
            Intent intent = new Intent(this.context, HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
            try {
                this.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, new CredentialProviderBeginSignInController$invokePlayServices$1(this));
            }
        }
    }

    public final void setCallback(C16630ti r2) {
        C162457s7.A0J(r2, 0);
        this.callback = r2;
    }

    public final void setExecutor(Executor executor2) {
        C162457s7.A0J(executor2, 0);
        this.executor = executor2;
    }

    private final AnonymousClass4TG createGoogleIdCredential(AnonymousClass6TI r3) {
        AnonymousClass5UZ r1 = new AnonymousClass5UZ();
        String A06 = r3.A06();
        C162457s7.A0D(A06);
        r1.A05(A06);
        String A05 = r3.A05();
        C162457s7.A0H(A05);
        r1.A06(A05);
        String A02 = r3.A02();
        if (A02 != null) {
            r1.A02(A02);
        }
        String A04 = r3.A04();
        if (A04 != null) {
            r1.A04(A04);
        }
        String A03 = r3.A03();
        if (A03 != null) {
            r1.A03(A03);
        }
        String A08 = r3.A08();
        if (A08 != null) {
            r1.A07(A08);
        }
        Uri A00 = r3.A00();
        if (A00 != null) {
            r1.A01(A00);
        }
        return r1.A00();
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context2) {
        return Companion.getInstance(context2);
    }

    public final C16630ti getCallback() {
        C16630ti r0 = this.callback;
        if (r0 != null) {
            return r0;
        }
        C162457s7.A0M("callback");
        throw AnonymousClass000.A0L();
    }

    public final Executor getExecutor() {
        Executor executor2 = this.executor;
        if (executor2 != null) {
            return executor2;
        }
        C162457s7.A0M("executor");
        throw AnonymousClass000.A0L();
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        Object r1;
        CancellationSignal cancellationSignal2;
        AnonymousClass4GP r12;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Returned request code ");
            A0o.append(i3);
            Log.w(TAG, AnonymousClass000.A0Y(" which  does not match what was given ", A0o, i));
        } else if (!CredentialProviderController.maybeReportErrorResultCodeGet(i2, CredentialProviderBeginSignInController$handleResponse$1.INSTANCE, new CredentialProviderBeginSignInController$handleResponse$2(this), this.cancellationSignal)) {
            try {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$3(this, convertResponseToCredentialManager(AnonymousClass72F.A00(this.context).BD2(intent))));
            } catch (ApiException e) {
                C69903Yy r3 = new C69903Yy();
                r3.element = new C008206v(e.getMessage());
                int statusCode = e.getStatusCode();
                if (statusCode == 16) {
                    r1 = new C007906s(e.getMessage());
                } else {
                    if (CredentialProviderBaseController.retryables.contains(Integer.valueOf(statusCode))) {
                        r1 = new C008006t(e.getMessage());
                    }
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, r3));
                }
                r3.element = r1;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, r3));
            } catch (AnonymousClass0GQ e2) {
                cancellationSignal2 = this.cancellationSignal;
                r12 = new CredentialProviderBeginSignInController$handleResponse$5(this, e2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r12);
            } catch (Throwable th) {
                C008206v r0 = new C008206v(th.getMessage());
                cancellationSignal2 = this.cancellationSignal;
                r12 = new CredentialProviderBeginSignInController$handleResponse$6(this, r0);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r12);
            }
        }
    }

    public final class Companion {
        public final CredentialProviderBeginSignInController getInstance(Context context) {
            C162457s7.A0J(context, 0);
            CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.controller;
            if (credentialProviderBeginSignInController == null) {
                credentialProviderBeginSignInController = new CredentialProviderBeginSignInController(context);
                CredentialProviderBeginSignInController.controller = credentialProviderBeginSignInController;
            }
            C162457s7.A0H(credentialProviderBeginSignInController);
            return credentialProviderBeginSignInController;
        }

        public /* synthetic */ Companion(C378924l r1) {
        }

        public Companion() {
        }
    }
}
