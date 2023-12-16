package X;

import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.67y  reason: invalid class name and case insensitive filesystem */
public class C1233167y extends C54232oO {
    public Object A00;
    public final int A01;

    public C1233167y(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(C95814uZ r4) {
        if (15 - this.A01 != 0) {
            super.A00(r4);
            return;
        }
        SearchViewModel searchViewModel = ((SearchFragment) this.A00).A1c;
        C108795dZ A0M = searchViewModel.A0M();
        if (A0M != null && 2 == A0M.A01) {
            searchViewModel.A0P();
        }
    }

    public void A01(C95814uZ r8) {
        C105155Tu r1;
        switch (this.A01) {
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r8.equals(AnonymousClass32Y.A08(AnonymousClass0x7.A0l(contactInfoActivity)))) {
                    if (!contactInfoActivity.A7Y() && (r1 = contactInfoActivity.A0w) != null) {
                        r1.A00(contactInfoActivity.A1K);
                    }
                    contactInfoActivity.A7N();
                    contactInfoActivity.A0r.A00();
                    return;
                }
                return;
            case 5:
                C89884fR r12 = (C89884fR) this.A00;
                if (r8 != null && r8.equals(r12.A0r)) {
                    r12.A02();
                    return;
                }
                return;
            case 11:
                ((ConversationsFragment) this.A00).A1f(r8);
                return;
            case 13:
                C162457s7.A0J(r8, 0);
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A00;
                if (r8.equals(C95804uY.A03.A01(AnonymousClass0x7.A0l(newsletterInfoActivity)))) {
                    C105065Tl r4 = newsletterInfoActivity.A0K;
                    if (r4 != null) {
                        AnonymousClass1RL A7G = newsletterInfoActivity.A7G();
                        C162457s7.A0J(A7G, 0);
                        String str = A7G.A0F;
                        int i = 0;
                        if (str == null || str.length() == 0) {
                            i = 8;
                        }
                        NewsletterDetailsCard newsletterDetailsCard = r4.A02;
                        newsletterDetailsCard.setContactChatStatusVisibility(i);
                        if (i == 0) {
                            newsletterDetailsCard.setContactChatStatus(r4.A00(A7G));
                        }
                        r4.A01(newsletterInfoActivity.A7G());
                    }
                    newsletterInfoActivity.A7c(false, false);
                    return;
                }
                return;
            case 14:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                AnonymousClass3ZH r0 = popupNotification.A0q;
                if (r0 != null && r8 != null && r8.equals(r0.A0H) && !C627336j.A0K(r8)) {
                    String A002 = popupNotification.A0F.A00(popupNotification.A0q);
                    boolean isEmpty = TextUtils.isEmpty(A002);
                    TextView textView = popupNotification.A0D;
                    if (isEmpty) {
                        textView.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(0);
                    popupNotification.A0D.setText(A002);
                    return;
                }
                return;
            case 15:
                SearchFragment.A00(r8, (SearchFragment) this.A00);
                return;
            default:
                super.A01(r8);
                return;
        }
    }

    public void A02(C95814uZ r4) {
        BaseAdapter baseAdapter;
        switch (this.A01) {
            case 0:
                BlockList blockList = (BlockList) this.A00;
                C117115rP.A01(blockList.A04, blockList, 48);
                return;
            case 1:
                ((CallLogActivity) this.A00).A75();
                return;
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.A0x.A0F();
                contactInfoActivity.A5T();
                return;
            case 3:
                ListChatInfoActivity.A0C((ListChatInfoActivity) this.A00);
                return;
            case 4:
                ((C89634eX) this.A00).A7H();
                return;
            case 5:
                ((C89884fR) this.A00).A09();
                return;
            case 6:
                ((C89904fT) this.A00).A00 = ((C89904fT) this.A00).A0P.A01(((C89904fT) this.A00).A0V);
                return;
            case 7:
                baseAdapter = ((MediaAlbumActivity) this.A00).A0B;
                break;
            case 8:
                baseAdapter = ((MessageDetailsActivity) this.A00).A01;
                break;
            case 9:
                ((C93544ok) this.A00).A05.notifyDataSetChanged();
                return;
            case 10:
                AnonymousClass4VF r0 = (AnonymousClass4VF) this.A00;
                r0.A0D();
                C86654Ky.A1H(r0.A0X);
                return;
            case 11:
                ConversationsFragment.A04((ConversationsFragment) this.A00, "onChatMuteStateChanged");
                return;
            case 12:
                GroupChatInfoActivity.A0C((GroupChatInfoActivity) this.A00);
                return;
            case 13:
                C162457s7.A0J(r4, 0);
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A00;
                if (r4.equals(C95804uY.A03.A01(AnonymousClass0x7.A0l(newsletterInfoActivity)))) {
                    C91534kK r02 = newsletterInfoActivity.A0c;
                    if (r02 == null) {
                        throw C18270x1.A0S("newsletterInfoViewModel");
                    }
                    r02.A0G();
                    newsletterInfoActivity.A5T();
                    return;
                }
                return;
            case 14:
                PopupNotification.A0C((PopupNotification) this.A00);
                return;
            case 15:
                SearchFragment.A00(r4, (SearchFragment) this.A00);
                return;
            case 16:
                ((StatusPlaybackContactFragment) this.A00).A1U();
                return;
            default:
                ((AnonymousClass5TV) this.A00).A0L.A05();
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public void A03(UserJid userJid) {
        if (2 - this.A01 != 0) {
            super.A03(userJid);
            return;
        }
        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
        contactInfoActivity.A7P();
        contactInfoActivity.A0r.A00();
    }
}
