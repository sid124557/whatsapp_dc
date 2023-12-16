package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4wi  reason: invalid class name and case insensitive filesystem */
public final class C96654wi extends AnonymousClass6mM {
    public final WaTextView A00;
    public final ThumbnailButton A01;
    public final AnonymousClass2HH A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96654wi(View view, AnonymousClass2HH r3) {
        super(view);
        C162457s7.A0J(r3, 2);
        this.A02 = r3;
        this.A01 = (ThumbnailButton) C18280x3.A0E(view, R.id.profile_icon);
        this.A00 = C86604Kt.A0O(view, R.id.biz_name);
    }

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        AnonymousClass7EG r6 = (AnonymousClass7EG) obj;
        C162457s7.A0J(r6, 0);
        WaTextView waTextView = this.A00;
        C109065e1 r1 = r6.A00;
        waTextView.setText(r1.A0I);
        String str = r1.A0G;
        if (str == null || str.length() == 0) {
            this.A01.setImageResource(R.drawable.avatar_contact);
            return;
        }
        AnonymousClass2HH r3 = this.A02;
        ThumbnailButton thumbnailButton = this.A01;
        Drawable A002 = AnonymousClass0RP.A00(thumbnailButton.getContext(), R.drawable.avatar_contact);
        r3.A00.A02(A002, A002, thumbnailButton, str);
    }
}
