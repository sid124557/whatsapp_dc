package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld;

/* renamed from: X.95P  reason: invalid class name */
public class AnonymousClass95P extends C05570Ua {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final /* synthetic */ IndiaUpiBankPickerActivityOld A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass95P(View view, IndiaUpiBankPickerActivityOld indiaUpiBankPickerActivityOld) {
        super(view);
        this.A03 = indiaUpiBankPickerActivityOld;
        this.A01 = AnonymousClass0x9.A0F(view, R.id.provider_icon);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.bank_name);
        this.A00 = view.findViewById(R.id.divider);
    }
}
