package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Os  reason: invalid class name and case insensitive filesystem */
public class C22571Os extends C56822sc {
    public final C56972sr A00;
    public final C55262q4 A01;
    public final C56612sH A02;
    public final AnonymousClass33p A03;
    public final C56922sm A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass5UP A06;

    public List A0E() {
        AnonymousClass1EO A07;
        C56972sr.A07(this.A00);
        List A0D = A0D();
        C623934v r3 = this.A00;
        List A0A = r3.A0A("primary_feature", true);
        if (A0A.isEmpty()) {
            A0A = r3.A0A("primary_feature", false);
        }
        if (!A0A.isEmpty() && (A07 = ((AnonymousClass33W) C18290x4.A0k(A0A)).A07()) != null) {
            AnonymousClass1AC r0 = A07.primaryFeature_;
            if (r0 == null) {
                r0 = AnonymousClass1AC.DEFAULT_INSTANCE;
            }
            if (!(!A0D.equals(r0.flags_))) {
                return Collections.emptyList();
            }
        }
        A0D.contains("payment_info_sync_support");
        return Collections.singletonList(new AnonymousClass1SF((AnonymousClass33J) null, (String) null, A0D, this.A02.A0H()));
    }

    public C22571Os(C56972sr r1, C55262q4 r2, C56612sH r3, AnonymousClass33p r4, C56922sm r5, C623934v r6, AnonymousClass1VX r7, AnonymousClass5UP r8) {
        super(r6);
        this.A02 = r3;
        this.A05 = r7;
        this.A04 = r5;
        this.A00 = r1;
        this.A06 = r8;
        this.A03 = r4;
        this.A01 = r2;
    }

    public List A0D() {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass1VX r4 = this.A05;
        C58422vE r5 = C58422vE.A02;
        if (r4.A0Y(r5, 1312)) {
            A0s.add("ddm_settings");
        }
        if (r4.A0O(r5, 1829) >= 2) {
            A0s.add("recent_sticker");
        }
        if (r4.A0Y(r5, 2775)) {
            A0s.add("favorite_sticker");
        }
        if (r4.A0Y(r5, 2156)) {
            A0s.add("link_preview");
        }
        if (r4.A0Y(r5, 1394)) {
            A0s.add("poll_creation_group");
        }
        if (r4.A0Y(r5, 2194)) {
            A0s.add("poll_creation_on_one_one");
        }
        if (r4.A0Y(r5, 2738)) {
            A0s.add("poll_creation_cag");
        }
        if (C18300x5.A1S(this.A06)) {
            A0s.add("newsletter");
        }
        if (r4.A0Y(r5, 3530)) {
            A0s.add("external_web_beta_opt_in");
        }
        if (r4.A0Y(r5, 3665)) {
            A0s.add("link_preview_hq_thumbnail");
        }
        if (r4.A0Y(r5, 4135) || r4.A0Y(r5, 3337)) {
            A0s.add("history_sync_on_demand");
        }
        A0s.add("is_primary_beta_build");
        if (r4.A0Y(r5, 4905)) {
            A0s.add("post_status_in_companion");
        }
        if (r4.A0Y(r5, 4596)) {
            A0s.add("primary_campaign_id_in_history_sync_support");
        }
        AnonymousClass33p r7 = this.A03;
        C183538qC r6 = r7.A01;
        if (C18300x5.A0B(r6).getBoolean("username_ever_set", false) || this.A00.A0K().length() > 0) {
            A0s.add("username_is_set");
            C18270x1.A0f(C18270x1.A03(r7), "username_ever_set");
        }
        if (!C18300x5.A0B(r6).getBoolean("username_chats_ever_existed", false)) {
            Iterator A0v = AnonymousClass001.A0v(this.A04.A0D());
            while (true) {
                if (A0v.hasNext()) {
                    if (C371321b.USERNAME.equals(((AnonymousClass31A) A0v.next()).A0Z)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            A0s.add("username_chats_exist");
            C18270x1.A0f(C18270x1.A03(r7), "username_chats_ever_existed");
        }
        if (r4.A0Y(r5, 4745)) {
            A0s.add("username_supported");
        }
        if (C56952sp.A0F(r4)) {
            A0s.add("text_status_creation_support");
        }
        A0s.add("reactions_send");
        A0s.add("contact_except");
        A0s.add("vo_sp_receiver");
        return A0s;
    }
}
