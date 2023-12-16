package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5jB  reason: invalid class name and case insensitive filesystem */
public final class C112095jB implements AnonymousClass64O {
    public final Context A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass5YB A03;
    public final C105365Uq A04;
    public final C620733j A05;
    public final AnonymousClass3LP A06;

    public void BNe(AnonymousClass64P r5) {
        AnonymousClass3ZH r3 = ((C112105jC) r5).A00;
        ImageView imageView = this.A01;
        AnonymousClass0YZ.A0F(imageView, C627336j.A07(r3.A0H));
        C18320x8.A16(imageView, r3, this, 13);
        this.A04.A08(imageView, r3);
        AnonymousClass5YB r1 = this.A03;
        r1.A08(r3);
        String A0m = C86654Ky.A0m(this.A05, r3);
        if (C86614Ku.A0u(r1.A02).equals(A0m) || C86624Kv.A1X(r3, this.A06)) {
            TextEmojiLabel textEmojiLabel = this.A02;
            textEmojiLabel.setVisibility(8);
            C86634Kw.A1I(textEmojiLabel);
            return;
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        textEmojiLabel2.setVisibility(0);
        textEmojiLabel2.setText(A0m);
    }

    public C112095jB(Context context, View view, AnonymousClass64J r4, C105365Uq r5, C620733j r6, AnonymousClass3LP r7) {
        this.A00 = context;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = AnonymousClass0x9.A0F(view, R.id.contactpicker_row_photo);
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r4, R.id.contactpicker_row_name);
        this.A03 = A002;
        C106905aM.A04(A002.A02);
        this.A02 = C86644Kx.A0M(view, R.id.contactpicker_row_status);
    }
}
