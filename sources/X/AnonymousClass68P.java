package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

/* renamed from: X.68P  reason: invalid class name */
public class AnonymousClass68P extends C105935Wz {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final int A0A;

    public AnonymousClass68P(C40882Ic r1, C106535Zj r2, String str, String str2, String str3, String str4, List list, Map map, byte[] bArr, byte[] bArr2, int i) {
        this.A0A = i;
        this.A00 = r2;
        this.A05 = r1;
        switch (i) {
            case 0:
                this.A08 = str;
                this.A09 = str2;
                this.A07 = str3;
                break;
            case 1:
            case 2:
                this.A07 = str;
                this.A08 = str2;
                this.A04 = bArr;
                this.A02 = bArr2;
                this.A09 = str3;
                break;
            default:
                this.A09 = str;
                this.A07 = str2;
                this.A08 = str3;
                break;
        }
        this.A04 = bArr;
        this.A02 = bArr2;
        this.A06 = str4;
        this.A01 = map;
        this.A03 = list;
    }

    public void A01() {
        AnonymousClass68O r6;
        String str;
        String str2;
        Object obj;
        Object obj2;
        String str3;
        String str4;
        Object obj3;
        Object obj4;
        int i;
        switch (this.A0A) {
            case 0:
                r6 = new AnonymousClass68O(this, 0);
                str = this.A08;
                str2 = this.A09;
                str3 = this.A07;
                obj = this.A04;
                obj2 = this.A02;
                str4 = this.A06;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 4;
                break;
            case 1:
                i = 1;
                r6 = new AnonymousClass68O(this, 1);
                str = this.A07;
                str2 = this.A08;
                obj = this.A04;
                obj2 = this.A02;
                str3 = this.A09;
                str4 = this.A06;
                obj3 = this.A01;
                obj4 = this.A03;
                break;
            case 2:
                r6 = new AnonymousClass68O(this, 3);
                str = this.A07;
                str2 = this.A08;
                obj = this.A04;
                obj2 = this.A02;
                str3 = this.A09;
                str4 = this.A06;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 2;
                break;
            default:
                r6 = new AnonymousClass68O(this, 7);
                str = this.A09;
                str2 = this.A07;
                str3 = this.A08;
                obj = this.A04;
                obj2 = this.A02;
                str4 = this.A06;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 0;
                break;
        }
        JniBridge.jvidispatchIOOOOOOOOO(i, str, str2, str3, str4, obj4, r6, obj, obj2, obj3);
    }
}
