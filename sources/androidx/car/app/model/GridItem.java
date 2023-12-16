package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14690q7;
import java.util.Objects;

public final class GridItem {
    public final CarIcon mImage = null;
    public final int mImageType = 2;
    public final boolean mIsLoading = false;
    public final C14690q7 mOnClickDelegate = null;
    public final CarText mText = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridItem)) {
            return false;
        }
        GridItem gridItem = (GridItem) obj;
        return this.mIsLoading == gridItem.mIsLoading && Objects.equals(this.mTitle, gridItem.mTitle) && Objects.equals(this.mText, gridItem.mText) && Objects.equals(this.mImage, gridItem.mImage) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mOnClickDelegate)), AnonymousClass000.A1X(gridItem.mOnClickDelegate)) && this.mImageType == gridItem.mImageType;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mImage;
        AnonymousClass000.A1O(objArr, this.mImageType);
        if (this.mOnClickDelegate == null) {
            z = true;
        }
        return AnonymousClass001.A0L(Boolean.valueOf(z), objArr, 4);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[title: ");
        AnonymousClass001.A1B(this.mTitle, A0o);
        A0o.append(", text: ");
        AnonymousClass001.A1B(this.mText, A0o);
        A0o.append(", image: ");
        A0o.append(this.mImage);
        A0o.append(", isLoading: ");
        A0o.append(this.mIsLoading);
        return AnonymousClass000.A0f(A0o);
    }
}
