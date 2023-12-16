package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.0xW  reason: invalid class name and case insensitive filesystem */
public class C18500xW extends BroadcastReceiver {
    public C56612sH A00;
    public AnonymousClass33p A01;
    public AnonymousClass2QW A02;
    public final Object A03 = AnonymousClass002.A0D();
    public volatile boolean A04 = false;

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    AnonymousClass2A1.A00(context).ARm(this);
                    this.A04 = true;
                }
            }
        }
        Log.i("ProcessProviderMigrationInfo/on-receive");
        Bundle resultExtras = getResultExtras(true);
        if (getResultCode() == -1 && resultExtras != null && intent != null) {
            boolean z = false;
            if (C18280x3.A1V(intent, "com.whatsapp.registration.directmigration.initialMigrationInfoAction")) {
                Log.i("ProcessProviderMigrationInfo/received-phone-number");
                AnonymousClass33p r1 = this.A01;
                C18270x1.A0j(C18270x1.A03(r1), "registration_sibling_app_country_code", resultExtras.getString("me_country_code", (String) null));
                AnonymousClass33p r12 = this.A01;
                C18270x1.A0j(C18270x1.A03(r12), "registration_sibling_app_phone_number", resultExtras.getString("phone_number", (String) null));
                C18260x0.A0L(this.A01, "direct_db_migration_timeout_in_secs", resultExtras.getInt("direct_db_migration_timeout_in_secs", 360));
                boolean z2 = resultExtras.getBoolean("sister_app_content_provider_enabled", false);
                C18270x1.A0l(C18270x1.A03(this.A01), "sister_app_content_provider_is_enabled", z2);
                C18260x0.A1E("ProcessProviderMigrationInfo/sister-app-content-provider-is-enabled = ", AnonymousClass001.A0o(), z2);
                boolean z3 = resultExtras.getBoolean("sister_app_is_auth_protected", false);
                C18270x1.A0v(this.A01, "sister_app_is_auth_protected", z3);
                if (z3) {
                    C18270x1.A0i(C18270x1.A03(this.A01), "sister_app_auth_timeout", resultExtras.getLong("sister_app_privacy_auth_timeout", 60000));
                }
                C18260x0.A1E("ProcessProviderMigrationInfo/sister-app-is-auth-protected = ", AnonymousClass001.A0o(), z3);
            } else if (C18280x3.A1V(intent, "com.whatsapp.registration.directmigration.recoveryTokenAction")) {
                Log.i("ProcessProviderMigrationInfo/received-token");
                String string = AnonymousClass0x2.A0F(this.A01).getString("registration_sibling_app_country_code", (String) null);
                String string2 = AnonymousClass0x2.A0F(this.A01).getString("registration_sibling_app_phone_number", (String) null);
                String A002 = C386028i.A00(AnonymousClass000.A0T(string, string2));
                byte[] byteArray = resultExtras.getByteArray("key_recovery_token");
                if (!TextUtils.isEmpty(A002) && byteArray != null) {
                    C627236i.A0D(context, A002, byteArray);
                    z = true;
                }
                byte[] byteArray2 = resultExtras.getByteArray("key_backup_token");
                if (!TextUtils.isEmpty(string2) && byteArray2 != null) {
                    try {
                        AnonymousClass36Q.A01(context2, this.A00, this.A01, (AnonymousClass2I1) null, string2, byteArray2, 1);
                    } catch (IOException e) {
                        Log.e("ProcessProviderMigrationInfo/encryptAndSaveToken failed with IOException:", e);
                    }
                } else if (!z) {
                    return;
                }
                this.A02.A01.A00 = true;
            }
        }
    }
}
