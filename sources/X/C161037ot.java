package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7ot  reason: invalid class name and case insensitive filesystem */
public final class C161037ot {
    public static final C161797qU A00 = new AnonymousClass6NA();

    public static final void A01(Context context, C186448vK r11, RenderTreeNode renderTreeNode, ArrayList arrayList, int i, int i2) {
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (r11 != null) {
            Rect rect = new Rect(i, i2, r11.getWidth() + i, r11.getHeight() + i2);
            ArrayList arrayList2 = arrayList;
            arrayList.size();
            C161797qU BC6 = r11.BC6();
            if (BC6 != null) {
                int B5V = r11.B5V();
                RenderTreeNode A002 = A00(rect, r11, renderTreeNode, BC6);
                arrayList.add(A002);
                List list = renderTreeNode.A00;
                if (B5V > 0) {
                    if (list == null) {
                        list = AnonymousClass002.A0I(4);
                        renderTreeNode.A00 = list;
                    }
                    list.add(A002);
                    renderTreeNode2 = A002;
                } else {
                    if (list == null) {
                        list = AnonymousClass002.A0I(4);
                        renderTreeNode.A00 = list;
                    }
                    list.add(A002);
                }
                i = 0;
                i2 = 0;
            }
            int B5V2 = r11.B5V();
            for (int i3 = 0; i3 < B5V2; i3++) {
                A01(context, r11.B5R(i3), renderTreeNode2, arrayList2, r11.BEd(i3) + i, r11.BEe(i3) + i2);
            }
        }
    }

    public static final RenderTreeNode A00(Rect rect, C186448vK r7, RenderTreeNode renderTreeNode, C161797qU r9) {
        Rect rect2;
        int i;
        List list;
        int BAO = r7.BAO();
        if (BAO == 0 && r7.BAR() == 0 && r7.BAP() == 0 && r7.BAM() == 0) {
            rect2 = null;
        } else {
            rect2 = new Rect(BAO, r7.BAR(), r7.BAP(), r7.BAM());
        }
        Object B93 = r7.B93();
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (renderTreeNode == null || (list = renderTreeNode.A00) == null) {
            i = 0;
        } else {
            i = list.size();
        }
        return new RenderTreeNode(rect, rect2, renderTreeNode2, r9, B93, i);
    }
}
