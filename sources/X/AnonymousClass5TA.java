package X;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AlphaAnimation;
import com.whatsapp.R;
import com.whatsapp.camera.recording.RecordingView;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5TA  reason: invalid class name */
public class AnonymousClass5TA {
    public long A00;
    public RecordingView A01;
    public final long A02;
    public final long A03;
    public final Handler A04 = new AnonymousClass4MJ(Looper.getMainLooper(), this);
    public final AnonymousClass7DN A05;
    public final C56612sH A06;
    public final C620733j A07;

    public final String A00(long j) {
        Locale A022 = C620733j.A02(this.A07);
        Object[] A0M = AnonymousClass002.A0M();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C18280x3.A1S(A0M, timeUnit.toMinutes(j));
        A0M[1] = Long.valueOf(timeUnit.toSeconds(j) % 60);
        return String.format(A022, "%02d:%02d", A0M);
    }

    public void A01(boolean z, boolean z2, boolean z3) {
        RecordingView recordingView = this.A01;
        recordingView.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        if (z && z3) {
            AlphaAnimation A0H = C86604Kt.A0H();
            A0H.setDuration(220);
            recordingView.startAnimation(A0H);
        }
        recordingView.setSelected(z2);
        if (!z || !z2) {
            recordingView.A00.setText(A00(0));
            recordingView.A01.setProgress(0);
        }
    }

    public AnonymousClass5TA(AnonymousClass7DN r4, RecordingView recordingView, C56612sH r6, C620733j r7, long j, long j2) {
        this.A05 = r4;
        this.A01 = recordingView;
        this.A07 = r7;
        this.A06 = r6;
        recordingView.A01.setVisibility(8);
        recordingView.A00.setPadding(0, 0, 0, 0);
        recordingView.A00.setTextSize(2, 14.0f);
        recordingView.A00.setLetterSpacing(0.09f);
        recordingView.setBackground(C02680He.A00((Resources.Theme) null, recordingView.A02.getResources(), R.drawable.camera_info_background_new));
        recordingView.A00.setText(C107565bW.A0A(r7, 0));
        this.A03 = j;
        this.A02 = j2;
    }

    public boolean A02() {
        return AnonymousClass001.A1W(((System.currentTimeMillis() - this.A00) > 1000 ? 1 : ((System.currentTimeMillis() - this.A00) == 1000 ? 0 : -1)));
    }
}
