package X;

import android.view.View;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.5pq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116165pq implements C183188pd {
    public final /* synthetic */ VoiceRecordingView A00;

    public final void Bb7(int i) {
        long j;
        C179728jc r5 = this.A00.A0B;
        if (r5 != null) {
            C116155pp r52 = (C116155pp) r5;
            if (i != 0) {
                j = r52.A00() / ((long) i);
            } else {
                j = -1;
            }
            r52.A02 = j;
            if (r52.A0B && r52.A07 == null) {
                C86874Me A002 = r52.A0D.A00(r52, j);
                r52.A07 = A002;
                A002.A00();
                AnonymousClass5CI.A00(C111095hX.A04((View) r52.A0I));
            }
        }
    }

    public /* synthetic */ C116165pq(VoiceRecordingView voiceRecordingView) {
        this.A00 = voiceRecordingView;
    }
}
