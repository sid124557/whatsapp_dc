package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

/* renamed from: X.56N  reason: invalid class name */
public class AnonymousClass56N extends C105935Wz {
    public final /* synthetic */ C40882Ic A00;
    public final /* synthetic */ C106535Zj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ Map A09;
    public final /* synthetic */ byte[] A0A;
    public final /* synthetic */ byte[] A0B;
    public final /* synthetic */ byte[] A0C;

    public AnonymousClass56N(C40882Ic r1, C106535Zj r2, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A07 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A0C = bArr;
        this.A0B = bArr2;
        this.A0A = bArr3;
        this.A02 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A09 = map;
        this.A08 = list;
    }

    public void A01() {
        AnonymousClass68O r7 = new AnonymousClass68O(this, 8);
        String str = this.A07;
        String str2 = this.A05;
        String str3 = this.A06;
        byte[] bArr = this.A0C;
        byte[] bArr2 = this.A0B;
        byte[] bArr3 = this.A0A;
        JniBridge.jvidispatchIOOOOOOOOOOOOO(str, str2, str3, this.A02, this.A03, this.A04, this.A08, r7, bArr, bArr2, bArr3, (Object) null, this.A09);
    }
}
