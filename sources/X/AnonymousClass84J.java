package X;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* renamed from: X.84J  reason: invalid class name */
public class AnonymousClass84J implements C186448vK {
    public final LayoutOutput A00;
    public final C161797qU A01;
    public final Integer[] A02;

    public C186448vK B5R(int i) {
        LayoutOutput layoutOutput = this.A00;
        Integer[] numArr = this.A02;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (C186448vK) layoutOutput.measureResults[i];
    }

    public int B5V() {
        return this.A00.measureResults.length;
    }

    public Object B93() {
        return null;
    }

    public int BAM() {
        return 0;
    }

    public int BAO() {
        return 0;
    }

    public int BAP() {
        return 0;
    }

    public int BAR() {
        return 0;
    }

    public C161797qU BC6() {
        return this.A01;
    }

    public int BEd(int i) {
        LayoutOutput layoutOutput = this.A00;
        Integer[] numArr = this.A02;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.arr[C140956un.values().length + (i * C140946um.values().length)];
    }

    public int BEe(int i) {
        LayoutOutput layoutOutput = this.A00;
        Integer[] numArr = this.A02;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.arr[C140956un.values().length + (i * C140946um.values().length) + 1];
    }

    public int getHeight() {
        return (int) this.A00.arr[1];
    }

    public int getWidth() {
        return (int) this.A00.arr[0];
    }

    public AnonymousClass84J(LayoutOutput layoutOutput, C161797qU r2, Integer[] numArr) {
        this.A00 = layoutOutput;
        this.A01 = r2;
        this.A02 = numArr;
    }
}
