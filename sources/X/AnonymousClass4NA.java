package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4NA  reason: invalid class name */
public class AnonymousClass4NA extends LayoutInflater {
    public static final String[] A01 = {"android.widget.", "android.webkit."};
    public final C620733j A00;

    public LayoutInflater cloneInContext(Context context) {
        return new AnonymousClass4NA(context, this, this.A00);
    }

    public View onCreateView(String str, AttributeSet attributeSet) {
        String[] strArr = A01;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                View createView = createView(str, strArr[i], attributeSet);
                if (createView != null) {
                    return createView;
                }
                i++;
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }

    public AnonymousClass4NA(Context context, LayoutInflater layoutInflater, C620733j r3) {
        super(layoutInflater, context);
        this.A00 = r3;
    }

    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        View inflate = super.inflate(i, viewGroup, z);
        C620733j r4 = this.A00;
        if (!(inflate instanceof C180038k7)) {
            if (!z || inflate.getTag(R.id.bidilayout_ignore) == null) {
                C107555bV.A04(inflate, r4);
            } else if (inflate instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) inflate;
                int childCount = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    C107555bV.A04(viewGroup2.getChildAt(i2), r4);
                }
            }
            inflate.setTag(R.id.bidilayout_ignore, C107555bV.A00);
        }
        return inflate;
    }
}
