package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.4LZ  reason: invalid class name */
public class AnonymousClass4LZ extends BroadcastReceiver implements AnonymousClass66U, BluetoothProfile.ServiceListener {
    public int A00 = -1;
    public BluetoothHeadset A01;
    public AudioDeviceCallback A02;
    public WeakReference A03;
    public final Context A04;
    public final C620633i A05;
    public final Set A06 = Collections.newSetFromMap(AnonymousClass0x9.A1D());

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        C116085pi r3;
        List<BluetoothDevice> connectedDevices;
        if (i == 1) {
            BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
            this.A01 = bluetoothHeadset;
            WeakReference weakReference = this.A03;
            if (weakReference != null) {
                r3 = (C116085pi) weakReference.get();
                if (r3 != null && !r3.A02) {
                    if (bluetoothHeadset != null) {
                        AudioManager A0G = this.A05.A0G();
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("BluetoothHeadsetMonitor/onServiceConnected ");
                        A0o.append(this.A01);
                        A0o.append(", devices: ");
                        if (C107385bE.A09()) {
                            connectedDevices = A01(A0G);
                        } else {
                            connectedDevices = this.A01.getConnectedDevices();
                        }
                        A0o.append(connectedDevices);
                        C18260x0.A1R(A0o, ", ", r3);
                        r3.A06(Voip.getCallInfo());
                        return;
                    }
                    return;
                }
            } else {
                r3 = null;
            }
            C18260x0.A1S(AnonymousClass001.A0o(), "BluetoothHeadsetMonitor/onServiceConnected VoipInterface already Destroyed ", r3);
        }
    }

    public void onServiceDisconnected(int i) {
        C116085pi r2;
        if (i == 1) {
            WeakReference weakReference = this.A03;
            if (weakReference != null) {
                r2 = (C116085pi) weakReference.get();
            } else {
                r2 = null;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("BluetoothHeadsetMonitor/onServiceDisconnected ");
            A0o.append(this.A01);
            C18260x0.A1R(A0o, ", ", r2);
            this.A01 = null;
            if (r2 == null || r2.A02) {
                C18260x0.A1S(AnonymousClass001.A0o(), "BluetoothHeadsetMonitor/onServiceDisconnected VoipInterface already Destroyed ", r2);
            } else {
                r2.A0B(Voip.getCallInfo(), false);
            }
        }
    }

    public static String A00(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i == 1) {
            return "CONNECTING";
        }
        if (i == 2) {
            return "CONNECTED";
        }
        if (i != 3) {
            return "UNKNOWN BLUETOOTH CONNECTION STATE";
        }
        return "DISCONNECTING";
    }

    public final void A02() {
        this.A02 = new AnonymousClass6DI(this);
    }

    public final void A03(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            for (C183148pZ BNj : this.A06) {
                BNj.BNj(i);
            }
        }
    }

    public void A04(C183148pZ r5) {
        Set set = this.A06;
        if (set.isEmpty()) {
            if (C107385bE.A09()) {
                AudioManager A0G = this.A05.A0G();
                if (A0G != null) {
                    A02();
                    AudioDeviceCallback audioDeviceCallback = this.A02;
                    C626936e.A06(audioDeviceCallback);
                    A0G.registerAudioDeviceCallback(audioDeviceCallback, (Handler) null);
                }
            } else {
                C154317cy.A01(this, this.A04, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"), true);
            }
        }
        set.add(r5);
    }

    public void A05(C183148pZ r3) {
        Set set = this.A06;
        if (set.remove(r3) && set.isEmpty()) {
            if (C107385bE.A09()) {
                AudioManager A0G = this.A05.A0G();
                if (A0G != null) {
                    AudioDeviceCallback audioDeviceCallback = this.A02;
                    C626936e.A06(audioDeviceCallback);
                    A0G.unregisterAudioDeviceCallback(audioDeviceCallback);
                    return;
                }
                return;
            }
            this.A04.unregisterReceiver(this);
        }
    }

    public String BDW() {
        return "BluetoothHeadsetMonitor";
    }

    public /* synthetic */ void BMe() {
    }

    public AnonymousClass4LZ(Context context, C620633i r3) {
        this.A04 = context;
        this.A05 = r3;
    }

    public static List A01(AudioManager audioManager) {
        List<AudioDeviceInfo> A002 = C154427d9.A00(audioManager);
        ArrayList A0s = AnonymousClass001.A0s();
        for (AudioDeviceInfo address : A002) {
            A0s.add(address.getAddress());
        }
        return A0s;
    }

    public void BMd() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                defaultAdapter.getProfileProxy(this.A04, this, 1);
            } catch (Exception e) {
                Log.e((Throwable) e);
            }
        } else {
            Log.e("BluetoothHeadsetMonitor/init failed to get bluetoothAdapter");
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("BluetoothHeadsetMonitor/bluetoothConnectionReceiver [");
            A0o.append(A00(intExtra2));
            A0o.append(" -> ");
            A0o.append(A00(intExtra));
            C18260x0.A1L(A0o, "]");
            if (intExtra != intExtra2) {
                A03(intExtra);
            }
        }
    }
}
