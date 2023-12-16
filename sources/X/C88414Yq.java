package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4Yq  reason: invalid class name and case insensitive filesystem */
public class C88414Yq extends C05570Ua {
    public final C56972sr A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass5YB A02;
    public final WaImageButton A03;
    public final ThumbnailButton A04;
    public final AnonymousClass5UX A05;
    public final C64773Ex A06;
    public final AnonymousClass5ZU A07;
    public final C56982ss A08;
    public final C56892sj A09;
    public final AnonymousClass1VX A0A;

    public C88414Yq(View view, C56972sr r3, AnonymousClass64J r4, AnonymousClass5UX r5, C64773Ex r6, AnonymousClass5ZU r7, C56982ss r8, C56892sj r9, AnonymousClass1VX r10) {
        super(view);
        this.A0A = r10;
        this.A00 = r3;
        this.A08 = r8;
        this.A04 = C86664Kz.A16(view, R.id.added_subgroup_row_group_icon);
        this.A07 = r7;
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r4, R.id.added_subgroup_row_group_name);
        this.A02 = A002;
        this.A05 = r5;
        this.A06 = r6;
        this.A09 = r9;
        AnonymousClass5YB.A02(A002);
        this.A01 = AnonymousClass0x7.A0K(view, R.id.added_subgroup_row_group_status);
        this.A03 = C86664Kz.A10(view, R.id.added_subgroup_row_remove_button);
    }
}
