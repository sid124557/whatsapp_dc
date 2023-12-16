package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

/* renamed from: X.56K  reason: invalid class name */
public class AnonymousClass56K extends C105935Wz {
    public final /* synthetic */ C40882Ic A00;
    public final /* synthetic */ C106535Zj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ byte[] A07;
    public final /* synthetic */ byte[] A08;
    public final /* synthetic */ byte[] A09;
    public final /* synthetic */ byte[] A0A;

    public void A01() {
        AnonymousClass68O r5 = new AnonymousClass68O(this, 4);
        String str = this.A03;
        String str2 = this.A04;
        byte[] bArr = this.A0A;
        byte[] bArr2 = this.A07;
        byte[] bArr3 = this.A09;
        byte[] bArr4 = this.A08;
        JniBridge.jvidispatchIOOOOOOOOOO(0, str, str2, this.A02, this.A05, r5, bArr, bArr2, bArr3, bArr4, this.A06);
    }

    public AnonymousClass56K(C40882Ic r1, C106535Zj r2, String str, String str2, String str3, List list, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A0A = bArr;
        this.A07 = bArr2;
        this.A09 = bArr3;
        this.A08 = bArr4;
        this.A02 = str3;
        this.A06 = map;
        this.A05 = list;
    }
}
