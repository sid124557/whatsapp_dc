package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.telecom.CallAudioState;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.5pi  reason: invalid class name and case insensitive filesystem */
public class C116085pi implements C183148pZ {
    public static final Object A0K = new AnonymousClass91A(0);
    public static final boolean A0L = C18280x3.A1U(Build.VERSION.SDK_INT, 28);
    public int A00;
    public int A01;
    public boolean A02 = false;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final C69263Wi A09;
    public final AnonymousClass5TY A0A;
    public final AnonymousClass4LV A0B;
    public final C107285b3 A0C;
    public final C153457bL A0D;
    public final C111665iU A0E;
    public final C620633i A0F;
    public final AnonymousClass1VX A0G;
    public final AnonymousClass4LZ A0H;
    public final C72173dI A0I;
    public final C187958y5 A0J;

    public void A07(CallInfo callInfo) {
        A00(new C70183a5(this, 3, callInfo), this);
    }

    public void A0C(CallInfo callInfo, boolean z) {
        C117665sI r1 = new C117665sI(this, callInfo, 7, z);
        if (A0E()) {
            this.A0I.execute(r1);
        } else {
            r1.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r2 < 3) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r0 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r7.isAudioChat() != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0F(com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r6 = this;
            r5 = 0
            com.whatsapp.jid.GroupJid r0 = r7.groupJid
            if (r0 != 0) goto L_0x000c
            boolean r0 = r7.isAudioChat()
            r4 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r4 = 1
        L_0x000d:
            boolean r0 = r7.videoEnabled
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = r7.callLinkToken
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 != 0) goto L_0x0047
            android.content.Context r0 = r6.A08
            X.7Ym r1 = X.AnonymousClass5YQ.A02(r0)
            if (r1 == 0) goto L_0x0049
            android.content.Context r0 = X.AnonymousClass74U.A00(r0)
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r0 = r3.getConfiguration()
            int r0 = r0.screenLayout
            r2 = r0 & 15
            int r1 = r1.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r1 <= r0) goto L_0x003b
            r0 = 3
            r1 = 1
            if (r2 >= r0) goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            r0 = 2131034122(0x7f05000a, float:1.7678753E38)
            boolean r0 = r3.getBoolean(r0)
            if (r1 != 0) goto L_0x0047
            if (r0 == 0) goto L_0x0049
        L_0x0047:
            r5 = 1
        L_0x0048:
            return r5
        L_0x0049:
            if (r4 == 0) goto L_0x0048
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116085pi.A0F(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    public static void A01(C116085pi r2, int i) {
        C117125rQ r1 = new C117125rQ(r2, i);
        if (r2.A0E()) {
            r2.A0I.execute(r1);
        } else {
            r1.run();
        }
    }

    public static /* synthetic */ void A03(C116085pi r3, CallInfo callInfo, boolean z) {
        String str;
        String str2;
        C107285b3 r1 = r3.A0C;
        if (callInfo == null) {
            str = null;
        } else {
            str = callInfo.callId;
        }
        C86914Mi A082 = r1.A08(str);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/audio_route/changeSpeakerphoneState ");
        if (z) {
            str2 = "On";
        } else {
            str2 = "Off";
        }
        A0o.append(str2);
        A0o.append(" using telecom: ");
        C18260x0.A1V(A0o, AnonymousClass000.A1W(A082));
        if (!A0L || A082 == null) {
            AudioManager A0G2 = r3.A0F.A0G();
            if (A0G2 != null) {
                A0G2.setSpeakerphoneOn(z);
                r3.A09(callInfo, (Boolean) null);
                return;
            }
            return;
        }
        int i = 5;
        if (z) {
            i = 8;
        }
        A082.setAudioRoute(i);
    }

    public void A06(CallInfo callInfo) {
        if (callInfo != null && callInfo.callState != CallState.NONE) {
            A00(new C70183a5(this, 0, callInfo), this);
        }
    }

    public void A0A(CallInfo callInfo, Boolean bool) {
        AudioManager A0G2;
        CallAudioState callAudioState;
        if (bool != null) {
            this.A03 = bool.booleanValue();
        }
        if (callInfo != null && callInfo.callState != CallState.NONE && (A0G2 = this.A0F.A0G()) != null) {
            int i = this.A00;
            C107285b3 r1 = this.A0C;
            C86914Mi A082 = r1.A08(callInfo.callId);
            boolean z = true;
            if (this.A03 || !A0L || A082 == null || A082.getCallAudioState() == null) {
                if (A0G2.isBluetoothScoOn()) {
                    this.A00 = 3;
                } else if (A0G2.isSpeakerphoneOn() && !this.A04) {
                    this.A00 = 1;
                    if (i != 1) {
                        this.A07 = false;
                    }
                } else if (this.A0A.A03()) {
                    this.A00 = 4;
                } else {
                    this.A00 = 2;
                }
                callAudioState = null;
                z = false;
            } else {
                callAudioState = A082.getCallAudioState();
                int route = callAudioState.getRoute();
                if (route == 1) {
                    this.A00 = 2;
                } else if (route == 2) {
                    this.A00 = 3;
                } else if (route == 4) {
                    this.A00 = 4;
                } else if (route == 8) {
                    this.A00 = 1;
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/audio_route/updateAudioRoute: [");
            A0o.append(Voip.A05(i));
            A0o.append(" -> ");
            A0o.append(Voip.A05(this.A00));
            A0o.append("], using telecom: ");
            A0o.append(z);
            A0o.append(", ");
            StringBuilder A0o2 = AnonymousClass001.A0o();
            if (callAudioState != null) {
                A0o2.append("CallAudioState: ");
                A0o2.append(callAudioState);
            } else {
                A0o2.append("Bluetooth: [ScoAudioState: ");
                A0o2.append(AnonymousClass4LV.A00(this.A01));
                A0o2.append(", ScoOn: ");
                A0o2.append(A0G2.isBluetoothScoOn());
                A0o2.append("], Speaker: ");
                A0o2.append(A0G2.isSpeakerphoneOn());
            }
            AnonymousClass000.A1B(A0o2, A0o);
            A0o.append(", fallBackToNonTelecomToSyncAudioRoute: ");
            A0o.append(this.A03);
            C18260x0.A1R(A0o, ", ", this);
            this.A04 = false;
            int i2 = this.A00;
            if (A0E()) {
                this.A09.A0S(new C71733ca((Object) callInfo, (Object) this, i2, 16));
            } else {
                r1.A0c(callInfo, i2);
            }
        }
    }

    public void A0B(CallInfo callInfo, boolean z) {
        String str;
        String str2;
        C107285b3 r1 = this.A0C;
        if (callInfo == null) {
            str = null;
        } else {
            str = callInfo.callId;
        }
        C86914Mi A082 = r1.A08(str);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/audio_route/changeBluetoothState ");
        if (z) {
            str2 = "On";
        } else {
            str2 = "Off";
        }
        A0o.append(str2);
        A0o.append(" using telecom: ");
        C18260x0.A1V(A0o, AnonymousClass000.A1W(A082));
        if (!A0L || A082 == null) {
            AudioManager A0G2 = this.A0F.A0G();
            if (A0G2 != null) {
                if (z) {
                    try {
                        if (A0G2.isBluetoothScoOn()) {
                            Log.i("voip/audio_route/changeBluetoothState startBluetoothSco when isBluetoothScoOn is true");
                        }
                        A0G2.startBluetoothSco();
                        A0G2.setBluetoothScoOn(true);
                    } catch (Exception e) {
                        Log.e((Throwable) e);
                    }
                } else {
                    A0G2.setBluetoothScoOn(false);
                    A0G2.stopBluetoothSco();
                }
                A09(callInfo, (Boolean) null);
                return;
            }
            return;
        }
        int i = 5;
        if (z) {
            i = 2;
        }
        A082.setAudioRoute(i);
    }

    public void A0D(boolean z) {
        AudioManager A0G2 = this.A0F.A0G();
        if (A0G2 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/audio_route/muteOsMicrophone call from: ");
            A0o.append(A04());
            A0o.append(", mute: ");
            A0o.append(z);
            A0o.append(", isMicrophoneMute was ");
            C18260x0.A1V(A0o, A0G2.isMicrophoneMute());
            A0G2.setMicrophoneMute(z);
        }
    }

    public final boolean A0E() {
        return AnonymousClass001.A1W(this.A0G.A0N(6634));
    }

    public boolean A0G(String str) {
        C86914Mi A082 = this.A0C.A08(str);
        if (!A0L || A082 == null || A082.getCallAudioState() == null) {
            AudioManager A0G2 = this.A0F.A0G();
            BluetoothHeadset bluetoothHeadset = this.A0H.A01;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return false;
            }
            try {
                if (!defaultAdapter.isEnabled() || A0G2 == null) {
                    return false;
                }
                if (C107385bE.A09()) {
                    if (!C154427d9.A00(A0G2).isEmpty()) {
                        return true;
                    }
                    return false;
                } else if (bluetoothHeadset == null || bluetoothHeadset.getConnectedDevices().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            } catch (Exception e) {
                Log.e((Throwable) e);
                return false;
            }
        } else {
            C626936e.A06(A082);
            return C18310x6.A1X(A082.getCallAudioState().getSupportedBluetoothDevices());
        }
    }

    public C116085pi(Context context, C69263Wi r5, C107285b3 r6, C111665iU r7, C620633i r8, AnonymousClass1VX r9, AnonymousClass4LZ r10, C187958y5 r11, AnonymousClass4FS r12) {
        AnonymousClass5TY r0;
        C91404jY r02;
        this.A0C = r6;
        this.A0G = r9;
        this.A09 = r5;
        this.A08 = context;
        this.A0J = r11;
        this.A0F = r8;
        this.A0H = r10;
        this.A0E = r7;
        this.A0I = new C72173dI(r12, false);
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/audio_route/create ", this);
        AnonymousClass7D1 r2 = new AnonymousClass7D1(this);
        if (Build.VERSION.SDK_INT >= 23) {
            r0 = new C132726fr(r8);
        } else {
            r0 = new C132736fs(context, r8);
        }
        r0.A00 = r2;
        this.A0A = r0;
        this.A0B = new AnonymousClass4LV(this);
        if (!A0L) {
            r02 = null;
        } else {
            r02 = new C91404jY(this, r11);
        }
        this.A0D = r02;
    }

    public static void A00(C70183a5 r1, C116085pi r2) {
        if (r2.A0E()) {
            r2.A0I.execute(r1);
        } else {
            r1.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r4.getCallAudioState() == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r4.getCallAudioState().getRoute() == 4) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r5.A0A.A03() != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r5.A0F(r6) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        r5.A0C(r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        r5.A0C(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A02(X.C116085pi r5, com.whatsapp.voipcalling.CallInfo r6) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/audio_route/autoChooseAudioRoute from: "
            r1.append(r0)
            java.lang.String r0 = r5.A04()
            r1.append(r0)
            java.lang.String r0 = ", call state: "
            r1.append(r0)
            com.whatsapp.voipcalling.CallState r0 = r6.callState
            X.C18260x0.A0o(r0, r1)
            X.5b3 r1 = r5.A0C
            java.lang.String r0 = r6.callId
            X.4Mi r4 = r1.A08(r0)
            java.lang.String r0 = r6.callId
            boolean r0 = r5.A0G(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0049
            r5.A07(r6)
            boolean r0 = A0L
            if (r0 == 0) goto L_0x0045
            if (r4 == 0) goto L_0x0045
            android.telecom.CallAudioState r0 = r4.getCallAudioState()
            if (r0 == 0) goto L_0x0045
            X.1VX r1 = r5.A0G
            r0 = 3825(0xef1, float:5.36E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            r5.A0B(r6, r3)
            return
        L_0x0049:
            boolean r0 = A0L
            if (r0 == 0) goto L_0x0056
            if (r4 == 0) goto L_0x0056
            android.telecom.CallAudioState r1 = r4.getCallAudioState()
            r0 = 1
            if (r1 != 0) goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            r2 = 0
            if (r0 == 0) goto L_0x006d
            X.C626936e.A06(r4)
            android.telecom.CallAudioState r0 = r4.getCallAudioState()
            int r1 = r0.getRoute()
            r0 = 4
            if (r1 != r0) goto L_0x0076
        L_0x0068:
            r0 = 0
            r5.A09(r6, r0)
            return
        L_0x006d:
            X.5TY r0 = r5.A0A
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0076
            goto L_0x0068
        L_0x0076:
            boolean r0 = r5.A0F(r6)
            if (r0 == 0) goto L_0x0080
            r5.A0C(r6, r3)
            return
        L_0x0080:
            r5.A0C(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116085pi.A02(X.5pi, com.whatsapp.voipcalling.CallInfo):void");
    }

    public final String A04() {
        boolean z = false;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(AnonymousClass000.A0O(this))) {
                z = true;
            } else if (z) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(stackTraceElement.getClassName());
                A0o.append("/");
                return AnonymousClass000.A0X(stackTraceElement.getMethodName(), A0o);
            }
        }
        return null;
    }

    public void A05() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/audio_route/resetAudioManager ");
        A0o.append(this);
        A0o.append(", telecom: ");
        C18260x0.A1V(A0o, this.A05);
        if (!this.A05) {
            AudioManager A0G2 = this.A0F.A0G();
            if (A0G2 != null) {
                A0G2.setSpeakerphoneOn(false);
            }
            A0B((CallInfo) null, false);
        }
        this.A00 = 2;
        AudioManager A0G3 = this.A0F.A0G();
        if (!this.A05 && A0G3 != null) {
            this.A0I.execute(new C70183a5(this, 2, A0G3));
        }
    }

    public void A08(CallInfo callInfo, Boolean bool) {
        A09(callInfo, bool);
        A00(new C70183a5(this, 1, callInfo), this);
    }

    public void A09(CallInfo callInfo, Boolean bool) {
        if (A0E()) {
            C86654Ky.A1O(this.A0I, this, callInfo, bool, 13);
        } else {
            A0A(callInfo, bool);
        }
    }

    public void BNj(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/audio_route/onBluetoothHeadsetConnectionStateChanged state: ");
        C18260x0.A1L(A0o, AnonymousClass4LZ.A00(i));
        if (i != 0) {
            if (i == 2) {
                A06(Voip.getCallInfo());
                return;
            } else if (i != 3) {
                return;
            }
        }
        A0B(Voip.getCallInfo(), false);
    }
}
