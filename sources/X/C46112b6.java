package X;

import android.content.SharedPreferences;

/* renamed from: X.2b6  reason: invalid class name and case insensitive filesystem */
public class C46112b6 {
    public int A00;
    public boolean A01;
    public final AnonymousClass33p A02;
    public final /* synthetic */ C50532iK A03;

    public synchronized void A00(int i) {
        SharedPreferences.Editor editor;
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (this.A01 && i2 == 0) {
            this.A03.A09.A03("account_sync", (Long) null);
        }
        if (i == 1) {
            editor = C18300x5.A09(this.A02, "account_sync_status_num_retries");
        } else if (i == 2) {
            editor = C18300x5.A09(this.A02, "account_sync_picture_num_retries");
        } else if (i == 3) {
            editor = C18300x5.A09(this.A02, "account_sync_privacy_num_retries");
        } else if (i == 4) {
            editor = C18300x5.A09(this.A02, "account_sync_blocklist_num_retries");
        } else if (i == 7) {
            editor = C18300x5.A09(this.A02, "account_sync_text_status_num_retries");
        }
        editor.apply();
    }

    public C46112b6(AnonymousClass33p r1, C50532iK r2, int i, boolean z) {
        this.A03 = r2;
        this.A02 = r1;
        this.A01 = z;
        this.A00 = i;
    }
}
