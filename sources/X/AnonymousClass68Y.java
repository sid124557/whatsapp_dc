package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.68Y  reason: invalid class name */
public class AnonymousClass68Y implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public AnonymousClass68Y(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2;
        switch (this.A01) {
            case 0:
                C89524d8 r2 = (C89524d8) this.A00;
                if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                    if (r2 instanceof ChatLockCreateSecretCodeActivity) {
                        i2 = 5;
                    } else {
                        i2 = 6;
                    }
                    if (i != i2) {
                        return true;
                    }
                }
                if (!r2.A76().isEnabled()) {
                    return true;
                }
                r2.A76().callOnClick();
                return true;
            case 1:
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) this.A00;
                if (i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                    return false;
                }
                ConversationSearchViewModel conversationSearchViewModel = conversationSearchFragment.A02;
                if (conversationSearchViewModel == null) {
                    return true;
                }
                C18320x8.A18(conversationSearchViewModel.A04, true);
                return true;
            case 2:
                C1238369y r22 = (C1238369y) this.A00;
                if (i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                    return false;
                }
                ((C113245l7) r22.A00).A2L(true);
                return true;
            case 3:
                GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A00;
                if (i != 3) {
                    return false;
                }
                WaEditText waEditText = gifSearchContainer.A07;
                if (waEditText == null) {
                    return true;
                }
                waEditText.A05();
                return true;
            case 4:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (i != 4) {
                    return false;
                }
                popupNotification.A6o();
                return true;
            case 5:
                SearchViewModel searchViewModel = ((TokenizedSearchInput) this.A00).A0F;
                if (searchViewModel == null || i != 3) {
                    return false;
                }
                searchViewModel.A0h(false);
                return true;
            case 6:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                if (i != 4) {
                    return false;
                }
                messageReplyActivity.A7E(false);
                return true;
            default:
                AnonymousClass4GQ r1 = (AnonymousClass4GQ) this.A00;
                if (i != 3) {
                    return true;
                }
                r1.invoke(C86664Kz.A1K(textView));
                return true;
        }
    }
}
