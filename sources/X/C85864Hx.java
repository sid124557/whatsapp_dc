package X;

import com.whatsapp.community.communityInfo.CAGInfoViewModel;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.group.HistorySettingViewModel;
import com.whatsapp.group.HistorySettingViewModel$updateChecked$1;

/* renamed from: X.4Hx  reason: invalid class name and case insensitive filesystem */
public class C85864Hx implements AnonymousClass4AQ {
    public Object A00;
    public final int A01;

    public C85864Hx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BLi(C95814uZ r6) {
        AnonymousClass4FS r4;
        Runnable runnable;
        AnonymousClass20R r2;
        switch (this.A01) {
            case 0:
                if (r6 != null) {
                    ((AnonymousClass11H) this.A00).A12.execute(new C71653cS(this, 47, r6));
                    return;
                }
                return;
            case 1:
                CAGInfoViewModel cAGInfoViewModel = (CAGInfoViewModel) this.A00;
                C162457s7.A0J(cAGInfoViewModel, 0);
                C27991fJ r0 = cAGInfoViewModel.A04;
                if (r0 == null) {
                    throw C18270x1.A0S("cagJid");
                } else if (C162457s7.A0P(r6, r0)) {
                    AnonymousClass10x r02 = cAGInfoViewModel.A01;
                    if (r02 == null) {
                        throw C18270x1.A0S("groupParticipantsViewModel");
                    }
                    r02.A0D();
                    cAGInfoViewModel.A0D();
                    return;
                } else {
                    return;
                }
            case 2:
                CommunitySettingsViewModel communitySettingsViewModel = (CommunitySettingsViewModel) this.A00;
                C27991fJ r22 = communitySettingsViewModel.A03;
                if (r22 != null && C162457s7.A0P(r6, r22)) {
                    AnonymousClass107 r42 = communitySettingsViewModel.A0F;
                    if (((C51362jh) r42.A07()).A01 != AnonymousClass21C.REQUESTING) {
                        AnonymousClass3ZH A07 = communitySettingsViewModel.A0A.A07(r22);
                        if (A07 == null || !A07.A0d) {
                            r2 = AnonymousClass20R.ADMINS;
                        } else {
                            r2 = AnonymousClass20R.EVERYONE;
                        }
                        r42.A0G(new C51362jh(r2, AnonymousClass21C.IDLE));
                    }
                }
                C27991fJ r1 = communitySettingsViewModel.A02;
                if (r1 != null && C162457s7.A0P(r6, r1)) {
                    r4 = communitySettingsViewModel.A0H;
                    runnable = new C70193a6(communitySettingsViewModel, 10, r1);
                    break;
                } else {
                    return;
                }
                break;
            case 3:
                C19200yy r12 = (C19200yy) this.A00;
                if (r6 != null && r6.equals(r12.A08)) {
                    r12.A00();
                    return;
                }
                return;
            case 4:
                AnonymousClass11N r13 = (AnonymousClass11N) this.A00;
                if (r6.equals(r13.A03)) {
                    r4 = r13.A0i;
                    runnable = new C69993Zl(r13, 44);
                    break;
                } else {
                    return;
                }
            default:
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A00;
                if (r6 != null && r6.equals(historySettingViewModel.A01)) {
                    C616131n.A02((C85494Gl) null, new HistorySettingViewModel$updateChecked$1(historySettingViewModel, (C84814Du) null), AnonymousClass0IV.A00(historySettingViewModel), (AnonymousClass20D) null, 3);
                    return;
                }
                return;
        }
        r4.BkM(runnable);
    }
}
