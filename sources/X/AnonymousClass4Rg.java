package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.4Rg  reason: invalid class name */
public final class AnonymousClass4Rg extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public RecyclerView A01;
    public C111095hX A02;
    public AnonymousClass5XA A03;
    public C69263Wi A04;
    public C56972sr A05;
    public WaTextView A06;
    public C44272Vj A07;
    public AnonymousClass49S A08;
    public C56942so A09;
    public C1225164r A0A;
    public AnonymousClass4X5 A0B;
    public C1223163x A0C;
    public CommunityMembersViewModel A0D;
    public AnonymousClass5UX A0E;
    public C64773Ex A0F;
    public AnonymousClass5ZU A0G;
    public C105365Uq A0H;
    public C114015mM A0I;
    public C620733j A0J;
    public C56892sj A0K;
    public C620533h A0L;
    public AnonymousClass5Y0 A0M;
    public AnonymousClass1VX A0N;
    public C27991fJ A0O;
    public C105055Tk A0P;
    public C106165Xw A0Q;
    public C116855qy A0R;
    public Runnable A0S;
    public boolean A0T;
    public final AnonymousClass5UY A0U;

    public static final void setupMembersListChangeHandlers$lambda$4(AnonymousClass4Rg r2) {
        C162457s7.A0J(r2, 0);
        r2.getGlobalUI$community_consumerBeta().A0R(r2.A0S);
    }

    public final void setAbprops$community_consumerBeta(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A0N = r2;
    }

    public final void setActivityUtils$community_consumerBeta(C111095hX r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setAddContactLogUtil$community_consumerBeta(C105055Tk r2) {
        C162457s7.A0J(r2, 0);
        this.A0P = r2;
    }

    public final void setAddToContactsUtil$community_consumerBeta(C106165Xw r2) {
        C162457s7.A0J(r2, 0);
        this.A0Q = r2;
    }

    public final void setBaseMemberContextMenuHelper$community_consumerBeta(AnonymousClass5XA r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setCommunityABPropsManager$community_consumerBeta(C44272Vj r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setCommunityAdminPromoteDemoteHelperFactory$community_consumerBeta(AnonymousClass49S r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final void setCommunityChatManager$community_consumerBeta(C56942so r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setCommunityMembersAdapterFactory(C1225164r r2) {
        C162457s7.A0J(r2, 0);
        this.A0A = r2;
    }

    public final void setCommunityMembersViewModelFactory$community_consumerBeta(C1223163x r2) {
        C162457s7.A0J(r2, 0);
        this.A0C = r2;
    }

    public final void setContactAvatars$community_consumerBeta(AnonymousClass5UX r2) {
        C162457s7.A0J(r2, 0);
        this.A0E = r2;
    }

    public final void setContactManager$community_consumerBeta(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A0F = r2;
    }

    public final void setContactPhotos$community_consumerBeta(C114015mM r2) {
        C162457s7.A0J(r2, 0);
        this.A0I = r2;
    }

    public final void setEmojiLoader$community_consumerBeta(AnonymousClass5Y0 r2) {
        C162457s7.A0J(r2, 0);
        this.A0M = r2;
    }

    public final void setGlobalUI$community_consumerBeta(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setGroupParticipantsManager$community_consumerBeta(C56892sj r2) {
        C162457s7.A0J(r2, 0);
        this.A0K = r2;
    }

    public final void setMeManager$community_consumerBeta(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setParticipantUserStore$community_consumerBeta(C620533h r2) {
        C162457s7.A0J(r2, 0);
        this.A0L = r2;
    }

    public final void setWaContactNames$community_consumerBeta(AnonymousClass5ZU r2) {
        C162457s7.A0J(r2, 0);
        this.A0G = r2;
    }

    public final void setWhatsAppLocale$community_consumerBeta(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A0J = r2;
    }

    private final void setupMembersListChangeHandlers(C89644eZ r5) {
        CommunityMembersViewModel communityMembersViewModel = this.A0D;
        if (communityMembersViewModel == null) {
            throw C18270x1.A0S("communityMembersViewModel");
        }
        AnonymousClass6C6.A02(r5, communityMembersViewModel.A01, new C1214960t(this), 146);
        CommunityMembersViewModel communityMembersViewModel2 = this.A0D;
        if (communityMembersViewModel2 == null) {
            throw C18270x1.A0S("communityMembersViewModel");
        }
        AnonymousClass6C6.A02(r5, communityMembersViewModel2.A00, new C1215060u(this), 147);
        CommunityMembersViewModel communityMembersViewModel3 = this.A0D;
        if (communityMembersViewModel3 == null) {
            throw C18270x1.A0S("communityMembersViewModel");
        }
        AnonymousClass6C6.A02(r5, communityMembersViewModel3.A02, new C1215160v(this), 148);
        CommunityMembersViewModel communityMembersViewModel4 = this.A0D;
        if (communityMembersViewModel4 == null) {
            throw C18270x1.A0S("communityMembersViewModel");
        }
        AnonymousClass6C4 r0 = new AnonymousClass6C4(this, 0);
        Set set = communityMembersViewModel4.A01;
        synchronized (set) {
            set.add(r0);
        }
    }

    public final void A00(C27991fJ r3) {
        this.A0O = r3;
        C89644eZ r0 = (C89644eZ) C111095hX.A03(getContext(), C89644eZ.class);
        setupMembersList(r0);
        setupMembersListChangeHandlers(r0);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0R;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0R = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbprops$community_consumerBeta() {
        AnonymousClass1VX r0 = this.A0N;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("abprops");
    }

    public final C111095hX getActivityUtils$community_consumerBeta() {
        C111095hX r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("activityUtils");
    }

    public final C105055Tk getAddContactLogUtil$community_consumerBeta() {
        C105055Tk r0 = this.A0P;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("addContactLogUtil");
    }

    public final C106165Xw getAddToContactsUtil$community_consumerBeta() {
        C106165Xw r0 = this.A0Q;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("addToContactsUtil");
    }

    public final AnonymousClass5XA getBaseMemberContextMenuHelper$community_consumerBeta() {
        AnonymousClass5XA r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("baseMemberContextMenuHelper");
    }

    public final C44272Vj getCommunityABPropsManager$community_consumerBeta() {
        C44272Vj r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityABPropsManager");
    }

    public final AnonymousClass49S getCommunityAdminPromoteDemoteHelperFactory$community_consumerBeta() {
        AnonymousClass49S r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityAdminPromoteDemoteHelperFactory");
    }

    public final C56942so getCommunityChatManager$community_consumerBeta() {
        C56942so r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityChatManager");
    }

    public final C1225164r getCommunityMembersAdapterFactory() {
        C1225164r r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityMembersAdapterFactory");
    }

    public final C1223163x getCommunityMembersViewModelFactory$community_consumerBeta() {
        C1223163x r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityMembersViewModelFactory");
    }

    public final AnonymousClass5UX getContactAvatars$community_consumerBeta() {
        AnonymousClass5UX r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactAvatars");
    }

    public final C64773Ex getContactManager$community_consumerBeta() {
        C64773Ex r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final C114015mM getContactPhotos$community_consumerBeta() {
        C114015mM r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public final AnonymousClass5Y0 getEmojiLoader$community_consumerBeta() {
        AnonymousClass5Y0 r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emojiLoader");
    }

    public final C69263Wi getGlobalUI$community_consumerBeta() {
        C69263Wi r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C56892sj getGroupParticipantsManager$community_consumerBeta() {
        C56892sj r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupParticipantsManager");
    }

    public final C56972sr getMeManager$community_consumerBeta() {
        C56972sr r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final C620533h getParticipantUserStore$community_consumerBeta() {
        C620533h r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("participantUserStore");
    }

    public final AnonymousClass5ZU getWaContactNames$community_consumerBeta() {
        AnonymousClass5ZU r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContactNames");
    }

    public final C620733j getWhatsAppLocale$community_consumerBeta() {
        C620733j r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public AnonymousClass4Rg(Context context) {
        super(context);
        if (!this.A0T) {
            this.A0T = true;
            C88864av r1 = (C88864av) ((C111685iW) generatedComponent());
            C64333Db r2 = r1.A0K;
            this.A0N = C64333Db.A4B(r2);
            this.A04 = C64333Db.A04(r2);
            this.A05 = C64333Db.A06(r2);
            this.A0M = C64333Db.A3o(r2);
            this.A02 = C64333Db.A00(r2);
            this.A0I = C64333Db.A29(r2);
            this.A0E = C86614Ku.A0R(r2);
            this.A0F = C64333Db.A26(r2);
            this.A0G = C64333Db.A28(r2);
            this.A0J = C64333Db.A2t(r2);
            this.A0P = C86614Ku.A0k(r2);
            this.A0Q = C86614Ku.A0l(r2);
            this.A09 = C64333Db.A1k(r2);
            this.A0L = (C620533h) r2.APC.get();
            this.A07 = (C44272Vj) r2.A5U.get();
            this.A0K = C64333Db.A3G(r2);
            this.A03 = (AnonymousClass5XA) r2.A24.get();
            C88834as r12 = r1.A0I;
            this.A0A = (C1225164r) r12.A0W.get();
            this.A0C = (C1223163x) r12.A3T.get();
            this.A08 = (AnonymousClass49S) r12.A0V.get();
        }
        this.A0S = new C172578Lw(17);
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        C162457s7.A0D(inflate);
        this.A00 = inflate;
        this.A06 = C86604Kt.A0O(inflate, R.id.members_title);
        this.A01 = (RecyclerView) C18280x3.A0E(this.A00, R.id.inline_members_recycler_view);
        this.A0U = C18290x4.A0X(this, R.id.inline_members_progress_bar);
    }

    private final void setupMembersList(C89644eZ r3) {
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1X(1);
        this.A01.setLayoutManager(linearLayoutManager);
        C1223163x communityMembersViewModelFactory$community_consumerBeta = getCommunityMembersViewModelFactory$community_consumerBeta();
        C27991fJ r0 = this.A0O;
        if (r0 == null) {
            throw C18270x1.A0S("parentJid");
        }
        this.A0D = AnonymousClass5AV.A00(r3, communityMembersViewModelFactory$community_consumerBeta, r0);
        setupMembersListAdapter(r3);
    }

    private final void setupMembersListAdapter(C89644eZ r14) {
        AnonymousClass49S communityAdminPromoteDemoteHelperFactory$community_consumerBeta = getCommunityAdminPromoteDemoteHelperFactory$community_consumerBeta();
        C27991fJ r1 = this.A0O;
        GroupJid groupJid = null;
        if (r1 == null) {
            throw C18270x1.A0S("parentJid");
        }
        C89644eZ r7 = r14;
        C46632bx Azz = communityAdminPromoteDemoteHelperFactory$community_consumerBeta.Azz(r14, r1, 2);
        this.A0H = getContactPhotos$community_consumerBeta().A06(getContext(), "community-view-members");
        C56942so communityChatManager$community_consumerBeta = getCommunityChatManager$community_consumerBeta();
        C27991fJ r12 = this.A0O;
        if (r12 == null) {
            throw C18270x1.A0S("parentJid");
        }
        C52882mC A002 = communityChatManager$community_consumerBeta.A0H.A00(r12);
        C1225164r communityMembersAdapterFactory = getCommunityMembersAdapterFactory();
        if (A002 != null) {
            groupJid = A002.A02;
        }
        C27991fJ r13 = this.A0O;
        if (r13 == null) {
            throw C18270x1.A0S("parentJid");
        }
        C105365Uq r0 = this.A0H;
        if (r0 == null) {
            throw C18270x1.A0S("contactPhotoLoader");
        }
        C56972sr meManager$community_consumerBeta = getMeManager$community_consumerBeta();
        AnonymousClass5Y0 emojiLoader$community_consumerBeta = getEmojiLoader$community_consumerBeta();
        C64773Ex contactManager$community_consumerBeta = getContactManager$community_consumerBeta();
        AnonymousClass5ZU waContactNames$community_consumerBeta = getWaContactNames$community_consumerBeta();
        CommunityMembersViewModel communityMembersViewModel = this.A0D;
        if (communityMembersViewModel == null) {
            throw C18270x1.A0S("communityMembersViewModel");
        }
        AnonymousClass4X5 B0M = communityMembersAdapterFactory.B0M(new C102895Kr(getBaseMemberContextMenuHelper$community_consumerBeta(), meManager$community_consumerBeta, r7, Azz, communityMembersViewModel, contactManager$community_consumerBeta, waContactNames$community_consumerBeta, emojiLoader$community_consumerBeta), r0, groupJid, r13);
        this.A0B = B0M;
        B0M.A0E(true);
        RecyclerView recyclerView = this.A01;
        AnonymousClass4X5 r02 = this.A0B;
        if (r02 == null) {
            throw C18270x1.A0S("communityMembersAdapter");
        }
        recyclerView.setAdapter(r02);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C105365Uq r0 = this.A0H;
        if (r0 == null) {
            throw C18270x1.A0S("contactPhotoLoader");
        }
        r0.A00();
    }

    public static final void setupMembersListChangeHandlers$lambda$1(AnonymousClass4GQ r0, Object obj) {
        C86634Kw.A1W(r0, obj);
    }

    public static final void setupMembersListChangeHandlers$lambda$2(AnonymousClass4GQ r0, Object obj) {
        C86634Kw.A1W(r0, obj);
    }

    public static final void setupMembersListChangeHandlers$lambda$3(AnonymousClass4GQ r0, Object obj) {
        C86634Kw.A1W(r0, obj);
    }
}
