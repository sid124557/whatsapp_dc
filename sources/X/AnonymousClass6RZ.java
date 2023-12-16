package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.6RZ  reason: invalid class name */
public class AnonymousClass6RZ extends C127196Ra implements C187678xd {
    public final Bundle A00;
    public final AnonymousClass7P4 A01;
    public final Integer A02;

    public final void Bsy(C187258wr r8) {
        GoogleSignInAccount googleSignInAccount;
        try {
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C161417pa.A00(this.A0F).A01();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.A02;
            C162177rO.A02(num);
            AnonymousClass6SL r0 = new AnonymousClass6SL(account, googleSignInAccount, 2, num.intValue());
            C163107tH r3 = (C163107tH) A02();
            C127356Rq r2 = new C127356Rq(r0, 1);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(r3.A01);
            obtain.writeInt(1);
            r2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(r8.asBinder());
            r3.A00(12, obtain);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                r8.Bsv(new AnonymousClass6SF(new C127866Tp(8, (PendingIntent) null), (AnonymousClass6T1) null, 1));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public AnonymousClass6RZ(Context context, Bundle bundle, Looper looper, C187778xn r12, C187788xo r13, AnonymousClass7P4 r14) {
        super(context, looper, r12, r13, r14, 44);
        this.A01 = r14;
        this.A00 = bundle;
        this.A02 = r14.A00;
    }

    public static Bundle A00(AnonymousClass7P4 r4) {
        Integer num = r4.A00;
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable) null);
        if (num != null) {
            A08.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        A08.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        A08.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        A08.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        A08.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        A08.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        A08.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        A08.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        A08.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return A08;
    }

    public final boolean Bjs() {
        return true;
    }

    public final int B9m() {
        return 12451000;
    }
}
