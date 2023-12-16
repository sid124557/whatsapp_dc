package X;

import android.net.Uri;
import android.util.Base64;

/* renamed from: X.8AK  reason: invalid class name */
public final class AnonymousClass8AK implements C178518hf {
    public static final C160447ne A00;
    public static final C160447ne A01;
    public static final C160447ne A02;
    public static final C160447ne A03;
    public static final C160447ne A04;
    public static final C160447ne A05;
    public static final C160447ne A06;
    public static final C160447ne A07;
    public static final C160447ne A08;
    public static final C160447ne A09;
    public static final C160447ne A0A;
    public static final C160447ne A0B;
    public static final C160447ne A0C;
    public static final C160447ne A0D;

    static {
        Uri uri;
        synchronized (C1456276q.class) {
            AnonymousClass05C r2 = C1456276q.A00;
            uri = (Uri) r2.get("com.google.android.gms.auth_account");
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                r2.put("com.google.android.gms.auth_account", uri);
            }
        }
        C156337gS r1 = new C156337gS(uri);
        if ("".isEmpty()) {
            C156337gS r4 = new C156337gS(new C156337gS(r1.A00, r1.A02).A00, true);
            Double A0Z = AnonymousClass6C8.A0Z();
            A00 = new C128156Uz(r4, A0Z, "getTokenRefactor__account_data_service_sample_percentage");
            A01 = new C128146Uy(r4, true, "getTokenRefactor__account_data_service_tokenAPI_usable");
            Long A0Y = AnonymousClass6C9.A0Y();
            A02 = new C128136Ux(r4, A0Y, "getTokenRefactor__account_manager_timeout_seconds");
            A03 = new C128136Ux(r4, AnonymousClass0x2.A0T(), "getTokenRefactor__android_id_shift");
            A04 = new C128146Uy(r4, false, "getTokenRefactor__authenticator_logic_improved");
            try {
                A05 = new AnonymousClass6V0(r4, C154867ds.A00, AnonymousClass6VG.A04(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)));
                A06 = new C128146Uy(r4, true, "getTokenRefactor__chimera_get_token_evolved");
                A07 = new C128136Ux(r4, A0Y, "getTokenRefactor__clear_token_timeout_seconds");
                A08 = new C128136Ux(r4, A0Y, "getTokenRefactor__default_task_timeout_seconds");
                A09 = new C128146Uy(r4, false, "getTokenRefactor__gaul_accounts_api_evolved");
                A0A = new C128146Uy(r4, false, "getTokenRefactor__gaul_token_api_evolved");
                A0B = new C128136Ux(r4, 120L, "getTokenRefactor__get_token_timeout_seconds");
                A0C = new C128146Uy(r4, true, "getTokenRefactor__gms_account_authenticator_evolved");
                A0D = new C128156Uz(r4, A0Z, "getTokenRefactor__gms_account_authenticator_sample_percentage");
            } catch (Exception e) {
                throw AnonymousClass0x9.A0i(e);
            }
        } else {
            throw AnonymousClass001.A0e("Cannot set GServices prefix and skip GServices");
        }
    }
}
