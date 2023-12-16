package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.5cT  reason: invalid class name and case insensitive filesystem */
public class C108135cT implements LocationListener {
    public Location A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public TextView A05;
    public CircularProgressBar A06;
    public C89644eZ A07;
    public AnonymousClass5ZO A08;
    public Double A09;
    public Double A0A;
    public Float A0B = Float.valueOf(16.0f);
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public final C159027ky A0H;
    public final C56972sr A0I;
    public final AnonymousClass4w0 A0J;
    public final C105085Tn A0K;
    public final C620633i A0L;
    public final WhatsAppLibLoader A0M;
    public final /* synthetic */ DirectorySetLocationMapActivity A0N;

    public void A00() {
        this.A0C = null;
        this.A05.setText(R.string.f11nameremoved);
        AnonymousClass0x2.A0q(this.A07, this.A05, R.color.f5nameremoved);
    }

    public C108135cT(C159027ky r2, C56972sr r3, AnonymousClass4w0 r4, C105085Tn r5, DirectorySetLocationMapActivity directorySetLocationMapActivity, C620633i r7, WhatsAppLibLoader whatsAppLibLoader) {
        this.A0N = directorySetLocationMapActivity;
        this.A0I = r3;
        this.A0L = r7;
        this.A0M = whatsAppLibLoader;
        this.A0H = r2;
        this.A0K = r5;
        this.A0J = r4;
    }

    public void A01() {
        LocationManager A0F2 = this.A0L.A0F();
        if (A0F2 != null && !A0F2.isProviderEnabled("gps") && !A0F2.isProviderEnabled("network")) {
            C621433s.A01(this.A07, 2);
        }
    }

    public void A02(C181978nf r7) {
        View A0G2 = C86654Ky.A0G(this.A07, R.layout.f8nameremoved);
        TextView A0G3 = C18300x5.A0G(A0G2, R.id.permission_message);
        ImageView A0E2 = AnonymousClass0x9.A0E(A0G2, R.id.permission_image_1);
        View A022 = C06560Yg.A02(A0G2, R.id.submit);
        View A023 = C06560Yg.A02(A0G2, R.id.cancel);
        A0G3.setText(R.string.f11nameremoved);
        A0E2.setImageResource(R.drawable.permission_location);
        C19340zH A024 = AnonymousClass5V0.A02(this.A07, A0G2);
        A024.A0i(true);
        AnonymousClass043 create = A024.create();
        if (create.getWindow() != null) {
            C18310x6.A0x(this.A07, create.getWindow(), R.color.f5nameremoved);
        }
        C109725f5.A00(A022, this, r7, create, 12);
        C18290x4.A1H(A023, create, 36);
        create.show();
        this.A0E = true;
        C18270x1.A0l(AnonymousClass5NA.A00(this.A0J.A04), "DIRECTORY_LOCATION_INFO_SHOWN", true);
    }

    public void A03(String str) {
        this.A0C = str;
        if (!TextUtils.isEmpty(str)) {
            this.A05.setText(str);
            AnonymousClass5Yj.A0B(this.A07, this.A05, R.attr.f3nameremoved, R.color.f5nameremoved);
        }
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            if (this.A00 == null) {
                DirectorySetLocationMapActivity directorySetLocationMapActivity = this.A0N;
                if (directorySetLocationMapActivity.A01 != null && this.A09 == null && this.A0A == null) {
                    directorySetLocationMapActivity.A0F.setLocationMode(1);
                    directorySetLocationMapActivity.A01.A0A(C106555Zl.A01(C86624Kv.A0F(location)));
                }
            }
            DirectorySetLocationMapActivity directorySetLocationMapActivity2 = this.A0N;
            if (directorySetLocationMapActivity2.A0B.A0F && directorySetLocationMapActivity2.A01 != null) {
                directorySetLocationMapActivity2.A01.A09(C106555Zl.A01(C86624Kv.A0F(location)));
            }
            directorySetLocationMapActivity2.A0F.A06 = location;
            if (C622534h.A01(location, this.A00)) {
                this.A00 = location;
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
