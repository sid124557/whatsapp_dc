package X;

import android.media.MediaPlayer;
import com.whatsapp.WaImageButton;
import com.whatsapp.registration.VerifyCaptcha;

/* renamed from: X.5cZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108175cZ implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ VerifyCaptcha A00;

    public final void onCompletion(MediaPlayer mediaPlayer) {
        VerifyCaptcha verifyCaptcha = this.A00;
        WaImageButton waImageButton = verifyCaptcha.A0F;
        if (waImageButton == null) {
            throw C18270x1.A0S("captchaAudioBtn");
        } else if (!waImageButton.isEnabled()) {
            WaImageButton waImageButton2 = verifyCaptcha.A0F;
            if (waImageButton2 == null) {
                throw C18270x1.A0S("captchaAudioBtn");
            }
            waImageButton2.setEnabled(true);
        }
    }

    public /* synthetic */ C108175cZ(VerifyCaptcha verifyCaptcha) {
        this.A00 = verifyCaptcha;
    }
}
