package X;

import java.util.List;
import org.json.JSONException;

/* renamed from: X.2GR  reason: invalid class name */
public final class AnonymousClass2GR {
    public final List A00;

    public AnonymousClass2GR() {
        try {
            C149007Ko[] r19 = new C149007Ko[3];
            C148997Kn[] r6 = new C148997Kn[2];
            Boolean bool = Boolean.TRUE;
            r6[0] = new C148997Kn(C18290x4.A12(new C148147Hc(bool, 5920)), 5000, "test");
            Boolean bool2 = Boolean.FALSE;
            List A19 = AnonymousClass0x9.A19(new C148997Kn(C18290x4.A12(new C148147Hc(bool2, 5920)), 5000, "control"), r6, 1);
            C66753Mq r7 = new C66753Mq("2.23.21.3");
            List A12 = C18290x4.A12("release");
            Integer A0h = AnonymousClass0x7.A0h();
            r19[0] = new C149007Ko(new C66753Mq("platform", C18290x4.A12("android")), "reg_phone_number_update_colors_prod_universe", C18290x4.A12(new C149477Mp(new AnonymousClass8GX(r7, new C66753Mq("release_channel", A12)), "reg_phone_number_update_colors_prod_experiment", A19, 1696921200)));
            C148997Kn[] r11 = new C148997Kn[2];
            C148147Hc[] r9 = new C148147Hc[4];
            r9[0] = new C148147Hc(bool, 5767);
            A00(r9, 5987, 1, bool);
            A00(r9, 6025, 2, "{\"client_cache\":[\"wa_android_waffle\"],\"access_library\":[\"wa_android_wfs_native_auth\"]}");
            r11[0] = new C148997Kn(AnonymousClass0x9.A19(new C148147Hc(A0h, 6982), r9, 3), 9999, "test");
            C148147Hc[] r8 = new C148147Hc[4];
            A00(r8, 5767, 0, bool2);
            A00(r8, 5987, 1, bool2);
            r8[2] = new C148147Hc("{}", 6025);
            A00(r8, 6982, 3, 60);
            r19[1] = new C149007Ko(new C66753Mq("platform", C18290x4.A12("android")), "wfs_offline_cache_beta_universe", C18290x4.A12(new C149477Mp(new AnonymousClass8GX(new C66753Mq("release_channel", C18290x4.A12("beta")), new C66753Mq("2.23.25.23")), "wfs_offline_cache_beta_experiment", AnonymousClass0x9.A19(new C148997Kn(AnonymousClass8UF.A0o(r8), 1, "control"), r11, 1), 1701417600)));
            C148997Kn[] r12 = new C148997Kn[3];
            C148147Hc[] r10 = new C148147Hc[4];
            A00(r10, 5767, 0, bool);
            A00(r10, 5987, 1, bool);
            r10[2] = new C148147Hc("{\"client_cache\":[\"wa_android_waffle\"],\"access_library\":[\"wa_android_wfs_native_auth\"]}", 6025);
            A00(r10, 6982, 3, A0h);
            r12[0] = new C148997Kn(AnonymousClass8UF.A0o(r10), 100, "test_fb_ig");
            C148147Hc[] r102 = new C148147Hc[4];
            A00(r102, 5767, 0, bool);
            A00(r102, 5987, 1, bool2);
            r102[2] = new C148147Hc("{\"client_cache\":[\"wa_android_waffle\"],\"access_library\":[\"wa_android_wfs_native_auth\"]}", 6025);
            A00(r102, 6982, 3, A0h);
            r12[1] = new C148997Kn(AnonymousClass8UF.A0o(r102), 100, "test_fb");
            C148147Hc[] r2 = new C148147Hc[4];
            A00(r2, 5767, 0, bool2);
            A00(r2, 5987, 1, bool2);
            r2[2] = new C148147Hc("{}", 6025);
            A00(r2, 6982, 3, 60);
            this.A00 = AnonymousClass0x9.A19(new C149007Ko(new C66753Mq("platform", C18290x4.A12("android")), "wfs_offline_cache_prod_universe", C18290x4.A12(new C149477Mp(new AnonymousClass8GX(new C66753Mq("2.24.1.1"), new C66753Mq("release_channel", C18290x4.A12("release"))), "wfs_offline_cache_prod_experiment", AnonymousClass0x9.A19(new C148997Kn(AnonymousClass8UF.A0o(r2), 100, "control"), r12, 2), 1704441600))), r19, 2);
        } catch (JSONException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1M(A0o, C18300x5.A0k(e, "ABConfig/invalid json format for ab property from code gen:", A0o));
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18270x1.A1H(A0o2, "ABConfig/invalid json format for ab property from code gen:", e);
            throw AnonymousClass002.A0E(A0o2.toString());
        }
    }

    public static void A00(Object[] objArr, int i, int i2, Object obj) {
        objArr[i2] = new C148147Hc(obj, i);
    }
}
