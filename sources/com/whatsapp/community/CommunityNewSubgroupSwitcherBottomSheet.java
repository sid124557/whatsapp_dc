package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass0AQ;
import X.AnonymousClass0UY;
import X.AnonymousClass0x2;
import X.AnonymousClass11H;
import X.AnonymousClass30V;
import X.AnonymousClass4AQ;
import X.AnonymousClass4FI;
import X.AnonymousClass4XG;
import X.AnonymousClass58H;
import X.AnonymousClass5ZU;
import X.AnonymousClass64B;
import X.AnonymousClass66R;
import X.AnonymousClass697;
import X.AnonymousClass6C6;
import X.AnonymousClass7XG;
import X.C003203q;
import X.C005205m;
import X.C08310eF;
import X.C1001359q;
import X.C103145Ls;
import X.C105365Uq;
import X.C105965Xc;
import X.C106905aM;
import X.C110065fd;
import X.C113245l7;
import X.C113445lR;
import X.C114015mM;
import X.C1213660g;
import X.C1213760h;
import X.C1223263y;
import X.C1237669r;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C27991fJ;
import X.C28891hw;
import X.C29241iV;
import X.C29291ia;
import X.C29301ib;
import X.C29331ie;
import X.C29421in;
import X.C39542Cj;
import X.C44092Uq;
import X.C50932j0;
import X.C56542sA;
import X.C56892sj;
import X.C56942so;
import X.C56982ss;
import X.C64653Ej;
import X.C64773Ex;
import X.C80203xr;
import X.C86614Ku;
import X.C88694ab;
import X.C95814uZ;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.Conversation;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Collections;
import java.util.List;

public final class CommunityNewSubgroupSwitcherBottomSheet extends Hilt_CommunityNewSubgroupSwitcherBottomSheet implements AnonymousClass64B {
    public C44092Uq A00;
    public C103145Ls A01;
    public C39542Cj A02;
    public C29291ia A03;
    public C29301ib A04;
    public C56942so A05;
    public C64653Ej A06;
    public AnonymousClass4XG A07;
    public C64773Ex A08;
    public C29421in A09;
    public AnonymousClass5ZU A0A;
    public C105365Uq A0B;
    public C114015mM A0C;
    public AnonymousClass7XG A0D;
    public C56542sA A0E;
    public C56982ss A0F;
    public C28891hw A0G;
    public C56892sj A0H;
    public C50932j0 A0I;
    public C29241iV A0J;
    public C29331ie A0K;
    public AnonymousClass30V A0L;
    public final AnonymousClass4FI A0M = new C1237669r(this, 3);
    public final AnonymousClass4AQ A0N = new AnonymousClass697(this, 3);
    public final AnonymousClass66R A0O = C154517dI.A00(AnonymousClass58H.NONE, new C80203xr(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        C162457s7.A0J(view2, 0);
        super.A0w(bundle, view2);
        C114015mM r4 = this.A0C;
        if (r4 != null) {
            this.A0B = r4.A06(A0G(), "community-new-subgroup-switcher");
            C28891hw r1 = this.A0G;
            if (r1 != null) {
                r1.A06(this.A0M);
                C50932j0 r12 = this.A0I;
                if (r12 != null) {
                    r12.A00(this.A0N);
                    TextEmojiLabel A0M2 = C86614Ku.A0M(view2, R.id.community_name);
                    C106905aM.A04(A0M2);
                    AnonymousClass0x2.A0z(C18280x3.A0E(view2, R.id.subgroup_switcher_close_button), this, 29);
                    RecyclerView recyclerView = (RecyclerView) C18280x3.A0E(view2, R.id.subgroup_switcher_recycler_view);
                    A0G();
                    C18320x8.A19(recyclerView, 1);
                    recyclerView.setItemAnimator((AnonymousClass0UY) null);
                    C103145Ls r13 = this.A01;
                    if (r13 != null) {
                        C113445lR A002 = r13.A00(A0G(), (Runnable) null, (Runnable) null);
                        C44092Uq r6 = this.A00;
                        if (r6 != null) {
                            C105365Uq r42 = this.A0B;
                            if (r42 == null) {
                                throw C18270x1.A0S("contactPhotoLoader");
                            }
                            C56542sA r0 = this.A0E;
                            if (r0 != null) {
                                AnonymousClass4XG A003 = r6.A00(r42, A002, r0, 5);
                                this.A07 = A003;
                                recyclerView.setAdapter(A003);
                                AnonymousClass4XG r9 = this.A07;
                                if (r9 == null) {
                                    throw C18270x1.A0S("subgroupAdapter");
                                }
                                C29421in r10 = this.A09;
                                if (r10 != null) {
                                    C29301ib r8 = this.A04;
                                    if (r8 != null) {
                                        C28891hw r11 = this.A0G;
                                        if (r11 != null) {
                                            C29291ia r7 = this.A03;
                                            if (r7 != null) {
                                                C29241iV r122 = this.A0J;
                                                if (r122 != null) {
                                                    AnonymousClass7XG r62 = new AnonymousClass7XG(r7, r8, r9, r10, r11, r122);
                                                    this.A0D = r62;
                                                    r62.A00();
                                                    A1a(view2);
                                                    C105965Xc r123 = new C105965Xc(false, false, true, false, false, false);
                                                    C39542Cj r14 = this.A02;
                                                    if (r14 != null) {
                                                        AnonymousClass11H A004 = AnonymousClass11H.A00(this, r14, r123, (C27991fJ) this.A0O.getValue());
                                                        C162457s7.A0D(A004);
                                                        AnonymousClass6C6.A02(this, A004.A0D, new C1213660g(A0M2), 113);
                                                        AnonymousClass6C6.A02(this, A004.A11, new C1213760h(this), 114);
                                                        AnonymousClass6C6.A02(this, A004.A14, C1001359q.A00(this, 17), 115);
                                                        return;
                                                    }
                                                    throw C18270x1.A0S("communitySubgroupsViewModelFactory");
                                                }
                                                throw C18270x1.A0S("groupParticipantsObservers");
                                            }
                                            throw C18270x1.A0S("businessProfileObservers");
                                        }
                                        throw C18270x1.A0S("conversationObservers");
                                    }
                                    throw C18270x1.A0S("chatStateObservers");
                                }
                                throw C18270x1.A0S("contactObservers");
                            }
                            throw C18270x1.A0S("chatManager");
                        }
                        throw C18270x1.A0S("subgroupAdapterFactory");
                    }
                    throw C18270x1.A0S("conversationsListInterfaceImplFactory");
                }
                throw C18270x1.A0S("groupDataChangedListeners");
            }
            throw C18270x1.A0S("conversationObservers");
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public void A0g() {
        super.A0g();
        AnonymousClass30V r2 = this.A0L;
        if (r2 != null) {
            r2.A02((C95814uZ) null, 10);
            return;
        }
        throw C18270x1.A0S("navigationTimeSpentManager");
    }

    public void A0h() {
        super.A0h();
        C105365Uq r0 = this.A0B;
        if (r0 == null) {
            throw C18270x1.A0S("contactPhotoLoader");
        }
        r0.A00();
        C28891hw r1 = this.A0G;
        if (r1 != null) {
            r1.A07(this.A0M);
            C50932j0 r12 = this.A0I;
            if (r12 != null) {
                r12.A01(this.A0N);
                AnonymousClass7XG r02 = this.A0D;
                if (r02 == null) {
                    throw C18270x1.A0S("conversationListUpdateObservers");
                }
                r02.A01();
                return;
            }
            throw C18270x1.A0S("groupDataChangedListeners");
        }
        throw C18270x1.A0S("conversationObservers");
    }

    public final void A1a(View view) {
        WDSButton A0p = C86614Ku.A0p(view, R.id.add_group_button);
        A0p.setIcon((Drawable) AnonymousClass0AQ.A03(A0R().getTheme(), C08310eF.A09(this), R.drawable.vec_plus_group));
        C56942so r1 = this.A05;
        if (r1 != null) {
            A0p.setVisibility(AnonymousClass001.A08(r1.A0F((C27991fJ) this.A0O.getValue()) ? 1 : 0));
            AnonymousClass0x2.A0z(A0p, this, 28);
            return;
        }
        throw C18270x1.A0S("communityChatManager");
    }

    public final void A1b(String str) {
        A1K();
        C003203q A0Q = A0Q();
        if (A0Q instanceof C1223263y) {
            C162457s7.A0K(A0Q, "null cannot be cast to non-null type com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet.Host");
            C113245l7 r2 = ((Conversation) ((C1223263y) A0Q)).A02;
            View A002 = C005205m.A00(C113245l7.A09(r2), 16908290);
            List emptyList = Collections.emptyList();
            new C110065fd(C113245l7.A09(r2), C88694ab.A02(A002, str, 0), r2.A3G, emptyList, false).A01();
        }
    }
}
