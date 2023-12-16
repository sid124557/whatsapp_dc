package X;

import com.whatsapp.R;
import com.whatsapp.migration.export.service.MessagesExporterService;
import com.whatsapp.util.Log;

/* renamed from: X.3R1  reason: invalid class name */
public class AnonymousClass3R1 implements AnonymousClass4FE {
    public final /* synthetic */ MessagesExporterService A00;

    public AnonymousClass3R1(MessagesExporterService messagesExporterService) {
        this.A00 = messagesExporterService;
    }

    public void BOS() {
        MessagesExporterService messagesExporterService = this.A00;
        C52582li r4 = messagesExporterService.A01;
        Log.i("MessagesExporterNotificationManager/onCancellationComplete()");
        r4.A02(C54292oU.A00(r4.A00).getString(R.string.f11nameremoved), (String) null, -1, true);
        Log.i("xpm-export-service-onCancellationCompleted/sent export cancellation complete logging");
        messagesExporterService.stopSelf();
    }

    public void BOT() {
        C52582li r4 = this.A00.A01;
        Log.i("MessagesExporterNotificationManager/onCancelling()");
        r4.A02(C54292oU.A00(r4.A00).getString(R.string.f11nameremoved), (String) null, -1, false);
    }

    public void BSc() {
        this.A00.A01.A01(0);
    }

    public void BSa() {
        Log.i("xpm-export-service-onComplete/success");
        C52582li r4 = this.A00.A01;
        Log.i("MessagesExporterNotificationManager/onComplete()");
        r4.A02(C54292oU.A00(r4.A00).getString(R.string.f11nameremoved), (String) null, -1, true);
        Log.i("xpm-export-service-onComplete/sent export complete logging");
    }

    public void BSb(int i) {
        C18260x0.A0y("xpm-export-service-onProgress; progress=", AnonymousClass001.A0o(), i);
        this.A00.A01.A01(i);
    }

    public void onError(int i) {
        C18260x0.A0y("xpm-export-service-onError/errorCode = ", AnonymousClass001.A0o(), i);
        C52582li r4 = this.A00.A01;
        C54292oU r2 = r4.A00;
        r4.A02(C54292oU.A00(r2).getString(R.string.f11nameremoved), C54292oU.A00(r2).getString(R.string.f11nameremoved), -1, true);
    }
}
