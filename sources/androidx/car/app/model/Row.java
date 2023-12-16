package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14690q7;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Row {
    public final List mActions = Collections.emptyList();
    public final CarIcon mImage = null;
    public final boolean mIsBrowsable = false;
    public final boolean mIsEnabled = true;
    public final Metadata mMetadata = Metadata.A00;
    public final int mNumericDecoration = -1;
    public final C14690q7 mOnClickDelegate = null;
    public final int mRowImageType = 1;
    public final List mTexts = Collections.emptyList();
    public final CarText mTitle = null;
    public final Toggle mToggle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        return Objects.equals(this.mTitle, row.mTitle) && Objects.equals(this.mTexts, row.mTexts) && Objects.equals(this.mImage, row.mImage) && Objects.equals(this.mToggle, row.mToggle) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mOnClickDelegate)), AnonymousClass000.A1X(row.mOnClickDelegate)) && Objects.equals(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType && this.mIsEnabled == row.mIsEnabled;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        boolean z = false;
        objArr[0] = this.mTitle;
        objArr[1] = this.mTexts;
        objArr[2] = this.mImage;
        objArr[3] = this.mToggle;
        if (this.mOnClickDelegate == null) {
            z = true;
        }
        objArr[4] = Boolean.valueOf(z);
        objArr[5] = this.mMetadata;
        objArr[6] = Boolean.valueOf(this.mIsBrowsable);
        objArr[7] = Integer.valueOf(this.mRowImageType);
        return AnonymousClass001.A0L(Boolean.valueOf(this.mIsEnabled), objArr, 8);
    }

    public String toString() {
        int i;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[title: ");
        AnonymousClass001.A1B(this.mTitle, A0o);
        A0o.append(", text count: ");
        List list = this.mTexts;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        A0o.append(i);
        A0o.append(", image: ");
        A0o.append(this.mImage);
        A0o.append(", isBrowsable: ");
        A0o.append(this.mIsBrowsable);
        A0o.append(", isEnabled: ");
        A0o.append(this.mIsEnabled);
        return AnonymousClass000.A0f(A0o);
    }
}
