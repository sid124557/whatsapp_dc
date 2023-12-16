package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5PH  reason: invalid class name */
public final class AnonymousClass5PH {
    public Uri A00;
    public C95814uZ A01;
    public C95804uY A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Long A0S;
    public Long A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public ArrayList A0Y;
    public ArrayList A0Z;
    public List A0a;
    public List A0b;
    public final Context A0c;

    public AnonymousClass5PH(Context context) {
        C162457s7.A0J(context, 1);
        this.A0c = context;
    }

    public static Intent A01(AnonymousClass5PH r1) {
        return r1.A03("com.whatsapp.contact.picker.ContactPicker");
    }

    public static int A00(AnonymousClass5PH r1, C624134x r2, int i, long j) {
        r1.A0T = Long.valueOf(j);
        if (i != 0) {
            return 0;
        }
        String A13 = r2.A13();
        C626936e.A06(A13);
        return A13.length();
    }

    public static void A02(AnonymousClass5PH r2, byte b) {
        r2.A0Z = new ArrayList(Collections.singleton(Integer.valueOf(Byte.valueOf(b).intValue())));
    }

    public final Intent A03(String str) {
        Intent A072 = C18320x8.A07();
        A072.setClassName(this.A0c.getPackageName(), str);
        Boolean bool = this.A0H;
        if (bool != null) {
            A072.putExtra("send", bool);
        }
        Boolean bool2 = this.A0L;
        if (bool2 != null) {
            A072.putExtra("skip_preview", bool2);
        }
        String str2 = this.A0V;
        if (str2 != null) {
            A072.putExtra("file_path", str2);
        }
        ArrayList arrayList = this.A0Z;
        if (arrayList != null) {
            A072.putExtra("message_types", arrayList);
        }
        Boolean bool3 = this.A03;
        if (bool3 != null) {
            A072.putExtra("block_contact", bool3);
        }
        ArrayList arrayList2 = this.A0Y;
        if (arrayList2 != null) {
            A072.putExtra("blocked_list", arrayList2);
        }
        String str3 = this.A0X;
        if (str3 != null) {
            A072.setType(str3);
        }
        String str4 = this.A0W;
        if (str4 != null) {
            A072.putExtra("android.intent.extra.TEXT", str4);
        }
        Boolean bool4 = this.A09;
        if (bool4 != null) {
            A072.putExtra("forward", bool4);
        }
        C95814uZ r3 = this.A01;
        if (!(r3 == null && this.A0U == null)) {
            String str5 = this.A0U;
            if (str5 == null) {
                str5 = C627336j.A07(r3);
            }
            A072.putExtra("forward_jid", str5);
        }
        List list = this.A0b;
        if (list != null) {
            A072.putExtra("jids", C627336j.A0A(list));
        }
        C95804uY r1 = this.A02;
        if (r1 != null) {
            AnonymousClass0x2.A0u(A072, r1, "newsletter_invite_link_jid");
        }
        Long l = this.A0T;
        if (l != null) {
            A072.putExtra("forward_video_duration", l);
        }
        Integer num = this.A0R;
        if (num != null) {
            A072.putExtra("forward_text_length", num);
        }
        Integer num2 = this.A0N;
        if (num2 != null) {
            A072.putExtra("forward_messages_becoming_frequently_forwarded", num2);
        }
        Boolean bool5 = this.A0C;
        if (bool5 != null) {
            A072.putExtra("is_forwarded", bool5);
        }
        Boolean bool6 = this.A0A;
        if (bool6 != null) {
            A072.putExtra("forward_ctwa", bool6);
        }
        Boolean bool7 = this.A0B;
        if (bool7 != null) {
            A072.putExtra("forward_highly_forwarded", bool7);
        }
        Boolean bool8 = this.A0D;
        if (bool8 != null) {
            A072.putExtra("is_voice_status_forward_allowed", bool8);
        }
        Boolean bool9 = this.A0I;
        if (bool9 != null) {
            A072.putExtra("set_group_icon", bool9);
        }
        Long l2 = this.A0S;
        if (l2 != null) {
            A072.putExtra("message_row_id", l2);
        }
        List list2 = this.A0a;
        if (list2 != null) {
            Bundle A082 = AnonymousClass002.A08();
            C107395bF.A09(A082, list2);
            A072.putExtra("message_keys", A082);
        }
        Boolean bool10 = this.A08;
        if (bool10 != null) {
            A072.putExtra("email_history", bool10);
        }
        Boolean bool11 = this.A04;
        if (bool11 != null) {
            A072.putExtra("call_picker", bool11);
        }
        Boolean bool12 = this.A0G;
        if (bool12 != null) {
            A072.putExtra("request_sync", bool12);
        }
        Boolean bool13 = this.A0F;
        if (bool13 != null) {
            A072.putExtra("request_out_contact_sync", bool13);
        }
        Uri uri = this.A00;
        if (uri != null) {
            A072.putExtra("android.intent.extra.STREAM", uri);
        }
        Boolean bool14 = this.A0M;
        if (bool14 != null) {
            A072.putExtra("status_chip_clicked", bool14);
        }
        Boolean bool15 = this.A0E;
        if (bool15 != null) {
            A072.putExtra("multi_select_ddm", bool15);
        }
        Integer num3 = this.A0P;
        if (num3 != null) {
            A072.putExtra("dm_duration", num3);
        }
        if (this.A0O != null) {
            A072.putExtra("use_custom_multiselect_limit", true);
            A072.putExtra("custom_multiselect_limit", this.A0O);
        }
        Integer num4 = this.A0Q;
        if (num4 != null) {
            A072.putExtra("status_distribution_mode", num4);
        }
        if (this.A05 != null) {
            A072.putExtra("contacts_list_view_mode", true);
        }
        Boolean bool16 = this.A0K;
        if (bool16 != null) {
            A072.putExtra("show_ad_creation", bool16);
        }
        Boolean bool17 = this.A0J;
        if (bool17 != null) {
            A072.putExtra("should_blink_create_group_item", bool17);
        }
        Boolean bool18 = this.A07;
        if (bool18 != null) {
            A072.putExtra("disable_text_size_limit_message", bool18);
        }
        Boolean bool19 = this.A06;
        if (bool19 != null) {
            A072.putExtra("disable_post_send_intent", bool19);
        }
        return A072;
    }
}
