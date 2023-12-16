package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4Z2  reason: invalid class name */
public class AnonymousClass4Z2 extends C05570Ua {
    public final View A00;
    public final FrameLayout A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final AnonymousClass5YB A04;
    public final ThumbnailButton A05;
    public final AnonymousClass5UY A06;
    public final /* synthetic */ AnonymousClass4XF A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Z2(FrameLayout frameLayout, AnonymousClass4XF r7) {
        super(frameLayout);
        this.A07 = r7;
        this.A01 = frameLayout;
        this.A03 = C86644Kx.A0M(frameLayout, R.id.text_status);
        ThumbnailButton thumbnailButton = (ThumbnailButton) frameLayout.findViewById(R.id.contact_photo);
        this.A05 = thumbnailButton;
        thumbnailButton.setEnabled(false);
        this.A06 = C18290x4.A0X(frameLayout, R.id.subgroup_photo);
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(frameLayout, r7.A0E, R.id.primary_name);
        this.A04 = A002;
        AnonymousClass5YB.A03(A002, r7.A00);
        TextEmojiLabel A0M = C86644Kx.A0M(frameLayout, R.id.secondary_name);
        this.A02 = A0M;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(419430400));
        frameLayout.setForeground(stateListDrawable);
        this.A00 = frameLayout.findViewById(R.id.separator);
        A0M.setTextColor(r7.A02);
    }

    public final void A07(int i) {
        View view = this.A00;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        AnonymousClass4XF r2 = this.A07;
        if (i == r2.A01) {
            A0T.setMarginStart(0);
        } else {
            A0T.setMarginStart(r2.A0A);
        }
        view.setBackgroundColor(r2.A09);
        view.setLayoutParams(A0T);
        if (!r2.A08) {
            return;
        }
        if (i == AnonymousClass002.A03(r2.A07)) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }
}
