package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;

/* renamed from: X.0aK  reason: invalid class name and case insensitive filesystem */
public class C07100aK implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView A00;

    public C07100aK(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        SearchView searchView = this.A00;
        View view2 = searchView.A0Y;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.A0a.getPaddingLeft();
            Rect A0N = AnonymousClass001.A0N();
            boolean A08 = AnonymousClass0YH.A08(searchView);
            if (searchView.A0M) {
                i9 = resources.getDimensionPixelSize(R.dimen.f6nameremoved) + resources.getDimensionPixelSize(R.dimen.f6nameremoved);
            } else {
                i9 = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
            searchAutoComplete.getDropDownBackground().getPadding(A0N);
            int i11 = A0N.left;
            if (A08) {
                i10 = -i11;
            } else {
                i10 = paddingLeft - (i11 + i9);
            }
            searchAutoComplete.setDropDownHorizontalOffset(i10);
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + A0N.left) + A0N.right) + i9) - paddingLeft);
        }
    }
}
