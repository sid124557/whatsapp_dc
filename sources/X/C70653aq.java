package X;

import com.whatsapp.media.download.service.MediaDownloadService;
import java.util.ArrayList;

/* renamed from: X.3aq  reason: invalid class name and case insensitive filesystem */
public class C70653aq implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public C70653aq(Object obj, Object obj2, String str, String str2, int i, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A02 = obj2;
    }

    public final void run() {
        if (this.A05 != 0) {
            int i = this.A00;
            ((MediaDownloadService) this.A01).A03(this.A03, this.A04, (ArrayList) this.A02, i);
            return;
        }
        AnonymousClass2Q5 r5 = (AnonymousClass2Q5) this.A01;
        String str = this.A03;
        int i2 = this.A00;
        String str2 = this.A04;
        Integer num = (Integer) this.A02;
        C25241aC r1 = new C25241aC();
        r1.A05 = C627236i.A05(str);
        r1.A04 = C56612sH.A09(r5.A00);
        r1.A00 = AnonymousClass001.A0f();
        r1.A01 = Integer.valueOf(i2);
        r1.A02 = C18280x3.A0S();
        if (str2 != null) {
            r1.A06 = r5.A02.A04(str2);
        }
        r1.A03 = num;
        r5.A01.BhD(r1);
    }
}
