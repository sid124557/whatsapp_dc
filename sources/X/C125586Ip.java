package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.6Ip  reason: invalid class name and case insensitive filesystem */
public final class C125586Ip extends C05570Ua {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;
    public final WaImageView A03;
    public final /* synthetic */ C96974xP A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125586Ip(View view, C96974xP r3) {
        super(view);
        this.A04 = r3;
        this.A03 = (WaImageView) C18280x3.A0E(view, R.id.reactions_bottom_sheet_row_contact_thumbnail);
        this.A02 = C86614Ku.A0M(view, R.id.reactions_bottom_sheet_row_contact_reaction);
        this.A01 = AnonymousClass0x2.A0I(view, R.id.reactions_bottom_sheet_row_contact_name);
        this.A00 = C86604Kt.A0J(view, R.id.reactions_bottom_sheet_row_contact_media);
    }
}
