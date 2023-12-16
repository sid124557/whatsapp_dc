package X;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: X.7re  reason: invalid class name and case insensitive filesystem */
public final class C162297re {
    public static final ComponentName A00 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final C151737Wc A01 = new C151737Wc("Auth", "GoogleAuthUtil");
    public static final String[] A02 = {"com.google", "com.google.work", "cn.google"};

    public static Object A02(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof ApiException) {
                throw cause;
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str});
            A01.A01(format, new Object[0]);
            throw new IOException(format, e);
        } catch (InterruptedException e2) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str});
            A01.A01(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (CancellationException e3) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str});
            A01.A01(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static TokenData A00(Bundle bundle) {
        C141116v3 r1;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 != null) {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            TokenData tokenData = (TokenData) bundle2.getParcelable("TokenData");
            if (tokenData != null) {
                return tokenData;
            }
        }
        String string = bundle.getString("Error");
        C162177rO.A02(string);
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        C141116v3[] values = C141116v3.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = C141116v3.A0I;
                break;
            }
            r1 = values[i];
            if (r1.zzaj.equals(string)) {
                break;
            }
            i++;
        }
        if (C141116v3.A0G.equals(r1) || C141116v3.A0J.equals(r1) || C141116v3.A0K.equals(r1) || C141116v3.A0L.equals(r1) || C141116v3.A0H.equals(r1) || C141116v3.A0M.equals(r1) || C141116v3.A0A.equals(r1) || C141116v3.A02.equals(r1) || C141116v3.A03.equals(r1) || C141116v3.A04.equals(r1) || C141116v3.A05.equals(r1) || C141116v3.A06.equals(r1) || C141116v3.A07.equals(r1) || C141116v3.A09.equals(r1) || C141116v3.A01.equals(r1) || C141116v3.A08.equals(r1)) {
            A01.A01("isUserRecoverableError status: ".concat(String.valueOf(r1)), AnonymousClass4L0.A0U());
            throw new UserRecoverableAuthException(intent, string);
        } else if (C141116v3.A0D.equals(r1) || C141116v3.A0E.equals(r1) || C141116v3.A0F.equals(r1) || C141116v3.A0B.equals(r1) || C141116v3.A0C.equals(r1)) {
            throw AnonymousClass002.A0C(string);
        } else {
            throw new C143906zf(string);
        }
    }

    public static Object A01(ComponentName componentName, Context context, C180808lf r8) {
        C162727se r3 = new C162727se();
        C161367pV A002 = C161367pV.A00(context);
        try {
            if (A002.A02(r3, new C160537np(componentName), "GoogleAuthUtil")) {
                try {
                    C162177rO.A06("BlockingServiceConnection.getService() called on main thread");
                    if (!r3.A00) {
                        r3.A00 = true;
                        Object BtH = r8.BtH((IBinder) r3.A01.take());
                        A002.A01(r3, new C160537np(componentName));
                        return BtH;
                    }
                    throw AnonymousClass001.A0e("Cannot call get on this connection more than once");
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    A002.A01(r3, new C160537np(componentName));
                    throw th;
                }
            } else {
                throw AnonymousClass002.A0C("Could not bind to service.");
            }
        } catch (SecurityException e2) {
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass6C9.A1C(e2, A0L, 0);
            AnonymousClass6C8.A1B("SecurityException while bind to auth service: %s", "GoogleAuthUtil", A0L);
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static String A03(Account account, Context context) {
        TokenData tokenData;
        Bundle A08 = AnonymousClass002.A08();
        A04(account);
        C162177rO.A06("Calling this from your main thread can lead to deadlock");
        C162177rO.A07("oauth2:https://www.googleapis.com/auth/drive.appdata", "Scope cannot be empty or null.");
        A04(account);
        A05(context);
        Bundle bundle = new Bundle(A08);
        A06(context, bundle);
        C160447ne.A00(context);
        AnonymousClass8A8.A01.A00.BtG();
        if (AnonymousClass001.A1Z(AnonymousClass8AK.A0A.A02()) && A08(context)) {
            C127056Ql r5 = new C127056Ql(context);
            C162177rO.A07("oauth2:https://www.googleapis.com/auth/drive.appdata", "Scope cannot be null!");
            C157487iN r3 = new C157487iN((AnonymousClass70D) null);
            r3.A03 = new C127806Tj[]{C1462479h.A09};
            r3.A01 = new AnonymousClass89X(account, bundle, r5);
            r3.A00 = 1512;
            try {
                Bundle bundle2 = (Bundle) A02(r5.A02(r3.A00(), 1), "token retrieval");
                if (bundle2 != null) {
                    tokenData = A00(bundle2);
                    return tokenData.A02;
                }
                A01.A01("Service call returned null.", AnonymousClass4L0.A0U());
                throw AnonymousClass002.A0C("Service unavailable.");
            } catch (ApiException e) {
                C151737Wc r32 = A01;
                Object[] A1a = C18310x6.A1a("token retrieval");
                A1a[1] = Log.getStackTraceString(e);
                r32.A01("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", A1a);
            }
        }
        tokenData = (TokenData) A01(A00, context, new C1693088u(account, bundle));
        return tokenData.A02;
    }

    public static void A04(Account account) {
        if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = A02;
            int i = 0;
            while (!strArr[i].equals(account.type)) {
                i++;
                if (i >= 3) {
                    throw AnonymousClass001.A0c("Account type not supported");
                }
            }
            return;
        }
        throw AnonymousClass001.A0c("Account name cannot be empty!");
    }

    public static void A07(Context context, String str) {
        C162177rO.A06("Calling this from your main thread can lead to deadlock");
        A05(context);
        Bundle A08 = AnonymousClass002.A08();
        A06(context, A08);
        C160447ne.A00(context);
        AnonymousClass8A8.A01.A00.BtG();
        if (AnonymousClass001.A1Z(AnonymousClass8AK.A0A.A02()) && A08(context)) {
            C127056Ql r6 = new C127056Ql(context);
            AnonymousClass6TL r5 = new AnonymousClass6TL();
            r5.A00 = str;
            C157487iN r3 = new C157487iN((AnonymousClass70D) null);
            r3.A03 = new C127806Tj[]{C1462479h.A09};
            r3.A01 = new AnonymousClass89V(r6, r5);
            r3.A00 = 1513;
            try {
                A02(r6.A02(r3.A00(), 1), "clear token");
                return;
            } catch (ApiException e) {
                C151737Wc r32 = A01;
                Object[] A1a = C18310x6.A1a("clear token");
                A1a[1] = Log.getStackTraceString(e);
                r32.A01("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", A1a);
            }
        }
        A01(A00, context, new C1693188v(str, A08));
    }

    public static boolean A08(Context context) {
        if (AnonymousClass6Q8.A00.A04(context, 17895000) == 0) {
            AnonymousClass8A8.A01.A00.BtG();
            C188218yX r1 = ((AnonymousClass6VG) AnonymousClass8AK.A05.A02()).zzd;
            String str = context.getApplicationInfo().packageName;
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                if (AnonymousClass001.A0m(it).equals(str)) {
                }
            }
            return true;
        }
        return false;
    }

    public static void A05(Context context) {
        try {
            C162117rH.A03(context.getApplicationContext(), 8400000);
        } catch (AnonymousClass6QB e) {
            int i = e.zza;
            throw new C126936Px(new Intent(e.zza), e.getMessage(), i);
        } catch (C143476yw | GooglePlayServicesIncorrectManifestValueException e2) {
            throw new C143906zf(e2.getMessage(), e2);
        }
    }

    public static void A06(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }
}
