package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.List;
import java.util.Map;

/* renamed from: X.6l9  reason: invalid class name and case insensitive filesystem */
public class C135726l9 extends C153447bK {
    public long A00;
    public boolean A01;
    public final C56932sn A02;
    public final List A03 = AnonymousClass001.A0s();
    public final Map A04;

    public C135726l9(RecyclerView recyclerView, AnonymousClass7EB r4, ShapePickerRecyclerView shapePickerRecyclerView, C56932sn r6) {
        super(recyclerView, r4, shapePickerRecyclerView, true);
        this.A02 = r6;
        this.A00 = 0;
        this.A04 = AnonymousClass001.A0t();
    }

    public void A01(AnonymousClass6IZ r6, boolean z) {
        super.A01(r6, z);
        View view = r6.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView recyclerView = this.A06;
        Resources A0G = C18290x4.A0G(recyclerView);
        int i = R.dimen.f6nameremoved;
        if (z) {
            i = R.dimen.f6nameremoved;
        }
        layoutParams.width = A0G.getDimensionPixelSize(i);
        view.setLayoutParams(layoutParams);
        ImageView imageView = r6.A01;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Resources A0G2 = C18290x4.A0G(recyclerView);
        int i2 = R.dimen.f6nameremoved;
        if (z) {
            i2 = R.dimen.f6nameremoved;
        }
        int dimensionPixelSize = A0G2.getDimensionPixelSize(i2);
        layoutParams2.width = dimensionPixelSize;
        layoutParams2.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams2);
    }
}
