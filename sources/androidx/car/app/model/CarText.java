package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class CarText {
    public final List mSpans;
    public final List mSpansForVariants;
    public final String mText;
    public final List mTextVariants;

    public final class Builder {
        public CharSequence mText;
        public List mTextVariants;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarText)) {
            return false;
        }
        CarText carText = (CarText) obj;
        return Objects.equals(this.mText, carText.mText) && Objects.equals(this.mSpans, carText.mSpans) && Objects.equals(this.mTextVariants, carText.mTextVariants) && Objects.equals(this.mSpansForVariants, carText.mSpansForVariants);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mText;
        objArr[1] = this.mSpans;
        objArr[2] = this.mTextVariants;
        return AnonymousClass001.A0L(this.mSpansForVariants, objArr, 3);
    }

    public class SpanWrapper {
        public final CarSpan mCarSpan;
        public final int mEnd;
        public final int mFlags;
        public final int mStart;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpanWrapper)) {
                return false;
            }
            SpanWrapper spanWrapper = (SpanWrapper) obj;
            return this.mStart == spanWrapper.mStart && this.mEnd == spanWrapper.mEnd && this.mFlags == spanWrapper.mFlags && Objects.equals(this.mCarSpan, spanWrapper.mCarSpan);
        }

        public int hashCode() {
            Object[] objArr = new Object[4];
            AnonymousClass000.A1L(objArr, this.mStart);
            AnonymousClass000.A1M(objArr, this.mEnd);
            AnonymousClass000.A1N(objArr, this.mFlags);
            return AnonymousClass001.A0L(this.mCarSpan, objArr, 3);
        }

        public SpanWrapper(Spanned spanned, CarSpan carSpan) {
            this.mStart = spanned.getSpanStart(carSpan);
            this.mEnd = spanned.getSpanEnd(carSpan);
            this.mFlags = spanned.getSpanFlags(carSpan);
            this.mCarSpan = carSpan;
        }

        public String toString() {
            StringBuilder A0p = AnonymousClass001.A0p();
            A0p.append(this.mCarSpan);
            A0p.append(": ");
            A0p.append(this.mStart);
            AnonymousClass001.A1M(A0p);
            A0p.append(this.mEnd);
            A0p.append(", flags: ");
            A0p.append(this.mFlags);
            return AnonymousClass000.A0f(A0p);
        }

        public SpanWrapper() {
            this.mStart = 0;
            this.mEnd = 0;
            this.mFlags = 0;
            this.mCarSpan = new CarSpan();
        }
    }

    public CarText(List list) {
        this.mText = "".toString();
        this.mSpans = A01("");
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (int i = 0; i < list.size(); i++) {
            CharSequence charSequence = (CharSequence) list.get(i);
            A0s.add(charSequence.toString());
            A0s2.add(A01(charSequence));
        }
        this.mTextVariants = Collections.unmodifiableList(AnonymousClass002.A0J(A0s));
        this.mSpansForVariants = Collections.unmodifiableList(AnonymousClass002.A0J(A0s2));
    }

    public static String A00(CarText carText) {
        if (carText == null) {
            return null;
        }
        String obj = carText.toString();
        int length = obj.length();
        if (length <= 16) {
            return obj;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(obj.substring(0, 8));
        A0o.append("~");
        return AnonymousClass000.A0X(obj.substring(length - 8), A0o);
    }

    public String toString() {
        return this.mText;
    }

    public static List A01(CharSequence charSequence) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, charSequence.length(), Object.class)) {
                if (obj instanceof CarSpan) {
                    A0s.add(new SpanWrapper(spanned, (CarSpan) obj));
                }
            }
        }
        return Collections.unmodifiableList(AnonymousClass002.A0J(A0s));
    }

    public CarText(CharSequence charSequence) {
        this.mText = "".toString();
        this.mSpans = A01("");
        this.mTextVariants = Collections.emptyList();
        this.mSpansForVariants = Collections.emptyList();
    }

    public CarText() {
        this.mText = "";
        this.mSpans = Collections.emptyList();
        this.mTextVariants = Collections.emptyList();
        this.mSpansForVariants = Collections.emptyList();
    }
}
