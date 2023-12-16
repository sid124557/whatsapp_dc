package X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet;
import com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.mute.ui.MuteDialogFragment;
import com.whatsapp.mute.ui.MuteDialogViewModel;
import com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment;
import com.whatsapp.radio.RadioButtonWithSubtitle;

/* renamed from: X.4Hq  reason: invalid class name and case insensitive filesystem */
public class C85794Hq implements RadioGroup.OnCheckedChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C85794Hq(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        String str;
        AnonymousClass221 valueOf;
        RadioButtonWithSubtitle radioButtonWithSubtitle;
        AnonymousClass11N r1;
        AnonymousClass226 r12;
        switch (this.A02) {
            case 0:
                AllowNonAdminMembersAddBottomSheet allowNonAdminMembersAddBottomSheet = (AllowNonAdminMembersAddBottomSheet) this.A00;
                View view = (View) this.A01;
                boolean z = false;
                if (!allowNonAdminMembersAddBottomSheet.A03) {
                    if (i == R.id.non_admin_members_add_admin_only) {
                        RadioButtonWithSubtitle radioButtonWithSubtitle2 = allowNonAdminMembersAddBottomSheet.A02;
                        if (radioButtonWithSubtitle2 != null) {
                            radioButtonWithSubtitle2.setEnabled(false);
                        }
                        CommunitySettingsViewModel communitySettingsViewModel = (CommunitySettingsViewModel) allowNonAdminMembersAddBottomSheet.A05.getValue();
                        if (communitySettingsViewModel.A02 != null) {
                            r1 = communitySettingsViewModel.A01;
                            if (r1 == null) {
                                throw C18270x1.A0S("cagSettingsViewModel");
                            }
                        }
                        view.postDelayed(C71313bu.A00(allowNonAdminMembersAddBottomSheet, 23), 500);
                        return;
                    }
                    if (i == R.id.non_admin_members_add_everyone) {
                        RadioButtonWithSubtitle radioButtonWithSubtitle3 = allowNonAdminMembersAddBottomSheet.A01;
                        if (radioButtonWithSubtitle3 != null) {
                            radioButtonWithSubtitle3.setEnabled(false);
                        }
                        CommunitySettingsViewModel communitySettingsViewModel2 = (CommunitySettingsViewModel) allowNonAdminMembersAddBottomSheet.A05.getValue();
                        z = true;
                        if (communitySettingsViewModel2.A02 != null) {
                            r1 = communitySettingsViewModel2.A01;
                            if (r1 == null) {
                                throw C18270x1.A0S("cagSettingsViewModel");
                            }
                        }
                    }
                    view.postDelayed(C71313bu.A00(allowNonAdminMembersAddBottomSheet, 23), 500);
                    return;
                    r1.Brz(4, z);
                    view.postDelayed(C71313bu.A00(allowNonAdminMembersAddBottomSheet, 23), 500);
                    return;
                }
                return;
            case 1:
                AllowNonAdminSubgroupCreationBottomSheet allowNonAdminSubgroupCreationBottomSheet = (AllowNonAdminSubgroupCreationBottomSheet) this.A00;
                View view2 = (View) this.A01;
                if (!allowNonAdminSubgroupCreationBottomSheet.A0A) {
                    if (i == R.id.non_admin_subgroup_creation_admin) {
                        ((CommunitySettingsViewModel) allowNonAdminSubgroupCreationBottomSheet.A0C.getValue()).A0D(false);
                        radioButtonWithSubtitle = allowNonAdminSubgroupCreationBottomSheet.A07;
                    } else {
                        if (i == R.id.non_admin_subgroup_creation_everyone) {
                            C44272Vj r0 = allowNonAdminSubgroupCreationBottomSheet.A02;
                            if (r0 != null) {
                                boolean A0D = C56952sp.A0D(r0.A00);
                                CommunitySettingsViewModel communitySettingsViewModel3 = (CommunitySettingsViewModel) allowNonAdminSubgroupCreationBottomSheet.A0C.getValue();
                                if (A0D) {
                                    C27991fJ r2 = communitySettingsViewModel3.A03;
                                    if (r2 != null) {
                                        C70193a6.A01(communitySettingsViewModel3.A0H, communitySettingsViewModel3, r2, 9);
                                    }
                                } else {
                                    communitySettingsViewModel3.A0D(true);
                                }
                                radioButtonWithSubtitle = allowNonAdminSubgroupCreationBottomSheet.A06;
                            } else {
                                throw C18270x1.A0S("communityABPropsManager");
                            }
                        }
                        view2.postDelayed(C71313bu.A00(allowNonAdminSubgroupCreationBottomSheet, 24), 500);
                        return;
                    }
                    if (radioButtonWithSubtitle != null) {
                        radioButtonWithSubtitle.setEnabled(false);
                    }
                    view2.postDelayed(C71313bu.A00(allowNonAdminSubgroupCreationBottomSheet, 24), 500);
                    return;
                }
                return;
            case 2:
                View view3 = (View) this.A00;
                MuteDialogFragment muteDialogFragment = (MuteDialogFragment) this.A01;
                C162457s7.A0J(view3, 0);
                View findViewById = view3.findViewById(i);
                if ((findViewById instanceof RadioButton) && findViewById != null) {
                    Object tag = findViewById.getTag();
                    if ((tag instanceof String) && (str = (String) tag) != null && (valueOf = AnonymousClass221.valueOf(str)) != null) {
                        ((MuteDialogViewModel) muteDialogFragment.A03.getValue()).A01 = valueOf;
                        return;
                    }
                    return;
                }
                return;
            default:
                View view4 = (View) this.A00;
                PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment = (PinInChatExpirationDialogFragment) this.A01;
                C162457s7.A0J(view4, 0);
                View A022 = C06560Yg.A02(view4, i);
                if ((A022 instanceof RadioButton) && A022 != null && (A022.getTag() instanceof String)) {
                    Object tag2 = A022.getTag();
                    if ((tag2 instanceof String) && tag2 != null) {
                        AnonymousClass226[] values = AnonymousClass226.values();
                        int length = values.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                r12 = values[i2];
                                if (!C162457s7.A0P(r12.name(), tag2)) {
                                    i2++;
                                }
                            }
                        }
                        pinInChatExpirationDialogFragment.A01 = r12;
                        return;
                    }
                    r12 = PinInChatExpirationDialogFragment.A02;
                    pinInChatExpirationDialogFragment.A01 = r12;
                    return;
                }
                return;
        }
    }
}
