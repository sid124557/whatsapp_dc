package androidx.preference;

import X.AnonymousClass0KP;
import X.C011409i;
import X.C05650Ui;
import X.C05790Uy;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.R;

public class PreferenceCategory extends PreferenceGroup {
    @Deprecated
    public void A0J(C05650Ui r8) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 28 && (collectionItemInfo = r8.A01.getCollectionItemInfo()) != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) new AnonymousClass0KP(collectionItemInfo).A00;
            r8.A0G(new AnonymousClass0KP(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), true, collectionItemInfo2.isSelected())));
        }
    }

    public boolean A0Q() {
        return false;
    }

    public boolean A0R() {
        return !super.A0Q();
    }

    public void A0T(C011409i r3) {
        super.A0T(r3);
        if (Build.VERSION.SDK_INT >= 28) {
            r3.A0H.setAccessibilityHeading(true);
        }
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public PreferenceCategory(Context context) {
        this(context, (AttributeSet) null);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C05790Uy.A00(context, R.attr.f3nameremoved, 16842892));
    }
}
