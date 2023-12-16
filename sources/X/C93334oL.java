package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import com.whatsapp.Conversation;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4oL  reason: invalid class name and case insensitive filesystem */
public abstract class C93334oL extends C89584eO implements AnonymousClass677, C1230666y, AnonymousClass652 {
    public C112975kg A00;
    public final List A01 = AnonymousClass001.A0s();

    public /* synthetic */ void Awx(Drawable drawable, View view) {
        if (this instanceof Conversation) {
            ((Conversation) this).A02.A1c(drawable, view);
        }
    }

    public C835748y B0u() {
        return new C111305hs(this.A00);
    }

    public void B1t() {
        AnonymousClass4Rl r0 = this.A00.A0P;
        if (r0 != null) {
            r0.dismiss();
        }
    }

    public void B3M() {
        this.A00.B3M();
    }

    public void B3X(C624134x r2) {
        this.A00.B3X(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.4ok} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object B5x(java.lang.Class r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C93544ok
            if (r0 == 0) goto L_0x000e
            r1 = r2
            X.4ok r1 = (X.C93544ok) r1
            java.lang.Class<X.657> r0 = X.AnonymousClass657.class
            if (r3 != r0) goto L_0x001c
            X.657 r0 = r1.A0M
            return r0
        L_0x000e:
            boolean r0 = r2 instanceof com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity
            if (r0 == 0) goto L_0x001f
            r1 = r2
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r1 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r1
            java.lang.Class<X.657> r0 = X.AnonymousClass657.class
            if (r3 != r0) goto L_0x001c
            X.657 r0 = r1.A0Y
            return r0
        L_0x001c:
            X.5kg r0 = r1.A00
            goto L_0x003e
        L_0x001f:
            boolean r0 = r2 instanceof com.whatsapp.Conversation
            if (r0 == 0) goto L_0x003c
            r0 = r2
            com.whatsapp.Conversation r0 = (com.whatsapp.Conversation) r0
            X.5l7 r1 = r0.A02
            java.lang.Class<X.657> r0 = X.AnonymousClass657.class
            if (r3 != r0) goto L_0x002f
            X.657 r0 = r1.A72
            return r0
        L_0x002f:
            java.lang.Class<com.whatsapp.conversation.congratulations.CongratulationsImpl> r0 = com.whatsapp.conversation.congratulations.CongratulationsImpl.class
            if (r3 != r0) goto L_0x0035
            r0 = 0
            return r0
        L_0x0035:
            X.676 r0 = r1.A2z
            java.lang.Object r0 = r0.BqK(r3)
            return r0
        L_0x003c:
            X.5kg r0 = r2.A00
        L_0x003e:
            java.lang.Object r0 = r0.B5x(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93334oL.B5x(java.lang.Class):java.lang.Object");
    }

    public int BAS(C624134x r2) {
        return this.A00.BAS(r2);
    }

    public boolean BFW() {
        return this.A00.BFW();
    }

    public void BFc() {
        if (this instanceof Conversation) {
            ((Conversation) this).A02.A0d();
        }
    }

    public /* synthetic */ boolean BIA() {
        if (this instanceof Conversation) {
            return AnonymousClass000.A1W(((Conversation) this).A02.A3B.A0G);
        }
        return false;
    }

    public boolean BIB(C624134x r2) {
        return this.A00.BIB(r2);
    }

    public /* synthetic */ boolean BIT() {
        AnonymousClass5ZT r0;
        if (!(this instanceof Conversation) || (r0 = ((Conversation) this).A02.A5q) == null || !C86604Kt.A1Y(r0.A1D.A0B)) {
            return false;
        }
        return true;
    }

    public boolean BIc() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0v;
        if (reactionsTrayViewModel == null || C86604Kt.A05(reactionsTrayViewModel.A0C) != 2) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean BJC(C624134x r2) {
        if (this instanceof Conversation) {
            return ((Conversation) this).A02.A2e(r2);
        }
        return false;
    }

    public /* synthetic */ boolean BLE() {
        Number number;
        if (this instanceof MediaAlbumActivity) {
            number = C86654Ky.A0i(((MediaAlbumActivity) this).A0A.A01);
            if (number == null) {
                return false;
            }
        } else if (!(this instanceof Conversation)) {
            return true;
        } else {
            number = C86654Ky.A0i(((Conversation) this).A02.A2q.A01);
            if (number == null) {
                return false;
            }
        }
        if (number.intValue() == 1) {
            return true;
        }
        return false;
    }

    public void BZO(int i) {
        this.A00.A0A(i);
    }

    public /* synthetic */ void BZx(C624134x r2, boolean z) {
        if (this instanceof Conversation) {
            ((Conversation) this).A02.A29(r2, z);
        }
    }

    public void Bkv(C624134x r2) {
        this.A00.Bkv(r2);
    }

    public void Bmp(C624134x r2, int i) {
        this.A00.Bmp(r2, i);
    }

    public void BnL(List list, boolean z) {
        this.A00.BnL(list, z);
    }

    public /* synthetic */ boolean BoV() {
        if (this instanceof Conversation) {
            return true;
        }
        return false;
    }

    public void Boh(Bitmap bitmap, C106705a1 r3) {
        this.A00.Boh(bitmap, r3);
    }

    public /* synthetic */ void Boi(C624134x r2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A02.A3B.A0R(r2);
        }
    }

    public /* synthetic */ boolean Bor() {
        if (this instanceof Conversation) {
            return true;
        }
        return false;
    }

    public void BpB(View view, C624134x r3, int i, boolean z) {
        this.A00.BpB(view, r3, i, z);
    }

    public void Bpx(C624134x r2) {
        this.A00.Bpx(r2);
    }

    public boolean Bqw(C624134x r2) {
        return this.A00.Bqw(r2);
    }

    public void Brx(C624134x r2) {
        this.A00.Brx(r2);
    }

    public AnonymousClass1VX getABProps() {
        return this.A0D;
    }

    public C89644eZ getActivity() {
        return this;
    }

    public C105055Tk getAddContactLogUtil() {
        return this.A00.A10;
    }

    public C620433g getBusinessProfileManager() {
        return this.A00.A08;
    }

    public C56942so getCommunityChatManager() {
        return this.A00.A09;
    }

    public C44772Xk getContactAccessHelper() {
        return this.A00.A0B;
    }

    public C64773Ex getContactManager() {
        return this.A00.A0C;
    }

    public C114015mM getContactPhotos() {
        return this.A00.A0H;
    }

    public /* synthetic */ int getContainerType() {
        if (this instanceof C93544ok) {
            C93544ok r1 = (C93544ok) this;
            if (r1 instanceof EnforcedMessagesActivity) {
                return 7;
            }
            if (r1 instanceof StarredMessagesActivity) {
                return 1;
            }
            return 4;
        } else if (this instanceof MediaAlbumActivity) {
            return 2;
        } else {
            return 0;
        }
    }

    public AnonymousClass5R7 getConversationRowCustomizers() {
        return this.A00.A0Q;
    }

    public C105165Tv getConversationRowInflater() {
        return this.A00.A0M;
    }

    public C66543Lv getCoreMessageStore() {
        return this.A00.A0X;
    }

    public C89224c7 getEmojiPopupWindow() {
        if (this instanceof MediaAlbumActivity) {
            MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this;
            C89224c7 r2 = mediaAlbumActivity.A0G;
            if (r2 != null) {
                return r2;
            }
            AnonymousClass1VX r15 = mediaAlbumActivity.A0D;
            C105895Wv r1 = mediaAlbumActivity.A0B;
            C55682qk r5 = mediaAlbumActivity.A03;
            AnonymousClass5Y0 r13 = mediaAlbumActivity.A0C;
            C27821ej r12 = mediaAlbumActivity.A0I;
            C620633i r8 = mediaAlbumActivity.A08;
            C620733j r10 = mediaAlbumActivity.A00;
            AnonymousClass5IY r11 = mediaAlbumActivity.A0H;
            EmojiSearchProvider emojiSearchProvider = mediaAlbumActivity.A00.A0d;
            C89224c7 r22 = new C89224c7(mediaAlbumActivity, (ImageButton) null, r5, (KeyboardPopupLayout) mediaAlbumActivity.A00, (WaEditText) null, r8, mediaAlbumActivity.A09, r10, r11, r12, r13, emojiSearchProvider, r15, mediaAlbumActivity.A0S, r1);
            mediaAlbumActivity.A0G = r22;
            r22.setOnDismissListener(mediaAlbumActivity.A00.A16);
            C89224c7 r7 = mediaAlbumActivity.A0G;
            AnonymousClass5Y0 r9 = mediaAlbumActivity.A0C;
            C27821ej r82 = mediaAlbumActivity.A0I;
            MediaAlbumActivity mediaAlbumActivity2 = mediaAlbumActivity;
            AnonymousClass5S9 r4 = new AnonymousClass5S9(mediaAlbumActivity2, mediaAlbumActivity.A00, r7, r82, r9, (EmojiSearchContainer) C005205m.A00(mediaAlbumActivity, R.id.emoji_search_container), mediaAlbumActivity.A0S);
            mediaAlbumActivity.A0J = r4;
            C89224c7 r23 = mediaAlbumActivity.A0G;
            r23.A0E = new C117615sD((Object) mediaAlbumActivity, 4);
            r23.A0C = r4;
            r23.A0C(new AnonymousClass694(mediaAlbumActivity, 2));
            AnonymousClass5S9.A00(r4, mediaAlbumActivity, 2);
            return r23;
        } else if (this instanceof Conversation) {
            return ((Conversation) this).A02.A45;
        } else {
            return null;
        }
    }

    public EmojiSearchProvider getEmojiSearchProvider() {
        return this.A00.A0d;
    }

    public C55832qz getFMessageDatabase() {
        return this.A00.A0y;
    }

    public Collection getForwardMessages() {
        return this.A00.A04();
    }

    public C66493Lq getGroupChatManager() {
        return this.A00.A0g;
    }

    public C56072rN getGroupChatUtils() {
        return this.A00.A11;
    }

    public C56892sj getGroupParticipantsManager() {
        return this.A00.A0Y;
    }

    public /* synthetic */ C06270Wx getHasOutgoingMessagesLiveData() {
        if (this instanceof Conversation) {
            return ((Conversation) this).A02.A3B.A0T;
        }
        return null;
    }

    public /* synthetic */ C06270Wx getLastMessageLiveData() {
        if (this instanceof Conversation) {
            return ((Conversation) this).A02.A3B.A0U;
        }
        return null;
    }

    public C106715a2 getLinkifier() {
        return this.A00.A12;
    }

    public C106685Zz getLinkifyWeb() {
        return this.A00.A0k;
    }

    public AnonymousClass5RC getMessageAudioPlayerFactory() {
        return this.A00.A0R;
    }

    public C113895mA getMessageAudioPlayerProvider() {
        return this.A00.A0S;
    }

    public PopupWindow.OnDismissListener getOnPopupWindowDismissListener() {
        return this.A00.A16;
    }

    public AnonymousClass9U4 getPaymentsManager() {
        return this.A00.A0r;
    }

    public ReactionsTrayViewModel getReactionsTrayViewModel() {
        return this.A00.A0v;
    }

    public C17310vJ getSavedStateRegistryOwner() {
        return this;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        if (this instanceof C93544ok) {
            return ((C93544ok) this).A0I;
        }
        if (this instanceof Conversation) {
            return ((Conversation) this).A02.A3B.A0K;
        }
        return null;
    }

    public HashSet getSeenMessages() {
        return this.A00.A17;
    }

    public AnonymousClass5QO getSelectedMessages() {
        return this.A00.A03();
    }

    public AnonymousClass0R2 getSelectionActionMode() {
        return this.A00.A00;
    }

    public AnonymousClass33O getStickerImageFileLoader() {
        return this.A00.A0x;
    }

    public C53202mi getSupportGatingUtils() {
        return this.A00.A0j;
    }

    public C52472lX getSuspensionManager() {
        return this.A00.A0h;
    }

    public /* synthetic */ EditText getTextEntryField() {
        if (this instanceof Conversation) {
            return ((Conversation) this).A02.A4P;
        }
        return null;
    }

    public C621033m getUserActions() {
        return this.A00.A07;
    }

    public C15940sD getViewModelStoreOwner() {
        return this;
    }

    public AnonymousClass5ZU getWAContactNames() {
        return this.A00.A0F;
    }

    public AnonymousClass5ZR getWaPermissionsHelper() {
        return this.A00.A0V;
    }

    public AnonymousClass4FV getWamRuntime() {
        return this.A00.A0e;
    }

    public void onCreate(Bundle bundle) {
        if (this.A00 == null) {
            C112975kg r0 = new C112975kg();
            ((C88834as) ((AnonymousClass3DZ) AnonymousClass29x.A00(AnonymousClass3DZ.class, this))).ADd(r0);
            this.A00 = r0;
            r0.A0N = this;
            List list = this.A01;
            if (list != null && 0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0g("onCreate");
            }
        }
        super.onCreate(bundle);
        this.A00.A05();
    }

    public Dialog onCreateDialog(int i) {
        return this.A00.A02(i);
    }

    public void onDestroy() {
        this.A00.A06();
        this.A01.clear();
    }

    public /* synthetic */ void setQuotedMessage(C624134x r2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A02.A3B.A0S(r2);
        }
    }

    public void setSelectionActionMode(AnonymousClass0R2 r2) {
        this.A00.A00 = r2;
    }

    public Dialog BdX(int i) {
        return super.onCreateDialog(i);
    }

    public void Bdh(AnonymousClass0R2 r3) {
        super.Bdh(r3);
        C112975kg r0 = this.A00;
        C107405bG.A07(C112975kg.A00(r0), AnonymousClass34K.A00(C112975kg.A00(r0)));
    }

    public void Bdi(AnonymousClass0R2 r2) {
        super.Bdi(r2);
        this.A00.A08();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A0B(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A0C(configuration);
    }

    public void onPause() {
        super.onPause();
        this.A00.A07();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass2z0 A03;
        super.onRestoreInstanceState(bundle);
        C112975kg r2 = this.A00;
        r2.A09();
        if (bundle != null && (A03 = C107395bF.A03(bundle, "")) != null) {
            r2.A0s = r2.A0y.A05(A03);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C624134x r0 = this.A00.A0s;
        if (r0 != null) {
            C107395bF.A07(bundle, r0.A1J);
        }
    }

    public void BdZ() {
        super.onDestroy();
    }
}
