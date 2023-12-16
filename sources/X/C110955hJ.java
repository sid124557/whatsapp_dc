package X;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.5hJ  reason: invalid class name and case insensitive filesystem */
public class C110955hJ implements C187668xc {
    public long A00;
    public Uri A01;
    public boolean A02;
    public final C187668xc A03;
    public final Object A04 = AnonymousClass002.A0D();

    public Uri BE6() {
        Uri uri;
        synchronized (this.A04) {
            uri = this.A01;
        }
        return uri;
    }

    public long Bfx(C157677ih r8) {
        long j;
        Uri uri;
        synchronized (this.A04) {
            j = r8.A03;
            this.A00 = j;
            uri = this.A01;
        }
        if (uri != null) {
            return this.A03.Bfx(new C157677ih(uri, j, -1));
        }
        throw AnonymousClass002.A0C("Uri not set");
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
            C187668xc r0 = this.A03;
            r0.close();
            r0.Bfx(new C157677ih(uri, j, -1));
        }
        int read = this.A03.read(bArr, i, i2);
        synchronized (obj) {
            this.A00 += (long) read;
        }
        return read;
    }

    public C110955hJ(Context context, Uri uri) {
        this.A03 = new C126856Po(context);
        this.A01 = uri;
    }

    public void Awr(C178288hI r1) {
    }

    public /* synthetic */ Map BCF() {
        return Collections.emptyMap();
    }
}
