package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.4xB  reason: invalid class name and case insensitive filesystem */
public final class C96904xB extends C88494Yy {
    public final TextEmojiLabel A00;
    public final AnonymousClass5YB A01;
    public final WaImageView A02;
    public final AnonymousClass5UY A03;
    public final /* synthetic */ AnonymousClass4X3 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96904xB(View view, AnonymousClass4X3 r4) {
        super(view);
        this.A04 = r4;
        this.A01 = AnonymousClass5YB.A00(view, r4.A02, R.id.name);
        this.A00 = C86614Ku.A0M(view, R.id.about_info);
        this.A02 = C18280x3.A0J(view, R.id.avatar);
        this.A03 = AnonymousClass0x2.A0M(view, R.id.admin_label_container);
    }
}
