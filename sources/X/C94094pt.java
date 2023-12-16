package X;

import android.view.View;
import android.widget.RadioButton;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4pt  reason: invalid class name and case insensitive filesystem */
public class C94094pt extends AnonymousClass6ID {
    public final RadioButton A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final /* synthetic */ C87864Wk A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94094pt(View view, C87864Wk r3) {
        super(view, r3);
        this.A05 = r3;
        this.A02 = AnonymousClass0x7.A0K(view, R.id.select_list_item_header);
        this.A04 = AnonymousClass0x7.A0K(view, R.id.select_list_item_title);
        this.A01 = AnonymousClass0x7.A0K(view, R.id.select_list_item_description);
        this.A00 = (RadioButton) C06560Yg.A02(view, R.id.select_list_item_radio_button);
        this.A03 = AnonymousClass0x7.A0K(view, R.id.select_list_item_highlight);
        C18290x4.A1G(view, this, 18);
    }
}
