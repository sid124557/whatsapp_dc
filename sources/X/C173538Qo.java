package X;

import java.lang.reflect.Constructor;
import javax.crypto.BadPaddingException;

/* renamed from: X.8Qo  reason: invalid class name and case insensitive filesystem */
public class C173538Qo implements C186318v6 {
    public static final Constructor A01;
    public C186178us A00;

    static {
        Class A002 = C1454375w.A00("javax.crypto.AEADBadTagException", C177478fj.class);
        Constructor constructor = null;
        if (A002 != null) {
            try {
                constructor = A002.getConstructor(new Class[]{String.class});
            } catch (Exception unused) {
                constructor = null;
            }
        }
        A01 = constructor;
    }

    public int B24(byte[] bArr, int i) {
        try {
            return this.A00.B24(bArr, i);
        } catch (C177188eD e) {
            Constructor constructor = A01;
            if (constructor != null) {
                try {
                    BadPaddingException badPaddingException = (BadPaddingException) constructor.newInstance(new Object[]{e.getMessage()});
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                } catch (Exception unused) {
                }
            }
            throw new BadPaddingException(e.getMessage());
        }
    }

    public String B4N() {
        C186178us r1 = this.A00;
        if (r1 instanceof C188618zD) {
            return ((C188618zD) r1).BE1().B4N();
        }
        return r1.B4N();
    }

    public int BAJ(int i) {
        return this.A00.BAJ(i);
    }

    public C185768uD BE1() {
        C186178us r1 = this.A00;
        if (r1 instanceof C188618zD) {
            return ((C188618zD) r1).BE1();
        }
        return null;
    }

    public int BE4(int i) {
        return this.A00.BE4(i);
    }

    public void BFw(C834748n r2, boolean z) {
        this.A00.BFw(r2, z);
    }

    public int Bhb(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.A00.Bhb(bArr, i, i2, bArr2, i3);
    }

    public void BrY(byte[] bArr, int i, int i2) {
        this.A00.BhZ(bArr, i, i2);
    }

    public boolean BsZ() {
        return false;
    }

    public C173538Qo(C186178us r1) {
        this.A00 = r1;
    }
}
