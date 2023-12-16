package X;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.4LV  reason: invalid class name */
public class AnonymousClass4LV extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;
    public final /* synthetic */ C116085pi A02;

    public static final String A00(int i) {
        if (i == -1) {
            return "ERROR";
        }
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i == 1) {
            return "CONNECTED";
        }
        if (i != 2) {
            return "UNKNOWN BLUETOOTH SCO STATE";
        }
        return "CONNECTING";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LV(C116085pi r1) {
        this();
        this.A02 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass2A1.A01(context);
                    this.A01 = true;
                }
            }
        }
        C626936e.A01();
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
            C116085pi r4 = this.A02;
            int i = r4.A01;
            int A07 = C86664Kz.A07(intent, "android.media.extra.SCO_AUDIO_STATE");
            r4.A01 = A07;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/audio_route/bluetoothScoReceiver/ACTION_SCO_AUDIO_STATE_UPDATED [");
            A0o.append(A00(i));
            A0o.append(" -> ");
            A0o.append(A00(A07));
            C18260x0.A1L(A0o, "]");
            CallInfo callInfo = Voip.getCallInfo();
            int i2 = r4.A01;
            if (i2 == 0) {
                if (i == 2 || i == 1) {
                    r4.A0B(callInfo, false);
                    r4.A08(callInfo, (Boolean) null);
                }
            } else if (i2 == 1) {
                if (C107385bE.A09()) {
                    for (AudioDeviceInfo audioDeviceInfo : C154427d9.A00(r4.A0F.A0G())) {
                        StringBuilder A0l = AnonymousClass000.A0l("voip/audio_route/bluetoothScoReceiver device name: ");
                        A0l.append(audioDeviceInfo.getProductName());
                        A0l.append(", type: ");
                        A0l.append(audioDeviceInfo.getType());
                        A0l.append(", address: ");
                        C18260x0.A1L(A0l, audioDeviceInfo.getAddress());
                    }
                } else {
                    BluetoothHeadset bluetoothHeadset = r4.A0H.A01;
                    if (bluetoothHeadset != null) {
                        for (BluetoothDevice next : bluetoothHeadset.getConnectedDevices()) {
                            if (bluetoothHeadset.isAudioConnected(next)) {
                                BluetoothClass bluetoothClass = next.getBluetoothClass();
                                StringBuilder A0l2 = AnonymousClass000.A0l("voip/audio_route/bluetoothScoReceiver device name: ");
                                A0l2.append(next.getName());
                                A0l2.append(", device class:");
                                A0l2.append(bluetoothClass.getDeviceClass());
                                A0l2.append(", major class: ");
                                A0l2.append(bluetoothClass.getMajorDeviceClass());
                                A0l2.append(", supports AUDIO: ");
                                A0l2.append(bluetoothClass.hasService(2097152));
                                A0l2.append(", supports TELEPHONY: ");
                                A0l2.append(bluetoothClass.hasService(4194304));
                                A0l2.append(", address: ");
                                C18260x0.A1L(A0l2, next.getAddress());
                            }
                        }
                    }
                }
            }
            r4.A09(callInfo, (Boolean) null);
        }
    }

    public AnonymousClass4LV() {
        this.A01 = false;
        this.A00 = AnonymousClass002.A0D();
    }
}
