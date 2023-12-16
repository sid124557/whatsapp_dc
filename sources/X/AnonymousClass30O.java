package X;

import android.content.Intent;

/* renamed from: X.30O  reason: invalid class name */
public final class AnonymousClass30O {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass30O.class != obj.getClass()) {
                return false;
            }
            AnonymousClass30O r5 = (AnonymousClass30O) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public double A00() {
        int i;
        int i2 = this.A01;
        if (i2 < 0 || (i = this.A03) <= 0) {
            return Double.NaN;
        }
        return (((double) i2) * 100.0d) / ((double) i);
    }

    public boolean A01() {
        int i = this.A02;
        if (i == 0 || i == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }

    public AnonymousClass30O(Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            this.A00 = intent.getIntExtra("health", 1);
            this.A01 = intent.getIntExtra("level", -1);
            this.A02 = C18320x8.A01(intent, "plugged");
            this.A03 = intent.getIntExtra("scale", -1);
            return;
        }
        throw AnonymousClass001.A0c("Intent must be android.intent.action.BATTERY_CHANGED");
    }

    public boolean A02() {
        double A002 = A00();
        if (A01()) {
            return true;
        }
        if (this.A00 == 1 && this.A01 <= 0 && this.A03 <= 0 && this.A02 == Integer.MIN_VALUE) {
            return true;
        }
        if (A002 == Double.NaN || A002 <= 20.0d) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BatteryState{health=");
        int i = this.A00;
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "good";
                break;
            case 3:
                str = "overheat";
                break;
            case 4:
                str = "dead";
                break;
            case 5:
                str = "over_voltage";
                break;
            case 6:
                str = "unspecified_failure";
                break;
            case 7:
                str = "cold";
                break;
            default:
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("other(");
                str = C18260x0.A09(A0o2, i);
                break;
        }
        A0o.append(str);
        A0o.append(", level=");
        A0o.append(this.A01);
        A0o.append(", plugged=");
        A0o.append(this.A02);
        A0o.append(", scale=");
        A0o.append(this.A03);
        A0o.append(", percent=");
        A0o.append(A00());
        return AnonymousClass000.A0d(A0o);
    }

    public AnonymousClass30O() {
        this.A00 = 1;
        this.A01 = 0;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = 0;
    }
}
