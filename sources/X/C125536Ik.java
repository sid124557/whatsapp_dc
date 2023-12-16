package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.6Ik  reason: invalid class name and case insensitive filesystem */
public class C125536Ik extends C05570Ua {
    public final WaImageView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final /* synthetic */ C125246Hb A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125536Ik(View view, C125246Hb r3) {
        super(view);
        this.A03 = r3;
        this.A02 = AnonymousClass0x7.A0L(view, R.id.compliance_text_title_info);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.compliance_text_title);
        this.A00 = (WaImageView) C06560Yg.A02(view, R.id.compliance_call_action_btn);
    }
}
