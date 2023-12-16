package X;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.33N  reason: invalid class name */
public final class AnonymousClass33N {
    public static final String[] A0D = {"e1.whatsapp.net.", "e2.whatsapp.net.", "e3.whatsapp.net.", "e4.whatsapp.net.", "e5.whatsapp.net.", "e6.whatsapp.net.", "e7.whatsapp.net.", "e8.whatsapp.net.", "e9.whatsapp.net.", "e10.whatsapp.net.", "e11.whatsapp.net.", "e12.whatsapp.net.", "e13.whatsapp.net.", "e14.whatsapp.net.", "e15.whatsapp.net.", "e16.whatsapp.net."};
    public int A00 = -1;
    public int A01 = 0;
    public int A02;
    public final int A03;
    public final int A04;
    public final C64733Es A05;
    public final AnonymousClass1VX A06;
    public final C60962zS A07;
    public final String A08;
    public final InetSocketAddress A09;
    public final List A0A;
    public final List A0B;
    public final Random A0C;

    public C58782vo A02() {
        C58782vo r4;
        InetSocketAddress inetSocketAddress;
        Short sh;
        int i = this.A01;
        boolean z = true;
        boolean z2 = false;
        switch (i) {
            case 0:
                throw AnonymousClass001.A0e("Must call moveToNext first");
            case 1:
                InetSocketAddress inetSocketAddress2 = this.A09;
                C626936e.A06(inetSocketAddress2);
                C41512Kn r3 = new C41512Kn(3, false);
                InetAddress address = inetSocketAddress2.getAddress();
                int port = inetSocketAddress2.getPort();
                if (inetSocketAddress2.getPort() != 443) {
                    z = false;
                }
                r4 = new C58782vo(r3, address, port, z);
                break;
            case 2:
                C41512Kn r6 = new C41512Kn(3, false);
                List list = this.A0B;
                r4 = new C58782vo(r6, ((C53452n7) list.get(this.A02)).A03, ((C53452n7) list.get(this.A02)).A02.shortValue(), ((C53452n7) list.get(this.A02)).A05);
                break;
            case 3:
                r4 = new C58782vo(new C41512Kn(3, false), InetAddress.getByName(this.A08), this.A03, false);
                break;
            case 4:
                r4 = new C58782vo(new C41512Kn(3, false), InetAddress.getByName(this.A08), this.A04, false);
                break;
            case 5:
                int i2 = 5222;
                if (this.A0C.nextBoolean()) {
                    i2 = 443;
                }
                if (!this.A06.A0Y(C58422vE.A02, 3241)) {
                    r4 = A03("g.whatsapp.net", i2, true, false);
                    break;
                } else {
                    r4 = A03("g.whatsapp.net", i2, false, false);
                    break;
                }
            case 6:
                int i3 = 5222;
                if (this.A0C.nextBoolean()) {
                    i3 = 443;
                }
                r4 = this.A05.A02("g.whatsapp.net", false, false);
                r4.A00 = i3;
                break;
            case 7:
                int i4 = 5222;
                Random random = this.A0C;
                if (random.nextBoolean()) {
                    i4 = 443;
                    z2 = C56952sp.A0K(this.A06, 5531, false);
                }
                String[] strArr = A0D;
                r4 = A03(strArr[random.nextInt(strArr.length)], i4, true, z2);
                break;
            case 8:
                List list2 = this.A0A;
                C53452n7 r0 = (C53452n7) list2.get(this.A02);
                InetAddress inetAddress = r0.A03;
                if (inetAddress == null || (sh = r0.A02) == null) {
                    inetSocketAddress = null;
                } else {
                    inetSocketAddress = new InetSocketAddress(inetAddress, sh.shortValue());
                }
                C626936e.A06(inetSocketAddress);
                r4 = new C58782vo(new C41512Kn(4, false), inetSocketAddress.getAddress(), inetSocketAddress.getPort(), ((C53452n7) list2.get(this.A02)).A05);
                break;
            case 9:
                if (this.A06.A0Y(C58422vE.A02, 3241)) {
                    r4 = A03("g.whatsapp.net", 80, false, false);
                } else {
                    r4 = A03("g.whatsapp.net", 80, true, false);
                }
                r4.A01 = true;
                break;
            case 10:
                r4 = this.A05.A02("g.whatsapp.net", false, false);
                r4.A00 = 80;
                r4.A01 = true;
                break;
            case 11:
                String[] strArr2 = A0D;
                r4 = A03(strArr2[this.A0C.nextInt(strArr2.length)], 80, true, false);
                r4.A01 = true;
                break;
            case 12:
                C60962zS r32 = this.A07;
                if (r32 != null && !C100515Bf.A00(r32)) {
                    r4 = A03(r32.A03, r32.A00, true, r32.A06);
                    break;
                } else {
                    throw AnonymousClass001.A0e("User proxy should not be null or empty in this state.");
                }
            case 13:
                int i5 = 5222;
                if (this.A0C.nextBoolean()) {
                    i5 = 443;
                }
                r4 = A03("g-fallback.whatsapp.net", i5, false, false);
                break;
            case 14:
                r4 = A03("g-fallback.whatsapp.net", 80, false, false);
                r4.A01 = true;
                break;
            case 15:
                throw AnonymousClass001.A0e("Cannot retrieve address past end");
            default:
                throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Unrecognized state ", AnonymousClass001.A0o(), i));
        }
        this.A00 = r4.A02.A00;
        return r4;
    }

    public final C58782vo A03(String str, int i, boolean z, boolean z2) {
        C58782vo A012 = this.A05.A01(str, z, z2);
        A012.A00 = i;
        C18260x0.A0s("ConnectionSequence/tryResolveDomainName; host=", str, AnonymousClass001.A0o());
        return A012;
    }

    public void A04(int i) {
        this.A01 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r10.A01 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r10.A01 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r1 >= r10.A0A.size()) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r10.A01 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        r10.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0084, code lost:
        if (android.text.TextUtils.isEmpty(r10.A08) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        r10.A01 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r10.A01 == 15) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        if (android.text.TextUtils.isEmpty(r10.A08) != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009f, code lost:
        r10.A01 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
            r10 = this;
            int r0 = r10.A01
            r5 = 3
            r9 = 9
            r4 = 0
            r8 = 6
            r7 = 7
            r6 = 2
            r2 = 5
            r1 = 1
            r3 = 15
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x005a;
                case 2: goto L_0x0089;
                case 3: goto L_0x0058;
                case 4: goto L_0x009f;
                case 5: goto L_0x0038;
                case 6: goto L_0x0035;
                case 7: goto L_0x0032;
                case 8: goto L_0x0047;
                case 9: goto L_0x0019;
                case 10: goto L_0x002f;
                case 11: goto L_0x005a;
                case 12: goto L_0x005a;
                case 13: goto L_0x0016;
                case 14: goto L_0x002c;
                default: goto L_0x0010;
            }
        L_0x0010:
            int r0 = r10.A01
            if (r0 == r3) goto L_0x0015
            r4 = 1
        L_0x0015:
            return r4
        L_0x0016:
            r0 = 14
            goto L_0x0070
        L_0x0019:
            int r0 = r10.A00
            if (r0 == r6) goto L_0x002f
            X.1VX r2 = r10.A06
            r1 = 3241(0xca9, float:4.542E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x002c
            r0 = 13
            goto L_0x0070
        L_0x002c:
            r10.A01 = r8
            goto L_0x0010
        L_0x002f:
            r10.A01 = r7
            goto L_0x0010
        L_0x0032:
            r0 = 11
            goto L_0x0070
        L_0x0035:
            r0 = 10
            goto L_0x0070
        L_0x0038:
            java.util.List r0 = r10.A0A
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0055
            r0 = 8
            r10.A01 = r0
            r10.A02 = r4
            goto L_0x0010
        L_0x0047:
            int r0 = r10.A02
            int r1 = r0 + 1
            r10.A02 = r1
            java.util.List r0 = r10.A0A
            int r0 = r0.size()
            if (r1 < r0) goto L_0x0010
        L_0x0055:
            r10.A01 = r9
            goto L_0x0010
        L_0x0058:
            r0 = 4
            goto L_0x0070
        L_0x005a:
            r10.A01 = r3
            goto L_0x0010
        L_0x005d:
            java.net.InetSocketAddress r0 = r10.A09
            if (r0 == 0) goto L_0x0064
            r10.A01 = r1
            goto L_0x0010
        L_0x0064:
            X.2zS r0 = r10.A07
            if (r0 == 0) goto L_0x0073
            boolean r0 = X.C100515Bf.A00(r0)
            if (r0 != 0) goto L_0x0073
            r0 = 12
        L_0x0070:
            r10.A01 = r0
            goto L_0x0010
        L_0x0073:
            java.util.List r0 = r10.A0B
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007e
            r10.A01 = r6
            goto L_0x0010
        L_0x007e:
            java.lang.String r0 = r10.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009f
        L_0x0086:
            r10.A01 = r5
            goto L_0x0010
        L_0x0089:
            int r0 = r10.A02
            int r1 = r0 + 1
            r10.A02 = r1
            java.util.List r0 = r10.A0B
            int r0 = r0.size()
            if (r1 < r0) goto L_0x0010
            java.lang.String r0 = r10.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0086
        L_0x009f:
            r10.A01 = r2
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33N.A05():boolean");
    }

    public AnonymousClass33N(C64733Es r4, AnonymousClass1VX r5, C60962zS r6, String str, InetSocketAddress inetSocketAddress, List list, Random random) {
        List list2;
        this.A05 = r4;
        this.A06 = r5;
        this.A09 = inetSocketAddress;
        this.A07 = r6;
        this.A08 = str;
        this.A0C = random;
        this.A0B = AnonymousClass001.A0s();
        this.A0A = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C53452n7 r1 = (C53452n7) it.next();
            if (r1.A04) {
                list2 = this.A0B;
            } else {
                list2 = this.A0A;
            }
            list2.add(r1);
        }
        boolean nextBoolean = random.nextBoolean();
        int i = 443;
        this.A03 = nextBoolean ? 443 : 5222;
        this.A04 = nextBoolean ? 5222 : i;
    }

    public static Integer A00(int i) {
        int i2;
        switch (i) {
            case 1:
            case 5:
            case 9:
                i2 = 2;
                break;
            case 2:
            case 3:
            case 4:
                i2 = 1;
                break;
            case 6:
            case 10:
                i2 = 5;
                break;
            case 7:
            case 11:
                i2 = 6;
                break;
            case 8:
                i2 = 3;
                break;
            case 13:
            case 14:
                i2 = 4;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public int A01() {
        return this.A01;
    }
}
