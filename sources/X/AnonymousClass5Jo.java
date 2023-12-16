package X;

import android.os.Handler;
import com.whatsapp.conversation.conversationrow.MediaTimeDisplay;

/* renamed from: X.5Jo  reason: invalid class name */
public class AnonymousClass5Jo {
    public Runnable A00 = new C117615sD((Object) this, 3);
    public boolean A01 = false;
    public final int A02 = 100;
    public final Handler A03 = AnonymousClass000.A0A();
    public final Runnable A04;

    public AnonymousClass5Jo(Runnable runnable) {
        this.A04 = runnable;
    }

    public static C1897492m A00(MediaTimeDisplay mediaTimeDisplay) {
        mediaTimeDisplay.A00();
        mediaTimeDisplay.A03 = new AnonymousClass5Jo(new C117615sD((Object) mediaTimeDisplay, 2));
        mediaTimeDisplay.A08 = false;
        mediaTimeDisplay.A00 = 1;
        return new C1897492m(mediaTimeDisplay, 192);
    }
}
