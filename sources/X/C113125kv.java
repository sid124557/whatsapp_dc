package X;

import com.whatsapp.WaImageButton;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

/* renamed from: X.5kv  reason: invalid class name and case insensitive filesystem */
public class C113125kv implements C1229466l {
    public final WaImageButton A00;
    public final C30721mu A01;
    public final VoiceNoteSeekBar A02;

    public C30721mu B7W() {
        return this.A01;
    }

    public void BXi(int i) {
        C107465bM.A06(this.A00);
    }

    public void BYz(int i) {
        this.A02.setProgress(i);
    }

    public void BaX() {
        C107465bM.A05(this.A00);
    }

    public void Bc6(int i) {
        C107465bM.A05(this.A00);
        this.A02.setMax(i);
    }

    public void Bcm(int i, boolean z) {
        C107465bM.A06(this.A00);
        if (z) {
            this.A02.setProgress(0);
        }
    }

    public C113125kv(WaImageButton waImageButton, C30721mu r2, VoiceNoteSeekBar voiceNoteSeekBar) {
        this.A01 = r2;
        this.A00 = waImageButton;
        this.A02 = voiceNoteSeekBar;
    }

    public void BRl(boolean z) {
    }
}
