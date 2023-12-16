package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5Ue  reason: invalid class name and case insensitive filesystem */
public class C105255Ue {
    public final C59052wG A00;
    public final AnonymousClass1VX A01;
    public final Map A02 = AnonymousClass001.A0t();

    public static AnonymousClass316 A00(C105255Ue r0, Object obj) {
        return (AnonymousClass316) r0.A02.get(obj);
    }

    public void A01() {
        AnonymousClass316 A002 = A00(this, "catalog_collections_view_tag");
        if (A002 == null) {
            Log.d("BizQPLManager/endCatalogDataSourceBlock/pref tracker not found. Have you called startPrefTracker()?");
        } else {
            A002.A09("datasource_catalog");
        }
    }

    public void A02(int i, String str, String str2) {
        Map map = this.A02;
        AnonymousClass316 r2 = (AnonymousClass316) map.get(str);
        if (r2 == null) {
            C59052wG r3 = this.A00;
            C47122ck r22 = new C47122ck(i);
            if (this.A01.A0X(1272)) {
                r22.A05 = true;
            }
            r2 = r3.A01(r22, str);
            map.put(str, r2);
        }
        r2.A0F(str2, -1);
    }

    public void A06(String str, boolean z) {
        Map map = this.A02;
        AnonymousClass316 r1 = (AnonymousClass316) map.get(str);
        if (r1 == null) {
            Log.d("BizQPLManager/endPrefTracker/pref tracker not found. Have you called startPrefTracker()?");
            return;
        }
        short s = 3;
        if (z) {
            s = 2;
        }
        r1.A0E(s);
        map.remove(str);
    }

    public C105255Ue(C59052wG r2, AnonymousClass1VX r3) {
        this.A01 = r3;
        this.A00 = r2;
    }

    public void A03(String str) {
        AnonymousClass316 A002 = A00(this, str);
        if (A002 == null) {
            Log.d("BizQPLManager/endDataSourceBlock/pref tracker not found. Have you called startPrefTracker()?");
        } else {
            A002.A09("datasource");
        }
    }

    public void A04(String str) {
        AnonymousClass316 A002 = A00(this, str);
        if (A002 == null) {
            Log.d("BizQPLManager/startDataSourceBlock/pref tracker not found. Have you called startPrefTracker()?");
        } else {
            A002.A0A("datasource");
        }
    }

    public void A05(String str, String str2, String str3) {
        AnonymousClass316 A002 = A00(this, str);
        if (A002 == null) {
            Log.d("BizQPLManager/setMarkerAnnotation/pref tracker not found. Have you called startPrefTracker()?");
        } else {
            A002.A0C(str2, true, str3);
        }
    }

    public void A07(String str, boolean z, String str2) {
        AnonymousClass316 A002 = A00(this, str);
        if (A002 == null) {
            Log.d("BizQPLManager/setMarkerAnnotation/pref tracker not found. Have you called startPrefTracker()?");
        } else {
            A002.A0D(str2, z, true);
        }
    }
}
