package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;

/* renamed from: X.4Yd  reason: invalid class name and case insensitive filesystem */
public final class C88284Yd extends C05570Ua {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final AnonymousClass5YB A04;
    public final /* synthetic */ GroupChangedParticipantsBottomSheet A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88284Yd(View view, GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet) {
        super(view);
        this.A05 = groupChangedParticipantsBottomSheet;
        AnonymousClass64J r1 = groupChangedParticipantsBottomSheet.A04;
        if (r1 != null) {
            AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r1, R.id.name);
            this.A04 = A002;
            TextEmojiLabel A0M = C86614Ku.A0M(view, R.id.status);
            this.A03 = A0M;
            A0M.setVisibility(8);
            ImageView A0J = C86604Kt.A0J(view, R.id.avatar);
            this.A00 = A0J;
            this.A01 = AnonymousClass0x2.A0I(view, R.id.owner);
            this.A02 = C86614Ku.A0M(view, R.id.secondary_name_view);
            AnonymousClass0YY.A06(A0J, 2);
            AnonymousClass5YB.A03(A002, AnonymousClass5Yj.A03(view.getContext(), view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            view.setBackgroundResource(R.drawable.selector_orange_gradient);
            return;
        }
        throw C18270x1.A0S("textEmojiLabelViewControllerFactory");
    }
}
