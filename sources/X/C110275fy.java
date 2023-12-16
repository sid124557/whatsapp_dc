package X;

import android.os.Handler;
import android.widget.SeekBar;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.IOException;

/* renamed from: X.5fy  reason: invalid class name and case insensitive filesystem */
public class C110275fy implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ MediaViewFragment A00;

    public C110275fy(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar != null) {
            MediaViewFragment mediaViewFragment = this.A00;
            String A0B = C107565bW.A0B(mediaViewFragment.A0l, (long) seekBar.getProgress());
            VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1o;
            if (voiceNoteSeekBar != null) {
                voiceNoteSeekBar.setContentDescription(C08310eF.A09(mediaViewFragment).getString(R.string.f11nameremoved, AnonymousClass000.A1b(A0B)));
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass5ZQ r0 = mediaViewFragment.A1g;
        if (r0 != null && r0.A0F()) {
            mediaViewFragment.A1g.A04();
        }
        Handler handler = mediaViewFragment.A08;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass5ZQ r5 = mediaViewFragment.A1g;
        if (r5 == null) {
            VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1o;
            if (voiceNoteSeekBar != null) {
                voiceNoteSeekBar.setProgress(0);
            }
        } else if (mediaViewFragment.A01 == 1) {
            try {
                if (mediaViewFragment.A1o != null) {
                    r5.A0A((int) (((float) r5.A03()) * (((float) mediaViewFragment.A1o.getProgress()) / ((float) mediaViewFragment.A1o.getMax()))));
                }
                mediaViewFragment.A1g.A08();
                Handler handler = mediaViewFragment.A08;
                if (handler != null) {
                    handler.sendEmptyMessage(0);
                }
                mediaViewFragment.A1d();
            } catch (IOException e) {
                Log.e("MediaViewFragment/onStopTrackingTouch/fail onStopTracking", e);
                AnonymousClass4SG.A3B(mediaViewFragment);
            }
        } else if (mediaViewFragment.A1o != null) {
            int A03 = (int) (((float) r5.A03()) * (((float) mediaViewFragment.A1o.getProgress()) / ((float) mediaViewFragment.A1o.getMax())));
            C30471mV A1a = mediaViewFragment.A1a(mediaViewFragment.A04);
            if (A1a != null) {
                mediaViewFragment.A1r(A1a, A03, false);
            }
        }
    }
}
