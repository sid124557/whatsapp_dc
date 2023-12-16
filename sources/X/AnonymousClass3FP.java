package X;

import android.content.SharedPreferences;

/* renamed from: X.3FP  reason: invalid class name */
public class AnonymousClass3FP implements AnonymousClass4E8 {
    public final C57162tC A00;
    public final AnonymousClass33p A01;

    public void BQW() {
        SharedPreferences.Editor A03 = C18270x1.A03(this.A01);
        A03.remove("has_muted_existing_large_groups").remove("last_mute_show_notifications").remove("view_once_education_nux_tooltip_ptt").remove("view_once_education_nux_tooltip_media").remove("view_once_education_nux_dialog").remove("ard_capability_version_Facetracker").remove("ard_capability_version_FaceExpressionFitting").remove("ard_capability_schema_Facetracker").remove("ard_capability_schema_FaceExpressionFitting").remove("detect_device_tablet");
        A03.apply();
    }

    public AnonymousClass3FP(C57162tC r1, AnonymousClass33p r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BDW() {
        return "CoreDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
