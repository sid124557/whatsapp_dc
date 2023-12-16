package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4GQ;
import X.AnonymousClass6T3;
import X.AnonymousClass6UX;
import X.C127016Qh;
import X.C127026Qi;
import X.C127646St;
import X.C155337eh;
import X.C162457s7;
import X.C1693388x;
import X.C1693488y;
import X.C187718xh;
import X.C187738xj;
import X.C378924l;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class HiddenActivity extends Activity {
    public static final Companion Companion = new Companion();
    public static final int DEFAULT_VALUE = 1;
    public static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    public static final String TAG = "HiddenActivity";
    public boolean mWaitingForActivityResult;
    public ResultReceiver resultReceiver;

    public static final void handleBeginSignIn$lambda$6$lambda$4(AnonymousClass4GQ r1, Object obj) {
        C162457s7.A0J(r1, 0);
        r1.invoke(obj);
    }

    public static final void handleBeginSignIn$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C162457s7.A0J(hiddenActivity, 0);
        C162457s7.A0J(exc, 1);
        if (!(exc instanceof ApiException) || !CredentialProviderBaseController.retryables.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
            str = CredentialProviderBaseController.GET_NO_CREDENTIALS;
        } else {
            str = CredentialProviderBaseController.GET_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        C162457s7.A0H(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, AnonymousClass000.A0a("During begin sign in, failure response from one tap: ", AnonymousClass001.A0o(), exc));
    }

    public static final void handleCreatePassword$lambda$10$lambda$8(AnonymousClass4GQ r1, Object obj) {
        C162457s7.A0J(r1, 0);
        r1.invoke(obj);
    }

    public static final void handleCreatePassword$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C162457s7.A0J(hiddenActivity, 0);
        C162457s7.A0J(exc, 1);
        if (!(exc instanceof ApiException) || !CredentialProviderBaseController.retryables.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        } else {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        C162457s7.A0H(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, AnonymousClass000.A0a("During save password, found password failure response from one tap ", AnonymousClass001.A0o(), exc));
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(AnonymousClass4GQ r1, Object obj) {
        C162457s7.A0J(r1, 0);
        r1.invoke(obj);
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C162457s7.A0J(hiddenActivity, 0);
        C162457s7.A0J(exc, 1);
        if (!(exc instanceof ApiException) || !CredentialProviderBaseController.retryables.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        } else {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        C162457s7.A0H(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, AnonymousClass000.A0a("During create public key credential, fido registration failure: ", AnonymousClass001.A0o(), exc));
    }

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }

    public static C187718xh A00(Activity activity) {
        return new C127016Qh(activity, new C1693388x());
    }

    public static C187738xj A01(Activity activity) {
        return new C127026Qi(activity, new C1693488y());
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    private final void handleBeginSignIn() {
        AnonymousClass6T3 r4 = (AnonymousClass6T3) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (r4 != null) {
            Task Axk = A01(this).Axk(r4);
            Axk.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda2(new HiddenActivity$handleBeginSignIn$1$1(this, intExtra)));
            Axk.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda3(this));
            return;
        }
        Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
        finish();
    }

    private final void handleCreatePassword() {
        C127646St r4 = (C127646St) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (r4 != null) {
            Task Bkj = A00(this).Bkj(r4);
            Bkj.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda4(new HiddenActivity$handleCreatePassword$1$1(this, intExtra)));
            Bkj.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda5(this));
            return;
        }
        Log.i(TAG, "During save password, params is null, nothing to launch for create password");
        finish();
    }

    private final void handleCreatePublicKeyCredential() {
        AnonymousClass6UX r4 = (AnonymousClass6UX) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (r4 != null) {
            Task A04 = C155337eh.A00(this).A04(r4);
            A04.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda0(new HiddenActivity$handleCreatePublicKeyCredential$1$1(this, intExtra)));
            A04.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda1(this));
            return;
        }
        Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
        finish();
    }

    /* access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver2, String str, String str2) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        A08.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
        A08.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
        resultReceiver2.send(Integer.MAX_VALUE, A08);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        A08.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i);
        A08.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
        ResultReceiver resultReceiver2 = this.resultReceiver;
        if (resultReceiver2 != null) {
            resultReceiver2.send(i2, A08);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver2 = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver2;
        if (resultReceiver2 == null) {
            finish();
        }
        restoreState(bundle);
        if (!this.mWaitingForActivityResult) {
            if (stringExtra != null) {
                int hashCode = stringExtra.hashCode();
                if (hashCode != -441061071) {
                    if (hashCode != 15545322) {
                        if (hashCode == 1246634622 && stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                            handleCreatePassword();
                            return;
                        }
                    } else if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                } else if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                    handleBeginSignIn();
                    return;
                }
            }
            Log.w(TAG, "Activity handed an unsupported type");
            finish();
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C378924l r1) {
        }

        public Companion() {
        }
    }
}
