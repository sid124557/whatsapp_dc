package X;

import android.graphics.Bitmap;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.8FC  reason: invalid class name */
public final class AnonymousClass8FC implements C184228rS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BusinessDirectoryMapViewActivity A01;
    public final /* synthetic */ C166297yS A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ Map A05;

    public void BNh(Bitmap bitmap) {
        C162457s7.A0J(bitmap, 0);
        this.A05.put(this.A03, bitmap);
        this.A01.A77(this.A02, this.A04, this.A00);
    }

    public AnonymousClass8FC(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity, C166297yS r2, String str, List list, Map map, int i) {
        this.A05 = map;
        this.A03 = str;
        this.A01 = businessDirectoryMapViewActivity;
        this.A00 = i;
        this.A02 = r2;
        this.A04 = list;
    }

    public void BNg() {
        Map map = this.A05;
        String str = this.A03;
        Bitmap bitmap = AnonymousClass30R.A07;
        C162457s7.A0F(bitmap);
        map.put(str, bitmap);
        this.A01.A77(this.A02, this.A04, this.A00);
    }
}
