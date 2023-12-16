package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.5h4  reason: invalid class name and case insensitive filesystem */
public class C110805h4 implements C185788uF {
    public long A00;
    public Uri A01;
    public boolean A02;
    public final C185788uF A03;
    public final Object A04 = AnonymousClass002.A0D();

    public Uri BE6() {
        Uri uri;
        synchronized (this.A04) {
            uri = this.A01;
        }
        return uri;
    }

    public long Bfw(C161387pX r6) {
        long j;
        Uri uri;
        synchronized (this.A04) {
            j = r6.A03;
            this.A00 = j;
            uri = this.A01;
        }
        if (uri != null) {
            return this.A03.Bfw(new C161387pX(uri, j));
        }
        throw AnonymousClass002.A0C("Uri not set");
    }

    public /* synthetic */ void cancel() {
    }

    public void close() {
        this.A03.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        long j;
        Uri uri;
        Object obj = this.A04;
        synchronized (obj) {
            j = this.A00;
            if (this.A02) {
                this.A02 = false;
                uri = this.A01;
            } else {
                uri = null;
            }
        }
        if (uri != null) {
            C185788uF r3 = this.A03;
            r3.close();
            r3.Bfw(new C161387pX(uri, j));
        }
        int read = this.A03.read(bArr, i, i2);
        synchronized (obj) {
            this.A00 += (long) read;
        }
        return read;
    }

    public C110805h4(Context context, Uri uri) {
        this.A03 = new AnonymousClass6KM(context);
        this.A01 = uri;
    }

    public void Awq(C184768sU r1) {
    }
}
