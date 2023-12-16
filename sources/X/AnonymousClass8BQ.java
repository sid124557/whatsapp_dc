package X;

import android.app.PendingIntent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;

/* renamed from: X.8BQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8BQ implements OnCompleteListener {
    public final /* synthetic */ AnonymousClass0O1 A00;
    public final /* synthetic */ DirectoryGPSLocationManager A01;
    public final /* synthetic */ AnonymousClass4GP A02;
    public final /* synthetic */ AnonymousClass4GP A03;

    public final void onComplete(Task task) {
        AnonymousClass4GP r1 = this.A02;
        AnonymousClass0O1 r3 = this.A00;
        AnonymousClass4GP r2 = this.A03;
        C162457s7.A0J(task, 4);
        try {
            task.getResult(ApiException.class);
            r1.invoke();
        } catch (ApiException e) {
            Status status = e.mStatus;
            if (status.A01 == 6) {
                try {
                    if (e instanceof AnonymousClass6QW) {
                        r3.A01(new AnonymousClass0NZ(((AnonymousClass6QW) e).mStatus.A02.getIntentSender()).A00());
                        return;
                    }
                    PendingIntent pendingIntent = status.A02;
                    if (pendingIntent != null) {
                        C626936e.A06(pendingIntent);
                        r3.A01(new AnonymousClass0NZ(pendingIntent.getIntentSender()).A00());
                    }
                } catch (Exception unused) {
                    r2.invoke();
                }
            } else {
                r2.invoke();
            }
        }
    }

    public /* synthetic */ AnonymousClass8BQ(AnonymousClass0O1 r1, DirectoryGPSLocationManager directoryGPSLocationManager, AnonymousClass4GP r3, AnonymousClass4GP r4) {
        this.A02 = r3;
        this.A01 = directoryGPSLocationManager;
        this.A00 = r1;
        this.A03 = r4;
    }
}
