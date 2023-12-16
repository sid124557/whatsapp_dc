package androidx.credentials.playservices.controllers;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4GP;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C007106k;
import X.C007506o;
import X.C007906s;
import X.C008206v;
import X.C162457s7;
import X.C16630ti;
import X.C378924l;
import X.C69903Yy;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

public abstract class CredentialProviderController extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion();
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    public final Context context;

    public final class Companion {
        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, AnonymousClass4GP r3) {
            C162457s7.A0J(r3, 1);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                r3.invoke();
            }
        }

        public final boolean maybeReportErrorResultCodeCreate(int i, AnonymousClass4GR r6, AnonymousClass4GQ r7, CancellationSignal cancellationSignal) {
            C162457s7.A0J(r6, 1);
            C162457s7.A0J(r7, 2);
            if (i == -1) {
                return false;
            }
            C69903Yy r2 = new C69903Yy();
            r2.element = new C007506o(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                r2.element = new C007106k("activity is cancelled by the user.");
            }
            r6.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(r7, r2));
            return true;
        }

        public final boolean maybeReportErrorResultCodeGet(int i, AnonymousClass4GR r6, AnonymousClass4GQ r7, CancellationSignal cancellationSignal) {
            C162457s7.A0J(r6, 1);
            C162457s7.A0J(r7, 2);
            if (i == -1) {
                return false;
            }
            C69903Yy r2 = new C69903Yy();
            r2.element = new C008206v(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                r2.element = new C007906s("activity is cancelled by the user.");
            }
            r6.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(r7, r2));
            return true;
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("activity with result code: ");
            A0o.append(i);
            return AnonymousClass000.A0X(" indicating not RESULT_OK", A0o);
        }

        public /* synthetic */ Companion(C378924l r1) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context2) {
        super(context2);
        C162457s7.A0J(context2, 1);
        this.context = context2;
    }

    public abstract Object convertRequestToPlayServices(Object obj);

    public abstract Object convertResponseToCredentialManager(Object obj);

    public abstract void invokePlayServices(Object obj, C16630ti r2, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle bundle, AnonymousClass4GR r5, Executor executor, C16630ti r7, CancellationSignal cancellationSignal) {
        C162457s7.A0J(bundle, 0);
        C162457s7.A0J(r5, 1);
        C162457s7.A0J(executor, 2);
        C162457s7.A0J(r7, 3);
        if (!bundle.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderController$maybeReportErrorFromResultReceiver$1(executor, r7, r5.invoke(bundle.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), bundle.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, AnonymousClass4GP r2) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, r2);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, AnonymousClass4GR r2, AnonymousClass4GQ r3, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, r2, r3, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, AnonymousClass4GR r2, AnonymousClass4GQ r3, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, r2, r3, cancellationSignal);
    }
}
