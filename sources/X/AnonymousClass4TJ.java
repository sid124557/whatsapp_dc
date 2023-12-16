package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.4TJ  reason: invalid class name */
public class AnonymousClass4TJ extends AnonymousClass066 {
    public final Rect A00 = AnonymousClass001.A0N();
    public final TextView A01;
    public final C620633i A02;

    public int A0E(float f, float f2) {
        TextView textView = this.A01;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        int offsetForPosition = textView.getOffsetForPosition(f, f2);
        AnonymousClass8r4[] r2 = (AnonymousClass8r4[]) spanned.getSpans(offsetForPosition, offsetForPosition, AnonymousClass8r4.class);
        if (r2.length == 1) {
            return spanned.getSpanStart(r2[0]);
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(X.C05650Ui r7, int r8) {
        /*
            r6 = this;
            android.widget.TextView r3 = r6.A01
            java.lang.CharSequence r1 = r3.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0064
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<X.8r4> r0 = X.AnonymousClass8r4.class
            java.lang.Object[] r2 = r1.getSpans(r8, r8, r0)
            X.8r4[] r2 = (X.AnonymousClass8r4[]) r2
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x0064
            r0 = 0
            r5 = r2[r0]
            if (r5 == 0) goto L_0x0065
            java.lang.CharSequence r2 = r3.getText()
            boolean r0 = r2 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0033
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r2.getSpanStart(r5)
            int r0 = r2.getSpanEnd(r5)
            java.lang.CharSequence r2 = r2.subSequence(r1, r0)
        L_0x0033:
            r7.A09(r2)
            r4 = 1
            android.view.accessibility.AccessibilityNodeInfo r3 = r7.A01
            r3.setFocusable(r4)
            r7.A0H(r4)
            android.graphics.Rect r2 = r6.A00
            r6.A0T(r2, r5)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0056
            r6.A0T(r2, r5)
        L_0x004d:
            r3.setBoundsInParent(r2)
            r0 = 16
            r3.addAction(r0)
            return
        L_0x0056:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LinkAccessibilityHelper/LinkSpan bounds is empty for: "
            X.C18260x0.A0x(r0, r1, r8)
            r0 = 0
            r2.set(r0, r0, r4, r4)
            goto L_0x004d
        L_0x0064:
            r5 = 0
        L_0x0065:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LinkAccessibilityHelper/TouchableSpan is null for offset: "
            X.C18260x0.A0x(r0, r1, r8)
            java.lang.CharSequence r2 = r3.getText()
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TJ.A0L(X.0Ui, int):void");
    }

    public void A0M(List list) {
        if (!C86654Ky.A1X(this.A02, "android.hardware.type.featurephone")) {
            CharSequence text = this.A01.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                for (AnonymousClass8r4 spanStart : (AnonymousClass8r4[]) spanned.getSpans(0, spanned.length(), AnonymousClass8r4.class)) {
                    C86634Kw.A1V(list, spanned.getSpanStart(spanStart));
                }
            }
        }
    }

    public boolean A0P(int i, int i2, Bundle bundle) {
        AnonymousClass8r4 r0;
        if (i2 != 16) {
            return false;
        }
        TextView textView = this.A01;
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            AnonymousClass8r4[] r2 = (AnonymousClass8r4[]) ((Spanned) text).getSpans(i, i, AnonymousClass8r4.class);
            if (r2.length == 1 && (r0 = r2[0]) != null) {
                r0.onClick(textView);
                return true;
            }
        }
        C18260x0.A0x("LinkAccessibilityHelper/LinkSpan is null for offset: ", AnonymousClass001.A0o(), i);
        return false;
    }

    public final void A0T(Rect rect, AnonymousClass8r4 r8) {
        Layout layout;
        TextView textView = this.A01;
        CharSequence text = textView.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = textView.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(r8);
            int spanEnd = spanned.getSpanEnd(r8);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 != lineForOffset) {
                Rect A0N = AnonymousClass001.A0N();
                while (true) {
                    lineForOffset++;
                    if (lineForOffset > lineForOffset2) {
                        break;
                    }
                    layout.getLineBounds(lineForOffset, A0N);
                    rect.union(A0N);
                }
            } else {
                rect.left = (int) layout.getPrimaryHorizontal(spanStart);
                rect.right = (int) layout.getPrimaryHorizontal(spanEnd);
            }
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
    }

    public AnonymousClass4TJ(TextView textView, C620633i r3) {
        super(textView);
        this.A02 = r3;
        this.A01 = textView;
    }
}
