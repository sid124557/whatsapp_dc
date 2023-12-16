package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: X.5PE  reason: invalid class name */
public final class AnonymousClass5PE {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03 = -1;
    public long A04 = -1;
    public long A05;
    public long A06;
    public Uri A07;
    public Bundle A08;
    public C108845de A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public ArrayList A0F;
    public ArrayList A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = true;
    public boolean A0N;
    public boolean A0O;
    public final Context A0P;

    public static void A00(C106105Xq r1, AnonymousClass5PE r2) {
        Bundle bundle = new Bundle();
        r1.A03(bundle);
        r2.A08 = bundle;
    }

    public AnonymousClass5PE(Context context) {
        this.A0P = context;
    }

    public Intent A01() {
        long j;
        Intent A072 = C18320x8.A07();
        A072.setClassName(this.A0P.getPackageName(), "com.whatsapp.mediacomposer.MediaComposerActivity");
        A072.putExtra("android.intent.extra.STREAM", this.A0G);
        A072.putExtra("android.intent.extra.TEXT", this.A0E);
        A072.putExtra("first_caption", this.A0B);
        A072.putExtra("jid", this.A0C);
        A072.putExtra("jids", this.A0F);
        A072.putExtra("max_items", this.A01);
        A072.putExtra("skip_max_items_new_limit", this.A0N);
        A072.putExtra("origin", this.A02);
        long j2 = this.A05;
        if (j2 <= 0) {
            j2 = SystemClock.elapsedRealtime();
        }
        A072.putExtra("picker_open_time", j2);
        A072.putExtra("send", this.A0K);
        A072.putExtra("quoted_message_row_id", this.A06);
        A072.putExtra("quoted_group_jid", this.A0D);
        A072.putExtra("number_from_url", this.A0H);
        A072.putExtra("media_preview_params", this.A08);
        A072.putExtra("smb_quick_reply", false);
        A072.putExtra("should_send_media", this.A0M);
        A072.putExtra("should_hide_caption_view", this.A0L);
        A072.putExtra("start_home", this.A0O);
        A072.putExtra("animate_uri", this.A07);
        A072.putExtra("preselected_image_uri", (Parcelable) null);
        A072.putExtra("scan_for_qr", this.A0J);
        A072.putExtra("is_new_content", this.A0I);
        A072.putExtra("status_distribution", this.A09);
        int i = this.A02;
        if (i == 1 || i == 11 || i == 14 || i == 17 || i == 20 || i == 21) {
            j = this.A04;
        } else {
            j = -1;
        }
        A072.putExtra("gallery_duration_ms", j);
        A072.putExtra("preview_top_margin", this.A03);
        A072.putExtra("preview_bottom_margin", this.A00);
        Integer num = this.A0A;
        if (num != null) {
            A072.putExtra("media_quality_selection", num);
        }
        A072.putExtra("show_delete_thumbnail_for_single_media", false);
        A072.putExtra("set_result_when_last_media_deleted", false);
        A072.putExtra("disable_converting_video_to_gif_option", false);
        return A072;
    }
}
