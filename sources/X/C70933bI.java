package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3bI  reason: invalid class name and case insensitive filesystem */
public class C70933bI implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public boolean A06;
    public final int A07;

    public C70933bI(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, boolean z) {
        this.A07 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = str;
        this.A00 = i;
        this.A04 = obj4;
        this.A06 = z;
    }

    public final void run() {
        FileOutputStream A0h;
        if (this.A07 != 0) {
            C621033m r5 = (C621033m) this.A01;
            String str = this.A05;
            int i = this.A00;
            C624134x r10 = (C624134x) this.A04;
            boolean z = this.A06;
            AnonymousClass33C r8 = new AnonymousClass33C();
            r8.A0F = (File) this.A03;
            r8.A01 = i;
            AnonymousClass30M A002 = r5.A1H.A00((Uri) null, r8, (C108845de) null, r10, str, (List) this.A02, (List) null, (List) null, (byte) 9, 7, 0, z);
            Iterator A0x = AnonymousClass0x7.A0x(A002.A02);
            while (A0x.hasNext()) {
                C30471mV A0S = C18320x8.A0S(A0x);
                if (A0S instanceof AnonymousClass1nF) {
                    AnonymousClass1nF r1 = (AnonymousClass1nF) A0S;
                    r1.A00 = i;
                    r1.A05 = "text/vcard";
                    r1.A06 = str;
                }
            }
            r5.A08(A002, (byte[]) null, false, false);
            return;
        }
        C621033m r4 = (C621033m) this.A01;
        Object obj = this.A02;
        String str2 = this.A05;
        byte[] bArr = (byte[]) this.A03;
        int i2 = this.A00;
        Object obj2 = this.A04;
        boolean z2 = this.A06;
        File A0F = r4.A1q.A0F(str2, (long) bArr.length);
        try {
            A0h = AnonymousClass0x9.A0h(A0F);
            A0h.write(bArr);
            A0h.close();
        } catch (IOException e) {
            Log.e("UserActions/prepareVCardDocument IO Exception when writing vcard document", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (!A0F.exists()) {
            Log.e("UserActions/prepareVCardDocument Error writing vcard document file");
            return;
        } else {
            r4.A02.BkS(new C70933bI(r4, obj, A0F, obj2, str2, i2, 1, z2));
            return;
        }
        throw th;
    }
}
