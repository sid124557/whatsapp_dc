package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.6Hu  reason: invalid class name and case insensitive filesystem */
public final class C125376Hu extends C04580Ov {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final /* synthetic */ C158927km A03;

    public C125376Hu(C158927km r1, int i, int i2, boolean z) {
        this.A03 = r1;
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r8, RecyclerView recyclerView) {
        int i;
        super.A03(rect, view, r8, recyclerView);
        C626936e.A0B(recyclerView instanceof ShapePickerRecyclerView);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) recyclerView;
        int A002 = RecyclerView.A00(view);
        if (A002 != -1) {
            C160127n5 A0K = this.A03.A0J.A0K(A002);
            shapePickerRecyclerView.A14();
            int i2 = shapePickerRecyclerView.A01;
            int actualShapeSpacing = shapePickerRecyclerView.getActualShapeSpacing();
            int i3 = A0K.A02;
            if (i3 == 0) {
                int i4 = A0K.A01 % i2;
                int i5 = (i4 * actualShapeSpacing) / i2;
                int i6 = actualShapeSpacing - (((i4 + 1) * actualShapeSpacing) / i2);
                boolean z = this.A02;
                int i7 = i5;
                if (z) {
                    i7 = i6;
                }
                rect.left = i7;
                if (!z) {
                    i5 = i6;
                }
                rect.right = i5;
                i = this.A01;
            } else if (i3 == 1) {
                i = this.A00;
            } else {
                return;
            }
            rect.top = i;
        }
    }
}
