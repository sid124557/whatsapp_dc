package X;

import android.content.SharedPreferences;

/* renamed from: X.3FL  reason: invalid class name */
public final class AnonymousClass3FL implements AnonymousClass4E8 {
    public final C66663Mh A00;

    public AnonymousClass3FL(C66663Mh r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BQW() {
        SharedPreferences.Editor edit = this.A00.A00.edit();
        edit.remove("multi_share_file_preview");
        edit.remove("storage_migration_enabled");
        edit.remove("community_nux");
        edit.remove("about_community_nux");
        edit.remove("privatestats_upload_jitter_secs");
        edit.remove("group_call_callee_ring_duration");
        edit.remove("group_call_max_participants");
        edit.remove("linked_devices_ui_enabled");
        edit.remove("linked_devices_title_enabled");
        edit.remove("linked_devices_max_count");
        edit.apply();
    }

    public String BDW() {
        return "ServerPropsDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
