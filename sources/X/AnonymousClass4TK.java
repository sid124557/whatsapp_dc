package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.VideoTimelineView;
import java.util.List;

/* renamed from: X.4TK  reason: invalid class name */
public class AnonymousClass4TK extends AnonymousClass066 {
    public Rect A00 = AnonymousClass001.A0N();
    public Rect A01 = AnonymousClass001.A0N();
    public Rect A02 = AnonymousClass001.A0N();
    public Rect A03 = AnonymousClass001.A0N();
    public boolean A04 = false;
    public final int A05;
    public final C182698oq A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public boolean A0P(int i, int i2, Bundle bundle) {
        C182698oq r4 = this.A06;
        if (r4 == null || !A0T() || i2 != 16) {
            return false;
        }
        if (i == 0) {
            r4.Bs1(-1, true);
            return true;
        } else if (i == 1) {
            r4.Bs1(1, true);
            return true;
        } else if (i != 2) {
            if (i == 3) {
                r4.Bs1(1, false);
            }
            return true;
        } else {
            r4.Bs1(-1, false);
            return true;
        }
    }

    public final boolean A0T() {
        if (!this.A04 || this.A02.isEmpty() || this.A03.isEmpty() || this.A00.isEmpty() || this.A01.isEmpty()) {
            return false;
        }
        return true;
    }

    public AnonymousClass4TK(View view, C182698oq r4, int i) {
        super(view);
        this.A05 = i;
        this.A06 = r4;
        this.A09 = view.getResources().getString(R.string.f11nameremoved);
        this.A0A = view.getResources().getString(R.string.f11nameremoved);
        this.A07 = view.getResources().getString(R.string.f11nameremoved);
        this.A08 = view.getResources().getString(R.string.f11nameremoved);
    }

    public int A0E(float f, float f2) {
        if (A0T()) {
            int i = (int) f;
            int i2 = (int) f2;
            if (this.A02.contains(i, i2)) {
                return 0;
            }
            if (this.A03.contains(i, i2)) {
                return 1;
            }
            if (this.A00.contains(i, i2)) {
                return 2;
            }
            if (this.A01.contains(i, i2)) {
                return 3;
            }
        }
        return -1;
    }

    public void A0L(C05650Ui r3, int i) {
        Rect rect;
        if (A0T()) {
            String simpleName = VideoTimelineView.class.getSimpleName();
            AccessibilityNodeInfo accessibilityNodeInfo = r3.A01;
            accessibilityNodeInfo.setClassName(simpleName);
            accessibilityNodeInfo.addAction(16);
            if (i == 0) {
                r3.A09(this.A09);
                rect = this.A02;
            } else if (i == 1) {
                r3.A09(this.A0A);
                rect = this.A03;
            } else if (i == 2) {
                r3.A09(this.A07);
                rect = this.A00;
            } else if (i == 3) {
                r3.A09(this.A08);
                rect = this.A01;
            } else {
                return;
            }
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    public void A0M(List list) {
        if (A0T()) {
            list.add(C18290x4.A0Z());
            list.add(AnonymousClass001.A0f());
            list.add(C18280x3.A0S());
            list.add(C18290x4.A0a());
        }
    }
}
