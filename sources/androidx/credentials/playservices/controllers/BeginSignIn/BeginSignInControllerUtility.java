package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass001;
import X.AnonymousClass0KT;
import X.AnonymousClass0ML;
import X.AnonymousClass4TH;
import X.AnonymousClass6T2;
import X.AnonymousClass6T3;
import X.AnonymousClass7VE;
import X.C006606f;
import X.C006706g;
import X.C153307b1;
import X.C162457s7;
import X.C378924l;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class BeginSignInControllerUtility {
    public static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    public static final Companion Companion = new Companion();
    public static final String TAG = "BeginSignInUtility";

    public final class Companion {
        public final AnonymousClass6T3 constructBeginSignInRequest$credentials_play_services_auth_release(AnonymousClass0KT r7, Context context) {
            C162457s7.A0J(r7, 0);
            C162457s7.A0J(context, 1);
            C153307b1 r3 = new C153307b1();
            boolean z = false;
            boolean z2 = false;
            for (AnonymousClass0ML r2 : r7.A00) {
                if (r2 instanceof C006706g) {
                    AnonymousClass7VE r0 = new AnonymousClass7VE();
                    r0.A01();
                    r3.A03(r0.A00());
                    if (!z) {
                        z = false;
                        if (!r2.A04) {
                        }
                    }
                    z = true;
                } else if ((r2 instanceof C006606f) && !z2) {
                    boolean needsBackwardsCompatibleRequest = needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context));
                    PublicKeyCredentialControllerUtility.Companion companion = PublicKeyCredentialControllerUtility.Companion;
                    C006606f r22 = (C006606f) r2;
                    if (needsBackwardsCompatibleRequest) {
                        r3.A02(companion.convertToPlayAuthPasskeyRequest(r22));
                    } else {
                        r3.A01(companion.convertToPlayAuthPasskeyJsonRequest(r22));
                    }
                    z2 = true;
                }
            }
            r3.A04(z);
            return r3.A00();
        }

        private final AnonymousClass6T2 convertToGoogleIdTokenOption(AnonymousClass4TH r2) {
            throw AnonymousClass001.A0g("getFilterByAuthorizedAccounts");
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C162457s7.A0D(packageManager);
            return (long) packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long j) {
            if (j >= BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING) {
                return false;
            }
            return true;
        }

        public /* synthetic */ Companion(C378924l r1) {
        }

        public Companion() {
        }
    }
}
