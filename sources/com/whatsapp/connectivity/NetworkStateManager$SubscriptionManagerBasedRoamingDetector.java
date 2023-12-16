package com.whatsapp.connectivity;

import X.AnonymousClass001;
import X.C18260x0;
import X.C18290x4;
import X.C620633i;
import android.telephony.SubscriptionManager;
import android.util.Pair;
import com.whatsapp.util.Log;

public class NetworkStateManager$SubscriptionManagerBasedRoamingDetector {
    public static Pair determineNetworkStateUsingSubscriptionManager(C620633i r3, boolean z) {
        Boolean bool;
        int i;
        if (z) {
            Log.d("app/network-type phone is above api 24");
        }
        SubscriptionManager A0M = r3.A0M();
        if (A0M != null) {
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            if (z) {
                C18260x0.A0w("app/network-type default data subscription id is: ", AnonymousClass001.A0o(), defaultDataSubscriptionId);
            }
            if (defaultDataSubscriptionId != -1) {
                boolean isNetworkRoaming = A0M.isNetworkRoaming(defaultDataSubscriptionId);
                if (z) {
                    C18260x0.A1D("app/network-type isRoaming is: ", AnonymousClass001.A0o(), isNetworkRoaming);
                }
                bool = Boolean.TRUE;
                i = 2;
                if (isNetworkRoaming) {
                    i = 3;
                }
                return C18290x4.A0K(bool, i);
            }
        }
        bool = Boolean.FALSE;
        i = 0;
        return C18290x4.A0K(bool, i);
    }
}
