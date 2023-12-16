package X;

import android.app.Activity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.5S9  reason: invalid class name */
public class AnonymousClass5S9 {
    public C182438oP A00;
    public final C89224c7 A01;
    public final EmojiSearchContainer A02;

    public AnonymousClass5S9(Activity activity, C620733j r11, C89224c7 r12, C27821ej r13, AnonymousClass5Y0 r14, EmojiSearchContainer emojiSearchContainer, C60152y5 r16) {
        this.A02 = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        C89224c7 r3 = r12;
        this.A01 = r12;
        Activity activity2 = activity;
        C620733j r2 = r11;
        C27821ej r4 = r13;
        AnonymousClass5Y0 r5 = r14;
        r12.A0B = new C103785Ok(activity2, r2, r3, r4, r5, emojiSearchContainer, this, r16);
    }

    public static void A00(AnonymousClass5S9 r1, Object obj, int i) {
        r1.A00 = new AnonymousClass6AR(obj, i);
    }

    public void A01(boolean z) {
        if (this instanceof C94294qu) {
            C94294qu r2 = (C94294qu) this;
            GifSearchContainer gifSearchContainer = r2.A02;
            if (gifSearchContainer.getVisibility() == 0) {
                gifSearchContainer.setVisibility(8);
                C55922r8 r1 = gifSearchContainer.A0G;
                if (r1 != null) {
                    AnonymousClass277.A00(gifSearchContainer.getWamRuntime(), r1);
                }
                gifSearchContainer.A0G = null;
            } else {
                EmojiSearchContainer emojiSearchContainer = r2.A02;
                if (emojiSearchContainer.getVisibility() == 0) {
                    emojiSearchContainer.setVisibility(8);
                    emojiSearchContainer.A04.A05();
                    emojiSearchContainer.A09 = null;
                }
            }
            C89224c7 r12 = r2.A01;
            C162457s7.A0K(r12, "null cannot be cast to non-null type com.whatsapp.gifsearch.EmojiAndGifPopupWindow");
            r12.A0C = null;
            if (z) {
                AnonymousClass277.A00(r2.A01, r2.A03);
                return;
            }
            return;
        }
        EmojiSearchContainer emojiSearchContainer2 = this.A02;
        if (emojiSearchContainer2.getVisibility() == 0) {
            emojiSearchContainer2.setVisibility(8);
            emojiSearchContainer2.A04.A05();
            emojiSearchContainer2.A09 = null;
        }
        this.A01.A0C = null;
    }

    public boolean A02() {
        if (!(this instanceof C94294qu)) {
            return C86604Kt.A1Y(this.A02);
        }
        C94294qu r2 = (C94294qu) this;
        if (r2.A02.getVisibility() == 0) {
            return true;
        }
        EmojiSearchContainer emojiSearchContainer = r2.A02;
        C162457s7.A0C(emojiSearchContainer);
        return C86654Ky.A1U(emojiSearchContainer);
    }

    public boolean A03() {
        if (!A02()) {
            return false;
        }
        A01(true);
        this.A02.post(new C69993Zl(this, 0));
        return true;
    }
}
