package X;

import android.os.Bundle;
import com.whatsapp.permissions.NotificationPermissionBottomSheet;

/* renamed from: X.2d7  reason: invalid class name and case insensitive filesystem */
public final class C47352d7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public boolean A09;

    public NotificationPermissionBottomSheet A00() {
        NotificationPermissionBottomSheet notificationPermissionBottomSheet = new NotificationPermissionBottomSheet();
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("icon_id", this.A00);
        A082.putInt("title_id", this.A08);
        A082.putInt("message_id", this.A07);
        A082.putInt("line1_icon_id", this.A01);
        A082.putInt("line2_icon_id", this.A03);
        A082.putInt("line3_icon_id", this.A05);
        A082.putString("permission_requestor_screen_type", (String) null);
        A082.putStringArray("permissions", (String[]) null);
        A082.putBoolean("is_first_time_request", this.A09);
        A082.putInt("nth_details_id", 0);
        A082.putInt("line1_message_id", this.A02);
        A082.putInt("line2_message_id", this.A04);
        A082.putInt("line3_message_id", this.A06);
        A082.putBoolean("should_disable_cancel_on_outside_click", false);
        A082.putBoolean("should_hide_cancel_button_on_1st_time", false);
        notificationPermissionBottomSheet.A0u(A082);
        return notificationPermissionBottomSheet;
    }
}
