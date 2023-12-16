package X;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.whatsapp.registration.directmigration.MigrationRequesterBroadcastReceiver;
import java.io.Serializable;

/* renamed from: X.1so  reason: invalid class name and case insensitive filesystem */
public class C33321so extends AnonymousClass5ZM {
    public final C53282mq A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C53282mq r2 = this.A00;
        C72303dV r0 = r2.A02;
        r0.A05();
        long length = r0.A05.length();
        C54972pa r6 = r2.A03;
        AnonymousClass33M r3 = new AnonymousClass33M(false);
        long A002 = C627536m.A00((AnonymousClass0QU) null, C64393Dh.A01(C54292oU.A01(r6.A00.A00), "Stickers")) + 0 + r6.A01.A00.getDatabasePath("stickers.db").length();
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33M.A03(r3, "StickerDBStorage/getStickerFilesSize: took = ", A0o);
        C18260x0.A12(" ms for total file size of = ", A0o, A002);
        Context context = r2.A00.A00;
        return AnonymousClass0x9.A0C(AnonymousClass0x9.A0n(((A002 + length) * 3) + AnonymousClass002.A0A(context.getFilesDir(), "wallpaper.jpg").length() + context.getDatabasePath("chatsettings.db").length(), 10000000), Long.valueOf(length));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        C53282mq r4 = this.A00;
        C18260x0.A0s("InterAppCommunicationManager/sendProviderToRequesterBroadcast/action = ", "com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction", AnonymousClass001.A0o());
        Intent A07 = C18320x8.A07();
        C18320x8.A10(A07, "com.whatsapp.w4b", MigrationRequesterBroadcastReceiver.class.getName());
        A07.addFlags(32);
        A07.setAction("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction");
        if (pair != null) {
            A07.putExtra("extra_min_storage_needed", (Serializable) pair.first);
            A07.putExtra("extra_msg_db_size", (Serializable) pair.second);
        }
        r4.A00.A00.sendBroadcast(A07, "com.whatsapp.permission.REGISTRATION");
    }

    public C33321so(C53282mq r1) {
        this.A00 = r1;
    }
}
