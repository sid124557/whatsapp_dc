package com.whatsapp.conversation.conversationrow.messagerating;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass2z0;
import X.AnonymousClass4K2;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C08310eF;
import X.C108495d5;
import X.C117715sN;
import X.C18310x6;
import X.C18320x8;
import X.C624134x;
import X.C626936e;
import X.C627336j;
import X.C64113Cd;
import X.C69263Wi;
import X.C71603cN;
import X.C95814uZ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.FAQTextView;
import com.whatsapp.R;
import com.whatsapp.StarRatingBar;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class MessageRatingFragment extends Hilt_MessageRatingFragment implements AnonymousClass64B {
    public static final int[] A05 = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    public C69263Wi A00;
    public C108495d5 A01;
    public MessageRatingViewModel A02;
    public C95814uZ A03;
    public String A04;

    public static MessageRatingFragment A00(C108495d5 r5, C624134x r6) {
        MessageRatingFragment messageRatingFragment = new MessageRatingFragment();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass2z0 r2 = r6.A1J;
        A08.putString("chat_jid", C627336j.A07(r2.A00));
        A08.putString("message_id", r2.A01);
        A08.putParcelable("entry_point", r5);
        messageRatingFragment.A0u(A08);
        return messageRatingFragment;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        C18310x6.A18(C06560Yg.A02(A0R, R.id.close_button), this, 3);
        ((FAQTextView) C06560Yg.A02(A0R, R.id.description)).setEducationTextFromNamedArticle(new SpannableString(C08310eF.A09(this).getString(R.string.f11nameremoved)), "chats", "controls-when-messaging-businesses");
        StarRatingBar starRatingBar = (StarRatingBar) C06560Yg.A02(A0R, R.id.rating_bar);
        WDSButton wDSButton = (WDSButton) C06560Yg.A02(A0R, R.id.submit);
        WaTextView A0L = AnonymousClass0x7.A0L(A0R, R.id.rating_label);
        C18320x8.A16(wDSButton, starRatingBar, this, 49);
        starRatingBar.A01 = new C64113Cd(A0L, this, wDSButton);
        AnonymousClass4K2.A00(A0V(), this.A02.A01, starRatingBar, 80);
        MessageRatingViewModel messageRatingViewModel = this.A02;
        messageRatingViewModel.A06.BkM(new C117715sN(messageRatingViewModel, this.A03, this.A04, 34));
        return A0R;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A02 = (MessageRatingViewModel) AnonymousClass0x9.A0H(this).A01(MessageRatingViewModel.class);
        this.A03 = C18310x6.A0S(A0H().getString("chat_jid"));
        this.A04 = C18310x6.A0k(A0H(), "message_id");
        Parcelable parcelable = A0H().getParcelable("entry_point");
        C626936e.A06(parcelable);
        C108495d5 r4 = (C108495d5) parcelable;
        this.A01 = r4;
        MessageRatingViewModel messageRatingViewModel = this.A02;
        messageRatingViewModel.A06.BkM(new C71603cN(messageRatingViewModel, this.A03, r4, this.A04, 16));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MessageRatingViewModel messageRatingViewModel = this.A02;
        C95814uZ r3 = this.A03;
        String str = this.A04;
        C108495d5 r4 = this.A01;
        if (!messageRatingViewModel.A00) {
            messageRatingViewModel.A06.BkM(new C71603cN(messageRatingViewModel, r3, r4, str, 15));
        }
    }
}
