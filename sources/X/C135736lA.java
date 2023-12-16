package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.6lA  reason: invalid class name and case insensitive filesystem */
public class C135736lA extends C153447bK {
    public static final int[] A01 = {R.drawable.ic_emoji_people, R.drawable.ic_emoji_nature, R.drawable.ic_emoji_food, R.drawable.ic_emoji_activity, R.drawable.ic_emoji_travel, R.drawable.ic_emoji_objects, R.drawable.ic_emoji_symbols, R.drawable.ic_emoji_flags};
    public static final int[] A02 = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    public final C125386Hv A00;

    public C135736lA(RecyclerView recyclerView, AnonymousClass7EB r6, ShapePickerRecyclerView shapePickerRecyclerView) {
        super(recyclerView, r6, shapePickerRecyclerView, false);
        Resources A0G = C18290x4.A0G(recyclerView);
        C125386Hv r0 = new C125386Hv(A0G.getDimensionPixelSize(R.dimen.f6nameremoved), A0G.getDimensionPixelSize(R.dimen.f6nameremoved), A0G.getDimensionPixelSize(R.dimen.f6nameremoved));
        this.A00 = r0;
        recyclerView.A0o(r0);
    }

    public void A01(AnonymousClass6IZ r8, boolean z) {
        int i;
        super.A01(r8, z);
        ImageView imageView = r8.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        RecyclerView recyclerView = this.A06;
        Resources A0G = C18290x4.A0G(recyclerView);
        int i2 = R.dimen.f6nameremoved;
        if (z) {
            i2 = R.dimen.f6nameremoved;
        }
        int dimensionPixelSize = A0G.getDimensionPixelSize(i2);
        float f = (float) dimensionPixelSize;
        float A012 = C86664Kz.A01(C18290x4.A0G(recyclerView), R.dimen.f6nameremoved);
        float f2 = 1.0f;
        if (z) {
            f2 = 0.9f;
        }
        int i3 = ((int) (f - (A012 * f2))) / 2;
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(i3, i3, i3, i3);
        View view = r8.A0H;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (z) {
            i = C18290x4.A0G(recyclerView).getDimensionPixelOffset(R.dimen.f6nameremoved);
        } else {
            i = -2;
        }
        layoutParams2.width = i;
        view.setLayoutParams(layoutParams2);
        this.A00.A00 = z;
    }
}
