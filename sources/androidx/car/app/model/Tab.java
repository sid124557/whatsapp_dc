package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Objects;

public final class Tab {
    public final String mContentId = "EMPTY_TAB_CONTENT_ID";
    public final CarIcon mIcon = null;
    public final boolean mIsActive = false;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return Objects.equals(this.mTitle, tab.mTitle) && Objects.equals(this.mContentId, tab.mContentId) && Objects.equals(this.mIcon, tab.mIcon) && this.mIsActive == tab.mIsActive;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mTitle;
        objArr[1] = this.mContentId;
        objArr[2] = this.mIcon;
        return AnonymousClass001.A0L(Boolean.valueOf(this.mIsActive), objArr, 3);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[title: ");
        AnonymousClass001.A1B(this.mTitle, A0o);
        A0o.append(", contentId: ");
        A0o.append(this.mContentId);
        A0o.append(", icon: ");
        A0o.append(this.mIcon);
        A0o.append(", isActive ");
        A0o.append(this.mIsActive);
        return AnonymousClass000.A0f(A0o);
    }
}
