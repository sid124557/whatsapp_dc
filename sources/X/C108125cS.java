package X;

import android.hardware.display.DisplayManager;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;

/* renamed from: X.5cS  reason: invalid class name and case insensitive filesystem */
public class C108125cS implements DisplayManager.DisplayListener {
    public final /* synthetic */ OrientationViewModel A00;

    public C108125cS(OrientationViewModel orientationViewModel) {
        this.A00 = orientationViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        r1 = r2.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDisplayChanged(int r4) {
        /*
            r3 = this;
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r2 = r3.A00
            java.lang.String r0 = "voip/OrientationViewModel/onDisplayChanged"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4C1 r0 = r2.A07
            boolean r0 = X.C86614Ku.A1a(r0)
            if (r0 == 0) goto L_0x002c
            X.2oU r0 = r2.A06
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "display"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            r0 = 0
            android.view.Display r0 = r1.getDisplay(r0)
            int r0 = r0.getRotation()
            int r0 = 4 - r0
            int r0 = r0 % 4
            r2.A0D(r0)
        L_0x002b:
            return
        L_0x002c:
            X.4C1 r0 = r2.A08
            boolean r0 = X.C86614Ku.A1a(r0)
            if (r0 == 0) goto L_0x002b
            X.08M r1 = r2.A05
            java.lang.Object r0 = r1.A07()
            if (r0 == 0) goto L_0x002b
            r1.A0H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108125cS.onDisplayChanged(int):void");
    }

    public void onDisplayAdded(int i) {
    }

    public void onDisplayRemoved(int i) {
    }
}
