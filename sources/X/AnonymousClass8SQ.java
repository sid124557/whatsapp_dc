package X;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* renamed from: X.8SQ  reason: invalid class name */
public class AnonymousClass8SQ extends BasicPermission {
    public final String actions;
    public final int permissionMask;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass8SQ)) {
                return false;
            }
            AnonymousClass8SQ r4 = (AnonymousClass8SQ) obj;
            if (this.permissionMask != r4.permissionMask || !getName().equals(r4.getName())) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass8SQ(String str) {
        super("SC", str);
        this.actions = str;
        StringTokenizer stringTokenizer = new StringTokenizer(C162077rB.A00(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            this.permissionMask = i;
            return;
        }
        throw AnonymousClass001.A0c("unknown permissions passed to mask");
    }

    public String getActions() {
        return this.actions;
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof AnonymousClass8SQ) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.permissionMask;
        int i2 = ((AnonymousClass8SQ) permission).permissionMask;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return getName().hashCode() + this.permissionMask;
    }
}
