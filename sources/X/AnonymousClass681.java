package X;

import android.widget.BaseAdapter;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1;
import com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.profile.SetAboutInfo;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.settings.Settings;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.681  reason: invalid class name */
public class AnonymousClass681 extends C56602sG {
    public Object A00;
    public final int A01;

    public static void A01(AnonymousClass681 r2, C95814uZ r3) {
        String str;
        C162457s7.A0J(r3, 0);
        C106405Yw r1 = C95814uZ.A00;
        C90924ic r22 = (C90924ic) r2.A00;
        C97834zK r0 = r22.A00;
        if (r0 != null) {
            str = r0.A01.A04;
        } else {
            str = null;
        }
        if (r3.equals(r1.A05(str))) {
            C18290x4.A1M(r22.A0C, r22, r3, 46);
        }
    }

    public AnonymousClass681(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static AnonymousClass681 A00(Object obj, int i) {
        return new AnonymousClass681(obj, i);
    }

    public static void A02(ConversationsFragment conversationsFragment) {
        conversationsFragment.A1b.A02 = true;
        if (conversationsFragment.A1V != null) {
            conversationsFragment.A1X();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023a, code lost:
        r3.BkP(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x023d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ef, code lost:
        if (r4.A05 != -1) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02f6, code lost:
        if (r4.A05 == 0) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04d4, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04d7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C95814uZ r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            r8 = r13
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0025;
                case 2: goto L_0x0006;
                case 3: goto L_0x03b8;
                case 4: goto L_0x03c4;
                case 5: goto L_0x0038;
                case 6: goto L_0x03c8;
                case 7: goto L_0x0048;
                case 8: goto L_0x0006;
                case 9: goto L_0x03d2;
                case 10: goto L_0x0068;
                case 11: goto L_0x009b;
                case 12: goto L_0x03dc;
                case 13: goto L_0x00be;
                case 14: goto L_0x00d9;
                case 15: goto L_0x0006;
                case 16: goto L_0x00f2;
                case 17: goto L_0x0006;
                case 18: goto L_0x0128;
                case 19: goto L_0x04b2;
                case 20: goto L_0x0141;
                case 21: goto L_0x03f5;
                case 22: goto L_0x03ff;
                case 23: goto L_0x0006;
                case 24: goto L_0x041d;
                case 25: goto L_0x0163;
                case 26: goto L_0x018f;
                case 27: goto L_0x0006;
                case 28: goto L_0x01ba;
                case 29: goto L_0x01ef;
                case 30: goto L_0x0227;
                case 31: goto L_0x023e;
                case 32: goto L_0x0254;
                case 33: goto L_0x026c;
                case 34: goto L_0x0006;
                case 35: goto L_0x0284;
                case 36: goto L_0x0325;
                case 37: goto L_0x0462;
                case 38: goto L_0x033b;
                case 39: goto L_0x046f;
                case 40: goto L_0x034d;
                case 41: goto L_0x0006;
                case 42: goto L_0x04ce;
                case 43: goto L_0x0365;
                case 44: goto L_0x0477;
                case 45: goto L_0x0481;
                case 46: goto L_0x0377;
                default: goto L_0x0006;
            }
        L_0x0006:
            super.A03(r13)
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r2 = r12.A00
            X.4bW r2 = (X.C89104bW) r2
            X.3Ex r0 = r2.A0A
            X.3ZH r0 = r0.A0A(r13)
            X.1RP r1 = new X.1RP
            r1.<init>(r0)
            java.util.List r0 = r2.A0K
            boolean r0 = X.AnonymousClass3ZH.A0D(r1, r0)
            if (r0 == 0) goto L_0x0009
            X.4OZ r0 = r2.A0O
            goto L_0x04d4
        L_0x0025:
            java.lang.Object r1 = r12.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            boolean r0 = X.AnonymousClass4SG.A46(r1, r13)
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = "HomeActivty/onProfilePhotoChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A7Z()
            return
        L_0x0038:
            java.lang.Object r1 = r12.A00
            com.whatsapp.calling.callhistory.CallLogActivity r1 = (com.whatsapp.calling.callhistory.CallLogActivity) r1
            X.4uZ r0 = r1.A0Y
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0009
            r1.A75()
            return
        L_0x0048:
            java.lang.String r0 = "CallsHistoryDataSource/onProfilePhotoChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x0009
            java.lang.Object r0 = r12.A00
            X.5XL r0 = (X.AnonymousClass5XL) r0
            X.7DD r1 = r0.A06
            if (r1 == 0) goto L_0x0009
            java.lang.String r0 = "CallsHistoryViewModel/onProfilePhotoChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r6 = r1.A00
            boolean r0 = r6.A0G
            if (r0 != 0) goto L_0x0498
            java.lang.String r0 = "CallsHistoryViewModel/onProfilePhotoChanged skip due to no active observer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0068:
            java.lang.Object r2 = r12.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.String r0 = X.AnonymousClass0x7.A0l(r2)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0080
            X.4kJ r0 = r2.A0x
            r0.A0F()
            return
        L_0x0080:
            X.3Ex r0 = r2.A0I
            X.3ZH r0 = r0.A0A(r13)
            X.1RP r1 = new X.1RP
            r1.<init>(r0)
            X.4Ob r0 = r2.A0u
            if (r0 == 0) goto L_0x0009
            java.util.List r0 = r0.A02
            boolean r0 = X.AnonymousClass3ZH.A0D(r1, r0)
            if (r0 == 0) goto L_0x0009
            X.4Ob r0 = r2.A0u
            goto L_0x04d4
        L_0x009b:
            java.lang.String r0 = "list_chat_info/onProfilePhotoChanged"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = X.C627336j.A0K(r13)
            if (r0 != 0) goto L_0x0009
            java.lang.Object r2 = r12.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r2 = (com.whatsapp.chatinfo.ListChatInfoActivity) r2
            X.3Ex r0 = r2.A0I
            X.3ZH r0 = r0.A0A(r13)
            X.1RP r1 = new X.1RP
            r1.<init>(r0)
            java.util.ArrayList r0 = r2.A0j
            X.AnonymousClass3ZH.A0D(r1, r0)
            X.4OP r0 = r2.A0D
            goto L_0x04d4
        L_0x00be:
            java.lang.Object r2 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.3Ex r0 = r2.A0w
            X.3ZH r0 = r0.A0A(r13)
            X.1RP r1 = new X.1RP
            r1.<init>(r0)
            java.util.List r0 = r2.A31
            boolean r0 = X.AnonymousClass3ZH.A0D(r1, r0)
            if (r0 == 0) goto L_0x0009
            r2.A1W()
            return
        L_0x00d9:
            boolean r0 = X.C627336j.A0K(r13)
            if (r0 != 0) goto L_0x0009
            java.lang.Object r2 = r12.A00
            X.4eX r2 = (X.C89634eX) r2
            X.3Ex r0 = r2.A0B
            X.3ZH r1 = r0.A0A(r13)
            X.1RP r0 = new X.1RP
            r0.<init>(r1)
            r2.A7P(r0)
            return
        L_0x00f2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation-title/onProfilePhotoChanged "
            X.C18260x0.A1P(r1, r0, r13)
            java.lang.Object r2 = r12.A00
            X.4fR r2 = (X.C89884fR) r2
            if (r13 == 0) goto L_0x0009
            X.4uZ r0 = r2.A0r
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.widget.ProgressBar r1 = r2.A0B
            if (r1 != 0) goto L_0x0119
            android.view.ViewStub r0 = r2.A07
            if (r0 == 0) goto L_0x0119
            android.view.View r1 = r0.inflate()
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r2.A0B = r1
        L_0x0119:
            r0 = 8
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r2.A0A
            r0 = 0
            r1.setVisibility(r0)
            r2.A09()
            return
        L_0x0128:
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.Object r2 = r12.A00
            X.4nx r2 = (X.C93134nx) r2
            X.3ZH r0 = r2.A09
            X.4uZ r0 = r0.A0H
            if (r0 == 0) goto L_0x0009
            boolean r1 = r0.equals(r13)
            r0 = 1
            if (r1 != r0) goto L_0x0009
            r2.A1H()
            return
        L_0x0141:
            java.lang.Object r2 = r12.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            java.util.ArrayList r0 = r2.A0b
            java.util.Iterator r1 = r0.iterator()
        L_0x014b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r1.next()
            X.5Rj r0 = (X.C104545Rj) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x014b
            android.widget.BaseAdapter r0 = r2.A01
            goto L_0x04d4
        L_0x0163:
            if (r13 == 0) goto L_0x0009
            boolean r0 = X.C627336j.A0K(r13)
            if (r0 != 0) goto L_0x0009
            java.lang.Object r2 = r12.A00
            com.whatsapp.group.GroupAdminPickerActivity r2 = (com.whatsapp.group.GroupAdminPickerActivity) r2
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r13)
            boolean r0 = r2.A78(r0)
            if (r0 == 0) goto L_0x0009
            X.3Ex r0 = r2.A09
            X.3ZH r0 = r0.A0A(r13)
            X.1RP r1 = new X.1RP
            r1.<init>(r0)
            java.util.List r0 = r2.A0Q
            X.AnonymousClass3ZH.A0D(r1, r0)
            X.4WR r0 = r2.A0I
            r0.A05()
            return
        L_0x018f:
            java.lang.String r0 = "group_info/onProfilePhotoChanged"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = X.C627336j.A0K(r13)
            java.lang.Object r2 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            if (r0 == 0) goto L_0x04b9
            X.1fJ r0 = r2.A1h
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r1 = r2.A0A
            r0 = 8
            r1.setVisibility(r0)
            X.2pi r0 = r2.A0u
            X.3ZH r1 = r2.A19
            X.2ro r0 = r0.A06
            r0.A04(r1)
            r2.A7W()
            return
        L_0x01ba:
            java.lang.Object r2 = r12.A00
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            com.whatsapp.jid.GroupJid r0 = r2.A15
            r1 = 0
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01d3
            androidx.fragment.app.DialogFragment r0 = r2.A0C
            if (r0 == 0) goto L_0x0009
            r0.A1K()
            r2.A0C = r1
            return
        L_0x01d3:
            X.2sr r0 = r2.A0N
            X.1RR r0 = X.C56972sr.A01(r0)
            if (r0 == 0) goto L_0x0009
            if (r13 == 0) goto L_0x0009
            X.4uZ r0 = r0.A0H
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0009
            androidx.fragment.app.DialogFragment r0 = r2.A0D
            if (r0 == 0) goto L_0x0009
            r0.A1K()
            r2.A0D = r1
            return
        L_0x01ef:
            java.lang.Object r1 = r12.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.3ZH r0 = r1.A0S
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = "contact"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01fe:
            X.4uZ r0 = r0.A0H
            boolean r0 = X.C162457s7.A0P(r13, r0)
            if (r0 == 0) goto L_0x0211
            X.4kK r0 = r1.A0c
            if (r0 != 0) goto L_0x04ca
            java.lang.String r0 = "newsletterInfoViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0211:
            boolean r0 = r1.A7d()
            if (r0 == 0) goto L_0x0009
            if (r13 == 0) goto L_0x0009
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r1 = r1.A0b
            if (r1 == 0) goto L_0x0009
            X.4FS r3 = r1.A0G
            r0 = 34
            X.3Zy r2 = new X.3Zy
            r2.<init>(r13, r0, r1)
            goto L_0x023a
        L_0x0227:
            boolean r0 = r13 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0009
            if (r13 == 0) goto L_0x0009
            java.lang.Object r1 = r12.A00
            X.4el r1 = (X.C89704el) r1
            X.4FS r3 = r1.A04
            r0 = 9
            X.3Zz r2 = new X.3Zz
            r2.<init>(r1, r0, r13)
        L_0x023a:
            r3.BkP(r2)
            return
        L_0x023e:
            java.lang.Object r1 = r12.A00
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            X.3ZH r0 = r1.A0q
            if (r0 == 0) goto L_0x0009
            if (r13 == 0) goto L_0x0009
            X.4uZ r0 = r0.A0H
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0009
            r1.A6p()
            return
        L_0x0254:
            java.lang.Object r1 = r12.A00
            com.whatsapp.profile.ProfileInfoActivity r1 = (com.whatsapp.profile.ProfileInfoActivity) r1
            X.3ZH r0 = r1.A0I
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.AnonymousClass4SG.A46(r1, r13)
            if (r0 == 0) goto L_0x0009
            X.1RR r0 = X.AnonymousClass4SG.A2c(r1)
            r1.A0I = r0
            r1.A75()
            return
        L_0x026c:
            java.lang.Object r1 = r12.A00
            com.whatsapp.profile.ProfilePhotoReminder r1 = (com.whatsapp.profile.ProfilePhotoReminder) r1
            X.3ZH r0 = r1.A09
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.AnonymousClass4SG.A46(r1, r13)
            if (r0 == 0) goto L_0x0009
            X.1RR r0 = X.AnonymousClass4SG.A2c(r1)
            r1.A09 = r0
            r1.A74()
            return
        L_0x0284:
            java.lang.Object r7 = r12.A00
            com.whatsapp.profile.ViewProfilePhoto r7 = (com.whatsapp.profile.ViewProfilePhoto) r7
            X.3Ex r2 = r7.A04
            X.3ZH r0 = r7.A09
            java.lang.Class<X.4uZ> r1 = X.C95814uZ.class
            X.4uZ r0 = X.AnonymousClass3ZH.A02(r0, r1)
            X.3ZH r0 = r2.A0A(r0)
            r7.A09 = r0
            com.whatsapp.jid.Jid r0 = r0.A0I(r1)
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "viewprofilephoto/onprofilephotochanged photo_full_id:"
            r2.append(r0)
            X.3ZH r1 = r7.A09
            int r0 = r1.A05
            r2.append(r0)
            java.lang.String r0 = " thumb_full_id:"
            r2.append(r0)
            int r0 = r1.A06
            X.C18260x0.A1G(r2, r0)
            X.5ZR r1 = r7.A08
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r0 = r1.A0I(r0)
            android.os.Handler r2 = r7.A0C
            r5 = 0
            r2.removeMessages(r5)
            r6 = 1
            if (r0 == 0) goto L_0x02df
            X.3ZH r0 = r7.A09
            int r1 = r0.A05
            if (r1 != 0) goto L_0x02df
            X.2s0 r0 = r7.A08
            r0.A01(r13, r1, r6)
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.sendEmptyMessageDelayed(r5, r0)
        L_0x02df:
            r7.A78()
            r7.invalidateOptionsMenu()
            X.3ZH r4 = r7.A09
            int r3 = r4.A06
            r2 = -1
            if (r3 != r2) goto L_0x02f1
            int r0 = r4.A05
            r1 = 1
            if (r0 == r2) goto L_0x0323
        L_0x02f1:
            r1 = 0
            if (r3 != 0) goto L_0x0323
            int r0 = r4.A05
            if (r0 != 0) goto L_0x0323
        L_0x02f8:
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x0009
            r7.A0E = r5
            if (r1 == 0) goto L_0x0312
            X.3Wi r2 = r7.A05
            boolean r0 = r4.A0U()
            r1 = 2131892766(0x7f121a1e, float:1.942029E38)
            if (r0 == 0) goto L_0x030e
            r1 = 2131889888(0x7f120ee0, float:1.9414452E38)
        L_0x030e:
            r2.A0H(r1, r5)
            return
        L_0x0312:
            if (r6 == 0) goto L_0x0009
            X.3Wi r2 = r7.A05
            boolean r0 = r4.A0U()
            r1 = 2131892767(0x7f121a1f, float:1.9420292E38)
            if (r0 == 0) goto L_0x030e
            r1 = 2131889889(0x7f120ee1, float:1.9414454E38)
            goto L_0x030e
        L_0x0323:
            r6 = 0
            goto L_0x02f8
        L_0x0325:
            java.lang.Object r3 = r12.A00
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r3 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r3
            com.whatsapp.jid.UserJid r0 = r3.A0G
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.5Uq r2 = r3.A09
            X.3ZH r1 = r3.A0E
            android.widget.ImageView r0 = r3.A01
            r2.A08(r0, r1)
            return
        L_0x033b:
            java.lang.Object r1 = r12.A00
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            X.3ZH r0 = r1.A0m
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.AnonymousClass4SG.A46(r1, r13)
            if (r0 == 0) goto L_0x0009
            r1.A7F()
            return
        L_0x034d:
            java.lang.Object r1 = r12.A00
            com.whatsapp.settings.Settings r1 = (com.whatsapp.settings.Settings) r1
            X.3ZH r0 = r1.A0c
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.AnonymousClass4SG.A46(r1, r13)
            if (r0 == 0) goto L_0x0009
            X.1RR r0 = X.AnonymousClass4SG.A2c(r1)
            r1.A0c = r0
            r1.A77()
            return
        L_0x0365:
            if (r13 == 0) goto L_0x0009
            java.lang.Object r1 = r12.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            com.whatsapp.jid.UserJid r0 = r1.A0R
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0009
            r1.A1U()
            return
        L_0x0377:
            java.lang.Object r3 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            com.whatsapp.voipcalling.CallInfo r2 = r3.A7D()
            if (r2 == 0) goto L_0x0009
            com.whatsapp.jid.GroupJid r1 = X.AnonymousClass32V.A00(r13)
            if (r1 == 0) goto L_0x0395
            com.whatsapp.jid.GroupJid r0 = r2.groupJid
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0395
            com.whatsapp.calling.CallDetailsLayout r0 = r3.A0j
            r0.A01(r2)
            return
        L_0x0395:
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r13)
            if (r1 == 0) goto L_0x0009
            java.util.Map r0 = r2.participants
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0009
            boolean r0 = r2.isGroupCall
            if (r0 != 0) goto L_0x03ac
            com.whatsapp.calling.CallDetailsLayout r0 = r3.A0j
            r0.A01(r2)
        L_0x03ac:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r3.A1t
            if (r0 == 0) goto L_0x0009
            X.4WF r0 = r0.A0O
            if (r0 == 0) goto L_0x0009
            r0.A0P(r1)
            return
        L_0x03b8:
            java.lang.Object r2 = r12.A00
            com.whatsapp.blocklist.BlockList r2 = (com.whatsapp.blocklist.BlockList) r2
            X.4FS r1 = r2.A04
            r0 = 48
            X.C117115rP.A01(r1, r2, r0)
            return
        L_0x03c4:
            A01(r12, r13)
            return
        L_0x03c8:
            java.lang.Object r0 = r12.A00
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r0 = (com.whatsapp.calling.callhistory.group.GroupCallLogActivity) r0
            X.4XB r0 = r0.A02
            X.AnonymousClass4XB.A00(r0, r13)
            return
        L_0x03d2:
            java.lang.Object r1 = r12.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel) r1
            X.4xk r0 = r1.A0C
            X.AnonymousClass4VK.A02(r0, r1)
            return
        L_0x03dc:
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.Object r0 = r12.A00
            com.whatsapp.community.CommunityMembersViewModel r0 = (com.whatsapp.community.CommunityMembersViewModel) r0
            X.4C6 r4 = X.AnonymousClass0IV.A00(r0)
            X.3gB r3 = r0.A0L
            r2 = 0
            com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onProfilePhotoChanged$1 r1 = new com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onProfilePhotoChanged$1
            r1.<init>(r0, r13, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x03f5:
            java.lang.Object r0 = r12.A00
            X.4ok r0 = (X.C93544ok) r0
            X.675 r0 = r0.A05
            r0.notifyDataSetChanged()
            return
        L_0x03ff:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/onProfilePhotoChanged "
            X.C18260x0.A1P(r1, r0, r13)
            java.lang.Object r1 = r12.A00
            X.4VF r1 = (X.AnonymousClass4VF) r1
            X.4uZ r0 = r1.A01
            boolean r0 = X.AnonymousClass75J.A00(r13, r0)
            if (r0 == 0) goto L_0x0417
            r1.A0D()
        L_0x0417:
            X.4UC r0 = r1.A0Y
            X.C86654Ky.A1H(r0)
            return
        L_0x041d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversations/onProfilePhotoChanged "
            X.C18260x0.A1P(r1, r0, r13)
            java.lang.Object r4 = r12.A00
            com.whatsapp.conversationslist.ConversationsFragment r4 = (com.whatsapp.conversationslist.ConversationsFragment) r4
            r4.A1f(r13)
            X.5Ui r3 = r4.A1b
            boolean r0 = r3 instanceof X.C94104pu
            if (r0 == 0) goto L_0x045e
            X.4qR r3 = (X.C94234qR) r3
            boolean r0 = r13 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x045e
            java.lang.String r2 = r13.user
            boolean r0 = X.C107575bX.A0F(r2)
            if (r0 != 0) goto L_0x045e
            java.util.Map r1 = r3.A0A
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x045e
            java.lang.Object r2 = r1.get(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            X.3Ex r0 = r3.A04
            X.3ZH r1 = r0.A07(r13)
            if (r1 == 0) goto L_0x045e
            if (r2 == 0) goto L_0x045e
            X.5Uq r0 = r3.A0C
            r0.A08(r2, r1)
        L_0x045e:
            A02(r4)
            return
        L_0x0462:
            java.lang.Object r0 = r12.A00
            com.whatsapp.quickcontact.QuickContactActivity r0 = (com.whatsapp.quickcontact.QuickContactActivity) r0
            r0.A75()
            X.5Ty r0 = r0.A0n
            r0.A02()
            return
        L_0x046f:
            java.lang.Object r0 = r12.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchFragment.A00(r13, r0)
            return
        L_0x0477:
            java.lang.Object r0 = r12.A00
            X.5TV r0 = (X.AnonymousClass5TV) r0
            X.4Wh r0 = r0.A0L
            r0.A0K(r13)
            return
        L_0x0481:
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.Object r0 = r12.A00
            X.5WK r0 = (X.AnonymousClass5WK) r0
            X.4C6 r4 = r0.A0D
            X.3gB r3 = r0.A0C
            r2 = 0
            com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1 r1 = new com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1
            r1.<init>(r13, r0, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x0498:
            X.55B r0 = r6.A07
            X.C18290x4.A1L(r0)
            java.util.concurrent.locks.Lock r11 = r6.A0r
            X.7DE r5 = r6.A0R
            java.util.LinkedHashMap r10 = r6.A0q
            java.util.ArrayList r9 = r6.A0o
            X.3Ex r7 = r6.A0Y
            X.55B r4 = new X.55B
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r6.A07 = r4
            X.AnonymousClass5ZM.A05(r6, r4)
            return
        L_0x04b2:
            java.lang.Object r0 = r12.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r0 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r0
            X.4Oc r0 = r0.A0B
            goto L_0x04d4
        L_0x04b9:
            X.3Ex r0 = r2.A0I
            X.3ZH r0 = r0.A0A(r13)
            X.1RP r1 = new X.1RP
            r1.<init>(r0)
            X.10x r0 = r2.A1R
            r0.A0E(r1)
            return
        L_0x04ca:
            r0.A0F()
            return
        L_0x04ce:
            java.lang.Object r0 = r12.A00
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            X.4Oi r0 = r0.A0q
        L_0x04d4:
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass681.A03(X.4uZ):void");
    }

    public void A04(C95814uZ r5) {
        switch (this.A01) {
            case 26:
                Log.d("group_info/onProfilePhotoStartChanging");
                if (C627336j.A0K(r5)) {
                    GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                    if (r5.equals(groupChatInfoActivity.A1h)) {
                        groupChatInfoActivity.A0A.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 35:
                C97564yl r3 = (C97564yl) this.A00;
                Class<C95814uZ> cls = C95814uZ.class;
                AnonymousClass3ZH A0A = r3.A04.A0A(AnonymousClass3ZH.A02(r3.A09, cls));
                r3.A09 = A0A;
                if (r5.equals(A0A.A0I(cls))) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("viewprofilephoto/onProfilePhotoStartChanging photo_full_id:");
                    AnonymousClass3ZH r1 = r3.A09;
                    A0o.append(r1.A05);
                    A0o.append(" thumb_full_id:");
                    C18260x0.A1G(A0o, r1.A06);
                    if (r3.A0D) {
                        r3.A0D = false;
                        return;
                    } else {
                        r3.A0E = true;
                        return;
                    }
                } else {
                    return;
                }
            default:
                super.A04(r5);
                return;
        }
    }

    public void A05(UserJid userJid) {
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel;
        BaseAdapter baseAdapter;
        switch (this.A01) {
            case 0:
                C89104bW r2 = (C89104bW) this.A00;
                if (AnonymousClass3ZH.A0D(new AnonymousClass1RQ(r2.A0A.A0A(userJid)), r2.A0K)) {
                    baseAdapter = r2.A0O;
                    break;
                } else {
                    return;
                }
            case 3:
                BlockList blockList = (BlockList) this.A00;
                C117115rP.A01(blockList.A04, blockList, 48);
                return;
            case 5:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                if (callLogActivity.A0Y.equals(userJid)) {
                    callLogActivity.A75();
                    return;
                }
                return;
            case 10:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (userJid.equals(AnonymousClass32Y.A08(AnonymousClass0x7.A0l(contactInfoActivity)))) {
                    contactInfoActivity.A0x.A0F();
                    return;
                }
                return;
            case 11:
                C18260x0.A1P(AnonymousClass001.A0o(), "list_chat_info/onStatusChanged:", userJid);
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                if (!AnonymousClass4SG.A46(listChatInfoActivity, userJid)) {
                    AnonymousClass3ZH.A0D(new AnonymousClass1RQ(listChatInfoActivity.A0I.A0A(userJid)), listChatInfoActivity.A0j);
                    baseAdapter = listChatInfoActivity.A0D;
                    break;
                } else {
                    return;
                }
            case 12:
                CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) this.A00;
                C616131n.A02(communityMembersViewModel.A0L, new CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1(communityMembersViewModel, userJid, (C84814Du) null), AnonymousClass0IV.A00(communityMembersViewModel), (AnonymousClass20D) null, 2);
                return;
            case 13:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (AnonymousClass3ZH.A0D(new AnonymousClass1RQ(contactPickerFragment.A0w.A0A(userJid)), contactPickerFragment.A31)) {
                    contactPickerFragment.A1W();
                    return;
                }
                return;
            case 14:
                C89634eX r22 = (C89634eX) this.A00;
                r22.A7P(new AnonymousClass1RQ(r22.A0B.A0A(userJid)));
                return;
            case 16:
                C89884fR r1 = (C89884fR) this.A00;
                if (userJid != null && userJid.equals(r1.A0r)) {
                    r1.A02();
                    return;
                }
                return;
            case 22:
                AnonymousClass4VF r12 = (AnonymousClass4VF) this.A00;
                if (AnonymousClass75J.A00(userJid, r12.A01)) {
                    r12.A0D();
                    return;
                }
                return;
            case 24:
                ((ConversationsFragment) this.A00).A1f(userJid);
                return;
            case 25:
                if (userJid != null && !C627336j.A0K(userJid)) {
                    GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                    if (groupAdminPickerActivity.A78(userJid)) {
                        AnonymousClass3ZH.A0D(new AnonymousClass1RQ(groupAdminPickerActivity.A09.A0A(userJid)), groupAdminPickerActivity.A0Q);
                        groupAdminPickerActivity.A0I.A05();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                C18260x0.A1P(AnonymousClass001.A0o(), "group_info/onStatusChanged:", userJid);
                if (userJid != null) {
                    GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                    if (AnonymousClass4SG.A46(groupChatInfoActivity, userJid)) {
                        baseAdapter = groupChatInfoActivity.A1M;
                        break;
                    } else {
                        groupChatInfoActivity.A1R.A0E(new AnonymousClass1RQ(groupChatInfoActivity.A0I.A0A(userJid)));
                        return;
                    }
                } else {
                    return;
                }
            case 29:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A00;
                if (!AnonymousClass4SG.A46(newsletterInfoActivity, userJid) && newsletterInfoActivity.A7d() && userJid != null && (newsletterInfoMembersListViewModel = newsletterInfoActivity.A0b) != null) {
                    newsletterInfoMembersListViewModel.A0G.BkP(new C70113Zy(userJid, 34, newsletterInfoMembersListViewModel));
                    return;
                }
                return;
            case 32:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A00;
                if (AnonymousClass4SG.A46(profileInfoActivity, userJid)) {
                    profileInfoActivity.A0P.setSubText(profileInfoActivity.A09.A00());
                    profileInfoActivity.A0S.A03(3, 2);
                    return;
                }
                return;
            case 34:
                SetAboutInfo setAboutInfo = (SetAboutInfo) this.A00;
                if (AnonymousClass4SG.A46(setAboutInfo, userJid)) {
                    String A002 = setAboutInfo.A01.A00();
                    if (setAboutInfo.A07) {
                        setAboutInfo.A07 = false;
                        Iterator it = SetAboutInfo.A0A.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                SetAboutInfo.A0A.add(0, A002);
                            } else if (AnonymousClass001.A0m(it).equals(A002)) {
                            }
                        }
                        setAboutInfo.A74();
                    }
                    TextEmojiLabel textEmojiLabel = setAboutInfo.A02;
                    textEmojiLabel.setText(C107345b9.A03(textEmojiLabel.getContext(), setAboutInfo.A02.getPaint(), setAboutInfo.A0C, A002));
                    setAboutInfo.A04.notifyDataSetInvalidated();
                    C633939b.A00(setAboutInfo.A00, this, 36);
                    return;
                }
                return;
            case 39:
                SearchFragment.A00(userJid, (SearchFragment) this.A00);
                return;
            case 40:
                Settings settings = (Settings) this.A00;
                if (AnonymousClass4SG.A46(settings, userJid) && !settings.A0D.A0X(4921)) {
                    settings.A0H.A0K((List) null, settings.A0F.A00());
                    return;
                }
                return;
            default:
                super.A05(userJid);
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (r10.equals(r3.A0R) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02bd, code lost:
        X.AnonymousClass4VK.A02(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x033b, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033e, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(com.whatsapp.jid.UserJid r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0005;
                case 2: goto L_0x0024;
                case 3: goto L_0x0294;
                case 4: goto L_0x0005;
                case 5: goto L_0x0073;
                case 6: goto L_0x02a0;
                case 7: goto L_0x02aa;
                case 8: goto L_0x02b0;
                case 9: goto L_0x02b7;
                case 10: goto L_0x0083;
                case 11: goto L_0x00b6;
                case 12: goto L_0x02c1;
                case 13: goto L_0x00d9;
                case 14: goto L_0x02da;
                case 15: goto L_0x0005;
                case 16: goto L_0x00f4;
                case 17: goto L_0x0106;
                case 18: goto L_0x012b;
                case 19: goto L_0x032e;
                case 20: goto L_0x0144;
                case 21: goto L_0x02ed;
                case 22: goto L_0x0166;
                case 23: goto L_0x0005;
                case 24: goto L_0x02f7;
                case 25: goto L_0x01a6;
                case 26: goto L_0x01ce;
                case 27: goto L_0x01ee;
                case 28: goto L_0x0005;
                case 29: goto L_0x0200;
                case 30: goto L_0x0005;
                case 31: goto L_0x0230;
                case 32: goto L_0x0005;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x025e;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x030b;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x0335;
                case 43: goto L_0x0282;
                case 44: goto L_0x0313;
                case 45: goto L_0x0005;
                case 46: goto L_0x031d;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A06(r10)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r2 = r9.A00
            X.4bW r2 = (X.C89104bW) r2
            X.3Ex r0 = r2.A0A
            X.3ZH r0 = r0.A0A(r10)
            X.1RO r1 = new X.1RO
            r1.<init>(r0)
            java.util.List r0 = r2.A0K
            boolean r0 = X.AnonymousClass3ZH.A0D(r1, r0)
            if (r0 == 0) goto L_0x0008
            X.4OZ r0 = r2.A0O
            goto L_0x033b
        L_0x0024:
            java.lang.Object r1 = r9.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r1 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r1
            r1.A1e()
            boolean r0 = r1.A18
            if (r0 == 0) goto L_0x0008
            com.whatsapp.mentions.MentionableEntry r0 = r1.A0v
            java.lang.String r0 = r0.getStringText()
            java.lang.String r7 = r0.trim()
            X.4V6 r3 = r1.A0W
            X.4XK r5 = r1.A0V
            X.03q r4 = r1.A0R()
            X.07r r4 = (X.C009707r) r4
            X.7aS r6 = r1.A0c
            if (r10 == 0) goto L_0x0050
            com.whatsapp.jid.UserJid r0 = r3.A0R
            boolean r1 = r10.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r5 == 0) goto L_0x0008
            if (r6 == 0) goto L_0x0008
            if (r0 == 0) goto L_0x0008
            X.2rx r0 = r3.A0N
            com.whatsapp.jid.UserJid r2 = r3.A0R
            X.2qS r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0067
            java.lang.String r8 = r0.A08
        L_0x0063:
            r3.A0D(r4, r5, r6, r7, r8)
            return
        L_0x0067:
            X.5ZU r1 = r3.A0O
            X.3ZH r0 = new X.3ZH
            r0.<init>(r2)
            java.lang.String r8 = r1.A0H(r0)
            goto L_0x0063
        L_0x0073:
            java.lang.Object r1 = r9.A00
            com.whatsapp.calling.callhistory.CallLogActivity r1 = (com.whatsapp.calling.callhistory.CallLogActivity) r1
            X.4uZ r0 = r1.A0Y
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0008
            r1.A75()
            return
        L_0x0083:
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.String r0 = X.AnonymousClass0x7.A0l(r2)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x009b
            X.4kJ r0 = r2.A0x
            r0.A0F()
            return
        L_0x009b:
            X.3Ex r0 = r2.A0I
            X.3ZH r0 = r0.A0A(r10)
            X.1RO r1 = new X.1RO
            r1.<init>(r0)
            X.4Ob r0 = r2.A0u
            if (r0 == 0) goto L_0x0008
            java.util.List r0 = r0.A02
            boolean r0 = X.AnonymousClass3ZH.A0D(r1, r0)
            if (r0 == 0) goto L_0x0008
            X.4Ob r0 = r2.A0u
            goto L_0x033b
        L_0x00b6:
            java.lang.String r0 = "list_chat_info/onDisplayNameChanged"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = X.C627336j.A0K(r10)
            if (r0 != 0) goto L_0x0008
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r2 = (com.whatsapp.chatinfo.ListChatInfoActivity) r2
            X.3Ex r0 = r2.A0I
            X.3ZH r0 = r0.A0A(r10)
            X.1RO r1 = new X.1RO
            r1.<init>(r0)
            java.util.ArrayList r0 = r2.A0j
            X.AnonymousClass3ZH.A0D(r1, r0)
            X.4OP r0 = r2.A0D
            goto L_0x033b
        L_0x00d9:
            java.lang.Object r2 = r9.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.3Ex r0 = r2.A0w
            X.3ZH r0 = r0.A0A(r10)
            X.1RO r1 = new X.1RO
            r1.<init>(r0)
            java.util.List r0 = r2.A31
            boolean r0 = X.AnonymousClass3ZH.A0D(r1, r0)
            if (r0 == 0) goto L_0x0008
            r2.A1W()
            return
        L_0x00f4:
            java.lang.Object r1 = r9.A00
            X.4fR r1 = (X.C89884fR) r1
            if (r10 == 0) goto L_0x0008
            X.4uZ r0 = r1.A0r
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1.A09()
            return
        L_0x0106:
            if (r10 == 0) goto L_0x0008
            java.lang.Object r2 = r9.A00
            X.4fT r2 = (X.C89904fT) r2
            X.4uZ r0 = r2.A0V
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.3ZH r0 = r2.A00
            boolean r1 = r0.A0R()
            r2.A00 = r2.A0P.A01(r2.A0V)
            X.3ZH r0 = r2.A00
            boolean r0 = r0.A0R()
            if (r1 == r0) goto L_0x0008
            X.07r r0 = r2.A01
            r0.invalidateOptionsMenu()
            return
        L_0x012b:
            r0 = 0
            X.C162457s7.A0J(r10, r0)
            java.lang.Object r2 = r9.A00
            X.4nx r2 = (X.C93134nx) r2
            X.3ZH r0 = r2.A09
            X.4uZ r0 = r0.A0H
            if (r0 == 0) goto L_0x0008
            boolean r1 = r0.equals(r10)
            r0 = 1
            if (r1 != r0) goto L_0x0008
            r2.A1H()
            return
        L_0x0144:
            java.lang.Object r2 = r9.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            java.util.ArrayList r0 = r2.A0b
            java.util.Iterator r1 = r0.iterator()
        L_0x014e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0008
            java.lang.Object r0 = r1.next()
            X.5Rj r0 = (X.C104545Rj) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x014e
            android.widget.BaseAdapter r0 = r2.A01
            goto L_0x033b
        L_0x0166:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/onDisplayNameChanged "
            X.C18260x0.A1P(r1, r0, r10)
            java.lang.Object r1 = r9.A00
            X.4VF r1 = (X.AnonymousClass4VF) r1
            X.4uZ r0 = r1.A01
            boolean r0 = X.AnonymousClass75J.A00(r10, r0)
            if (r0 == 0) goto L_0x017e
            r1.A0D()
        L_0x017e:
            X.4UA r2 = r1.A0C
            X.3Ls r1 = r2.A01
            boolean r0 = r1 instanceof X.C131936eQ
            if (r0 == 0) goto L_0x0008
            if (r10 == 0) goto L_0x0008
            X.6eQ r1 = (X.C131936eQ) r1
            com.whatsapp.jid.UserJid r0 = r1.A00
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.2rx r0 = r2.A0Q
            X.2qS r0 = r0.A01(r10)
            if (r0 == 0) goto L_0x0008
            X.3Ls r1 = r2.A01
            java.lang.String r0 = r0.A08
            r1.A0J = r0
            X.59D r0 = X.AnonymousClass59D.PAGE_UPDATED
            r2.A0G(r1, r0)
            return
        L_0x01a6:
            if (r10 == 0) goto L_0x0008
            boolean r0 = X.C627336j.A0K(r10)
            if (r0 != 0) goto L_0x0008
            java.lang.Object r2 = r9.A00
            com.whatsapp.group.GroupAdminPickerActivity r2 = (com.whatsapp.group.GroupAdminPickerActivity) r2
            boolean r0 = r2.A78(r10)
            if (r0 == 0) goto L_0x0008
            X.3Ex r0 = r2.A09
            X.3ZH r0 = r0.A0A(r10)
            X.1RO r1 = new X.1RO
            r1.<init>(r0)
            java.util.List r0 = r2.A0Q
            X.AnonymousClass3ZH.A0D(r1, r0)
            java.lang.String r0 = r2.A0M
            r2.A77(r0)
            return
        L_0x01ce:
            java.lang.String r0 = "group_info/onDisplayNameChanged"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = X.C627336j.A0K(r10)
            if (r0 != 0) goto L_0x0008
            java.lang.Object r2 = r9.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.3Ex r0 = r2.A0I
            X.3ZH r0 = r0.A0A(r10)
            X.1RO r1 = new X.1RO
            r1.<init>(r0)
            X.10x r0 = r2.A1R
            r0.A0E(r1)
            return
        L_0x01ee:
            if (r10 == 0) goto L_0x0008
            java.util.List r3 = X.C18290x4.A12(r10)
            java.lang.Object r2 = r9.A00
            X.5WJ r2 = (X.AnonymousClass5WJ) r2
            X.4FS r1 = r2.A0D
            r0 = 34
            X.C86644Kx.A1S(r1, r3, r2, r0)
            return
        L_0x0200:
            java.lang.Object r1 = r9.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.3ZH r0 = r1.A0S
            if (r0 != 0) goto L_0x020f
            java.lang.String r0 = "contact"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x020f:
            X.4uZ r0 = r0.A0H
            boolean r0 = X.C162457s7.A0P(r10, r0)
            if (r0 != 0) goto L_0x0008
            boolean r0 = r1.A7d()
            if (r0 == 0) goto L_0x0008
            if (r10 == 0) goto L_0x0008
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r3 = r1.A0b
            if (r3 == 0) goto L_0x0008
            X.4FS r2 = r3.A0G
            r1 = 34
            X.3Zy r0 = new X.3Zy
            r0.<init>(r10, r1, r3)
            r2.BkP(r0)
            return
        L_0x0230:
            java.lang.Object r1 = r9.A00
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            java.util.List r0 = r1.A1P
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0008
            X.34x r0 = r1.A1A
            X.4uZ r0 = X.AnonymousClass2z0.A00(r0)
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0254
            X.34x r0 = r1.A1A
            X.4uZ r0 = r0.A0n()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0008
        L_0x0254:
            com.whatsapp.notification.PopupNotificationViewPager r0 = r1.A14
            int r0 = r0.getCurrentItem()
            r1.A6q(r0)
            return
        L_0x025e:
            java.lang.Object r2 = r9.A00
            X.4yl r2 = (X.C97564yl) r2
            X.3Ex r1 = r2.A04
            X.3ZH r0 = r2.A09
            X.4uZ r0 = X.C86604Kt.A0a(r0)
            X.3ZH r0 = r1.A0A(r0)
            r2.A09 = r0
            boolean r0 = r0.A0U()
            if (r0 != 0) goto L_0x0008
            X.5ZU r1 = r2.A05
            X.3ZH r0 = r2.A09
            java.lang.String r0 = r1.A0H(r0)
            r2.A6e(r0)
            return
        L_0x0282:
            if (r10 == 0) goto L_0x0008
            java.lang.Object r1 = r9.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            com.whatsapp.jid.UserJid r0 = r1.A0R
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1.A1U()
            return
        L_0x0294:
            java.lang.Object r2 = r9.A00
            com.whatsapp.blocklist.BlockList r2 = (com.whatsapp.blocklist.BlockList) r2
            X.4FS r1 = r2.A04
            r0 = 48
            X.C117115rP.A01(r1, r2, r0)
            return
        L_0x02a0:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r0 = (com.whatsapp.calling.callhistory.group.GroupCallLogActivity) r0
            X.4XB r0 = r0.A02
            X.AnonymousClass4XB.A00(r0, r10)
            return
        L_0x02aa:
            java.lang.String r0 = "CallsHistoryDataSource/onDisplayNameChanged"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x02b0:
            java.lang.Object r1 = r9.A00
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r1 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r1
            X.4xk r0 = r1.A06
            goto L_0x02bd
        L_0x02b7:
            java.lang.Object r1 = r9.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel) r1
            X.4xk r0 = r1.A0C
        L_0x02bd:
            X.AnonymousClass4VK.A02(r0, r1)
            return
        L_0x02c1:
            r0 = 0
            X.C162457s7.A0J(r10, r0)
            java.lang.Object r0 = r9.A00
            com.whatsapp.community.CommunityMembersViewModel r0 = (com.whatsapp.community.CommunityMembersViewModel) r0
            X.4C6 r4 = X.AnonymousClass0IV.A00(r0)
            X.3gB r3 = r0.A0L
            r2 = 0
            com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onDisplayNameChanged$1 r1 = new com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onDisplayNameChanged$1
            r1.<init>(r0, r10, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x02da:
            java.lang.Object r2 = r9.A00
            X.4eX r2 = (X.C89634eX) r2
            X.3Ex r0 = r2.A0B
            X.3ZH r1 = r0.A0A(r10)
            X.1RO r0 = new X.1RO
            r0.<init>(r1)
            r2.A7P(r0)
            return
        L_0x02ed:
            java.lang.Object r0 = r9.A00
            X.4ok r0 = (X.C93544ok) r0
            X.675 r0 = r0.A05
            r0.notifyDataSetChanged()
            return
        L_0x02f7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversations/onDisplayNameChanged "
            X.C18260x0.A1P(r1, r0, r10)
            java.lang.Object r0 = r9.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            r0.A1f(r10)
            A02(r0)
            return
        L_0x030b:
            java.lang.Object r0 = r9.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchFragment.A00(r10, r0)
            return
        L_0x0313:
            java.lang.Object r0 = r9.A00
            X.5TV r0 = (X.AnonymousClass5TV) r0
            X.4Wh r0 = r0.A0L
            r0.A0K(r10)
            return
        L_0x031d:
            java.lang.Object r0 = r9.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = r0.A0s
            X.4xk r0 = r2.A0R
            X.5XK r1 = r0.A08()
            r0 = 0
            r2.A0T(r1, r0)
            return
        L_0x032e:
            java.lang.Object r0 = r9.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r0 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r0
            X.4Oc r0 = r0.A0B
            goto L_0x033b
        L_0x0335:
            java.lang.Object r0 = r9.A00
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            X.4Oi r0 = r0.A0q
        L_0x033b:
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass681.A06(com.whatsapp.jid.UserJid):void");
    }

    public void A07(UserJid userJid) {
        switch (this.A01) {
            case 10:
            case 13:
            case 14:
            case 22:
            case 26:
                A05(userJid);
                return;
            case 16:
                C89884fR r1 = (C89884fR) this.A00;
                if (userJid != null && userJid.equals(r1.A0r)) {
                    r1.A0L = r1.A0m.A01(userJid);
                    r1.A02();
                    return;
                }
                return;
            case 40:
                Settings settings = (Settings) this.A00;
                if (AnonymousClass4SG.A46(settings, userJid) && settings.A0D.A0X(4921)) {
                    if (settings.A03 == null) {
                        settings.A75();
                    }
                    settings.A0e.A02(settings.A0d.A00());
                    return;
                }
                return;
            default:
                super.A07(userJid);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r3.BkM(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(java.util.Collection r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0029;
                case 3: goto L_0x0030;
                case 10: goto L_0x003e;
                case 13: goto L_0x0049;
                case 14: goto L_0x0051;
                case 22: goto L_0x0009;
                case 41: goto L_0x005b;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A08(r5)
        L_0x0008:
            return
        L_0x0009:
            java.util.Iterator r3 = r5.iterator()
        L_0x000d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0008
            java.lang.Object r2 = r3.next()
            java.lang.Object r1 = r4.A00
            X.4VF r1 = (X.AnonymousClass4VF) r1
            X.4uZ r0 = r1.A01
            boolean r0 = X.AnonymousClass75J.A00(r2, r0)
            if (r0 == 0) goto L_0x000d
            X.4UC r0 = r1.A0W
            X.C86654Ky.A1H(r0)
            return
        L_0x0029:
            java.lang.Object r0 = r4.A00
            X.4bW r0 = (X.C89104bW) r0
            X.4OZ r0 = r0.A0O
            goto L_0x0057
        L_0x0030:
            java.lang.Object r1 = r4.A00
            X.4el r1 = (X.C89704el) r1
            X.4FS r3 = r1.A04
            r0 = 45
            X.5rP r2 = new X.5rP
            r2.<init>(r1, r0)
            goto L_0x0068
        L_0x003e:
            java.lang.Object r0 = r4.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            r0.A7L()
            r0.A7N()
            return
        L_0x0049:
            java.lang.Object r0 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A1W()
            return
        L_0x0051:
            java.lang.Object r0 = r4.A00
            X.4eX r0 = (X.C89634eX) r0
            android.widget.BaseAdapter r0 = r0.A03
        L_0x0057:
            r0.notifyDataSetChanged()
            return
        L_0x005b:
            java.lang.Object r0 = r4.A00
            X.4el r0 = (X.C89704el) r0
            X.4FS r3 = r0.A04
            r0 = 12
            X.3bs r2 = new X.3bs
            r2.<init>((java.lang.Object) r4, (int) r0)
        L_0x0068:
            r3.BkM(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass681.A08(java.util.Collection):void");
    }

    public void A09(Collection collection) {
        AnonymousClass4WF r0;
        Collection collection2 = collection;
        switch (this.A01) {
            case 5:
                ((CallLogActivity) this.A00).A75();
                return;
            case 7:
                Log.d("CallsHistoryDataSource/onContactsAddedOrUpdated");
                AnonymousClass5XL r1 = (AnonymousClass5XL) this.A00;
                if (r1.A06 != null && collection != null && !collection.isEmpty()) {
                    AnonymousClass7DD r12 = r1.A06;
                    Log.i("CallsHistoryViewModel/onContactsAddedOrUpdated");
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r12.A00;
                    if (!callsHistoryFragmentV2ViewModel.A0G) {
                        Log.i("CallsHistoryViewModel/onContactsAddedOrUpdated skip due to no active observer");
                        return;
                    }
                    C18290x4.A1L(callsHistoryFragmentV2ViewModel.A0A);
                    AnonymousClass7DF r13 = callsHistoryFragmentV2ViewModel.A0S;
                    Lock lock = callsHistoryFragmentV2ViewModel.A0r;
                    AnonymousClass556 r02 = new AnonymousClass556(r13, callsHistoryFragmentV2ViewModel, callsHistoryFragmentV2ViewModel.A0o, collection2, callsHistoryFragmentV2ViewModel.A0q, lock);
                    callsHistoryFragmentV2ViewModel.A0A = r02;
                    AnonymousClass5ZM.A05(callsHistoryFragmentV2ViewModel, r02);
                    return;
                }
                return;
            case 17:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C95814uZ A0b = C86604Kt.A0b(it);
                    if (A0b != null) {
                        C89904fT r14 = (C89904fT) this.A00;
                        if (A0b.equals(r14.A0V)) {
                            r14.A00 = r14.A0P.A01(r14.A0V);
                            r14.A01.invalidateOptionsMenu();
                            return;
                        }
                    }
                }
                return;
            case 23:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    C95814uZ A0b2 = C86604Kt.A0b(it2);
                    if (A0b2 != null) {
                        AnonymousClass4Ul r3 = (AnonymousClass4Ul) this.A00;
                        if (A0b2.equals(r3.A00.A0H)) {
                            AnonymousClass3ZH A012 = r3.A03.A01(C106405Yw.A03(r3.A00.A0H));
                            r3.A00 = A012;
                            AnonymousClass4UC r15 = r3.A05;
                            C52472lX r2 = r3.A04;
                            C06270Wx.A05(r15, r2.A00(A012));
                            C06270Wx.A05(r3.A06, r2.A00(r3.A00));
                        }
                    }
                }
                return;
            case 27:
                A0D(collection);
                return;
            case 37:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                quickContactActivity.A75();
                AnonymousClass4SG.A3n(quickContactActivity);
                return;
            case 46:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                CallInfo A7D = voipActivityV2.A7D();
                if (A7D != null) {
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass3ZH A0R = C18310x6.A0R(it3);
                        C95814uZ r16 = A0R.A0H;
                        if (r16 == null || !r16.equals(A7D.groupJid)) {
                            C95814uZ r17 = A0R.A0H;
                            if (r17 != null && !A7D.isGroupCall && r17.equals(A7D.getPeerJid()) && voipActivityV2.A81() && voipActivityV2.A0D.A0N(4067) >= 2 && voipActivityV2.A0D.A0X(4455)) {
                                voipActivityV2.A7m(A7D);
                            }
                        } else {
                            voipActivityV2.A7m(A7D);
                            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1t;
                            if (!(voipCallControlBottomSheetV2 == null || (r0 = voipCallControlBottomSheetV2.A0O) == null)) {
                                r0.A0M();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                super.A09(collection);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f0, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0189, code lost:
        r1.filter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x018c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0193, code lost:
        r0.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0196, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(java.util.Collection r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0075;
                case 4: goto L_0x0005;
                case 5: goto L_0x0081;
                case 6: goto L_0x0005;
                case 7: goto L_0x0009;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0089;
                case 11: goto L_0x009b;
                case 12: goto L_0x0005;
                case 13: goto L_0x00a3;
                case 14: goto L_0x00ab;
                case 15: goto L_0x00b3;
                case 16: goto L_0x00d3;
                case 17: goto L_0x00db;
                case 18: goto L_0x0005;
                case 19: goto L_0x00e3;
                case 20: goto L_0x00ea;
                case 21: goto L_0x00f4;
                case 22: goto L_0x00fe;
                case 23: goto L_0x0005;
                case 24: goto L_0x010b;
                case 25: goto L_0x0144;
                case 26: goto L_0x014e;
                case 27: goto L_0x002d;
                case 28: goto L_0x0005;
                case 29: goto L_0x0049;
                case 30: goto L_0x0005;
                case 31: goto L_0x0156;
                case 32: goto L_0x0005;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x015e;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x005e;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x017d;
                case 43: goto L_0x0166;
                case 44: goto L_0x018d;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A0A(r6)
        L_0x0008:
            return
        L_0x0009:
            java.lang.String r0 = "CallsHistoryDataSource/onContactsChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r5.A00
            X.5XL r0 = (X.AnonymousClass5XL) r0
            X.7DD r0 = r0.A06
            if (r0 == 0) goto L_0x0008
            if (r6 == 0) goto L_0x0008
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r0.A00
            monitor-enter(r1)
            r0 = 0
            r1.A0E = r0     // Catch:{ all -> 0x016e }
            monitor-exit(r1)
            X.4Ox r1 = r1.A0T
            java.lang.CharSequence r0 = r1.A01
            boolean r0 = X.C18320x8.A1U(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.CharSequence r0 = r1.A01
            goto L_0x0189
        L_0x002d:
            if (r6 == 0) goto L_0x0008
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r6.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0171
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0037
            r3.add(r1)
            goto L_0x0037
        L_0x0049:
            java.lang.Object r1 = r5.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            boolean r0 = r1.A7d()
            if (r0 == 0) goto L_0x0008
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r2 = r1.A0b
            if (r2 == 0) goto L_0x0008
            X.21d r1 = X.C371521d.SHORT
            r0 = 0
            r2.A0E(r1, r0)
            return
        L_0x005e:
            java.lang.Object r0 = r5.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            X.4XH r0 = r0.A1b
            if (r0 == 0) goto L_0x0008
            goto L_0x0193
        L_0x0068:
            java.lang.String r0 = "statusrecipients/onContactsChanged"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.Object r0 = r5.A00
            X.4bW r0 = (X.C89104bW) r0
            r0.A79()
            return
        L_0x0075:
            java.lang.Object r2 = r5.A00
            com.whatsapp.blocklist.BlockList r2 = (com.whatsapp.blocklist.BlockList) r2
            X.4FS r1 = r2.A04
            r0 = 48
            X.C117115rP.A01(r1, r2, r0)
            return
        L_0x0081:
            java.lang.Object r0 = r5.A00
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            r0.A75()
            return
        L_0x0089:
            java.lang.Object r2 = r5.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.4kJ r0 = r2.A0x
            r0.A0F()
            r2.A5T()
            r1 = 1
            r0 = 0
            r2.A7X(r1, r0)
            return
        L_0x009b:
            java.lang.Object r0 = r5.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            com.whatsapp.chatinfo.ListChatInfoActivity.A0C(r0)
            return
        L_0x00a3:
            java.lang.Object r0 = r5.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            com.whatsapp.contact.picker.ContactPickerFragment.A00(r0)
            return
        L_0x00ab:
            java.lang.Object r0 = r5.A00
            X.4eX r0 = (X.C89634eX) r0
            r0.A7H()
            return
        L_0x00b3:
            java.lang.Object r0 = r5.A00
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r0 = (com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r0
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r4 = r0.A0I
            if (r4 != 0) goto L_0x00c0
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x00c0:
            java.util.List r0 = r4.A0E
            r0.clear()
            X.08J r3 = r4.A02
            X.08M r2 = r4.A06
            r3.A0I(r2)
            X.5Mk r1 = r4.A0C
            r0 = 3
            X.C103315Mk.A00(r2, r3, r1, r4, r0)
            return
        L_0x00d3:
            java.lang.Object r0 = r5.A00
            X.4fR r0 = (X.C89884fR) r0
            r0.A09()
            return
        L_0x00db:
            java.lang.Object r0 = r5.A00
            X.4fT r0 = (X.C89904fT) r0
            r0.A00 = r0.A0P.A01(r0.A0V)
            return
        L_0x00e3:
            java.lang.Object r0 = r5.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r0 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r0
            X.4Oc r0 = r0.A0B
            goto L_0x00f0
        L_0x00ea:
            java.lang.Object r0 = r5.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r0
            android.widget.BaseAdapter r0 = r0.A01
        L_0x00f0:
            r0.notifyDataSetChanged()
            return
        L_0x00f4:
            java.lang.Object r0 = r5.A00
            X.4ok r0 = (X.C93544ok) r0
            X.675 r0 = r0.A05
            r0.notifyDataSetChanged()
            return
        L_0x00fe:
            java.lang.Object r0 = r5.A00
            X.4VF r0 = (X.AnonymousClass4VF) r0
            r0.A0D()
            X.4UC r0 = r0.A0X
            X.C86654Ky.A1H(r0)
            return
        L_0x010b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationsFragment/onContactsChanged:"
            X.C18260x0.A1P(r1, r0, r6)
            if (r6 == 0) goto L_0x013a
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x013a
            java.util.Iterator r2 = r6.iterator()
        L_0x0120:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0132
            X.4uZ r1 = X.C18300x5.A0P(r2)
            java.lang.Object r0 = r5.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            r0.A1f(r1)
            goto L_0x0120
        L_0x0132:
            java.lang.Object r0 = r5.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            A02(r0)
            return
        L_0x013a:
            java.lang.Object r1 = r5.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            java.lang.String r0 = "onAllContactsChanged"
            com.whatsapp.conversationslist.ConversationsFragment.A04(r1, r0)
            return
        L_0x0144:
            java.lang.Object r1 = r5.A00
            com.whatsapp.group.GroupAdminPickerActivity r1 = (com.whatsapp.group.GroupAdminPickerActivity) r1
            java.lang.String r0 = r1.A0M
            r1.A77(r0)
            return
        L_0x014e:
            java.lang.Object r0 = r5.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            com.whatsapp.group.GroupChatInfoActivity.A0C(r0)
            return
        L_0x0156:
            java.lang.Object r0 = r5.A00
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            com.whatsapp.notification.PopupNotification.A0C(r0)
            return
        L_0x015e:
            java.lang.Object r0 = r5.A00
            com.whatsapp.profile.ViewProfilePhoto r0 = (com.whatsapp.profile.ViewProfilePhoto) r0
            com.whatsapp.profile.ViewProfilePhoto.A0C(r0)
            return
        L_0x0166:
            java.lang.Object r0 = r5.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r0
            r0.A1U()
            return
        L_0x016e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0171:
            java.lang.Object r2 = r5.A00
            X.5WJ r2 = (X.AnonymousClass5WJ) r2
            X.4FS r1 = r2.A0D
            r0 = 34
            X.C86644Kx.A1S(r1, r3, r2, r0)
            return
        L_0x017d:
            java.lang.Object r2 = r5.A00
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            X.4Oi r0 = r2.A0q
            android.widget.Filter r1 = r0.getFilter()
            java.lang.CharSequence r0 = r2.A1I
        L_0x0189:
            r1.filter(r0)
            return
        L_0x018d:
            java.lang.Object r0 = r5.A00
            X.5TV r0 = (X.AnonymousClass5TV) r0
            X.4Wh r0 = r0.A0L
        L_0x0193:
            r0.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass681.A0A(java.util.Collection):void");
    }

    public void A0B(Collection collection) {
        switch (this.A01) {
            case 10:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (AnonymousClass4SG.A44(contactInfoActivity)) {
                    contactInfoActivity.A0x.A0F();
                    contactInfoActivity.A5T();
                    return;
                }
                return;
            case 24:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                if (conversationsFragment.A24.A0X(5868)) {
                    C18260x0.A1P(AnonymousClass001.A0o(), "ConversationsFragment/onContactsRemoved:", collection);
                    if (collection == null || collection.isEmpty()) {
                        ConversationsFragment.A04(conversationsFragment, "onAllContactsChanged");
                        return;
                    }
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        conversationsFragment.A1f(C86604Kt.A0b(it));
                    }
                    A02(conversationsFragment);
                    return;
                }
                return;
            case 27:
                A0D(collection);
                return;
            case 37:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                quickContactActivity.A75();
                AnonymousClass4SG.A3n(quickContactActivity);
                return;
            default:
                super.A0B(collection);
                return;
        }
    }

    public void A0C(Collection collection) {
        switch (this.A01) {
            case 12:
                C162457s7.A0J(collection, 0);
                CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) this.A00;
                C616131n.A02(communityMembersViewModel.A0L, new CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1(communityMembersViewModel, collection, (C84814Du) null), AnonymousClass0IV.A00(communityMembersViewModel), (AnonymousClass20D) null, 2);
                return;
            case 24:
                ((ConversationsFragment) this.A00).A2u.BkM(C117625sE.A00(this, 36));
                return;
            default:
                super.A0C(collection);
                return;
        }
    }

    public final void A0D(Collection collection) {
        if (collection != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : collection) {
                if (((AnonymousClass3ZH) next).A0H instanceof UserJid) {
                    A0s.add(next);
                }
            }
            ArrayList A0c = C73783g4.A0c(A0s);
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                C95814uZ A0b = C86604Kt.A0b(it);
                C162457s7.A0K(A0b, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                A0c.add(A0b);
            }
            AnonymousClass5WJ r2 = (AnonymousClass5WJ) this.A00;
            C86644Kx.A1S(r2.A0D, A0c, r2, 34);
        }
    }
}
