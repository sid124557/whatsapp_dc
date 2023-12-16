package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

/* renamed from: X.56M  reason: invalid class name */
public class AnonymousClass56M extends C105935Wz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C40882Ic A01;
    public final /* synthetic */ C106535Zj A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ Map A08;
    public final /* synthetic */ byte[] A09;
    public final /* synthetic */ byte[] A0A;
    public final /* synthetic */ byte[] A0B;

    public AnonymousClass56M(C40882Ic r1, C106535Zj r2, String str, String str2, String str3, String str4, List list, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A06 = str;
        this.A00 = i;
        this.A0B = bArr;
        this.A04 = str2;
        this.A05 = str3;
        this.A0A = bArr2;
        this.A09 = bArr3;
        this.A03 = str4;
        this.A08 = map;
        this.A07 = list;
    }

    public void A01() {
        AnonymousClass68O r7 = new AnonymousClass68O(this, 9);
        String str = this.A06;
        int i = this.A00;
        byte[] bArr = this.A0B;
        String str2 = this.A04;
        String str3 = this.A05;
        byte[] bArr2 = this.A0A;
        byte[] bArr3 = this.A09;
        long j = (long) i;
        JniBridge.jvidispatchIIOOOOOOOOOO(j, str, str2, str3, this.A03, this.A07, r7, bArr, bArr2, bArr3, this.A08);
    }
}
