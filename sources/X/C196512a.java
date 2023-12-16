package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.12a  reason: invalid class name and case insensitive filesystem */
public final class C196512a extends C05570Ua {
    public final ViewGroup A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final WaTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C196512a(View view) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A00 = (ViewGroup) C18290x4.A0M(view, R.id.container);
        this.A03 = (WaTextView) C18290x4.A0M(view, R.id.title);
        this.A02 = (WaTextView) C18290x4.A0M(view, R.id.description);
        this.A01 = (WaImageView) C18290x4.A0M(view, R.id.icon);
    }
}
