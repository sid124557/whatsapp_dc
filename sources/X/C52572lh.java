package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;

/* renamed from: X.2lh  reason: invalid class name and case insensitive filesystem */
public class C52572lh {
    public final C54292oU A00;
    public final AnonymousClass33T A01;
    public final C620733j A02;

    public void A01(int i) {
        Context context = this.A00.A00;
        String string = context.getResources().getString(R.string.f11nameremoved);
        int i2 = i;
        if (i >= 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GoogleMigrateNotificationManager/onProgress (");
            A0o.append(i);
            C18260x0.A1L(A0o, "%)");
            A02(string, C18320x8.A0b(context.getResources(), AnonymousClass001.A0l(this.A02.A0N(), i), AnonymousClass002.A0L(), 0, R.string.f11nameremoved), i2, false, false);
        }
    }

    public final void A02(String str, String str2, int i, boolean z, boolean z2) {
        boolean A1U = AnonymousClass000.A1U(i, -1);
        C05610Ue A002 = A00(z2);
        int i2 = 100;
        int i3 = i;
        if (A1U) {
            i2 = 0;
            i3 = 0;
        }
        A002.A03(i2, i3, false);
        A002.A0E(z);
        A002.A0F(A1U);
        A002.A0B(str);
        A002.A0A(str2);
        Notification A012 = A002.A01();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GoogleMigrateNotificationManager/update-notification title:");
        A0o.append(str);
        A0o.append(" text: ");
        A0o.append(str2);
        A0o.append(" progress: ");
        A0o.append(i);
        C18260x0.A1D("autoCancel: ", A0o, z);
        this.A01.A04(31, A012);
    }

    public final C05610Ue A00(boolean z) {
        Context context;
        Intent A08;
        if (z) {
            Intent A07 = C18320x8.A07();
            context = this.A00.A00;
            A08 = A07.setClassName(context.getPackageName(), "com.whatsapp.registration.RegisterName");
        } else {
            context = this.A00.A00;
            A08 = AnonymousClass0x9.A08(context, GoogleMigrateImporterActivity.class);
            A08.setAction(GoogleMigrateImporterActivity.A0F);
        }
        C05610Ue A002 = C66553Lw.A00(context);
        A002.A03 = C18290x4.A17();
        AnonymousClass33T.A01(C624735e.A04(context, A08, 0), A002);
        A002.A06 = 1;
        return A002;
    }

    public C52572lh(C54292oU r1, AnonymousClass33T r2, C620733j r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
