package X;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: X.0AT  reason: invalid class name */
public class AnonymousClass0AT extends AnonymousClass0O6 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public String A08;
    public int[] A09;
    public final Matrix A0A;
    public final Matrix A0B;
    public final ArrayList A0C;

    public AnonymousClass0AT(AnonymousClass05C r6, AnonymousClass0AT r7) {
        AnonymousClass0AS r1;
        this.A0B = AnonymousClass002.A05();
        this.A0C = AnonymousClass001.A0s();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        Matrix A052 = AnonymousClass002.A05();
        this.A0A = A052;
        this.A08 = null;
        this.A02 = r7.A02;
        this.A00 = r7.A00;
        this.A01 = r7.A01;
        this.A03 = r7.A03;
        this.A04 = r7.A04;
        this.A05 = r7.A05;
        this.A06 = r7.A06;
        this.A09 = r7.A09;
        String str = r7.A08;
        this.A08 = str;
        this.A07 = r7.A07;
        if (str != null) {
            r6.put(str, this);
        }
        A052.set(r7.A0A);
        ArrayList arrayList = r7.A0C;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof AnonymousClass0AT) {
                this.A0C.add(new AnonymousClass0AT(r6, (AnonymousClass0AT) obj));
            } else {
                if (obj instanceof AnonymousClass0AV) {
                    r1 = new AnonymousClass0AV((AnonymousClass0AV) obj);
                } else if (obj instanceof AnonymousClass0AU) {
                    r1 = new AnonymousClass0AU((AnonymousClass0AU) obj);
                } else {
                    throw AnonymousClass001.A0e("Unknown object in the tree!");
                }
                this.A0C.add(r1);
                String str2 = r1.A02;
                if (str2 != null) {
                    r6.put(str2, r1);
                }
            }
        }
    }

    public boolean A00() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AnonymousClass0O6) arrayList.get(i)).A00()) {
                return true;
            }
            i++;
        }
    }

    public boolean A01(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((AnonymousClass0O6) arrayList.get(i)).A01(iArr);
            i++;
        }
    }

    public final void A02() {
        Matrix matrix = this.A0A;
        matrix.reset();
        matrix.postTranslate(-this.A00, -this.A01);
        matrix.postScale(this.A03, this.A04);
        matrix.postRotate(this.A02, 0.0f, 0.0f);
        matrix.postTranslate(this.A05 + this.A00, this.A06 + this.A01);
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public void setPivotX(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A02();
        }
    }

    public void setPivotY(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A02();
        }
    }

    public void setRotation(float f) {
        if (f != this.A02) {
            this.A02 = f;
            A02();
        }
    }

    public void setScaleX(float f) {
        if (f != this.A03) {
            this.A03 = f;
            A02();
        }
    }

    public void setScaleY(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A02();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.A05) {
            this.A05 = f;
            A02();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.A06) {
            this.A06 = f;
            A02();
        }
    }

    public AnonymousClass0AT() {
        this.A0B = AnonymousClass002.A05();
        this.A0C = AnonymousClass001.A0s();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = AnonymousClass002.A05();
        this.A08 = null;
    }
}
