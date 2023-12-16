package com.whatsapp.messaging;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass4SG;
import X.AnonymousClass5V0;
import X.AnonymousClass69T;
import X.C107975cD;
import X.C18260x0;
import X.C1891190b;
import X.C19340zH;
import X.C55602qc;
import X.C620633i;
import X.C64333Db;
import X.C86604Kt;
import X.C89704el;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class CaptivePortalActivity extends C89704el {
    public C620633i A00;
    public C55602qc A01;
    public boolean A02;

    public void onCreate(Bundle bundle) {
        WifiInfo connectionInfo;
        int length;
        requestWindowFeature(1);
        super.onCreate(bundle);
        WifiManager A0I = this.A00.A0I();
        if (A0I == null) {
            Log.w("captiveportalactivity/create wm=null");
            connectionInfo = null;
        } else {
            connectionInfo = A0I.getConnectionInfo();
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0i(false);
        A002.A0U(R.string.f11nameremoved);
        A002.A0X(new C1891190b(this, 43), R.string.f11nameremoved);
        A002.A0W(new AnonymousClass69T(this, 15, A0I), R.string.f11nameremoved);
        if (connectionInfo != null) {
            int networkId = connectionInfo.getNetworkId();
            String ssid = connectionInfo.getSSID();
            if (ssid != null && (length = ssid.length()) >= 2 && ((ssid.startsWith("\"") || ssid.startsWith("'")) && (ssid.endsWith("\"") || ssid.endsWith("'")))) {
                ssid = ssid.substring(1, length - 1);
            }
            C18260x0.A0s("wifi network name is ", ssid, AnonymousClass001.A0o());
            A002.A0Q(AnonymousClass0x2.A0X(this, ssid, 1, R.string.f11nameremoved));
            A002.A0I(new C107975cD(A0I, this, ssid, networkId), AnonymousClass0x2.A0X(this, ssid, 1, R.string.f11nameremoved));
        } else {
            A002.A0A(R.string.f11nameremoved);
        }
        Log.i("captive portal dialog created");
        A002.A0S();
    }

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            this.A04 = C64333Db.A8y(A2Y);
            this.A00 = C64333Db.A2o(A2Y);
            this.A01 = (C55602qc) A2Y.ANB.get();
        }
    }

    public CaptivePortalActivity(int i) {
        this.A02 = false;
        C86604Kt.A1K(this, 63);
    }

    public void onPause() {
        super.onPause();
        this.A01.A01.removeMessages(1);
        this.A01.A02();
    }

    public void onResume() {
        super.onResume();
        this.A01.A01.sendEmptyMessageDelayed(1, 3000);
    }

    public CaptivePortalActivity() {
        this(0);
    }
}
