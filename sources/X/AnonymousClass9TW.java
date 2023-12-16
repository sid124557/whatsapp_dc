package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9TW  reason: invalid class name */
public class AnonymousClass9TW {
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FX A01;
    public final C192869Ly A02;
    public volatile ConcurrentHashMap A03;
    public volatile ConcurrentHashMap A04;

    public final void A01() {
        if (this.A03 == null || this.A04 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    this.A03 = new ConcurrentHashMap();
                    try {
                        A02(AnonymousClass0x9.A1H("{\"action\":[[78315521,1,\"TTRC_LONG_CANCEL\",78315521,[[\"duration\",1]]],[78315522,1,\"TTRC_FAILURE\",78315522,[[\"duration\",1],[\"message\",1]]],[231937006,1,\"TTRC_CHOICE_PREVIEW_IMG\",231937006,[[\"bloks_display_name\",1],[\"category_id\",1],[\"choice_id\",1],[\"session_id\",1]]],[231933580,1,\"TTRC\",231933580,[[\"bloks_display_name\",1],[\"session_id\",1],[\"app_id\",1],[\"end_reason\",1],[\"category_id\",1],[\"ttrc_source\",1],[\"ttrc_source_for_bloks_query\",1],[\"recency_threshold_for_bloks_query\",1],[\"ttrc_tracking_version\",1],[\"cache_and_network_queries\",1],[\"network_only_queries\",1],[\"steps\",1],[\"cds_bottomsheet\",1],[\"ttrc_back_start_on_touch_up\",1],[\"using_backup_start_time\",1],[\"using_capped_backup_start_time\",1],[\"revoked_queries\",1],[\"revoked_steps\",1],[\"ttrc_cache_rendered\",1]]],[914163517,1,\"AVATAR_MARKETPLACE_TABBED_FLOW_OPEN\",914163517,[]]]}"));
                        A02(this.A00.A0S(2620));
                    } catch (Exception e) {
                        this.A03.clear();
                        this.A01.B2f(AnonymousClass000.A0a("Couldn't parse bloks config (actions): ", AnonymousClass001.A0o(), e));
                    }
                }
                if (this.A04 == null) {
                    this.A04 = new ConcurrentHashMap();
                    try {
                        A03(AnonymousClass0x9.A1H("{\"ttrc\":[[\"com.bloks.www.avatar.editor.cds.launcher\",1,231933580],[\"com.bloks.www.avatar.editor.cds.launcher.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.choice.preview.pagination\",1,231933580],[\"com.bloks.www.avatar.editor.cds.choice.preview.pagination.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.save.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.delete.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.update-main-preview-zoom.async\",1,231933580],[\"com.bloks.www.avatar.editor.exit.log\",1,231933580],[\"com.bloks.www.avatar.editor.exit.log.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.exit.log.setup\",1,231933580],[\"com.bloks.www.avatar.editor.cds.exit.log.setup.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.editor_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.editor_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_nux_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_nux_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.skin_tone\",1,231933580],[\"com.bloks.www.avatar.editor.cds.skin_tone.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.skin_tone_new_nav\",1,231933580],[\"com.bloks.www.avatar.editor.cds.deletion_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.deletion_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_preview_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_preview_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.preview.fetch.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.save_click.log.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.delegation_launcher\",1,231933580],[\"com.bloks.www.avatar.editor.cds.delegation_launcher.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.screen_delegation.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.editor_new_nav_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.new-nav-update-zoom.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_preview_screen_new_nav\",1,231933580],[\"com.bloks.www.avatar.editor.cds.presets\",1,231933580],[\"com.bloks.www.avatar.editor.cds.whatsapp.notice\",1,231933580],[\"com.bloks.www.avatar.editor.cds.wa_notice.accept.async\",1,231933580],[\"avatar_editor_new_nav_screen\",1,231933580],[\"com.bloks.www.ctwa.messaging.hub\",1,1029389270]]}"));
                        A03(this.A00.A0S(2621));
                    } catch (Exception e2) {
                        this.A04.clear();
                        this.A01.B2f(AnonymousClass000.A0a("Couldn't parse bloks config (ttrc): ", AnonymousClass001.A0o(), e2));
                    }
                }
            }
        }
    }

    public final void A02(JSONObject jSONObject) {
        HashMap hashMap;
        if (this.A03 != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("action");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                int i2 = jSONArray2.getInt(0);
                int i3 = jSONArray2.getInt(1);
                int i4 = 2;
                if (2 != i3) {
                    i4 = 1;
                    if (1 != i3) {
                        i4 = -1;
                    }
                }
                String string = jSONArray2.getString(2);
                int i5 = jSONArray2.getInt(3);
                if (jSONArray2.length() > 4) {
                    HashMap A0t = AnonymousClass001.A0t();
                    JSONArray jSONArray3 = jSONArray2.getJSONArray(4);
                    for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                        JSONArray jSONArray4 = jSONArray3.getJSONArray(i6);
                        String string2 = jSONArray4.getString(0);
                        int i7 = jSONArray4.getInt(1);
                        int i8 = 2;
                        if (2 != i7) {
                            i8 = 1;
                            if (1 != i7) {
                                i8 = -1;
                            }
                        }
                        A0t.put(string2, Integer.valueOf(i8));
                    }
                    hashMap = A0t;
                } else {
                    hashMap = Collections.emptyMap();
                }
                this.A03.put(Integer.valueOf(i2), new AnonymousClass9PT(string, hashMap, i4, i5));
            }
        }
    }

    public final void A03(JSONObject jSONObject) {
        int i;
        if (this.A04 != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("ttrc");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                String string = jSONArray2.getString(0);
                int i3 = jSONArray2.getInt(1);
                int i4 = 2;
                if (2 != i3) {
                    i4 = 1;
                    if (1 != i3) {
                        i4 = -1;
                    }
                }
                if (jSONArray2.length() > 2) {
                    i = jSONArray2.getInt(2);
                } else {
                    i = 812974081;
                }
                this.A04.put(string, new C193379Og(i4, i));
            }
        }
    }

    public AnonymousClass9TW(AnonymousClass1VX r1, AnonymousClass4FX r2, C192869Ly r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final AnonymousClass9PT A00(int i) {
        A01();
        ConcurrentHashMap concurrentHashMap = this.A03;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass9PT r4 = (AnonymousClass9PT) concurrentHashMap.get(valueOf);
        if (r4 == null) {
            r4 = (AnonymousClass9PT) C18290x4.A0j(this.A03, i >> 16);
            if (r4 == null) {
                r4 = new AnonymousClass9PT("na", (Map) null, -1, 812974081);
            }
            this.A03.put(valueOf, r4);
        }
        return r4;
    }
}
