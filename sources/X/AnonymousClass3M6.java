package X;

import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;

/* renamed from: X.3M6  reason: invalid class name */
public final class AnonymousClass3M6 implements C182428oO {
    public final /* synthetic */ AnonymousClass5YE A00;

    public AnonymousClass3M6(AnonymousClass5YE r1) {
        this.A00 = r1;
    }

    public void BNF() {
        AnonymousClass5YE r4 = this.A00;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = r4.A0B;
        if (emojiSearchKeyboardContainer != null && emojiSearchKeyboardContainer.getVisibility() == 0) {
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer2 = r4.A0B;
            if (emojiSearchKeyboardContainer2 != null) {
                emojiSearchKeyboardContainer2.A00();
            }
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer3 = r4.A0B;
            if (emojiSearchKeyboardContainer3 != null) {
                emojiSearchKeyboardContainer3.postDelayed(new C69993Zl(r4, 15), (long) (((float) 150) * r4.A01()));
            }
        }
    }
}
