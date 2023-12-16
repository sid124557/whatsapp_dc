package com.whatsapp.calling.telecom;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.C111665iU;
import X.C18260x0;
import X.C64323Da;
import android.content.Intent;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import com.whatsapp.util.Log;

public class SelfManagedConnectionService extends ConnectionService implements AnonymousClass4GJ {
    public C111665iU A00;
    public boolean A01;
    public final Object A02;
    public volatile AnonymousClass3YV A03;

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            ((C64323Da) generatedComponent()).A0d(this);
        }
        super.onCreate();
        Log.i("voip/SelfManagedConnectionService/onCreate");
    }

    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i("voip/SelfManagedConnectionService/onCreateIncomingConnection ");
        Connection A022 = this.A00.A02(connectionRequest, false);
        if (A022 == null) {
            return Connection.createFailedConnection(new DisconnectCause(1));
        }
        return A022;
    }

    public void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i("voip/SelfManagedConnectionService/onCreateIncomingConnectionFailed");
        this.A00.A06(connectionRequest);
    }

    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i("voip/SelfManagedConnectionService/onCreateOutgoingConnection");
        Connection A022 = this.A00.A02(connectionRequest, true);
        if (A022 == null) {
            return Connection.createFailedConnection(new DisconnectCause(1));
        }
        A022.setDialing();
        return A022;
    }

    public void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i("voip/SelfManagedConnectionService/onCreateOutgoingConnectionFailed");
        this.A00.A07(connectionRequest);
    }

    public SelfManagedConnectionService(int i) {
        this.A02 = AnonymousClass002.A0D();
        this.A01 = false;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("voip/SelfManagedConnectionService/onDestroy");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/SelfManagedConnectionService/onStartCommand ", intent);
        return super.onStartCommand(intent, i, i2);
    }

    public boolean onUnbind(Intent intent) {
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/SelfManagedConnectionService/onUnbind ", intent);
        return super.onUnbind(intent);
    }

    public SelfManagedConnectionService() {
        this(0);
    }
}
