package X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4oY  reason: invalid class name and case insensitive filesystem */
public class C93434oY extends C150427Qr {
    public void A00(FrameLayout frameLayout, C93314oJ r5, C624134x r6, AnonymousClass39W r7) {
        TextEmojiLabel textEmojiLabel;
        int i;
        frameLayout.removeAllViews();
        C89754es r1 = new C89754es(frameLayout.getContext());
        frameLayout.addView(r1);
        AnonymousClass39A r0 = r7.A02;
        if (r0 != null) {
            String str = r0.A01;
            if (!TextUtils.isEmpty(str)) {
                C626936e.A06(str);
                textEmojiLabel = r1.A02;
                r5.setMessageText(str, textEmojiLabel, r6);
                i = 0;
                textEmojiLabel.setVisibility(i);
            }
        }
        textEmojiLabel = r1.A02;
        i = 8;
        textEmojiLabel.setVisibility(i);
    }
}
