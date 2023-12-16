package X;

import java.io.File;

/* renamed from: X.7hU  reason: invalid class name and case insensitive filesystem */
public class C156957hU {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final File A05;
    public final String A06;
    public final String A07;

    public C156957hU(File file, int i) {
        this.A04 = i;
        this.A05 = file;
        this.A07 = null;
        this.A06 = null;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = -1;
        this.A02 = -1;
    }

    public C156957hU(C156997hY r2, C156997hY r3, File file, int i) {
        this.A04 = i;
        this.A05 = file;
        this.A07 = r2.A0A;
        this.A01 = r2.A00;
        this.A03 = r2.A05;
        this.A06 = r3.A0A;
        this.A00 = r3.A00;
        this.A02 = r3.A05;
    }
}
