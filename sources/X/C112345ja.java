package X;

import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import com.whatsapp.businessdirectory.util.LocationUpdateListener;
import com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment;

/* renamed from: X.5ja  reason: invalid class name and case insensitive filesystem */
public class C112345ja implements C184218rR {
    public final AnonymousClass0O1 A00;
    public final C08310eF A01;
    public final C111525iE A02;
    public final AnonymousClass4w0 A03;
    public final DirectoryGPSLocationManager A04;
    public final LocationUpdateListener A05;
    public final C103415Mu A06;
    public final C185638u0 A07;
    public final AnonymousClass5ZR A08;
    public final C105355Up A09;

    public void A00() {
        LocationOptionPickerFragment locationOptionPickerFragment = (LocationOptionPickerFragment) this.A01.A0T().A0D("location-options-bottom-sheet");
        if (locationOptionPickerFragment != null) {
            locationOptionPickerFragment.A03 = this;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r10 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass5ZO r10, int r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0056
            boolean r0 = r10.A07()
            if (r0 == 0) goto L_0x0056
            java.lang.String r7 = r10.A08
        L_0x000a:
            r1 = 4647503709213818880(0x407f400000000000, double:500.0)
            if (r10 == 0) goto L_0x004e
            java.lang.Double r0 = r10.A04
            if (r0 == 0) goto L_0x004e
            double r3 = r0.doubleValue()
        L_0x0019:
            java.lang.Double r0 = r10.A05
            if (r0 == 0) goto L_0x0021
            double r1 = r0.doubleValue()
        L_0x0021:
            r0 = 8
            if (r11 != r0) goto L_0x0058
            X.0O1 r8 = r9.A00
            X.0eF r0 = r9.A01
            X.03q r0 = r0.A0R()
            android.content.Intent r6 = X.C18320x8.A07()
            java.lang.String r5 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity"
            r6.setClassName(r5, r0)
            java.lang.String r0 = "country_name"
            r6.putExtra(r0, r7)
            java.lang.String r0 = "latitude"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "longitude"
            r6.putExtra(r0, r1)
            r0 = 0
            r8.A00(r0, r6)
            return
        L_0x004e:
            r3 = 4647503709213818880(0x407f400000000000, double:500.0)
            if (r10 == 0) goto L_0x0021
            goto L_0x0019
        L_0x0056:
            r7 = 0
            goto L_0x000a
        L_0x0058:
            com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r6 = new com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment
            r6.<init>()
            android.os.Bundle r5 = X.AnonymousClass002.A08()
            java.lang.String r0 = "source"
            r5.putInt(r0, r11)
            java.lang.String r0 = "country-name"
            r5.putString(r0, r7)
            java.lang.String r0 = "latitude"
            r5.putDouble(r0, r3)
            java.lang.String r0 = "longitude"
            r5.putDouble(r0, r1)
            r6.A0u(r5)
            r6.A03 = r9
            X.0eF r0 = r9.A01
            X.0df r1 = r0.A0T()
            java.lang.String r0 = "location-options-bottom-sheet"
            r6.A1O(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112345ja.A01(X.5ZO, int):void");
    }

    public void BVn() {
        if (this.A08.A05()) {
            this.A07.BVl();
        } else {
            C08310eF r2 = this.A01;
            AnonymousClass5UF A012 = AnonymousClass5UF.A01(r2.A0R());
            A012.A02 = R.string.f11nameremoved;
            r2.startActivityForResult(A012.A02(), 34);
        }
        this.A02.A02(3, 0);
    }

    public void BVo() {
        this.A02.A02(4, 0);
    }

    public C112345ja(C08310eF r3, C111525iE r4, AnonymousClass4w0 r5, DirectoryGPSLocationManager directoryGPSLocationManager, LocationUpdateListener locationUpdateListener, C103415Mu r8, C185638u0 r9, AnonymousClass5ZR r10, C105355Up r11) {
        this.A01 = r3;
        this.A08 = r10;
        this.A05 = locationUpdateListener;
        this.A04 = directoryGPSLocationManager;
        this.A09 = r11;
        this.A06 = r8;
        this.A03 = r5;
        this.A07 = r9;
        this.A02 = r4;
        this.A00 = r3.Bid(new C167217zx(this, r11), new C003403v());
    }
}
