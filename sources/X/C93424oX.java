package X;

import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4oX  reason: invalid class name and case insensitive filesystem */
public final class C93424oX extends C150427Qr {
    public void A00(FrameLayout frameLayout, C93314oJ r11, C624134x r12, AnonymousClass39W r13) {
        String str;
        C18270x1.A10(frameLayout, 0, r13);
        frameLayout.removeAllViews();
        C89744er r7 = new C89744er(C18290x4.A0F(frameLayout));
        frameLayout.addView(r7);
        AnonymousClass39A r6 = r13.A02;
        String str2 = null;
        if (r6 != null) {
            str2 = r6.A01;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        int length = str2.length();
        boolean A1W = AnonymousClass001.A1W(length);
        TextEmojiLabel textEmojiLabel = r7.A01;
        if (A1W) {
            textEmojiLabel.setText(str2);
            textEmojiLabel.setVisibility(0);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        if (!(r6 == null || (str = r6.A00) == null)) {
            str3 = str;
        }
        int length2 = str3.length();
        TextEmojiLabel textEmojiLabel2 = r7.A00;
        if (length2 > 0) {
            textEmojiLabel2.setText(str3);
            textEmojiLabel2.setVisibility(0);
        } else {
            textEmojiLabel2.setVisibility(8);
        }
        if (length == 0 && length2 == 0) {
            r7.setVisibility(8);
        } else {
            r7.setVisibility(0);
        }
    }
}
