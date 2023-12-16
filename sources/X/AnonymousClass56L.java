package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

/* renamed from: X.56L  reason: invalid class name */
public class AnonymousClass56L extends C105935Wz {
    public final /* synthetic */ C40882Ic A00;
    public final /* synthetic */ C106535Zj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ Map A08;
    public final /* synthetic */ byte[] A09;
    public final /* synthetic */ byte[] A0A;

    public void A01() {
        AnonymousClass68O r7 = new AnonymousClass68O(this, 6);
        String str = this.A04;
        String str2 = this.A05;
        byte[] bArr = this.A0A;
        byte[] bArr2 = this.A09;
        JniBridge.jvidispatchIOOOOOOOOOO(1, str, str2, this.A06, this.A03, this.A02, this.A07, r7, bArr, bArr2, this.A08);
    }

    public AnonymousClass56L(C40882Ic r1, C106535Zj r2, String str, String str2, String str3, String str4, String str5, List list, Map map, byte[] bArr, byte[] bArr2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = str;
        this.A05 = str2;
        this.A0A = bArr;
        this.A09 = bArr2;
        this.A06 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A08 = map;
        this.A07 = list;
    }
}
