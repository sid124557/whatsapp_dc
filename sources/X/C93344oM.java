package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.whatsapp.conversation.congratulations.CongratulationsImpl;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* renamed from: X.4oM  reason: invalid class name and case insensitive filesystem */
public abstract class C93344oM extends C89694ej implements AnonymousClass677, C1230666y {
    public C112975kg A00;
    public List A01 = AnonymousClass001.A0s();

    public /* synthetic */ void Awx(Drawable drawable, View view) {
        ((C93064np) this).A03.A1c(drawable, view);
    }

    public void BFc() {
        ((C93064np) this).A03.A0d();
    }

    public /* synthetic */ boolean BIA() {
        return AnonymousClass000.A1W(((C93064np) this).A03.A3B.A0G);
    }

    public /* synthetic */ boolean BIT() {
        AnonymousClass5ZT r0 = ((C93064np) this).A03.A5q;
        if (r0 == null || !C86604Kt.A1Y(r0.A1D.A0B)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean BJC(C624134x r2) {
        return ((C93064np) this).A03.A2e(r2);
    }

    public /* synthetic */ boolean BLE() {
        Number A0i = C86654Ky.A0i(((C93064np) this).A03.A2q.A01);
        if (A0i == null || A0i.intValue() != 1) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void BZx(C624134x r2, boolean z) {
        ((C93064np) this).A03.A29(r2, z);
    }

    public /* synthetic */ void Boi(C624134x r2) {
        ((C93064np) this).A03.A3B.A0R(r2);
    }

    public abstract C89644eZ getActivity();

    public abstract C89224c7 getEmojiPopupWindow();

    public abstract /* synthetic */ C378324f getPreferredLabel();

    public abstract /* synthetic */ ArrayList getSearchTerms();

    public abstract /* synthetic */ String getSearchText();

    public abstract /* synthetic */ EditText getTextEntryField();

    public abstract /* synthetic */ void setQuotedMessage(C624134x r1);

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

    public Object B5x(Class cls) {
        if (!(this instanceof C93064np)) {
            return this.A00.B5x(cls);
        }
        C113245l7 r1 = ((C93064np) this).A03;
        if (cls == AnonymousClass657.class) {
            return r1.A72;
        }
        if (cls == CongratulationsImpl.class) {
            return null;
        }
        return r1.A2z.BqK(cls);
    }

    public int BAS(C624134x r2) {
        return this.A00.BAS(r2);
    }

    public boolean BFW() {
        return this.A00.BFW();
    }

    public boolean BIB(C624134x r2) {
        return this.A00.BIB(r2);
    }

    public boolean BIc() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0v;
        if (reactionsTrayViewModel == null || C86604Kt.A05(reactionsTrayViewModel.A0C) != 2) {
            return false;
        }
        return true;
    }

    public void BZO(int i) {
        this.A00.A0A(i);
    }

    public void BdZ() {
        AnonymousClass5QT r0 = this.A01;
        r0.A04.removeCallbacks(r0.A05);
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
        return true;
    }

    public /* synthetic */ boolean Bor() {
        return true;
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

    public C105055Tk getAddContactLogUtil() {
        return this.A00.A10;
    }

    public AnonymousClass645 getAsyncLabelUpdater() {
        C116985rC r1 = this.A00.A03;
        if (!r1.A07()) {
            return null;
        }
        r1.A04();
        throw AnonymousClass001.A0g("getAsyncLabelUpdater");
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
        return 0;
    }

    public AnonymousClass5XQ getConversationContextGif() {
        return this.A00.A0K;
    }

    public AnonymousClass5R7 getConversationRowCustomizers() {
        return this.A00.A0Q;
    }

    public C105165Tv getConversationRowInflater() {
        return this.A00.A0M;
    }

    public C112975kg getConversationRowsDelegate() {
        return this.A00;
    }

    public C66543Lv getCoreMessageStore() {
        return this.A00.A0X;
    }

    public /* synthetic */ Integer getCustomCenterBalloon() {
        return null;
    }

    public AnonymousClass36Y getDeepLinkHelper() {
        return this.A00.A0c;
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
        return null;
    }

    public C106065Xm getKeepInChatManager() {
        return this.A00.A0Z;
    }

    public /* synthetic */ C06270Wx getLastMessageLiveData() {
        return null;
    }

    public C106715a2 getLinkifier() {
        return this.A00.A12;
    }

    public C106685Zz getLinkifyWeb() {
        return this.A00.A0k;
    }

    public C620133d getMediaDownloadManager() {
        return this.A00.A0m;
    }

    public C106195Xz getMentions() {
        return this.A00.A0n;
    }

    public AnonymousClass5RC getMessageAudioPlayerFactory() {
        return this.A00.A0R;
    }

    public C113895mA getMessageAudioPlayerProvider() {
        return this.A00.A0S;
    }

    public C29431io getMessageObservers() {
        return this.A00.A0a;
    }

    public C47052cd getMessageRevokeWamEventLogger() {
        return this.A00.A0p;
    }

    public PopupWindow.OnDismissListener getOnPopupWindowDismissListener() {
        return this.A00.A16;
    }

    public C1907099n getPaymentsGatingManager() {
        return this.A00.A0q;
    }

    public AnonymousClass9U4 getPaymentsManager() {
        return this.A00.A0r;
    }

    public ReactionsTrayViewModel getReactionsTrayViewModel() {
        return this.A00.A0v;
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

    public C56232re getSendMediaMessageManager() {
        return this.A00.A0l;
    }

    public C116985rC getSmbMenus() {
        return this.A00.A04;
    }

    public C55622qe getStarredMessageStore() {
        return this.A00.A0b;
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

    public C65203Gp getSyncManager() {
        return this.A00.A0A;
    }

    public C621033m getUserActions() {
        return this.A00.A07;
    }

    public AnonymousClass5ZU getWAContactNames() {
        return this.A00.A0F;
    }

    public C54292oU getWaContext() {
        return this.A00.A0U;
    }

    public AnonymousClass5ZR getWaPermissionsHelper() {
        return this.A00.A0V;
    }

    public AnonymousClass4FV getWamRuntime() {
        return this.A00.A0e;
    }

    public AnonymousClass30N getWamThreadIdManager() {
        return this.A00.A0f;
    }

    public void setSelectedMessages(AnonymousClass5QO r2) {
        MessageSelectionViewModel messageSelectionViewModel = this.A00.A0O;
        if (messageSelectionViewModel != null) {
            messageSelectionViewModel.A00.A0H(r2);
        }
    }

    public void setSelectionActionMode(AnonymousClass0R2 r2) {
        this.A00.A00 = r2;
    }

    public C93344oM(Context context) {
        super(context);
        this.A00.A0N = this;
    }

    public AnonymousClass1VX getABProps() {
        C89644eZ waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.getAbProps();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A0C(configuration);
    }

    public void setConversationRowsDelegate(C112975kg r1) {
        this.A00 = r1;
    }
}
