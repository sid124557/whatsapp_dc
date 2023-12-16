package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.5ZK  reason: invalid class name */
public class AnonymousClass5ZK {
    public int A00;
    public Ringtone A01;
    public Uri A02;
    public AnonymousClass54X A03;
    public C72173dI A04;
    public long[] A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final AnonymousClass7DI A09 = new AnonymousClass7DI(this);
    public final C107285b3 A0A;
    public final C620633i A0B;
    public final C56612sH A0C;
    public final AnonymousClass1VX A0D;
    public final AnonymousClass1R1 A0E;
    public final C187958y5 A0F;
    public final AnonymousClass4FS A0G;

    public void A03() {
        this.A02 = null;
        AnonymousClass54X r1 = this.A03;
        if (r1 != null) {
            r1.A0D(true);
            this.A03 = null;
        }
        if (this.A01 != null) {
            Log.i("voip/ringtone/stop");
            Ringtone ringtone = this.A01;
            if (this.A0D.A0X(6570)) {
                C72173dI A012 = A01();
                A012.A02();
                A012.execute(C117695sL.A00(ringtone, 28));
            } else {
                ringtone.stop();
            }
            this.A01 = null;
        }
        A05();
    }

    public boolean A08(CallInfo callInfo) {
        int i;
        int i2;
        if (!(callInfo == null && (callInfo = Voip.getCallInfo()) == null)) {
            C107285b3 r2 = this.A0A;
            if (r2.A2o.A0N(5170) <= 1 || (i2 = this.A07) <= 0 ? ((i = this.A07) <= 0 || callInfo.participants.size() > i) && this.A06 > 0 && callInfo.groupJid != null && callInfo.isJoinableGroupCall : callInfo.groupJid != null && callInfo.participants.size() > i2) {
                if (!r2.A07(callInfo.callId).A06) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void A00(AudioAttributes audioAttributes, VibrationEffect vibrationEffect, Vibrator vibrator) {
        if (vibrator != null) {
            vibrator.vibrate(vibrationEffect, audioAttributes);
        }
        Log.i("voip/vibrate/start complete");
    }

    public final C72173dI A01() {
        C72173dI r2 = this.A04;
        if (r2 != null) {
            return r2;
        }
        C72173dI r22 = new C72173dI(this.A0G, true);
        this.A04 = r22;
        return r22;
    }

    public void A02() {
        if (this.A02 == null) {
            return;
        }
        if (this.A01 != null) {
            try {
                A04();
            } catch (NullPointerException e) {
                if (Build.VERSION.SDK_INT != 22 || !"oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
                    throw e;
                }
                Log.e("voip/loadAndPlayRingtone error while playing existing ringtone", e);
            }
        } else if (this.A03 == null) {
            AnonymousClass54X r4 = new AnonymousClass54X(this.A08, this.A09);
            this.A03 = r4;
            this.A0G.BkL(r4, this.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r0.getRingerMode() != 2) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r8 = this;
            android.media.Ringtone r0 = r8.A01
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "voip/ringtone/play"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1VX r1 = r8.A0D
            r0 = 6570(0x19aa, float:9.207E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0073
            X.3dI r1 = r8.A01()
            r0 = 29
            X.5sL r0 = X.C117695sL.A00(r8, r0)
            r1.execute(r0)
        L_0x0020:
            int r0 = r8.A00
            r5 = 1
            int r0 = r0 + 1
            r8.A00 = r0
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 == 0) goto L_0x0072
            X.5b3 r1 = r8.A0A
            java.lang.String r0 = r6.callId
            X.2TG r7 = r1.A07(r0)
            long r1 = r7.A01
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            long r1 = r7.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.A01 = r0
        L_0x0049:
            boolean r0 = r6.isGroupCall
            if (r0 == 0) goto L_0x0072
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0072
            com.whatsapp.jid.UserJid r4 = r6.getPeerJid()
            boolean r3 = r8.A08(r6)
            X.33i r0 = r8.A0B
            android.media.AudioManager r0 = r0.A0G()
            if (r0 == 0) goto L_0x006b
            int r2 = r0.getRingerMode()
            r0 = 2
            r1 = 1
            if (r2 == r0) goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            long[] r0 = r8.A05
            if (r0 == 0) goto L_0x0081
            if (r1 != 0) goto L_0x0081
        L_0x0072:
            return
        L_0x0073:
            android.media.Ringtone r0 = r8.A01
            boolean r0 = r0.isPlaying()
            if (r0 != 0) goto L_0x0072
            android.media.Ringtone r0 = r8.A01
            r0.play()
            goto L_0x0020
        L_0x0081:
            r8.A05()
            X.C626936e.A06(r4)
            long[] r0 = r8.A09(r4, r3, r1)
            if (r3 != 0) goto L_0x0093
            if (r1 != 0) goto L_0x0093
        L_0x008f:
            r8.A06(r4, r0, r5)
            return
        L_0x0093:
            r5 = 0
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZK.A04():void");
    }

    public final void A05() {
        if (this.A05 != null) {
            Log.i("voip/vibrate/stop");
            Vibrator A0K = this.A0B.A0K();
            C626936e.A06(A0K);
            if (this.A0D.A0X(6570)) {
                A01().execute(C117695sL.A00(A0K, 27));
            } else {
                A0K.cancel();
            }
            this.A05 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        com.whatsapp.util.Log.e("voip/ringtone/vibrate/UNKNOWN");
        X.C626936e.A0D(false, X.AnonymousClass000.A0V("unknown vibrate preference ", r4, X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        if (r4.equals("2") == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        r0 = new long[]{0, 750, 1500};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        switch(r3) {
            case 0: goto L_0x00df;
            case 1: goto L_0x00d7;
            default: goto L_0x00cb;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        r0 = {0, 750, 250} // fill-array;
        r5.A05 = r0;
        r0 = "voip/ringtone/vibrate/LONG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r0 = {0, 300, 200} // fill-array;
        r5.A05 = r0;
        r0 = "voip/ringtone/vibrate/SHORT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        r0 = {0, 750, 1500} // fill-array;
        r5.A05 = r0;
        r0 = "voip/ringtone/vibrate/DEFAULT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r5.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C95814uZ r6, long[] r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "voip/vibrate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r6 != 0) goto L_0x000d
            java.lang.String r0 = "voip/vibrate/error/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000c:
            return
        L_0x000d:
            long[] r0 = r5.A05
            if (r0 != 0) goto L_0x000c
            boolean r0 = r5.A07()
            if (r0 != 0) goto L_0x000c
            X.33i r1 = r5.A0B
            android.media.AudioManager r4 = r1.A0G()
            if (r4 == 0) goto L_0x000c
            int r2 = r4.getRingerMode()
            r3 = 1
            r0 = 2
            if (r2 == r0) goto L_0x002d
            int r0 = r4.getRingerMode()
            if (r0 != r3) goto L_0x000c
        L_0x002d:
            X.1R1 r0 = r5.A0E
            X.2sa r0 = X.AnonymousClass1R1.A00(r6, r0)
            java.lang.String r4 = r0.A04()
            if (r4 == 0) goto L_0x000c
            java.lang.String r0 = "0"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x000c
            r2 = 0
            if (r7 == 0) goto L_0x008f
            r5.A05 = r7
        L_0x0046:
            long[] r0 = r5.A05
            if (r0 == 0) goto L_0x000c
            android.os.Vibrator r3 = r1.A0K()
            X.C626936e.A06(r3)
            java.lang.String r0 = "voip/vibrate/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00eb
            android.media.AudioAttributes$Builder r1 = new android.media.AudioAttributes$Builder
            r1.<init>()
            r0 = 4
            android.media.AudioAttributes$Builder r1 = r1.setContentType(r0)
            r0 = 6
            android.media.AudioAttributes$Builder r0 = r1.setUsage(r0)
            android.media.AudioAttributes r4 = r0.build()
            long[] r0 = r5.A05
            if (r8 != 0) goto L_0x0074
            r2 = -1
        L_0x0074:
            android.os.VibrationEffect r2 = android.os.VibrationEffect.createWaveform(r0, r2)
            X.1VX r1 = r5.A0D
            r0 = 6570(0x19aa, float:9.207E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00e7
            X.3dI r1 = r5.A01()
            X.8MG r0 = new X.8MG
            r0.<init>(r4, r2, r3)
            r1.execute(r0)
            return
        L_0x008f:
            int r0 = r4.hashCode()
            switch(r0) {
                case 49: goto L_0x00bc;
                case 50: goto L_0x00b3;
                case 51: goto L_0x00a9;
                default: goto L_0x0096;
            }
        L_0x0096:
            java.lang.String r0 = "voip/ringtone/vibrate/UNKNOWN"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unknown vibrate preference "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r3)
            X.C626936e.A0D(r2, r0)
            goto L_0x0046
        L_0x00a9:
            java.lang.String r0 = "3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0096
            r3 = 2
            goto L_0x00c5
        L_0x00b3:
            java.lang.String r0 = "2"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00c5
            goto L_0x0096
        L_0x00bc:
            java.lang.String r0 = "1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0096
            r3 = 0
        L_0x00c5:
            r0 = 3
            long[] r0 = new long[r0]
            switch(r3) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00d7;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            r0 = {0, 750, 250} // fill-array
            r5.A05 = r0
            java.lang.String r0 = "voip/ringtone/vibrate/LONG"
        L_0x00d2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0046
        L_0x00d7:
            r0 = {0, 300, 200} // fill-array
            r5.A05 = r0
            java.lang.String r0 = "voip/ringtone/vibrate/SHORT"
            goto L_0x00d2
        L_0x00df:
            r0 = {0, 750, 1500} // fill-array
            r5.A05 = r0
            java.lang.String r0 = "voip/ringtone/vibrate/DEFAULT"
            goto L_0x00d2
        L_0x00e7:
            r3.vibrate(r2, r4)
            return
        L_0x00eb:
            X.1VX r1 = r5.A0D
            r0 = 6570(0x19aa, float:9.207E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0104
            X.3dI r2 = r5.A01()
            r1 = 11
            X.5sI r0 = new X.5sI
            r0.<init>(r5, r3, r1, r8)
            r2.execute(r0)
            return
        L_0x0104:
            long[] r0 = r5.A05
            if (r8 != 0) goto L_0x0109
            r2 = -1
        L_0x0109:
            r3.vibrate(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZK.A06(X.4uZ, long[], boolean):void");
    }

    public final boolean A07() {
        C52242lA r0 = this.A0A.A0R;
        boolean z = r0.A00;
        boolean z2 = r0.A01;
        boolean z3 = r0.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService/isCallSilenced By Call Notification Settings: ");
        A0o.append(z);
        A0o.append("; By WA App Notification Settings : ");
        A0o.append(z3);
        C18260x0.A1E("; By DND Mode: ", A0o, z2);
        if (z || z3 || z2) {
            return true;
        }
        return false;
    }

    public long[] A09(C95814uZ r8, boolean z, boolean z2) {
        int i;
        if ("0".equals(AnonymousClass1R1.A00(r8, this.A0E).A04())) {
            return new long[]{0, 0, 0};
        }
        if (!z) {
            return new long[]{0, 50, 50, 70, 30, 70, 30, 50, 50, 70, 30, 70, 30, 50, 50, 70, 30, 70, 4000};
        }
        long[] jArr = {0, 150, 83, 50, 67, 20, 97, 20, 96, 50, 67, 35, 195, 50, 78, 300, 4000};
        if (z2 || (i = this.A06) <= 1) {
            return jArr;
        }
        long[] jArr2 = new long[((i * 16) + 1)];
        int i2 = 0;
        do {
            System.arraycopy(jArr, 1, jArr2, (i2 * 16) + 1, 16);
            i2++;
        } while (i2 < i);
        return jArr2;
    }

    public AnonymousClass5ZK(Context context, C107285b3 r3, C620633i r4, C56612sH r5, AnonymousClass1VX r6, AnonymousClass1R1 r7, C187958y5 r8, AnonymousClass4FS r9) {
        this.A0C = r5;
        this.A0D = r6;
        this.A08 = context;
        this.A0G = r9;
        this.A0A = r3;
        this.A0F = r8;
        this.A0B = r4;
        this.A0E = r7;
        this.A07 = r6.A0N(4710);
        this.A06 = r6.A0N(870);
    }
}
