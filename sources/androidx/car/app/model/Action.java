package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14690q7;
import java.util.Objects;

public final class Action {
    public static final Action A00 = new Action(65538);
    public static final Action A01 = new Action(65539);
    public static final Action A02 = new Action(65540);
    public final CarColor mBackgroundColor;
    public final int mFlags;
    public final CarIcon mIcon;
    public final boolean mIsEnabled;
    public final C14690q7 mOnClickDelegate;
    public final CarText mTitle;
    public final int mType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Objects.equals(this.mTitle, action.mTitle) && this.mType == action.mType && Objects.equals(this.mIcon, action.mIcon) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mOnClickDelegate)), AnonymousClass000.A1X(action.mOnClickDelegate)) && Objects.equals(Integer.valueOf(this.mFlags), Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = this.mTitle;
        AnonymousClass000.A1M(objArr, this.mType);
        AnonymousClass001.A1S(objArr, AnonymousClass000.A1X(this.mOnClickDelegate));
        if (this.mIcon == null) {
            z = true;
        }
        objArr[3] = Boolean.valueOf(z);
        return AnonymousClass001.A0L(Boolean.valueOf(this.mIsEnabled), objArr, 4);
    }

    public Action(int i) {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.A00;
        this.mOnClickDelegate = null;
        this.mType = i;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[type: ");
        int i = this.mType;
        if (i != 1) {
            switch (i) {
                case 65538:
                    str = "APP_ICON";
                    break;
                case 65539:
                    str = "BACK";
                    break;
                case 65540:
                    str = "PAN";
                    break;
                default:
                    str = "<unknown>";
                    break;
            }
        } else {
            str = "CUSTOM";
        }
        A0o.append(str);
        A0o.append(", icon: ");
        A0o.append(this.mIcon);
        A0o.append(", bkg: ");
        A0o.append(this.mBackgroundColor);
        A0o.append(", isEnabled: ");
        A0o.append(this.mIsEnabled);
        return AnonymousClass000.A0f(A0o);
    }

    public Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.A00;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }
}
