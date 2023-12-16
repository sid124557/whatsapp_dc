package X;

import java.io.Serializable;
import java.text.DateFormat;

/* renamed from: X.5rJ  reason: invalid class name and case insensitive filesystem */
public class C117055rJ implements Comparable, Serializable {
    public static final long serialVersionUID = 8139806907588338737L;
    public final long ntpTime;
    public DateFormat simpleFormatter;
    public DateFormat utcFormatter;

    public static long A00(long j) {
        long j2;
        long j3 = (j >>> 32) & 4294967295L;
        long round = Math.round((((double) (j & 4294967295L)) * 1000.0d) / 4.294967296E9d);
        if ((2147483648L & j3) == 0) {
            j2 = 2085978496000L;
        } else {
            j2 = -2208988800000L;
        }
        return (j3 * 1000) + j2 + round;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = (this.ntpTime > ((C117055rJ) obj).ntpTime ? 1 : (this.ntpTime == ((C117055rJ) obj).ntpTime ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C117055rJ) || this.ntpTime != ((C117055rJ) obj).ntpTime) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.ntpTime;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        long j = this.ntpTime;
        StringBuilder A0o = AnonymousClass001.A0o();
        String hexString = Long.toHexString((j >>> 32) & 4294967295L);
        for (int length = hexString.length(); length < 8; length++) {
            A0o.append('0');
        }
        A0o.append(hexString);
        A0o.append('.');
        String hexString2 = Long.toHexString(j & 4294967295L);
        for (int length2 = hexString2.length(); length2 < 8; length2++) {
            A0o.append('0');
        }
        return AnonymousClass000.A0X(hexString2, A0o);
    }

    public C117055rJ(long j) {
        this.ntpTime = j;
    }
}
