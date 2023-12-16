package X;

import android.view.View;
import android.view.ViewParent;
import com.whatsapp.R;

/* renamed from: X.0IZ  reason: invalid class name */
public class AnonymousClass0IZ {
    public static C15940sD A00(View view) {
        C15940sD r2 = (C15940sD) view.getTag(R.id.view_tree_view_model_store_owner);
        if (r2 == null) {
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                r2 = (C15940sD) view2.getTag(R.id.view_tree_view_model_store_owner);
                parent = view2.getParent();
                if (r2 != null) {
                    break;
                }
            }
        }
        return r2;
    }
}
