package X;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0aG  reason: invalid class name and case insensitive filesystem */
public class C07060aG implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView A00;

    public C07060aG(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onFocusChange(View view, boolean z) {
        SearchView searchView = this.A00;
        View.OnFocusChangeListener onFocusChangeListener = searchView.A08;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
