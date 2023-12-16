package X;

import android.os.Bundle;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.4Mi  reason: invalid class name and case insensitive filesystem */
public class C86914Mi extends Connection {
    public C97164xj A00;
    public C187958y5 A01;
    public String A02;

    public String A00() {
        return this.A02;
    }

    public void A01(int i) {
        if (this.A00 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/SelfManagedConnection/setDisconnected ");
            A0o.append(this.A02);
            C18260x0.A0y(", cause: ", A0o, i);
            setDisconnected(new DisconnectCause(i));
            destroy();
            this.A00.A0H(this);
            this.A00 = null;
        }
    }

    public void onAbort() {
        Log.i("voip/SelfManagedConnection/onAbort");
        super.onAbort();
    }

    public void onAnswer(int i) {
        Log.i("voip/SelfManagedConnection/onAnswer");
        C97164xj r2 = this.A00;
        if (r2 != null) {
            r2.A0J(this.A02, 2);
        }
        setActive();
    }

    public void onDisconnect() {
        Log.i("voip/SelfManagedConnection/onDisconnect");
        C97164xj r2 = this.A00;
        if (r2 != null) {
            r2.A0J(this.A02, 4);
        }
        A01(2);
    }

    public void onShowIncomingCallUi() {
        Log.i("voip/SelfManagedConnection/onShowIncomingCallUi");
        C97164xj r0 = this.A00;
        if (r0 != null) {
            String str = this.A02;
            C626936e.A01();
            Iterator A03 = C61102zi.A03(r0);
            while (A03.hasNext()) {
                ((C153457bL) A03.next()).A04(str);
            }
        }
    }

    public C86914Mi(C97164xj r1, C187958y5 r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public void A02(String str) {
        this.A02 = str;
    }

    public void onCallAudioStateChanged(CallAudioState callAudioState) {
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/SelfManagedConnection/onCallAudioStateChanged ", callAudioState);
        super.onCallAudioStateChanged(callAudioState);
        C97164xj r1 = this.A00;
        if (r1 != null) {
            r1.A0D(callAudioState, this.A02);
        }
    }

    public void onExtrasChanged(Bundle bundle) {
        super.onExtrasChanged(bundle);
    }

    public void onHold() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/SelfManagedConnection/onHold, AudioModeIsVoip: ");
        C18260x0.A1V(A0o, getAudioModeIsVoip());
        C97164xj r2 = this.A00;
        if (r2 != null) {
            r2.A0J(this.A02, 0);
        }
        setOnHold();
    }

    public void onReject(String str) {
        C18260x0.A0s("voip/SelfManagedConnection/onReject ", str, AnonymousClass001.A0o());
        onReject();
    }

    public void onStateChanged(int i) {
        C18260x0.A0y("voip/SelfManagedConnection/onStateChanged ", AnonymousClass001.A0o(), i);
        super.onStateChanged(i);
    }

    public void onUnhold() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/SelfManagedConnection/onUnhold, AudioModeIsVoip: ");
        C18260x0.A1V(A0o, getAudioModeIsVoip());
        C97164xj r2 = this.A00;
        if (r2 != null) {
            r2.A0J(this.A02, 1);
        }
        setAudioModeIsVoip(true);
        setActive();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SelfManagedConnection: ");
        return AnonymousClass000.A0X(this.A02, A0o);
    }

    public void onAnswer() {
        onAnswer(0);
    }

    public void onReject() {
        Log.i("voip/SelfManagedConnection/onReject");
        C97164xj r2 = this.A00;
        if (r2 != null) {
            r2.A0J(this.A02, 3);
        }
        A01(6);
    }
}
