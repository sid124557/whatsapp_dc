package X;

/* renamed from: X.6Km  reason: invalid class name and case insensitive filesystem */
public class C126046Km extends AnonymousClass8L6 {
    public long blkIoTicks;
    public long cancelledWriteBytes;
    public long majorFaults;
    public long rcharBytes;
    public long readBytes;
    public long syscrCount;
    public long syscwCount;
    public long wcharBytes;
    public long writeBytes;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C126046Km r7 = (C126046Km) obj;
            if (!(r7.rcharBytes == this.rcharBytes && r7.wcharBytes == this.wcharBytes && r7.syscrCount == this.syscrCount && r7.syscwCount == this.syscwCount && r7.readBytes == this.readBytes && r7.writeBytes == this.writeBytes && r7.cancelledWriteBytes == this.cancelledWriteBytes && r7.majorFaults == this.majorFaults && r7.blkIoTicks == this.blkIoTicks)) {
                return false;
            }
        }
        return true;
    }

    public void A02(C126046Km r3) {
        this.rcharBytes = r3.rcharBytes;
        this.wcharBytes = r3.wcharBytes;
        this.syscrCount = r3.syscrCount;
        this.syscwCount = r3.syscwCount;
        this.readBytes = r3.readBytes;
        this.writeBytes = r3.writeBytes;
        this.cancelledWriteBytes = r3.cancelledWriteBytes;
        this.majorFaults = r3.majorFaults;
        this.blkIoTicks = r3.blkIoTicks;
    }

    public int hashCode() {
        long j = this.rcharBytes;
        int A03 = AnonymousClass6C7.A03(AnonymousClass6C7.A03(AnonymousClass6C7.A03(AnonymousClass6C7.A03(AnonymousClass6C7.A03(AnonymousClass6C7.A03(AnonymousClass6C7.A03(((int) (j ^ (j >>> 32))) * 31, this.wcharBytes), this.syscrCount), this.syscwCount), this.readBytes), this.writeBytes), this.cancelledWriteBytes), this.majorFaults);
        long j2 = this.blkIoTicks;
        return A03 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DiskMetrics{rcharBytes=");
        A0o.append(this.rcharBytes);
        A0o.append(", wcharBytes=");
        A0o.append(this.wcharBytes);
        A0o.append(", syscrCount=");
        A0o.append(this.syscrCount);
        A0o.append(", syscwCount=");
        A0o.append(this.syscwCount);
        A0o.append(", readBytes=");
        A0o.append(this.readBytes);
        A0o.append(", writeBytes=");
        A0o.append(this.writeBytes);
        A0o.append(", cancelledWriteBytes=");
        A0o.append(this.cancelledWriteBytes);
        A0o.append(", majorFaults=");
        A0o.append(this.majorFaults);
        A0o.append(", blkIoTicks=");
        A0o.append(this.blkIoTicks);
        return AnonymousClass000.A0g(A0o);
    }
}
