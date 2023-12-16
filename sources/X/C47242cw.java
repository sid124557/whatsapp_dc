package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2cw  reason: invalid class name and case insensitive filesystem */
public final class C47242cw {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final UserJid A07;
    public final String A08;

    public C47242cw(Context context, UserJid userJid, String str) {
        C18260x0.A0V(context, userJid, str);
        this.A06 = context;
        this.A07 = userJid;
        this.A08 = str;
    }

    public final Intent A00() {
        Intent A072 = C18320x8.A07();
        A072.setClassName(this.A06.getPackageName(), "com.whatsapp.blockbusiness.BlockBusinessActivity");
        A072.putExtra("jid_extra", this.A07.getRawString());
        A072.putExtra("entry_point_extra", this.A08);
        A072.putExtra("show_success_toast_extra", this.A05);
        A072.putExtra("from_spam_panel_extra", this.A00);
        A072.putExtra("show_report_upsell", this.A04);
        A072.putExtra("report_block_and_delete_contact", this.A02);
        A072.putExtra("should_launch_home_activity_post_block", this.A03);
        A072.putExtra("third_party_bot", this.A01);
        return A072;
    }
}
