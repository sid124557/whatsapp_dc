package X;

import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: X.8MG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8MG implements Runnable {
    public final /* synthetic */ AudioAttributes A00;
    public final /* synthetic */ VibrationEffect A01;
    public final /* synthetic */ Vibrator A02;

    public final void run() {
        Vibrator vibrator = this.A02;
        AnonymousClass5ZK.A00(this.A00, this.A01, vibrator);
    }

    public /* synthetic */ AnonymousClass8MG(AudioAttributes audioAttributes, VibrationEffect vibrationEffect, Vibrator vibrator) {
        this.A02 = vibrator;
        this.A01 = vibrationEffect;
        this.A00 = audioAttributes;
    }
}
