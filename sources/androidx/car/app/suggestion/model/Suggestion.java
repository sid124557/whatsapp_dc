package androidx.car.app.suggestion.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import android.app.PendingIntent;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class Suggestion {
    public final PendingIntent mAction;
    public final CarIcon mIcon;
    public final String mIdentifier = "";
    public final CarText mSubtitle;
    public final CarText mTitle;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return Objects.equals(this.mIdentifier, suggestion.mIdentifier) && Objects.equals(this.mTitle, suggestion.mTitle) && Objects.equals(this.mSubtitle, suggestion.mSubtitle) && Objects.equals(this.mAction, suggestion.mAction) && Objects.equals(this.mIcon, suggestion.mIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mIdentifier;
        objArr[1] = this.mTitle;
        objArr[2] = this.mSubtitle;
        objArr[3] = this.mIcon;
        return AnonymousClass001.A0L(this.mAction, objArr, 4);
    }

    public Suggestion() {
        Objects.requireNonNull("");
        this.mTitle = new CarText((CharSequence) "");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mAction = null;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[id: ");
        A0o.append(this.mIdentifier);
        A0o.append(", title: ");
        AnonymousClass001.A1B(this.mTitle, A0o);
        A0o.append(", subtitle: ");
        AnonymousClass001.A1B(this.mSubtitle, A0o);
        A0o.append(", pendingIntent: ");
        A0o.append(this.mAction);
        A0o.append(", icon: ");
        return AnonymousClass000.A0S(this.mIcon, A0o);
    }
}
