package X;

import android.location.LocationManager;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;

/* renamed from: X.5jZ  reason: invalid class name and case insensitive filesystem */
public class C112335jZ implements C184218rR {
    public AnonymousClass0O1 A00;
    public AnonymousClass0O1 A01;
    public AnonymousClass0O1 A02;
    public final C08310eF A03;
    public final DirectoryGPSLocationManager A04;
    public final C103415Mu A05;
    public final C112365jc A06;
    public final C96214vz A07;
    public final AnonymousClass5ZR A08;
    public final AnonymousClass1VX A09;
    public final C186568vZ A0A;

    public void A00(boolean z) {
        String str;
        C003203q A0Q = this.A03.A0Q();
        if (A0Q != null) {
            boolean isProviderEnabled = ((LocationManager) A0Q.getSystemService("location")).isProviderEnabled("gps");
            C112365jc r0 = this.A06;
            if (isProviderEnabled) {
                r0.A02.A02();
                if (z) {
                    str = "in_app_gps_dialog_accepted";
                } else {
                    str = "gps_turned_on_from_setting_screen";
                }
            } else {
                r0.A00();
                if (z) {
                    str = "in_app_gps_dialog_denied";
                } else {
                    str = "gps_is_not_turned_on_from_setting_screen";
                }
            }
            this.A0A.markerPoint(207368785, str);
        }
    }

    public void BVn() {
        if (!this.A09.A0X(6328)) {
            C18270x1.A0l(AnonymousClass5NA.A00(this.A07.A04), "location_access_granted", true);
        }
        if (this.A08.A05()) {
            this.A06.BVl();
        } else {
            AnonymousClass0O1 r2 = this.A02;
            AnonymousClass5UF A012 = AnonymousClass5UF.A01(this.A03.A0R());
            A012.A02 = R.string.f11nameremoved;
            r2.A00((C05880Vi) null, A012.A02());
        }
        this.A0A.markerPoint(207368785, "business_search_location_permission_accepted");
    }

    public void BVo() {
        this.A0A.markerPoint(207368785, "business_search_location_permission_denied");
    }

    public C112335jZ(C08310eF r5, AnonymousClass5IM r6, C103415Mu r7, C111535iF r8, C112365jc r9, C96214vz r10, AnonymousClass5ZR r11, AnonymousClass1VX r12, AnonymousClass5GZ r13, C186568vZ r14) {
        this.A09 = r12;
        this.A03 = r5;
        this.A08 = r11;
        this.A0A = r14;
        this.A05 = r7;
        this.A07 = r10;
        this.A06 = r9;
        C56972sr r0 = r13.A00.A00;
        r0.A0P();
        Me me = r0.A00;
        C626936e.A06(me);
        String A0w = AnonymousClass0x9.A0w(me);
        C162457s7.A0J(r8, 0);
        DirectoryGPSLocationManager Azx = r6.A00.Azx(r8, A0w);
        this.A04 = Azx;
        C08310eF r1 = this.A03;
        r1.A0L.A00(Azx);
        AnonymousClass6C6.A02(r1.A0V(), Azx.A05, this, 55);
        C08310eF r3 = this.A03;
        this.A02 = r3.Bid(new C107595bZ(this, 2), new C003403v());
        this.A01 = r3.Bid(new AnonymousClass93C(this, 4), new C003403v());
        this.A00 = r3.Bid(new AnonymousClass93C(this, 5), new C003503w());
    }
}
