package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4Yb  reason: invalid class name and case insensitive filesystem */
public class C88264Yb extends C05570Ua {
    public final TextEmojiLabel A00;
    public final AnonymousClass5YB A01;
    public final WaImageButton A02;
    public final ThumbnailButton A03;
    public final C56892sj A04;
    public final C59862xc A05;

    public C88264Yb(View view, AnonymousClass64J r3, C56892sj r4, C59862xc r5) {
        super(view);
        this.A05 = r5;
        this.A03 = C86664Kz.A16(view, R.id.added_subgroup_row_group_icon);
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r3, R.id.added_subgroup_row_group_name);
        this.A01 = A002;
        this.A04 = r4;
        AnonymousClass5YB.A02(A002);
        this.A00 = AnonymousClass0x7.A0K(view, R.id.added_subgroup_row_group_status);
        this.A02 = C86664Kz.A10(view, R.id.added_subgroup_row_remove_button);
    }
}
