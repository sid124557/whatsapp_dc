package X;

import android.view.View;
import android.widget.ProgressBar;
import com.whatsapp.CircularProgressBar;

/* renamed from: X.92F  reason: invalid class name */
public class AnonymousClass92F implements C183278pm {
    public final int A00;

    public AnonymousClass92F(int i) {
        this.A00 = i;
    }

    public final void BUX(View view) {
        CircularProgressBar circularProgressBar;
        switch (this.A00) {
            case 0:
            case 2:
                circularProgressBar = (CircularProgressBar) view;
                circularProgressBar.setMax(100);
                break;
            case 4:
                ProgressBar progressBar = (ProgressBar) view;
                progressBar.setProgress(0);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(8);
                return;
            default:
                circularProgressBar = (CircularProgressBar) view;
                break;
        }
        circularProgressBar.A0B = 0;
    }
}
