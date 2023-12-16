package X;

import android.os.SystemClock;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.whatsapp.textstatuscomposer.voice.VoiceStatusRecordingVisualizer;

/* renamed from: X.5rR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117135rR implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C86874Me A01;

    public final void run() {
        C86874Me r0 = this.A01;
        float f = this.A00;
        C116155pp r02 = (C116155pp) r0.A0D.get();
        if (r02 != null) {
            VoiceStatusRecordingVisualizer voiceStatusRecordingVisualizer = ((VoiceRecordingView) r02.A0I).A0C;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = voiceStatusRecordingVisualizer.A00;
            if (j != 0) {
                voiceStatusRecordingVisualizer.A01 = Math.max(elapsedRealtime - j, 0);
            }
            voiceStatusRecordingVisualizer.A00 = elapsedRealtime;
            voiceStatusRecordingVisualizer.A0B.add(Float.valueOf(f));
            if (!voiceStatusRecordingVisualizer.A06) {
                voiceStatusRecordingVisualizer.A06 = true;
                voiceStatusRecordingVisualizer.invalidate();
            }
        }
    }

    public /* synthetic */ C117135rR(C86874Me r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }
}
