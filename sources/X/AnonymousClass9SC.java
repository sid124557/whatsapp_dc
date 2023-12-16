package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;

/* renamed from: X.9SC  reason: invalid class name */
public class AnonymousClass9SC {
    public Object A00;
    public final Context A01;
    public final AudioManager A02;
    public final Handler A03;
    public final Handler A04;
    public final AudioAttributesCompat A05;
    public final AnonymousClass9MC A06;
    public final AnonymousClass9MD A07 = new AnonymousClass9MD(this);
    public final C193249Ns A08;
    public final C194799Un A09;
    public final C192889Mc A0A;
    public final C203689o9 A0B;
    public final C203669o7 A0C;
    public final AnonymousClass9LI A0D;
    public volatile AudioGraphClientProvider A0E;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:34|35|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00f4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00() {
        /*
            r22 = this;
            r7 = r22
            monitor-enter(r7)
            X.9Un r11 = r7.A09     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "dAS"
            X.C194799Un.A00(r11, r0)     // Catch:{ all -> 0x016b }
            X.9o9 r0 = r7.A0B     // Catch:{ all -> 0x016b }
            r18 = r0
            java.lang.String r13 = "audio_pipeline_destroying"
            java.lang.String r6 = "AudioPipelineController"
            int r0 = r7.hashCode()     // Catch:{ all -> 0x016b }
            long r0 = (long) r0     // Catch:{ all -> 0x016b }
            r9 = 0
            r14 = r6
            r15 = r9
            r16 = r0
            r12 = r18
            r12.BK2(r13, r14, r15, r16)     // Catch:{ all -> 0x016b }
            X.9Ns r0 = r7.A08     // Catch:{ all -> 0x016b }
            r0.A01 = r9     // Catch:{ all -> 0x016b }
            java.lang.String r1 = "handleSetAudioMixing %s"
            java.lang.String r0 = "UNSET"
            X.C162477s9.A04(r0, r6, r1)     // Catch:{ all -> 0x016b }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x016b }
            r0 = 23
            if (r1 < r0) goto L_0x003d
            java.lang.Object r1 = r7.A00     // Catch:{ all -> 0x016b }
            if (r1 == 0) goto L_0x003d
            android.media.AudioManager r0 = r7.A02     // Catch:{ all -> 0x016b }
            android.media.AudioDeviceCallback r1 = (android.media.AudioDeviceCallback) r1     // Catch:{ all -> 0x016b }
            r0.unregisterAudioDeviceCallback(r1)     // Catch:{ all -> 0x016b }
        L_0x003d:
            java.lang.String r0 = "dAE"
            X.C194799Un.A00(r11, r0)     // Catch:{ all -> 0x016b }
            android.os.Handler r5 = r7.A03     // Catch:{ all -> 0x016b }
            X.9Um r3 = X.C194789Um.A02     // Catch:{ all -> 0x016b }
            r13 = 1
            if (r5 == 0) goto L_0x005a
            java.util.Map r4 = r3.A00     // Catch:{ all -> 0x016b }
            java.lang.Object r8 = r4.get(r5)     // Catch:{ all -> 0x016b }
            android.os.HandlerThread r8 = (android.os.HandlerThread) r8     // Catch:{ all -> 0x016b }
            if (r8 != 0) goto L_0x00b9
            java.lang.String r1 = "ThreadPool"
            java.lang.String r0 = "Trying to quit thread not managed by ThreadPool - abort"
            X.C162477s9.A08(r1, r0)     // Catch:{ all -> 0x016b }
        L_0x005a:
            java.lang.String r17 = "audio_pipeline_destroyed"
            int r0 = r7.hashCode()     // Catch:{ all -> 0x016b }
            long r14 = (long) r0     // Catch:{ all -> 0x016b }
            android.media.AudioManager r12 = r7.A02     // Catch:{ all -> 0x016b }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x016b }
            r0 = 6
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x016b }
            r8.<init>(r0)     // Catch:{ all -> 0x016b }
            r10 = 0
            r5 = 2
            java.lang.Integer r1 = r11.A01     // Catch:{ all -> 0x016b }
            if (r1 == 0) goto L_0x008e
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x016b }
            boolean r0 = r11.A02     // Catch:{ all -> 0x016b }
            X.AnonymousClass000.A1P(r2, r0, r10)     // Catch:{ all -> 0x016b }
            r2[r13] = r1     // Catch:{ all -> 0x016b }
            long r0 = r11.A00     // Catch:{ all -> 0x016b }
            long r3 = r3 - r0
            X.AnonymousClass000.A1Q(r2, r5, r3)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "%d_%d_%d_ms"
            java.lang.String r1 = java.lang.String.format(r9, r0, r2)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "AP_AudioDeviceChanged"
            r8.put(r0, r1)     // Catch:{ all -> 0x016b }
        L_0x008e:
            java.lang.String r0 = "android.media.property.OUTPUT_FRAMES_PER_BUFFER"
            java.lang.String r1 = r12.getProperty(r0)     // Catch:{ all -> 0x016b }
            if (r1 == 0) goto L_0x009b
            java.lang.String r0 = "AP_OutputFramesPerBuffer"
            r8.put(r0, r1)     // Catch:{ all -> 0x016b }
        L_0x009b:
            java.lang.String r0 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r1 = r12.getProperty(r0)     // Catch:{ all -> 0x016b }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r0 = "AP_OutputSampleRate"
            r8.put(r0, r1)     // Catch:{ all -> 0x016b }
        L_0x00a8:
            int r0 = r12.getMode()     // Catch:{ all -> 0x016b }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "AP_AMMode"
            r8.put(r0, r1)     // Catch:{ all -> 0x016b }
            X.9Nr r3 = r11.A03     // Catch:{ all -> 0x016b }
            monitor-enter(r3)     // Catch:{ all -> 0x016b }
            goto L_0x011b
        L_0x00b9:
            java.lang.String r2 = "ThreadPool"
            java.lang.String r1 = "Quitting thread %s"
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x016b }
            X.C162477s9.A05(r0, r2, r1)     // Catch:{ all -> 0x016b }
            r4.remove(r5)     // Catch:{ all -> 0x016b }
            monitor-enter(r3)     // Catch:{ all -> 0x016b }
            java.util.Map r4 = r3.A01     // Catch:{ all -> 0x0165 }
            java.lang.Object r5 = r4.get(r8)     // Catch:{ all -> 0x0165 }
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r5 = (com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus) r5     // Catch:{ all -> 0x0165 }
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r0 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.TAKEN     // Catch:{ all -> 0x0165 }
            if (r5 != r0) goto L_0x0102
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r1 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.AVAILABLE     // Catch:{ all -> 0x0165 }
            r4.put(r8, r1)     // Catch:{ all -> 0x0165 }
            java.lang.Object r0 = r4.get(r8)     // Catch:{ all -> 0x0163 }
            if (r0 != r1) goto L_0x00fc
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r0 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.QUITTING     // Catch:{ all -> 0x0163 }
            r4.put(r8, r0)     // Catch:{ all -> 0x0163 }
            r8.quit()     // Catch:{ all -> 0x0163 }
            r4.remove(r8)     // Catch:{ InterruptedException -> 0x00f4 }
            java.lang.String r1 = "Thread %s killed."
            java.lang.String r0 = r8.getName()     // Catch:{ InterruptedException -> 0x00f4 }
            X.C162477s9.A05(r0, r2, r1)     // Catch:{ InterruptedException -> 0x00f4 }
            goto L_0x010b
        L_0x00f4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0163 }
            r0.interrupt()     // Catch:{ all -> 0x0163 }
            goto L_0x010b
        L_0x00fc:
            java.lang.String r0 = "Trying to kill thread that is not AVAILABLE"
            X.C162477s9.A08(r2, r0)     // Catch:{ all -> 0x0163 }
            goto L_0x010b
        L_0x0102:
            java.lang.String r1 = "Trying to quit thread that is not TAKEN but in %s"
            java.lang.Object[] r0 = X.AnonymousClass6C9.A1Z(r5, r13)     // Catch:{ all -> 0x0165 }
            X.C162477s9.A0F(r2, r1, r0)     // Catch:{ all -> 0x0165 }
        L_0x010b:
            monitor-exit(r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r1 = "Number of threads in pool: %d"
            int r0 = r4.size()     // Catch:{ all -> 0x016b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x016b }
            X.C162477s9.A05(r0, r2, r1)     // Catch:{ all -> 0x016b }
            goto L_0x005a
        L_0x011b:
            java.util.LinkedList r10 = r3.A01     // Catch:{ all -> 0x0168 }
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x014e
            long r0 = r3.A00     // Catch:{ all -> 0x0168 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0168 }
            java.util.Iterator r4 = r10.iterator()     // Catch:{ all -> 0x0168 }
        L_0x012d:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0168 }
            if (r2 == 0) goto L_0x0140
            java.lang.String r2 = X.AnonymousClass001.A0m(r4)     // Catch:{ all -> 0x0168 }
            r5.append(r2)     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = ","
            r5.append(r2)     // Catch:{ all -> 0x0168 }
            goto L_0x012d
        L_0x0140:
            r5.append(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x0168 }
            r10.clear()     // Catch:{ all -> 0x0168 }
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0168 }
        L_0x014e:
            monitor-exit(r3)     // Catch:{ all -> 0x016b }
            if (r9 == 0) goto L_0x0156
            java.lang.String r0 = "AP_CallsSinceSnapshot"
            r8.put(r0, r9)     // Catch:{ all -> 0x016b }
        L_0x0156:
            r16 = r18
            r18 = r6
            r19 = r8
            r20 = r14
            r16.BK2(r17, r18, r19, r20)     // Catch:{ all -> 0x016b }
            monitor-exit(r7)
            return
        L_0x0163:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0165 }
            goto L_0x016a
        L_0x0168:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016b }
        L_0x016a:
            throw r0     // Catch:{ all -> 0x016b }
        L_0x016b:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9SC.A00():void");
    }

    public AnonymousClass9SC(Context context, Handler handler, AnonymousClass9MC r7, C194799Un r8, C203689o9 r9, C203669o7 r10, AnonymousClass9LI r11) {
        C193249Ns r3 = new C193249Ns();
        this.A08 = r3;
        new AnonymousClass9XK();
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        this.A0C = r10;
        this.A0B = r9;
        this.A0D = r11;
        this.A09 = r8;
        this.A06 = r7;
        this.A04 = AnonymousClass000.A0A();
        if (Build.VERSION.SDK_INT >= 23) {
            this.A00 = new C1900993v(this);
        }
        this.A03 = handler;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        if (audioManager != null) {
            this.A02 = audioManager;
            this.A0A = new C192889Mc(audioManager);
            C16650tk r2 = new AnonymousClass0KX().A00;
            AudioAttributes.Builder builder = ((C08410eP) r2).A00;
            builder.setLegacyStreamType(3);
            r2.Bni(1);
            builder.setContentType(2);
            this.A05 = new AudioAttributesCompat(r2.AyA());
            r3.A01 = r9;
            C194799Un.A00(r8, "c");
            C162477s9.A06("AudioPipelineController", "AP ctor finished");
            return;
        }
        throw AnonymousClass002.A0E("Cannot obtain AUDIO_SERVICE");
    }
}
