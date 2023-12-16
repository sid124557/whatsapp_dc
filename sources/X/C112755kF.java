package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.status.playback.widget.VoiceStatusContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.5kF  reason: invalid class name and case insensitive filesystem */
public class C112755kF implements C184288rY {
    public final C184288rY A00;
    public final WeakReference A01;

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        this.A00.Bog(bitmap, imageView, z);
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) this.A01.get();
        if (voiceStatusContentView != null) {
            voiceStatusContentView.A06();
        }
    }

    public void Bp2(ImageView imageView) {
        this.A00.Bp2(imageView);
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) this.A01.get();
        if (voiceStatusContentView != null) {
            voiceStatusContentView.A06();
        }
    }

    public C112755kF(C112775kH r2, VoiceStatusContentView voiceStatusContentView) {
        this.A01 = AnonymousClass0x9.A14(voiceStatusContentView);
        this.A00 = r2;
    }
}
