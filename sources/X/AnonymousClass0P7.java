package X;

import android.content.ComponentName;

/* renamed from: X.0P7  reason: invalid class name */
public final class AnonymousClass0P7 {
    public final ComponentName A00;

    public AnonymousClass0P7(ComponentName componentName) {
        C162457s7.A0J(componentName, 1);
        this.A00 = componentName;
        String packageName = componentName.getPackageName();
        C162457s7.A0D(packageName);
        String className = componentName.getClassName();
        C162457s7.A0D(className);
        int length = packageName.length();
        if (length > 0) {
            int length2 = className.length();
            if (length2 <= 0) {
                throw AnonymousClass001.A0c("Activity class name must not be empty.");
            } else if (C175728Zm.A0S(packageName, "*", false) && C175728Zm.A0G(packageName, "*", 0, false) != length - 1) {
                throw AnonymousClass001.A0c("Wildcard in package name is only allowed at the end.");
            } else if (C175728Zm.A0S(className, "*", false) && C175728Zm.A0G(className, "*", 0, false) != length2 - 1) {
                throw AnonymousClass001.A0c("Wildcard in class name is only allowed at the end.");
            }
        } else {
            throw AnonymousClass001.A0c("Package name must not be empty");
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0P7) && C162457s7.A0P(this.A00, ((AnonymousClass0P7) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ActivityFilter(componentName=");
        A0o.append(this.A00);
        A0o.append(", intentAction=");
        A0o.append((String) null);
        return AnonymousClass000.A0c(A0o);
    }
}
