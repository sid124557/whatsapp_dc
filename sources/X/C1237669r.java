package X;

import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.community.CommunityHomeActivity;
import com.whatsapp.community.CommunityNavigationActivity;
import com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.search.SearchFragment;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.69r  reason: invalid class name and case insensitive filesystem */
public class C1237669r implements AnonymousClass4FI {
    public Object A00;
    public final int A01;

    public C1237669r(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BQA(C95814uZ r4) {
        switch (this.A01) {
            case 4:
                C18260x0.A1R(AnonymousClass001.A0o(), "joinSubgroup/onConversationAdded/", r4);
                if (r4 instanceof C27991fJ) {
                    AnonymousClass4VR r2 = (AnonymousClass4VR) this.A00;
                    int A05 = C86604Kt.A05(r2.A0g);
                    if (A05 == 2 || A05 == 6) {
                        r2.A0D(4);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                AnonymousClass5Y5 r1 = (AnonymousClass5Y5) this.A00;
                if (r4.equals(r1.A03)) {
                    r1.A06.A0S(new C70003Zm(this, 38));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r1 = (com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel) r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQB(X.C95814uZ r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0006;
                case 6: goto L_0x0024;
                case 7: goto L_0x0005;
                case 8: goto L_0x0035;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            if (r4 == 0) goto L_0x0005
            java.lang.Object r1 = r3.A00
            com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel r1 = (com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel) r1
            X.1fJ r0 = r1.A01
            if (r0 == 0) goto L_0x0005
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.08J r0 = r1.A02
            X.AnonymousClass0x7.A18(r0)
            return
        L_0x001c:
            java.lang.Object r0 = r3.A00
            X.4uI r0 = (X.C95704uI) r0
            r0.A7E()
            return
        L_0x0024:
            java.lang.Object r0 = r3.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            X.3Wi r2 = r0.A0i
            r1 = 26
            X.5rT r0 = new X.5rT
            r0.<init>(r3, r1, r4)
            r2.A0S(r0)
            return
        L_0x0035:
            java.lang.Object r0 = r3.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            X.3Wi r2 = r0.A0J
            r1 = 33
            X.3a1 r0 = new X.3a1
            r0.<init>(r3, r1, r4)
            r2.BkS(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1237669r.BQB(X.4uZ):void");
    }

    public /* synthetic */ void BQC(C95814uZ r3, boolean z) {
        if (6 - this.A01 == 0) {
            C117665sI.A00(((ConversationsFragment) this.A00).A0i, this, r3, 19, z);
        }
    }

    public /* synthetic */ void BQD(C95814uZ r2) {
        if (9 - this.A01 == 0) {
            ((C105215Ua) this.A00).A05(r2);
        }
    }

    public /* synthetic */ void BQE(C95814uZ r4) {
        switch (this.A01) {
            case 1:
                CommunityHomeActivity communityHomeActivity = (CommunityHomeActivity) this.A00;
                if (r4.equals(communityHomeActivity.A0p)) {
                    communityHomeActivity.A76(communityHomeActivity.getString(R.string.f11nameremoved));
                    return;
                }
                return;
            case 2:
                CommunityNavigationActivity communityNavigationActivity = (CommunityNavigationActivity) this.A00;
                if (r4.equals(communityNavigationActivity.A0b)) {
                    communityNavigationActivity.A75(communityNavigationActivity.getString(R.string.f11nameremoved));
                    return;
                }
                return;
            case 3:
                C162457s7.A0J(r4, 0);
                CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet = (CommunityNewSubgroupSwitcherBottomSheet) this.A00;
                if (r4.equals(communityNewSubgroupSwitcherBottomSheet.A0O.getValue())) {
                    String string = C08310eF.A09(communityNewSubgroupSwitcherBottomSheet).getString(R.string.f11nameremoved);
                    C162457s7.A0D(string);
                    communityNewSubgroupSwitcherBottomSheet.A1b(string);
                    return;
                }
                return;
            case 4:
                if (r4 instanceof C27991fJ) {
                    AnonymousClass4VR r2 = (AnonymousClass4VR) this.A00;
                    if (C86604Kt.A05(r2.A0g) == 4) {
                        r2.A0D(2);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((SearchFragment) this.A00).A1c.A0P();
                return;
            case 9:
                ((C105215Ua) this.A00).A05(r4);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BQH(int i) {
        if (6 - this.A01 == 0) {
            ((ConversationsFragment) this.A00).A0i.BkS(new C117705sM((Object) this, i, 25));
        }
    }

    public void BQI() {
        C69263Wi r2;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                homeActivity.A7E();
                if (homeActivity.A0D.A0X(1266) && ((AnonymousClass314) homeActivity.A1d.get()).A02() == 0) {
                    r2 = homeActivity.A05;
                    runnable = new C117645sG(homeActivity, 40);
                    break;
                } else {
                    return;
                }
                break;
            case 6:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                if (conversationsFragment.A0j.A0Y()) {
                    long j = conversationsFragment.A1f.A01().getLong("critical_bootstrap_completed_timestamp", -1);
                    if (j != -1) {
                        long A05 = AnonymousClass0x9.A05(j);
                        if (A05 >= 0 && A05 <= 120000 && conversationsFragment.A3U.getAndSet(true)) {
                            AtomicBoolean atomicBoolean = conversationsFragment.A3V;
                            if (!atomicBoolean.get()) {
                                atomicBoolean.set(conversationsFragment.A3G.postDelayed(C117625sE.A00(this, 38), 1500));
                                return;
                            }
                            return;
                        }
                    }
                }
                r2 = conversationsFragment.A0i;
                runnable = C117625sE.A00(conversationsFragment, 37);
                break;
            case 8:
                ((SearchFragment) this.A00).A0J.BkS(new C71283br((Object) this, 25));
                return;
            default:
                return;
        }
        r2.A0S(runnable);
    }
}
