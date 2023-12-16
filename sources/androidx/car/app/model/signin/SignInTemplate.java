package androidx.car.app.model.signin;

import X.AnonymousClass001;
import X.C14790qH;
import X.C14810qJ;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class SignInTemplate implements C14790qH {
    public final List mActionList = Collections.emptyList();
    public final ActionStrip mActionStrip = null;
    public final CarText mAdditionalText = null;
    public final Action mHeaderAction = null;
    public final CarText mInstructions = null;
    public final boolean mIsLoading = false;
    public final C14810qJ mSignInMethod = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTemplate)) {
            return false;
        }
        SignInTemplate signInTemplate = (SignInTemplate) obj;
        return this.mIsLoading == signInTemplate.mIsLoading && Objects.equals(this.mHeaderAction, signInTemplate.mHeaderAction) && Objects.equals(this.mTitle, signInTemplate.mTitle) && Objects.equals(this.mInstructions, signInTemplate.mInstructions) && Objects.equals(this.mAdditionalText, signInTemplate.mAdditionalText) && Objects.equals(this.mActionStrip, signInTemplate.mActionStrip) && Objects.equals(this.mActionList, signInTemplate.mActionList) && Objects.equals(this.mSignInMethod, signInTemplate.mSignInMethod);
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        AnonymousClass001.A1R(objArr, this.mIsLoading);
        objArr[1] = this.mHeaderAction;
        objArr[2] = this.mTitle;
        objArr[3] = this.mInstructions;
        objArr[4] = this.mAdditionalText;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mActionList;
        return AnonymousClass001.A0L(this.mSignInMethod, objArr, 7);
    }

    public String toString() {
        return "SignInTemplate";
    }
}
