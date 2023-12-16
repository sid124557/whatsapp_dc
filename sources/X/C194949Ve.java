package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.9Ve  reason: invalid class name and case insensitive filesystem */
public class C194949Ve {
    public final boolean A00;
    public volatile float A01;
    public volatile int A02;
    public volatile int A03;
    public volatile int A04;
    public volatile int A05;
    public volatile int A06;
    public volatile int A07 = 0;
    public volatile int A08;
    public volatile int A09;
    public volatile int A0A;
    public volatile SurfaceTexture A0B;
    public volatile Surface A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public volatile boolean A0F;

    public synchronized Surface A03() {
        SurfaceTexture surfaceTexture = this.A0B;
        if (this.A0C == null && surfaceTexture != null) {
            this.A0C = new Surface(surfaceTexture);
        }
        return this.A0C;
    }

    public synchronized void A04() {
        Surface surface = this.A0C;
        if (surface != null && this.A00) {
            surface.release();
            this.A0C = null;
        }
    }

    public synchronized boolean A07() {
        boolean z;
        if (this.A0D) {
            if (this.A0C == null) {
                if (this.A0B != null) {
                }
            }
            z = true;
        }
        z = false;
        return z;
    }

    public C194949Ve(Surface surface, boolean z) {
        this.A0C = surface;
        this.A00 = z;
        this.A0D = true;
        this.A0E = false;
    }

    public int A00() {
        return this.A06;
    }

    public int A01() {
        return this.A07;
    }

    public int A02() {
        return this.A09;
    }

    public boolean A06() {
        return this.A0E;
    }

    public void A05(int i) {
        this.A06 = i;
    }

    public C194949Ve(SurfaceTexture surfaceTexture) {
        this.A0B = surfaceTexture;
        this.A00 = true;
        this.A0D = true;
        this.A0E = false;
    }
}
