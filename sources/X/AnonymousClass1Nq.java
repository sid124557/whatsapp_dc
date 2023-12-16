package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.community.SubgroupWithParentView;

/* renamed from: X.1Nq  reason: invalid class name */
public final class AnonymousClass1Nq extends SubgroupWithParentView implements C182228o4 {
    public AnonymousClass1Nq(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        layoutParams.gravity = 1;
        return layoutParams;
    }

    public View getHeaderView() {
        return this;
    }
}
