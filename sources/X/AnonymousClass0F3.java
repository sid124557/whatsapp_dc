package X;

import android.content.Context;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;

/* renamed from: X.0F3  reason: invalid class name */
public class AnonymousClass0F3 extends AnonymousClass5ZM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ConditionVariable A01;
    public final /* synthetic */ ConditionVariable A02;
    public final /* synthetic */ C10170hV A03;
    public final /* synthetic */ C17110ua A04;
    public final /* synthetic */ Runnable A05;

    public AnonymousClass0F3(Context context, ConditionVariable conditionVariable, ConditionVariable conditionVariable2, C10170hV r4, C17110ua r5, Runnable runnable) {
        this.A03 = r4;
        this.A00 = context;
        this.A02 = conditionVariable;
        this.A01 = conditionVariable2;
        this.A04 = r5;
        this.A05 = runnable;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A05.run();
    }

    public Void A0G() {
        String str;
        if (!AnonymousClass0YV.A0F(this.A00)) {
            return null;
        }
        Log.i("deleteacctconfirm/delete-account-cleanup waiting for googleDriveService object to be received.");
        C10170hV r5 = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.A02.block(60000)) {
            long currentTimeMillis2 = 60000 - (System.currentTimeMillis() - currentTimeMillis);
            Log.i("deleteacctconfirm/delete-account-cleanup waiting for Google Drive cleanup to finish.");
            if (currentTimeMillis2 <= 0 || !this.A01.block(currentTimeMillis2)) {
                str = "deleteacctconfirm/delete-account-cleanup Google Drive account deletion timed out.";
            } else {
                Log.i("deleteacctconfirm/delete-account-cleanup Google Drive deletion is finished.");
                r5.A03.A02(this.A04);
                return null;
            }
        } else {
            str = "deleteacctconfirm/delete-account-cleanup unable to get Google Drive service object.";
        }
        Log.e(str);
        try {
            r5.A03.A02(this.A04);
            return null;
        } catch (IllegalStateException e) {
            Log.e("deleteacctconfirm/delete-account-cleanup", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return A0G();
    }
}
