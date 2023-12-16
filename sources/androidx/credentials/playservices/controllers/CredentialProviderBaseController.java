package androidx.credentials.playservices.controllers;

import X.AnonymousClass000;
import X.AnonymousClass0GP;
import X.AnonymousClass0GQ;
import X.C007106k;
import X.C007206l;
import X.C007506o;
import X.C007906s;
import X.C008006t;
import X.C008206v;
import X.C008406x;
import X.C162457s7;
import X.C378924l;
import X.C73833g9;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;

public class CredentialProviderBaseController {
    public static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    public static final String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";
    public static final int CONTROLLER_REQUEST_CODE = 1;
    public static final String CREATE_CANCELED = "CREATE_CANCELED";
    public static final String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";
    public static final String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";
    public static final String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";
    public static final String CREATE_UNKNOWN = "CREATE_UNKNOWN";
    public static final Companion Companion = new Companion();
    public static final String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";
    public static final String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";
    public static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    public static final String GET_CANCELED = "GET_CANCELED_TAG";
    public static final String GET_INTERRUPTED = "GET_INTERRUPTED";
    public static final String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";
    public static final String GET_UNKNOWN = "GET_UNKNOWN";
    public static final String REQUEST_TAG = "REQUEST_TYPE";
    public static final String RESULT_DATA_TAG = "RESULT_DATA";
    public static final String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";
    public static final String TYPE_TAG = "TYPE";
    public static final Set retryables;
    public final Context context;

    public final class Companion {
        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$annotations() {
        }

        public final AnonymousClass0GP createCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (C162457s7.A0P(str, CredentialProviderBaseController.CREATE_CANCELED)) {
                return new C007106k(str2);
            }
            if (C162457s7.A0P(str, CredentialProviderBaseController.CREATE_INTERRUPTED)) {
                return new C007206l(str2);
            }
            return new C007506o(str2);
        }

        public final int getCONTROLLER_REQUEST_CODE() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        public final AnonymousClass0GQ getCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals(CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new C008406x(str2);
                        }
                    } else if (str.equals(CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new C008006t(str2);
                    }
                } else if (str.equals(CredentialProviderBaseController.GET_CANCELED)) {
                    return new C007906s(str2);
                }
            }
            return new C008206v(str2);
        }

        public final Set getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        public /* synthetic */ Companion(C378924l r1) {
        }

        public Companion() {
        }
    }

    public CredentialProviderBaseController(Context context2) {
        C162457s7.A0J(context2, 1);
        this.context = context2;
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent intent, String str) {
        C162457s7.A0J(resultReceiver, 0);
        C162457s7.A0J(intent, 1);
        C162457s7.A0J(str, 2);
        intent.putExtra(TYPE_TAG, str);
        intent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        intent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        intent.setFlags(65536);
    }

    static {
        Integer[] numArr = new Integer[3];
        AnonymousClass000.A1L(numArr, 8);
        AnonymousClass000.A1M(numArr, 7);
        AnonymousClass000.A1N(numArr, 20);
        retryables = C73833g9.A06(numArr);
    }

    public static final int getCONTROLLER_REQUEST_CODE() {
        return CONTROLLER_REQUEST_CODE;
    }

    public final ResultReceiver toIpcFriendlyResultReceiver(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        C162457s7.A0D(obtain);
        C162457s7.A0H(resultReceiver);
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}
