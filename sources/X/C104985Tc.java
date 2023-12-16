package X;

import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Tc  reason: invalid class name and case insensitive filesystem */
public final class C104985Tc {
    public final C56612sH A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass5SY A03;

    public static boolean A00(C104985Tc r1) {
        return r1.A02.A0X(5288);
    }

    public final void A01() {
        AnonymousClass33p r2 = this.A01;
        C18270x1.A0g(C18270x1.A03(r2), "create_group_tool_tip_nudge_count");
        C18270x1.A0g(C18270x1.A03(r2), "create_group_tool_tip_nudge_next_show_time");
        C18270x1.A0g(C18270x1.A03(r2), "create_group_tool_tip_nudge_last_impression_time");
        C18270x1.A0g(C18270x1.A03(r2), "create_group_tool_tip_nudge_show_time");
        C18270x1.A0g(C18270x1.A03(r2), "create_group_tool_tip_temp_dismissed");
        C18270x1.A0f(C18270x1.A03(r2), "create_group_tool_tip_perm_dismissed");
    }

    public final void A02() {
        TimeUnit timeUnit;
        long j;
        AnonymousClass33p r5 = this.A01;
        C18270x1.A0l(C18270x1.A03(r5), "create_group_tool_tip_temp_dismissed", true);
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r5), "create_group_tool_tip_nudge_count") + 1;
        if (A022 <= 7) {
            long currentTimeMillis = System.currentTimeMillis();
            if (A022 == 2 || A022 == 3) {
                timeUnit = TimeUnit.DAYS;
                j = 7;
            } else {
                timeUnit = TimeUnit.DAYS;
                j = 30;
            }
            C18270x1.A0i(C18270x1.A03(r5), "create_group_tool_tip_nudge_next_show_time", currentTimeMillis + timeUnit.toMillis(j));
        }
    }

    public C104985Tc(C56612sH r2, AnonymousClass33p r3, AnonymousClass1VX r4, AnonymousClass5SY r5) {
        C18260x0.A0Q(r2, r4);
        C162457s7.A0J(r3, 4);
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
    }

    public final boolean A03() {
        int A022;
        if (A00(this)) {
            AnonymousClass33p r3 = this.A01;
            C183538qC r2 = r3.A01;
            if (!C18300x5.A0B(r2).getBoolean("create_group_tool_tip_perm_dismissed", false)) {
                if (this.A03.A00()) {
                    Log.d("CreateGroupToolTipController/Eligible for bottom nav tool tip");
                } else if (C18300x5.A0B(r2).getBoolean("one_of_create_group_tool_tip_activated", false) || ((A022 = C18280x3.A02(AnonymousClass0x2.A0F(r3), "create_group_tool_tip_nudge_count")) <= 7 && (A022 == 0 || !C18300x5.A0B(r2).getBoolean("create_group_tool_tip_temp_dismissed", false) || System.currentTimeMillis() > AnonymousClass0x2.A0B(C18300x5.A0B(r2), "create_group_tool_tip_nudge_next_show_time")))) {
                    return true;
                }
            }
        }
        return false;
    }
}
