package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14650q3;
import X.C14810qJ;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class InputSignInMethod implements C14810qJ {
    public final CarText mDefaultValue = null;
    public final CarText mErrorMessage = null;
    public final CarText mHint = null;
    public final C14650q3 mInputCallbackDelegate = null;
    public final int mInputType = 1;
    public final int mKeyboardType = 1;
    public final boolean mShowKeyboardByDefault = false;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputSignInMethod)) {
            return false;
        }
        InputSignInMethod inputSignInMethod = (InputSignInMethod) obj;
        return this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && Objects.equals(this.mHint, inputSignInMethod.mHint) && Objects.equals(this.mDefaultValue, inputSignInMethod.mDefaultValue) && Objects.equals(this.mErrorMessage, inputSignInMethod.mErrorMessage);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.mHint;
        objArr[1] = this.mDefaultValue;
        AnonymousClass000.A1N(objArr, this.mInputType);
        objArr[3] = this.mErrorMessage;
        objArr[4] = Integer.valueOf(this.mKeyboardType);
        return AnonymousClass001.A0L(Boolean.valueOf(this.mShowKeyboardByDefault), objArr, 5);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[inputType:");
        A0o.append(this.mInputType);
        A0o.append(", keyboardType: ");
        A0o.append(this.mKeyboardType);
        return AnonymousClass000.A0f(A0o);
    }
}
