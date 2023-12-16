package X;

import android.os.Bundle;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.5xQ  reason: invalid class name and case insensitive filesystem */
public final class C119715xQ extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C87484Tc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119715xQ(C87484Tc r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryPickerFragment galleryPickerFragment = new GalleryPickerFragment();
        C87484Tc r6 = this.this$0;
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("android.intent.extra.TEXT", r6.A0E);
        A08.putInt("include", r6.A00);
        A08.putBoolean("preview", r6.A0K);
        A08.putString("jid", r6.A0H);
        A08.putString("mentions", r6.A0F);
        A08.putString("quoted_group_jid", r6.A0G);
        Long l = r6.A0C;
        if (l != null) {
            A08.putLong("quoted_message_row_id", l.longValue());
        }
        Integer num = r6.A0A;
        if (num != null) {
            A08.putInt("max_items", num.intValue());
        }
        Boolean bool = r6.A04;
        if (bool != null) {
            A08.putBoolean("skip_max_items_new_limit", bool.booleanValue());
        }
        Boolean bool2 = r6.A05;
        if (bool2 != null) {
            A08.putBoolean("is_in_multi_select_mode_only", bool2.booleanValue());
        }
        Boolean bool3 = r6.A06;
        if (bool3 != null) {
            A08.putBoolean("is_send_as_document", bool3.booleanValue());
        }
        Long l2 = r6.A0D;
        if (l2 != null) {
            A08.putLong("picker_open_time", l2.longValue());
        }
        Boolean bool4 = r6.A08;
        if (bool4 != null) {
            A08.putBoolean("should_send_media", bool4.booleanValue());
        }
        Boolean bool5 = r6.A07;
        if (bool5 != null) {
            A08.putBoolean("should_hide_caption_view", bool5.booleanValue());
        }
        Boolean bool6 = r6.A09;
        if (bool6 != null) {
            A08.putBoolean("should_set_gallery_result", bool6.booleanValue());
        }
        Integer num2 = r6.A0B;
        if (num2 != null) {
            A08.putInt("origin", num2.intValue());
        }
        galleryPickerFragment.A0u(A08);
        return galleryPickerFragment;
    }
}
