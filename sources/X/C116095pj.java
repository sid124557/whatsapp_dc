package X;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.audiofx.Visualizer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.format.DateUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$DecoratedCustomViewStyle;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.5pj  reason: invalid class name and case insensitive filesystem */
public class C116095pj implements C183148pZ, C183158pa {
    public static int A12;
    public static C174218Tk A13 = new C174218Tk(250);
    public static byte[] A14;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A = 0;
    public long A0B;
    public Activity A0C;
    public Sensor A0D;
    public SensorEventListener A0E;
    public SensorManager A0F;
    public AudioManager.OnAudioFocusChangeListener A0G;
    public Visualizer A0H;
    public C182278o9 A0I;
    public C1229466l A0J;
    public C182288oA A0K;
    public AnonymousClass33p A0L;
    public AnonymousClass7LD A0M;
    public C30721mu A0N;
    public C45142Yv A0O;
    public AnonymousClass5ZQ A0P;
    public C183538qC A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final Handler A0b = new AnonymousClass4MM(Looper.getMainLooper(), this);
    public final PowerManager.WakeLock A0c;
    public final C55682qk A0d;
    public final C69263Wi A0e;
    public final C97114xe A0f;
    public final C113895mA A0g;
    public final C620633i A0h;
    public final C54292oU A0i;
    public final AnonymousClass5ZR A0j;
    public final C106965aS A0k;
    public final C29431io A0l;
    public final AnonymousClass1VX A0m;
    public final C55482qQ A0n;
    public final AnonymousClass5TT A0o;
    public final AnonymousClass4LZ A0p;
    public final AnonymousClass4LY A0q;
    public final C50272hu A0r;
    public final C60312yL A0s;
    public final C183238pi A0t = new C1899493g(this, 0);
    public final C104995Td A0u;
    public final C150637Ro A0v;
    public final AnonymousClass5UH A0w = new C138476qQ(this);
    public final C97124xf A0x;
    public final C183538qC A0y;
    public final boolean A0z;
    public final boolean A10;
    public volatile boolean A11;

    public boolean A0J(int i) {
        float f;
        if (i == 0) {
            f = 1.0f;
        } else if (i == 1) {
            f = 1.5f;
        } else if (i == 2) {
            f = 2.0f;
        } else {
            throw C86604Kt.A0h("setFastPlaybackPlayerState: Did not handle FastPlaybackPlayerState: ", AnonymousClass001.A0o(), i);
        }
        C18260x0.A0y("messageaudioplayer/setFastPlaybackPlayerState fastPlaybackPlayerState: ", AnonymousClass001.A0o(), i);
        AnonymousClass5ZQ r1 = this.A0P;
        if (r1 == null || ((!(r1 instanceof C138036pf) && !(r1 instanceof C138046pg)) || !this.A10)) {
            return true;
        }
        return r1.A0G(this.A0d, f);
    }

    public int A01() {
        AnonymousClass5ZQ r0 = this.A0P;
        if (r0 == null) {
            return 0;
        }
        return Math.max(this.A04, r0.A02());
    }

    public final void A02() {
        AudioManager A0G2 = this.A0h.A0G();
        if (A0G2 != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A0G;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C108155cX(this.A0g);
                this.A0G = onAudioFocusChangeListener;
            }
            A0G2.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public final void A03() {
        C116095pj A002 = this.A0g.A00();
        if (A002 != this && A002 != null) {
            if (this.A0m.A0X(952)) {
                A002.A0H(false, false);
            } else {
                A002.A0H(true, false);
            }
        }
    }

    public final void A04() {
        int i;
        if (this.A0H == null && !this.A0z && this.A0K != null && (i = Build.VERSION.SDK_INT) != 26) {
            if ((i != 28 || !Build.MANUFACTURER.equals("Xiaomi") || !Build.MODEL.equals("Mi 9 Lite")) && this.A0j.A0D()) {
                try {
                    Visualizer visualizer = new Visualizer(0);
                    this.A0H = visualizer;
                    visualizer.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                    this.A0H.setDataCaptureListener(new C108195cb(this), Visualizer.getMaxCaptureRate() / 2, true, true);
                    this.A0H.setEnabled(true);
                } catch (RuntimeException e) {
                    Log.e("visualmediaplayer/start ", e);
                }
            }
        }
    }

    public final void A05() {
        if (this.A0Z) {
            boolean z = this.A0R;
            AnonymousClass5TT r0 = this.A0o;
            if (z) {
                r0.A02(this);
            } else {
                r0.A00();
            }
        }
        C1229466l r02 = this.A0J;
        if (r02 != null && C86634Kw.A1Z(r02, this)) {
            this.A0J.BXi(A01());
        }
        C30721mu r03 = this.A0N;
        int A012 = A01();
        AnonymousClass0x2.A1I(r03.A1J, A13, A012);
        this.A11 = false;
        this.A0p.A05(this);
        this.A0q.A02.remove(this);
        C45142Yv r04 = this.A0O;
        if (r04 != null) {
            r04.A00();
            this.A0O = null;
        }
        A0G(false);
    }

    public final void A06() {
        BluetoothHeadset bluetoothHeadset = this.A0p.A01;
        AudioManager A0G2 = this.A0h.A0G();
        PowerManager.WakeLock wakeLock = this.A0c;
        if (wakeLock != null && !wakeLock.isHeld() && !this.A0q.A00 && !A00(bluetoothHeadset, A0G2) && this.A0P.A0F() && !this.A0R) {
            wakeLock.acquire();
            Log.i("messageaudioplayer/startProximityListener acquired proximityWakeLock");
        }
    }

    public final void A07() {
        PowerManager.WakeLock wakeLock = this.A0c;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release(1);
            Log.i("messageaudioplayer/stopproximitylistener released proximityWakeLock");
        }
    }

    public void A08(int i) {
        try {
            AnonymousClass5ZQ r0 = this.A0P;
            if (r0 != null) {
                r0.A0A(i);
            }
            this.A04 = i;
        } catch (IOException e) {
            Log.e((Throwable) e);
        }
    }

    public void A0B(C30721mu r3) {
        Number A0p2 = AnonymousClass0x9.A0p(r3.A1J, A13);
        if (A0p2 != null) {
            A08(A0p2.intValue());
        }
    }

    public void A0C(boolean z) {
        Activity activity;
        float f;
        AnonymousClass5ZQ r0;
        BluetoothHeadset bluetoothHeadset = this.A0p.A01;
        AudioManager A0G2 = this.A0h.A0G();
        if (this.A0q.A00 || A00(bluetoothHeadset, A0G2)) {
            z = false;
        }
        if (this.A0S == z) {
            return;
        }
        if (!z || ((r0 = this.A0P) != null && r0.A0F())) {
            C18260x0.A1E("messageaudioplayer/onearproximity ", AnonymousClass001.A0o(), z);
            this.A0S = z;
            if (this.A0c == null && (activity = this.A0C) != null) {
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (z) {
                    this.A01 = attributes.screenBrightness;
                    f = 0.1f;
                } else {
                    f = this.A01;
                }
                attributes.screenBrightness = f;
                window.setAttributes(attributes);
            }
            C1229466l r02 = this.A0J;
            if (r02 != null) {
                r02.BRl(z);
            }
            AnonymousClass5ZQ r03 = this.A0P;
            if (r03 != null && r03.A0F()) {
                int A022 = this.A0P.A02();
                this.A0P.A06();
                this.A0P = null;
                AnonymousClass33C A002 = C30471mV.A00(this.A0N);
                int i = 3;
                if (z) {
                    i = 0;
                }
                try {
                    this.A02 = i;
                    AnonymousClass5ZQ A003 = AnonymousClass5ZQ.A00(this.A0i, this.A0m, (AnonymousClass5NV) this.A0Q.get(), A002.A0F, i);
                    this.A0P = A003;
                    A003.A0D(this.A0t);
                    Activity activity2 = this.A0C;
                    if (activity2 != null) {
                        activity2.setVolumeControlStream(this.A02);
                    }
                    if (z && A0G2 != null) {
                        A0G2.setSpeakerphoneOn(false);
                    }
                    this.A0P.A05();
                    int max = Math.max(0, A022 - 1000);
                    this.A04 = max;
                    this.A0P.A0A(max);
                    if (z || System.currentTimeMillis() - this.A0B < 1500) {
                        if (!A0J(A12)) {
                            A12 = 0;
                        }
                        this.A0P.A08();
                        return;
                    }
                    this.A0V = true;
                    A05();
                    A07();
                    A02();
                } catch (IOException | IllegalStateException unused) {
                    this.A0e.A0H(R.string.f11nameremoved, 0);
                }
            }
        }
    }

    public void A0D(boolean z) {
        AnonymousClass5ZQ r0 = this.A0P;
        if (r0 != null && r0.A0F()) {
            this.A0P.A04();
            ((C185738uA) this.A0y.get()).Bm6();
            this.A0V = true;
            Visualizer visualizer = this.A0H;
            if (visualizer != null) {
                visualizer.setEnabled(false);
                this.A0H.release();
                this.A0H = null;
            }
            A05();
            A07();
            if (!z) {
                A0F(false);
            } else {
                float min = Math.min(((float) A01()) / ((float) this.A03), 1.0f);
                if (min > this.A00) {
                    this.A00 = min;
                }
            }
        }
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r0 instanceof X.C138026pe) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(boolean r23) {
        /*
            r22 = this;
            r10 = r22
            X.1mu r1 = r10.A0N
            int r0 = r1.A09
            r2 = 1
            if (r0 == r2) goto L_0x000e
            boolean r0 = r10.A0Y
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            X.33C r0 = r1.A01
            if (r0 == 0) goto L_0x000d
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)
            r18 = 0
            if (r0 == 0) goto L_0x0026
            r18 = 5
        L_0x0026:
            X.5ZQ r0 = r10.A0P
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0 instanceof X.C138026pe
            r17 = 3
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            r17 = 5
        L_0x0032:
            int r1 = A12
            if (r1 == r2) goto L_0x011e
            r0 = 2
            r16 = 2
            if (r1 == r0) goto L_0x003d
            r16 = 0
        L_0x003d:
            int r0 = r10.A01()
            float r1 = (float) r0
            int r0 = r10.A03
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r1, r0)
            float r1 = r10.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
            r10.A00 = r2
            r1 = r2
        L_0x0055:
            X.7Ro r11 = r10.A0v
            boolean r13 = r10.A0W
            int r0 = r10.A0A
            r21 = r0
            int r0 = r10.A09
            long r14 = (long) r0
            double r8 = (double) r1
            int r0 = r10.A08
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            X.1mu r2 = r10.A0N
            int r2 = r2.A0B
            long r2 = (long) r2
            long r6 = r4.toMillis(r2)
            boolean r2 = r10.A0Y
            r20 = r2
            int r2 = r10.A05
            long r4 = (long) r2
            boolean r2 = r10.A0X
            r19 = r2
            int r2 = r10.A06
            long r2 = (long) r2
            X.4sc r12 = new X.4sc
            r12.<init>()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12.A01 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r21)
            r12.A06 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r12.A05 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r18)
            r12.A07 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r12.A04 = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r12.A0B = r13
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r12.A03 = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.A0C = r0
            double r0 = (double) r6
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r6
            long r6 = java.lang.Math.round(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r12.A08 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r20)
            r12.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r12.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r12.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r12.A0A = r0
            X.4FV r0 = r11.A00
            r0.BhB(r12)
            r0 = 0
            r10.A00 = r0
            r0 = 0
            r10.A06 = r0
            r10.A05 = r0
            r10.A0X = r0
            r10.A0Y = r0
            if (r23 == 0) goto L_0x000d
            X.1mu r0 = r10.A0N
            X.2z0 r0 = r0.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            boolean r1 = X.C627336j.A0K(r1)
            r4 = 1
            X.33p r3 = r10.A0L
            if (r0 == 0) goto L_0x0112
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r2 = "ptt_fast_playback_broadcast"
        L_0x0109:
            long r0 = X.AnonymousClass0x2.A0B(r0, r2)
            long r0 = r0 + r4
            X.C18260x0.A0M(r3, r2, r0)
            return
        L_0x0112:
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r3)
            if (r1 == 0) goto L_0x011b
            java.lang.String r2 = "ptt_fast_playback_group"
            goto L_0x0109
        L_0x011b:
            java.lang.String r2 = "ptt_fast_playback_individual"
            goto L_0x0109
        L_0x011e:
            r16 = 1
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116095pj.A0F(boolean):void");
    }

    public final void A0G(boolean z) {
        C30721mu r3 = this.A0N;
        AnonymousClass2z0 r2 = r3.A1J;
        if ((r2.A00 instanceof C95804uY) && r3.A0D != 16 && !r2.A02) {
            if (!z) {
                if (((long) A01()) <= Math.min(C18290x4.A0A(r3.A0B), 3000)) {
                    return;
                }
            }
            this.A0n.A03(this.A0N);
        }
    }

    public void A0H(boolean z, boolean z2) {
        boolean z3;
        AnonymousClass7LD r0;
        int i;
        C182278o9 r1;
        SensorEventListener sensorEventListener;
        Sensor sensor;
        AnonymousClass5ZQ r02;
        if (this.A03 == A01() || A01() + 50 > this.A03 || ((r02 = this.A0P) != null && r02.A0E())) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("messageaudioplayer/stop playbackCompleted: ");
        A0o2.append(z3);
        A0o2.append(" duration: ");
        A0o2.append(this.A03);
        A0o2.append(" position: ");
        C18260x0.A1G(A0o2, A01());
        A0F(z3);
        C185738uA r2 = (C185738uA) this.A0y.get();
        if (z3) {
            r2.BjM(this.A0N.A1L);
        } else {
            r2.Bm6();
        }
        AnonymousClass5ZQ r03 = this.A0P;
        if (r03 != null) {
            r03.A06();
            this.A0P = null;
        }
        Visualizer visualizer = this.A0H;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            this.A0H.release();
            this.A0H = null;
        }
        if (this.A0c != null || !this.A0S) {
            SensorManager sensorManager = this.A0F;
            if (!(sensorManager == null || (sensorEventListener = this.A0E) == null || (sensor = this.A0D) == null)) {
                sensorManager.unregisterListener(sensorEventListener, sensor);
                this.A0F = null;
            }
            A07();
        }
        A02();
        Activity activity = this.A0C;
        if (activity != null) {
            activity.setVolumeControlStream(Integer.MIN_VALUE);
        }
        if (z) {
            this.A04 = 0;
        }
        this.A0V = false;
        this.A0b.removeMessages(0);
        if (z3 && (r1 = this.A0I) != null) {
            r1.BYC(this.A02);
        }
        C113895mA r8 = this.A0g;
        if (r8.A00 == this) {
            if (this.A0Z) {
                boolean z4 = this.A0T;
                AnonymousClass5TT r6 = this.A0o;
                if (!z4) {
                    r6.A00();
                } else if (!r6.A04) {
                    RemoteViews remoteViews = new RemoteViews(r6.A0E.A00.getPackageName(), R.layout.f8nameremoved);
                    int i2 = this.A03;
                    remoteViews.setProgressBar(R.id.ongoing_media_audio_seekbar, i2, i2, false);
                    remoteViews.setTextViewText(R.id.ongoing_media_timeLeft, DateUtils.formatElapsedTime((long) (this.A03 / 1000)));
                    r6.A01(remoteViews, true);
                } else if (!r6.A05) {
                    r6.A01(new RemoteViews(r6.A0E.A00.getPackageName(), R.layout.f8nameremoved), true);
                    r6.A06 = false;
                }
            }
            C1229466l r04 = this.A0J;
            if (r04 != null && C86634Kw.A1Z(r04, this)) {
                if (this.A0N.A0B != 0) {
                    i = this.A0N.A0B * 1000;
                } else {
                    i = this.A03;
                }
                this.A0J.Bcm(i, z);
            }
            if (z) {
                A13.remove(this.A0N.A1J);
            }
            this.A0x.A07(this.A0w);
            this.A0p.A05(this);
            this.A0q.A02.remove(this);
            this.A11 = false;
            C45142Yv r05 = this.A0O;
            if (r05 != null) {
                r05.A00();
                this.A0O = null;
            }
        }
        r8.A08((C116095pj) null);
        if (z2 && (r0 = this.A0M) != null) {
            View view = r0.A00;
            C113895mA r12 = r0.A01;
            C183538qC r06 = r0.A02;
            if (view == null) {
                C107465bM.A09(r12, r06);
            } else {
                C107465bM.A04(view, r12, r06);
            }
        }
        A0G(z3);
        this.A0k.A03("PttPlayback", "End");
    }

    public boolean A0I() {
        AnonymousClass5ZQ r0 = this.A0P;
        if (r0 == null || !r0.A0F()) {
            return false;
        }
        return true;
    }

    public void BNj(int i) {
        if (i == 0) {
            A06();
        } else if (i == 2) {
            A07();
        }
    }

    public void BUH(boolean z) {
        if (z) {
            A07();
        } else {
            A06();
        }
    }

    public C116095pj(Activity activity, C55682qk r5, C69263Wi r6, C97114xe r7, C113895mA r8, C620633i r9, C54292oU r10, AnonymousClass5ZR r11, AnonymousClass33p r12, C106965aS r13, C29431io r14, AnonymousClass1VX r15, C55482qQ r16, AnonymousClass5TT r17, AnonymousClass4LZ r18, AnonymousClass4LY r19, C50272hu r20, C60312yL r21, C104995Td r22, C150637Ro r23, C97124xf r24, C183538qC r25, C183538qC r26, boolean z, boolean z2) {
        this.A0C = activity;
        this.A0i = r10;
        this.A0m = r15;
        this.A0e = r6;
        this.A0d = r5;
        this.A0u = r22;
        this.A0h = r9;
        this.A0s = r21;
        this.A0l = r14;
        this.A0v = r23;
        this.A0x = r24;
        this.A0j = r11;
        this.A0L = r12;
        this.A0f = r7;
        this.A0p = r18;
        this.A0o = r17;
        this.A0q = r19;
        this.A0g = r8;
        this.A0n = r16;
        this.A0r = r20;
        this.A0k = r13;
        this.A0y = r25;
        this.A0Z = z;
        this.A0z = z2;
        this.A0Q = r26;
        PowerManager A0J2 = r9.A0J();
        if (A0J2 == null) {
            Log.w("messageaudioplayer pm=null");
        } else {
            this.A0c = AnonymousClass75K.A00(A0J2, "WhatsApp MessageAudioPlayer ProximityWakeLock", 32);
        }
        this.A10 = AnonymousClass5ZQ.A01(r15);
    }

    public static boolean A00(BluetoothHeadset bluetoothHeadset, AudioManager audioManager) {
        AudioDeviceInfo communicationDevice;
        try {
            if (C107385bE.A09()) {
                if (audioManager == null || (communicationDevice = audioManager.getCommunicationDevice()) == null) {
                    return false;
                }
                int type = communicationDevice.getType();
                if (type == 7 || type == 8 || type == 26) {
                    return true;
                }
                return false;
            } else if (bluetoothHeadset == null) {
                return false;
            } else {
                for (BluetoothDevice bluetoothClass : bluetoothHeadset.getConnectedDevices()) {
                    if (bluetoothClass.getBluetoothClass().getMajorDeviceClass() != 1024) {
                    }
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            Log.e((Throwable) e);
            return false;
        }
    }

    public void A09(int i, boolean z, boolean z2) {
        byte b;
        String A0X2;
        int BBm;
        A03();
        this.A0s.A00();
        if (this.A0C != null && !this.A0u.A02(R.string.f11nameremoved)) {
            this.A0C.setVolumeControlStream(3);
        }
        AudioManager A0G2 = this.A0h.A0G();
        if (A0G2 != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A0G;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C108155cX(this.A0g);
                this.A0G = onAudioFocusChangeListener;
            }
            int i2 = 1;
            if (this.A0N.A09 == 1) {
                i2 = 3;
            }
            A0G2.requestAudioFocus(onAudioFocusChangeListener, 3, i2);
        }
        this.A0W = false;
        this.A0B = System.currentTimeMillis();
        if (this.A0P == null) {
            Log.i("messageaudioplayer/start");
            this.A0k.A03("PttPlayback", "Resume");
            try {
                File A012 = C30471mV.A01(this.A0N);
                if (A012 != null) {
                    this.A02 = 3;
                    AnonymousClass5ZQ A002 = AnonymousClass5ZQ.A00(this.A0i, this.A0m, (AnonymousClass5NV) this.A0Q.get(), A012, 3);
                    this.A0P = A002;
                    A002.A0D(this.A0t);
                    A002.A05();
                    if (!A0J(i)) {
                        A12 = 0;
                    }
                    if (z && (BBm = ((C185738uA) this.A0y.get()).BBm(this.A0N.A1L)) >= 0) {
                        this.A04 = BBm;
                    }
                    this.A0P.A0A(this.A04);
                    this.A0P.A08();
                    AnonymousClass5ZQ r1 = this.A0P;
                    if ((r1 instanceof C138036pf) || (r1 instanceof C138046pg)) {
                        this.A03 = this.A0N.A0B * 1000;
                        this.A0P.A0C(new C147237Di(this));
                    } else {
                        this.A03 = r1.A03();
                    }
                    this.A0b.sendEmptyMessage(0);
                    if (AnonymousClass34P.A02(this.A0N)) {
                        this.A0l.A0C(this.A0N, 25);
                    }
                    A04();
                    if (this.A0Z) {
                        AnonymousClass5TT r10 = this.A0o;
                        C30721mu r9 = this.A0N;
                        if (r9 != null && ((b = r9.A1I) == 2 || b == 82)) {
                            boolean z3 = true;
                            if (r10.A02 != r9) {
                                r10.A02 = r9;
                                Bitmap bitmap = null;
                                r10.A03 = null;
                                Context context = r10.A0E.A00;
                                C05610Ue A013 = C66553Lw.A01(context);
                                A013.A0K = "media_playback@1";
                                A013.A08(new NotificationCompat$DecoratedCustomViewStyle());
                                A013.A0W = false;
                                r10.A01 = A013;
                                A013.A0X = true;
                                AnonymousClass33T.A02(A013, R.drawable.notifybar);
                                int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
                                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(17104902);
                                AnonymousClass2z0 r12 = r9.A1J;
                                if (r12.A02) {
                                    AnonymousClass1RR A014 = C56972sr.A01(r10.A07);
                                    if (A014 != null) {
                                        bitmap = r10.A0B.A03(context, A014, dimensionPixelSize, dimensionPixelSize2);
                                    }
                                    int i3 = r9.A09;
                                    int i4 = R.string.f11nameremoved;
                                    if (i3 == 1) {
                                        i4 = R.string.f11nameremoved;
                                    }
                                    A0X2 = context.getString(i4);
                                } else {
                                    C64773Ex r4 = r10.A09;
                                    C95814uZ r13 = r12.A00;
                                    if (!(r13 instanceof C95804uY)) {
                                        r13 = r9.A0o();
                                    }
                                    C626936e.A06(r13);
                                    AnonymousClass3ZH A0A2 = r4.A0A(r13);
                                    bitmap = r10.A0B.A03(context, A0A2, dimensionPixelSize, dimensionPixelSize2);
                                    String A0h2 = C18300x5.A0h(r10.A0A, A0A2);
                                    int i5 = r9.A09;
                                    int i6 = R.string.f11nameremoved;
                                    if (i5 == 1) {
                                        i6 = R.string.f11nameremoved;
                                    }
                                    A0X2 = AnonymousClass0x2.A0X(context, A0h2, 1, i6);
                                }
                                r10.A03 = A0X2;
                                if (bitmap == null) {
                                    bitmap = r10.A08.A02(context, (float) dimensionPixelSize2, R.drawable.avatar_contact, dimensionPixelSize);
                                }
                                r10.A01.A06(bitmap);
                            }
                            r10.A02 = r9;
                            AccessibilityManager A0P2 = r10.A0D.A0P();
                            if (A0P2 == null || !A0P2.isTouchExplorationEnabled()) {
                                z3 = false;
                            }
                            r10.A04 = z3;
                            r10.A06 = false;
                            r10.A05 = false;
                        }
                        r10.A02(this);
                    }
                    C1229466l r0 = this.A0J;
                    if (r0 != null && C86634Kw.A1Z(r0, this)) {
                        this.A0J.Bc6(this.A03);
                    }
                    A13.remove(this.A0N.A1J);
                    this.A0x.A06(this.A0w);
                    this.A0p.A04(this);
                    this.A0q.A02.add(this);
                    this.A0f.A08(this.A0N);
                    this.A11 = true;
                    this.A0O = this.A0r.A00(4);
                    A0A(this);
                    this.A0g.A09(this, z2);
                    return;
                }
            } catch (IOException | IllegalStateException e) {
                this.A0d.A0A("messageaudioplayer/failed to prepare mediaplayer", true, e.toString());
                throw e;
            } catch (IOException | IllegalStateException e2) {
                Log.e(e2);
            }
            this.A0e.A0H(R.string.f11nameremoved, 0);
            this.A0W = true;
            A0H(true, false);
            return;
        }
        Log.i("messageaudioplayer/resume");
        try {
            this.A0P.A0A(this.A04);
            if (!A0J(i)) {
                A12 = 0;
            }
            this.A0P.A08();
            this.A0V = false;
            this.A0b.sendEmptyMessage(0);
            A0A(this);
            A04();
            if (this.A0Z) {
                this.A0o.A02(this);
            }
            C1229466l r02 = this.A0J;
            if (r02 != null && C86634Kw.A1Z(r02, this)) {
                this.A0J.BaX();
            }
            A13.remove(this.A0N.A1J);
            this.A0f.A08(this.A0N);
            this.A11 = true;
            this.A0p.A04(this);
            this.A0q.A02.add(this);
            this.A0O = this.A0r.A00(4);
        } catch (IOException | IllegalStateException unused) {
            this.A0e.A0H(R.string.f11nameremoved, 0);
            this.A0W = true;
            A0H(true, false);
        }
    }

    public final void A0A(C116095pj r5) {
        A06();
        if (this.A0F == null) {
            SensorManager A0D2 = this.A0h.A0D();
            this.A0F = A0D2;
            if (A0D2 != null) {
                Sensor defaultSensor = A0D2.getDefaultSensor(8);
                this.A0D = defaultSensor;
                if (defaultSensor != null) {
                    C108115cR r2 = new C108115cR(this, r5);
                    this.A0E = r2;
                    this.A0F.registerListener(r2, defaultSensor, 2);
                }
            }
        }
    }

    public void A0E(boolean z) {
        int i;
        A03();
        AnonymousClass5ZQ r0 = this.A0P;
        if (r0 == null || !r0.A0F()) {
            if (z) {
                i = A12;
            } else {
                i = 0;
            }
            A09(i, true, false);
            return;
        }
        A0D(false);
    }
}
