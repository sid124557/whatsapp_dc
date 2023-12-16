package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;

/* renamed from: X.900  reason: invalid class name */
public class AnonymousClass900 extends AnonymousClass4XM {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass900(Activity activity, C620733j r9, AnonymousClass5Y0 r10, AnonymousClass4A5 r11, C60152y5 r12, Object obj, int i, int i2) {
        super(activity, r9, r10, r11, r12, i);
        this.A01 = i2;
        this.A00 = obj;
    }

    public void BaW(C48652fF r5) {
        int i;
        View view;
        AnonymousClass4XM r0;
        int i2 = this.A01;
        super.BaW(r5);
        Object obj = this.A00;
        if (i2 != 0) {
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = (EmojiSearchKeyboardContainer) obj;
            i = 8;
            emojiSearchKeyboardContainer.A01.setVisibility(8);
            view = emojiSearchKeyboardContainer.A02;
            r0 = emojiSearchKeyboardContainer.A08;
        } else {
            EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) obj;
            i = 8;
            emojiSearchContainer.A01.setVisibility(8);
            view = emojiSearchContainer.A02;
            r0 = emojiSearchContainer.A08;
        }
        if (r0.A0G() == 0) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
