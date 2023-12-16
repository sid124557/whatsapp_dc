package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.connectivity.NetworkStateManager$SubscriptionManagerBasedRoamingDetector;
import com.whatsapp.util.Log;

/* renamed from: X.2oe  reason: invalid class name and case insensitive filesystem */
public class C54392oe {
    public final C55682qk A00;
    public final C620633i A01;

    public int A00(boolean z) {
        NetworkInfo networkInfo;
        C620633i r5 = this.A01;
        TelephonyManager A0N = r5.A0N();
        ConnectivityManager A0H = r5.A0H();
        int i = 0;
        if (!(A0H == null || A0N == null)) {
            try {
                networkInfo = A0H.getActiveNetworkInfo();
            } catch (RuntimeException e) {
                networkInfo = null;
                if (!(e.getCause() instanceof DeadObjectException) && (Build.VERSION.SDK_INT < 24 || !(e.getCause() instanceof DeadSystemException))) {
                    throw e;
                }
            }
            if (z) {
                C18260x0.A1P(AnonymousClass001.A0o(), "app/network-type network-info=", networkInfo);
            }
            if (networkInfo != null) {
                boolean isConnected = networkInfo.isConnected();
                if (z) {
                    C18260x0.A1D("app/network-type network-connected=", AnonymousClass001.A0o(), isConnected);
                }
                if (isConnected) {
                    if (networkInfo.getType() == 1) {
                        return 1;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Pair determineNetworkStateUsingSubscriptionManager = NetworkStateManager$SubscriptionManagerBasedRoamingDetector.determineNetworkStateUsingSubscriptionManager(r5, z);
                        if (AnonymousClass001.A1Z(determineNetworkStateUsingSubscriptionManager.first)) {
                            return C18290x4.A03(determineNetworkStateUsingSubscriptionManager);
                        }
                    }
                    boolean isRoaming = networkInfo.isRoaming();
                    if (z) {
                        C18260x0.A1D("app/network-type network-roaming=", AnonymousClass001.A0o(), isRoaming);
                    }
                    i = 3;
                    if (!isRoaming) {
                        boolean isNetworkRoaming = A0N.isNetworkRoaming();
                        if (z) {
                            C18260x0.A1D("app/network-type telephony-roaming=", AnonymousClass001.A0o(), isNetworkRoaming);
                        }
                        if (!isNetworkRoaming) {
                            String simCountryIso = A0N.getSimCountryIso();
                            if (z) {
                                C18260x0.A0q("app/network-type sim-iso=", simCountryIso, AnonymousClass001.A0o());
                            }
                            if (!TextUtils.isEmpty(simCountryIso)) {
                                String simOperator = A0N.getSimOperator();
                                if (z) {
                                    C18260x0.A0q("app/network-type sim-operator=", simOperator, AnonymousClass001.A0o());
                                }
                                if (!TextUtils.isEmpty(simOperator)) {
                                    if (A0N.getPhoneType() != 2) {
                                        String networkCountryIso = A0N.getNetworkCountryIso();
                                        if (z) {
                                            C18260x0.A0q("app/network-type network-iso=", networkCountryIso, AnonymousClass001.A0o());
                                        }
                                        if (!TextUtils.isEmpty(networkCountryIso) && simCountryIso.equals(networkCountryIso)) {
                                            String networkOperator = A0N.getNetworkOperator();
                                            if (z) {
                                                C18260x0.A0q("app/network-type network-operator=", networkOperator, AnonymousClass001.A0o());
                                            }
                                            if (!TextUtils.isEmpty(networkOperator)) {
                                                if (networkOperator.equals(simOperator) || AnonymousClass2BM.A00.contains(AnonymousClass0x9.A0G(networkOperator, simOperator))) {
                                                    return 2;
                                                }
                                                return 3;
                                            }
                                        }
                                    }
                                    return 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public NetworkInfo A01() {
        C620633i r1 = this.A01;
        C620633i.A0P = true;
        ConnectivityManager A0H = r1.A0H();
        C620633i.A0P = false;
        if (A0H != null) {
            return A0H.getActiveNetworkInfo();
        }
        Log.w("NetworkStateManager/getActiveNetworkInfo cm=null");
        return null;
    }

    public boolean A02() {
        ConnectivityManager A0H = this.A01.A0H();
        if (A0H != null) {
            try {
                NetworkInfo activeNetworkInfo = A0H.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
                return true;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof DeadObjectException) {
                    this.A00.A0A("networkstatemanager/deadOS", false, (String) null);
                    return false;
                }
                throw e;
            }
        }
        return false;
    }

    public boolean A03() {
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager A0H = this.A01.A0H();
            if (A0H == null) {
                Log.w("NetworkStateManager/isDataSaverOn cm=null");
            } else if (A0H.isActiveNetworkMetered()) {
                A0H.getRestrictBackgroundStatus();
                if (A0H.getRestrictBackgroundStatus() == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public C54392oe(C55682qk r1, C620633i r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
