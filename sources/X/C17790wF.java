package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0wF  reason: invalid class name and case insensitive filesystem */
public class C17790wF implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public C17790wF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.A01 == 0) {
            ((SearchView) this.A00).A0M(i);
        }
    }
}
