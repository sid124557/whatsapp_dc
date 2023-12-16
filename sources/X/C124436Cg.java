package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: X.6Cg  reason: invalid class name and case insensitive filesystem */
public final class C124436Cg extends BroadcastReceiver implements Runnable {
    public final Handler A00;
    public final C177938gh A01;
    public final /* synthetic */ C147797Ft A02;

    public C124436Cg(Handler handler, C177938gh r2, C147797Ft r3) {
        this.A02 = r3;
        this.A00 = handler;
        this.A01 = r2;
    }

    public void onReceive(Context context, Intent intent) {
        if (C18280x3.A1V(intent, "android.media.AUDIO_BECOMING_NOISY")) {
            this.A00.post(this);
        }
    }

    public void run() {
    }
}
