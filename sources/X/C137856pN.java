package X;

import android.graphics.Typeface;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.6pN  reason: invalid class name and case insensitive filesystem */
public final class C137856pN extends AnonymousClass6J1 {
    public final Typeface A00;
    public final View A01;
    public final WaTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137856pN(View view) {
        super(view);
        C162457s7.A0J(view, 1);
        View view2 = this.A0H;
        this.A02 = C86604Kt.A0O(view2, R.id.title);
        this.A01 = C18280x3.A0E(view2, R.id.avatar_pack_layout);
        Typeface createFromAsset = Typeface.createFromAsset(view.getResources().getAssets(), "fonts/Roboto-Medium.ttf");
        C162457s7.A0D(createFromAsset);
        this.A00 = createFromAsset;
    }
}
