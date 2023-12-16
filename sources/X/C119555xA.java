package X;

import android.widget.ImageButton;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.5xA  reason: invalid class name and case insensitive filesystem */
public final class C119555xA extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ SingleSelectedMessageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119555xA(SingleSelectedMessageActivity singleSelectedMessageActivity) {
        super(0);
        this.this$0 = singleSelectedMessageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SingleSelectedMessageActivity singleSelectedMessageActivity = this.this$0;
        AnonymousClass1VX r4 = singleSelectedMessageActivity.A0D;
        C105895Wv r3 = singleSelectedMessageActivity.A0B;
        C55682qk r8 = singleSelectedMessageActivity.A03;
        AnonymousClass5Y0 r2 = singleSelectedMessageActivity.A0C;
        C27821ej r15 = singleSelectedMessageActivity.A09;
        if (r15 != null) {
            C620633i r11 = singleSelectedMessageActivity.A08;
            C620733j r13 = singleSelectedMessageActivity.A00;
            AnonymousClass5IY r14 = singleSelectedMessageActivity.A08;
            if (r14 != null) {
                EmojiSearchProvider emojiSearchProvider = singleSelectedMessageActivity.A0A;
                if (emojiSearchProvider != null) {
                    AnonymousClass33p r12 = singleSelectedMessageActivity.A09;
                    C60152y5 r0 = singleSelectedMessageActivity.A0B;
                    if (r0 != null) {
                        KeyboardPopupLayout keyboardPopupLayout = singleSelectedMessageActivity.A03;
                        if (keyboardPopupLayout != null) {
                            C89224c7 r5 = new C89224c7(singleSelectedMessageActivity, (ImageButton) null, r8, keyboardPopupLayout, new WaEditText(singleSelectedMessageActivity), r11, r12, r13, r14, r15, r2, emojiSearchProvider, r4, r0, r3);
                            r5.A0C(new AnonymousClass694(singleSelectedMessageActivity, 4));
                            EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) C005205m.A00(singleSelectedMessageActivity, R.id.selected_message_emoji_search_container);
                            AnonymousClass5Y0 r32 = singleSelectedMessageActivity.A0C;
                            C27821ej r22 = singleSelectedMessageActivity.A09;
                            if (r22 != null) {
                                C620733j r1 = singleSelectedMessageActivity.A00;
                                C60152y5 r02 = singleSelectedMessageActivity.A0B;
                                if (r02 != null) {
                                    AnonymousClass5S9 r7 = new AnonymousClass5S9(singleSelectedMessageActivity, r1, r5, r22, r32, emojiSearchContainer, r02);
                                    r5.A0E = C117625sE.A00(r7, 11);
                                    r7.A00 = new AnonymousClass6AQ(singleSelectedMessageActivity, 0, r7);
                                    r5.A0C = r7;
                                    return r5;
                                }
                                throw C18270x1.A0S("sharedPreferencesFactory");
                            }
                            throw C18270x1.A0S("recentEmojis");
                        }
                        throw C18270x1.A0S("keyboardPopupLayout");
                    }
                    throw C18270x1.A0S("sharedPreferencesFactory");
                }
                throw C18270x1.A0S("emojiSearchProvider");
            }
            throw C18270x1.A0S("emojiTrayLogger");
        }
        throw C18270x1.A0S("recentEmojis");
    }
}
