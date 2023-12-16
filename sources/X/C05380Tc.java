package X;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: X.0Tc  reason: invalid class name and case insensitive filesystem */
public class C05380Tc {
    public static final ArrayList A03 = AnonymousClass001.A0s();
    public SparseArray A00 = null;
    public WeakReference A01 = null;
    public WeakHashMap A02 = null;

    public final View A00(KeyEvent keyEvent, View view) {
        int size;
        View A002;
        WeakHashMap weakHashMap = this.A02;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        A002 = A00(keyEvent, viewGroup.getChildAt(childCount));
                    }
                } while (A002 == null);
                return A002;
            }
            AbstractList abstractList = (AbstractList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (abstractList != null && (size = abstractList.size() - 1) >= 0) {
                abstractList.get(size);
                throw AnonymousClass001.A0g("onUnhandledKeyEvent");
            }
        }
        return null;
    }
}
