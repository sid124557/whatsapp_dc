package X;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3cV  reason: invalid class name and case insensitive filesystem */
public class C71683cV implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public C71683cV(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A06 = obj5;
        this.A03 = obj6;
        this.A05 = obj7;
    }

    public void run() {
        RandomAccessFile randomAccessFile;
        Bitmap bitmap;
        switch (this.A07) {
            case 0:
                try {
                    Log.v("fb-UnpackingSoSource", "starting syncer worker");
                    randomAccessFile = new RandomAccessFile((File) this.A02, "rw");
                    randomAccessFile.write((byte[]) this.A01);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    File file = ((AnonymousClass6NP) this.A00).A01;
                    randomAccessFile = new RandomAccessFile(AnonymousClass002.A0A(file, "dso_manifest"), "rw");
                    randomAccessFile.writeByte(1);
                    C147667Fe[] r7 = ((C146507An) this.A04).A00;
                    int length = r7.length;
                    randomAccessFile.writeInt(length);
                    for (int i = 0; i < length; i++) {
                        randomAccessFile.writeUTF(r7[i].A01);
                        randomAccessFile.writeUTF(r7[i].A00);
                    }
                    randomAccessFile.close();
                    C159237lU.A01(file);
                    AnonymousClass6NP.A01((File) this.A06, (byte) 1);
                    try {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        AnonymousClass000.A17(file, "releasing dso store lock for ", " (from syncer thread)", A0o);
                        Log.v("fb-UnpackingSoSource", A0o.toString());
                        ((AnonymousClass8KN) this.A03).close();
                        return;
                    } catch (IOException e) {
                        throw C18330xA.A09(e);
                    }
                } catch (Throwable th) {
                    StringBuilder A0l = AnonymousClass000.A0l("releasing dso store lock for ");
                    A0l.append(((AnonymousClass6NR) this.A00).A01);
                    Log.v("fb-UnpackingSoSource", AnonymousClass000.A0X(" (from syncer thread)", A0l));
                    ((AnonymousClass8KN) this.A03).close();
                    throw th;
                }
            case 1:
                C113245l7 r2 = (C113245l7) this.A00;
                Map map = (Map) this.A01;
                Object obj = this.A02;
                List list = (List) this.A03;
                Collection collection = (Collection) this.A04;
                C106105Xq r72 = (C106105Xq) this.A05;
                C108845de r6 = (C108845de) this.A06;
                AnonymousClass4FU r8 = r2.A1Z.A00;
                if (r8 instanceof C187388x8) {
                    C64103Cc r5 = new C64103Cc(r2, map);
                    AnonymousClass4FS r0 = r2.A5i;
                    AnonymousClass5M1 r4 = r2.A1O;
                    List singletonList = Collections.singletonList(obj);
                    boolean z = r2.A6P;
                    AnonymousClass0x7.A1B(r4.A00(r5, r6, r72, (C187388x8) r8, (C624134x) null, 1, 0L, (Long) null, (Long) null, collection, AnonymousClass002.A0K(), AnonymousClass0x9.A15(list), singletonList, list, Collections.emptyMap(), 3, 0, -1, z, true, false, true, false, false), r0);
                    return;
                }
                return;
            case 2:
                C60272yH r22 = (C60272yH) this.A06;
                PublicKey publicKey = (PublicKey) this.A04;
                Integer num = (Integer) this.A03;
                ((AnonymousClass3MU) this.A05).Bgr(r22, (AnonymousClass4EJ) this.A00, (C54662p5) this.A02, num, publicKey, (X509Certificate) this.A01);
                return;
            case 3:
                PublicKey publicKey2 = (PublicKey) this.A04;
                Integer num2 = (Integer) this.A03;
                ((AnonymousClass3MX) this.A06).Bgn((AnonymousClass4EJ) this.A02, (C54662p5) this.A05, (C51952ke) this.A00, num2, publicKey2, (X509Certificate) this.A01);
                return;
            case 4:
                C60272yH r23 = (C60272yH) this.A06;
                PublicKey publicKey3 = (PublicKey) this.A04;
                Integer num3 = (Integer) this.A03;
                ((AnonymousClass3MX) this.A05).Bgr(r23, (AnonymousClass4EJ) this.A00, (C54662p5) this.A02, num3, publicKey3, (X509Certificate) this.A01);
                return;
            default:
                C33141sV r42 = (C33141sV) this.A00;
                C151987Xb r3 = (C151987Xb) this.A02;
                Object obj2 = this.A03;
                Object obj3 = this.A04;
                Object obj4 = this.A05;
                Object obj5 = this.A06;
                byte[] A09 = ((C614630w) this.A01).A09();
                if (A09 == null || A09.length <= 0) {
                    bitmap = null;
                } else {
                    bitmap = r3.A00();
                }
                C71453c8 r52 = new C71453c8(obj2, obj3, obj4, bitmap, obj5, 16);
                List list2 = r42.A07;
                synchronized (list2) {
                    list2.add(r52);
                }
                r42.A01.post(new C117095rN(r42, 29));
                r3.A01();
                return;
        }
        throw th;
    }

    public C71683cV(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MX r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A07 = 4;
        C18260x0.A0S(x509Certificate, r2);
        C18260x0.A0U(r3, r4);
        this.A05 = r5;
        this.A01 = x509Certificate;
        this.A06 = r2;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
    }

    public C71683cV(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MX r4, C51952ke r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A07 = 3;
        C162457s7.A0J(x509Certificate, 3);
        C18260x0.A0U(r2, r3);
        this.A06 = r4;
        this.A00 = r5;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A02 = r2;
        this.A05 = r3;
    }

    public C71683cV(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MU r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A07 = 2;
        C162457s7.A0J(x509Certificate, 2);
        C162457s7.A0J(r2, 3);
        C18260x0.A0U(r3, r4);
        this.A05 = r5;
        this.A01 = x509Certificate;
        this.A06 = r2;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
    }
}
