package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.82f  reason: invalid class name and case insensitive filesystem */
public class C1677182f implements C187458xF {
    public List A00 = AnonymousClass001.A0s();
    public final AnonymousClass7AK A01 = new AnonymousClass7AK(this);
    public final boolean A02;

    public void BO0(C161387pX r3, Object obj, int i, boolean z) {
        if (this.A02) {
            for (C184768sU BO0 : this.A00) {
                BO0.BO0(r3, obj, i, z);
            }
            return;
        }
        synchronized (this) {
            for (C187458xF BO02 : this.A00) {
                BO02.BO0(r3, obj, i, z);
            }
        }
    }

    public void BTZ(C142646xX r11, long j, long j2, long j3) {
        for (C187458xF BTZ : this.A00) {
            BTZ.BTZ(r11, j, j2, j3);
        }
    }

    public void BTa(long j, long j2) {
        for (C187458xF BTa : this.A00) {
            BTa.BTa(j, j2);
        }
    }

    public void BUa(C142646xX r3) {
        for (C187458xF BUa : this.A00) {
            BUa.BUa(r3);
        }
    }

    public void BUb() {
        for (C187458xF BUb : this.A00) {
            BUb.BUb();
        }
    }

    public void BeW() {
        for (C187458xF BeW : this.A00) {
            BeW.BeW();
        }
    }

    public void BeX(C161387pX r3, Object obj, boolean z) {
        if (this.A02) {
            for (C184768sU BeX : this.A00) {
                BeX.BeX(r3, obj, z);
            }
            return;
        }
        synchronized (this) {
            for (C187458xF BeX2 : this.A00) {
                BeX2.BeX(r3, obj, z);
            }
        }
    }

    public void BeY(IOException iOException) {
        if (this.A02) {
            for (C187458xF BeY : this.A00) {
                BeY.BeY(iOException);
            }
            return;
        }
        synchronized (this) {
            for (C187458xF BeY2 : this.A00) {
                BeY2.BeY(iOException);
            }
        }
    }

    public void BeZ(String str, Object obj) {
        for (C180228kh BeZ : this.A00) {
            BeZ.BeZ(str, obj);
        }
    }

    public void Bea(C161387pX r3, C142646xX r4) {
        for (C187458xF Bea : this.A00) {
            Bea.Bea(r3, r4);
        }
    }

    public void Beb(C161387pX r3, Object obj, boolean z, boolean z2) {
        if (this.A02) {
            for (C184768sU Beb : this.A00) {
                Beb.Beb(r3, obj, z, z2);
            }
            return;
        }
        synchronized (this) {
            for (C187458xF Beb2 : this.A00) {
                Beb2.Beb(r3, obj, z, z2);
            }
        }
    }

    public void Bm1(long j) {
        for (C187458xF Bm1 : this.A00) {
            Bm1.Bm1(j);
        }
    }

    public C1677182f(boolean z) {
        this.A02 = z;
    }

    public void A00(List list) {
        this.A00 = AnonymousClass002.A0J(list);
    }
}
