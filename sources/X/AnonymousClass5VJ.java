package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.5VJ  reason: invalid class name */
public class AnonymousClass5VJ {
    public static void A00(Context context, int i) {
        float f;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("android.resource://");
        A0o.append(context.getPackageName());
        A0o.append("/");
        Uri parse = Uri.parse(AnonymousClass000.A0h(A0o, R.raw.ptt_end_fast));
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(new C108165cY());
        mediaPlayer.setAudioStreamType(i);
        if (i == 3) {
            f = 0.35f;
        } else {
            if (i == 0) {
                f = 0.2f;
            }
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
        }
        mediaPlayer.setVolume(f, f);
        try {
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            Log.e("SequentialVoiceMemoPlayer/playEndTone ", e);
        }
    }

    public static void A01(Context context, C69263Wi r4, Runnable runnable, int i) {
        float f;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("android.resource://");
        A0o.append(context.getPackageName());
        A0o.append("/");
        Uri parse = Uri.parse(AnonymousClass000.A0h(A0o, R.raw.ptt_middle_fast));
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(new C108165cY());
        mediaPlayer.setAudioStreamType(i);
        if (i == 3) {
            f = 0.35f;
        } else {
            if (i == 0) {
                f = 0.2f;
            }
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
            r4.A0T(runnable, 600);
        }
        mediaPlayer.setVolume(f, f);
        try {
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
            r4.A0T(runnable, 600);
        } catch (IOException e) {
            Log.e("SequentialVoiceMemoPlayer/playMiddleTone ", e);
        }
    }
}
