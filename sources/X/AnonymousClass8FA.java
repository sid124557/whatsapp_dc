package X;

import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import java.util.HashMap;

/* renamed from: X.8FA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8FA implements C181968ne {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass925 A02;

    public final void BK8() {
        String str;
        AnonymousClass925 r0 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        C111545iG r5 = ((DirectorySetLocationMapActivity) r0.A00).A06;
        HashMap A0t = AnonymousClass001.A0t();
        if (i != -1) {
            if (i == 3) {
                if (i2 == 1) {
                    A0t.put("error_type", "geocoder_error");
                    str = "Geocoder's addresses list response is either null or empty";
                } else if (i2 == 0) {
                    A0t.put("error_type", "geocoder_error");
                    str = "Geocoder's address string is empty or null";
                }
            }
            r5.BK9(A0t, 7, 26);
        }
        A0t.put("error_type", "network_error");
        str = "Network error is identified by location picker client code before calling the GeoCoder API";
        A0t.put("error_description", str);
        r5.BK9(A0t, 7, 26);
    }

    public /* synthetic */ AnonymousClass8FA(AnonymousClass925 r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }
}
