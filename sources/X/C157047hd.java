package X;

import android.graphics.RectF;
import java.io.File;
import java.util.HashSet;

/* renamed from: X.7hd  reason: invalid class name and case insensitive filesystem */
public class C157047hd {
    public long A00;
    public long A01;
    public long A02;
    public RectF A03;
    public C158247jf A04;
    public C153537bV A05;
    public AnonymousClass724 A06;
    public C151367Um A07;
    public C147787Fs A08;
    public C156117g3 A09;
    public File A0A;
    public String A0B;
    public HashSet A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static void A00(C157047hd r3) {
        r3.A03 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        r3.A02 = -1;
        r3.A00 = -1;
        r3.A0D = false;
        r3.A0E = false;
        r3.A01 = -1;
        r3.A0C = new HashSet();
    }

    public C157047hd(AnonymousClass7QR r3) {
        A00(this);
        try {
            new AnonymousClass723();
            this.A06 = new AnonymousClass724();
            this.A0A = r3.A0A;
            String str = r3.A0B;
            if (str != null) {
                this.A0B = str;
            }
            this.A05 = r3.A05;
            this.A03 = r3.A03;
            this.A02 = r3.A02;
            this.A00 = r3.A00;
            this.A0D = r3.A0D;
            this.A0E = r3.A0E;
            this.A09 = r3.A09;
            this.A04 = r3.A04;
            this.A08 = r3.A08;
            this.A0H = r3.A0H;
            this.A0G = r3.A0G;
            this.A0F = r3.A0F;
            this.A07 = r3.A07;
            this.A0L = r3.A0K;
            this.A0M = r3.A0L;
            this.A0I = r3.A0I;
            this.A01 = r3.A01;
            this.A06 = r3.A06;
            this.A0J = r3.A0J;
            this.A0K = r3.A0M;
            this.A0C = r3.A0C;
        } catch (C143926zh e) {
            throw C18330xA.A09(e);
        }
    }

    public C157047hd() {
        A00(this);
        try {
            new AnonymousClass723();
            this.A06 = new AnonymousClass724();
        } catch (C143926zh e) {
            throw C18330xA.A09(e);
        }
    }
}
