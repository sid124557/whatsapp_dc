package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* renamed from: X.5P1  reason: invalid class name */
public class AnonymousClass5P1 {
    public int A00;
    public int A01 = 1;
    public int A02 = -1;
    public int A03 = 5;
    public C166147yD A04 = null;
    public C95814uZ A05 = null;
    public AnonymousClass2z0 A06 = null;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public final Context A0B;

    public static void A00(AnonymousClass5P1 r1, AnonymousClass2z0 r2) {
        C95814uZ r0 = r2.A00;
        C626936e.A06(r0);
        r1.A05 = r0;
        r1.A06 = r2;
    }

    public AnonymousClass5P1(Context context) {
        this.A0B = context;
    }

    public Intent A01() {
        Intent A072 = C18320x8.A07();
        A072.setClassName(this.A0B.getPackageName(), "com.whatsapp.mediaview.MediaViewActivity");
        A072.putExtra("start_t", SystemClock.uptimeMillis());
        A072.putExtra("video_play_origin", this.A03);
        A072.putExtra("nogallery", this.A0A);
        A072.putExtra("gallery", this.A07);
        A072.putExtra("menu_style", this.A01);
        A072.putExtra("menu_set_wallpaper", this.A09);
        A072.putExtra("origin", this.A00);
        if (this.A08 && this.A04 != null) {
            A072.putExtra("is_premium_message_insight", true);
            A072.putExtra("temp_fmessage_media_info", this.A04);
        }
        AnonymousClass2z0 r0 = this.A06;
        if (r0 != null) {
            C107395bF.A00(A072, r0);
            int i = this.A02;
            if (i >= 0) {
                A072.putExtra("message_card_index", i);
            }
        }
        C95814uZ r1 = this.A05;
        if (r1 != null) {
            AnonymousClass0x2.A0u(A072, r1, "jid");
        }
        return A072;
    }
}
