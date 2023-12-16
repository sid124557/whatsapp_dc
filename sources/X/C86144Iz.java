package X;

import android.os.Bundle;
import com.whatsapp.community.CommunitySettingsActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.framework.alerts.ui.AlertCardListFragment;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;

/* renamed from: X.4Iz  reason: invalid class name and case insensitive filesystem */
public class C86144Iz implements C17190ui {
    public Object A00;
    public final int A01;

    public C86144Iz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C05550Ty Azr(Class cls) {
        AnonymousClass11N r0;
        Class cls2 = cls;
        switch (this.A01) {
            case 0:
                C162457s7.A0J(cls2, 0);
                if (cls2.isAssignableFrom(AnonymousClass11N.class)) {
                    CommunitySettingsActivity communitySettingsActivity = (CommunitySettingsActivity) this.A00;
                    C27991fJ r02 = communitySettingsActivity.A0D;
                    C27991fJ r16 = r02;
                    if (r02 != null) {
                        C56612sH r18 = communitySettingsActivity.A06;
                        AnonymousClass1VX r23 = communitySettingsActivity.A0D;
                        C69263Wi r36 = communitySettingsActivity.A05;
                        C56972sr r35 = communitySettingsActivity.A01;
                        AnonymousClass4FS r17 = communitySettingsActivity.A04;
                        C56982ss r14 = communitySettingsActivity.A05;
                        if (r14 != null) {
                            AnonymousClass4FV r13 = communitySettingsActivity.A09;
                            if (r13 != null) {
                                AnonymousClass31C r12 = communitySettingsActivity.A0E;
                                if (r12 != null) {
                                    RtaXmppClient rtaXmppClient = communitySettingsActivity.A0G;
                                    if (rtaXmppClient != null) {
                                        C64773Ex r10 = communitySettingsActivity.A03;
                                        if (r10 != null) {
                                            AnonymousClass5ZU r8 = communitySettingsActivity.A04;
                                            if (r8 != null) {
                                                C56072rN r7 = communitySettingsActivity.A0I;
                                                if (r7 != null) {
                                                    C66493Lq r6 = communitySettingsActivity.A0A;
                                                    if (r6 != null) {
                                                        C66503Lr r5 = communitySettingsActivity.A0C;
                                                        if (r5 != null) {
                                                            C48252eb r4 = communitySettingsActivity.A0F;
                                                            if (r4 != null) {
                                                                C28891hw r3 = communitySettingsActivity.A06;
                                                                if (r3 != null) {
                                                                    C50932j0 r2 = communitySettingsActivity.A0B;
                                                                    if (r2 != null) {
                                                                        C56892sj r1 = communitySettingsActivity.A08;
                                                                        if (r1 != null) {
                                                                            C29441ip r34 = communitySettingsActivity.A07;
                                                                            C54442oj r15 = communitySettingsActivity.A07;
                                                                            if (r15 != null) {
                                                                                AnonymousClass2CL r9 = communitySettingsActivity.A00;
                                                                                if (r9 != null) {
                                                                                    AnonymousClass4FS r33 = r17;
                                                                                    AnonymousClass4FV r24 = r13;
                                                                                    AnonymousClass2CL r122 = r9;
                                                                                    C69263Wi r132 = r36;
                                                                                    C56972sr r142 = r35;
                                                                                    C29441ip r152 = r34;
                                                                                    C64773Ex r162 = r10;
                                                                                    r0 = new AnonymousClass11N(r122, r132, r142, r152, r162, r8, r18, r14, r3, r15, r1, r23, r24, r6, r2, r5, r16, r12, r4, rtaXmppClient, r7, r33);
                                                                                } else {
                                                                                    throw C18270x1.A0S("groupMembershipApprovalModeApiHandlerFactory");
                                                                                }
                                                                            } else {
                                                                                throw C18270x1.A0S("groupMembershipApprovalRequestStore");
                                                                            }
                                                                        } else {
                                                                            throw C18270x1.A0S("groupParticipantsManager");
                                                                        }
                                                                    } else {
                                                                        throw C18270x1.A0S("groupDataChangeListeners");
                                                                    }
                                                                } else {
                                                                    throw C18270x1.A0S("conversationObservers");
                                                                }
                                                            } else {
                                                                throw C18270x1.A0S("rtaExperimentUtils");
                                                            }
                                                        } else {
                                                            throw C18270x1.A0S("groupXmppMethods");
                                                        }
                                                    } else {
                                                        throw C18270x1.A0S("groupChatManager");
                                                    }
                                                } else {
                                                    throw C18270x1.A0S("groupChatUtils");
                                                }
                                            } else {
                                                throw C18270x1.A0S("wAContactNames");
                                            }
                                        } else {
                                            throw C18270x1.A0S("contactManager");
                                        }
                                    } else {
                                        throw C18270x1.A0S("rtaXmppClient");
                                    }
                                } else {
                                    throw C18270x1.A0S("messageClient");
                                }
                            } else {
                                throw C18270x1.A0S("wamRuntime");
                            }
                        } else {
                            throw C18270x1.A0S("chatsCache");
                        }
                    } else {
                        r0 = null;
                    }
                    C162457s7.A0K(r0, "null cannot be cast to non-null type T of com.whatsapp.community.CommunitySettingsActivity.<no name provided>.invoke.<no name provided>.create");
                    return r0;
                }
                throw AnonymousClass001.A0c("Invalid viewModel");
            case 1:
                C64333Db r19 = ((C39592Co) this.A00).A00.A04;
                AnonymousClass1VX A4B = C64333Db.A4B(r19);
                C69263Wi A04 = C64333Db.A04(r19);
                C56972sr A06 = C64333Db.A06(r19);
                AnonymousClass4FS A8y = C64333Db.A8y(r19);
                C56982ss A39 = C64333Db.A39(r19);
                r19.AbU.get();
                C29431io A3K = C64333Db.A3K(r19);
                C56942so A1k = C64333Db.A1k(r19);
                C28891hw A3C = C64333Db.A3C(r19);
                C56152rV r153 = (C56152rV) r19.AIn.get();
                C29241iV r182 = (C29241iV) r19.AGn.get();
                C29331ie r192 = (C29331ie) r19.AP8.get();
                C56062rM r20 = (C56062rM) r19.AXL.get();
                C28951i2 r123 = (C28951i2) r19.A4x.get();
                AnonymousClass11B r72 = new AnonymousClass11B(A04, A06, A1k, (C29421in) r19.A6P.get(), r123, A39, A3C, r153, A3K, A4B, r182, r192, r20, (C52472lX) r19.AXh.get(), A8y);
                r72.A0N.execute(C71313bu.A00(r72, 1));
                return r72;
            case 2:
                MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity = (MemberSuggestedGroupsManagementActivity) this.A00;
                AnonymousClass2CM r110 = memberSuggestedGroupsManagementActivity.A02;
                if (r110 != null) {
                    AnonymousClass46Q r172 = AnonymousClass2C4.A01;
                    C615931l.A00(r172);
                    C64333Db r62 = r110.A00.A03;
                    AnonymousClass1VX A4B2 = C64333Db.A4B(r62);
                    C56942so A1k2 = C64333Db.A1k(r62);
                    C64773Ex A26 = C64333Db.A26(r62);
                    C29441ip A24 = C64333Db.A24(r62);
                    C56982ss A392 = C64333Db.A39(r62);
                    return new MemberSuggestedGroupsManagementViewModel(C64333Db.A06(r62), A1k2, (MemberSuggestedGroupsManager) r62.AKB.get(), A24, A26, A392, (C56152rV) r62.AIn.get(), A4B2, (C29241iV) r62.AGn.get(), (C29331ie) r62.AP8.get(), (C27991fJ) memberSuggestedGroupsManagementActivity.A0E.getValue(), r172);
                }
                throw C18270x1.A0S("memberSuggestedGroupsManagementViewModelFactory");
            case 3:
                AlertCardListFragment alertCardListFragment = (AlertCardListFragment) this.A00;
                if (alertCardListFragment.A01 != null) {
                    AnonymousClass30K r111 = alertCardListFragment.A02;
                    if (r111 != null) {
                        return new AnonymousClass10A(r111);
                    }
                    throw C18270x1.A0S("alertStorage");
                }
                throw C18270x1.A0S("alertListViewModelFactory");
            default:
                C162457s7.A0J(cls2, 0);
                if (cls2.isAssignableFrom(AnonymousClass11M.class)) {
                    Bundle bundle = (Bundle) this.A00;
                    C162457s7.A0C(bundle);
                    return new AnonymousClass11M(bundle);
                }
                throw AnonymousClass001.A0c("Invalid viewModel");
        }
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return AnonymousClass0IW.A00(this, cls);
    }
}
