package X;

import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.5fv  reason: invalid class name and case insensitive filesystem */
public abstract class C110245fv implements AdapterView.OnItemClickListener {
    public long A00;
    public final C56612sH A01;

    public abstract void A00(AdapterView adapterView, View view, int i, long j);

    public C110245fv(C56612sH r1) {
        this.A01 = r1;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A00(adapterView, view, i, j);
        }
    }
}
