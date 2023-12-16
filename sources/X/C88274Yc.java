package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.4Yc  reason: invalid class name and case insensitive filesystem */
public class C88274Yc extends C05570Ua {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final AnonymousClass5YB A04;
    public final /* synthetic */ GroupAdminPickerActivity A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88274Yc(View view, GroupAdminPickerActivity groupAdminPickerActivity) {
        super(view);
        this.A05 = groupAdminPickerActivity;
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, groupAdminPickerActivity.A07, R.id.name);
        this.A04 = A002;
        TextEmojiLabel A0M = C86644Kx.A0M(view, R.id.status);
        this.A03 = A0M;
        ImageView A0F = AnonymousClass0x9.A0F(view, R.id.avatar);
        this.A00 = A0F;
        this.A01 = AnonymousClass002.A09(view, R.id.owner);
        this.A02 = C86644Kx.A0M(view, R.id.secondary_name_view);
        AnonymousClass0YY.A06(A0F, 2);
        AnonymousClass5YB.A03(A002, AnonymousClass5Yj.A03(view.getContext(), view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        AnonymousClass0x2.A0q(view.getContext(), A0M, R.color.f5nameremoved);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setOnClickListener(groupAdminPickerActivity.A0S);
    }
}
