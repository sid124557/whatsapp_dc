package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity;
import com.whatsapp.conversationslist.LockedConversationsActivity;
import com.whatsapp.status.audienceselector.StatusPrivacyActivity;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.List;
import java.util.Map;

/* renamed from: X.5bZ  reason: invalid class name and case insensitive filesystem */
public class C107595bZ implements C15530rW {
    public Object A00;
    public final int A01;

    public C107595bZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BM2(Object obj) {
        int i;
        String str;
        C186568vZ r1;
        String str2;
        Intent intent;
        switch (this.A01) {
            case 0:
                BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = (BusinessDirectoryMapViewActivity) this.A00;
                Map map = (Map) obj;
                C162457s7.A0J(map, 1);
                Boolean bool = (Boolean) map.get("android.permission.ACCESS_FINE_LOCATION");
                if (bool != null && bool.booleanValue()) {
                    businessDirectoryMapViewActivity.A0V = true;
                    AnonymousClass4U2 r2 = businessDirectoryMapViewActivity.A0N;
                    if (r2 == null) {
                        throw C86604Kt.A0j();
                    }
                    r2.A0V.A01(5);
                    C06270Wx.A03(r2.A0P, 1);
                    C06270Wx.A03(r2.A0i, 0);
                    return;
                }
                return;
            case 1:
                BusinessDirectorySearchFragment businessDirectorySearchFragment = (BusinessDirectorySearchFragment) this.A00;
                C06800Zg r12 = (C06800Zg) obj;
                Intent intent2 = r12.A01;
                if (r12.A00 == -1 && intent2 != null) {
                    Bundle bundleExtra = intent2.getBundleExtra("arg_search_filters");
                    boolean A1N = AnonymousClass0x9.A1N(intent2, "arg_location_access_changed");
                    AnonymousClass4U5 r22 = businessDirectorySearchFragment.A0D;
                    if (!(r22 == null || bundleExtra == null)) {
                        boolean z = !A1N;
                        r22.A0N.A08(bundleExtra);
                        if (z) {
                            r22.A0M();
                        }
                    }
                    if (businessDirectorySearchFragment.A0D != null && A1N) {
                        if (!businessDirectorySearchFragment.A0H.A06()) {
                            businessDirectorySearchFragment.A06.A00();
                        }
                        businessDirectorySearchFragment.B3A();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C112335jZ r4 = (C112335jZ) this.A00;
                if (((C06800Zg) obj).A00 == -1) {
                    if (!r4.A09.A0X(6328)) {
                        C18270x1.A0l(AnonymousClass5NA.A00(r4.A07.A04), "location_access_granted", true);
                    }
                    r4.A06.BVl();
                    r1 = r4.A0A;
                    str2 = "system_location_permission_accepted";
                } else {
                    r1 = r4.A0A;
                    str2 = "system_location_permission_denied";
                }
                r1.markerPoint(207368785, str2);
                return;
            case 3:
                ScreenShareViewModel.A05((C06800Zg) obj, (ScreenShareViewModel) this.A00);
                return;
            case 4:
                RegisterAsCompanionEnterNumberActivity registerAsCompanionEnterNumberActivity = (RegisterAsCompanionEnterNumberActivity) this.A00;
                C06800Zg r122 = (C06800Zg) obj;
                C162457s7.A0J(r122, 1);
                if (r122.A00 == -1 && (intent = r122.A01) != null) {
                    String stringExtra = intent.getStringExtra("cc");
                    String stringExtra2 = intent.getStringExtra("iso");
                    String stringExtra3 = intent.getStringExtra("country_name");
                    C102735Kb r0 = registerAsCompanionEnterNumberActivity.A03;
                    if (r0 == null) {
                        throw C18270x1.A0S("phoneNumberEntryViewHolder");
                    }
                    r0.A02.setText(stringExtra);
                    C102735Kb r02 = registerAsCompanionEnterNumberActivity.A03;
                    if (r02 == null) {
                        throw C18270x1.A0S("phoneNumberEntryViewHolder");
                    }
                    r02.A04.setText(stringExtra3);
                    if (stringExtra2 != null) {
                        C102735Kb r03 = registerAsCompanionEnterNumberActivity.A03;
                        if (r03 == null) {
                            throw C18270x1.A0S("phoneNumberEntryViewHolder");
                        }
                        r03.A05.A03(stringExtra2);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                LockedConversationsActivity lockedConversationsActivity = (LockedConversationsActivity) this.A00;
                C06800Zg r123 = (C06800Zg) obj;
                Integer num = lockedConversationsActivity.A06;
                boolean z2 = false;
                if (r123 == null || !((i = r123.A00) == -1 || i == 2)) {
                    lockedConversationsActivity.A76();
                } else {
                    C106995aW A74 = lockedConversationsActivity.A74();
                    if (i == -1) {
                        z2 = true;
                    }
                    A74.A01 = z2;
                    C106405Yw r8 = C95814uZ.A00;
                    C95814uZ A05 = r8.A05(lockedConversationsActivity.getIntent().getStringExtra("jid"));
                    Intent intent3 = lockedConversationsActivity.A00;
                    if (intent3 != null) {
                        str = intent3.getStringExtra("jid");
                    } else {
                        str = null;
                    }
                    C95814uZ A052 = r8.A05(str);
                    if (lockedConversationsActivity.A00 != null && A052 != null) {
                        lockedConversationsActivity.A00 = null;
                        A05 = A052;
                    } else if (A05 == null) {
                        lockedConversationsActivity.A75();
                        if (num != null) {
                            AnonymousClass5UK r13 = lockedConversationsActivity.A04;
                            if (r13 != null) {
                                r13.A01(num.intValue(), 1);
                            } else {
                                throw C18270x1.A0S("chatLockLogger");
                            }
                        }
                    }
                    if (i == -1) {
                        lockedConversationsActivity.A75();
                    }
                    AnonymousClass5UK r14 = lockedConversationsActivity.A04;
                    if (r14 != null) {
                        r14.A01(1, 0);
                        Intent A1O = C86664Kz.A1B().A1O(lockedConversationsActivity, A05, 2);
                        C162457s7.A0D(A1O);
                        A1O.putExtra("fromNotification", true);
                        lockedConversationsActivity.startActivity(A1O);
                        if (i == 2) {
                            lockedConversationsActivity.finish();
                        }
                    } else {
                        throw C18270x1.A0S("chatLockLogger");
                    }
                }
                lockedConversationsActivity.A06 = null;
                lockedConversationsActivity.A74().A00 = false;
                return;
            case 6:
                StatusPrivacyActivity statusPrivacyActivity = (StatusPrivacyActivity) this.A00;
                C06800Zg r124 = (C06800Zg) obj;
                C162457s7.A0J(r124, 1);
                if (r124.A00 == -1) {
                    AnonymousClass5YA.A00(statusPrivacyActivity.A75()).A01((C109665ez) null, "status_privacy_activity", R.string.f11nameremoved, 0, true);
                    AnonymousClass5YA A75 = statusPrivacyActivity.A75();
                    View view = statusPrivacyActivity.A00;
                    C162457s7.A0D(view);
                    AnonymousClass66O r82 = statusPrivacyActivity.A0H;
                    if (r82 == null) {
                        throw C18270x1.A0S("crosspostAccountLinkingResultListener");
                    }
                    AnonymousClass0O1 r5 = statusPrivacyActivity.A03;
                    if (r5 == null) {
                        throw C18270x1.A0S("crosspostAccountUnlinkingActivityResultLauncher");
                    }
                    A75.A06(view, r5, statusPrivacyActivity, (C108895dj) null, r82);
                    return;
                }
                return;
            case 7:
                StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = (StatusPrivacyBottomSheetDialogFragment) this.A00;
                C06800Zg r125 = (C06800Zg) obj;
                C162457s7.A0J(r125, 1);
                if (r125.A00 == -1) {
                    Intent intent4 = r125.A01;
                    C626936e.A06(intent4);
                    AnonymousClass5TZ r15 = statusPrivacyBottomSheetDialogFragment.A06;
                    if (r15 != null) {
                        Bundle extras = intent4.getExtras();
                        if (extras != null) {
                            C108845de A002 = r15.A00(extras);
                            C626936e.A06(A002);
                            C162457s7.A0H(A002);
                            if (!statusPrivacyBottomSheetDialogFragment.A0H) {
                                C108845de r04 = statusPrivacyBottomSheetDialogFragment.A03;
                                if (r04 == null) {
                                    throw C18270x1.A0S("statusDistributionInfo");
                                } else if (!C162457s7.A0P(A002, r04)) {
                                    statusPrivacyBottomSheetDialogFragment.A0H = true;
                                }
                            }
                            statusPrivacyBottomSheetDialogFragment.A03 = A002;
                            C104045Pk r23 = statusPrivacyBottomSheetDialogFragment.A09;
                            if (r23 == null) {
                                throw C18270x1.A0S("statusPrivacyBottomSheetController");
                            } else if (A002 == null) {
                                throw C18270x1.A0S("statusDistributionInfo");
                            } else {
                                int size = A002.A01.size();
                                C108845de r05 = statusPrivacyBottomSheetDialogFragment.A03;
                                if (r05 == null) {
                                    throw C18270x1.A0S("statusDistributionInfo");
                                }
                                r23.A01(size, r05.A02.size());
                            }
                        } else {
                            throw C18300x5.A0X();
                        }
                    } else {
                        throw C18270x1.A0S("statusAudienceRepository");
                    }
                }
                C104045Pk r16 = statusPrivacyBottomSheetDialogFragment.A09;
                if (r16 == null) {
                    throw C18270x1.A0S("statusPrivacyBottomSheetController");
                }
                C108845de r06 = statusPrivacyBottomSheetDialogFragment.A03;
                if (r06 == null) {
                    throw C18270x1.A0S("statusDistributionInfo");
                }
                r16.A00(r06.A00);
                return;
            case 8:
                StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment2 = (StatusPrivacyBottomSheetDialogFragment) this.A00;
                C183538qC r07 = statusPrivacyBottomSheetDialogFragment2.A0E;
                if (r07 != null) {
                    r07.get();
                    C620233e r08 = statusPrivacyBottomSheetDialogFragment2.A04;
                    if (r08 != null) {
                        int A02 = r08.A02();
                        C620233e r09 = statusPrivacyBottomSheetDialogFragment2.A04;
                        if (r09 != null) {
                            List A07 = r09.A07();
                            C620233e r010 = statusPrivacyBottomSheetDialogFragment2.A04;
                            if (r010 != null) {
                                C108845de r52 = new C108845de(A07, r010.A08(), A02, false, false);
                                statusPrivacyBottomSheetDialogFragment2.A03 = r52;
                                C104045Pk r24 = statusPrivacyBottomSheetDialogFragment2.A09;
                                if (r24 == null) {
                                    throw C18270x1.A0S("statusPrivacyBottomSheetController");
                                }
                                r24.A00(r52.A00);
                                C104045Pk r25 = statusPrivacyBottomSheetDialogFragment2.A09;
                                if (r25 == null) {
                                    throw C18270x1.A0S("statusPrivacyBottomSheetController");
                                }
                                C108845de r011 = statusPrivacyBottomSheetDialogFragment2.A03;
                                if (r011 == null) {
                                    throw C18270x1.A0S("statusDistributionInfo");
                                }
                                int size2 = r011.A01.size();
                                C108845de r012 = statusPrivacyBottomSheetDialogFragment2.A03;
                                if (r012 == null) {
                                    throw C18270x1.A0S("statusDistributionInfo");
                                }
                                r25.A01(size2, r012.A02.size());
                                return;
                            }
                            throw C18270x1.A0S("statusStore");
                        }
                        throw C18270x1.A0S("statusStore");
                    }
                    throw C18270x1.A0S("statusStore");
                }
                throw C18270x1.A0S("crosspostingBridgeFactoryLazy");
            default:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                voipActivityV2.A1S.A08();
                voipActivityV2.A1l.A00();
                return;
        }
    }
}
