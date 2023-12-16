package X;

import com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.5nr  reason: invalid class name and case insensitive filesystem */
public class C114945nr implements AnonymousClass4FM {
    public final /* synthetic */ GoogleMigrateImporterViewModel A00;

    public C114945nr(GoogleMigrateImporterViewModel googleMigrateImporterViewModel) {
        this.A00 = googleMigrateImporterViewModel;
    }

    public void BOS() {
        Log.i("GoogleMigrateImporterViewModel/onCancellationCompleted()");
        this.A00.A0G(C18280x3.A0S());
    }

    public void BOT() {
        Log.i("GoogleMigrateImporterViewModel/onCancellationStarted()");
        this.A00.A0F(7);
    }

    public void BUS() {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A00;
        googleMigrateImporterViewModel.A0F(3);
        C06270Wx.A04(googleMigrateImporterViewModel.A03, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 == 101) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BYh(int r3) {
        /*
            r2 = this;
            java.lang.String r0 = "GoogleMigrateImporterViewModel/onPrepareBeforeRetryCompleted()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 301(0x12d, float:4.22E-43)
            if (r3 == r0) goto L_0x0012
            r0 = 104(0x68, float:1.46E-43)
            if (r3 == r0) goto L_0x0012
            r0 = 101(0x65, float:1.42E-43)
            r1 = 0
            if (r3 != r0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel r0 = r2.A00
            if (r1 == 0) goto L_0x001b
            r0.A0D()
            return
        L_0x001b:
            r0.A0E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114945nr.BYh(int):void");
    }

    public void BYi() {
        Log.i("GoogleMigrateImporterViewModel/onPrepareBeforeRetryStarted()");
        this.A00.A0F(17);
    }

    public void BPU(boolean z) {
        C18260x0.A1E("GoogleMigrateImporterViewModel/onComplete()/success = ", AnonymousClass001.A0o(), z);
        if (z) {
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A00;
            googleMigrateImporterViewModel.A0F(5);
            C06270Wx.A04(googleMigrateImporterViewModel.A03, 100);
        }
    }

    public void BYz(int i) {
        C18260x0.A0y("GoogleMigrateImporterViewModel/onProgress(); progress=", AnonymousClass001.A0o(), i);
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A00;
        googleMigrateImporterViewModel.A0F(3);
        C06270Wx.A04(googleMigrateImporterViewModel.A03, i);
    }

    public void onError(int i) {
        C18260x0.A0y("GoogleMigrateImporterViewModel/onError()/errorCode = ", AnonymousClass001.A0o(), i);
        this.A00.A0F(C384327n.A00(i));
    }
}
