package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.ClearableEditText;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4TI  reason: invalid class name */
public class AnonymousClass4TI extends AnonymousClass066 {
    public final /* synthetic */ ClearableEditText A00;

    public void A0L(C05650Ui r5, int i) {
        if (i == 1) {
            r5.A0H(true);
            AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
            accessibilityNodeInfo.addAction(16);
            ClearableEditText clearableEditText = this.A00;
            r5.A09(clearableEditText.getContext().getString(R.string.f11nameremoved));
            accessibilityNodeInfo.setBoundsInParent(clearableEditText.getClearBounds());
        }
    }

    public boolean A0P(int i, int i2, Bundle bundle) {
        if (i != 1 || i2 != 16) {
            return false;
        }
        ClearableEditText clearableEditText = this.A00;
        View.OnClickListener onClickListener = clearableEditText.A01;
        if (onClickListener != null) {
            onClickListener.onClick(clearableEditText);
        }
        C86634Kw.A1I(clearableEditText);
        clearableEditText.requestFocus();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4TI(View view, ClearableEditText clearableEditText) {
        super(view);
        this.A00 = clearableEditText;
    }

    public int A0E(float f, float f2) {
        if (this.A00.A04((int) f, (int) f2)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    public void A0M(List list) {
        if (this.A00.getClearIconDrawable() != null) {
            list.add(AnonymousClass001.A0f());
        }
    }
}
