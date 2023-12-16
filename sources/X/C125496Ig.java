package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;

/* renamed from: X.6Ig  reason: invalid class name and case insensitive filesystem */
public class C125496Ig extends C05570Ua {
    public C85164Fe A00;
    public ShapeItemView A01;
    public final /* synthetic */ AnonymousClass6Hm A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125496Ig(View view, AnonymousClass6Hm r4) {
        super(view);
        this.A02 = r4;
        ShapeItemView shapeItemView = (ShapeItemView) view.findViewById(R.id.shape_item_view);
        this.A01 = shapeItemView;
        ViewGroup.LayoutParams layoutParams = shapeItemView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this.A01.setLayoutParams(layoutParams);
        C18290x4.A1F(view, this, 31);
    }
}
