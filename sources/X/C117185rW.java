package X;

import android.location.Address;
import android.location.Geocoder;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5rW  reason: invalid class name and case insensitive filesystem */
public class C117185rW implements Runnable {
    public double A00;
    public double A01;
    public final /* synthetic */ C108145cU A02;

    public C117185rW(C108145cU r1, double d, double d2) {
        this.A02 = r1;
        this.A00 = d;
        this.A01 = d2;
    }

    public void run() {
        String str;
        C108145cU r5 = this.A02;
        Address address = null;
        try {
            List<Address> fromLocation = new Geocoder(r5.A0X.getApplicationContext(), C620733j.A02(r5.A1D)).getFromLocation(this.A00, this.A01, 1);
            if (fromLocation != null && !fromLocation.isEmpty()) {
                address = fromLocation.get(0);
                StringBuilder A0o = AnonymousClass001.A0o();
                for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
                    if (i != 0) {
                        AnonymousClass001.A1M(A0o);
                    }
                    A0o.append(address.getAddressLine(i));
                }
                str = A0o.toString();
                r5.A0z.A0S(new C117715sN(this, address, str, 47));
            }
        } catch (Exception unused) {
        }
        str = r5.A0X.getString(R.string.f11nameremoved);
        r5.A0z.A0S(new C117715sN(this, address, str, 47));
    }
}
