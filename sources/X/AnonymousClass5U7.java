package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5U7  reason: invalid class name */
public final class AnonymousClass5U7 {
    public AudioFocusRequest A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public Handler A02;
    public Object A03;
    public List A04;
    public boolean A05;
    public final C620633i A06;
    public final Runnable A07 = new C117635sF(this, 16);

    public AnonymousClass5U7(C620633i r3) {
        C162457s7.A0J(r3, 1);
        this.A06 = r3;
    }

    public final AudioFocusRequest A00() {
        AudioFocusRequest audioFocusRequest = this.A00;
        if (audioFocusRequest != null) {
            return audioFocusRequest;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).build();
        this.A00 = build;
        return build;
    }

    public final void A01() {
        if (this.A03 != null) {
            Log.i("StatusPlaybackAudioManager/audio-focus-abandoned");
            this.A03 = null;
            AudioManager A0G = this.A06.A0G();
            if (A0G == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest A002 = A00();
                if (A002 != null) {
                    A0G.abandonAudioFocusRequest(A002);
                    return;
                }
                return;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C1237269n(0);
                this.A01 = onAudioFocusChangeListener;
            }
            A0G.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public final void A02(Object obj) {
        Handler handler;
        Log.i("AudioManager/on-abandon-audio-focus");
        if (this.A03 == obj && (handler = this.A02) != null) {
            Runnable runnable = this.A07;
            handler.removeCallbacks(runnable);
            Handler handler2 = this.A02;
            if (handler2 != null) {
                handler2.postDelayed(runnable, 1000);
            }
        }
    }

    public final void A03(Object obj) {
        Log.i("StatusPlaybackAudioManager/on-request-audio-focus");
        Handler handler = this.A02;
        if (handler != null) {
            handler.removeCallbacks(this.A07);
        }
        if (this.A03 == null) {
            Log.i("StatusPlaybackAudioManager/request-audio-focus");
            AudioManager A0G = this.A06.A0G();
            if (A0G != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest A002 = A00();
                    if (A002 != null) {
                        A0G.requestAudioFocus(A002);
                    }
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
                    if (onAudioFocusChangeListener == null) {
                        onAudioFocusChangeListener = new C1237269n(0);
                        this.A01 = onAudioFocusChangeListener;
                    }
                    A0G.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
                }
            }
        }
        this.A03 = obj;
    }
}
