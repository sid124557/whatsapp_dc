package X;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0xJ  reason: invalid class name and case insensitive filesystem */
public class C18410xJ extends AbstractThreadedSyncAdapter {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C64193Cn A02;

    public C18410xJ(C55682qk r3, C56972sr r4, C64193Cn r5, C54292oU r6) {
        super(r6.A00, true);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (this.A01.A0Y()) {
            Log.d("ContactSyncAdapter/onPerformSync/skipping sync as companions use contacts synced from primary phonebook");
            return;
        }
        C60982zU r2 = new C60982zU(AnonymousClass227.A02);
        r2.A03 = true;
        r2.A04 = true;
        r2.A00 = C59812xW.A0C;
        C61272zz A022 = r2.A02();
        C33161sX r4 = new C33161sX(true);
        A022.A02(r4);
        C64193Cn r3 = this.A02;
        r3.A0T.execute(new C70203a7(r3, 45, A022));
        try {
            r4.get();
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            C626936e.A0A(e);
            Log.e("ContactsSyncAdapterService/onCreate", e);
            C55682qk.A05(this.A00, "ContactsSyncAdapterService/onCreate", e);
        }
    }
}
