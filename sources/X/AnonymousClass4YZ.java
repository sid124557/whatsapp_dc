package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.4YZ  reason: invalid class name */
public final class AnonymousClass4YZ extends C05570Ua {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaImageView A02;
    public String A03;
    public final /* synthetic */ AnonymousClass4WZ A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4YZ(View view, C101915Gt r4, C101925Gu r5, AnonymousClass4WZ r6) {
        super(view);
        C162457s7.A0J(r5, 4);
        this.A04 = r6;
        this.A02 = (WaImageView) C18290x4.A0M(view, R.id.status_emoji);
        this.A00 = (TextEmojiLabel) C18290x4.A0M(view, R.id.status_text);
        WaImageView waImageView = (WaImageView) C18290x4.A0M(view, R.id.status_selected_check);
        this.A01 = waImageView;
        waImageView.setVisibility(8);
        C109495ei.A00(view, r4, this, 15);
        C1237169m.A00(view, this, r5, 11);
    }
}
