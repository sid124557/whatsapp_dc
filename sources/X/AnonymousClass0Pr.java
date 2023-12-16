package X;

import java.util.List;

/* renamed from: X.0Pr  reason: invalid class name */
public final class AnonymousClass0Pr {
    public int A00 = 50;
    public Float A01;
    public String A02;
    public List A03;
    public List A04;
    public boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0Pr) {
                AnonymousClass0Pr r5 = (AnonymousClass0Pr) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A03, r5.A03) || this.A05 != r5.A05 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass0Pr(Float f, String str, List list, List list2, boolean z) {
        this.A02 = str;
        this.A01 = f;
        this.A04 = list;
        this.A03 = list2;
        this.A05 = z;
    }

    public int hashCode() {
        int hashCode;
        String str = this.A02;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int A07 = ((hashCode * 31) + AnonymousClass000.A07(this.A01)) * 31;
        List list = this.A04;
        if (list != null) {
            i = list.hashCode();
        }
        int A08 = AnonymousClass000.A08(this.A03, (A07 + i) * 31);
        boolean z = this.A05;
        if (z) {
            z = true;
        }
        return ((A08 + (z ? 1 : 0)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParametricSliderDataModel(sliderColor=");
        A0o.append(this.A02);
        A0o.append(", sliderValue=");
        A0o.append(this.A01);
        A0o.append(", gradientColors=");
        A0o.append(this.A04);
        A0o.append(", choicePaths=");
        A0o.append(this.A03);
        A0o.append(", passSliderUpdateToBloksOnTouchUpOnly=");
        A0o.append(this.A05);
        A0o.append(", currentSliderPosition=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
