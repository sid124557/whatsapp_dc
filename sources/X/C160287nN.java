package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7nN  reason: invalid class name and case insensitive filesystem */
public class C160287nN {
    public static List A06 = AnonymousClass001.A0s();
    public static List A07;
    public static List A08 = AnonymousClass001.A0s();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;

    static {
        ArrayList A0s = AnonymousClass001.A0s();
        A07 = A0s;
        A0s.add("image/jpg");
        A0s.add("image/jpeg");
        A0s.add("image/png");
        A07.add("image/webp");
        A06.add("image/gif");
        A08.add("video/x.looping_mp4");
        A08.add("video/mp4");
    }

    public C160287nN(int i, int i2, int i3, boolean z) {
        this.A04 = -1;
        this.A03 = -1;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A05 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("container: ");
        A0o.append(this.A01);
        A0o.append(", video: ");
        A0o.append(this.A02);
        A0o.append(", audio: ");
        A0o.append(this.A00);
        A0o.append(", problems: ");
        A0o.append(this.A05);
        return A0o.toString();
    }

    public C160287nN() {
        this(0, 0, 0, false);
    }
}
