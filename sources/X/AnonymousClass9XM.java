package X;

import android.media.MediaPlayer;
import android.view.View;

/* renamed from: X.9XM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9XM implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ View A00;

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.A00.setVisibility(0);
    }

    public /* synthetic */ AnonymousClass9XM(View view) {
        this.A00 = view;
    }
}
