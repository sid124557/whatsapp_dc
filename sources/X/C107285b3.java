package X;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.calling.crypto.DefaultCryptoCallback;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.calling.service.OutgoingSignalingHandler;
import com.whatsapp.calling.service.VoiceFGService;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5b3  reason: invalid class name and case insensitive filesystem */
public class C107285b3 {
    public static String A3R;
    public static final ThreadPoolExecutor A3S = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static final AtomicInteger A3T = new AtomicInteger();
    public double A00 = Double.NaN;
    public double A01 = Double.NaN;
    public int A02;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 30;
    public int A06 = 0;
    public int A07;
    public long A08;
    public long A09;
    public long A0A = -1;
    public long A0B;
    public long A0C;
    public BroadcastReceiver A0D;
    public BroadcastReceiver A0E;
    public SoundPool A0F;
    public Handler A0G;
    public Handler A0H;
    public Handler A0I;
    public Handler A0J;
    public HandlerThread A0K;
    public PowerManager.WakeLock A0L;
    public PowerManager.WakeLock A0M;
    public PhoneStateListener A0N;
    public AnonymousClass4CG A0O;
    public AnonymousClass35O A0P;
    public C97174xk A0Q;
    public C52242lA A0R;
    public AnonymousClass2NF A0S;
    public AnonymousClass2NF A0T;
    public AnonymousClass2NF A0U;
    public AnonymousClass2NF A0V;
    public AnonymousClass2NF A0W;
    public C185888uP A0X;
    public C153457bL A0Y;
    public C182068no A0Z;
    public AnonymousClass7T0 A0a;
    public WamCall A0b;
    public AnonymousClass4BF A0c;
    public C45142Yv A0d;
    public C72173dI A0e;
    public C61262zy A0f;
    public Boolean A0g = null;
    public Integer A0h;
    public Integer A0i;
    public Integer A0j = 1500;
    public Integer A0k;
    public Integer A0l;
    public Integer A0m;
    public Integer A0n;
    public Integer A0o;
    public Long A0p;
    public Long A0q;
    public Long A0r;
    public Long A0s;
    public Long A0t;
    public Long A0u;
    public Object A0v;
    public Object A0w;
    public Object A0x;
    public String A0y = null;
    public String A0z = null;
    public String A10;
    public String A11;
    public Set A12 = AnonymousClass002.A0K();
    public ScheduledThreadPoolExecutor A13;
    public short A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E = false;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P = false;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T = true;
    public boolean A1U;
    public Voip.RecordingInfo[] A1V;
    public final Context A1W;
    public final TelephonyManager A1X;
    public final C116985rC A1Y;
    public final C116985rC A1Z;
    public final C29171iO A1a;
    public final C55682qk A1b;
    public final C64393Dh A1c;
    public final C69263Wi A1d;
    public final C56972sr A1e;
    public final C56492s4 A1f;
    public final C29411im A1g;
    public final C28911hy A1h;
    public final AnonymousClass54I A1i;
    public final AnonymousClass5PA A1j;
    public final AnonymousClass49P A1k;
    public final C106155Xv A1l;
    public final C116085pi A1m;
    public final C149367Me A1n;
    public final AnonymousClass5NO A1o;
    public final AnonymousClass5ZG A1p;
    public final C52212l7 A1q;
    public final C97064xZ A1r;
    public final C1230066r A1s;
    public final AnonymousClass5AL A1t;
    public final AnonymousClass2ZQ A1u;
    public final C46322bR A1v;
    public final C149827Ob A1w;
    public final C56442rz A1x;
    public final AnonymousClass5U0 A1y;
    public final AnonymousClass5TU A1z;
    public final ScreenShareResourceManager A20;
    public final C614830y A21;
    public final C49402gT A22;
    public final AnonymousClass5P3 A23;
    public final AnonymousClass7SF A24;
    public final C54382od A25;
    public final OutgoingSignalingHandler A26;
    public final AnonymousClass5ZK A27;
    public final VoiceServiceEventCallback A28;
    public final C112515jr A29;
    public final C111665iU A2A;
    public final AnonymousClass7TZ A2B;
    public final AnonymousClass5Z0 A2C;
    public final C56222rd A2D;
    public final C47852dw A2E;
    public final C118405tU A2F;
    public final C46622bw A2G;
    public final AnonymousClass364 A2H;
    public final C113745lv A2I;
    public final C45822ad A2J;
    public final AnonymousClass5IP A2K;
    public final AnonymousClass5TW A2L;
    public final C46362bV A2M;
    public final C29441ip A2N;
    public final C64773Ex A2O;
    public final C56642sK A2P;
    public final AnonymousClass5ZU A2Q;
    public final C64213Cp A2R;
    public final C113905mB A2S;
    public final C44382Vv A2T;
    public final C50862it A2U;
    public final C55262q4 A2V;
    public final C620633i A2W;
    public final C56612sH A2X;
    public final C57162tC A2Y;
    public final AnonymousClass33T A2Z;
    public final AnonymousClass5ZR A2a;
    public final AnonymousClass33p A2b;
    public final C620733j A2c;
    public final C621133n A2d;
    public final C48972fm A2e;
    public final AnonymousClass3XF A2f;
    public final C40402Fr A2g;
    public final C56762sW A2h;
    public final C66543Lv A2i;
    public final C56322rn A2j;
    public final C55422qK A2k;
    public final C56662sM A2l;
    public final AnonymousClass318 A2m;
    public final C52412lR A2n;
    public final AnonymousClass1VX A2o;
    public final C64723Er A2p;
    public final C66493Lq A2q;
    public final AnonymousClass33S A2r;
    public final C55892r5 A2s;
    public final C66553Lw A2t;
    public final AnonymousClass3S3 A2u;
    public final C54812pK A2v;
    public final C42642Oy A2w;
    public final C28861ht A2x;
    public final C29281iZ A2y;
    public final AnonymousClass4BJ A2z = new AnonymousClass6BS(this, 0);
    public final C29321id A30;
    public final AnonymousClass1R1 A31;
    public final C56572sD A32;
    public final C50272hu A33;
    public final C187958y5 A34;
    public final AnonymousClass4FS A35;
    public final C97094xc A36;
    public final JNIUtils A37;
    public final VoipCameraManager A38;
    public final C183538qC A39;
    public final C183538qC A3A;
    public final C183538qC A3B;
    public final List A3C = AnonymousClass001.A0s();
    public final Map A3D = AnonymousClass001.A0t();
    public final Map A3E = AnonymousClass001.A0t();
    public final Map A3F = AnonymousClass001.A0t();
    public final Map A3G = AnonymousClass0x9.A1D();
    public final Map A3H = AnonymousClass0x9.A1D();
    public final Map A3I = AnonymousClass001.A0t();
    public final Set A3J = AnonymousClass002.A0K();
    public final Set A3K = Collections.synchronizedSet(AnonymousClass002.A0K());
    public final boolean A3L;
    public volatile int A3M = 0;
    public volatile Integer A3N;
    public volatile String A3O;
    public volatile boolean A3P;
    public volatile boolean A3Q;

    public static void A05(String str) {
        StringBuilder A0l2 = AnonymousClass000.A0l(str);
        A0l2.append("/total threads count = ");
        Log.log(4, AnonymousClass000.A0h(A0l2, Thread.activeCount()));
    }

    public void A0Y(UserJid userJid, CallInfo callInfo, boolean z) {
        this.A13.execute(new C71643cR(this, userJid, callInfo, 6, z));
    }

    public synchronized void A0Z(UserJid userJid, String str) {
        C52242lA r2 = this.A0R;
        C66553Lw r3 = this.A2t;
        r2.A01 = r3.A0O(userJid);
        A07(str).A05 = r2.A01;
        if (this.A2o.A0X(6307)) {
            r2.A00 = r3.A0N(userJid);
            r2.A02 = AnonymousClass000.A1T(this.A2Z.A00.A01() ? 1 : 0);
        }
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/updateDNDAndVoipNotificationChannelState Call Notification State: ", r2);
    }

    public static final int A00(CallInfo callInfo) {
        switch (callInfo.callResult) {
            case 1:
                if (callInfo.isEndedByMe) {
                    return 2;
                }
                return 3;
            case 2:
                return 6;
            case 3:
            case 7:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
                return 8;
            case 4:
            case 8:
            case 9:
                return 5;
            case 5:
                if (callInfo.isCaller) {
                    return 7;
                }
                return 5;
            case 6:
            case 10:
            case 14:
            case 19:
                return 1;
            case 18:
                return 4;
            default:
                return 9;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A01(X.C105825Wo r27, X.C107285b3 r28) {
        /*
            r1 = r27
            java.lang.String r6 = r1.A09
            java.util.LinkedHashMap r0 = r1.A0B
            r27 = r0
            boolean r0 = r1.A0D
            r18 = r0
            com.whatsapp.jid.GroupJid r11 = r1.A06
            boolean r0 = r1.A0E
            r17 = r0
            java.lang.String r13 = r1.A0A
            boolean r10 = r1.A0C
            java.lang.String r9 = r1.A02
            int r8 = r1.A00
            boolean r0 = r1.A03
            r26 = r0
            java.util.Set r0 = r27.keySet()
            java.util.ArrayList r16 = X.AnonymousClass002.A0J(r0)
            boolean r0 = r16.isEmpty()
            r5 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "Trying start a call with empty list of jids"
            X.C626936e.A0D(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/actionStartNewOutgoingCall callId: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " groupJid: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " phash: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "offerDelay: "
            X.C18260x0.A0y(r0, r1, r8)
            r4 = 0
            r7 = r28
            if (r9 != 0) goto L_0x0167
            r0 = r16
            java.lang.Object r0 = r0.get(r4)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
        L_0x0060:
            int r1 = r16.size()
            boolean r25 = X.C86624Kv.A1W(r1, r5)
            r19 = r7
            r20 = r11
            r21 = r0
            r22 = r6
            r23 = r5
            r24 = r18
            r19.A0W(r20, r21, r22, r23, r24, r25)
            boolean r1 = r7.A1Q
            if (r1 == 0) goto L_0x0208
            if (r18 == 0) goto L_0x0080
            X.C106155Xv.A02(r7)
        L_0x0080:
            boolean r2 = r0 instanceof X.C27981fH
            X.2sr r1 = r7.A1e
            if (r2 == 0) goto L_0x0160
            X.6kB r12 = r1.A0G()
        L_0x008a:
            if (r17 != 0) goto L_0x015e
            X.2sW r3 = r7.A2h
            java.lang.String r14 = X.C627436k.A08(r6)
            X.2sH r1 = r7.A2X
            long r23 = r1.A0H()
            r22 = 0
            X.C626936e.A06(r12)
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12
            java.lang.String r1 = "CallsMessageStore/addCallLog "
            com.whatsapp.util.Log.d((java.lang.String) r1)
            r1 = -1
            X.39J r2 = new X.39J
            r2.<init>(r1, r0, r14, r5)
            X.1VX r1 = r3.A0J
            r0 = 2843(0xb1b, float:3.984E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0159
            X.2m9 r15 = r3.A07
            r14 = 7
            X.3Zw r0 = new X.3Zw
            r0.<init>(r3, r14, r2)
            r14 = 61
            r15.A01(r0, r14)
        L_0x00c1:
            X.3ZF r0 = new X.3ZF
            r19 = r0
            r20 = r12
            r21 = r2
            r25 = r18
            r19.<init>(r20, r21, r22, r23, r25)
            X.2m9 r14 = r3.A07
            r2 = 8
            X.3Zw r12 = new X.3Zw
            r12.<init>(r3, r2, r0)
            r2 = 15
            r14.A01(r12, r2)
            r2 = 6120(0x17e8, float:8.576E-42)
            int r1 = r1.A0N(r2)
            if (r1 < r5) goto L_0x00e7
            r3.A09(r0)
        L_0x00e7:
            java.util.Collection r2 = r27.values()
            com.whatsapp.voipcalling.CallParticipantJid[] r1 = new com.whatsapp.voipcalling.CallParticipantJid[r4]
            java.lang.Object[] r14 = r2.toArray(r1)
            com.whatsapp.voipcalling.CallParticipantJid[] r14 = (com.whatsapp.voipcalling.CallParticipantJid[]) r14
            int r12 = r14.length
            r15 = 1
            if (r12 != r5) goto L_0x00f8
            r11 = 0
        L_0x00f8:
            r28 = r26
            r22 = r11
            r23 = r17
            r24 = r13
            r25 = r10
            r26 = r9
            r27 = r8
            r19 = r6
            r20 = r14
            r21 = r18
            int r2 = com.whatsapp.voipcalling.Voip.startCall(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r2 != 0) goto L_0x01ad
            X.1VX r1 = r7.A2o
            boolean r1 = X.C627436k.A0G(r1)
            if (r1 == 0) goto L_0x014c
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r11 != 0) goto L_0x014c
            if (r12 <= r5) goto L_0x014c
            if (r0 == 0) goto L_0x0179
            if (r1 == 0) goto L_0x0129
            X.C614830y.A00(r1, r0)
        L_0x0129:
            X.2sW r1 = r7.A2h
            r1.A06(r0)
            if (r8 > 0) goto L_0x016f
            X.8qC r1 = r7.A39
            java.lang.Object r5 = r1.get()
            X.34o r5 = (X.C623234o) r5
            r1.get()
            java.util.ArrayList r3 = X.AnonymousClass002.A0I(r12)
            r2 = 0
        L_0x0140:
            if (r2 >= r12) goto L_0x0172
            r1 = r14[r2]
            com.whatsapp.jid.UserJid r1 = r1.userJid
            r3.add(r1)
            int r2 = r2 + 1
            goto L_0x0140
        L_0x014c:
            if (r0 == 0) goto L_0x0179
            if (r11 == 0) goto L_0x0129
            X.30y r1 = r7.A21
            r1.A06(r11, r0, r13)
            r1.A07(r11, r0, r13, r10)
            goto L_0x0129
        L_0x0159:
            r3.A05(r2)
            goto L_0x00c1
        L_0x015e:
            r0 = 0
            goto L_0x00e7
        L_0x0160:
            r1.A0P()
            X.6kH r12 = r1.A04
            goto L_0x008a
        L_0x0167:
            X.2sr r0 = r7.A1e
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            goto L_0x0060
        L_0x016f:
            r7.A0y = r6
            goto L_0x0179
        L_0x0172:
            java.util.Set r1 = X.C73723fy.A0P(r3)
            r5.A08(r0, r1, r4)
        L_0x0179:
            if (r10 != 0) goto L_0x0196
            android.content.Context r8 = r7.A1W
            X.1iO r0 = r7.A1a
            boolean r0 = r0.A00
            r15 = r15 ^ r0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r15)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r18)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r12 = r11
            r13 = r16
            android.content.Intent r0 = X.C627736r.A0o(r8, r9, r10, r11, r12, r13)
            r8.startActivity(r0)
        L_0x0196:
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r7.A13
            r2 = 26
            X.5sN r1 = new X.5sN
            r0 = r16
            r1.<init>(r7, r0, r6, r2)
            r3.execute(r1)
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0 = 2
            r7.A0d(r1, r0, r4, r4)
            return
        L_0x01ad:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "voip/actionStartNewOutgoingCall failed to start call "
            X.C18260x0.A0s(r1, r6, r3)
            if (r0 == 0) goto L_0x01ec
            X.1VX r1 = r7.A2o
            boolean r1 = X.C627436k.A0G(r1)
            if (r1 == 0) goto L_0x01ec
            r1 = 7
            r0.A0C(r1)
            X.2sW r1 = r7.A2h
            r1.A06(r0)
            X.8qC r1 = r7.A39
            java.lang.Object r8 = r1.get()
            X.34o r8 = (X.C623234o) r8
            r1.get()
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r12)
            r3 = 0
        L_0x01d9:
            if (r3 >= r12) goto L_0x01e5
            r1 = r14[r3]
            com.whatsapp.jid.UserJid r1 = r1.userJid
            r5.add(r1)
            int r3 = r3 + 1
            goto L_0x01d9
        L_0x01e5:
            java.util.Set r1 = X.C73723fy.A0P(r5)
            r8.A08(r0, r1, r4)
        L_0x01ec:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x01fd
            X.4Mi r1 = r7.A08(r6)
            if (r1 == 0) goto L_0x01fd
            r0 = 9
            r1.A01(r0)
        L_0x01fd:
            r0 = 670001(0xa3931, float:9.38871E-40)
            if (r2 == r0) goto L_0x0208
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            r0 = 0
            r7.A0h(r1, r0)
        L_0x0208:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A01(X.5Wo, X.5b3):void");
    }

    public AnonymousClass2TG A07(String str) {
        Map map = this.A3E;
        AnonymousClass2TG r0 = (AnonymousClass2TG) map.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass2TG r02 = new AnonymousClass2TG();
        map.put(str, r02);
        return r02;
    }

    public C86914Mi A08(String str) {
        if (str == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return this.A2A.A03(str);
    }

    public C153457bL A09() {
        return new C91424ja(this);
    }

    public String A0A(String str, String str2) {
        if (this.A2o.A0X(4950)) {
            return this.A1v.A00(str);
        }
        AnonymousClass3ZF A042 = this.A21.A04(str);
        if (A042 != null) {
            String str3 = A042.A08;
            if (str3 == null) {
                Map map = this.A3D;
                if (map.containsKey(str)) {
                    A042.A0K(C18310x6.A0o(str, map));
                    this.A2h.A06(A042);
                    String A0o2 = C18310x6.A0o(str, map);
                    map.remove(str);
                    return A0o2;
                } else if (str2 != null) {
                    A042.A0K(str2);
                    this.A2h.A06(A042);
                    return str2;
                }
            }
            return str3;
        }
        Map map2 = this.A3D;
        if (map2.containsKey(str)) {
            return C18310x6.A0o(str, map2);
        }
        map2.put(str, str2);
        return str2;
    }

    public void A0B() {
        this.A0J.removeMessages(0);
        this.A0J.sendEmptyMessageDelayed(0, 15000);
    }

    public void A0C() {
        A0P(30, (String) null);
    }

    public void A0F() {
        long j = this.A0A;
        if (j != -1) {
            this.A0C += AnonymousClass0x9.A05(j);
            this.A0A = -1;
            Log.i("VoiceService:onExitPictureInPicture");
        }
    }

    public void A0G() {
        Object obj = this.A0v;
        if (obj != null) {
            try {
                ((AcousticEchoCanceler) obj).release();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
        this.A0v = null;
        Object obj2 = this.A0w;
        if (obj2 != null) {
            try {
                ((AutomaticGainControl) obj2).release();
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        this.A0w = null;
        Object obj3 = this.A0x;
        if (obj3 != null) {
            try {
                ((NoiseSuppressor) obj3).release();
            } catch (Throwable th3) {
                Log.e(th3);
            }
        }
        this.A0x = null;
    }

    public void A0I() {
        Point A012;
        C52412lR r0 = this.A2n;
        Context context = this.A1W;
        C162457s7.A0J(context, 0);
        AnonymousClass33p r02 = r0.A02;
        Point point = new Point();
        C183538qC r3 = r02.A01;
        point.x = C18300x5.A0B(r3).getInt("foldable_max_display_width", 0);
        point.y = C18300x5.A0B(r3).getInt("foldable_max_display_height", 0);
        Point point2 = new Point();
        point2.x = C18300x5.A0B(r3).getInt("foldable_min_display_width", 0);
        int i = C18300x5.A0B(r3).getInt("foldable_min_display_height", 0);
        point2.y = i;
        int i2 = point.x;
        int i3 = point.y;
        int i4 = (i2 + point2.x) / 2;
        int i5 = (i3 + i) / 2;
        if (i4 == 0 || i5 == 0) {
            A012 = AnonymousClass5YQ.A01(context);
            if (A012 == null) {
                Log.e("voip/service/updateVoipScreenSize point is null, Voip.screenSize is not set");
                return;
            }
        } else {
            A012 = new Point(i4, i5);
        }
        Voip.setScreenSize(A012.x, A012.y);
    }

    public final void A0J() {
        ((C48062eH) this.A3A.get()).A02(AnonymousClass3LB.class);
    }

    public final void A0K() {
        C185888uP r0;
        Log.i("voip/ear-far");
        C626936e.A01();
        this.A19 = false;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && callInfo.isEitherSideRequestingUpgrade()) {
            C185888uP r02 = this.A0X;
            if (r02 != null) {
                r02.BsG(callInfo);
            }
            this.A1m.A08(callInfo, (Boolean) null);
        }
        if (this.A0M == null && (r0 = this.A0X) != null) {
            r0.BZ7(false);
        }
    }

    public final void A0L() {
        C185888uP r0;
        Log.i("voip/ear-near");
        C626936e.A01();
        this.A19 = true;
        CallInfo callInfo = Voip.getCallInfo();
        if (this.A1S || (callInfo != null && callInfo.isEitherSideRequestingUpgrade())) {
            C116085pi r2 = this.A1m;
            boolean z = true;
            if (r2.A00 != 1) {
                z = false;
            }
            if (z) {
                r2.A0C(callInfo, false);
            }
            this.A1S = false;
        }
        if (this.A0M == null && (r0 = this.A0X) != null) {
            r0.BZ7(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 != null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0.intValue() == 0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        X.C626936e.A0D(r1, "Bug in loading call lobby entry point");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(int r3) {
        /*
            r2 = this;
            java.lang.Integer r0 = r2.A0l
            if (r0 != 0) goto L_0x000c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A0l = r0
            if (r0 == 0) goto L_0x0013
        L_0x000c:
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            java.lang.String r0 = "Bug in loading call lobby entry point"
            X.C626936e.A0D(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0O(int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.3a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.3a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: X.5rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: X.5rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.5rh} */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Runnable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0329, code lost:
        r2 = new X.C70183a5(r3, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        r1 = X.AnonymousClass0x7.A0E(r16);
        r5 = X.AnonymousClass001.A0o();
        r5.append("voip/service/cmd/");
        r5.append(r4);
        r5.append(" elapsed ");
        r5.append(r1);
        X.C18260x0.A1L(r5, " ms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e0, code lost:
        if (r3.A2L.A03() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        X.C18260x0.A1P(X.AnonymousClass001.A0o(), "voip/service/cmd Call not active, stopping self ", r3);
        A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(X.C106645Zu r23) {
        /*
            r22 = this;
            r12 = r23
            java.lang.String r4 = r12.A03
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/service/cmd command="
            X.C18260x0.A1R(r1, r0, r12)
            r3 = r22
            boolean r1 = r3.A1Q
            java.lang.String r21 = "hangup_call"
            java.lang.String r20 = "cancel_scheduled_call_reminder"
            java.lang.String r15 = "show_vc_lobby"
            java.lang.String r14 = "create_call_link"
            java.lang.String r13 = "refresh_notification"
            java.lang.String r11 = "handle_push_payload"
            java.lang.String r10 = "start_from_call_log"
            java.lang.String r9 = "set_scheduled_call_reminder"
            java.lang.String r8 = "preview_call_link"
            java.lang.String r7 = "check_ongoing_calls"
            java.lang.String r6 = "start_call"
            java.lang.String r5 = "handle_bcall_command"
            java.lang.String r0 = "receive_message"
            if (r1 != 0) goto L_0x008b
            boolean r1 = com.whatsapp.voipcalling.Voip.A07()
            if (r1 != 0) goto L_0x008b
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r6.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r10.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r11.equals(r4)
            if (r1 != 0) goto L_0x008b
            r1 = r21
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r7.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r14.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r8.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r5.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r9.equals(r4)
            if (r1 != 0) goto L_0x008b
            r1 = r20
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r13.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r15.equals(r4)
            if (r1 != 0) goto L_0x008b
            java.lang.String r0 = "voip/service/cmd/not-started"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x008a:
            return
        L_0x008b:
            boolean r1 = r3.A1R
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "voip/service/cmd VoiceService is stopping, restart the service with the same command later."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.util.List r0 = r3.A3C
            r0.add(r12)
            return
        L_0x009a:
            android.os.Bundle r2 = r12.A00
            if (r2 != 0) goto L_0x00a2
            android.os.Bundle r2 = X.AnonymousClass002.A08()
        L_0x00a2:
            long r16 = android.os.SystemClock.elapsedRealtime()
            int r19 = r4.hashCode()
            r1 = 1
            r18 = -1
            switch(r19) {
                case -2108450315: goto L_0x0448;
                case -1573659621: goto L_0x043e;
                case -1233448890: goto L_0x0432;
                case -1026884326: goto L_0x0428;
                case -976156138: goto L_0x041c;
                case -921141884: goto L_0x0412;
                case -889332668: goto L_0x0408;
                case 76499387: goto L_0x03fe;
                case 383498784: goto L_0x03f4;
                case 1281366991: goto L_0x03ea;
                case 1331833598: goto L_0x03de;
                case 1377948940: goto L_0x03d2;
                case 1444513451: goto L_0x03c8;
                case 1591822776: goto L_0x03be;
                case 1724857030: goto L_0x03b4;
                case 2017953372: goto L_0x03a8;
                case 2138982608: goto L_0x039c;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            java.lang.String r7 = "notification_type"
            r10 = 0
            r8 = 0
            switch(r18) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x0347;
                case 2: goto L_0x0333;
                case 3: goto L_0x031b;
                case 4: goto L_0x02f2;
                case 5: goto L_0x0274;
                case 6: goto L_0x0264;
                case 7: goto L_0x01e6;
                case 8: goto L_0x01db;
                case 9: goto L_0x01c6;
                case 10: goto L_0x0196;
                case 11: goto L_0x0141;
                case 12: goto L_0x0131;
                case 13: goto L_0x011a;
                case 14: goto L_0x010f;
                case 15: goto L_0x00ff;
                case 16: goto L_0x00ef;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            java.lang.String r0 = "voip/service/cmd/unknown-action"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00bd:
            long r1 = X.AnonymousClass0x7.A0E(r16)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/service/cmd/"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = " elapsed "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " ms"
            X.C18260x0.A1L(r5, r0)
            X.5TW r0 = r3.A2L
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x008a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/service/cmd Call not active, stopping self "
            X.C18260x0.A1P(r1, r0, r3)
            r3.A0B()
            return
        L_0x00ef:
            java.lang.String r0 = "end_call_string"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "end_call_reason"
            int r0 = r2.getInt(r0)
            r3.A0e(r10, r1, r0)
            goto L_0x00bd
        L_0x00ff:
            android.os.Message r0 = r12.A01
            X.C626936e.A06(r0)
            java.lang.Object r1 = r0.obj
            X.C626936e.A06(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A13
            r0 = 32
            goto L_0x0329
        L_0x010f:
            X.4FS r2 = r3.A35
            r0 = 33
            X.3a5 r1 = new X.3a5
            r1.<init>(r3, r0, r12)
            goto L_0x0392
        L_0x011a:
            android.os.Message r0 = r12.A01
            X.C626936e.A06(r0)
            int r0 = r0.arg1
            if (r0 == r1) goto L_0x0124
            r1 = 0
        L_0x0124:
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r3.A13
            r2 = 13
            X.3cX r0 = new X.3cX
            r0.<init>((int) r2, (java.lang.Object) r3, (boolean) r1)
            r5.execute(r0)
            goto L_0x00bd
        L_0x0131:
            java.util.concurrent.atomic.AtomicInteger r0 = A3T
            r0.getAndIncrement()
            android.os.Message r1 = r12.A01
            X.C626936e.A06(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A13
            r0 = 28
            goto L_0x0329
        L_0x0141:
            boolean r0 = r3.A1P
            if (r0 == 0) goto L_0x0168
            X.5TW r2 = r3.A2L
            boolean r0 = r2.A01()
            if (r0 != 0) goto L_0x0153
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0168
        L_0x0153:
            android.content.Context r8 = r3.A1W
            X.1iO r0 = r3.A1a
            boolean r0 = r0.A00
            java.lang.Boolean r9 = X.C18320x8.A0V(r0)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r13 = r10
            r12 = r10
            android.content.Intent r0 = X.C627736r.A0o(r8, r9, r10, r11, r12, r13)
            r8.startActivity(r0)
        L_0x0168:
            boolean r0 = r3.A1P
            if (r0 != 0) goto L_0x0191
            X.5TW r0 = r3.A2L
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0191
            com.whatsapp.voipcalling.CallLinkInfo r0 = com.whatsapp.voipcalling.Voip.getCallLinkInfo()
            if (r0 == 0) goto L_0x0191
            int r2 = r0.linkState
            if (r2 == r1) goto L_0x0181
            r0 = 2
            if (r2 != r0) goto L_0x0191
        L_0x0181:
            android.os.Handler r0 = r3.A0H
            r1 = 50
            r0.removeMessages(r1)
            android.os.Handler r0 = r3.A0H
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
        L_0x0191:
            r0 = 0
            r3.A1P = r0
            goto L_0x00bd
        L_0x0196:
            r6 = 7
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r0 == 0) goto L_0x01ad
            com.whatsapp.jid.GroupJid r5 = r0.groupJid
            if (r5 != 0) goto L_0x01a7
            com.whatsapp.jid.UserJid r5 = r0.getCreatorJid()
            if (r5 == 0) goto L_0x01ad
        L_0x01a7:
            X.5mB r1 = r3.A2S
            r0 = 6
            r1.A06(r5, r0)
        L_0x01ad:
            java.lang.String r0 = "call_id"
            java.lang.String r5 = r2.getString(r0)
            java.lang.String r1 = "call_ui_action"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            r3.A0m(r5, r10, r0)
            X.33T r1 = r3.A2Z
            java.lang.String r0 = "VoiceService2"
            r1.A05(r6, r0)
            goto L_0x00bd
        L_0x01c6:
            r6 = 0
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0 = 2
            int r1 = r2.getInt(r7, r0)
            java.lang.String r0 = "is_media_projection"
            boolean r0 = r2.getBoolean(r0)
            r3.A0d(r5, r1, r6, r0)
            goto L_0x00bd
        L_0x01db:
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A13
            r0 = 29
            X.3a5 r2 = new X.3a5
            r2.<init>(r3, r0, r12)
            goto L_0x032e
        L_0x01e6:
            java.lang.Object r5 = r12.A02
            X.C626936e.A06(r5)
            X.5Wo r5 = (X.C105825Wo) r5
            long r1 = r5.A01
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f9
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A0s = r0
        L_0x01f9:
            X.3ZF r7 = r5.A07
            X.C626936e.A06(r7)
            java.lang.Integer r0 = r5.A08
            int r14 = X.C86664Kz.A0K(r0)
            boolean r6 = r5.A04
            java.lang.String r5 = r5.A02
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0217
            java.lang.String r0 = "voip/actionStartFromCallLog can't start, a call is already ongoing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00bd
        L_0x0217:
            X.39J r0 = r7.A0E
            java.lang.String r0 = r0.A02
            java.lang.String r2 = X.C627436k.A07(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/actionStartFromCallLog starting callId:"
            X.C18260x0.A0s(r0, r2, r1)
            java.util.List r13 = r7.A08()
            java.util.HashSet r9 = X.AnonymousClass002.A0K()
            java.util.Iterator r10 = r13.iterator()
        L_0x0234:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x024f
            java.lang.Object r8 = r10.next()
            X.3ZE r8 = (X.AnonymousClass3ZE) r8
            int r1 = r8.A00
            r0 = 5
            if (r1 != r0) goto L_0x0234
            com.whatsapp.jid.UserJid r0 = r8.A02
            com.whatsapp.jid.DeviceJid r0 = X.C618932r.A00(r0)
            r9.add(r0)
            goto L_0x0234
        L_0x024f:
            r3.A0n(r9)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r3.A13
            X.3b7 r0 = new X.3b7
            r8 = r0
            r9 = r3
            r10 = r7
            r11 = r2
            r12 = r5
            r15 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.execute(r0)
            goto L_0x00bd
        L_0x0264:
            android.os.Message r0 = r12.A01
            X.C626936e.A06(r0)
            java.lang.Object r1 = r0.obj
            X.C626936e.A06(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A13
            r0 = 31
            goto L_0x0329
        L_0x0274:
            android.os.Message r0 = r12.A01
            X.C626936e.A06(r0)
            java.lang.Object r5 = r0.obj
            X.C626936e.A06(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r0.arg2
            int r0 = r0.arg1
            if (r0 == r1) goto L_0x0287
            r1 = 0
        L_0x0287:
            com.whatsapp.voipcalling.CallState r7 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r2 = 0
            if (r7 == r0) goto L_0x02c9
            java.lang.String r1 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r1 == 0) goto L_0x02c3
            X.30y r0 = r3.A21
            X.3ZF r1 = r0.A04(r1)
            if (r1 == 0) goto L_0x02c3
            X.2l8 r0 = r1.A0I
            if (r0 == 0) goto L_0x02c3
            X.2l8 r0 = r1.A0I
            java.lang.String r0 = r0.A02
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x02c3
            android.content.Context r8 = r3.A1W
            X.1iO r0 = r3.A1a
            boolean r0 = r0.A00
            java.lang.Boolean r9 = X.C18320x8.A0V(r0)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r13 = r10
            r12 = r10
            android.content.Intent r0 = X.C627736r.A0o(r8, r9, r10, r11, r12, r13)
            r8.startActivity(r0)
            goto L_0x00bd
        L_0x02c3:
            X.3Wi r1 = r3.A1d
            r0 = 2131889071(0x7f120baf, float:1.9412795E38)
            goto L_0x02d6
        L_0x02c9:
            X.1ip r0 = r3.A2N
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x02db
            X.3Wi r1 = r3.A1d
            r0 = 2131887251(0x7f120493, float:1.9409104E38)
        L_0x02d6:
            r1.A0H(r0, r2)
            goto L_0x00bd
        L_0x02db:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/actionPreviewCallLink starting token:"
            X.C18260x0.A0s(r0, r5, r2)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A13
            r12 = 1
            X.5rh r2 = new X.5rh
            r8 = r2
            r9 = r3
            r10 = r5
            r11 = r6
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x032e
        L_0x02f2:
            X.33i r0 = r3.A2W
            boolean r5 = X.C627436k.A0D(r0)
            r3.A1F = r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/service/cmd/ACTION_REFRESH_APP_BACKGROUND_RESTRICTIONS -- isAppBackgroundRestricted: "
            X.C18260x0.A1D(r0, r1, r5)
            boolean r0 = r3.A1F
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "voip/service/cmd/ACTION_REFRESH_APP_BACKGROUND_RESTRICTIONS background restrictions no longer enabled, start FgService"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0 = 2
            int r1 = r2.getInt(r7, r0)
            r0 = 0
            r3.A0d(r5, r1, r0, r0)
            goto L_0x00bd
        L_0x031b:
            android.os.Message r0 = r12.A01
            X.C626936e.A06(r0)
            java.lang.Object r1 = r0.obj
            X.C626936e.A06(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A13
            r0 = 30
        L_0x0329:
            X.3a5 r2 = new X.3a5
            r2.<init>(r3, r0, r1)
        L_0x032e:
            r7.execute(r2)
            goto L_0x00bd
        L_0x0333:
            X.5jr r0 = r3.A29
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00bd
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0 = 0
            r3.A0d(r2, r1, r0, r0)
            goto L_0x00bd
        L_0x0347:
            java.lang.Object r2 = r12.A02
            X.C626936e.A06(r2)
            X.5Wo r2 = (X.C105825Wo) r2
            int r0 = r2.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0i = r0
            long r5 = r2.A01
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0362
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r3.A0s = r0
        L_0x0362:
            java.lang.Integer r0 = r2.A08
            if (r0 == 0) goto L_0x0368
            r3.A0l = r0
        L_0x0368:
            r0 = 26
            X.3a5 r5 = new X.3a5
            r5.<init>(r3, r0, r2)
            com.whatsapp.jid.GroupJid r0 = r2.A06
            if (r0 != 0) goto L_0x0397
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0397
            java.util.LinkedHashMap r0 = r2.A0B
            int r0 = r0.size()
            if (r0 != r1) goto L_0x0397
            X.1VX r1 = r3.A2o
            r0 = 5989(0x1765, float:8.392E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0397
            X.4FS r2 = r3.A35
            r0 = 27
            X.3a5 r1 = new X.3a5
            r1.<init>(r3, r0, r5)
        L_0x0392:
            r2.BkP(r1)
            goto L_0x00bd
        L_0x0397:
            r5.run()
            goto L_0x00bd
        L_0x039c:
            r0 = r21
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r18 = 16
            goto L_0x00b0
        L_0x03a8:
            r0 = r20
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r18 = 15
            goto L_0x00b0
        L_0x03b4:
            boolean r0 = r4.equals(r15)
            if (r0 == 0) goto L_0x00b0
            r18 = 14
            goto L_0x00b0
        L_0x03be:
            boolean r0 = r4.equals(r14)
            if (r0 == 0) goto L_0x00b0
            r18 = 13
            goto L_0x00b0
        L_0x03c8:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r18 = 12
            goto L_0x00b0
        L_0x03d2:
            java.lang.String r0 = "show_voip_activity"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r18 = 11
            goto L_0x00b0
        L_0x03de:
            java.lang.String r0 = "reject_call"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r18 = 10
            goto L_0x00b0
        L_0x03ea:
            boolean r0 = r4.equals(r13)
            if (r0 == 0) goto L_0x00b0
            r18 = 9
            goto L_0x00b0
        L_0x03f4:
            boolean r0 = r4.equals(r11)
            if (r0 == 0) goto L_0x00b0
            r18 = 8
            goto L_0x00b0
        L_0x03fe:
            boolean r0 = r4.equals(r10)
            if (r0 == 0) goto L_0x00b0
            r18 = 7
            goto L_0x00b0
        L_0x0408:
            boolean r0 = r4.equals(r9)
            if (r0 == 0) goto L_0x00b0
            r18 = 6
            goto L_0x00b0
        L_0x0412:
            boolean r0 = r4.equals(r8)
            if (r0 == 0) goto L_0x00b0
            r18 = 5
            goto L_0x00b0
        L_0x041c:
            java.lang.String r0 = "refresh_app_background_restrictions"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r18 = 4
            goto L_0x00b0
        L_0x0428:
            boolean r0 = r4.equals(r7)
            if (r0 == 0) goto L_0x00b0
            r18 = 3
            goto L_0x00b0
        L_0x0432:
            java.lang.String r0 = "start_foreground_service_from_push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r18 = 2
            goto L_0x00b0
        L_0x043e:
            boolean r0 = r4.equals(r6)
            if (r0 == 0) goto L_0x00b0
            r18 = 1
            goto L_0x00b0
        L_0x0448:
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L_0x00b0
            r18 = 0
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0S(X.5Zu):void");
    }

    public void A0T(C185888uP r8) {
        this.A0X = r8;
        if (Build.VERSION.SDK_INT >= 23) {
            for (StatusBarNotification statusBarNotification : this.A2t.A0Q()) {
                if (statusBarNotification.getId() == 27) {
                    this.A2Z.A06(27, statusBarNotification.getTag(), "joinable call");
                }
            }
            return;
        }
        Iterator it = this.A1l.A05().iterator();
        while (it.hasNext()) {
            this.A2Z.A06(27, AnonymousClass001.A0m(it), "joinable call");
        }
    }

    public void A0X(GroupJid groupJid, String str) {
        if (groupJid != null && !TextUtils.isEmpty(str) && this.A3L) {
            this.A35.BkP(new C117715sN(this, groupJid, str, 27));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.A19 != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0b(com.whatsapp.voipcalling.CallInfo r5) {
        /*
            r4 = this;
            boolean r0 = r4.A18
            r3 = 0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r4.A19
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            r4.A18 = r2
            X.5pi r0 = r4.A1m
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x0024
            boolean r0 = X.C627436k.A0O(r5)
            if (r0 == 0) goto L_0x0034
            boolean r0 = r5.videoEnabled
            if (r0 != 0) goto L_0x0024
            boolean r0 = X.C107535bT.A09()
            if (r0 == 0) goto L_0x0034
        L_0x0024:
            boolean r0 = r5.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x004a
            boolean r0 = r4.A1S
            if (r0 != 0) goto L_0x004a
            if (r3 != 0) goto L_0x004a
            r4.A0M()
            return
        L_0x0034:
            if (r2 != 0) goto L_0x0024
            boolean r0 = r5.isCaller
            if (r0 != 0) goto L_0x0042
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0)
            if (r0 != 0) goto L_0x0024
        L_0x0042:
            boolean r0 = r5.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x0024
            r3 = 1
            goto L_0x0024
        L_0x004a:
            X.C626936e.A01()
            android.os.PowerManager$WakeLock r0 = r4.A0M
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "voip/service/acquireProximityWakeLock already acquired, do nothing"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0057:
            r2 = 32
            X.33i r0 = r4.A2W     // Catch:{ Exception -> 0x007e }
            android.os.PowerManager r1 = r0.A0J()     // Catch:{ Exception -> 0x007e }
            if (r1 != 0) goto L_0x0067
            java.lang.String r0 = "voip/service/acquireProximityWakeLock pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x007e }
            goto L_0x0085
        L_0x0067:
            android.os.PowerManager$WakeLock r0 = r4.A0M     // Catch:{ Exception -> 0x007e }
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "VoiceService Proximity"
            android.os.PowerManager$WakeLock r0 = X.AnonymousClass75K.A00(r1, r0, r2)     // Catch:{ Exception -> 0x007e }
            r4.A0M = r0     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x0085
            r0.acquire()     // Catch:{ Exception -> 0x007e }
            java.lang.String r0 = "voip/service/acquireProximityWakeLock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x007e }
            goto L_0x0085
        L_0x007e:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            r4.A0M = r0
        L_0x0085:
            X.1VX r2 = r4.A2o
            X.2vE r1 = X.C58422vE.A01
            r0 = 6747(0x1a5b, float:9.455E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x00aa
            X.3dI r1 = r4.A0e
            if (r1 != 0) goto L_0x009d
            X.4FS r0 = r4.A35
            X.3dI r1 = X.C72173dI.A00(r0)
            r4.A0e = r1
        L_0x009d:
            r1.A02()
            r0 = 31
            X.5sL r0 = X.C117695sL.A00(r4, r0)
            r1.execute(r0)
            return
        L_0x00aa:
            X.7T0 r1 = r4.A0a
            X.8no r0 = r4.A0Z
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0b(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A0c(CallInfo callInfo, int i) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.A13;
        int i2 = i;
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.execute(new AnonymousClass8M9(i2, 2));
        }
        C185888uP r2 = this.A0X;
        CallInfo callInfo2 = callInfo;
        if (r2 != null) {
            r2.Bra(callInfo2, i2, this.A1m.A0G(callInfo2.callId));
        }
        if (callInfo2.self != null) {
            C97174xk r22 = this.A0Q;
            boolean A0G2 = this.A1m.A0G(callInfo2.callId);
            boolean z = callInfo2.self.A0F;
            Iterator A032 = C61102zi.A03(r22);
            while (A032.hasNext()) {
                AnonymousClass4VK A152 = C86664Kz.A15(A032);
                if (A152 instanceof AudioChatCallingViewModel) {
                    AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) A152;
                    if (audioChatCallingViewModel.A0A) {
                        AnonymousClass7T0 r1 = audioChatCallingViewModel.A03;
                        if (r1 == null) {
                            r1 = new AnonymousClass7T0(audioChatCallingViewModel.A0N);
                            audioChatCallingViewModel.A03 = r1;
                        }
                        if (i2 == 2) {
                            r1.A00(audioChatCallingViewModel.A0K);
                        } else {
                            r1.A00((C182068no) null);
                            audioChatCallingViewModel.A0J(false);
                        }
                    }
                } else if (A152 instanceof AudioChatBottomSheetViewModel) {
                    AnonymousClass08M r23 = ((AudioChatBottomSheetViewModel) A152).A0A;
                    C104875Sr r8 = (C104875Sr) r23.A07();
                    if (r8 != null) {
                        List<Object> list = r8.A03;
                        ArrayList A0c2 = C73783g4.A0c(list);
                        for (Object obj : list) {
                            boolean z2 = true;
                            if (obj instanceof C91374jU) {
                                C91374jU r12 = (C91374jU) obj;
                                if (i2 != 3) {
                                    z2 = false;
                                }
                                obj = new C91374jU(r12.A03, A0G2, z2);
                            } else if (obj instanceof C91344jR) {
                                C91344jR r13 = (C91344jR) obj;
                                if (i2 != 1) {
                                    z2 = false;
                                }
                                obj = new C91344jR(z2, r13.A01);
                            } else if (obj instanceof C91384jV) {
                                obj = new C91384jV(z, ((C91384jV) obj).A02);
                            } else if (obj instanceof C91394jW) {
                                obj = new C91394jW(z, ((C91394jW) obj).A03);
                            }
                            A0c2.add(obj);
                        }
                        r23.A0G(new C104875Sr(r8.A01, r8.A02, A0c2, r8.A05, r8.A04));
                    }
                }
            }
        }
        A0b(callInfo2);
        this.A1S = false;
    }

    public final void A0e(CallInfo callInfo, String str, int i) {
        String A0X2;
        Context context;
        int i2;
        C185888uP r0;
        C116985rC r1 = this.A1Z;
        if (r1.A07()) {
            C65213Gq r12 = (C65213Gq) r1.A04();
            if (AnonymousClass2OK.A00(r12.A01)) {
                Log.d("InstrumentationObserverImpl/callEnded");
                for (C56262rh A032 : r12.A02.A00()) {
                    A032.A03(i);
                }
            }
        }
        if (callInfo == null && (callInfo = C627436k.A02()) == null) {
            A0X2 = "voip/call/end without call info";
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C626936e.A01();
            if (i == 25 || i == 24) {
                str = null;
            } else {
                if (!TextUtils.isEmpty(str) || !callInfo.isCaller || callInfo.callState != CallState.CALLING || this.A16 || SystemClock.elapsedRealtime() - this.A08 <= 10000) {
                    if (TextUtils.isEmpty(str) && i == 30) {
                        int i3 = (callInfo.callDuration > 0 ? 1 : (callInfo.callDuration == 0 ? 0 : -1));
                        context = this.A1W;
                        i2 = R.string.f11nameremoved;
                        if (i3 > 0) {
                            i2 = R.string.f11nameremoved;
                        }
                    }
                    if (!(str == null || (r0 = this.A0X) == null)) {
                        ((VoipActivityV2) r0).A1x = str;
                        this.A3N = AnonymousClass0x7.A0f();
                    }
                } else {
                    context = this.A1W;
                    i2 = R.string.f11nameremoved;
                }
                str = context.getString(i2);
                ((VoipActivityV2) r0).A1x = str;
                this.A3N = AnonymousClass0x7.A0f();
            }
            if (!callInfo.isCaller || callInfo.callState != CallState.CALLING || !this.A3P) {
                this.A3M = i;
            } else {
                this.A3M = 14;
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("voip/call/end without text=");
            A0o2.append(str);
            A0o2.append(", reason code=");
            C18260x0.A1G(A0o2, this.A3M);
            Future future = this.A2D.A0I;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.A13;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.execute(new C117705sM((Object) this, i, 17));
            }
            long A0E2 = AnonymousClass0x7.A0E(elapsedRealtime);
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("voip/call/end elapsed ");
            A0o3.append(A0E2);
            A0X2 = AnonymousClass000.A0X(" ms", A0o3);
        }
        Log.i(A0X2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r6.A1J != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0g(X.AnonymousClass3ZF r39, boolean r40) {
        /*
            r38 = this;
            r7 = r39
            r7.A0A()
            int r1 = r7.A02
            r0 = 3
            if (r1 == r0) goto L_0x0123
            r6 = r38
            X.2sW r5 = r6.A2h
            com.whatsapp.jid.GroupJid r0 = r7.A05
            r22 = 0
            if (r0 != 0) goto L_0x0029
            X.1VX r2 = r5.A0J
            java.util.Set r0 = r7.A09()
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L_0x004c
            r0 = 4800(0x12c0, float:6.726E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x004c
        L_0x0029:
            X.4xc r1 = r6.A36
            if (r40 != 0) goto L_0x0032
            boolean r0 = r6.A1J
            r2 = 0
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            java.lang.String r0 = "voip/notifyCallMissed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r0 = r1.next()
            X.8uW r0 = (X.C185958uW) r0
            r0.BO8(r7, r2)
            goto L_0x003c
        L_0x004c:
            java.util.Set r0 = r7.A09()
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L_0x0068
            com.whatsapp.jid.GroupJid r0 = r7.A05
            if (r0 != 0) goto L_0x0068
            X.2l8 r0 = r7.A0I
            if (r0 != 0) goto L_0x0068
            r0 = 4896(0x1320, float:6.861E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x0068
            goto L_0x0029
        L_0x0068:
            X.2ss r1 = r5.A0A
            X.39J r0 = r7.A0E
            com.whatsapp.jid.UserJid r2 = r0.A01
            r4 = 0
            X.31A r0 = r1.A0A(r2, r4)
            if (r0 == 0) goto L_0x0029
            X.2sH r1 = r5.A05
            X.2sr r0 = r5.A02
            X.2z0 r0 = X.AnonymousClass35J.A00(r0, r1, r2, r4)
            long r2 = r7.A0B
            X.1mr r1 = new X.1mr
            r1.<init>(r0, r2)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.2z0 r0 = r1.A1J
            X.4uZ r8 = r0.A00
            com.whatsapp.jid.UserJid r9 = X.AnonymousClass32Y.A03(r8)
            if (r9 != 0) goto L_0x00a4
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallLog/fromFMessageMissedCall bad UserJid: "
            X.C18260x0.A1Q(r3, r0, r8)
        L_0x009b:
            r1.A1x(r2)
            X.3Lv r0 = r5.A0B
            r0.A0V(r1)
            goto L_0x0029
        L_0x00a4:
            boolean r8 = r0.A02
            java.lang.String r0 = r0.A01
            X.39J r3 = new X.39J
            r3.<init>(r4, r9, r0, r8)
            long r14 = r1.A0K
            boolean r0 = r7.A0L
            r34 = r0
            r25 = 2
            X.22I r19 = r7.A07()
            r32 = 0
            r36 = 1
            com.whatsapp.jid.GroupJid r0 = r7.A05
            r20 = r0
            boolean r0 = r7.A0K
            r18 = r0
            java.util.List r23 = java.util.Collections.emptyList()
            com.whatsapp.jid.DeviceJid r0 = r7.A0C
            r17 = r0
            r7.A0A()
            int r0 = r7.A02
            r16 = r0
            X.2mt r13 = r7.A07
            X.2l8 r12 = r7.A0I
            int r11 = r7.A0H
            X.2ef r10 = r7.A0J
            r8 = -1
            X.3ZF r0 = new X.3ZF
            r35 = r4
            r21 = r10
            r24 = r4
            r26 = r16
            r27 = r11
            r28 = r8
            r30 = r14
            r37 = r18
            r15 = r17
            r16 = r20
            r17 = r1
            r18 = r3
            r20 = r13
            r13 = r0
            r14 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r35, r36, r37)
            java.util.Iterator r12 = X.AnonymousClass3ZF.A01(r7)
        L_0x0103:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r12.next()
            X.3ZE r3 = (X.AnonymousClass3ZE) r3
            java.util.Map r11 = r0.A09
            com.whatsapp.jid.UserJid r10 = r3.A02
            int r4 = r3.A00
            X.3ZE r3 = new X.3ZE
            r3.<init>(r10, r4, r8)
            r11.put(r10, r3)
            goto L_0x0103
        L_0x011e:
            r2.add(r0)
            goto L_0x009b
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0g(X.3ZF, boolean):void");
    }

    public void A0i(CallState callState, String str) {
        int i;
        AudioManager A0G2 = this.A2W.A0G();
        switch (callState.ordinal()) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 10:
                if (A0G2 != null && !AnonymousClass000.A1W(A08(str))) {
                    int mode = A0G2.getMode();
                    Integer num = this.A0h;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 3;
                    }
                    if (mode != i) {
                        A0G2.setMode(i);
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("voip/updateAudioModeForCallState ");
                    A0o2.append(callState);
                    C18260x0.A0y(" to ", A0o2, i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A0j(Integer num, String str, float f, float f2) {
        if (num != null) {
            float f3 = f;
            float f4 = f2;
            if (this.A2o.A0X(4959)) {
                this.A1i.A05(this.A0F, f, f2, num.intValue());
            } else {
                this.A0F.play(num.intValue(), f3, f4, 0, 0, 1.0f);
            }
        } else {
            C18260x0.A1K(AnonymousClass000.A0m("VoiceService/playSound/", str), " sound pool has not been loaded successfully");
        }
    }

    public void A0k(String str) {
        Message.obtain(this.A0H, 26, str).sendToTarget();
    }

    public void A0p(List list, int i) {
        this.A1d.BkS(new C71733ca((Object) list, (Object) this, i, 19));
    }

    public boolean A0q() {
        if (Build.VERSION.SDK_INT < 28 || !this.A2A.A0C()) {
            return false;
        }
        return true;
    }

    public boolean A0t(AnonymousClass3ZF r4) {
        AnonymousClass1VX r1 = this.A2o;
        if (r1.A0X(3675) || C627436k.A0A(this.A1e, r1) || r4.A0H == 2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void A02(C107285b3 r2, DeviceJid deviceJid, boolean z) {
        r2.A26.maybeSendPendingOffer(deviceJid, Voip.getCurrentCallId());
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = r2.A13;
        if (scheduledThreadPoolExecutor != null) {
            try {
                scheduledThreadPoolExecutor.execute(new C71703cX(14, (Object) deviceJid, z));
            } catch (RejectedExecutionException unused) {
                Log.w("voip/handleDeviceBecomesInvalid: executor shutdown");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r4 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A03(X.C107285b3 r18, com.whatsapp.voipcalling.CallInfo r19, long r20) {
        /*
            X.C626936e.A01()
            r3 = r19
            if (r19 == 0) goto L_0x0106
            com.whatsapp.voipcalling.CallState r4 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 == r0) goto L_0x0012
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r0 = 0
            if (r4 != r1) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            long r14 = r3.callDuration
            r2 = r18
            if (r0 == 0) goto L_0x0041
            X.4xc r1 = r2.A36
            boolean r5 = r3.videoEnabled
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            boolean r17 = X.AnonymousClass000.A1Y(r4, r0)
            boolean r18 = r3.isAudioChat()
            boolean r4 = r3.isGroupCall
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x002d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r13 = r1.next()
            X.8uW r13 = (X.C185958uW) r13
            r16 = r5
            r19 = r4
            r13.BO9(r14, r16, r17, r18, r19)
            goto L_0x002d
        L_0x0041:
            X.5ZK r4 = r2.A27
            boolean r0 = r4.A08(r3)
            if (r0 == 0) goto L_0x004f
            int r1 = r4.A00
            int r0 = r4.A06
            if (r1 >= r0) goto L_0x0058
        L_0x004f:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0058
            r4.A02()
        L_0x0058:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x0067
            boolean r0 = r3.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x0067
            r4.A03()
        L_0x0067:
            X.8uP r1 = r2.A0X
            if (r1 == 0) goto L_0x0077
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            X.C626936e.A01()
            com.whatsapp.voipcalling.CallInfo r0 = r1.A7E(r3)
            r1.A7k(r0)
        L_0x0077:
            X.4xk r0 = r2.A0Q
            r3 = r20
            r0.A0B(r14, r3)
            X.7TZ r7 = r2.A2B
            long r4 = java.lang.System.currentTimeMillis()
            long r8 = r7.A02
            long r1 = r4 - r8
            r12 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            boolean r6 = X.AnonymousClass001.A1W(r0)
            r10 = 0
            if (r6 == 0) goto L_0x00ad
            double r2 = r7.A00()
            r7.A00 = r2
            long r8 = r7.A02
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            double r0 = r7.A01
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L_0x00ab
        L_0x00a9:
            r7.A01 = r2
        L_0x00ab:
            r7.A02 = r4
        L_0x00ad:
            double r1 = r7.A01
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto L_0x0105
            double r3 = r7.A00
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x0105
            long r14 = r14 / r12
            double r1 = r1 - r3
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x00c5
            r14 = 1
        L_0x00c5:
            double r3 = (double) r14
            double r1 = r1 / r3
            if (r6 == 0) goto L_0x0105
            X.1il r0 = r7.A03
            X.30O r0 = r0.A00
            boolean r6 = r0.A01()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voipcalling/BatteryStateDelegate/isDeviceCharging is device charging returned: "
            X.C18260x0.A1E(r0, r3, r6)
            int r0 = (int) r1
            float r5 = (float) r0
            double r3 = r7.A00
            int r0 = (int) r3
            float r0 = (float) r0
            int r4 = com.whatsapp.voipcalling.Voip.setBatteryState(r5, r0, r6)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voipcalling/BatteryStateDelegate/updateBattery setting battery state for vid_rc_battery: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r2 = " "
            r3.append(r2)
            double r0 = r7.A00
            r3.append(r0)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r0 = " got result: "
            X.C18260x0.A0y(r0, r3, r4)
        L_0x0105:
            return
        L_0x0106:
            java.lang.String r0 = "voip/periodicalUpdateHandler we are not in an active call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A03(X.5b3, com.whatsapp.voipcalling.CallInfo, long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A04(X.C107285b3 r3, java.util.List r4, int r5) {
        /*
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2 = 1
            if (r5 == r2) goto L_0x008b
            r0 = 2
            if (r5 == r0) goto L_0x007b
            r1 = 6
            if (r5 == r1) goto L_0x006e
            r0 = 18
            if (r5 == r0) goto L_0x0054
            r0 = 10
            if (r5 == r0) goto L_0x0047
            r0 = 11
            if (r5 == r0) goto L_0x0047
            r0 = 34
            if (r5 == r0) goto L_0x0047
            r0 = 35
            if (r5 == r0) goto L_0x0047
            switch(r5) {
                case 21: goto L_0x0031;
                case 22: goto L_0x0031;
                case 23: goto L_0x0031;
                case 24: goto L_0x0031;
                case 25: goto L_0x0054;
                case 26: goto L_0x0031;
                case 27: goto L_0x0054;
                case 28: goto L_0x0047;
                case 29: goto L_0x0047;
                default: goto L_0x0024;
            }
        L_0x0024:
            r1 = 0
        L_0x0025:
            X.3Wi r0 = r3.A1d
            X.4FU r0 = r0.A00
            if (r0 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x0030
            r0.Boo(r1)
        L_0x0030:
            return
        L_0x0031:
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "finish"
            r1.putBoolean(r0, r2)
            r3.A0J()
            X.2dg r0 = new X.2dg
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r1, r0, r5)
            goto L_0x0025
        L_0x0047:
            r3.A0J()
            X.2dg r0 = new X.2dg
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A01(r0, r5)
            goto L_0x0025
        L_0x0054:
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r4)
            java.lang.String r0 = "user_jids"
            r2.putParcelableArrayList(r0, r1)
            r3.A0J()
            X.2dg r0 = new X.2dg
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r2, r0, r5)
            goto L_0x0025
        L_0x006e:
            r3.A0J()
            X.2dg r0 = new X.2dg
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A01(r0, r1)
            goto L_0x0025
        L_0x007b:
            if (r1 == 0) goto L_0x0024
            r3.A0J()
            java.util.Map r0 = r1.participants
            int r0 = r0.size()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A02(r4, r0, r2)
            goto L_0x0025
        L_0x008b:
            if (r1 == 0) goto L_0x0024
            r3.A0J()
            java.util.Map r0 = r1.participants
            int r1 = r0.size()
            r0 = 0
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A02(r4, r1, r0)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A04(X.5b3, java.util.List, int):void");
    }

    public void A0D() {
        Looper mainLooper;
        C06270Wx r0;
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/service/create ", this);
        AnonymousClass1VX r9 = this.A2o;
        if (r9.A0Y(C58422vE.A01, 4934)) {
            HandlerThread handlerThread = new HandlerThread("voip-periodic-update");
            this.A0K = handlerThread;
            handlerThread.start();
            mainLooper = this.A0K.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A0I = new C18780yF(mainLooper, this);
        this.A0G = new Handler(new C1238169w(this, 1));
        this.A0J = new Handler(new C1238169w(this, 2));
        this.A0H = new Handler(new AnonymousClass91L(this, 6));
        AnonymousClass4FS r10 = this.A35;
        C73513fd r02 = new C73513fd((C69423Wy) r10, new C72233dO("VoIP Signaling Thread"), 1);
        r02.allowCoreThreadTimeOut(false);
        this.A13 = r02;
        int A0N2 = r9.A0N(3784);
        if (A0N2 > 0) {
            C61262zy r4 = new C61262zy(this.A1b, (AnonymousClass0N6) null, this.A2X, (C72303dV) null, r9, r10, (Runnable) null, (long) (A0N2 * 1000));
            this.A0f = r4;
            r4.A03("voip-signaling-thread", this.A13);
            this.A0f.A00();
        }
        C620633i r42 = this.A2W;
        this.A0a = new AnonymousClass7T0(r42);
        this.A0N = new C86924Mk(this);
        this.A0D = new C188678zJ(this, 3);
        this.A0E = new AnonymousClass67N(this, 0);
        this.A0Z = new AnonymousClass92P(this, 1);
        C116085pi r5 = this.A1m;
        Log.i("voip/audio_route/init");
        r5.A0H.A03 = AnonymousClass0x9.A14(r5);
        if (C116085pi.A0L) {
            r5.A0E.A08(r5.A0D);
        }
        C149367Me r03 = this.A1n;
        C626936e.A01();
        C15930sC r3 = r03.A01;
        if (r3 != null) {
            AnonymousClass0KH r04 = r03.A00;
            if (r04 == null) {
                r0 = C18330xA.A01(0);
            } else {
                r0 = r04.A00;
            }
            r0.A0E(r3);
        }
        VoipCameraManager voipCameraManager = this.A38;
        Context context = this.A1W;
        AnonymousClass49P r13 = this.A1k;
        voipCameraManager.setCaptureDeviceFactory(new AnonymousClass8KD(context, r13, this.A1z, this.A20, r42, r9, this.A34));
        C56222rd r52 = this.A2D;
        r52.A06.A06(r52.A05);
        r52.A01.A06(r52.A00);
        r52.A0D.A06(r52.A0C);
        this.A30.A06(this.A2z);
        AnonymousClass8E5 r32 = new AnonymousClass8E5(this);
        this.A0O = r32;
        this.A1h.A06(r32);
        AnonymousClass8JS r33 = new AnonymousClass8JS(this);
        this.A0c = r33;
        this.A2x.A06(r33);
        if (Build.VERSION.SDK_INT >= 28) {
            C153457bL A092 = A09();
            this.A0Y = A092;
            this.A2A.A08(A092);
        } else {
            this.A0Y = null;
        }
        Voip.setVoipStackLogLevel(r9.A0N(4028));
        Voip.nativeRegisterJNIUtils(this.A37);
        Voip.nativeRegisterEventCallback(this.A28);
        if (Voip.A00 == null) {
            DefaultCryptoCallback defaultCryptoCallback = new DefaultCryptoCallback(this.A1e);
            Voip.nativeRegisterCryptoCallback(defaultCryptoCallback);
            Voip.A00 = defaultCryptoCallback;
        }
        OutgoingSignalingHandler outgoingSignalingHandler = this.A26;
        Voip.nativeRegisterSignalingXmppCallback(outgoingSignalingHandler);
        Voip.A02 = outgoingSignalingHandler;
        if (Build.VERSION.SDK_INT >= 22) {
            AnonymousClass35O r05 = new AnonymousClass35O(r42.A0H(), r13);
            this.A0P = r05;
            r05.A05();
        } else {
            this.A0P = null;
        }
        Voip.setEnableAudioEffectAvailabilityCache(r9.A0X(4247));
        AnonymousClass1VX r34 = this.A2I.A00;
        if (r34.A0X(4349) && r34.A0N(4872) == 1) {
            Log.d("VoiceService/initMLModels/Start downloading MLModels");
            r10.BkM(C117695sL.A00(this, 30));
        }
        Log.i("voip/service/created");
    }

    public void A0E() {
        AnonymousClass35O r0;
        C06270Wx r02;
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/service/destroy ", this);
        try {
            this.A27.A03();
        } catch (Exception e) {
            Log.e((Throwable) e);
        }
        A0G();
        SoundPool soundPool = this.A0F;
        if (soundPool != null) {
            this.A0o = null;
            this.A0m = null;
            if (this.A2o.A0X(6569)) {
                AnonymousClass4FS r1 = this.A35;
                Objects.requireNonNull(soundPool);
                r1.BkM(C117695sL.A00(soundPool, 33));
            } else {
                soundPool.release();
            }
            this.A0F = null;
        }
        this.A38.setCaptureDeviceFactory((C179838jn) null);
        C116085pi r2 = this.A1m;
        Log.i("voip/audio_route/deinit");
        r2.A02 = true;
        if (C116085pi.A0L) {
            r2.A0E.A09(r2.A0D);
        }
        r2.A0H.A03 = null;
        C149367Me r03 = this.A1n;
        C626936e.A01();
        C15930sC r12 = r03.A01;
        if (r12 != null) {
            AnonymousClass0KH r04 = r03.A00;
            if (r04 == null) {
                r02 = C18330xA.A01(C18290x4.A0Z());
            } else {
                r02 = r04.A00;
            }
            r02.A0F(r12);
        }
        A0N();
        if (Build.VERSION.SDK_INT >= 22 && (r0 = this.A0P) != null) {
            r0.A04();
            this.A0P = null;
        }
        Voip.nativeUnregisterJNIUtils();
        Voip.nativeUnregisterEventCallback();
        Voip.nativeUnregisterSignalingXmppCallback();
        Voip.A02 = null;
        C56222rd r22 = this.A2D;
        r22.A06.A07(r22.A05);
        r22.A01.A07(r22.A00);
        r22.A0D.A07(r22.A0C);
        this.A30.A07(this.A2z);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.A13;
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.shutdown();
            this.A13 = null;
            C61262zy r13 = this.A0f;
            if (r13 != null) {
                synchronized (r13) {
                    r13.A0B.clear();
                    r13.A0C.clear();
                    r13.A0A.clear();
                    r13.A0D.clear();
                }
                this.A0f = null;
            }
        }
        HandlerThread handlerThread = this.A0K;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A0K = null;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voip/service/destroyed pendingCommands: ");
        List<C106645Zu> list = this.A3C;
        C18260x0.A1G(A0o2, list.size());
        for (C106645Zu A002 : list) {
            this.A29.A00(A002);
        }
        list.clear();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && this.A0Y != null) {
            C111665iU r23 = this.A2A;
            C626936e.A0D(AnonymousClass000.A1T(r23.A00()), "Self managed connections are not disconnected when VoiceService is being destroyed");
            r23.A05();
            r23.A09(this.A0Y);
            this.A0Y = null;
        }
        this.A1h.A07(this.A0O);
        this.A2x.A07(this.A0c);
        if (this.A1F && i >= 28) {
            for (StatusBarNotification id : this.A2t.A0Q()) {
                if (id.getId() == 23) {
                    this.A1b.A0A("VoiceService/onDestroy", true, "voip/orphannotification");
                }
            }
        }
    }

    public void A0H() {
        C106155Xv.A02(this);
        this.A0H.removeMessages(23);
        this.A0H.sendEmptyMessageDelayed(23, 45000);
        C86624Kv.A1S(this.A13, 9);
    }

    public final void A0M() {
        C626936e.A01();
        try {
            if (this.A0M != null) {
                Log.i("voip/service/releaseProximityWakeLock");
                this.A0M.release();
                this.A0M = null;
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            this.A0M = null;
        }
        if (this.A2o.A0Y(C58422vE.A01, 6747)) {
            C72173dI r1 = this.A0e;
            if (r1 == null) {
                r1 = C72173dI.A00(this.A35);
                this.A0e = r1;
            }
            r1.A02();
            r1.execute(C117695sL.A00(this, 32));
        } else {
            this.A0a.A00((C182068no) null);
        }
        this.A19 = false;
    }

    public final void A0N() {
        A0M();
        C626936e.A01();
        try {
            if (this.A0L != null) {
                Log.i("voip/service/releasePartialWakeLock");
                this.A0L.release();
                this.A0L = null;
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            this.A0L = null;
        }
    }

    public void A0P(int i, String str) {
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("end_call_reason", i);
        if (str != null) {
            A082.putString("end_call_string", str);
        }
        this.A29.A00(new C106645Zu("hangup_call", A082));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r7 == 10) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(int r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r0 = X.C627436k.A0O(r4)
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "voip/service/acceptCall No active call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0010:
            X.7Ps r0 = r4.callWaitingInfo
            java.lang.String r0 = r0.A04
            boolean r5 = r8.equals(r0)
            if (r5 == 0) goto L_0x0072
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r4)
        L_0x001e:
            boolean r3 = r0.isGroupCall
            if (r7 == 0) goto L_0x002c
            X.2TG r1 = r6.A07(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A04 = r0
        L_0x002c:
            if (r5 != 0) goto L_0x0046
            r0 = 1
            r6.A15 = r0
            X.5ZK r0 = r6.A27
            r0.A03()
            X.5pi r2 = r6.A1m
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x0041
            r0 = 0
            r2.A0C(r4, r0)
        L_0x0041:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            r6.A0i(r0, r8)
        L_0x0046:
            X.8MJ r4 = new X.8MJ
            r4.<init>(r6, r8, r5, r9)
            if (r3 != 0) goto L_0x0068
            X.7SF r3 = r6.A24
            r0 = 3
            if (r7 == r0) goto L_0x0057
            r0 = 10
            r2 = 0
            if (r7 != r0) goto L_0x0058
        L_0x0057:
            r2 = 1
        L_0x0058:
            r1 = 6
            r0 = 2
            if (r2 != 0) goto L_0x0065
            r0 = 1
            if (r7 == r0) goto L_0x0064
            r0 = 5
            if (r7 == r0) goto L_0x0064
            if (r7 != r1) goto L_0x0068
        L_0x0064:
            r0 = 3
        L_0x0065:
            r3.A00(r8, r0, r1)
        L_0x0068:
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r6.A13
            r1 = 100
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.schedule(r4, r1, r0)
            return
        L_0x0072:
            r0 = r4
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0Q(int, java.lang.String, boolean):void");
    }

    public void A0R(long j) {
        C18260x0.A12("VoiceService/delayShowingIncomingCall delay = ", AnonymousClass001.A0o(), j);
        this.A0H.removeMessages(1);
        this.A0H.sendEmptyMessageDelayed(1, j);
    }

    public void A0U(WamCall wamCall) {
        if (C107385bE.A0B()) {
            wamCall.canUseFullScreenIntent = Boolean.valueOf(((NotificationManager) this.A1W.getSystemService("notification")).canUseFullScreenIntent());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r5 != com.whatsapp.voipcalling.CallState.ACCEPT_SENT) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (r14.A32.A05(X.C86604Kt.A0a(r3)) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r14.A1a.A00 == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r14.A15 == false) goto L_0x00e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(com.whatsapp.voipcalling.CallInfo r15) {
        /*
            r14 = this;
            X.C626936e.A01()
            boolean r0 = X.C627436k.A0O(r15)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_START_ACTIVITY_FOR_INCOMING_CALL no active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r15 == 0) goto L_0x0018
            X.5U0 r2 = r14.A1y
            java.lang.String r1 = r15.callId
            r0 = 4
            r2.A03(r1, r0)
        L_0x0018:
            return
        L_0x0019:
            java.lang.String r0 = "voip/service/startActivityForIncomingCall Enter"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.7Ps r0 = r15.callWaitingInfo
            int r1 = r0.A01
            r2 = 0
            r0 = 1
            boolean r7 = X.AnonymousClass000.A1U(r1, r0)
            com.whatsapp.jid.UserJid r6 = r15.getInitialPeerJid()
            X.C626936e.A06(r6)
            com.whatsapp.voipcalling.CallState r5 = r15.callState
            boolean r3 = r15.isAudioChat()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r4 = 0
            if (r1 < r0) goto L_0x009a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r5 == r0) goto L_0x009a
            if (r3 == 0) goto L_0x0068
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r5 == r0) goto L_0x009a
        L_0x0046:
            r4 = 1
        L_0x0047:
            if (r7 != 0) goto L_0x0051
            X.C86624Kv.A1G(r14, r15)
            X.5pi r0 = r14.A1m
            r0.A06(r15)
        L_0x0051:
            r1 = 2
            if (r4 == 0) goto L_0x0055
            r1 = 1
        L_0x0055:
            if (r7 == 0) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            boolean r0 = r14.A1J
            if (r0 != 0) goto L_0x005e
            r2 = 1
        L_0x005e:
            r0 = 0
            r14.A0d(r15, r1, r2, r0)
            java.lang.String r0 = "voip/service/startActivityForIncomingCall Exit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0068:
            if (r7 != 0) goto L_0x0046
            r0 = 29
            if (r1 >= r0) goto L_0x0046
            X.3Ex r0 = r14.A2O
            X.3ZH r3 = r0.A07(r6)
            X.1R1 r0 = r14.A31
            boolean r0 = r0.A0h(r6)
            if (r0 != 0) goto L_0x0046
            if (r3 == 0) goto L_0x0093
            X.2k5 r0 = r3.A0F
            if (r0 != 0) goto L_0x0093
            boolean r0 = r14.A1G
            if (r0 != 0) goto L_0x0093
            X.2sD r1 = r14.A32
            X.4uZ r0 = X.C86604Kt.A0a(r3)
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0093
            goto L_0x0046
        L_0x0093:
            X.1iO r0 = r14.A1a
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x009a
            goto L_0x0046
        L_0x009a:
            boolean r0 = r15.isAudioChat()
            if (r0 != 0) goto L_0x0047
            X.4xc r1 = r14.A36
            java.lang.String r0 = "voip/notifyShowingIncomingCallUI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x00ab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r1.next()
            X.8uW r0 = (X.C185958uW) r0
            r0.Bbe()
            goto L_0x00ab
        L_0x00bb:
            r10 = 0
            android.content.Context r8 = r14.A1W
            X.1iO r0 = r14.A1a
            boolean r0 = r0.A00
            java.lang.Boolean r9 = X.C18320x8.A0V(r0)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r12 = r11
            r13 = r10
            android.content.Intent r3 = X.C627736r.A0o(r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x00f1
            X.7Ps r0 = r15.callWaitingInfo
            java.lang.String r1 = r0.A04
        L_0x00d4:
            java.lang.String r0 = "call_id"
            r3.putExtra(r0, r1)
            if (r7 != 0) goto L_0x00e0
            boolean r0 = r14.A15
            r1 = 1
            if (r0 != 0) goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            java.lang.String r0 = "callAccepted"
            r3.putExtra(r0, r1)
            java.lang.String r1 = "lobbyEntryPoint"
            r0 = 6
            r3.putExtra(r1, r0)
            r8.startActivity(r3)
            goto L_0x0047
        L_0x00f1:
            java.lang.String r1 = r15.callId
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0a(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r11.A1E == false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d(com.whatsapp.voipcalling.CallInfo r22, int r23, boolean r24, boolean r25) {
        /*
            r21 = this;
            X.C626936e.A01()
            r14 = r22
            if (r22 == 0) goto L_0x013f
            boolean r0 = r14.callEnding
            if (r0 != 0) goto L_0x013f
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x013f
            X.7Ps r0 = r14.callWaitingInfo
            int r0 = r0.A01
            r4 = 0
            r12 = 1
            r11 = r21
            r3 = 1
            if (r0 == r12) goto L_0x002b
            r3 = 0
            X.5jr r0 = r11.A29
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0039
            boolean r0 = r11.A1E
            if (r0 != 0) goto L_0x0039
        L_0x002b:
            r4 = 1
            X.5U0 r2 = r11.A1y
            if (r3 == 0) goto L_0x0138
            X.7Ps r0 = r14.callWaitingInfo
            java.lang.String r1 = r0.A04
        L_0x0034:
            java.lang.String r0 = "build_voip_notification"
            r2.A02(r1, r0)
        L_0x0039:
            boolean r1 = r11.A1L
            r0 = -1
            X.2w6 r10 = X.C58962w6.A00(r14, r0, r1)
            X.2rz r15 = r11.A1x
            android.content.Context r9 = r11.A1W
            r8 = 0
            X.5jr r7 = r11.A29
            boolean r0 = r11.A1F
            r19 = r23
            r18 = r7
            r20 = r0
            r17 = r10
            r16 = r9
            android.app.Notification r6 = r15.A00(r16, r17, r18, r19, r20)
            if (r4 == 0) goto L_0x0067
            X.5U0 r2 = r11.A1y
            java.lang.String r1 = r10.A05
            java.lang.String r0 = "start_foreground_service"
            r2.A02(r1, r0)
            if (r3 == 0) goto L_0x0067
            r2.A00(r1)
        L_0x0067:
            boolean r0 = r11.A1F
            r5 = 23
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "VoiceService/startForegroundService Background restrictions on"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33T r0 = r11.A2Z
            r0.A04(r5, r6)
            com.whatsapp.jid.GroupJid r1 = r14.groupJid
            if (r1 != 0) goto L_0x0081
            com.whatsapp.jid.UserJid r1 = r14.getCreatorJid()
            if (r1 == 0) goto L_0x0086
        L_0x0081:
            X.5mB r0 = r11.A2S
            r0.A06(r1, r8)
        L_0x0086:
            r11.A1E = r12
        L_0x0088:
            return
        L_0x0089:
            boolean r4 = r14.videoEnabled
            monitor-enter(r11)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "voip/service/notification posting summary notification:"
            r1.append(r0)     // Catch:{ all -> 0x013c }
            r1.append(r6)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = ", stopFirst: "
            r13 = r24
            X.C18260x0.A1D(r0, r1, r13)     // Catch:{ all -> 0x013c }
            X.5ZR r0 = r11.A2a     // Catch:{ all -> 0x013c }
            boolean r1 = X.C107305b5.A08(r0, r4)     // Catch:{ all -> 0x013c }
            boolean r0 = r0.A0D()     // Catch:{ all -> 0x013c }
            r16 = 1
            if (r0 == 0) goto L_0x00af
            r16 = 0
        L_0x00af:
            boolean r0 = X.C107385bE.A0B()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x00e1
            X.1iO r0 = r11.A1a     // Catch:{ all -> 0x013c }
            boolean r2 = r0.A00     // Catch:{ all -> 0x013c }
            if (r2 == 0) goto L_0x00bf
            if (r1 != 0) goto L_0x00bf
            if (r16 == 0) goto L_0x00e1
        L_0x00bf:
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "voiceService/startForegroundService/  Not starting foreground service because missing mic/camera permission. isAppInForeground:%b, needMicPermission:%b, needCameraPermission: %b."
            java.lang.Object[] r2 = X.AnonymousClass0x9.A1X()     // Catch:{ all -> 0x013c }
            boolean r0 = r0.A00     // Catch:{ all -> 0x013c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x013c }
            r2[r8] = r0     // Catch:{ all -> 0x013c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x013c }
            r2[r12] = r0     // Catch:{ all -> 0x013c }
            X.AnonymousClass001.A1S(r2, r1)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = java.lang.String.format(r4, r3, r2)     // Catch:{ all -> 0x013c }
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x013c }
            monitor-exit(r11)
            goto L_0x011a
        L_0x00e1:
            X.2oU r0 = r7.A01     // Catch:{ all -> 0x013c }
            android.content.Context r3 = r0.A00     // Catch:{ all -> 0x013c }
            X.2p1 r2 = r7.A02     // Catch:{ all -> 0x013c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "voicefgservice/start-service notifcation:"
            X.C18260x0.A1R(r1, r0, r6)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "com.whatsapp.service.VoiceFgService.START"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID"
            android.content.Intent r1 = r1.putExtra(r0, r5)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE"
            android.content.Intent r1 = r1.putExtra(r0, r13)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "com.whatsapp.service.VoiceFgService.EXTRA_IS_VIDEO_ENABLED"
            android.content.Intent r1 = r1.putExtra(r0, r4)     // Catch:{ all -> 0x013c }
            if (r25 == 0) goto L_0x010f
            java.lang.String r0 = "com.whatsapp.service.VoiceFgService.EXTRA_IS_MEDIA_PROJECTION"
            r1.putExtra(r0, r12)     // Catch:{ all -> 0x013c }
        L_0x010f:
            com.whatsapp.calling.service.VoiceFGService.A03 = r6     // Catch:{ all -> 0x013c }
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r0 = com.whatsapp.calling.service.VoiceFGService.class
            boolean r0 = r2.A03(r3, r1, r0)     // Catch:{ all -> 0x013c }
            monitor-exit(r11)
            if (r0 != 0) goto L_0x0088
        L_0x011a:
            r16 = r9
            r20 = r12
            android.app.Notification r1 = r15.A00(r16, r17, r18, r19, r20)
            X.33T r0 = r11.A2Z
            r0.A04(r5, r1)
            com.whatsapp.jid.GroupJid r1 = r14.groupJid
            if (r1 != 0) goto L_0x0131
            com.whatsapp.jid.UserJid r1 = r14.getCreatorJid()
            if (r1 == 0) goto L_0x0086
        L_0x0131:
            X.5mB r0 = r11.A2S
            r0.A06(r1, r8)
            goto L_0x0086
        L_0x0138:
            java.lang.String r1 = r14.callId
            goto L_0x0034
        L_0x013c:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x013f:
            java.lang.String r0 = "do not create notification, we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0d(com.whatsapp.voipcalling.CallInfo, int, boolean, boolean):void");
    }

    public void A0f(CallInfo callInfo, boolean z, boolean z2) {
        String A0R2;
        CallState callState;
        StringBuilder A0o2 = C86654Ky.A0o();
        A0o2.append("voip/phone-call-in-progress-changed: ");
        A0o2.append(z);
        if (callInfo == null) {
            A0R2 = null;
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append(", call state: ");
            A0R2 = AnonymousClass000.A0R(callInfo.callState, A0o3);
        }
        C18260x0.A1L(A0o2, A0R2);
        if (callInfo != null && (callState = callInfo.callState) != CallState.NONE) {
            if (!z) {
                if (!z2) {
                    Message obtainMessage = this.A0H.obtainMessage(38);
                    this.A0H.removeMessages(38);
                    this.A0H.sendMessageDelayed(obtainMessage, 2000);
                } else {
                    boolean z3 = callInfo.videoEnabled;
                    C116085pi r1 = this.A1m;
                    Boolean bool = Boolean.TRUE;
                    if (z3) {
                        r1.A08(callInfo, bool);
                    } else {
                        r1.A09(callInfo, bool);
                    }
                }
                this.A1m.A0D(false);
            } else if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING) {
                A0P(4, (String) null);
                return;
            } else {
                C116085pi r12 = this.A1m;
                r12.A07(callInfo);
                C116085pi.A01(r12, 45);
                this.A1B = true;
            }
            C117665sI r2 = new C117665sI(this, callInfo, 12, z);
            if (this.A2o.A0X(2903)) {
                this.A13.execute(r2);
            } else {
                r2.run();
            }
        }
    }

    public final void A0h(CallState callState, CallInfo callInfo) {
        int A002;
        PowerManager.WakeLock A003;
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/service/stop ", this);
        C626936e.A01();
        synchronized (this) {
            C112515jr r1 = this.A29;
            if (r1.A03.get()) {
                Context context = r1.A01.A00;
                C54622p1 r12 = r1.A02;
                Log.i("voicefgservice/stop-service");
                r12.A01(context, VoiceFGService.class);
            }
            if (this.A1E) {
                Log.i("VoiceService/stopForegroundService cancel via waNotificationManager");
                this.A2Z.A05(23, "VoiceService4");
                this.A1E = false;
            }
        }
        if (callInfo != null) {
            this.A2Z.A06(51, callInfo.callId, "lonelyStateNotification");
        }
        if (this.A1Q) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A1Q = false;
            C379024m.A00 = false;
            this.A0B = 0;
            this.A0s = null;
            this.A15 = false;
            this.A19 = false;
            this.A1L = false;
            this.A3N = null;
            this.A3O = null;
            this.A0b = null;
            this.A1V = null;
            this.A0h = null;
            this.A0j = 1500;
            AnonymousClass5ZK r8 = this.A27;
            r8.A02 = null;
            this.A0i = null;
            this.A0p = null;
            this.A17 = false;
            this.A0W = null;
            this.A0S = null;
            this.A0V = null;
            this.A0U = null;
            this.A0T = null;
            this.A11 = null;
            this.A10 = null;
            this.A1T = true;
            this.A0n = null;
            this.A0k = null;
            this.A16 = false;
            this.A08 = 0;
            this.A1D = false;
            this.A14 = 0;
            this.A07 = 0;
            this.A3M = 0;
            this.A26.clearPendingCallOfferStanza();
            this.A3G.clear();
            this.A3H.clear();
            this.A2D.A04.A03.clear();
            this.A3F.clear();
            this.A1M = false;
            this.A18 = false;
            this.A05 = 30;
            this.A02 = 0;
            this.A3P = false;
            AnonymousClass7TZ r7 = this.A2B;
            r7.A02 = 0;
            r7.A01 = Double.NaN;
            r7.A00 = Double.NaN;
            this.A0C = 0;
            this.A0A = -1;
            this.A03 = 0;
            this.A0r = null;
            this.A0t = null;
            this.A1O = false;
            this.A0q = null;
            this.A1C = false;
            this.A0l = null;
            this.A09 = 0;
            this.A1B = false;
            this.A1G = false;
            this.A2F.clear();
            this.A1I = false;
            this.A12.clear();
            this.A3Q = false;
            C46622bw r13 = this.A2G;
            Log.d("VoiceChatAcceptPingManager/reset");
            r13.A04.clear();
            r13.A05.clear();
            this.A0y = null;
            this.A0z = null;
            ((C112455jl) this.A1s).A01 = null;
            TelephonyManager telephonyManager = this.A1X;
            if (telephonyManager == null) {
                Log.w("voip/service/stop telephonyManager=null");
            } else if (!this.A2a.A0G()) {
                telephonyManager.listen(this.A0N, 0);
            }
            Context context2 = this.A1W;
            context2.unregisterReceiver(this.A0D);
            C116085pi r72 = this.A1m;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("voip/audio_route/onCallStop using telecom:");
            C18260x0.A1V(A0o2, r72.A05);
            if (!r72.A05) {
                r72.A0A.A02();
                r72.A0H.A05(r72);
                r72.A08.unregisterReceiver(r72.A0B);
            }
            r72.A03 = false;
            context2.unregisterReceiver(this.A0E);
            A0K();
            A0N();
            try {
                PowerManager A0J2 = this.A2W.A0J();
                if (A0J2 == null) {
                    Log.w("voice/service/turn-on-screen pm=null");
                } else if (!A0J2.isScreenOn() && (A003 = AnonymousClass75K.A00(A0J2, "VoiceService end call", 268435466)) != null) {
                    A003.acquire(1);
                    A003.release();
                }
            } catch (Exception e) {
                Log.e((Throwable) e);
            }
            r8.A03();
            if (this.A0F == null || !((callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY) && callInfo != null && callInfo.callWaitingInfo.A01 == 0)) {
                r72.A05();
            } else {
                if (this.A1N) {
                    A002 = this.A1l.A03().getInt("end_call_tone_duration_ms", 500);
                } else {
                    A002 = C627436k.A00(context2);
                    if (A002 <= 0) {
                        A002 = 500;
                    }
                }
                C18260x0.A0y("voip/service/playEndCallTone duration: ", AnonymousClass001.A0o(), A002);
                float f = 0.5f;
                if (r72.A00 == 2) {
                    f = 1.0f;
                }
                A0j(this.A0o, "endCall", f, f);
                this.A0J.removeMessages(1);
                this.A0J.sendEmptyMessageDelayed(1, (long) (A002 + 100));
            }
            this.A0I.removeCallbacksAndMessages((Object) null);
            C64723Er r82 = this.A2p;
            long A042 = C56952sp.A04(this.A2o, 5938);
            if (A042 > 0) {
                r82.A0C.Bkn(new C70083Zv(r82, SystemClock.uptimeMillis(), 13), "FieldStatsSharedFields/clearCallingAbBucket", A042);
            } else {
                r82.A00(-1);
            }
            A0B();
            long A0E2 = AnonymousClass0x7.A0E(elapsedRealtime);
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("voip/service/stop elapsed ");
            A0o3.append(A0E2);
            C18260x0.A1L(A0o3, " ms");
            int i = 4;
            A05("voip/service/stop");
            boolean z = this.A1K;
            AnonymousClass5PA r0 = this.A1j;
            if (!z) {
                i = 3;
            }
            r0.A00(i, false);
            this.A1v.A04.clear();
        }
    }

    public void A0l(String str) {
        C626936e.A0D(AnonymousClass000.A1W(A08(str)), "must be called for self managed connection");
        C86914Mi A082 = A08(str);
        if (Build.VERSION.SDK_INT >= 28 && A082 != null && A082.getState() == 5) {
            A082.onUnhold();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r8 == 11) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r4 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1.A04.equals(r6) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0m(java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r3 = 0
            if (r4 == 0) goto L_0x0016
            X.7Ps r1 = r4.callWaitingInfo
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r6)
            r2 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            java.lang.String r0 = "voip/call/reject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r8 == 0) goto L_0x0028
            X.2TG r1 = r5.A07(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A04 = r0
        L_0x0028:
            if (r2 == 0) goto L_0x0054
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r4)
        L_0x002e:
            boolean r3 = r4.isGroupCall
        L_0x0030:
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.A13
            X.8MH r0 = new X.8MH
            r0.<init>(r6, r2, r7)
            r1.execute(r0)
            if (r3 != 0) goto L_0x0053
            X.7SF r3 = r5.A24
            r0 = 4
            if (r8 == r0) goto L_0x0046
            r0 = 11
            r2 = 0
            if (r8 != r0) goto L_0x0047
        L_0x0046:
            r2 = 1
        L_0x0047:
            r1 = 7
            r0 = 2
            if (r2 != 0) goto L_0x0050
            if (r8 == r0) goto L_0x004f
            if (r8 != r1) goto L_0x0053
        L_0x004f:
            r0 = 3
        L_0x0050:
            r3.A00(r6, r0, r1)
        L_0x0053:
            return
        L_0x0054:
            if (r4 == 0) goto L_0x0030
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0m(java.lang.String, java.lang.String, int):void");
    }

    public void A0n(Collection collection) {
        if (collection.size() > 0 && this.A2o.A0X(5249)) {
            Set A002 = this.A2D.A04.A00(collection, true);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("voip/maybePrefetchForGroupCall prefetch e2ee sessions for group call, ");
            A0o2.append(A002.size());
            C18260x0.A1M(A0o2, " session missing");
        }
    }

    public void A0o(List list) {
        DeviceJid deviceJid;
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m2 = AnonymousClass001.A0m(it);
            AnonymousClass3ZF A042 = this.A21.A04(A0m2);
            if (!(A042 == null || (deviceJid = A042.A0C) == null)) {
                A0s2.add(A0m2);
                A0s3.add(deviceJid);
            }
        }
        if (A0s2.isEmpty()) {
            Log.d("VoiceService/actionCheckOngoingCalls: no ongoing calls");
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VoiceService/actionCheckOngoingCalls: ongoing calls count=");
        C18260x0.A1G(A0o2, A0s2.size());
        Voip.checkOngoingCalls(C18300x5.A1b(A0s2), (DeviceJid[]) A0s3.toArray(new DeviceJid[0]));
    }

    public boolean A0r(AudioManager audioManager) {
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        C116085pi r2 = this.A1m;
        if (AnonymousClass001.A1T(r2.A00) == isSpeakerphoneOn) {
            return false;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VoiceService:callEnding audio route mismatch detectecd. current = ");
        A0o2.append(audioManager.isSpeakerphoneOn());
        A0o2.append(", Expected = ");
        A0o2.append(AnonymousClass001.A1T(r2.A00));
        AnonymousClass0x2.A19(A0o2);
        return true;
    }

    public boolean A0s(GroupJid groupJid, String str, List list, boolean z, boolean z2) {
        String A0y2;
        String A022;
        if (list.isEmpty()) {
            Log.e("voip/service/addIncomingCallToTelecom peerJids is empty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            C111665iU r2 = this.A2A;
            if (r2.A0E()) {
                Context context = this.A1W;
                C64773Ex r6 = this.A2O;
                AnonymousClass5ZU r4 = this.A2Q;
                AnonymousClass3ZH A012 = AnonymousClass36T.A01(r6, this.A2q, groupJid, this.A32, z2);
                if (A012 == null || (A022 = C18300x5.A0h(r4, A012)) == null) {
                    C150477Qw A042 = C107305b5.A04(r6, r4, list, 2, AnonymousClass000.A1U(list.size(), 1));
                    if (A042 == null) {
                        A0y2 = null;
                    } else {
                        A0y2 = C86634Kw.A0y(context, A042);
                    }
                    A022 = C106815aD.A02(A0y2);
                    if (A022 == null) {
                        Log.w("voip/service/addIncomingCallToTelecom displayName is null");
                        return false;
                    }
                }
                return r2.A0F((UserJid) list.get(0), str, A022, z);
            }
        }
        return false;
    }

    public boolean A0u(String str) {
        return AnonymousClass000.A1W(A08(str));
    }

    public C107285b3(C116985rC r52, C116985rC r53, C29171iO r54, C55682qk r55, AnonymousClass5F3 r56, AnonymousClass5F4 r57, C64393Dh r58, C69263Wi r59, C56972sr r60, C56492s4 r61, C29411im r62, C28911hy r63, AnonymousClass54I r64, AnonymousClass5PA r65, C29401il r66, AnonymousClass49P r67, C106155Xv r68, AnonymousClass5NO r69, AnonymousClass5ZG r70, C97174xk r71, C52212l7 r72, C97064xZ r73, C1230066r r74, AnonymousClass5AL r75, AnonymousClass2ZQ r76, C46322bR r77, C149827Ob r78, C56442rz r79, AnonymousClass5U0 r80, AnonymousClass5TU r81, ScreenShareResourceManager screenShareResourceManager, C49402gT r83, AnonymousClass7SF r84, C112515jr r85, C111665iU r86, AnonymousClass5Z0 r87, C47852dw r88, C118405tU r89, C46622bw r90, AnonymousClass364 r91, C113745lv r92, C45822ad r93, AnonymousClass5IP r94, AnonymousClass5TW r95, C46362bV r96, C29441ip r97, C64773Ex r98, C56642sK r99, AnonymousClass5ZU r100, C64213Cp r101, C113905mB r102, C44382Vv r103, C50862it r104, C55262q4 r105, C620633i r106, C56612sH r107, C54292oU r108, C57162tC r109, AnonymousClass33T r110, AnonymousClass5ZR r111, AnonymousClass33p r112, C620733j r113, C621133n r114, C48972fm r115, AnonymousClass3XF r116, C40402Fr r117, C56762sW r118, C66543Lv r119, C56322rn r120, C55422qK r121, C56662sM r122, AnonymousClass318 r123, C52412lR r124, AnonymousClass1VX r125, C64723Er r126, C66493Lq r127, C46992cX r128, AnonymousClass33S r129, C55892r5 r130, C66553Lw r131, AnonymousClass3S3 r132, C54812pK r133, C42642Oy r134, C28861ht r135, C29281iZ r136, C29321id r137, AnonymousClass1R1 r138, C56572sD r139, AnonymousClass4LZ r140, C50272hu r141, C187958y5 r142, AnonymousClass4FS r143, C97094xc r144, JNIUtils jNIUtils, VoipCameraManager voipCameraManager, C183538qC r147, C183538qC r148, C183538qC r149) {
        Context context = r108.A00;
        this.A1W = context;
        this.A29 = r85;
        C56612sH r39 = r107;
        this.A2X = r39;
        AnonymousClass1VX r38 = r125;
        this.A2o = r38;
        C69263Wi r50 = r59;
        this.A1d = r50;
        this.A37 = jNIUtils;
        this.A2U = r104;
        this.A1b = r55;
        C56972sr r49 = r60;
        this.A1e = r49;
        AnonymousClass4FS r32 = r143;
        this.A35 = r32;
        this.A1c = r58;
        this.A1f = r61;
        this.A1k = r67;
        this.A1s = r74;
        this.A2r = r129;
        C56572sD r34 = r139;
        this.A32 = r34;
        this.A1Y = r52;
        this.A2x = r135;
        this.A36 = r144;
        this.A1h = r63;
        this.A2L = r95;
        this.A1y = r80;
        this.A1j = r65;
        C97174xk r1 = r71;
        this.A0Q = r1;
        this.A2p = r126;
        r1.A03 = this;
        this.A2O = r98;
        this.A2e = r115;
        C187958y5 r33 = r142;
        this.A34 = r33;
        C620633i r40 = r106;
        this.A2W = r40;
        this.A2Q = r100;
        this.A2c = r113;
        C49402gT r47 = r83;
        this.A22 = r47;
        this.A2w = r134;
        AnonymousClass3S3 r36 = r132;
        this.A2u = r36;
        this.A1p = r70;
        C66493Lq r37 = r127;
        this.A2q = r37;
        C29411im r48 = r62;
        this.A1g = r48;
        this.A2I = r92;
        this.A2h = r118;
        C113905mB r42 = r102;
        this.A2S = r42;
        AnonymousClass1R1 r35 = r138;
        this.A31 = r35;
        this.A2R = r101;
        this.A2t = r131;
        this.A2d = r114;
        this.A1i = r64;
        this.A2m = r123;
        this.A38 = voipCameraManager;
        this.A2f = r116;
        this.A1w = r78;
        this.A2s = r130;
        C56642sK r43 = r99;
        this.A2P = r43;
        this.A2k = r121;
        this.A2a = r111;
        this.A2b = r112;
        this.A1o = r69;
        this.A1u = r76;
        this.A2j = r120;
        this.A2H = r91;
        AnonymousClass5Z0 r45 = r87;
        this.A2C = r45;
        this.A2y = r136;
        this.A1l = r68;
        this.A2Z = r110;
        this.A2g = r117;
        this.A24 = r84;
        this.A1x = r79;
        this.A1Z = r53;
        this.A2v = r133;
        this.A2i = r119;
        this.A30 = r137;
        this.A3B = r147;
        this.A2J = r93;
        this.A1z = r81;
        this.A20 = screenShareResourceManager;
        this.A1a = r54;
        C29441ip r44 = r97;
        this.A2N = r44;
        this.A2M = r96;
        this.A1t = r75;
        this.A2F = r89;
        C111665iU r46 = r86;
        this.A2A = r46;
        this.A33 = r141;
        this.A28 = new VoiceServiceEventCallback(this, r128);
        C55262q4 r41 = r105;
        this.A2V = r41;
        this.A2B = new AnonymousClass7TZ(r66);
        this.A1X = r40.A0N();
        C44262Vh r15 = new C44262Vh(this);
        C64333Db r0 = r57.A00.A01;
        AnonymousClass1VX A4B = C64333Db.A4B(r0);
        AnonymousClass4FV A4H = C64333Db.A4H(r0);
        C56222rd r16 = new C56222rd((C28821hp) r0.AHK.get(), (C29021i9) r0.ANA.get(), r15, (C49412gU) r0.A00.A52.get(), (C29231iU) r0.A1l.get(), (C621133n) r0.AW5.get(), (C48972fm) r0.AW6.get(), (C614730x) r0.AW8.get(), (C22931Qq) r0.A7Y.get(), (C40342Fl) r0.A7Z.get(), (C28771hk) r0.AZN.get(), (AnonymousClass33Z) r0.A85.get(), A4B, A4H, (AnonymousClass2UP) r0.AOb.get());
        this.A2D = r16;
        this.A25 = new C54382od(this, r39);
        C46622bw r9 = r90;
        this.A26 = new OutgoingSignalingHandler(r39, r38, r49, r32, this, r47, r16, r41, r9);
        this.A1m = new C116085pi(context, r50, this, r46, r40, r38, r140, r33, r32);
        this.A2n = r124;
        this.A2Y = r109;
        this.A1q = r72;
        this.A2l = r122;
        this.A1r = r73;
        this.A3A = r148;
        this.A1n = new C149367Me(context);
        this.A2K = r94;
        boolean A0I2 = C627436k.A0I(r38);
        this.A3L = A0I2;
        this.A2T = r103;
        this.A1v = r77;
        this.A2E = r88;
        this.A27 = new AnonymousClass5ZK(context, this, r40, r39, r38, r35, r33, r32);
        C64333Db r12 = r56.A00.A01;
        AnonymousClass1VX A4B2 = C64333Db.A4B(r12);
        C55682qk A012 = C64333Db.A01(r12);
        C56972sr A062 = C64333Db.A06(r12);
        AnonymousClass4FS A8y = C64333Db.A8y(r12);
        C187958y5 A0o2 = C86614Ku.A0o(r12);
        C107695bk r02 = r12.A00;
        C64333Db r2 = r02.ACP;
        AnonymousClass4FS A0g2 = C86604Kt.A0g(r2);
        C614830y r10 = new C614830y(A012, A062, (C106155Xv) r12.Aa5.get(), this, new C45812ac(C86614Ku.A0L(r2), (AnonymousClass5IP) r02.A6l.get(), (AnonymousClass3FH) r02.ABa.get(), A0g2), (C46332bS) r02.ABn.get(), (AnonymousClass33T) r12.Aaf.get(), (C56762sW) r12.A4R.get(), (C56322rn) r12.AIT.get(), (C620533h) r12.APC.get(), (C55422qK) r12.AUG.get(), A4B2, A0o2, A8y, A0I2);
        this.A21 = r10;
        this.A23 = new AnonymousClass5P3(r48, r10, this, r45, r44, r43, r42, r38, r37, r36, r34);
        this.A39 = r149;
        this.A2G = r9;
        this.A0R = new C52242lA();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1040:0x13bc, code lost:
        r5.A0a(com.whatsapp.voipcalling.Voip.getCallInfo());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1041:0x13c3, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1043:0x13c8, code lost:
        r5.A0Q.A0E(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1044:0x13cd, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028d, code lost:
        if (r17 < X.C18290x4.A0A(r0)) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        if (r10 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x052c, code lost:
        if (r6 == r10) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x067b, code lost:
        if (r6 == r11) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06a6, code lost:
        if (r7.callResult == 5) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0933, code lost:
        if (r7 == 9) goto L_0x0935;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0983, code lost:
        if (r7 != 8) goto L_0x0985;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0985, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0994, code lost:
        if (X.C627436k.A0O(r3) != false) goto L_0x0996;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0996, code lost:
        r5.A0b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0999, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0b6d, code lost:
        r1 = com.whatsapp.voipcalling.Voip.getCallInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0b71, code lost:
        if (r1 == null) goto L_0x13c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0cb8, code lost:
        r5.A13.execute(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0cbd, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b2, code lost:
        if (r5.A32.A05(X.C86604Kt.A0a(r13)) == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:772:0x0e9f, code lost:
        if (r0 != 3) goto L_0x13c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:839:0x1020, code lost:
        r5.A0Q.A0E((com.whatsapp.voipcalling.CallInfo) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:840:0x1025, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:857:0x107b, code lost:
        r1.execute(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:858:0x107e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:914:0x1172, code lost:
        X.C626936e.A0D(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:915:0x1175, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06b3  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0764  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0788  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x093c  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x095e  */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x0987  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:666:0x0c7c  */
    /* JADX WARNING: Removed duplicated region for block: B:669:0x0c82  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean A06(android.os.Message r29, X.C107285b3 r30) {
        /*
            r7 = r29
            int r8 = r7.what
            r0 = 0
            r6 = 2
            r4 = 0
            r3 = 0
            r2 = 1
            r5 = r30
            switch(r8) {
                case 1: goto L_0x0010;
                case 2: goto L_0x000f;
                case 3: goto L_0x0022;
                case 4: goto L_0x002b;
                case 5: goto L_0x07aa;
                case 6: goto L_0x07b7;
                case 7: goto L_0x07c5;
                case 8: goto L_0x07df;
                case 9: goto L_0x000f;
                case 10: goto L_0x07eb;
                case 11: goto L_0x080d;
                case 12: goto L_0x080d;
                case 13: goto L_0x000f;
                case 14: goto L_0x098c;
                case 15: goto L_0x1003;
                case 16: goto L_0x000f;
                case 17: goto L_0x099a;
                case 18: goto L_0x09a3;
                case 19: goto L_0x09ba;
                case 20: goto L_0x000f;
                case 21: goto L_0x000f;
                case 22: goto L_0x000f;
                case 23: goto L_0x09df;
                case 24: goto L_0x09fb;
                case 25: goto L_0x0a19;
                case 26: goto L_0x0a57;
                case 27: goto L_0x0a63;
                case 28: goto L_0x0a7e;
                case 29: goto L_0x13a4;
                case 30: goto L_0x0a9b;
                case 31: goto L_0x0adf;
                case 32: goto L_0x0b1a;
                case 33: goto L_0x0b50;
                case 34: goto L_0x0b75;
                case 35: goto L_0x0c8c;
                case 36: goto L_0x000f;
                case 37: goto L_0x0cad;
                case 38: goto L_0x0cbe;
                case 39: goto L_0x0ce4;
                case 40: goto L_0x0b6d;
                case 41: goto L_0x0d9e;
                case 42: goto L_0x0e04;
                case 43: goto L_0x0ea2;
                case 44: goto L_0x0f02;
                case 45: goto L_0x0f11;
                case 46: goto L_0x0f1d;
                case 47: goto L_0x0f8f;
                case 48: goto L_0x1026;
                case 49: goto L_0x104d;
                case 50: goto L_0x1063;
                case 51: goto L_0x107f;
                case 52: goto L_0x10e2;
                case 53: goto L_0x1207;
                case 54: goto L_0x1330;
                case 55: goto L_0x13c4;
                case 56: goto L_0x13c4;
                case 57: goto L_0x13ce;
                default: goto L_0x000f;
            }
        L_0x000f:
            return r3
        L_0x0010:
            long r3 = r5.A0B
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x13bc
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = X.C18310x6.A0f(r0, r3)
            r5.A0s = r0
            goto L_0x13bc
        L_0x0022:
            X.7TZ r0 = r5.A2B
            double r0 = r0.A00()
            r5.A01 = r0
            return r2
        L_0x002b:
            X.33T r0 = r5.A2Z
            r30 = r0
            r6 = 7
            java.lang.String r1 = "VoiceService1"
            r0.A05(r6, r1)
            com.whatsapp.voipcalling.CallState[] r1 = com.whatsapp.voipcalling.CallState.values()
            int r0 = r7.arg1
            r8 = r1[r0]
            java.lang.Object r7 = r7.obj
            com.whatsapp.voipcalling.CallInfo r7 = (com.whatsapp.voipcalling.CallInfo) r7
            X.C626936e.A01()
            if (r7 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.CallState r0 = r7.callState
            if (r8 == r0) goto L_0x13c3
            java.lang.String r0 = r7.callId
            X.4Mi r0 = r5.A08(r0)
            boolean r16 = X.AnonymousClass000.A1W(r0)
            com.whatsapp.voipcalling.CallState r6 = r7.callState
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/callStateChangedOnUIThread from "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = " to "
            r9.append(r0)
            r9.append(r6)
            java.lang.String r1 = " in UI Main thread. selfManagedConnection = "
            r0 = r16
            X.C18260x0.A1E(r1, r9, r0)
            com.whatsapp.jid.GroupJid r13 = r7.groupJid
            if (r13 == 0) goto L_0x008e
            r10 = r13
        L_0x0076:
            X.4xc r0 = r5.A36
            java.lang.String r9 = r7.callId
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x007e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r1.next()
            X.8uW r0 = (X.C185958uW) r0
            r0.BOC(r10, r6, r9)
            goto L_0x007e
        L_0x008e:
            com.whatsapp.jid.UserJid r10 = r7.getInitialPeerJid()
            if (r10 == 0) goto L_0x0095
            goto L_0x0076
        L_0x0095:
            com.whatsapp.voipcalling.CallState r10 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            java.lang.String r12 = "refresh_notification"
            r9 = 4
            if (r6 != r10) goto L_0x0562
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r8 == r0) goto L_0x0562
            boolean r0 = r5.A1U
            if (r0 != 0) goto L_0x0552
            boolean r0 = r5.A0q()
            if (r0 == 0) goto L_0x05da
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A0B = r0
            java.util.List r20 = r7.getPeerJids()
            boolean r14 = r7.videoEnabled
            java.lang.String r13 = r7.callId
            com.whatsapp.jid.GroupJid r11 = r7.groupJid
            boolean r22 = r7.isAudioChat()
            r0 = 0
            r17 = r5
            r18 = r11
            r19 = r13
            r21 = r14
            boolean r11 = r17.A0s(r18, r19, r20, r21, r22)
            if (r11 == 0) goto L_0x0534
            r0 = 2000(0x7d0, double:9.88E-321)
        L_0x00d0:
            r5.A0R(r0)
        L_0x00d3:
            X.1VX r11 = r5.A2o
            r0 = 4809(0x12c9, float:6.739E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x051f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r8 != r0) goto L_0x051f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r6 != r0) goto L_0x052c
            X.5jr r0 = r5.A29
            X.C106645Zu.A00(r0, r12)
        L_0x00ea:
            boolean r0 = r7.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x00f5
            X.5ZK r0 = r5.A27
            r0.A03()
        L_0x00f5:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r6 != r0) goto L_0x0514
            X.5pi r0 = r5.A1m
            r0.A06(r7)
        L_0x00fe:
            X.8uP r1 = r5.A0X
            if (r1 == 0) goto L_0x0511
            r0 = r1
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r12 = r0.A2D
            r1.callStateChanged(r8, r7)
        L_0x010a:
            X.4xk r1 = r5.A0Q
            r1.A0E(r7)
            X.30y r0 = r5.A21
            r29 = r0
            java.lang.String r9 = r7.callId
            X.3ZF r9 = r0.A04(r9)
            if (r9 != 0) goto L_0x0162
            com.whatsapp.jid.UserJid r0 = r7.getInitialPeerJid()
            java.lang.StringBuilder r9 = X.C18290x4.A0u(r0)
            java.lang.String r0 = "VoiceService:callStateChangedOnUiThread getCallLog with key[jid="
            r9.append(r0)
            com.whatsapp.jid.UserJid r0 = r7.getInitialPeerJid()
            r9.append(r0)
            java.lang.String r0 = "; fromMe="
            r9.append(r0)
            boolean r0 = r7.isCaller
            r9.append(r0)
            java.lang.String r0 = "; callId="
            r9.append(r0)
            java.lang.String r0 = r7.callId
            r9.append(r0)
            java.lang.String r0 = "; transactionId="
            r9.append(r0)
            int r0 = r7.initialGroupTransactionId
            r9.append(r0)
            java.lang.String r0 = "]"
            X.C18260x0.A1L(r9, r0)
            com.whatsapp.jid.UserJid r15 = r7.getInitialPeerJid()
            boolean r14 = r7.isCaller
            java.lang.String r13 = r7.callId
            int r9 = r7.initialGroupTransactionId
            r0 = r29
            X.3ZF r9 = r0.A03(r15, r13, r9, r14)
        L_0x0162:
            com.whatsapp.voipcalling.CallState r19 = com.whatsapp.voipcalling.CallState.NONE
            java.lang.String r23 = "can not find message for call id "
            r0 = r19
            if (r6 != r0) goto L_0x06b3
            if (r9 == 0) goto L_0x050d
            int r0 = r9.A01
            r25 = r0
        L_0x0170:
            r5.A1H = r3
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0b
            if (r0 == 0) goto L_0x04eb
            com.whatsapp.jid.UserJid r24 = r7.getInitialPeerJid()
            X.C626936e.A06(r24)
            r10 = -1
            boolean r0 = r7.isCaller
            if (r0 != 0) goto L_0x04e6
            boolean r0 = r7.isEndedByMe
            if (r0 != 0) goto L_0x018a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r8 != r0) goto L_0x04e6
        L_0x018a:
            if (r12 == 0) goto L_0x04e6
            if (r9 == 0) goto L_0x04e6
            X.7Ps r0 = r7.callWaitingInfo
            int r0 = r0.A01
            if (r0 != 0) goto L_0x04e6
            X.3Ex r1 = r5.A2O
            r0 = r24
            X.3ZH r13 = r1.A07(r0)
            if (r13 == 0) goto L_0x01b4
            X.2k5 r0 = r13.A0F
            if (r0 != 0) goto L_0x01b4
            boolean r0 = r5.A1G
            if (r0 != 0) goto L_0x01b4
            X.2sD r1 = r5.A32
            X.4uZ r0 = X.C86604Kt.A0a(r13)
            boolean r0 = r1.A05(r0)
            r22 = 1
            if (r0 != 0) goto L_0x01b6
        L_0x01b4:
            r22 = 0
        L_0x01b6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "call ended checking spam call: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r21 = " "
            r0 = r21
            r1.append(r0)
            r0 = r24
            r1.append(r0)
            r0 = r21
            r1.append(r0)
            r0 = r22
            r1.append(r0)
            java.lang.String r0 = "; threshold "
            r1.append(r0)
            int r0 = r5.A05
            r1.append(r0)
            java.lang.String r0 = "; duration: "
            r1.append(r0)
            r0 = r25
            if (r0 == r10) goto L_0x04e2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
        L_0x01ef:
            X.C18260x0.A0m(r0, r1)
            X.7Ps r0 = r7.callWaitingInfo
            int r1 = r0.A01
            r20 = 0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r8 != r0) goto L_0x0239
            if (r1 != 0) goto L_0x0239
            if (r12 == 0) goto L_0x0239
            r0 = 3780(0xec4, float:5.297E-42)
            java.lang.String r15 = r11.A0Q(r0)
            boolean r0 = X.C159707mK.A00(r15)
            if (r0 != 0) goto L_0x0239
            X.2sH r0 = r5.A2X
            long r17 = r0.A0H()
            X.5Xv r0 = r5.A1l
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "last_app_update_dialog_timestamp"
            long r13 = X.AnonymousClass0x2.A0B(r1, r0)
            int r0 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0237
            long r17 = r17 - r13
            r0 = 3781(0xec5, float:5.298E-42)
            int r0 = r11.A0N(r0)
            int r0 = java.lang.Math.max(r0, r2)
            long r0 = (long) r0
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r13
            int r13 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x0239
        L_0x0237:
            r20 = r15
        L_0x0239:
            boolean r0 = r5.A1I
            if (r0 != 0) goto L_0x04de
            X.7Ps r0 = r7.callWaitingInfo
            int r13 = r0.A01
            java.lang.Integer r1 = r5.A3N
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r8 != r0) goto L_0x04de
            if (r13 != 0) goto L_0x04de
            if (r12 == 0) goto L_0x04de
            if (r1 == 0) goto L_0x04de
            int r1 = r1.intValue()
            if (r1 == r10) goto L_0x04de
            X.2sH r0 = r5.A2X
            long r17 = r0.A0H()
            X.5Xv r0 = r5.A1l
            android.content.SharedPreferences r10 = r0.A03()
            java.lang.String r0 = "last_call_rating_timestamp"
            long r12 = X.AnonymousClass0x2.A0B(r10, r0)
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x028f
            long r17 = r17 - r12
            long r12 = X.C18290x4.A0A(r1)
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x028f
            r0 = 2361(0x939, float:3.308E-42)
            long r14 = X.C56952sp.A06(r11, r0)
            r12 = 1
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x04de
            r0 = 2553(0x9f9, float:3.578E-42)
            int r0 = r11.A0N(r0)
            if (r0 <= 0) goto L_0x04de
            long r12 = X.C18290x4.A0A(r0)
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x04de
        L_0x028f:
            r18 = 1
        L_0x0291:
            com.whatsapp.voipcalling.CallState r10 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r8 == r10) goto L_0x0299
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 != r0) goto L_0x02c1
        L_0x0299:
            double r12 = r5.A01
            boolean r0 = java.lang.Double.isNaN(r12)
            if (r0 != 0) goto L_0x02c1
            double r0 = r5.A00
            boolean r14 = java.lang.Double.isNaN(r0)
            if (r14 != 0) goto L_0x02c1
            com.whatsapp.fieldstats.events.WamCall r14 = r5.A0b
            double r0 = r0 - r12
            java.lang.Double r12 = java.lang.Double.valueOf(r0)
            r14.callBatteryChangePct = r12
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r5.A01 = r0
            r5.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService callStateChangedOnUIThread to NONE setting battery fieldstat: "
            X.C18260x0.A1R(r1, r0, r12)
        L_0x02c1:
            if (r8 == r10) goto L_0x02c7
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 != r0) goto L_0x0333
        L_0x02c7:
            java.lang.String r0 = r7.callId
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0333
            r0 = 3321(0xcf9, float:4.654E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x0333
            X.5Xv r0 = r5.A1l
            r28 = r0
            java.lang.String r0 = r7.callId
            r27 = r0
            java.lang.String r1 = r7.relayCallUuid
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0333
            r12 = 2
            r0 = r27
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0V(r0, r1, r12)
            java.lang.String r0 = "%s#%s"
            java.lang.String r10 = java.lang.String.format(r0, r1)
            android.content.SharedPreferences r1 = r28.A03()
            java.lang.String r17 = "call_relay_uuid"
            r0 = r17
            java.lang.String r13 = r1.getString(r0, r4)
            if (r13 == 0) goto L_0x032a
            java.lang.String r4 = ";"
            java.lang.String[] r14 = r13.split(r4)
            r1 = 0
        L_0x0309:
            int r0 = r14.length
            r26 = r0
            if (r1 >= r0) goto L_0x04c4
            r15 = r14[r1]
            java.lang.String r0 = "#"
            java.lang.String[] r0 = r15.split(r0)
            r0 = r0[r3]
            r15 = r0
            r0 = r27
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x04c0
            r14[r1] = r10
            java.lang.String r0 = X.C379324p.A00(r4, r14)
            if (r0 == 0) goto L_0x04c4
            r10 = r0
        L_0x032a:
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r28)
            r0 = r17
            X.C18270x1.A0j(r1, r0, r10)
        L_0x0333:
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            if (r22 == 0) goto L_0x043c
            r1 = -1
            r0 = r25
            if (r0 == r1) goto L_0x0438
            long r0 = X.C18290x4.A0A(r25)
        L_0x0340:
            X.5Lb r4 = r7.getDefaultPeerInfo()
            if (r4 == 0) goto L_0x042a
            X.5Lb r4 = r7.getDefaultPeerInfo()
            boolean r4 = r4.A0C
            if (r4 == 0) goto L_0x042a
            java.lang.String r11 = "peer-interrupted"
        L_0x0350:
            android.content.Context r4 = r5.A1W
            r20 = r4
            java.lang.String r4 = r7.callId
            r18 = r4
            boolean r4 = r7.isEndedByMe
            r17 = r4
            boolean r14 = r7.videoEnabled
            boolean r4 = r7.isGroupCallCreatedOnServer
            if (r4 == 0) goto L_0x0427
            com.whatsapp.jid.UserJid r13 = r7.getCreatorJid()
        L_0x0366:
            android.content.Intent r12 = X.C18320x8.A07()
            java.lang.String r15 = r20.getPackageName()
            java.lang.String r4 = "com.whatsapp.calling.spam.CallSpamActivity"
            r12.setClassName(r15, r4)
            java.lang.String r15 = "caller_jid"
            r4 = r24
            X.AnonymousClass0x2.A0u(r12, r4, r15)
            java.lang.String r15 = "call_id"
            r4 = r18
            r12.putExtra(r15, r4)
            java.lang.String r4 = "call_duration"
            r12.putExtra(r4, r0)
            java.lang.String r15 = "call_terminator"
            r4 = r17
            r12.putExtra(r15, r4)
            java.lang.String r4 = "call_termination_reason"
            r12.putExtra(r4, r11)
            java.lang.String r4 = "call_video"
            r12.putExtra(r4, r14)
            if (r13 == 0) goto L_0x039e
            java.lang.String r4 = "call_creator_jid"
            X.AnonymousClass0x2.A0u(r12, r13, r4)
        L_0x039e:
            r12.setFlags(r10)
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "voiceservice starting call spam activity "
            r10.append(r4)
            r4 = r24
            r10.append(r4)
            r4 = r21
            X.C18260x0.A12(r4, r10, r0)
            r0 = r20
            r0.startActivity(r12)
        L_0x03b9:
            r4 = 1
        L_0x03ba:
            java.util.Map r1 = r5.A3E
            java.lang.String r0 = r7.callId
            r1.remove(r0)
            X.5mB r1 = r5.A2S
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0b
            java.lang.Integer r0 = r0.callResult
            r1.A08(r9, r0)
            if (r4 == 0) goto L_0x03f2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "callStateChangedOnUIThread to NONE. callOfferElapsedTimeInMillisOnServer: "
            r1.append(r0)
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0b
            java.lang.Long r0 = r0.callOfferElapsedT
            X.C18260x0.A0o(r0, r1)
            X.5Z0 r4 = r5.A2C
            com.whatsapp.fieldstats.events.WamCall r1 = r5.A0b
            boolean r0 = r5.A1T
            r4.A02(r1, r0)
            java.lang.String r0 = r5.A3O
            if (r0 == 0) goto L_0x03f2
            X.364 r4 = r5.A2H
            java.lang.String r1 = r5.A3O
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0b
            r4.A06(r0, r1)
        L_0x03f2:
            boolean r11 = r5.A1Q
            boolean r4 = r5.A3Q
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r8 == r0) goto L_0x041a
            r5.A0h(r8, r7)
        L_0x03fd:
            if (r9 == 0) goto L_0x06fc
            X.4xc r4 = r5.A36
            java.lang.String r0 = "voip/notifyCallEnded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r1 = X.C61102zi.A03(r4)
        L_0x040a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x067e
            java.lang.Object r0 = r1.next()
            X.8uW r0 = (X.C185958uW) r0
            r0.BO1(r9)
            goto L_0x040a
        L_0x041a:
            boolean r0 = r5.A1Q
            r1 = r0 ^ 1
            java.lang.String r0 = "web relay calls should not start fg activity"
            X.C626936e.A0D(r1, r0)
            r5.A0B()
            goto L_0x03fd
        L_0x0427:
            r13 = 0
            goto L_0x0366
        L_0x042a:
            X.5Lb r4 = r7.self
            boolean r4 = r4.A0C
            if (r4 == 0) goto L_0x0434
            java.lang.String r11 = "self-interrupted"
            goto L_0x0350
        L_0x0434:
            java.lang.String r11 = "unknown"
            goto L_0x0350
        L_0x0438:
            r0 = -1
            goto L_0x0340
        L_0x043c:
            if (r18 == 0) goto L_0x048b
            android.content.Context r12 = r5.A1W
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0b
            android.os.Bundle r14 = X.AnonymousClass5Z0.A00(r0)
            boolean r13 = r5.A1T
            java.lang.String r4 = r5.A3O
            r0 = 2361(0x939, float:3.308E-42)
            int r0 = r11.A0N(r0)
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r11 = r12.getPackageName()
            if (r0 != 0) goto L_0x0488
            java.lang.String r0 = "com.whatsapp.calling.callrating.CallRatingActivity"
        L_0x045c:
            r1.setClassName(r11, r0)
            java.lang.String r0 = "event"
            r1.putExtra(r0, r14)
            java.lang.String r0 = "uploadFieldStat"
            r1.putExtra(r0, r13)
            java.lang.String r0 = "timeSeriesDir"
            r1.putExtra(r0, r4)
            r1.setFlags(r10)
            r12.startActivity(r1)
            X.5Xv r4 = r5.A1l
            X.2sH r0 = r5.A2X
            long r0 = r0.A0H()
            android.content.SharedPreferences$Editor r10 = X.C106155Xv.A00(r4)
            java.lang.String r4 = "last_call_rating_timestamp"
            X.C18270x1.A0i(r10, r4, r0)
            r4 = 0
            goto L_0x03ba
        L_0x0488:
            java.lang.String r0 = "com.whatsapp.calling.callrating.CallRatingActivityV2"
            goto L_0x045c
        L_0x048b:
            boolean r0 = X.C159707mK.A00(r20)
            if (r0 != 0) goto L_0x03b9
            android.content.Context r11 = r5.A1W
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.VoipAppUpdateActivity"
            r4.setClassName(r1, r0)
            java.lang.String r1 = "feature"
            r0 = r20
            r4.putExtra(r1, r0)
            r4.setFlags(r10)
            r11.startActivity(r4)
            X.5Xv r4 = r5.A1l
            X.2sH r0 = r5.A2X
            long r0 = r0.A0H()
            android.content.SharedPreferences$Editor r10 = X.C106155Xv.A00(r4)
            java.lang.String r4 = "last_app_update_dialog_timestamp"
            X.C18270x1.A0i(r10, r4, r0)
            goto L_0x03b9
        L_0x04c0:
            int r1 = r1 + 1
            goto L_0x0309
        L_0x04c4:
            r14 = 5
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r12]
            r0 = r26
            if (r0 < r14) goto L_0x04db
            java.lang.String[] r0 = r13.split(r4, r12)
            r0 = r0[r2]
            r1[r3] = r0
        L_0x04d3:
            r1[r2] = r10
            java.lang.String r10 = X.C379324p.A00(r4, r1)
            goto L_0x032a
        L_0x04db:
            r1[r3] = r13
            goto L_0x04d3
        L_0x04de:
            r18 = 0
            goto L_0x0291
        L_0x04e2:
            java.lang.String r0 = "null"
            goto L_0x01ef
        L_0x04e6:
            r13 = 0
            r22 = 0
            goto L_0x01b6
        L_0x04eb:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r8 == r0) goto L_0x03f2
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r8 == r0) goto L_0x03f2
            int r1 = r7.callResult
            r0 = 7
            if (r1 == r0) goto L_0x03f2
            boolean r0 = r7.isBCall
            if (r0 != 0) goto L_0x03f2
            if (r8 == r10) goto L_0x0502
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r8 != r0) goto L_0x0506
        L_0x0502:
            boolean r0 = r5.A3Q
            if (r0 != 0) goto L_0x03f2
        L_0x0506:
            java.lang.String r0 = "callFieldStat can not be null when call state changed to NONE."
            X.C626936e.A0D(r3, r0)
            goto L_0x03f2
        L_0x050d:
            r25 = -1
            goto L_0x0170
        L_0x0511:
            r12 = 0
            goto L_0x010a
        L_0x0514:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r6 == r0) goto L_0x00fe
            X.5pi r0 = r5.A1m
            r0.A08(r7, r4)
            goto L_0x00fe
        L_0x051f:
            if (r8 != r10) goto L_0x052c
            boolean r12 = r5.A17
            X.5U0 r1 = r5.A1y
            java.lang.String r0 = r7.callId
            if (r12 == 0) goto L_0x0530
            r1.A03(r0, r9)
        L_0x052c:
            if (r6 == r10) goto L_0x00f5
            goto L_0x00ea
        L_0x0530:
            r1.A00(r0)
            goto L_0x052c
        L_0x0534:
            r5.A0B = r0
            android.telephony.TelephonyManager r13 = r5.A1X
            X.5ZR r11 = r5.A2a
            int r11 = X.AnonymousClass36T.A00(r13, r11)
            if (r11 == 0) goto L_0x0548
            java.lang.String r1 = r7.callId
            java.lang.String r0 = "busy"
            r5.A0m(r1, r0, r9)
            return r2
        L_0x0548:
            boolean r11 = r5.A17
            if (r11 == 0) goto L_0x054e
            r0 = 500(0x1f4, double:2.47E-321)
        L_0x054e:
            r5.A0R(r0)
            goto L_0x056a
        L_0x0552:
            r5.A1U = r3
            X.C86624Kv.A1G(r5, r7)
            r0 = 2
            r5.A0d(r7, r0, r3, r3)
            X.5pi r0 = r5.A1m
            r0.A06(r7)
            goto L_0x00d3
        L_0x0562:
            r0 = 0
            if (r8 != r10) goto L_0x0570
            com.whatsapp.voipcalling.CallState r11 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r6 != r11) goto L_0x0570
        L_0x056a:
            r0 = 2
            r5.A0d(r7, r0, r3, r3)
            goto L_0x00d3
        L_0x0570:
            com.whatsapp.voipcalling.CallState r11 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r6 != r11) goto L_0x05d1
            com.whatsapp.voipcalling.CallState r11 = com.whatsapp.voipcalling.CallState.NONE
            if (r8 != r11) goto L_0x05d1
            r5.A0B = r0
            boolean r11 = r7.isAudioChat()
            if (r11 == 0) goto L_0x05de
            if (r13 == 0) goto L_0x05de
            X.3Wi r14 = r5.A1d
            X.4FU r11 = r14.A00
            if (r11 == 0) goto L_0x05de
            X.1VX r11 = r5.A2o
            boolean r11 = X.C627436k.A0J(r11)
            if (r11 == 0) goto L_0x05de
            java.lang.String r13 = r7.callId
            java.lang.String r11 = r5.A0z
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x05de
            X.4FU r11 = r14.A00
            X.8qC r0 = r5.A3A
            r17 = r0
            java.lang.Object r0 = r17.get()
            X.2eH r0 = (X.C48062eH) r0
            java.lang.Class<X.3LA> r14 = X.AnonymousClass3LA.class
            r0.A02(r14)
            java.lang.String r15 = r7.callId
            X.C162457s7.A0J(r15, r3)
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r13 = new com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog
            r13.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "audio_chat_call_id"
            r1.putString(r0, r15)
            r13.A0u(r1)
            java.lang.Object r0 = r17.get()
            X.2eH r0 = (X.C48062eH) r0
            r0.A02(r14)
            java.lang.String r0 = "AudioChatBottomSheetDialog"
            r11.Bon(r13, r0)
            goto L_0x00d3
        L_0x05d1:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r6 != r0) goto L_0x05e6
            boolean r0 = r5.A1L
            if (r0 != 0) goto L_0x05e6
            goto L_0x056a
        L_0x05da:
            r0 = 0
            r5.A0B = r0
        L_0x05de:
            boolean r11 = r5.A17
            if (r11 == 0) goto L_0x00d0
            r0 = 500(0x1f4, double:2.47E-321)
            goto L_0x00d0
        L_0x05e6:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r6 != r0) goto L_0x05f1
            android.os.Handler r0 = r5.A0H
            r0.removeMessages(r2)
            goto L_0x00d3
        L_0x05f1:
            com.whatsapp.voipcalling.CallState r11 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 != r11) goto L_0x05fb
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.BCALL_STARTING
            if (r8 != r0) goto L_0x0601
            goto L_0x00d3
        L_0x05fb:
            if (r6 == r11) goto L_0x0601
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r6 != r0) goto L_0x00d3
        L_0x0601:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r8 != r0) goto L_0x060a
            X.5pi r0 = r5.A1m
            r0.A06(r7)
        L_0x060a:
            X.5jr r0 = r5.A29
            X.C106645Zu.A00(r0, r12)
            boolean r0 = r5.A1F
            if (r0 == 0) goto L_0x0626
            if (r6 != r11) goto L_0x0619
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 != r0) goto L_0x061d
        L_0x0619:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r8 != r0) goto L_0x0626
        L_0x061d:
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x0626
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            r0.A7b(r3)
        L_0x0626:
            int r13 = r5.A07
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r13 < r0) goto L_0x0646
            r0 = 256(0x100, float:3.59E-43)
            if (r13 > r0) goto L_0x0646
            if (r13 == 0) goto L_0x0646
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/voipAudioLevelBase "
            X.C18260x0.A0y(r0, r1, r13)
            short r1 = r5.A14
            int r0 = r5.A07
            int r1 = r1 + r0
            short r0 = (short) r1
            r5.A14 = r0
            com.whatsapp.voipcalling.Voip.adjustAudioLevel(r0)
        L_0x0646:
            if (r16 == 0) goto L_0x0661
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0661
            X.5iU r1 = r5.A2A
            java.lang.String r0 = r7.callId
            X.4Mi r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x0661
            int r0 = r1.getConnectionCapabilities()
            r0 = r0 | 1
            r1.setConnectionCapabilities(r0)
        L_0x0661:
            if (r6 != r11) goto L_0x067b
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 != r0) goto L_0x0672
            java.lang.String r13 = r7.callId
            r11 = 51
            java.lang.String r1 = "lonelyStateNotification"
            r0 = r30
            r0.A06(r11, r13, r1)
        L_0x0672:
            com.whatsapp.jid.GroupJid r1 = r7.groupJid
            java.lang.String r0 = r7.scheduledId
            r5.A0X(r1, r0)
            goto L_0x00d3
        L_0x067b:
            if (r6 != r11) goto L_0x00d3
            goto L_0x0672
        L_0x067e:
            X.5aS r4 = r4.A00
            java.lang.String r1 = "Calling"
            java.lang.String r0 = "End"
            r4.A03(r1, r0)
            boolean r0 = r9.A0M()
            if (r0 == 0) goto L_0x06b0
            boolean r0 = r7.isJoinableGroupCall
            if (r0 != 0) goto L_0x06b0
            com.whatsapp.jid.GroupJid r10 = r7.groupJid
            java.lang.String r4 = r7.scheduledId
            boolean r1 = r7.isAudioChat()
            r0 = r29
            r0.A07(r10, r9, r4, r1)
            if (r11 == 0) goto L_0x06ad
            int r4 = r7.callResult
            r10 = 10
            r1 = 5
            r0 = 1
            if (r4 != r1) goto L_0x06a9
        L_0x06a8:
            r0 = 0
        L_0x06a9:
            r5.A0g(r9, r0)
            goto L_0x071d
        L_0x06ad:
            r10 = 10
            goto L_0x06a8
        L_0x06b0:
            r10 = 10
            goto L_0x071d
        L_0x06b3:
            r10 = 10
            if (r8 == r0) goto L_0x06bb
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r8 != r0) goto L_0x0760
        L_0x06bb:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r6 == r0) goto L_0x0760
            java.lang.String r0 = r7.callId
            r1.A0G(r0)
            if (r9 == 0) goto L_0x06ea
            X.4xc r11 = r5.A36
            java.lang.String r0 = "voip/notifyCallStarted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5aS r4 = r11.A00
            java.lang.String r1 = "Calling"
            java.lang.String r0 = "Resume"
            r4.A03(r1, r0)
            java.util.Iterator r1 = X.C61102zi.A03(r11)
        L_0x06da:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0760
            java.lang.Object r0 = r1.next()
            X.8uW r0 = (X.C185958uW) r0
            r0.BOB(r9)
            goto L_0x06da
        L_0x06ea:
            boolean r0 = r5.A3Q
            if (r0 != 0) goto L_0x0760
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r23)
            java.lang.String r0 = r7.callId
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A0D(r3, r0)
            goto L_0x0760
        L_0x06fc:
            r10 = 10
            boolean r0 = r7.isBCall
            if (r0 != 0) goto L_0x071d
            boolean r0 = r7.isAudioChat()
            if (r0 != 0) goto L_0x071d
            if (r4 != 0) goto L_0x071d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            boolean r4 = X.AnonymousClass000.A1Y(r8, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r23)
            java.lang.String r0 = r7.callId
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A0D(r4, r0)
        L_0x071d:
            X.7Ps r0 = r7.callWaitingInfo
            int r1 = r0.A01
            r0 = 1
            if (r1 == r2) goto L_0x0725
            r0 = 0
        L_0x0725:
            r5.A1U = r0
            boolean r0 = r7.isJoinableGroupCall
            if (r0 == 0) goto L_0x0760
            boolean r0 = r7.isCaller
            if (r0 != 0) goto L_0x0760
            int r1 = r7.callResult
            r0 = 4
            if (r1 != r0) goto L_0x0760
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r8 == r0) goto L_0x076f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 == r0) goto L_0x076f
            java.lang.String r9 = r7.callId
            X.2rz r11 = r5.A1x
            android.content.Context r4 = r5.A1W
            r24 = 2
            boolean r1 = r5.A1L
            r0 = -1
            X.2w6 r22 = X.C58962w6.A00(r7, r0, r1)
            X.5jr r0 = r5.A29
            r23 = r0
            r25 = r2
            r20 = r11
            r21 = r4
            android.app.Notification r4 = r20.A00(r21, r22, r23, r24, r25)
            r1 = 27
            r0 = r30
            r0.A0A(r9, r1, r4)
        L_0x0760:
            r0 = r19
            if (r8 != r0) goto L_0x076f
            X.5Xv r0 = r5.A1l
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r0)
            java.lang.String r0 = "screen_sharing_backward_compat_shown"
            X.C18270x1.A0l(r1, r0, r3)
        L_0x076f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x13c3
            if (r16 == 0) goto L_0x13c3
            X.5iU r1 = r5.A2A
            java.lang.String r0 = r7.callId
            X.4Mi r5 = r1.A03(r0)
            if (r5 == 0) goto L_0x13c3
            int r4 = r6.ordinal()
            r1 = 1
            if (r4 == r2) goto L_0x07a6
            if (r4 == r10) goto L_0x07a3
            r0 = 6
            if (r4 == r0) goto L_0x07a3
            r0 = 3
            if (r4 == r0) goto L_0x079f
            r1 = 0
            if (r4 == r3) goto L_0x0797
            r0 = 7
            if (r4 == r0) goto L_0x0797
            return r2
        L_0x0797:
            int r0 = A00(r7)
            r5.A01(r0)
            goto L_0x07a6
        L_0x079f:
            r5.setRinging()
            return r2
        L_0x07a3:
            r5.setActive()
        L_0x07a6:
            r5.setAudioModeIsVoip(r1)
            return r2
        L_0x07aa:
            java.lang.Object r1 = r7.obj
            X.3ZF r1 = (X.AnonymousClass3ZF) r1
            int r0 = r7.arg1
            if (r0 <= 0) goto L_0x07b3
            r3 = 1
        L_0x07b3:
            r5.A0g(r1, r3)
            return r2
        L_0x07b7:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r0 = r7.arg2
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r5.A0f(r1, r0, r3)
            return r2
        L_0x07c5:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x13c3
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x07d8
            r0.BsG(r3)
        L_0x07d8:
            X.4xk r0 = r5.A0Q
            r0.A0E(r3)
            goto L_0x0996
        L_0x07df:
            X.8uP r1 = r5.A0X
            if (r1 == 0) goto L_0x13c3
            java.lang.Object r0 = r7.obj
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r1.videoRenderStarted(r0)
            return r2
        L_0x07eb:
            java.lang.Object r3 = r7.obj
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.4xk r1 = r5.A0Q
            java.util.Iterator r0 = X.C61102zi.A03(r1)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x13c3
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x07ff:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x13c3
            X.4VK r0 = X.C86664Kz.A15(r1)
            r0.A0E(r3)
            goto L_0x07ff
        L_0x080d:
            com.whatsapp.voipcalling.CallInfo r8 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r1 = r7.what
            int r7 = r7.arg1
            X.C626936e.A01()
            if (r8 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.CallState r6 = r8.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r6 == r0) goto L_0x13c3
            r9 = 3
            if (r7 != r9) goto L_0x0826
            r8.isPeerRequestingUpgrade()
        L_0x0826:
            X.30y r11 = r5.A21
            if (r7 == 0) goto L_0x082c
            if (r7 != r2) goto L_0x0853
        L_0x082c:
            boolean r0 = r8.isGroupCall
            if (r0 != 0) goto L_0x0853
            X.1VX r6 = r11.A0B
            java.util.Map r0 = r8.participants
            java.util.Set r0 = r0.keySet()
            int r0 = r0.size()
            int r0 = r0 - r2
            if (r0 > r2) goto L_0x0853
            r0 = 4800(0x12c0, float:6.726E-42)
            boolean r0 = r6.A0X(r0)
            if (r0 == 0) goto L_0x0853
            X.4FS r10 = r11.A0E
            r6 = 19
            X.3a5 r0 = new X.3a5
            r0.<init>(r11, r6, r8)
            r10.BkP(r0)
        L_0x0853:
            r6 = 6
            r11 = 11
            if (r1 != r11) goto L_0x0876
            if (r7 != r6) goto L_0x0876
            X.33i r0 = r5.A2W
            android.media.AudioManager r10 = r0.A0G()
            if (r10 == 0) goto L_0x0876
            java.lang.Boolean r0 = r5.A0g
            if (r0 == 0) goto L_0x086c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0876
        L_0x086c:
            boolean r0 = r5.A0r(r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A0g = r0
        L_0x0876:
            r0 = 7
            r10 = 5
            if (r7 == r0) goto L_0x0929
            if (r7 == r10) goto L_0x0929
            r0 = 9
            if (r7 == r0) goto L_0x0929
            r0 = 8
            if (r7 == r0) goto L_0x0929
            boolean r0 = r8.isEitherSideRequestingUpgrade()
            if (r0 == 0) goto L_0x088e
            boolean r0 = r5.A19
            if (r0 != 0) goto L_0x08aa
        L_0x088e:
            boolean r0 = r8.isEitherSideRequestingUpgrade()
            if (r0 == 0) goto L_0x0899
            r5.A1S = r3
            r5.A0b(r8)
        L_0x0899:
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x08a0
            r0.BsG(r8)
        L_0x08a0:
            X.4xk r0 = r5.A0Q
            r0.A0E(r8)
            X.5pi r0 = r5.A1m
            r0.A08(r8, r4)
        L_0x08aa:
            boolean r0 = r8.videoEnabled
            if (r0 == 0) goto L_0x0923
            boolean r0 = r8.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x0923
            android.os.Handler r0 = r5.A0H
            r12 = 24
            r0.removeMessages(r12)
            android.os.Handler r11 = r5.A0H
            r0 = 30000(0x7530, double:1.4822E-319)
            r11.sendEmptyMessageDelayed(r12, r0)
            X.5ZK r11 = r5.A27
            com.whatsapp.jid.UserJid r1 = X.C86644Kx.A0X(r8)
            long[] r0 = new long[r10]
            r0 = {0, 50, 100, 50, 1000} // fill-array
            r11.A06(r1, r0, r2)
            X.8uP r10 = r5.A0X
            if (r10 == 0) goto L_0x08db
            r0 = r10
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2F
            if (r0 != 0) goto L_0x0905
        L_0x08db:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_PEER_VIDEO_STATE_CHANGED launch incoming request screen, voip activity is "
            X.C18260x0.A1R(r1, r0, r10)
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            com.whatsapp.jid.UserJid r0 = X.C86644Kx.A0X(r8)
            r1.add(r0)
            android.content.Context r10 = r5.A1W
            X.1iO r0 = r5.A1a
            boolean r0 = r0.A00
            java.lang.Boolean r11 = X.C18320x8.A0V(r0)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r14 = r4
            r12 = r4
            r15 = r1
            android.content.Intent r0 = X.C627736r.A0o(r10, r11, r12, r13, r14, r15)
            r10.startActivity(r0)
        L_0x0905:
            r1 = 2
            if (r7 == r1) goto L_0x13c3
            if (r7 == r6) goto L_0x13c3
            if (r7 != r9) goto L_0x091b
            X.1id r0 = r5.A30
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x091b
            boolean r0 = r8.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x091b
            r1 = 1
        L_0x091b:
            boolean r0 = r5.A1J
            r0 = r0 ^ 1
            r5.A0d(r8, r1, r0, r3)
            return r2
        L_0x0923:
            X.5ZK r0 = r5.A27
            r0.A03()
            goto L_0x0905
        L_0x0929:
            boolean r0 = r5.A19
            if (r0 != 0) goto L_0x092f
            r5.A1S = r2
        L_0x092f:
            if (r1 != r11) goto L_0x0975
            r0 = 9
            if (r7 != r0) goto L_0x0985
        L_0x0935:
            r13 = 2131895427(0x7f122483, float:1.9425687E38)
        L_0x0938:
            X.8uP r1 = r5.A0X
            if (r1 == 0) goto L_0x095a
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            if (r13 <= 0) goto L_0x0971
            r1.A28 = r2
            java.lang.String r0 = r1.getString(r13)
            r1.A7s(r0)
            android.os.Handler r0 = r1.A0D
            r12 = 10
            r0.removeMessages(r12)
            android.os.Handler r11 = r1.A0D
            r0 = 3000(0xbb8, double:1.482E-320)
            r11.sendEmptyMessageDelayed(r12, r0)
        L_0x0957:
            r5.A0b(r8)
        L_0x095a:
            X.4xk r12 = r5.A0Q
            if (r13 <= 0) goto L_0x0987
            r0 = 3000(0xbb8, double:1.482E-320)
            java.util.Iterator r11 = X.C61102zi.A03(r12)
            boolean r11 = r11.hasNext()
            if (r11 == 0) goto L_0x08aa
            android.os.Handler r11 = r12.A02
            r11.sendEmptyMessageDelayed(r2, r0)
            goto L_0x08aa
        L_0x0971:
            r1.BsG(r8)
            goto L_0x0957
        L_0x0975:
            r0 = 7
            if (r7 == r0) goto L_0x0935
            if (r7 != r10) goto L_0x097e
            r13 = 2131895426(0x7f122482, float:1.9425685E38)
            goto L_0x0938
        L_0x097e:
            r0 = 8
            r13 = 2131895425(0x7f122481, float:1.9425683E38)
            if (r7 == r0) goto L_0x0938
        L_0x0985:
            r13 = 0
            goto L_0x0938
        L_0x0987:
            r12.A0E(r8)
            goto L_0x08aa
        L_0x098c:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r0 = X.C627436k.A0O(r3)
            if (r0 == 0) goto L_0x13c3
        L_0x0996:
            r5.A0b(r3)
            return r2
        L_0x099a:
            X.7TZ r0 = r5.A2B
            double r0 = r0.A00()
            r5.A00 = r0
            return r2
        L_0x09a3:
            X.8uP r1 = r5.A0X
            if (r1 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            boolean r0 = r1.A84(r4)
            if (r0 == 0) goto L_0x13c3
            r0 = 2131887383(0x7f120517, float:1.9409372E38)
            java.lang.String r0 = r1.getString(r0)
            r1.A7u(r0)
            return r2
        L_0x09ba:
            X.8uP r4 = r5.A0X
            if (r4 == 0) goto L_0x13c3
            java.lang.Object r3 = r7.obj
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            if (r3 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            boolean r0 = r4.A84(r3)
            if (r0 == 0) goto L_0x13c3
            X.5ZU r1 = r4.A1M
            X.3Ex r0 = r4.A1I
            java.lang.String r1 = X.AnonymousClass5ZU.A01(r0, r1, r3)
            r0 = 2131887375(0x7f12050f, float:1.9409355E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r4, r1, r2, r0)
            r4.A7u(r0)
            return r2
        L_0x09df:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x13c3
            X.5Lb r0 = r3.self
            int r1 = r0.A06
            r0 = 3
            if (r1 != r0) goto L_0x13c3
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.A13
            X.8M9 r0 = new X.8M9
            r0.<init>(r2, r2)
            goto L_0x107b
        L_0x09fb:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x13c3
            boolean r0 = r3.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x13c3
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r5.A13
            r1 = 3
            X.8M9 r0 = new X.8M9
            r0.<init>(r2, r1)
            r3.execute(r0)
            return r2
        L_0x0a19:
            X.8uP r7 = r5.A0X
            if (r7 == 0) goto L_0x0a31
            com.whatsapp.voipcalling.VoipActivityV2 r7 = (com.whatsapp.voipcalling.VoipActivityV2) r7
            X.C626936e.A01()
            com.whatsapp.voipcalling.CallInfo r4 = r7.A7D()
            if (r4 == 0) goto L_0x0a31
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0a31
            r7.A7p(r4)
        L_0x0a31:
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r4 == 0) goto L_0x13c3
            X.4xk r0 = r5.A0Q
            r0.A0E(r4)
            X.7Ps r0 = r4.callWaitingInfo
            int r0 = r0.A01
            if (r0 == r2) goto L_0x13c3
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0a53
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x0a52
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2F
            if (r0 != 0) goto L_0x0a53
        L_0x0a52:
            r6 = 1
        L_0x0a53:
            r5.A0d(r4, r6, r3, r3)
            return r2
        L_0x0a57:
            X.3Wi r1 = r5.A1d
            if (r1 == 0) goto L_0x13c3
            java.lang.Object r0 = r7.obj
            java.lang.String r0 = (java.lang.String) r0
            r1.A0P(r0, r2)
            return r2
        L_0x0a63:
            X.5pi r4 = r5.A1m
            int r3 = r7.arg1
            r0 = 13
            X.5sM r1 = new X.5sM
            r1.<init>((java.lang.Object) r4, (int) r3, (int) r0)
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x0a7a
            X.3dI r0 = r4.A0I
            r0.execute(r1)
            return r2
        L_0x0a7a:
            r1.run()
            return r2
        L_0x0a7e:
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_SHOW_INCOMING_CALL_UI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r7.obj
            if (r1 == 0) goto L_0x13c3
            java.lang.String r1 = (java.lang.String) r1
            X.4Mi r0 = r5.A08(r1)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 == 0) goto L_0x13c3
            X.7bL r0 = r5.A0Y
            if (r0 == 0) goto L_0x13c3
            r0.A04(r1)
            return r2
        L_0x0a9b:
            X.8uP r3 = r5.A0X
            if (r3 == 0) goto L_0x0b6d
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            X.C626936e.A01()
            com.whatsapp.voipcalling.CallInfo r1 = r3.A7D()
            boolean r0 = X.C627436k.A0O(r1)
            if (r0 == 0) goto L_0x0b6d
            X.C626936e.A06(r1)
            r3.A7p(r1)
            X.5b3 r0 = r3.A16
            if (r0 == 0) goto L_0x0b6d
            boolean r0 = r1.videoEnabled
            if (r0 == 0) goto L_0x0b6d
            boolean r0 = r1.isCallOnHold()
            if (r0 == 0) goto L_0x0ad1
            X.5qe r1 = r3.A1C
            X.4jd r0 = r1.A05
            com.whatsapp.jid.UserJid r0 = r0.A0G()
            if (r0 == 0) goto L_0x0b6d
            r1.A05(r0)
            goto L_0x0b6d
        L_0x0ad1:
            X.5Lb r0 = r1.self
            int r1 = r0.A06
            r0 = 6
            if (r1 == r0) goto L_0x0b6d
            X.5qe r0 = r3.A1C
            r0.A02()
            goto L_0x0b6d
        L_0x0adf:
            java.lang.Object r4 = r7.obj
            if (r4 == 0) goto L_0x13c3
            X.7HJ r4 = (X.AnonymousClass7HJ) r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0b00
            java.lang.String r0 = r4.A01
            X.4Mi r0 = r5.A08(r0)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 == 0) goto L_0x0b00
            X.5iU r3 = r5.A2A
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r4.A00
            r3.A0A(r1, r0)
        L_0x0b00:
            X.8uP r1 = r5.A0X
            if (r1 == 0) goto L_0x0b0a
            java.lang.String r0 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            r1.A1y = r0
        L_0x0b0a:
            X.4xk r1 = r5.A0Q
            java.lang.String r0 = r4.A00
            r1.A0G(r0)
            r0 = 35
            X.3a5 r1 = new X.3a5
            r1.<init>(r5, r0, r4)
            goto L_0x0cb8
        L_0x0b1a:
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x0b6d
            java.lang.String r1 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r1 == 0) goto L_0x0b6d
            X.8uP r7 = r5.A0X
            com.whatsapp.voipcalling.VoipActivityV2 r7 = (com.whatsapp.voipcalling.VoipActivityV2) r7
            java.lang.String r0 = "VoipActivityV2/muteStateChanged "
            boolean r0 = r7.A89(r1, r0)
            if (r0 != 0) goto L_0x0b6d
            com.whatsapp.voipcalling.CallInfo r6 = r7.A7D()
            r7.A7k(r6)
            if (r6 == 0) goto L_0x0b6d
            X.5b3 r0 = r7.A16
            if (r0 == 0) goto L_0x0b4e
            X.5pi r4 = r0.A1m
            int r1 = r4.A00
            java.lang.String r0 = r6.callId
            boolean r0 = r4.A0G(r0)
            if (r0 == 0) goto L_0x0b4a
            r3 = 1
        L_0x0b4a:
            r7.Bra(r6, r1, r3)
            goto L_0x0b6d
        L_0x0b4e:
            r1 = 0
            goto L_0x0b4a
        L_0x0b50:
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x0b6d
            java.lang.String r3 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r3 == 0) goto L_0x0b6d
            X.8uP r1 = r5.A0X
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.String r0 = "VoipActivityV2/rxTrafficStateForPeerChanged "
            boolean r0 = r1.A89(r3, r0)
            if (r0 != 0) goto L_0x0b6d
            com.whatsapp.voipcalling.CallInfo r0 = r1.A7D()
            r1.A7k(r0)
        L_0x0b6d:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r1 == 0) goto L_0x13c3
            goto L_0x13c8
        L_0x0b75:
            com.whatsapp.voipcalling.CallInfo r9 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r9 == 0) goto L_0x13c3
            int r4 = r7.arg1
            if (r4 == 0) goto L_0x13c3
            r8 = 37
            if (r4 == r2) goto L_0x0c1c
            if (r4 == r6) goto L_0x0bfb
            r0 = 3
            if (r4 == r0) goto L_0x0bce
            r0 = 4
            if (r4 == r0) goto L_0x0b8f
            java.lang.String r0 = "Unknown state for call waiting"
            goto L_0x1172
        L_0x0b8f:
            java.lang.Object r0 = r7.obj
            java.lang.String r0 = (java.lang.String) r0
            X.4Mi r4 = r5.A08(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0ba3
            if (r4 == 0) goto L_0x0ba3
            r0 = 6
            r4.A01(r0)
        L_0x0ba3:
            X.8uP r1 = r5.A0X
            if (r1 == 0) goto L_0x0bc3
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.String r0 = "VoipActivityV2/callWaitingStateChanged "
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = r9.isAudioChat()
            if (r0 == 0) goto L_0x0bb7
            r1.finish()
        L_0x0bb7:
            java.lang.String r0 = r9.callId
            r1.A1y = r0
            r1.A24 = r3
            r1.A7Z()
            r1.A7p(r9)
        L_0x0bc3:
            X.4xk r1 = r5.A0Q
            java.lang.String r0 = r9.callId
            r1.A0G(r0)
            r5.A0d(r9, r6, r3, r3)
            goto L_0x0bf5
        L_0x0bce:
            X.8uP r1 = r5.A0X
            if (r1 == 0) goto L_0x0bf5
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.String r0 = "VoipActivityV2/callWaitingStateChanged "
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = r9.videoEnabled
            if (r0 == 0) goto L_0x0bf5
            X.5qe r0 = r1.A1C
            r0.A02()
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r1.A15
            if (r0 == 0) goto L_0x0bf5
            X.107 r0 = r0.A0F
            boolean r0 = X.C86604Kt.A1Z(r0)
            if (r0 == 0) goto L_0x0bf5
            com.whatsapp.calling.screenshare.ScreenShareViewModel r1 = r1.A15
            X.58J r0 = X.AnonymousClass58J.PENDING_CALL_NOTIFICATION
            r1.A0M(r0)
        L_0x0bf5:
            android.os.Handler r0 = r5.A0H
            r0.removeMessages(r8)
            return r2
        L_0x0bfb:
            X.7Ps r0 = r9.callWaitingInfo
            int r0 = r0.A01
            if (r0 != r2) goto L_0x13c3
            X.4xk r0 = r5.A0Q
            r0.A0E(r9)
            X.8uP r1 = r5.A0X
            if (r1 == 0) goto L_0x0c18
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.String r0 = "VoipActivityV2/callWaitingStateChanged "
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r0 = r1.A7E(r9)
            r1.A7p(r0)
        L_0x0c18:
            r5.A0d(r9, r2, r3, r3)
            return r2
        L_0x0c1c:
            X.7Ps r4 = r9.callWaitingInfo
            int r4 = r4.A01
            if (r4 != r2) goto L_0x13c3
            X.8uP r6 = r5.A0X
            if (r6 == 0) goto L_0x0c34
            com.whatsapp.voipcalling.VoipActivityV2 r6 = (com.whatsapp.voipcalling.VoipActivityV2) r6
            java.lang.String r4 = "VoipActivityV2/callWaitingStateChanged "
            com.whatsapp.util.Log.d((java.lang.String) r4)
            r6.A23 = r3
            java.lang.String r3 = "MenuBottomSheet"
            r6.A7C(r3)
        L_0x0c34:
            java.lang.String r3 = r9.callId
            X.4Mi r3 = r5.A08(r3)
            boolean r3 = X.AnonymousClass000.A1W(r3)
            if (r3 == 0) goto L_0x0c86
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5.A0B = r3
            X.7Ps r3 = r9.callWaitingInfo
            java.util.List r10 = r3.A06
            boolean r7 = r3.A08
            java.lang.String r6 = r3.A04
            com.whatsapp.jid.GroupJid r4 = r3.A02
            boolean r3 = r3.A09
            r11 = r5
            r12 = r4
            r13 = r6
            r14 = r10
            r15 = r7
            r16 = r3
            boolean r3 = r11.A0s(r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x0c86
            java.lang.String r0 = "VoiceService/initHandlersAndExecutorService/CallWaiting Added new incoming call"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r5.A0R(r0)
        L_0x0c69:
            android.os.Message r4 = new android.os.Message
            r4.<init>()
            r4.what = r8
            X.7Ps r1 = r9.callWaitingInfo
            java.lang.String r0 = r1.A04
            r4.obj = r0
            android.os.Handler r3 = r5.A0H
            int r0 = r1.A00
            if (r0 <= r2) goto L_0x0c82
            r0 = 23000(0x59d8, double:1.13635E-319)
        L_0x0c7e:
            r3.sendMessageDelayed(r4, r0)
            return r2
        L_0x0c82:
            r0 = 45000(0xafc8, double:2.2233E-319)
            goto L_0x0c7e
        L_0x0c86:
            r5.A0B = r0
            r5.A0a(r9)
            goto L_0x0c69
        L_0x0c8c:
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x13c3
            java.lang.String r1 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r1 == 0) goto L_0x13c3
            X.8uP r3 = r5.A0X
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.String r0 = "VoipActivityV2/weakWifiSwitchedToCellular "
            boolean r0 = r3.A89(r1, r0)
            if (r0 != 0) goto L_0x13c3
            boolean r0 = r3.A26
            if (r0 != 0) goto L_0x13c3
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.A08 = r0
            return r2
        L_0x0cad:
            java.lang.Object r3 = r7.obj
            java.lang.String r3 = (java.lang.String) r3
            r0 = 19
            X.3bv r1 = new X.3bv
            r1.<init>(r0, r3, r5)
        L_0x0cb8:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r5.A13
            r0.execute(r1)
            return r2
        L_0x0cbe:
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_RESTORE_AUDIO_ROUTE_AFTER_POTS_CALL"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x13c3
            X.5pi r1 = r5.A1m
            java.lang.String r0 = "voip/audio_route/restoreAudioRouteAfterPOTSCall"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x0ce0
            r1.A0B(r6, r2)
            r1.A06 = r3
            return r2
        L_0x0ce0:
            r1.A08(r6, r4)
            return r2
        L_0x0ce4:
            android.os.Bundle r1 = r7.getData()
            java.lang.String r0 = "participant_jids"
            android.os.Parcelable[] r6 = r1.getParcelableArray(r0)
            com.whatsapp.jid.UserJid[] r6 = (com.whatsapp.jid.UserJid[]) r6
            android.os.Bundle r1 = r7.getData()
            java.lang.String r0 = "audio_levels"
            int[] r7 = r1.getIntArray(r0)
            if (r6 == 0) goto L_0x13c3
            if (r7 == 0) goto L_0x13c3
            X.4xk r1 = r5.A0Q
            java.util.Iterator r0 = X.C61102zi.A03(r1)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x13c3
            java.util.Iterator r11 = X.C61102zi.A03(r1)
        L_0x0d0e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x13c3
            X.4VK r5 = X.C86664Kz.A15(r11)
            boolean r0 = r5 instanceof com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel
            if (r0 == 0) goto L_0x0d41
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r5 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r5
            r4 = 0
            com.whatsapp.jid.UserJid r0 = r5.A04
            if (r0 == 0) goto L_0x0d0e
            int r3 = X.C73703fw.A00(r0, r6)
            if (r3 < 0) goto L_0x0d3a
            int r0 = r7.length
            int r0 = r0 + -1
            if (r3 > r0) goto L_0x0d3a
            X.08M r1 = r5.A0D
            r0 = r7[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0d36:
            r1.A0H(r0)
            goto L_0x0d0e
        L_0x0d3a:
            X.08M r1 = r5.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0d36
        L_0x0d41:
            boolean r0 = r5 instanceof com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x0d0e
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r5 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r5
            int r10 = r6.length
            int r0 = r7.length
            if (r10 == r0) goto L_0x0d51
            java.lang.String r0 = "CallGridViewModel/onParticipantAudioUpdated, participantJids and audioLevels should be one-on-one mapped"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0d0e
        L_0x0d51:
            java.util.LinkedHashMap r0 = r5.A12
            java.util.Set r0 = r0.keySet()
            java.util.HashSet r9 = X.AnonymousClass0x9.A15(r0)
            r8 = 0
            r4 = 0
        L_0x0d5d:
            if (r4 >= r10) goto L_0x0d7e
            X.7SG r3 = r5.A0Y
            r1 = r6[r4]
            java.util.Map r0 = r3.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0d76
            r0 = r7[r4]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r6[r4]
            r3.A00(r1, r0)
        L_0x0d76:
            r0 = r6[r4]
            r9.remove(r0)
            int r4 = r4 + 1
            goto L_0x0d5d
        L_0x0d7e:
            java.util.Iterator r4 = r9.iterator()
        L_0x0d82:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0d0e
            java.lang.Object r3 = r4.next()
            X.7SG r1 = r5.A0Y
            java.util.Map r0 = r1.A00
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0d82
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A00(r0, r3)
            goto L_0x0d82
        L_0x0d9e:
            java.lang.Object r6 = r7.obj
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.4xk r1 = r5.A0Q
            java.util.Iterator r0 = X.C61102zi.A03(r1)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.CallInfo r8 = r1.A09(r4)
            if (r8 == 0) goto L_0x13c3
            java.util.Iterator r10 = X.C61102zi.A03(r1)
        L_0x0db8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x13c3
            X.4VK r7 = X.C86664Kz.A15(r10)
            boolean r9 = r8.videoEnabled
            boolean r0 = r7 instanceof com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r0 == 0) goto L_0x0db8
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r7 = (com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r7
            X.3Ex r0 = r7.A05
            X.3ZH r3 = r0.A0A(r6)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.5ZU r0 = r7.A06
            java.lang.String r0 = r0.A0H(r3)
            r5 = 0
            r1[r5] = r0
            r0 = 2131895378(0x7f122452, float:1.9425587E38)
            X.6pW r4 = X.AnonymousClass4L0.A0N(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131895377(0x7f122451, float:1.9425585E38)
            X.6pW r1 = X.AnonymousClass4L0.A0N(r1, r0)
            r0 = 2131102707(0x7f060bf3, float:1.781786E38)
            if (r9 == 0) goto L_0x0df5
            r0 = 2131102073(0x7f060979, float:1.7816574E38)
        L_0x0df5:
            X.5Oy r3 = new X.5Oy
            r3.<init>(r4, r1, r5, r0)
            r1 = 2131234243(0x7f080dc3, float:1.8084646E38)
            r0 = 2131102055(0x7f060967, float:1.7816537E38)
            X.AnonymousClass4VK.A04(r7, r3, r1, r0)
            goto L_0x0db8
        L_0x0e04:
            java.lang.Object r10 = r7.obj
            com.whatsapp.voipcalling.CallLinkInfo r10 = (com.whatsapp.voipcalling.CallLinkInfo) r10
            int r9 = r7.arg1
            X.C626936e.A01()
            int r0 = r10.linkState
            r8 = 3
            r7 = 4
            if (r0 != 0) goto L_0x0e41
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "callLinkStateChangedOnUiThread to NONE. oldLinkState: "
            X.C18260x0.A0y(r0, r1, r9)
            com.whatsapp.fieldstats.events.WamCall r6 = r5.A0b
            if (r6 == 0) goto L_0x0e2b
            if (r9 == r8) goto L_0x0e24
            if (r9 != r7) goto L_0x0e2b
        L_0x0e24:
            X.5Z0 r1 = r5.A2C
            boolean r0 = r5.A1T
            r1.A02(r6, r0)
        L_0x0e2b:
            if (r9 != r7) goto L_0x0e3d
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.LINK
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r5.A0h(r1, r0)
            r5.A1G = r3
        L_0x0e38:
            r5.A0U = r4
            r5.A0T = r4
            return r2
        L_0x0e3d:
            r5.A0B()
            goto L_0x0e38
        L_0x0e41:
            if (r0 != r2) goto L_0x0e5b
            if (r9 != 0) goto L_0x0e6e
            android.content.Context r5 = r5.A1W
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r0 = r10.videoEnabled
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r9 = r8
            r10 = r4
            android.content.Intent r0 = X.C627736r.A0o(r5, r6, r7, r8, r9, r10)
            r5.startActivity(r0)
            return r2
        L_0x0e5b:
            if (r0 != r6) goto L_0x0e6e
            if (r9 != r2) goto L_0x0e6e
            com.whatsapp.jid.UserJid r0 = r10.creatorJid
            X.C626936e.A06(r0)
        L_0x0e64:
            X.4xk r1 = r5.A0Q
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.CallInfo.convertCallLinkInfoToCallInfo(r10)
            r1.A0E(r0)
            return r2
        L_0x0e6e:
            if (r9 == r2) goto L_0x0e9f
            if (r9 == r6) goto L_0x0e9f
            if (r9 != r8) goto L_0x13c3
            if (r0 != r7) goto L_0x13c3
            r5.A1G = r2
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x13c3
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.C626936e.A06(r6)
            X.4xk r1 = r5.A0Q
            java.lang.String r0 = r6.callId
            r1.A0G(r0)
            com.whatsapp.jid.UserJid r7 = X.C86644Kx.A0X(r6)
            boolean r1 = r6.videoEnabled
            java.lang.String r0 = r6.callId
            r6 = r4
            r8 = r0
            r9 = r3
            r10 = r1
            r11 = r2
            r5.A0W(r6, r7, r8, r9, r10, r11)
            return r2
        L_0x0e9f:
            if (r0 != r8) goto L_0x13c3
            goto L_0x0e64
        L_0x0ea2:
            java.lang.Object r9 = r7.obj
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            X.4xk r1 = r5.A0Q
            java.util.Iterator r0 = X.C61102zi.A03(r1)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x1020
            com.whatsapp.voipcalling.CallInfo r8 = r1.A09(r4)
            if (r8 == 0) goto L_0x1020
            java.util.Iterator r11 = X.C61102zi.A03(r1)
        L_0x0ebc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x1020
            X.4VK r7 = X.C86664Kz.A15(r11)
            boolean r10 = r8.videoEnabled
            boolean r0 = r7 instanceof com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r0 == 0) goto L_0x0ebc
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r7 = (com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r7
            X.5ZU r1 = r7.A06
            X.3Ex r0 = r7.A05
            java.lang.String r0 = X.AnonymousClass5ZU.A01(r0, r1, r9)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r1 = 0
            r3[r1] = r0
            r0 = 2131895376(0x7f122450, float:1.9425583E38)
            X.6pW r6 = X.AnonymousClass4L0.A0N(r3, r0)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 2131895375(0x7f12244f, float:1.9425581E38)
            X.6pW r1 = X.AnonymousClass4L0.A0N(r1, r0)
            r0 = 2131102707(0x7f060bf3, float:1.781786E38)
            if (r10 == 0) goto L_0x0ef3
            r0 = 2131102073(0x7f060979, float:1.7816574E38)
        L_0x0ef3:
            X.5Oy r3 = new X.5Oy
            r3.<init>(r6, r1, r2, r0)
            r1 = 2131234243(0x7f080dc3, float:1.8084646E38)
            r0 = 2131102055(0x7f060967, float:1.7816537E38)
            X.AnonymousClass4VK.A04(r7, r3, r1, r0)
            goto L_0x0ebc
        L_0x0f02:
            int r1 = r7.arg1
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r5.A0p(r0, r1)
            r0 = 25
            r5.A0P(r0, r4)
            return r2
        L_0x0f11:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r1 == 0) goto L_0x13c3
            X.4xk r0 = r5.A0Q
            r0.A0F(r1, r2)
            return r2
        L_0x0f1d:
            int r0 = r7.arg1
            if (r0 != r2) goto L_0x0f22
            r3 = 1
        L_0x0f22:
            com.whatsapp.voipcalling.CallInfo r10 = com.whatsapp.voipcalling.Voip.getCallInfo()
            java.lang.Object r11 = r7.obj
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            X.C626936e.A06(r11)
            X.4xk r12 = r5.A0Q
            java.util.Iterator r0 = X.C61102zi.A03(r12)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0f8b
            com.whatsapp.voipcalling.CallInfo r9 = r12.A09(r4)
            if (r9 == 0) goto L_0x0f8b
            java.util.Iterator r14 = X.C61102zi.A03(r12)
        L_0x0f43:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0f8b
            X.4VK r8 = X.C86664Kz.A15(r14)
            boolean r13 = r9.videoEnabled
            boolean r0 = r8 instanceof com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r0 == 0) goto L_0x0f43
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r8 = (com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r8
            X.3Ex r0 = r8.A05
            X.3ZH r6 = r0.A0A(r11)
            r5 = 2131887269(0x7f1204a5, float:1.940914E38)
            r7 = 2131233934(0x7f080c8e, float:1.808402E38)
            if (r3 == 0) goto L_0x0f69
            r5 = 2131887262(0x7f12049e, float:1.9409126E38)
            r7 = 2131233938(0x7f080c92, float:1.8084028E38)
        L_0x0f69:
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.5ZU r0 = r8.A06
            X.C18290x4.A1K(r0, r6, r1)
            X.6pW r6 = X.AnonymousClass4L0.A0N(r1, r5)
            r5 = 2131102707(0x7f060bf3, float:1.781786E38)
            if (r13 == 0) goto L_0x0f7e
            r5 = 2131102073(0x7f060979, float:1.7816574E38)
        L_0x0f7e:
            r0 = 7
            X.5Oy r1 = new X.5Oy
            r1.<init>(r6, r4, r0, r5)
            r0 = 2131102055(0x7f060967, float:1.7816537E38)
            X.AnonymousClass4VK.A04(r8, r1, r7, r0)
            goto L_0x0f43
        L_0x0f8b:
            r12.A0E(r10)
            return r2
        L_0x0f8f:
            java.lang.Object r10 = r7.obj
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            int r0 = r7.arg1
            if (r0 != r2) goto L_0x0f98
            r3 = 1
        L_0x0f98:
            X.C626936e.A06(r10)
            X.4xk r1 = r5.A0Q
            java.util.Iterator r0 = X.C61102zi.A03(r1)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x1020
            com.whatsapp.voipcalling.CallInfo r11 = r1.A09(r4)
            if (r11 == 0) goto L_0x1020
            java.util.Iterator r12 = X.C61102zi.A03(r1)
        L_0x0fb1:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x1020
            X.4VK r9 = X.C86664Kz.A15(r12)
            boolean r6 = r11.videoEnabled
            boolean r0 = r9 instanceof com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r0 == 0) goto L_0x0fb1
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r9 = (com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r9
            X.3Ex r0 = r9.A05
            X.3ZH r1 = r0.A0A(r10)
            r8 = 2131887268(0x7f1204a4, float:1.9409138E38)
            if (r3 == 0) goto L_0x0fd1
            r8 = 2131887261(0x7f12049d, float:1.9409124E38)
        L_0x0fd1:
            java.lang.Object[] r7 = X.AnonymousClass002.A0L()
            X.5ZU r0 = r9.A06
            java.lang.String r1 = r0.A0H(r1)
            r0 = 0
            r7[r0] = r1
            X.6pW r8 = X.AnonymousClass4L0.A0N(r7, r8)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 2131895375(0x7f12244f, float:1.9425581E38)
            X.6pW r7 = X.AnonymousClass4L0.A0N(r1, r0)
            r1 = 2131102707(0x7f060bf3, float:1.781786E38)
            if (r6 == 0) goto L_0x0ff3
            r1 = 2131102073(0x7f060979, float:1.7816574E38)
        L_0x0ff3:
            r0 = 6
            X.5Oy r6 = new X.5Oy
            r6.<init>(r8, r7, r0, r1)
            r1 = 2131234124(0x7f080d4c, float:1.8084405E38)
            r0 = 2131102313(0x7f060a69, float:1.781706E38)
            X.AnonymousClass4VK.A04(r9, r6, r1, r0)
            goto L_0x0fb1
        L_0x1003:
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x1020
            java.lang.String r3 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r3 == 0) goto L_0x1020
            X.8uP r1 = r5.A0X
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.String r0 = "VoipActivityV2/videoCodecStateChanged"
            boolean r0 = r1.A89(r3, r0)
            if (r0 != 0) goto L_0x1020
            com.whatsapp.voipcalling.CallInfo r0 = r1.A7D()
            r1.A7k(r0)
        L_0x1020:
            X.4xk r0 = r5.A0Q
            r0.A0E(r4)
            return r2
        L_0x1026:
            int r4 = r7.arg1
            java.lang.Object r3 = r7.obj
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_CLEAN_UP_SELF_MANAGED_CONNECTION disconnectCause="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", callId="
            X.C18260x0.A0s(r0, r3, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x13c3
            X.4Mi r0 = r5.A08(r3)
            if (r0 == 0) goto L_0x13c3
            r0.A01(r4)
            return r2
        L_0x104d:
            int r4 = r7.arg1
            java.lang.Object r1 = r7.obj
            java.lang.String r1 = (java.lang.String) r1
            if (r4 == 0) goto L_0x1056
            r3 = 1
        L_0x1056:
            java.lang.String r0 = "voiceservice/end call with dialog/ Reason not set"
            X.C626936e.A0D(r3, r0)
            com.whatsapp.voipcalling.CallInfo r0 = X.C627436k.A02()
            r5.A0e(r0, r1, r4)
            return r2
        L_0x1063:
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x13c3
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2F
            if (r0 != 0) goto L_0x13c3
            java.lang.String r3 = "default"
            java.lang.String r0 = "voip/call/reject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.A13
            X.8Ly r0 = new X.8Ly
            r0.<init>(r3)
        L_0x107b:
            r1.execute(r0)
            return r2
        L_0x107f:
            java.lang.Object r6 = r7.obj
            X.C626936e.A06(r6)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            int r0 = r7.arg1
            if (r0 != r2) goto L_0x1098
            X.8uP r3 = r5.A0X
            if (r3 == 0) goto L_0x13c3
            X.4el r3 = (X.C89704el) r3
            X.4FS r1 = r3.A04
            r0 = 17
            X.C86624Kv.A1N(r1, r3, r6, r0)
            return r2
        L_0x1098:
            X.4xk r0 = r5.A0Q
            X.5XK r8 = r0.A08()
            java.util.Iterator r10 = X.C61102zi.A03(r0)
        L_0x10a2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x13c3
            X.4VK r7 = X.C86664Kz.A15(r10)
            boolean r9 = r8.A0K
            boolean r0 = r7 instanceof com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r0 == 0) goto L_0x10a2
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r7 = (com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r7
            X.3Ex r0 = r7.A05
            X.3ZH r3 = r0.A0A(r6)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.5ZU r0 = r7.A06
            X.C18290x4.A1K(r0, r3, r1)
            r0 = 2131887263(0x7f12049f, float:1.9409128E38)
            X.6pW r5 = X.AnonymousClass4L0.A0N(r1, r0)
            r1 = 2131102707(0x7f060bf3, float:1.781786E38)
            if (r9 == 0) goto L_0x10d2
            r1 = 2131102073(0x7f060979, float:1.7816574E38)
        L_0x10d2:
            r0 = 4
            X.5Oy r3 = new X.5Oy
            r3.<init>(r5, r4, r0, r1)
            r1 = 2131233934(0x7f080c8e, float:1.808402E38)
            r0 = 2131102055(0x7f060967, float:1.7816537E38)
            X.AnonymousClass4VK.A04(r7, r3, r1, r0)
            goto L_0x10a2
        L_0x10e2:
            java.lang.Object r9 = r7.obj
            X.C626936e.A06(r9)
            X.7ZG r9 = (X.AnonymousClass7ZG) r9
            X.2sr r0 = r5.A1e
            com.whatsapp.jid.UserJid r4 = r9.A03
            boolean r0 = r0.A0a(r4)
            if (r0 == 0) goto L_0x1109
            int r0 = r9.A02
            if (r0 != r2) goto L_0x10f8
            r3 = 1
        L_0x10f8:
            r5.A1J = r3
            if (r3 != 0) goto L_0x1109
            X.8uP r0 = r5.A0X
            if (r0 == 0) goto L_0x1106
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2F
            if (r0 != 0) goto L_0x1109
        L_0x1106:
            com.whatsapp.voipcalling.Voip.stopVideoCaptureStream()
        L_0x1109:
            X.4xk r7 = r5.A0Q
            java.util.Iterator r0 = X.C61102zi.A03(r7)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x13c3
            int r8 = r9.A00
            r3 = 0
            r10 = 1
            if (r8 != r2) goto L_0x1156
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x1156
            X.2sr r0 = r7.A07
            boolean r0 = r0.A0a(r4)
            if (r0 != 0) goto L_0x1156
            r7.A06 = r2
            X.1VX r1 = r7.A0A
            r0 = 3207(0xc87, float:4.494E-42)
            int r1 = r1.A0N(r0)
            if (r1 <= 0) goto L_0x1156
            r0 = 1
            if (r1 != r2) goto L_0x1137
            r0 = 0
        L_0x1137:
            X.38g r6 = new X.38g
            r6.<init>(r0, r2)
            java.util.Iterator r5 = X.C61102zi.A03(r7)
        L_0x1140:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1156
            X.4VK r1 = X.C86664Kz.A15(r5)
            boolean r0 = r1 instanceof com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x1140
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            X.4UC r0 = r1.A0w
            r0.A0H(r6)
            goto L_0x1140
        L_0x1156:
            X.8y5 r0 = r7.A0C
            boolean r0 = r0.BIo()
            if (r0 == 0) goto L_0x13c3
            int r5 = r9.A02
            r6 = 2
            if (r5 == r2) goto L_0x11f0
            r0 = 3
            if (r5 == r6) goto L_0x117c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r5 == r0) goto L_0x1176
            java.lang.String r0 = "voip/CallDatasource/Unsupported screen share state: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)
        L_0x1172:
            X.C626936e.A0D(r3, r0)
            return r2
        L_0x1176:
            java.lang.String r0 = "Screen share failed for "
            X.C18260x0.A1R(r1, r0, r4)
            return r2
        L_0x117c:
            if (r8 == r6) goto L_0x1181
            if (r8 == r0) goto L_0x1181
            r10 = 0
        L_0x1181:
            X.2sr r0 = r7.A07
            boolean r0 = r0.A0a(r4)
            if (r0 == 0) goto L_0x11dc
            if (r10 == 0) goto L_0x11dc
            java.util.Iterator r10 = X.C61102zi.A03(r7)
        L_0x118f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x11dc
            X.4VK r9 = X.C86664Kz.A15(r10)
            boolean r0 = r9 instanceof com.whatsapp.calling.screenshare.ScreenShareViewModel
            if (r0 == 0) goto L_0x118f
            com.whatsapp.calling.screenshare.ScreenShareViewModel r9 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ScreenShareViewModel onScreenShareEndedWithReason: "
            X.C18260x0.A0y(r0, r1, r8)
            if (r8 == r6) goto L_0x11b8
            r0 = 3
            if (r8 != r0) goto L_0x118f
            X.58I r0 = X.AnonymousClass58I.STOPPING
            r9.A03 = r0
            X.4UC r1 = r9.A0H
        L_0x11b3:
            r0 = 0
            r1.A0H(r0)
            goto L_0x118f
        L_0x11b8:
            X.58I r1 = r9.A03
            X.58I r0 = X.AnonymousClass58I.STOPPED
            if (r1 == r0) goto L_0x118f
            X.58I r0 = X.AnonymousClass58I.STOPPING
            r9.A03 = r0
            r9.A0I()
            X.5TU r5 = r9.A09
            X.4Gj r1 = r5.A0G
            if (r1 == 0) goto L_0x11cf
            r0 = 0
            r1.AyX(r0)
        L_0x11cf:
            X.59E r0 = X.AnonymousClass59E.PEER_TAKEOVER
            X.AnonymousClass59E.A00(r0, r5)
            X.5Ta r0 = r5.A0N
            r0.A00()
            X.4UC r1 = r9.A0I
            goto L_0x11b3
        L_0x11dc:
            if (r8 == r6) goto L_0x13c3
            java.util.Iterator r1 = X.C61102zi.A03(r7)
        L_0x11e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x13c3
            X.4VK r0 = X.C86664Kz.A15(r1)
            r0.A0F(r4, r3, r3)
            goto L_0x11e2
        L_0x11f0:
            int r0 = r9.A01
            if (r0 < r6) goto L_0x11f5
            r3 = 1
        L_0x11f5:
            java.util.Iterator r1 = X.C61102zi.A03(r7)
        L_0x11f9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x13c3
            X.4VK r0 = X.C86664Kz.A15(r1)
            r0.A0F(r4, r2, r3)
            goto L_0x11f9
        L_0x1207:
            java.lang.Object r9 = r7.obj
            X.C626936e.A06(r9)
            X.7Zq r9 = (X.C152637Zq) r9
            int r8 = r9.A01
            int r7 = r9.A00
            if (r8 == r7) goto L_0x13c3
            if (r7 != r6) goto L_0x122d
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x122d
            X.1VX r1 = r5.A2o
            r0 = 4439(0x1157, float:6.22E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x122d
            java.lang.Integer r3 = r5.A0m
            java.lang.String r1 = "poorNetwork"
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A0j(r3, r1, r0, r0)
        L_0x122d:
            X.4xk r3 = r5.A0Q
            boolean r1 = X.AnonymousClass001.A1X(r8, r7)
            java.lang.String r0 = "Method should only be called when the network health state changes"
            X.C626936e.A0D(r1, r0)
            X.1VX r1 = r3.A0A
            r0 = 3807(0xedf, float:5.335E-42)
            int r0 = r1.A0N(r0)
            if (r0 <= 0) goto L_0x13c3
            X.5XK r0 = r3.A08()
            boolean r5 = r0.A0K
            java.util.Iterator r14 = X.C61102zi.A03(r3)
        L_0x124c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x13c3
            X.4VK r4 = X.C86664Kz.A15(r14)
            boolean r0 = r4 instanceof com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r0 == 0) goto L_0x12f4
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r4 = (com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r4
            r11 = 0
            r1 = 14
            r10 = 0
            if (r7 != r6) goto L_0x12aa
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x124c
            boolean r12 = r9.A02
            if (r12 != 0) goto L_0x126c
            r1 = 11
        L_0x126c:
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r0 = 2131890925(0x7f1212ed, float:1.9416556E38)
            X.6pW r13 = X.AnonymousClass4L0.A0N(r3, r0)
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x1282
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r0 = 2131890923(0x7f1212eb, float:1.9416552E38)
            X.6pW r11 = X.AnonymousClass4L0.A0N(r3, r0)
        L_0x1282:
            r0 = 2131102707(0x7f060bf3, float:1.781786E38)
            if (r5 == 0) goto L_0x128a
            r0 = 2131102073(0x7f060979, float:1.7816574E38)
        L_0x128a:
            X.5Oy r10 = new X.5Oy
            r10.<init>(r13, r11, r1, r0)
            r0 = 2131234086(0x7f080d26, float:1.8084328E38)
            if (r12 == 0) goto L_0x1297
            r0 = 2131234087(0x7f080d27, float:1.808433E38)
        L_0x1297:
            X.8GR r1 = new X.8GR
            r1.<init>(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r10.A01 = r1
            r10.A00 = r0
            X.5L7 r0 = r10.A00()
            r4.A0J(r0)
            goto L_0x124c
        L_0x12aa:
            if (r7 != r2) goto L_0x12d9
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x12db
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r0 = 2131890924(0x7f1212ec, float:1.9416554E38)
            X.6pW r3 = X.AnonymousClass4L0.A0N(r1, r0)
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x12c6
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r0 = 2131890923(0x7f1212eb, float:1.9416552E38)
            X.6pW r11 = X.AnonymousClass4L0.A0N(r1, r0)
        L_0x12c6:
            r1 = 2131102707(0x7f060bf3, float:1.781786E38)
            if (r5 == 0) goto L_0x12ce
            r1 = 2131102073(0x7f060979, float:1.7816574E38)
        L_0x12ce:
            r0 = 15
            X.5Oy r10 = new X.5Oy
            r10.<init>(r3, r11, r0, r1)
            r0 = 2131234084(0x7f080d24, float:1.8084324E38)
            goto L_0x1297
        L_0x12d9:
            if (r7 == r6) goto L_0x124c
        L_0x12db:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x124c
            X.4UC r0 = r4.A0D
            java.lang.Object r0 = r0.A07()
            X.5L7 r0 = (X.AnonymousClass5L7) r0
            if (r0 == 0) goto L_0x124c
            int r0 = r0.A01
            if (r0 != r1) goto L_0x124c
            X.4UC r0 = r4.A09
            X.C86654Ky.A1H(r0)
            goto L_0x124c
        L_0x12f4:
            boolean r0 = r4 instanceof com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x124c
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r4
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x124c
            if (r5 == 0) goto L_0x124c
            boolean r0 = r9.A06
            r3 = 0
            if (r0 == 0) goto L_0x1309
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x1312
        L_0x1309:
            if (r7 != r6) goto L_0x1312
            r4.A0E = r2
        L_0x130d:
            X.AnonymousClass4VK.A03(r4)
            goto L_0x124c
        L_0x1312:
            X.08M r0 = r4.A0H
            java.lang.Object r1 = r0.A07()
            X.4jd r0 = r4.A0X
            com.whatsapp.jid.UserJid r0 = r0.A0G()
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 == 0) goto L_0x1327
            r4.A0E = r3
            goto L_0x130d
        L_0x1327:
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x124c
            r4.A0E = r3
            if (r8 != r6) goto L_0x124c
            goto L_0x130d
        L_0x1330:
            X.4xk r1 = r5.A0Q
            X.5XK r0 = r1.A08()
            boolean r7 = r0.A0K
            java.util.Iterator r9 = X.C61102zi.A03(r1)
        L_0x133c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x13c3
            X.4VK r8 = X.C86664Kz.A15(r9)
            boolean r0 = r8 instanceof com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r0 == 0) goto L_0x133c
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r8 = (com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r8
            X.5Xv r6 = r8.A02
            android.content.SharedPreferences r0 = r6.A03()
            java.lang.String r5 = "high_data_usage_banner_shown_count"
            int r4 = r0.getInt(r5, r3)
            X.1VX r1 = r8.A07
            r0 = 4043(0xfcb, float:5.665E-42)
            int r0 = r1.A0N(r0)
            if (r4 < r0) goto L_0x136c
            if (r0 != 0) goto L_0x133c
            android.content.SharedPreferences r0 = r6.A03()
            X.C18270x1.A0n(r0, r5)
            goto L_0x133c
        L_0x136c:
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r6)
            android.content.SharedPreferences r0 = r6.A03()
            int r0 = X.C86664Kz.A08(r0, r5, r3)
            X.C18270x1.A0h(r1, r5, r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131890079(0x7f120f9f, float:1.941484E38)
            X.6pW r6 = X.AnonymousClass4L0.A0N(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.6pV r5 = new X.6pV
            r5.<init>(r0)
            r4 = 2131102707(0x7f060bf3, float:1.781786E38)
            if (r7 == 0) goto L_0x1393
            r4 = 2131102073(0x7f060979, float:1.7816574E38)
        L_0x1393:
            r1 = 12
            X.5Oy r0 = new X.5Oy
            r0.<init>(r6, r5, r1, r4)
            r0.A04 = r2
            X.5L7 r0 = r0.A00()
            r8.A0J(r0)
            goto L_0x133c
        L_0x13a4:
            java.lang.String r3 = "voip/commonHandler/HANDLER_WHAT_OFFLINE_COMPLETE"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            long r6 = r5.A0B
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x13c3
            android.os.Handler r0 = r5.A0H
            boolean r0 = r0.hasMessages(r2)
            if (r0 == 0) goto L_0x13c3
            android.os.Handler r0 = r5.A0H
            r0.removeMessages(r2)
        L_0x13bc:
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r5.A0a(r0)
        L_0x13c3:
            return r2
        L_0x13c4:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
        L_0x13c8:
            X.4xk r0 = r5.A0Q
            r0.A0E(r1)
            return r2
        L_0x13ce:
            X.66r r4 = r5.A1s
            java.lang.Object r1 = r7.obj
            X.C626936e.A06(r1)
            X.3ZF r1 = (X.AnonymousClass3ZF) r1
            android.content.Context r0 = r5.A1W
            X.5jl r4 = (X.C112455jl) r4
            r4.BJS(r0, r1, r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A06(android.os.Message, X.5b3):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r3.A08(r2, java.lang.Boolean.valueOf(r0.A0b.A0G(r2))) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r4 = r2.participants;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(com.whatsapp.fieldstats.events.WamCall r27, com.whatsapp.voipcalling.CallGroupInfo r28, X.AnonymousClass3ZF r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, long r35, long r37, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45) {
        /*
            r26 = this;
            r8 = r29
            r9 = r27
            X.39J r1 = r8.A0E
            boolean r0 = r1.A03
            r2 = r0 ^ 1
            java.lang.String r0 = "processMissedIncomingCall should only be called on callee side"
            X.C626936e.A0D(r2, r0)
            r6 = r26
            X.5U0 r2 = r6.A1y
            r0 = 4
            r7 = r31
            r2.A03(r7, r0)
            java.lang.String r0 = "test.name"
            java.lang.String r11 = com.whatsapp.voipcalling.Voip.getVoipParamForCall(r0, r7)
            if (r11 == 0) goto L_0x0027
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r11 = 0
        L_0x0028:
            com.whatsapp.voipcalling.Voip.clearVoipParam(r7)
            X.1VX r2 = r6.A2o
            r0 = 6525(0x197d, float:9.143E-42)
            boolean r0 = r2.A0X(r0)
            r2 = r28
            if (r0 == 0) goto L_0x0244
            r5 = 0
            if (r28 == 0) goto L_0x0053
            com.whatsapp.voipcalling.CallParticipant[] r4 = r2.participants
            int r3 = r4.length
            if (r3 <= 0) goto L_0x0053
            r10 = 0
        L_0x0040:
            r0 = r4[r5]
            java.lang.String r2 = "connected"
            java.lang.String r0 = r0.state
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004e
            int r10 = r10 + 1
        L_0x004e:
            int r5 = r5 + 1
            if (r5 < r3) goto L_0x0040
            r5 = r10
        L_0x0053:
            com.whatsapp.jid.GroupJid r4 = r8.A05
            X.2sD r3 = r6.A32
            X.3Lq r0 = r6.A2q
            r2 = r4
            X.1fJ r2 = (X.C27991fJ) r2
            if (r4 == 0) goto L_0x0070
            X.2sj r0 = r0.A0b
            boolean r0 = r0.A0G(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A08(r2, r0)
            r16 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0070:
            r16 = 0
        L_0x0072:
            boolean r0 = r8.A0N()
            if (r0 == 0) goto L_0x0080
            com.whatsapp.jid.GroupJid r2 = r8.A05
            if (r2 == 0) goto L_0x0080
            r0 = 2
            r3.A03(r2, r0)
        L_0x0080:
            r14 = 0
            r13 = 5
            if (r45 == 0) goto L_0x0097
            if (r42 == 0) goto L_0x008c
            boolean r0 = r8.A0N()
            if (r0 == 0) goto L_0x0097
        L_0x008c:
            android.os.Handler r0 = r6.A0H
            r2 = r40
            android.os.Message r0 = android.os.Message.obtain(r0, r13, r2, r14, r8)
            r0.sendToTarget()
        L_0x0097:
            X.5P3 r10 = r6.A23
            com.whatsapp.jid.UserJid r15 = r1.A01
            X.5b3 r4 = r10.A05
            X.2TG r3 = r4.A07(r7)
            r2 = 2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r27 == 0) goto L_0x01f9
            X.1VX r1 = r10.A0A
            r0 = 4791(0x12b7, float:6.714E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01f9
        L_0x00b2:
            java.lang.Integer r0 = r3.A04
            r9.incomingCallUiAction = r0
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x00be
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.doNotDisturbEnabled = r0
        L_0x00be:
            X.2lA r11 = r4.A0R
            boolean r1 = r11.A01
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x00c8
            r1 = r1 | 2
        L_0x00c8:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x00ce
            r1 = r1 | 4
        L_0x00ce:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)
            r9.callNotificationState = r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r9.joinableNewUi = r1
            X.2ef r0 = r8.A0J
            if (r0 == 0) goto L_0x00e4
            r9.isScheduledCall = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r37)
            r9.randomScheduledId = r0
        L_0x00e4:
            int r0 = r8.A0H
            if (r0 != r2) goto L_0x00ea
            r9.isVoiceChat = r1
        L_0x00ea:
            if (r44 == 0) goto L_0x00ee
            r9.isPhashBased = r1
        L_0x00ee:
            java.lang.Boolean r0 = r9.groupCallIsLastSegment
            if (r0 == 0) goto L_0x010c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x010c
            com.whatsapp.jid.GroupJid r11 = r8.A05
            if (r11 == 0) goto L_0x010c
            X.3Lq r0 = r10.A0B
            X.2sj r0 = r0.A0b
            int r0 = X.C86664Kz.A0H(r0, r11)
            if (r0 <= 0) goto L_0x01f2
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.numInvitedParticipants = r0
        L_0x010c:
            java.lang.Long r23 = java.lang.Long.valueOf(r35)
            r20 = 0
            r22 = r30
            r24 = r32
            r25 = r33
            r21 = r20
            r18 = r9
            r19 = r15
            r17 = r10
            r17.A00(r18, r19, r20, r21, r22, r23, r24, r25)
            if (r42 == 0) goto L_0x0138
            X.2sH r12 = r4.A2X
            X.2sr r11 = r4.A1e
            r0 = 1
            byte[] r0 = X.AnonymousClass35J.A03(r11, r12, r0)
            java.lang.String r0 = X.C627236i.A06(r0)
            java.lang.String r0 = r4.A0A(r7, r0)
            r9.callRandomId = r0
        L_0x0138:
            boolean r0 = r8.A0N()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.privacySilenceUnknownCaller = r0
            X.2sK r0 = r10.A08
            boolean r0 = r0.A0B(r15)
            java.lang.Boolean r0 = X.C18320x8.A0V(r0)
            r9.privacyUnknownCaller = r0
            com.whatsapp.jid.GroupJid r11 = r8.A05
            if (r11 == 0) goto L_0x015f
            X.2sD r0 = r10.A0D
            int r11 = r0.A00(r11)
            r0 = 1
            if (r11 != r0) goto L_0x015f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.privacyUnknownCaller = r0
        L_0x015f:
            X.5mB r12 = r10.A09
            X.30y r0 = r10.A04
            X.3ZF r11 = r0.A04(r7)
            java.lang.Integer r0 = r9.callResult
            r12.A08(r11, r0)
            X.5Z0 r10 = r10.A06
            r11 = r39
            r10.A02(r9, r11)
            if (r5 <= 0) goto L_0x01d6
            com.whatsapp.fieldstats.events.WamJoinableCall r0 = new com.whatsapp.fieldstats.events.WamJoinableCall
            r0.<init>()
            if (r42 == 0) goto L_0x0180
            java.lang.String r9 = r9.callRandomId
            r0.callRandomId = r9
        L_0x0180:
            boolean r3 = r3.A06
            if (r3 == 0) goto L_0x0186
            r0.isRering = r1
        L_0x0186:
            if (r42 == 0) goto L_0x018a
            r0.joinableDuringCall = r1
        L_0x018a:
            com.whatsapp.jid.GroupJid r3 = r8.A05
            if (r3 == 0) goto L_0x0190
            r0.isLinkedGroupCall = r1
        L_0x0190:
            X.2ef r3 = r8.A0J
            if (r3 == 0) goto L_0x019c
            r0.isScheduledCall = r1
            java.lang.Long r3 = java.lang.Long.valueOf(r37)
            r0.randomScheduledId = r3
        L_0x019c:
            java.lang.Long r3 = X.AnonymousClass0x9.A0m(r5)
            r0.numConnectedPeers = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r41)
            r0.videoEnabled = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r0.lobbyEntryPoint = r3
            java.lang.Integer r3 = X.C18290x4.A0d()
            r0.lobbyExit = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r34)
            r0.legacyCallResult = r3
            if (r43 == 0) goto L_0x01be
            r0.isPendingCall = r1
        L_0x01be:
            if (r16 == 0) goto L_0x01c2
            r0.hasSpamDialog = r1
        L_0x01c2:
            int r3 = r8.A0H
            if (r3 != r2) goto L_0x01c8
            r0.isVoiceChat = r1
        L_0x01c8:
            if (r44 == 0) goto L_0x01cc
            r0.isPhashBased = r1
        L_0x01cc:
            X.4FV r1 = r10.A01
            r1.BhB(r0)
            if (r39 == 0) goto L_0x01d6
            r1.BKX()
        L_0x01d6:
            java.util.Map r0 = r4.A3E
            r0.remove(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x01f1
            android.os.Handler r0 = r6.A0H
            r1 = 48
            r0.removeMessages(r1)
            android.os.Handler r0 = r6.A0H
            android.os.Message r0 = r0.obtainMessage(r1, r13, r14, r7)
            r0.sendToTarget()
        L_0x01f1:
            return
        L_0x01f2:
            java.lang.String r0 = "VoiceService:postMissedCallEventToFieldStat groupMembersCount error"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x010c
        L_0x01f9:
            X.1VX r1 = r10.A0A
            r0 = 1939(0x793, float:2.717E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x023e
            com.whatsapp.fieldstats.extension.WamCallExtended r9 = new com.whatsapp.fieldstats.extension.WamCallExtended
            r9.<init>()
        L_0x0208:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r34)
            r9.callResult = r0
            r9.callSide = r12
            if (r5 <= 0) goto L_0x0220
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.groupCallIsLastSegment = r0
            r9.groupCallIsGroupCallInvitee = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r5)
            r9.numConnectedParticipants = r0
            r9.fieldStatsRowType = r12
        L_0x0220:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r41)
            r9.videoEnabled = r0
            r9.callTestBucket = r11
            if (r42 == 0) goto L_0x022e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.joinableDuringCall = r0
        L_0x022e:
            if (r43 == 0) goto L_0x0234
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.isPendingCall = r0
        L_0x0234:
            com.whatsapp.jid.GroupJid r0 = r8.A05
            if (r0 == 0) goto L_0x00b2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.isLinkedGroupCall = r0
            goto L_0x00b2
        L_0x023e:
            com.whatsapp.fieldstats.events.WamCall r9 = new com.whatsapp.fieldstats.events.WamCall
            r9.<init>()
            goto L_0x0208
        L_0x0244:
            X.30y r0 = r6.A21
            int r5 = r0.A01(r2, r8)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0V(com.whatsapp.fieldstats.events.WamCall, com.whatsapp.voipcalling.CallGroupInfo, X.3ZF, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d7, code lost:
        if (r1 == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0138, code lost:
        if (r12 == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0269, code lost:
        if (r1.equals(r11.A0A.A1W.getString(com.whatsapp.R.string.f11nameremoved)) != false) goto L_0x026b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(com.whatsapp.jid.GroupJid r21, com.whatsapp.jid.UserJid r22, java.lang.String r23, boolean r24, boolean r25, boolean r26) {
        /*
            r20 = this;
            X.C626936e.A01()
            r6 = r20
            r0 = r25
            r6.A1K = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/service/start "
            X.C18260x0.A1R(r1, r0, r6)
            boolean r0 = r6.A1Q
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "voip/start/started, do nothing"
        L_0x0018:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001b:
            return
        L_0x001c:
            X.1VX r5 = r6.A2o
            r0 = 5845(0x16d5, float:8.19E-42)
            boolean r0 = r5.A0X(r0)
            r6.A1N = r0
            android.content.Context r10 = r6.A1W
            X.4FS r9 = r6.A35
            X.5Xv r2 = r6.A1l
            if (r0 == 0) goto L_0x0048
            android.content.SharedPreferences r1 = r2.A03()
            java.lang.String r0 = "end_call_tone_duration_last_cached_app_version"
            java.lang.String r1 = X.C18280x3.A0Z(r1, r0)
            java.lang.String r0 = "2.23.26.14"
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 != 0) goto L_0x0048
            X.3ca r0 = new X.3ca
            r0.<init>((android.content.Context) r10, (X.C106155Xv) r2)
            r9.BkM(r0)
        L_0x0048:
            r15 = r23
            X.4Mi r0 = r6.A08(r15)
            boolean r12 = X.AnonymousClass000.A1W(r0)
            if (r12 != 0) goto L_0x007a
            android.telephony.TelephonyManager r3 = r6.A1X
            X.5ZR r0 = r6.A2a
            int r2 = X.AnonymousClass36T.A00(r3, r0)
            if (r24 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x006b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/start/cellularCallInProgress "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            goto L_0x0018
        L_0x006b:
            if (r3 == 0) goto L_0x007a
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x007a
            android.telephony.PhoneStateListener r1 = r6.A0N
            r0 = 32
            r3.listen(r1, r0)
        L_0x007a:
            long r16 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/device_info MANUFACTURER: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r1.append(r0)
            java.lang.String r0 = ", MODEL: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r0 = ", Device: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.DEVICE
            r1.append(r0)
            java.lang.String r0 = ", Board: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.BOARD
            r1.append(r0)
            java.lang.String r0 = ", Hardware: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.HARDWARE
            r1.append(r0)
            java.lang.String r0 = ", CPU_API: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass321.A02()
            r1.append(r0)
            java.lang.String r0 = ", OS: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r1.append(r0)
            java.lang.String r0 = ", Build: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.DISPLAY
            r1.append(r0)
            java.lang.String r0 = ", App: "
            r1.append(r0)
            java.lang.String r0 = "2.23.26.14"
            r1.append(r0)
            java.lang.String r0 = ", PowerSaving: "
            r1.append(r0)
            X.33i r0 = r6.A2W
            r19 = r0
            android.os.PowerManager r0 = r19.A0J()
            if (r0 != 0) goto L_0x0313
            java.lang.String r0 = "voip/service/start pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x00f3:
            X.C18260x0.A1V(r1, r0)
            android.media.AudioManager r11 = r19.A0G()
            r4 = 0
            r6.A19 = r4
            r6.A1S = r4
            r6.A1L = r4
            com.whatsapp.voipcalling.Voip$DebugTapType[] r0 = com.whatsapp.voipcalling.Voip.DebugTapType.values()
            int r0 = r0.length
            com.whatsapp.voipcalling.Voip$RecordingInfo[] r0 = new com.whatsapp.voipcalling.Voip.RecordingInfo[r0]
            r6.A1V = r0
            com.whatsapp.calling.service.OutgoingSignalingHandler r0 = r6.A26
            r0.clearPendingCallOfferStanza()
            java.util.Map r0 = r6.A3G
            r0.clear()
            java.util.Map r0 = r6.A3H
            r0.clear()
            X.2rd r0 = r6.A2D
            X.2gU r0 = r0.A04
            java.util.Set r0 = r0.A03
            r0.clear()
            android.content.BroadcastReceiver r2 = r6.A0D
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3 = 1
            X.C154317cy.A01(r2, r10, r0, r3)
            X.5pi r2 = r6.A1m
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x013a
            r7 = 1
            if (r12 != 0) goto L_0x013b
        L_0x013a:
            r7 = 0
        L_0x013b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/audio_route/onCallStart using telecom:"
            X.C18260x0.A1E(r0, r1, r7)
            r2.A05 = r7
            r2.A04 = r4
            r2.A07 = r4
            if (r7 != 0) goto L_0x0175
            X.5TY r1 = r2.A0A
            boolean r0 = r1.A03()
            r1.A01 = r0
            r1.A01()
            X.4LZ r0 = r2.A0H
            r0.A04(r2)
            android.content.Context r8 = r2.A08
            X.4LV r7 = r2.A0B
            java.lang.String r1 = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            android.content.Intent r1 = X.C154317cy.A01(r7, r8, r0, r3)
            if (r1 == 0) goto L_0x0175
            java.lang.String r0 = "android.media.extra.SCO_AUDIO_STATE"
            int r0 = X.C86664Kz.A07(r1, r0)
            r2.A01 = r0
        L_0x0175:
            r2.A03 = r4
            android.content.BroadcastReceiver r1 = r6.A0E
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            X.C18320x8.A0x(r1, r10, r0, r3)
            X.C626936e.A01()
            android.os.PowerManager$WakeLock r0 = r6.A0L
            if (r0 == 0) goto L_0x02e9
            java.lang.String r0 = "voip/service/acquirePartialWakeLock already acquired, do nothing"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x018a:
            X.8y5 r0 = r6.A34
            r18 = r0
            if (r11 == 0) goto L_0x01af
            if (r12 != 0) goto L_0x01af
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "audioManager "
            r1.append(r0)
            int r0 = r11.getMode()
            X.C18260x0.A1G(r1, r0)
            X.33i r0 = r2.A0F
            android.media.AudioManager r7 = r0.A0G()
            if (r7 != 0) goto L_0x02db
            java.lang.String r0 = "result of audio focus for voice call: 0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01af:
            r2 = 0
            if (r24 != 0) goto L_0x02d7
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x01d8
            boolean r0 = r6.A15
            if (r0 != 0) goto L_0x01d8
            X.5ZK r11 = r6.A27
            int r1 = r6.A06
            r0 = 0
            boolean r8 = r11.A08(r2)
            r11.A00 = r4
            r13 = r22
            if (r12 == 0) goto L_0x0211
            if (r1 == 0) goto L_0x0211
            if (r26 == 0) goto L_0x01d5
            long[] r0 = r11.A09(r13, r8, r3)
        L_0x01d5:
            r11.A06(r13, r0, r4)
        L_0x01d8:
            r6.A0i = r2
        L_0x01da:
            android.os.Handler r7 = r6.A0I
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.sendEmptyMessageDelayed(r4, r0)
            android.media.SoundPool r0 = r6.A0F
            if (r0 == 0) goto L_0x0204
            r6.A0o = r2
            r6.A0m = r2
            java.util.Map r0 = r6.A3I
            r0.clear()
            android.media.SoundPool r1 = r6.A0F
            r0 = 6569(0x19a9, float:9.205E-42)
            boolean r0 = r5.A0X(r0)
            if (r0 == 0) goto L_0x020d
            java.util.Objects.requireNonNull(r1)
            r0 = 33
            X.5sL r0 = X.C117695sL.A00(r1, r0)
            r9.BkM(r0)
        L_0x0204:
            android.media.SoundPool r1 = new android.media.SoundPool
            r1.<init>(r3, r4, r4)
            r6.A0F = r1
            goto L_0x0319
        L_0x020d:
            r1.release()
            goto L_0x0204
        L_0x0211:
            com.whatsapp.jid.UserJid r1 = com.whatsapp.voipcalling.Voip.getPeerJid()
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/ringtone/play, telecom: "
            X.C18260x0.A1E(r0, r7, r12)
            if (r1 != 0) goto L_0x022b
            java.lang.String r0 = "voip/ringtone/play/error/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0225:
            if (r26 != 0) goto L_0x01d8
            r11.A06(r13, r2, r3)
            goto L_0x01d8
        L_0x022b:
            X.33i r0 = r11.A0B
            android.media.AudioManager r7 = r0.A0G()
            if (r7 == 0) goto L_0x0243
            int r0 = r7.getRingerMode()
            if (r0 == 0) goto L_0x02d3
            if (r0 == r3) goto L_0x02cf
            r14 = 2
            if (r0 != r14) goto L_0x0243
            java.lang.String r0 = "voip/ringtone/ringer_mode/normal"
        L_0x0240:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0243:
            boolean r0 = r11.A07()
            if (r0 != 0) goto L_0x0225
            X.1R1 r0 = r11.A0E
            X.2sa r0 = X.AnonymousClass1R1.A00(r1, r0)
            java.lang.String r1 = r0.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x026b
            X.5b3 r0 = r11.A0A
            android.content.Context r14 = r0.A1W
            r0 = 2131893743(0x7f121def, float:1.9422271E38)
            java.lang.String r0 = r14.getString(r0)
            boolean r0 = r1.equals(r0)
            r14 = 0
            if (r0 == 0) goto L_0x026c
        L_0x026b:
            r14 = 1
        L_0x026c:
            android.net.Uri r0 = r11.A02
            if (r0 != 0) goto L_0x0225
            if (r14 != 0) goto L_0x0225
            java.lang.String r14 = "/"
            java.lang.String r0 = "android.resource://"
            if (r26 == 0) goto L_0x02c5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            android.content.Context r0 = r11.A08
            java.lang.String r0 = r0.getPackageName()
            r1.append(r0)
            r1.append(r14)
            r0 = 2132017166(0x7f14000e, float:1.9672603E38)
            if (r8 == 0) goto L_0x0290
            r0 = 2132017173(0x7f140015, float:1.9672617E38)
        L_0x0290:
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)
        L_0x0294:
            android.net.Uri r0 = android.net.Uri.parse(r1)
            r11.A02 = r0
            if (r0 == 0) goto L_0x0225
            if (r7 == 0) goto L_0x02bc
            if (r12 != 0) goto L_0x02bc
            java.lang.String r0 = "voip/ringtone/setmode"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1VX r1 = r11.A0D
            r0 = 6570(0x19aa, float:9.207E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x02c1
            X.3dI r1 = r11.A01()
            r0 = 26
            X.5sL r0 = X.C117695sL.A00(r7, r0)
            r1.execute(r0)
        L_0x02bc:
            r11.A02()
            goto L_0x0225
        L_0x02c1:
            r7.setMode(r3)
            goto L_0x02bc
        L_0x02c5:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/ringtone/ "
            X.C18260x0.A0s(r0, r1, r8)
            goto L_0x0294
        L_0x02cf:
            java.lang.String r0 = "voip/ringtone/ringer_mode/vibrate"
            goto L_0x0240
        L_0x02d3:
            java.lang.String r0 = "voip/ringtone/ringer_mode/silent"
            goto L_0x0240
        L_0x02d7:
            r6.A0p = r2
            goto L_0x01da
        L_0x02db:
            X.3dI r2 = r2.A0I
            r1 = 42
            X.5rQ r0 = new X.5rQ
            r0.<init>(r7, r1)
            r2.execute(r0)
            goto L_0x01af
        L_0x02e9:
            android.os.PowerManager r1 = r19.A0J()     // Catch:{ Exception -> 0x030a }
            if (r1 != 0) goto L_0x02f6
            java.lang.String r0 = "voip/service/acquirePartialWakeLock pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x030a }
            goto L_0x018a
        L_0x02f6:
            java.lang.String r0 = "VoiceService"
            android.os.PowerManager$WakeLock r0 = X.AnonymousClass75K.A00(r1, r0, r3)     // Catch:{ Exception -> 0x030a }
            r6.A0L = r0     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x018a
            r0.acquire()     // Catch:{ Exception -> 0x030a }
            java.lang.String r0 = "voip/service/acquirePartialWakeLock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x030a }
            goto L_0x018a
        L_0x030a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            r6.A0L = r0
            goto L_0x018a
        L_0x0313:
            boolean r0 = r0.isPowerSaveMode()
            goto L_0x00f3
        L_0x0319:
            r0 = 2132017163(0x7f14000b, float:1.9672597E38)
            int r0 = r1.load(r10, r0, r3)     // Catch:{ NotFoundException -> 0x0368 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x0368 }
            r6.A0o = r0     // Catch:{ NotFoundException -> 0x0368 }
            android.media.SoundPool r1 = r6.A0F     // Catch:{ NotFoundException -> 0x0368 }
            r0 = 2132017191(0x7f140027, float:1.9672653E38)
            int r0 = r1.load(r10, r0, r3)     // Catch:{ NotFoundException -> 0x0368 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x0368 }
            r6.A0m = r0     // Catch:{ NotFoundException -> 0x0368 }
            java.util.Map r8 = r6.A3I     // Catch:{ NotFoundException -> 0x0368 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x0368 }
            android.media.SoundPool r1 = r6.A0F     // Catch:{ NotFoundException -> 0x0368 }
            r0 = 2132017169(0x7f140011, float:1.9672609E38)
            int r0 = r1.load(r10, r0, r3)     // Catch:{ NotFoundException -> 0x0368 }
            X.C18280x3.A1D(r7, r8, r0)     // Catch:{ NotFoundException -> 0x0368 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ NotFoundException -> 0x0368 }
            android.media.SoundPool r1 = r6.A0F     // Catch:{ NotFoundException -> 0x0368 }
            r0 = 2132017172(0x7f140014, float:1.9672615E38)
            int r0 = r1.load(r10, r0, r3)     // Catch:{ NotFoundException -> 0x0368 }
            X.C18280x3.A1D(r7, r8, r0)     // Catch:{ NotFoundException -> 0x0368 }
            java.lang.Integer r7 = X.C18280x3.A0S()     // Catch:{ NotFoundException -> 0x0368 }
            android.media.SoundPool r1 = r6.A0F     // Catch:{ NotFoundException -> 0x0368 }
            r0 = 2132017159(0x7f140007, float:1.9672589E38)
            int r0 = r1.load(r10, r0, r3)     // Catch:{ NotFoundException -> 0x0368 }
            X.C18280x3.A1D(r7, r8, r0)     // Catch:{ NotFoundException -> 0x0368 }
            goto L_0x0377
        L_0x0368:
            r1 = move-exception
            java.lang.String r0 = "voip/service/start failed to load call sound set"
            com.whatsapp.util.Log.w(r0, r1)
            r6.A0o = r2
            r6.A0m = r2
            java.util.Map r0 = r6.A3I
            r0.clear()
        L_0x0377:
            android.net.wifi.WifiManager r7 = r19.A0I()
            if (r7 == 0) goto L_0x0471
            boolean r0 = r7.isWifiEnabled()
            if (r0 == 0) goto L_0x0471
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x0471
            android.net.wifi.WifiInfo r0 = r7.getConnectionInfo()
            int r0 = r0.getRssi()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A0u = r0
        L_0x0397:
            r0 = 0
            r6.A0C = r0
            r0 = -1
            r6.A0A = r0
            r6.A03 = r4
            r6.A1Q = r3
            X.C379024m.A00 = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A08 = r0
            X.33p r0 = r6.A2b
            java.lang.String r4 = X.C106965aS.A08
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "voip_call_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r15)
            java.lang.String r0 = "session_id_for_voip_call_id"
            X.C18270x1.A0j(r1, r0, r4)
            X.2sD r4 = r6.A32
            X.3Lq r0 = r6.A2q
            r1 = r21
            X.1fJ r1 = (X.C27991fJ) r1
            if (r21 == 0) goto L_0x03d9
            X.2sj r0 = r0.A0b
            boolean r0 = r0.A0G(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r4.A08(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x03da
        L_0x03d9:
            r0 = 0
        L_0x03da:
            r6.A1A = r0
            long r0 = r6.A08
            long r0 = r0 - r16
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "voip/service/start elapsed "
            r7.append(r4)
            r7.append(r0)
            java.lang.String r0 = " ms"
            X.C18260x0.A1L(r7, r0)
            java.lang.String r0 = "voip/service/start"
            r4 = 4
            A05(r0)
            boolean r0 = X.C627436k.A0D(r19)
            r6.A1F = r0
            boolean r0 = r6.A1K
            X.5PA r1 = r6.A1j
            if (r0 == 0) goto L_0x046c
            r1.A00(r4, r3)
        L_0x0406:
            r0 = 2843(0xb1b, float:3.984E-42)
            boolean r0 = r5.A0X(r0)
            if (r0 == 0) goto L_0x041c
            X.30y r7 = r6.A21
            X.4FS r3 = r7.A0E
            r1 = 17
            X.3bv r0 = new X.3bv
            r0.<init>(r1, r15, r7)
            r3.BkM(r0)
        L_0x041c:
            boolean r0 = r18.BIo()
            if (r0 == 0) goto L_0x0434
            X.5TU r1 = r6.A1z
            r0 = 0
            r1.A05 = r0
            X.5Ta r0 = r1.A0K
            r0.A01()
            X.5Ta r0 = r1.A0J
            r0.A01()
            r1.A00()
        L_0x0434:
            int r0 = X.C86664Kz.A0J(r5)
            if (r0 < r4) goto L_0x0454
            X.7Ob r3 = r6.A1w
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A02 = r0
            r3.A01 = r0
            X.5Ta r0 = r3.A03
            r0.A01()
            X.5Ta r0 = r3.A04
            r0.A01()
            X.5Ta r0 = r3.A05
            r0.A01()
        L_0x0454:
            X.5NO r0 = r6.A1o
            X.1VX r1 = r0.A02
            r0 = 1756(0x6dc, float:2.46E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x001b
            r0 = 3359(0xd1f, float:4.707E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x001b
            X.5ZG r3 = r6.A1p
            monitor-enter(r3)
            goto L_0x0475
        L_0x046c:
            r0 = 3
            r1.A00(r0, r3)
            goto L_0x0406
        L_0x0471:
            r6.A0u = r2
            goto L_0x0397
        L_0x0475:
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0482 }
            r3.A01 = r2     // Catch:{ all -> 0x0482 }
            java.util.List r0 = r3.A04     // Catch:{ all -> 0x0482 }
            r0.clear()     // Catch:{ all -> 0x0482 }
            monitor-exit(r3)
            return
        L_0x0482:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107285b3.A0W(com.whatsapp.jid.GroupJid, com.whatsapp.jid.UserJid, java.lang.String, boolean, boolean, boolean):void");
    }
}
