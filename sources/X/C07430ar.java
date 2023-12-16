package X;

import android.os.Handler;
import android.widget.SeekBar;

/* renamed from: X.0ar  reason: invalid class name and case insensitive filesystem */
public class C07430ar implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ AnonymousClass0D1 A00;
    public final /* synthetic */ AnonymousClass0XI A01;
    public final /* synthetic */ C153427bI A02;
    public final /* synthetic */ AnonymousClass84O A03;
    public final /* synthetic */ C835248t A04;
    public final /* synthetic */ C835248t A05;

    public C07430ar(AnonymousClass0D1 r1, AnonymousClass0XI r2, C153427bI r3, AnonymousClass84O r4, C835248t r5, C835248t r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r6;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Handler handler = C06510Xz.A00;
        AnonymousClass0XI r1 = this.A01;
        handler.removeMessages(0, r1);
        r1.A07 = i;
        handler.sendMessage(handler.obtainMessage(0, r1));
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C835248t r4 = this.A05;
        if (r4 != null) {
            AnonymousClass84O r3 = this.A03;
            C152057Xj r2 = new C152057Xj();
            C153427bI r1 = this.A02;
            r2.A04(r1, 0);
            C159377lj.A01(r1, r3, r2.A03(), r4);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C835248t r4 = this.A04;
        if (r4 != null) {
            AnonymousClass84O r3 = this.A03;
            C152057Xj r2 = new C152057Xj();
            C153427bI r1 = this.A02;
            r2.A04(r1, 0);
            C159377lj.A01(r1, r3, r2.A03(), r4);
        }
    }
}
