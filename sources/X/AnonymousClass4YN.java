package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4YN  reason: invalid class name */
public final class AnonymousClass4YN extends C05570Ua {
    public final WaImageView A00;
    public final WaTextView A01;
    public final WaTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4YN(View view) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A02 = (WaTextView) C18290x4.A0M(view, R.id.description_text);
        this.A01 = (WaTextView) C18290x4.A0M(view, R.id.command_text);
        this.A00 = (WaImageView) C18290x4.A0M(view, R.id.command_image);
    }
}
