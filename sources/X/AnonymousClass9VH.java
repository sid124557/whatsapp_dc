package X;

import android.app.Activity;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* renamed from: X.9VH  reason: invalid class name */
public class AnonymousClass9VH {
    public DisplayManager.DisplayListener A00;
    public C202449m2 A01;
    public final C54292oU A02;
    public final AnonymousClass1VX A03;

    public static void A00(Activity activity) {
        if (activity != null) {
            Intent A07 = C18320x8.A07();
            A07.setClassName(activity.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsBlockScreenShareActivity");
            A07.addFlags(536870912);
            activity.finish();
            activity.startActivity(A07);
        }
    }

    public void A01(C202449m2 r4) {
        if (!this.A03.A0X(1734)) {
            return;
        }
        if (A02()) {
            r4.Baq();
            return;
        }
        this.A01 = r4;
        DisplayManager displayManager = (DisplayManager) this.A02.A00.getSystemService("display");
        DisplayManager.DisplayListener displayListener = this.A00;
        if (displayListener == null) {
            displayListener = new AnonymousClass9XJ(displayManager, this);
            this.A00 = displayListener;
        }
        displayManager.registerDisplayListener(displayListener, (Handler) null);
    }

    public boolean A02() {
        Display[] displays = ((DisplayManager) this.A02.A00.getSystemService("display")).getDisplays();
        int length = displays.length;
        if (length <= 1) {
            return false;
        }
        int i = 1;
        while ((displays[i].getFlags() & 2) <= 0) {
            i++;
            if (i >= length) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass9VH(C54292oU r1, AnonymousClass1VX r2) {
        this.A03 = r2;
        this.A02 = r1;
    }
}
