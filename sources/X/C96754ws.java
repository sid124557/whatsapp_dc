package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4ws  reason: invalid class name and case insensitive filesystem */
public class C96754ws extends AnonymousClass6mM {
    public final CircleWaImageView A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass2HH A03;

    /* renamed from: A0A */
    public void A09(C96334wC r6) {
        TextEmojiLabel textEmojiLabel = this.A01;
        C109065e1 r2 = r6.A00;
        textEmojiLabel.setText(r2.A0I);
        if (r2.A08 == 2) {
            textEmojiLabel.A0F(AnonymousClass29N.A00(this.A02), R.dimen.f6nameremoved);
        } else {
            textEmojiLabel.A0E();
        }
        String str = r2.A0G;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass2HH r3 = this.A03;
            CircleWaImageView circleWaImageView = this.A00;
            Drawable A002 = AnonymousClass0RP.A00(circleWaImageView.getContext(), R.drawable.avatar_contact);
            r3.A00.A02(A002, A002, circleWaImageView, str);
        } else {
            this.A00.setImageResource(R.drawable.avatar_contact);
        }
        AnonymousClass54E.A00(this.A0H, r6, this, 20);
    }

    public C96754ws(View view, AnonymousClass1VX r3, AnonymousClass2HH r4) {
        super(view);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = AnonymousClass0x7.A0K(view, R.id.business_name);
        this.A00 = (CircleWaImageView) C06560Yg.A02(view, R.id.business_avatar);
    }
}
