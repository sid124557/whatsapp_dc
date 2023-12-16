package X;

import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Formatter;

/* renamed from: X.5fz  reason: invalid class name and case insensitive filesystem */
public class C110285fz implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ AnonymousClass563 A00;
    public final /* synthetic */ AnonymousClass5YG A01;

    public C110285fz(AnonymousClass563 r1, AnonymousClass5YG r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2;
        if (z && ((long) this.A01.A06()) != -9223372036854775807L) {
            AnonymousClass563 r0 = this.A00;
            TextView textView = r0.A0w;
            StringBuilder sb = r0.A15;
            Formatter formatter = r0.A16;
            int progress = seekBar.getProgress();
            AnonymousClass5YG r02 = r0.A0I;
            if (r02 != null) {
                i2 = (int) C18290x4.A0B(((long) r02.A06()) * ((long) progress));
            } else {
                i2 = 0;
            }
            textView.setText(AnonymousClass5VT.A01(sb, formatter, (long) i2));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        AnonymousClass563 r1 = this.A00;
        r1.A0T = true;
        r1.A01();
        r1.removeCallbacks(r1.A14);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int i;
        AnonymousClass563 r4 = this.A00;
        r4.A0T = false;
        r4.A0t.setProgress(seekBar.getProgress());
        int progress = seekBar.getProgress();
        AnonymousClass5YG r0 = r4.A0I;
        if (r0 != null) {
            i = (int) C18290x4.A0B(((long) r0.A06()) * ((long) progress));
        } else {
            i = 0;
        }
        AnonymousClass5YG r1 = this.A01;
        if (i >= r1.A06()) {
            i -= 600;
        }
        r1.A0P(i);
        r4.A04(800);
        r4.A07();
    }
}
