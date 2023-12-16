package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4Yn  reason: invalid class name and case insensitive filesystem */
public class C88384Yn extends C05570Ua {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final WaTextView A03;
    public final AnonymousClass5UY A04;
    public final AnonymousClass5UY A05;
    public final AnonymousClass5UY A06;
    public final WDSButton A07;
    public final WDSButton A08;
    public final /* synthetic */ AnonymousClass4X7 A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88384Yn(View view, C111095hX r7, AnonymousClass4X7 r8) {
        super(view);
        this.A09 = r8;
        this.A00 = view;
        this.A02 = (TextEmojiLabel) C18290x4.A0M(view, R.id.title);
        this.A06 = C18290x4.A0X(view, R.id.subtitle);
        this.A05 = C18290x4.A0X(view, R.id.groups_in_common);
        ImageView imageView = (ImageView) C18290x4.A0M(view, R.id.avatar);
        this.A01 = imageView;
        WDSButton wDSButton = (WDSButton) C18290x4.A0M(view, R.id.accept_button);
        this.A07 = wDSButton;
        WDSButton wDSButton2 = (WDSButton) C18290x4.A0M(view, R.id.reject_button);
        this.A08 = wDSButton2;
        this.A03 = (WaTextView) C18290x4.A0M(view, R.id.request_status);
        this.A04 = C18290x4.A0X(view, R.id.added_by_other_user);
        C18310x6.A19(view, r7, this, 13);
        C18310x6.A19(wDSButton, r8, this, 14);
        C18310x6.A19(wDSButton2, r8, this, 15);
        AnonymousClass0YY.A06(imageView, 2);
    }
}
