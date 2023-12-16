package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Tp  reason: invalid class name and case insensitive filesystem */
public final class C127866Tp extends C1695389r {
    public static final C127866Tp A04 = new C127866Tp(0);
    public static final Parcelable.Creator CREATOR = new C163657uA();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public C127866Tp(int i, PendingIntent pendingIntent) {
        this(pendingIntent, (String) null, 1, i);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C127866Tp) {
                C127866Tp r5 = (C127866Tp) obj;
                if (this.A01 != r5.A01 || !AnonymousClass72K.A00(this.A02, r5.A02) || !AnonymousClass72K.A00(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean A01() {
        if (this.A01 == 0 || this.A02 == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        C151567Vh r3 = new C151567Vh(this);
        int i = this.A01;
        if (i == 99) {
            str = "UNFINISHED";
        } else if (i != 1500) {
            switch (i) {
                case -1:
                    str = "UNKNOWN";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                    str = "SERVICE_MISSING";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 9:
                    str = "SERVICE_INVALID";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 11:
                    str = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i) {
                        case 13:
                            str = "CANCELED";
                            break;
                        case 14:
                            str = "TIMEOUT";
                            break;
                        case 15:
                            str = "INTERRUPTED";
                            break;
                        case 16:
                            str = "API_UNAVAILABLE";
                            break;
                        case 17:
                            str = "SIGN_IN_FAILED";
                            break;
                        case 18:
                            str = "SERVICE_UPDATING";
                            break;
                        case 19:
                            str = "SERVICE_MISSING_PERMISSION";
                            break;
                        case 20:
                            str = "RESTRICTED_PROFILE";
                            break;
                        case 21:
                            str = "API_VERSION_UPDATE_REQUIRED";
                            break;
                        case 22:
                            str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                            break;
                        case 23:
                            str = "API_DISABLED";
                            break;
                        case 24:
                            str = "API_DISABLED_FOR_CONNECTION";
                            break;
                        default:
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("UNKNOWN_ERROR_CODE(");
                            A0o.append(i);
                            str = AnonymousClass000.A0e(A0o);
                            break;
                    }
            }
        } else {
            str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        r3.A00(str, "statusCode");
        r3.A00(this.A02, "resolution");
        r3.A00(this.A03, "message");
        return r3.toString();
    }

    public void A00(Activity activity, int i) {
        if (A01()) {
            PendingIntent pendingIntent = this.A02;
            C162177rO.A02(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A01);
        A1X[1] = this.A02;
        return C18310x6.A08(this.A03, A1X, 2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A07(parcel, 2, this.A01);
        C162417s1.A0A(parcel, this.A02, 3, i, false);
        C162417s1.A0B(parcel, this.A03, 4, false);
        C162417s1.A06(parcel, A002);
    }

    public C127866Tp(PendingIntent pendingIntent, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }

    public C127866Tp(int i) {
        this((PendingIntent) null, (String) null, 1, i);
    }
}
