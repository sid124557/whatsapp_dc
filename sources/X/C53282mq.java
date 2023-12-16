package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.2mq  reason: invalid class name and case insensitive filesystem */
public class C53282mq {
    public final C54292oU A00;
    public final AnonymousClass33p A01;
    public final C72303dV A02;
    public final C54972pa A03;
    public final AnonymousClass4FS A04;

    public void A00() {
        C18260x0.A0s("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled/sibling-country-code = ", C18280x3.A0Z(AnonymousClass0x2.A0F(this.A01), "registration_sibling_app_country_code"), AnonymousClass001.A0o());
        C18260x0.A1E("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=", AnonymousClass001.A0o(), false);
        C18260x0.A1E("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled = ", AnonymousClass001.A0o(), false);
    }

    public C53282mq(C54292oU r1, AnonymousClass33p r2, C72303dV r3, C54972pa r4, AnonymousClass4FS r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A01() {
        Bundle A08 = AnonymousClass002.A08();
        C18260x0.A1E("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=", AnonymousClass001.A0o(), false);
        A08.putBoolean("database_migration_is_enabled_on_requester_side", false);
        Log.i("InterAppCommunicationManager/sendInitialMigrationInfoNeededBroadcast/sendInitialMigrationInfoNeededBroadcast");
        A02("com.whatsapp.registration.directmigration.initialMigrationInfoAction", A08);
    }

    public final void A02(String str, Bundle bundle) {
        C18260x0.A0s("InterAppCommunicationManager/sendRequesterToProviderOrderedBroadcast/action = ", str, AnonymousClass001.A0o());
        Intent A07 = C18320x8.A07();
        C18320x8.A10(A07, "com.whatsapp.w4b", MigrationProviderOrderedBroadcastReceiver.class.getName());
        A07.setAction(str);
        A07.addFlags(32);
        new C70363aN(this, A07, bundle, 6).run();
    }
}
