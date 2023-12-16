package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.0ai  reason: invalid class name and case insensitive filesystem */
public class C07340ai implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C04070Mr A00;
    public final /* synthetic */ AlertController$RecycleListView A01;
    public final /* synthetic */ C06200Wq A02;

    public C07340ai(C04070Mr r1, AlertController$RecycleListView alertController$RecycleListView, C06200Wq r3) {
        this.A00 = r1;
        this.A01 = alertController$RecycleListView;
        this.A02 = r3;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C04070Mr r2 = this.A00;
        boolean[] zArr = r2.A0N;
        if (zArr != null) {
            zArr[i] = this.A01.isItemChecked(i);
        }
        r2.A09.onClick(this.A02.A0W, i, this.A01.isItemChecked(i));
    }
}
