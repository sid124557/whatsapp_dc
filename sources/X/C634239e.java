package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.companionmode.registration.CompanionPostLogoutActivity;
import com.whatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment;
import com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;
import com.whatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.39e  reason: invalid class name and case insensitive filesystem */
public class C634239e implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C634239e(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void onClick(View view) {
        C111095hX r2;
        Intent A11;
        GreenAlertActivity greenAlertActivity;
        View findViewById;
        switch (this.A02) {
            case 0:
                CompanionPostLogoutActivity companionPostLogoutActivity = (CompanionPostLogoutActivity) this.A00;
                boolean z = this.A01;
                companionPostLogoutActivity.A01.A02(false);
                C18260x0.A1E("CompanionPostLogoutActivity/init/onClick/areInactiveAccountsPresent : ", AnonymousClass001.A0o(), z);
                if (z) {
                    if (!TextUtils.isEmpty(AnonymousClass1Hf.A27(companionPostLogoutActivity).getString("account_switching_logged_out_lid", (String) null))) {
                        Log.i("CompanionPostLogoutActivity/init/onClick/logged out lid found, calling remove account");
                        r2 = companionPostLogoutActivity.A00;
                        A11 = C627736r.A13(companionPostLogoutActivity, AnonymousClass1Hf.A27(companionPostLogoutActivity).getString("account_switching_logged_out_lid", (String) null), companionPostLogoutActivity.A0A.A02(), companionPostLogoutActivity.A09.A0C(), 19, SystemClock.elapsedRealtime());
                    } else {
                        Log.i("CompanionPostLogoutActivity/init/onClick/logged out lid not found, calling abandon add new account");
                        r2 = companionPostLogoutActivity.A00;
                        A11 = C627736r.A11(companionPostLogoutActivity, (String) null, companionPostLogoutActivity.A0A.A02(), companionPostLogoutActivity.A09.A0C());
                    }
                    r2.A0A(companionPostLogoutActivity, A11);
                    return;
                }
                companionPostLogoutActivity.startActivity(C627736r.A03(companionPostLogoutActivity));
                companionPostLogoutActivity.finish();
                return;
            case 1:
                boolean z2 = this.A01;
                C89654ea r22 = (C89654ea) C621633u.A01(((View) this.A00).getContext(), C89654ea.class);
                if (r22 != null) {
                    r22.Bon(ChatWithBusinessInDirectoryDialogFragment.A00(z2), (String) null);
                    return;
                }
                return;
            case 2:
                boolean z3 = this.A01;
                Activity A012 = C621633u.A01(((View) this.A00).getContext(), C89654ea.class);
                if (A012 != null && z3) {
                    Intent A07 = C18320x8.A07();
                    C627736r.A1G(A012, A07, 2);
                    A012.startActivity(A07);
                    return;
                }
                return;
            case 3:
                C113245l7 r3 = (C113245l7) this.A00;
                boolean z4 = !this.A01;
                if (r3.A3n.A0U()) {
                    int i = 28;
                    if (z4) {
                        i = 29;
                    }
                    C621433s.A01(r3.A2z.getActivity(), i);
                    return;
                }
                return;
            case 4:
                EphemeralDmKicBottomSheetDialog ephemeralDmKicBottomSheetDialog = (EphemeralDmKicBottomSheetDialog) this.A00;
                boolean z5 = this.A01;
                ephemeralDmKicBottomSheetDialog.A0E.A00(ephemeralDmKicBottomSheetDialog.A0B, ephemeralDmKicBottomSheetDialog.A0F, C18290x4.A0a(), ephemeralDmKicBottomSheetDialog.A00);
                if (z5) {
                    Intent A0D = C18310x6.A0D(ephemeralDmKicBottomSheetDialog.A0H.A03("728928448599090"));
                    A0D.addFlags(268435456);
                    ephemeralDmKicBottomSheetDialog.A01.A0A(view.getContext(), A0D);
                } else {
                    ephemeralDmKicBottomSheetDialog.A0A.A01(ephemeralDmKicBottomSheetDialog.A0R(), "about-disappearing-messages");
                }
                C18270x1.A0l(C18270x1.A03(ephemeralDmKicBottomSheetDialog.A0D), "ephemeral_kic_nux", true);
                ephemeralDmKicBottomSheetDialog.A1L();
                return;
            case 5:
                greenAlertActivity = (GreenAlertActivity) this.A00;
                boolean z6 = this.A01;
                C51922kb r1 = greenAlertActivity.A0A;
                int i2 = 15;
                if (z6) {
                    i2 = 14;
                }
                r1.A01(Integer.valueOf(i2));
                int max = Math.max(-1, greenAlertActivity.A06.getCurrentLogicalItem() - 1);
                if (max >= 0) {
                    greenAlertActivity.A06.setCurrentLogicalItem(max);
                    greenAlertActivity.A76(max);
                    greenAlertActivity.A77(max);
                    break;
                } else {
                    greenAlertActivity.A74();
                    break;
                }
            case 6:
                greenAlertActivity = (GreenAlertActivity) this.A00;
                boolean z7 = this.A01;
                int min = Math.min(greenAlertActivity.A06.getCurrentLogicalItem() + 1, 2);
                if (min != 2) {
                    greenAlertActivity.A0A.A01(13);
                    greenAlertActivity.A06.setCurrentLogicalItem(min);
                    greenAlertActivity.A76(min);
                    greenAlertActivity.A77(min);
                    break;
                } else {
                    C56612sH r7 = greenAlertActivity.A06;
                    C51922kb r23 = greenAlertActivity.A0A;
                    AnonymousClass33X r12 = greenAlertActivity.A0B;
                    C69183Wa r6 = greenAlertActivity.A0D;
                    C622234e A022 = r12.A05.A02();
                    if (A022 == null || !String.valueOf(A022.A01).startsWith("202102")) {
                        A022 = new C622234e(20210210, 1, 1, r7.A0H(), 0);
                        Log.i("UserNoticeManager/agreePhonyUserNotice");
                        r12.A07(20210210, 5, 1);
                    } else {
                        r12.A02();
                    }
                    r6.A08.A01("20210210", 1);
                    Iterator A03 = C61102zi.A03(r6.A07);
                    while (A03.hasNext()) {
                        ((C105575Vn) A03.next()).A00.A01.A0H((Object) null);
                    }
                    int i3 = 9;
                    if (z7) {
                        i3 = 6;
                    }
                    r23.A00(A022, Integer.valueOf(i3));
                    greenAlertActivity.finish();
                    break;
                }
            default:
                boolean z8 = this.A01;
                AnonymousClass4AU r0 = ((GroupSuspendBottomSheet) this.A00).A02;
                if (r0 != null) {
                    r0.BLx(z8);
                    return;
                }
                return;
        }
        int currentLogicalItem = greenAlertActivity.A06.getCurrentLogicalItem();
        View findViewWithTag = greenAlertActivity.A06.findViewWithTag(Integer.valueOf(currentLogicalItem));
        if (currentLogicalItem != 0) {
            if (currentLogicalItem == 1) {
                greenAlertActivity.A0F.performAccessibilityAction(128, (Bundle) null);
                findViewById = greenAlertActivity.A02;
            } else {
                return;
            }
        } else if (AnonymousClass31f.A02(greenAlertActivity.A0B)) {
            findViewById = greenAlertActivity.A03;
        } else if (findViewWithTag != null) {
            findViewById = findViewWithTag.findViewById(R.id.green_alert_education_title);
        } else {
            return;
        }
        findViewById.sendAccessibilityEvent(8);
    }
}
