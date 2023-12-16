package X;

import android.media.AudioManager;

/* renamed from: X.5Td  reason: invalid class name and case insensitive filesystem */
public class C104995Td {
    public long A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public final C69263Wi A02;
    public final C620633i A03;

    public void A00() {
        AudioManager A0G = this.A03.A0G();
        if (A0G != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C1237269n(1);
                this.A01 = onAudioFocusChangeListener;
            }
            A0G.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public void A01() {
        AudioManager A0G = this.A03.A0G();
        if (A0G != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C1237269n(1);
                this.A01 = onAudioFocusChangeListener;
            }
            A0G.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
        }
    }

    public final boolean A02(int i) {
        AudioManager A0G = this.A03.A0G();
        if (A0G == null || A0G.getStreamVolume(3) != 0) {
            return true;
        }
        if (System.currentTimeMillis() - this.A00 <= 2000) {
            return false;
        }
        this.A00 = System.currentTimeMillis();
        this.A02.A0H(i, 0);
        return false;
    }

    public C104995Td(C69263Wi r1, C620633i r2) {
        this.A02 = r1;
        this.A03 = r2;
    }
}
