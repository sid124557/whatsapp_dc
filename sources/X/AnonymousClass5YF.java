package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;

/* renamed from: X.5YF  reason: invalid class name */
public class AnonymousClass5YF {
    public int A00 = 0;
    public int A01;
    public long A02;
    public Point A03;
    public Rect A04;
    public C104315Qm A05;
    public File A06;
    public File A07;
    public Byte A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Uri A0G;

    public synchronized int A00() {
        return this.A00;
    }

    public synchronized int A01() {
        return this.A01;
    }

    public synchronized Point A02() {
        return this.A03;
    }

    public synchronized Rect A03() {
        return this.A04;
    }

    public synchronized C104315Qm A04() {
        return this.A05;
    }

    public synchronized File A05() {
        return this.A06;
    }

    public synchronized File A06() {
        File file;
        file = this.A06;
        if (file == null) {
            file = this.A07;
        }
        return file;
    }

    public synchronized File A07() {
        return this.A07;
    }

    public synchronized Byte A08() {
        return this.A08;
    }

    public synchronized String A09() {
        return this.A09;
    }

    public synchronized String A0A() {
        return this.A0A;
    }

    public synchronized String A0B() {
        return this.A0C;
    }

    public synchronized String A0C() {
        StringBuilder A0o;
        Object[] objArr;
        A0o = AnonymousClass001.A0o();
        A0o.append("MPI-");
        objArr = new Object[16];
        objArr[0] = this.A0G;
        objArr[1] = this.A08;
        objArr[2] = this.A07;
        objArr[3] = this.A09;
        objArr[4] = this.A0C;
        objArr[5] = this.A0A;
        objArr[6] = this.A0B;
        objArr[7] = this.A06;
        objArr[8] = this.A04;
        objArr[9] = this.A03;
        objArr[10] = this.A05;
        objArr[11] = Integer.valueOf(this.A01);
        objArr[12] = Boolean.valueOf(this.A0F);
        objArr[13] = Boolean.valueOf(this.A0E);
        objArr[14] = Integer.valueOf(this.A00);
        return AnonymousClass000.A0h(A0o, C18310x6.A08(Boolean.valueOf(this.A0D), objArr, 15));
    }

    public synchronized void A0D(int i) {
        this.A00 = i;
    }

    public synchronized void A0E(File file) {
        this.A07 = file;
    }

    public synchronized void A0F(Byte b) {
        this.A08 = b;
    }

    public synchronized void A0G(String str) {
        this.A09 = str;
    }

    public synchronized void A0H(String str) {
        this.A0A = str;
    }

    public synchronized void A0I(String str) {
        this.A0C = str;
    }

    public synchronized boolean A0J() {
        return this.A0F;
    }

    public AnonymousClass5YF(Uri uri) {
        this.A0G = uri;
    }

    public AnonymousClass5YF(Uri uri, AnonymousClass5YF r3) {
        String str;
        boolean z;
        boolean z2;
        this.A0G = uri;
        this.A08 = r3.A08();
        this.A07 = r3.A07();
        this.A09 = r3.A09();
        this.A0C = r3.A0B();
        this.A0A = r3.A0A();
        synchronized (r3) {
            str = r3.A0B;
        }
        this.A0B = str;
        this.A06 = r3.A05();
        this.A04 = r3.A03();
        this.A03 = r3.A02();
        this.A05 = r3.A04();
        this.A01 = r3.A01();
        this.A0F = r3.A0J();
        synchronized (r3) {
            z = r3.A0E;
        }
        this.A0E = z;
        this.A00 = r3.A00();
        synchronized (r3) {
            z2 = r3.A0D;
        }
        this.A0D = z2;
    }
}
