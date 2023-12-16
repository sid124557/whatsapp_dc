package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.4wp  reason: invalid class name and case insensitive filesystem */
public final class C96724wp extends AnonymousClass6mM {
    public final TextEmojiLabel A00;
    public final AnonymousClass5YB A01;
    public final WaImageButton A02;
    public final ThumbnailButton A03;
    public final C105365Uq A04;
    public final C182778oy A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96724wp(View view, AnonymousClass64J r8, C114015mM r9, C182778oy r10) {
        super(view);
        C18260x0.A0a(r10, r9, r8, 2);
        this.A05 = r10;
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r8, R.id.contact_name);
        this.A01 = A002;
        this.A04 = r9.A06(view.getContext(), "wa-business-contact-view-holder");
        ThumbnailButton thumbnailButton = (ThumbnailButton) C18280x3.A0E(view, R.id.contact_photo);
        this.A03 = thumbnailButton;
        TextEmojiLabel A0M = C86614Ku.A0M(view, R.id.contact_status);
        this.A00 = A0M;
        this.A02 = (WaImageButton) C18280x3.A0E(view, R.id.message_btn);
        A0M.setClickable(true);
        A0M.setVisibility(0);
        A0M.A0A();
        AnonymousClass0x2.A0q(view.getContext(), A0M, R.color.f5nameremoved);
        thumbnailButton.setAlpha(1.0f);
        TextEmojiLabel textEmojiLabel = A002.A02;
        C106905aM.A04(textEmojiLabel);
        AnonymousClass5Yj.A08(view.getContext(), view.getContext(), textEmojiLabel, R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        AnonymousClass7I0 r5 = (AnonymousClass7I0) obj;
        C162457s7.A0J(r5, 0);
        AnonymousClass5YB r0 = this.A01;
        AnonymousClass3ZH r3 = r5.A00;
        r0.A08(r3);
        this.A04.A08(this.A03, r3);
        C162457s7.A0C(r3);
        String str = r3.A0X;
        if (str != null) {
            this.A00.A0K((List) null, AnonymousClass000.A0X("  ", AnonymousClass000.A0l(str)));
        }
        TextEmojiLabel textEmojiLabel = this.A00;
        String str2 = r3.A0X;
        C162457s7.A0C(str2);
        int length = str2.length();
        int i = 0;
        if (length <= 0) {
            i = 8;
        }
        textEmojiLabel.setVisibility(i);
        C18310x6.A19(this.A02, this, r5, 40);
    }
}
