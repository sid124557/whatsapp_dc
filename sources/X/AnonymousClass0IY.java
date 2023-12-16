package X;

import android.view.View;
import android.view.ViewParent;
import com.whatsapp.R;

/* renamed from: X.0IY  reason: invalid class name */
public class AnonymousClass0IY {
    public static C15910sA A00(View view) {
        C15910sA r2 = (C15910sA) view.getTag(R.id.view_tree_lifecycle_owner);
        if (r2 == null) {
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                r2 = (C15910sA) view2.getTag(R.id.view_tree_lifecycle_owner);
                parent = view2.getParent();
                if (r2 != null) {
                    break;
                }
            }
        }
        return r2;
    }
}
