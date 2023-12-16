package X;

import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4oZ  reason: invalid class name and case insensitive filesystem */
public final class C93444oZ extends C150427Qr {
    public C131916eO A00;
    public final C100465Ba A01 = new C100465Ba(this, 13);
    public final C33141sV A02;

    public C93444oZ(C33141sV r3) {
        C162457s7.A0J(r3, 1);
        this.A02 = r3;
    }

    public void A00(FrameLayout frameLayout, C93314oJ r10, C624134x r11, AnonymousClass39W r12) {
        String str;
        C162457s7.A0J(frameLayout, 0);
        C18260x0.A0Z(r11, r12, r10, 1);
        frameLayout.removeAllViews();
        String str2 = null;
        C131916eO r3 = new C131916eO(C18290x4.A0F(frameLayout));
        frameLayout.addView(r3);
        AnonymousClass39A r7 = r12.A02;
        if (r7 != null) {
            str = r7.A01;
        } else {
            str = null;
        }
        TextEmojiLabel textEmojiLabel = r3.A01;
        if (str == null || str.length() == 0) {
            textEmojiLabel.setVisibility(8);
        } else {
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.setText(r10.A1E(str));
        }
        if (r7 != null) {
            str2 = r7.A00;
        }
        TextEmojiLabel textEmojiLabel2 = r3.A00;
        if (str2 == null || str2.length() == 0) {
            textEmojiLabel2.setVisibility(8);
        } else {
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.setText(r10.A1E(str2));
        }
        C614630w A0y = r11.A0y();
        if (A0y == null || !A0y.A06()) {
            r3.A02.setVisibility(8);
        } else {
            this.A02.A09(r3.A02, r11, this.A01);
        }
        this.A00 = r3;
        frameLayout.invalidate();
    }
}
