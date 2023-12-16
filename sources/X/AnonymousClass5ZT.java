package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.audioRecording.AudioRecordFactory;
import com.whatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.util.ClippingLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5ZT  reason: invalid class name */
public class AnonymousClass5ZT {
    public static int A1W;
    public static int A1X;
    public static int A1Y;
    public static int A1Z;
    public static int A1a;
    public static SoundPool A1b;
    public static volatile int A1c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public ObjectAnimator A09;
    public Handler A0A;
    public PowerManager.WakeLock A0B;
    public AnonymousClass1Hk A0C;
    public C105845Wq A0D;
    public C95814uZ A0E;
    public C135406kc A0F;
    public C624134x A0G;
    public C18840yL A0H;
    public C45142Yv A0I;
    public C45142Yv A0J;
    public AnonymousClass5ZQ A0K;
    public AnonymousClass5TQ A0L;
    public File A0M;
    public File A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final Rect A0S;
    public final Handler A0T;
    public final Handler A0U;
    public final View A0V;
    public final View A0W;
    public final View A0X;
    public final View A0Y;
    public final TextView A0Z;
    public final C003203q A0a;
    public final C378124c A0b = new C378124c(0.0d);
    public final C378124c A0c;
    public final C55682qk A0d;
    public final AnonymousClass4FU A0e;
    public final C64393Dh A0f;
    public final C69263Wi A0g;
    public final C621033m A0h;
    public final AudioRecordFactory A0i;
    public final OpusRecorderFactory A0j;
    public final AnonymousClass498 A0k;
    public final C29401il A0l;
    public final C113895mA A0m;
    public final AnonymousClass4VH A0n;
    public final C47892e0 A0o;
    public final C620633i A0p;
    public final C56612sH A0q;
    public final AnonymousClass33p A0r;
    public final C620733j A0s;
    public final C106965aS A0t;
    public final AnonymousClass2WH A0u;
    public final AnonymousClass1VX A0v;
    public final C55972rD A0w;
    public final C56232re A0x;
    public final AnonymousClass3LQ A0y;
    public final C60152y5 A0z;
    public final C45452a2 A10;
    public final C55612qd A11;
    public final C105235Uc A12;
    public final C50272hu A13;
    public final C183238pi A14;
    public final C104995Td A15;
    public final C45592aG A16;
    public final ClippingLayout A17;
    public final ClippingLayout A18;
    public final C187958y5 A19;
    public final AnonymousClass4FS A1A;
    public final C105215Ua A1B;
    public final C45182Yz A1C;
    public final C116635qb A1D;
    public final C97124xf A1E;
    public final C103505Nf A1F;
    public final AnonymousClass5T5 A1G;
    public final C185168tC A1H;
    public final AnonymousClass5H0 A1I;
    public final C102405Is A1J;
    public final C1227465o A1K;
    public final C185958uW A1L;
    public final C97094xc A1M;
    public final C183538qC A1N;
    public final Runnable A1O;
    public final Runnable A1P;
    public final AtomicInteger A1Q;
    public final boolean A1R;
    public final boolean A1S;
    public final boolean A1T;
    public final boolean A1U;
    public final boolean A1V;

    public void A04() {
        A0Q(false);
        A0S(false, false);
        this.A0T.removeCallbacks(this.A1P);
        if (this.A0K != null) {
            A06();
            this.A0K.A06();
            this.A0K = null;
        }
        this.A1M.A07(this.A1L);
    }

    public void A0P(boolean z) {
        File file = this.A0M;
        if (file != null) {
            this.A1C.A00(file);
            File file2 = this.A0M;
            A0L(file2, this.A0N, file2.length(), z);
            this.A0M = null;
            if (A1Z != 0) {
                ((AnonymousClass54I) this.A1N.get()).A05(A1b, 1.0f, 1.0f, A1Z);
            }
            this.A0N = null;
        }
    }

    public void A0S(boolean z, boolean z2) {
        A0T(z, z2, true, false);
    }

    public static void A00(AnonymousClass5ZT r3) {
        C116635qb r1 = r3.A1D;
        r1.A0B.setVisibility(8);
        r1.A09.setVisibility(8);
        VoiceVisualizer voiceVisualizer = r1.A0G;
        voiceVisualizer.A0I.clear();
        voiceVisualizer.A0A = false;
        voiceVisualizer.A06 = 0;
        voiceVisualizer.A07 = 166;
    }

    public static /* synthetic */ void A01(AnonymousClass5ZT r3) {
        AnonymousClass5ZQ r2 = r3.A0K;
        if (r2 != null) {
            try {
                int i = r3.A04;
                if (i != -1) {
                    r2.A0A(i);
                    if (r3.A0K.A0F()) {
                        r3.A0T.post(r3.A1P);
                        r3.A09();
                    }
                }
            } catch (IOException e) {
                C18260x0.A16("Error resuming playback after seek ", AnonymousClass001.A0o(), e);
            }
        }
    }

    public static /* synthetic */ void A02(AnonymousClass5ZT r4, int i, boolean z) {
        AnonymousClass5ZQ r0 = r4.A0K;
        if (r0 != null && z) {
            r4.A04 = i;
            if (i == 0 && !r0.A0F()) {
                i = r4.A0K.A03();
            }
            C116635qb r2 = r4.A1D;
            C107565bW.A0I(r2.A02, r2.A0H, C18290x4.A0B((long) i));
            if (!r4.A0K.A0F()) {
                r4.A0A();
            }
        }
    }

    public final Handler A03() {
        Handler handler = this.A0A;
        if (handler != null) {
            return handler;
        }
        HandlerThread handlerThread = new HandlerThread("VoiceRecorderHandler");
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        this.A0A = handler2;
        return handler2;
    }

    public void A05() {
        if (A0U()) {
            AnonymousClass5TQ r2 = this.A0L;
            if (r2 == null) {
                Log.e("VoiceNoteRecordingUI/pauseRecording/voice recorder ir null");
                return;
            }
            try {
                OpusRecorder opusRecorder = r2.A06;
                opusRecorder.pause();
                r2.A01 = opusRecorder.getPageNumber();
                try {
                    this.A0L.A01();
                } catch (IOException e) {
                    Log.e("VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed", e);
                }
                this.A1G.A03 = true;
                long elapsedRealtime = (SystemClock.elapsedRealtime() - this.A06) + this.A05;
                this.A05 = elapsedRealtime;
                if (elapsedRealtime < 1000) {
                    A0S(false, false);
                    return;
                }
                ((AnonymousClass54I) this.A1N.get()).A05(A1b, 1.0f, 1.0f, A1X);
                C620633i r3 = this.A0p;
                AnonymousClass29U.A00(r3);
                C18840yL r1 = this.A0H;
                if (r1 != null) {
                    synchronized (r1) {
                        r1.A00.quit();
                    }
                    this.A0H = null;
                }
                Handler handler = this.A0A;
                if (handler != null) {
                    handler.getLooper().quitSafely();
                    this.A0A = null;
                }
                this.A15.A00();
                if (this.A1S) {
                    this.A0a.setRequestedOrientation(-1);
                }
                this.A0U.removeCallbacksAndMessages((Object) null);
                C116635qb r5 = this.A1D;
                r5.A0L.clear();
                AnonymousClass5TQ r0 = this.A0L;
                A0M(r0.A08, r0.A09, false, true);
                this.A0u.A00 = false;
                this.A1E.A08();
                VoiceVisualizer voiceVisualizer = r5.A0G;
                voiceVisualizer.A0A = false;
                voiceVisualizer.A06 = 0;
                voiceVisualizer.A07 = 166;
                C45142Yv r02 = this.A0J;
                if (r02 != null) {
                    r02.A00();
                    this.A0J = null;
                }
                C003203q r12 = this.A0a;
                C107295b4.A00(r12, r3, r12.getString(R.string.f11nameremoved));
            } catch (IOException e2) {
                Log.e("VoiceNoteRecordingUI/pauseRecording/pause failed", e2);
                try {
                    this.A0L.A01();
                } catch (IOException e3) {
                    Log.e("VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed", e3);
                }
            } catch (Throwable th) {
                try {
                    this.A0L.A01();
                    throw th;
                } catch (IOException e4) {
                    Log.e("VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed", e4);
                    throw th;
                }
            }
        }
    }

    public void A06() {
        AnonymousClass5ZQ r0 = this.A0K;
        if (r0 != null && r0.A0F()) {
            this.A0K.A04();
            this.A15.A00();
            C45142Yv r02 = this.A0I;
            if (r02 != null) {
                r02.A00();
                this.A0I = null;
            }
        }
        A0A();
        this.A0T.removeCallbacks(this.A1P);
    }

    public final void A07() {
        View view = this.A0Y;
        C86644Kx.A0x(view, R.id.voice_note_pulse);
        ObjectAnimator objectAnimator = this.A09;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        if (A1a != 0) {
            ((AnonymousClass54I) this.A1N.get()).A05(A1b, 1.0f, 1.0f, A1a);
        }
        View findViewById = view.findViewById(R.id.voice_cancel_trashcan);
        findViewById.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(213);
        translateAnimation.setStartOffset(640);
        translateAnimation.setFillBefore(true);
        findViewById.startAnimation(translateAnimation);
        View findViewById2 = view.findViewById(R.id.voice_cancel_animation);
        findViewById2.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator(1.1f));
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.0f);
        translateAnimation2.setDuration(640);
        translateAnimation2.setRepeatMode(2);
        translateAnimation2.setRepeatCount(1);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(640);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.61f, 1.0f, 0.61f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(320);
        scaleAnimation.setStartOffset(960);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation2);
        View findViewById3 = view.findViewById(R.id.voice_cancel_trashcan_lid);
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, -0.3f, 1, 0.0f, 1, 0.0f);
        translateAnimation3.setDuration(160);
        translateAnimation3.setStartOffset(746);
        translateAnimation3.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, -60.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(160);
        rotateAnimation2.setStartOffset(746);
        rotateAnimation2.setFillAfter(true);
        animationSet2.addAnimation(rotateAnimation2);
        animationSet2.addAnimation(translateAnimation3);
        animationSet2.setFillAfter(true);
        findViewById3.setVisibility(0);
        findViewById3.startAnimation(animationSet2);
        boolean A0X2 = this.A0v.A0X(4268);
        int i = R.id.emoji_picker_btn;
        if (A0X2) {
            i = R.id.input_attach_button_left;
        }
        View findViewById4 = view.findViewById(i);
        findViewById4.setVisibility(4);
        findViewById2.startAnimation(animationSet);
        animationSet.setAnimationListener(new C88794ao(findViewById2, findViewById, findViewById3, findViewById4, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        com.whatsapp.util.Log.e("VoiceNoteRecordingUI/resumeRecording/resume failed", r1);
        A0S(false, false);
        r6.A0e.Bot(com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00be, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r6 = this;
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeVoiceNoteRecording"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5TQ r2 = r6.A0L
            if (r2 != 0) goto L_0x000f
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeVoiceNoteRecording/resume voice recorder is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000f:
            X.5Uc r1 = r6.A12
            r0 = 1
            r1.A08 = r0
            X.5qb r5 = r6.A1D
            java.io.File r2 = r2.A09
            X.4FS r1 = r5.A0K
            r0 = 8
            X.C86624Kv.A1N(r1, r5, r2, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A06 = r0
            X.5ZQ r0 = r6.A0K
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0034
            X.5ZQ r0 = r6.A0K
            r0.A09()
        L_0x0034:
            r4 = 0
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeVoiceNoteRecording/start VoiceRecorder"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ IOException -> 0x00ad }
            r6.A0C()     // Catch:{ IOException -> 0x00ad }
            boolean r0 = r6.A1S     // Catch:{ IOException -> 0x00ad }
            if (r0 == 0) goto L_0x0046
            X.03q r0 = r6.A0a     // Catch:{ IOException -> 0x00ad }
            X.AnonymousClass5CI.A00(r0)     // Catch:{ IOException -> 0x00ad }
        L_0x0046:
            X.2WH r0 = r6.A0u     // Catch:{ IOException -> 0x00ad }
            r3 = 1
            r0.A00 = r3     // Catch:{ IOException -> 0x00ad }
            android.view.animation.AlphaAnimation r2 = X.C86604Kt.A0G()     // Catch:{ IOException -> 0x00ad }
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)     // Catch:{ IOException -> 0x00ad }
            r0 = 17
            X.C1232467r.A00(r2, r5, r0)     // Catch:{ IOException -> 0x00ad }
            X.5UY r0 = r5.A0J     // Catch:{ IOException -> 0x00ad }
            android.view.View r0 = r0.A04()     // Catch:{ IOException -> 0x00ad }
            r0.startAnimation(r2)     // Catch:{ IOException -> 0x00ad }
            android.view.animation.Animation r2 = X.AnonymousClass5CJ.A00(r4)     // Catch:{ IOException -> 0x00ad }
            android.view.animation.Animation r1 = X.AnonymousClass5CJ.A00(r3)     // Catch:{ IOException -> 0x00ad }
            X.4aq r0 = new X.4aq     // Catch:{ IOException -> 0x00ad }
            r0.<init>(r1, r5, r4)     // Catch:{ IOException -> 0x00ad }
            r2.setAnimationListener(r0)     // Catch:{ IOException -> 0x00ad }
            r0 = 14
            X.C1232467r.A00(r1, r5, r0)     // Catch:{ IOException -> 0x00ad }
            android.widget.ImageButton r0 = r5.A0D     // Catch:{ IOException -> 0x00ad }
            r0.startAnimation(r2)     // Catch:{ IOException -> 0x00ad }
            X.24c r3 = r6.A0c     // Catch:{ IOException -> 0x00ad }
            X.5TQ r2 = r6.A0L     // Catch:{ IOException -> 0x00ad }
            java.lang.String r1 = "PushToTalkVoiceVisualizerHandler"
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch:{ IOException -> 0x00ad }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00ad }
            r0.start()     // Catch:{ IOException -> 0x00ad }
            X.0yL r1 = new X.0yL     // Catch:{ IOException -> 0x00ad }
            r1.<init>(r0, r3, r2)     // Catch:{ IOException -> 0x00ad }
            r6.A0H = r1     // Catch:{ IOException -> 0x00ad }
            monitor-enter(r1)     // Catch:{ IOException -> 0x00ad }
            r1.sendEmptyMessage(r4)     // Catch:{ all -> 0x00aa }
            monitor-exit(r1)     // Catch:{ IOException -> 0x00ad }
            android.os.Handler r0 = r6.A0U     // Catch:{ IOException -> 0x00ad }
            r0.sendEmptyMessage(r4)     // Catch:{ IOException -> 0x00ad }
            X.03q r2 = r6.A0a     // Catch:{ IOException -> 0x00ad }
            X.33i r1 = r6.A0p     // Catch:{ IOException -> 0x00ad }
            r0 = 2131895226(0x7f1223ba, float:1.942528E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ IOException -> 0x00ad }
            X.C107295b4.A00(r2, r1, r0)     // Catch:{ IOException -> 0x00ad }
            return
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x00ad }
            throw r0     // Catch:{ IOException -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeRecording/resume failed"
            com.whatsapp.util.Log.e(r0, r1)
            r6.A0S(r4, r4)
            X.4FU r1 = r6.A0e
            r0 = 2131889123(0x7f120be3, float:1.94129E38)
            r1.Bot(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZT.A08():void");
    }

    public final void A09() {
        C116635qb r3 = this.A1D;
        r3.A0J.A04();
        r3.A01.setImageResource(R.drawable.inline_audio_pause);
        C18300x5.A13(r3.A05, r3.A01, R.string.f11nameremoved);
    }

    public final void A0A() {
        C116635qb r3 = this.A1D;
        r3.A0J.A04();
        ImageButton imageButton = r3.A01;
        Context context = r3.A05;
        C18290x4.A1A(context, imageButton, R.drawable.inline_audio_play);
        C18300x5.A13(context, r3.A01, R.string.f11nameremoved);
    }

    public final void A0B() {
        boolean z;
        int i;
        if (this.A0K != null) {
            C116635qb r2 = this.A1D;
            if (C86604Kt.A1Y(r2.A04)) {
                if (r2.A04.getProgress() != 0 || this.A0K.A0F()) {
                    z = false;
                    i = r2.A04.getProgress();
                } else {
                    z = true;
                    i = r2.A04.getMax();
                }
            } else if (r2.A03.getVisibility() != 0) {
                z = true;
                i = 0;
            } else if (r2.A03.A00 != 0.0f || this.A0K.A0F()) {
                z = false;
                i = this.A0K.A02();
            } else {
                z = true;
                i = this.A0K.A03();
            }
            C003203q r7 = this.A0a;
            int i2 = R.string.f11nameremoved;
            if (z) {
                i2 = R.string.f11nameremoved;
            }
            String A0F2 = AnonymousClass002.A0F(r7, C107565bW.A0B(this.A0s, (long) i), new Object[1], 0, i2);
            r2.A04.setContentDescription(A0F2);
            r2.A03.setContentDescription(A0F2);
        }
    }

    public final void A0C() {
        AnonymousClass5TQ r1 = this.A0L;
        if (r1 != null) {
            r1.A06.start();
            AudioRecord audioRecord = r1.A03;
            if (audioRecord.getState() == 1) {
                audioRecord.startRecording();
            }
            C69263Wi r3 = this.A0g;
            C97124xf r2 = this.A1E;
            Objects.requireNonNull(r2);
            r3.BkS(new C117105rO(r2, 12));
            this.A0J = this.A13.A00(3);
        }
    }

    public final void A0D() {
        if (this.A1R) {
            C105235Uc r0 = this.A12;
            r0.A0D.removeCallbacks(r0.A0S);
            View view = this.A0Y;
            if (view != null && view.getKeepScreenOn()) {
                view.setKeepScreenOn(false);
            }
            if (this.A0O) {
                this.A0O = false;
                this.A0l.A07(this.A0k);
            }
        }
    }

    public final void A0F(AnonymousClass5TQ r7, long j, boolean z) {
        try {
            Log.d("voicenote/stopandreleasevoicerecorder/stop begin");
            OpusRecorder opusRecorder = r7.A06;
            opusRecorder.stop();
            r7.A01 = opusRecorder.getPageNumber();
        } catch (Exception e) {
            if (!z || j < 1000) {
                C18260x0.A1R(AnonymousClass001.A0o(), "voicenote/stopandreleasevoicerecorder/stop ", e);
            } else {
                Log.e("voicenote/stopandreleasevoicerecorder/stop ", e);
            }
        } catch (Throwable th) {
            Log.d("voicenote/stopandreleasevoicerecorder/stopAudioRecordAndVisualization begin");
            this.A11.A02(r7, j, z);
            throw th;
        }
        Log.d("voicenote/stopandreleasevoicerecorder/stopAudioRecordAndVisualization begin");
        this.A11.A02(r7, j, z);
        try {
            Log.d("voicenote/stopandreleasevoicerecorder/release begin");
            r7.A06.close();
            r7.A03.release();
        } catch (Exception e2) {
            Log.e("voicenote/stopandreleasevoicerecorder/release", e2);
        }
        Log.d("voicenote/stopandreleasevoicerecorder/record external event begin");
        C45142Yv r0 = this.A0J;
        if (r0 != null) {
            r0.A00();
            this.A0J = null;
        }
        C18840yL r1 = this.A0H;
        if (r1 != null) {
            synchronized (r1) {
                r1.A00.quit();
            }
            this.A0H = null;
        }
        Handler handler = this.A0A;
        if (handler != null) {
            handler.getLooper().quit();
            this.A0A = null;
        }
    }

    public final void A0G(File file) {
        this.A1A.BkM(new C117105rO(file, 13));
    }

    public final void A0H(File file) {
        Log.d("VoiceNoteRecordingUI/showVoiceNotePreview/");
        C626936e.A06(file);
        try {
            AnonymousClass5ZQ r0 = this.A0K;
            if (r0 != null) {
                r0.A06();
            }
            AnonymousClass5ZQ A002 = AnonymousClass5ZQ.A00((C54292oU) null, (AnonymousClass1VX) null, (AnonymousClass5NV) null, file, 3);
            this.A0K = A002;
            A002.A05();
            this.A0K.A0D(this.A14);
        } catch (IOException e) {
            this.A0K = null;
            Log.e("voicenoterecordingui/prepareVoiceNoteDraftPlayer/ error creating audio player for voice note preview ", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r37 != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r8 > 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ac, code lost:
        if (r37 != false) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(java.io.File r31, java.io.File r32, long r33, long r35, boolean r37, boolean r38, boolean r39, boolean r40) {
        /*
            r30 = this;
            r4 = r35
            java.lang.String r0 = "voicenote/stopandreleasevoicerecorder/continueStopOnVoiceRecorderRelease"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r11 = r30
            r0 = r40
            r11.A0R(r0)
            X.4xf r0 = r11.A1E
            r0.A08()
            r10 = 0
            r11.A0Q = r10
            r0 = 99
            r14 = 1000(0x3e8, double:4.94E-321)
            r2 = r33
            int r8 = (r33 > r0 ? 1 : (r33 == r0 ? 0 : -1))
            r12 = r32
            if (r8 > 0) goto L_0x01ac
            if (r37 == 0) goto L_0x0031
            int r0 = (r35 > r14 ? 1 : (r35 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voicenote/file too small; not sending; voiceNoteFileLength="
            X.C18260x0.A11(r0, r1, r2)
        L_0x0031:
            int r0 = (r35 > r14 ? 1 : (r35 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x018f
            if (r38 == 0) goto L_0x0178
            r11.A07()
        L_0x003a:
            if (r37 == 0) goto L_0x0042
        L_0x003c:
            int r0 = (r35 > r14 ? 1 : (r35 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0042
            if (r8 > 0) goto L_0x0049
        L_0x0042:
            X.6kc r0 = r11.A0F
            if (r0 == 0) goto L_0x0049
            r11.A0I(r12, r10, r10)
        L_0x0049:
            X.2WH r0 = r11.A0u
            r0.A00 = r10
            r0 = 0
            r11.A0L = r0
            X.03q r1 = r11.A0a
            r0 = -1
            r1.setRequestedOrientation(r0)
            X.5Td r0 = r11.A15
            r0.A00()
            android.os.PowerManager$WakeLock r1 = r11.A0B
            if (r1 == 0) goto L_0x0068
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x0068
            r1.release()
        L_0x0068:
            X.33i r0 = r11.A0p
            X.AnonymousClass29U.A00(r0)
            r13 = 1
            r29 = r31
            if (r37 == 0) goto L_0x0119
            int r0 = (r35 > r14 ? 1 : (r35 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x012f
            if (r8 <= 0) goto L_0x012f
            r0 = 50
            android.os.SystemClock.sleep(r0)
            X.8qC r0 = r11.A1N
            java.lang.Object r7 = r0.get()
            X.54I r7 = (X.AnonymousClass54I) r7
            android.media.SoundPool r6 = A1b
            int r1 = A1Z
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A05(r6, r0, r0, r1)
            X.5T5 r1 = r11.A1G
            X.5Uc r0 = r11.A12
            boolean r0 = r0.A08
            r17 = r2
            r19 = r4
            r21 = r0
            r16 = r1
            r16.A01(r17, r19, r21)
            X.2Yz r1 = r11.A1C
            java.io.File r0 = r11.A0M
            r1.A00(r0)
            X.6kc r0 = r11.A0F
            if (r0 == 0) goto L_0x010e
            long r4 = r35 / r14
            int r0 = (int) r4
            r11.A0I(r12, r0, r13)
        L_0x00b0:
            X.8tC r1 = r11.A1H
            X.6BV r1 = (X.AnonymousClass6BV) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x00e3;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 4
            r1.A79(r0)
        L_0x00c1:
            int r1 = r11.A01
            if (r1 == 0) goto L_0x00d5
            android.view.View r3 = r11.A0Y
            r0 = 21
            X.3cJ r2 = new X.3cJ
            r2.<init>((java.lang.Object) r11, (int) r1, (int) r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
            r11.A01 = r10
        L_0x00d5:
            android.view.View r0 = r11.A0V
            r0.setFocusable(r13)
            r0.setFocusableInTouchMode(r13)
            r0.requestFocus()
            r11.A0P = r10
            return
        L_0x00e3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            r0.A6m()
            goto L_0x00c1
        L_0x00eb:
            java.lang.Object r4 = r1.A00
            X.5l7 r4 = (X.C113245l7) r4
            X.4UA r1 = r4.A3D
            X.3Ls r0 = r1.A01
            boolean r0 = r0 instanceof X.AnonymousClass1Hk
            if (r0 == 0) goto L_0x00fe
            r0 = 0
            r1.A0N(r0)
            r4.A0f()
        L_0x00fe:
            X.2sA r3 = r4.A3Z
            X.4uZ r2 = r4.A4J
            X.1VX r1 = r4.A41
            r0 = 4549(0x11c5, float:6.375E-42)
            boolean r0 = r1.A0X(r0)
            r3.A04(r2, r10, r0)
            goto L_0x00c1
        L_0x010e:
            r9 = r39
            r4 = r11
            r5 = r29
            r6 = r12
            r7 = r2
            r4.A0L(r5, r6, r7, r9)
            goto L_0x00b0
        L_0x0119:
            r6 = 0
            int r0 = (r33 > r6 ? 1 : (r33 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x016e
            X.5T5 r1 = r11.A1G
            X.5Uc r0 = r11.A12
            boolean r0 = r0.A08
            r19 = r0
            r14 = r1
            r15 = r2
            r17 = r4
            r14.A00(r15, r17, r19)
            goto L_0x016e
        L_0x012f:
            int r0 = (r35 > r14 ? 1 : (r35 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x016e
            X.8qC r0 = r11.A1N
            java.lang.Object r7 = r0.get()
            X.54I r7 = (X.AnonymousClass54I) r7
            android.media.SoundPool r6 = A1b
            int r1 = A1Y
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A05(r6, r0, r0, r1)
            X.5T5 r0 = r11.A1G
            X.5Uc r1 = r11.A12
            boolean r1 = r1.A08
            r17 = r1
            X.7Ro r15 = r0.A05
            r16 = 3
            long r8 = r0.A01
            long r6 = r0.A02
            boolean r14 = r0.A03
            long r0 = r0.A00
            r25 = r0
            r27 = r17
            r28 = r14
            r23 = r6
            r21 = r8
            r17 = r2
            r19 = r4
            r15.A00(r16, r17, r19, r21, r23, r25, r27, r28)
            X.4VH r0 = r11.A0n
            r0.A0F(r10)
        L_0x016e:
            r0 = r29
            r11.A0G(r0)
            r11.A0G(r12)
            goto L_0x00c1
        L_0x0178:
            int r0 = A1W
            if (r0 == 0) goto L_0x003a
            X.8qC r0 = r11.A1N
            java.lang.Object r7 = r0.get()
            X.54I r7 = (X.AnonymousClass54I) r7
            android.media.SoundPool r6 = A1b
            int r1 = A1W
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A05(r6, r0, r0, r1)
            goto L_0x003a
        L_0x018f:
            if (r37 != 0) goto L_0x003c
            int r0 = (r35 > r14 ? 1 : (r35 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            int r0 = A1W
            if (r0 == 0) goto L_0x0042
            X.8qC r0 = r11.A1N
            java.lang.Object r7 = r0.get()
            X.54I r7 = (X.AnonymousClass54I) r7
            android.media.SoundPool r6 = A1b
            int r1 = A1W
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A05(r6, r0, r0, r1)
            goto L_0x0042
        L_0x01ac:
            if (r37 == 0) goto L_0x0031
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZT.A0K(java.io.File, java.io.File, long, long, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
        if (r1.A0P == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(java.io.File r21, java.io.File r22, long r23, boolean r25) {
        /*
            r20 = this;
            r2 = r21
            X.C626936e.A06(r2)
            r1 = r20
            X.4uZ r0 = r1.A0E
            X.C626936e.A06(r0)
            X.5T5 r3 = r1.A1G
            X.5ZQ r0 = r1.A0K
            if (r0 == 0) goto L_0x00af
            int r0 = r0.A03()
            long r6 = (long) r0
        L_0x0017:
            X.5Uc r0 = r1.A12
            boolean r8 = r0.A08
            r4 = r23
            r3.A01(r4, r6, r8)
            X.3Dh r4 = r1.A0f
            X.2y5 r3 = r1.A0z
            X.4uZ r0 = r1.A0E
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00ab
            X.38t r0 = X.C633138t.A0S
        L_0x002c:
            r5 = 1
            java.io.File r4 = X.C107655bf.A0P(r4, r3, r0, r2, r5)
            boolean r0 = r2.renameTo(r4)
            if (r0 != 0) goto L_0x0049
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voicenote/sendvoicenotefile/failed to rename "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " to "
            X.C18260x0.A1Q(r3, r0, r4)
            r4 = r2
        L_0x0049:
            X.33C r8 = new X.33C
            r8.<init>()
            r8.A0F = r4
            X.2rD r6 = r1.A0w
            X.4uZ r10 = r1.A0E
            r7 = 0
            X.34x r11 = r1.A0G
            X.1VX r3 = r1.A0v
            r0 = 2832(0xb10, float:3.968E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x0066
            boolean r0 = r1.A0P
            r4 = 1
            if (r0 != 0) goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            r16 = 2
            X.1VX r3 = r6.A0B
            r0 = 2832(0xb10, float:3.968E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x0077
            if (r4 == 0) goto L_0x0077
            r16 = 82
        L_0x0077:
            r18 = 0
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r19 = r25
            r9 = r7
            r17 = r5
            X.1mV r5 = r6.A04(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1Hk r4 = r1.A0C
            if (r4 == 0) goto L_0x0097
            X.5Wq r3 = r1.A0D
            if (r3 == 0) goto L_0x0097
            X.2e0 r0 = r1.A0o
            X.2U8 r0 = r0.A00(r4, r3)
            r5.A1P(r0)
        L_0x0097:
            int r0 = r5.A0B
            if (r0 != 0) goto L_0x00a1
            int r0 = X.C107655bf.A0F(r2)
            r5.A0B = r0
        L_0x00a1:
            X.2qd r0 = r1.A11
            X.1mu r5 = (X.C30721mu) r5
            r1 = r22
            r0.A00(r7, r5, r1)
            return
        L_0x00ab:
            X.38t r0 = X.C633138t.A0J
            goto L_0x002c
        L_0x00af:
            r6 = -1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZT.A0L(java.io.File, java.io.File, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (r1 != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(java.io.File r6, java.io.File r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.String r0 = "VoiceNoteRecordingUI/showVoiceNotePreview/"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r5.A0H(r6)
            X.5ZQ r0 = r5.A0K
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.A03()
            long r0 = (long) r0
            r5.A05 = r0
            r5.A0A()
            X.5qb r2 = r5.A1D
            X.5Gy r3 = new X.5Gy
            r3.<init>(r5)
            android.widget.ImageButton r1 = r2.A01
            r0 = 45
            X.C109395eY.A00(r1, r3, r0)
            long r0 = r5.A05
            android.widget.TextView r4 = r2.A02
            X.33j r3 = r2.A0H
            long r0 = X.C18290x4.A0B(r0)
            X.C107565bW.A0I(r4, r3, r0)
            X.5ZQ r3 = r5.A0K
            X.5TQ r0 = r5.A0L
            if (r0 == 0) goto L_0x0040
            com.whatsapp.util.OpusRecorder r0 = r0.A06
            boolean r1 = r0.isRecording()
            r0 = 1
            if (r1 == 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r2.A02(r3, r7, r9, r0)
            r5.A0B()
            android.view.View r1 = r5.A0Y
            r0 = 2131434776(0x7f0b1d18, float:1.8491375E38)
            X.C86624Kv.A0u(r1, r0)
            r0 = 2131430744(0x7f0b0d58, float:1.8483198E38)
            X.C86644Kx.A0x(r1, r0)
            r0 = 2131428365(0x7f0b040d, float:1.8478372E38)
            android.view.View r0 = r1.findViewById(r0)
            r4 = 0
            r0.setVisibility(r4)
            r0 = 2131429572(0x7f0b08c4, float:1.848082E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 17
            X.C86614Ku.A1H(r1, r5, r0)
            X.5Uc r3 = r5.A12
            android.view.View r0 = r3.A0I
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.A0L
            r0.setVisibility(r1)
            X.4NZ r1 = r3.A05
            if (r1 == 0) goto L_0x0082
            r0 = 4
            r1.setVisibility(r0)
        L_0x0082:
            android.view.ViewGroup r1 = r2.A0B
            r1.setVisibility(r4)
            r0 = 1
            r1.setClickable(r0)
            X.5qY r3 = new X.5qY
            r3.<init>(r5, r6)
            android.widget.ImageButton r1 = r2.A0C
            r0 = 46
            X.C109395eY.A00(r1, r3, r0)
            r0 = 2
            X.69M r1 = new X.69M
            r1.<init>(r5, r0)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r2.A04
            r0.setOnSeekBarChangeListener(r1)
            X.8G4 r1 = new X.8G4
            r1.<init>(r5)
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r2.A03
            r0.A08 = r1
            if (r8 == 0) goto L_0x00b9
            X.4FS r2 = r5.A1A
            r1 = 14
            X.5rO r0 = new X.5rO
            r0.<init>(r5, r1)
            r2.BkM(r0)
        L_0x00b9:
            r5.A0M = r6
            r5.A0N = r7
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZT.A0M(java.io.File, java.io.File, boolean, boolean):void");
    }

    public void A0O(boolean z) {
        SharedPreferences.Editor A032;
        SharedPreferences A0F2;
        String str;
        if (this.A0L != null) {
            AnonymousClass5T5 r4 = this.A1G;
            C95814uZ r1 = r4.A06.A00.A0E;
            if (r1 != null) {
                if (r1 instanceof AnonymousClass1fS) {
                    AnonymousClass33p r0 = r4.A04;
                    A032 = C18270x1.A03(r0);
                    A0F2 = AnonymousClass0x2.A0F(r0);
                    str = "ptt_lock_broadcast";
                } else {
                    boolean A0K2 = C627336j.A0K(r1);
                    AnonymousClass33p r02 = r4.A04;
                    A032 = C18270x1.A03(r02);
                    A0F2 = AnonymousClass0x2.A0F(r02);
                    if (A0K2) {
                        str = "ptt_lock_group";
                    } else {
                        str = "ptt_lock_individual";
                    }
                }
                C86604Kt.A14(A032, A0F2, str);
            }
            C150637Ro r03 = r4.A05;
            r03.A00.BhD(new C23931Vl());
            View view = this.A0Y;
            C86644Kx.A0x(view, R.id.buttons);
            C29401il r6 = this.A0l;
            if (r6.A00.A00() >= 16.0d) {
                if (!view.getKeepScreenOn()) {
                    view.setKeepScreenOn(true);
                }
                if (!this.A0O) {
                    this.A0O = true;
                    r6.A06(this.A0k);
                }
            }
            C116635qb r5 = this.A1D;
            AnonymousClass8K8 r62 = new AnonymousClass8K8(this, z);
            C1237069l r2 = new C1237069l(this, 0);
            C109395eY.A00(r5.A0C, r62, 46);
            C109395eY.A00(r5.A0D, r2, 47);
            r5.A0B.setVisibility(0);
            r5.A00();
            VoiceVisualizer voiceVisualizer = r5.A0G;
            voiceVisualizer.setEnabled(true);
            if (r5.A0M) {
                voiceVisualizer.setVisibility(0);
            }
            r5.A0A.setVisibility(0);
            r5.A0J.A06(8);
            C97124xf r12 = this.A1E;
            Log.i("voicenote/notifyVoiceNoteLocked");
            C626936e.A01();
            Iterator A033 = C61102zi.A03(r12);
            while (A033.hasNext()) {
                AnonymousClass5UH r13 = (AnonymousClass5UH) A033.next();
                if (r13 instanceof AnonymousClass56C) {
                    C113245l7 r14 = ((AnonymousClass56C) r13).A00;
                    C624134x r04 = r14.A3B.A0G;
                    if (r04 != null) {
                        r14.A29(r04, false);
                    }
                }
            }
            this.A12.A01();
            C86624Kv.A0u(view, R.id.voice_recorder_decor);
        }
    }

    public final void A0Q(boolean z) {
        SharedPreferences.Editor A032;
        SharedPreferences A0F2;
        String str;
        boolean z2 = z;
        if (A1X != 0 && A0U() && z) {
            ((AnonymousClass54I) this.A1N.get()).A05(A1b, 1.0f, 1.0f, A1X);
            AnonymousClass29U.A00(this.A0p);
        }
        if (!AnonymousClass000.A1W(this.A0L) || this.A0E == null) {
            this.A0M = null;
            this.A0N = null;
            return;
        }
        AnonymousClass5T5 r3 = this.A1G;
        r3.A03 = true;
        C95814uZ r1 = r3.A06.A00.A0E;
        if (r1 != null) {
            if (r1 instanceof AnonymousClass1fS) {
                AnonymousClass33p r0 = r3.A04;
                A032 = C18270x1.A03(r0);
                A0F2 = AnonymousClass0x2.A0F(r0);
                str = "ptt_draft_review_broadcast";
            } else {
                boolean A0K2 = C627336j.A0K(r1);
                AnonymousClass33p r02 = r3.A04;
                A032 = C18270x1.A03(r02);
                A0F2 = AnonymousClass0x2.A0F(r02);
                if (A0K2) {
                    str = "ptt_draft_review_group";
                } else {
                    str = "ptt_draft_review_individual";
                }
            }
            C86604Kt.A14(A032, A0F2, str);
        }
        C003203q r32 = this.A0a;
        C107295b4.A00(r32, this.A0p, r32.getString(R.string.f11nameremoved));
        Log.i("voicenote/cachevoicenoteandpreview");
        this.A0n.A0D();
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.A06) + this.A05;
        this.A05 = elapsedRealtime;
        C18260x0.A12("voicenote/cachevoicenoteandpreview duration:", AnonymousClass001.A0o(), elapsedRealtime);
        AnonymousClass5TQ r4 = this.A0L;
        this.A0L = null;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.A0v.A0X(6501)) {
            Handler A033 = A03();
            A033.removeCallbacks(this.A1O);
            A033.post(new C117345rm(this, r4, elapsedRealtime, currentTimeMillis, z2));
            return;
        }
        A0F(r4, elapsedRealtime, false);
        File file = r4.A08;
        File file2 = r4.A09;
        long length = file.length();
        long j = r4.A01;
        A0E(currentTimeMillis, "cacheVoiceNoteAndPreview on main thread");
        A0J(file, file2, j, length, elapsedRealtime, z2);
    }

    public final void A0R(boolean z) {
        View view = this.A0Y;
        view.findViewById(R.id.voice_recorder_decor).setVisibility(8);
        if (this.A1R) {
            view.findViewById(R.id.send).setEnabled(C18320x8.A1U(C86614Ku.A0u(this.A0Z).trim()));
            A00(this);
        }
        this.A12.A06(z);
        View findViewById = view.findViewById(R.id.input_layout_content);
        findViewById.clearAnimation();
        AlphaAnimation A0H2 = C86604Kt.A0H();
        A0H2.setDuration(160);
        A0H2.setFillBefore(true);
        A0H2.setFillAfter(true);
        findViewById.startAnimation(A0H2);
        view.findViewById(R.id.footer).setClipBounds((Rect) null);
        this.A18.setClipBounds((Rect) null);
        View findViewById2 = view.findViewById(R.id.voice_note_pulse);
        findViewById2.clearAnimation();
        ((ImageView) findViewById2).getDrawable().setAlpha(255);
    }

    public final void A0T(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        Log.d("VoiceNoteRecordingUI/stopVoiceNote");
        this.A0t.A03("VoiceNoteRecording", "End");
        C116635qb r0 = this.A1D;
        View view = this.A0Y;
        r0.A0E.setActivated(false);
        View findViewById = view.findViewById(R.id.input_layout_content);
        findViewById.setFocusable(true);
        AnonymousClass0YY.A06(findViewById, 1);
        ObjectAnimator objectAnimator = this.A09;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        this.A12.A03();
        if (this.A0R) {
            C003203q r2 = this.A0a;
            C107295b4.A00(r2, this.A0p, r2.getString(R.string.f11nameremoved));
        } else if (this.A0L != null && this.A0E != null) {
            boolean z5 = z;
            C18260x0.A1E("voicenote/stopvoicenote ", AnonymousClass001.A0o(), z5);
            boolean z6 = !z;
            this.A0R = z6;
            if (z6) {
                C003203q r3 = this.A0a;
                C107295b4.A00(r3, this.A0p, r3.getString(R.string.f11nameremoved));
            }
            this.A0n.A0D();
            this.A0h.A0D(this.A0E);
            A0D();
            AnonymousClass5ZQ r02 = this.A0K;
            if (r02 != null && r02.A0F()) {
                this.A0K.A09();
            }
            AnonymousClass5TQ r03 = this.A0L;
            if (r03 == null || !r03.A06.isRecording()) {
                j = this.A05;
            } else {
                j = (SystemClock.elapsedRealtime() - this.A06) + this.A05;
                this.A05 = j;
            }
            C18260x0.A12("voicenote/stopvoicenote duration:", AnonymousClass001.A0o(), j);
            AnonymousClass5TQ r5 = this.A0L;
            this.A0L = null;
            long currentTimeMillis = System.currentTimeMillis();
            boolean z7 = z2;
            boolean z8 = z3;
            boolean z9 = z4;
            if (this.A0v.A0X(6501)) {
                this.A0Q = true;
                Handler A032 = A03();
                A032.removeCallbacks(this.A1O);
                A032.post(new C117465ry(this, r5, j, currentTimeMillis, z5, z9, z7, z8));
                return;
            }
            Log.d("voicenote/stopandreleasevoicerecorder/stop in main thread ");
            A0F(r5, j, z5);
            File file = r5.A08;
            File file2 = r5.A09;
            long length = file.length();
            A0E(currentTimeMillis, "stopVoiceNote on main thread");
            A0K(file, file2, length, j, z5, z9, z7, z8);
        }
    }

    public boolean A0U() {
        AnonymousClass5TQ r0 = this.A0L;
        if (r0 == null || !r0.A06.isRecording()) {
            return false;
        }
        return true;
    }

    public boolean A0V() {
        SharedPreferences.Editor A032;
        SharedPreferences A0F2;
        String str;
        AnonymousClass5H0 r0 = this.A1I;
        if (r0 != null) {
            AnonymousClass5QR r2 = r0.A00;
            r2.A04.A04(true);
            r2.A03.A06();
        }
        this.A0Q = false;
        AnonymousClass5T5 r4 = this.A1G;
        C95814uZ r1 = r4.A06.A00.A0E;
        if (r1 != null) {
            if (r1 instanceof AnonymousClass1fS) {
                AnonymousClass33p r02 = r4.A04;
                A032 = C18270x1.A03(r02);
                A0F2 = AnonymousClass0x2.A0F(r02);
                str = "ptt_record_broadcast";
            } else {
                boolean A0K2 = C627336j.A0K(r1);
                AnonymousClass33p r03 = r4.A04;
                A032 = C18270x1.A03(r03);
                A0F2 = AnonymousClass0x2.A0F(r03);
                if (A0K2) {
                    str = "ptt_record_group";
                } else {
                    str = "ptt_record_individual";
                }
            }
            C86604Kt.A14(A032, A0F2, str);
        }
        r4.A03 = false;
        r4.A00 = 0;
        r4.A01 = 0;
        r4.A02 = 0;
        C55612qd r11 = this.A11;
        AnonymousClass4FU r6 = this.A0e;
        C003203q r3 = this.A0a;
        if (r11.A03(r3, r6, this.A0E)) {
            if (this.A0L != null) {
                Log.e("voicenote/startvoicenote/inprogress");
            } else {
                this.A0t.A03("VoiceNoteRecording", "Resume");
                View view = this.A0V;
                view.clearFocus();
                view.setFocusable(false);
                this.A0m.A04();
                if (this.A1S) {
                    AnonymousClass5CI.A00(r3);
                }
                PowerManager.WakeLock wakeLock = this.A0B;
                if (wakeLock != null) {
                    wakeLock.acquire();
                }
                this.A15.A01();
                this.A0n.A0D();
                AnonymousClass29U.A00(this.A0p);
                SoundPool soundPool = A1b;
                int i = A1c;
                C1896692e r04 = new C1896692e(this, 5);
                C162457s7.A0J(soundPool, 0);
                ((C72173dI) this.A1N.get()).execute(new C117315rj(soundPool, AnonymousClass0x9.A14(r04), 1.0f, 1.0f, i));
                C102405Is r5 = this.A1J;
                TextView textView = r5.A00;
                C620733j r42 = r5.A02;
                C107565bW.A0I(textView, r42, 0);
                textView.setVisibility(0);
                C107565bW.A0I(r5.A01, r42, 0);
                this.A02 = 0;
                this.A03 = 0;
                C116635qb r10 = this.A1D;
                r10.A0L.clear();
                this.A00 = 0;
                C378124c r32 = this.A0b;
                r32.A00.set(Double.doubleToRawLongBits(1.0d));
                View view2 = this.A0Y;
                View findViewById = view2.findViewById(R.id.voice_note_pulse);
                findViewById.setVisibility(0);
                if (this.A09 == null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "alpha", new float[]{0.0f, 1.0f});
                    this.A09 = ofFloat;
                    ofFloat.setInterpolator(new C107735bo(r32));
                    this.A09.setDuration(500);
                    this.A09.setRepeatMode(2);
                    this.A09.setRepeatCount(-1);
                }
                this.A09.start();
                C86644Kx.A0x(view2, R.id.buttons);
                View findViewById2 = view2.findViewById(R.id.input_layout_content);
                findViewById2.clearAnimation();
                AlphaAnimation A0C2 = AnonymousClass4L0.A0C(1.0f, 0.0f);
                A0C2.setDuration(160);
                A0C2.setFillBefore(true);
                A0C2.setFillAfter(true);
                findViewById2.startAnimation(A0C2);
                C86604Kt.A1F(view2, R.id.voice_recorder_decor, 0);
                findViewById2.setFocusable(false);
                AnonymousClass0YY.A06(findViewById2, 4);
                File A002 = C64393Dh.A00(this.A0f, C107655bf.A0U());
                try {
                    AnonymousClass1VX r15 = this.A0v;
                    C69263Wi r14 = this.A0g;
                    AudioRecordFactory audioRecordFactory = this.A0i;
                    OpusRecorderFactory opusRecorderFactory = this.A0j;
                    String absolutePath = A002.getAbsolutePath();
                    AudioRecordFactory audioRecordFactory2 = audioRecordFactory;
                    this.A0L = new AnonymousClass5TQ(r14, audioRecordFactory2, opusRecorderFactory, this.A0q, r15, r10, absolutePath);
                    this.A0u.A00 = true;
                    this.A07 = SystemClock.elapsedRealtime();
                    this.A06 = SystemClock.elapsedRealtime();
                    this.A05 = 0;
                    if (this.A1T) {
                        A03().post(new C117105rO(this, 15));
                    } else {
                        this.A0L.A06.prepare();
                    }
                } catch (Exception unused) {
                    r11.A01(this.A0L, 0, false);
                    A0S(false, false);
                    r6.Bot(R.string.f11nameremoved);
                }
                if (this.A1V) {
                    Handler A033 = A03();
                    Runnable runnable = this.A1O;
                    A033.removeCallbacks(runnable);
                    A033.postDelayed(runnable, 160);
                } else {
                    Runnable runnable2 = this.A1O;
                    view2.removeCallbacks(runnable2);
                    view2.postDelayed(runnable2, 160);
                }
                this.A0R = false;
                r10.A0E.setActivated(false);
                this.A12.A04(this.A07);
                if (this.A1R) {
                    r10.A01(R.drawable.ic_pause_draft_preview);
                }
                return true;
            }
        }
        return false;
    }

    public final void A0E(long j, String str) {
        if (AnonymousClass0x9.A05(j) > 5000) {
            this.A0d.A0A("VoiceNoteRecordingUI/logCriticalErrorForVoiceNoteReleaseIfNeeded", true, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0043, code lost:
        if (r12.A0P == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(java.io.File r13, int r14, boolean r15) {
        /*
            r12 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voicenote/onrecordingstopped "
            X.C18260x0.A1E(r0, r1, r15)
            X.6kc r1 = r12.A0F
            r0 = 1
            r1.A01 = r0
            if (r15 == 0) goto L_0x006a
            X.33C r3 = new X.33C
            r3.<init>()
            r3.A0M = r0
            X.6kc r0 = r12.A0F
            java.io.File r0 = r0.A01()
            r3.A0F = r0
            X.2a2 r2 = r12.A10
            X.4uZ r4 = r12.A0E
            X.C626936e.A06(r4)
            long r7 = r12.A08
            java.io.File r0 = r3.A0F
            java.lang.String r6 = r0.getName()
            java.io.File r0 = r3.A0F
            long r9 = r0.length()
            X.34x r5 = r12.A0G
            X.1VX r1 = r12.A0v
            r0 = 2832(0xb10, float:3.968E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r12.A0P
            r11 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r11 = 0
        L_0x0046:
            X.1mu r3 = r2.A00(r3, r4, r5, r6, r7, r9, r11)
            r3.A0B = r14
            X.1Hk r2 = r12.A0C
            if (r2 == 0) goto L_0x005d
            X.5Wq r1 = r12.A0D
            if (r1 == 0) goto L_0x005d
            X.2e0 r0 = r12.A0o
            X.2U8 r0 = r0.A00(r2, r1)
            r3.A1P(r0)
        L_0x005d:
            X.6kc r0 = r12.A0F
            X.3QO r1 = r0.A00
            X.2qd r0 = r12.A11
            r0.A00(r1, r3, r13)
        L_0x0066:
            r0 = 0
            r12.A0F = r0
            return
        L_0x006a:
            X.2re r2 = r12.A0x
            X.6kc r1 = r12.A0F
            java.lang.String r0 = "app/mediajobmanager/cancelVoiceNoteUpload"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33c r3 = r2.A0D
            X.3QO r2 = r1.A00
            X.4FS r1 = r3.A0N
            X.3by r0 = new X.3by
            r0.<init>(r3, r2)
            r1.BkM(r0)
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZT.A0I(java.io.File, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(java.io.File r14, java.io.File r15, long r16, long r18, long r20, boolean r22) {
        /*
            r13 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voicenote/continueCacheVoiceNoteOnVoiceRecorderRelease voiceRecorderisNotNull="
            r1.append(r0)
            X.5TQ r0 = r13.A0L
            r10 = 1
            r2 = 0
            boolean r0 = X.AnonymousClass000.A1W(r0)
            X.C18260x0.A1U(r1, r0)
            X.4xf r0 = r13.A1E
            r0.A08()
            X.8tC r1 = r13.A1H
            X.6BV r1 = (X.AnonymousClass6BV) r1
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0034
            java.lang.Object r1 = r1.A00
            X.5l7 r1 = (X.C113245l7) r1
            X.4qq r0 = r1.A45
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x01b5
            X.4qq r0 = r1.A45
            r0.dismiss()
        L_0x0034:
            r3 = 99
            r6 = 1000(0x3e8, double:4.94E-321)
            r0 = r18
            int r5 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x004e
            int r3 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x004e
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "voicenote/file too small; not previewing; voiceNoteFileLength="
            X.C18260x0.A11(r3, r4, r0)
            r13.A07()
        L_0x004e:
            X.5Uc r3 = r13.A12
            android.widget.ImageView r1 = r3.A0L
            float r0 = r3.A00()
            r1.setTranslationX(r0)
            X.8uq r0 = r3.A04
            if (r0 == 0) goto L_0x0060
            r0.BaD()
        L_0x0060:
            X.6kc r0 = r13.A0F
            if (r0 == 0) goto L_0x0067
            r13.A0I(r15, r2, r2)
        L_0x0067:
            android.os.PowerManager$WakeLock r1 = r13.A0B
            if (r1 == 0) goto L_0x0074
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x0074
            r1.release()
        L_0x0074:
            if (r22 == 0) goto L_0x0089
            X.2WH r0 = r13.A0u
            r0.A00 = r2
            boolean r0 = r13.A1S
            if (r0 == 0) goto L_0x0084
            X.03q r1 = r13.A0a
            r0 = -1
            r1.setRequestedOrientation(r0)
        L_0x0084:
            X.5Td r0 = r13.A15
            r0.A00()
        L_0x0089:
            int r0 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x01c0
            if (r5 <= 0) goto L_0x01c0
            X.5Ua r6 = r13.A1B
            X.4uZ r7 = r13.A0E
            X.34x r8 = r13.A0G
            java.lang.String r0 = "Jid cannot be null"
            X.C626936e.A07(r7, r0)
            java.lang.String r0 = "Voice note file cannot be null"
            X.C626936e.A07(r14, r0)
            java.lang.String r0 = r14.getAbsolutePath()
            java.lang.String r1 = X.C627536m.A08(r0)
            java.lang.String r0 = "opus"
            boolean r1 = r1.equals(r0)
            java.lang.String r0 = "Invalid file type for voice note file. Use opus"
            X.C626936e.A0E(r1, r0)
            X.5ZR r1 = r6.A03
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r0 = r1.A0I(r0)
            r5 = 0
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = "draftvoicenotecache/cachevoicenote/ external storage not writable cannot cache voice note"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x00c4:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r5, r5)
        L_0x00c9:
            java.lang.Object r3 = r0.first
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r1 = r0.second
            java.io.File r1 = (java.io.File) r1
            X.2Yz r8 = r13.A1C
            if (r3 == 0) goto L_0x00f3
            r4 = 2
            r11 = r16
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00f3
            java.lang.String r4 = r3.getName()
            java.lang.String r0 = "@"
            java.lang.String[] r0 = r4.split(r0)
            r9 = r0[r2]
            X.4FS r0 = r8.A01
            X.3aG r7 = new X.3aG
            r7.<init>(r8, r9, r10, r11)
            r0.BkM(r7)
        L_0x00f3:
            r13.A0G(r14)
            r13.A0G(r15)
            r13.A0D()
            X.5ZQ r0 = r13.A0K
            if (r0 == 0) goto L_0x010b
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x010b
            X.5ZQ r0 = r13.A0K
            r0.A09()
        L_0x010b:
            if (r22 == 0) goto L_0x011a
            X.03q r0 = r13.A0a
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x011a
            if (r3 == 0) goto L_0x011f
            r13.A0M(r3, r1, r2, r10)
        L_0x011a:
            r13.A0M = r3
            r13.A0N = r1
            return
        L_0x011f:
            java.lang.String r0 = "voicenote/ error caching voice note for preview"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r13.A0R(r2)
            goto L_0x011a
        L_0x0128:
            java.io.File r4 = r6.A02(r7)
            if (r4 == 0) goto L_0x00c4
            java.io.File r3 = r6.A03(r7)
            if (r8 != 0) goto L_0x0162
            java.io.File r1 = r6.A04(r7)
            if (r1 == 0) goto L_0x014f
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x014f
            boolean r0 = r1.delete()
            if (r0 == 0) goto L_0x014f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "draftvoicenotecache/deletevoicenote deleted quoted message file jid "
            X.C18260x0.A1P(r1, r0, r7)
        L_0x014f:
            X.2s6 r1 = r6.A00
            boolean r0 = X.C627536m.A0L(r1, r14, r4)
            if (r0 == 0) goto L_0x00c4
            if (r3 == 0) goto L_0x015c
            X.C627536m.A0L(r1, r15, r3)
        L_0x015c:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r4, r3)
            goto L_0x00c9
        L_0x0162:
            java.io.File r9 = r6.A04(r7)
            if (r9 != 0) goto L_0x016e
            java.lang.String r0 = "draftvoicenotecache/savequotedmessage/quoted message file is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x014f
        L_0x016e:
            X.2z0 r8 = r8.A1J
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x01ae }
            X.4uZ r0 = r8.A00     // Catch:{ IOException -> 0x01ae }
            java.lang.String r0 = X.C627336j.A07(r0)     // Catch:{ IOException -> 0x01ae }
            r7.append(r0)     // Catch:{ IOException -> 0x01ae }
            java.lang.String r1 = ":;:"
            r7.append(r1)     // Catch:{ IOException -> 0x01ae }
            boolean r0 = r8.A02     // Catch:{ IOException -> 0x01ae }
            r7.append(r0)     // Catch:{ IOException -> 0x01ae }
            r7.append(r1)     // Catch:{ IOException -> 0x01ae }
            java.lang.String r0 = r8.A01     // Catch:{ IOException -> 0x01ae }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r7)     // Catch:{ IOException -> 0x01ae }
            java.io.FileOutputStream r7 = X.AnonymousClass0x9.A0h(r9)     // Catch:{ IOException -> 0x01ae }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x01a4 }
            r7.write(r0)     // Catch:{ all -> 0x01a4 }
            r7.close()     // Catch:{ IOException -> 0x01ae }
            java.lang.String r0 = "draftvoicenotecache/cachevoicenote/ quoted message info saved"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x014f
        L_0x01a4:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x01a9 }
            goto L_0x01ad
        L_0x01a9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01ae }
        L_0x01ad:
            throw r1     // Catch:{ IOException -> 0x01ae }
        L_0x01ae:
            r1 = move-exception
            java.lang.String r0 = "draftvoicenotecache/savequotedmessage/ "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x014f
        L_0x01b5:
            boolean r0 = r1.A2X()
            if (r0 == 0) goto L_0x0034
            r1.A0d()
            goto L_0x0034
        L_0x01c0:
            r13.A0D()
            r13.A0R(r2)
            r13.A0G(r14)
            r13.A0G(r15)
            r0 = 0
            r13.A0M = r0
            r13.A0N = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZT.A0J(java.io.File, java.io.File, long, long, long, boolean):void");
    }

    public void A0N(boolean z) {
        C95814uZ r1;
        C18260x0.A1D("VoiceNoteRecordingUI/cancelAndHideVoiceNotePreview/deleteDraft", AnonymousClass001.A0o(), z);
        this.A1C.A00(this.A0M);
        if (z && (r1 = this.A0E) != null) {
            this.A1B.A05(r1);
            this.A0M = null;
            this.A0N = null;
        }
        this.A0T.removeCallbacks(this.A1P);
        if (this.A0K != null) {
            A06();
            this.A0K.A06();
            this.A0K = null;
        }
        View findViewById = this.A0Y.findViewById(R.id.input_layout_content);
        findViewById.setFocusable(true);
        AnonymousClass0YY.A06(findViewById, 1);
        float f = -1.0f;
        if (C620733j.A04(this.A0s)) {
            f = 1.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        C86614Ku.A1K(translateAnimation, 200);
        C1232367q.A00(translateAnimation, findViewById, this, 8);
        findViewById.startAnimation(translateAnimation);
        A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0W(android.view.MotionEvent r5, android.view.View r6, boolean r7) {
        /*
            r4 = this;
            int r1 = r5.getAction()
            r2 = 0
            if (r1 == 0) goto L_0x005d
            r3 = 1
            if (r1 == r3) goto L_0x0021
            r0 = 2
            if (r1 == r0) goto L_0x0011
            r0 = 3
            if (r1 == r0) goto L_0x0021
        L_0x0010:
            return r2
        L_0x0011:
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x0010
            X.5Uc r1 = r4.A12
            android.widget.TextView r0 = r4.A0Z
            int r0 = r0.getWidth()
            r1.A05(r5, r0, r7)
            return r2
        L_0x0021:
            android.widget.TextView r0 = r4.A0Z
            java.lang.String r0 = X.C86614Ku.A0u(r0)
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x0010
            X.5Uc r0 = r4.A12
            boolean r0 = r0.A07(r1, r7, r3)
            if (r0 == 0) goto L_0x0010
            if (r1 != 0) goto L_0x0010
            r6.playSoundEffect(r2)
            X.8tC r0 = r4.A1H
            X.6BV r0 = (X.AnonymousClass6BV) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            switch(r1) {
                case 0: goto L_0x0057;
                case 1: goto L_0x0051;
                default: goto L_0x004b;
            }
        L_0x004b:
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            r0.A7E(r2)
            return r2
        L_0x0051:
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            r0.A6o()
            return r2
        L_0x0057:
            X.5l7 r0 = (X.C113245l7) r0
            r0.A2J(r2)
            return r2
        L_0x005d:
            X.4VH r0 = r4.A0n
            r0.A0D()
            X.5Uc r1 = r4.A12
            float r0 = r5.getX()
            r1.A00 = r0
            float r0 = r5.getY()
            r1.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZT.A0W(android.view.MotionEvent, android.view.View, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x010d, code lost:
        if (r4.A0X(6751) == false) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5ZT(android.view.View r43, X.C003203q r44, X.C55682qk r45, X.AnonymousClass4FU r46, X.C64393Dh r47, X.C69263Wi r48, X.C621033m r49, com.whatsapp.audioRecording.AudioRecordFactory r50, com.whatsapp.audioRecording.OpusRecorderFactory r51, X.C29401il r52, X.C113895mA r53, X.AnonymousClass4VH r54, X.C47892e0 r55, X.C620633i r56, X.C56612sH r57, X.C54292oU r58, X.AnonymousClass33p r59, X.C620733j r60, X.C106965aS r61, X.AnonymousClass2WH r62, X.AnonymousClass1VX r63, X.C55972rD r64, X.C56232re r65, X.AnonymousClass3LQ r66, X.C60152y5 r67, X.C45452a2 r68, X.C55612qd r69, X.C50272hu r70, X.C104995Td r71, X.C45592aG r72, X.C187958y5 r73, X.AnonymousClass4FS r74, X.C105215Ua r75, X.C45182Yz r76, X.C116635qb r77, X.C150637Ro r78, X.C97124xf r79, X.C103505Nf r80, X.C185168tC r81, X.AnonymousClass5H0 r82, X.C97094xc r83, X.C183538qC r84, boolean r85, boolean r86) {
        /*
            r42 = this;
            r0 = r42
            r0.<init>()
            android.os.Handler r14 = X.AnonymousClass000.A0A()
            r0.A0T = r14
            r2 = 0
            X.24c r1 = new X.24c
            r1.<init>(r2)
            r0.A0b = r1
            r1 = 1
            X.24c r9 = new X.24c
            r9.<init>(r1)
            r0.A0c = r9
            android.graphics.Rect r1 = X.AnonymousClass001.A0N()
            r0.A0S = r1
            r1 = 0
            r0.A0P = r1
            r2 = -1
            r0.A04 = r2
            r2 = 8
            X.69s r6 = new X.69s
            r6.<init>(r0, r2)
            r0.A1L = r6
            r5 = 1
            X.93g r2 = new X.93g
            r2.<init>(r0, r5)
            r0.A14 = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r1)
            r0.A1Q = r2
            X.5iX r2 = new X.5iX
            r2.<init>(r0)
            r0.A0k = r2
            r36 = r57
            r2 = r36
            r0.A0q = r2
            r4 = r63
            r0.A0v = r4
            r40 = r48
            r2 = r40
            r0.A0g = r2
            r2 = r69
            r0.A11 = r2
            r2 = r45
            r0.A0d = r2
            r2 = r74
            r0.A1A = r2
            r2 = r47
            r0.A0f = r2
            r2 = r71
            r0.A15 = r2
            r39 = r49
            r2 = r39
            r0.A0h = r2
            r2 = r64
            r0.A0w = r2
            r11 = r83
            r0.A1M = r11
            r2 = r76
            r0.A1C = r2
            r2 = r73
            r0.A19 = r2
            r37 = r56
            r2 = r37
            r0.A0p = r2
            r12 = r60
            r0.A0s = r12
            r2 = r66
            r0.A0y = r2
            r2 = r50
            r0.A0i = r2
            r35 = r77
            r2 = r35
            r0.A1D = r2
            r2 = r62
            r0.A0u = r2
            r13 = r59
            r0.A0r = r13
            r2 = r79
            r0.A1E = r2
            r2 = r52
            r0.A0l = r2
            r2 = r75
            r0.A1B = r2
            r2 = r68
            r0.A10 = r2
            r2 = r84
            r0.A1N = r2
            r2 = r65
            r0.A0x = r2
            r2 = r67
            r0.A0z = r2
            r2 = r70
            r0.A13 = r2
            r2 = r61
            r0.A0t = r2
            r2 = r51
            r0.A0j = r2
            r2 = r55
            r0.A0o = r2
            r2 = r80
            r0.A1F = r2
            r8 = r85
            r0.A1R = r8
            r2 = r86
            r0.A1S = r2
            r2 = r72
            r0.A16 = r2
            r2 = r53
            r0.A0m = r2
            r2 = r44
            r0.A0a = r2
            r41 = r46
            r3 = r41
            r0.A0e = r3
            r3 = r43
            r0.A0Y = r3
            r7 = r81
            r0.A1H = r7
            r7 = 1139(0x473, float:1.596E-42)
            boolean r7 = r4.A0X(r7)
            r0.A1U = r7
            r7 = 6752(0x1a60, float:9.462E-42)
            boolean r7 = r4.A0X(r7)
            r0.A1V = r7
            if (r7 == 0) goto L_0x010f
            r7 = 6751(0x1a5f, float:9.46E-42)
            boolean r10 = r4.A0X(r7)
            r7 = 1
            if (r10 != 0) goto L_0x0110
        L_0x010f:
            r7 = 0
        L_0x0110:
            r0.A1T = r7
            r38 = r54
            r7 = r38
            r0.A0n = r7
            X.5Is r7 = new X.5Is
            r7.<init>(r3, r12)
            r0.A1J = r7
            r7 = r82
            r0.A1I = r7
            r10 = 2131434760(0x7f0b1d08, float:1.8491343E38)
            android.widget.ImageView r15 = X.AnonymousClass0x9.A0E(r3, r10)
            boolean r16 = X.C1001059l.A04
            r7 = 2131232981(0x7f0808d5, float:1.8082087E38)
            if (r16 == 0) goto L_0x0134
            r7 = 2131232982(0x7f0808d6, float:1.8082089E38)
        L_0x0134:
            r15.setImageResource(r7)
            r7 = 2131434777(0x7f0b1d19, float:1.8491378E38)
            android.view.ViewGroup r24 = X.C86644Kx.A0I(r3, r7)
            android.widget.ImageView r25 = X.AnonymousClass0x9.A0E(r3, r10)
            r7 = 2131434779(0x7f0b1d1b, float:1.8491382E38)
            android.widget.TextView r26 = X.C18300x5.A0G(r3, r7)
            r7 = 2131434782(0x7f0b1d1e, float:1.8491388E38)
            android.view.View r17 = X.C06560Yg.A02(r3, r7)
            r7 = 2131434781(0x7f0b1d1d, float:1.8491386E38)
            android.view.View r18 = X.C06560Yg.A02(r3, r7)
            r7 = 2131434780(0x7f0b1d1c, float:1.8491384E38)
            android.view.View r19 = X.C06560Yg.A02(r3, r7)
            r7 = 2131434752(0x7f0b1d00, float:1.8491327E38)
            android.view.View r20 = X.C06560Yg.A02(r3, r7)
            r7 = 2131434751(0x7f0b1cff, float:1.8491325E38)
            android.view.View r21 = X.C06560Yg.A02(r3, r7)
            r7 = 2131434754(0x7f0b1d02, float:1.849133E38)
            android.view.View r22 = X.C06560Yg.A02(r3, r7)
            r7 = 2131434776(0x7f0b1d18, float:1.8491375E38)
            android.view.View r23 = X.C06560Yg.A02(r3, r7)
            boolean r34 = X.AnonymousClass000.A1S(r8)
            android.content.res.Resources r8 = r2.getResources()
            r7 = 2131168589(0x7f070d4d, float:1.7951484E38)
            float r32 = r8.getDimension(r7)
            X.93L r10 = new X.93L
            r10.<init>(r0, r5)
            r8 = 0
            X.5Uc r7 = new X.5Uc
            r28 = r58
            r27 = r36
            r29 = r13
            r30 = r12
            r31 = r10
            r33 = r1
            r15 = r7
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.A12 = r7
            X.5oZ r10 = new X.5oZ
            r15 = r10
            r16 = r3
            r17 = r2
            r18 = r38
            r19 = r37
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            r7.A04 = r10
            android.os.PowerManager r12 = r37.A0J()
            if (r12 != 0) goto L_0x02da
            java.lang.String r7 = "voicenoterecordingui pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r7)
        L_0x01c2:
            android.media.SoundPool r7 = A1b
            if (r7 != 0) goto L_0x020a
            android.media.SoundPool r10 = new android.media.SoundPool
            r10.<init>(r5, r5, r1)
            A1b = r10
            r7 = 2132017214(0x7f14003e, float:1.96727E38)
            int r7 = r10.load(r2, r7, r1)
            A1c = r7
            android.media.SoundPool r7 = A1b
            r10 = 2132017211(0x7f14003b, float:1.9672694E38)
            int r7 = r7.load(r2, r10, r1)
            A1Y = r7
            android.media.SoundPool r12 = A1b
            r7 = 2132017212(0x7f14003c, float:1.9672696E38)
            int r7 = r12.load(r2, r7, r1)
            A1Z = r7
            android.media.SoundPool r12 = A1b
            r7 = 2132017213(0x7f14003d, float:1.9672698E38)
            int r7 = r12.load(r2, r7, r1)
            A1a = r7
            android.media.SoundPool r12 = A1b
            r7 = 2132017215(0x7f14003f, float:1.9672702E38)
            int r7 = r12.load(r2, r7, r1)
            A1X = r7
            android.media.SoundPool r7 = A1b
            int r1 = r7.load(r2, r10, r1)
            A1W = r1
        L_0x020a:
            r1 = 2131434762(0x7f0b1d0a, float:1.8491347E38)
            android.view.View r1 = r3.findViewById(r1)
            com.whatsapp.util.ClippingLayout r1 = (com.whatsapp.util.ClippingLayout) r1
            r0.A18 = r1
            r10 = 2131429844(0x7f0b09d4, float:1.8481372E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r3, r10)
            r0.A0Z = r1
            r1 = 2131430743(0x7f0b0d57, float:1.8483196E38)
            android.view.View r7 = r3.findViewById(r1)
            r0.A0W = r7
            r1 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r1 = r3.findViewById(r1)
            com.whatsapp.util.ClippingLayout r1 = (com.whatsapp.util.ClippingLayout) r1
            r0.A17 = r1
            android.view.View r1 = r7.findViewById(r10)
            r0.A0V = r1
            r1 = 746(0x2ea, float:1.045E-42)
            r4.A0X(r1)
            r1 = 2131434786(0x7f0b1d22, float:1.8491396E38)
            android.view.ViewGroup r10 = X.C86644Kx.A0J(r3, r1)
            X.8zO r7 = new X.8zO
            r7.<init>(r2, r0, r5)
            r1 = -1
            r10.addView(r7, r1, r1)
            r1 = 2131432817(0x7f0b1571, float:1.8487402E38)
            android.view.View r1 = r3.findViewById(r1)
            r0.A0X = r1
            r11.A06(r6)
            r1 = 3657(0xe49, float:5.125E-42)
            long r27 = X.C86624Kv.A05(r4, r1)
            X.5Gz r4 = new X.5Gz
            r4.<init>(r0)
            X.5T5 r1 = new X.5T5
            r2 = r78
            r1.<init>(r13, r2, r4)
            r0.A1G = r1
            X.3XD r11 = new X.3XD
            r11.<init>(r0)
            X.5B8 r10 = new X.5B8
            r10.<init>(r0, r5)
            r1 = 2
            X.92V r7 = new X.92V
            r7.<init>(r0, r1)
            r1 = 3
            X.92V r6 = new X.92V
            r6.<init>(r0, r1)
            X.5qZ r3 = new X.5qZ
            r3.<init>(r0)
            X.92V r2 = new X.92V
            r2.<init>(r0, r8)
            X.0yO r1 = new X.0yO
            r15 = r1
            r16 = r9
            r17 = r39
            r18 = r36
            r19 = r35
            r20 = r7
            r21 = r6
            r22 = r3
            r23 = r2
            r24 = r4
            r25 = r11
            r26 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.A0U = r1
            X.5B8 r7 = new X.5B8
            r7.<init>(r0, r8)
            X.8K9 r1 = new X.8K9
            r1.<init>(r0)
            r11 = 17
            X.3ac r6 = new X.3ac
            r8 = r1
            r9 = r14
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A1P = r6
            r11 = 19
            X.3ac r1 = new X.3ac
            r6 = r1
            r7 = r0
            r8 = r36
            r9 = r40
            r10 = r41
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A1O = r1
            X.69l r1 = new X.69l
            r1.<init>(r0, r5)
            r0.A1K = r1
            return
        L_0x02da:
            r10 = 6
            java.lang.String r7 = "voicenote"
            android.os.PowerManager$WakeLock r7 = X.AnonymousClass75K.A00(r12, r7, r10)
            r0.A0B = r7
            goto L_0x01c2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZT.<init>(android.view.View, X.03q, X.2qk, X.4FU, X.3Dh, X.3Wi, X.33m, com.whatsapp.audioRecording.AudioRecordFactory, com.whatsapp.audioRecording.OpusRecorderFactory, X.1il, X.5mA, X.4VH, X.2e0, X.33i, X.2sH, X.2oU, X.33p, X.33j, X.5aS, X.2WH, X.1VX, X.2rD, X.2re, X.3LQ, X.2y5, X.2a2, X.2qd, X.2hu, X.5Td, X.2aG, X.8y5, X.4FS, X.5Ua, X.2Yz, X.5qb, X.7Ro, X.4xf, X.5Nf, X.8tC, X.5H0, X.4xc, X.8qC, boolean, boolean):void");
    }
}
