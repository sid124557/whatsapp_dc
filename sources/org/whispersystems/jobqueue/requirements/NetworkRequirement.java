package org.whispersystems.jobqueue.requirements;

import X.C1228065u;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkRequirement implements Requirement, C1228065u {
    public transient Context A00;

    public boolean BIR() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.A00.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public void Bm4(Context context) {
        this.A00 = context;
    }
}
